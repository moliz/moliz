/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.xmof.configuration.profile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.vm.IXMOFVirtualMachineListener;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.modelexecution.xmof.vm.XMOFInstanceMap;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.XMOFVirtualMachineEvent;
import org.modelexecution.xmof.vm.XMOFVirtualMachineEvent.Type;
import org.modelversioning.emfprofile.Extension;
import org.modelversioning.emfprofile.IProfileFacade;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.impl.ProfileFacadeImpl;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

import fUML.Semantics.Classes.Kernel.BooleanValue;
import fUML.Semantics.Classes.Kernel.EnumerationValue;
import fUML.Semantics.Classes.Kernel.ExtensionalValue;
import fUML.Semantics.Classes.Kernel.ExtensionalValueList;
import fUML.Semantics.Classes.Kernel.FeatureValue;
import fUML.Semantics.Classes.Kernel.IntegerValue;
import fUML.Semantics.Classes.Kernel.Link;
import fUML.Semantics.Classes.Kernel.LinkList;
import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.Classes.Kernel.Reference;
import fUML.Semantics.Classes.Kernel.StringValue;
import fUML.Semantics.Classes.Kernel.Value;
import fUML.Syntax.Classes.Kernel.Association;
import fUML.Syntax.Classes.Kernel.Class_;
import fUML.Syntax.Classes.Kernel.Classifier;
import fUML.Syntax.Classes.Kernel.EnumerationLiteral;
import fUML.Syntax.Classes.Kernel.Feature;
import fUML.Syntax.Classes.Kernel.NamedElement;
import fUML.Syntax.Classes.Kernel.Property;
import fUML.Syntax.Classes.Kernel.StructuralFeature;

public class ProfileApplicationGenerator extends EContentAdapter implements
		IXMOFVirtualMachineListener {

	private XMOFBasedModel model;
	private Collection<Profile> configurationProfiles;
	private ConfigurationObjectMap configurationMap;
	private ResourceSet resourceSet;
	private URI profileApplicationURI;
	private Resource profileApplicationResource;
	private IProfileFacade facade;
	private XMOFInstanceMap instanceMap;
	private Copier copier = new Copier();

	private HashMap<EObject, StereotypeApplication> configurationStereotypeApplicationMap = new HashMap<EObject, StereotypeApplication>();
	private EditingDomain editingDomain;

	public ProfileApplicationGenerator(XMOFBasedModel model,
			Collection<Profile> configurationProfiles,
			ConfigurationObjectMap configurationMap, XMOFInstanceMap instanceMap) {
		this.model = model;
		this.configurationProfiles = configurationProfiles;
		this.configurationMap = configurationMap;
		this.instanceMap = instanceMap;
	}

	@Override
	public void notify(XMOFVirtualMachineEvent event) {
		if (Type.START.equals(event.getType())) {
			if (event.getVirtualMachine().isSynchronizeModel()) {
				generateProfileApplicationSafely(event);
			}
		} else if (Type.STOP.equals(event.getType())) {
			if (!event.getVirtualMachine().isSynchronizeModel()) {
				generateProfileApplicationSafely(event);
			}
		}
	}

	private void generateProfileApplicationSafely(XMOFVirtualMachineEvent event) {
		try {
			generateProfileApplication(event.getVirtualMachine());
		} catch (IOException e) {
			XMOFConfigurationProfilePlugin.log(e);
		}
	}

	private void generateProfileApplication(XMOFVirtualMachine virtualMachine)
			throws IOException {
		if (profileApplicationURI == null) {
			return;
		}
		prepareProfileFacade();
		createStereotypeApplications(virtualMachine);
		saveProfileApplication();
	}

	private void prepareProfileFacade() throws IOException {
		facade = new ProfileFacadeImpl();
		profileApplicationResource = facade.loadProfileApplication(
				profileApplicationURI, resourceSet);
		for (Profile profile : configurationProfiles) {
			facade.makeApplicable(profile);
			facade.loadProfile(profile);
		}
	}

	private void createStereotypeApplications(XMOFVirtualMachine virtualMachine) {
		XMOFInstanceMap instanceMap = virtualMachine.getInstanceMap();
		for (ExtensionalValue value : instanceMap.getExtensionalValues()) {
			if (value instanceof Object_) {
				createStereotypeApplication((Object_) value, instanceMap);
			}
		}
	}

	private void createStereotypeApplication(Object_ object,
			XMOFInstanceMap instanceMap) {
		EObject confObject = instanceMap.getEObject(object);
		EObject eObject = configurationMap.getOriginalObject(confObject);
		Stereotype confStereotype = getConfigurationStereotype(confObject);
		if (confObject == null || confStereotype == null) {
			return;
		}
		if (shouldApply(confStereotype)
				&& facade.isApplicable(confStereotype, eObject)) {
			StereotypeApplication application = facade.apply(confStereotype,
					eObject);
			configurationStereotypeApplicationMap.put(confObject, application);
			registerContentAdapter(confObject);
			for (EStructuralFeature feature : confStereotype
					.getEStructuralFeatures()) {
				Object value = getValue(object, feature);
				if (value != null) {
					facade.setTaggedValue(application, feature, value);
				}
			}
		}
	}

	private boolean shouldApply(Stereotype confStereotype) {
		return confStereotype.getTaggedValues().size() > 0;
	}

	private Stereotype getConfigurationStereotype(EObject eObject) {
		EClass confClass = eObject.eClass();
		EClass baseClass = getBaseClass(confClass);
		for (Profile profile : configurationProfiles) {
			Stereotype runtimeStereotype = getRuntimeStereotype(profile,
					baseClass);
			if (runtimeStereotype != null)
				return runtimeStereotype;
		}
		return null;
	}

	private EClass getBaseClass(EClass confClass) {
		// the configuration class should only have the corresponding eClass of
		// the Ecore-based metamodel as super type
		if (confClass.getESuperTypes().size() > 0) {
			return confClass.getESuperTypes().get(0);
		}
		return null;
	}

	private Stereotype getRuntimeStereotype(Profile profile, EClass baseClass) {
		if (baseClass == null)
			return null;
		EList<Stereotype> applicableStereotypes = profile
				.getApplicableStereotypes(baseClass);
		for (Stereotype stereotype : applicableStereotypes) {
			EList<Extension> applicableExtensions = stereotype
					.getApplicableExtensions(baseClass);
			for (Extension extension : applicableExtensions) {
				if (extension.getTarget().equals(baseClass))
					return stereotype;
			}
		}
		return null;
	}

	private Object getValue(Object_ object, EStructuralFeature feature) {
		Collection<StructuralFeature> structuralFeatures = getStructuralFeatures(object);
		for (StructuralFeature structuralFeature : structuralFeatures) {
			if (structuralFeature.name.equals(feature.getName())) {
				if (feature instanceof EAttribute) {
					return getAttributeValue(object, structuralFeature,
							(EAttribute) feature);
				} else if (feature instanceof EReference) {
					return getReferenceValue(object, structuralFeature,
							(EReference) feature);
				}
			}
		}
		return null;
	}

	private Collection<StructuralFeature> getStructuralFeatures(Object_ object) {
		Collection<StructuralFeature> structuralFeatures = new HashSet<StructuralFeature>();
		for (Class_ class_ : object.types) {
			structuralFeatures.addAll(getStructuralFeatures(class_));
		}
		return structuralFeatures;
	}

	private Collection<StructuralFeature> getStructuralFeatures(
			Classifier classifier) {
		Collection<StructuralFeature> structuralFeatures = new HashSet<StructuralFeature>();
		for (NamedElement member : classifier.member) {
			if (member instanceof StructuralFeature) {
				structuralFeatures.add((StructuralFeature) member);
			}
		}
		for (Classifier general : classifier.general) {
			structuralFeatures.addAll(getStructuralFeatures(general));
		}
		return structuralFeatures;
	}

	private Object getReferenceValue(Object_ object,
			StructuralFeature structuralFeature, EReference reference) {
		Association association = getAssociation(structuralFeature);
		Collection<Object_> linkedObjects = getLinkedObjects(association,
				structuralFeature, object);
		EList<EObject> linkedObjectsOriginal = new BasicEList<EObject>();
		for (Object_ o : linkedObjects) {
			EObject confobject = instanceMap.getEObject(o);
			if (confobject != null) {
				EObject originalobject = configurationMap
						.getOriginalObject(confobject);
				if (originalobject != null) {
					linkedObjectsOriginal.add(originalobject);
				} else if (reference.isContainment()) {
					EObject confobjectcopy = copier.copy(confobject); 
					//TODO because of this copying the contained copies have to be updated as well
					linkedObjectsOriginal.add(confobjectcopy);
					createReferencesForCopiedEObject(confobject, confobjectcopy);
				}
			} else { // new object was created
				EObject newEObject = createEObject(o);
				linkedObjectsOriginal.add(newEObject);
			}
		}
		if (linkedObjectsOriginal.size() > 0) {
			if (reference.isMany()) {
				return linkedObjectsOriginal;
			} else {
				return linkedObjectsOriginal.get(0);
			}
		}
		return null;
	}

	private void createReferencesForCopiedEObject(EObject confobject,
			EObject confobjectcopy) {
		for (EReference eReference : confobject.eClass().getEAllReferences()) {
			if (!eReference.isContainment()) {
				Object referencedEObjects = getReferencedObjects(confobject,
						eReference);
				if (referencedEObjects != null) {
					confobjectcopy.eSet(eReference, referencedEObjects);
				}
			} else {
				Object referenced = confobject.eGet(eReference);
				if (referenced instanceof EList<?>) {
					EList<?> referencedEObjects = (EList<?>) referenced;
					for (Object o : referencedEObjects) {
						if (o instanceof EObject) {
							createReferencesForCopiedEObject((EObject) o,
									copier.get(o));
						}
					}
				}
			}
		}
	}

	private Object getReferencedObjects(EObject eObject, EReference eReference) {
		EList<EObject> referencedObjects = new BasicEList<EObject>();

		Object referencedObjectsInRuntime = eObject.eGet(eReference);
		if (referencedObjectsInRuntime instanceof EList<?>) {
			referencedObjects.addAll(getReferencedObjectsOfRequiredType(
					(EList<?>) referencedObjectsInRuntime, eReference));
		} else if (referencedObjectsInRuntime instanceof EObject) {
			EObject referencedObjectOfRequiredType = getObjectOfRequiredType(
					(EObject) referencedObjectsInRuntime, eReference.getEType());
			if (referencedObjectOfRequiredType != null) {
				referencedObjects.add(referencedObjectOfRequiredType);
			}
		}
		if (referencedObjects.size() > 0) {
			if (eReference.isMany()) {
				return referencedObjects;
			} else {
				return referencedObjects.get(0);
			}
		}
		return null;
	}

	private EList<EObject> getReferencedObjectsOfRequiredType(
			EList<?> referencedEObjects, EReference eReference) {
		EList<EObject> referencedObjectsOfRequiredType = new BasicEList<EObject>();
		for (Object o : referencedEObjects) {
			if (o instanceof EObject) {
				EObject referencedObjectOfRequiredType = getObjectOfRequiredType(
						(EObject) o, eReference.getEType());
				if (referencedObjectOfRequiredType != null) {
					referencedObjectsOfRequiredType
							.add(referencedObjectOfRequiredType);
				}
			}
		}
		return referencedObjectsOfRequiredType;
	}

	private EObject getObjectOfRequiredType(EObject eObject, EClassifier type) {
		if (eObject.eClass().equals(type)) {
			return eObject;
		} else {
			EObject originalObject = configurationMap
					.getOriginalObject(eObject);
			if (originalObject.eClass().equals(type)) {
				return originalObject;
			}
		}
		return null;
	}

	private EObject createEObject(Object_ object) {
		Class_ class_ = object.types.get(0);
		EClass eClass = instanceMap.getEClass(class_);

		EObject eObject = EcoreUtil.create(eClass);
		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
			Object value = getValue(object, feature);
			if (value != null) {
				eObject.eSet(feature, value);
			}
		}
		return eObject;
	}

	private Association getAssociation(Feature feature) {
		Association association = null;
		if (feature instanceof Property) {
			association = ((Property) feature).association;
		}
		return association;
	}

	private Collection<Object_> getLinkedObjects(Association association,
			StructuralFeature end, Object_ referent) {

		Property oppositeEnd = association.memberEnd.getValue(0);
		if (oppositeEnd == end) {
			oppositeEnd = association.memberEnd.getValue(1);
		}

		ExtensionalValueList extent = referent.locus.getExtent(association);

		LinkList links = new LinkList();
		for (int i = 0; i < extent.size(); i++) {
			ExtensionalValue link = extent.getValue(i);
			Value linkValue = link.getFeatureValue(oppositeEnd).values
					.getValue(0);
			if (linkValue instanceof Reference) {
				linkValue = ((Reference) linkValue).referent;
			}
			// if (linkValue.equals(referent)) {
			if (linkValue == referent) {
				if (!end.multiplicityElement.isOrdered | links.size() == 0) {
					links.addValue((Link) link);
				} else {
					int n = link.getFeatureValue(end).position;
					boolean continueSearching = true;
					int j = 0;
					while (continueSearching & j < links.size()) {
						j = j + 1;
						continueSearching = links.getValue(j - 1)
								.getFeatureValue(end).position < n;
					}
					if (!continueSearching) {
						links.addValue(j - 1, (Link) link);
					} else {
						links.add((Link) link);
					}
				}
			}
		}

		Collection<Object_> linkedObjects = new ArrayList<Object_>();
		for (Link link : links) {
			FeatureValue fv = link.getFeatureValue(end);
			Value v = fv.values.get(0);
			if (v instanceof Object_) {
				linkedObjects.add((Object_) v);
			} else if (v instanceof Reference) {
				linkedObjects.add(((Reference) v).referent);
			}
		}

		return linkedObjects;
	} // getMatchingLinks

	private Object getAttributeValue(Object_ object,
			StructuralFeature structuralFeature, EAttribute eAttribute) {
		if (!eAttribute.isMany()) {
			EDataType attType = eAttribute.getEAttributeType();
			FeatureValue featureValue = object
					.getFeatureValue(structuralFeature);
			if (featureValue == null) {
				return null;
			}
			if (featureValue.values.isEmpty()) {
				return null;
			}
			Value value = featureValue.values.get(0);
			if (isEBooleanType(attType)) {
				return ((BooleanValue) value).value;
			} else if (isEIntType(attType)) {
				return (int) ((IntegerValue) value).value;
			} else if (isEStringType(attType)) {
				return ((StringValue) value).value;
			} else if (isCustomEEnumType(attType)) {
				EnumerationValue enumerationValue = (EnumerationValue) value;
				EnumerationLiteral literal = enumerationValue.literal;
				EEnum eEnum = (EEnum) attType;
				return eEnum.getEEnumLiteral(literal.name);
			}
		} else {
			// TODO handle multivalued attribute values
		}
		return null;
	}

	private boolean isEBooleanType(EDataType valueType) {
		return EcorePackage.eINSTANCE.getEBoolean().equals(valueType);
	}

	private boolean isEIntType(EDataType valueType) {
		return EcorePackage.eINSTANCE.getEInt().equals(valueType);
	}

	private boolean isEStringType(EDataType valueType) {
		return EcorePackage.eINSTANCE.getEString().equals(valueType);
	}

	private boolean isCustomEEnumType(EDataType valueType) {
		return valueType instanceof EEnum;
	}

	private void saveProfileApplication() throws IOException {
		facade.save();
	}

	public Resource getProfileApplicationResource() {
		return profileApplicationResource;
	}

	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public void setProfileApplicationURI(URI profileApplicationURI) {
		this.profileApplicationURI = profileApplicationURI;
	}

	public XMOFBasedModel getModel() {
		return model;
	}

	public Collection<Profile> getConfigurationProfiles() {
		return configurationProfiles;
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		EObject objectToUpdate = null;
		EStructuralFeature featureToUpdate = null;
		
		if(hasStereotypeApplication(notification.getNotifier())) {
			objectToUpdate = getStereotypeApplicationToBeUpdated(notification
					.getNotifier());
			featureToUpdate = getStereotypeApplicationFeatureToBeUpdated(
					(StereotypeApplication)objectToUpdate, notification.getFeature());
		}

		if (!(objectToUpdate != null && featureToUpdate != null))
			return;

		switch (notification.getEventType()) {
		case Notification.ADD:
		case Notification.ADD_MANY:
			addFeatureValue(objectToUpdate, featureToUpdate,
					getValueToUpdate(notification.getNewValue(), featureToUpdate), notification.getPosition());
			break;
		case Notification.REMOVE:
		case Notification.REMOVE_MANY:
			removeFeatureValue(objectToUpdate, featureToUpdate,
					getValueToUpdate(notification.getOldValue(), featureToUpdate));
			break;
		case Notification.SET:
			setFeatureValue(objectToUpdate, featureToUpdate,
					getValueToUpdate(notification.getNewValue(), featureToUpdate), notification.getPosition());
			break;
		case Notification.UNSET: //TODO test
			unsetFeatureValue(objectToUpdate, featureToUpdate,
					notification.getPosition());
			break;
		default:
			break;
		}
		// TODO in case conf objects are referenced, the reference should point to model element instead
		// this must also be considered in removal, setting, unsetting
	}

	private void addFeatureValue(EObject eObject,
			EStructuralFeature feature, Object newValue, int position) {
		Command cmd;
		if (feature.isMany()) {
			cmd = new AddCommand(getEditingDomain(), eObject,
					feature, newValue, position);
		} else {
			cmd = new AddCommand(getEditingDomain(), eObject,
					feature, newValue);
		}
		execute(cmd);
	}

	private void removeFeatureValue(
			EObject eObject,
			EStructuralFeature feature, Object oldValue) {
		Command cmd = new RemoveCommand(getEditingDomain(),
				eObject, feature, oldValue);
		execute(cmd);
	}

	private void setFeatureValue(EObject eObject,
			EStructuralFeature feature, Object newValue, int position) {
		Command cmd;
		if (feature.isMany()) {
			cmd = new SetCommand(getEditingDomain(), eObject,
					feature, newValue, position);
		} else {
			cmd = new SetCommand(getEditingDomain(), eObject,
					feature, newValue);
		}
		execute(cmd);
	}

	private void unsetFeatureValue(EObject eObject,
			EStructuralFeature feature, int position) {
		Command cmd;
		if (feature.isMany()) {
			cmd = new SetCommand(getEditingDomain(), eObject,
					feature, SetCommand.UNSET_VALUE, position);
		} else {
			cmd = new SetCommand(getEditingDomain(), eObject,
					feature, SetCommand.UNSET_VALUE);
		}
		execute(cmd);
	}
	
	private Object getValueToUpdate(Object value, EStructuralFeature feature) {
		if(value instanceof EObject) {
			EObject confObject = (EObject) value;
			EObject originalObject = configurationMap.getOriginalObject(confObject);
			if(originalObject != null) {
				return originalObject;
			} else if(feature instanceof EReference) {
				EReference eReference = (EReference) feature;
				if(eReference.isContainment()) {
					registerContentAdapter(confObject);
					confObject.eAdapters().add(this);
					return copier.copy(confObject);
				} else {
					return confObject;
				}
			}
		}
		return value;
	}

	private boolean hasStereotypeApplication(Object changedObject) {
		if(changedObject instanceof EObject) {
			EObject confObject = (EObject) changedObject;
			return configurationStereotypeApplicationMap.containsKey(confObject);
		}
		return false;
	}

	private StereotypeApplication getStereotypeApplicationToBeUpdated(
			Object changedObject) {
		try {
			EObject confObject = (EObject) changedObject;
			StereotypeApplication stereotypeApplication = configurationStereotypeApplicationMap
					.get(confObject);
			return stereotypeApplication;
		} catch (Exception e) {
		}
		return null;
	}

	private EStructuralFeature getStereotypeApplicationFeatureToBeUpdated(
			StereotypeApplication stereotypeApplication, Object changedFeature) {
		try {
			return stereotypeApplication.getStereotype().getEStructuralFeature(
					((EStructuralFeature) changedFeature).getName());
		} catch (Exception e) {
		}
		return null;
	}

	public void setEditingDomain(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	public EditingDomain getEditingDomain() {
		if (editingDomain == null) {
			editingDomain = TransactionalEditingDomain.Factory.INSTANCE
					.createEditingDomain(profileApplicationResource
							.getResourceSet());
		}
		return editingDomain;
	}

	private void execute(Command cmd) {
		if (getEditingDomain() != null) {
			getEditingDomain().getCommandStack().execute(cmd);
		} else {
			cmd.execute();
		}
	}
	
	private void registerContentAdapter(EObject confObject) {
		if(!confObject.eAdapters().contains(this)) {
			confObject.eAdapters().add(this);
		}		
	}
}

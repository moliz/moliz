/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.xmof.vm;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ReadSelfAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ValueSpecificationAction;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ForkNode;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.Classes.Kernel.KernelFactory;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.configuration.profile.ProfileGenerator;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.project.ui.wizard.ProfileProjectData;

public class SimplePetriNetFactory extends VMTestFactory{

	// activity names
	public static final String EMPTY_ACTIVITY = "Empty Activity";
	public static final String SET_ISENABLED_ACTIVITY = "Set isEnabled Activity";
	public static final String ADD_ISENABLED_ACTIVITY = "Add isEnabled Activity";
	public static final String REPLACE_ISENABLED_ACTIVITY = "Replace isEnabled Activity";
	public static final String SET_ISCURRENTLYENABLED_ACTIVITY = "Set isCurrentlyEnabled Activity";
	
	// factories
	private final static EcoreFactory ECORE = EcoreFactory.eINSTANCE;
	private final static KernelFactory KERNEL = KernelFactory.eINSTANCE;	
		
	// metamodel
	private EPackage metamodelPackage;
	private EClass netClass;
	private EClass transitionClass;
	private EClass placeClass; 
	
	// xmof-based configuration
	private EPackage confPackage;
	private BehavioredEClass netConfClass;
	private BehavioredEClass transitionConfClass;
	private BehavioredEClass placeConfClass;
	private EClass tokenConfClass;
	private HashMap<String, Activity> confActivities = new HashMap<String, Activity>();	
	private EAttribute isEnabledConfAttribute;
	private EAttribute isCurrentlyEnabledConfAttribute;
	private EReference tokensConfReference;
	private EReference holdingPlaceConfReference;
	
	// model
	private EObject net;
	private EObject place1;
	private EObject place2;
	private EObject transition;
	private Resource modelResource;	
	
	// runtime profile
	private Collection<Profile> configurationProfiles;
	
	private ResourceSet resourceSet;
	private EditingDomain editingDomain;
	private ConfigurationObjectMap configurationObjectMap;
	
	public SimplePetriNetFactory() {
		resourceSet = new ResourceSetImpl();
		createMetamodelResource();
		createConfigurationResource();
		modelResource = createModelResource();
		createConfigurationModelResource();
		createRuntimeProfile();
		
		editingDomain = createEditingDomain(resourceSet);
	}
	
	private EditingDomain createEditingDomain(ResourceSet resourceSet) {
		return TransactionalEditingDomain.Factory.INSTANCE
				.createEditingDomain(resourceSet);
	}
	
	private Resource createMetamodelResource() {
		Resource resource = resourceSet.createResource(URI
				.createFileURI(new File("petrinet.ecore")
						.getAbsolutePath()));
		resource.getContents().add(createMetamodel());
		return resource;
	}
	
	private EPackage createMetamodel() {
		metamodelPackage = ECORE.createEPackage();
		metamodelPackage.setName("PetriNetMetamodelPackage");
		metamodelPackage.setNsURI("http://www.modelexecution.org/petrinet/metamodel");
		metamodelPackage.setNsPrefix("sistusymm");
		metamodelPackage.getEClassifiers().add(createPlaceClass());
		metamodelPackage.getEClassifiers().add(createTransitionClass());		
		metamodelPackage.getEClassifiers().add(createNetClass());
		return metamodelPackage;
	}

	private EClassifier createPlaceClass() {
		placeClass = ECORE.createEClass();
		placeClass.setName("Place");
		return placeClass;
	}

	private EClassifier createTransitionClass() {
		transitionClass = ECORE.createEClass();
		transitionClass.setName("Transition");		
		return transitionClass;
	}

	private EClassifier createNetClass() {
		netClass = ECORE.createEClass();
		netClass.setName("Net");
		return netClass;
	}

	private Resource createConfigurationResource() {				
		loadPrimitiveBehaviors(resourceSet);		
		Resource resource = resourceSet.createResource(URI
				.createFileURI(new File("petrinet.xmof")
						.getAbsolutePath()));
		resource.getContents().add(createConfiguration());
		resource.getContents().addAll(createActivities());
		return resource;
	}		

	private EPackage createConfiguration() {
		confPackage = ECORE.createEPackage();
		confPackage.setName("PetriNetConfigurationPackage");
		confPackage.setNsURI("http://www.modelexecution.org/petrinet/configuration");
		confPackage.setNsPrefix("sistusyconf");
		confPackage.getEClassifiers().add(createTokenConfClass());
		confPackage.getEClassifiers().add(createPlaceConfClass());
		tokenConfClass.getEStructuralFeatures().add(createHoldingPlaceConfReference());
		confPackage.getEClassifiers().add(createTransitionConfClass());		
		confPackage.getEClassifiers().add(createNetConfClass());
		return confPackage;
	}

	private EClassifier createTokenConfClass() {
		tokenConfClass = KERNEL.createBehavioredEClass();
		tokenConfClass.setName("Token");		
		return tokenConfClass;
	}

	private EStructuralFeature createHoldingPlaceConfReference() {
		holdingPlaceConfReference = ECORE.createEReference();
		holdingPlaceConfReference.setName("holdingPlace");
		holdingPlaceConfReference.setLowerBound(1);
		holdingPlaceConfReference.setUpperBound(1);
		holdingPlaceConfReference.setEType(placeConfClass);
		return holdingPlaceConfReference;
	}

	private BehavioredEClass createNetConfClass() {
		netConfClass = KERNEL.createBehavioredEClass();
		netConfClass.setName("NetConfiguration");		
		netConfClass.getESuperTypes().add(netClass);
		return netConfClass;
	}	

	private BehavioredEClass createTransitionConfClass() {
		transitionConfClass = KERNEL.createBehavioredEClass();
		transitionConfClass.setName("TransitionConfiguration");		
		transitionConfClass.getESuperTypes().add(transitionClass);
		transitionConfClass.getEStructuralFeatures().add(createIsEnabledConfAttribute());
		transitionConfClass.getEStructuralFeatures().add(createIsCurrentlyEnabledConfAttribute());
		return transitionConfClass;
	}
	
	private EStructuralFeature createIsEnabledConfAttribute() {
		isEnabledConfAttribute = ECORE.createEAttribute();
		isEnabledConfAttribute.setName("isEnabled");
		isEnabledConfAttribute.setEType(EcorePackage.eINSTANCE.getEBoolean());
		isEnabledConfAttribute.setLowerBound(0);
		isEnabledConfAttribute.setUpperBound(-1);
		return isEnabledConfAttribute;
	}
	
	private EStructuralFeature createIsCurrentlyEnabledConfAttribute() {
		isCurrentlyEnabledConfAttribute = ECORE.createEAttribute();
		isCurrentlyEnabledConfAttribute.setName("isCurrentlyEnabled");
		isCurrentlyEnabledConfAttribute.setEType(EcorePackage.eINSTANCE.getEBoolean());
		isCurrentlyEnabledConfAttribute.setLowerBound(0);
		isCurrentlyEnabledConfAttribute.setUpperBound(1);
		return isCurrentlyEnabledConfAttribute;
	}
	
	private BehavioredEClass createPlaceConfClass() {
		placeConfClass = KERNEL.createBehavioredEClass();
		placeConfClass.setName("PlaceConfiguration");
		placeConfClass.getESuperTypes().add(placeClass);
		placeConfClass.getEStructuralFeatures().add(createTokensConfReference());
		return placeConfClass;
	}

	private EStructuralFeature createTokensConfReference() {
		tokensConfReference = ECORE.createEReference();
		tokensConfReference.setName("tokens");
		tokensConfReference.setContainment(true);
		tokensConfReference.setLowerBound(0);
		tokensConfReference.setUpperBound(-1);
		tokensConfReference.setEType(tokenConfClass);
		return tokensConfReference;
	}
	
	private Resource createModelResource() {
		Resource resource = resourceSet.createResource(URI
				.createFileURI(new File("petrinet1.xmi")
						.getAbsolutePath()));
		EFactory factory = metamodelPackage.getEFactoryInstance();

		net = factory.create(netClass);						
		place1 = factory.create(placeClass);
		place2 = factory.create(placeClass);
		transition = factory.create(transitionClass);
		 
		EList<EObject> eObjects = new BasicEList<EObject>();
		eObjects.add(net);
		eObjects.add(place1);
		eObjects.add(place2);
		eObjects.add(transition);
		
		resource.getContents().addAll(eObjects);
		
		return resource;
	}
	
	private Resource createConfigurationModelResource() {
		Resource resource = resourceSet.createResource(URI
				.createFileURI(new File("petrinet1config.xmi")
						.getAbsolutePath()));
		Collection<EPackage> configurationPackages = getConfigurationPackages();
		configurationObjectMap = new ConfigurationObjectMap(modelResource.getContents(), configurationPackages);
		resource.getContents().addAll(configurationObjectMap.getConfigurationObjects());
		return resource;
	}

	private Collection<EPackage> getConfigurationPackages() {
		Collection<EPackage> configurationPackages = new ArrayList<EPackage>();
		configurationPackages.add(confPackage);
		return configurationPackages;
	}
	
	private void createRuntimeProfile() {
		ProfileProjectData profileProjectData = createProfileProjectData();
		
		ProfileGenerator profileGenerator = new ProfileGenerator(profileProjectData, getConfigurationPackages());
		
		configurationProfiles = profileGenerator.generateConfigurationProfile();
		Resource profileResource = resourceSet.createResource(URI
				.createFileURI(new File("petrinet.profile")
				.getAbsolutePath()));
		profileResource.getContents().addAll(configurationProfiles);
	}

	private ProfileProjectData createProfileProjectData() {
		ProfileProjectData profileProjectData = new ProfileProjectData();
		profileProjectData.setProfileName("PetrinetRuntimeProfile");
		profileProjectData.setProfileNamespace("http://www.modelexecution.org/petrinet/runtimeprofile");
		return profileProjectData;
	}

	private Collection<Activity> createActivities() {
		Collection<Activity> activities = new ArrayList<Activity>();
		activities.add(createEmptyActivity());
		activities.add(createSetIsEnabledActivity());
		activities.add(createAddIsEnabledActivity());
		activities.add(createReplaceIsEnabledActivity());
		activities.add(createSetIsCurrentlyEnabledActivity());
		
		for(Activity activity : activities) {
			confActivities.put(activity.getName(), activity);
		}
		
		return activities;
	}
	
	private Activity createEmptyActivity() {
		Activity activity = INTERMED_ACTIVITIES.createActivity();		
		activity.setName(EMPTY_ACTIVITY);		
		createInitialNode(activity);
		return activity;
	}
	
	private Activity createSetIsEnabledActivity() {
		Activity activity = INTERMED_ACTIVITIES.createActivity();		
		activity.setName(SET_ISENABLED_ACTIVITY);		
		ReadSelfAction readSelfAction = createReadSelfAction(activity, "read self");
		ValueSpecificationAction valueSpecificationAction = createValueSpecificationAction(activity, "true", true);
		AddStructuralFeatureValueAction addStructuralFeatureValueAction = createAddStructuralFeatureValueAction(activity, "set isEnabled", isEnabledConfAttribute, true);
		createObjectFlow(activity, readSelfAction.getResult(), addStructuralFeatureValueAction.getObject());
		createObjectFlow(activity, valueSpecificationAction.getResult(), addStructuralFeatureValueAction.getValue());
		return activity;
	}
	
	private Activity createAddIsEnabledActivity() {
		Activity activity = INTERMED_ACTIVITIES.createActivity();		
		activity.setName(ADD_ISENABLED_ACTIVITY);		
		ReadSelfAction readSelfAction = createReadSelfAction(activity, "read self");
		ForkNode forkNode = createForkNode(activity, "fork");
		ValueSpecificationAction valueSpecificationAction = createValueSpecificationAction(activity, "true", true);
		AddStructuralFeatureValueAction addStructuralFeatureValueAction = createAddStructuralFeatureValueAction(activity, "add isEnabled", isEnabledConfAttribute, false);
		ValueSpecificationAction valueSpecificationAction2 = createValueSpecificationAction(activity, "false", false);
		AddStructuralFeatureValueAction addStructuralFeatureValueAction2 = createAddStructuralFeatureValueAction(activity, "add isEnabled", isEnabledConfAttribute, false);
		createObjectFlow(activity, readSelfAction.getResult(), forkNode);
		createObjectFlow(activity, forkNode, addStructuralFeatureValueAction.getObject());
		createObjectFlow(activity, forkNode, addStructuralFeatureValueAction2.getObject());
		createObjectFlow(activity, valueSpecificationAction.getResult(), addStructuralFeatureValueAction.getValue());
		createObjectFlow(activity, valueSpecificationAction2.getResult(), addStructuralFeatureValueAction2.getValue());
		createControlFlow(activity, addStructuralFeatureValueAction, addStructuralFeatureValueAction2);
		return activity;
	}
	
	private Activity createReplaceIsEnabledActivity() {
		Activity activity = INTERMED_ACTIVITIES.createActivity();		
		activity.setName(REPLACE_ISENABLED_ACTIVITY);		
		ReadSelfAction readSelfAction = createReadSelfAction(activity, "read self");
		ForkNode forkNode = createForkNode(activity, "fork");
		ValueSpecificationAction valueSpecificationAction = createValueSpecificationAction(activity, "true", true);
		AddStructuralFeatureValueAction addStructuralFeatureValueAction = createAddStructuralFeatureValueAction(activity, "set isEnabled", isEnabledConfAttribute, true);
		ValueSpecificationAction valueSpecificationAction2 = createValueSpecificationAction(activity, "false", false);
		AddStructuralFeatureValueAction addStructuralFeatureValueAction2 = createAddStructuralFeatureValueAction(activity, "set isEnabled", isEnabledConfAttribute, true);
		createObjectFlow(activity, readSelfAction.getResult(), forkNode);
		createObjectFlow(activity, forkNode, addStructuralFeatureValueAction.getObject());
		createObjectFlow(activity, forkNode, addStructuralFeatureValueAction2.getObject());
		createObjectFlow(activity, valueSpecificationAction.getResult(), addStructuralFeatureValueAction.getValue());
		createObjectFlow(activity, valueSpecificationAction2.getResult(), addStructuralFeatureValueAction2.getValue());
		createControlFlow(activity, addStructuralFeatureValueAction, addStructuralFeatureValueAction2);
		return activity;
	}
	
	private Activity createSetIsCurrentlyEnabledActivity() {
		Activity activity = INTERMED_ACTIVITIES.createActivity();		
		activity.setName(SET_ISCURRENTLYENABLED_ACTIVITY);		
		ReadSelfAction readSelfAction = createReadSelfAction(activity, "read self");
		ValueSpecificationAction valueSpecificationAction = createValueSpecificationAction(activity, "true", true);
		AddStructuralFeatureValueAction addStructuralFeatureValueAction = createAddStructuralFeatureValueAction(activity, "set isCurrentlyEnabled", isCurrentlyEnabledConfAttribute, false);
		createObjectFlow(activity, readSelfAction.getResult(), addStructuralFeatureValueAction.getObject());
		createObjectFlow(activity, valueSpecificationAction.getResult(), addStructuralFeatureValueAction.getValue());
		return activity;
	}
	
	public EObject getNet() {
		return net;
	}
	
	public EObject getPlace1() {
		return place1;
	}
	
	public EObject getPlace2() {
		return place2;
	}
	
	public EObject getTransition() {
		return transition;
	}

	public Activity getActivity(String name) {
		return confActivities.get(name);
	}
	
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}
	
	public ConfigurationObjectMap getConfigurationObjectMap() {
		return configurationObjectMap;
	}

	public Collection<Profile> getConfigurationProfiles() {
		return configurationProfiles;
	}
	
	public EObject getConfigurationObject(EObject eObject) {
		return configurationObjectMap.getConfigurationObject(eObject);
	}
	
	public EAttribute getIsEnabledConfAttribute() {
		return isEnabledConfAttribute;
	}
	
	public EAttribute getIsCurrentlyEnabledConfAttribute() {
		return isCurrentlyEnabledConfAttribute;
	}
}

/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.xmof.vm;

import java.io.File;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.CreateObjectAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.DestroyObjectAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.IntermediateActionsFactory;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ReadSelfAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityFinalNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ControlFlow;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.InitialNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.IntermediateActivitiesFactory;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ObjectFlow;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.Classes.Kernel.KernelFactory;
import org.modelexecution.xmof.Syntax.Classes.Kernel.MainEClass;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.Behavior;

public class SimpleStudentSystemFactory {

	private static final String NAME = "name";
	private static final String STATUS = "status";

	private final static EcoreFactory ECORE = EcoreFactory.eINSTANCE;
	private final static KernelFactory KERNEL = KernelFactory.eINSTANCE;
	private final static IntermediateActivitiesFactory INTERMED_ACTIVITIES = IntermediateActivitiesFactory.eINSTANCE;
	private final static IntermediateActionsFactory INTERMED_ACTIONS = IntermediateActionsFactory.eINSTANCE;

	private MainEClass mainEClass;
	private EPackage rootPackage;
	private BehavioredEClass studentClass;
	private EObject student1;
	private EObject student2;
	private EObject studentSystem;
	private EReference knowsReference;
	private EEnum studentStatusEnum;
	private EReference studentsReference;

	public Resource createMetamodelResource() {
		return createMetamodelResource(MainEClassClassifierBehaviorKind.CREATE);
	}

	public Resource createMetamodelResource(
			MainEClassClassifierBehaviorKind mainEClassClassifierBehavior) {
		Resource resource = new ResourceSetImpl().createResource(URI
				.createFileURI(new File("simple-student-system.xmof") //$NON-NLS-1$
						.getAbsolutePath()));
		resource.getContents().add(
				createMetamodel(mainEClassClassifierBehavior));
		return resource;
	}

	public EPackage createMetamodel(
			MainEClassClassifierBehaviorKind mainEClassClassifierBehavior) {
		rootPackage = ECORE.createEPackage();
		rootPackage.setName("StudentSystemPackage"); //$NON-NLS-1$
		rootPackage.setNsURI("http://www.modelexecution.org/student-system"); //$NON-NLS-1$
		rootPackage.setNsPrefix("sistusy"); //$NON-NLS-1$
		rootPackage.getEClassifiers().add(createStudentStatusEnum());
		rootPackage.getEClassifiers().add(createStudentClass());
		rootPackage.getEClassifiers().add(
				createMainEClass(mainEClassClassifierBehavior));
		return rootPackage;
	}	

	private EClassifier createStudentStatusEnum() {
		studentStatusEnum = ECORE.createEEnum();
		studentStatusEnum.setName("StudentStatus");
		EEnumLiteral activeLiteral = ECORE.createEEnumLiteral();
		activeLiteral.setLiteral("ACTIVE");
		activeLiteral.setName("active");
		activeLiteral.setValue(0);
		EEnumLiteral passiveLiteral = ECORE.createEEnumLiteral();
		passiveLiteral.setLiteral("PASSIVE");
		passiveLiteral.setName("passive");
		passiveLiteral.setValue(1);
		studentStatusEnum.getELiterals().add(activeLiteral);
		studentStatusEnum.getELiterals().add(passiveLiteral);
		return studentStatusEnum;
	}

	public enum MainEClassClassifierBehaviorKind {
		CREATE, DESTROY_ROOT, DESTROY_CHILD;
	}
	
	private MainEClass createMainEClass(
			MainEClassClassifierBehaviorKind mainEClassClassifierBehavior) {
		createMainEClass();

		Behavior classifierBehavior = null;
		switch (mainEClassClassifierBehavior) {
		case CREATE:
			classifierBehavior = createMainEClassClassifierBehavior_CREATE();
			break;
		case DESTROY_ROOT:
			classifierBehavior = createMainEClassClassifierBehavior_DESTROY();
			break;
		case DESTROY_CHILD:
			classifierBehavior = createMainEClassClassifierBehavior_DESTROY_CHILD();
			break;
		default:
			classifierBehavior = createMainEClassClassifierBehavior_CREATE();
			break;
		}
		setMainEClassClassifierBehavior(classifierBehavior);
		return mainEClass;
	}

	private MainEClass createMainEClass() {
		mainEClass = KERNEL.createMainEClass();
		mainEClass.setName("StudentSystem"); //$NON-NLS-1$
		mainEClass.getEStructuralFeatures().add(createNameAttribute());
		mainEClass.getEStructuralFeatures().add(createRefToStudents());
		return mainEClass;
	}

	private Behavior createMainEClassClassifierBehavior_CREATE() {
		Activity activity = INTERMED_ACTIVITIES.createActivity();
		activity.setName("MainEClassClassifierBehavior_CREATE");
		
		InitialNode initialNode = createInitialNode(activity);

		CreateObjectAction createStudentAction = createCreateObjectAction(
				activity, "CreateStudent", studentClass); //$NON-NLS-1$
		createControlFlow(activity, initialNode, createStudentAction);

		ActivityFinalNode finalNode = INTERMED_ACTIVITIES
				.createActivityFinalNode();
		activity.getNode().add(finalNode);
		createControlFlow(activity, createStudentAction, finalNode);
		return activity;
	}

	private Behavior createMainEClassClassifierBehavior_DESTROY() {
		Activity activity = INTERMED_ACTIVITIES.createActivity();
		activity.setName("MainEClassClassifierBehavior_DESTROY");
		ReadSelfAction readSelfAction = createReadSelfAction(activity,
				"ReadSelf aStudentSystem");
		DestroyObjectAction destroyObjectAction = createDestroyObjectAction(
				activity, "Destroy aStudentSystem");
		createObjectFlow(activity, readSelfAction.getResult(),
				destroyObjectAction.getTarget());
		return activity;
	}
	
	private Behavior createMainEClassClassifierBehavior_DESTROY_CHILD() {
		Activity activity = INTERMED_ACTIVITIES.createActivity();
		activity.setName("MainEClassClassifierBehavior_DESTROY_CHILD");
		ReadSelfAction readSelfAction = createReadSelfAction(activity,
				"ReadSelf aStudentSystem");
		ReadStructuralFeatureAction readFeatureAction = createReadStructuralFeatureValueAction(activity, "Read students", studentsReference);
		DestroyObjectAction destroyObjectAction = createDestroyObjectAction(
				activity, "Destroy aStudentSystem");
		createObjectFlow(activity, readSelfAction.getResult(),
				readFeatureAction.getObject());
		createObjectFlow(activity, readFeatureAction.getResult(),
				destroyObjectAction.getTarget());
		return activity;
	}

	public void setMainEClassClassifierBehavior(Behavior classifierBehavior) {
		mainEClass.getOwnedBehavior().add(classifierBehavior);
		mainEClass.setClassifierBehavior(classifierBehavior);
	}

	private EStructuralFeature createNameAttribute() {
		EAttribute nameAttribute = ECORE.createEAttribute();
		nameAttribute.setEType(EcorePackage.eINSTANCE.getEString());
		nameAttribute.setName(NAME);
		return nameAttribute;
	}

	private EStructuralFeature createStatusAttribute() {
		EAttribute nameAttribute = ECORE.createEAttribute();
		nameAttribute.setEType(studentStatusEnum);
		nameAttribute.setName(STATUS);
		return nameAttribute;
	}

	private EStructuralFeature createRefToStudents() {
		studentsReference = ECORE.createEReference();
		studentsReference.setName("students"); //$NON-NLS-1$
		studentsReference.setContainment(true);
		studentsReference.setEType(studentClass);
		studentsReference.setLowerBound(0);
		studentsReference.setUpperBound(-1);
		return studentsReference;
	}

	private EStructuralFeature createRefKnows() {
		knowsReference = ECORE.createEReference();
		knowsReference.setName("knows"); //$NON-NLS-1$
		knowsReference.setContainment(false);
		knowsReference.setEType(studentClass);
		knowsReference.setLowerBound(0);
		knowsReference.setUpperBound(-1);
		return knowsReference;
	}

	private EStructuralFeature createRefKnownBy() {
		EReference knownByReference = ECORE.createEReference();
		knownByReference.setName("knownBy"); //$NON-NLS-1$
		knownByReference.setContainment(false);
		knownByReference.setEType(studentClass);
		knownByReference.setLowerBound(0);
		knownByReference.setUpperBound(-1);
		knownByReference.setEOpposite(knowsReference);
		knowsReference.setEOpposite(knownByReference);
		return knownByReference;
	}

	private BehavioredEClass createStudentClass() {
		studentClass = KERNEL.createBehavioredEClass();
		studentClass.setName("Student"); //$NON-NLS-1$
		studentClass.getEStructuralFeatures().add(createNameAttribute());
		studentClass.getEStructuralFeatures().add(createStatusAttribute());
		studentClass.getEStructuralFeatures().add(createRefKnows());
		studentClass.getEStructuralFeatures().add(createRefKnownBy());
		return studentClass;
	}

	private InitialNode createInitialNode(Activity activity) {
		InitialNode initialNode = INTERMED_ACTIVITIES.createInitialNode();
		activity.getNode().add(initialNode);
		return initialNode;
	}

	private CreateObjectAction createCreateObjectAction(Activity activity,
			String name, EClass eClass) {
		CreateObjectAction action = INTERMED_ACTIONS.createCreateObjectAction();
		action.setName(name);
		action.setClassifier(eClass);
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}

	private ReadSelfAction createReadSelfAction(Activity activity, String name) {
		ReadSelfAction action = INTERMED_ACTIONS.createReadSelfAction();
		action.setName(name);
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}

	private DestroyObjectAction createDestroyObjectAction(Activity activity,
			String name) {
		DestroyObjectAction action = INTERMED_ACTIONS
				.createDestroyObjectAction();
		action.setName(name);
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}
	
	private ReadStructuralFeatureAction createReadStructuralFeatureValueAction(
			Activity activity, String name, EStructuralFeature structuralFeature) {
		ReadStructuralFeatureAction action = INTERMED_ACTIONS.createReadStructuralFeatureAction();
		action.setStructuralFeature(structuralFeature);		
		action.setName(name);
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}


	private ControlFlow createControlFlow(Activity activity,
			ActivityNode source, ActivityNode target) {
		ControlFlow cflow = INTERMED_ACTIVITIES.createControlFlow();
		cflow.setName("ControlFlow " + source.getName() + " --> " //$NON-NLS-1$ $NON-NLS-2$
				+ target.getName());
		cflow.setSource(source);
		cflow.setTarget(target);
		source.getOutgoing().add(cflow);
		target.getIncoming().add(cflow);
		cflow.setActivity(activity);
		activity.getEdge().add(cflow);
		return cflow;
	}

	private ObjectFlow createObjectFlow(Activity activity, ActivityNode source,
			ActivityNode target) {
		ObjectFlow oflow = INTERMED_ACTIVITIES.createObjectFlow();
		oflow.setName("ObjectFlow " + source.getName() + " --> " //$NON-NLS-1$ $NON-NLS-2$
				+ target.getName());
		oflow.setSource(source);
		oflow.setTarget(target);
		source.getOutgoing().add(oflow);
		target.getIncoming().add(oflow);
		oflow.setActivity(activity);
		activity.getEdge().add(oflow);
		return oflow;
	}

	public Resource createModelResource() {
		Resource resource = new ResourceSetImpl().createResource(URI
				.createFileURI(new File("simple-student-system1.xmi") //$NON-NLS-1$
						.getAbsolutePath()));
		EFactory factory = rootPackage.getEFactoryInstance();

		studentSystem = factory.create(mainEClass);
		studentSystem.eSet(mainEClass.getEStructuralFeature(NAME),
				"aStudentSystem"); //$NON-NLS-1$

		student1 = factory.create(studentClass);
		student1.eSet(studentClass.getEStructuralFeature(NAME), "Tanja"); //$NON-NLS-1$
		// student1.eSet(studentClass.getEStructuralFeature(STATUS),
		// studentStatusEnum.getEEnumLiteral(0));

		student2 = factory.create(studentClass);
		student2.eSet(studentClass.getEStructuralFeature(NAME), "Philip"); //$NON-NLS-1$
		// student2.eSet(studentClass.getEStructuralFeature(STATUS),
		// studentStatusEnum.getEEnumLiteral(1));

		EList<EObject> studentList = new BasicEList<EObject>();
		studentList.add(student1);
		studentList.add(student2);

		studentSystem.eSet(mainEClass.getEStructuralFeature("students"), //$NON-NLS-1$
				studentList);

		BasicEList<EObject> knowsValue = new BasicEList<EObject>();
		knowsValue.add(student2);
		student1.eSet(knowsReference, knowsValue);

		resource.getContents().add(studentSystem);
		return resource;
	}

	public MainEClass getMainEClass() {
		return mainEClass;
	}

	public EPackage getRootPackage() {
		return rootPackage;
	}

	public BehavioredEClass getStudentClass() {
		return studentClass;
	}

	public EObject getStudent1() {
		return student1;
	}

	public EObject getStudent2() {
		return student2;
	}

	public EObject getStudentSystem() {
		return studentSystem;
	}

	public EReference getStudentsReference() {
		return studentsReference;
	}

}

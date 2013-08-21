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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.CallBehaviorAction;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.CallOperationAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ReadSelfAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ValueSpecificationAction;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionKind;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.DecisionNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ForkNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.InitialNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.IntermediateActivitiesFactory;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.MergeNode;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.Syntax.Classes.Kernel.DirectedParameter;
import org.modelexecution.xmof.Syntax.Classes.Kernel.KernelFactory;
import org.modelexecution.xmof.Syntax.Classes.Kernel.ParameterDirectionKind;

public class PetriNetFactory extends VMTestFactory{

	private final static EcoreFactory ECORE = EcoreFactory.eINSTANCE;
	private final static KernelFactory KERNEL = KernelFactory.eINSTANCE;
	private final static IntermediateActivitiesFactory INTERMED_ACTIVITIES = IntermediateActivitiesFactory.eINSTANCE;
		
	private EPackage rootPackage;
	private BehavioredEClass netClass;
	private BehavioredEClass transitionClass;
	private BehavioredEClass placeClass;
	
	private BehavioredEOperation placeOperationAddToken;
	private BehavioredEOperation placeOperationRemoveToken;
	private BehavioredEOperation transitionOperationFire;
	private BehavioredEOperation transitionOperationIsEnabled;
	private BehavioredEOperation netOperationRun;
	
	private EAttribute initialTokensAttribute;
	private EAttribute tokensAttribute;
	
	private EObject net;
	private EObject inputplace;
	private EObject outputplace;
	private EObject transition;
	
	public Resource createMetamodelResource() {		
		ResourceSet resourceSet = new ResourceSetImpl();
		loadPrimitiveBehaviors(resourceSet);		
		Resource resource = resourceSet.createResource(URI
				.createFileURI(new File("petrinet.xmof")
						.getAbsolutePath()));
		resource.getContents().add(createMetamodel());
		return resource;
	}	

	private EPackage createMetamodel() {
		rootPackage = ECORE.createEPackage();
		rootPackage.setName("PetriNetPackage");
		rootPackage.setNsURI("http://www.modelexecution.org/petrinet");
		rootPackage.setNsPrefix("sistusy");
		rootPackage.getEClassifiers().add(createPlaceClass());
		rootPackage.getEClassifiers().add(createTransitionClass());		
		rootPackage.getEClassifiers().add(createNetClass());
		return rootPackage;
	}

	private BehavioredEClass createNetClass() {
		netClass = KERNEL.createBehavioredEClass();
		netClass.setName("Net");		
		netClass.getEStructuralFeatures().add(createRefToPlaces());
		netClass.getEStructuralFeatures().add(createRefToTransitions());
		netClass.getEOperations().add(createNetRunOperation());	
		netClass.getEOperations().add(createMainOperation());		
		return netClass;
	}	

	private EStructuralFeature createRefToPlaces() {
		EReference placesReference = ECORE.createEReference();
		placesReference.setName("places");
		placesReference.setContainment(true);
		placesReference.setEType(placeClass);
		placesReference.setLowerBound(0);
		placesReference.setUpperBound(-1);
		return placesReference;
	}
	
	private EStructuralFeature createRefToTransitions() {
		EReference transitionsReference = ECORE.createEReference();
		transitionsReference.setName("transitions");
		transitionsReference.setContainment(true);
		transitionsReference.setEType(transitionClass);
		transitionsReference.setLowerBound(0);
		transitionsReference.setUpperBound(-1);
		return transitionsReference;
	}

	private EOperation createNetRunOperation() {
		netOperationRun = KERNEL.createBehavioredEOperation();
		netOperationRun.setName("run");
		
		Activity activity = INTERMED_ACTIVITIES.createActivity();
		activity.setName("Net::run()");

		InitialNode initial = createInitialNode(activity);
		MergeNode merge = createMergeNode(activity, "merge");
		ReadSelfAction readself = createReadSelfAction(activity, "read self net");
		ReadStructuralFeatureAction readtransitions = createReadStructuralFeatureAction(activity, "read transitions", netClass.getEStructuralFeature("transitions"));		
		ForkNode fork = createForkNode(activity, "fork");
		CallOperationAction callisenabled = createCallOperationAction(activity, "call is enabled", transitionOperationIsEnabled);
		DecisionNode enabledtransitiondecision = createDecisionNode(activity, "check if transition enabled");
		EList<ActivityNode> regionnodes = new BasicEList<ActivityNode>();
		regionnodes.add(fork);
		regionnodes.add(callisenabled);
		regionnodes.add(enabledtransitiondecision);
		ExpansionRegion region = createExpansionRegion(activity, "select enabled transitions", ExpansionKind.PARALLEL, regionnodes, 1, 1);
		ValueSpecificationAction specify1 = createValueSpecificationAction(activity, "specify 1", 1);		
		CallBehaviorAction calllistget = createCallBehaviorAction(activity, "call list get", getPrimitiveBehavior("ListGet"));
		CallOperationAction callfire = createCallOperationAction(activity, "call fire", transitionOperationFire);
		
		createControlFlow(activity, initial, merge);
		createControlFlow(activity, merge, readself);
		createObjectFlow(activity, readself.getResult(), readtransitions.getInput().get(0));
		createObjectFlow(activity, readtransitions.getResult(), region.getInputElement().get(0));
		createObjectFlow(region, region.getInputElement().get(0), fork);
		createObjectFlow(region, fork, enabledtransitiondecision);
		createObjectFlow(region, fork, callisenabled.getTarget());
		createDecisionInputFlow(region, callisenabled.getResult().get(0), enabledtransitiondecision);
		createObjectFlow(region, enabledtransitiondecision, region.getOutputElement().get(0), true);
		createObjectFlow(activity, region.getOutputElement().get(0), calllistget.getInput().get(0));
		createObjectFlow(activity, calllistget.getResult().get(0), callfire.getInput().get(0));
		createControlFlow(activity, region, specify1);
		createObjectFlow(activity, specify1.getResult(), calllistget.getArgument().get(1));
		createControlFlow(activity, callfire, merge);
		
		netOperationRun.getMethod().add(activity);
		netClass.getOwnedBehavior().add(activity);
		
		return netOperationRun;
	}

	private EOperation createMainOperation() {		
		Activity mainActivity = INTERMED_ACTIVITIES.createActivity();
		mainActivity.setName(XMOFBasedModel.MAIN);
		
		InitialNode initial = createInitialNode(mainActivity);		
		ReadSelfAction readself = createReadSelfAction(mainActivity, "read self");
		ForkNode fork1 = createForkNode(mainActivity, "fork1");
		ReadStructuralFeatureAction readplaces = createReadStructuralFeatureAction(mainActivity, "read places", netClass.getEStructuralFeature("places"));		
		ForkNode fork2 = createForkNode(mainActivity, "fork2");
		ReadStructuralFeatureAction readinitialtokens = createReadStructuralFeatureAction(mainActivity, "read initial tokens", placeClass.getEStructuralFeature("initialTokens"));
		AddStructuralFeatureValueAction settokens = createAddStructuralFeatureValueAction(mainActivity, "set tokens", placeClass.getEStructuralFeature("tokens"), true);
		EList<ActivityNode> regionnodes = new BasicEList<ActivityNode>();
		regionnodes.add(fork2);
		regionnodes.add(readinitialtokens);
		regionnodes.add(settokens);
		ExpansionRegion region = createExpansionRegion(mainActivity, "initialize tokens", ExpansionKind.PARALLEL, regionnodes, 1, 0);
		CallOperationAction callrun = createCallOperationAction(mainActivity, "call run", netOperationRun);
		
		createControlFlow(mainActivity, initial, readself);
		createObjectFlow(mainActivity, readself.getResult(), fork1);
		createObjectFlow(mainActivity, fork1, readplaces.getInput().get(0));
		createObjectFlow(mainActivity, fork1, callrun.getTarget());
		createObjectFlow(mainActivity, readplaces.getResult(), region.getInputElement().get(0));
		createObjectFlow(region, region.getInputElement().get(0), fork2);
		createObjectFlow(region, fork2, readinitialtokens.getInput().get(0));
		createObjectFlow(region, fork2, settokens.getObject());
		createObjectFlow(region, readinitialtokens.getResult(), settokens.getValue());
		createControlFlow(mainActivity, region, callrun);
		
		BehavioredEOperation mainOperation = KERNEL.createBehavioredEOperation();
		mainOperation.setName(XMOFBasedModel.MAIN);
		mainOperation.getMethod().add(mainActivity);	
		netClass.getOwnedBehavior().add(mainActivity);
		
		return mainOperation;
	}

	private BehavioredEClass createTransitionClass() {
		transitionClass = KERNEL.createBehavioredEClass();
		transitionClass.setName("Transition");
		transitionClass.getEStructuralFeatures().add(createRefToInputPlaces());
		transitionClass.getEStructuralFeatures().add(createRefToOutputPlaces());
		transitionClass.getEOperations().add(createTransitionFireOperation());
		transitionClass.getEOperations().add(createTransitionIsEnabledOperation());		
		return transitionClass;
	}
	
	private EStructuralFeature createRefToInputPlaces() {
		EReference inputPlacesReference = ECORE.createEReference();
		inputPlacesReference.setName("input");
		inputPlacesReference.setContainment(false);
		inputPlacesReference.setEType(placeClass);
		inputPlacesReference.setLowerBound(0);
		inputPlacesReference.setUpperBound(-1);
		return inputPlacesReference;
	}
	
	private EStructuralFeature createRefToOutputPlaces() {
		EReference outputPlacesReference = ECORE.createEReference();
		outputPlacesReference.setName("output");
		outputPlacesReference.setContainment(false);
		outputPlacesReference.setEType(placeClass);
		outputPlacesReference.setLowerBound(0);
		outputPlacesReference.setUpperBound(-1);
		return outputPlacesReference;
	}
	
	private BehavioredEOperation createTransitionFireOperation() {
		transitionOperationFire = KERNEL.createBehavioredEOperation();
		transitionOperationFire.setName("fire");
		
		Activity activity = INTERMED_ACTIVITIES.createActivity();
		activity.setName("Transition::fire()");
		
		InitialNode initial = createInitialNode(activity);
		ForkNode fork = createForkNode(activity, "fork");
		ReadSelfAction readself = createReadSelfAction(activity, "read self transition");
		ReadStructuralFeatureAction readinput = createReadStructuralFeatureAction(activity, "read input", transitionClass.getEStructuralFeature("input"));
		ReadStructuralFeatureAction readoutput = createReadStructuralFeatureAction(activity, "read output", transitionClass.getEStructuralFeature("output"));		
		CallOperationAction calladdtoken = createCallOperationAction(activity, "call add token", placeOperationAddToken);
		EList<ActivityNode> expansionregionnodes = new BasicEList<ActivityNode>();
		expansionregionnodes.add(calladdtoken);
		ExpansionRegion changeoutput = createExpansionRegion(activity, "add tokens to output places", ExpansionKind.ITERATIVE, expansionregionnodes, 1, 0);				
		CallOperationAction callremovetoken = createCallOperationAction(activity, "call remove token", placeOperationRemoveToken);
		expansionregionnodes.clear();
		expansionregionnodes.add(callremovetoken);
		ExpansionRegion changeinput = createExpansionRegion(activity, "remove tokens from input places", ExpansionKind.ITERATIVE, expansionregionnodes, 1, 0);		
		
		createControlFlow(activity, initial, readself);
		createObjectFlow(activity, readself.getResult(), fork);
		createObjectFlow(activity, fork, readoutput.getInput().get(0));
		createObjectFlow(activity, readoutput.getResult(), changeoutput.getInputElement().get(0));
		createObjectFlow(changeoutput, changeoutput.getInputElement().get(0), calladdtoken.getInput().get(0));
		createObjectFlow(activity, fork, readinput.getInput().get(0));
		createObjectFlow(activity, readinput.getResult(), changeinput.getInputElement().get(0));
		createObjectFlow(changeinput, changeinput.getInputElement().get(0), callremovetoken.getInput().get(0));
				
		transitionOperationFire.getMethod().add(activity);
		transitionClass.getOwnedBehavior().add(activity);
		
		return transitionOperationFire;
	}	

	private BehavioredEOperation createTransitionIsEnabledOperation() {
		transitionOperationIsEnabled = KERNEL.createBehavioredEOperation();
		transitionOperationIsEnabled.setName("isEnabled");
		transitionOperationIsEnabled.setEType(EcorePackage.eINSTANCE.getEBoolean());
		
		Activity activity = INTERMED_ACTIVITIES.createActivity();
		activity.setName("Transition::isEnabled()");
		
		InitialNode initial = createInitialNode(activity);
		ReadSelfAction readself = createReadSelfAction(activity, "read self transition");
		ReadStructuralFeatureAction readinput = createReadStructuralFeatureAction(activity, "read input", transitionClass.getEStructuralFeature("input"));		
		ForkNode fork = createForkNode(activity, "fork");
		ReadStructuralFeatureAction readtokens = createReadStructuralFeatureAction(activity, "read tokens", placeClass.getEStructuralFeature("tokens"));
		DecisionNode heldtokensdecision = createDecisionNode(activity, "check held tokens");
		EList<ActivityNode> regionnodes = new BasicEList<ActivityNode>();
		regionnodes.add(fork);
		regionnodes.add(readtokens);
		regionnodes.add(heldtokensdecision);
		ExpansionRegion region = createExpansionRegion(activity, "select input places with tokens = 0", ExpansionKind.PARALLEL, regionnodes, 1, 1);
		ValueSpecificationAction specify0 = createValueSpecificationAction(activity, "specify 0", 0);		
		CallBehaviorAction calllistsize = createCallBehaviorAction(activity, "call list size", getPrimitiveBehavior("ListSize"));		
		DecisionNode enabledplacesdecision = createDecisionNode(activity, "check places without token", getPrimitiveBehavior("IntegerGreater"));
		ValueSpecificationAction specifytrue = createValueSpecificationAction(activity, "specify true", true);
		ValueSpecificationAction specifyfalse = createValueSpecificationAction(activity, "specify true", false);
		DirectedParameter isEnabledParam = createDirectedParameter("is enabled", ParameterDirectionKind.OUT);
		transitionOperationIsEnabled.getEParameters().add(isEnabledParam);
		ActivityParameterNode isEnabled = createActivityParameterNode(activity, "is enabled", isEnabledParam);
		
		createControlFlow(activity, initial, readself);
		createObjectFlow(activity, readself.getResult(), readinput.getInput().get(0));
		createObjectFlow(activity, readinput.getResult(), region.getInputElement().get(0));
		createObjectFlow(region, region.getInputElement().get(0), fork);
		createObjectFlow(region, fork, heldtokensdecision);
		createObjectFlow(region, fork, readtokens.getInput().get(0));
		createDecisionInputFlow(region, readtokens.getResult(), heldtokensdecision);
		createObjectFlow(region, heldtokensdecision, region.getOutputElement().get(0), 0);
		createObjectFlow(activity, region.getOutputElement().get(0), calllistsize.getInput().get(0));
		createObjectFlow(activity, calllistsize.getResult().get(0), enabledplacesdecision);
		createControlFlow(activity, region, specify0);
		createDecisionInputFlow(activity, specify0.getResult(), enabledplacesdecision);
		createControlFlow(activity, enabledplacesdecision, specifytrue, false);
		createControlFlow(activity, enabledplacesdecision, specifyfalse, true);
		createObjectFlow(activity, specifytrue.getResult(), isEnabled);
		createObjectFlow(activity, specifyfalse.getResult(), isEnabled);
		createControlFlow(activity, region, calllistsize);
		
		transitionOperationIsEnabled.getMethod().add(activity);
		transitionClass.getOwnedBehavior().add(activity);
		
		return transitionOperationIsEnabled;
	}
	
	private BehavioredEClass createPlaceClass() {
		placeClass = KERNEL.createBehavioredEClass();
		placeClass.setName("Place");
		placeClass.getEStructuralFeatures().add(createInitialTokensAttribute());
		placeClass.getEStructuralFeatures().add(createTokensAttribute());
		placeClass.getEOperations().add(createPlaceAddTokenOperation());
		placeClass.getEOperations().add(createPlaceRemoveTokenOperation());
		return placeClass;
	}

	private EStructuralFeature createInitialTokensAttribute() {
		initialTokensAttribute = ECORE.createEAttribute();
		initialTokensAttribute.setEType(EcorePackage.eINSTANCE.getEInt());
		initialTokensAttribute.setName("initialTokens");
		initialTokensAttribute.setLowerBound(1);
		initialTokensAttribute.setUpperBound(1);
		return initialTokensAttribute;
	}
	
	private EStructuralFeature createTokensAttribute() {
		tokensAttribute = ECORE.createEAttribute();
		tokensAttribute.setEType(EcorePackage.eINSTANCE.getEInt());
		tokensAttribute.setName("tokens");
		tokensAttribute.setLowerBound(1);
		tokensAttribute.setUpperBound(1);
		return tokensAttribute;
	}		

	private BehavioredEOperation createPlaceAddTokenOperation() {
		placeOperationAddToken = KERNEL.createBehavioredEOperation();
		placeOperationAddToken.setName("addToken");
		
		Activity activity = INTERMED_ACTIVITIES.createActivity();
		activity.setName("Place::addToken()");
		
		InitialNode initial = createInitialNode(activity);
		ForkNode fork1 = createForkNode(activity, "fork1");
		ReadSelfAction readself = createReadSelfAction(activity, "read self place");
		ValueSpecificationAction specify1 = createValueSpecificationAction(activity, "specify 1", 1);
		ForkNode fork2 = createForkNode(activity, "fork2");
		ReadStructuralFeatureAction readtokens = createReadStructuralFeatureAction(activity, "read tokens", placeClass.getEStructuralFeature("tokens"));		
		CallBehaviorAction calladd = createCallBehaviorAction(activity, "call add", getPrimitiveBehavior("IntegerPlus"));
		AddStructuralFeatureValueAction settokens = createAddStructuralFeatureValueAction(activity, "set tokens", placeClass.getEStructuralFeature("tokens"), true);
		
		createControlFlow(activity, initial, fork1);
		createControlFlow(activity, fork1, readself);
		createControlFlow(activity, fork1, specify1);
		createObjectFlow(activity, readself.getResult(), fork2);
		createObjectFlow(activity, fork2, settokens.getObject());
		createObjectFlow(activity, fork2, readtokens.getObject());
		createObjectFlow(activity, specify1.getResult(), calladd.getArgument().get(1));
		createObjectFlow(activity, readtokens.getResult(), calladd.getArgument().get(0));
		createObjectFlow(activity, calladd.getResult().get(0), settokens.getValue());
		
		placeOperationAddToken.getMethod().add(activity);
		placeClass.getOwnedBehavior().add(activity);
		
		return placeOperationAddToken;
	}
	
	private BehavioredEOperation createPlaceRemoveTokenOperation() {
		placeOperationRemoveToken = KERNEL.createBehavioredEOperation();
		placeOperationRemoveToken.setName("removeToken");
		
		Activity activity = INTERMED_ACTIVITIES.createActivity();
		activity.setName("Place::remove()");
		
		InitialNode initial = createInitialNode(activity);
		ForkNode fork1 = createForkNode(activity, "fork1");
		ReadSelfAction readself = createReadSelfAction(activity, "read self place");
		ValueSpecificationAction specify1 = createValueSpecificationAction(activity, "specify 1", 1);
		ForkNode fork2 = createForkNode(activity, "fork2");
		ReadStructuralFeatureAction readtokens = createReadStructuralFeatureAction(activity, "read tokens", placeClass.getEStructuralFeature("tokens"));		
		CallBehaviorAction callsubtract = createCallBehaviorAction(activity, "call subtract", getPrimitiveBehavior("IntegerMinus"));
		AddStructuralFeatureValueAction settokens = createAddStructuralFeatureValueAction(activity, "set tokens", placeClass.getEStructuralFeature("tokens"), true);
		
		createControlFlow(activity, initial, fork1);
		createControlFlow(activity, fork1, readself);
		createControlFlow(activity, fork1, specify1);
		createObjectFlow(activity, readself.getResult(), fork2);
		createObjectFlow(activity, fork2, settokens.getObject());
		createObjectFlow(activity, fork2, readtokens.getObject());
		createObjectFlow(activity, specify1.getResult(), callsubtract.getInput().get(1));
		createObjectFlow(activity, readtokens.getResult(), callsubtract.getInput().get(0));
		createObjectFlow(activity, callsubtract.getResult().get(0), settokens.getValue());
		
		placeOperationRemoveToken.getMethod().add(activity);
		placeClass.getOwnedBehavior().add(activity);
		
		return placeOperationRemoveToken;
	}
	
	public Resource createModelResource() {
		Resource resource = new ResourceSetImpl().createResource(URI
				.createFileURI(new File("petrinet1.xmi")
						.getAbsolutePath()));
		EFactory factory = rootPackage.getEFactoryInstance();

		net = factory.create(netClass);				
		
		inputplace = factory.create(placeClass);
		inputplace.eSet(placeClass.getEStructuralFeature("initialTokens"), 1);
		outputplace = factory.create(placeClass);
		outputplace.eSet(placeClass.getEStructuralFeature("initialTokens"), 0);		
		EList<EObject> placelist = new BasicEList<EObject>();
		placelist.add(inputplace);
		placelist.add(outputplace);
		net.eSet(netClass.getEStructuralFeature("places"), placelist);

		transition = factory.create(transitionClass);	
		EList<EObject> inputplacelist = new BasicEList<EObject>();
		inputplacelist.add(inputplace);
		transition.eSet(transitionClass.getEStructuralFeature("input"), inputplacelist);
		EList<EObject> outputplacelist = new BasicEList<EObject>();
		outputplacelist.add(outputplace);
		transition.eSet(transitionClass.getEStructuralFeature("output"), outputplacelist);		
		
		EList<EObject> transitionlist = new BasicEList<EObject>();
		transitionlist.add(transition);
		net.eSet(netClass.getEStructuralFeature("transitions"), transitionlist);
		
		resource.getContents().add(net);
		return resource;
	}

	public EObject getNet() {
		return net;
	}
	
	public EObject getInputplace() {
		return inputplace;
	}
	
	public EObject getOutputplace() {
		return outputplace;
	}
	
	public EObject getTransition() {
		return transition;
	}
	
	public EAttribute getInitialTokensAttribute() {
		return initialTokensAttribute;
	}
	
	public EAttribute getTokensAttribute() {
		return tokensAttribute;
	}
}

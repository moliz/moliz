/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.xmof.vm;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.BasicActionsFactory;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.CallBehaviorAction;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.CallOperationAction;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.CreateObjectAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.DestroyObjectAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.IntermediateActionsFactory;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ReadSelfAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ValueSpecificationAction;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionKind;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesFactory;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ControlFlow;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.DecisionNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ForkNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.InitialNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.IntermediateActivitiesFactory;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.MergeNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ObjectFlow;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.Syntax.Classes.Kernel.DirectedParameter;
import org.modelexecution.xmof.Syntax.Classes.Kernel.EEnumLiteralSpecification;
import org.modelexecution.xmof.Syntax.Classes.Kernel.InstanceValue;
import org.modelexecution.xmof.Syntax.Classes.Kernel.KernelFactory;
import org.modelexecution.xmof.Syntax.Classes.Kernel.LiteralBoolean;
import org.modelexecution.xmof.Syntax.Classes.Kernel.LiteralInteger;
import org.modelexecution.xmof.Syntax.Classes.Kernel.LiteralString;
import org.modelexecution.xmof.Syntax.Classes.Kernel.LiteralUnlimitedNatural;
import org.modelexecution.xmof.Syntax.Classes.Kernel.ParameterDirectionKind;
import org.modelexecution.xmof.Syntax.Classes.Kernel.ValueSpecification;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.FunctionBehavior;

public abstract class VMTestFactory {

	protected final static KernelFactory KERNEL = KernelFactory.eINSTANCE;
	protected final static IntermediateActivitiesFactory INTERMED_ACTIVITIES = IntermediateActivitiesFactory.eINSTANCE;
	protected final static IntermediateActionsFactory INTERMED_ACTIONS = IntermediateActionsFactory.eINSTANCE;
	protected final static BasicActionsFactory BASIC_ACTIONS = BasicActionsFactory.eINSTANCE;
	protected final static ExtraStructuredActivitiesFactory EXTRASTRUCT_ACTIVITIES = ExtraStructuredActivitiesFactory.eINSTANCE;
	
	protected Map<String, FunctionBehavior> primitiveBehaviors = new HashMap<String, FunctionBehavior>();
	
	protected void loadPrimitiveBehaviors(ResourceSet resourceSet) {
		Resource libraryResource = resourceSet.getResource(URI.createURI("pathmap://XMOF_LIBRARY/xmof_library.xmof", true), true);
		for(TreeIterator<EObject> iterator = libraryResource.getAllContents();iterator.hasNext();) {
			EObject eObject = iterator.next();
			if(eObject instanceof FunctionBehavior) {
				FunctionBehavior functionBehavior = (FunctionBehavior) eObject;
				primitiveBehaviors.put(functionBehavior.getName(), functionBehavior);
			}
		}
	}
	
	protected FunctionBehavior getPrimitiveBehavior(String name) {
		return primitiveBehaviors.get(name);
	}
	
	protected InitialNode createInitialNode(Activity activity) {
		InitialNode initialNode = INTERMED_ACTIVITIES.createInitialNode();
		initialNode.setName("initial");
		activity.getNode().add(initialNode);
		return initialNode;
	}
	
	protected ForkNode createForkNode(Activity activity, String name) {
		ForkNode forknode = INTERMED_ACTIVITIES.createForkNode();	
		forknode.setName(name);
		forknode.setActivity(activity);
		activity.getNode().add(forknode);
		return forknode;
	}	

	protected ReadSelfAction createReadSelfAction(Activity activity, String name) {
		ReadSelfAction action = INTERMED_ACTIONS.createReadSelfAction();
		action.setName(name);
		
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}
	
	protected ValueSpecificationAction createValueSpecificationAction(Activity activity, String name) {
		ValueSpecificationAction action = INTERMED_ACTIONS.createValueSpecificationAction();
		action.setName(name);
		
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}
	
	protected ValueSpecificationAction createValueSpecificationAction(Activity activity, String name, int value) {
		ValueSpecificationAction action = createValueSpecificationAction(activity, name);		
		LiteralInteger valueliteral = KERNEL.createLiteralInteger();
		valueliteral.setValue(value);
		action.setValue(valueliteral);		
		return action;
	}
	
	protected ValueSpecificationAction createValueSpecificationAction(Activity activity, String name, boolean value) {
		ValueSpecificationAction action = createValueSpecificationAction(activity, name);		
		LiteralBoolean valueliteral = KERNEL.createLiteralBoolean();
		valueliteral.setValue(value);
		action.setValue(valueliteral);		
		return action;
	}
	
	protected ReadStructuralFeatureAction createReadStructuralFeatureAction(Activity activity, String name, EStructuralFeature feature) {
		ReadStructuralFeatureAction action = INTERMED_ACTIONS.createReadStructuralFeatureAction();
		action.setName(name);
			
		action.setStructuralFeature(feature);
		
		action.setActivity(activity);
		activity.getNode().add(action);
		
		return action;
	}
	
	protected AddStructuralFeatureValueAction createAddStructuralFeatureValueAction(Activity activity, String name, EStructuralFeature feature, boolean isReplace) {
		AddStructuralFeatureValueAction action = INTERMED_ACTIONS.createAddStructuralFeatureValueAction();
		action.setName(name);
		
		action.setStructuralFeature(feature);
		
		action.setReplaceAll(isReplace);
		
		action.setActivity(activity);
		activity.getNode().add(action);		
		return action;
	}		
	
	protected CallBehaviorAction createCallBehaviorAction(Activity activity, String name, Behavior behavior) {
		CallBehaviorAction action = BASIC_ACTIONS.createCallBehaviorAction();
		action.setName(name);
		
		action.setBehavior(behavior);				
		
		int amountinputpins = 0;
		int amountoutputpins = 0;
		for(DirectedParameter param : behavior.getOwnedParameter()) {
			if(param.getDirection() == ParameterDirectionKind.IN || param.getDirection() == ParameterDirectionKind.INOUT) {
				InputPin pin = BASIC_ACTIONS.createInputPin();
				pin.setName("InputPin " + (++amountinputpins) + " (" + name + ")");
				pin.setLowerBound(param.getLowerBound());
				pin.setUpperBound(param.getUpperBound());
				action.getArgument().add(pin);
			}
			if(param.getDirection() == ParameterDirectionKind.OUT || param.getDirection() == ParameterDirectionKind.INOUT || param.getDirection() == ParameterDirectionKind.RETURN) {
				OutputPin pin = BASIC_ACTIONS.createOutputPin();
				pin.setName("OutputPin " + (++amountoutputpins) + " (" + name + ")");
				action.getResult().add(pin);
			}
		}						
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}		
	
	protected CallOperationAction createCallOperationAction(Activity activity, String name, BehavioredEOperation operation) {
		CallOperationAction action = BASIC_ACTIONS.createCallOperationAction();
		action.setName(name);
	
		action.setOperation(operation);
		
		InputPin targetpin = BASIC_ACTIONS.createInputPin();
		targetpin.setName("InputPin " + " target (" + name + ")");
		action.setTarget(targetpin);
		
		for(EParameter param : operation.getEParameters()) {
			InputPin inputpin = BASIC_ACTIONS.createInputPin();
			inputpin.setName("InputPin " + param.getName() + " (" + name + " )");
			action.getArgument().add(inputpin);
		}
		
		if(operation.getEType() != null) {
			OutputPin outputpin = BASIC_ACTIONS.createOutputPin();
			outputpin.setName("OutputPin return (" + name + ")");
			action.getResult().add(outputpin);
		}
		
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}

	protected DirectedParameter createDirectedParameter(String name, ParameterDirectionKind direction) {
		DirectedParameter param = KERNEL.createDirectedParameter();
		param.setName(name);
		param.setDirection(direction);		
		return param;
	}
	
	protected ExpansionRegion createExpansionRegion(Activity activity, String name, ExpansionKind mode, EList<ActivityNode> nodes, int inexpansionnodes, int outexpansionnodes) {
		ExpansionRegion region = EXTRASTRUCT_ACTIVITIES.createExpansionRegion();
		region.setName(name);		
		region.setMode(mode);
		
		region.getNode().addAll(nodes);
		
		for(int i=0;i<(inexpansionnodes + outexpansionnodes);++i) {
			ExpansionNode expnode = EXTRASTRUCT_ACTIVITIES.createExpansionNode();			
			expnode.setLowerBound(1);
			expnode.setUpperBound(-1);
			
			if(i<inexpansionnodes) {
				expnode.setName("ExpansionNode input " + (i+1) + " (" + name + ")");
				region.getInputElement().add(expnode);
				expnode.setRegionAsInput(region);
			} else {
				expnode.setName("ExpansionNode output " + (i-inexpansionnodes+1) + " (" + name + ")");
				region.getOutputElement().add(expnode);
				expnode.setRegionAsOutput(region);
			}			
			expnode.setActivity(activity);
			activity.getNode().add(expnode);
		}
		region.setActivity(activity);
		activity.getNode().add(region);
		return region;
	}
	
	protected DecisionNode createDecisionNode(Activity activity, String name) {
		DecisionNode decisionnode = INTERMED_ACTIVITIES.createDecisionNode();		
		decisionnode.setName(name);
		decisionnode.setActivity(activity);
		activity.getNode().add(decisionnode);						
		return decisionnode;
	}	
	
	protected DecisionNode createDecisionNode(Activity activity, String name, Behavior decisionBehavior) {
		DecisionNode decisionnode = createDecisionNode(activity, name);		
		decisionnode.setDecisionInput(decisionBehavior);
		return decisionnode;
	}
	
	protected MergeNode createMergeNode(Activity activity, String name) {
		MergeNode mergenode = INTERMED_ACTIVITIES.createMergeNode();	
		mergenode.setName(name);
		mergenode.setActivity(activity);
		activity.getNode().add(mergenode);
		return mergenode;
	}	
	
	protected ActivityParameterNode createActivityParameterNode(Activity activity, String name, DirectedParameter parameter) {
		ActivityParameterNode paramnode = INTERMED_ACTIVITIES.createActivityParameterNode();
		paramnode.setName(name + " (activity=" + activity.getName() + " parameter=" + parameter.getName() + ")");
		paramnode.setActivity(activity);
		paramnode.setParameter(parameter);
		activity.getNode().add(paramnode);
		return paramnode;
	}
	
	protected ControlFlow createControlFlow(Activity activity,
			ActivityNode source, ActivityNode target) {
		ControlFlow cflow = INTERMED_ACTIVITIES.createControlFlow();
		cflow.setName("ControlFlow " + source.getName() + " --> "
				+ target.getName());
		cflow.setSource(source);
		cflow.setTarget(target);
		source.getOutgoing().add(cflow);
		target.getIncoming().add(cflow);
		cflow.setActivity(activity);
		activity.getEdge().add(cflow);
		return cflow;
	}
	
	protected ControlFlow createControlFlow(Activity activity,
			ActivityNode source, ActivityNode target, boolean guard) {
		ControlFlow cflow = createControlFlow(activity, source, target);
		LiteralBoolean guardliteral = KERNEL.createLiteralBoolean();
		guardliteral.setValue(guard);
		cflow.setGuard(guardliteral);
		return cflow;
	}
	
	protected ObjectFlow createObjectFlow(Activity activity, ActivityNode source, ActivityNode target) {
		ObjectFlow oflow = INTERMED_ACTIVITIES.createObjectFlow();
		oflow.setName("ObjectFlow " + source.getName() + " --> " + target.getName());
		oflow.setSource(source);
		oflow.setTarget(target);
		
		source.getOutgoing().add(oflow);
		target.getIncoming().add(oflow);
				
		oflow.setActivity(activity);
		activity.getEdge().add(oflow);
		
		return oflow;
	}
	
	protected ObjectFlow createObjectFlow(StructuredActivityNode node, ActivityNode source, ActivityNode target) {
		ObjectFlow oflow = createObjectFlow(node.getActivity(), source, target);
		//source.setInStructuredNode(node);
		//target.setInStructuredNode(node);
		node.getEdge().add(oflow);		

		return oflow;
	}
	
	protected ObjectFlow createObjectFlow(StructuredActivityNode node, ActivityNode source, ActivityNode target, boolean guard) {
		ObjectFlow oflow = createObjectFlow(node, source, target);
		LiteralBoolean guardliteral = KERNEL.createLiteralBoolean();
		guardliteral.setValue(guard);
		oflow.setGuard(guardliteral);
		return oflow;
	}
	
	protected ObjectFlow createObjectFlow(StructuredActivityNode node, ActivityNode source, ActivityNode target, int guard) {
		ObjectFlow oflow = createObjectFlow(node, source, target);
		LiteralInteger guardliteral = KERNEL.createLiteralInteger();
		guardliteral.setValue(guard);
		oflow.setGuard(guardliteral);
		return oflow;
	}
	
	protected ObjectFlow createDecisionInputFlow(Activity activity, OutputPin source, DecisionNode target) {
		ObjectFlow oflow = createObjectFlow(activity, source, target);
		target.setDecisionInputFlow(oflow);
		return oflow;
	}	
	
	protected ObjectFlow createDecisionInputFlow(StructuredActivityNode node, OutputPin source, DecisionNode target) {
		ObjectFlow oflow = createObjectFlow(node, source, target);
		target.setDecisionInputFlow(oflow);
		return oflow;
	}
	
	protected CreateObjectAction createCreateObjectAction(Activity activity,
			String name, EClass eClass) {
		CreateObjectAction action = INTERMED_ACTIONS.createCreateObjectAction();
		action.setName(name);
		action.setClassifier(eClass);
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}
	
	protected ValueSpecificationAction createValueSpecificationAction(Activity activity, String name, int value, boolean unlimitedNatural) {
		ValueSpecificationAction action = createValueSpecificationAction(activity, name);
		
		ValueSpecification valueSpecification = null;
		if(!unlimitedNatural) {
			valueSpecification = KERNEL.createLiteralInteger();
			((LiteralInteger)valueSpecification).setValue(value);
			
		} else {
			valueSpecification = KERNEL.createLiteralUnlimitedNatural();
			((LiteralUnlimitedNatural)valueSpecification).setValue(value);
		}
		action.setValue(valueSpecification);
		
		return action;
	}
	
	protected ValueSpecificationAction createValueSpecificationAction(Activity activity, String name, String value) {
		ValueSpecificationAction action = createValueSpecificationAction(activity, name);
		
		LiteralString valueSpecification = KERNEL.createLiteralString();
		valueSpecification.setValue(value);
		action.setValue(valueSpecification);

		return action;
	}
	
	protected ValueSpecificationAction createValueSpecificationAction(Activity activity, String name, EEnumLiteral value) {
		ValueSpecificationAction action = createValueSpecificationAction(activity, name);
		
		EEnumLiteralSpecification valueSpecification = KERNEL.createEEnumLiteralSpecification();
		valueSpecification.setEEnumLiteral(value);
		valueSpecification.getClassifier().add(value.getEEnum());
		
		InstanceValue instanceValue = KERNEL.createInstanceValue();
		instanceValue.setInstance(valueSpecification);
		action.setValue(instanceValue);
		
		return action;
	}

	protected AddStructuralFeatureValueAction createAddStructuralFeatureValueAction(
			Activity activity, String name, EStructuralFeature eStructuralFeature, boolean insertAt, boolean replaceAll) {
		AddStructuralFeatureValueAction action = INTERMED_ACTIONS.createAddStructuralFeatureValueAction();
		action.setName(name);
		action.setActivity(activity);
		activity.getNode().add(action);
		
		action.setStructuralFeature(eStructuralFeature);
		
		if(insertAt) {
			InputPin inputPin = BasicActionsFactory.eINSTANCE.createInputPin();
			inputPin.setName("insertAt"); //$NON-NLS-1$
			inputPin.setLowerBound(1);
			inputPin.setUpperBound(1);		
			action.setInsertAt(inputPin);
		}
		
		action.setReplaceAll(replaceAll);
		
		return action;
	}
		
	protected DestroyObjectAction createDestroyObjectAction(Activity activity,
			String name) {
		DestroyObjectAction action = INTERMED_ACTIONS
				.createDestroyObjectAction();
		action.setName(name);
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}
	
	protected ReadStructuralFeatureAction createReadStructuralFeatureValueAction(
			Activity activity, String name, EStructuralFeature structuralFeature) {
		ReadStructuralFeatureAction action = INTERMED_ACTIONS.createReadStructuralFeatureAction();
		action.setStructuralFeature(structuralFeature);		
		action.setName(name);
		action.setActivity(activity);
		activity.getNode().add(action);
		return action;
	}

	protected ClearStructuralFeatureAction createClearStructuralFeatureAction(Activity activity, String name, EStructuralFeature structuralFeature) {
		ClearStructuralFeatureAction action = INTERMED_ACTIONS.createClearStructuralFeatureAction();
		
		action.setStructuralFeature(structuralFeature);
		
		action.setName(name);
		action.setActivity(activity);
		activity.getNode().add(action);
		
		return action;
	}
	
	protected RemoveStructuralFeatureValueAction createRemoveStructuralFeatureValueAction(Activity activity, String name, EStructuralFeature structuralFeature, boolean removeAt, boolean isRemoveDuplicates, boolean value) {
		RemoveStructuralFeatureValueAction action = INTERMED_ACTIONS.createRemoveStructuralFeatureValueAction();

		if(!value) {
			action.setValue(null);
		}
		action.setStructuralFeature(structuralFeature);
		action.setRemoveDuplicates(isRemoveDuplicates);
		
		if(removeAt) {
			InputPin inputPin = BasicActionsFactory.eINSTANCE.createInputPin();
			inputPin.setName("removeAt"); //$NON-NLS-1$
			inputPin.setLowerBound(1);
			inputPin.setUpperBound(1);		
			action.setRemoveAt(inputPin);
		}
		
		action.setName(name);
		action.setActivity(activity);
		activity.getNode().add(action);
		
		return action;
	}
}

/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fumldebug.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fUML.Semantics.Actions.BasicActions.CallActionActivation;
import fUML.Semantics.Actions.BasicActions.CallBehaviorActionActivation;
import fUML.Semantics.Actions.BasicActions.PinActivation;
import fUML.Semantics.Activities.CompleteStructuredActivities.StructuredActivityNodeActivation;
import fUML.Semantics.Activities.IntermediateActivities.ActivityNodeActivation;
import fUML.Syntax.Actions.BasicActions.CallBehaviorAction;
import fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import fUML.Syntax.Activities.IntermediateActivities.ActivityFinalNode;
import fUML.Syntax.Activities.IntermediateActivities.ActivityNode;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public class StructuredActivityNodeExecutionStatus extends ActivityNodeExecutionStatus{

	private StructuredActivityNodeActivation structuredActivityNodeActivation = null;
	
	public StructuredActivityNodeExecutionStatus(ActivityExecutionStatus activityExecutionStatus, StructuredActivityNodeActivation activityNodeActivation, int index) {
		super(activityExecutionStatus, activityNodeActivation, index);
		structuredActivityNodeActivation = (StructuredActivityNodeActivation)activityNodeActivation;
	}

	public void updateStatus() {		
		boolean structuredNodeHasEnabledChilds = hasStructuredActivityNodeEnabledChildNodes();
		if(!structuredNodeHasEnabledChilds) {
			handleEndOfExecution();
		}				
	}		
	
	private boolean hasStructuredActivityNodeEnabledChildNodes() {
		boolean containedNodeWasEnabled = hasStructuredActivityNodeEnabledDirectChildNodes();
		if(!containedNodeWasEnabled) {
			containedNodeWasEnabled = hasStructuredActivityNodeEnabledCalledNodes();
		}		
		return containedNodeWasEnabled;
	}
	
	private boolean hasStructuredActivityNodeEnabledDirectChildNodes() {
		List<ActivityNode> containedNodes = getAllContainedNodes((StructuredActivityNode)structuredActivityNodeActivation.node); 
		List<ActivityNode> enabledNodes = new ArrayList<ActivityNode>(activityExecutionStatus.getEnabledNodes());
		boolean directlyContainedNodeWasEnabled = containedNodes.removeAll(enabledNodes);
		return directlyContainedNodeWasEnabled;
	}
	
	private boolean hasStructuredActivityNodeEnabledCalledNodes() {
		for(ActivityNodeActivation childnodeactivation : structuredActivityNodeActivation.activationGroup.nodeActivations) {
			if(childnodeactivation instanceof CallActionActivation && !(childnodeactivation instanceof CallBehaviorActionActivation && ((CallBehaviorAction)childnodeactivation.node).behavior instanceof OpaqueBehavior)) {
				CallActionExecutionStatus callActionExecutionStatus = (CallActionExecutionStatus)activityExecutionStatus.getActivityNodeExecutionStatus(childnodeactivation.node);
				ActivityExecutionStatus calledActivityExecutionStatus = callActionExecutionStatus.getCalledActivityExecutionStatus();
				if(calledActivityExecutionStatus.hasEnabledNodesIncludingCallees()) {
					return true;
				}
			}
		}
		return false;
	}
	
	private List<ActivityNode> getAllContainedNodes(StructuredActivityNode structuredActivityNode) {		
		List<ActivityNode> containedNodes = new ArrayList<ActivityNode>();
		containedNodes.addAll(structuredActivityNode.node);
		
		for(ActivityNode n : structuredActivityNode.node) {
			if(n instanceof StructuredActivityNode) {
				containedNodes.addAll(getAllContainedNodes((StructuredActivityNode)n));
			}
		}
		
		return containedNodes;
	}
	
	@Override
	public void handleEndOfExecution() {		
		structuredActivityNodeActivation.sendOffers();	

		// activated activity final nodes can influence the execution of an activity because tokens on output pins are destroyed
		ActivityNodeActivation enabledActivityFinalNodeActivation = getEnabledActivityFinalNode();		
		if(enabledActivityFinalNodeActivation != null) {
			deleteTokensOfContainerStructuredActivityNodes();
		}

		super.handleEndOfExecution();
		checkIfCanFireAgain();
	}
	
	private void deleteTokensOfContainerStructuredActivityNodes() {
		List<StructuredActivityNodeActivation> containerStructuredActivityNode = getContainerStructuredActivityNode(structuredActivityNodeActivation);
		for(StructuredActivityNodeActivation activation : containerStructuredActivityNode) {
			for(PinActivation pinActivation : activation.pinActivations) {
				pinActivation.clearTokens();
			}
		}
	}
	
	private List<StructuredActivityNodeActivation> getContainerStructuredActivityNode(StructuredActivityNodeActivation activation) {
		List<StructuredActivityNodeActivation> container = new ArrayList<StructuredActivityNodeActivation>();
		StructuredActivityNodeActivation containerNodeActivation = activation.group.containingNodeActivation;
		if(containerNodeActivation != null) {
			container.add(containerNodeActivation);
			container.addAll(getContainerStructuredActivityNode(containerNodeActivation));
		}
		return container;
	}
	
	private ActivityNodeActivation getEnabledActivityFinalNode() {
		Set<ActivityNode> finalNodes = new HashSet<ActivityNode>();
		for(ActivityNode enabledNode : activityExecutionStatus.getEnabledNodes()) {
			if(enabledNode instanceof ActivityFinalNode)
				finalNodes.add(enabledNode);
		}
						
		for(ActivityNode finalNode : finalNodes) {
			ActivityNodeActivation enabledActivation = this.activityExecutionStatus.getEnabledActivation(finalNode);
			if(enabledActivation != null)
				return enabledActivation;
		}
		return null;
	}
	
	public boolean finishedExecution() {
		return !hasStructuredActivityNodeEnabledChildNodes();
	}
}

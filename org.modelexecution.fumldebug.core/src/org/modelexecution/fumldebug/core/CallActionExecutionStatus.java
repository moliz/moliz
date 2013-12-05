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

import org.modeldriven.alf.fuml.impl.environment.AlfOpaqueBehaviorExecution;

import fUML.Semantics.Actions.BasicActions.CallActionActivation;
import fUML.Semantics.Activities.IntermediateActivities.ActivityExecution;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Actions.BasicActions.CallAction;
import fUML.Syntax.Actions.BasicActions.OutputPin;
import fUML.Syntax.Actions.BasicActions.OutputPinList;
import fUML.Syntax.Classes.Kernel.Parameter;
import fUML.Syntax.Classes.Kernel.ParameterDirectionKind;
import fUML.Syntax.Classes.Kernel.ParameterList;

public class CallActionExecutionStatus extends ActivityNodeExecutionStatus {
	
	private CallActionActivation callActionActivation = null;
	private ActivityExecutionStatus calledActivityExecutionStatus = null;
	private ActivityExecution calledActivityExecution = null;
	
	public CallActionExecutionStatus(ActivityExecutionStatus activityExecutionStatus, CallActionActivation activityNodeActivation, int index) {
		super(activityExecutionStatus, activityNodeActivation, index);
		callActionActivation = activityNodeActivation;		
	}
	
	public void setCalledActivityExecutionStatus(ActivityExecutionStatus calledActivityExecutionStatus) {
		this.calledActivityExecutionStatus = calledActivityExecutionStatus;
		this.calledActivityExecution = calledActivityExecutionStatus.getActivityExecution();
	}

	public ActivityExecutionStatus getCalledActivityExecutionStatus() {
		return calledActivityExecutionStatus;
	}

	@Override
	public void handleEndOfExecution() {	
		obtainCallActionOutput();
		
		// Destroy execution of the called activity				
		calledActivityExecutionStatus.destroyActivityExecution();	
		
		AlfOpaqueBehaviorExecution calledAlfExecution = calledActivityExecutionStatus.getAlfExecution();
		if(calledAlfExecution == null) {
			callActionActivation.removeCallExecution(calledActivityExecution);
		} else {
			callActionActivation.removeCallExecution(calledAlfExecution);
		}
				
		// Notify about ActivityExitEvent
		ExecutionContext.getInstance().eventHandler.handleActivityExit(calledActivityExecution);

		// Notify about Exit of CallAction
		super.handleEndOfExecution();

		// Call sendOffer() from the CallAction			
		callActionActivation.sendOffers();

		callActionActivation.firing = false;
		
		// Check if can fire again
		this.checkIfCanFireAgain();
		
		updateStatusOfContainingStructuredActivityNode();

		boolean hasCallerEnabledNodes = activityExecutionStatus.hasEnabledNodesIncludingCallees();
		if (!hasCallerEnabledNodes) {
			activityExecutionStatus.handleEndOfExecution();
		} else {
			activityExecutionStatus.handleSuspension(callActionActivation.node);
		}
	}

	private void obtainCallActionOutput() {
		// START code from void CallActionActivation.doAction()
		CallAction callAction = (CallAction) (callActionActivation.node);
		OutputPinList resultPins = callAction.result;
		
		ParameterList parameters = calledActivityExecution.getBehavior().ownedParameter;
		
		ParameterValueList outputParameterValues = calledActivityExecution.getOutputParameterValues();

		int pinNumber = 1;
		int i = 1;
		while (i <= parameters.size()) {
			Parameter parameter = parameters.getValue(i - 1);
			if ((parameter.direction == ParameterDirectionKind.inout)
					| (parameter.direction == ParameterDirectionKind.out)
					| (parameter.direction == ParameterDirectionKind.return_)) {
				for (int j = 0; j < outputParameterValues.size(); j++) {
					ParameterValue outputParameterValue = outputParameterValues
							.getValue(j);
					if (outputParameterValue.parameter == parameter) {
						OutputPin resultPin = resultPins
								.getValue(pinNumber - 1);
						callActionActivation.putTokens(resultPin,
								outputParameterValue.values);
					}
				}
				pinNumber = pinNumber + 1;
			}
			i = i + 1;
		}
		// END code from void CallActionActivation.doAction()
	}
}

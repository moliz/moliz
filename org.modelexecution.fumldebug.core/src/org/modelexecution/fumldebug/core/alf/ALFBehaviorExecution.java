/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fumldebug.core.alf;

import fUML.Semantics.Classes.Kernel.Value;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public class ALFBehaviorExecution extends OpaqueBehaviorExecution {
	
	private OpaqueBehavior behavior;

	public ALFBehaviorExecution(OpaqueBehavior behavior) {
		this.behavior = behavior;
	}

	@Override
	public void doBody(ParameterValueList inputParameters,
			ParameterValueList outputParameters) {
		// TODO Auto-generated method stub
		System.out.println("I will execute the following code:");
		System.out.println(behavior.body);
	}

	@Override
	public Value new_() {
		return new ALFBehaviorExecution(behavior);
	}

	public OpaqueBehavior getBehavior() {
		return behavior;
	}

}

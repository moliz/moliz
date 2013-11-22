/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation based on the EventTest in org.modelexecution.fumldebugcore.test
 */
package org.modelexecution.fumldebug.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.modelexecution.fumldebug.core.ExecutionContext;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.util.ActivityFactory;

import fUML.Semantics.Classes.Kernel.IntegerValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.Classes.Kernel.Class_;
import fUML.Syntax.Classes.Kernel.Operation;
import fUML.Syntax.Classes.Kernel.Parameter;
import fUML.Syntax.Classes.Kernel.ParameterDirectionKind;
import fUML.Syntax.Classes.Kernel.ParameterList;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

/**
 * This test only verifies whether the events (and thus the aspects)
 * work properly when executing an activity via the {@link ExecutionContext}
 * provided by the plug-in org.modelexecution.fumldebug. Therefore, this
 * test only executes one activity and checks if events are notified. If
 * this is the case, the aspects seem to work.
 * 
 * This test is based on EventTest in org.modelexecution.fumldebug.core.test.
 * 
 * @author Philip Langer
 *
 */
public class AspectsViaPluginTest implements ExecutionEventListener {
	
	private static final String ALF_LANGUAGE_NAME = ExecutionContext.ALF_LANGUAGE_NAME;
	private static ExecutionContext executionContext;
	
	private List<Event> eventlist = new ArrayList<Event>();
	
	public AspectsViaPluginTest() {
		executionContext = ExecutionContext.getInstance();
		executionContext.addEventListener(this);
		executionContext
				.addAlfModelFilePathMapping("Libraries/**",
						"platform:/plugin/org.modelexecution.fumldebug/Libraries/");
	}

	@Before
	public void clearEventlist() {
		eventlist.clear();
	}
	
	@Test
	public void testEventsWhenExecutingActivity() {
		Activity activity = ActivityFactory.createActivity("Activity TestActivityExecution");		
		ExecutionContext.getInstance().execute(activity, null, new ParameterValueList());
		
		assertEquals(2, eventlist.size());
		assertTrue(eventlist.get(0) instanceof ActivityEntryEvent);
		assertEquals(activity, ((ActivityEntryEvent)eventlist.get(0)).getActivity());
		assertTrue(eventlist.get(1) instanceof ActivityExitEvent);
		assertEquals(activity, ((ActivityExitEvent)eventlist.get(1)).getActivity());		
	}
	
	@Test
	public void testAlf() {
		Class_ c = ActivityFactory.createClass("Class");
		
		String alfCode = "return input + 1;";
		Parameter inParameter = ActivityFactory.createParameter("input",
				ParameterDirectionKind.in,
				executionContext.getPrimitiveIntegerType());
		Parameter outParameter = ActivityFactory.createParameter("",
				ParameterDirectionKind.return_,
				executionContext.getPrimitiveIntegerType());

		OpaqueBehavior alfBehavior = new OpaqueBehavior();
		alfBehavior.setName("test");
		alfBehavior.language.add(ALF_LANGUAGE_NAME);
		alfBehavior.ownedParameter.add(inParameter);
		alfBehavior.ownedParameter.add(outParameter);
		alfBehavior.body.add(alfCode);
		c.addOwnedBehavior(alfBehavior);
		
		Parameter inParameter_operation = ActivityFactory.createParameter("input",
				ParameterDirectionKind.in,
				executionContext.getPrimitiveIntegerType());
		Parameter outParameter_operation = ActivityFactory.createParameter("",
				ParameterDirectionKind.return_,
				executionContext.getPrimitiveIntegerType());
		ParameterList parameters = new ParameterList();
		parameters.add(inParameter_operation);
		parameters.add(outParameter_operation);
		
		Operation createOperation = ActivityFactory.createOperation("test", parameters, alfBehavior, c);
		alfBehavior.specification = createOperation;

		ParameterValue parameterValue = new ParameterValue();
		parameterValue.parameter = inParameter;
		IntegerValue intValue = new IntegerValue();
		intValue.type = executionContext.getPrimitiveIntegerType();
		intValue.value = 1;
		parameterValue.values.add(intValue);
		ParameterValueList parameterValues = new ParameterValueList();
		parameterValues.add(parameterValue);

		ParameterValueList output =  executionContext.execute(alfBehavior, null, parameterValues);
		int result =  ((IntegerValue)  output.get(0).values.get(0)).value;
		assertEquals(2, result);
	}
	
	@Override
	public void notify(Event event) {		
		eventlist.add(event);
	}
	
}

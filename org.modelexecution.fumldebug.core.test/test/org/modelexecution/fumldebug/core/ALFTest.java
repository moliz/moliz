package org.modelexecution.fumldebug.core;

import org.junit.Test;
import org.modelexecution.fumldebug.core.util.ActivityFactory;

import fUML.Semantics.Classes.Kernel.IntegerValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Classes.Kernel.Parameter;
import fUML.Syntax.Classes.Kernel.ParameterDirectionKind;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public class ALFTest {

	private static final String ALF_LANGUAGE_NAME = "ALF"; // TODO replace
	private static ExecutionContext executionContext = ExecutionContext
			.getInstance();

	@Test
	public void testExecutingSimpleALFBehavior() {
		Parameter inParameter = ActivityFactory.createParameter("input",
				ParameterDirectionKind.in,
				executionContext.getPrimitivIntegerType());
		Parameter outParameter = ActivityFactory.createParameter("",
				ParameterDirectionKind.return_,
				executionContext.getPrimitivIntegerType());
		OpaqueBehavior alfBehavior = new OpaqueBehavior();
		alfBehavior.ownedParameter.add(inParameter);
		alfBehavior.ownedParameter.add(outParameter);
		alfBehavior.setName("IncreaseInteger");
		alfBehavior.language.add(ALF_LANGUAGE_NAME);
		String alfCode = "activity increaseInteger(in input: Integer): Integer {"
				+ "if (input > 0) { return input + 1; } else {return 0;}" + "}";
		alfBehavior.body.add(alfCode);

		ParameterValue parameterValue = new ParameterValue();
		parameterValue.parameter = inParameter;
		IntegerValue intValue = new IntegerValue();
		intValue.value = 1;
		parameterValue.values.add(intValue);
		ParameterValueList parameterValues = new ParameterValueList();
		parameterValues.add(parameterValue);
		executionContext.execute(alfBehavior, null, parameterValues);
	}
}

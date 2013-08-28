package org.modelexecution.fumldebug.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;
import org.modelexecution.fumldebug.core.util.ActivityFactory;

import fUML.Semantics.Classes.Kernel.FeatureValue;
import fUML.Semantics.Classes.Kernel.IntegerValue;
import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.Classes.Kernel.Reference;
import fUML.Semantics.Classes.Kernel.StringValue;
import fUML.Semantics.Classes.Kernel.Value;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Classes.Kernel.Class_;
import fUML.Syntax.Classes.Kernel.Package;
import fUML.Syntax.Classes.Kernel.Parameter;
import fUML.Syntax.Classes.Kernel.ParameterDirectionKind;
import fUML.Syntax.Classes.Kernel.Property;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public class ALFTest {

	private static final String ALF_LANGUAGE_NAME = ExecutionContext.ALF_LANGUAGE_NAME;
	private static ExecutionContext executionContext = ExecutionContext
			.getInstance();

	@Test
	public void test1Plus1() {
		String alfCode = "return input + 1;";
		ParameterValueList output = executeAlfOpaqueBehaviorWithOneIntegerInput(
				alfCode, 1);
		int result = getFirstParameterAsInteger(output);
		assertEquals(2, result);
	}

	@Test
	public void test2Plus3() {
		String alfCode = "return input + 3;";
		ParameterValueList output = executeAlfOpaqueBehaviorWithOneIntegerInput(
				alfCode, 2);
		int result = getFirstParameterAsInteger(output);
		assertEquals(5, result);
	}

	@Test
	public void test3Minus3() {
		String alfCode = "return input - 3;";
		ParameterValueList output = executeAlfOpaqueBehaviorWithOneIntegerInput(
				alfCode, 3);
		int result = getFirstParameterAsInteger(output);
		assertEquals(0, result);
	}

	@Test
	public void test10Mod2() {
		String alfCode = "return input % 2;";
		ParameterValueList output = executeAlfOpaqueBehaviorWithOneIntegerInput(
				alfCode, 10);
		int result = getFirstParameterAsInteger(output);
		assertEquals(0, result);
	}

	@Test
	public void test10Mod3() {
		String alfCode = "return input % 3;";
		ParameterValueList output = executeAlfOpaqueBehaviorWithOneIntegerInput(
				alfCode, 10);
		int result = getFirstParameterAsInteger(output);
		assertEquals(1, result);
	}

	@Test
	public void testInstantiatingFumlClass() {
		String alfCode = "p = new Person(); p.name = name; return p;";

		fUML.Syntax.Classes.Kernel.Package p = new Package();
		p.setName("Package");

		Class_ classPerson = ActivityFactory.createClass("Person");
		Property propertyName = ActivityFactory.createProperty("name", 1, 1,
				executionContext.getPrimitiveStringType(), classPerson);
		p.addPackagedElement(classPerson);

		Parameter inParameter = ActivityFactory.createParameter("name",
				ParameterDirectionKind.in,
				executionContext.getPrimitiveStringType());
		Parameter outParameter = ActivityFactory.createParameter(
				"createdPerson", ParameterDirectionKind.return_, classPerson);

		OpaqueBehavior alfBehavior = new OpaqueBehavior();
		alfBehavior.ownedParameter.add(inParameter);
		alfBehavior.ownedParameter.add(outParameter);
		alfBehavior.setName("createPerson");
		alfBehavior.language.add(ALF_LANGUAGE_NAME);
		alfBehavior.body.add(alfCode);
		p.addPackagedElement(alfBehavior);

		ParameterValue parameterValue = new ParameterValue();
		parameterValue.parameter = inParameter;
		StringValue value = new StringValue();
		value.value = "Philip";
		parameterValue.values.add(value);
		ParameterValueList parameterValues = new ParameterValueList();
		parameterValues.add(parameterValue);

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				parameterValues);

		Value result = output.get(0).values.get(0);
		assertTrue(result instanceof Reference);

		Object_ resultObject = (Object_) ((Reference) result).referent;
		assertTrue(resultObject.types.contains(classPerson));

		assertEquals(1, resultObject.featureValues.size());
		FeatureValue firstFeatureValue = resultObject.featureValues.get(0);
		assertEquals(propertyName, firstFeatureValue.feature);
		assertEquals(1, firstFeatureValue.values.size());
		StringValue stringValue = (StringValue) firstFeatureValue.values.get(0);
		assertEquals("Philip", stringValue.value);
	}

	private ParameterValueList executeAlfOpaqueBehaviorWithOneIntegerInput(
			String alfCode, int input) {
		Parameter inParameter = ActivityFactory.createParameter("input",
				ParameterDirectionKind.in,
				executionContext.getPrimitiveIntegerType());
		Parameter outParameter = ActivityFactory.createParameter("",
				ParameterDirectionKind.return_,
				executionContext.getPrimitiveIntegerType());

		OpaqueBehavior alfBehavior = new OpaqueBehavior();
		alfBehavior.ownedParameter.add(inParameter);
		alfBehavior.ownedParameter.add(outParameter);
		alfBehavior.setName("Test");
		alfBehavior.language.add(ALF_LANGUAGE_NAME);
		alfBehavior.body.add(alfCode);

		ParameterValue parameterValue = new ParameterValue();
		parameterValue.parameter = inParameter;
		IntegerValue intValue = new IntegerValue();
		intValue.value = input;
		parameterValue.values.add(intValue);
		ParameterValueList parameterValues = new ParameterValueList();
		parameterValues.add(parameterValue);

		return executionContext.execute(alfBehavior, null, parameterValues);
	}

	private int getFirstParameterAsInteger(ParameterValueList output) {
		return ((IntegerValue) output.get(0).values.get(0)).value;
	}

	protected void debugPrint(ParameterValueList output) {
		for (ParameterValue parameterValue : output) {
			System.out.print(parameterValue.parameter.name);
			System.out.print("=");
			System.out.println(parameterValue.values);
		}
	}
}

package org.modelexecution.fumldebug.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.modelexecution.fumldebug.core.util.ActivityFactory;

import UMLPrimitiveTypes.UnlimitedNatural;
import fUML.Semantics.Classes.Kernel.FeatureValue;
import fUML.Semantics.Classes.Kernel.IntegerValue;
import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.Classes.Kernel.Reference;
import fUML.Semantics.Classes.Kernel.StringValue;
import fUML.Semantics.Classes.Kernel.Value;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Classes.Kernel.Association;
import fUML.Syntax.Classes.Kernel.Class_;
import fUML.Syntax.Classes.Kernel.Operation;
import fUML.Syntax.Classes.Kernel.Package;
import fUML.Syntax.Classes.Kernel.Parameter;
import fUML.Syntax.Classes.Kernel.ParameterDirectionKind;
import fUML.Syntax.Classes.Kernel.Property;
import fUML.Syntax.Classes.Kernel.PropertyList;
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
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classPerson = ActivityFactory.createClass("Person");
		Property propertyName = ActivityFactory.createProperty("name", 1, 1,
				executionContext.getPrimitiveStringType(), classPerson);
		p.addPackagedElement(classPerson);

		Parameter inParameter = ActivityFactory.createParameter("name",
				ParameterDirectionKind.in,
				executionContext.getPrimitiveStringType());
		Parameter outParameter = ActivityFactory.createParameter(
				"createdPerson", ParameterDirectionKind.return_, classPerson);

		String alfCode = "p = new Person(); p.name = name; return p;";

		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior("createPerson");
		alfBehavior.ownedParameter.add(inParameter);
		alfBehavior.ownedParameter.add(outParameter);
		alfBehavior.body.add(alfCode);
		p.addPackagedElement(alfBehavior);

		ParameterValue parameterValue = new ParameterValue();
		parameterValue.parameter = inParameter;
		parameterValue.values.add(createValue("Philip"));
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

	@Test
	public void testAlfCollectionFunctionAdd() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classGroup = ActivityFactory.createClass("Group");
		p.addPackagedElement(classGroup);

		Class_ classPerson = ActivityFactory.createClass("Person");
		p.addPackagedElement(classPerson);

		Property propertyPersons = ActivityFactory.createProperty("persons", 0,
				-1, classGroup, classPerson);
		Property propertyGroup = ActivityFactory.createProperty("group", 0, 1,
				classPerson, classGroup);

		PropertyList assocEnds = new PropertyList();
		assocEnds.add(propertyPersons);
		assocEnds.add(propertyGroup);
		Association assocPersonsInGroup = ActivityFactory.createAssociation(
				"personsInGroup", assocEnds);

		classGroup.addOwnedAttribute(propertyPersons);
		assocPersonsInGroup.addOwnedEnd(propertyGroup);

		String alfCode = "g = new Group(); g.persons->add(new Person()); return g;";
		//String alfCode = "list = new Alf::Library::CollectionClasses::Impl::List<Person>(); return new Group();";
		
		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior("addNewPersonInNewGroup");
		Parameter outParameter = ActivityFactory.createParameter(
				"createdGroup", ParameterDirectionKind.return_, classGroup);
		alfBehavior.body.add(alfCode);
		alfBehavior.addOwnedParameter(outParameter);
		classGroup.addOwnedBehavior(alfBehavior);
		p.addPackagedElement(alfBehavior);

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				new ParameterValueList());

		debugPrint(output);
	}
	
	@Test
	public void testAddStringToMultivaluedAttribute() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classPerson = ActivityFactory.createClass("Person");
		Property propertyName = ActivityFactory.createProperty("name", 0, -1,
				executionContext.getPrimitiveStringType(), classPerson);
		p.addPackagedElement(classPerson);

		Parameter inParameter = ActivityFactory.createParameter("name",
				ParameterDirectionKind.in,
				executionContext.getPrimitiveStringType());
		Parameter outParameter = ActivityFactory.createParameter(
				"createdPerson", ParameterDirectionKind.return_, classPerson);

		String alfCode = "p = new Person(); p.name->add(name); return p;";

		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior("createPerson");
		alfBehavior.ownedParameter.add(inParameter);
		alfBehavior.ownedParameter.add(outParameter);
		alfBehavior.body.add(alfCode);
		p.addPackagedElement(alfBehavior);

		ParameterValue parameterValue = new ParameterValue();
		parameterValue.parameter = inParameter;
		parameterValue.values.add(createValue("Philip"));
		ParameterValueList parameterValues = new ParameterValueList();
		parameterValues.add(parameterValue);

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				parameterValues);

		debugPrint(output);
	}

	@Test
	public void testCallingOperationsOnObjects() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classGroup = ActivityFactory.createClass("Group");
		p.addPackagedElement(classGroup);

		Class_ classPerson = ActivityFactory.createClass("Person");
		Property propertyName = ActivityFactory.createProperty("name", 1, 1,
				executionContext.getPrimitiveStringType(), classPerson);
		p.addPackagedElement(classPerson);

		Operation operation = new Operation();
		operation.upper = new UnlimitedNatural(1);
		operation.name = "setPersonName";
		operation.addOwnedParameter(ActivityFactory.createParameter("p",
				ParameterDirectionKind.in, classPerson));
		classGroup.addOwnedOperation(operation);
		OpaqueBehavior behaviorAddPerson = createAlfOpaqueBehavior("setPersonName");
		Parameter paramPerson4Behavior = ActivityFactory.createParameter("p",
				ParameterDirectionKind.in, classPerson);
		behaviorAddPerson.addOwnedParameter(paramPerson4Behavior);
		behaviorAddPerson.body.add("p.name = \"lala\";");
		classGroup.addOwnedBehavior(behaviorAddPerson);
		p.addPackagedElement(behaviorAddPerson);

		operation.addMethod(behaviorAddPerson);

		Parameter outParameter = ActivityFactory.createParameter(
				"createdPerson", ParameterDirectionKind.return_, classPerson);

		String alfCode = "p = new Person(); g = new Group(); "
				+ "g.setPersonName(p); return p;";

		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior("createPersonInNewGroup");
		alfBehavior.addOwnedParameter(outParameter);
		alfBehavior.body.add(alfCode);
		p.addPackagedElement(alfBehavior);

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				new ParameterValueList());

		Value result = output.get(0).values.get(0);
		assertTrue(result instanceof Reference);

		Object_ resultObject = (Object_) ((Reference) result).referent;
		assertTrue(resultObject.types.contains(classPerson));

		FeatureValue firstFeatureValue = resultObject.featureValues.get(0);
		assertEquals(propertyName, firstFeatureValue.feature);
		assertEquals(1, firstFeatureValue.values.size());
		StringValue stringValue = (StringValue) firstFeatureValue.values.get(0);
		assertEquals("lala", stringValue.value);
	}

	private ParameterValueList executeAlfOpaqueBehaviorWithOneIntegerInput(
			String alfCode, int input) {
		Parameter inParameter = ActivityFactory.createParameter("input",
				ParameterDirectionKind.in,
				executionContext.getPrimitiveIntegerType());
		Parameter outParameter = ActivityFactory.createParameter("",
				ParameterDirectionKind.return_,
				executionContext.getPrimitiveIntegerType());

		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior("Test");
		alfBehavior.ownedParameter.add(inParameter);
		alfBehavior.ownedParameter.add(outParameter);
		alfBehavior.body.add(alfCode);

		ParameterValue parameterValue = new ParameterValue();
		parameterValue.parameter = inParameter;
		IntegerValue intValue = createValue(input);
		parameterValue.values.add(intValue);
		ParameterValueList parameterValues = new ParameterValueList();
		parameterValues.add(parameterValue);

		return executionContext.execute(alfBehavior, null, parameterValues);
	}

	private fUML.Syntax.Classes.Kernel.Package createPackage() {
		fUML.Syntax.Classes.Kernel.Package p = new Package();
		p.setName("Package");
		return p;
	}

	private IntegerValue createValue(int integer) {
		IntegerValue intValue = new IntegerValue();
		intValue.value = integer;
		return intValue;
	}

	private StringValue createValue(String string) {
		StringValue value = new StringValue();
		value.value = string;
		return value;
	}

	private int getFirstParameterAsInteger(ParameterValueList output) {
		return ((IntegerValue) output.get(0).values.get(0)).value;
	}

	private OpaqueBehavior createAlfOpaqueBehavior(String name) {
		OpaqueBehavior alfBehavior = new OpaqueBehavior();
		alfBehavior.setName(name);
		alfBehavior.language.add(ALF_LANGUAGE_NAME);
		return alfBehavior;
	}

	protected void debugPrint(ParameterValueList output) {
		for (ParameterValue parameterValue : output) {
			System.out.print(parameterValue.parameter.name);
			System.out.print("=");
			System.out.println(parameterValue.values);
		}
	}
}

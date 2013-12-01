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
import fUML.Semantics.Classes.Kernel.ValueList;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Classes.Kernel.Class_;
import fUML.Syntax.Classes.Kernel.Generalization;
import fUML.Syntax.Classes.Kernel.Operation;
import fUML.Syntax.Classes.Kernel.Package;
import fUML.Syntax.Classes.Kernel.Parameter;
import fUML.Syntax.Classes.Kernel.ParameterDirectionKind;
import fUML.Syntax.Classes.Kernel.ParameterList;
import fUML.Syntax.Classes.Kernel.Property;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

// TODO some tests only work when executed on their own (e.g., testSizeFunctionOnPropertyList)
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

		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(alfCode, "createPerson", classPerson, inParameter, outParameter);

		ParameterValueList parameterValues = createParameterValue(inParameter,
				createValue("Philip"));

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				parameterValues);

		Value result = getFirstValue(output);
		assertTrue(result instanceof Reference);

		Object_ resultObject = resolveObjectReference(result);
		assertType(resultObject, classPerson);

		assertEquals(1, resultObject.featureValues.size());
		FeatureValue firstFeatureValue = resultObject.featureValues.get(0);
		assertEquals(propertyName, firstFeatureValue.feature);
		assertEquals(1, firstFeatureValue.values.size());
		StringValue stringValue = (StringValue) firstFeatureValue.values.get(0);
		assertEquals("Philip", stringValue.value);
	}

	@Test
	public void testStringAndIntegerFunctions() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Parameter inParameter = ActivityFactory.createParameter("str",
				ParameterDirectionKind.in,
				executionContext.getPrimitiveStringType());
		Parameter outParameter = ActivityFactory.createParameter(
				"createdPerson", ParameterDirectionKind.return_,
				executionContext.getPrimitiveStringType());

		String alfCode = "return str + \"test\" + "
				+ "IntegerFunctions::ToString("
				+ "StringFunctions::Size(\"1\")" + ");";

		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior("createPerson");
		alfBehavior.ownedParameter.add(inParameter);
		alfBehavior.ownedParameter.add(outParameter);
		alfBehavior.body.add(alfCode);
		p.addPackagedElement(alfBehavior);

		ParameterValueList parameterValues = createParameterValue(inParameter,
				createValue("Philip"));

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				parameterValues);

		StringValue value = (StringValue) getFirstValue(output);
		assertEquals("Philiptest1", value.value);
	}
	
	@Test
	public void testCallingOperationOnObjects() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classGroup = ActivityFactory.createClass("Group");
		p.addPackagedElement(classGroup);

		Class_ classPerson = ActivityFactory.createClass("Person");
		Property propertyName = ActivityFactory.createProperty("name", 1, 1,
				executionContext.getPrimitiveStringType(), classPerson);
		p.addPackagedElement(classPerson);

		Parameter paramPerson4Behavior = ActivityFactory.createParameter("p",
				ParameterDirectionKind.in, classPerson);
		OpaqueBehavior behaviorAddPerson = createAlfOpaqueBehavior("p.name = \"lala\";", "setPersonName", classGroup, paramPerson4Behavior);
		((Operation)behaviorAddPerson.specification).upper = new UnlimitedNatural(1); 
				
		Parameter outParameter = ActivityFactory.createParameter(
				"createdPerson", ParameterDirectionKind.return_, classPerson);
		String alfCode = "p = new Person(); g = new Group(); "
				+ "g.setPersonName(p); return p;";
		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(alfCode, "createPersonInNewGroup", classGroup, outParameter);

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				new ParameterValueList());

		Value result = getFirstValue(output);
		assertTrue(result instanceof Reference);

		Object_ resultObject = resolveObjectReference(result);
		assertType(resultObject, classPerson);

		FeatureValue firstFeatureValue = resultObject.featureValues.get(0);
		assertEquals(propertyName, firstFeatureValue.feature);
		assertEquals(1, firstFeatureValue.values.size());
		StringValue stringValue = (StringValue) firstFeatureValue.values.get(0);
		assertEquals("lala", stringValue.value);
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

		Parameter paramPerson4Behavior = ActivityFactory.createParameter("p",
				ParameterDirectionKind.in, classPerson);
		OpaqueBehavior behaviorAddPerson = createAlfOpaqueBehavior("p.name = \"lala\";", "setPersonName", classGroup, paramPerson4Behavior);
		((Operation)behaviorAddPerson.specification).upper = new UnlimitedNatural(1); 
		
		Parameter paramPerson4CallOparationBehavior = ActivityFactory.createParameter("p",
				ParameterDirectionKind.in, classPerson);
		OpaqueBehavior behaviorCallOperation = createAlfOpaqueBehavior("setPersonName(p);", "callSetPersonName", classGroup, paramPerson4CallOparationBehavior);
		((Operation)behaviorCallOperation.specification).upper = new UnlimitedNatural(1); 
		
		Parameter outParameter = ActivityFactory.createParameter(
				"createdPerson", ParameterDirectionKind.return_, classPerson);
		String alfCode = "p = new Person(); g = new Group(); "
				+ "g.callSetPersonName(p); return p;";
		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(alfCode, "createPersonInNewGroup", classGroup, outParameter);

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				new ParameterValueList());

		Value result = getFirstValue(output);
		assertTrue(result instanceof Reference);

		Object_ resultObject = resolveObjectReference(result);
		assertType(resultObject, classPerson);

		FeatureValue firstFeatureValue = resultObject.featureValues.get(0);
		assertEquals(propertyName, firstFeatureValue.feature);
		assertEquals(1, firstFeatureValue.values.size());
		StringValue stringValue = (StringValue) firstFeatureValue.values.get(0);
		assertEquals("lala", stringValue.value);
	}	
	
	@Test
	public void testCallingOperationWithCast() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classPerson = ActivityFactory.createClass("Person");
		p.addPackagedElement(classPerson);

		Class_ classGroup = ActivityFactory.createClass("Group");
		Property propertyPersons = ActivityFactory.createProperty("persons", 0,
				-1, classPerson, classGroup);
		p.addPackagedElement(classGroup);

		Class_ classPersonWithName = ActivityFactory
				.createClass("PersonWithName");
		Property propertyName = ActivityFactory.createProperty("name", 1, 1,
				executionContext.getPrimitiveStringType(), classPersonWithName);
		Generalization generalization = new Generalization();
		generalization.general = classPerson;
		generalization.specific = classPersonWithName;
		classPersonWithName.addGeneralization(generalization);
		p.addPackagedElement(classPersonWithName);

		OpaqueBehavior behaviorSetPersonName = createAlfOpaqueBehavior(
				"this.name = \"lala\";", "setPersonName", classPersonWithName);
		((Operation) behaviorSetPersonName.specification).upper = new UnlimitedNatural(
				1);

		OpaqueBehavior behaviorCallOperation = createAlfOpaqueBehavior(
				"for(Person p : this.persons) {" +
						"PersonWithName pwn = (PersonWithName) p; " +
						"pwn.setPersonName();" +
				"}",
				"callSetPersonName", classGroup);

		Object_ objectGroup = new Object_();
		objectGroup.types.add(classGroup);
		objectGroup.createFeatureValues();
		executionContext.getLocus().add(objectGroup);

		Object_ objectPerson = new Object_();
		objectPerson.types.add(classPersonWithName);
		objectPerson.createFeatureValues();
		executionContext.getLocus().add(objectPerson);
		Reference reference = new Reference();
		reference.referent = objectPerson;
		ValueList valuesPerson = new ValueList();
		valuesPerson.add(reference);

		objectGroup.setFeatureValue(propertyPersons, valuesPerson, 0);

		executionContext.execute(behaviorCallOperation, objectGroup, null);

		FeatureValue nameFeatureValue = objectPerson
				.getFeatureValue(propertyName);
		assertEquals(1, nameFeatureValue.values.size());
		assertEquals("lala",
				((StringValue) nameFeatureValue.values.get(0)).value);
	}
	
	@Test
	public void testCallingOperationsInTwoForLoops() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classPerson = ActivityFactory.createClass("Person");
		Property propertyName = ActivityFactory.createProperty("name", 1, 1,
				executionContext.getPrimitiveStringType(), classPerson);
		p.addPackagedElement(classPerson);

		Class_ classGroup = ActivityFactory.createClass("Group");
		Property propertyLalaPersons = ActivityFactory.createProperty("lalapersons", 0,
				-1, classPerson, classGroup);
		Property propertyXyzPersons = ActivityFactory.createProperty("xyzpersons", 0,
				-1, classPerson, classGroup);
		p.addPackagedElement(classGroup);

		OpaqueBehavior behaviorSetLalaPersonName = createAlfOpaqueBehavior(
				"this.name = \"lala\";", "setLalaPersonName", classPerson);
		((Operation) behaviorSetLalaPersonName.specification).upper = new UnlimitedNatural(
				1);
		
		OpaqueBehavior behaviorSetXyzPersonName = createAlfOpaqueBehavior(
				"this.name = \"xyz\";", "setXyzPersonName", classPerson);		
		((Operation) behaviorSetXyzPersonName.specification).upper = new UnlimitedNatural(
				1);

		OpaqueBehavior behaviorCallOperation = createAlfOpaqueBehavior(
				"for(Person p : this.lalapersons) {" +
						"p.setLalaPersonName();" +
				"}" +
				"for(Person p : this.xyzpersons) {" +
					"p.setXyzPersonName();" +
				"}",
				"setPersonName", classGroup);

		Object_ objectGroup = new Object_();
		objectGroup.types.add(classGroup);
		objectGroup.createFeatureValues();
		executionContext.getLocus().add(objectGroup);

		Object_ objectLalaPerson = new Object_();
		objectLalaPerson.types.add(classPerson);
		objectLalaPerson.createFeatureValues();
		executionContext.getLocus().add(objectLalaPerson);
		Reference referenceLalaPerson = new Reference();
		referenceLalaPerson.referent = objectLalaPerson;
		ValueList valuesLalaPerson = new ValueList();
		valuesLalaPerson.add(referenceLalaPerson);

		objectGroup.setFeatureValue(propertyLalaPersons, valuesLalaPerson, 0);
		
		Object_ objectXyzPerson = new Object_();
		objectXyzPerson.types.add(classPerson);
		objectXyzPerson.createFeatureValues();
		executionContext.getLocus().add(objectXyzPerson);
		Reference referenceXyzPerson = new Reference();
		referenceXyzPerson.referent = objectXyzPerson;
		ValueList valuesXyzPerson = new ValueList();
		valuesXyzPerson.add(referenceXyzPerson);

		objectGroup.setFeatureValue(propertyXyzPersons, valuesXyzPerson, 0);

		executionContext.execute(behaviorCallOperation, objectGroup, null);

		FeatureValue nameFeatureValueLalaPerson = objectLalaPerson
				.getFeatureValue(propertyName);
		assertEquals(1, nameFeatureValueLalaPerson.values.size());
		assertEquals("lala",
				((StringValue) nameFeatureValueLalaPerson.values.get(0)).value);
		
		FeatureValue nameFeatureValueXyzPerson = objectXyzPerson
				.getFeatureValue(propertyName);
		assertEquals(1, nameFeatureValueXyzPerson.values.size());
		assertEquals("xyz",
				((StringValue) nameFeatureValueXyzPerson.values.get(0)).value);
	}

	@Test
	public void testSizeFunctionOnPropertyList() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classPerson = ActivityFactory.createClass("Person");
		Property propertyName = ActivityFactory.createProperty("names", 0, 2,
				executionContext.getPrimitiveStringType(), classPerson);
		classPerson.ownedMember.add(propertyName);
		classPerson.ownedAttribute.add(propertyName);
		p.addPackagedElement(classPerson);

		Parameter inParameter = ActivityFactory.createParameter("person",
				ParameterDirectionKind.in, classPerson);
		Parameter outParameter = ActivityFactory.createParameter("nameCount",
				ParameterDirectionKind.return_,
				executionContext.getPrimitiveIntegerType());

		String alfCode = "return person.names->size();";

		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(alfCode, "getNameCount", classPerson, inParameter, outParameter);

		Object_ personObject = new Object_();
		personObject.types.add(classPerson);
		FeatureValue personNames = new FeatureValue();
		personNames.feature = propertyName;
		StringValue value = new StringValue();
		value.value = "Philip";
		personNames.values.add(value);
		StringValue value2 = new StringValue();
		value2.value = "Philip2";
		personNames.values.add(value2);
		personObject.featureValues.add(personNames);

		ParameterValueList parameterValues = createParameterValue(inParameter,
				personObject);

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				parameterValues);

		ParameterValue outputParValue = output.get(0);
		IntegerValue outputValue = (IntegerValue) outputParValue.values.get(0);
		assertEquals(2, outputValue.value);
	}

	@Test
	public void testAtFunctionOnPropertyList() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classGroup = ActivityFactory.createClass("Group");
		p.addPackagedElement(classGroup);

		Class_ classPerson = ActivityFactory.createClass("Person");
		p.addPackagedElement(classPerson);

		Property propertyPersons = ActivityFactory.createProperty("persons", 0,
				10, classPerson, classGroup);
		classGroup.ownedMember.add(propertyPersons);
		classGroup.ownedAttribute.add(propertyPersons);

		Parameter inParameter = ActivityFactory.createParameter("group",
				ParameterDirectionKind.in, classGroup);
		Parameter outParameter = ActivityFactory.createParameter("firstPerson",
				ParameterDirectionKind.return_, classPerson);

		String alfCode = "return group.persons->at(2);";

		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(alfCode, "getFirstPerson", classGroup, inParameter, outParameter);

		Object_ groupObject = new Object_();
		groupObject.types.add(classGroup);
		Object_ personObject1 = new Object_();
		personObject1.types.add(classPerson);
		Object_ personObject2 = new Object_();
		personObject2.types.add(classPerson);

		FeatureValue persons = new FeatureValue();
		persons.feature = propertyPersons;
		persons.values.add(personObject1);
		persons.values.add(personObject2);
		groupObject.featureValues.add(persons);

		ParameterValueList parameterValues = createParameterValue(inParameter,
				groupObject);

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				parameterValues);

		Value result = getFirstValue(output);
		assertTrue(result instanceof Object_);

		Object_ resultObject = (Object_) result;
		assertEquals(personObject2, resultObject);
	}

	@Test
	public void testAddStringOnMultivaluedAttribute() {
		String[] alfCodes = new String[] {
				"p = new Person(); p.name->add(name); return p;",
				"p = new Person(); add(p.name, name); return p;" };

		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classPerson = ActivityFactory.createClass("Person");
		Property propertyName = ActivityFactory.createProperty("name", 0,
				4, executionContext.getPrimitiveStringType(), classPerson);
		p.addPackagedElement(classPerson);		
		
		for (String alfCode : alfCodes) {
			Parameter inParameter = ActivityFactory.createParameter("name",
					ParameterDirectionKind.in,
					executionContext.getPrimitiveStringType());
			Parameter outParameter = ActivityFactory.createParameter(
					"createdPerson", ParameterDirectionKind.return_,
					classPerson);
			
			OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(alfCode, "createPerson", classPerson, inParameter, outParameter);

			ParameterValueList parameterValues = createParameterValue(
					inParameter, createValue("Philip"));

			ParameterValueList output = executionContext.execute(alfBehavior,
					null, parameterValues);

			Value result = getFirstValue(output);
			assertTrue(result instanceof Reference);

			Object_ resultObject = resolveObjectReference(result);
			assertType(resultObject, classPerson);

			FeatureValue firstFeatureValue = resultObject.featureValues.get(0);
			assertEquals(propertyName, firstFeatureValue.feature);
			assertEquals(1, firstFeatureValue.values.size());
			StringValue stringValue = (StringValue) firstFeatureValue.values
					.get(0);
			assertEquals("Philip", stringValue.value);
		}
	}

	@Test
	public void testAddFunctionOnPropertyValue() {
		String[] alfCodes = new String[] {
				"g = new Group(); add(g.persons, new Person()); return g;",
				"g = new Group(); g.persons->add(new Person()); return g;" };

		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classGroup = ActivityFactory.createClass("Group");
		p.addPackagedElement(classGroup);

		Class_ classPerson = ActivityFactory.createClass("Person");
		p.addPackagedElement(classPerson);

		Property propertyPersons = ActivityFactory.createProperty(
				"persons", 0, 10, classPerson, classGroup);	

		for (String alfCode : alfCodes) {		
			Parameter outParameter = ActivityFactory.createParameter(
					"createdGroup", ParameterDirectionKind.return_, classGroup);
			
			OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(alfCode, "createGroupWithOnePerson", classGroup, outParameter);
			
			ParameterValueList output = executionContext.execute(alfBehavior,
					null, new ParameterValueList());

			Value result = getFirstValue(output);
			assertTrue(result instanceof Reference);

			Object_ resultObject = resolveObjectReference(result);
			assertType(resultObject, classGroup);

			FeatureValue firstFeatureValue = resultObject.featureValues.get(0);
			assertEquals(propertyPersons, firstFeatureValue.feature);

			assertEquals(1, firstFeatureValue.values.size());
			Value value = firstFeatureValue.values.get(0);
			Object_ personObject = resolveObjectReference(value);
			assertType(personObject, classPerson);
		}
	}
	
	@Test
	public void testNamespaceOfOpaqueBehavior() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classPerson = ActivityFactory.createClass("Person");
		p.addPackagedElement(classPerson);

		Parameter outParameter = ActivityFactory.createParameter(
				"createdPerson testNamespaceOfOpaqueBehavior", ParameterDirectionKind.return_,
				classPerson);
		
		String alfCode = "return new Person();";

		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(alfCode, "createPerson - namespace test", classPerson, outParameter);

		ParameterValueList output = executionContext.execute(alfBehavior, null,
				null);

		Value result = getFirstValue(output);
		assertTrue(result instanceof Reference);

		Object_ resultObject = resolveObjectReference(result);
		assertType(resultObject, classPerson);
	}
	
	@Test
	public void testThisWithCasting() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classPerson = ActivityFactory.createClass("Person");
		Property propertyName = ActivityFactory.createProperty("name", 1, 1,
				executionContext.getPrimitiveStringType(), classPerson);
		p.addPackagedElement(classPerson);

		Parameter inParameter = ActivityFactory.createParameter("name",
				ParameterDirectionKind.in,
				executionContext.getPrimitiveStringType());
		Parameter outParameter = ActivityFactory.createParameter(
				"createdPerson", ParameterDirectionKind.return_,
				classPerson);
		
		String alfCode = "((Person)this).name = name; return (Person)this;";

		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(alfCode, "initName - with casting", classPerson, inParameter, outParameter);

		ParameterValueList parameterValues = createParameterValue(inParameter,
				createValue("Philip"));
		
		Object_ object = new Object_();		
		object.types.add(classPerson);
		object.createFeatureValues();

		ParameterValueList output = executionContext.execute(alfBehavior, object,
				parameterValues);

		Value result = getFirstValue(output);
		assertTrue(result instanceof Reference);

		Object_ resultObject = resolveObjectReference(result);
		assertType(resultObject, classPerson);

		assertEquals(1, resultObject.featureValues.size());
		FeatureValue firstFeatureValue = resultObject.featureValues.get(0);
		assertEquals(propertyName, firstFeatureValue.feature);
		assertEquals(1, firstFeatureValue.values.size());
		StringValue stringValue = (StringValue) firstFeatureValue.values.get(0);
		assertEquals("Philip", stringValue.value);
	}
	
	@Test
	public void testThisWithoutCasting() {
		fUML.Syntax.Classes.Kernel.Package p = createPackage();

		Class_ classPerson = ActivityFactory.createClass("Person");
		Property propertyName = ActivityFactory.createProperty("name", 1, 1,
				executionContext.getPrimitiveStringType(), classPerson);
		p.addPackagedElement(classPerson);

		Parameter inParameter = ActivityFactory.createParameter("name",
				ParameterDirectionKind.in,
				executionContext.getPrimitiveStringType());
		Parameter outParameter = ActivityFactory.createParameter("person",
				ParameterDirectionKind.return_, classPerson);
				
		String alfCode = "this.name = name; return this;";
		
		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(alfCode, "initName - without casting", classPerson,
				inParameter, outParameter);

		ParameterValueList parameterValues = createParameterValue(inParameter,
				createValue("Philip"));

		Object_ object = new Object_();		
		object.types.add(classPerson);
		object.createFeatureValues();

		ParameterValueList output = executionContext.execute(alfBehavior,
				object, parameterValues);

		Value result = getFirstValue(output);
		assertTrue(result instanceof Reference);

		Object_ resultObject = resolveObjectReference(result);
		assertType(resultObject, classPerson);

		assertEquals(1, resultObject.featureValues.size());
		FeatureValue firstFeatureValue = resultObject.featureValues.get(0);
		assertEquals(propertyName, firstFeatureValue.feature);
		assertEquals(1, firstFeatureValue.values.size());
		StringValue stringValue = (StringValue) firstFeatureValue.values.get(0);
		assertEquals("Philip", stringValue.value);
	}

	// TODO add test for link creations
	// e.g., "g = new Group(); p = Person(); PersonsInGroup.createLink(p, g); return p;";

	private OpaqueBehavior createAlfOpaqueBehavior(String alfCode, String behaviorName,
			Class_ owningClass, Parameter... parameters) {
		OpaqueBehavior alfBehavior = createAlfOpaqueBehavior(behaviorName);
		for (Parameter parameter : parameters)
			alfBehavior.ownedParameter.add(parameter);
		alfBehavior.body.add(alfCode);
		owningClass.addOwnedBehavior(alfBehavior);

		ParameterList parameters_operation = new ParameterList();
		for (Parameter parameter : parameters) {
			Parameter operationParameter = ActivityFactory.createParameter(
					parameter.name, parameter.direction, parameter.type);
			parameters_operation.add(operationParameter);
		}

		Operation operation = ActivityFactory.createOperation(alfBehavior.name,
				parameters_operation, alfBehavior, owningClass);
		alfBehavior.specification = operation;
		return alfBehavior;
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
		intValue.type = executionContext.getPrimitiveIntegerType();
		intValue.value = integer;
		return intValue;
	}

	private StringValue createValue(String string) {
		StringValue value = new StringValue();
		value.type = executionContext.getPrimitiveStringType();
		value.value = string;
		return value;
	}

	private int getFirstParameterAsInteger(ParameterValueList output) {
		return ((IntegerValue) getFirstValue(output)).value;
	}

	private OpaqueBehavior createAlfOpaqueBehavior(String name) {
		OpaqueBehavior alfBehavior = new OpaqueBehavior();
		alfBehavior.setName(name);
		alfBehavior.language.add(ALF_LANGUAGE_NAME);
		return alfBehavior;
	}

	private ParameterValueList createParameterValue(Parameter parameter,
			Value value) {
		ParameterValue parameterValue = new ParameterValue();
		parameterValue.parameter = parameter;
		parameterValue.values.add(value);
		ParameterValueList parameterValues = new ParameterValueList();
		parameterValues.add(parameterValue);
		return parameterValues;
	}

	private void assertType(Object_ object, Class_ type) {
		assertTrue(object.types.contains(type));
	}

	private Value getFirstValue(ParameterValueList output) {
		return output.get(0).values.get(0);
	}

	private Object_ resolveObjectReference(Value referenceValue) {
		return (Object_) ((Reference) referenceValue).referent;
	}

	protected void debugPrint(ParameterValueList output) {
		for (ParameterValue parameterValue : output) {
			System.out.print(parameterValue.parameter.name);
			System.out.print("=");
			System.out.println(parameterValue.values);
		}
	}
}

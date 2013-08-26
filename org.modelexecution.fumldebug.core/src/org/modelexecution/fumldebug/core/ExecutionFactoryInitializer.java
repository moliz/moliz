/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fumldebug.core;

import java.util.HashMap;
import java.util.Map;

import org.modeldriven.fuml.library.booleanfunctions.BooleanAndFunctionBehaviorExecution;
import org.modeldriven.fuml.library.booleanfunctions.BooleanImpliesFunctionBehaviorExecution;
import org.modeldriven.fuml.library.booleanfunctions.BooleanNotFunctionBehaviorExecution;
import org.modeldriven.fuml.library.booleanfunctions.BooleanOrFunctionBehaviorExecution;
import org.modeldriven.fuml.library.booleanfunctions.BooleanToBooleanFunctionBehaviorExecution;
import org.modeldriven.fuml.library.booleanfunctions.BooleanToStringFunctionBehaviorExecution;
import org.modeldriven.fuml.library.booleanfunctions.BooleanXorFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerAbsFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerDivFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerGreaterThanEqualFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerGreaterThanFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerLessThanEqualFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerLessThanFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerMaxFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerMinFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerModFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerToIntegerFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerToStringFunctionBehaviorExecution;
import org.modeldriven.fuml.library.integerfunctions.IntegerToUnlimitedNaturalFunctionBehaviorExecution;
import org.modeldriven.fuml.library.listfunctions.ListConcatFunctionBehaviorExecution;
import org.modeldriven.fuml.library.listfunctions.ListGetFunctionBehaviorExecution;
import org.modeldriven.fuml.library.listfunctions.ListSizeFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealAbsFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealDivideFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealFloorFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealGreaterThanEqualFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealGreaterThanFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealInverseFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealLessThanEqualFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealLessThanFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealMaxFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealMinFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealMinusFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealNegateFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealPlusFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealRoundFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealTimesFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealToIntegerFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealToRealFunctionBehaviorExecution;
import org.modeldriven.fuml.library.realfunctions.RealToStringFunctionBehaviorExecution;
import org.modeldriven.fuml.library.stringfunctions.StringConcatFunctionBehaviorExecution;
import org.modeldriven.fuml.library.stringfunctions.StringSizeFunctionBehaviorExecution;
import org.modeldriven.fuml.library.stringfunctions.StringSubstringFunctionBehaviorExecution;
import org.modeldriven.fuml.library.unlimitednaturalfunctions.UnlimitedNaturalGreaterThanEqualFunctionBehaviorExecution;
import org.modeldriven.fuml.library.unlimitednaturalfunctions.UnlimitedNaturalGreaterThanFunctionBehaviorExecution;
import org.modeldriven.fuml.library.unlimitednaturalfunctions.UnlimitedNaturalLessThanEqualFunctionBehaviorExecution;
import org.modeldriven.fuml.library.unlimitednaturalfunctions.UnlimitedNaturalLessThanFunctionBehaviorExecution;
import org.modeldriven.fuml.library.unlimitednaturalfunctions.UnlimitedNaturalMaxFunctionBehaviorExecution;
import org.modeldriven.fuml.library.unlimitednaturalfunctions.UnlimitedNaturalMinFunctionBehaviorExecution;
import org.modeldriven.fuml.library.unlimitednaturalfunctions.UnlimitedNaturalToIntegerFunctionBehaviorExecution;
import org.modeldriven.fuml.library.unlimitednaturalfunctions.UnlimitedNaturalToStringFunctionBehaviorExecution;
import org.modeldriven.fuml.library.unlimitednaturalfunctions.UnlimitedNaturalToUnlimitedNaturalFunctionBehaviorExecution;
import org.modeldriven.fuml.repository.Classifier;
import org.modeldriven.fuml.repository.Repository;

import fUML.Library.IntegerFunctionImplementation.IntegerDivideFunctionBehaviorExecution;
import fUML.Library.IntegerFunctionImplementation.IntegerMinusFunctionBehaviorExecution;
import fUML.Library.IntegerFunctionImplementation.IntegerNegateFunctionBehaviorExecution;
import fUML.Library.IntegerFunctionImplementation.IntegerPlusFunctionBehaviorExecution;
import fUML.Library.IntegerFunctionImplementation.IntegerTimesFunctionBehaviorExecution;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;
import fUML.Semantics.Loci.LociL1.ExecutionFactory;
import fUML.Syntax.Classes.Kernel.PrimitiveType;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior;

public class ExecutionFactoryInitializer {

	private static final String[] PRIMITIVE_TYPES = new String[] { "Boolean",
			"String", "Integer", "Real", "UnlimitedNatural" };

	private static final Map<String, OpaqueBehaviorExecution> PRIMITIVE_BEHAVIOR_MAP = new HashMap<String, OpaqueBehaviorExecution>();
	static {
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.Div",
						new IntegerDivFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions./",
						new IntegerDivideFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.*",
						new IntegerTimesFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.-",
						new IntegerMinusFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.+",
						new IntegerPlusFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.Neg",
						new IntegerNegateFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.Max",
						new IntegerMaxFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.Min",
						new IntegerMinFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.Mod",
						new IntegerModFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.Abs",
						new IntegerAbsFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.ToInteger",
						new IntegerToIntegerFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.ToString",
						new IntegerToStringFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.ToUnlimitedNatural",
						new IntegerToUnlimitedNaturalFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.<",
						new IntegerLessThanFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.<=",
						new IntegerLessThanEqualFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.>",
						new IntegerGreaterThanFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.IntegerFunctions.>=",
						new IntegerGreaterThanEqualFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP.put(
				"FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions./",
				new RealDivideFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP.put(
				"FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.*",
				new RealTimesFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP.put(
				"FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.-",
				new RealMinusFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP.put(
				"FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.+",
				new RealPlusFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.Neg",
						new RealNegateFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.Inv",
						new RealInverseFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.Max",
						new RealMaxFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.Min",
						new RealMinFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.Floor",
						new RealFloorFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.Round",
						new RealRoundFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.Abs",
						new RealAbsFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.ToReal",
						new RealToRealFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.ToString",
						new RealToStringFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.ToInteger",
						new RealToIntegerFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP.put(
				"FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.<",
				new RealLessThanFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP.put(
				"FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.<=",
				new RealLessThanEqualFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP.put(
				"FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.>",
				new RealGreaterThanFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP.put(
				"FoundationalModelLibrary.PrimitiveBehaviors.RealFunctions.>=",
				new RealGreaterThanEqualFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.BooleanFunctions.ToBoolean",
						new BooleanToBooleanFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.BooleanFunctions.ToString",
						new BooleanToStringFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.BooleanFunctions.Or",
						new BooleanOrFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.BooleanFunctions.Xor",
						new BooleanXorFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.BooleanFunctions.And",
						new BooleanAndFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.BooleanFunctions.Not",
						new BooleanNotFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.BooleanFunctions.Implies",
						new BooleanImpliesFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.StringFunctions.Size",
						new StringSizeFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.StringFunctions.Concat",
						new StringConcatFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.StringFunctions.Substring",
						new StringSubstringFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.UnlimitedNaturalFunctions.<",
						new UnlimitedNaturalLessThanFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.UnlimitedNaturalFunctions.<=",
						new UnlimitedNaturalLessThanEqualFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.UnlimitedNaturalFunctions.Max",
						new UnlimitedNaturalMaxFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.UnlimitedNaturalFunctions.Min",
						new UnlimitedNaturalMinFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.UnlimitedNaturalFunctions.>",
						new UnlimitedNaturalGreaterThanFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.UnlimitedNaturalFunctions.>=",
						new UnlimitedNaturalGreaterThanEqualFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.UnlimitedNaturalFunctions.ToUnlimitedNatural",
						new UnlimitedNaturalToUnlimitedNaturalFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.UnlimitedNaturalFunctions.ToString",
						new UnlimitedNaturalToStringFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.UnlimitedNaturalFunctions.ToInteger",
						new UnlimitedNaturalToIntegerFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.ListFunctions.ListGet",
						new ListGetFunctionBehaviorExecution());
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.ListFunctions.ListSize",
						new ListSizeFunctionBehaviorExecution());
		// TODO ListConcat will not be found in repository?
		PRIMITIVE_BEHAVIOR_MAP
				.put("FoundationalModelLibrary.PrimitiveBehaviors.ListFunctions.ListConcat",
						new ListConcatFunctionBehaviorExecution());
	}

	private final Repository repository;
	private final ExecutionFactory executionFactory;

	public ExecutionFactoryInitializer(ExecutionFactory executionFactory,
			Repository repository) {
		this.executionFactory = executionFactory;
		this.repository = repository;
	}

	public void addBuiltInTypes() {
		for (String primitiveType : PRIMITIVE_TYPES) {
			addBuiltInType(primitiveType);
		}
	}

	private void addBuiltInType(String primitiveType) {
		PrimitiveType type = (PrimitiveType) Repository.INSTANCE
				.getClassifierByName(primitiveType).getDelegate();
		executionFactory.addBuiltInType(type);
	}

	public void addPrimitiveBehaviorExecutions() {
		for (String qualifiedName : PRIMITIVE_BEHAVIOR_MAP.keySet()) {
			addPrimitiveBehaviorExecution(qualifiedName,
					PRIMITIVE_BEHAVIOR_MAP.get(qualifiedName));
		}
	}

	private void addPrimitiveBehaviorExecution(String qualifiedName,
			OpaqueBehaviorExecution execution) {
		Classifier classifier = repository.findClassifier(qualifiedName);
		if (classifier != null) {
			Behavior behavior = (Behavior) classifier.getDelegate();
			execution.types.add(behavior);
			executionFactory.addPrimitiveBehaviorPrototype(execution);
		}
	}
}

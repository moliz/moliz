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

import java.io.ByteArrayInputStream;
import java.util.Collection;

import org.modeldriven.alf.fuml.impl.execution.Locus;
import org.modeldriven.alf.fuml.mapping.FumlMapping;
import org.modeldriven.alf.fuml.mapping.FumlMappingFactory;
import org.modeldriven.alf.fuml.mapping.common.ElementReferenceMapping;
import org.modeldriven.alf.fuml.mapping.units.ClassifierDefinitionMapping;
import org.modeldriven.alf.mapping.MappingError;
import org.modeldriven.alf.parser.ParseException;
import org.modeldriven.alf.parser.Parser;
import org.modeldriven.alf.syntax.common.ElementReference;
import org.modeldriven.alf.syntax.expressions.QualifiedName;
import org.modeldriven.alf.syntax.units.ActivityDefinition;
import org.modeldriven.alf.syntax.units.RootNamespace;
import org.modeldriven.alf.syntax.units.impl.ModelNamespaceImpl;
import org.modeldriven.alf.uml.Class_;
import org.modeldriven.alf.uml.Classifier;
import org.modeldriven.alf.uml.Element;
import org.modeldriven.alf.uml.ElementFactory;
import org.modeldriven.fuml.library.channel.StandardInputChannelObject;
import org.modeldriven.fuml.library.channel.StandardOutputChannelObject;
import org.modeldriven.fuml.library.libraryclass.ImplementationObject;

import fUML.Semantics.Classes.Kernel.Value;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.Execution;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.Classes.Kernel.Parameter;
import fUML.Syntax.Classes.Kernel.ParameterDirectionKind;
import fUML.Syntax.Classes.Kernel.ParameterList;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public class ALFBehaviorExecution extends OpaqueBehaviorExecution {

	private OpaqueBehavior behavior;
	private Parser parser;
	private Locus alfLocus;

	public ALFBehaviorExecution(OpaqueBehavior behavior) {
		this.behavior = behavior;
		this.parser = new Parser(new ByteArrayInputStream(getBehaviorBody()));
	}

	// TODO how can we link referenced types that are specified in fUML (not
	// alf); this might probably be done using a dedicated
	// ModelNamespaceImpl that overwrites all the resolve methods.
	@Override
	public void doBody(ParameterValueList inputParameters,
			ParameterValueList outputParameters) {
		try {
			// new RootNamespaceImpl().setIsVerbose(true);
			// RootNamespace root = RootNamespace.getRootScope();
			// ((RootNamespaceImpl) root.getImpl()).getModelScopeImpl();

			RootNamespace.setRootImpl(new ModelNamespaceImpl(RootNamespace
					.getRootScope()));
			ActivityDefinition activityDefinition = parser.ActivityDefinition();
			activityDefinition.setNamespace(RootNamespace.getRootScope());
			// unit.getImpl().addImplicitImports();
			// unit.getImpl().resolveStub();
			activityDefinition.getImpl().deriveAll();
			// activityDefinition.print(true);

			alfLocus = createALFLocus();
			//FumlMapping.setExecutionFactory(alfLocus.getFactory());
			FumlMapping.setFumlFactory(createFumlFactory());
			FumlMapping.setElementFactory(createElementFactory());
			// FumlMapping mapping = FumlMapping.getMapping(RootNamespace
			// .getRootScope());
			FumlMapping mapping = FumlMapping.getMapping(activityDefinition);
			Collection<Element> modelElements = mapping.getModelElements();
			FumlMapping elementMapping = (FumlMapping) activityDefinition
					.getImpl().getMapping();
			Element element = elementMapping.getElement();

			Activity activity = (Activity) ((org.modeldriven.alf.fuml.impl.uml.Activity) element)
					.getBase();

			Execution activityExecution = locus.factory.createExecution(
					activity, context);

			for (ParameterValue value : inputParameters) {
				ParameterValue newValue = value.copy();
				newValue.parameter = getParameterByName(value.parameter.name,
						activity.ownedParameter);
				activityExecution.setParameterValue(newValue);
			}

			for (ParameterValue value : outputParameters) {
				ParameterValue newValue = value.copy();
				newValue.parameter = getParameterByName(value.parameter.name,
						activity.ownedParameter);
				if (newValue.parameter == null
						&& value.parameter.direction
								.equals(ParameterDirectionKind.return_)) {
					newValue.parameter = getReturnParamter(activity.ownedParameter);
				}
				activityExecution.setParameterValue(newValue);
			}

			createSystemServices();

			activityExecution.execute();

			for (ParameterValue value : parameterValues) {
				System.out.println(value.parameter.name + "=" + value.values);
				System.out.println(value.parameter.name
						+ "="
						+ activityExecution
								.getParameterValue(getParameterByName(
										value.parameter.name,
										activity.ownedParameter)).values);
			}

		} catch (ParseException e) {
			// TODO implement proper error handling
			e.printStackTrace();
		} catch (MappingError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private org.modeldriven.alf.fuml.impl.execution.Locus createALFLocus() {
		return new org.modeldriven.alf.fuml.impl.execution.Locus(locus);
	}

	private FumlMappingFactory createFumlFactory() {
		return new FumlMappingFactory();
	}

	private ElementFactory createElementFactory() {
		return new org.modeldriven.alf.fuml.impl.uml.ElementFactory();
	}

	private byte[] getBehaviorBody() {
		StringBuffer buffer = new StringBuffer();
		for (String string : behavior.body) {
			buffer.append(string);
		}
		return buffer.toString().getBytes();
	}

	private Parameter getParameterByName(String name,
			ParameterList ownedParameter) {
		for (Parameter parameter : ownedParameter) {
			if (name.equals(parameter.name))
				return parameter;
		}
		return null;
	}

	private Parameter getReturnParamter(ParameterList ownedParameter) {
		for (Parameter parameter : ownedParameter) {
			if (ParameterDirectionKind.return_.equals(parameter.direction))
				return parameter;
		}
		return null;
	}

	protected void createSystemServices() {
		QualifiedName standardOutputChannel = RootNamespace
				.getBasicInputOutput().getImpl().copy()
				.addName("StandardOutputChannel");
		this.createSystemService(standardOutputChannel,
				new StandardOutputChannelObject());

		QualifiedName standardInputChannel = RootNamespace
				.getBasicInputOutput().getImpl().copy()
				.addName("StandardInputChannel");
		this.createSystemService(standardInputChannel,
				new StandardInputChannelObject());
	}

	private void createSystemService(QualifiedName name,
			ImplementationObject object) {
		Classifier type = getClassifier(name);
		if (type instanceof Class_) {
			fUML.Syntax.Classes.Kernel.Class_ class_ = ((org.modeldriven.alf.fuml.impl.uml.Class_) type)
					.getBase();
			object.types.addValue(class_);
		} else if (type instanceof fUML.Syntax.Classes.Kernel.Class_) {
			fUML.Syntax.Classes.Kernel.Class_ class_ = (fUML.Syntax.Classes.Kernel.Class_) type;
			object.types.addValue(class_);
		}
		alfLocus.add(object);
	}

	private static Classifier getClassifier(QualifiedName name) {
		Classifier classifier = null;
		ElementReference referent = name.getImpl().getClassifierReferent();
		FumlMapping mapping = FumlMapping.getMapping(referent);
		if (mapping instanceof ElementReferenceMapping) {
			mapping = ((ElementReferenceMapping) mapping).getMapping();
		}
		if (mapping instanceof ClassifierDefinitionMapping) {
			try {
				classifier = ((ClassifierDefinitionMapping) mapping)
						.getClassifier();
			} catch (MappingError e) {
				System.out.println("Cannot map " + name.getPathName());
				System.out.println(" error: " + e.getMessage());
			}
		}
		// TODO obtain classifier from fUML model (not ALF only)
		return classifier;
	}

	@Override
	public Value new_() {
		return new ALFBehaviorExecution(behavior);
	}

	public OpaqueBehavior getBehavior() {
		return behavior;
	}

}

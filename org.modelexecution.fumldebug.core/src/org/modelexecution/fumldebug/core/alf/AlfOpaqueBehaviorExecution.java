package org.modelexecution.fumldebug.core.alf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.modeldriven.alf.fuml.mapping.FumlMapping;
import org.modeldriven.alf.syntax.units.UnitDefinition;

import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.Classes.Kernel.Element;
import fUML.Syntax.Classes.Kernel.Parameter;
import fUML.Syntax.Classes.Kernel.ParameterDirectionKind;
import fUML.Syntax.Classes.Kernel.ParameterList;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public class AlfOpaqueBehaviorExecution extends
		org.modeldriven.alf.fuml.impl.environment.AlfOpaqueBehaviorExecution {
	
	protected org.modeldriven.alf.fuml.impl.units.RootNamespaceImpl createRootNamespace() {
		return new RootNamespaceImpl();
	}
	
	public void addPathMapping(String fromPath, String toPath) {
		if (getRootScopeImpl() instanceof RootNamespaceImpl)
			((RootNamespaceImpl)getRootScopeImpl()).addPathMapping(fromPath, toPath);
	}
	
	public void removePathMapping(String path) {
		if (getRootScopeImpl() instanceof RootNamespaceImpl)
			((RootNamespaceImpl)getRootScopeImpl()).removePathMapping(path);
	}
	
	@Override
	public Element compile(Behavior behavior, String textualRepresentation) { // TODO should not be overridden --> adjust build process 
		try {
			UnitDefinition unit = parse(behavior, textualRepresentation);
			Collection<org.modeldriven.alf.uml.Element> otherElements = new ArrayList<org.modeldriven.alf.uml.Element>();
			FumlMapping mapping = map(unit.getDefinition(), otherElements);

			// NOTE: The fUML Reference Implementation does not require that
			// the otherElements actually be owned within the in-memory model
			// representation.

			return (Element) ((org.modeldriven.alf.fuml.impl.uml.Element) mapping
					.getElement()).getBase();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void doBody(ParameterValueList inputParameters,
			ParameterValueList outputParameters) { // TODO should not be overridden --> adjust build process
		OpaqueBehavior behavior = (OpaqueBehavior) this.getBehavior();
		List<String> bodies = behavior.body;
		List<String> languages = behavior.language;
		for (int i = 0; i < languages.size(); i++) {
			if (languages.get(i).equals(ALF_LANGUAGE_NAME)) {
				Element element = compile(behavior, bodies.get(i));
				if (element instanceof Activity) {
					this.execute((Activity) element, inputParameters,
							outputParameters);
				}
			}
		}
	}
	
	private void execute(Activity activity, ParameterValueList inputParameters,
			ParameterValueList outputParameters) { // TODO should not be overridden --> adjust build process
		ParameterValueList inputs = new ParameterValueList();
		ParameterList parameters = activity.ownedParameter;
		int i = 0;
		for (Parameter parameter : parameters) {
			if (i >= inputParameters.size()) {
				break;
			} else if (parameter.direction == ParameterDirectionKind.in
					|| parameter.direction == ParameterDirectionKind.inout) {
				ParameterValue parameterValue = new ParameterValue();
				parameterValue.parameter = parameter;
				parameterValue.values = inputParameters.get(i).values;
				inputs.add(parameterValue);
				i++;
			}
		}

		ParameterValueList outputs = this.locus.executor.execute(activity,
				this.context, inputs);
		for (int j = 0; j < outputParameters.size() && j < outputs.size(); j++) {
			outputParameters.get(j).values = outputs.get(j).values;
		}
	}
}

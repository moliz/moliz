package org.modelexecution.fumldebug.core.alf;

import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;

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
	public void doBody(ParameterValueList inputParameters,
			ParameterValueList outputParameters) {
		super.doBody(inputParameters, outputParameters);
	}
	
}

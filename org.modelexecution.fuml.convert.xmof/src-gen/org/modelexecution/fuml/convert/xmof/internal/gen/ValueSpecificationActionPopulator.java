/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package org.modelexecution.fuml.convert.xmof.internal.gen;
    	
import javax.annotation.Generated;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;
import org.modelexecution.fuml.convert.xmof.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.xmof.gen.ElementPopulatorGenerator.xtend")
public class ValueSpecificationActionPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.emf.ecore.EModelElement element, ConversionResultImpl result) {
			
		if (!(element instanceof org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ValueSpecificationAction) ||
			!(fumlElement instanceof fUML.Syntax.Actions.IntermediateActions.ValueSpecificationAction)) {
			return;
		}
		
		fUML.Syntax.Actions.IntermediateActions.ValueSpecificationAction fumlNamedElement = (fUML.Syntax.Actions.IntermediateActions.ValueSpecificationAction) fumlElement;
		org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ValueSpecificationAction xmofElement = (org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ValueSpecificationAction) element;
		
		fumlNamedElement.value = (fUML.Syntax.Classes.Kernel.ValueSpecification) result
							.getFUMLElement(xmofElement.getValue());
		fumlNamedElement.result = (fUML.Syntax.Actions.BasicActions.OutputPin) result
							.getFUMLElement(xmofElement.getResult());
		
	}
	
}
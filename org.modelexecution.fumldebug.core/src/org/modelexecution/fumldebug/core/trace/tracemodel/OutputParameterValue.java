/**
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fumldebug.core.trace.tracemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fumldebug.core.trace.tracemodel.OutputParameterValue#getValueSnapshot <em>Value Snapshot</em>}</li>
 *   <li>{@link org.modelexecution.fumldebug.core.trace.tracemodel.OutputParameterValue#getValueInstance <em>Value Instance</em>}</li>
 *   <li>{@link org.modelexecution.fumldebug.core.trace.tracemodel.OutputParameterValue#getParameterOutputObjectToken <em>Parameter Output Object Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fumldebug.core.trace.tracemodel.TracemodelPackage#getOutputParameterValue()
 * @model
 * @generated
 */
public interface OutputParameterValue extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012 Vienna University of Technology.\r\nAll rights reserved. This program and the accompanying materials are made \r\navailable under the terms of the Eclipse Public License v1.0 which accompanies \r\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\nTanja Mayerhofer - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Value Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Snapshot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Snapshot</em>' reference.
	 * @see #setValueSnapshot(ValueSnapshot)
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.TracemodelPackage#getOutputParameterValue_ValueSnapshot()
	 * @model required="true"
	 * @generated
	 */
	ValueSnapshot getValueSnapshot();

	/**
	 * Sets the value of the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.OutputParameterValue#getValueSnapshot <em>Value Snapshot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Snapshot</em>' reference.
	 * @see #getValueSnapshot()
	 * @generated
	 */
	void setValueSnapshot(ValueSnapshot value);

	/**
	 * Returns the value of the '<em><b>Value Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Instance</em>' reference.
	 * @see #setValueInstance(ValueInstance)
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.TracemodelPackage#getOutputParameterValue_ValueInstance()
	 * @model required="true"
	 * @generated
	 */
	ValueInstance getValueInstance();

	/**
	 * Sets the value of the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.OutputParameterValue#getValueInstance <em>Value Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Instance</em>' reference.
	 * @see #getValueInstance()
	 * @generated
	 */
	void setValueInstance(ValueInstance value);

	/**
	 * Returns the value of the '<em><b>Parameter Output Object Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Output Object Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Output Object Token</em>' reference.
	 * @see #setParameterOutputObjectToken(ObjectTokenInstance)
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.TracemodelPackage#getOutputParameterValue_ParameterOutputObjectToken()
	 * @model required="true"
	 * @generated
	 */
	ObjectTokenInstance getParameterOutputObjectToken();

	/**
	 * Sets the value of the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.OutputParameterValue#getParameterOutputObjectToken <em>Parameter Output Object Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Output Object Token</em>' reference.
	 * @see #getParameterOutputObjectToken()
	 * @generated
	 */
	void setParameterOutputObjectToken(ObjectTokenInstance value);

} // OutputParameterValue

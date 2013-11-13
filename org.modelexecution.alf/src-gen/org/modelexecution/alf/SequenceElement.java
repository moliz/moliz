/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.SequenceElement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.modelexecution.alf.SequenceElement#getSequenceInitializationExpression <em>Sequence Initialization Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getSequenceElement()
 * @model
 * @generated
 */
public interface SequenceElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.modelexecution.alf.AlfPackage#getSequenceElement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.SequenceElement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Sequence Initialization Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Initialization Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Initialization Expression</em>' containment reference.
   * @see #setSequenceInitializationExpression(SequenceInitializationExpression)
   * @see org.modelexecution.alf.AlfPackage#getSequenceElement_SequenceInitializationExpression()
   * @model containment="true"
   * @generated
   */
  SequenceInitializationExpression getSequenceInitializationExpression();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.SequenceElement#getSequenceInitializationExpression <em>Sequence Initialization Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence Initialization Expression</em>' containment reference.
   * @see #getSequenceInitializationExpression()
   * @generated
   */
  void setSequenceInitializationExpression(SequenceInitializationExpression value);

} // SequenceElement

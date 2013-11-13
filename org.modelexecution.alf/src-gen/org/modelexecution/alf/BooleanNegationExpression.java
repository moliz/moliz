/**
 */
package org.modelexecution.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Negation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.BooleanNegationExpression#getUnaryExpression <em>Unary Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getBooleanNegationExpression()
 * @model
 * @generated
 */
public interface BooleanNegationExpression extends NonPostfixNonCastUnaryExpression, CastCompletion
{
  /**
   * Returns the value of the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Expression</em>' containment reference.
   * @see #setUnaryExpression(UnaryExpression)
   * @see org.modelexecution.alf.AlfPackage#getBooleanNegationExpression_UnaryExpression()
   * @model containment="true"
   * @generated
   */
  UnaryExpression getUnaryExpression();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.BooleanNegationExpression#getUnaryExpression <em>Unary Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Expression</em>' containment reference.
   * @see #getUnaryExpression()
   * @generated
   */
  void setUnaryExpression(UnaryExpression value);

} // BooleanNegationExpression

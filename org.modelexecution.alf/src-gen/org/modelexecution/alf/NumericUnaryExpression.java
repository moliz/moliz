/**
 */
package org.modelexecution.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.NumericUnaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.modelexecution.alf.NumericUnaryExpression#getUnaryExpression <em>Unary Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getNumericUnaryExpression()
 * @model
 * @generated
 */
public interface NumericUnaryExpression extends NonPostfixNonCastUnaryExpression
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.modelexecution.alf.NumericUnaryOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.modelexecution.alf.NumericUnaryOperator
   * @see #setOperator(NumericUnaryOperator)
   * @see org.modelexecution.alf.AlfPackage#getNumericUnaryExpression_Operator()
   * @model
   * @generated
   */
  NumericUnaryOperator getOperator();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.NumericUnaryExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.modelexecution.alf.NumericUnaryOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(NumericUnaryOperator value);

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
   * @see org.modelexecution.alf.AlfPackage#getNumericUnaryExpression_UnaryExpression()
   * @model containment="true"
   * @generated
   */
  UnaryExpression getUnaryExpression();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.NumericUnaryExpression#getUnaryExpression <em>Unary Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Expression</em>' containment reference.
   * @see #getUnaryExpression()
   * @generated
   */
  void setUnaryExpression(UnaryExpression value);

} // NumericUnaryExpression

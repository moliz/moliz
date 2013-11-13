/**
 */
package org.modelexecution.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.PrefixExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.modelexecution.alf.PrefixExpression#getPrimaryExpression <em>Primary Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getPrefixExpression()
 * @model
 * @generated
 */
public interface PrefixExpression extends NonPostfixNonCastUnaryExpression
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.modelexecution.alf.AffixOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.modelexecution.alf.AffixOperator
   * @see #setOperator(AffixOperator)
   * @see org.modelexecution.alf.AlfPackage#getPrefixExpression_Operator()
   * @model
   * @generated
   */
  AffixOperator getOperator();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.PrefixExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.modelexecution.alf.AffixOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(AffixOperator value);

  /**
   * Returns the value of the '<em><b>Primary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Expression</em>' containment reference.
   * @see #setPrimaryExpression(PrimaryExpression)
   * @see org.modelexecution.alf.AlfPackage#getPrefixExpression_PrimaryExpression()
   * @model containment="true"
   * @generated
   */
  PrimaryExpression getPrimaryExpression();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.PrefixExpression#getPrimaryExpression <em>Primary Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Expression</em>' containment reference.
   * @see #getPrimaryExpression()
   * @generated
   */
  void setPrimaryExpression(PrimaryExpression value);

} // PrefixExpression

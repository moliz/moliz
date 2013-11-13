/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.AdditiveExpression#getUnaryExpression <em>Unary Expression</em>}</li>
 *   <li>{@link org.modelexecution.alf.AdditiveExpression#getAdditiveExpressionCompletion <em>Additive Expression Completion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getAdditiveExpression()
 * @model
 * @generated
 */
public interface AdditiveExpression extends EObject
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
   * @see org.modelexecution.alf.AlfPackage#getAdditiveExpression_UnaryExpression()
   * @model containment="true"
   * @generated
   */
  UnaryExpression getUnaryExpression();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.AdditiveExpression#getUnaryExpression <em>Unary Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Expression</em>' containment reference.
   * @see #getUnaryExpression()
   * @generated
   */
  void setUnaryExpression(UnaryExpression value);

  /**
   * Returns the value of the '<em><b>Additive Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additive Expression Completion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additive Expression Completion</em>' containment reference.
   * @see #setAdditiveExpressionCompletion(AdditiveExpressionCompletion)
   * @see org.modelexecution.alf.AlfPackage#getAdditiveExpression_AdditiveExpressionCompletion()
   * @model containment="true"
   * @generated
   */
  AdditiveExpressionCompletion getAdditiveExpressionCompletion();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.AdditiveExpression#getAdditiveExpressionCompletion <em>Additive Expression Completion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Additive Expression Completion</em>' containment reference.
   * @see #getAdditiveExpressionCompletion()
   * @generated
   */
  void setAdditiveExpressionCompletion(AdditiveExpressionCompletion value);

} // AdditiveExpression

/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expression Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.MultiplicativeExpressionCompletion#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.modelexecution.alf.MultiplicativeExpressionCompletion#getUnaryExpression <em>Unary Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getMultiplicativeExpressionCompletion()
 * @model
 * @generated
 */
public interface MultiplicativeExpressionCompletion extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link org.modelexecution.alf.MultiplicativeOperator}.
   * The literals are from the enumeration {@link org.modelexecution.alf.MultiplicativeOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see org.modelexecution.alf.MultiplicativeOperator
   * @see org.modelexecution.alf.AlfPackage#getMultiplicativeExpressionCompletion_Operator()
   * @model unique="false"
   * @generated
   */
  EList<MultiplicativeOperator> getOperator();

  /**
   * Returns the value of the '<em><b>Unary Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.UnaryExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Expression</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getMultiplicativeExpressionCompletion_UnaryExpression()
   * @model containment="true"
   * @generated
   */
  EList<UnaryExpression> getUnaryExpression();

} // MultiplicativeExpressionCompletion

/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Expression Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.RelationalExpressionCompletion#getShiftExpressionCompletion <em>Shift Expression Completion</em>}</li>
 *   <li>{@link org.modelexecution.alf.RelationalExpressionCompletion#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link org.modelexecution.alf.RelationalExpressionCompletion#getShiftExpression <em>Shift Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getRelationalExpressionCompletion()
 * @model
 * @generated
 */
public interface RelationalExpressionCompletion extends EObject
{
  /**
   * Returns the value of the '<em><b>Shift Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shift Expression Completion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift Expression Completion</em>' containment reference.
   * @see #setShiftExpressionCompletion(ShiftExpressionCompletion)
   * @see org.modelexecution.alf.AlfPackage#getRelationalExpressionCompletion_ShiftExpressionCompletion()
   * @model containment="true"
   * @generated
   */
  ShiftExpressionCompletion getShiftExpressionCompletion();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.RelationalExpressionCompletion#getShiftExpressionCompletion <em>Shift Expression Completion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift Expression Completion</em>' containment reference.
   * @see #getShiftExpressionCompletion()
   * @generated
   */
  void setShiftExpressionCompletion(ShiftExpressionCompletion value);

  /**
   * Returns the value of the '<em><b>Relational Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.modelexecution.alf.RelationalOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relational Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational Operator</em>' attribute.
   * @see org.modelexecution.alf.RelationalOperator
   * @see #setRelationalOperator(RelationalOperator)
   * @see org.modelexecution.alf.AlfPackage#getRelationalExpressionCompletion_RelationalOperator()
   * @model
   * @generated
   */
  RelationalOperator getRelationalOperator();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.RelationalExpressionCompletion#getRelationalOperator <em>Relational Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relational Operator</em>' attribute.
   * @see org.modelexecution.alf.RelationalOperator
   * @see #getRelationalOperator()
   * @generated
   */
  void setRelationalOperator(RelationalOperator value);

  /**
   * Returns the value of the '<em><b>Shift Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shift Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift Expression</em>' containment reference.
   * @see #setShiftExpression(ShiftExpression)
   * @see org.modelexecution.alf.AlfPackage#getRelationalExpressionCompletion_ShiftExpression()
   * @model containment="true"
   * @generated
   */
  ShiftExpression getShiftExpression();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.RelationalExpressionCompletion#getShiftExpression <em>Shift Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift Expression</em>' containment reference.
   * @see #getShiftExpression()
   * @generated
   */
  void setShiftExpression(ShiftExpression value);

} // RelationalExpressionCompletion

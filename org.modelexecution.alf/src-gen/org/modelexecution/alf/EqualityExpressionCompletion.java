/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Expression Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.EqualityExpressionCompletion#getClassificationExpressionCompletion <em>Classification Expression Completion</em>}</li>
 *   <li>{@link org.modelexecution.alf.EqualityExpressionCompletion#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.modelexecution.alf.EqualityExpressionCompletion#getClassificationExpression <em>Classification Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getEqualityExpressionCompletion()
 * @model
 * @generated
 */
public interface EqualityExpressionCompletion extends EObject
{
  /**
   * Returns the value of the '<em><b>Classification Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classification Expression Completion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classification Expression Completion</em>' containment reference.
   * @see #setClassificationExpressionCompletion(ClassificationExpressionCompletion)
   * @see org.modelexecution.alf.AlfPackage#getEqualityExpressionCompletion_ClassificationExpressionCompletion()
   * @model containment="true"
   * @generated
   */
  ClassificationExpressionCompletion getClassificationExpressionCompletion();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.EqualityExpressionCompletion#getClassificationExpressionCompletion <em>Classification Expression Completion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classification Expression Completion</em>' containment reference.
   * @see #getClassificationExpressionCompletion()
   * @generated
   */
  void setClassificationExpressionCompletion(ClassificationExpressionCompletion value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link org.modelexecution.alf.EqualityOperator}.
   * The literals are from the enumeration {@link org.modelexecution.alf.EqualityOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see org.modelexecution.alf.EqualityOperator
   * @see org.modelexecution.alf.AlfPackage#getEqualityExpressionCompletion_Operator()
   * @model unique="false"
   * @generated
   */
  EList<EqualityOperator> getOperator();

  /**
   * Returns the value of the '<em><b>Classification Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.ClassificationExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classification Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classification Expression</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getEqualityExpressionCompletion_ClassificationExpression()
   * @model containment="true"
   * @generated
   */
  EList<ClassificationExpression> getClassificationExpression();

} // EqualityExpressionCompletion

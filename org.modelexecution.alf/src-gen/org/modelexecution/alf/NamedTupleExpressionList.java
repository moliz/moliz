/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Tuple Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.NamedTupleExpressionList#getNamedExpression <em>Named Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getNamedTupleExpressionList()
 * @model
 * @generated
 */
public interface NamedTupleExpressionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Named Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.NamedExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Expression</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getNamedTupleExpressionList_NamedExpression()
   * @model containment="true"
   * @generated
   */
  EList<NamedExpression> getNamedExpression();

} // NamedTupleExpressionList

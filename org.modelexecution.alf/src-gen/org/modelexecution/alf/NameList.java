/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.NameList#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getNameList()
 * @model
 * @generated
 */
public interface NameList extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.Name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getNameList_Name()
   * @model containment="true"
   * @generated
   */
  EList<Name> getName();

} // NameList

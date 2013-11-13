/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colon Qualified Name Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.ColonQualifiedNameCompletion#getNamedBindings <em>Named Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getColonQualifiedNameCompletion()
 * @model
 * @generated
 */
public interface ColonQualifiedNameCompletion extends EObject
{
  /**
   * Returns the value of the '<em><b>Named Bindings</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.NameBinding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Bindings</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getColonQualifiedNameCompletion_NamedBindings()
   * @model containment="true"
   * @generated
   */
  EList<NameBinding> getNamedBindings();

} // ColonQualifiedNameCompletion

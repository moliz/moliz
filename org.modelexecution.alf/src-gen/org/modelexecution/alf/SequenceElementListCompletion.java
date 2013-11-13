/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Element List Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.SequenceElementListCompletion#getSequenceElement <em>Sequence Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getSequenceElementListCompletion()
 * @model
 * @generated
 */
public interface SequenceElementListCompletion extends EObject
{
  /**
   * Returns the value of the '<em><b>Sequence Element</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.SequenceElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Element</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getSequenceElementListCompletion_SequenceElement()
   * @model containment="true"
   * @generated
   */
  EList<SequenceElement> getSequenceElement();

} // SequenceElementListCompletion

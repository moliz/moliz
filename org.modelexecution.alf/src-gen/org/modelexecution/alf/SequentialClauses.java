/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Clauses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.SequentialClauses#getConcurrentClauses <em>Concurrent Clauses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getSequentialClauses()
 * @model
 * @generated
 */
public interface SequentialClauses extends EObject
{
  /**
   * Returns the value of the '<em><b>Concurrent Clauses</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.ConcurrentClauses}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concurrent Clauses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concurrent Clauses</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getSequentialClauses_ConcurrentClauses()
   * @model containment="true"
   * @generated
   */
  EList<ConcurrentClauses> getConcurrentClauses();

} // SequentialClauses

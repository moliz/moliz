/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.StatementSequence#getDocumentStatement <em>Document Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getStatementSequence()
 * @model
 * @generated
 */
public interface StatementSequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Document Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.DocumentedStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Document Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Document Statement</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getStatementSequence_DocumentStatement()
   * @model containment="true"
   * @generated
   */
  EList<DocumentedStatement> getDocumentStatement();

} // StatementSequence

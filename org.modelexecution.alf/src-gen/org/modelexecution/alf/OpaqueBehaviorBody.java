/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Behavior Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.OpaqueBehaviorBody#getBodydefinition <em>Bodydefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getOpaqueBehaviorBody()
 * @model
 * @generated
 */
public interface OpaqueBehaviorBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Bodydefinition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bodydefinition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bodydefinition</em>' containment reference.
   * @see #setBodydefinition(Block)
   * @see org.modelexecution.alf.AlfPackage#getOpaqueBehaviorBody_Bodydefinition()
   * @model containment="true"
   * @generated
   */
  Block getBodydefinition();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.OpaqueBehaviorBody#getBodydefinition <em>Bodydefinition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bodydefinition</em>' containment reference.
   * @see #getBodydefinition()
   * @generated
   */
  void setBodydefinition(Block value);

} // OpaqueBehaviorBody

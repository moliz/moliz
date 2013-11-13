/**
 */
package org.modelexecution.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Initialization Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.SequenceInitializationExpression#isIsNew <em>Is New</em>}</li>
 *   <li>{@link org.modelexecution.alf.SequenceInitializationExpression#getSequenceElements <em>Sequence Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getSequenceInitializationExpression()
 * @model
 * @generated
 */
public interface SequenceInitializationExpression extends InitializationExpression
{
  /**
   * Returns the value of the '<em><b>Is New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is New</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is New</em>' attribute.
   * @see #setIsNew(boolean)
   * @see org.modelexecution.alf.AlfPackage#getSequenceInitializationExpression_IsNew()
   * @model
   * @generated
   */
  boolean isIsNew();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.SequenceInitializationExpression#isIsNew <em>Is New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is New</em>' attribute.
   * @see #isIsNew()
   * @generated
   */
  void setIsNew(boolean value);

  /**
   * Returns the value of the '<em><b>Sequence Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Elements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Elements</em>' containment reference.
   * @see #setSequenceElements(SequenceElements)
   * @see org.modelexecution.alf.AlfPackage#getSequenceInitializationExpression_SequenceElements()
   * @model containment="true"
   * @generated
   */
  SequenceElements getSequenceElements();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.SequenceInitializationExpression#getSequenceElements <em>Sequence Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence Elements</em>' containment reference.
   * @see #getSequenceElements()
   * @generated
   */
  void setSequenceElements(SequenceElements value);

} // SequenceInitializationExpression

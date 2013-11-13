/**
 */
package org.modelexecution.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.AssociationDefinition#getAssociationDeclaration <em>Association Declaration</em>}</li>
 *   <li>{@link org.modelexecution.alf.AssociationDefinition#getStructuredBody <em>Structured Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getAssociationDefinition()
 * @model
 * @generated
 */
public interface AssociationDefinition extends ClassifierDefinition
{
  /**
   * Returns the value of the '<em><b>Association Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Association Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Association Declaration</em>' containment reference.
   * @see #setAssociationDeclaration(AssociationDeclaration)
   * @see org.modelexecution.alf.AlfPackage#getAssociationDefinition_AssociationDeclaration()
   * @model containment="true"
   * @generated
   */
  AssociationDeclaration getAssociationDeclaration();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.AssociationDefinition#getAssociationDeclaration <em>Association Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Association Declaration</em>' containment reference.
   * @see #getAssociationDeclaration()
   * @generated
   */
  void setAssociationDeclaration(AssociationDeclaration value);

  /**
   * Returns the value of the '<em><b>Structured Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structured Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structured Body</em>' containment reference.
   * @see #setStructuredBody(StructuredBody)
   * @see org.modelexecution.alf.AlfPackage#getAssociationDefinition_StructuredBody()
   * @model containment="true"
   * @generated
   */
  StructuredBody getStructuredBody();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.AssociationDefinition#getStructuredBody <em>Structured Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structured Body</em>' containment reference.
   * @see #getStructuredBody()
   * @generated
   */
  void setStructuredBody(StructuredBody value);

} // AssociationDefinition

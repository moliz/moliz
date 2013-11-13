/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.FormalParameter#getComment <em>Comment</em>}</li>
 *   <li>{@link org.modelexecution.alf.FormalParameter#getStereotypeAnnotations <em>Stereotype Annotations</em>}</li>
 *   <li>{@link org.modelexecution.alf.FormalParameter#getParameterDirection <em>Parameter Direction</em>}</li>
 *   <li>{@link org.modelexecution.alf.FormalParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.modelexecution.alf.FormalParameter#getTypePart <em>Type Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getFormalParameter()
 * @model
 * @generated
 */
public interface FormalParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see org.modelexecution.alf.AlfPackage#getFormalParameter_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.FormalParameter#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Stereotype Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stereotype Annotations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stereotype Annotations</em>' containment reference.
   * @see #setStereotypeAnnotations(StereotypeAnnotations)
   * @see org.modelexecution.alf.AlfPackage#getFormalParameter_StereotypeAnnotations()
   * @model containment="true"
   * @generated
   */
  StereotypeAnnotations getStereotypeAnnotations();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.FormalParameter#getStereotypeAnnotations <em>Stereotype Annotations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stereotype Annotations</em>' containment reference.
   * @see #getStereotypeAnnotations()
   * @generated
   */
  void setStereotypeAnnotations(StereotypeAnnotations value);

  /**
   * Returns the value of the '<em><b>Parameter Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.modelexecution.alf.ParameterDirection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Direction</em>' attribute.
   * @see org.modelexecution.alf.ParameterDirection
   * @see #setParameterDirection(ParameterDirection)
   * @see org.modelexecution.alf.AlfPackage#getFormalParameter_ParameterDirection()
   * @model
   * @generated
   */
  ParameterDirection getParameterDirection();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.FormalParameter#getParameterDirection <em>Parameter Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Direction</em>' attribute.
   * @see org.modelexecution.alf.ParameterDirection
   * @see #getParameterDirection()
   * @generated
   */
  void setParameterDirection(ParameterDirection value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see org.modelexecution.alf.AlfPackage#getFormalParameter_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.FormalParameter#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Type Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Part</em>' containment reference.
   * @see #setTypePart(TypePart)
   * @see org.modelexecution.alf.AlfPackage#getFormalParameter_TypePart()
   * @model containment="true"
   * @generated
   */
  TypePart getTypePart();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.FormalParameter#getTypePart <em>Type Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Part</em>' containment reference.
   * @see #getTypePart()
   * @generated
   */
  void setTypePart(TypePart value);

} // FormalParameter

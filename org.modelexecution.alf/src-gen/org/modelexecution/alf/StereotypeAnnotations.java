/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.StereotypeAnnotations#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getStereotypeAnnotations()
 * @model
 * @generated
 */
public interface StereotypeAnnotations extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.StereotypeAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getStereotypeAnnotations_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<StereotypeAnnotation> getAnnotation();

} // StereotypeAnnotations

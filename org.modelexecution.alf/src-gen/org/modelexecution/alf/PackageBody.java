/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.PackageBody#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getPackageBody()
 * @model
 * @generated
 */
public interface PackageBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.PackagedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packaged Element</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getPackageBody_PackagedElement()
   * @model containment="true"
   * @generated
   */
  EList<PackagedElement> getPackagedElement();

} // PackageBody

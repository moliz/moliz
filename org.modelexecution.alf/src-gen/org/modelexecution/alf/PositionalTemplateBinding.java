/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positional Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.PositionalTemplateBinding#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getPositionalTemplateBinding()
 * @model
 * @generated
 */
public interface PositionalTemplateBinding extends TemplateBinding
{
  /**
   * Returns the value of the '<em><b>Qualified Name</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.QualifiedName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Name</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getPositionalTemplateBinding_QualifiedName()
   * @model containment="true"
   * @generated
   */
  EList<QualifiedName> getQualifiedName();

} // PositionalTemplateBinding

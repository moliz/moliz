/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.NamedTemplateBinding#getTemplateParameterSubstitution <em>Template Parameter Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getNamedTemplateBinding()
 * @model
 * @generated
 */
public interface NamedTemplateBinding extends TemplateBinding
{
  /**
   * Returns the value of the '<em><b>Template Parameter Substitution</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.TemplateParameterSubstitution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Parameter Substitution</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Parameter Substitution</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getNamedTemplateBinding_TemplateParameterSubstitution()
   * @model containment="true"
   * @generated
   */
  EList<TemplateParameterSubstitution> getTemplateParameterSubstitution();

} // NamedTemplateBinding

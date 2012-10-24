/**
 */
package org.modelexecution.xmof.Syntax.Actions.IntermediateActions;

import org.modelexecution.xmof.Syntax.Actions.BasicActions.Action;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.xmof.Syntax.Actions.IntermediateActions.DestroyObjectAction#getIsDestroyLinks <em>Is Destroy Links</em>}</li>
 *   <li>{@link org.modelexecution.xmof.Syntax.Actions.IntermediateActions.DestroyObjectAction#getIsDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}</li>
 *   <li>{@link org.modelexecution.xmof.Syntax.Actions.IntermediateActions.DestroyObjectAction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.xmof.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getDestroyObjectAction()
 * @model
 * @generated
 */
public interface DestroyObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Destroy Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Destroy Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #setIsDestroyLinks(Object)
	 * @see org.modelexecution.xmof.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getDestroyObjectAction_IsDestroyLinks()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getIsDestroyLinks();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.Syntax.Actions.IntermediateActions.DestroyObjectAction#getIsDestroyLinks <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #getIsDestroyLinks()
	 * @generated
	 */
	void setIsDestroyLinks(Object value);

	/**
	 * Returns the value of the '<em><b>Is Destroy Owned Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Destroy Owned Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #setIsDestroyOwnedObjects(Object)
	 * @see org.modelexecution.xmof.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getDestroyObjectAction_IsDestroyOwnedObjects()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getIsDestroyOwnedObjects();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.Syntax.Actions.IntermediateActions.DestroyObjectAction#getIsDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #getIsDestroyOwnedObjects()
	 * @generated
	 */
	void setIsDestroyOwnedObjects(Object value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see org.modelexecution.xmof.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getDestroyObjectAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.Syntax.Actions.IntermediateActions.DestroyObjectAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

} // DestroyObjectAction
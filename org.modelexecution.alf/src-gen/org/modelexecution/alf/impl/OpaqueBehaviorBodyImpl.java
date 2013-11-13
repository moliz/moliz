/**
 */
package org.modelexecution.alf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.modelexecution.alf.AlfPackage;
import org.modelexecution.alf.Block;
import org.modelexecution.alf.OpaqueBehaviorBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Behavior Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.alf.impl.OpaqueBehaviorBodyImpl#getBodydefinition <em>Bodydefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueBehaviorBodyImpl extends MinimalEObjectImpl.Container implements OpaqueBehaviorBody
{
  /**
   * The cached value of the '{@link #getBodydefinition() <em>Bodydefinition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodydefinition()
   * @generated
   * @ordered
   */
  protected Block bodydefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpaqueBehaviorBodyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlfPackage.eINSTANCE.getOpaqueBehaviorBody();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBodydefinition()
  {
    return bodydefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBodydefinition(Block newBodydefinition, NotificationChain msgs)
  {
    Block oldBodydefinition = bodydefinition;
    bodydefinition = newBodydefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.OPAQUE_BEHAVIOR_BODY__BODYDEFINITION, oldBodydefinition, newBodydefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBodydefinition(Block newBodydefinition)
  {
    if (newBodydefinition != bodydefinition)
    {
      NotificationChain msgs = null;
      if (bodydefinition != null)
        msgs = ((InternalEObject)bodydefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.OPAQUE_BEHAVIOR_BODY__BODYDEFINITION, null, msgs);
      if (newBodydefinition != null)
        msgs = ((InternalEObject)newBodydefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.OPAQUE_BEHAVIOR_BODY__BODYDEFINITION, null, msgs);
      msgs = basicSetBodydefinition(newBodydefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.OPAQUE_BEHAVIOR_BODY__BODYDEFINITION, newBodydefinition, newBodydefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlfPackage.OPAQUE_BEHAVIOR_BODY__BODYDEFINITION:
        return basicSetBodydefinition(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlfPackage.OPAQUE_BEHAVIOR_BODY__BODYDEFINITION:
        return getBodydefinition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlfPackage.OPAQUE_BEHAVIOR_BODY__BODYDEFINITION:
        setBodydefinition((Block)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlfPackage.OPAQUE_BEHAVIOR_BODY__BODYDEFINITION:
        setBodydefinition((Block)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlfPackage.OPAQUE_BEHAVIOR_BODY__BODYDEFINITION:
        return bodydefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //OpaqueBehaviorBodyImpl

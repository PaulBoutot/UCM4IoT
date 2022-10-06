/**
 * generated by Xtext 2.25.0
 */
package mde.iot.ucm4iot.ucm4iot.impl;

import mde.iot.ucm4iot.ucm4iot.InteractionStep;
import mde.iot.ucm4iot.ucm4iot.Ucm4iotPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mde.iot.ucm4iot.ucm4iot.impl.InteractionStepImpl#getStepNumber <em>Step Number</em>}</li>
 *   <li>{@link mde.iot.ucm4iot.ucm4iot.impl.InteractionStepImpl#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionStepImpl extends StepImpl implements InteractionStep
{
  /**
   * The default value of the '{@link #getStepNumber() <em>Step Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStepNumber()
   * @generated
   * @ordered
   */
  protected static final String STEP_NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStepNumber() <em>Step Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStepNumber()
   * @generated
   * @ordered
   */
  protected String stepNumber = STEP_NUMBER_EDEFAULT;

  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected mde.iot.ucm4iot.ucm4iot.Exception exception;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionStepImpl()
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
    return Ucm4iotPackage.Literals.INTERACTION_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStepNumber()
  {
    return stepNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStepNumber(String newStepNumber)
  {
    String oldStepNumber = stepNumber;
    stepNumber = newStepNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ucm4iotPackage.INTERACTION_STEP__STEP_NUMBER, oldStepNumber, stepNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public mde.iot.ucm4iot.ucm4iot.Exception getException()
  {
    return exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException(mde.iot.ucm4iot.ucm4iot.Exception newException, NotificationChain msgs)
  {
    mde.iot.ucm4iot.ucm4iot.Exception oldException = exception;
    exception = newException;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ucm4iotPackage.INTERACTION_STEP__EXCEPTION, oldException, newException);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setException(mde.iot.ucm4iot.ucm4iot.Exception newException)
  {
    if (newException != exception)
    {
      NotificationChain msgs = null;
      if (exception != null)
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ucm4iotPackage.INTERACTION_STEP__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ucm4iotPackage.INTERACTION_STEP__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ucm4iotPackage.INTERACTION_STEP__EXCEPTION, newException, newException));
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
      case Ucm4iotPackage.INTERACTION_STEP__EXCEPTION:
        return basicSetException(null, msgs);
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
      case Ucm4iotPackage.INTERACTION_STEP__STEP_NUMBER:
        return getStepNumber();
      case Ucm4iotPackage.INTERACTION_STEP__EXCEPTION:
        return getException();
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
      case Ucm4iotPackage.INTERACTION_STEP__STEP_NUMBER:
        setStepNumber((String)newValue);
        return;
      case Ucm4iotPackage.INTERACTION_STEP__EXCEPTION:
        setException((mde.iot.ucm4iot.ucm4iot.Exception)newValue);
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
      case Ucm4iotPackage.INTERACTION_STEP__STEP_NUMBER:
        setStepNumber(STEP_NUMBER_EDEFAULT);
        return;
      case Ucm4iotPackage.INTERACTION_STEP__EXCEPTION:
        setException((mde.iot.ucm4iot.ucm4iot.Exception)null);
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
      case Ucm4iotPackage.INTERACTION_STEP__STEP_NUMBER:
        return STEP_NUMBER_EDEFAULT == null ? stepNumber != null : !STEP_NUMBER_EDEFAULT.equals(stepNumber);
      case Ucm4iotPackage.INTERACTION_STEP__EXCEPTION:
        return exception != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (stepNumber: ");
    result.append(stepNumber);
    result.append(')');
    return result.toString();
  }

} //InteractionStepImpl
/**
 * generated by Xtext 2.25.0
 */
package mde.iot.ucm4iot.ucm4iot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.iot.ucm4iot.ucm4iot.InteractionStep#getStepNumber <em>Step Number</em>}</li>
 *   <li>{@link mde.iot.ucm4iot.ucm4iot.InteractionStep#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see mde.iot.ucm4iot.ucm4iot.Ucm4iotPackage#getInteractionStep()
 * @model
 * @generated
 */
public interface InteractionStep extends Step
{
  /**
   * Returns the value of the '<em><b>Step Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step Number</em>' attribute.
   * @see #setStepNumber(String)
   * @see mde.iot.ucm4iot.ucm4iot.Ucm4iotPackage#getInteractionStep_StepNumber()
   * @model
   * @generated
   */
  String getStepNumber();

  /**
   * Sets the value of the '{@link mde.iot.ucm4iot.ucm4iot.InteractionStep#getStepNumber <em>Step Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step Number</em>' attribute.
   * @see #getStepNumber()
   * @generated
   */
  void setStepNumber(String value);

  /**
   * Returns the value of the '<em><b>Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception</em>' containment reference.
   * @see #setException(mde.iot.ucm4iot.ucm4iot.Exception)
   * @see mde.iot.ucm4iot.ucm4iot.Ucm4iotPackage#getInteractionStep_Exception()
   * @model containment="true"
   * @generated
   */
  mde.iot.ucm4iot.ucm4iot.Exception getException();

  /**
   * Sets the value of the '{@link mde.iot.ucm4iot.ucm4iot.InteractionStep#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(mde.iot.ucm4iot.ucm4iot.Exception value);

} // InteractionStep
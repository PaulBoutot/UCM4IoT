/**
 * generated by Xtext 2.25.0
 */
package mde.iot.ucm4iot.ucm4iot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Outcome Endings</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mde.iot.ucm4iot.ucm4iot.Ucm4iotPackage#getOutcomeEndings()
 * @model
 * @generated
 */
public enum OutcomeEndings implements Enumerator
{
  /**
   * The '<em><b>SUCCESS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUCCESS_VALUE
   * @generated
   * @ordered
   */
  SUCCESS(0, "SUCCESS", "SUCCESS"),

  /**
   * The '<em><b>FAILURE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FAILURE_VALUE
   * @generated
   * @ordered
   */
  FAILURE(1, "FAILURE", "FAILURE"),

  /**
   * The '<em><b>DEGRADED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEGRADED_VALUE
   * @generated
   * @ordered
   */
  DEGRADED(2, "DEGRADED", "DEGRADED"),

  /**
   * The '<em><b>ABANDONED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABANDONED_VALUE
   * @generated
   * @ordered
   */
  ABANDONED(3, "ABANDONED", "ABANDONED");

  /**
   * The '<em><b>SUCCESS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUCCESS
   * @model
   * @generated
   * @ordered
   */
  public static final int SUCCESS_VALUE = 0;

  /**
   * The '<em><b>FAILURE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FAILURE
   * @model
   * @generated
   * @ordered
   */
  public static final int FAILURE_VALUE = 1;

  /**
   * The '<em><b>DEGRADED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEGRADED
   * @model
   * @generated
   * @ordered
   */
  public static final int DEGRADED_VALUE = 2;

  /**
   * The '<em><b>ABANDONED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABANDONED
   * @model
   * @generated
   * @ordered
   */
  public static final int ABANDONED_VALUE = 3;

  /**
   * An array of all the '<em><b>Outcome Endings</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OutcomeEndings[] VALUES_ARRAY =
    new OutcomeEndings[]
    {
      SUCCESS,
      FAILURE,
      DEGRADED,
      ABANDONED,
    };

  /**
   * A public read-only list of all the '<em><b>Outcome Endings</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OutcomeEndings> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Outcome Endings</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OutcomeEndings get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OutcomeEndings result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Outcome Endings</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OutcomeEndings getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OutcomeEndings result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Outcome Endings</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OutcomeEndings get(int value)
  {
    switch (value)
    {
      case SUCCESS_VALUE: return SUCCESS;
      case FAILURE_VALUE: return FAILURE;
      case DEGRADED_VALUE: return DEGRADED;
      case ABANDONED_VALUE: return ABANDONED;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private OutcomeEndings(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //OutcomeEndings

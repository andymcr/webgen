/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingletonAssociationRelationships.java,v 1.2 2013/06/07 14:37:07 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Singleton Association Relationships</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonAssociationRelationships()
 * @model
 * @generated
 */
public enum SingletonAssociationRelationships implements Enumerator {
	/**
   * The '<em><b>One To One</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ONE_TO_ONE_VALUE
   * @generated
   * @ordered
   */
	ONE_TO_ONE(0, "OneToOne", "OneToOne"),

	/**
   * The '<em><b>Many To One</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MANY_TO_ONE_VALUE
   * @generated
   * @ordered
   */
	MANY_TO_ONE(1, "ManyToOne", "ManyToOne");

	/**
   * The '<em><b>One To One</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One To One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ONE_TO_ONE
   * @model name="OneToOne"
   * @generated
   * @ordered
   */
	public static final int ONE_TO_ONE_VALUE = 0;

	/**
   * The '<em><b>Many To One</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Many To One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #MANY_TO_ONE
   * @model name="ManyToOne"
   * @generated
   * @ordered
   */
	public static final int MANY_TO_ONE_VALUE = 1;

	/**
   * An array of all the '<em><b>Singleton Association Relationships</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final SingletonAssociationRelationships[] VALUES_ARRAY =
		new SingletonAssociationRelationships[]
    {
      ONE_TO_ONE,
      MANY_TO_ONE,
    };

	/**
   * A public read-only list of all the '<em><b>Singleton Association Relationships</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<SingletonAssociationRelationships> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Singleton Association Relationships</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static SingletonAssociationRelationships get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SingletonAssociationRelationships result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Singleton Association Relationships</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static SingletonAssociationRelationships getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SingletonAssociationRelationships result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Singleton Association Relationships</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static SingletonAssociationRelationships get(int value) {
    switch (value)
    {
      case ONE_TO_ONE_VALUE: return ONE_TO_ONE;
      case MANY_TO_ONE_VALUE: return MANY_TO_ONE;
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
	private SingletonAssociationRelationships(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLiteral() {
    return literal;
  }

	/**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    return literal;
  }
	
} //SingletonAssociationRelationships

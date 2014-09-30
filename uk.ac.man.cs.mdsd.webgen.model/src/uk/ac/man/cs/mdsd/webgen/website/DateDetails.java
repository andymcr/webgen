/**
 * <copyright>
 * </copyright>
 *
 * $Id: DateDetails.java,v 1.1 2012/03/15 16:29:32 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Date Details</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDateDetails()
 * @model
 * @generated
 */
public enum DateDetails implements Enumerator {
	/**
	 * The '<em><b>Date Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_ONLY(0, "DateOnly", "DateOnly"),

	/**
	 * The '<em><b>Time Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_ONLY(0, "TimeOnly", "TimeOnly"),

	/**
	 * The '<em><b>Date And Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_AND_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_AND_TIME(0, "DateAndTime", "DateAndTime");

	/**
	 * The '<em><b>Date Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_ONLY
	 * @model name="DateOnly"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Time Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_ONLY
	 * @model name="TimeOnly"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Date And Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date And Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_AND_TIME
	 * @model name="DateAndTime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_AND_TIME_VALUE = 0;

	/**
	 * An array of all the '<em><b>Date Details</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DateDetails[] VALUES_ARRAY =
		new DateDetails[] {
			DATE_ONLY,
			TIME_ONLY,
			DATE_AND_TIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Date Details</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DateDetails> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Date Details</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DateDetails get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateDetails result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Details</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DateDetails getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateDetails result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Details</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DateDetails get(int value) {
		switch (value) {
			case DATE_ONLY_VALUE: return DATE_ONLY;
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
	private DateDetails(int value, String name, String literal) {
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
	
} //DateDetails

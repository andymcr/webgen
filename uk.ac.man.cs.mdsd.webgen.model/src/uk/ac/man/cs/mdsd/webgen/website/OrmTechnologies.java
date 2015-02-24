/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Orm Technologies</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getOrmTechnologies()
 * @model
 * @generated
 */
public enum OrmTechnologies implements Enumerator {
	/**
	 * The '<em><b>JPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPA_VALUE
	 * @generated
	 * @ordered
	 */
	JPA(0, "JPA", "JPA"),

	/**
	 * The '<em><b>Data Mapper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_MAPPER_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_MAPPER(1, "DataMapper", "DataMapper"),

	/**
	 * The '<em><b>Idiorm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDIORM_VALUE
	 * @generated
	 * @ordered
	 */
	IDIORM(2, "Idiorm", "Idiorm"),

	/**
	 * The '<em><b>Doctrine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTRINE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCTRINE(3, "Doctrine", "Doctrine");

	/**
	 * The '<em><b>JPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JPA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JPA_VALUE = 0;

	/**
	 * The '<em><b>Data Mapper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Mapper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_MAPPER
	 * @model name="DataMapper"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_MAPPER_VALUE = 1;

	/**
	 * The '<em><b>Idiorm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Idiorm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDIORM
	 * @model name="Idiorm"
	 * @generated
	 * @ordered
	 */
	public static final int IDIORM_VALUE = 2;

	/**
	 * The '<em><b>Doctrine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Doctrine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCTRINE
	 * @model name="Doctrine"
	 * @generated
	 * @ordered
	 */
	public static final int DOCTRINE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Orm Technologies</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrmTechnologies[] VALUES_ARRAY =
		new OrmTechnologies[] {
			JPA,
			DATA_MAPPER,
			IDIORM,
			DOCTRINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Orm Technologies</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrmTechnologies> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Orm Technologies</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrmTechnologies get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrmTechnologies result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orm Technologies</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrmTechnologies getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrmTechnologies result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orm Technologies</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrmTechnologies get(int value) {
		switch (value) {
			case JPA_VALUE: return JPA;
			case DATA_MAPPER_VALUE: return DATA_MAPPER;
			case IDIORM_VALUE: return IDIORM;
			case DOCTRINE_VALUE: return DOCTRINE;
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
	private OrmTechnologies(int value, String name, String literal) {
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
	
} //OrmTechnologies

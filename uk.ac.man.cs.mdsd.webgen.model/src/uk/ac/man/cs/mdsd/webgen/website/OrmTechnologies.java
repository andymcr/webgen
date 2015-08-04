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
	 * The '<em><b>Kohana</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KOHANA_VALUE
	 * @generated
	 * @ordered
	 */
	KOHANA(3, "Kohana", "Kohana"), /**
	 * The '<em><b>Doctrine ORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTRINE_ORM_VALUE
	 * @generated
	 * @ordered
	 */
	DOCTRINE_ORM(4, "DoctrineORM", "DoctrineORM"), /**
	 * The '<em><b>Doctrine ODM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTRINE_ODM_VALUE
	 * @generated
	 * @ordered
	 */
	DOCTRINE_ODM(5, "DoctrineODM", "DoctrineODM");

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
	 * The '<em><b>Kohana</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kohana</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KOHANA
	 * @model name="Kohana"
	 * @generated
	 * @ordered
	 */
	public static final int KOHANA_VALUE = 3;

	/**
	 * The '<em><b>Doctrine ORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Doctrine ORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCTRINE_ORM
	 * @model name="DoctrineORM"
	 * @generated
	 * @ordered
	 */
	public static final int DOCTRINE_ORM_VALUE = 4;

	/**
	 * The '<em><b>Doctrine ODM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Doctrine ODM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCTRINE_ODM
	 * @model name="DoctrineODM"
	 * @generated
	 * @ordered
	 */
	public static final int DOCTRINE_ODM_VALUE = 5;

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
			KOHANA,
			DOCTRINE_ORM,
			DOCTRINE_ODM,
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
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
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
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
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
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrmTechnologies get(int value) {
		switch (value) {
			case JPA_VALUE: return JPA;
			case DATA_MAPPER_VALUE: return DATA_MAPPER;
			case IDIORM_VALUE: return IDIORM;
			case KOHANA_VALUE: return KOHANA;
			case DOCTRINE_ORM_VALUE: return DOCTRINE_ORM;
			case DOCTRINE_ODM_VALUE: return DOCTRINE_ODM;
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

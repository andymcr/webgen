/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import uk.ac.man.cs.mdsd.webgen.base.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getOrmTechnology <em>Orm Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabaseTechnology <em>Database Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#isTimestampCreation <em>Timestamp Creation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#isTimestampUpdates <em>Timestamp Updates</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getPersistence()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='classifierNameUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL classifierNameUnique='dataTypes-&gt;isUnique(name) and entities-&gt;isUnique(name)'"
 * @generated
 */
public interface Persistence extends EObject {

	/**
	 * Returns the value of the '<em><b>Serialization Groups</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialization Groups</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getPersistence_SerializationGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<SerializationGroup> getSerializationGroups();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.base.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getPersistence_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getPersistence_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityOrView> getEntities();

	/**
	 * Returns the value of the '<em><b>Orm Technology</b></em>' attribute.
	 * The default value is <code>"Kohana"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies
	 * @see #setOrmTechnology(OrmTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getPersistence_OrmTechnology()
	 * @model default="Kohana"
	 * @generated
	 */
	OrmTechnologies getOrmTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getOrmTechnology <em>Orm Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies
	 * @see #getOrmTechnology()
	 * @generated
	 */
	void setOrmTechnology(OrmTechnologies value);

	/**
	 * Returns the value of the '<em><b>Database Technology</b></em>' attribute.
	 * The default value is <code>"MySql"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies
	 * @see #setDatabaseTechnology(DatabaseTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getPersistence_DatabaseTechnology()
	 * @model default="MySql" required="true" ordered="false"
	 * @generated
	 */
	DatabaseTechnologies getDatabaseTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabaseTechnology <em>Database Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies
	 * @see #getDatabaseTechnology()
	 * @generated
	 */
	void setDatabaseTechnology(DatabaseTechnologies value);

	/**
	 * Returns the value of the '<em><b>Timestamp Creation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp Creation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp Creation</em>' attribute.
	 * @see #setTimestampCreation(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getPersistence_TimestampCreation()
	 * @model default="true"
	 * @generated
	 */
	boolean isTimestampCreation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#isTimestampCreation <em>Timestamp Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp Creation</em>' attribute.
	 * @see #isTimestampCreation()
	 * @generated
	 */
	void setTimestampCreation(boolean value);

	/**
	 * Returns the value of the '<em><b>Timestamp Updates</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp Updates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp Updates</em>' attribute.
	 * @see #setTimestampUpdates(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getPersistence_TimestampUpdates()
	 * @model default="true"
	 * @generated
	 */
	boolean isTimestampUpdates();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#isTimestampUpdates <em>Timestamp Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp Updates</em>' attribute.
	 * @see #isTimestampUpdates()
	 * @generated
	 */
	void setTimestampUpdates(boolean value);
} // Persistence

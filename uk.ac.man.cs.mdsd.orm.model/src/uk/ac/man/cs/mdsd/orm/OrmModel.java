/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmModel.java,v 1.4 2013/06/08 06:31:28 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.OrmModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.OrmModel#getCollectionTypes <em>Collection Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseTechnology <em>Database Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabasePrefix <em>Database Prefix</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseHost <em>Database Host</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseUsername <em>Database Username</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabasePassword <em>Database Password</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.OrmModel#getOrmTechnology <em>Orm Technology</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel()
 * @model
 * @generated
 */
public interface OrmModel extends EObject {
	/**
   * Returns the value of the '<em><b>Collection Types</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.CollectionType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Collection Types</em>' containment reference list.
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel_CollectionTypes()
   * @model containment="true"
   * @generated
   */
	EList<CollectionType> getCollectionTypes();

	/**
   * Returns the value of the '<em><b>Database Technology</b></em>' attribute.
   * The default value is <code>"MySql"</code>.
   * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.orm.DatabaseTechnologies}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Database Technology</em>' attribute.
   * @see uk.ac.man.cs.mdsd.orm.DatabaseTechnologies
   * @see #setDatabaseTechnology(DatabaseTechnologies)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel_DatabaseTechnology()
   * @model default="MySql" unique="false" ordered="false"
   * @generated
   */
	DatabaseTechnologies getDatabaseTechnology();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseTechnology <em>Database Technology</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Technology</em>' attribute.
   * @see uk.ac.man.cs.mdsd.orm.DatabaseTechnologies
   * @see #getDatabaseTechnology()
   * @generated
   */
	void setDatabaseTechnology(DatabaseTechnologies value);

	/**
   * Returns the value of the '<em><b>Database Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Database Prefix</em>' attribute.
   * @see #setDatabasePrefix(String)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel_DatabasePrefix()
   * @model unique="false"
   * @generated
   */
	String getDatabasePrefix();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabasePrefix <em>Database Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Prefix</em>' attribute.
   * @see #getDatabasePrefix()
   * @generated
   */
	void setDatabasePrefix(String value);

	/**
   * Returns the value of the '<em><b>Database Host</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Database Host</em>' attribute.
   * @see #setDatabaseHost(String)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel_DatabaseHost()
   * @model unique="false"
   * @generated
   */
	String getDatabaseHost();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseHost <em>Database Host</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Host</em>' attribute.
   * @see #getDatabaseHost()
   * @generated
   */
	void setDatabaseHost(String value);

	/**
   * Returns the value of the '<em><b>Database Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Database Name</em>' attribute.
   * @see #setDatabaseName(String)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel_DatabaseName()
   * @model unique="false"
   * @generated
   */
	String getDatabaseName();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseName <em>Database Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Name</em>' attribute.
   * @see #getDatabaseName()
   * @generated
   */
	void setDatabaseName(String value);

	/**
   * Returns the value of the '<em><b>Database Username</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Database Username</em>' attribute.
   * @see #setDatabaseUsername(String)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel_DatabaseUsername()
   * @model unique="false"
   * @generated
   */
	String getDatabaseUsername();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseUsername <em>Database Username</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Username</em>' attribute.
   * @see #getDatabaseUsername()
   * @generated
   */
	void setDatabaseUsername(String value);

	/**
   * Returns the value of the '<em><b>Database Password</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Database Password</em>' attribute.
   * @see #setDatabasePassword(String)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel_DatabasePassword()
   * @model unique="false"
   * @generated
   */
	String getDatabasePassword();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabasePassword <em>Database Password</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Password</em>' attribute.
   * @see #getDatabasePassword()
   * @generated
   */
	void setDatabasePassword(String value);

	/**
   * Returns the value of the '<em><b>Orm Technology</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.orm.OrmTechnologies}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Orm Technology</em>' attribute.
   * @see uk.ac.man.cs.mdsd.orm.OrmTechnologies
   * @see #setOrmTechnology(OrmTechnologies)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel_OrmTechnology()
   * @model unique="false"
   * @generated
   */
	OrmTechnologies getOrmTechnology();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getOrmTechnology <em>Orm Technology</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orm Technology</em>' attribute.
   * @see uk.ac.man.cs.mdsd.orm.OrmTechnologies
   * @see #getOrmTechnology()
   * @generated
   */
	void setOrmTechnology(OrmTechnologies value);

	/**
   * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.DataType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Data Types</em>' containment reference list.
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel_DataTypes()
   * @model containment="true"
   * @generated
   */
	EList<DataType> getDataTypes();

	/**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.Entity}.
   * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.orm.Entity#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getOrmModel_Entities()
   * @see uk.ac.man.cs.mdsd.orm.Entity#getPartOf
   * @model opposite="partOf" containment="true"
   * @generated
   */
	EList<Entity> getEntities();

} // OrmModel

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
	 * @model default="MySql" ordered="false"
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
	 * @model
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

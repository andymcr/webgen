/**
 * <copyright>
 * </copyright>
 *
 * $Id: Attribute.java,v 1.4 2011/03/31 18:12:20 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Attribute#getPersistentType <em>Persistent Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Attribute#getOrmType <em>Orm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends Feature {

	/**
	 * Returns the value of the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent Type</em>' attribute.
	 * @see #setPersistentType(String)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAttribute_PersistentType()
	 * @model required="true"
	 * @generated
	 */
	String getPersistentType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Attribute#getPersistentType <em>Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent Type</em>' attribute.
	 * @see #getPersistentType()
	 * @generated
	 */
	void setPersistentType(String value);

	/**
	 * Returns the value of the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Type</em>' attribute.
	 * @see #setOrmType(String)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAttribute_OrmType()
	 * @model required="true"
	 * @generated
	 */
	String getOrmType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Attribute#getOrmType <em>Orm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Type</em>' attribute.
	 * @see #getOrmType()
	 * @generated
	 */
	void setOrmType(String value);
} // Attribute

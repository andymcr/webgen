/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#isContainerUnique <em>Container Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getPersistentType <em>Persistent Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getOrmType <em>Orm Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getSlugFields <em>Slug Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAttribute()
 * @model abstract="true"
 * @generated
 */
public interface EntityAttribute extends EntityFeature, Attribute {
	/**
	 * Returns the value of the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Unique</em>' attribute.
	 * @see #setContainerUnique(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAttribute_ContainerUnique()
	 * @model
	 * @generated
	 */
	boolean isContainerUnique();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#isContainerUnique <em>Container Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Unique</em>' attribute.
	 * @see #isContainerUnique()
	 * @generated
	 */
	void setContainerUnique(boolean value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAttribute_PersistentType()
	 * @model
	 * @generated
	 */
	String getPersistentType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getPersistentType <em>Persistent Type</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAttribute_OrmType()
	 * @model
	 * @generated
	 */
	String getOrmType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getOrmType <em>Orm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Type</em>' attribute.
	 * @see #getOrmType()
	 * @generated
	 */
	void setOrmType(String value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see #setInterfaceType(String)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAttribute_InterfaceType()
	 * @model
	 * @generated
	 */
	String getInterfaceType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(String value);

	/**
	 * Returns the value of the '<em><b>Slug Fields</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slug Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slug Fields</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAttribute_SlugFields()
	 * @model
	 * @generated
	 */
	EList<Attribute> getSlugFields();

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAttribute_Unique()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // EntityAttribute

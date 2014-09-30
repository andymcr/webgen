/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionType.java,v 1.5 2011/03/23 13:05:49 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Collection Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.CollectionType#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.CollectionType#getElementType <em>Element Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.CollectionType#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.CollectionType#getJavaInterfaceType <em>Java Interface Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.CollectionType#getJavaImplementationType <em>Java Implementation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.orm.CollectionTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.orm.CollectionTypes
	 * @see #setCollectionType(CollectionTypes)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionType_CollectionType()
	 * @model
	 * @generated
	 */
	CollectionTypes getCollectionType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.CollectionType#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.orm.CollectionTypes
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(CollectionTypes value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(Classifier)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionType_ElementType()
	 * @model required="true"
	 * @generated
	 */
	Classifier getElementType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.CollectionType#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Classifier value);

	/**
	 * Returns the value of the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Type</em>' attribute.
	 * @see #setPersistenceType(String)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionType_PersistenceType()
	 * @model required="true"
	 * @generated
	 */
	String getPersistenceType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.CollectionType#getPersistenceType <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Type</em>' attribute.
	 * @see #getPersistenceType()
	 * @generated
	 */
	void setPersistenceType(String value);

	/**
	 * Returns the value of the '<em><b>Java Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Interface Type</em>' attribute.
	 * @see #setJavaInterfaceType(String)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionType_JavaInterfaceType()
	 * @model required="true"
	 * @generated
	 */
	String getJavaInterfaceType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.CollectionType#getJavaInterfaceType <em>Java Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Interface Type</em>' attribute.
	 * @see #getJavaInterfaceType()
	 * @generated
	 */
	void setJavaInterfaceType(String value);

	/**
	 * Returns the value of the '<em><b>Java Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Implementation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Implementation Type</em>' attribute.
	 * @see #setJavaImplementationType(String)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionType_JavaImplementationType()
	 * @model required="true"
	 * @generated
	 */
	String getJavaImplementationType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.CollectionType#getJavaImplementationType <em>Java Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Implementation Type</em>' attribute.
	 * @see #getJavaImplementationType()
	 * @generated
	 */
	void setJavaImplementationType(String value);
}

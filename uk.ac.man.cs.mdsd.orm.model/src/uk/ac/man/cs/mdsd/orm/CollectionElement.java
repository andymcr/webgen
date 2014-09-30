/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionElement.java,v 1.3 2013/04/23 16:50:15 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.CollectionElement#getCollectionType <em>Collection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionElement()
 * @model
 * @generated
 */
public interface CollectionElement extends CollectionAttribute {
	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Type</em>' reference.
	 * @see #setCollectionType(CollectionType)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionElement_CollectionType()
	 * @model required="true"
	 * @generated
	 */
	CollectionType getCollectionType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.CollectionElement#getCollectionType <em>Collection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' reference.
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(CollectionType value);

} // CollectionElement

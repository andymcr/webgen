/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.AssociationKey#getKeyFor <em>Key For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.AssociationKey#getKey <em>Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.AssociationKey#getColumnName <em>Column Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociationKey()
 * @model
 * @generated
 */
public interface AssociationKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Key For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key For</em>' container reference.
	 * @see #setKeyFor(EntityAssociation)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociationKey_KeyFor()
	 * @see uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getKeys
	 * @model opposite="keys" required="true" transient="false"
	 * @generated
	 */
	EntityAssociation getKeyFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.AssociationKey#getKeyFor <em>Key For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key For</em>' container reference.
	 * @see #getKeyFor()
	 * @generated
	 */
	void setKeyFor(EntityAssociation value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Attribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociationKey_Key()
	 * @model required="true"
	 * @generated
	 */
	Attribute getKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.AssociationKey#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Attribute value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociationKey_ColumnName()
	 * @model
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.AssociationKey#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

} // AssociationKey

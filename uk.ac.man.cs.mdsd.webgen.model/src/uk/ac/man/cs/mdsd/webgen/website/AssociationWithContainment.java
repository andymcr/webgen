/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationWithContainment.java,v 1.1 2011/03/26 09:48:56 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association With Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.AssociationWithContainment#isSourceVisble <em>Source Visble</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociationWithContainment()
 * @model
 * @generated
 */
public interface AssociationWithContainment extends EntityAssociation {

	/**
	 * Returns the value of the '<em><b>Source Visble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Visble</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Visble</em>' attribute.
	 * @see #setSourceVisble(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociationWithContainment_SourceVisble()
	 * @model
	 * @generated
	 */
	boolean isSourceVisble();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.AssociationWithContainment#isSourceVisble <em>Source Visble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Visble</em>' attribute.
	 * @see #isSourceVisble()
	 * @generated
	 */
	void setSourceVisble(boolean value);
} // AssociationWithContainment

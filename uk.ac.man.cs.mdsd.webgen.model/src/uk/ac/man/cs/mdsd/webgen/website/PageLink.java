/**
 * <copyright>
 * </copyright>
 *
 * $Id: PageLink.java,v 1.3 2013/04/23 10:31:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PageLink#getTargetPage <em>Target Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPageLink()
 * @model
 * @generated
 */
public interface PageLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Page</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Page#getChildPages <em>Child Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Page</em>' reference.
	 * @see #setTargetPage(Page)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPageLink_TargetPage()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Page#getChildPages
	 * @model opposite="childPages" required="true"
	 * @generated
	 */
	Page getTargetPage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.PageLink#getTargetPage <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Page</em>' reference.
	 * @see #getTargetPage()
	 * @generated
	 */
	void setTargetPage(Page value);

} // PageLink

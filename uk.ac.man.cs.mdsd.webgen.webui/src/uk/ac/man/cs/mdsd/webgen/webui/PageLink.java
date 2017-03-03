/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.PageLink#getTargetPage <em>Target Page</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPageLink()
 * @model
 * @generated
 */
public interface PageLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Page</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getChildPages <em>Child Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Page</em>' reference.
	 * @see #setTargetPage(Page)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPageLink_TargetPage()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getChildPages
	 * @model opposite="childPages" required="true"
	 * @generated
	 */
	Page getTargetPage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.PageLink#getTargetPage <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Page</em>' reference.
	 * @see #getTargetPage()
	 * @generated
	 */
	void setTargetPage(Page value);

} // PageLink

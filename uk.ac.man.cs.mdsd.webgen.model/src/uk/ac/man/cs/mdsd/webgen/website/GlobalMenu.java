/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.GlobalMenu#getMenuFor <em>Menu For</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getGlobalMenu()
 * @model abstract="true"
 * @generated
 */
public interface GlobalMenu extends Menu {
	/**
	 * Returns the value of the '<em><b>Menu For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getGlobalMenu <em>Global Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu For</em>' reference.
	 * @see #setMenuFor(WebGenModel)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getGlobalMenu_MenuFor()
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getGlobalMenu
	 * @model opposite="globalMenu" required="true"
	 * @generated
	 */
	WebGenModel getMenuFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.GlobalMenu#getMenuFor <em>Menu For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu For</em>' reference.
	 * @see #getMenuFor()
	 * @generated
	 */
	void setMenuFor(WebGenModel value);

} // GlobalMenu

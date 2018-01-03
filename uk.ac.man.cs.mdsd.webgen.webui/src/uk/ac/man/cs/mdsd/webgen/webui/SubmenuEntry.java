/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submenu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.SubmenuEntry#getSubmenu <em>Submenu</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSubmenuEntry()
 * @model
 * @generated
 */
public interface SubmenuEntry extends MenuEntry, NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Submenu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submenu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submenu</em>' containment reference.
	 * @see #setSubmenu(Menu)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSubmenuEntry_Submenu()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Menu getSubmenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.SubmenuEntry#getSubmenu <em>Submenu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submenu</em>' containment reference.
	 * @see #getSubmenu()
	 * @generated
	 */
	void setSubmenu(Menu value);

} // SubmenuEntry

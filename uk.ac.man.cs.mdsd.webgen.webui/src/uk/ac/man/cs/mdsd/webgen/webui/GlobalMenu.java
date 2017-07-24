/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.GlobalMenu#getWebUI <em>Web UI</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getGlobalMenu()
 * @model
 * @generated
 */
public interface GlobalMenu extends Menu {

	/**
	 * Returns the value of the '<em><b>Web UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getGlobalMenus <em>Global Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web UI</em>' container reference.
	 * @see #setWebUI(WebUI)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getGlobalMenu_WebUI()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebUI#getGlobalMenus
	 * @model opposite="globalMenus" required="true" transient="false"
	 * @generated
	 */
	WebUI getWebUI();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.GlobalMenu#getWebUI <em>Web UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web UI</em>' container reference.
	 * @see #getWebUI()
	 * @generated
	 */
	void setWebUI(WebUI value);

} // GlobalMenu

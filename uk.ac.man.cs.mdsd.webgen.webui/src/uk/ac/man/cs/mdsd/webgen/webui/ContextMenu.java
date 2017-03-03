/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ContextMenu#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getContextMenu()
 * @model abstract="true"
 * @generated
 */
public interface ContextMenu extends Menu {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getSideMenu <em>Side Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Page)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getContextMenu_Context()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getSideMenu
	 * @model opposite="sideMenu" required="true"
	 * @generated
	 */
	Page getContext();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ContextMenu#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Page value);

} // ContextMenu

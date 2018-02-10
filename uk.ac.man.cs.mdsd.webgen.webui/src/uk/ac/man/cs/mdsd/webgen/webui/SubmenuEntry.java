/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submenu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.SubmenuEntry#getRequiresRole <em>Requires Role</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSubmenuEntry()
 * @model
 * @generated
 */
public interface SubmenuEntry extends Menu, MenuEntry {

	/**
	 * Returns the value of the '<em><b>Requires Role</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Role</em>' attribute.
	 * @see #setRequiresRole(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSubmenuEntry_RequiresRole()
	 * @model default=""
	 * @generated
	 */
	String getRequiresRole();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.SubmenuEntry#getRequiresRole <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Role</em>' attribute.
	 * @see #getRequiresRole()
	 * @generated
	 */
	void setRequiresRole(String value);

} // SubmenuEntry

/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getEntries <em>Entries</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getLayoutClass <em>Layout Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getMenu()
 * @model abstract="true"
 * @generated
 */
public interface Menu extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.webui.MenuEntry}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.MenuEntry#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getMenu_Entries()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MenuEntry#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<MenuEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Caption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Caption</em>' attribute.
	 * @see #setOmitCaption(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getMenu_OmitCaption()
	 * @model
	 * @generated
	 */
	boolean isOmitCaption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#isOmitCaption <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Caption</em>' attribute.
	 * @see #isOmitCaption()
	 * @generated
	 */
	void setOmitCaption(boolean value);

	/**
	 * Returns the value of the '<em><b>Caption Class</b></em>' attribute.
	 * The default value is <code>"menu_caption"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Class</em>' attribute.
	 * @see #setCaptionClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getMenu_CaptionClass()
	 * @model default="menu_caption"
	 * @generated
	 */
	String getCaptionClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getCaptionClass <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Class</em>' attribute.
	 * @see #getCaptionClass()
	 * @generated
	 */
	void setCaptionClass(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"menu"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getMenu_StyleClass()
	 * @model default="menu" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Layout Class</b></em>' attribute.
	 * The default value is <code>"menu_content"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Class</em>' attribute.
	 * @see #setLayoutClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getMenu_LayoutClass()
	 * @model default="menu_content" ordered="false"
	 * @generated
	 */
	String getLayoutClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getLayoutClass <em>Layout Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Class</em>' attribute.
	 * @see #getLayoutClass()
	 * @generated
	 */
	void setLayoutClass(String value);

} // Menu

/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import uk.ac.man.cs.mdsd.webgen.service.Services;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getGlobalMenu <em>Global Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI()
 * @model
 * @generated
 */
public interface WebUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference.
	 * @see #setServices(Services)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_Services()
	 * @model
	 * @generated
	 */
	Services getServices();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getServices <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Services value);

	/**
	 * Returns the value of the '<em><b>Global Menu</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.GlobalMenu#getWebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Menu</em>' reference.
	 * @see #setGlobalMenu(GlobalMenu)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_GlobalMenu()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.GlobalMenu#getWebUI
	 * @model opposite="webUI"
	 * @generated
	 */
	GlobalMenu getGlobalMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getGlobalMenu <em>Global Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Menu</em>' reference.
	 * @see #getGlobalMenu()
	 * @generated
	 */
	void setGlobalMenu(GlobalMenu value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.webui.Page}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getWebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_Pages()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getWebUI
	 * @model opposite="webUI" containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.webui.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenus();

} // WebUI

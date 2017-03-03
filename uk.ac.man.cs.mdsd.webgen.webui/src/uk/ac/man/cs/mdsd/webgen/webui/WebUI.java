/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.webgen.service.Service;

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
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI()
 * @model
 * @generated
 */
public interface WebUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_Services()
	 * @model
	 * @generated
	 */
	EList<Service> getServices();

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
	 * Returns the value of the '<em><b>Pages</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.webui.Page}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getWebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_Pages()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getWebUI
	 * @model opposite="webUI"
	 * @generated
	 */
	EList<Page> getPages();

} // WebUI

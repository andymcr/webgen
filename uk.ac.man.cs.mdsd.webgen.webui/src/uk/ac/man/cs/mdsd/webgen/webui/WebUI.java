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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getGlobalMenu <em>Global Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getAjaxTechnology <em>Ajax Technology</em>}</li>
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
	 * Returns the value of the '<em><b>Default Date Format</b></em>' attribute.
	 * The default value is <code>"jS F Y"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Date Format</em>' attribute.
	 * @see #setDefaultDateFormat(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_DefaultDateFormat()
	 * @model default="jS F Y" ordered="false"
	 * @generated
	 */
	String getDefaultDateFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultDateFormat <em>Default Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Date Format</em>' attribute.
	 * @see #getDefaultDateFormat()
	 * @generated
	 */
	void setDefaultDateFormat(String value);

	/**
	 * Returns the value of the '<em><b>Default Time Format</b></em>' attribute.
	 * The default value is <code>"G.i"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Time Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Time Format</em>' attribute.
	 * @see #setDefaultTimeFormat(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_DefaultTimeFormat()
	 * @model default="G.i" ordered="false"
	 * @generated
	 */
	String getDefaultTimeFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultTimeFormat <em>Default Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Time Format</em>' attribute.
	 * @see #getDefaultTimeFormat()
	 * @generated
	 */
	void setDefaultTimeFormat(String value);

	/**
	 * Returns the value of the '<em><b>Default Date Time Format</b></em>' attribute.
	 * The default value is <code>"jS F Y G.i"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Date Time Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Date Time Format</em>' attribute.
	 * @see #setDefaultDateTimeFormat(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_DefaultDateTimeFormat()
	 * @model default="jS F Y G.i" ordered="false"
	 * @generated
	 */
	String getDefaultDateTimeFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultDateTimeFormat <em>Default Date Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Date Time Format</em>' attribute.
	 * @see #getDefaultDateTimeFormat()
	 * @generated
	 */
	void setDefaultDateTimeFormat(String value);

	/**
	 * Returns the value of the '<em><b>Default Maximum Upload Size</b></em>' attribute.
	 * The default value is <code>"2000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Maximum Upload Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Maximum Upload Size</em>' attribute.
	 * @see #setDefaultMaximumUploadSize(int)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_DefaultMaximumUploadSize()
	 * @model default="2000000" ordered="false"
	 * @generated
	 */
	int getDefaultMaximumUploadSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Maximum Upload Size</em>' attribute.
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 */
	void setDefaultMaximumUploadSize(int value);

	/**
	 * Returns the value of the '<em><b>Input Technology</b></em>' attribute.
	 * The default value is <code>"Html"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.webui.InputTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InputTechnologies
	 * @see #setInputTechnology(InputTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_InputTechnology()
	 * @model default="Html"
	 * @generated
	 */
	InputTechnologies getInputTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getInputTechnology <em>Input Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InputTechnologies
	 * @see #getInputTechnology()
	 * @generated
	 */
	void setInputTechnology(InputTechnologies value);

	/**
	 * Returns the value of the '<em><b>Ajax Technology</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.webui.AjaxTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AjaxTechnologies
	 * @see #setAjaxTechnology(AjaxTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getWebUI_AjaxTechnology()
	 * @model default="None"
	 * @generated
	 */
	AjaxTechnologies getAjaxTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getAjaxTechnology <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AjaxTechnologies
	 * @see #getAjaxTechnology()
	 * @generated
	 */
	void setAjaxTechnology(AjaxTechnologies value);

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

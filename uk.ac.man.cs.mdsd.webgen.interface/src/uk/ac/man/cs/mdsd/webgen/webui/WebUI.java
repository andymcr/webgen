/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getAjaxTechnology <em>Ajax Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#isResponsiveTopMenu <em>Responsive Top Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getSiteTemplate <em>Site Template</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getTextEditorURL <em>Text Editor URL</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='pageNameUnique menuNameUnique '"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL pageNameUnique='pages->isUnique(name)' menuNameUnique='menus->isUnique(name)'"
 * @generated
 */
public interface WebUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.webui.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.webui.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenus();

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_InputTechnology()
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_AjaxTechnology()
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_DefaultDateFormat()
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_DefaultTimeFormat()
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_DefaultDateTimeFormat()
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_DefaultMaximumUploadSize()
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
	 * Returns the value of the '<em><b>Responsive Top Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsive Top Menu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsive Top Menu</em>' attribute.
	 * @see #setResponsiveTopMenu(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_ResponsiveTopMenu()
	 * @model
	 * @generated
	 */
	boolean isResponsiveTopMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#isResponsiveTopMenu <em>Responsive Top Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsive Top Menu</em>' attribute.
	 * @see #isResponsiveTopMenu()
	 * @generated
	 */
	void setResponsiveTopMenu(boolean value);

	/**
	 * Returns the value of the '<em><b>Top Navigation Id</b></em>' attribute.
	 * The default value is <code>"topnav"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Navigation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Navigation Id</em>' attribute.
	 * @see #setTopNavigationId(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_TopNavigationId()
	 * @model default="topnav" required="true" ordered="false"
	 * @generated
	 */
	String getTopNavigationId();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getTopNavigationId <em>Top Navigation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Navigation Id</em>' attribute.
	 * @see #getTopNavigationId()
	 * @generated
	 */
	void setTopNavigationId(String value);

	/**
	 * Returns the value of the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Menu</em>' reference.
	 * @see #setSideMenu(Menu)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_SideMenu()
	 * @model ordered="false"
	 * @generated
	 */
	Menu getSideMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getSideMenu <em>Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Menu</em>' reference.
	 * @see #getSideMenu()
	 * @generated
	 */
	void setSideMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Site Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Template</em>' attribute.
	 * @see #setSiteTemplate(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_SiteTemplate()
	 * @model
	 * @generated
	 */
	String getSiteTemplate();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getSiteTemplate <em>Site Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Template</em>' attribute.
	 * @see #getSiteTemplate()
	 * @generated
	 */
	void setSiteTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Static Units Editable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Units Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Units Editable</em>' attribute.
	 * @see #setStaticUnitsEditable(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_StaticUnitsEditable()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isStaticUnitsEditable();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#isStaticUnitsEditable <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Units Editable</em>' attribute.
	 * @see #isStaticUnitsEditable()
	 * @generated
	 */
	void setStaticUnitsEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Text Editor URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Editor URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Editor URL</em>' attribute.
	 * @see #setTextEditorURL(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getWebUI_TextEditorURL()
	 * @model
	 * @generated
	 */
	String getTextEditorURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getTextEditorURL <em>Text Editor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Editor URL</em>' attribute.
	 * @see #getTextEditorURL()
	 * @generated
	 */
	void setTextEditorURL(String value);

} // WebUI

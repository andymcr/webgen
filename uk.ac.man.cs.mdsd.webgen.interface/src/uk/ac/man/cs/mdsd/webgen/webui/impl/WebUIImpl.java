/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.webui.AjaxTechnologies;
import uk.ac.man.cs.mdsd.webgen.webui.InputTechnologies;
import uk.ac.man.cs.mdsd.webgen.webui.Menu;
import uk.ac.man.cs.mdsd.webgen.webui.Page;
import uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getAjaxTechnology <em>Ajax Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#isResponsiveTopMenu <em>Responsive Top Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getSiteTemplate <em>Site Template</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getTextEditorURL <em>Text Editor URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebUIImpl extends MinimalEObjectImpl.Container implements WebUI {
	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menus;

	/**
	 * The default value of the '{@link #getInputTechnology() <em>Input Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final InputTechnologies INPUT_TECHNOLOGY_EDEFAULT = InputTechnologies.HTML;

	/**
	 * The cached value of the '{@link #getInputTechnology() <em>Input Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTechnology()
	 * @generated
	 * @ordered
	 */
	protected InputTechnologies inputTechnology = INPUT_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAjaxTechnology() <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final AjaxTechnologies AJAX_TECHNOLOGY_EDEFAULT = AjaxTechnologies.NONE;

	/**
	 * The cached value of the '{@link #getAjaxTechnology() <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxTechnology()
	 * @generated
	 * @ordered
	 */
	protected AjaxTechnologies ajaxTechnology = AJAX_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDateFormat() <em>Default Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DATE_FORMAT_EDEFAULT = "jS F Y";

	/**
	 * The cached value of the '{@link #getDefaultDateFormat() <em>Default Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateFormat()
	 * @generated
	 * @ordered
	 */
	protected String defaultDateFormat = DEFAULT_DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTimeFormat() <em>Default Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TIME_FORMAT_EDEFAULT = "G.i";

	/**
	 * The cached value of the '{@link #getDefaultTimeFormat() <em>Default Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected String defaultTimeFormat = DEFAULT_TIME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDateTimeFormat() <em>Default Date Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DATE_TIME_FORMAT_EDEFAULT = "jS F Y G.i";

	/**
	 * The cached value of the '{@link #getDefaultDateTimeFormat() <em>Default Date Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected String defaultDateTimeFormat = DEFAULT_DATE_TIME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultMaximumUploadSize() <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT = 2000000;

	/**
	 * The cached value of the '{@link #getDefaultMaximumUploadSize() <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected int defaultMaximumUploadSize = DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isResponsiveTopMenu() <em>Responsive Top Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResponsiveTopMenu()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESPONSIVE_TOP_MENU_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResponsiveTopMenu() <em>Responsive Top Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResponsiveTopMenu()
	 * @generated
	 * @ordered
	 */
	protected boolean responsiveTopMenu = RESPONSIVE_TOP_MENU_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopNavigationId() <em>Top Navigation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopNavigationId()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_NAVIGATION_ID_EDEFAULT = "topnav";

	/**
	 * The cached value of the '{@link #getTopNavigationId() <em>Top Navigation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopNavigationId()
	 * @generated
	 * @ordered
	 */
	protected String topNavigationId = TOP_NAVIGATION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSideMenu() <em>Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideMenu()
	 * @generated
	 * @ordered
	 */
	protected Menu sideMenu;

	/**
	 * The default value of the '{@link #getSiteTemplate() <em>Site Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteTemplate() <em>Site Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteTemplate()
	 * @generated
	 * @ordered
	 */
	protected String siteTemplate = SITE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStaticUnitsEditable() <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticUnitsEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_UNITS_EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStaticUnitsEditable() <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticUnitsEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean staticUnitsEditable = STATIC_UNITS_EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextEditorURL() <em>Text Editor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEditorURL()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDITOR_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextEditorURL() <em>Text Editor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEditorURL()
	 * @generated
	 * @ordered
	 */
	protected String textEditorURL = TEXT_EDITOR_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebGenWebUIPackage.Literals.WEB_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, WebGenWebUIPackage.WEB_UI__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, WebGenWebUIPackage.WEB_UI__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputTechnologies getInputTechnology() {
		return inputTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputTechnology(InputTechnologies newInputTechnology) {
		InputTechnologies oldInputTechnology = inputTechnology;
		inputTechnology = newInputTechnology == null ? INPUT_TECHNOLOGY_EDEFAULT : newInputTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__INPUT_TECHNOLOGY, oldInputTechnology, inputTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjaxTechnologies getAjaxTechnology() {
		return ajaxTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAjaxTechnology(AjaxTechnologies newAjaxTechnology) {
		AjaxTechnologies oldAjaxTechnology = ajaxTechnology;
		ajaxTechnology = newAjaxTechnology == null ? AJAX_TECHNOLOGY_EDEFAULT : newAjaxTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__AJAX_TECHNOLOGY, oldAjaxTechnology, ajaxTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultDateFormat() {
		return defaultDateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultDateFormat(String newDefaultDateFormat) {
		String oldDefaultDateFormat = defaultDateFormat;
		defaultDateFormat = newDefaultDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__DEFAULT_DATE_FORMAT, oldDefaultDateFormat, defaultDateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultTimeFormat() {
		return defaultTimeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultTimeFormat(String newDefaultTimeFormat) {
		String oldDefaultTimeFormat = defaultTimeFormat;
		defaultTimeFormat = newDefaultTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__DEFAULT_TIME_FORMAT, oldDefaultTimeFormat, defaultTimeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultDateTimeFormat() {
		return defaultDateTimeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultDateTimeFormat(String newDefaultDateTimeFormat) {
		String oldDefaultDateTimeFormat = defaultDateTimeFormat;
		defaultDateTimeFormat = newDefaultDateTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT, oldDefaultDateTimeFormat, defaultDateTimeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultMaximumUploadSize() {
		return defaultMaximumUploadSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultMaximumUploadSize(int newDefaultMaximumUploadSize) {
		int oldDefaultMaximumUploadSize = defaultMaximumUploadSize;
		defaultMaximumUploadSize = newDefaultMaximumUploadSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE, oldDefaultMaximumUploadSize, defaultMaximumUploadSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResponsiveTopMenu() {
		return responsiveTopMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsiveTopMenu(boolean newResponsiveTopMenu) {
		boolean oldResponsiveTopMenu = responsiveTopMenu;
		responsiveTopMenu = newResponsiveTopMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__RESPONSIVE_TOP_MENU, oldResponsiveTopMenu, responsiveTopMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopNavigationId() {
		return topNavigationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopNavigationId(String newTopNavigationId) {
		String oldTopNavigationId = topNavigationId;
		topNavigationId = newTopNavigationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__TOP_NAVIGATION_ID, oldTopNavigationId, topNavigationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getSideMenu() {
		if (sideMenu != null && sideMenu.eIsProxy()) {
			InternalEObject oldSideMenu = (InternalEObject)sideMenu;
			sideMenu = (Menu)eResolveProxy(oldSideMenu);
			if (sideMenu != oldSideMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenWebUIPackage.WEB_UI__SIDE_MENU, oldSideMenu, sideMenu));
			}
		}
		return sideMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu basicGetSideMenu() {
		return sideMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideMenu(Menu newSideMenu) {
		Menu oldSideMenu = sideMenu;
		sideMenu = newSideMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__SIDE_MENU, oldSideMenu, sideMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSiteTemplate() {
		return siteTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteTemplate(String newSiteTemplate) {
		String oldSiteTemplate = siteTemplate;
		siteTemplate = newSiteTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__SITE_TEMPLATE, oldSiteTemplate, siteTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStaticUnitsEditable() {
		return staticUnitsEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticUnitsEditable(boolean newStaticUnitsEditable) {
		boolean oldStaticUnitsEditable = staticUnitsEditable;
		staticUnitsEditable = newStaticUnitsEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__STATIC_UNITS_EDITABLE, oldStaticUnitsEditable, staticUnitsEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextEditorURL() {
		return textEditorURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEditorURL(String newTextEditorURL) {
		String oldTextEditorURL = textEditorURL;
		textEditorURL = newTextEditorURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.WEB_UI__TEXT_EDITOR_URL, oldTextEditorURL, textEditorURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebGenWebUIPackage.WEB_UI__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case WebGenWebUIPackage.WEB_UI__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebGenWebUIPackage.WEB_UI__PAGES:
				return getPages();
			case WebGenWebUIPackage.WEB_UI__MENUS:
				return getMenus();
			case WebGenWebUIPackage.WEB_UI__INPUT_TECHNOLOGY:
				return getInputTechnology();
			case WebGenWebUIPackage.WEB_UI__AJAX_TECHNOLOGY:
				return getAjaxTechnology();
			case WebGenWebUIPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				return getDefaultDateFormat();
			case WebGenWebUIPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				return getDefaultTimeFormat();
			case WebGenWebUIPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				return getDefaultDateTimeFormat();
			case WebGenWebUIPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return getDefaultMaximumUploadSize();
			case WebGenWebUIPackage.WEB_UI__RESPONSIVE_TOP_MENU:
				return isResponsiveTopMenu();
			case WebGenWebUIPackage.WEB_UI__TOP_NAVIGATION_ID:
				return getTopNavigationId();
			case WebGenWebUIPackage.WEB_UI__SIDE_MENU:
				if (resolve) return getSideMenu();
				return basicGetSideMenu();
			case WebGenWebUIPackage.WEB_UI__SITE_TEMPLATE:
				return getSiteTemplate();
			case WebGenWebUIPackage.WEB_UI__STATIC_UNITS_EDITABLE:
				return isStaticUnitsEditable();
			case WebGenWebUIPackage.WEB_UI__TEXT_EDITOR_URL:
				return getTextEditorURL();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebGenWebUIPackage.WEB_UI__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__INPUT_TECHNOLOGY:
				setInputTechnology((InputTechnologies)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__AJAX_TECHNOLOGY:
				setAjaxTechnology((AjaxTechnologies)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat((String)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat((String)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat((String)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize((Integer)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__RESPONSIVE_TOP_MENU:
				setResponsiveTopMenu((Boolean)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__TOP_NAVIGATION_ID:
				setTopNavigationId((String)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__SIDE_MENU:
				setSideMenu((Menu)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__SITE_TEMPLATE:
				setSiteTemplate((String)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__STATIC_UNITS_EDITABLE:
				setStaticUnitsEditable((Boolean)newValue);
				return;
			case WebGenWebUIPackage.WEB_UI__TEXT_EDITOR_URL:
				setTextEditorURL((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebGenWebUIPackage.WEB_UI__PAGES:
				getPages().clear();
				return;
			case WebGenWebUIPackage.WEB_UI__MENUS:
				getMenus().clear();
				return;
			case WebGenWebUIPackage.WEB_UI__INPUT_TECHNOLOGY:
				setInputTechnology(INPUT_TECHNOLOGY_EDEFAULT);
				return;
			case WebGenWebUIPackage.WEB_UI__AJAX_TECHNOLOGY:
				setAjaxTechnology(AJAX_TECHNOLOGY_EDEFAULT);
				return;
			case WebGenWebUIPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat(DEFAULT_DATE_FORMAT_EDEFAULT);
				return;
			case WebGenWebUIPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat(DEFAULT_TIME_FORMAT_EDEFAULT);
				return;
			case WebGenWebUIPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat(DEFAULT_DATE_TIME_FORMAT_EDEFAULT);
				return;
			case WebGenWebUIPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize(DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT);
				return;
			case WebGenWebUIPackage.WEB_UI__RESPONSIVE_TOP_MENU:
				setResponsiveTopMenu(RESPONSIVE_TOP_MENU_EDEFAULT);
				return;
			case WebGenWebUIPackage.WEB_UI__TOP_NAVIGATION_ID:
				setTopNavigationId(TOP_NAVIGATION_ID_EDEFAULT);
				return;
			case WebGenWebUIPackage.WEB_UI__SIDE_MENU:
				setSideMenu((Menu)null);
				return;
			case WebGenWebUIPackage.WEB_UI__SITE_TEMPLATE:
				setSiteTemplate(SITE_TEMPLATE_EDEFAULT);
				return;
			case WebGenWebUIPackage.WEB_UI__STATIC_UNITS_EDITABLE:
				setStaticUnitsEditable(STATIC_UNITS_EDITABLE_EDEFAULT);
				return;
			case WebGenWebUIPackage.WEB_UI__TEXT_EDITOR_URL:
				setTextEditorURL(TEXT_EDITOR_URL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebGenWebUIPackage.WEB_UI__PAGES:
				return pages != null && !pages.isEmpty();
			case WebGenWebUIPackage.WEB_UI__MENUS:
				return menus != null && !menus.isEmpty();
			case WebGenWebUIPackage.WEB_UI__INPUT_TECHNOLOGY:
				return inputTechnology != INPUT_TECHNOLOGY_EDEFAULT;
			case WebGenWebUIPackage.WEB_UI__AJAX_TECHNOLOGY:
				return ajaxTechnology != AJAX_TECHNOLOGY_EDEFAULT;
			case WebGenWebUIPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				return DEFAULT_DATE_FORMAT_EDEFAULT == null ? defaultDateFormat != null : !DEFAULT_DATE_FORMAT_EDEFAULT.equals(defaultDateFormat);
			case WebGenWebUIPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				return DEFAULT_TIME_FORMAT_EDEFAULT == null ? defaultTimeFormat != null : !DEFAULT_TIME_FORMAT_EDEFAULT.equals(defaultTimeFormat);
			case WebGenWebUIPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				return DEFAULT_DATE_TIME_FORMAT_EDEFAULT == null ? defaultDateTimeFormat != null : !DEFAULT_DATE_TIME_FORMAT_EDEFAULT.equals(defaultDateTimeFormat);
			case WebGenWebUIPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return defaultMaximumUploadSize != DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT;
			case WebGenWebUIPackage.WEB_UI__RESPONSIVE_TOP_MENU:
				return responsiveTopMenu != RESPONSIVE_TOP_MENU_EDEFAULT;
			case WebGenWebUIPackage.WEB_UI__TOP_NAVIGATION_ID:
				return TOP_NAVIGATION_ID_EDEFAULT == null ? topNavigationId != null : !TOP_NAVIGATION_ID_EDEFAULT.equals(topNavigationId);
			case WebGenWebUIPackage.WEB_UI__SIDE_MENU:
				return sideMenu != null;
			case WebGenWebUIPackage.WEB_UI__SITE_TEMPLATE:
				return SITE_TEMPLATE_EDEFAULT == null ? siteTemplate != null : !SITE_TEMPLATE_EDEFAULT.equals(siteTemplate);
			case WebGenWebUIPackage.WEB_UI__STATIC_UNITS_EDITABLE:
				return staticUnitsEditable != STATIC_UNITS_EDITABLE_EDEFAULT;
			case WebGenWebUIPackage.WEB_UI__TEXT_EDITOR_URL:
				return TEXT_EDITOR_URL_EDEFAULT == null ? textEditorURL != null : !TEXT_EDITOR_URL_EDEFAULT.equals(textEditorURL);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inputTechnology: ");
		result.append(inputTechnology);
		result.append(", ajaxTechnology: ");
		result.append(ajaxTechnology);
		result.append(", defaultDateFormat: ");
		result.append(defaultDateFormat);
		result.append(", defaultTimeFormat: ");
		result.append(defaultTimeFormat);
		result.append(", defaultDateTimeFormat: ");
		result.append(defaultDateTimeFormat);
		result.append(", defaultMaximumUploadSize: ");
		result.append(defaultMaximumUploadSize);
		result.append(", responsiveTopMenu: ");
		result.append(responsiveTopMenu);
		result.append(", topNavigationId: ");
		result.append(topNavigationId);
		result.append(", siteTemplate: ");
		result.append(siteTemplate);
		result.append(", staticUnitsEditable: ");
		result.append(staticUnitsEditable);
		result.append(", textEditorURL: ");
		result.append(textEditorURL);
		result.append(')');
		return result.toString();
	}

} //WebUIImpl

/**
 */
package uk.ac.man.cs.mdsd.webgen.interface_.impl;

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

import uk.ac.man.cs.mdsd.webgen.interface_.Interface;
import uk.ac.man.cs.mdsd.webgen.interface_.Menu;
import uk.ac.man.cs.mdsd.webgen.interface_.Page;
import uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#isResponsiveTopMenu <em>Responsive Top Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#getSiteTemplate <em>Site Template</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.InterfaceImpl#getTextEditorURL <em>Text Editor URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
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
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebGenInterfacePackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, WebGenInterfacePackage.INTERFACE__PAGES);
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
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, WebGenInterfacePackage.INTERFACE__MENUS);
		}
		return menus;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_FORMAT, oldDefaultDateFormat, defaultDateFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.INTERFACE__DEFAULT_TIME_FORMAT, oldDefaultTimeFormat, defaultTimeFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_TIME_FORMAT, oldDefaultDateTimeFormat, defaultDateTimeFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.INTERFACE__DEFAULT_MAXIMUM_UPLOAD_SIZE, oldDefaultMaximumUploadSize, defaultMaximumUploadSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.INTERFACE__RESPONSIVE_TOP_MENU, oldResponsiveTopMenu, responsiveTopMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.INTERFACE__TOP_NAVIGATION_ID, oldTopNavigationId, topNavigationId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenInterfacePackage.INTERFACE__SIDE_MENU, oldSideMenu, sideMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.INTERFACE__SIDE_MENU, oldSideMenu, sideMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.INTERFACE__SITE_TEMPLATE, oldSiteTemplate, siteTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.INTERFACE__STATIC_UNITS_EDITABLE, oldStaticUnitsEditable, staticUnitsEditable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.INTERFACE__TEXT_EDITOR_URL, oldTextEditorURL, textEditorURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebGenInterfacePackage.INTERFACE__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case WebGenInterfacePackage.INTERFACE__MENUS:
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
			case WebGenInterfacePackage.INTERFACE__PAGES:
				return getPages();
			case WebGenInterfacePackage.INTERFACE__MENUS:
				return getMenus();
			case WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_FORMAT:
				return getDefaultDateFormat();
			case WebGenInterfacePackage.INTERFACE__DEFAULT_TIME_FORMAT:
				return getDefaultTimeFormat();
			case WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_TIME_FORMAT:
				return getDefaultDateTimeFormat();
			case WebGenInterfacePackage.INTERFACE__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return getDefaultMaximumUploadSize();
			case WebGenInterfacePackage.INTERFACE__RESPONSIVE_TOP_MENU:
				return isResponsiveTopMenu();
			case WebGenInterfacePackage.INTERFACE__TOP_NAVIGATION_ID:
				return getTopNavigationId();
			case WebGenInterfacePackage.INTERFACE__SIDE_MENU:
				if (resolve) return getSideMenu();
				return basicGetSideMenu();
			case WebGenInterfacePackage.INTERFACE__SITE_TEMPLATE:
				return getSiteTemplate();
			case WebGenInterfacePackage.INTERFACE__STATIC_UNITS_EDITABLE:
				return isStaticUnitsEditable();
			case WebGenInterfacePackage.INTERFACE__TEXT_EDITOR_URL:
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
			case WebGenInterfacePackage.INTERFACE__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat((String)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat((String)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat((String)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize((Integer)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__RESPONSIVE_TOP_MENU:
				setResponsiveTopMenu((Boolean)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__TOP_NAVIGATION_ID:
				setTopNavigationId((String)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__SIDE_MENU:
				setSideMenu((Menu)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__SITE_TEMPLATE:
				setSiteTemplate((String)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__STATIC_UNITS_EDITABLE:
				setStaticUnitsEditable((Boolean)newValue);
				return;
			case WebGenInterfacePackage.INTERFACE__TEXT_EDITOR_URL:
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
			case WebGenInterfacePackage.INTERFACE__PAGES:
				getPages().clear();
				return;
			case WebGenInterfacePackage.INTERFACE__MENUS:
				getMenus().clear();
				return;
			case WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat(DEFAULT_DATE_FORMAT_EDEFAULT);
				return;
			case WebGenInterfacePackage.INTERFACE__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat(DEFAULT_TIME_FORMAT_EDEFAULT);
				return;
			case WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat(DEFAULT_DATE_TIME_FORMAT_EDEFAULT);
				return;
			case WebGenInterfacePackage.INTERFACE__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize(DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT);
				return;
			case WebGenInterfacePackage.INTERFACE__RESPONSIVE_TOP_MENU:
				setResponsiveTopMenu(RESPONSIVE_TOP_MENU_EDEFAULT);
				return;
			case WebGenInterfacePackage.INTERFACE__TOP_NAVIGATION_ID:
				setTopNavigationId(TOP_NAVIGATION_ID_EDEFAULT);
				return;
			case WebGenInterfacePackage.INTERFACE__SIDE_MENU:
				setSideMenu((Menu)null);
				return;
			case WebGenInterfacePackage.INTERFACE__SITE_TEMPLATE:
				setSiteTemplate(SITE_TEMPLATE_EDEFAULT);
				return;
			case WebGenInterfacePackage.INTERFACE__STATIC_UNITS_EDITABLE:
				setStaticUnitsEditable(STATIC_UNITS_EDITABLE_EDEFAULT);
				return;
			case WebGenInterfacePackage.INTERFACE__TEXT_EDITOR_URL:
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
			case WebGenInterfacePackage.INTERFACE__PAGES:
				return pages != null && !pages.isEmpty();
			case WebGenInterfacePackage.INTERFACE__MENUS:
				return menus != null && !menus.isEmpty();
			case WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_FORMAT:
				return DEFAULT_DATE_FORMAT_EDEFAULT == null ? defaultDateFormat != null : !DEFAULT_DATE_FORMAT_EDEFAULT.equals(defaultDateFormat);
			case WebGenInterfacePackage.INTERFACE__DEFAULT_TIME_FORMAT:
				return DEFAULT_TIME_FORMAT_EDEFAULT == null ? defaultTimeFormat != null : !DEFAULT_TIME_FORMAT_EDEFAULT.equals(defaultTimeFormat);
			case WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_TIME_FORMAT:
				return DEFAULT_DATE_TIME_FORMAT_EDEFAULT == null ? defaultDateTimeFormat != null : !DEFAULT_DATE_TIME_FORMAT_EDEFAULT.equals(defaultDateTimeFormat);
			case WebGenInterfacePackage.INTERFACE__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return defaultMaximumUploadSize != DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT;
			case WebGenInterfacePackage.INTERFACE__RESPONSIVE_TOP_MENU:
				return responsiveTopMenu != RESPONSIVE_TOP_MENU_EDEFAULT;
			case WebGenInterfacePackage.INTERFACE__TOP_NAVIGATION_ID:
				return TOP_NAVIGATION_ID_EDEFAULT == null ? topNavigationId != null : !TOP_NAVIGATION_ID_EDEFAULT.equals(topNavigationId);
			case WebGenInterfacePackage.INTERFACE__SIDE_MENU:
				return sideMenu != null;
			case WebGenInterfacePackage.INTERFACE__SITE_TEMPLATE:
				return SITE_TEMPLATE_EDEFAULT == null ? siteTemplate != null : !SITE_TEMPLATE_EDEFAULT.equals(siteTemplate);
			case WebGenInterfacePackage.INTERFACE__STATIC_UNITS_EDITABLE:
				return staticUnitsEditable != STATIC_UNITS_EDITABLE_EDEFAULT;
			case WebGenInterfacePackage.INTERFACE__TEXT_EDITOR_URL:
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
		result.append(" (defaultDateFormat: ");
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

} //InterfaceImpl

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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.service.Services;
import uk.ac.man.cs.mdsd.webgen.webui.AjaxTechnologies;
import uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu;
import uk.ac.man.cs.mdsd.webgen.webui.GlobalMenu;
import uk.ac.man.cs.mdsd.webgen.webui.InputTechnologies;
import uk.ac.man.cs.mdsd.webgen.webui.Page;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getGlobalMenus <em>Global Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getDynamicMenus <em>Dynamic Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl#getAjaxTechnology <em>Ajax Technology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebUIImpl extends MinimalEObjectImpl.Container implements WebUI {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Services services;

	/**
	 * The cached value of the '{@link #getGlobalMenus() <em>Global Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalMenu> globalMenus;

	/**
	 * The cached value of the '{@link #getDynamicMenus() <em>Dynamic Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicMenu> dynamicMenus;

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
		return WebuiPackage.Literals.WEB_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services getServices() {
		if (services != null && services.eIsProxy()) {
			InternalEObject oldServices = (InternalEObject)services;
			services = (Services)eResolveProxy(oldServices);
			if (services != oldServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.WEB_UI__SERVICES, oldServices, services));
			}
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services basicGetServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(Services newServices) {
		Services oldServices = services;
		services = newServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__SERVICES, oldServices, services));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalMenu> getGlobalMenus() {
		if (globalMenus == null) {
			globalMenus = new EObjectContainmentWithInverseEList<GlobalMenu>(GlobalMenu.class, this, WebuiPackage.WEB_UI__GLOBAL_MENUS, WebuiPackage.GLOBAL_MENU__WEB_UI);
		}
		return globalMenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicMenu> getDynamicMenus() {
		if (dynamicMenus == null) {
			dynamicMenus = new EObjectContainmentWithInverseEList<DynamicMenu>(DynamicMenu.class, this, WebuiPackage.WEB_UI__DYNAMIC_MENUS, WebuiPackage.DYNAMIC_MENU__WEB_UI);
		}
		return dynamicMenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentWithInverseEList<Page>(Page.class, this, WebuiPackage.WEB_UI__PAGES, WebuiPackage.PAGE__WEB_UI);
		}
		return pages;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT, oldDefaultDateFormat, defaultDateFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT, oldDefaultTimeFormat, defaultTimeFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT, oldDefaultDateTimeFormat, defaultDateTimeFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE, oldDefaultMaximumUploadSize, defaultMaximumUploadSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__INPUT_TECHNOLOGY, oldInputTechnology, inputTechnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__AJAX_TECHNOLOGY, oldAjaxTechnology, ajaxTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.WEB_UI__GLOBAL_MENUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGlobalMenus()).basicAdd(otherEnd, msgs);
			case WebuiPackage.WEB_UI__DYNAMIC_MENUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDynamicMenus()).basicAdd(otherEnd, msgs);
			case WebuiPackage.WEB_UI__PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.WEB_UI__GLOBAL_MENUS:
				return ((InternalEList<?>)getGlobalMenus()).basicRemove(otherEnd, msgs);
			case WebuiPackage.WEB_UI__DYNAMIC_MENUS:
				return ((InternalEList<?>)getDynamicMenus()).basicRemove(otherEnd, msgs);
			case WebuiPackage.WEB_UI__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
			case WebuiPackage.WEB_UI__SERVICES:
				if (resolve) return getServices();
				return basicGetServices();
			case WebuiPackage.WEB_UI__GLOBAL_MENUS:
				return getGlobalMenus();
			case WebuiPackage.WEB_UI__DYNAMIC_MENUS:
				return getDynamicMenus();
			case WebuiPackage.WEB_UI__PAGES:
				return getPages();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				return getDefaultDateFormat();
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				return getDefaultTimeFormat();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				return getDefaultDateTimeFormat();
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return getDefaultMaximumUploadSize();
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				return getInputTechnology();
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				return getAjaxTechnology();
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
			case WebuiPackage.WEB_UI__SERVICES:
				setServices((Services)newValue);
				return;
			case WebuiPackage.WEB_UI__GLOBAL_MENUS:
				getGlobalMenus().clear();
				getGlobalMenus().addAll((Collection<? extends GlobalMenu>)newValue);
				return;
			case WebuiPackage.WEB_UI__DYNAMIC_MENUS:
				getDynamicMenus().clear();
				getDynamicMenus().addAll((Collection<? extends DynamicMenu>)newValue);
				return;
			case WebuiPackage.WEB_UI__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize((Integer)newValue);
				return;
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				setInputTechnology((InputTechnologies)newValue);
				return;
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				setAjaxTechnology((AjaxTechnologies)newValue);
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
			case WebuiPackage.WEB_UI__SERVICES:
				setServices((Services)null);
				return;
			case WebuiPackage.WEB_UI__GLOBAL_MENUS:
				getGlobalMenus().clear();
				return;
			case WebuiPackage.WEB_UI__DYNAMIC_MENUS:
				getDynamicMenus().clear();
				return;
			case WebuiPackage.WEB_UI__PAGES:
				getPages().clear();
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat(DEFAULT_DATE_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat(DEFAULT_TIME_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat(DEFAULT_DATE_TIME_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize(DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				setInputTechnology(INPUT_TECHNOLOGY_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				setAjaxTechnology(AJAX_TECHNOLOGY_EDEFAULT);
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
			case WebuiPackage.WEB_UI__SERVICES:
				return services != null;
			case WebuiPackage.WEB_UI__GLOBAL_MENUS:
				return globalMenus != null && !globalMenus.isEmpty();
			case WebuiPackage.WEB_UI__DYNAMIC_MENUS:
				return dynamicMenus != null && !dynamicMenus.isEmpty();
			case WebuiPackage.WEB_UI__PAGES:
				return pages != null && !pages.isEmpty();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				return DEFAULT_DATE_FORMAT_EDEFAULT == null ? defaultDateFormat != null : !DEFAULT_DATE_FORMAT_EDEFAULT.equals(defaultDateFormat);
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				return DEFAULT_TIME_FORMAT_EDEFAULT == null ? defaultTimeFormat != null : !DEFAULT_TIME_FORMAT_EDEFAULT.equals(defaultTimeFormat);
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				return DEFAULT_DATE_TIME_FORMAT_EDEFAULT == null ? defaultDateTimeFormat != null : !DEFAULT_DATE_TIME_FORMAT_EDEFAULT.equals(defaultDateTimeFormat);
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return defaultMaximumUploadSize != DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT;
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				return inputTechnology != INPUT_TECHNOLOGY_EDEFAULT;
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				return ajaxTechnology != AJAX_TECHNOLOGY_EDEFAULT;
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
		result.append(", inputTechnology: ");
		result.append(inputTechnology);
		result.append(", ajaxTechnology: ");
		result.append(ajaxTechnology);
		result.append(')');
		return result.toString();
	}

} //WebUIImpl

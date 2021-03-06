/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.api.API;

import uk.ac.man.cs.mdsd.orm.OrmModel;

import uk.ac.man.cs.mdsd.service.ServiceModel;

import uk.ac.man.cs.mdsd.waf.AjaxTechnologies;
import uk.ac.man.cs.mdsd.waf.Authentication;
import uk.ac.man.cs.mdsd.waf.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.waf.ImageManipulation;
import uk.ac.man.cs.mdsd.waf.InputTechnologies;
import uk.ac.man.cs.mdsd.waf.Menu;
import uk.ac.man.cs.mdsd.waf.Page;
import uk.ac.man.cs.mdsd.waf.WafModel;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getBusiness <em>Business</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getImageManipulations <em>Image Manipulations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getApi <em>Api</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getLogoImage <em>Logo Image</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getLogoFilters <em>Logo Filters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#isUseDbSessionStorage <em>Use Db Session Storage</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getAjaxTechnology <em>Ajax Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getCaptchaSiteKey <em>Captcha Site Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getCaptchaSecretKey <em>Captcha Secret Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getTextEditorURL <em>Text Editor URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#getSiteTemplate <em>Site Template</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WafModelImpl extends MinimalEObjectImpl.Container implements WafModel {
	/**
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected OrmModel persistence;

	/**
	 * The cached value of the '{@link #getBusiness() <em>Business</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusiness()
	 * @generated
	 * @ordered
	 */
	protected ServiceModel business;

	/**
	 * The cached value of the '{@link #getImageManipulations() <em>Image Manipulations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageManipulations()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageManipulation> imageManipulations;

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
	 * The cached value of the '{@link #getApi() <em>Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected API api;

	/**
	 * The default value of the '{@link #getSiteName() <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteName()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteName() <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteName()
	 * @generated
	 * @ordered
	 */
	protected String siteName = SITE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiteTitle() <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteTitle() <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteTitle()
	 * @generated
	 * @ordered
	 */
	protected String siteTitle = SITE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebmasterEmail() <em>Webmaster Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebmasterEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBMASTER_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebmasterEmail() <em>Webmaster Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebmasterEmail()
	 * @generated
	 * @ordered
	 */
	protected String webmasterEmail = WEBMASTER_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected String copyrightText = COPYRIGHT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaDescription() <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String META_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaDescription() <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDescription()
	 * @generated
	 * @ordered
	 */
	protected String metaDescription = META_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogoImage() <em>Logo Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoImage()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGO_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogoImage() <em>Logo Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoImage()
	 * @generated
	 * @ordered
	 */
	protected String logoImage = LOGO_IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogoFilters() <em>Logo Filters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoFilters()
	 * @generated
	 * @ordered
	 */
	protected ImageManipulation logoFilters;

	/**
	 * The default value of the '{@link #getFrameworkTechnology() <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final FrameworkTechnologies FRAMEWORK_TECHNOLOGY_EDEFAULT = FrameworkTechnologies.JSF;

	/**
	 * The cached value of the '{@link #getFrameworkTechnology() <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkTechnology()
	 * @generated
	 * @ordered
	 */
	protected FrameworkTechnologies frameworkTechnology = FRAMEWORK_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseDbSessionStorage() <em>Use Db Session Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDbSessionStorage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_DB_SESSION_STORAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseDbSessionStorage() <em>Use Db Session Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDbSessionStorage()
	 * @generated
	 * @ordered
	 */
	protected boolean useDbSessionStorage = USE_DB_SESSION_STORAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected Authentication authentication;

	/**
	 * The default value of the '{@link #getCaptchaSiteKey() <em>Captcha Site Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptchaSiteKey()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTCHA_SITE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptchaSiteKey() <em>Captcha Site Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptchaSiteKey()
	 * @generated
	 * @ordered
	 */
	protected String captchaSiteKey = CAPTCHA_SITE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptchaSecretKey() <em>Captcha Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptchaSecretKey()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTCHA_SECRET_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptchaSecretKey() <em>Captcha Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptchaSecretKey()
	 * @generated
	 * @ordered
	 */
	protected String captchaSecretKey = CAPTCHA_SECRET_KEY_EDEFAULT;

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
	 * The default value of the '{@link #getTopNavigationId() <em>Top Navigation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopNavigationId()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_NAVIGATION_ID_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WafModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.WAF_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmModel getPersistence() {
		if (persistence != null && persistence.eIsProxy()) {
			InternalEObject oldPersistence = (InternalEObject)persistence;
			persistence = (OrmModel)eResolveProxy(oldPersistence);
			if (persistence != oldPersistence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.WAF_MODEL__PERSISTENCE, oldPersistence, persistence));
			}
		}
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmModel basicGetPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistence(OrmModel newPersistence) {
		OrmModel oldPersistence = persistence;
		persistence = newPersistence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__PERSISTENCE, oldPersistence, persistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceModel getBusiness() {
		if (business != null && business.eIsProxy()) {
			InternalEObject oldBusiness = (InternalEObject)business;
			business = (ServiceModel)eResolveProxy(oldBusiness);
			if (business != oldBusiness) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.WAF_MODEL__BUSINESS, oldBusiness, business));
			}
		}
		return business;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceModel basicGetBusiness() {
		return business;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusiness(ServiceModel newBusiness) {
		ServiceModel oldBusiness = business;
		business = newBusiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__BUSINESS, oldBusiness, business));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageManipulation> getImageManipulations() {
		if (imageManipulations == null) {
			imageManipulations = new EObjectContainmentEList<ImageManipulation>(ImageManipulation.class, this, WafPackage.WAF_MODEL__IMAGE_MANIPULATIONS);
		}
		return imageManipulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentWithInverseEList<Page>(Page.class, this, WafPackage.WAF_MODEL__PAGES, WafPackage.PAGE__PART_OF);
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
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, WafPackage.WAF_MODEL__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API getApi() {
		if (api != null && api.eIsProxy()) {
			InternalEObject oldApi = (InternalEObject)api;
			api = (API)eResolveProxy(oldApi);
			if (api != oldApi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.WAF_MODEL__API, oldApi, api));
			}
		}
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API basicGetApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(API newApi) {
		API oldApi = api;
		api = newApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__API, oldApi, api));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteName(String newSiteName) {
		String oldSiteName = siteName;
		siteName = newSiteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__SITE_NAME, oldSiteName, siteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSiteTitle() {
		return siteTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteTitle(String newSiteTitle) {
		String oldSiteTitle = siteTitle;
		siteTitle = newSiteTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__SITE_TITLE, oldSiteTitle, siteTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebmasterEmail() {
		return webmasterEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebmasterEmail(String newWebmasterEmail) {
		String oldWebmasterEmail = webmasterEmail;
		webmasterEmail = newWebmasterEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__WEBMASTER_EMAIL, oldWebmasterEmail, webmasterEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyrightText() {
		return copyrightText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyrightText(String newCopyrightText) {
		String oldCopyrightText = copyrightText;
		copyrightText = newCopyrightText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__COPYRIGHT_TEXT, oldCopyrightText, copyrightText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaDescription() {
		return metaDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaDescription(String newMetaDescription) {
		String oldMetaDescription = metaDescription;
		metaDescription = newMetaDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__META_DESCRIPTION, oldMetaDescription, metaDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogoImage() {
		return logoImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogoImage(String newLogoImage) {
		String oldLogoImage = logoImage;
		logoImage = newLogoImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__LOGO_IMAGE, oldLogoImage, logoImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation getLogoFilters() {
		if (logoFilters != null && logoFilters.eIsProxy()) {
			InternalEObject oldLogoFilters = (InternalEObject)logoFilters;
			logoFilters = (ImageManipulation)eResolveProxy(oldLogoFilters);
			if (logoFilters != oldLogoFilters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.WAF_MODEL__LOGO_FILTERS, oldLogoFilters, logoFilters));
			}
		}
		return logoFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation basicGetLogoFilters() {
		return logoFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogoFilters(ImageManipulation newLogoFilters) {
		ImageManipulation oldLogoFilters = logoFilters;
		logoFilters = newLogoFilters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__LOGO_FILTERS, oldLogoFilters, logoFilters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkTechnologies getFrameworkTechnology() {
		return frameworkTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameworkTechnology(FrameworkTechnologies newFrameworkTechnology) {
		FrameworkTechnologies oldFrameworkTechnology = frameworkTechnology;
		frameworkTechnology = newFrameworkTechnology == null ? FRAMEWORK_TECHNOLOGY_EDEFAULT : newFrameworkTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__FRAMEWORK_TECHNOLOGY, oldFrameworkTechnology, frameworkTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseDbSessionStorage() {
		return useDbSessionStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDbSessionStorage(boolean newUseDbSessionStorage) {
		boolean oldUseDbSessionStorage = useDbSessionStorage;
		useDbSessionStorage = newUseDbSessionStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__USE_DB_SESSION_STORAGE, oldUseDbSessionStorage, useDbSessionStorage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__INPUT_TECHNOLOGY, oldInputTechnology, inputTechnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__AJAX_TECHNOLOGY, oldAjaxTechnology, ajaxTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication getAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthentication(Authentication newAuthentication, NotificationChain msgs) {
		Authentication oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__AUTHENTICATION, oldAuthentication, newAuthentication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(Authentication newAuthentication) {
		if (newAuthentication != authentication) {
			NotificationChain msgs = null;
			if (authentication != null)
				msgs = ((InternalEObject)authentication).eInverseRemove(this, WafPackage.AUTHENTICATION__AUTHORISES, Authentication.class, msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, WafPackage.AUTHENTICATION__AUTHORISES, Authentication.class, msgs);
			msgs = basicSetAuthentication(newAuthentication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__AUTHENTICATION, newAuthentication, newAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptchaSiteKey() {
		return captchaSiteKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptchaSiteKey(String newCaptchaSiteKey) {
		String oldCaptchaSiteKey = captchaSiteKey;
		captchaSiteKey = newCaptchaSiteKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__CAPTCHA_SITE_KEY, oldCaptchaSiteKey, captchaSiteKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptchaSecretKey() {
		return captchaSecretKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptchaSecretKey(String newCaptchaSecretKey) {
		String oldCaptchaSecretKey = captchaSecretKey;
		captchaSecretKey = newCaptchaSecretKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__CAPTCHA_SECRET_KEY, oldCaptchaSecretKey, captchaSecretKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__TEXT_EDITOR_URL, oldTextEditorURL, textEditorURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__TOP_NAVIGATION_ID, oldTopNavigationId, topNavigationId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.WAF_MODEL__SIDE_MENU, oldSideMenu, sideMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__SIDE_MENU, oldSideMenu, sideMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__SITE_TEMPLATE, oldSiteTemplate, siteTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.WAF_MODEL__STATIC_UNITS_EDITABLE, oldStaticUnitsEditable, staticUnitsEditable));
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
			case WafPackage.WAF_MODEL__PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPages()).basicAdd(otherEnd, msgs);
			case WafPackage.WAF_MODEL__AUTHENTICATION:
				if (authentication != null)
					msgs = ((InternalEObject)authentication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.WAF_MODEL__AUTHENTICATION, null, msgs);
				return basicSetAuthentication((Authentication)otherEnd, msgs);
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
			case WafPackage.WAF_MODEL__IMAGE_MANIPULATIONS:
				return ((InternalEList<?>)getImageManipulations()).basicRemove(otherEnd, msgs);
			case WafPackage.WAF_MODEL__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case WafPackage.WAF_MODEL__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
			case WafPackage.WAF_MODEL__AUTHENTICATION:
				return basicSetAuthentication(null, msgs);
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
			case WafPackage.WAF_MODEL__PERSISTENCE:
				if (resolve) return getPersistence();
				return basicGetPersistence();
			case WafPackage.WAF_MODEL__BUSINESS:
				if (resolve) return getBusiness();
				return basicGetBusiness();
			case WafPackage.WAF_MODEL__IMAGE_MANIPULATIONS:
				return getImageManipulations();
			case WafPackage.WAF_MODEL__PAGES:
				return getPages();
			case WafPackage.WAF_MODEL__MENUS:
				return getMenus();
			case WafPackage.WAF_MODEL__API:
				if (resolve) return getApi();
				return basicGetApi();
			case WafPackage.WAF_MODEL__SITE_NAME:
				return getSiteName();
			case WafPackage.WAF_MODEL__SITE_TITLE:
				return getSiteTitle();
			case WafPackage.WAF_MODEL__WEBMASTER_EMAIL:
				return getWebmasterEmail();
			case WafPackage.WAF_MODEL__COPYRIGHT_TEXT:
				return getCopyrightText();
			case WafPackage.WAF_MODEL__META_DESCRIPTION:
				return getMetaDescription();
			case WafPackage.WAF_MODEL__LOGO_IMAGE:
				return getLogoImage();
			case WafPackage.WAF_MODEL__LOGO_FILTERS:
				if (resolve) return getLogoFilters();
				return basicGetLogoFilters();
			case WafPackage.WAF_MODEL__FRAMEWORK_TECHNOLOGY:
				return getFrameworkTechnology();
			case WafPackage.WAF_MODEL__USE_DB_SESSION_STORAGE:
				return isUseDbSessionStorage();
			case WafPackage.WAF_MODEL__INPUT_TECHNOLOGY:
				return getInputTechnology();
			case WafPackage.WAF_MODEL__AJAX_TECHNOLOGY:
				return getAjaxTechnology();
			case WafPackage.WAF_MODEL__AUTHENTICATION:
				return getAuthentication();
			case WafPackage.WAF_MODEL__CAPTCHA_SITE_KEY:
				return getCaptchaSiteKey();
			case WafPackage.WAF_MODEL__CAPTCHA_SECRET_KEY:
				return getCaptchaSecretKey();
			case WafPackage.WAF_MODEL__TEXT_EDITOR_URL:
				return getTextEditorURL();
			case WafPackage.WAF_MODEL__TOP_NAVIGATION_ID:
				return getTopNavigationId();
			case WafPackage.WAF_MODEL__SIDE_MENU:
				if (resolve) return getSideMenu();
				return basicGetSideMenu();
			case WafPackage.WAF_MODEL__SITE_TEMPLATE:
				return getSiteTemplate();
			case WafPackage.WAF_MODEL__STATIC_UNITS_EDITABLE:
				return isStaticUnitsEditable();
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
			case WafPackage.WAF_MODEL__PERSISTENCE:
				setPersistence((OrmModel)newValue);
				return;
			case WafPackage.WAF_MODEL__BUSINESS:
				setBusiness((ServiceModel)newValue);
				return;
			case WafPackage.WAF_MODEL__IMAGE_MANIPULATIONS:
				getImageManipulations().clear();
				getImageManipulations().addAll((Collection<? extends ImageManipulation>)newValue);
				return;
			case WafPackage.WAF_MODEL__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WafPackage.WAF_MODEL__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case WafPackage.WAF_MODEL__API:
				setApi((API)newValue);
				return;
			case WafPackage.WAF_MODEL__SITE_NAME:
				setSiteName((String)newValue);
				return;
			case WafPackage.WAF_MODEL__SITE_TITLE:
				setSiteTitle((String)newValue);
				return;
			case WafPackage.WAF_MODEL__WEBMASTER_EMAIL:
				setWebmasterEmail((String)newValue);
				return;
			case WafPackage.WAF_MODEL__COPYRIGHT_TEXT:
				setCopyrightText((String)newValue);
				return;
			case WafPackage.WAF_MODEL__META_DESCRIPTION:
				setMetaDescription((String)newValue);
				return;
			case WafPackage.WAF_MODEL__LOGO_IMAGE:
				setLogoImage((String)newValue);
				return;
			case WafPackage.WAF_MODEL__LOGO_FILTERS:
				setLogoFilters((ImageManipulation)newValue);
				return;
			case WafPackage.WAF_MODEL__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology((FrameworkTechnologies)newValue);
				return;
			case WafPackage.WAF_MODEL__USE_DB_SESSION_STORAGE:
				setUseDbSessionStorage((Boolean)newValue);
				return;
			case WafPackage.WAF_MODEL__INPUT_TECHNOLOGY:
				setInputTechnology((InputTechnologies)newValue);
				return;
			case WafPackage.WAF_MODEL__AJAX_TECHNOLOGY:
				setAjaxTechnology((AjaxTechnologies)newValue);
				return;
			case WafPackage.WAF_MODEL__AUTHENTICATION:
				setAuthentication((Authentication)newValue);
				return;
			case WafPackage.WAF_MODEL__CAPTCHA_SITE_KEY:
				setCaptchaSiteKey((String)newValue);
				return;
			case WafPackage.WAF_MODEL__CAPTCHA_SECRET_KEY:
				setCaptchaSecretKey((String)newValue);
				return;
			case WafPackage.WAF_MODEL__TEXT_EDITOR_URL:
				setTextEditorURL((String)newValue);
				return;
			case WafPackage.WAF_MODEL__TOP_NAVIGATION_ID:
				setTopNavigationId((String)newValue);
				return;
			case WafPackage.WAF_MODEL__SIDE_MENU:
				setSideMenu((Menu)newValue);
				return;
			case WafPackage.WAF_MODEL__SITE_TEMPLATE:
				setSiteTemplate((String)newValue);
				return;
			case WafPackage.WAF_MODEL__STATIC_UNITS_EDITABLE:
				setStaticUnitsEditable((Boolean)newValue);
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
			case WafPackage.WAF_MODEL__PERSISTENCE:
				setPersistence((OrmModel)null);
				return;
			case WafPackage.WAF_MODEL__BUSINESS:
				setBusiness((ServiceModel)null);
				return;
			case WafPackage.WAF_MODEL__IMAGE_MANIPULATIONS:
				getImageManipulations().clear();
				return;
			case WafPackage.WAF_MODEL__PAGES:
				getPages().clear();
				return;
			case WafPackage.WAF_MODEL__MENUS:
				getMenus().clear();
				return;
			case WafPackage.WAF_MODEL__API:
				setApi((API)null);
				return;
			case WafPackage.WAF_MODEL__SITE_NAME:
				setSiteName(SITE_NAME_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__SITE_TITLE:
				setSiteTitle(SITE_TITLE_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__WEBMASTER_EMAIL:
				setWebmasterEmail(WEBMASTER_EMAIL_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__COPYRIGHT_TEXT:
				setCopyrightText(COPYRIGHT_TEXT_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__META_DESCRIPTION:
				setMetaDescription(META_DESCRIPTION_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__LOGO_IMAGE:
				setLogoImage(LOGO_IMAGE_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__LOGO_FILTERS:
				setLogoFilters((ImageManipulation)null);
				return;
			case WafPackage.WAF_MODEL__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology(FRAMEWORK_TECHNOLOGY_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__USE_DB_SESSION_STORAGE:
				setUseDbSessionStorage(USE_DB_SESSION_STORAGE_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__INPUT_TECHNOLOGY:
				setInputTechnology(INPUT_TECHNOLOGY_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__AJAX_TECHNOLOGY:
				setAjaxTechnology(AJAX_TECHNOLOGY_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__AUTHENTICATION:
				setAuthentication((Authentication)null);
				return;
			case WafPackage.WAF_MODEL__CAPTCHA_SITE_KEY:
				setCaptchaSiteKey(CAPTCHA_SITE_KEY_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__CAPTCHA_SECRET_KEY:
				setCaptchaSecretKey(CAPTCHA_SECRET_KEY_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__TEXT_EDITOR_URL:
				setTextEditorURL(TEXT_EDITOR_URL_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__TOP_NAVIGATION_ID:
				setTopNavigationId(TOP_NAVIGATION_ID_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__SIDE_MENU:
				setSideMenu((Menu)null);
				return;
			case WafPackage.WAF_MODEL__SITE_TEMPLATE:
				setSiteTemplate(SITE_TEMPLATE_EDEFAULT);
				return;
			case WafPackage.WAF_MODEL__STATIC_UNITS_EDITABLE:
				setStaticUnitsEditable(STATIC_UNITS_EDITABLE_EDEFAULT);
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
			case WafPackage.WAF_MODEL__PERSISTENCE:
				return persistence != null;
			case WafPackage.WAF_MODEL__BUSINESS:
				return business != null;
			case WafPackage.WAF_MODEL__IMAGE_MANIPULATIONS:
				return imageManipulations != null && !imageManipulations.isEmpty();
			case WafPackage.WAF_MODEL__PAGES:
				return pages != null && !pages.isEmpty();
			case WafPackage.WAF_MODEL__MENUS:
				return menus != null && !menus.isEmpty();
			case WafPackage.WAF_MODEL__API:
				return api != null;
			case WafPackage.WAF_MODEL__SITE_NAME:
				return SITE_NAME_EDEFAULT == null ? siteName != null : !SITE_NAME_EDEFAULT.equals(siteName);
			case WafPackage.WAF_MODEL__SITE_TITLE:
				return SITE_TITLE_EDEFAULT == null ? siteTitle != null : !SITE_TITLE_EDEFAULT.equals(siteTitle);
			case WafPackage.WAF_MODEL__WEBMASTER_EMAIL:
				return WEBMASTER_EMAIL_EDEFAULT == null ? webmasterEmail != null : !WEBMASTER_EMAIL_EDEFAULT.equals(webmasterEmail);
			case WafPackage.WAF_MODEL__COPYRIGHT_TEXT:
				return COPYRIGHT_TEXT_EDEFAULT == null ? copyrightText != null : !COPYRIGHT_TEXT_EDEFAULT.equals(copyrightText);
			case WafPackage.WAF_MODEL__META_DESCRIPTION:
				return META_DESCRIPTION_EDEFAULT == null ? metaDescription != null : !META_DESCRIPTION_EDEFAULT.equals(metaDescription);
			case WafPackage.WAF_MODEL__LOGO_IMAGE:
				return LOGO_IMAGE_EDEFAULT == null ? logoImage != null : !LOGO_IMAGE_EDEFAULT.equals(logoImage);
			case WafPackage.WAF_MODEL__LOGO_FILTERS:
				return logoFilters != null;
			case WafPackage.WAF_MODEL__FRAMEWORK_TECHNOLOGY:
				return frameworkTechnology != FRAMEWORK_TECHNOLOGY_EDEFAULT;
			case WafPackage.WAF_MODEL__USE_DB_SESSION_STORAGE:
				return useDbSessionStorage != USE_DB_SESSION_STORAGE_EDEFAULT;
			case WafPackage.WAF_MODEL__INPUT_TECHNOLOGY:
				return inputTechnology != INPUT_TECHNOLOGY_EDEFAULT;
			case WafPackage.WAF_MODEL__AJAX_TECHNOLOGY:
				return ajaxTechnology != AJAX_TECHNOLOGY_EDEFAULT;
			case WafPackage.WAF_MODEL__AUTHENTICATION:
				return authentication != null;
			case WafPackage.WAF_MODEL__CAPTCHA_SITE_KEY:
				return CAPTCHA_SITE_KEY_EDEFAULT == null ? captchaSiteKey != null : !CAPTCHA_SITE_KEY_EDEFAULT.equals(captchaSiteKey);
			case WafPackage.WAF_MODEL__CAPTCHA_SECRET_KEY:
				return CAPTCHA_SECRET_KEY_EDEFAULT == null ? captchaSecretKey != null : !CAPTCHA_SECRET_KEY_EDEFAULT.equals(captchaSecretKey);
			case WafPackage.WAF_MODEL__TEXT_EDITOR_URL:
				return TEXT_EDITOR_URL_EDEFAULT == null ? textEditorURL != null : !TEXT_EDITOR_URL_EDEFAULT.equals(textEditorURL);
			case WafPackage.WAF_MODEL__TOP_NAVIGATION_ID:
				return TOP_NAVIGATION_ID_EDEFAULT == null ? topNavigationId != null : !TOP_NAVIGATION_ID_EDEFAULT.equals(topNavigationId);
			case WafPackage.WAF_MODEL__SIDE_MENU:
				return sideMenu != null;
			case WafPackage.WAF_MODEL__SITE_TEMPLATE:
				return SITE_TEMPLATE_EDEFAULT == null ? siteTemplate != null : !SITE_TEMPLATE_EDEFAULT.equals(siteTemplate);
			case WafPackage.WAF_MODEL__STATIC_UNITS_EDITABLE:
				return staticUnitsEditable != STATIC_UNITS_EDITABLE_EDEFAULT;
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
		result.append(" (siteName: ");
		result.append(siteName);
		result.append(", siteTitle: ");
		result.append(siteTitle);
		result.append(", webmasterEmail: ");
		result.append(webmasterEmail);
		result.append(", copyrightText: ");
		result.append(copyrightText);
		result.append(", metaDescription: ");
		result.append(metaDescription);
		result.append(", logoImage: ");
		result.append(logoImage);
		result.append(", frameworkTechnology: ");
		result.append(frameworkTechnology);
		result.append(", useDbSessionStorage: ");
		result.append(useDbSessionStorage);
		result.append(", inputTechnology: ");
		result.append(inputTechnology);
		result.append(", ajaxTechnology: ");
		result.append(ajaxTechnology);
		result.append(", captchaSiteKey: ");
		result.append(captchaSiteKey);
		result.append(", captchaSecretKey: ");
		result.append(captchaSecretKey);
		result.append(", textEditorURL: ");
		result.append(textEditorURL);
		result.append(", topNavigationId: ");
		result.append(topNavigationId);
		result.append(", siteTemplate: ");
		result.append(siteTemplate);
		result.append(", staticUnitsEditable: ");
		result.append(staticUnitsEditable);
		result.append(')');
		return result.toString();
	}

} //WafModelImpl

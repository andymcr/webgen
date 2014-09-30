/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsitePropertiesImpl.java,v 1.17 2014/01/06 14:30:34 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import uk.ac.man.cs.mdsd.webgen.website.Authentication;
import uk.ac.man.cs.mdsd.webgen.website.DatabaseTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.Menu;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getTestProjectName <em>Test Project Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDatabaseTechnology <em>Database Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebsitePropertiesImpl extends EObjectImpl implements WebsiteProperties {
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
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getTestProjectName() <em>Test Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestProjectName() <em>Test Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestProjectName()
	 * @generated
	 * @ordered
	 */
	protected String testProjectName = TEST_PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDateFormat() <em>Default Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DATE_FORMAT_EDEFAULT = null;

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
	protected static final String DEFAULT_TIME_FORMAT_EDEFAULT = null;

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
	protected static final String DEFAULT_DATE_TIME_FORMAT_EDEFAULT = null;

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
	 * The default value of the '{@link #getDatabaseTechnology() <em>Database Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final DatabaseTechnologies DATABASE_TECHNOLOGY_EDEFAULT = DatabaseTechnologies.MY_SQL;

	/**
	 * The cached value of the '{@link #getDatabaseTechnology() <em>Database Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTechnology()
	 * @generated
	 * @ordered
	 */
	protected DatabaseTechnologies databaseTechnology = DATABASE_TECHNOLOGY_EDEFAULT;

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
	protected WebsitePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEBSITE_PROPERTIES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE, oldSiteTitle, siteTitle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL, oldWebmasterEmail, webmasterEmail));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT, oldCopyrightText, copyrightText));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION, oldMetaDescription, metaDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__PROJECT_NAME, oldProjectName, projectName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION, oldAuthentication, newAuthentication);
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
				msgs = ((InternalEObject)authentication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION, null, msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION, null, msgs);
			msgs = basicSetAuthentication(newAuthentication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION, newAuthentication, newAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestProjectName() {
		return testProjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestProjectName(String newTestProjectName) {
		String oldTestProjectName = testProjectName;
		testProjectName = newTestProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__TEST_PROJECT_NAME, oldTestProjectName, testProjectName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_FORMAT, oldDefaultDateFormat, defaultDateFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_TIME_FORMAT, oldDefaultTimeFormat, defaultTimeFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_TIME_FORMAT, oldDefaultDateTimeFormat, defaultDateTimeFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_MAXIMUM_UPLOAD_SIZE, oldDefaultMaximumUploadSize, defaultMaximumUploadSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseTechnologies getDatabaseTechnology() {
		return databaseTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseTechnology(DatabaseTechnologies newDatabaseTechnology) {
		DatabaseTechnologies oldDatabaseTechnology = databaseTechnology;
		databaseTechnology = newDatabaseTechnology == null ? DATABASE_TECHNOLOGY_EDEFAULT : newDatabaseTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DATABASE_TECHNOLOGY, oldDatabaseTechnology, databaseTechnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY, oldFrameworkTechnology, frameworkTechnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID, oldTopNavigationId, topNavigationId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.WEBSITE_PROPERTIES__SIDE_MENU, oldSideMenu, sideMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__SIDE_MENU, oldSideMenu, sideMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE, oldStaticUnitsEditable, staticUnitsEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION:
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
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE:
				return getSiteTitle();
			case WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL:
				return getWebmasterEmail();
			case WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT:
				return getCopyrightText();
			case WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION:
				return getMetaDescription();
			case WebsitePackage.WEBSITE_PROPERTIES__PROJECT_NAME:
				return getProjectName();
			case WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION:
				return getAuthentication();
			case WebsitePackage.WEBSITE_PROPERTIES__TEST_PROJECT_NAME:
				return getTestProjectName();
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_FORMAT:
				return getDefaultDateFormat();
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_TIME_FORMAT:
				return getDefaultTimeFormat();
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_TIME_FORMAT:
				return getDefaultDateTimeFormat();
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return getDefaultMaximumUploadSize();
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_TECHNOLOGY:
				return getDatabaseTechnology();
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				return getFrameworkTechnology();
			case WebsitePackage.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID:
				return getTopNavigationId();
			case WebsitePackage.WEBSITE_PROPERTIES__SIDE_MENU:
				if (resolve) return getSideMenu();
				return basicGetSideMenu();
			case WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE:
				return isStaticUnitsEditable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE:
				setSiteTitle((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL:
				setWebmasterEmail((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT:
				setCopyrightText((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION:
				setMetaDescription((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION:
				setAuthentication((Authentication)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TEST_PROJECT_NAME:
				setTestProjectName((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize((Integer)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_TECHNOLOGY:
				setDatabaseTechnology((DatabaseTechnologies)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology((FrameworkTechnologies)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID:
				setTopNavigationId((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SIDE_MENU:
				setSideMenu((Menu)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE:
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
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE:
				setSiteTitle(SITE_TITLE_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL:
				setWebmasterEmail(WEBMASTER_EMAIL_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT:
				setCopyrightText(COPYRIGHT_TEXT_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION:
				setMetaDescription(META_DESCRIPTION_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION:
				setAuthentication((Authentication)null);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TEST_PROJECT_NAME:
				setTestProjectName(TEST_PROJECT_NAME_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat(DEFAULT_DATE_FORMAT_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat(DEFAULT_TIME_FORMAT_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat(DEFAULT_DATE_TIME_FORMAT_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize(DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_TECHNOLOGY:
				setDatabaseTechnology(DATABASE_TECHNOLOGY_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology(FRAMEWORK_TECHNOLOGY_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID:
				setTopNavigationId(TOP_NAVIGATION_ID_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SIDE_MENU:
				setSideMenu((Menu)null);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE:
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
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE:
				return SITE_TITLE_EDEFAULT == null ? siteTitle != null : !SITE_TITLE_EDEFAULT.equals(siteTitle);
			case WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL:
				return WEBMASTER_EMAIL_EDEFAULT == null ? webmasterEmail != null : !WEBMASTER_EMAIL_EDEFAULT.equals(webmasterEmail);
			case WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT:
				return COPYRIGHT_TEXT_EDEFAULT == null ? copyrightText != null : !COPYRIGHT_TEXT_EDEFAULT.equals(copyrightText);
			case WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION:
				return META_DESCRIPTION_EDEFAULT == null ? metaDescription != null : !META_DESCRIPTION_EDEFAULT.equals(metaDescription);
			case WebsitePackage.WEBSITE_PROPERTIES__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION:
				return authentication != null;
			case WebsitePackage.WEBSITE_PROPERTIES__TEST_PROJECT_NAME:
				return TEST_PROJECT_NAME_EDEFAULT == null ? testProjectName != null : !TEST_PROJECT_NAME_EDEFAULT.equals(testProjectName);
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_FORMAT:
				return DEFAULT_DATE_FORMAT_EDEFAULT == null ? defaultDateFormat != null : !DEFAULT_DATE_FORMAT_EDEFAULT.equals(defaultDateFormat);
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_TIME_FORMAT:
				return DEFAULT_TIME_FORMAT_EDEFAULT == null ? defaultTimeFormat != null : !DEFAULT_TIME_FORMAT_EDEFAULT.equals(defaultTimeFormat);
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_TIME_FORMAT:
				return DEFAULT_DATE_TIME_FORMAT_EDEFAULT == null ? defaultDateTimeFormat != null : !DEFAULT_DATE_TIME_FORMAT_EDEFAULT.equals(defaultDateTimeFormat);
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return defaultMaximumUploadSize != DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_TECHNOLOGY:
				return databaseTechnology != DATABASE_TECHNOLOGY_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				return frameworkTechnology != FRAMEWORK_TECHNOLOGY_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID:
				return TOP_NAVIGATION_ID_EDEFAULT == null ? topNavigationId != null : !TOP_NAVIGATION_ID_EDEFAULT.equals(topNavigationId);
			case WebsitePackage.WEBSITE_PROPERTIES__SIDE_MENU:
				return sideMenu != null;
			case WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE:
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
		result.append(" (siteTitle: ");
		result.append(siteTitle);
		result.append(", webmasterEmail: ");
		result.append(webmasterEmail);
		result.append(", copyrightText: ");
		result.append(copyrightText);
		result.append(", metaDescription: ");
		result.append(metaDescription);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", testProjectName: ");
		result.append(testProjectName);
		result.append(", defaultDateFormat: ");
		result.append(defaultDateFormat);
		result.append(", defaultTimeFormat: ");
		result.append(defaultTimeFormat);
		result.append(", defaultDateTimeFormat: ");
		result.append(defaultDateTimeFormat);
		result.append(", defaultMaximumUploadSize: ");
		result.append(defaultMaximumUploadSize);
		result.append(", databaseTechnology: ");
		result.append(databaseTechnology);
		result.append(", frameworkTechnology: ");
		result.append(frameworkTechnology);
		result.append(", topNavigationId: ");
		result.append(topNavigationId);
		result.append(", staticUnitsEditable: ");
		result.append(staticUnitsEditable);
		result.append(')');
		return result.toString();
	}

} //WebsitePropertiesImpl

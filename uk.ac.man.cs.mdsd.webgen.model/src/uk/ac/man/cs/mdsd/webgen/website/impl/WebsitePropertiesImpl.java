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
import uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies;
import uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.AjaxTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.Authentication;
import uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.InputTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.Menu;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#isDevelopmentVersion <em>Development Version</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#isRewriteURLs <em>Rewrite UR Ls</em>}</li>
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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDatabasePrefix <em>Database Prefix</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDatabaseHost <em>Database Host</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDatabasePort <em>Database Port</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDatabaseUsername <em>Database Username</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getDatabasePassword <em>Database Password</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getOrmTechnology <em>Orm Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#isTimestampCreation <em>Timestamp Creation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#isTimestampUpdates <em>Timestamp Updates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getAjaxTechnology <em>Ajax Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getCaptchaSiteKey <em>Captcha Site Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getCaptchaSecretKey <em>Captcha Secret Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getTextEditorURL <em>Text Editor URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#isResponsiveTopMenu <em>Responsive Top Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#getSiteTemplate <em>Site Template</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #isDevelopmentVersion() <em>Development Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDevelopmentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEVELOPMENT_VERSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDevelopmentVersion() <em>Development Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDevelopmentVersion()
	 * @generated
	 * @ordered
	 */
	protected boolean developmentVersion = DEVELOPMENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected String baseURL = BASE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isRewriteURLs() <em>Rewrite UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRewriteURLs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REWRITE_UR_LS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRewriteURLs() <em>Rewrite UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRewriteURLs()
	 * @generated
	 * @ordered
	 */
	protected boolean rewriteURLs = REWRITE_UR_LS_EDEFAULT;

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
	 * The default value of the '{@link #getDatabasePrefix() <em>Database Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabasePrefix() <em>Database Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePrefix()
	 * @generated
	 * @ordered
	 */
	protected String databasePrefix = DATABASE_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseHost() <em>Database Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseHost()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseHost() <em>Database Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseHost()
	 * @generated
	 * @ordered
	 */
	protected String databaseHost = DATABASE_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabasePort() <em>Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePort()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabasePort() <em>Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePort()
	 * @generated
	 * @ordered
	 */
	protected String databasePort = DATABASE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseUsername() <em>Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseUsername() <em>Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected String databaseUsername = DATABASE_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabasePassword() <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabasePassword() <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected String databasePassword = DATABASE_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrmTechnology() <em>Orm Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final OrmTechnologies ORM_TECHNOLOGY_EDEFAULT = OrmTechnologies.KOHANA;

	/**
	 * The cached value of the '{@link #getOrmTechnology() <em>Orm Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmTechnology()
	 * @generated
	 * @ordered
	 */
	protected OrmTechnologies ormTechnology = ORM_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTimestampCreation() <em>Timestamp Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestampCreation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIMESTAMP_CREATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTimestampCreation() <em>Timestamp Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestampCreation()
	 * @generated
	 * @ordered
	 */
	protected boolean timestampCreation = TIMESTAMP_CREATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTimestampUpdates() <em>Timestamp Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestampUpdates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIMESTAMP_UPDATES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTimestampUpdates() <em>Timestamp Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestampUpdates()
	 * @generated
	 * @ordered
	 */
	protected boolean timestampUpdates = TIMESTAMP_UPDATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameworkTechnology() <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final FrameworkTechnologies FRAMEWORK_TECHNOLOGY_EDEFAULT = FrameworkTechnologies.KOHANA;

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
	public boolean isDevelopmentVersion() {
		return developmentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopmentVersion(boolean newDevelopmentVersion) {
		boolean oldDevelopmentVersion = developmentVersion;
		developmentVersion = newDevelopmentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DEVELOPMENT_VERSION, oldDevelopmentVersion, developmentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURL() {
		return baseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURL(String newBaseURL) {
		String oldBaseURL = baseURL;
		baseURL = newBaseURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__BASE_URL, oldBaseURL, baseURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRewriteURLs() {
		return rewriteURLs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRewriteURLs(boolean newRewriteURLs) {
		boolean oldRewriteURLs = rewriteURLs;
		rewriteURLs = newRewriteURLs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__REWRITE_UR_LS, oldRewriteURLs, rewriteURLs));
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
				msgs = ((InternalEObject)authentication).eInverseRemove(this, WebsitePackage.AUTHENTICATION__AUTHENTICATES, Authentication.class, msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, WebsitePackage.AUTHENTICATION__AUTHENTICATES, Authentication.class, msgs);
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
	public String getDatabasePrefix() {
		return databasePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePrefix(String newDatabasePrefix) {
		String oldDatabasePrefix = databasePrefix;
		databasePrefix = newDatabasePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PREFIX, oldDatabasePrefix, databasePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseHost() {
		return databaseHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseHost(String newDatabaseHost) {
		String oldDatabaseHost = databaseHost;
		databaseHost = newDatabaseHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DATABASE_HOST, oldDatabaseHost, databaseHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabasePort() {
		return databasePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePort(String newDatabasePort) {
		String oldDatabasePort = databasePort;
		databasePort = newDatabasePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PORT, oldDatabasePort, databasePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseUsername() {
		return databaseUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseUsername(String newDatabaseUsername) {
		String oldDatabaseUsername = databaseUsername;
		databaseUsername = newDatabaseUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DATABASE_USERNAME, oldDatabaseUsername, databaseUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabasePassword() {
		return databasePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePassword(String newDatabasePassword) {
		String oldDatabasePassword = databasePassword;
		databasePassword = newDatabasePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PASSWORD, oldDatabasePassword, databasePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmTechnologies getOrmTechnology() {
		return ormTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmTechnology(OrmTechnologies newOrmTechnology) {
		OrmTechnologies oldOrmTechnology = ormTechnology;
		ormTechnology = newOrmTechnology == null ? ORM_TECHNOLOGY_EDEFAULT : newOrmTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__ORM_TECHNOLOGY, oldOrmTechnology, ormTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimestampCreation() {
		return timestampCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestampCreation(boolean newTimestampCreation) {
		boolean oldTimestampCreation = timestampCreation;
		timestampCreation = newTimestampCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__TIMESTAMP_CREATION, oldTimestampCreation, timestampCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimestampUpdates() {
		return timestampUpdates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestampUpdates(boolean newTimestampUpdates) {
		boolean oldTimestampUpdates = timestampUpdates;
		timestampUpdates = newTimestampUpdates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__TIMESTAMP_UPDATES, oldTimestampUpdates, timestampUpdates));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__INPUT_TECHNOLOGY, oldInputTechnology, inputTechnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__AJAX_TECHNOLOGY, oldAjaxTechnology, ajaxTechnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SITE_KEY, oldCaptchaSiteKey, captchaSiteKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SECRET_KEY, oldCaptchaSecretKey, captchaSecretKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__TEXT_EDITOR_URL, oldTextEditorURL, textEditorURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__RESPONSIVE_TOP_MENU, oldResponsiveTopMenu, responsiveTopMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__SITE_TEMPLATE, oldSiteTemplate, siteTemplate));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION:
				if (authentication != null)
					msgs = ((InternalEObject)authentication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION, null, msgs);
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
			case WebsitePackage.WEBSITE_PROPERTIES__DEVELOPMENT_VERSION:
				return isDevelopmentVersion();
			case WebsitePackage.WEBSITE_PROPERTIES__BASE_URL:
				return getBaseURL();
			case WebsitePackage.WEBSITE_PROPERTIES__REWRITE_UR_LS:
				return isRewriteURLs();
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
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PREFIX:
				return getDatabasePrefix();
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_HOST:
				return getDatabaseHost();
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_NAME:
				return getDatabaseName();
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PORT:
				return getDatabasePort();
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_USERNAME:
				return getDatabaseUsername();
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PASSWORD:
				return getDatabasePassword();
			case WebsitePackage.WEBSITE_PROPERTIES__ORM_TECHNOLOGY:
				return getOrmTechnology();
			case WebsitePackage.WEBSITE_PROPERTIES__TIMESTAMP_CREATION:
				return isTimestampCreation();
			case WebsitePackage.WEBSITE_PROPERTIES__TIMESTAMP_UPDATES:
				return isTimestampUpdates();
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				return getFrameworkTechnology();
			case WebsitePackage.WEBSITE_PROPERTIES__INPUT_TECHNOLOGY:
				return getInputTechnology();
			case WebsitePackage.WEBSITE_PROPERTIES__AJAX_TECHNOLOGY:
				return getAjaxTechnology();
			case WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SITE_KEY:
				return getCaptchaSiteKey();
			case WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SECRET_KEY:
				return getCaptchaSecretKey();
			case WebsitePackage.WEBSITE_PROPERTIES__TEXT_EDITOR_URL:
				return getTextEditorURL();
			case WebsitePackage.WEBSITE_PROPERTIES__RESPONSIVE_TOP_MENU:
				return isResponsiveTopMenu();
			case WebsitePackage.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID:
				return getTopNavigationId();
			case WebsitePackage.WEBSITE_PROPERTIES__SIDE_MENU:
				if (resolve) return getSideMenu();
				return basicGetSideMenu();
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TEMPLATE:
				return getSiteTemplate();
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
			case WebsitePackage.WEBSITE_PROPERTIES__DEVELOPMENT_VERSION:
				setDevelopmentVersion((Boolean)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__BASE_URL:
				setBaseURL((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__REWRITE_UR_LS:
				setRewriteURLs((Boolean)newValue);
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
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PREFIX:
				setDatabasePrefix((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_HOST:
				setDatabaseHost((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PORT:
				setDatabasePort((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_USERNAME:
				setDatabaseUsername((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PASSWORD:
				setDatabasePassword((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__ORM_TECHNOLOGY:
				setOrmTechnology((OrmTechnologies)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TIMESTAMP_CREATION:
				setTimestampCreation((Boolean)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TIMESTAMP_UPDATES:
				setTimestampUpdates((Boolean)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology((FrameworkTechnologies)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__INPUT_TECHNOLOGY:
				setInputTechnology((InputTechnologies)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__AJAX_TECHNOLOGY:
				setAjaxTechnology((AjaxTechnologies)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SITE_KEY:
				setCaptchaSiteKey((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SECRET_KEY:
				setCaptchaSecretKey((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TEXT_EDITOR_URL:
				setTextEditorURL((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__RESPONSIVE_TOP_MENU:
				setResponsiveTopMenu((Boolean)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID:
				setTopNavigationId((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SIDE_MENU:
				setSideMenu((Menu)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TEMPLATE:
				setSiteTemplate((String)newValue);
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
			case WebsitePackage.WEBSITE_PROPERTIES__DEVELOPMENT_VERSION:
				setDevelopmentVersion(DEVELOPMENT_VERSION_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__BASE_URL:
				setBaseURL(BASE_URL_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__REWRITE_UR_LS:
				setRewriteURLs(REWRITE_UR_LS_EDEFAULT);
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
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PREFIX:
				setDatabasePrefix(DATABASE_PREFIX_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_HOST:
				setDatabaseHost(DATABASE_HOST_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PORT:
				setDatabasePort(DATABASE_PORT_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_USERNAME:
				setDatabaseUsername(DATABASE_USERNAME_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PASSWORD:
				setDatabasePassword(DATABASE_PASSWORD_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__ORM_TECHNOLOGY:
				setOrmTechnology(ORM_TECHNOLOGY_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TIMESTAMP_CREATION:
				setTimestampCreation(TIMESTAMP_CREATION_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TIMESTAMP_UPDATES:
				setTimestampUpdates(TIMESTAMP_UPDATES_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology(FRAMEWORK_TECHNOLOGY_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__INPUT_TECHNOLOGY:
				setInputTechnology(INPUT_TECHNOLOGY_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__AJAX_TECHNOLOGY:
				setAjaxTechnology(AJAX_TECHNOLOGY_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SITE_KEY:
				setCaptchaSiteKey(CAPTCHA_SITE_KEY_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SECRET_KEY:
				setCaptchaSecretKey(CAPTCHA_SECRET_KEY_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TEXT_EDITOR_URL:
				setTextEditorURL(TEXT_EDITOR_URL_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__RESPONSIVE_TOP_MENU:
				setResponsiveTopMenu(RESPONSIVE_TOP_MENU_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID:
				setTopNavigationId(TOP_NAVIGATION_ID_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SIDE_MENU:
				setSideMenu((Menu)null);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TEMPLATE:
				setSiteTemplate(SITE_TEMPLATE_EDEFAULT);
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
			case WebsitePackage.WEBSITE_PROPERTIES__DEVELOPMENT_VERSION:
				return developmentVersion != DEVELOPMENT_VERSION_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__BASE_URL:
				return BASE_URL_EDEFAULT == null ? baseURL != null : !BASE_URL_EDEFAULT.equals(baseURL);
			case WebsitePackage.WEBSITE_PROPERTIES__REWRITE_UR_LS:
				return rewriteURLs != REWRITE_UR_LS_EDEFAULT;
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
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PREFIX:
				return DATABASE_PREFIX_EDEFAULT == null ? databasePrefix != null : !DATABASE_PREFIX_EDEFAULT.equals(databasePrefix);
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_HOST:
				return DATABASE_HOST_EDEFAULT == null ? databaseHost != null : !DATABASE_HOST_EDEFAULT.equals(databaseHost);
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PORT:
				return DATABASE_PORT_EDEFAULT == null ? databasePort != null : !DATABASE_PORT_EDEFAULT.equals(databasePort);
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_USERNAME:
				return DATABASE_USERNAME_EDEFAULT == null ? databaseUsername != null : !DATABASE_USERNAME_EDEFAULT.equals(databaseUsername);
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_PASSWORD:
				return DATABASE_PASSWORD_EDEFAULT == null ? databasePassword != null : !DATABASE_PASSWORD_EDEFAULT.equals(databasePassword);
			case WebsitePackage.WEBSITE_PROPERTIES__ORM_TECHNOLOGY:
				return ormTechnology != ORM_TECHNOLOGY_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__TIMESTAMP_CREATION:
				return timestampCreation != TIMESTAMP_CREATION_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__TIMESTAMP_UPDATES:
				return timestampUpdates != TIMESTAMP_UPDATES_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				return frameworkTechnology != FRAMEWORK_TECHNOLOGY_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__INPUT_TECHNOLOGY:
				return inputTechnology != INPUT_TECHNOLOGY_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__AJAX_TECHNOLOGY:
				return ajaxTechnology != AJAX_TECHNOLOGY_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SITE_KEY:
				return CAPTCHA_SITE_KEY_EDEFAULT == null ? captchaSiteKey != null : !CAPTCHA_SITE_KEY_EDEFAULT.equals(captchaSiteKey);
			case WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SECRET_KEY:
				return CAPTCHA_SECRET_KEY_EDEFAULT == null ? captchaSecretKey != null : !CAPTCHA_SECRET_KEY_EDEFAULT.equals(captchaSecretKey);
			case WebsitePackage.WEBSITE_PROPERTIES__TEXT_EDITOR_URL:
				return TEXT_EDITOR_URL_EDEFAULT == null ? textEditorURL != null : !TEXT_EDITOR_URL_EDEFAULT.equals(textEditorURL);
			case WebsitePackage.WEBSITE_PROPERTIES__RESPONSIVE_TOP_MENU:
				return responsiveTopMenu != RESPONSIVE_TOP_MENU_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID:
				return TOP_NAVIGATION_ID_EDEFAULT == null ? topNavigationId != null : !TOP_NAVIGATION_ID_EDEFAULT.equals(topNavigationId);
			case WebsitePackage.WEBSITE_PROPERTIES__SIDE_MENU:
				return sideMenu != null;
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TEMPLATE:
				return SITE_TEMPLATE_EDEFAULT == null ? siteTemplate != null : !SITE_TEMPLATE_EDEFAULT.equals(siteTemplate);
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
		result.append(", developmentVersion: ");
		result.append(developmentVersion);
		result.append(", baseURL: ");
		result.append(baseURL);
		result.append(", rewriteURLs: ");
		result.append(rewriteURLs);
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
		result.append(", databasePrefix: ");
		result.append(databasePrefix);
		result.append(", databaseHost: ");
		result.append(databaseHost);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", databasePort: ");
		result.append(databasePort);
		result.append(", databaseUsername: ");
		result.append(databaseUsername);
		result.append(", databasePassword: ");
		result.append(databasePassword);
		result.append(", ormTechnology: ");
		result.append(ormTechnology);
		result.append(", timestampCreation: ");
		result.append(timestampCreation);
		result.append(", timestampUpdates: ");
		result.append(timestampUpdates);
		result.append(", frameworkTechnology: ");
		result.append(frameworkTechnology);
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
		result.append(", responsiveTopMenu: ");
		result.append(responsiveTopMenu);
		result.append(", topNavigationId: ");
		result.append(topNavigationId);
		result.append(", siteTemplate: ");
		result.append(siteTemplate);
		result.append(", staticUnitsEditable: ");
		result.append(staticUnitsEditable);
		result.append(')');
		return result.toString();
	}

} //WebsitePropertiesImpl

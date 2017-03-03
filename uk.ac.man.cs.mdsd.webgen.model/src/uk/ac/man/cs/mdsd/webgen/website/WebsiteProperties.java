/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsiteProperties.java,v 1.19 2014/01/06 14:30:33 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;
import security.Authentication;
import uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies;
import uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies;
import uk.ac.man.cs.mdsd.webgen.webui.Menu;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isDevelopmentVersion <em>Development Version</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isRewriteURLs <em>Rewrite UR Ls</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTestProjectName <em>Test Project Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabaseTechnology <em>Database Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabasePrefix <em>Database Prefix</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabaseHost <em>Database Host</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabasePort <em>Database Port</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabaseUsername <em>Database Username</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabasePassword <em>Database Password</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getOrmTechnology <em>Orm Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isTimestampCreation <em>Timestamp Creation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isTimestampUpdates <em>Timestamp Updates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getAjaxTechnology <em>Ajax Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCaptchaSiteKey <em>Captcha Site Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCaptchaSecretKey <em>Captcha Secret Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTextEditorURL <em>Text Editor URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isResponsiveTopMenu <em>Responsive Top Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTemplate <em>Site Template</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties()
 * @model
 * @generated
 */
public interface WebsiteProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Site Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Title</em>' attribute.
	 * @see #setSiteTitle(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_SiteTitle()
	 * @model required="true"
	 * @generated
	 */
	String getSiteTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTitle <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Title</em>' attribute.
	 * @see #getSiteTitle()
	 * @generated
	 */
	void setSiteTitle(String value);

	/**
	 * Returns the value of the '<em><b>Development Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Version</em>' attribute.
	 * @see #setDevelopmentVersion(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DevelopmentVersion()
	 * @model
	 * @generated
	 */
	boolean isDevelopmentVersion();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isDevelopmentVersion <em>Development Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Version</em>' attribute.
	 * @see #isDevelopmentVersion()
	 * @generated
	 */
	void setDevelopmentVersion(boolean value);

	/**
	 * Returns the value of the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URL</em>' attribute.
	 * @see #setBaseURL(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_BaseURL()
	 * @model
	 * @generated
	 */
	String getBaseURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getBaseURL <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URL</em>' attribute.
	 * @see #getBaseURL()
	 * @generated
	 */
	void setBaseURL(String value);

	/**
	 * Returns the value of the '<em><b>Rewrite UR Ls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrite UR Ls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrite UR Ls</em>' attribute.
	 * @see #setRewriteURLs(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_RewriteURLs()
	 * @model
	 * @generated
	 */
	boolean isRewriteURLs();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isRewriteURLs <em>Rewrite UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewrite UR Ls</em>' attribute.
	 * @see #isRewriteURLs()
	 * @generated
	 */
	void setRewriteURLs(boolean value);

	/**
	 * Returns the value of the '<em><b>Webmaster Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webmaster Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webmaster Email</em>' attribute.
	 * @see #setWebmasterEmail(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_WebmasterEmail()
	 * @model required="true"
	 * @generated
	 */
	String getWebmasterEmail();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getWebmasterEmail <em>Webmaster Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webmaster Email</em>' attribute.
	 * @see #getWebmasterEmail()
	 * @generated
	 */
	void setWebmasterEmail(String value);

	/**
	 * Returns the value of the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright Text</em>' attribute.
	 * @see #setCopyrightText(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_CopyrightText()
	 * @model ordered="false"
	 * @generated
	 */
	String getCopyrightText();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCopyrightText <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Text</em>' attribute.
	 * @see #getCopyrightText()
	 * @generated
	 */
	void setCopyrightText(String value);

	/**
	 * Returns the value of the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Description</em>' attribute.
	 * @see #setMetaDescription(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_MetaDescription()
	 * @model ordered="false"
	 * @generated
	 */
	String getMetaDescription();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getMetaDescription <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Description</em>' attribute.
	 * @see #getMetaDescription()
	 * @generated
	 */
	void setMetaDescription(String value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_ProjectName()
	 * @model required="true"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(Authentication)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_Authentication()
	 * @model containment="true"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

	/**
	 * Returns the value of the '<em><b>Test Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Project Name</em>' attribute.
	 * @see #setTestProjectName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_TestProjectName()
	 * @model
	 * @generated
	 */
	String getTestProjectName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTestProjectName <em>Test Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Project Name</em>' attribute.
	 * @see #getTestProjectName()
	 * @generated
	 */
	void setTestProjectName(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DefaultDateFormat()
	 * @model default="jS F Y" ordered="false"
	 * @generated
	 */
	String getDefaultDateFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDefaultDateFormat <em>Default Date Format</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DefaultTimeFormat()
	 * @model default="G.i" ordered="false"
	 * @generated
	 */
	String getDefaultTimeFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDefaultTimeFormat <em>Default Time Format</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DefaultDateTimeFormat()
	 * @model default="jS F Y G.i" ordered="false"
	 * @generated
	 */
	String getDefaultDateTimeFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDefaultDateTimeFormat <em>Default Date Time Format</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DefaultMaximumUploadSize()
	 * @model default="2000000" ordered="false"
	 * @generated
	 */
	int getDefaultMaximumUploadSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Maximum Upload Size</em>' attribute.
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 */
	void setDefaultMaximumUploadSize(int value);

	/**
	 * Returns the value of the '<em><b>Database Technology</b></em>' attribute.
	 * The default value is <code>"MySql"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies
	 * @see #setDatabaseTechnology(DatabaseTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DatabaseTechnology()
	 * @model default="MySql" required="true" ordered="false"
	 * @generated
	 */
	DatabaseTechnologies getDatabaseTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabaseTechnology <em>Database Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies
	 * @see #getDatabaseTechnology()
	 * @generated
	 */
	void setDatabaseTechnology(DatabaseTechnologies value);

	/**
	 * Returns the value of the '<em><b>Database Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Prefix</em>' attribute.
	 * @see #setDatabasePrefix(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DatabasePrefix()
	 * @model
	 * @generated
	 */
	String getDatabasePrefix();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabasePrefix <em>Database Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Prefix</em>' attribute.
	 * @see #getDatabasePrefix()
	 * @generated
	 */
	void setDatabasePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Database Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Host</em>' attribute.
	 * @see #setDatabaseHost(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DatabaseHost()
	 * @model
	 * @generated
	 */
	String getDatabaseHost();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabaseHost <em>Database Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Host</em>' attribute.
	 * @see #getDatabaseHost()
	 * @generated
	 */
	void setDatabaseHost(String value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DatabaseName()
	 * @model
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Database Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Port</em>' attribute.
	 * @see #setDatabasePort(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DatabasePort()
	 * @model
	 * @generated
	 */
	String getDatabasePort();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabasePort <em>Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Port</em>' attribute.
	 * @see #getDatabasePort()
	 * @generated
	 */
	void setDatabasePort(String value);

	/**
	 * Returns the value of the '<em><b>Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Username</em>' attribute.
	 * @see #setDatabaseUsername(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DatabaseUsername()
	 * @model
	 * @generated
	 */
	String getDatabaseUsername();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabaseUsername <em>Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Username</em>' attribute.
	 * @see #getDatabaseUsername()
	 * @generated
	 */
	void setDatabaseUsername(String value);

	/**
	 * Returns the value of the '<em><b>Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Password</em>' attribute.
	 * @see #setDatabasePassword(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DatabasePassword()
	 * @model
	 * @generated
	 */
	String getDatabasePassword();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDatabasePassword <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Password</em>' attribute.
	 * @see #getDatabasePassword()
	 * @generated
	 */
	void setDatabasePassword(String value);

	/**
	 * Returns the value of the '<em><b>Orm Technology</b></em>' attribute.
	 * The default value is <code>"Kohana"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies
	 * @see #setOrmTechnology(OrmTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_OrmTechnology()
	 * @model default="Kohana"
	 * @generated
	 */
	OrmTechnologies getOrmTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getOrmTechnology <em>Orm Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies
	 * @see #getOrmTechnology()
	 * @generated
	 */
	void setOrmTechnology(OrmTechnologies value);

	/**
	 * Returns the value of the '<em><b>Timestamp Creation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp Creation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp Creation</em>' attribute.
	 * @see #setTimestampCreation(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_TimestampCreation()
	 * @model default="true"
	 * @generated
	 */
	boolean isTimestampCreation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isTimestampCreation <em>Timestamp Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp Creation</em>' attribute.
	 * @see #isTimestampCreation()
	 * @generated
	 */
	void setTimestampCreation(boolean value);

	/**
	 * Returns the value of the '<em><b>Timestamp Updates</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp Updates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp Updates</em>' attribute.
	 * @see #setTimestampUpdates(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_TimestampUpdates()
	 * @model default="true"
	 * @generated
	 */
	boolean isTimestampUpdates();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isTimestampUpdates <em>Timestamp Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp Updates</em>' attribute.
	 * @see #isTimestampUpdates()
	 * @generated
	 */
	void setTimestampUpdates(boolean value);

	/**
	 * Returns the value of the '<em><b>Framework Technology</b></em>' attribute.
	 * The default value is <code>"Kohana"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies
	 * @see #setFrameworkTechnology(FrameworkTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_FrameworkTechnology()
	 * @model default="Kohana" required="true" ordered="false"
	 * @generated
	 */
	FrameworkTechnologies getFrameworkTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getFrameworkTechnology <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies
	 * @see #getFrameworkTechnology()
	 * @generated
	 */
	void setFrameworkTechnology(FrameworkTechnologies value);

	/**
	 * Returns the value of the '<em><b>Input Technology</b></em>' attribute.
	 * The default value is <code>"Html"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.InputTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.InputTechnologies
	 * @see #setInputTechnology(InputTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_InputTechnology()
	 * @model default="Html"
	 * @generated
	 */
	InputTechnologies getInputTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getInputTechnology <em>Input Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.InputTechnologies
	 * @see #getInputTechnology()
	 * @generated
	 */
	void setInputTechnology(InputTechnologies value);

	/**
	 * Returns the value of the '<em><b>Ajax Technology</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.AjaxTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.AjaxTechnologies
	 * @see #setAjaxTechnology(AjaxTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_AjaxTechnology()
	 * @model default="None"
	 * @generated
	 */
	AjaxTechnologies getAjaxTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getAjaxTechnology <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.AjaxTechnologies
	 * @see #getAjaxTechnology()
	 * @generated
	 */
	void setAjaxTechnology(AjaxTechnologies value);

	/**
	 * Returns the value of the '<em><b>Captcha Site Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Captcha Site Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captcha Site Key</em>' attribute.
	 * @see #setCaptchaSiteKey(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_CaptchaSiteKey()
	 * @model ordered="false"
	 * @generated
	 */
	String getCaptchaSiteKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCaptchaSiteKey <em>Captcha Site Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captcha Site Key</em>' attribute.
	 * @see #getCaptchaSiteKey()
	 * @generated
	 */
	void setCaptchaSiteKey(String value);

	/**
	 * Returns the value of the '<em><b>Captcha Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Captcha Secret Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captcha Secret Key</em>' attribute.
	 * @see #setCaptchaSecretKey(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_CaptchaSecretKey()
	 * @model ordered="false"
	 * @generated
	 */
	String getCaptchaSecretKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCaptchaSecretKey <em>Captcha Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captcha Secret Key</em>' attribute.
	 * @see #getCaptchaSecretKey()
	 * @generated
	 */
	void setCaptchaSecretKey(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_TextEditorURL()
	 * @model
	 * @generated
	 */
	String getTextEditorURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTextEditorURL <em>Text Editor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Editor URL</em>' attribute.
	 * @see #getTextEditorURL()
	 * @generated
	 */
	void setTextEditorURL(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_ResponsiveTopMenu()
	 * @model
	 * @generated
	 */
	boolean isResponsiveTopMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isResponsiveTopMenu <em>Responsive Top Menu</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_TopNavigationId()
	 * @model default="topnav" required="true" ordered="false"
	 * @generated
	 */
	String getTopNavigationId();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTopNavigationId <em>Top Navigation Id</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_SideMenu()
	 * @model ordered="false"
	 * @generated
	 */
	Menu getSideMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSideMenu <em>Side Menu</em>}' reference.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_SiteTemplate()
	 * @model
	 * @generated
	 */
	String getSiteTemplate();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTemplate <em>Site Template</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_StaticUnitsEditable()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isStaticUnitsEditable();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isStaticUnitsEditable <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Units Editable</em>' attribute.
	 * @see #isStaticUnitsEditable()
	 * @generated
	 */
	void setStaticUnitsEditable(boolean value);

} // WebsiteProperties

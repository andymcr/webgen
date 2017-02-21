/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Application Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getAllowTypeCustomisation <em>Allow Type Customisation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getSecurity <em>Security</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getImage <em>Image</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getWebUI <em>Web UI</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getCaptchaSiteKey <em>Captcha Site Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getCaptchaSecretKey <em>Captcha Secret Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getMetaDescription <em>Meta Description</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='classifierNameUnique pageNameUnique menuNameUnique '"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL classifierNameUnique='classifiers->isUnique(name)' pageNameUnique='pages->isUnique(name)' menuNameUnique='menus->isUnique(name)'"
 * @generated
 */
public interface WebApplicationFramework extends EObject {
	/**
	 * Returns the value of the '<em><b>Allow Type Customisation</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Type Customisation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Type Customisation</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_AllowTypeCustomisation()
	 * @model
	 * @generated
	 */
	List<EntityOrView> getAllowTypeCustomisation();

	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' containment reference.
	 * @see #setPersistence(Persistence)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_Persistence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Persistence getPersistence();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getPersistence <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' containment reference.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(Persistence value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(Security)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_Security()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Security getSecurity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Security value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(Services)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_Services()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Services getServices();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Services value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Image)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_Image()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

	/**
	 * Returns the value of the '<em><b>Web UI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web UI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web UI</em>' containment reference.
	 * @see #setWebUI(WebUI)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_WebUI()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WebUI getWebUI();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getWebUI <em>Web UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web UI</em>' containment reference.
	 * @see #getWebUI()
	 * @generated
	 */
	void setWebUI(WebUI value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_FrameworkTechnology()
	 * @model default="Kohana" required="true" ordered="false"
	 * @generated
	 */
	FrameworkTechnologies getFrameworkTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getFrameworkTechnology <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies
	 * @see #getFrameworkTechnology()
	 * @generated
	 */
	void setFrameworkTechnology(FrameworkTechnologies value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_SiteTitle()
	 * @model required="true"
	 * @generated
	 */
	String getSiteTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getSiteTitle <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Title</em>' attribute.
	 * @see #getSiteTitle()
	 * @generated
	 */
	void setSiteTitle(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_WebmasterEmail()
	 * @model required="true"
	 * @generated
	 */
	String getWebmasterEmail();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getWebmasterEmail <em>Webmaster Email</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_CopyrightText()
	 * @model ordered="false"
	 * @generated
	 */
	String getCopyrightText();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getCopyrightText <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Text</em>' attribute.
	 * @see #getCopyrightText()
	 * @generated
	 */
	void setCopyrightText(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_CaptchaSiteKey()
	 * @model ordered="false"
	 * @generated
	 */
	String getCaptchaSiteKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getCaptchaSiteKey <em>Captcha Site Key</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_CaptchaSecretKey()
	 * @model ordered="false"
	 * @generated
	 */
	String getCaptchaSecretKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getCaptchaSecretKey <em>Captcha Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captcha Secret Key</em>' attribute.
	 * @see #getCaptchaSecretKey()
	 * @generated
	 */
	void setCaptchaSecretKey(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebApplicationFramework_MetaDescription()
	 * @model ordered="false"
	 * @generated
	 */
	String getMetaDescription();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework#getMetaDescription <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Description</em>' attribute.
	 * @see #getMetaDescription()
	 * @generated
	 */
	void setMetaDescription(String value);

} // WebApplicationFramework

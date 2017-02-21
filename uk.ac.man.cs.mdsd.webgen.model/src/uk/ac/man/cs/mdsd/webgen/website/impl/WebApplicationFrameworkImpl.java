/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.Image;
import uk.ac.man.cs.mdsd.webgen.website.Persistence;
import uk.ac.man.cs.mdsd.webgen.website.Security;
import uk.ac.man.cs.mdsd.webgen.website.Services;
import uk.ac.man.cs.mdsd.webgen.website.WebApplicationFramework;
import uk.ac.man.cs.mdsd.webgen.website.WebUI;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Application Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getAllowTypeCustomisation <em>Allow Type Customisation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getImage <em>Image</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getWebUI <em>Web UI</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getCaptchaSiteKey <em>Captcha Site Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getCaptchaSecretKey <em>Captcha Secret Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebApplicationFrameworkImpl#getMetaDescription <em>Meta Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebApplicationFrameworkImpl extends EObjectImpl implements WebApplicationFramework {
	/**
	 * The cached value of the '{@link #getAllowTypeCustomisation() <em>Allow Type Customisation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowTypeCustomisation()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityOrView> allowTypeCustomisation;

	/**
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected Persistence persistence;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Security security;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Services services;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Image image;

	/**
	 * The cached value of the '{@link #getWebUI() <em>Web UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUI()
	 * @generated
	 * @ordered
	 */
	protected WebUI webUI;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebApplicationFrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_APPLICATION_FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityOrView> getAllowTypeCustomisation() {
		if (allowTypeCustomisation == null) {
			allowTypeCustomisation = new EObjectResolvingEList<EntityOrView>(EntityOrView.class, this, WebsitePackage.WEB_APPLICATION_FRAMEWORK__ALLOW_TYPE_CUSTOMISATION);
		}
		return allowTypeCustomisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persistence getPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistence(Persistence newPersistence, NotificationChain msgs) {
		Persistence oldPersistence = persistence;
		persistence = newPersistence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__PERSISTENCE, oldPersistence, newPersistence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistence(Persistence newPersistence) {
		if (newPersistence != persistence) {
			NotificationChain msgs = null;
			if (persistence != null)
				msgs = ((InternalEObject)persistence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_APPLICATION_FRAMEWORK__PERSISTENCE, null, msgs);
			if (newPersistence != null)
				msgs = ((InternalEObject)newPersistence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_APPLICATION_FRAMEWORK__PERSISTENCE, null, msgs);
			msgs = basicSetPersistence(newPersistence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__PERSISTENCE, newPersistence, newPersistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(Security newSecurity, NotificationChain msgs) {
		Security oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__SECURITY, oldSecurity, newSecurity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(Security newSecurity) {
		if (newSecurity != security) {
			NotificationChain msgs = null;
			if (security != null)
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_APPLICATION_FRAMEWORK__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_APPLICATION_FRAMEWORK__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(Services newServices, NotificationChain msgs) {
		Services oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__SERVICES, oldServices, newServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(Services newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_APPLICATION_FRAMEWORK__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_APPLICATION_FRAMEWORK__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__SERVICES, newServices, newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(Image newImage, NotificationChain msgs) {
		Image oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__IMAGE, oldImage, newImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Image newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_APPLICATION_FRAMEWORK__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_APPLICATION_FRAMEWORK__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__IMAGE, newImage, newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebUI getWebUI() {
		return webUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebUI(WebUI newWebUI, NotificationChain msgs) {
		WebUI oldWebUI = webUI;
		webUI = newWebUI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEB_UI, oldWebUI, newWebUI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebUI(WebUI newWebUI) {
		if (newWebUI != webUI) {
			NotificationChain msgs = null;
			if (webUI != null)
				msgs = ((InternalEObject)webUI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEB_UI, null, msgs);
			if (newWebUI != null)
				msgs = ((InternalEObject)newWebUI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEB_UI, null, msgs);
			msgs = basicSetWebUI(newWebUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEB_UI, newWebUI, newWebUI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__FRAMEWORK_TECHNOLOGY, oldFrameworkTechnology, frameworkTechnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__SITE_TITLE, oldSiteTitle, siteTitle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEBMASTER_EMAIL, oldWebmasterEmail, webmasterEmail));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__COPYRIGHT_TEXT, oldCopyrightText, copyrightText));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__CAPTCHA_SITE_KEY, oldCaptchaSiteKey, captchaSiteKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__CAPTCHA_SECRET_KEY, oldCaptchaSecretKey, captchaSecretKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_APPLICATION_FRAMEWORK__META_DESCRIPTION, oldMetaDescription, metaDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__PERSISTENCE:
				return basicSetPersistence(null, msgs);
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SECURITY:
				return basicSetSecurity(null, msgs);
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SERVICES:
				return basicSetServices(null, msgs);
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__IMAGE:
				return basicSetImage(null, msgs);
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEB_UI:
				return basicSetWebUI(null, msgs);
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
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__ALLOW_TYPE_CUSTOMISATION:
				return getAllowTypeCustomisation();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__PERSISTENCE:
				return getPersistence();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SECURITY:
				return getSecurity();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SERVICES:
				return getServices();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__IMAGE:
				return getImage();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEB_UI:
				return getWebUI();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__FRAMEWORK_TECHNOLOGY:
				return getFrameworkTechnology();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SITE_TITLE:
				return getSiteTitle();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEBMASTER_EMAIL:
				return getWebmasterEmail();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__COPYRIGHT_TEXT:
				return getCopyrightText();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__CAPTCHA_SITE_KEY:
				return getCaptchaSiteKey();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__CAPTCHA_SECRET_KEY:
				return getCaptchaSecretKey();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__META_DESCRIPTION:
				return getMetaDescription();
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
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__ALLOW_TYPE_CUSTOMISATION:
				getAllowTypeCustomisation().clear();
				getAllowTypeCustomisation().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__PERSISTENCE:
				setPersistence((Persistence)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SECURITY:
				setSecurity((Security)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SERVICES:
				setServices((Services)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__IMAGE:
				setImage((Image)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEB_UI:
				setWebUI((WebUI)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology((FrameworkTechnologies)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SITE_TITLE:
				setSiteTitle((String)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEBMASTER_EMAIL:
				setWebmasterEmail((String)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__COPYRIGHT_TEXT:
				setCopyrightText((String)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__CAPTCHA_SITE_KEY:
				setCaptchaSiteKey((String)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__CAPTCHA_SECRET_KEY:
				setCaptchaSecretKey((String)newValue);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__META_DESCRIPTION:
				setMetaDescription((String)newValue);
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
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__ALLOW_TYPE_CUSTOMISATION:
				getAllowTypeCustomisation().clear();
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__PERSISTENCE:
				setPersistence((Persistence)null);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SECURITY:
				setSecurity((Security)null);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SERVICES:
				setServices((Services)null);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__IMAGE:
				setImage((Image)null);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEB_UI:
				setWebUI((WebUI)null);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology(FRAMEWORK_TECHNOLOGY_EDEFAULT);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SITE_TITLE:
				setSiteTitle(SITE_TITLE_EDEFAULT);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEBMASTER_EMAIL:
				setWebmasterEmail(WEBMASTER_EMAIL_EDEFAULT);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__COPYRIGHT_TEXT:
				setCopyrightText(COPYRIGHT_TEXT_EDEFAULT);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__CAPTCHA_SITE_KEY:
				setCaptchaSiteKey(CAPTCHA_SITE_KEY_EDEFAULT);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__CAPTCHA_SECRET_KEY:
				setCaptchaSecretKey(CAPTCHA_SECRET_KEY_EDEFAULT);
				return;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__META_DESCRIPTION:
				setMetaDescription(META_DESCRIPTION_EDEFAULT);
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
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__ALLOW_TYPE_CUSTOMISATION:
				return allowTypeCustomisation != null && !allowTypeCustomisation.isEmpty();
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__PERSISTENCE:
				return persistence != null;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SECURITY:
				return security != null;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SERVICES:
				return services != null;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__IMAGE:
				return image != null;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEB_UI:
				return webUI != null;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__FRAMEWORK_TECHNOLOGY:
				return frameworkTechnology != FRAMEWORK_TECHNOLOGY_EDEFAULT;
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__SITE_TITLE:
				return SITE_TITLE_EDEFAULT == null ? siteTitle != null : !SITE_TITLE_EDEFAULT.equals(siteTitle);
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__WEBMASTER_EMAIL:
				return WEBMASTER_EMAIL_EDEFAULT == null ? webmasterEmail != null : !WEBMASTER_EMAIL_EDEFAULT.equals(webmasterEmail);
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__COPYRIGHT_TEXT:
				return COPYRIGHT_TEXT_EDEFAULT == null ? copyrightText != null : !COPYRIGHT_TEXT_EDEFAULT.equals(copyrightText);
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__CAPTCHA_SITE_KEY:
				return CAPTCHA_SITE_KEY_EDEFAULT == null ? captchaSiteKey != null : !CAPTCHA_SITE_KEY_EDEFAULT.equals(captchaSiteKey);
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__CAPTCHA_SECRET_KEY:
				return CAPTCHA_SECRET_KEY_EDEFAULT == null ? captchaSecretKey != null : !CAPTCHA_SECRET_KEY_EDEFAULT.equals(captchaSecretKey);
			case WebsitePackage.WEB_APPLICATION_FRAMEWORK__META_DESCRIPTION:
				return META_DESCRIPTION_EDEFAULT == null ? metaDescription != null : !META_DESCRIPTION_EDEFAULT.equals(metaDescription);
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
		result.append(" (frameworkTechnology: ");
		result.append(frameworkTechnology);
		result.append(", siteTitle: ");
		result.append(siteTitle);
		result.append(", webmasterEmail: ");
		result.append(webmasterEmail);
		result.append(", copyrightText: ");
		result.append(copyrightText);
		result.append(", captchaSiteKey: ");
		result.append(captchaSiteKey);
		result.append(", captchaSecretKey: ");
		result.append(captchaSecretKey);
		result.append(", metaDescription: ");
		result.append(metaDescription);
		result.append(')');
		return result.toString();
	}

} //WebApplicationFrameworkImpl

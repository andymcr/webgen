/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebGenModelImpl.java,v 1.9 2013/12/09 10:12:44 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.webgen.api.API;
import uk.ac.man.cs.mdsd.webgen.image.Image;
import uk.ac.man.cs.mdsd.webgen.persistence.Persistence;
import uk.ac.man.cs.mdsd.webgen.security.Security;
import uk.ac.man.cs.mdsd.webgen.service.Services;
import uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Gen Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getWebsiteProperties <em>Website Properties</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getImages <em>Images</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getWebUI <em>Web UI</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getApi <em>Api</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebGenModelImpl extends EObjectImpl implements WebGenModel {
	/**
	 * The cached value of the '{@link #getWebsiteProperties() <em>Website Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteProperties()
	 * @generated
	 * @ordered
	 */
	protected WebsiteProperties websiteProperties;

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
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected Persistence persistence;

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
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected Image images;

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
	 * The cached value of the '{@link #getApi() <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected API api;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebGenModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_GEN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteProperties getWebsiteProperties() {
		return websiteProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebsiteProperties(WebsiteProperties newWebsiteProperties, NotificationChain msgs) {
		WebsiteProperties oldWebsiteProperties = websiteProperties;
		websiteProperties = newWebsiteProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES, oldWebsiteProperties, newWebsiteProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsiteProperties(WebsiteProperties newWebsiteProperties) {
		if (newWebsiteProperties != websiteProperties) {
			NotificationChain msgs = null;
			if (websiteProperties != null)
				msgs = ((InternalEObject)websiteProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES, null, msgs);
			if (newWebsiteProperties != null)
				msgs = ((InternalEObject)newWebsiteProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES, null, msgs);
			msgs = basicSetWebsiteProperties(newWebsiteProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES, newWebsiteProperties, newWebsiteProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__FRAMEWORK_TECHNOLOGY, oldFrameworkTechnology, frameworkTechnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__COPYRIGHT_TEXT, oldCopyrightText, copyrightText));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__WEB_UI, oldWebUI, newWebUI);
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
				msgs = ((InternalEObject)webUI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__WEB_UI, null, msgs);
			if (newWebUI != null)
				msgs = ((InternalEObject)newWebUI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__WEB_UI, null, msgs);
			msgs = basicSetWebUI(newWebUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__WEB_UI, newWebUI, newWebUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API getApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApi(API newApi, NotificationChain msgs) {
		API oldApi = api;
		api = newApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__API, oldApi, newApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(API newApi) {
		if (newApi != api) {
			NotificationChain msgs = null;
			if (api != null)
				msgs = ((InternalEObject)api).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__API, null, msgs);
			if (newApi != null)
				msgs = ((InternalEObject)newApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__API, null, msgs);
			msgs = basicSetApi(newApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__API, newApi, newApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImages() {
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImages(Image newImages, NotificationChain msgs) {
		Image oldImages = images;
		images = newImages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__IMAGES, oldImages, newImages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImages(Image newImages) {
		if (newImages != images) {
			NotificationChain msgs = null;
			if (images != null)
				msgs = ((InternalEObject)images).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__IMAGES, null, msgs);
			if (newImages != null)
				msgs = ((InternalEObject)newImages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__IMAGES, null, msgs);
			msgs = basicSetImages(newImages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__IMAGES, newImages, newImages));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__SECURITY, oldSecurity, newSecurity);
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
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__SECURITY, newSecurity, newSecurity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__PERSISTENCE, oldPersistence, newPersistence);
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
				msgs = ((InternalEObject)persistence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__PERSISTENCE, null, msgs);
			if (newPersistence != null)
				msgs = ((InternalEObject)newPersistence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__PERSISTENCE, null, msgs);
			msgs = basicSetPersistence(newPersistence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__PERSISTENCE, newPersistence, newPersistence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__SERVICES, oldServices, newServices);
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
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__SERVICES, newServices, newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES:
				return basicSetWebsiteProperties(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
				return basicSetPersistence(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
				return basicSetServices(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
				return basicSetImages(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
				return basicSetWebUI(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__API:
				return basicSetApi(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__SECURITY:
				return basicSetSecurity(null, msgs);
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
			case WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES:
				return getWebsiteProperties();
			case WebsitePackage.WEB_GEN_MODEL__FRAMEWORK_TECHNOLOGY:
				return getFrameworkTechnology();
			case WebsitePackage.WEB_GEN_MODEL__COPYRIGHT_TEXT:
				return getCopyrightText();
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
				return getPersistence();
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
				return getServices();
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
				return getImages();
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
				return getWebUI();
			case WebsitePackage.WEB_GEN_MODEL__API:
				return getApi();
			case WebsitePackage.WEB_GEN_MODEL__SECURITY:
				return getSecurity();
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
			case WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES:
				setWebsiteProperties((WebsiteProperties)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology((FrameworkTechnologies)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__COPYRIGHT_TEXT:
				setCopyrightText((String)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
				setPersistence((Persistence)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
				setServices((Services)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
				setImages((Image)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
				setWebUI((WebUI)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__API:
				setApi((API)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__SECURITY:
				setSecurity((Security)newValue);
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
			case WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES:
				setWebsiteProperties((WebsiteProperties)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology(FRAMEWORK_TECHNOLOGY_EDEFAULT);
				return;
			case WebsitePackage.WEB_GEN_MODEL__COPYRIGHT_TEXT:
				setCopyrightText(COPYRIGHT_TEXT_EDEFAULT);
				return;
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
				setPersistence((Persistence)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
				setServices((Services)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
				setImages((Image)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
				setWebUI((WebUI)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__API:
				setApi((API)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__SECURITY:
				setSecurity((Security)null);
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
			case WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES:
				return websiteProperties != null;
			case WebsitePackage.WEB_GEN_MODEL__FRAMEWORK_TECHNOLOGY:
				return frameworkTechnology != FRAMEWORK_TECHNOLOGY_EDEFAULT;
			case WebsitePackage.WEB_GEN_MODEL__COPYRIGHT_TEXT:
				return COPYRIGHT_TEXT_EDEFAULT == null ? copyrightText != null : !COPYRIGHT_TEXT_EDEFAULT.equals(copyrightText);
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
				return persistence != null;
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
				return services != null;
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
				return images != null;
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
				return webUI != null;
			case WebsitePackage.WEB_GEN_MODEL__API:
				return api != null;
			case WebsitePackage.WEB_GEN_MODEL__SECURITY:
				return security != null;
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
		result.append(", copyrightText: ");
		result.append(copyrightText);
		result.append(')');
		return result.toString();
	}

} //WebGenModelImpl

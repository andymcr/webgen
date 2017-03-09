/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebGenModelImpl.java,v 1.9 2013/12/09 10:12:44 andy Exp $
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
import uk.ac.man.cs.mdsd.webgen.image.Image;
import uk.ac.man.cs.mdsd.webgen.image.ImageManipulation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Persistence;
import uk.ac.man.cs.mdsd.webgen.security.Security;
import uk.ac.man.cs.mdsd.webgen.service.Services;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties;
import uk.ac.man.cs.mdsd.webgen.webui.Menu;
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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getServicesX <em>Services X</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getWebUI <em>Web UI</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getImages <em>Images</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getAllowTypeCustomisation <em>Allow Type Customisation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getImageManipulations <em>Image Manipulations</em>}</li>
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
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected Persistence persistence;

	/**
	 * The cached value of the '{@link #getServicesX() <em>Services X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicesX()
	 * @generated
	 * @ordered
	 */
	protected Services servicesX;

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
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menus;

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
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Security security;

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
	 * The cached value of the '{@link #getImageManipulations() <em>Image Manipulations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageManipulations()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageManipulation> imageManipulations;

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
	public Services getServicesX() {
		return servicesX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicesX(Services newServicesX, NotificationChain msgs) {
		Services oldServicesX = servicesX;
		servicesX = newServicesX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__SERVICES_X, oldServicesX, newServicesX);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicesX(Services newServicesX) {
		if (newServicesX != servicesX) {
			NotificationChain msgs = null;
			if (servicesX != null)
				msgs = ((InternalEObject)servicesX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__SERVICES_X, null, msgs);
			if (newServicesX != null)
				msgs = ((InternalEObject)newServicesX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.WEB_GEN_MODEL__SERVICES_X, null, msgs);
			msgs = basicSetServicesX(newServicesX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__SERVICES_X, newServicesX, newServicesX));
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
	public List<Menu> getMenus() {
		if (menus == null) {
			menus = new EObjectResolvingEList<Menu>(Menu.class, this, WebsitePackage.WEB_GEN_MODEL__MENUS);
		}
		return menus;
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
	public List<EntityOrView> getAllowTypeCustomisation() {
		if (allowTypeCustomisation == null) {
			allowTypeCustomisation = new EObjectResolvingEList<EntityOrView>(EntityOrView.class, this, WebsitePackage.WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION);
		}
		return allowTypeCustomisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ImageManipulation> getImageManipulations() {
		if (imageManipulations == null) {
			imageManipulations = new EObjectResolvingEList<ImageManipulation>(ImageManipulation.class, this, WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS);
		}
		return imageManipulations;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES:
				return basicSetWebsiteProperties(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
				return basicSetPersistence(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__SERVICES_X:
				return basicSetServicesX(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
				return basicSetWebUI(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
				return basicSetImages(null, msgs);
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
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
				return getPersistence();
			case WebsitePackage.WEB_GEN_MODEL__SERVICES_X:
				return getServicesX();
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
				return getWebUI();
			case WebsitePackage.WEB_GEN_MODEL__MENUS:
				return getMenus();
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
				return getImages();
			case WebsitePackage.WEB_GEN_MODEL__SECURITY:
				return getSecurity();
			case WebsitePackage.WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION:
				return getAllowTypeCustomisation();
			case WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS:
				return getImageManipulations();
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
			case WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES:
				setWebsiteProperties((WebsiteProperties)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
				setPersistence((Persistence)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__SERVICES_X:
				setServicesX((Services)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
				setWebUI((WebUI)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
				setImages((Image)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__SECURITY:
				setSecurity((Security)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION:
				getAllowTypeCustomisation().clear();
				getAllowTypeCustomisation().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS:
				getImageManipulations().clear();
				getImageManipulations().addAll((Collection<? extends ImageManipulation>)newValue);
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
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
				setPersistence((Persistence)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__SERVICES_X:
				setServicesX((Services)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
				setWebUI((WebUI)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__MENUS:
				getMenus().clear();
				return;
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
				setImages((Image)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__SECURITY:
				setSecurity((Security)null);
				return;
			case WebsitePackage.WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION:
				getAllowTypeCustomisation().clear();
				return;
			case WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS:
				getImageManipulations().clear();
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
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
				return persistence != null;
			case WebsitePackage.WEB_GEN_MODEL__SERVICES_X:
				return servicesX != null;
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
				return webUI != null;
			case WebsitePackage.WEB_GEN_MODEL__MENUS:
				return menus != null && !menus.isEmpty();
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
				return images != null;
			case WebsitePackage.WEB_GEN_MODEL__SECURITY:
				return security != null;
			case WebsitePackage.WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION:
				return allowTypeCustomisation != null && !allowTypeCustomisation.isEmpty();
			case WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS:
				return imageManipulations != null && !imageManipulations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WebGenModelImpl

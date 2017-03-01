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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.base.Classifier;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.GlobalMenu;
import uk.ac.man.cs.mdsd.webgen.website.ImageManipulation;
import uk.ac.man.cs.mdsd.webgen.website.Menu;
import uk.ac.man.cs.mdsd.webgen.website.Page;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Gen Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getWebsiteProperties <em>Website Properties</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getAllowTypeCustomisation <em>Allow Type Customisation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getImageManipulations <em>Image Manipulations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl#getGlobalMenu <em>Global Menu</em>}</li>
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
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifiers;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

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
	 * The cached value of the '{@link #getAllowTypeCustomisation() <em>Allow Type Customisation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowTypeCustomisation()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityOrView> allowTypeCustomisation;

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
	 * The cached value of the '{@link #getGlobalMenu() <em>Global Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalMenu()
	 * @generated
	 * @ordered
	 */
	protected GlobalMenu globalMenu;

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
	public List<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, WebsitePackage.WEB_GEN_MODEL__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, WebsitePackage.WEB_GEN_MODEL__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentWithInverseEList<Page>(Page.class, this, WebsitePackage.WEB_GEN_MODEL__PAGES, WebsitePackage.PAGE__PART_OF);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Menu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, WebsitePackage.WEB_GEN_MODEL__MENUS);
		}
		return menus;
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
			imageManipulations = new EObjectContainmentEList<ImageManipulation>(ImageManipulation.class, this, WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS);
		}
		return imageManipulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMenu getGlobalMenu() {
		if (globalMenu != null && globalMenu.eIsProxy()) {
			InternalEObject oldGlobalMenu = (InternalEObject)globalMenu;
			globalMenu = (GlobalMenu)eResolveProxy(oldGlobalMenu);
			if (globalMenu != oldGlobalMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU, oldGlobalMenu, globalMenu));
			}
		}
		return globalMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMenu basicGetGlobalMenu() {
		return globalMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalMenu(GlobalMenu newGlobalMenu, NotificationChain msgs) {
		GlobalMenu oldGlobalMenu = globalMenu;
		globalMenu = newGlobalMenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU, oldGlobalMenu, newGlobalMenu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalMenu(GlobalMenu newGlobalMenu) {
		if (newGlobalMenu != globalMenu) {
			NotificationChain msgs = null;
			if (globalMenu != null)
				msgs = ((InternalEObject)globalMenu).eInverseRemove(this, WebsitePackage.GLOBAL_MENU__MENU_FOR, GlobalMenu.class, msgs);
			if (newGlobalMenu != null)
				msgs = ((InternalEObject)newGlobalMenu).eInverseAdd(this, WebsitePackage.GLOBAL_MENU__MENU_FOR, GlobalMenu.class, msgs);
			msgs = basicSetGlobalMenu(newGlobalMenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU, newGlobalMenu, newGlobalMenu));
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
			case WebsitePackage.WEB_GEN_MODEL__PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPages()).basicAdd(otherEnd, msgs);
			case WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU:
				if (globalMenu != null)
					msgs = ((InternalEObject)globalMenu).eInverseRemove(this, WebsitePackage.GLOBAL_MENU__MENU_FOR, GlobalMenu.class, msgs);
				return basicSetGlobalMenu((GlobalMenu)otherEnd, msgs);
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
			case WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES:
				return basicSetWebsiteProperties(null, msgs);
			case WebsitePackage.WEB_GEN_MODEL__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case WebsitePackage.WEB_GEN_MODEL__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case WebsitePackage.WEB_GEN_MODEL__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
			case WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS:
				return ((InternalEList<?>)getImageManipulations()).basicRemove(otherEnd, msgs);
			case WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU:
				return basicSetGlobalMenu(null, msgs);
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
			case WebsitePackage.WEB_GEN_MODEL__CLASSIFIERS:
				return getClassifiers();
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
				return getServices();
			case WebsitePackage.WEB_GEN_MODEL__PAGES:
				return getPages();
			case WebsitePackage.WEB_GEN_MODEL__MENUS:
				return getMenus();
			case WebsitePackage.WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION:
				return getAllowTypeCustomisation();
			case WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS:
				return getImageManipulations();
			case WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU:
				if (resolve) return getGlobalMenu();
				return basicGetGlobalMenu();
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
			case WebsitePackage.WEB_GEN_MODEL__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION:
				getAllowTypeCustomisation().clear();
				getAllowTypeCustomisation().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS:
				getImageManipulations().clear();
				getImageManipulations().addAll((Collection<? extends ImageManipulation>)newValue);
				return;
			case WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU:
				setGlobalMenu((GlobalMenu)newValue);
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
			case WebsitePackage.WEB_GEN_MODEL__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
				getServices().clear();
				return;
			case WebsitePackage.WEB_GEN_MODEL__PAGES:
				getPages().clear();
				return;
			case WebsitePackage.WEB_GEN_MODEL__MENUS:
				getMenus().clear();
				return;
			case WebsitePackage.WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION:
				getAllowTypeCustomisation().clear();
				return;
			case WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS:
				getImageManipulations().clear();
				return;
			case WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU:
				setGlobalMenu((GlobalMenu)null);
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
			case WebsitePackage.WEB_GEN_MODEL__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
				return services != null && !services.isEmpty();
			case WebsitePackage.WEB_GEN_MODEL__PAGES:
				return pages != null && !pages.isEmpty();
			case WebsitePackage.WEB_GEN_MODEL__MENUS:
				return menus != null && !menus.isEmpty();
			case WebsitePackage.WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION:
				return allowTypeCustomisation != null && !allowTypeCustomisation.isEmpty();
			case WebsitePackage.WEB_GEN_MODEL__IMAGE_MANIPULATIONS:
				return imageManipulations != null && !imageManipulations.isEmpty();
			case WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU:
				return globalMenu != null;
		}
		return super.eIsSet(featureID);
	}

} //WebGenModelImpl

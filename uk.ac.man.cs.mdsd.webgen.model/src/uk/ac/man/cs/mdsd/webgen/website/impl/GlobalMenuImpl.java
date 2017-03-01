/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.webgen.website.GlobalMenu;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.GlobalMenuImpl#getMenuFor <em>Menu For</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GlobalMenuImpl extends MenuImpl implements GlobalMenu {
	/**
	 * The cached value of the '{@link #getMenuFor() <em>Menu For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuFor()
	 * @generated
	 * @ordered
	 */
	protected WebGenModel menuFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.GLOBAL_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenModel getMenuFor() {
		if (menuFor != null && menuFor.eIsProxy()) {
			InternalEObject oldMenuFor = (InternalEObject)menuFor;
			menuFor = (WebGenModel)eResolveProxy(oldMenuFor);
			if (menuFor != oldMenuFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.GLOBAL_MENU__MENU_FOR, oldMenuFor, menuFor));
			}
		}
		return menuFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenModel basicGetMenuFor() {
		return menuFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenuFor(WebGenModel newMenuFor, NotificationChain msgs) {
		WebGenModel oldMenuFor = menuFor;
		menuFor = newMenuFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.GLOBAL_MENU__MENU_FOR, oldMenuFor, newMenuFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuFor(WebGenModel newMenuFor) {
		if (newMenuFor != menuFor) {
			NotificationChain msgs = null;
			if (menuFor != null)
				msgs = ((InternalEObject)menuFor).eInverseRemove(this, WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU, WebGenModel.class, msgs);
			if (newMenuFor != null)
				msgs = ((InternalEObject)newMenuFor).eInverseAdd(this, WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU, WebGenModel.class, msgs);
			msgs = basicSetMenuFor(newMenuFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.GLOBAL_MENU__MENU_FOR, newMenuFor, newMenuFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.GLOBAL_MENU__MENU_FOR:
				if (menuFor != null)
					msgs = ((InternalEObject)menuFor).eInverseRemove(this, WebsitePackage.WEB_GEN_MODEL__GLOBAL_MENU, WebGenModel.class, msgs);
				return basicSetMenuFor((WebGenModel)otherEnd, msgs);
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
			case WebsitePackage.GLOBAL_MENU__MENU_FOR:
				return basicSetMenuFor(null, msgs);
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
			case WebsitePackage.GLOBAL_MENU__MENU_FOR:
				if (resolve) return getMenuFor();
				return basicGetMenuFor();
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
			case WebsitePackage.GLOBAL_MENU__MENU_FOR:
				setMenuFor((WebGenModel)newValue);
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
			case WebsitePackage.GLOBAL_MENU__MENU_FOR:
				setMenuFor((WebGenModel)null);
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
			case WebsitePackage.GLOBAL_MENU__MENU_FOR:
				return menuFor != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalMenuImpl

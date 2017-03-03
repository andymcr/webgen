/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.webgen.webui.GlobalMenu;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.GlobalMenuImpl#getWebUI <em>Web UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GlobalMenuImpl extends MenuImpl implements GlobalMenu {
	/**
	 * The cached value of the '{@link #getWebUI() <em>Web UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUI()
	 * @generated
	 * @ordered
	 */
	protected WebUI webUI;
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
		return WebuiPackage.Literals.GLOBAL_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebUI getWebUI() {
		if (webUI != null && webUI.eIsProxy()) {
			InternalEObject oldWebUI = (InternalEObject)webUI;
			webUI = (WebUI)eResolveProxy(oldWebUI);
			if (webUI != oldWebUI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.GLOBAL_MENU__WEB_UI, oldWebUI, webUI));
			}
		}
		return webUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebUI basicGetWebUI() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.GLOBAL_MENU__WEB_UI, oldWebUI, newWebUI);
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
				msgs = ((InternalEObject)webUI).eInverseRemove(this, WebuiPackage.WEB_UI__GLOBAL_MENU, WebUI.class, msgs);
			if (newWebUI != null)
				msgs = ((InternalEObject)newWebUI).eInverseAdd(this, WebuiPackage.WEB_UI__GLOBAL_MENU, WebUI.class, msgs);
			msgs = basicSetWebUI(newWebUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.GLOBAL_MENU__WEB_UI, newWebUI, newWebUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.GLOBAL_MENU__WEB_UI:
				if (webUI != null)
					msgs = ((InternalEObject)webUI).eInverseRemove(this, WebuiPackage.WEB_UI__GLOBAL_MENU, WebUI.class, msgs);
				return basicSetWebUI((WebUI)otherEnd, msgs);
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
			case WebuiPackage.GLOBAL_MENU__WEB_UI:
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
			case WebuiPackage.GLOBAL_MENU__WEB_UI:
				if (resolve) return getWebUI();
				return basicGetWebUI();
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
			case WebuiPackage.GLOBAL_MENU__WEB_UI:
				setWebUI((WebUI)newValue);
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
			case WebuiPackage.GLOBAL_MENU__WEB_UI:
				setWebUI((WebUI)null);
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
			case WebuiPackage.GLOBAL_MENU__WEB_UI:
				return webUI != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalMenuImpl

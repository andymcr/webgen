/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuthenticationImpl.java,v 1.2 2013/04/12 11:53:06 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Authentication;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AuthenticationImpl#getAuthenticates <em>Authenticates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AuthenticationImpl#getUser <em>User</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AuthenticationImpl#getUserKey <em>User Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AuthenticationImpl#getLoginLabel <em>Login Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AuthenticationImpl#getLogoutLabel <em>Logout Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AuthenticationImpl extends EObjectImpl implements Authentication {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView user;
	/**
	 * The cached value of the '{@link #getUserKey() <em>User Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserKey()
	 * @generated
	 * @ordered
	 */
	protected Attribute userKey;
	/**
	 * The default value of the '{@link #getLoginLabel() <em>Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_LABEL_EDEFAULT = "Login";
	/**
	 * The cached value of the '{@link #getLoginLabel() <em>Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginLabel()
	 * @generated
	 * @ordered
	 */
	protected String loginLabel = LOGIN_LABEL_EDEFAULT;
	/**
	 * The default value of the '{@link #getLogoutLabel() <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGOUT_LABEL_EDEFAULT = "Logout";
	/**
	 * The cached value of the '{@link #getLogoutLabel() <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutLabel()
	 * @generated
	 * @ordered
	 */
	protected String logoutLabel = LOGOUT_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteProperties getAuthenticates() {
		if (eContainerFeatureID() != WebsitePackage.AUTHENTICATION__AUTHENTICATES) return null;
		return (WebsiteProperties)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthenticates(WebsiteProperties newAuthenticates, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAuthenticates, WebsitePackage.AUTHENTICATION__AUTHENTICATES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticates(WebsiteProperties newAuthenticates) {
		if (newAuthenticates != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.AUTHENTICATION__AUTHENTICATES && newAuthenticates != null)) {
			if (EcoreUtil.isAncestor(this, newAuthenticates))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAuthenticates != null)
				msgs = ((InternalEObject)newAuthenticates).eInverseAdd(this, WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION, WebsiteProperties.class, msgs);
			msgs = basicSetAuthenticates(newAuthenticates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.AUTHENTICATION__AUTHENTICATES, newAuthenticates, newAuthenticates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (EntityOrView)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.AUTHENTICATION__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(EntityOrView newUser) {
		EntityOrView oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.AUTHENTICATION__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getUserKey() {
		if (userKey != null && userKey.eIsProxy()) {
			InternalEObject oldUserKey = (InternalEObject)userKey;
			userKey = (Attribute)eResolveProxy(oldUserKey);
			if (userKey != oldUserKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.AUTHENTICATION__USER_KEY, oldUserKey, userKey));
			}
		}
		return userKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetUserKey() {
		return userKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserKey(Attribute newUserKey) {
		Attribute oldUserKey = userKey;
		userKey = newUserKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.AUTHENTICATION__USER_KEY, oldUserKey, userKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoginLabel() {
		return loginLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginLabel(String newLoginLabel) {
		String oldLoginLabel = loginLabel;
		loginLabel = newLoginLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.AUTHENTICATION__LOGIN_LABEL, oldLoginLabel, loginLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogoutLabel() {
		return logoutLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogoutLabel(String newLogoutLabel) {
		String oldLogoutLabel = logoutLabel;
		logoutLabel = newLogoutLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.AUTHENTICATION__LOGOUT_LABEL, oldLogoutLabel, logoutLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.AUTHENTICATION__AUTHENTICATES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAuthenticates((WebsiteProperties)otherEnd, msgs);
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
			case WebsitePackage.AUTHENTICATION__AUTHENTICATES:
				return basicSetAuthenticates(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebsitePackage.AUTHENTICATION__AUTHENTICATES:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION, WebsiteProperties.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.AUTHENTICATION__AUTHENTICATES:
				return getAuthenticates();
			case WebsitePackage.AUTHENTICATION__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case WebsitePackage.AUTHENTICATION__USER_KEY:
				if (resolve) return getUserKey();
				return basicGetUserKey();
			case WebsitePackage.AUTHENTICATION__LOGIN_LABEL:
				return getLoginLabel();
			case WebsitePackage.AUTHENTICATION__LOGOUT_LABEL:
				return getLogoutLabel();
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
			case WebsitePackage.AUTHENTICATION__AUTHENTICATES:
				setAuthenticates((WebsiteProperties)newValue);
				return;
			case WebsitePackage.AUTHENTICATION__USER:
				setUser((EntityOrView)newValue);
				return;
			case WebsitePackage.AUTHENTICATION__USER_KEY:
				setUserKey((Attribute)newValue);
				return;
			case WebsitePackage.AUTHENTICATION__LOGIN_LABEL:
				setLoginLabel((String)newValue);
				return;
			case WebsitePackage.AUTHENTICATION__LOGOUT_LABEL:
				setLogoutLabel((String)newValue);
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
			case WebsitePackage.AUTHENTICATION__AUTHENTICATES:
				setAuthenticates((WebsiteProperties)null);
				return;
			case WebsitePackage.AUTHENTICATION__USER:
				setUser((EntityOrView)null);
				return;
			case WebsitePackage.AUTHENTICATION__USER_KEY:
				setUserKey((Attribute)null);
				return;
			case WebsitePackage.AUTHENTICATION__LOGIN_LABEL:
				setLoginLabel(LOGIN_LABEL_EDEFAULT);
				return;
			case WebsitePackage.AUTHENTICATION__LOGOUT_LABEL:
				setLogoutLabel(LOGOUT_LABEL_EDEFAULT);
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
			case WebsitePackage.AUTHENTICATION__AUTHENTICATES:
				return getAuthenticates() != null;
			case WebsitePackage.AUTHENTICATION__USER:
				return user != null;
			case WebsitePackage.AUTHENTICATION__USER_KEY:
				return userKey != null;
			case WebsitePackage.AUTHENTICATION__LOGIN_LABEL:
				return LOGIN_LABEL_EDEFAULT == null ? loginLabel != null : !LOGIN_LABEL_EDEFAULT.equals(loginLabel);
			case WebsitePackage.AUTHENTICATION__LOGOUT_LABEL:
				return LOGOUT_LABEL_EDEFAULT == null ? logoutLabel != null : !LOGOUT_LABEL_EDEFAULT.equals(logoutLabel);
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
		result.append(" (loginLabel: ");
		result.append(loginLabel);
		result.append(", logoutLabel: ");
		result.append(logoutLabel);
		result.append(')');
		return result.toString();
	}

} //AuthenticationImpl

/**
 */
package security.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import security.Authentication;
import security.Security;
import security.SecurityPackage;

import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.impl.AuthenticationImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link security.impl.AuthenticationImpl#getUser <em>User</em>}</li>
 *   <li>{@link security.impl.AuthenticationImpl#getUserKey <em>User Key</em>}</li>
 *   <li>{@link security.impl.AuthenticationImpl#getLoginLabel <em>Login Label</em>}</li>
 *   <li>{@link security.impl.AuthenticationImpl#getLogoutLabel <em>Logout Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AuthenticationImpl extends MinimalEObjectImpl.Container implements Authentication {
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
		return SecurityPackage.Literals.AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security getSecurity() {
		if (eContainerFeatureID() != SecurityPackage.AUTHENTICATION__SECURITY) return null;
		return (Security)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(Security newSecurity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSecurity, SecurityPackage.AUTHENTICATION__SECURITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(Security newSecurity) {
		if (newSecurity != eInternalContainer() || (eContainerFeatureID() != SecurityPackage.AUTHENTICATION__SECURITY && newSecurity != null)) {
			if (EcoreUtil.isAncestor(this, newSecurity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, SecurityPackage.SECURITY__AUTHENTICATION, Security.class, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__SECURITY, newSecurity, newSecurity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.AUTHENTICATION__USER, oldUser, user));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__USER, oldUser, user));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.AUTHENTICATION__USER_KEY, oldUserKey, userKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__USER_KEY, oldUserKey, userKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__LOGIN_LABEL, oldLoginLabel, loginLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__LOGOUT_LABEL, oldLogoutLabel, logoutLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION__SECURITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSecurity((Security)otherEnd, msgs);
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
			case SecurityPackage.AUTHENTICATION__SECURITY:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SecurityPackage.AUTHENTICATION__SECURITY:
				return eInternalContainer().eInverseRemove(this, SecurityPackage.SECURITY__AUTHENTICATION, Security.class, msgs);
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
			case SecurityPackage.AUTHENTICATION__SECURITY:
				return getSecurity();
			case SecurityPackage.AUTHENTICATION__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				if (resolve) return getUserKey();
				return basicGetUserKey();
			case SecurityPackage.AUTHENTICATION__LOGIN_LABEL:
				return getLoginLabel();
			case SecurityPackage.AUTHENTICATION__LOGOUT_LABEL:
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
			case SecurityPackage.AUTHENTICATION__SECURITY:
				setSecurity((Security)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__USER:
				setUser((EntityOrView)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				setUserKey((Attribute)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__LOGIN_LABEL:
				setLoginLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__LOGOUT_LABEL:
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
			case SecurityPackage.AUTHENTICATION__SECURITY:
				setSecurity((Security)null);
				return;
			case SecurityPackage.AUTHENTICATION__USER:
				setUser((EntityOrView)null);
				return;
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				setUserKey((Attribute)null);
				return;
			case SecurityPackage.AUTHENTICATION__LOGIN_LABEL:
				setLoginLabel(LOGIN_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__LOGOUT_LABEL:
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
			case SecurityPackage.AUTHENTICATION__SECURITY:
				return getSecurity() != null;
			case SecurityPackage.AUTHENTICATION__USER:
				return user != null;
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				return userKey != null;
			case SecurityPackage.AUTHENTICATION__LOGIN_LABEL:
				return LOGIN_LABEL_EDEFAULT == null ? loginLabel != null : !LOGIN_LABEL_EDEFAULT.equals(loginLabel);
			case SecurityPackage.AUTHENTICATION__LOGOUT_LABEL:
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

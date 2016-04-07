/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.AuthenticationKeyTypes;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.ForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.webgen.website.LoginUnit;
import uk.ac.man.cs.mdsd.webgen.website.RegistrationUnit;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#getUser <em>User</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#getUserKey <em>User Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#getAuthenticationKey <em>Authentication Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#isTrackLoginAttempts <em>Track Login Attempts</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#isAllowAutoLogin <em>Allow Auto Login</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#getRegistrationUnit <em>Registration Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#getLoginUnit <em>Login Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LocalAuthenticationSystemImpl#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalAuthenticationSystemImpl extends AuthenticationImpl implements LocalAuthenticationSystem {
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
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView authentication;

	/**
	 * The default value of the '{@link #getAuthenticationKey() <em>Authentication Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationKey()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticationKeyTypes AUTHENTICATION_KEY_EDEFAULT = AuthenticationKeyTypes.EMAIL;

	/**
	 * The cached value of the '{@link #getAuthenticationKey() <em>Authentication Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationKey()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationKeyTypes authenticationKey = AUTHENTICATION_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseCaptcha() <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCaptcha()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CAPTCHA_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseCaptcha() <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCaptcha()
	 * @generated
	 * @ordered
	 */
	protected boolean useCaptcha = USE_CAPTCHA_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowSelfRegistration() <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSelfRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_SELF_REGISTRATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowSelfRegistration() <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSelfRegistration()
	 * @generated
	 * @ordered
	 */
	protected boolean allowSelfRegistration = ALLOW_SELF_REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrackLoginAttempts() <em>Track Login Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackLoginAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRACK_LOGIN_ATTEMPTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTrackLoginAttempts() <em>Track Login Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackLoginAttempts()
	 * @generated
	 * @ordered
	 */
	protected boolean trackLoginAttempts = TRACK_LOGIN_ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowAutoLogin() <em>Allow Auto Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowAutoLogin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_AUTO_LOGIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowAutoLogin() <em>Allow Auto Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowAutoLogin()
	 * @generated
	 * @ordered
	 */
	protected boolean allowAutoLogin = ALLOW_AUTO_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseEmailActivation() <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseEmailActivation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_EMAIL_ACTIVATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseEmailActivation() <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseEmailActivation()
	 * @generated
	 * @ordered
	 */
	protected boolean useEmailActivation = USE_EMAIL_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSendWelcomeEmail() <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendWelcomeEmail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEND_WELCOME_EMAIL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSendWelcomeEmail() <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendWelcomeEmail()
	 * @generated
	 * @ordered
	 */
	protected boolean sendWelcomeEmail = SEND_WELCOME_EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegistrationUnit() <em>Registration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationUnit()
	 * @generated
	 * @ordered
	 */
	protected RegistrationUnit registrationUnit;

	/**
	 * The cached value of the '{@link #getLoginUnit() <em>Login Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginUnit()
	 * @generated
	 * @ordered
	 */
	protected LoginUnit loginUnit;

	/**
	 * The cached value of the '{@link #getForgottenPasswordUnit() <em>Forgotten Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 * @ordered
	 */
	protected ForgottenPasswordUnit forgottenPasswordUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalAuthenticationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER, oldUser, user));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER, oldUser, user));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY, oldUserKey, userKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY, oldUserKey, userKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getAuthentication() {
		if (authentication != null && authentication.eIsProxy()) {
			InternalEObject oldAuthentication = (InternalEObject)authentication;
			authentication = (EntityOrView)eResolveProxy(oldAuthentication);
			if (authentication != oldAuthentication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION, oldAuthentication, authentication));
			}
		}
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(EntityOrView newAuthentication) {
		EntityOrView oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION, oldAuthentication, authentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationKeyTypes getAuthenticationKey() {
		return authenticationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationKey(AuthenticationKeyTypes newAuthenticationKey) {
		AuthenticationKeyTypes oldAuthenticationKey = authenticationKey;
		authenticationKey = newAuthenticationKey == null ? AUTHENTICATION_KEY_EDEFAULT : newAuthenticationKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY, oldAuthenticationKey, authenticationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseCaptcha() {
		return useCaptcha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCaptcha(boolean newUseCaptcha) {
		boolean oldUseCaptcha = useCaptcha;
		useCaptcha = newUseCaptcha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA, oldUseCaptcha, useCaptcha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowSelfRegistration() {
		return allowSelfRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowSelfRegistration(boolean newAllowSelfRegistration) {
		boolean oldAllowSelfRegistration = allowSelfRegistration;
		allowSelfRegistration = newAllowSelfRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION, oldAllowSelfRegistration, allowSelfRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrackLoginAttempts() {
		return trackLoginAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackLoginAttempts(boolean newTrackLoginAttempts) {
		boolean oldTrackLoginAttempts = trackLoginAttempts;
		trackLoginAttempts = newTrackLoginAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS, oldTrackLoginAttempts, trackLoginAttempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowAutoLogin() {
		return allowAutoLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowAutoLogin(boolean newAllowAutoLogin) {
		boolean oldAllowAutoLogin = allowAutoLogin;
		allowAutoLogin = newAllowAutoLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_AUTO_LOGIN, oldAllowAutoLogin, allowAutoLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseEmailActivation() {
		return useEmailActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseEmailActivation(boolean newUseEmailActivation) {
		boolean oldUseEmailActivation = useEmailActivation;
		useEmailActivation = newUseEmailActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION, oldUseEmailActivation, useEmailActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSendWelcomeEmail() {
		return sendWelcomeEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendWelcomeEmail(boolean newSendWelcomeEmail) {
		boolean oldSendWelcomeEmail = sendWelcomeEmail;
		sendWelcomeEmail = newSendWelcomeEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL, oldSendWelcomeEmail, sendWelcomeEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationUnit getRegistrationUnit() {
		if (registrationUnit != null && registrationUnit.eIsProxy()) {
			InternalEObject oldRegistrationUnit = (InternalEObject)registrationUnit;
			registrationUnit = (RegistrationUnit)eResolveProxy(oldRegistrationUnit);
			if (registrationUnit != oldRegistrationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, oldRegistrationUnit, registrationUnit));
			}
		}
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationUnit basicGetRegistrationUnit() {
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationUnit(RegistrationUnit newRegistrationUnit) {
		RegistrationUnit oldRegistrationUnit = registrationUnit;
		registrationUnit = newRegistrationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, oldRegistrationUnit, registrationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUnit getLoginUnit() {
		if (loginUnit != null && loginUnit.eIsProxy()) {
			InternalEObject oldLoginUnit = (InternalEObject)loginUnit;
			loginUnit = (LoginUnit)eResolveProxy(oldLoginUnit);
			if (loginUnit != oldLoginUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, oldLoginUnit, loginUnit));
			}
		}
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUnit basicGetLoginUnit() {
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginUnit(LoginUnit newLoginUnit) {
		LoginUnit oldLoginUnit = loginUnit;
		loginUnit = newLoginUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, oldLoginUnit, loginUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnit getForgottenPasswordUnit() {
		if (forgottenPasswordUnit != null && forgottenPasswordUnit.eIsProxy()) {
			InternalEObject oldForgottenPasswordUnit = (InternalEObject)forgottenPasswordUnit;
			forgottenPasswordUnit = (ForgottenPasswordUnit)eResolveProxy(oldForgottenPasswordUnit);
			if (forgottenPasswordUnit != oldForgottenPasswordUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT, oldForgottenPasswordUnit, forgottenPasswordUnit));
			}
		}
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnit basicGetForgottenPasswordUnit() {
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForgottenPasswordUnit(ForgottenPasswordUnit newForgottenPasswordUnit) {
		ForgottenPasswordUnit oldForgottenPasswordUnit = forgottenPasswordUnit;
		forgottenPasswordUnit = newForgottenPasswordUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT, oldForgottenPasswordUnit, forgottenPasswordUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY:
				if (resolve) return getUserKey();
				return basicGetUserKey();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				if (resolve) return getAuthentication();
				return basicGetAuthentication();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return getAuthenticationKey();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				return isUseCaptcha();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return isAllowSelfRegistration();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS:
				return isTrackLoginAttempts();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_AUTO_LOGIN:
				return isAllowAutoLogin();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				return isUseEmailActivation();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				return isSendWelcomeEmail();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				if (resolve) return getRegistrationUnit();
				return basicGetRegistrationUnit();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				if (resolve) return getLoginUnit();
				return basicGetLoginUnit();
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				if (resolve) return getForgottenPasswordUnit();
				return basicGetForgottenPasswordUnit();
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
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER:
				setUser((EntityOrView)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY:
				setUserKey((Attribute)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				setAuthentication((EntityOrView)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey((AuthenticationKeyTypes)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				setUseCaptcha((Boolean)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration((Boolean)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS:
				setTrackLoginAttempts((Boolean)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_AUTO_LOGIN:
				setAllowAutoLogin((Boolean)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				setUseEmailActivation((Boolean)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				setSendWelcomeEmail((Boolean)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				setRegistrationUnit((RegistrationUnit)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				setLoginUnit((LoginUnit)newValue);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				setForgottenPasswordUnit((ForgottenPasswordUnit)newValue);
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
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER:
				setUser((EntityOrView)null);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY:
				setUserKey((Attribute)null);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				setAuthentication((EntityOrView)null);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey(AUTHENTICATION_KEY_EDEFAULT);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				setUseCaptcha(USE_CAPTCHA_EDEFAULT);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration(ALLOW_SELF_REGISTRATION_EDEFAULT);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS:
				setTrackLoginAttempts(TRACK_LOGIN_ATTEMPTS_EDEFAULT);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_AUTO_LOGIN:
				setAllowAutoLogin(ALLOW_AUTO_LOGIN_EDEFAULT);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				setUseEmailActivation(USE_EMAIL_ACTIVATION_EDEFAULT);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				setSendWelcomeEmail(SEND_WELCOME_EMAIL_EDEFAULT);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				setRegistrationUnit((RegistrationUnit)null);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				setLoginUnit((LoginUnit)null);
				return;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				setForgottenPasswordUnit((ForgottenPasswordUnit)null);
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
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER:
				return user != null;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY:
				return userKey != null;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				return authentication != null;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return authenticationKey != AUTHENTICATION_KEY_EDEFAULT;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				return useCaptcha != USE_CAPTCHA_EDEFAULT;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return allowSelfRegistration != ALLOW_SELF_REGISTRATION_EDEFAULT;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS:
				return trackLoginAttempts != TRACK_LOGIN_ATTEMPTS_EDEFAULT;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_AUTO_LOGIN:
				return allowAutoLogin != ALLOW_AUTO_LOGIN_EDEFAULT;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				return useEmailActivation != USE_EMAIL_ACTIVATION_EDEFAULT;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				return sendWelcomeEmail != SEND_WELCOME_EMAIL_EDEFAULT;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				return registrationUnit != null;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				return loginUnit != null;
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				return forgottenPasswordUnit != null;
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
		result.append(" (authenticationKey: ");
		result.append(authenticationKey);
		result.append(", useCaptcha: ");
		result.append(useCaptcha);
		result.append(", allowSelfRegistration: ");
		result.append(allowSelfRegistration);
		result.append(", trackLoginAttempts: ");
		result.append(trackLoginAttempts);
		result.append(", allowAutoLogin: ");
		result.append(allowAutoLogin);
		result.append(", useEmailActivation: ");
		result.append(useEmailActivation);
		result.append(", sendWelcomeEmail: ");
		result.append(sendWelcomeEmail);
		result.append(')');
		return result.toString();
	}

} //LocalAuthenticationSystemImpl

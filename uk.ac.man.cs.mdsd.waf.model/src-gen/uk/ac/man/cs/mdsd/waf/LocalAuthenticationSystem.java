/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginAttempt <em>Login Attempt</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAutoLogin <em>Auto Login</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem()
 * @model
 * @generated
 */
public interface LocalAuthenticationSystem extends Authentication {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' reference.
	 * @see #setAuthentication(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_Authentication()
	 * @model
	 * @generated
	 */
	EntityOrView getAuthentication();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAuthentication <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(EntityOrView value);

	/**
	 * Returns the value of the '<em><b>Authentication Key</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Key</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes
	 * @see #setAuthenticationKey(AuthenticationKeyTypes)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_AuthenticationKey()
	 * @model unique="false" required="true"
	 * @generated
	 */
	AuthenticationKeyTypes getAuthenticationKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Key</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes
	 * @see #getAuthenticationKey()
	 * @generated
	 */
	void setAuthenticationKey(AuthenticationKeyTypes value);

	/**
	 * Returns the value of the '<em><b>Login Attempt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Attempt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Attempt</em>' reference.
	 * @see #setLoginAttempt(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_LoginAttempt()
	 * @model
	 * @generated
	 */
	EntityOrView getLoginAttempt();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginAttempt <em>Login Attempt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Attempt</em>' reference.
	 * @see #getLoginAttempt()
	 * @generated
	 */
	void setLoginAttempt(EntityOrView value);

	/**
	 * Returns the value of the '<em><b>Auto Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Login</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Login</em>' reference.
	 * @see #setAutoLogin(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_AutoLogin()
	 * @model
	 * @generated
	 */
	EntityOrView getAutoLogin();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAutoLogin <em>Auto Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Login</em>' reference.
	 * @see #getAutoLogin()
	 * @generated
	 */
	void setAutoLogin(EntityOrView value);

	/**
	 * Returns the value of the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Captcha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Captcha</em>' attribute.
	 * @see #setUseCaptcha(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_UseCaptcha()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUseCaptcha();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Captcha</em>' attribute.
	 * @see #isUseCaptcha()
	 * @generated
	 */
	void setUseCaptcha(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Remember Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Remember Me</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Remember Me</em>' attribute.
	 * @see #setAllowRememberMe(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_AllowRememberMe()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowRememberMe();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Remember Me</em>' attribute.
	 * @see #isAllowRememberMe()
	 * @generated
	 */
	void setAllowRememberMe(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Self Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Self Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #setAllowSelfRegistration(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_AllowSelfRegistration()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowSelfRegistration();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #isAllowSelfRegistration()
	 * @generated
	 */
	void setAllowSelfRegistration(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Email Activation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Email Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Email Activation</em>' attribute.
	 * @see #setUseEmailActivation(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_UseEmailActivation()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseEmailActivation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Email Activation</em>' attribute.
	 * @see #isUseEmailActivation()
	 * @generated
	 */
	void setUseEmailActivation(boolean value);

	/**
	 * Returns the value of the '<em><b>Send Welcome Email</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Welcome Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #setSendWelcomeEmail(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_SendWelcomeEmail()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isSendWelcomeEmail();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #isSendWelcomeEmail()
	 * @generated
	 */
	void setSendWelcomeEmail(boolean value);

	/**
	 * Returns the value of the '<em><b>Registration Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.RegistrationUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Unit</em>' reference.
	 * @see #setRegistrationUnit(RegistrationUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_RegistrationUnit()
	 * @see uk.ac.man.cs.mdsd.waf.RegistrationUnit#getAuthenticationSystem
	 * @model opposite="authenticationSystem"
	 * @generated
	 */
	RegistrationUnit getRegistrationUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Unit</em>' reference.
	 * @see #getRegistrationUnit()
	 * @generated
	 */
	void setRegistrationUnit(RegistrationUnit value);

	/**
	 * Returns the value of the '<em><b>Login Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Unit</em>' reference.
	 * @see #setLoginUnit(LoginUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_LoginUnit()
	 * @see uk.ac.man.cs.mdsd.waf.LoginUnit#getAuthenticationSystem
	 * @model opposite="authenticationSystem"
	 * @generated
	 */
	LoginUnit getLoginUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Unit</em>' reference.
	 * @see #getLoginUnit()
	 * @generated
	 */
	void setLoginUnit(LoginUnit value);

	/**
	 * Returns the value of the '<em><b>Forgotten Password Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forgotten Password Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forgotten Password Unit</em>' reference.
	 * @see #setForgottenPasswordUnit(ForgottenPasswordUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_ForgottenPasswordUnit()
	 * @see uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getAuthenticationSystem
	 * @model opposite="authenticationSystem"
	 * @generated
	 */
	ForgottenPasswordUnit getForgottenPasswordUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forgotten Password Unit</em>' reference.
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	void setForgottenPasswordUnit(ForgottenPasswordUnit value);

} // LocalAuthenticationSystem

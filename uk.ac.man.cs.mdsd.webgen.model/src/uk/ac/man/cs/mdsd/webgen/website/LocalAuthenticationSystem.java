/**
 */
package uk.ac.man.cs.mdsd.webgen.website;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getUser <em>User</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getUserAuthenticationKey <em>User Authentication Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isTrackLoginAttempts <em>Track Login Attempts</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isAllowAutoLogin <em>Allow Auto Login</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='authenticationKeyFromUser authenticationKeyRequiredAttribute captchaRequiresKeys'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL authenticationKeyFromUser='not user.oclIsUndefined() and not userAuthenticationKey.oclIsUndefined() implies\r\n\tuser.features->includes(userAuthenticationKey)' authenticationKeyRequiredAttribute='not userAuthenticationKey.oclIsUndefined() implies\r\n\tif userAuthenticationKey.oclIsTypeOf(EncapsulatedAttribute) then\r\n\t\tuserAuthenticationKey.oclAsType(EncapsulatedAttribute).cardinality = Cardinality::Required\r\n\telse\r\n\t\tuserAuthenticationKey.oclAsType(EntityAttribute).cardinality = Cardinality::Required\r\n\tendif' captchaRequiresKeys='useCaptcha implies not authenticates.captchaSiteKey.oclIsUndefined() and not authenticates.captchaSecretKey.oclIsUndefined()'"
 * @generated
 */
public interface LocalAuthenticationSystem extends Authentication {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_User()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EntityOrView getUser();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(EntityOrView value);

	/**
	 * Returns the value of the '<em><b>User Authentication Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Authentication Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Authentication Key</em>' reference.
	 * @see #setUserAuthenticationKey(Attribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_UserAuthenticationKey()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getUserAuthenticationKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getUserAuthenticationKey <em>User Authentication Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Authentication Key</em>' reference.
	 * @see #getUserAuthenticationKey()
	 * @generated
	 */
	void setUserAuthenticationKey(Attribute value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_Authentication()
	 * @model ordered="false"
	 * @generated
	 */
	EntityOrView getAuthentication();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getAuthentication <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(EntityOrView value);

	/**
	 * Returns the value of the '<em><b>Use Captcha</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Captcha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Captcha</em>' attribute.
	 * @see #setUseCaptcha(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_UseCaptcha()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isUseCaptcha();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Captcha</em>' attribute.
	 * @see #isUseCaptcha()
	 * @generated
	 */
	void setUseCaptcha(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Self Registration</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Self Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #setAllowSelfRegistration(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_AllowSelfRegistration()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isAllowSelfRegistration();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #isAllowSelfRegistration()
	 * @generated
	 */
	void setAllowSelfRegistration(boolean value);

	/**
	 * Returns the value of the '<em><b>Track Login Attempts</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Login Attempts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Login Attempts</em>' attribute.
	 * @see #setTrackLoginAttempts(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_TrackLoginAttempts()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isTrackLoginAttempts();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isTrackLoginAttempts <em>Track Login Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Login Attempts</em>' attribute.
	 * @see #isTrackLoginAttempts()
	 * @generated
	 */
	void setTrackLoginAttempts(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Auto Login</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Auto Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Auto Login</em>' attribute.
	 * @see #setAllowAutoLogin(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_AllowAutoLogin()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isAllowAutoLogin();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isAllowAutoLogin <em>Allow Auto Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Auto Login</em>' attribute.
	 * @see #isAllowAutoLogin()
	 * @generated
	 */
	void setAllowAutoLogin(boolean value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_UseEmailActivation()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isUseEmailActivation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_SendWelcomeEmail()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isSendWelcomeEmail();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #isSendWelcomeEmail()
	 * @generated
	 */
	void setSendWelcomeEmail(boolean value);

	/**
	 * Returns the value of the '<em><b>Registration Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Unit</em>' reference.
	 * @see #setRegistrationUnit(RegistrationUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_RegistrationUnit()
	 * @model ordered="false"
	 * @generated
	 */
	RegistrationUnit getRegistrationUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Unit</em>' reference.
	 * @see #getRegistrationUnit()
	 * @generated
	 */
	void setRegistrationUnit(RegistrationUnit value);

	/**
	 * Returns the value of the '<em><b>Login Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Unit</em>' reference.
	 * @see #setLoginUnit(LoginUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_LoginUnit()
	 * @model ordered="false"
	 * @generated
	 */
	LoginUnit getLoginUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Unit</em>' reference.
	 * @see #getLoginUnit()
	 * @generated
	 */
	void setLoginUnit(LoginUnit value);

	/**
	 * Returns the value of the '<em><b>Forgotten Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forgotten Password Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forgotten Password Unit</em>' reference.
	 * @see #setForgottenPasswordUnit(ForgottenPasswordUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_ForgottenPasswordUnit()
	 * @model ordered="false"
	 * @generated
	 */
	ForgottenPasswordUnit getForgottenPasswordUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forgotten Password Unit</em>' reference.
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	void setForgottenPasswordUnit(ForgottenPasswordUnit value);

} // LocalAuthenticationSystem

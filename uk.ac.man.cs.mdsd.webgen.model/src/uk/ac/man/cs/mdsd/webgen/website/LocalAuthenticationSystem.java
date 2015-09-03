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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getUserSource <em>User Source</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getUserAuthenticationKey <em>User Authentication Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getAuthenticationSource <em>Authentication Source</em>}</li>
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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='entitySourceOnlyIfNotEncapsulated authenticationKeyFromUserSource authenticationKeyRequiredAttribute captchaRequiresKeys'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL authenticationKeyFromUserSource='not userSource.oclIsUndefined() implies\r\n\tlet features : Collection(Feature)\r\n\t\t= if userSource.oclIsTypeOf(Entity) then\r\n\t\t\t\tuserSource.oclAsType(Entity).features\r\n\t\t\telse if userSource.oclIsTypeOf(View) then\r\n\t\t\t\tuserSource.oclAsType(View).features\r\n\t\t\telse let entities : Sequence(Entity)\r\n\t\t\t\t\t= userSource.oclAsType(Service).encapsulates->select(e | e.oclIsTypeOf(Entity)).oclAsType(Entity)\r\n\t\t\t\tin entities->collect(e | e.features)->union(entities->collect(e | e.associationEnds))\r\n\t\t\t\t\t->union(userSource.oclAsType(Service).encapsulates->select(v | v.oclIsTypeOf(View)).oclAsType(View)->collect(v | v.features))\r\n\t\t\tendif endif\r\n\tin features->includes(userAuthenticationKey)' authenticationKeyRequiredAttribute='if userAuthenticationKey.oclIsUndefined() then false else userAuthenticationKey.cardinality = Cardinality::Required endif' captchaRequiresKeys='useCaptcha implies not authenticates.captchaSiteKey.oclIsUndefined() and not authenticates.captchaSecretKey.oclIsUndefined()' entitySourceOnlyIfNotEncapsulated='userSource.oclIsTypeOf(Entity) implies userSource.oclAsType(Entity).servedBy->isEmpty()'"
 * @generated
 */
public interface LocalAuthenticationSystem extends Authentication {
	/**
	 * Returns the value of the '<em><b>User Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Source</em>' reference.
	 * @see #setUserSource(UnitSource)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_UserSource()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UnitSource getUserSource();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getUserSource <em>User Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Source</em>' reference.
	 * @see #getUserSource()
	 * @generated
	 */
	void setUserSource(UnitSource value);

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
	 * Returns the value of the '<em><b>Authentication Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Source</em>' reference.
	 * @see #setAuthenticationSource(UnitSource)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLocalAuthenticationSystem_AuthenticationSource()
	 * @model ordered="false"
	 * @generated
	 */
	UnitSource getAuthenticationSource();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem#getAuthenticationSource <em>Authentication Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Source</em>' reference.
	 * @see #getAuthenticationSource()
	 * @generated
	 */
	void setAuthenticationSource(UnitSource value);

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

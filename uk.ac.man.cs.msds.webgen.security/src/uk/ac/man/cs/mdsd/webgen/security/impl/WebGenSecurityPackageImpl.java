/**
 */
package uk.ac.man.cs.mdsd.webgen.security.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.WebGenPersistencePackage;
import uk.ac.man.cs.mdsd.webgen.security.Authentication;
import uk.ac.man.cs.mdsd.webgen.security.AuthenticationKeyTypes;
import uk.ac.man.cs.mdsd.webgen.security.Authorisation;
import uk.ac.man.cs.mdsd.webgen.security.CasAuthentication;
import uk.ac.man.cs.mdsd.webgen.security.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.webgen.security.Security;
import uk.ac.man.cs.mdsd.webgen.security.WebGenSecurityFactory;
import uk.ac.man.cs.mdsd.webgen.security.WebGenSecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebGenSecurityPackageImpl extends EPackageImpl implements WebGenSecurityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localAuthenticationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authenticationKeyTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.man.cs.mdsd.webgen.security.WebGenSecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebGenSecurityPackageImpl() {
		super(eNS_URI, WebGenSecurityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WebGenSecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebGenSecurityPackage init() {
		if (isInited) return (WebGenSecurityPackage)EPackage.Registry.INSTANCE.getEPackage(WebGenSecurityPackage.eNS_URI);

		// Obtain or create and register package
		WebGenSecurityPackageImpl theWebGenSecurityPackage = (WebGenSecurityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebGenSecurityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebGenSecurityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		WebGenPersistencePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebGenSecurityPackage.createPackageContents();

		// Initialize created meta-data
		theWebGenSecurityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWebGenSecurityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebGenSecurityPackage.eNS_URI, theWebGenSecurityPackage);
		return theWebGenSecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurity_User() {
		return (EReference)securityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurity_UserKey() {
		return (EReference)securityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurity_Authentication() {
		return (EReference)securityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_LoginLabel() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_LogoutLabel() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalAuthenticationSystem() {
		return localAuthenticationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AuthenticationKey() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_UseCaptcha() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowRememberMe() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowSelfRegistration() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_TrackLoginAttempts() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_UseEmailActivation() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_SendWelcomeEmail() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasAuthentication() {
		return casAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorisation() {
		return authorisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthenticationKeyTypes() {
		return authenticationKeyTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenSecurityFactory getWebGenSecurityFactory() {
		return (WebGenSecurityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		securityEClass = createEClass(SECURITY);
		createEReference(securityEClass, SECURITY__USER);
		createEReference(securityEClass, SECURITY__USER_KEY);
		createEReference(securityEClass, SECURITY__AUTHENTICATION);

		authenticationEClass = createEClass(AUTHENTICATION);
		createEAttribute(authenticationEClass, AUTHENTICATION__LOGIN_LABEL);
		createEAttribute(authenticationEClass, AUTHENTICATION__LOGOUT_LABEL);

		localAuthenticationSystemEClass = createEClass(LOCAL_AUTHENTICATION_SYSTEM);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL);

		casAuthenticationEClass = createEClass(CAS_AUTHENTICATION);

		authorisationEClass = createEClass(AUTHORISATION);

		// Create enums
		authenticationKeyTypesEEnum = createEEnum(AUTHENTICATION_KEY_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		WebGenPersistencePackage theWebGenPersistencePackage = (WebGenPersistencePackage)EPackage.Registry.INSTANCE.getEPackage(WebGenPersistencePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localAuthenticationSystemEClass.getESuperTypes().add(this.getAuthentication());
		casAuthenticationEClass.getESuperTypes().add(this.getAuthentication());

		// Initialize classes, features, and operations; add parameters
		initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurity_User(), theWebGenPersistencePackage.getEntityOrView(), null, "user", null, 0, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurity_UserKey(), theWebGenPersistencePackage.getAttribute(), null, "userKey", null, 0, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurity_Authentication(), this.getAuthentication(), null, "authentication", null, 0, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthentication_LoginLabel(), ecorePackage.getEString(), "loginLabel", "Login", 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthentication_LogoutLabel(), ecorePackage.getEString(), "logoutLabel", "Logout", 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localAuthenticationSystemEClass, LocalAuthenticationSystem.class, "LocalAuthenticationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalAuthenticationSystem_AuthenticationKey(), this.getAuthenticationKeyTypes(), "authenticationKey", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_UseCaptcha(), ecorePackage.getEBoolean(), "useCaptcha", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowRememberMe(), ecorePackage.getEBoolean(), "allowRememberMe", "false", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowSelfRegistration(), ecorePackage.getEBoolean(), "allowSelfRegistration", "false", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_TrackLoginAttempts(), ecorePackage.getEBoolean(), "trackLoginAttempts", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_UseEmailActivation(), ecorePackage.getEBoolean(), "useEmailActivation", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_SendWelcomeEmail(), ecorePackage.getEBoolean(), "sendWelcomeEmail", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(casAuthenticationEClass, CasAuthentication.class, "CasAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authorisationEClass, Authorisation.class, "Authorisation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(authenticationKeyTypesEEnum, AuthenticationKeyTypes.class, "AuthenticationKeyTypes");
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.EMAIL);
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.SCREEN_NAME);
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.USERNAME);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

} //WebGenSecurityPackageImpl

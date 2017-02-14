/**
 */
package uk.ac.man.cs.mdsd.webgen.waf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.webgen.image.WebGenImagePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.WebGenPersistencePackage;

import uk.ac.man.cs.mdsd.webgen.rest.WebGenRestPackage;
import uk.ac.man.cs.mdsd.webgen.security.WebGenSecurityPackage;

import uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage;

import uk.ac.man.cs.mdsd.webgen.waf.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework;
import uk.ac.man.cs.mdsd.webgen.waf.WebGenWafFactory;
import uk.ac.man.cs.mdsd.webgen.waf.WebGenWafPackage;
import uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebGenWafPackageImpl extends EPackageImpl implements WebGenWafPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webApplicationFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frameworkTechnologiesEEnum = null;

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
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebGenWafPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebGenWafPackageImpl() {
		super(eNS_URI, WebGenWafFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WebGenWafPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebGenWafPackage init() {
		if (isInited) return (WebGenWafPackage)EPackage.Registry.INSTANCE.getEPackage(WebGenWafPackage.eNS_URI);

		// Obtain or create and register package
		WebGenWafPackageImpl theWebGenWafPackage = (WebGenWafPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebGenWafPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebGenWafPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		WebGenWebUIPackage.eINSTANCE.eClass();
		WebGenRestPackage.eINSTANCE.eClass();
		WebGenSecurityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebGenWafPackage.createPackageContents();

		// Initialize created meta-data
		theWebGenWafPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWebGenWafPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebGenWafPackage.eNS_URI, theWebGenWafPackage);
		return theWebGenWafPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebApplicationFramework() {
		return webApplicationFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebApplicationFramework_SiteTitle() {
		return (EAttribute)webApplicationFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebApplicationFramework_WebmasterEmail() {
		return (EAttribute)webApplicationFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebApplicationFramework_CopyrightText() {
		return (EAttribute)webApplicationFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebApplicationFramework_FrameworkTechnology() {
		return (EAttribute)webApplicationFrameworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebApplicationFramework_CaptchaSiteKey() {
		return (EAttribute)webApplicationFrameworkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebApplicationFramework_CaptchaSecretKey() {
		return (EAttribute)webApplicationFrameworkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebApplicationFramework_Security() {
		return (EReference)webApplicationFrameworkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebApplicationFramework_Persistence() {
		return (EReference)webApplicationFrameworkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebApplicationFramework_Services() {
		return (EReference)webApplicationFrameworkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebApplicationFramework_Api() {
		return (EReference)webApplicationFrameworkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebApplicationFramework_Image() {
		return (EReference)webApplicationFrameworkEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebApplicationFramework_WebUI() {
		return (EReference)webApplicationFrameworkEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebApplicationFramework_MetaDescription() {
		return (EAttribute)webApplicationFrameworkEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrameworkTechnologies() {
		return frameworkTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenWafFactory getWebGenWafFactory() {
		return (WebGenWafFactory)getEFactoryInstance();
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
		webApplicationFrameworkEClass = createEClass(WEB_APPLICATION_FRAMEWORK);
		createEAttribute(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__SITE_TITLE);
		createEAttribute(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__WEBMASTER_EMAIL);
		createEAttribute(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__COPYRIGHT_TEXT);
		createEAttribute(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__FRAMEWORK_TECHNOLOGY);
		createEAttribute(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__CAPTCHA_SITE_KEY);
		createEAttribute(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__CAPTCHA_SECRET_KEY);
		createEReference(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__SECURITY);
		createEReference(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__PERSISTENCE);
		createEReference(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__SERVICES);
		createEReference(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__API);
		createEReference(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__IMAGE);
		createEReference(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__WEB_UI);
		createEAttribute(webApplicationFrameworkEClass, WEB_APPLICATION_FRAMEWORK__META_DESCRIPTION);

		// Create enums
		frameworkTechnologiesEEnum = createEEnum(FRAMEWORK_TECHNOLOGIES);
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
		WebGenSecurityPackage theWebGenSecurityPackage = (WebGenSecurityPackage)EPackage.Registry.INSTANCE.getEPackage(WebGenSecurityPackage.eNS_URI);
		WebGenPersistencePackage theWebGenPersistencePackage = (WebGenPersistencePackage)EPackage.Registry.INSTANCE.getEPackage(WebGenPersistencePackage.eNS_URI);
		WebGenServicePackage theWebGenServicePackage = (WebGenServicePackage)EPackage.Registry.INSTANCE.getEPackage(WebGenServicePackage.eNS_URI);
		WebGenRestPackage theWebGenRestPackage = (WebGenRestPackage)EPackage.Registry.INSTANCE.getEPackage(WebGenRestPackage.eNS_URI);
		WebGenImagePackage theWebGenImagePackage = (WebGenImagePackage)EPackage.Registry.INSTANCE.getEPackage(WebGenImagePackage.eNS_URI);
		WebGenWebUIPackage theWebGenWebUIPackage = (WebGenWebUIPackage)EPackage.Registry.INSTANCE.getEPackage(WebGenWebUIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(webApplicationFrameworkEClass, WebApplicationFramework.class, "WebApplicationFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebApplicationFramework_SiteTitle(), ecorePackage.getEString(), "siteTitle", null, 1, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebApplicationFramework_WebmasterEmail(), ecorePackage.getEString(), "webmasterEmail", null, 1, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebApplicationFramework_CopyrightText(), ecorePackage.getEString(), "copyrightText", null, 0, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebApplicationFramework_FrameworkTechnology(), this.getFrameworkTechnologies(), "frameworkTechnology", "Kohana", 1, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebApplicationFramework_CaptchaSiteKey(), ecorePackage.getEString(), "captchaSiteKey", null, 0, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebApplicationFramework_CaptchaSecretKey(), ecorePackage.getEString(), "captchaSecretKey", null, 0, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWebApplicationFramework_Security(), theWebGenSecurityPackage.getSecurity(), null, "security", null, 0, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebApplicationFramework_Persistence(), theWebGenPersistencePackage.getPersistence(), null, "persistence", null, 0, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebApplicationFramework_Services(), theWebGenServicePackage.getServices(), null, "services", null, 0, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebApplicationFramework_Api(), theWebGenRestPackage.getAPI(), null, "api", null, 0, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebApplicationFramework_Image(), theWebGenImagePackage.getImage(), null, "image", null, 0, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebApplicationFramework_WebUI(), theWebGenWebUIPackage.getWebUI(), null, "webUI", null, 0, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebApplicationFramework_MetaDescription(), ecorePackage.getEString(), "metaDescription", null, 0, 1, WebApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(frameworkTechnologiesEEnum, FrameworkTechnologies.class, "FrameworkTechnologies");
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.JSF);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.CAKE_PHP);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.CODE_IGNITER);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.KOHANA);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.LARAVEL);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.SYMFONY);

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

} //WebGenWafPackageImpl

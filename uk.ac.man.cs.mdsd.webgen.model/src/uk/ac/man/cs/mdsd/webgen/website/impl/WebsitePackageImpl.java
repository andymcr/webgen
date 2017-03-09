/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsitePackageImpl.java,v 1.171 2014/08/22 14:32:52 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.webgen.image.ImagePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.security.SecurityPackage;
import uk.ac.man.cs.mdsd.webgen.service.ServicePackage;
import uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties;

import uk.ac.man.cs.mdsd.webgen.website.util.WebsiteValidator;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsitePackageImpl extends EPackageImpl implements WebsitePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webGenModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass websitePropertiesEClass = null;

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebsitePackageImpl() {
		super(eNS_URI, WebsiteFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WebsitePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebsitePackage init() {
		if (isInited) return (WebsitePackage)EPackage.Registry.INSTANCE.getEPackage(WebsitePackage.eNS_URI);

		// Obtain or create and register package
		WebsitePackageImpl theWebsitePackage = (WebsitePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebsitePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebsitePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SecurityPackage.eINSTANCE.eClass();
		WebuiPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebsitePackage.createPackageContents();

		// Initialize created meta-data
		theWebsitePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWebsitePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WebsiteValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWebsitePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebsitePackage.eNS_URI, theWebsitePackage);
		return theWebsitePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebGenModel() {
		return webGenModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_WebsiteProperties() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_ServicesX() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_WebUI() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_Menus() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_Images() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_Security() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_AllowTypeCustomisation() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_ImageManipulations() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_Persistence() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebsiteProperties() {
		return websitePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_SiteTitle() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DevelopmentVersion() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_BaseURL() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_RewriteURLs() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_WebmasterEmail() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_CopyrightText() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_MetaDescription() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_ProjectName() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TestProjectName() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultDateFormat() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultTimeFormat() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultDateTimeFormat() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultMaximumUploadSize() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_FrameworkTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_InputTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_AjaxTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_CaptchaSiteKey() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_CaptchaSecretKey() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TextEditorURL() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_ResponsiveTopMenu() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TopNavigationId() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsiteProperties_SideMenu() {
		return (EReference)websitePropertiesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_SiteTemplate() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_StaticUnitsEditable() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(23);
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
	public WebsiteFactory getWebsiteFactory() {
		return (WebsiteFactory)getEFactoryInstance();
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
		webGenModelEClass = createEClass(WEB_GEN_MODEL);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__WEBSITE_PROPERTIES);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__PERSISTENCE);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__SERVICES_X);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__WEB_UI);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__MENUS);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__IMAGES);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__SECURITY);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__IMAGE_MANIPULATIONS);

		websitePropertiesEClass = createEClass(WEBSITE_PROPERTIES);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__SITE_TITLE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEVELOPMENT_VERSION);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__BASE_URL);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__REWRITE_UR_LS);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__WEBMASTER_EMAIL);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__COPYRIGHT_TEXT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__META_DESCRIPTION);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__PROJECT_NAME);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TEST_PROJECT_NAME);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_DATE_FORMAT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_TIME_FORMAT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_DATE_TIME_FORMAT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_MAXIMUM_UPLOAD_SIZE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__INPUT_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__AJAX_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__CAPTCHA_SITE_KEY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__CAPTCHA_SECRET_KEY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TEXT_EDITOR_URL);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__RESPONSIVE_TOP_MENU);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TOP_NAVIGATION_ID);
		createEReference(websitePropertiesEClass, WEBSITE_PROPERTIES__SIDE_MENU);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__SITE_TEMPLATE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE);

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
		PersistencePackage thePersistencePackage = (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		WebuiPackage theWebuiPackage = (WebuiPackage)EPackage.Registry.INSTANCE.getEPackage(WebuiPackage.eNS_URI);
		ImagePackage theImagePackage = (ImagePackage)EPackage.Registry.INSTANCE.getEPackage(ImagePackage.eNS_URI);
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(webGenModelEClass, WebGenModel.class, "WebGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebGenModel_WebsiteProperties(), this.getWebsiteProperties(), null, "websiteProperties", null, 1, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWebGenModel_Persistence(), thePersistencePackage.getPersistence(), null, "persistence", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_ServicesX(), theServicePackage.getServices(), null, "servicesX", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_WebUI(), theWebuiPackage.getWebUI(), null, "webUI", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Menus(), theWebuiPackage.getMenu(), null, "menus", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Images(), theImagePackage.getImage(), null, "images", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Security(), theSecurityPackage.getSecurity(), null, "security", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_AllowTypeCustomisation(), thePersistencePackage.getEntityOrView(), null, "allowTypeCustomisation", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_ImageManipulations(), theImagePackage.getImageManipulation(), null, "imageManipulations", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(websitePropertiesEClass, WebsiteProperties.class, "WebsiteProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebsiteProperties_SiteTitle(), ecorePackage.getEString(), "siteTitle", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DevelopmentVersion(), ecorePackage.getEBoolean(), "developmentVersion", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_BaseURL(), ecorePackage.getEString(), "baseURL", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_RewriteURLs(), ecorePackage.getEBoolean(), "rewriteURLs", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_WebmasterEmail(), ecorePackage.getEString(), "webmasterEmail", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_CopyrightText(), ecorePackage.getEString(), "copyrightText", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_MetaDescription(), ecorePackage.getEString(), "metaDescription", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_ProjectName(), ecorePackage.getEString(), "projectName", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TestProjectName(), ecorePackage.getEString(), "testProjectName", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultDateFormat(), ecorePackage.getEString(), "defaultDateFormat", "jS F Y", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultTimeFormat(), ecorePackage.getEString(), "defaultTimeFormat", "G.i", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultDateTimeFormat(), ecorePackage.getEString(), "defaultDateTimeFormat", "jS F Y G.i", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultMaximumUploadSize(), ecorePackage.getEInt(), "defaultMaximumUploadSize", "2000000", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_FrameworkTechnology(), this.getFrameworkTechnologies(), "frameworkTechnology", "Kohana", 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_InputTechnology(), theWebuiPackage.getInputTechnologies(), "inputTechnology", "Html", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_AjaxTechnology(), theWebuiPackage.getAjaxTechnologies(), "ajaxTechnology", "None", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_CaptchaSiteKey(), ecorePackage.getEString(), "captchaSiteKey", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_CaptchaSecretKey(), ecorePackage.getEString(), "captchaSecretKey", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_TextEditorURL(), ecorePackage.getEString(), "textEditorURL", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_ResponsiveTopMenu(), ecorePackage.getEBoolean(), "responsiveTopMenu", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TopNavigationId(), ecorePackage.getEString(), "topNavigationId", "topnav", 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWebsiteProperties_SideMenu(), theWebuiPackage.getMenu(), null, "sideMenu", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_SiteTemplate(), ecorePackage.getEString(), "siteTemplate", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_StaticUnitsEditable(), ecorePackage.getEBoolean(), "staticUnitsEditable", "false", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
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
		addAnnotation
		  (webGenModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "classifierNameUnique pageNameUnique menuNameUnique "
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (webGenModelEClass, 
		   source, 
		   new String[] {
			 "classifierNameUnique", "classifiers->isUnique(name)",
			 "pageNameUnique", "pages->isUnique(name)",
			 "menuNameUnique", "menus->isUnique(name)"
		   });
	}

} //WebsitePackageImpl

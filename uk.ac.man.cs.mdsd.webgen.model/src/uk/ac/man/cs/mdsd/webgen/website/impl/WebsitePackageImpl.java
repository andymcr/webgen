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

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.expression.ExpressionPackage;
import uk.ac.man.cs.mdsd.webgen.image.ImagePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.service.ServicePackage;
import uk.ac.man.cs.mdsd.webgen.website.AjaxTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.Authentication;
import uk.ac.man.cs.mdsd.webgen.website.AuthenticationKeyTypes;
import uk.ac.man.cs.mdsd.webgen.website.CasAuthentication;
import uk.ac.man.cs.mdsd.webgen.website.CurrentUserReference;
import uk.ac.man.cs.mdsd.webgen.website.FeatureReference;
import uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.InputTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.webgen.website.ModelReference;
import uk.ac.man.cs.mdsd.webgen.website.ParameterReference;
import uk.ac.man.cs.mdsd.webgen.website.RouteParameterReference;
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
	private EClass modelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeParameterReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentUserReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frameworkTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ajaxTechnologiesEEnum = null;

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
	public EReference getWebGenModel_Classifiers() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_Services() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_Pages() {
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
	public EReference getWebGenModel_AllowTypeCustomisation() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_ImageManipulations() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(6);
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
	public EReference getWebsiteProperties_Authentication() {
		return (EReference)websitePropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TestProjectName() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultDateFormat() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultTimeFormat() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultDateTimeFormat() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultMaximumUploadSize() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabaseTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabasePrefix() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabaseHost() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabaseName() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabasePort() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabaseUsername() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabasePassword() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_OrmTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TimestampCreation() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TimestampUpdates() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_FrameworkTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_InputTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_AjaxTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_CaptchaSiteKey() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_CaptchaSecretKey() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TextEditorURL() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_ResponsiveTopMenu() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TopNavigationId() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsiteProperties_SideMenu() {
		return (EReference)websitePropertiesEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_SiteTemplate() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_StaticUnitsEditable() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelReference() {
		return modelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelReference_Unit() {
		return (EReference)modelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureReference() {
		return featureReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureReference_Name() {
		return (EAttribute)featureReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureReference_Feature() {
		return (EReference)featureReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteParameterReference() {
		return routeParameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteParameterReference_Name() {
		return (EAttribute)routeParameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteParameterReference_Parameter() {
		return (EReference)routeParameterReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterReference() {
		return parameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterReference_Name() {
		return (EAttribute)parameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterReference_Parameter() {
		return (EReference)parameterReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentUserReference() {
		return currentUserReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrentUserReference_UserModel() {
		return (EReference)currentUserReferenceEClass.getEStructuralFeatures().get(0);
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
	public EEnum getInputTechnologies() {
		return inputTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAjaxTechnologies() {
		return ajaxTechnologiesEEnum;
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
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_Authenticates() {
		return (EReference)authenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_User() {
		return (EReference)authenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_UserKey() {
		return (EReference)authenticationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_LoginLabel() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_LogoutLabel() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(4);
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
	public EReference getLocalAuthenticationSystem_Authentication() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AuthenticationKey() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_UseCaptcha() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowRememberMe() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowSelfRegistration() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_TrackLoginAttempts() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_UseEmailActivation() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_SendWelcomeEmail() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_RegistrationUnit() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_LoginUnit() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_ForgottenPasswordUnit() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(10);
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
		createEReference(webGenModelEClass, WEB_GEN_MODEL__CLASSIFIERS);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__SERVICES);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__PAGES);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__MENUS);
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
		createEReference(websitePropertiesEClass, WEBSITE_PROPERTIES__AUTHENTICATION);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TEST_PROJECT_NAME);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_DATE_FORMAT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_TIME_FORMAT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_DATE_TIME_FORMAT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_MAXIMUM_UPLOAD_SIZE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_PREFIX);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_HOST);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_NAME);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_PORT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_USERNAME);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_PASSWORD);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__ORM_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TIMESTAMP_CREATION);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TIMESTAMP_UPDATES);
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

		authenticationEClass = createEClass(AUTHENTICATION);
		createEReference(authenticationEClass, AUTHENTICATION__AUTHENTICATES);
		createEReference(authenticationEClass, AUTHENTICATION__USER);
		createEReference(authenticationEClass, AUTHENTICATION__USER_KEY);
		createEAttribute(authenticationEClass, AUTHENTICATION__LOGIN_LABEL);
		createEAttribute(authenticationEClass, AUTHENTICATION__LOGOUT_LABEL);

		localAuthenticationSystemEClass = createEClass(LOCAL_AUTHENTICATION_SYSTEM);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT);

		casAuthenticationEClass = createEClass(CAS_AUTHENTICATION);

		modelReferenceEClass = createEClass(MODEL_REFERENCE);
		createEReference(modelReferenceEClass, MODEL_REFERENCE__UNIT);

		featureReferenceEClass = createEClass(FEATURE_REFERENCE);
		createEAttribute(featureReferenceEClass, FEATURE_REFERENCE__NAME);
		createEReference(featureReferenceEClass, FEATURE_REFERENCE__FEATURE);

		routeParameterReferenceEClass = createEClass(ROUTE_PARAMETER_REFERENCE);
		createEAttribute(routeParameterReferenceEClass, ROUTE_PARAMETER_REFERENCE__NAME);
		createEReference(routeParameterReferenceEClass, ROUTE_PARAMETER_REFERENCE__PARAMETER);

		parameterReferenceEClass = createEClass(PARAMETER_REFERENCE);
		createEAttribute(parameterReferenceEClass, PARAMETER_REFERENCE__NAME);
		createEReference(parameterReferenceEClass, PARAMETER_REFERENCE__PARAMETER);

		currentUserReferenceEClass = createEClass(CURRENT_USER_REFERENCE);
		createEReference(currentUserReferenceEClass, CURRENT_USER_REFERENCE__USER_MODEL);

		// Create enums
		frameworkTechnologiesEEnum = createEEnum(FRAMEWORK_TECHNOLOGIES);
		inputTechnologiesEEnum = createEEnum(INPUT_TECHNOLOGIES);
		ajaxTechnologiesEEnum = createEEnum(AJAX_TECHNOLOGIES);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		WebuiPackage theWebuiPackage = (WebuiPackage)EPackage.Registry.INSTANCE.getEPackage(WebuiPackage.eNS_URI);
		PersistencePackage thePersistencePackage = (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);
		ImagePackage theImagePackage = (ImagePackage)EPackage.Registry.INSTANCE.getEPackage(ImagePackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localAuthenticationSystemEClass.getESuperTypes().add(this.getAuthentication());
		casAuthenticationEClass.getESuperTypes().add(this.getAuthentication());
		modelReferenceEClass.getESuperTypes().add(theExpressionPackage.getPath());
		featureReferenceEClass.getESuperTypes().add(theExpressionPackage.getPath());
		routeParameterReferenceEClass.getESuperTypes().add(theExpressionPackage.getPath());
		parameterReferenceEClass.getESuperTypes().add(theExpressionPackage.getPath());
		currentUserReferenceEClass.getESuperTypes().add(theExpressionPackage.getPath());

		// Initialize classes and features; add operations and parameters
		initEClass(webGenModelEClass, WebGenModel.class, "WebGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebGenModel_WebsiteProperties(), this.getWebsiteProperties(), null, "websiteProperties", null, 1, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWebGenModel_Classifiers(), theBasePackage.getClassifier(), null, "classifiers", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Services(), theServicePackage.getService(), null, "services", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Pages(), theWebuiPackage.getPage(), null, "pages", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Menus(), theWebuiPackage.getMenu(), null, "menus", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_AllowTypeCustomisation(), thePersistencePackage.getEntityOrView(), null, "allowTypeCustomisation", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_ImageManipulations(), theImagePackage.getImageManipulation(), null, "imageManipulations", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(websitePropertiesEClass, WebsiteProperties.class, "WebsiteProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebsiteProperties_SiteTitle(), ecorePackage.getEString(), "siteTitle", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DevelopmentVersion(), ecorePackage.getEBoolean(), "developmentVersion", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_BaseURL(), ecorePackage.getEString(), "baseURL", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_RewriteURLs(), ecorePackage.getEBoolean(), "rewriteURLs", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_WebmasterEmail(), ecorePackage.getEString(), "webmasterEmail", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_CopyrightText(), ecorePackage.getEString(), "copyrightText", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_MetaDescription(), ecorePackage.getEString(), "metaDescription", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_ProjectName(), ecorePackage.getEString(), "projectName", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsiteProperties_Authentication(), this.getAuthentication(), this.getAuthentication_Authenticates(), "authentication", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TestProjectName(), ecorePackage.getEString(), "testProjectName", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultDateFormat(), ecorePackage.getEString(), "defaultDateFormat", "jS F Y", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultTimeFormat(), ecorePackage.getEString(), "defaultTimeFormat", "G.i", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultDateTimeFormat(), ecorePackage.getEString(), "defaultDateTimeFormat", "jS F Y G.i", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultMaximumUploadSize(), ecorePackage.getEInt(), "defaultMaximumUploadSize", "2000000", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabaseTechnology(), thePersistencePackage.getDatabaseTechnologies(), "databaseTechnology", "MySql", 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabasePrefix(), ecorePackage.getEString(), "databasePrefix", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabaseHost(), ecorePackage.getEString(), "databaseHost", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabaseName(), ecorePackage.getEString(), "databaseName", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabasePort(), ecorePackage.getEString(), "databasePort", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabaseUsername(), ecorePackage.getEString(), "databaseUsername", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabasePassword(), ecorePackage.getEString(), "databasePassword", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_OrmTechnology(), thePersistencePackage.getOrmTechnologies(), "ormTechnology", "Kohana", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TimestampCreation(), ecorePackage.getEBoolean(), "timestampCreation", "true", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TimestampUpdates(), ecorePackage.getEBoolean(), "timestampUpdates", "true", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_FrameworkTechnology(), this.getFrameworkTechnologies(), "frameworkTechnology", "Kohana", 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_InputTechnology(), this.getInputTechnologies(), "inputTechnology", "Html", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_AjaxTechnology(), this.getAjaxTechnologies(), "ajaxTechnology", "None", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_CaptchaSiteKey(), ecorePackage.getEString(), "captchaSiteKey", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_CaptchaSecretKey(), ecorePackage.getEString(), "captchaSecretKey", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_TextEditorURL(), ecorePackage.getEString(), "textEditorURL", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_ResponsiveTopMenu(), ecorePackage.getEBoolean(), "responsiveTopMenu", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TopNavigationId(), ecorePackage.getEString(), "topNavigationId", "topnav", 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWebsiteProperties_SideMenu(), theWebuiPackage.getMenu(), null, "sideMenu", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_SiteTemplate(), ecorePackage.getEString(), "siteTemplate", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_StaticUnitsEditable(), ecorePackage.getEBoolean(), "staticUnitsEditable", "false", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthentication_Authenticates(), this.getWebsiteProperties(), this.getWebsiteProperties_Authentication(), "authenticates", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthentication_User(), thePersistencePackage.getEntityOrView(), null, "user", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAuthentication_UserKey(), thePersistencePackage.getAttribute(), null, "userKey", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthentication_LoginLabel(), ecorePackage.getEString(), "loginLabel", "Login", 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthentication_LogoutLabel(), ecorePackage.getEString(), "logoutLabel", "Logout", 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localAuthenticationSystemEClass, LocalAuthenticationSystem.class, "LocalAuthenticationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalAuthenticationSystem_Authentication(), thePersistencePackage.getEntityOrView(), null, "authentication", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AuthenticationKey(), this.getAuthenticationKeyTypes(), "authenticationKey", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_UseCaptcha(), ecorePackage.getEBoolean(), "useCaptcha", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowRememberMe(), ecorePackage.getEBoolean(), "allowRememberMe", "false", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowSelfRegistration(), ecorePackage.getEBoolean(), "allowSelfRegistration", "false", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_TrackLoginAttempts(), ecorePackage.getEBoolean(), "trackLoginAttempts", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_UseEmailActivation(), ecorePackage.getEBoolean(), "useEmailActivation", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_SendWelcomeEmail(), ecorePackage.getEBoolean(), "sendWelcomeEmail", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_RegistrationUnit(), theWebuiPackage.getRegistrationUnit(), null, "registrationUnit", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_LoginUnit(), theWebuiPackage.getLoginUnit(), null, "loginUnit", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_ForgottenPasswordUnit(), theWebuiPackage.getForgottenPasswordUnit(), null, "forgottenPasswordUnit", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(casAuthenticationEClass, CasAuthentication.class, "CasAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelReferenceEClass, ModelReference.class, "ModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelReference_Unit(), theWebuiPackage.getDynamicUnit(), null, "unit", null, 1, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureReferenceEClass, FeatureReference.class, "FeatureReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeatureReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureReference_Feature(), thePersistencePackage.getFeature(), null, "feature", null, 1, 1, FeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeParameterReferenceEClass, RouteParameterReference.class, "RouteParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouteParameterReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, RouteParameterReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRouteParameterReference_Parameter(), thePersistencePackage.getAttribute(), null, "parameter", null, 1, 1, RouteParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterReferenceEClass, ParameterReference.class, "ParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterReference_Parameter(), theBasePackage.getSelectionParameter(), null, "parameter", null, 1, 1, ParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentUserReferenceEClass, CurrentUserReference.class, "CurrentUserReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentUserReference_UserModel(), thePersistencePackage.getEntityOrView(), null, "userModel", null, 1, 1, CurrentUserReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(frameworkTechnologiesEEnum, FrameworkTechnologies.class, "FrameworkTechnologies");
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.JSF);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.CAKE_PHP);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.CODE_IGNITER);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.KOHANA);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.LARAVEL);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.SYMFONY);

		initEEnum(inputTechnologiesEEnum, InputTechnologies.class, "InputTechnologies");
		addEEnumLiteral(inputTechnologiesEEnum, InputTechnologies.HTML);
		addEEnumLiteral(inputTechnologiesEEnum, InputTechnologies.JQUERY_UI);

		initEEnum(ajaxTechnologiesEEnum, AjaxTechnologies.class, "AjaxTechnologies");
		addEEnumLiteral(ajaxTechnologiesEEnum, AjaxTechnologies.NONE);
		addEEnumLiteral(ajaxTechnologiesEEnum, AjaxTechnologies.JQUERY);
		addEEnumLiteral(ajaxTechnologiesEEnum, AjaxTechnologies.ANGULAR_JS);

		initEEnum(authenticationKeyTypesEEnum, AuthenticationKeyTypes.class, "AuthenticationKeyTypes");
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.EMAIL);
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.SCREEN_NAME);
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.USERNAME);

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
		addAnnotation
		  (authenticationEClass, 
		   source, 
		   new String[] {
			 "constraints", "userKeyFromUser userKeyRequiredAttribute"
		   });	
		addAnnotation
		  (localAuthenticationSystemEClass, 
		   source, 
		   new String[] {
			 "constraints", "captchaRequiresKeys"
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
		addAnnotation
		  (authenticationEClass, 
		   source, 
		   new String[] {
			 "userKeyFromUser", "not user.oclIsUndefined() and not userKey.oclIsUndefined() implies\r\n\tuser.features->includes(userKey)",
			 "userKeyRequiredAttribute", "not userKey.oclIsUndefined() implies\r\n\tif userKey.oclIsTypeOf(EncapsulatedAttribute) then\r\n\t\tuserKey.oclAsType(EncapsulatedAttribute).cardinality = Cardinality::Required\r\n\telse\r\n\t\tuserKey.oclAsType(EntityAttribute).cardinality = Cardinality::Required\r\n\tendif"
		   });	
		addAnnotation
		  (localAuthenticationSystemEClass, 
		   source, 
		   new String[] {
			 "captchaRequiresKeys", "useCaptcha implies not authenticates.captchaSiteKey.oclIsUndefined() and not authenticates.captchaSecretKey.oclIsUndefined()"
		   });	
		addAnnotation
		  (getFeatureReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if feature.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tif feature.oclIsKindOf(EntityFeature) then\r\n\t\tfeature.oclAsType(EntityFeature).name\r\n\telse if feature.oclIsKindOf(EncapsulatedAttribute) then\r\n\t\tfeature.oclAsType(EncapsulatedAttribute).name\r\n\telse if feature.oclIsKindOf(EncapsulatedAssociation) then\r\n\t\tfeature.oclAsType(EncapsulatedAssociation).name\r\n\telse\r\n\t\tfeature.oclAsType(ViewAssociation).name\r\n\tendif endif endif\r\nendif"
		   });	
		addAnnotation
		  (getRouteParameterReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if parameter.oclIsUndefined() then\r\n\t\'\'\r\nelse if parameter.oclIsKindOf(EntityAttribute) then\r\n\tparameter.oclAsType(EntityAttribute).name\r\nelse\r\n\tparameter.oclAsType(EncapsulatedAttribute).name\r\nendif endif"
		   });	
		addAnnotation
		  (getParameterReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if parameter.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tparameter.name\r\nendif"
		   });
	}

} //WebsitePackageImpl

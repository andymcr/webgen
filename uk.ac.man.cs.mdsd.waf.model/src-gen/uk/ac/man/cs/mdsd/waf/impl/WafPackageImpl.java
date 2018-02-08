/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.api.ApiPackage;

import uk.ac.man.cs.mdsd.expression.ExpressionPackage;

import uk.ac.man.cs.mdsd.orm.OrmPackage;

import uk.ac.man.cs.mdsd.service.ServicePackage;

import uk.ac.man.cs.mdsd.waf.ActionMenuEntry;
import uk.ac.man.cs.mdsd.waf.AjaxTechnologies;
import uk.ac.man.cs.mdsd.waf.AssociationReference;
import uk.ac.man.cs.mdsd.waf.Authentication;
import uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes;
import uk.ac.man.cs.mdsd.waf.AuthenticationUnit;
import uk.ac.man.cs.mdsd.waf.BackgroundFilter;
import uk.ac.man.cs.mdsd.waf.BackgroundPositions;
import uk.ac.man.cs.mdsd.waf.Badge;
import uk.ac.man.cs.mdsd.waf.CaptchaField;
import uk.ac.man.cs.mdsd.waf.CasAuthentication;
import uk.ac.man.cs.mdsd.waf.ChildPath;
import uk.ac.man.cs.mdsd.waf.ChildPathAssociation;
import uk.ac.man.cs.mdsd.waf.ChildPathAttribute;
import uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions;
import uk.ac.man.cs.mdsd.waf.CollectionUnit;
import uk.ac.man.cs.mdsd.waf.ContentUnit;
import uk.ac.man.cs.mdsd.waf.ControlUnit;
import uk.ac.man.cs.mdsd.waf.CreateUnit;
import uk.ac.man.cs.mdsd.waf.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.waf.DataTypeField;
import uk.ac.man.cs.mdsd.waf.DataUnit;
import uk.ac.man.cs.mdsd.waf.DateField;
import uk.ac.man.cs.mdsd.waf.DeleteAction;
import uk.ac.man.cs.mdsd.waf.DetailsUnit;
import uk.ac.man.cs.mdsd.waf.DisplayElement;
import uk.ac.man.cs.mdsd.waf.DynamicMenu;
import uk.ac.man.cs.mdsd.waf.DynamicUnit;
import uk.ac.man.cs.mdsd.waf.EditStaticTextMenuEntry;
import uk.ac.man.cs.mdsd.waf.EditUnit;
import uk.ac.man.cs.mdsd.waf.FeaturePath;
import uk.ac.man.cs.mdsd.waf.FeaturePathAssociation;
import uk.ac.man.cs.mdsd.waf.FeaturePathAttribute;
import uk.ac.man.cs.mdsd.waf.FeaturePathLabel;
import uk.ac.man.cs.mdsd.waf.FeatureSupportAction;
import uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.waf.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.waf.GalleryUnit;
import uk.ac.man.cs.mdsd.waf.GlobalMenu;
import uk.ac.man.cs.mdsd.waf.ImageFilter;
import uk.ac.man.cs.mdsd.waf.ImageIndexUnit;
import uk.ac.man.cs.mdsd.waf.ImageManipulation;
import uk.ac.man.cs.mdsd.waf.ImageUnit;
import uk.ac.man.cs.mdsd.waf.IndexGridUnit;
import uk.ac.man.cs.mdsd.waf.IndexLineDirectionUnit;
import uk.ac.man.cs.mdsd.waf.IndexPageDirectionUnit;
import uk.ac.man.cs.mdsd.waf.IndexUnit;
import uk.ac.man.cs.mdsd.waf.InlineAction;
import uk.ac.man.cs.mdsd.waf.InlineActionContainer;
import uk.ac.man.cs.mdsd.waf.InputTechnologies;
import uk.ac.man.cs.mdsd.waf.InterfaceField;
import uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.waf.LoginUnit;
import uk.ac.man.cs.mdsd.waf.MapUnit;
import uk.ac.man.cs.mdsd.waf.Menu;
import uk.ac.man.cs.mdsd.waf.MenuEntry;
import uk.ac.man.cs.mdsd.waf.Page;
import uk.ac.man.cs.mdsd.waf.Query;
import uk.ac.man.cs.mdsd.waf.QueryParameter;
import uk.ac.man.cs.mdsd.waf.RegistrationUnit;
import uk.ac.man.cs.mdsd.waf.RouteActual;
import uk.ac.man.cs.mdsd.waf.SearchUnit;
import uk.ac.man.cs.mdsd.waf.SelectAction;
import uk.ac.man.cs.mdsd.waf.SelectableUnit;
import uk.ac.man.cs.mdsd.waf.SingletonUnit;
import uk.ac.man.cs.mdsd.waf.SliderUnit;
import uk.ac.man.cs.mdsd.waf.StaticUnit;
import uk.ac.man.cs.mdsd.waf.SubmenuEntry;
import uk.ac.man.cs.mdsd.waf.ThumbnailFilter;
import uk.ac.man.cs.mdsd.waf.ThumbnailModes;
import uk.ac.man.cs.mdsd.waf.UnitAssociation;
import uk.ac.man.cs.mdsd.waf.UnitAttribute;
import uk.ac.man.cs.mdsd.waf.UnitContainer;
import uk.ac.man.cs.mdsd.waf.UnitFeature;
import uk.ac.man.cs.mdsd.waf.UnitField;
import uk.ac.man.cs.mdsd.waf.UnitSupportAction;
import uk.ac.man.cs.mdsd.waf.UpdateUnit;
import uk.ac.man.cs.mdsd.waf.WafFactory;
import uk.ac.man.cs.mdsd.waf.WafModel;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WafPackageImpl extends EPackageImpl implements WafPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wafModelEClass = null;

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
	private EClass displayElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageManipulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thumbnailFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editStaticTextMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeActualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitSupportActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childPathAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childPathAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePathAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePathAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePathLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass captchaFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectableUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createUpdateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexGridUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexPageDirectionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexLineDirectionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageIndexUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliderUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass galleryUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forgottenPasswordUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineActionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSupportActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badgeEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum backgroundPositionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum thumbnailModesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionDisplayOptionsEEnum = null;

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WafPackageImpl() {
		super(eNS_URI, WafFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WafPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WafPackage init() {
		if (isInited) return (WafPackage)EPackage.Registry.INSTANCE.getEPackage(WafPackage.eNS_URI);

		// Obtain or create and register package
		WafPackageImpl theWafPackage = (WafPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WafPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WafPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApiPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWafPackage.createPackageContents();

		// Initialize created meta-data
		theWafPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWafPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WafPackage.eNS_URI, theWafPackage);
		return theWafPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWafModel() {
		return wafModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWafModel_Persistence() {
		return (EReference)wafModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWafModel_Business() {
		return (EReference)wafModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWafModel_ImageManipulations() {
		return (EReference)wafModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWafModel_Pages() {
		return (EReference)wafModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWafModel_GlobalMenus() {
		return (EReference)wafModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWafModel_DynamicMenus() {
		return (EReference)wafModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWafModel_Api() {
		return (EReference)wafModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_SiteName() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_SiteTitle() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_WebmasterEmail() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_CopyrightText() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_MetaDescription() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_LogoImage() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWafModel_LogoFilters() {
		return (EReference)wafModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_FrameworkTechnology() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_InputTechnology() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_AjaxTechnology() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWafModel_Authentication() {
		return (EReference)wafModelEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_CaptchaSiteKey() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_CaptchaSecretKey() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_TextEditorURL() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_TopNavigationId() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWafModel_SideMenu() {
		return (EReference)wafModelEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_SiteTemplate() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWafModel_StaticUnitsEditable() {
		return (EAttribute)wafModelEClass.getEStructuralFeatures().get(24);
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
	public EReference getAuthentication_Authorises() {
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
	public EReference getLocalAuthenticationSystem_LoginAttempt() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_AutoLogin() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_UseCaptcha() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowRememberMe() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowSelfRegistration() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_UseEmailActivation() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_SendWelcomeEmail() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_RegistrationUnit() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_LoginUnit() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_ForgottenPasswordUnit() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(11);
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
	public EClass getDisplayElement() {
		return displayElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayElement_DisplayLabel() {
		return (EAttribute)displayElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageManipulation() {
		return imageManipulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageManipulation_JpegQuality() {
		return (EAttribute)imageManipulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageManipulation_Filters() {
		return (EReference)imageManipulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageFilter() {
		return imageFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackgroundFilter() {
		return backgroundFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundFilter_Color() {
		return (EAttribute)backgroundFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundFilter_Width() {
		return (EAttribute)backgroundFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundFilter_Height() {
		return (EAttribute)backgroundFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundFilter_Position() {
		return (EAttribute)backgroundFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThumbnailFilter() {
		return thumbnailFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThumbnailFilter_Width() {
		return (EAttribute)thumbnailFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThumbnailFilter_Height() {
		return (EAttribute)thumbnailFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThumbnailFilter_Mode() {
		return (EAttribute)thumbnailFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Entries() {
		return (EReference)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_OmitCaption() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_CaptionClass() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_StyleClass() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_LayoutClass() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalMenu() {
		return globalMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicMenu() {
		return dynamicMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicMenu_EntityOrView() {
		return (EReference)dynamicMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicMenu_Selection() {
		return (EReference)dynamicMenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicMenu_Title() {
		return (EReference)dynamicMenuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuEntry() {
		return menuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuEntry_PartOf() {
		return (EReference)menuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuEntry_RequiresRole() {
		return (EAttribute)menuEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmenuEntry() {
		return submenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmenuEntry_Submenu() {
		return (EReference)submenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionMenuEntry() {
		return actionMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionMenuEntry_Action() {
		return (EReference)actionMenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionMenuEntry_Query() {
		return (EReference)actionMenuEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditStaticTextMenuEntry() {
		return editStaticTextMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_PartOf() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_ParentPage() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_ChildPages() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_ContextMenu() {
		return (EReference)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_UriElement() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_StyleClass() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Filter() {
		return (EReference)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Parameters() {
		return (EReference)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParameter() {
		return queryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameter_Formal() {
		return (EReference)queryParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_Value() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitContainer() {
		return unitContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitContainer_Units() {
		return (EReference)unitContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentUnit() {
		return contentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentUnit_DisplayedOn() {
		return (EReference)contentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_UriElement() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentUnit_RouteActuals() {
		return (EReference)contentUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_RequiresRole() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_PurposeSummary() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_Alternative() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_OmitCaption() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_CaptionClass() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_StyleClass() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_ContentClass() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteActual() {
		return routeActualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteActual_RouteParameter() {
		return (EReference)routeActualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteActual_Value() {
		return (EReference)routeActualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticUnit() {
		return staticUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticUnit_Service() {
		return (EReference)staticUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticUnit_Content() {
		return (EAttribute)staticUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicUnit() {
		return dynamicUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicUnit_DisplayFields() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicUnit_HideWhen() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_MessageWhenHidden() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicUnit_SupportActions() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_Header() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_Footer() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_HeaderClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_ControlClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_FooterClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_ErrorClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitSupportAction() {
		return unitSupportActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitSupportAction_Disable() {
		return (EAttribute)unitSupportActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitSupportAction_ConfirmMessage() {
		return (EAttribute)unitSupportActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitField() {
		return unitFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitField_DisplayedOn() {
		return (EReference)unitFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_RequiresRole() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitField_HideWhen() {
		return (EReference)unitFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_Title() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_CollectionDisplayOption() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_MaximumDisplaySize() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_DateFormat() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_DisableInput() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitFeature() {
		return unitFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitFeature_ForcedValue() {
		return (EReference)unitFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_CollectionUiAllowAdd() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_CollectionUiAllowRemove() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_NullDisplayValue() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_Autofocus() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_Footer() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_HeaderClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_InputClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_DisplayClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_FooterClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitAttribute() {
		return unitAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitAttribute_Attribute() {
		return (EReference)unitAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitAttribute_Name() {
		return (EAttribute)unitAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitAttribute_DefaultValue() {
		return (EReference)unitAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitAttribute_ObfuscateFormFields() {
		return (EAttribute)unitAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitAttribute_Placeholder() {
		return (EAttribute)unitAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitAttribute_ValidationPattern() {
		return (EAttribute)unitAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitAssociation() {
		return unitAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitAssociation_Selection() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitAssociation_AjaxOptionsList() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationReference() {
		return associationReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationReference_Name() {
		return (EAttribute)associationReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationReference_Association() {
		return (EReference)associationReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationReference_ValueDisplay() {
		return (EReference)associationReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationReference_ChildFeature() {
		return (EReference)associationReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildPath() {
		return childPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildPathAttribute() {
		return childPathAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPathAttribute_Name() {
		return (EAttribute)childPathAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPathAttribute_Attribute() {
		return (EReference)childPathAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildPathAssociation() {
		return childPathAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturePath() {
		return featurePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturePathAttribute() {
		return featurePathAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePathAttribute_Name() {
		return (EAttribute)featurePathAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturePathAttribute_Attribute() {
		return (EReference)featurePathAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturePathAssociation() {
		return featurePathAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturePathLabel() {
		return featurePathLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePathLabel_Name() {
		return (EAttribute)featurePathLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturePathLabel_Label() {
		return (EReference)featurePathLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceField() {
		return interfaceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceField_Required() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceField_DefaultValue() {
		return (EReference)interfaceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceField_MustMatch() {
		return (EReference)interfaceFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceField_InterfaceType() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceField_Placeholder() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceField_ValidationPattern() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceField_InputClass() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeField() {
		return dataTypeFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeField_DataType() {
		return (EReference)dataTypeFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_CaseInsensitive() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_ObfuscateFormFields() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_Encrypt() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateField() {
		return dateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateField_Details() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateField_Format() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaptchaField() {
		return captchaFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectableUnit() {
		return selectableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectableUnit_Selectors() {
		return (EReference)selectableUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonUnit() {
		return singletonUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingletonUnit_ContentType() {
		return (EReference)singletonUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionUnit() {
		return collectionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_ContentType() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_Selection() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_FindContainerSelection() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_OmitContainerLoad() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_FindElementSelection() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_Filter() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_SupportedFilters() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_Badges() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_EmptyMessage() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_DefaultPaginationSize() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_MaximumPaginationSize() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_NextNpages() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PreviousNpages() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_NextPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_NextPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PreviousPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PreviousPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_UseDisabledPageLinks() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_UseFirstLastPageLinks() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_FirstPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_FirstPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_LastPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_LastPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PaginationClass() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PaginationElementClass() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditUnit() {
		return editUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_OnSaveContinueEditing() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_DisableWhen() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_Title() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_ConfirmDestination() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_ConfirmLabel() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_CancelDestination() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_CancelLabel() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_CustomiseValues() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateUnit() {
		return createUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateUpdateUnit() {
		return createUpdateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUpdateUnit_CreateUriElement() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUpdateUnit_ClearLabel() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapUnit() {
		return mapUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapUnit_ReadOnly() {
		return (EAttribute)mapUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapUnit_DefaultZoomLevel() {
		return (EAttribute)mapUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapUnit_Location() {
		return (EReference)mapUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapUnit_PlaceName() {
		return (EReference)mapUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateUnit() {
		return updateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataUnit() {
		return dataUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnit_Title() {
		return (EReference)dataUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailsUnit() {
		return detailsUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetailsUnit_Selection() {
		return (EReference)detailsUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailsUnit_OmitFieldLabels() {
		return (EAttribute)detailsUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexUnit() {
		return indexUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_OmitColumnLabels() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexUnit_TargettingSearches() {
		return (EReference)indexUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_RowClasses() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexGridUnit() {
		return indexGridUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexPageDirectionUnit() {
		return indexPageDirectionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexLineDirectionUnit() {
		return indexLineDirectionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlUnit() {
		return controlUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlUnit_SubmitLabel() {
		return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlUnit_CancelDestination() {
		return (EReference)controlUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlUnit_CancelLabel() {
		return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchUnit() {
		return searchUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchUnit_ResultsDestination() {
		return (EReference)searchUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageUnit() {
		return imageUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageUnit_Title() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageUnit_ImagePathFeature() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageUnit_ImageTitleFeature() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageUnit_TruncateImageTitle() {
		return (EAttribute)imageUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageUnit_MissingImagePath() {
		return (EAttribute)imageUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageUnit_ImageFilter() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageIndexUnit() {
		return imageIndexUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageIndexUnit_OmitFieldLabels() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageIndexUnit_OverlayTitle() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageIndexUnit_OverlaySingleSelectAction() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageIndexUnit_ColumnClass() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageIndexUnit_CardClass() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSliderUnit() {
		return sliderUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSliderUnit_ShowTime() {
		return (EAttribute)sliderUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSliderUnit_TransitionTime() {
		return (EAttribute)sliderUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGalleryUnit() {
		return galleryUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGalleryUnit_FullSizeFilter() {
		return (EReference)galleryUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalleryUnit_ShowTime() {
		return (EAttribute)galleryUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalleryUnit_TransitionTime() {
		return (EAttribute)galleryUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationUnit() {
		return authenticationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistrationUnit() {
		return registrationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrationUnit_AuthenticationSystem() {
		return (EReference)registrationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginUnit() {
		return loginUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginUnit_AuthenticationSystem() {
		return (EReference)loginUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginUnit_LoginIdField() {
		return (EReference)loginUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginUnit_PasswordField() {
		return (EReference)loginUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginUnit_RememberMeField() {
		return (EReference)loginUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginUnit_LogoutUriElement() {
		return (EAttribute)loginUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForgottenPasswordUnit() {
		return forgottenPasswordUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForgottenPasswordUnit_AuthenticationSystem() {
		return (EReference)forgottenPasswordUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForgottenPasswordUnit_LoginIdField() {
		return (EReference)forgottenPasswordUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineActionContainer() {
		return inlineActionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineActionContainer_Actions() {
		return (EReference)inlineActionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineAction() {
		return inlineActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineAction_UsedBy() {
		return (EReference)inlineActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Disable() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineAction_DisplayWhen() {
		return (EReference)inlineActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Header() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Footer() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_HeaderClass() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_FooterClass() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectAction() {
		return selectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectAction_Target() {
		return (EReference)selectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectAction_ValuePath() {
		return (EReference)selectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteAction() {
		return deleteActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteAction_Destination() {
		return (EReference)deleteActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteAction_ConfirmMessage() {
		return (EAttribute)deleteActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteAction_RequiresRole() {
		return (EAttribute)deleteActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteAction_EnableWhen() {
		return (EReference)deleteActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteAction_UriElement() {
		return (EAttribute)deleteActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSupportAction() {
		return featureSupportActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSupportAction_Operation() {
		return (EReference)featureSupportActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSupportAction_ConfirmMessage() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSupportAction_RequiresRole() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSupportAction_EnableWhen() {
		return (EReference)featureSupportActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSupportAction_UriElement() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSupportAction_FileExtension() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBadge() {
		return badgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBadge_IconName() {
		return (EAttribute)badgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBadge_Value() {
		return (EReference)badgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBadge_DisplayWhen() {
		return (EReference)badgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBadge_NewWhen() {
		return (EReference)badgeEClass.getEStructuralFeatures().get(3);
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
	public EEnum getBackgroundPositions() {
		return backgroundPositionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getThumbnailModes() {
		return thumbnailModesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCollectionDisplayOptions() {
		return collectionDisplayOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WafFactory getWafFactory() {
		return (WafFactory)getEFactoryInstance();
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
		wafModelEClass = createEClass(WAF_MODEL);
		createEReference(wafModelEClass, WAF_MODEL__PERSISTENCE);
		createEReference(wafModelEClass, WAF_MODEL__BUSINESS);
		createEReference(wafModelEClass, WAF_MODEL__IMAGE_MANIPULATIONS);
		createEReference(wafModelEClass, WAF_MODEL__PAGES);
		createEReference(wafModelEClass, WAF_MODEL__GLOBAL_MENUS);
		createEReference(wafModelEClass, WAF_MODEL__DYNAMIC_MENUS);
		createEReference(wafModelEClass, WAF_MODEL__API);
		createEAttribute(wafModelEClass, WAF_MODEL__SITE_NAME);
		createEAttribute(wafModelEClass, WAF_MODEL__SITE_TITLE);
		createEAttribute(wafModelEClass, WAF_MODEL__WEBMASTER_EMAIL);
		createEAttribute(wafModelEClass, WAF_MODEL__COPYRIGHT_TEXT);
		createEAttribute(wafModelEClass, WAF_MODEL__META_DESCRIPTION);
		createEAttribute(wafModelEClass, WAF_MODEL__LOGO_IMAGE);
		createEReference(wafModelEClass, WAF_MODEL__LOGO_FILTERS);
		createEAttribute(wafModelEClass, WAF_MODEL__FRAMEWORK_TECHNOLOGY);
		createEAttribute(wafModelEClass, WAF_MODEL__INPUT_TECHNOLOGY);
		createEAttribute(wafModelEClass, WAF_MODEL__AJAX_TECHNOLOGY);
		createEReference(wafModelEClass, WAF_MODEL__AUTHENTICATION);
		createEAttribute(wafModelEClass, WAF_MODEL__CAPTCHA_SITE_KEY);
		createEAttribute(wafModelEClass, WAF_MODEL__CAPTCHA_SECRET_KEY);
		createEAttribute(wafModelEClass, WAF_MODEL__TEXT_EDITOR_URL);
		createEAttribute(wafModelEClass, WAF_MODEL__TOP_NAVIGATION_ID);
		createEReference(wafModelEClass, WAF_MODEL__SIDE_MENU);
		createEAttribute(wafModelEClass, WAF_MODEL__SITE_TEMPLATE);
		createEAttribute(wafModelEClass, WAF_MODEL__STATIC_UNITS_EDITABLE);

		authenticationEClass = createEClass(AUTHENTICATION);
		createEReference(authenticationEClass, AUTHENTICATION__AUTHORISES);
		createEReference(authenticationEClass, AUTHENTICATION__USER);
		createEReference(authenticationEClass, AUTHENTICATION__USER_KEY);
		createEAttribute(authenticationEClass, AUTHENTICATION__LOGIN_LABEL);
		createEAttribute(authenticationEClass, AUTHENTICATION__LOGOUT_LABEL);

		localAuthenticationSystemEClass = createEClass(LOCAL_AUTHENTICATION_SYSTEM);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT);

		casAuthenticationEClass = createEClass(CAS_AUTHENTICATION);

		displayElementEClass = createEClass(DISPLAY_ELEMENT);
		createEAttribute(displayElementEClass, DISPLAY_ELEMENT__DISPLAY_LABEL);

		imageManipulationEClass = createEClass(IMAGE_MANIPULATION);
		createEAttribute(imageManipulationEClass, IMAGE_MANIPULATION__JPEG_QUALITY);
		createEReference(imageManipulationEClass, IMAGE_MANIPULATION__FILTERS);

		imageFilterEClass = createEClass(IMAGE_FILTER);

		backgroundFilterEClass = createEClass(BACKGROUND_FILTER);
		createEAttribute(backgroundFilterEClass, BACKGROUND_FILTER__COLOR);
		createEAttribute(backgroundFilterEClass, BACKGROUND_FILTER__WIDTH);
		createEAttribute(backgroundFilterEClass, BACKGROUND_FILTER__HEIGHT);
		createEAttribute(backgroundFilterEClass, BACKGROUND_FILTER__POSITION);

		thumbnailFilterEClass = createEClass(THUMBNAIL_FILTER);
		createEAttribute(thumbnailFilterEClass, THUMBNAIL_FILTER__WIDTH);
		createEAttribute(thumbnailFilterEClass, THUMBNAIL_FILTER__HEIGHT);
		createEAttribute(thumbnailFilterEClass, THUMBNAIL_FILTER__MODE);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__ENTRIES);
		createEAttribute(menuEClass, MENU__OMIT_CAPTION);
		createEAttribute(menuEClass, MENU__CAPTION_CLASS);
		createEAttribute(menuEClass, MENU__STYLE_CLASS);
		createEAttribute(menuEClass, MENU__LAYOUT_CLASS);

		globalMenuEClass = createEClass(GLOBAL_MENU);

		dynamicMenuEClass = createEClass(DYNAMIC_MENU);
		createEReference(dynamicMenuEClass, DYNAMIC_MENU__ENTITY_OR_VIEW);
		createEReference(dynamicMenuEClass, DYNAMIC_MENU__SELECTION);
		createEReference(dynamicMenuEClass, DYNAMIC_MENU__TITLE);

		menuEntryEClass = createEClass(MENU_ENTRY);
		createEReference(menuEntryEClass, MENU_ENTRY__PART_OF);
		createEAttribute(menuEntryEClass, MENU_ENTRY__REQUIRES_ROLE);

		submenuEntryEClass = createEClass(SUBMENU_ENTRY);
		createEReference(submenuEntryEClass, SUBMENU_ENTRY__SUBMENU);

		actionMenuEntryEClass = createEClass(ACTION_MENU_ENTRY);
		createEReference(actionMenuEntryEClass, ACTION_MENU_ENTRY__ACTION);
		createEReference(actionMenuEntryEClass, ACTION_MENU_ENTRY__QUERY);

		editStaticTextMenuEntryEClass = createEClass(EDIT_STATIC_TEXT_MENU_ENTRY);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__PART_OF);
		createEReference(pageEClass, PAGE__PARENT_PAGE);
		createEReference(pageEClass, PAGE__CHILD_PAGES);
		createEReference(pageEClass, PAGE__CONTEXT_MENU);
		createEAttribute(pageEClass, PAGE__URI_ELEMENT);
		createEAttribute(pageEClass, PAGE__STYLE_CLASS);

		queryEClass = createEClass(QUERY);
		createEReference(queryEClass, QUERY__FILTER);
		createEReference(queryEClass, QUERY__PARAMETERS);

		queryParameterEClass = createEClass(QUERY_PARAMETER);
		createEReference(queryParameterEClass, QUERY_PARAMETER__FORMAL);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__VALUE);

		unitContainerEClass = createEClass(UNIT_CONTAINER);
		createEReference(unitContainerEClass, UNIT_CONTAINER__UNITS);

		contentUnitEClass = createEClass(CONTENT_UNIT);
		createEReference(contentUnitEClass, CONTENT_UNIT__DISPLAYED_ON);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__URI_ELEMENT);
		createEReference(contentUnitEClass, CONTENT_UNIT__ROUTE_ACTUALS);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__REQUIRES_ROLE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__PURPOSE_SUMMARY);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__ALTERNATIVE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__OMIT_CAPTION);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__CAPTION_CLASS);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__STYLE_CLASS);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__CONTENT_CLASS);

		routeActualEClass = createEClass(ROUTE_ACTUAL);
		createEReference(routeActualEClass, ROUTE_ACTUAL__ROUTE_PARAMETER);
		createEReference(routeActualEClass, ROUTE_ACTUAL__VALUE);

		staticUnitEClass = createEClass(STATIC_UNIT);
		createEReference(staticUnitEClass, STATIC_UNIT__SERVICE);
		createEAttribute(staticUnitEClass, STATIC_UNIT__CONTENT);

		dynamicUnitEClass = createEClass(DYNAMIC_UNIT);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__DISPLAY_FIELDS);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__HIDE_WHEN);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__SUPPORT_ACTIONS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__HEADER);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__FOOTER);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__HEADER_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__CONTROL_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__FOOTER_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__ERROR_CLASS);

		unitSupportActionEClass = createEClass(UNIT_SUPPORT_ACTION);
		createEAttribute(unitSupportActionEClass, UNIT_SUPPORT_ACTION__DISABLE);
		createEAttribute(unitSupportActionEClass, UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE);

		unitFieldEClass = createEClass(UNIT_FIELD);
		createEReference(unitFieldEClass, UNIT_FIELD__DISPLAYED_ON);
		createEAttribute(unitFieldEClass, UNIT_FIELD__REQUIRES_ROLE);
		createEReference(unitFieldEClass, UNIT_FIELD__HIDE_WHEN);
		createEAttribute(unitFieldEClass, UNIT_FIELD__TITLE);
		createEAttribute(unitFieldEClass, UNIT_FIELD__COLLECTION_DISPLAY_OPTION);
		createEAttribute(unitFieldEClass, UNIT_FIELD__MAXIMUM_DISPLAY_SIZE);
		createEAttribute(unitFieldEClass, UNIT_FIELD__DATE_FORMAT);
		createEAttribute(unitFieldEClass, UNIT_FIELD__DISABLE_INPUT);

		unitFeatureEClass = createEClass(UNIT_FEATURE);
		createEReference(unitFeatureEClass, UNIT_FEATURE__FORCED_VALUE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__NULL_DISPLAY_VALUE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__AUTOFOCUS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FOOTER);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__HEADER_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__INPUT_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__DISPLAY_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FOOTER_CLASS);

		unitAttributeEClass = createEClass(UNIT_ATTRIBUTE);
		createEReference(unitAttributeEClass, UNIT_ATTRIBUTE__ATTRIBUTE);
		createEAttribute(unitAttributeEClass, UNIT_ATTRIBUTE__NAME);
		createEReference(unitAttributeEClass, UNIT_ATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(unitAttributeEClass, UNIT_ATTRIBUTE__OBFUSCATE_FORM_FIELDS);
		createEAttribute(unitAttributeEClass, UNIT_ATTRIBUTE__PLACEHOLDER);
		createEAttribute(unitAttributeEClass, UNIT_ATTRIBUTE__VALIDATION_PATTERN);

		unitAssociationEClass = createEClass(UNIT_ASSOCIATION);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__SELECTION);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__AJAX_OPTIONS_LIST);

		associationReferenceEClass = createEClass(ASSOCIATION_REFERENCE);
		createEAttribute(associationReferenceEClass, ASSOCIATION_REFERENCE__NAME);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__ASSOCIATION);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__VALUE_DISPLAY);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__CHILD_FEATURE);

		childPathEClass = createEClass(CHILD_PATH);

		childPathAttributeEClass = createEClass(CHILD_PATH_ATTRIBUTE);
		createEAttribute(childPathAttributeEClass, CHILD_PATH_ATTRIBUTE__NAME);
		createEReference(childPathAttributeEClass, CHILD_PATH_ATTRIBUTE__ATTRIBUTE);

		childPathAssociationEClass = createEClass(CHILD_PATH_ASSOCIATION);

		featurePathEClass = createEClass(FEATURE_PATH);

		featurePathAttributeEClass = createEClass(FEATURE_PATH_ATTRIBUTE);
		createEAttribute(featurePathAttributeEClass, FEATURE_PATH_ATTRIBUTE__NAME);
		createEReference(featurePathAttributeEClass, FEATURE_PATH_ATTRIBUTE__ATTRIBUTE);

		featurePathAssociationEClass = createEClass(FEATURE_PATH_ASSOCIATION);

		featurePathLabelEClass = createEClass(FEATURE_PATH_LABEL);
		createEAttribute(featurePathLabelEClass, FEATURE_PATH_LABEL__NAME);
		createEReference(featurePathLabelEClass, FEATURE_PATH_LABEL__LABEL);

		interfaceFieldEClass = createEClass(INTERFACE_FIELD);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__REQUIRED);
		createEReference(interfaceFieldEClass, INTERFACE_FIELD__DEFAULT_VALUE);
		createEReference(interfaceFieldEClass, INTERFACE_FIELD__MUST_MATCH);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__INTERFACE_TYPE);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__PLACEHOLDER);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__VALIDATION_PATTERN);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__INPUT_CLASS);

		dataTypeFieldEClass = createEClass(DATA_TYPE_FIELD);
		createEReference(dataTypeFieldEClass, DATA_TYPE_FIELD__DATA_TYPE);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__CASE_INSENSITIVE);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__ENCRYPT);

		dateFieldEClass = createEClass(DATE_FIELD);
		createEAttribute(dateFieldEClass, DATE_FIELD__DETAILS);
		createEAttribute(dateFieldEClass, DATE_FIELD__FORMAT);

		captchaFieldEClass = createEClass(CAPTCHA_FIELD);

		selectableUnitEClass = createEClass(SELECTABLE_UNIT);
		createEReference(selectableUnitEClass, SELECTABLE_UNIT__SELECTORS);

		singletonUnitEClass = createEClass(SINGLETON_UNIT);
		createEReference(singletonUnitEClass, SINGLETON_UNIT__CONTENT_TYPE);

		collectionUnitEClass = createEClass(COLLECTION_UNIT);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__CONTENT_TYPE);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__SELECTION);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__FIND_CONTAINER_SELECTION);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__OMIT_CONTAINER_LOAD);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__FIND_ELEMENT_SELECTION);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__FILTER);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__SUPPORTED_FILTERS);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__BADGES);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__EMPTY_MESSAGE);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__NEXT_NPAGES);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PREVIOUS_NPAGES);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__NEXT_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__NEXT_PAGE_ICON_NAME);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PREVIOUS_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__FIRST_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__FIRST_PAGE_ICON_NAME);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__LAST_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__LAST_PAGE_ICON_NAME);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PAGINATION_CLASS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS);

		editUnitEClass = createEClass(EDIT_UNIT);
		createEAttribute(editUnitEClass, EDIT_UNIT__ON_SAVE_CONTINUE_EDITING);
		createEReference(editUnitEClass, EDIT_UNIT__DISABLE_WHEN);
		createEReference(editUnitEClass, EDIT_UNIT__TITLE);
		createEReference(editUnitEClass, EDIT_UNIT__CONFIRM_DESTINATION);
		createEAttribute(editUnitEClass, EDIT_UNIT__CONFIRM_LABEL);
		createEReference(editUnitEClass, EDIT_UNIT__CANCEL_DESTINATION);
		createEAttribute(editUnitEClass, EDIT_UNIT__CANCEL_LABEL);
		createEAttribute(editUnitEClass, EDIT_UNIT__CUSTOMISE_VALUES);

		createUnitEClass = createEClass(CREATE_UNIT);

		createUpdateUnitEClass = createEClass(CREATE_UPDATE_UNIT);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__CLEAR_LABEL);

		mapUnitEClass = createEClass(MAP_UNIT);
		createEAttribute(mapUnitEClass, MAP_UNIT__READ_ONLY);
		createEAttribute(mapUnitEClass, MAP_UNIT__DEFAULT_ZOOM_LEVEL);
		createEReference(mapUnitEClass, MAP_UNIT__LOCATION);
		createEReference(mapUnitEClass, MAP_UNIT__PLACE_NAME);

		updateUnitEClass = createEClass(UPDATE_UNIT);

		dataUnitEClass = createEClass(DATA_UNIT);
		createEReference(dataUnitEClass, DATA_UNIT__TITLE);

		detailsUnitEClass = createEClass(DETAILS_UNIT);
		createEReference(detailsUnitEClass, DETAILS_UNIT__SELECTION);
		createEAttribute(detailsUnitEClass, DETAILS_UNIT__OMIT_FIELD_LABELS);

		indexUnitEClass = createEClass(INDEX_UNIT);
		createEAttribute(indexUnitEClass, INDEX_UNIT__OMIT_COLUMN_LABELS);
		createEReference(indexUnitEClass, INDEX_UNIT__TARGETTING_SEARCHES);
		createEAttribute(indexUnitEClass, INDEX_UNIT__ROW_CLASSES);

		indexGridUnitEClass = createEClass(INDEX_GRID_UNIT);

		indexPageDirectionUnitEClass = createEClass(INDEX_PAGE_DIRECTION_UNIT);

		indexLineDirectionUnitEClass = createEClass(INDEX_LINE_DIRECTION_UNIT);

		controlUnitEClass = createEClass(CONTROL_UNIT);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__SUBMIT_LABEL);
		createEReference(controlUnitEClass, CONTROL_UNIT__CANCEL_DESTINATION);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__CANCEL_LABEL);

		searchUnitEClass = createEClass(SEARCH_UNIT);
		createEReference(searchUnitEClass, SEARCH_UNIT__RESULTS_DESTINATION);

		imageUnitEClass = createEClass(IMAGE_UNIT);
		createEReference(imageUnitEClass, IMAGE_UNIT__TITLE);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_PATH_FEATURE);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_TITLE_FEATURE);
		createEAttribute(imageUnitEClass, IMAGE_UNIT__TRUNCATE_IMAGE_TITLE);
		createEAttribute(imageUnitEClass, IMAGE_UNIT__MISSING_IMAGE_PATH);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_FILTER);

		imageIndexUnitEClass = createEClass(IMAGE_INDEX_UNIT);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__OMIT_FIELD_LABELS);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__OVERLAY_TITLE);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__OVERLAY_SINGLE_SELECT_ACTION);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__COLUMN_CLASS);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__CARD_CLASS);

		sliderUnitEClass = createEClass(SLIDER_UNIT);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__SHOW_TIME);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__TRANSITION_TIME);

		galleryUnitEClass = createEClass(GALLERY_UNIT);
		createEReference(galleryUnitEClass, GALLERY_UNIT__FULL_SIZE_FILTER);
		createEAttribute(galleryUnitEClass, GALLERY_UNIT__SHOW_TIME);
		createEAttribute(galleryUnitEClass, GALLERY_UNIT__TRANSITION_TIME);

		authenticationUnitEClass = createEClass(AUTHENTICATION_UNIT);

		registrationUnitEClass = createEClass(REGISTRATION_UNIT);
		createEReference(registrationUnitEClass, REGISTRATION_UNIT__AUTHENTICATION_SYSTEM);

		loginUnitEClass = createEClass(LOGIN_UNIT);
		createEReference(loginUnitEClass, LOGIN_UNIT__AUTHENTICATION_SYSTEM);
		createEReference(loginUnitEClass, LOGIN_UNIT__LOGIN_ID_FIELD);
		createEReference(loginUnitEClass, LOGIN_UNIT__PASSWORD_FIELD);
		createEReference(loginUnitEClass, LOGIN_UNIT__REMEMBER_ME_FIELD);
		createEAttribute(loginUnitEClass, LOGIN_UNIT__LOGOUT_URI_ELEMENT);

		forgottenPasswordUnitEClass = createEClass(FORGOTTEN_PASSWORD_UNIT);
		createEReference(forgottenPasswordUnitEClass, FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM);
		createEReference(forgottenPasswordUnitEClass, FORGOTTEN_PASSWORD_UNIT__LOGIN_ID_FIELD);

		inlineActionContainerEClass = createEClass(INLINE_ACTION_CONTAINER);
		createEReference(inlineActionContainerEClass, INLINE_ACTION_CONTAINER__ACTIONS);

		inlineActionEClass = createEClass(INLINE_ACTION);
		createEReference(inlineActionEClass, INLINE_ACTION__USED_BY);
		createEAttribute(inlineActionEClass, INLINE_ACTION__DISABLE);
		createEReference(inlineActionEClass, INLINE_ACTION__DISPLAY_WHEN);
		createEAttribute(inlineActionEClass, INLINE_ACTION__HEADER);
		createEAttribute(inlineActionEClass, INLINE_ACTION__FOOTER);
		createEAttribute(inlineActionEClass, INLINE_ACTION__HEADER_CLASS);
		createEAttribute(inlineActionEClass, INLINE_ACTION__FOOTER_CLASS);

		selectActionEClass = createEClass(SELECT_ACTION);
		createEReference(selectActionEClass, SELECT_ACTION__TARGET);
		createEReference(selectActionEClass, SELECT_ACTION__VALUE_PATH);

		deleteActionEClass = createEClass(DELETE_ACTION);
		createEReference(deleteActionEClass, DELETE_ACTION__DESTINATION);
		createEAttribute(deleteActionEClass, DELETE_ACTION__CONFIRM_MESSAGE);
		createEAttribute(deleteActionEClass, DELETE_ACTION__REQUIRES_ROLE);
		createEReference(deleteActionEClass, DELETE_ACTION__ENABLE_WHEN);
		createEAttribute(deleteActionEClass, DELETE_ACTION__URI_ELEMENT);

		featureSupportActionEClass = createEClass(FEATURE_SUPPORT_ACTION);
		createEReference(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__OPERATION);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__REQUIRES_ROLE);
		createEReference(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__ENABLE_WHEN);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__URI_ELEMENT);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__FILE_EXTENSION);

		badgeEClass = createEClass(BADGE);
		createEAttribute(badgeEClass, BADGE__ICON_NAME);
		createEReference(badgeEClass, BADGE__VALUE);
		createEReference(badgeEClass, BADGE__DISPLAY_WHEN);
		createEReference(badgeEClass, BADGE__NEW_WHEN);

		// Create enums
		frameworkTechnologiesEEnum = createEEnum(FRAMEWORK_TECHNOLOGIES);
		inputTechnologiesEEnum = createEEnum(INPUT_TECHNOLOGIES);
		ajaxTechnologiesEEnum = createEEnum(AJAX_TECHNOLOGIES);
		authenticationKeyTypesEEnum = createEEnum(AUTHENTICATION_KEY_TYPES);
		backgroundPositionsEEnum = createEEnum(BACKGROUND_POSITIONS);
		thumbnailModesEEnum = createEEnum(THUMBNAIL_MODES);
		collectionDisplayOptionsEEnum = createEEnum(COLLECTION_DISPLAY_OPTIONS);
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
		OrmPackage theOrmPackage = (OrmPackage)EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ApiPackage theApiPackage = (ApiPackage)EPackage.Registry.INSTANCE.getEPackage(ApiPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localAuthenticationSystemEClass.getESuperTypes().add(this.getAuthentication());
		casAuthenticationEClass.getESuperTypes().add(this.getAuthentication());
		imageManipulationEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		backgroundFilterEClass.getESuperTypes().add(this.getImageFilter());
		thumbnailFilterEClass.getESuperTypes().add(this.getImageFilter());
		menuEClass.getESuperTypes().add(theOrmPackage.getNamedDisplayElement());
		globalMenuEClass.getESuperTypes().add(this.getMenu());
		dynamicMenuEClass.getESuperTypes().add(this.getMenu());
		submenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		submenuEntryEClass.getESuperTypes().add(theOrmPackage.getNamedDisplayElement());
		actionMenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		actionMenuEntryEClass.getESuperTypes().add(theOrmPackage.getNamedDisplayElement());
		editStaticTextMenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		editStaticTextMenuEntryEClass.getESuperTypes().add(theOrmPackage.getNamedDisplayElement());
		pageEClass.getESuperTypes().add(theOrmPackage.getNamedDisplayElement());
		pageEClass.getESuperTypes().add(this.getUnitContainer());
		queryEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		queryParameterEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		contentUnitEClass.getESuperTypes().add(theOrmPackage.getNamedDisplayElement());
		staticUnitEClass.getESuperTypes().add(this.getContentUnit());
		dynamicUnitEClass.getESuperTypes().add(this.getContentUnit());
		unitSupportActionEClass.getESuperTypes().add(theOrmPackage.getNamedDisplayElement());
		unitFieldEClass.getESuperTypes().add(this.getDisplayElement());
		unitFeatureEClass.getESuperTypes().add(this.getUnitField());
		unitFeatureEClass.getESuperTypes().add(this.getInlineActionContainer());
		unitAttributeEClass.getESuperTypes().add(this.getUnitFeature());
		unitAssociationEClass.getESuperTypes().add(this.getUnitFeature());
		unitAssociationEClass.getESuperTypes().add(this.getUnitContainer());
		unitAssociationEClass.getESuperTypes().add(this.getAssociationReference());
		childPathAttributeEClass.getESuperTypes().add(this.getChildPath());
		childPathAssociationEClass.getESuperTypes().add(this.getChildPath());
		childPathAssociationEClass.getESuperTypes().add(this.getAssociationReference());
		featurePathEClass.getESuperTypes().add(theExpressionPackage.getVariable());
		featurePathAttributeEClass.getESuperTypes().add(this.getFeaturePath());
		featurePathAssociationEClass.getESuperTypes().add(this.getFeaturePath());
		featurePathAssociationEClass.getESuperTypes().add(this.getAssociationReference());
		featurePathLabelEClass.getESuperTypes().add(this.getFeaturePath());
		interfaceFieldEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		interfaceFieldEClass.getESuperTypes().add(this.getUnitField());
		dataTypeFieldEClass.getESuperTypes().add(this.getInterfaceField());
		dateFieldEClass.getESuperTypes().add(this.getInterfaceField());
		captchaFieldEClass.getESuperTypes().add(this.getInterfaceField());
		collectionUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		editUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		editUnitEClass.getESuperTypes().add(this.getSingletonUnit());
		createUnitEClass.getESuperTypes().add(this.getEditUnit());
		createUpdateUnitEClass.getESuperTypes().add(this.getEditUnit());
		createUpdateUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		mapUnitEClass.getESuperTypes().add(this.getEditUnit());
		mapUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		updateUnitEClass.getESuperTypes().add(this.getEditUnit());
		updateUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		dataUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		detailsUnitEClass.getESuperTypes().add(this.getDataUnit());
		detailsUnitEClass.getESuperTypes().add(this.getSingletonUnit());
		detailsUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		indexUnitEClass.getESuperTypes().add(this.getDataUnit());
		indexUnitEClass.getESuperTypes().add(this.getCollectionUnit());
		indexUnitEClass.getESuperTypes().add(this.getInlineActionContainer());
		indexGridUnitEClass.getESuperTypes().add(this.getIndexUnit());
		indexPageDirectionUnitEClass.getESuperTypes().add(this.getIndexUnit());
		indexLineDirectionUnitEClass.getESuperTypes().add(this.getIndexUnit());
		controlUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		searchUnitEClass.getESuperTypes().add(this.getControlUnit());
		imageUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		imageUnitEClass.getESuperTypes().add(this.getCollectionUnit());
		imageIndexUnitEClass.getESuperTypes().add(this.getImageUnit());
		imageIndexUnitEClass.getESuperTypes().add(this.getInlineActionContainer());
		sliderUnitEClass.getESuperTypes().add(this.getImageUnit());
		galleryUnitEClass.getESuperTypes().add(this.getImageUnit());
		registrationUnitEClass.getESuperTypes().add(this.getEditUnit());
		registrationUnitEClass.getESuperTypes().add(this.getAuthenticationUnit());
		loginUnitEClass.getESuperTypes().add(this.getControlUnit());
		loginUnitEClass.getESuperTypes().add(this.getAuthenticationUnit());
		forgottenPasswordUnitEClass.getESuperTypes().add(this.getControlUnit());
		forgottenPasswordUnitEClass.getESuperTypes().add(this.getAuthenticationUnit());
		inlineActionEClass.getESuperTypes().add(theOrmPackage.getNamedDisplayElement());
		selectActionEClass.getESuperTypes().add(this.getInlineAction());
		deleteActionEClass.getESuperTypes().add(this.getInlineAction());
		featureSupportActionEClass.getESuperTypes().add(this.getInlineAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(wafModelEClass, WafModel.class, "WafModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWafModel_Persistence(), theOrmPackage.getOrmModel(), null, "persistence", null, 1, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWafModel_Business(), theServicePackage.getServiceModel(), null, "business", null, 1, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWafModel_ImageManipulations(), this.getImageManipulation(), null, "imageManipulations", null, 0, -1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWafModel_Pages(), this.getPage(), this.getPage_PartOf(), "pages", null, 0, -1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWafModel_GlobalMenus(), this.getGlobalMenu(), null, "globalMenus", null, 0, -1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWafModel_DynamicMenus(), this.getDynamicMenu(), null, "dynamicMenus", null, 0, -1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWafModel_Api(), theApiPackage.getAPI(), null, "api", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_SiteName(), theEcorePackage.getEString(), "siteName", null, 1, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_SiteTitle(), theEcorePackage.getEString(), "siteTitle", null, 1, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_WebmasterEmail(), theEcorePackage.getEString(), "webmasterEmail", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_CopyrightText(), theEcorePackage.getEString(), "copyrightText", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_MetaDescription(), theEcorePackage.getEString(), "metaDescription", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_LogoImage(), theEcorePackage.getEString(), "logoImage", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWafModel_LogoFilters(), this.getImageManipulation(), null, "logoFilters", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_FrameworkTechnology(), this.getFrameworkTechnologies(), "frameworkTechnology", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_InputTechnology(), this.getInputTechnologies(), "inputTechnology", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_AjaxTechnology(), this.getAjaxTechnologies(), "ajaxTechnology", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWafModel_Authentication(), this.getAuthentication(), this.getAuthentication_Authorises(), "authentication", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_CaptchaSiteKey(), theEcorePackage.getEString(), "captchaSiteKey", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_CaptchaSecretKey(), theEcorePackage.getEString(), "captchaSecretKey", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_TextEditorURL(), theEcorePackage.getEString(), "textEditorURL", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_TopNavigationId(), theEcorePackage.getEString(), "topNavigationId", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWafModel_SideMenu(), this.getMenu(), null, "sideMenu", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_SiteTemplate(), theEcorePackage.getEString(), "siteTemplate", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWafModel_StaticUnitsEditable(), theEcorePackage.getEBoolean(), "staticUnitsEditable", null, 0, 1, WafModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthentication_Authorises(), this.getWafModel(), this.getWafModel_Authentication(), "authorises", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthentication_User(), theOrmPackage.getEntityOrView(), null, "user", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthentication_UserKey(), theOrmPackage.getAttribute(), null, "userKey", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthentication_LoginLabel(), theEcorePackage.getEString(), "loginLabel", "", 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthentication_LogoutLabel(), theEcorePackage.getEString(), "logoutLabel", "", 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localAuthenticationSystemEClass, LocalAuthenticationSystem.class, "LocalAuthenticationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalAuthenticationSystem_Authentication(), theOrmPackage.getEntityOrView(), null, "authentication", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AuthenticationKey(), this.getAuthenticationKeyTypes(), "authenticationKey", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_LoginAttempt(), theOrmPackage.getEntityOrView(), null, "loginAttempt", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_AutoLogin(), theOrmPackage.getEntityOrView(), null, "autoLogin", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_UseCaptcha(), theEcorePackage.getEBoolean(), "useCaptcha", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowRememberMe(), theEcorePackage.getEBoolean(), "allowRememberMe", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowSelfRegistration(), theEcorePackage.getEBoolean(), "allowSelfRegistration", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_UseEmailActivation(), theEcorePackage.getEBoolean(), "useEmailActivation", "true", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_SendWelcomeEmail(), theEcorePackage.getEBoolean(), "sendWelcomeEmail", "true", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_RegistrationUnit(), this.getRegistrationUnit(), this.getRegistrationUnit_AuthenticationSystem(), "registrationUnit", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_LoginUnit(), this.getLoginUnit(), this.getLoginUnit_AuthenticationSystem(), "loginUnit", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_ForgottenPasswordUnit(), this.getForgottenPasswordUnit(), this.getForgottenPasswordUnit_AuthenticationSystem(), "forgottenPasswordUnit", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casAuthenticationEClass, CasAuthentication.class, "CasAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(displayElementEClass, DisplayElement.class, "DisplayElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplayElement_DisplayLabel(), theEcorePackage.getEString(), "displayLabel", null, 1, 1, DisplayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageManipulationEClass, ImageManipulation.class, "ImageManipulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageManipulation_JpegQuality(), theEcorePackage.getEInt(), "jpegQuality", "-1", 0, 1, ImageManipulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageManipulation_Filters(), this.getImageFilter(), null, "filters", null, 0, -1, ImageManipulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageFilterEClass, ImageFilter.class, "ImageFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(backgroundFilterEClass, BackgroundFilter.class, "BackgroundFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackgroundFilter_Color(), theEcorePackage.getEString(), "color", null, 0, 1, BackgroundFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackgroundFilter_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, BackgroundFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackgroundFilter_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, BackgroundFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackgroundFilter_Position(), this.getBackgroundPositions(), "position", null, 0, 1, BackgroundFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thumbnailFilterEClass, ThumbnailFilter.class, "ThumbnailFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThumbnailFilter_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, ThumbnailFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThumbnailFilter_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, ThumbnailFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThumbnailFilter_Mode(), this.getThumbnailModes(), "mode", null, 0, 1, ThumbnailFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_Entries(), this.getMenuEntry(), this.getMenuEntry_PartOf(), "entries", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_OmitCaption(), theEcorePackage.getEBoolean(), "omitCaption", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_CaptionClass(), theEcorePackage.getEString(), "captionClass", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_LayoutClass(), theEcorePackage.getEString(), "layoutClass", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalMenuEClass, GlobalMenu.class, "GlobalMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicMenuEClass, DynamicMenu.class, "DynamicMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicMenu_EntityOrView(), theOrmPackage.getEntityOrView(), null, "entityOrView", null, 1, 1, DynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicMenu_Selection(), theServicePackage.getSelection(), null, "selection", null, 1, 1, DynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicMenu_Title(), theOrmPackage.getLabel(), null, "title", null, 0, 1, DynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEntryEClass, MenuEntry.class, "MenuEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuEntry_PartOf(), this.getMenu(), this.getMenu_Entries(), "partOf", null, 1, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuEntry_RequiresRole(), theEcorePackage.getEString(), "requiresRole", null, 0, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submenuEntryEClass, SubmenuEntry.class, "SubmenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmenuEntry_Submenu(), this.getMenu(), null, "submenu", null, 1, 1, SubmenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionMenuEntryEClass, ActionMenuEntry.class, "ActionMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionMenuEntry_Action(), this.getContentUnit(), null, "action", null, 1, 1, ActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionMenuEntry_Query(), this.getQuery(), null, "query", null, 0, 1, ActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editStaticTextMenuEntryEClass, EditStaticTextMenuEntry.class, "EditStaticTextMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_PartOf(), this.getWafModel(), this.getWafModel_Pages(), "partOf", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_ParentPage(), this.getPage(), this.getPage_ChildPages(), "parentPage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_ChildPages(), this.getPage(), this.getPage_ParentPage(), "childPages", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_ContextMenu(), this.getGlobalMenu(), null, "contextMenu", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_UriElement(), theEcorePackage.getEString(), "uriElement", "", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_Filter(), theServicePackage.getFilter(), null, "filter", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Parameters(), this.getQueryParameter(), null, "parameters", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParameterEClass, QueryParameter.class, "QueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryParameter_Formal(), theServicePackage.getFormalParameter(), null, "formal", null, 1, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_Value(), theEcorePackage.getEString(), "value", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitContainerEClass, UnitContainer.class, "UnitContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitContainer_Units(), this.getContentUnit(), this.getContentUnit_DisplayedOn(), "units", null, 0, -1, UnitContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentUnitEClass, ContentUnit.class, "ContentUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentUnit_DisplayedOn(), this.getUnitContainer(), this.getUnitContainer_Units(), "displayedOn", null, 1, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_UriElement(), theEcorePackage.getEString(), "uriElement", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentUnit_RouteActuals(), this.getRouteActual(), null, "routeActuals", null, 0, -1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_RequiresRole(), theEcorePackage.getEString(), "requiresRole", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_PurposeSummary(), theEcorePackage.getEString(), "purposeSummary", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Alternative(), theEcorePackage.getEString(), "alternative", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_OmitCaption(), theEcorePackage.getEBoolean(), "omitCaption", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_CaptionClass(), theEcorePackage.getEString(), "captionClass", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_ContentClass(), theEcorePackage.getEString(), "contentClass", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeActualEClass, RouteActual.class, "RouteActual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouteActual_RouteParameter(), theOrmPackage.getAttribute(), null, "routeParameter", null, 1, 1, RouteActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteActual_Value(), theExpressionPackage.getExpression(), null, "value", null, 1, 1, RouteActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticUnitEClass, StaticUnit.class, "StaticUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticUnit_Service(), theServicePackage.getService(), null, "service", null, 0, 1, StaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticUnit_Content(), theEcorePackage.getEString(), "content", null, 1, 1, StaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicUnitEClass, DynamicUnit.class, "DynamicUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicUnit_DisplayFields(), this.getUnitField(), this.getUnitField_DisplayedOn(), "displayFields", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_HideWhen(), theExpressionPackage.getPredicate(), null, "hideWhen", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_MessageWhenHidden(), theEcorePackage.getEString(), "messageWhenHidden", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_SupportActions(), this.getUnitSupportAction(), null, "supportActions", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_Header(), theEcorePackage.getEString(), "header", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_Footer(), theEcorePackage.getEString(), "footer", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_HeaderClass(), theEcorePackage.getEString(), "headerClass", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_ControlClass(), theEcorePackage.getEString(), "controlClass", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_FooterClass(), theEcorePackage.getEString(), "footerClass", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_ErrorClass(), theEcorePackage.getEString(), "errorClass", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitSupportActionEClass, UnitSupportAction.class, "UnitSupportAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitSupportAction_Disable(), theEcorePackage.getEBoolean(), "disable", null, 0, 1, UnitSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitSupportAction_ConfirmMessage(), theEcorePackage.getEString(), "confirmMessage", null, 0, 1, UnitSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitFieldEClass, UnitField.class, "UnitField", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitField_DisplayedOn(), this.getDynamicUnit(), this.getDynamicUnit_DisplayFields(), "displayedOn", null, 1, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_RequiresRole(), theEcorePackage.getEString(), "requiresRole", "", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitField_HideWhen(), theExpressionPackage.getPredicate(), null, "hideWhen", null, 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_Title(), theEcorePackage.getEString(), "title", "", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_CollectionDisplayOption(), this.getCollectionDisplayOptions(), "collectionDisplayOption", null, 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_MaximumDisplaySize(), theEcorePackage.getEInt(), "maximumDisplaySize", "-1", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_DateFormat(), theEcorePackage.getEString(), "dateFormat", null, 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_DisableInput(), theEcorePackage.getEBooleanObject(), "disableInput", "false", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitFeatureEClass, UnitFeature.class, "UnitFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitFeature_ForcedValue(), theExpressionPackage.getExpression(), null, "forcedValue", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_CollectionUiAllowAdd(), theEcorePackage.getEBoolean(), "collectionUiAllowAdd", "true", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_CollectionUiAllowRemove(), theEcorePackage.getEBoolean(), "collectionUiAllowRemove", "true", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_NullDisplayValue(), theEcorePackage.getEString(), "nullDisplayValue", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_Autofocus(), theEcorePackage.getEBoolean(), "autofocus", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_Footer(), theEcorePackage.getEString(), "footer", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_HeaderClass(), theEcorePackage.getEString(), "headerClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_InputClass(), theEcorePackage.getEString(), "inputClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_DisplayClass(), theEcorePackage.getEString(), "displayClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_FooterClass(), theEcorePackage.getEString(), "footerClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitAttributeEClass, UnitAttribute.class, "UnitAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitAttribute_Attribute(), theOrmPackage.getAttribute(), null, "attribute", null, 1, 1, UnitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitAttribute_Name(), theEcorePackage.getEString(), "name", null, 1, 1, UnitAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAttribute_DefaultValue(), theExpressionPackage.getExpression(), null, "defaultValue", null, 0, 1, UnitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitAttribute_ObfuscateFormFields(), theEcorePackage.getEBoolean(), "obfuscateFormFields", null, 0, 1, UnitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitAttribute_Placeholder(), theEcorePackage.getEString(), "placeholder", null, 0, 1, UnitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitAttribute_ValidationPattern(), theEcorePackage.getEString(), "validationPattern", null, 0, 1, UnitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitAssociationEClass, UnitAssociation.class, "UnitAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitAssociation_Selection(), theServicePackage.getSelection(), null, "selection", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_AjaxOptionsList(), theServicePackage.getSelection(), null, "ajaxOptionsList", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationReferenceEClass, AssociationReference.class, "AssociationReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationReference_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AssociationReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationReference_Association(), theOrmPackage.getAssociation(), null, "association", null, 1, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationReference_ValueDisplay(), theOrmPackage.getLabel(), null, "valueDisplay", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationReference_ChildFeature(), this.getChildPath(), null, "childFeature", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childPathEClass, ChildPath.class, "ChildPath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(childPathAttributeEClass, ChildPathAttribute.class, "ChildPathAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildPathAttribute_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ChildPathAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChildPathAttribute_Attribute(), theOrmPackage.getAttribute(), null, "attribute", null, 1, 1, ChildPathAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childPathAssociationEClass, ChildPathAssociation.class, "ChildPathAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featurePathEClass, FeaturePath.class, "FeaturePath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featurePathAttributeEClass, FeaturePathAttribute.class, "FeaturePathAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePathAttribute_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FeaturePathAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeaturePathAttribute_Attribute(), theOrmPackage.getAttribute(), null, "attribute", null, 1, 1, FeaturePathAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featurePathAssociationEClass, FeaturePathAssociation.class, "FeaturePathAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featurePathLabelEClass, FeaturePathLabel.class, "FeaturePathLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePathLabel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FeaturePathLabel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeaturePathLabel_Label(), theOrmPackage.getModelLabel(), null, "label", null, 1, 1, FeaturePathLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceFieldEClass, InterfaceField.class, "InterfaceField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceField_Required(), theEcorePackage.getEBoolean(), "required", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceField_DefaultValue(), theExpressionPackage.getExpression(), null, "defaultValue", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceField_MustMatch(), this.getUnitField(), null, "mustMatch", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceField_InterfaceType(), theEcorePackage.getEString(), "interfaceType", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceField_Placeholder(), theEcorePackage.getEString(), "placeholder", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceField_ValidationPattern(), theEcorePackage.getEString(), "validationPattern", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceField_InputClass(), theEcorePackage.getEString(), "inputClass", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeFieldEClass, DataTypeField.class, "DataTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeField_DataType(), theOrmPackage.getDataType(), null, "dataType", null, 1, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_CaseInsensitive(), theEcorePackage.getEBoolean(), "caseInsensitive", null, 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_ObfuscateFormFields(), theEcorePackage.getEBoolean(), "obfuscateFormFields", null, 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeField_Encrypt(), theEcorePackage.getEBoolean(), "encrypt", null, 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateFieldEClass, DateField.class, "DateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateField_Details(), theOrmPackage.getDateDetails(), "details", null, 1, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateField_Format(), theEcorePackage.getEString(), "format", null, 0, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(captchaFieldEClass, CaptchaField.class, "CaptchaField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectableUnitEClass, SelectableUnit.class, "SelectableUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectableUnit_Selectors(), this.getSelectAction(), this.getSelectAction_Target(), "selectors", null, 0, -1, SelectableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonUnitEClass, SingletonUnit.class, "SingletonUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingletonUnit_ContentType(), theOrmPackage.getEntityOrView(), null, "contentType", null, 1, 1, SingletonUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionUnitEClass, CollectionUnit.class, "CollectionUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionUnit_ContentType(), theOrmPackage.getEntityOrView(), null, "contentType", null, 1, -1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Selection(), theServicePackage.getSelection(), null, "selection", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_FindContainerSelection(), theServicePackage.getSelection(), null, "findContainerSelection", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_OmitContainerLoad(), theEcorePackage.getEBoolean(), "omitContainerLoad", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_FindElementSelection(), theServicePackage.getSelection(), null, "findElementSelection", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Filter(), theServicePackage.getFilter(), null, "filter", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_SupportedFilters(), theServicePackage.getFilter(), null, "supportedFilters", null, 0, -1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Badges(), this.getBadge(), null, "badges", null, 0, -1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_EmptyMessage(), theEcorePackage.getEString(), "emptyMessage", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_DefaultPaginationSize(), theEcorePackage.getEInt(), "defaultPaginationSize", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_MaximumPaginationSize(), theEcorePackage.getEInt(), "maximumPaginationSize", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_NextNpages(), theEcorePackage.getEInt(), "nextNpages", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousNpages(), theEcorePackage.getEInt(), "previousNpages", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_NextPageLabel(), theEcorePackage.getEString(), "nextPageLabel", ">", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_NextPageIconName(), theEcorePackage.getEString(), "nextPageIconName", "", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousPageLabel(), theEcorePackage.getEString(), "previousPageLabel", "<", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousPageIconName(), theEcorePackage.getEString(), "previousPageIconName", "", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_UseDisabledPageLinks(), theEcorePackage.getEBoolean(), "useDisabledPageLinks", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_UseFirstLastPageLinks(), theEcorePackage.getEBoolean(), "useFirstLastPageLinks", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_FirstPageLabel(), theEcorePackage.getEString(), "firstPageLabel", "<<", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_FirstPageIconName(), theEcorePackage.getEString(), "firstPageIconName", "", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_LastPageLabel(), theEcorePackage.getEString(), "lastPageLabel", ">>", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_LastPageIconName(), theEcorePackage.getEString(), "lastPageIconName", "", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PaginationClass(), theEcorePackage.getEString(), "paginationClass", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PaginationElementClass(), theEcorePackage.getEString(), "paginationElementClass", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editUnitEClass, EditUnit.class, "EditUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEditUnit_OnSaveContinueEditing(), theEcorePackage.getEBoolean(), "onSaveContinueEditing", "false", 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_DisableWhen(), theExpressionPackage.getPredicate(), null, "disableWhen", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_Title(), theOrmPackage.getLabel(), null, "title", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_ConfirmDestination(), this.getPage(), null, "confirmDestination", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditUnit_ConfirmLabel(), theEcorePackage.getEString(), "confirmLabel", null, 1, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_CancelDestination(), this.getPage(), null, "cancelDestination", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditUnit_CancelLabel(), theEcorePackage.getEString(), "cancelLabel", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditUnit_CustomiseValues(), theEcorePackage.getEBoolean(), "customiseValues", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createUnitEClass, CreateUnit.class, "CreateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createUpdateUnitEClass, CreateUpdateUnit.class, "CreateUpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateUpdateUnit_CreateUriElement(), theEcorePackage.getEString(), "createUriElement", "", 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateUpdateUnit_ClearLabel(), theEcorePackage.getEString(), "clearLabel", null, 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapUnitEClass, MapUnit.class, "MapUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapUnit_ReadOnly(), theEcorePackage.getEBoolean(), "readOnly", null, 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapUnit_DefaultZoomLevel(), theEcorePackage.getEInt(), "defaultZoomLevel", null, 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapUnit_Location(), theOrmPackage.getSingletonLocation(), null, "location", null, 1, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapUnit_PlaceName(), theOrmPackage.getAttribute(), null, "placeName", null, 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateUnitEClass, UpdateUnit.class, "UpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataUnitEClass, DataUnit.class, "DataUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataUnit_Title(), theOrmPackage.getLabel(), null, "title", null, 0, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailsUnitEClass, DetailsUnit.class, "DetailsUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetailsUnit_Selection(), theServicePackage.getSelection(), null, "selection", null, 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailsUnit_OmitFieldLabels(), theEcorePackage.getEBoolean(), "omitFieldLabels", null, 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexUnitEClass, IndexUnit.class, "IndexUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexUnit_OmitColumnLabels(), theEcorePackage.getEBoolean(), "omitColumnLabels", null, 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndexUnit_TargettingSearches(), this.getSearchUnit(), this.getSearchUnit_ResultsDestination(), "targettingSearches", null, 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexUnit_RowClasses(), theEcorePackage.getEString(), "rowClasses", null, 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexGridUnitEClass, IndexGridUnit.class, "IndexGridUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexPageDirectionUnitEClass, IndexPageDirectionUnit.class, "IndexPageDirectionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexLineDirectionUnitEClass, IndexLineDirectionUnit.class, "IndexLineDirectionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlUnitEClass, ControlUnit.class, "ControlUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlUnit_SubmitLabel(), theEcorePackage.getEString(), "submitLabel", null, 1, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlUnit_CancelDestination(), this.getPage(), null, "cancelDestination", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlUnit_CancelLabel(), theEcorePackage.getEString(), "cancelLabel", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchUnitEClass, SearchUnit.class, "SearchUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchUnit_ResultsDestination(), this.getIndexUnit(), this.getIndexUnit_TargettingSearches(), "resultsDestination", null, 1, 1, SearchUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageUnitEClass, ImageUnit.class, "ImageUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageUnit_Title(), theOrmPackage.getLabel(), null, "title", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_ImagePathFeature(), this.getFeaturePath(), null, "imagePathFeature", null, 1, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_ImageTitleFeature(), this.getFeaturePath(), null, "imageTitleFeature", null, 1, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUnit_TruncateImageTitle(), theEcorePackage.getEBoolean(), "truncateImageTitle", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUnit_MissingImagePath(), theEcorePackage.getEString(), "missingImagePath", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_ImageFilter(), this.getImageManipulation(), null, "imageFilter", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageIndexUnitEClass, ImageIndexUnit.class, "ImageIndexUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageIndexUnit_OmitFieldLabels(), theEcorePackage.getEBoolean(), "omitFieldLabels", null, 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageIndexUnit_OverlayTitle(), theEcorePackage.getEBoolean(), "overlayTitle", null, 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageIndexUnit_OverlaySingleSelectAction(), theEcorePackage.getEBoolean(), "overlaySingleSelectAction", null, 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageIndexUnit_ColumnClass(), theEcorePackage.getEString(), "columnClass", null, 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageIndexUnit_CardClass(), theEcorePackage.getEString(), "cardClass", null, 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliderUnitEClass, SliderUnit.class, "SliderUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSliderUnit_ShowTime(), theEcorePackage.getEInt(), "showTime", null, 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSliderUnit_TransitionTime(), theEcorePackage.getEInt(), "transitionTime", null, 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(galleryUnitEClass, GalleryUnit.class, "GalleryUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGalleryUnit_FullSizeFilter(), this.getImageManipulation(), null, "fullSizeFilter", null, 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalleryUnit_ShowTime(), theEcorePackage.getEInt(), "showTime", null, 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalleryUnit_TransitionTime(), theEcorePackage.getEInt(), "transitionTime", null, 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationUnitEClass, AuthenticationUnit.class, "AuthenticationUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(registrationUnitEClass, RegistrationUnit.class, "RegistrationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistrationUnit_AuthenticationSystem(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_RegistrationUnit(), "authenticationSystem", null, 0, 1, RegistrationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loginUnitEClass, LoginUnit.class, "LoginUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoginUnit_AuthenticationSystem(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_LoginUnit(), "authenticationSystem", null, 0, 1, LoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoginUnit_LoginIdField(), this.getUnitField(), null, "loginIdField", null, 1, 1, LoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoginUnit_PasswordField(), this.getUnitField(), null, "passwordField", null, 1, 1, LoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoginUnit_RememberMeField(), this.getUnitField(), null, "rememberMeField", null, 0, 1, LoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginUnit_LogoutUriElement(), theEcorePackage.getEString(), "logoutUriElement", null, 1, 1, LoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forgottenPasswordUnitEClass, ForgottenPasswordUnit.class, "ForgottenPasswordUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForgottenPasswordUnit_AuthenticationSystem(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_ForgottenPasswordUnit(), "authenticationSystem", null, 0, 1, ForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForgottenPasswordUnit_LoginIdField(), this.getUnitField(), null, "loginIdField", null, 1, 1, ForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineActionContainerEClass, InlineActionContainer.class, "InlineActionContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineActionContainer_Actions(), this.getInlineAction(), this.getInlineAction_UsedBy(), "actions", null, 0, -1, InlineActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineActionEClass, InlineAction.class, "InlineAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineAction_UsedBy(), this.getInlineActionContainer(), this.getInlineActionContainer_Actions(), "usedBy", null, 1, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_Disable(), theEcorePackage.getEBoolean(), "disable", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInlineAction_DisplayWhen(), theExpressionPackage.getPredicate(), null, "displayWhen", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_Header(), theEcorePackage.getEString(), "header", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_Footer(), theEcorePackage.getEString(), "footer", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_HeaderClass(), theEcorePackage.getEString(), "headerClass", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_FooterClass(), theEcorePackage.getEString(), "footerClass", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectActionEClass, SelectAction.class, "SelectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectAction_Target(), this.getSelectableUnit(), this.getSelectableUnit_Selectors(), "target", null, 1, 1, SelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectAction_ValuePath(), this.getFeaturePath(), null, "valuePath", null, 0, 1, SelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteActionEClass, DeleteAction.class, "DeleteAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeleteAction_Destination(), this.getPage(), null, "destination", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_ConfirmMessage(), theEcorePackage.getEString(), "confirmMessage", null, 1, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_RequiresRole(), theEcorePackage.getEString(), "requiresRole", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeleteAction_EnableWhen(), theExpressionPackage.getPredicate(), null, "enableWhen", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_UriElement(), theEcorePackage.getEString(), "uriElement", null, 1, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSupportActionEClass, FeatureSupportAction.class, "FeatureSupportAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureSupportAction_Operation(), theServicePackage.getBusinessOperation(), null, "operation", null, 1, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_ConfirmMessage(), theEcorePackage.getEString(), "confirmMessage", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_RequiresRole(), theEcorePackage.getEString(), "requiresRole", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureSupportAction_EnableWhen(), theExpressionPackage.getPredicate(), null, "enableWhen", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_UriElement(), theEcorePackage.getEString(), "uriElement", null, 1, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_FileExtension(), theEcorePackage.getEString(), "fileExtension", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgeEClass, Badge.class, "Badge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadge_IconName(), theEcorePackage.getEString(), "iconName", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBadge_Value(), theExpressionPackage.getExpression(), null, "value", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBadge_DisplayWhen(), theExpressionPackage.getPredicate(), null, "displayWhen", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBadge_NewWhen(), theExpressionPackage.getPredicate(), null, "newWhen", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.USERNAME);

		initEEnum(backgroundPositionsEEnum, BackgroundPositions.class, "BackgroundPositions");
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.TOP_LEFT);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.TOP);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.TOP_RIGHT);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.LEFT);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.CENTER);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.RIGHT);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.BOTTOM_LEFT);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.BOTTOM);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.BOTTOM_RIGHT);

		initEEnum(thumbnailModesEEnum, ThumbnailModes.class, "ThumbnailModes");
		addEEnumLiteral(thumbnailModesEEnum, ThumbnailModes.CROP);
		addEEnumLiteral(thumbnailModesEEnum, ThumbnailModes.RESIZE);

		initEEnum(collectionDisplayOptionsEEnum, CollectionDisplayOptions.class, "CollectionDisplayOptions");
		addEEnumLiteral(collectionDisplayOptionsEEnum, CollectionDisplayOptions.LINE_DIRECTION);
		addEEnumLiteral(collectionDisplayOptionsEEnum, CollectionDisplayOptions.PAGE_DIRECTION);

		// Create resource
		createResource(eNS_URI);
	}

} //WafPackageImpl

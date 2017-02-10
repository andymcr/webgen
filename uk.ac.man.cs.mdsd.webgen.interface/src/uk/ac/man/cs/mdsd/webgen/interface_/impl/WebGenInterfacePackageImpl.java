/**
 */
package uk.ac.man.cs.mdsd.webgen.interface_.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.webgen.core.WebGenCorePackage;
import uk.ac.man.cs.mdsd.webgen.expression.WebGenExpressionPackage;

import uk.ac.man.cs.mdsd.webgen.image.WebGenImagePackage;

import uk.ac.man.cs.mdsd.webgen.interface_.ActionMenuEntry;
import uk.ac.man.cs.mdsd.webgen.interface_.AjaxTechnologies;
import uk.ac.man.cs.mdsd.webgen.interface_.AssociationReference;
import uk.ac.man.cs.mdsd.webgen.interface_.AuthenticationUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.CaptchaField;
import uk.ac.man.cs.mdsd.webgen.interface_.ChildPath;
import uk.ac.man.cs.mdsd.webgen.interface_.ChildPathAssociation;
import uk.ac.man.cs.mdsd.webgen.interface_.ChildPathAttribute;
import uk.ac.man.cs.mdsd.webgen.interface_.CollectionDisplayOptions;
import uk.ac.man.cs.mdsd.webgen.interface_.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.ControlUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.CreateSitemapUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.CreateUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.DataTypeField;
import uk.ac.man.cs.mdsd.webgen.interface_.DataUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.DateField;
import uk.ac.man.cs.mdsd.webgen.interface_.DeleteAction;
import uk.ac.man.cs.mdsd.webgen.interface_.DetailsUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.DynamicMenu;
import uk.ac.man.cs.mdsd.webgen.interface_.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.EditStaticTextMenuEntry;
import uk.ac.man.cs.mdsd.webgen.interface_.EditUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.FeaturePath;
import uk.ac.man.cs.mdsd.webgen.interface_.FeaturePathAssociation;
import uk.ac.man.cs.mdsd.webgen.interface_.FeaturePathAttribute;
import uk.ac.man.cs.mdsd.webgen.interface_.FeatureSupportAction;
import uk.ac.man.cs.mdsd.webgen.interface_.Filter;
import uk.ac.man.cs.mdsd.webgen.interface_.FilterParameter;
import uk.ac.man.cs.mdsd.webgen.interface_.ForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.GalleryUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.ImageIndexUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.ImageUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.IndexDisplayOption;
import uk.ac.man.cs.mdsd.webgen.interface_.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.InlineAction;
import uk.ac.man.cs.mdsd.webgen.interface_.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.interface_.InputTechnologies;
import uk.ac.man.cs.mdsd.webgen.interface_.Interface;
import uk.ac.man.cs.mdsd.webgen.interface_.InterfaceField;
import uk.ac.man.cs.mdsd.webgen.interface_.LoginUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.MapUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.Menu;
import uk.ac.man.cs.mdsd.webgen.interface_.MenuEntry;
import uk.ac.man.cs.mdsd.webgen.interface_.MenuFeature;
import uk.ac.man.cs.mdsd.webgen.interface_.ModelReference;
import uk.ac.man.cs.mdsd.webgen.interface_.Page;
import uk.ac.man.cs.mdsd.webgen.interface_.PageLink;
import uk.ac.man.cs.mdsd.webgen.interface_.PageTopMenuOptions;
import uk.ac.man.cs.mdsd.webgen.interface_.Query;
import uk.ac.man.cs.mdsd.webgen.interface_.QueryParameter;
import uk.ac.man.cs.mdsd.webgen.interface_.RegistrationUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.RouteParameterReference;
import uk.ac.man.cs.mdsd.webgen.interface_.SearchUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.SelectAction;
import uk.ac.man.cs.mdsd.webgen.interface_.SelectableUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.SingletonUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.SliderUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.StaticMenu;
import uk.ac.man.cs.mdsd.webgen.interface_.StaticUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.interface_.UnitAttribute;
import uk.ac.man.cs.mdsd.webgen.interface_.UnitContainer;
import uk.ac.man.cs.mdsd.webgen.interface_.UnitFeature;
import uk.ac.man.cs.mdsd.webgen.interface_.UnitField;
import uk.ac.man.cs.mdsd.webgen.interface_.UnitSupportAction;
import uk.ac.man.cs.mdsd.webgen.interface_.UpdateUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfaceFactory;
import uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage;

import uk.ac.man.cs.mdsd.webgen.interface_.util.WebGenInterfaceValidator;
import uk.ac.man.cs.mdsd.webgen.persistence.WebGenPersistencePackage;
import uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebGenInterfacePackageImpl extends EPackageImpl implements WebGenInterfacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

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
	private EClass pageLinkEClass = null;

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
	private EClass menuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticMenuEClass = null;

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
	private EClass dynamicMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterParameterEClass = null;

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
	private EClass staticUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createSitemapUnitEClass = null;

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
	private EClass unitSupportActionEClass = null;

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
	private EClass updateUnitEClass = null;

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
	private EClass modelReferenceEClass = null;

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
	private EEnum pageTopMenuOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionDisplayOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indexDisplayOptionEEnum = null;

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
	 * @see uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebGenInterfacePackageImpl() {
		super(eNS_URI, WebGenInterfaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WebGenInterfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebGenInterfacePackage init() {
		if (isInited) return (WebGenInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(WebGenInterfacePackage.eNS_URI);

		// Obtain or create and register package
		WebGenInterfacePackageImpl theWebGenInterfacePackage = (WebGenInterfacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebGenInterfacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebGenInterfacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		WebGenImagePackage.eINSTANCE.eClass();
		WebGenServicePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebGenInterfacePackage.createPackageContents();

		// Initialize created meta-data
		theWebGenInterfacePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWebGenInterfacePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WebGenInterfaceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWebGenInterfacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebGenInterfacePackage.eNS_URI, theWebGenInterfacePackage);
		return theWebGenInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Pages() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Menus() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_InputTechnology() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_AjaxTechnology() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_DefaultDateFormat() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_DefaultTimeFormat() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_DefaultDateTimeFormat() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_DefaultMaximumUploadSize() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_ResponsiveTopMenu() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_TopNavigationId() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_SideMenu() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_SiteTemplate() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_StaticUnitsEditable() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_TextEditorURL() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(13);
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
	public EReference getPage_ParentPage() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_ChildPages() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Authenticated() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_UriElement() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_TopMenuOption() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_TopMenuRank() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_NavigationLabel() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_SideMenu() {
		return (EReference)pageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_StyleClass() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageLink() {
		return pageLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageLink_TargetPage() {
		return (EReference)pageLinkEClass.getEStructuralFeatures().get(0);
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
	public EClass getStaticMenu() {
		return staticMenuEClass;
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
	public EReference getActionMenuEntry_Destination() {
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
	public EClass getDynamicMenu() {
		return dynamicMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicMenu_Selection() {
		return (EReference)dynamicMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicMenu_Title() {
		return (EReference)dynamicMenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuFeature() {
		return menuFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_Parameters() {
		return (EReference)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_Selection() {
		return (EReference)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterParameter() {
		return filterParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterParameter_PartOf() {
		return (EReference)filterParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterParameter_Formal() {
		return (EReference)filterParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterParameter_DefaultValue() {
		return (EAttribute)filterParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterParameter_Placeholder() {
		return (EAttribute)filterParameterEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getContentUnit_CreateDefaultUriElement() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_RequiresRole() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_PurposeSummary() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_UriElement() {
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
	public EClass getStaticUnit() {
		return staticUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticUnit_Content() {
		return (EAttribute)staticUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticUnit_StyleClass() {
		return (EAttribute)staticUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticUnit_ContentClass() {
		return (EAttribute)staticUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateSitemapUnit() {
		return createSitemapUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSitemapUnit_DeployedURL() {
		return (EAttribute)createSitemapUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSitemapUnit_Filename() {
		return (EAttribute)createSitemapUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSitemapUnit_StyleClass() {
		return (EAttribute)createSitemapUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSitemapUnit_ContentClass() {
		return (EAttribute)createSitemapUnitEClass.getEStructuralFeatures().get(3);
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
	public EReference getDynamicUnit_Entities() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicUnit_DisplayFields() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicUnit_SupportActions() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_Header() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_Footer() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_HeaderClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_ControlClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_FooterClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_ErrorClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getUnitField_Title() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_CollectionDisplayOption() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_CollectionAllowAdd() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_CollectionAllowRemove() {
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
	public EClass getUnitFeature() {
		return unitFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_OnlyDisplayWhenNotEmpty() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_DisplayLabel() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_Required() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitFeature_ForcedValue() {
		return (EReference)unitFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_NullDisplayValue() {
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
	public EAttribute getUnitFeature_Autofocus() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_HeaderClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_InputClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_DisplayClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_FooterClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(10);
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
	public EAttribute getUnitAssociation_IsSourceAssociation() {
		return (EAttribute)unitAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitAssociation_SourceEntity() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitAssociation_TargetEntity() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitAssociation_Selection() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getInterfaceField_DefaultValue() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getInterfaceField_InputClass() {
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
	public EAttribute getDataTypeField_ObfuscateFormFields() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_Encrypt() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_InterfaceType() {
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
	public EClass getSelectableUnit() {
		return selectableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectableUnit_SelectionType() {
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
	public EReference getCollectionUnit_ContainingFeature() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_Selection() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_Filters() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_EmptyMessage() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_Pagination() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_DefaultPaginationSize() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_NextNpages() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PreviousNpages() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_NextPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PreviousPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_UseDisabledPageLinks() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_UseFirstLastPageLinks() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_FirstPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_LastPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(14);
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
	public EReference getEditUnit_DefaultSelection() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_Title() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_EnableWhen() {
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
	public EAttribute getEditUnit_ContentClass() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_CustomiseValues() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getCreateUnit_StyleClass() {
		return (EAttribute)createUnitEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getCreateUpdateUnit_StyleClass() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getUpdateUnit_StyleClass() {
		return (EAttribute)updateUnitEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getMapUnit_StyleClass() {
		return (EAttribute)mapUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapUnit_Location() {
		return (EReference)mapUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapUnit_PlaceName() {
		return (EReference)mapUnitEClass.getEStructuralFeatures().get(4);
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
	public EReference getDataUnit_DefaultSelection() {
		return (EReference)dataUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnit_Title() {
		return (EReference)dataUnitEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDetailsUnit_OnlyDisplayWhenNotEmpty() {
		return (EAttribute)detailsUnitEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDetailsUnit_StyleClass() {
		return (EAttribute)detailsUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailsUnit_ContentClass() {
		return (EAttribute)detailsUnitEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getIndexUnit_DisplayOption() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_OmitColumnLabels() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_StyleClass() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_ContentClass() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_RowClasses() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getControlUnit_ContentClass() {
		return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getSearchUnit_StyleClass() {
		return (EAttribute)searchUnitEClass.getEStructuralFeatures().get(1);
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
	public EReference getImageUnit_DefaultSelection() {
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
	public EReference getImageUnit_TitleFeature() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageUnit_MissingImagePath() {
		return (EAttribute)imageUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageUnit_ImageFilter() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageUnit_ShowTime() {
		return (EAttribute)imageUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageUnit_TransitionTime() {
		return (EAttribute)imageUnitEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getFeaturePathAssociation_IsSourceAssociation() {
		return (EAttribute)featurePathAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturePathAssociation_SourceEntity() {
		return (EReference)featurePathAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturePathAssociation_TargetEntity() {
		return (EReference)featurePathAssociationEClass.getEStructuralFeatures().get(2);
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
	public EReference getChildPath_PartOf() {
		return (EReference)childPathEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getChildPathAssociation_IsSourceAssociation() {
		return (EAttribute)childPathAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPathAssociation_SourceEntity() {
		return (EReference)childPathAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPathAssociation_TargetEntity() {
		return (EReference)childPathAssociationEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getImageIndexUnit_StyleClass() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageIndexUnit_ContentClass() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getSliderUnit_StyleClass() {
		return (EAttribute)sliderUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSliderUnit_ContentClass() {
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
	public EAttribute getGalleryUnit_StyleClass() {
		return (EAttribute)galleryUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalleryUnit_ContentClass() {
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
	public EAttribute getRegistrationUnit_StyleClass() {
		return (EAttribute)registrationUnitEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getLoginUnit_LogoutUriElement() {
		return (EAttribute)loginUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginUnit_StyleClass() {
		return (EAttribute)loginUnitEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getForgottenPasswordUnit_StyleClass() {
		return (EAttribute)forgottenPasswordUnitEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getInlineAction_RequiresRole() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineAction_EnableWhen() {
		return (EReference)inlineActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineAction_DisplayWhen() {
		return (EReference)inlineActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Header() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Footer() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_HeaderClass() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_FooterClass() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getDeleteAction_UriElement() {
		return (EAttribute)deleteActionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getFeatureSupportAction_UriElement() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSupportAction_FileExtension() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(3);
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
	public EEnum getPageTopMenuOptions() {
		return pageTopMenuOptionsEEnum;
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
	public EEnum getIndexDisplayOption() {
		return indexDisplayOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenInterfaceFactory getWebGenInterfaceFactory() {
		return (WebGenInterfaceFactory)getEFactoryInstance();
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
		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__PAGES);
		createEReference(interfaceEClass, INTERFACE__MENUS);
		createEAttribute(interfaceEClass, INTERFACE__INPUT_TECHNOLOGY);
		createEAttribute(interfaceEClass, INTERFACE__AJAX_TECHNOLOGY);
		createEAttribute(interfaceEClass, INTERFACE__DEFAULT_DATE_FORMAT);
		createEAttribute(interfaceEClass, INTERFACE__DEFAULT_TIME_FORMAT);
		createEAttribute(interfaceEClass, INTERFACE__DEFAULT_DATE_TIME_FORMAT);
		createEAttribute(interfaceEClass, INTERFACE__DEFAULT_MAXIMUM_UPLOAD_SIZE);
		createEAttribute(interfaceEClass, INTERFACE__RESPONSIVE_TOP_MENU);
		createEAttribute(interfaceEClass, INTERFACE__TOP_NAVIGATION_ID);
		createEReference(interfaceEClass, INTERFACE__SIDE_MENU);
		createEAttribute(interfaceEClass, INTERFACE__SITE_TEMPLATE);
		createEAttribute(interfaceEClass, INTERFACE__STATIC_UNITS_EDITABLE);
		createEAttribute(interfaceEClass, INTERFACE__TEXT_EDITOR_URL);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__PARENT_PAGE);
		createEReference(pageEClass, PAGE__CHILD_PAGES);
		createEAttribute(pageEClass, PAGE__AUTHENTICATED);
		createEAttribute(pageEClass, PAGE__URI_ELEMENT);
		createEAttribute(pageEClass, PAGE__TOP_MENU_OPTION);
		createEAttribute(pageEClass, PAGE__TOP_MENU_RANK);
		createEAttribute(pageEClass, PAGE__NAVIGATION_LABEL);
		createEReference(pageEClass, PAGE__SIDE_MENU);
		createEAttribute(pageEClass, PAGE__STYLE_CLASS);

		pageLinkEClass = createEClass(PAGE_LINK);
		createEReference(pageLinkEClass, PAGE_LINK__TARGET_PAGE);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__ENTRIES);
		createEAttribute(menuEClass, MENU__OMIT_CAPTION);
		createEAttribute(menuEClass, MENU__CAPTION_CLASS);
		createEAttribute(menuEClass, MENU__STYLE_CLASS);
		createEAttribute(menuEClass, MENU__LAYOUT_CLASS);

		menuEntryEClass = createEClass(MENU_ENTRY);
		createEReference(menuEntryEClass, MENU_ENTRY__PART_OF);
		createEAttribute(menuEntryEClass, MENU_ENTRY__REQUIRES_ROLE);

		staticMenuEClass = createEClass(STATIC_MENU);

		actionMenuEntryEClass = createEClass(ACTION_MENU_ENTRY);
		createEReference(actionMenuEntryEClass, ACTION_MENU_ENTRY__DESTINATION);
		createEReference(actionMenuEntryEClass, ACTION_MENU_ENTRY__QUERY);

		editStaticTextMenuEntryEClass = createEClass(EDIT_STATIC_TEXT_MENU_ENTRY);

		dynamicMenuEClass = createEClass(DYNAMIC_MENU);
		createEReference(dynamicMenuEClass, DYNAMIC_MENU__SELECTION);
		createEReference(dynamicMenuEClass, DYNAMIC_MENU__TITLE);

		menuFeatureEClass = createEClass(MENU_FEATURE);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__PARAMETERS);
		createEReference(filterEClass, FILTER__SELECTION);

		filterParameterEClass = createEClass(FILTER_PARAMETER);
		createEReference(filterParameterEClass, FILTER_PARAMETER__PART_OF);
		createEReference(filterParameterEClass, FILTER_PARAMETER__FORMAL);
		createEAttribute(filterParameterEClass, FILTER_PARAMETER__DEFAULT_VALUE);
		createEAttribute(filterParameterEClass, FILTER_PARAMETER__PLACEHOLDER);

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
		createEAttribute(contentUnitEClass, CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__REQUIRES_ROLE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__PURPOSE_SUMMARY);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__URI_ELEMENT);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__ALTERNATIVE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__OMIT_CAPTION);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__CAPTION_CLASS);

		staticUnitEClass = createEClass(STATIC_UNIT);
		createEAttribute(staticUnitEClass, STATIC_UNIT__CONTENT);
		createEAttribute(staticUnitEClass, STATIC_UNIT__STYLE_CLASS);
		createEAttribute(staticUnitEClass, STATIC_UNIT__CONTENT_CLASS);

		createSitemapUnitEClass = createEClass(CREATE_SITEMAP_UNIT);
		createEAttribute(createSitemapUnitEClass, CREATE_SITEMAP_UNIT__DEPLOYED_URL);
		createEAttribute(createSitemapUnitEClass, CREATE_SITEMAP_UNIT__FILENAME);
		createEAttribute(createSitemapUnitEClass, CREATE_SITEMAP_UNIT__STYLE_CLASS);
		createEAttribute(createSitemapUnitEClass, CREATE_SITEMAP_UNIT__CONTENT_CLASS);

		dynamicUnitEClass = createEClass(DYNAMIC_UNIT);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__ENTITIES);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__DISPLAY_FIELDS);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__SUPPORT_ACTIONS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__HEADER);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__FOOTER);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__HEADER_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__CONTROL_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__FOOTER_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__ERROR_CLASS);

		unitFieldEClass = createEClass(UNIT_FIELD);
		createEReference(unitFieldEClass, UNIT_FIELD__DISPLAYED_ON);
		createEAttribute(unitFieldEClass, UNIT_FIELD__TITLE);
		createEAttribute(unitFieldEClass, UNIT_FIELD__COLLECTION_DISPLAY_OPTION);
		createEAttribute(unitFieldEClass, UNIT_FIELD__COLLECTION_ALLOW_ADD);
		createEAttribute(unitFieldEClass, UNIT_FIELD__COLLECTION_ALLOW_REMOVE);
		createEAttribute(unitFieldEClass, UNIT_FIELD__MAXIMUM_DISPLAY_SIZE);
		createEAttribute(unitFieldEClass, UNIT_FIELD__DATE_FORMAT);

		unitFeatureEClass = createEClass(UNIT_FEATURE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__DISPLAY_LABEL);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__REQUIRED);
		createEReference(unitFeatureEClass, UNIT_FEATURE__FORCED_VALUE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__NULL_DISPLAY_VALUE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FOOTER);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__AUTOFOCUS);
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
		createEAttribute(unitAssociationEClass, UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__SOURCE_ENTITY);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__TARGET_ENTITY);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__SELECTION);

		associationReferenceEClass = createEClass(ASSOCIATION_REFERENCE);
		createEAttribute(associationReferenceEClass, ASSOCIATION_REFERENCE__NAME);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__ASSOCIATION);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__VALUE_DISPLAY);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__CHILD_FEATURE);

		interfaceFieldEClass = createEClass(INTERFACE_FIELD);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__REQUIRED);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__DEFAULT_VALUE);
		createEReference(interfaceFieldEClass, INTERFACE_FIELD__MUST_MATCH);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__INPUT_CLASS);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__PLACEHOLDER);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__VALIDATION_PATTERN);

		dataTypeFieldEClass = createEClass(DATA_TYPE_FIELD);
		createEReference(dataTypeFieldEClass, DATA_TYPE_FIELD__DATA_TYPE);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__ENCRYPT);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__INTERFACE_TYPE);

		dateFieldEClass = createEClass(DATE_FIELD);
		createEAttribute(dateFieldEClass, DATE_FIELD__DETAILS);
		createEAttribute(dateFieldEClass, DATE_FIELD__FORMAT);

		captchaFieldEClass = createEClass(CAPTCHA_FIELD);

		unitSupportActionEClass = createEClass(UNIT_SUPPORT_ACTION);
		createEAttribute(unitSupportActionEClass, UNIT_SUPPORT_ACTION__DISABLE);
		createEAttribute(unitSupportActionEClass, UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE);

		selectableUnitEClass = createEClass(SELECTABLE_UNIT);
		createEReference(selectableUnitEClass, SELECTABLE_UNIT__SELECTION_TYPE);

		singletonUnitEClass = createEClass(SINGLETON_UNIT);
		createEReference(singletonUnitEClass, SINGLETON_UNIT__CONTENT_TYPE);

		collectionUnitEClass = createEClass(COLLECTION_UNIT);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__CONTENT_TYPE);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__CONTAINING_FEATURE);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__SELECTION);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__FILTERS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__EMPTY_MESSAGE);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__PAGINATION);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__NEXT_NPAGES);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PREVIOUS_NPAGES);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__NEXT_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PREVIOUS_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__FIRST_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__LAST_PAGE_LABEL);

		editUnitEClass = createEClass(EDIT_UNIT);
		createEReference(editUnitEClass, EDIT_UNIT__DEFAULT_SELECTION);
		createEReference(editUnitEClass, EDIT_UNIT__TITLE);
		createEReference(editUnitEClass, EDIT_UNIT__ENABLE_WHEN);
		createEReference(editUnitEClass, EDIT_UNIT__CONFIRM_DESTINATION);
		createEAttribute(editUnitEClass, EDIT_UNIT__CONFIRM_LABEL);
		createEReference(editUnitEClass, EDIT_UNIT__CANCEL_DESTINATION);
		createEAttribute(editUnitEClass, EDIT_UNIT__CANCEL_LABEL);
		createEAttribute(editUnitEClass, EDIT_UNIT__CONTENT_CLASS);
		createEAttribute(editUnitEClass, EDIT_UNIT__CUSTOMISE_VALUES);

		createUnitEClass = createEClass(CREATE_UNIT);
		createEAttribute(createUnitEClass, CREATE_UNIT__STYLE_CLASS);

		createUpdateUnitEClass = createEClass(CREATE_UPDATE_UNIT);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__CLEAR_LABEL);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__STYLE_CLASS);

		updateUnitEClass = createEClass(UPDATE_UNIT);
		createEAttribute(updateUnitEClass, UPDATE_UNIT__STYLE_CLASS);

		mapUnitEClass = createEClass(MAP_UNIT);
		createEAttribute(mapUnitEClass, MAP_UNIT__READ_ONLY);
		createEAttribute(mapUnitEClass, MAP_UNIT__DEFAULT_ZOOM_LEVEL);
		createEAttribute(mapUnitEClass, MAP_UNIT__STYLE_CLASS);
		createEReference(mapUnitEClass, MAP_UNIT__LOCATION);
		createEReference(mapUnitEClass, MAP_UNIT__PLACE_NAME);

		dataUnitEClass = createEClass(DATA_UNIT);
		createEReference(dataUnitEClass, DATA_UNIT__DEFAULT_SELECTION);
		createEReference(dataUnitEClass, DATA_UNIT__TITLE);

		detailsUnitEClass = createEClass(DETAILS_UNIT);
		createEAttribute(detailsUnitEClass, DETAILS_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY);
		createEAttribute(detailsUnitEClass, DETAILS_UNIT__OMIT_FIELD_LABELS);
		createEAttribute(detailsUnitEClass, DETAILS_UNIT__STYLE_CLASS);
		createEAttribute(detailsUnitEClass, DETAILS_UNIT__CONTENT_CLASS);

		indexUnitEClass = createEClass(INDEX_UNIT);
		createEAttribute(indexUnitEClass, INDEX_UNIT__DISPLAY_OPTION);
		createEAttribute(indexUnitEClass, INDEX_UNIT__OMIT_COLUMN_LABELS);
		createEAttribute(indexUnitEClass, INDEX_UNIT__STYLE_CLASS);
		createEAttribute(indexUnitEClass, INDEX_UNIT__CONTENT_CLASS);
		createEAttribute(indexUnitEClass, INDEX_UNIT__ROW_CLASSES);

		controlUnitEClass = createEClass(CONTROL_UNIT);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__SUBMIT_LABEL);
		createEReference(controlUnitEClass, CONTROL_UNIT__CANCEL_DESTINATION);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__CANCEL_LABEL);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__CONTENT_CLASS);

		searchUnitEClass = createEClass(SEARCH_UNIT);
		createEReference(searchUnitEClass, SEARCH_UNIT__RESULTS_DESTINATION);
		createEAttribute(searchUnitEClass, SEARCH_UNIT__STYLE_CLASS);

		imageUnitEClass = createEClass(IMAGE_UNIT);
		createEReference(imageUnitEClass, IMAGE_UNIT__DEFAULT_SELECTION);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_PATH_FEATURE);
		createEReference(imageUnitEClass, IMAGE_UNIT__TITLE_FEATURE);
		createEAttribute(imageUnitEClass, IMAGE_UNIT__MISSING_IMAGE_PATH);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_FILTER);
		createEAttribute(imageUnitEClass, IMAGE_UNIT__SHOW_TIME);
		createEAttribute(imageUnitEClass, IMAGE_UNIT__TRANSITION_TIME);

		featurePathEClass = createEClass(FEATURE_PATH);

		featurePathAttributeEClass = createEClass(FEATURE_PATH_ATTRIBUTE);
		createEAttribute(featurePathAttributeEClass, FEATURE_PATH_ATTRIBUTE__NAME);
		createEReference(featurePathAttributeEClass, FEATURE_PATH_ATTRIBUTE__ATTRIBUTE);

		featurePathAssociationEClass = createEClass(FEATURE_PATH_ASSOCIATION);
		createEAttribute(featurePathAssociationEClass, FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION);
		createEReference(featurePathAssociationEClass, FEATURE_PATH_ASSOCIATION__SOURCE_ENTITY);
		createEReference(featurePathAssociationEClass, FEATURE_PATH_ASSOCIATION__TARGET_ENTITY);

		childPathEClass = createEClass(CHILD_PATH);
		createEReference(childPathEClass, CHILD_PATH__PART_OF);

		childPathAttributeEClass = createEClass(CHILD_PATH_ATTRIBUTE);
		createEAttribute(childPathAttributeEClass, CHILD_PATH_ATTRIBUTE__NAME);
		createEReference(childPathAttributeEClass, CHILD_PATH_ATTRIBUTE__ATTRIBUTE);

		childPathAssociationEClass = createEClass(CHILD_PATH_ASSOCIATION);
		createEAttribute(childPathAssociationEClass, CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION);
		createEReference(childPathAssociationEClass, CHILD_PATH_ASSOCIATION__SOURCE_ENTITY);
		createEReference(childPathAssociationEClass, CHILD_PATH_ASSOCIATION__TARGET_ENTITY);

		imageIndexUnitEClass = createEClass(IMAGE_INDEX_UNIT);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__STYLE_CLASS);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__CONTENT_CLASS);

		sliderUnitEClass = createEClass(SLIDER_UNIT);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__STYLE_CLASS);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__CONTENT_CLASS);

		galleryUnitEClass = createEClass(GALLERY_UNIT);
		createEReference(galleryUnitEClass, GALLERY_UNIT__FULL_SIZE_FILTER);
		createEAttribute(galleryUnitEClass, GALLERY_UNIT__STYLE_CLASS);
		createEAttribute(galleryUnitEClass, GALLERY_UNIT__CONTENT_CLASS);

		authenticationUnitEClass = createEClass(AUTHENTICATION_UNIT);

		registrationUnitEClass = createEClass(REGISTRATION_UNIT);
		createEAttribute(registrationUnitEClass, REGISTRATION_UNIT__STYLE_CLASS);

		loginUnitEClass = createEClass(LOGIN_UNIT);
		createEAttribute(loginUnitEClass, LOGIN_UNIT__LOGOUT_URI_ELEMENT);
		createEAttribute(loginUnitEClass, LOGIN_UNIT__STYLE_CLASS);

		forgottenPasswordUnitEClass = createEClass(FORGOTTEN_PASSWORD_UNIT);
		createEAttribute(forgottenPasswordUnitEClass, FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS);

		inlineActionContainerEClass = createEClass(INLINE_ACTION_CONTAINER);
		createEReference(inlineActionContainerEClass, INLINE_ACTION_CONTAINER__ACTIONS);

		inlineActionEClass = createEClass(INLINE_ACTION);
		createEReference(inlineActionEClass, INLINE_ACTION__USED_BY);
		createEAttribute(inlineActionEClass, INLINE_ACTION__DISABLE);
		createEAttribute(inlineActionEClass, INLINE_ACTION__REQUIRES_ROLE);
		createEReference(inlineActionEClass, INLINE_ACTION__ENABLE_WHEN);
		createEReference(inlineActionEClass, INLINE_ACTION__DISPLAY_WHEN);
		createEAttribute(inlineActionEClass, INLINE_ACTION__HEADER);
		createEAttribute(inlineActionEClass, INLINE_ACTION__FOOTER);
		createEAttribute(inlineActionEClass, INLINE_ACTION__HEADER_CLASS);
		createEAttribute(inlineActionEClass, INLINE_ACTION__FOOTER_CLASS);

		selectActionEClass = createEClass(SELECT_ACTION);
		createEReference(selectActionEClass, SELECT_ACTION__TARGET);

		deleteActionEClass = createEClass(DELETE_ACTION);
		createEReference(deleteActionEClass, DELETE_ACTION__DESTINATION);
		createEAttribute(deleteActionEClass, DELETE_ACTION__CONFIRM_MESSAGE);
		createEAttribute(deleteActionEClass, DELETE_ACTION__URI_ELEMENT);

		featureSupportActionEClass = createEClass(FEATURE_SUPPORT_ACTION);
		createEReference(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__OPERATION);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__URI_ELEMENT);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__FILE_EXTENSION);

		modelReferenceEClass = createEClass(MODEL_REFERENCE);
		createEReference(modelReferenceEClass, MODEL_REFERENCE__UNIT);

		routeParameterReferenceEClass = createEClass(ROUTE_PARAMETER_REFERENCE);
		createEAttribute(routeParameterReferenceEClass, ROUTE_PARAMETER_REFERENCE__NAME);
		createEReference(routeParameterReferenceEClass, ROUTE_PARAMETER_REFERENCE__PARAMETER);

		// Create enums
		inputTechnologiesEEnum = createEEnum(INPUT_TECHNOLOGIES);
		ajaxTechnologiesEEnum = createEEnum(AJAX_TECHNOLOGIES);
		pageTopMenuOptionsEEnum = createEEnum(PAGE_TOP_MENU_OPTIONS);
		collectionDisplayOptionsEEnum = createEEnum(COLLECTION_DISPLAY_OPTIONS);
		indexDisplayOptionEEnum = createEEnum(INDEX_DISPLAY_OPTION);
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
		WebGenCorePackage theWebGenCorePackage = (WebGenCorePackage)EPackage.Registry.INSTANCE.getEPackage(WebGenCorePackage.eNS_URI);
		WebGenServicePackage theWebGenServicePackage = (WebGenServicePackage)EPackage.Registry.INSTANCE.getEPackage(WebGenServicePackage.eNS_URI);
		WebGenPersistencePackage theWebGenPersistencePackage = (WebGenPersistencePackage)EPackage.Registry.INSTANCE.getEPackage(WebGenPersistencePackage.eNS_URI);
		WebGenExpressionPackage theWebGenExpressionPackage = (WebGenExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(WebGenExpressionPackage.eNS_URI);
		WebGenImagePackage theWebGenImagePackage = (WebGenImagePackage)EPackage.Registry.INSTANCE.getEPackage(WebGenImagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pageEClass.getESuperTypes().add(theWebGenCorePackage.getNamedDisplayElement());
		pageEClass.getESuperTypes().add(this.getUnitContainer());
		menuEClass.getESuperTypes().add(theWebGenCorePackage.getNamedDisplayElement());
		staticMenuEClass.getESuperTypes().add(this.getMenu());
		actionMenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		actionMenuEntryEClass.getESuperTypes().add(theWebGenCorePackage.getNamedDisplayElement());
		editStaticTextMenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		editStaticTextMenuEntryEClass.getESuperTypes().add(theWebGenCorePackage.getNamedDisplayElement());
		dynamicMenuEClass.getESuperTypes().add(this.getMenu());
		menuFeatureEClass.getESuperTypes().add(this.getMenuEntry());
		filterEClass.getESuperTypes().add(theWebGenCorePackage.getNamedDisplayElement());
		filterParameterEClass.getESuperTypes().add(theWebGenCorePackage.getNamedElement());
		contentUnitEClass.getESuperTypes().add(theWebGenCorePackage.getNamedDisplayElement());
		staticUnitEClass.getESuperTypes().add(this.getContentUnit());
		createSitemapUnitEClass.getESuperTypes().add(this.getContentUnit());
		dynamicUnitEClass.getESuperTypes().add(this.getContentUnit());
		unitFeatureEClass.getESuperTypes().add(this.getUnitField());
		unitFeatureEClass.getESuperTypes().add(this.getInlineActionContainer());
		unitAttributeEClass.getESuperTypes().add(this.getUnitFeature());
		unitAssociationEClass.getESuperTypes().add(this.getUnitFeature());
		unitAssociationEClass.getESuperTypes().add(this.getUnitContainer());
		unitAssociationEClass.getESuperTypes().add(this.getAssociationReference());
		interfaceFieldEClass.getESuperTypes().add(theWebGenCorePackage.getNamedDisplayElement());
		interfaceFieldEClass.getESuperTypes().add(this.getUnitField());
		dataTypeFieldEClass.getESuperTypes().add(this.getInterfaceField());
		dateFieldEClass.getESuperTypes().add(this.getInterfaceField());
		captchaFieldEClass.getESuperTypes().add(this.getInterfaceField());
		unitSupportActionEClass.getESuperTypes().add(theWebGenCorePackage.getNamedDisplayElement());
		collectionUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		editUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		editUnitEClass.getESuperTypes().add(this.getSingletonUnit());
		createUnitEClass.getESuperTypes().add(this.getEditUnit());
		createUpdateUnitEClass.getESuperTypes().add(this.getEditUnit());
		createUpdateUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		updateUnitEClass.getESuperTypes().add(this.getEditUnit());
		updateUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		mapUnitEClass.getESuperTypes().add(this.getEditUnit());
		mapUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		dataUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		detailsUnitEClass.getESuperTypes().add(this.getDataUnit());
		detailsUnitEClass.getESuperTypes().add(this.getSingletonUnit());
		detailsUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		indexUnitEClass.getESuperTypes().add(this.getDataUnit());
		indexUnitEClass.getESuperTypes().add(this.getCollectionUnit());
		indexUnitEClass.getESuperTypes().add(this.getInlineActionContainer());
		controlUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		searchUnitEClass.getESuperTypes().add(this.getControlUnit());
		imageUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		imageUnitEClass.getESuperTypes().add(this.getCollectionUnit());
		featurePathAttributeEClass.getESuperTypes().add(this.getFeaturePath());
		featurePathAssociationEClass.getESuperTypes().add(this.getFeaturePath());
		featurePathAssociationEClass.getESuperTypes().add(this.getAssociationReference());
		childPathAttributeEClass.getESuperTypes().add(this.getChildPath());
		childPathAssociationEClass.getESuperTypes().add(this.getChildPath());
		childPathAssociationEClass.getESuperTypes().add(this.getAssociationReference());
		imageIndexUnitEClass.getESuperTypes().add(this.getImageUnit());
		imageIndexUnitEClass.getESuperTypes().add(this.getInlineActionContainer());
		sliderUnitEClass.getESuperTypes().add(this.getImageUnit());
		galleryUnitEClass.getESuperTypes().add(this.getImageUnit());
		registrationUnitEClass.getESuperTypes().add(this.getAuthenticationUnit());
		registrationUnitEClass.getESuperTypes().add(this.getControlUnit());
		loginUnitEClass.getESuperTypes().add(this.getAuthenticationUnit());
		loginUnitEClass.getESuperTypes().add(this.getControlUnit());
		forgottenPasswordUnitEClass.getESuperTypes().add(this.getAuthenticationUnit());
		forgottenPasswordUnitEClass.getESuperTypes().add(this.getControlUnit());
		inlineActionEClass.getESuperTypes().add(theWebGenCorePackage.getNamedDisplayElement());
		selectActionEClass.getESuperTypes().add(this.getInlineAction());
		deleteActionEClass.getESuperTypes().add(this.getInlineAction());
		featureSupportActionEClass.getESuperTypes().add(this.getInlineAction());
		modelReferenceEClass.getESuperTypes().add(theWebGenExpressionPackage.getPath());
		routeParameterReferenceEClass.getESuperTypes().add(theWebGenExpressionPackage.getPath());

		// Initialize classes, features, and operations; add parameters
		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Pages(), this.getPage(), null, "pages", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Menus(), this.getMenu(), null, "menus", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_InputTechnology(), this.getInputTechnologies(), "inputTechnology", "Html", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_AjaxTechnology(), this.getAjaxTechnologies(), "ajaxTechnology", "None", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_DefaultDateFormat(), ecorePackage.getEString(), "defaultDateFormat", "jS F Y", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterface_DefaultTimeFormat(), ecorePackage.getEString(), "defaultTimeFormat", "G.i", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterface_DefaultDateTimeFormat(), ecorePackage.getEString(), "defaultDateTimeFormat", "jS F Y G.i", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterface_DefaultMaximumUploadSize(), ecorePackage.getEInt(), "defaultMaximumUploadSize", "2000000", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterface_ResponsiveTopMenu(), ecorePackage.getEBoolean(), "responsiveTopMenu", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_TopNavigationId(), ecorePackage.getEString(), "topNavigationId", "topnav", 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_SideMenu(), this.getMenu(), null, "sideMenu", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterface_SiteTemplate(), ecorePackage.getEString(), "siteTemplate", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_StaticUnitsEditable(), ecorePackage.getEBoolean(), "staticUnitsEditable", "false", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterface_TextEditorURL(), ecorePackage.getEString(), "textEditorURL", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_ParentPage(), this.getPageLink(), null, "parentPage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_ChildPages(), this.getPageLink(), this.getPageLink_TargetPage(), "childPages", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Authenticated(), ecorePackage.getEBoolean(), "authenticated", "true", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPage_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_TopMenuOption(), this.getPageTopMenuOptions(), "topMenuOption", "NeverInclude", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPage_TopMenuRank(), ecorePackage.getEInt(), "topMenuRank", "0", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPage_NavigationLabel(), ecorePackage.getEString(), "navigationLabel", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_SideMenu(), this.getMenu(), null, "sideMenu", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPage_StyleClass(), ecorePackage.getEString(), "styleClass", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pageLinkEClass, PageLink.class, "PageLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageLink_TargetPage(), this.getPage(), this.getPage_ChildPages(), "targetPage", null, 1, 1, PageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_Entries(), this.getMenuEntry(), this.getMenuEntry_PartOf(), "entries", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_OmitCaption(), ecorePackage.getEBoolean(), "omitCaption", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_CaptionClass(), ecorePackage.getEString(), "captionClass", "menu_caption", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_StyleClass(), ecorePackage.getEString(), "styleClass", "menu", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMenu_LayoutClass(), ecorePackage.getEString(), "layoutClass", "menu_content", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(menuEntryEClass, MenuEntry.class, "MenuEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuEntry_PartOf(), this.getMenu(), this.getMenu_Entries(), "partOf", null, 1, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMenuEntry_RequiresRole(), ecorePackage.getEString(), "requiresRole", null, 0, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticMenuEClass, StaticMenu.class, "StaticMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionMenuEntryEClass, ActionMenuEntry.class, "ActionMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionMenuEntry_Destination(), this.getContentUnit(), null, "destination", null, 1, 1, ActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActionMenuEntry_Query(), this.getQuery(), null, "query", null, 0, 1, ActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editStaticTextMenuEntryEClass, EditStaticTextMenuEntry.class, "EditStaticTextMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicMenuEClass, DynamicMenu.class, "DynamicMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicMenu_Selection(), theWebGenServicePackage.getSelection(), null, "selection", null, 1, 1, DynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicMenu_Title(), theWebGenPersistencePackage.getFeature(), null, "title", null, 0, 1, DynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(menuFeatureEClass, MenuFeature.class, "MenuFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilter_Parameters(), this.getFilterParameter(), this.getFilterParameter_PartOf(), "parameters", null, 0, -1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilter_Selection(), theWebGenServicePackage.getSelection(), null, "selection", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterParameterEClass, FilterParameter.class, "FilterParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterParameter_PartOf(), this.getFilter(), this.getFilter_Parameters(), "partOf", null, 0, 1, FilterParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterParameter_Formal(), theWebGenCorePackage.getFormalParameter(), null, "formal", null, 0, 1, FilterParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", "", 0, 1, FilterParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterParameter_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, FilterParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_Filter(), this.getFilter(), null, "filter", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Parameters(), this.getQueryParameter(), null, "parameters", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParameterEClass, QueryParameter.class, "QueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryParameter_Formal(), this.getFilterParameter(), null, "formal", null, 1, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitContainerEClass, UnitContainer.class, "UnitContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitContainer_Units(), this.getContentUnit(), this.getContentUnit_DisplayedOn(), "units", null, 0, -1, UnitContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentUnitEClass, ContentUnit.class, "ContentUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentUnit_DisplayedOn(), this.getUnitContainer(), this.getUnitContainer_Units(), "displayedOn", null, 1, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContentUnit_CreateDefaultUriElement(), ecorePackage.getEBoolean(), "createDefaultUriElement", "true", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_RequiresRole(), ecorePackage.getEString(), "requiresRole", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_PurposeSummary(), ecorePackage.getEString(), "purposeSummary", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Alternative(), ecorePackage.getEString(), "alternative", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_OmitCaption(), ecorePackage.getEBoolean(), "omitCaption", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_CaptionClass(), ecorePackage.getEString(), "captionClass", "unit_caption", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticUnitEClass, StaticUnit.class, "StaticUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticUnit_Content(), ecorePackage.getEString(), "content", null, 0, 1, StaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaticUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,static_unit,framed", 0, 1, StaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaticUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "static_content", 0, 1, StaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(createSitemapUnitEClass, CreateSitemapUnit.class, "CreateSitemapUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateSitemapUnit_DeployedURL(), ecorePackage.getEString(), "deployedURL", null, 1, 1, CreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreateSitemapUnit_Filename(), ecorePackage.getEString(), "filename", "sitemap.xml", 1, 1, CreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreateSitemapUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,create_sitemap_unit,framed", 0, 1, CreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreateSitemapUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "create_sitemap_content", 0, 1, CreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dynamicUnitEClass, DynamicUnit.class, "DynamicUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicUnit_Entities(), theWebGenPersistencePackage.getEntityOrView(), null, "entities", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_DisplayFields(), this.getUnitField(), this.getUnitField_DisplayedOn(), "displayFields", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_SupportActions(), this.getUnitSupportAction(), null, "supportActions", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_Header(), ecorePackage.getEString(), "header", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_HeaderClass(), ecorePackage.getEString(), "headerClass", "unit_header", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_ControlClass(), ecorePackage.getEString(), "controlClass", "unit_control", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_FooterClass(), ecorePackage.getEString(), "footerClass", "unit_footer", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_ErrorClass(), ecorePackage.getEString(), "errorClass", "error", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitFieldEClass, UnitField.class, "UnitField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitField_DisplayedOn(), this.getDynamicUnit(), this.getDynamicUnit_DisplayFields(), "displayedOn", null, 1, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_Title(), ecorePackage.getEString(), "title", null, 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_CollectionDisplayOption(), this.getCollectionDisplayOptions(), "collectionDisplayOption", "LineDirection", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_CollectionAllowAdd(), ecorePackage.getEBoolean(), "collectionAllowAdd", "false", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_CollectionAllowRemove(), ecorePackage.getEBoolean(), "collectionAllowRemove", "false", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_MaximumDisplaySize(), ecorePackage.getEInt(), "maximumDisplaySize", "-1", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_DateFormat(), ecorePackage.getEString(), "dateFormat", null, 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitFeatureEClass, UnitFeature.class, "UnitFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitFeature_OnlyDisplayWhenNotEmpty(), ecorePackage.getEBoolean(), "onlyDisplayWhenNotEmpty", "false", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_DisplayLabel(), ecorePackage.getEString(), "displayLabel", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitFeature_ForcedValue(), theWebGenExpressionPackage.getExpression(), null, "forcedValue", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_NullDisplayValue(), ecorePackage.getEString(), "nullDisplayValue", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_Autofocus(), ecorePackage.getEBoolean(), "autofocus", "false", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_HeaderClass(), ecorePackage.getEString(), "headerClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_InputClass(), ecorePackage.getEString(), "inputClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_DisplayClass(), ecorePackage.getEString(), "displayClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_FooterClass(), ecorePackage.getEString(), "footerClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitAttributeEClass, UnitAttribute.class, "UnitAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitAttribute_Attribute(), theWebGenPersistencePackage.getAttribute(), null, "attribute", null, 1, 1, UnitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnitAttribute.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitAttribute_DefaultValue(), theWebGenExpressionPackage.getExpression(), null, "defaultValue", null, 0, 1, UnitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitAttribute_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", "false", 0, 1, UnitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitAttribute_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, UnitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitAttribute_ValidationPattern(), ecorePackage.getEString(), "validationPattern", null, 0, 1, UnitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitAssociationEClass, UnitAssociation.class, "UnitAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, UnitAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_SourceEntity(), theWebGenPersistencePackage.getEntityOrView(), null, "sourceEntity", null, 0, 1, UnitAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_TargetEntity(), theWebGenPersistencePackage.getEntityOrView(), null, "targetEntity", null, 0, 1, UnitAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_Selection(), theWebGenServicePackage.getSelection(), null, "selection", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationReferenceEClass, AssociationReference.class, "AssociationReference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationReference_Association(), theWebGenPersistencePackage.getAssociation(), null, "association", null, 1, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationReference_ValueDisplay(), theWebGenPersistencePackage.getLabel(), null, "valueDisplay", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationReference_ChildFeature(), this.getChildPath(), this.getChildPath_PartOf(), "childFeature", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceFieldEClass, InterfaceField.class, "InterfaceField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceField_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterfaceField_MustMatch(), this.getUnitField(), null, "mustMatch", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_InputClass(), ecorePackage.getEString(), "inputClass", "input_attribute", 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_ValidationPattern(), ecorePackage.getEString(), "validationPattern", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataTypeFieldEClass, DataTypeField.class, "DataTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeField_DataType(), theWebGenCorePackage.getDataType(), null, "dataType", null, 1, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", "false", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_Encrypt(), ecorePackage.getEBoolean(), "encrypt", "false", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_InterfaceType(), ecorePackage.getEString(), "interfaceType", null, 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateFieldEClass, DateField.class, "DateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateField_Details(), theWebGenPersistencePackage.getDateDetails(), "details", "DateOnly", 1, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateField_Format(), ecorePackage.getEString(), "format", null, 0, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(captchaFieldEClass, CaptchaField.class, "CaptchaField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitSupportActionEClass, UnitSupportAction.class, "UnitSupportAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitSupportAction_Disable(), ecorePackage.getEBoolean(), "disable", null, 0, 1, UnitSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitSupportAction_ConfirmMessage(), ecorePackage.getEString(), "confirmMessage", null, 0, 1, UnitSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(selectableUnitEClass, SelectableUnit.class, "SelectableUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectableUnit_SelectionType(), theWebGenPersistencePackage.getEntityOrView(), null, "selectionType", null, 0, 1, SelectableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonUnitEClass, SingletonUnit.class, "SingletonUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingletonUnit_ContentType(), theWebGenPersistencePackage.getEntityOrView(), null, "contentType", null, 1, 1, SingletonUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionUnitEClass, CollectionUnit.class, "CollectionUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionUnit_ContentType(), theWebGenPersistencePackage.getEntityOrView(), null, "contentType", null, 1, -1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_ContainingFeature(), theWebGenPersistencePackage.getAssociation(), null, "containingFeature", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Selection(), theWebGenServicePackage.getSelection(), null, "selection", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Filters(), this.getFilter(), null, "filters", null, 0, -1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_EmptyMessage(), ecorePackage.getEString(), "emptyMessage", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Pagination(), this.getFilter(), null, "pagination", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_DefaultPaginationSize(), ecorePackage.getEInt(), "defaultPaginationSize", "10", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_NextNpages(), ecorePackage.getEInt(), "nextNpages", "2", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousNpages(), ecorePackage.getEInt(), "previousNpages", "2", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_NextPageLabel(), ecorePackage.getEString(), "nextPageLabel", "&gt;", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousPageLabel(), ecorePackage.getEString(), "previousPageLabel", "&lt;", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_UseDisabledPageLinks(), ecorePackage.getEBoolean(), "useDisabledPageLinks", "true", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_UseFirstLastPageLinks(), ecorePackage.getEBoolean(), "useFirstLastPageLinks", "false", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_FirstPageLabel(), ecorePackage.getEString(), "firstPageLabel", "<<", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_LastPageLabel(), ecorePackage.getEString(), "lastPageLabel", ">>", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(editUnitEClass, EditUnit.class, "EditUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditUnit_DefaultSelection(), theWebGenServicePackage.getSelection(), null, "defaultSelection", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_Title(), theWebGenPersistencePackage.getLabel(), null, "title", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEditUnit_EnableWhen(), theWebGenExpressionPackage.getPredicate(), null, "enableWhen", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_ConfirmDestination(), this.getPage(), null, "confirmDestination", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_ConfirmLabel(), ecorePackage.getEString(), "confirmLabel", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEditUnit_CancelDestination(), this.getPage(), null, "cancelDestination", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_CancelLabel(), ecorePackage.getEString(), "cancelLabel", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "edit_content,framed", 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_CustomiseValues(), ecorePackage.getEBoolean(), "customiseValues", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createUnitEClass, CreateUnit.class, "CreateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,create_unit", 0, 1, CreateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(createUpdateUnitEClass, CreateUpdateUnit.class, "CreateUpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateUpdateUnit_CreateUriElement(), ecorePackage.getEString(), "createUriElement", "", 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateUpdateUnit_ClearLabel(), ecorePackage.getEString(), "clearLabel", null, 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreateUpdateUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,create_unit,update_unit", 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(updateUnitEClass, UpdateUnit.class, "UpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,update_unit", 0, 1, UpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mapUnitEClass, MapUnit.class, "MapUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapUnit_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", "true", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapUnit_DefaultZoomLevel(), ecorePackage.getEInt(), "defaultZoomLevel", "12", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,map_unit", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMapUnit_Location(), theWebGenPersistencePackage.getLocationAttribute(), null, "location", null, 1, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapUnit_PlaceName(), theWebGenPersistencePackage.getLabel(), null, "placeName", null, 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataUnitEClass, DataUnit.class, "DataUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataUnit_DefaultSelection(), theWebGenServicePackage.getSelection(), null, "defaultSelection", null, 0, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataUnit_Title(), theWebGenPersistencePackage.getLabel(), null, "title", null, 0, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(detailsUnitEClass, DetailsUnit.class, "DetailsUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetailsUnit_OnlyDisplayWhenNotEmpty(), ecorePackage.getEBoolean(), "onlyDisplayWhenNotEmpty", "false", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailsUnit_OmitFieldLabels(), ecorePackage.getEBoolean(), "omitFieldLabels", "false", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailsUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,details_unit", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailsUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "details_content", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(indexUnitEClass, IndexUnit.class, "IndexUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexUnit_DisplayOption(), this.getIndexDisplayOption(), "displayOption", "Grid", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_OmitColumnLabels(), ecorePackage.getEBoolean(), "omitColumnLabels", "false", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,index_unit", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "index_content,framed", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_RowClasses(), ecorePackage.getEString(), "rowClasses", "odd_row,even_row", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(controlUnitEClass, ControlUnit.class, "ControlUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlUnit_SubmitLabel(), ecorePackage.getEString(), "submitLabel", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getControlUnit_CancelDestination(), this.getPage(), null, "cancelDestination", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getControlUnit_CancelLabel(), ecorePackage.getEString(), "cancelLabel", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getControlUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "control_form", 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(searchUnitEClass, SearchUnit.class, "SearchUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchUnit_ResultsDestination(), this.getIndexUnit(), null, "resultsDestination", null, 1, 1, SearchUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,search_unit", 0, 1, SearchUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(imageUnitEClass, ImageUnit.class, "ImageUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageUnit_DefaultSelection(), theWebGenServicePackage.getSelection(), null, "defaultSelection", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_ImagePathFeature(), this.getFeaturePath(), null, "imagePathFeature", null, 1, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_TitleFeature(), this.getFeaturePath(), null, "titleFeature", null, 1, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUnit_MissingImagePath(), ecorePackage.getEString(), "missingImagePath", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_ImageFilter(), theWebGenImagePackage.getImageFilter(), null, "imageFilter", null, 1, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUnit_ShowTime(), ecorePackage.getEInt(), "showTime", "-1", 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUnit_TransitionTime(), ecorePackage.getEInt(), "transitionTime", "-1", 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featurePathEClass, FeaturePath.class, "FeaturePath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featurePathAttributeEClass, FeaturePathAttribute.class, "FeaturePathAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePathAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeaturePathAttribute.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeaturePathAttribute_Attribute(), theWebGenPersistencePackage.getAttribute(), null, "attribute", null, 0, 1, FeaturePathAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featurePathAssociationEClass, FeaturePathAssociation.class, "FeaturePathAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePathAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, FeaturePathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeaturePathAssociation_SourceEntity(), theWebGenPersistencePackage.getEntityOrView(), null, "sourceEntity", null, 0, 1, FeaturePathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeaturePathAssociation_TargetEntity(), theWebGenPersistencePackage.getEntityOrView(), null, "targetEntity", null, 0, 1, FeaturePathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(childPathEClass, ChildPath.class, "ChildPath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildPath_PartOf(), this.getAssociationReference(), this.getAssociationReference_ChildFeature(), "partOf", null, 0, 1, ChildPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childPathAttributeEClass, ChildPathAttribute.class, "ChildPathAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildPathAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChildPathAttribute.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getChildPathAttribute_Attribute(), theWebGenPersistencePackage.getAttribute(), null, "attribute", null, 0, 1, ChildPathAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(childPathAssociationEClass, ChildPathAssociation.class, "ChildPathAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildPathAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, ChildPathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChildPathAssociation_SourceEntity(), theWebGenPersistencePackage.getEntityOrView(), null, "sourceEntity", null, 0, 1, ChildPathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChildPathAssociation_TargetEntity(), theWebGenPersistencePackage.getEntityOrView(), null, "targetEntity", null, 0, 1, ChildPathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(imageIndexUnitEClass, ImageIndexUnit.class, "ImageIndexUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageIndexUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,image_index_unit", 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImageIndexUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "image_index_content", 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sliderUnitEClass, SliderUnit.class, "SliderUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSliderUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,slider_unit", 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSliderUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "slider_content", 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(galleryUnitEClass, GalleryUnit.class, "GalleryUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGalleryUnit_FullSizeFilter(), theWebGenImagePackage.getImageFilter(), null, "fullSizeFilter", null, 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalleryUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,gallery_unit", 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGalleryUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "gallery_content", 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(authenticationUnitEClass, AuthenticationUnit.class, "AuthenticationUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(registrationUnitEClass, RegistrationUnit.class, "RegistrationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistrationUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,register_unit", 0, 1, RegistrationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(loginUnitEClass, LoginUnit.class, "LoginUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoginUnit_LogoutUriElement(), ecorePackage.getEString(), "logoutUriElement", "\"logout\"", 0, 1, LoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,login_unit", 0, 1, LoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(forgottenPasswordUnitEClass, ForgottenPasswordUnit.class, "ForgottenPasswordUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForgottenPasswordUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,forgotten_password_unit", 0, 1, ForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inlineActionContainerEClass, InlineActionContainer.class, "InlineActionContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineActionContainer_Actions(), this.getInlineAction(), this.getInlineAction_UsedBy(), "actions", null, 0, -1, InlineActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineActionEClass, InlineAction.class, "InlineAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineAction_UsedBy(), this.getInlineActionContainer(), this.getInlineActionContainer_Actions(), "usedBy", null, 1, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInlineAction_Disable(), ecorePackage.getEBoolean(), "disable", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_RequiresRole(), ecorePackage.getEString(), "requiresRole", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInlineAction_EnableWhen(), theWebGenExpressionPackage.getPredicate(), null, "enableWhen", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInlineAction_DisplayWhen(), theWebGenExpressionPackage.getPredicate(), null, "displayWhen", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_Header(), ecorePackage.getEString(), "header", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_HeaderClass(), ecorePackage.getEString(), "headerClass", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_FooterClass(), ecorePackage.getEString(), "footerClass", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectActionEClass, SelectAction.class, "SelectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectAction_Target(), this.getSelectableUnit(), null, "target", null, 1, 1, SelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteActionEClass, DeleteAction.class, "DeleteAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeleteAction_Destination(), this.getPage(), null, "destination", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_ConfirmMessage(), ecorePackage.getEString(), "confirmMessage", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSupportActionEClass, FeatureSupportAction.class, "FeatureSupportAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureSupportAction_Operation(), theWebGenServicePackage.getBusinessOperation(), null, "operation", null, 1, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_ConfirmMessage(), ecorePackage.getEString(), "confirmMessage", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_FileExtension(), ecorePackage.getEString(), "fileExtension", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelReferenceEClass, ModelReference.class, "ModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelReference_Unit(), this.getDynamicUnit(), null, "unit", null, 1, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(routeParameterReferenceEClass, RouteParameterReference.class, "RouteParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouteParameterReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, RouteParameterReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRouteParameterReference_Parameter(), theWebGenPersistencePackage.getAttribute(), null, "parameter", null, 1, 1, RouteParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(inputTechnologiesEEnum, InputTechnologies.class, "InputTechnologies");
		addEEnumLiteral(inputTechnologiesEEnum, InputTechnologies.HTML);
		addEEnumLiteral(inputTechnologiesEEnum, InputTechnologies.JQUERY_UI);

		initEEnum(ajaxTechnologiesEEnum, AjaxTechnologies.class, "AjaxTechnologies");
		addEEnumLiteral(ajaxTechnologiesEEnum, AjaxTechnologies.NONE);
		addEEnumLiteral(ajaxTechnologiesEEnum, AjaxTechnologies.JQUERY);
		addEEnumLiteral(ajaxTechnologiesEEnum, AjaxTechnologies.ANGULAR_JS);

		initEEnum(pageTopMenuOptionsEEnum, PageTopMenuOptions.class, "PageTopMenuOptions");
		addEEnumLiteral(pageTopMenuOptionsEEnum, PageTopMenuOptions.NEVER_INCLUDE);
		addEEnumLiteral(pageTopMenuOptionsEEnum, PageTopMenuOptions.ALWAYS_INCLUDE);
		addEEnumLiteral(pageTopMenuOptionsEEnum, PageTopMenuOptions.INCLUDE_WHEN_AUTHENTICATED);

		initEEnum(collectionDisplayOptionsEEnum, CollectionDisplayOptions.class, "CollectionDisplayOptions");
		addEEnumLiteral(collectionDisplayOptionsEEnum, CollectionDisplayOptions.LINE_DIRECTION);
		addEEnumLiteral(collectionDisplayOptionsEEnum, CollectionDisplayOptions.PAGE_DIRECTION);

		initEEnum(indexDisplayOptionEEnum, IndexDisplayOption.class, "IndexDisplayOption");
		addEEnumLiteral(indexDisplayOptionEEnum, IndexDisplayOption.GRID);
		addEEnumLiteral(indexDisplayOptionEEnum, IndexDisplayOption.PAGE_DIRECTION);
		addEEnumLiteral(indexDisplayOptionEEnum, IndexDisplayOption.LINE_DIRECTION);

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
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "constraints", "pageNameUnique menuNameUnique "
		   });	
		addAnnotation
		  (pageEClass, 
		   source, 
		   new String[] {
			 "constraints", "contentUnitNameUniqueWithinPage"
		   });	
		addAnnotation
		  (staticMenuEClass, 
		   source, 
		   new String[] {
			 "constraints", "onlyStaticEntries"
		   });	
		addAnnotation
		  (dynamicMenuEClass, 
		   source, 
		   new String[] {
			 "constraints", "mustSelectSingleton titleFromSelectResult canOnlyTitleWithSingletons"
		   });	
		addAnnotation
		  (dynamicUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "featuresMustBeFromContentType"
		   });	
		addAnnotation
		  (unitFeatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "atMostOneSelectAction noDeleteActions"
		   });	
		addAnnotation
		  (unitAssociationEClass, 
		   source, 
		   new String[] {
			 "constraints", "selectionValidChoice"
		   });	
		addAnnotation
		  (dataUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "canOnlyTitleWithSingletons selectionValidChoice"
		   });	
		addAnnotation
		  (detailsUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "selectionMustBeSingleton"
		   });	
		addAnnotation
		  (indexUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "selectionMustNotBeSingleton"
		   });	
		addAnnotation
		  (inlineActionContainerEClass, 
		   source, 
		   new String[] {
			 "constraints", "atMostOneDeleteAction"
		   });	
		addAnnotation
		  (deleteActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "canOnlyDeleteSingletons"
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
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "pageNameUnique", "pages->isUnique(name)",
			 "menuNameUnique", "menus->isUnique(name)"
		   });	
		addAnnotation
		  (pageEClass, 
		   source, 
		   new String[] {
			 "contentUnitNameUniqueWithinPage", "units->isUnique(name)"
		   });	
		addAnnotation
		  (staticMenuEClass, 
		   source, 
		   new String[] {
			 "onlyStaticEntries", "entries->select(e | e.oclIsKindOf(MenuFeature))->isEmpty()"
		   });	
		addAnnotation
		  (dynamicMenuEClass, 
		   source, 
		   new String[] {
			 "mustSelectSingleton", "not selection.oclIsUndefined() implies selection.limit = 1",
			 "titleFromSelectResult ", "not title.oclIsUndefined() and not entityOrView.oclIsUndefined() implies\r\n\tentityOrView.features->includes(title)",
			 "canOnlyTitleWithSingletons", "not title.oclIsUndefined() implies\r\n\tif title.oclIsKindOf(EntityFeature) then\r\n\t\ttitle.oclAsType(EntityFeature).cardinality <> Cardinality::Many\r\n\telse if title.oclIsKindOf(EncapsulatedAttribute) then\r\n\t\ttitle.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n\telse if title.oclIsKindOf(EncapsulatedAssociation) then\r\n\t\ttitle.oclAsType(EncapsulatedAssociation).cardinality <> Cardinality::Many\r\n\telse\r\n\t\tfalse\r\n\tendif endif endif"
		   });	
		addAnnotation
		  (dynamicUnitEClass, 
		   source, 
		   new String[] {
			 "featuresMustBeFromContentType", "let entities : OrderedSet(EntityOrView)\r\n\t= if self.oclIsKindOf(SingletonUnit) then\r\n\t\t\tOrderedSet{self.oclAsType(SingletonUnit).contentType}\r\n\t\telse if self.oclIsKindOf(CollectionUnit) then\r\n\t\t\tself.oclAsType(CollectionUnit).contentType\r\n\t\telse\r\n\t\t\tself.entities\r\n\t\tendif endif\r\n\tin let eovFeatures : Collection(Feature)\r\n\t\t= entities->collect(eov | eov.allFeatures)\r\n\t\tin displayFields\r\n\t\t\t->select(f | f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\r\n\t\t\t->select(f | \r\n\t\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n\t\t\t\t\tnot f.oclAsType(UnitElement).attribute.oclIsUndefined()\r\n\t\t\t\telse\r\n\t\t\t\t\tnot f.oclAsType(UnitAssociation).association.oclIsUndefined()\r\n\t\t\t\tendif)\r\n\t\t\t->forAll(f | \r\n\t\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n\t\t\t\t\teovFeatures->includes(f.oclAsType(UnitElement).attribute)\r\n\t\t\t\telse\r\n\t\t\t\t\teovFeatures->includes(f.oclAsType(UnitAssociation).association)\r\n\t\t\t\tendif)"
		   });	
		addAnnotation
		  (unitFeatureEClass, 
		   source, 
		   new String[] {
			 "atMostOneSelectAction", "actions->select(a | a.oclIsKindOf(SelectAction))->size() < 2",
			 "noDeleteActions", "actions->select(a | a.oclIsKindOf(DeleteAction))->isEmpty()"
		   });	
		addAnnotation
		  (getUnitAttribute_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse if attribute.oclIsKindOf(EncapsulatedAttribute) then\r\n\tattribute.oclAsType(EncapsulatedAttribute).name\r\nelse\r\n\tattribute.oclAsType(EntityAttribute).name\r\nendif endif"
		   });	
		addAnnotation
		  (unitAssociationEClass, 
		   source, 
		   new String[] {
			 "selectionValidChoice", "not selection.oclIsUndefined() implies\r\n\ttargetEntity->collect(eov | eov.servedBy)->collect(s | s.selections)->includes(selection)"
		   });	
		addAnnotation
		  (getUnitAssociation_IsSourceAssociation(), 
		   source, 
		   new String[] {
			 "derivation", "not association.oclIsUndefined() implies\r\n\tlet entities : OrderedSet(EntityOrView)\r\n\t\t= if displayedOn.oclIsKindOf(SingletonUnit) then\r\n\t\t\t\tOrderedSet{displayedOn.oclAsType(SingletonUnit).contentType}\r\n\t\t\telse if displayedOn.oclIsKindOf(CollectionUnit) then\r\n\t\t\t\tdisplayedOn.oclAsType(CollectionUnit).contentType\r\n\t\t\telse\r\n\t\t\t\tdisplayedOn.entities\r\n\t\t\tendif endif\r\n\t\tin entities->collect(e | e.associations)->includes(association)"
		   });	
		addAnnotation
		  (getUnitAssociation_SourceEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getUnitAssociation_TargetEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getAssociationReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\t\'\'\r\nelse if association.oclIsKindOf(EntityAssociation) then\r\n\tassociation.oclAsType(EntityAssociation).name\r\nelse if association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\tassociation.oclAsType(EncapsulatedAssociation).name\r\nelse\r\n\tassociation.oclAsType(ViewAssociation).name \r\nendif endif endif\r\n"
		   });	
		addAnnotation
		  (dataUnitEClass, 
		   source, 
		   new String[] {
			 "canOnlyTitleWithSingletons", "not title.oclIsUndefined() implies \r\n\tif title.oclIsKindOf(EntityAttribute) then\r\n\t\ttitle.oclAsType(EntityAttribute).cardinality <> Cardinality::Many\r\n\telse if title.oclIsKindOf(EncapsulatedAttribute) then\r\n\t\ttitle.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n\telse\r\n\t\ttrue\r\n\tendif endif",
			 "selectionValidChoice", "not defaultSelection.oclIsUndefined() implies\r\n\tentities->collect(eov | eov.servedBy)->collect(s | s.selections)->includes(defaultSelection)"
		   });	
		addAnnotation
		  (detailsUnitEClass, 
		   source, 
		   new String[] {
			 "selectionMustBeSingleton", "not defaultSelection.oclIsUndefined() implies\r\n\tdefaultSelection.limit = 1"
		   });	
		addAnnotation
		  (indexUnitEClass, 
		   source, 
		   new String[] {
			 "selectionMustNotBeSingleton", "not defaultSelection.oclIsUndefined() implies\r\n\tdefaultSelection.limit <> 1"
		   });	
		addAnnotation
		  (getFeaturePathAttribute_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse if attribute.oclIsKindOf(EntityAttribute) then\r\n\tattribute.oclAsType(EntityAttribute).name\r\nelse\r\n\tattribute.oclAsType(EncapsulatedAttribute).name\r\nendif endif\r\n"
		   });	
		addAnnotation
		  (getFeaturePathAssociation_IsSourceAssociation(), 
		   source, 
		   new String[] {
			 "derivation", "not association.oclIsUndefined() implies\r\n\tlet unit : DynamicUnit\r\n\t\t= self.eContainer().oclAsType(DynamicUnit)\r\n\t\tin let entities : OrderedSet(EntityOrView)\r\n\t\t\t= if unit.oclIsKindOf(SingletonUnit) then\r\n\t\t\t\t\tOrderedSet{unit.oclAsType(SingletonUnit).contentType}\r\n\t\t\t\telse if unit.oclIsKindOf(CollectionUnit) then\r\n\t\t\t\t\tunit.oclAsType(CollectionUnit).contentType\r\n\t\t\t\telse\r\n\t\t\t\t\tunit.entities\r\n\t\t\t\tendif endif\r\n\t\t\tin entities->collect(eov | eov.associations)->includes(association)"
		   });	
		addAnnotation
		  (getFeaturePathAssociation_SourceEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getFeaturePathAssociation_TargetEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getChildPathAttribute_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse if attribute.oclIsKindOf(EntityAttribute) then\r\n\tattribute.oclAsType(EntityAttribute).name\r\nelse\r\n\tattribute.oclAsType(EncapsulatedAttribute).name\r\nendif endif\r\n"
		   });	
		addAnnotation
		  (getChildPathAssociation_IsSourceAssociation(), 
		   source, 
		   new String[] {
			 "derivation", "not association.oclIsUndefined() implies\r\n\tif partOf.oclIsTypeOf(UnitAssociation) then\r\n\t\tpartOf.oclAsType(UnitAssociation).targetEntity.associations->includes(association)\r\n\telse if partOf.oclIsTypeOf(FeaturePathAssociation) then\r\n\t\tpartOf.oclAsType(FeaturePathAssociation).targetEntity.associations->includes(association)\r\n\telse\r\n\t\tpartOf.oclAsType(ChildPathAssociation).targetEntity.associations->includes(association)\r\n\tendif endif"
		   });	
		addAnnotation
		  (getChildPathAssociation_SourceEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getChildPathAssociation_TargetEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (inlineActionContainerEClass, 
		   source, 
		   new String[] {
			 "atMostOneDeleteAction", "actions->select(a | a.oclIsKindOf(DeleteAction))->size() < 2"
		   });	
		addAnnotation
		  (deleteActionEClass, 
		   source, 
		   new String[] {
			 "canOnlyDeleteSingletons", "if usedBy.oclIsKindOf(UnitElement) then\r\n\tlet attribute : Attribute\r\n\t\t= usedBy.oclAsType(UnitElement).attribute\r\n\t\tin if attribute.oclIsKindOf(EntityAttribute) then\r\n\t\t\t\tattribute.oclAsType(EntityAttribute).cardinality <> Cardinality::Many\r\n\t\t\telse\r\n\t\t\t\tattribute.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n\t\t\tendif\r\nelse if usedBy.oclIsKindOf(UnitAssociation) then\r\n\tlet association : Association\r\n\t\t= usedBy.oclAsType(UnitAssociation).association\r\n\t\tin if association.oclIsKindOf(EntityAssociation) then\r\n\t\t\t\tassociation.oclAsType(EntityAssociation).cardinality <> Cardinality::Many\r\n\t\t\telse if association.oclIsKindOf(EncapsulatedAssociation) then\r\n\t\t\t\tassociation.oclAsType(EncapsulatedAssociation).cardinality <> Cardinality::Many\r\n\t\t\telse\r\n\t\t\t\tfalse -- association.oclAsType(ViewAssociation)\r\n\t\t\tendif endif\r\nelse\r\n\tusedBy.oclIsKindOf(CollectionUnit)\r\nendif endif\r\n"
		   });	
		addAnnotation
		  (getRouteParameterReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if parameter.oclIsUndefined() then\r\n\t\'\'\r\nelse if parameter.oclIsKindOf(EntityAttribute) then\r\n\tparameter.oclAsType(EntityAttribute).name\r\nelse\r\n\tparameter.oclAsType(EncapsulatedAttribute).name\r\nendif endif"
		   });
	}

} //WebGenInterfacePackageImpl

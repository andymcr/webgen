/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

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
import uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry;
import uk.ac.man.cs.mdsd.webgen.webui.AjaxTechnologies;
import uk.ac.man.cs.mdsd.webgen.webui.AssociationReference;
import uk.ac.man.cs.mdsd.webgen.webui.AuthenticationUnit;
import uk.ac.man.cs.mdsd.webgen.webui.Badge;
import uk.ac.man.cs.mdsd.webgen.webui.CaptchaField;
import uk.ac.man.cs.mdsd.webgen.webui.ChildPath;
import uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.ChildPathAttribute;
import uk.ac.man.cs.mdsd.webgen.webui.CollectionDisplayOptions;
import uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.webui.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.webui.ControlUnit;
import uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit;
import uk.ac.man.cs.mdsd.webgen.webui.CreateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.DataTypeField;
import uk.ac.man.cs.mdsd.webgen.webui.DataUnit;
import uk.ac.man.cs.mdsd.webgen.webui.DateField;
import uk.ac.man.cs.mdsd.webgen.webui.DeleteAction;
import uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit;
import uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.webui.EditStaticTextMenuEntry;
import uk.ac.man.cs.mdsd.webgen.webui.EditUnit;
import uk.ac.man.cs.mdsd.webgen.webui.FeaturePath;
import uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAttribute;
import uk.ac.man.cs.mdsd.webgen.webui.FeaturePathLabel;
import uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction;
import uk.ac.man.cs.mdsd.webgen.webui.ForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit;
import uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit;
import uk.ac.man.cs.mdsd.webgen.webui.ImageUnit;
import uk.ac.man.cs.mdsd.webgen.webui.IndexDisplayOption;
import uk.ac.man.cs.mdsd.webgen.webui.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.webui.InlineAction;
import uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.webui.InputTechnologies;
import uk.ac.man.cs.mdsd.webgen.webui.InterfaceField;
import uk.ac.man.cs.mdsd.webgen.webui.LoginUnit;
import uk.ac.man.cs.mdsd.webgen.webui.MapUnit;
import uk.ac.man.cs.mdsd.webgen.webui.Menu;
import uk.ac.man.cs.mdsd.webgen.webui.MenuEntry;
import uk.ac.man.cs.mdsd.webgen.webui.MenuFeature;
import uk.ac.man.cs.mdsd.webgen.webui.Page;
import uk.ac.man.cs.mdsd.webgen.webui.PageLink;
import uk.ac.man.cs.mdsd.webgen.webui.PageTopMenuOptions;
import uk.ac.man.cs.mdsd.webgen.webui.Query;
import uk.ac.man.cs.mdsd.webgen.webui.QueryParameter;
import uk.ac.man.cs.mdsd.webgen.webui.RegistrationUnit;
import uk.ac.man.cs.mdsd.webgen.webui.RouteActual;
import uk.ac.man.cs.mdsd.webgen.webui.SearchUnit;
import uk.ac.man.cs.mdsd.webgen.webui.SelectAction;
import uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit;
import uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit;
import uk.ac.man.cs.mdsd.webgen.webui.SliderUnit;
import uk.ac.man.cs.mdsd.webgen.webui.StaticUnit;
import uk.ac.man.cs.mdsd.webgen.webui.SubmenuEntry;
import uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.UnitContainer;
import uk.ac.man.cs.mdsd.webgen.webui.UnitElement;
import uk.ac.man.cs.mdsd.webgen.webui.UnitFeature;
import uk.ac.man.cs.mdsd.webgen.webui.UnitField;
import uk.ac.man.cs.mdsd.webgen.webui.UnitSupportAction;
import uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiFactory;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

import uk.ac.man.cs.mdsd.webgen.webui.util.WebuiValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebuiPackageImpl extends EPackageImpl implements WebuiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webUIEClass = null;

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
	private EClass menuFeatureEClass = null;

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
	private EClass unitElementEClass = null;

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
	private EClass featurePathLabelEClass = null;

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
	private EClass badgeEClass = null;

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebuiPackageImpl() {
		super(eNS_URI, WebuiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WebuiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebuiPackage init() {
		if (isInited) return (WebuiPackage)EPackage.Registry.INSTANCE.getEPackage(WebuiPackage.eNS_URI);

		// Obtain or create and register package
		WebuiPackageImpl theWebuiPackage = (WebuiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebuiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebuiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ImagePackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebuiPackage.createPackageContents();

		// Initialize created meta-data
		theWebuiPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWebuiPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WebuiValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWebuiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebuiPackage.eNS_URI, theWebuiPackage);
		return theWebuiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebUI() {
		return webUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebUI_Services() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebUI_Menus() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebUI_Pages() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebUI_DefaultDateFormat() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebUI_DefaultTimeFormat() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebUI_DefaultDateTimeFormat() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebUI_DefaultMaximumUploadSize() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebUI_InputTechnology() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebUI_AjaxTechnology() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(8);
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
	public EClass getSubmenuEntry() {
		return submenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmenuEntry_RequiresRole() {
		return (EAttribute)submenuEntryEClass.getEStructuralFeatures().get(0);
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
	public EClass getMenuFeature() {
		return menuFeatureEClass;
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
	public EAttribute getQueryParameter_Value() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(0);
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
	public EReference getPage_WebUI() {
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
	public EAttribute getPage_UriElement() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_StyleClass() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getContentUnit_UriElement() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_Alternative() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_OmitCaption() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_CaptionClass() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentUnit_PageDisplayedOn() {
		return (EReference)contentUnitEClass.getEStructuralFeatures().get(9);
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
	public EReference getRouteActual_ActualFor() {
		return (EReference)routeActualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteActual_RouteParameter() {
		return (EReference)routeActualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteActual_Value() {
		return (EReference)routeActualEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getUnitFeature_DisplayLabel() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_Required() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitFeature_ForcedValue() {
		return (EReference)unitFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_CollectionUiAllowAdd() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_CollectionUiAllowRemove() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_NullDisplayValue() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_Footer() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_Autofocus() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_HeaderClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_InputClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_DisplayClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_FooterClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitElement() {
		return unitElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitElement_Attribute() {
		return (EReference)unitElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitElement_Name() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitElement_DefaultValue() {
		return (EReference)unitElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitElement_ObfuscateFormFields() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitElement_Placeholder() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitElement_ValidationPattern() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(5);
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
	public EReference getUnitAssociation_AjaxOptionsList() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(4);
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
	public EReference getCollectionUnit_PaginationParent() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_FindElementSelection() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_Filter() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_SupportedFilters() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionUnit_Badges() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_EmptyMessage() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_DefaultPaginationSize() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_MaximumPaginationSize() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_NextNpages() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PreviousNpages() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_NextPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_NextPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PreviousPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PreviousPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_UseDisabledPageLinks() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_UseFirstLastPageLinks() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_FirstPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_FirstPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_LastPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_LastPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PaginationClass() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionUnit_PaginationElementClass() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(25);
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
	public EReference getEditUnit_DisableWhen() {
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
	public EReference getEditUnit_ConfirmDestination() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_ConfirmLabel() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_CancelDestination() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_CancelLabel() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_ContentClass() {
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
	public EAttribute getCreateUpdateUnit_OnSaveContinueEditing() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUpdateUnit_CreateUriElement() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUpdateUnit_ClearLabel() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUpdateUnit_StyleClass() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getUpdateUnit_OnSaveContinueEditing() {
		return (EAttribute)updateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateUnit_StyleClass() {
		return (EAttribute)updateUnitEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getImageIndexUnit_OmitFieldLabels() {
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
	public EAttribute getImageIndexUnit_OverlayTitle() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageIndexUnit_StyleClass() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageIndexUnit_ContentClass() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageIndexUnit_ColumnClass() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageIndexUnit_CardClass() {
		return (EAttribute)imageIndexUnitEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getSliderUnit_StyleClass() {
		return (EAttribute)sliderUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSliderUnit_ContentClass() {
		return (EAttribute)sliderUnitEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getGalleryUnit_StyleClass() {
		return (EAttribute)galleryUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalleryUnit_ContentClass() {
		return (EAttribute)galleryUnitEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getInlineAction_IconName() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Disable() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineAction_DisplayWhen() {
		return (EReference)inlineActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Header() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Footer() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_HeaderClass() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_FooterClass() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getFeatureSupportAction_UriElement() {
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
	public EAttribute getFeatureSupportAction_FileExtension() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSupportAction_RequiresRole() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSupportAction_EnableWhen() {
		return (EReference)featureSupportActionEClass.getEStructuralFeatures().get(4);
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
	public WebuiFactory getWebuiFactory() {
		return (WebuiFactory)getEFactoryInstance();
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
		webUIEClass = createEClass(WEB_UI);
		createEReference(webUIEClass, WEB_UI__SERVICES);
		createEReference(webUIEClass, WEB_UI__MENUS);
		createEReference(webUIEClass, WEB_UI__PAGES);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_DATE_FORMAT);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_TIME_FORMAT);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_DATE_TIME_FORMAT);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE);
		createEAttribute(webUIEClass, WEB_UI__INPUT_TECHNOLOGY);
		createEAttribute(webUIEClass, WEB_UI__AJAX_TECHNOLOGY);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__ENTRIES);
		createEAttribute(menuEClass, MENU__OMIT_CAPTION);
		createEAttribute(menuEClass, MENU__CAPTION_CLASS);
		createEAttribute(menuEClass, MENU__STYLE_CLASS);
		createEAttribute(menuEClass, MENU__LAYOUT_CLASS);

		menuEntryEClass = createEClass(MENU_ENTRY);
		createEReference(menuEntryEClass, MENU_ENTRY__PART_OF);

		submenuEntryEClass = createEClass(SUBMENU_ENTRY);
		createEAttribute(submenuEntryEClass, SUBMENU_ENTRY__REQUIRES_ROLE);

		actionMenuEntryEClass = createEClass(ACTION_MENU_ENTRY);
		createEReference(actionMenuEntryEClass, ACTION_MENU_ENTRY__DESTINATION);
		createEReference(actionMenuEntryEClass, ACTION_MENU_ENTRY__QUERY);

		editStaticTextMenuEntryEClass = createEClass(EDIT_STATIC_TEXT_MENU_ENTRY);

		menuFeatureEClass = createEClass(MENU_FEATURE);

		queryEClass = createEClass(QUERY);
		createEReference(queryEClass, QUERY__FILTER);
		createEReference(queryEClass, QUERY__PARAMETERS);

		queryParameterEClass = createEClass(QUERY_PARAMETER);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__VALUE);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__WEB_UI);
		createEReference(pageEClass, PAGE__PARENT_PAGE);
		createEReference(pageEClass, PAGE__CHILD_PAGES);
		createEAttribute(pageEClass, PAGE__URI_ELEMENT);
		createEAttribute(pageEClass, PAGE__STYLE_CLASS);

		pageLinkEClass = createEClass(PAGE_LINK);
		createEReference(pageLinkEClass, PAGE_LINK__TARGET_PAGE);

		unitContainerEClass = createEClass(UNIT_CONTAINER);
		createEReference(unitContainerEClass, UNIT_CONTAINER__UNITS);

		contentUnitEClass = createEClass(CONTENT_UNIT);
		createEReference(contentUnitEClass, CONTENT_UNIT__DISPLAYED_ON);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT);
		createEReference(contentUnitEClass, CONTENT_UNIT__ROUTE_ACTUALS);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__REQUIRES_ROLE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__PURPOSE_SUMMARY);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__URI_ELEMENT);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__ALTERNATIVE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__OMIT_CAPTION);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__CAPTION_CLASS);
		createEReference(contentUnitEClass, CONTENT_UNIT__PAGE_DISPLAYED_ON);

		routeActualEClass = createEClass(ROUTE_ACTUAL);
		createEReference(routeActualEClass, ROUTE_ACTUAL__ACTUAL_FOR);
		createEReference(routeActualEClass, ROUTE_ACTUAL__ROUTE_PARAMETER);
		createEReference(routeActualEClass, ROUTE_ACTUAL__VALUE);

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
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__DISPLAY_LABEL);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__REQUIRED);
		createEReference(unitFeatureEClass, UNIT_FEATURE__FORCED_VALUE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__NULL_DISPLAY_VALUE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FOOTER);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__AUTOFOCUS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__HEADER_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__INPUT_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__DISPLAY_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FOOTER_CLASS);

		unitElementEClass = createEClass(UNIT_ELEMENT);
		createEReference(unitElementEClass, UNIT_ELEMENT__ATTRIBUTE);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__NAME);
		createEReference(unitElementEClass, UNIT_ELEMENT__DEFAULT_VALUE);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__PLACEHOLDER);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__VALIDATION_PATTERN);

		unitAssociationEClass = createEClass(UNIT_ASSOCIATION);
		createEAttribute(unitAssociationEClass, UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__SOURCE_ENTITY);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__TARGET_ENTITY);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__SELECTION);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__AJAX_OPTIONS_LIST);

		associationReferenceEClass = createEClass(ASSOCIATION_REFERENCE);
		createEAttribute(associationReferenceEClass, ASSOCIATION_REFERENCE__NAME);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__ASSOCIATION);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__VALUE_DISPLAY);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__CHILD_FEATURE);

		childPathEClass = createEClass(CHILD_PATH);
		createEReference(childPathEClass, CHILD_PATH__PART_OF);

		childPathAttributeEClass = createEClass(CHILD_PATH_ATTRIBUTE);
		createEAttribute(childPathAttributeEClass, CHILD_PATH_ATTRIBUTE__NAME);
		createEReference(childPathAttributeEClass, CHILD_PATH_ATTRIBUTE__ATTRIBUTE);

		childPathAssociationEClass = createEClass(CHILD_PATH_ASSOCIATION);
		createEAttribute(childPathAssociationEClass, CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION);
		createEReference(childPathAssociationEClass, CHILD_PATH_ASSOCIATION__SOURCE_ENTITY);
		createEReference(childPathAssociationEClass, CHILD_PATH_ASSOCIATION__TARGET_ENTITY);

		featurePathEClass = createEClass(FEATURE_PATH);

		featurePathAttributeEClass = createEClass(FEATURE_PATH_ATTRIBUTE);
		createEAttribute(featurePathAttributeEClass, FEATURE_PATH_ATTRIBUTE__NAME);
		createEReference(featurePathAttributeEClass, FEATURE_PATH_ATTRIBUTE__ATTRIBUTE);

		featurePathAssociationEClass = createEClass(FEATURE_PATH_ASSOCIATION);
		createEAttribute(featurePathAssociationEClass, FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION);
		createEReference(featurePathAssociationEClass, FEATURE_PATH_ASSOCIATION__SOURCE_ENTITY);
		createEReference(featurePathAssociationEClass, FEATURE_PATH_ASSOCIATION__TARGET_ENTITY);

		featurePathLabelEClass = createEClass(FEATURE_PATH_LABEL);
		createEAttribute(featurePathLabelEClass, FEATURE_PATH_LABEL__NAME);
		createEReference(featurePathLabelEClass, FEATURE_PATH_LABEL__LABEL);

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

		singletonUnitEClass = createEClass(SINGLETON_UNIT);
		createEReference(singletonUnitEClass, SINGLETON_UNIT__CONTENT_TYPE);

		collectionUnitEClass = createEClass(COLLECTION_UNIT);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__CONTENT_TYPE);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__SELECTION);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__FIND_CONTAINER_SELECTION);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__OMIT_CONTAINER_LOAD);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__PAGINATION_PARENT);
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
		createEReference(editUnitEClass, EDIT_UNIT__DISABLE_WHEN);
		createEReference(editUnitEClass, EDIT_UNIT__TITLE);
		createEReference(editUnitEClass, EDIT_UNIT__CONFIRM_DESTINATION);
		createEAttribute(editUnitEClass, EDIT_UNIT__CONFIRM_LABEL);
		createEReference(editUnitEClass, EDIT_UNIT__CANCEL_DESTINATION);
		createEAttribute(editUnitEClass, EDIT_UNIT__CANCEL_LABEL);
		createEAttribute(editUnitEClass, EDIT_UNIT__CONTENT_CLASS);
		createEAttribute(editUnitEClass, EDIT_UNIT__CUSTOMISE_VALUES);

		createUnitEClass = createEClass(CREATE_UNIT);
		createEAttribute(createUnitEClass, CREATE_UNIT__STYLE_CLASS);

		createUpdateUnitEClass = createEClass(CREATE_UPDATE_UNIT);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__CLEAR_LABEL);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__STYLE_CLASS);

		updateUnitEClass = createEClass(UPDATE_UNIT);
		createEAttribute(updateUnitEClass, UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING);
		createEAttribute(updateUnitEClass, UPDATE_UNIT__STYLE_CLASS);

		mapUnitEClass = createEClass(MAP_UNIT);
		createEAttribute(mapUnitEClass, MAP_UNIT__READ_ONLY);
		createEAttribute(mapUnitEClass, MAP_UNIT__DEFAULT_ZOOM_LEVEL);
		createEAttribute(mapUnitEClass, MAP_UNIT__STYLE_CLASS);
		createEReference(mapUnitEClass, MAP_UNIT__LOCATION);
		createEReference(mapUnitEClass, MAP_UNIT__PLACE_NAME);

		dataUnitEClass = createEClass(DATA_UNIT);
		createEReference(dataUnitEClass, DATA_UNIT__TITLE);

		detailsUnitEClass = createEClass(DETAILS_UNIT);
		createEReference(detailsUnitEClass, DETAILS_UNIT__SELECTION);
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
		createEReference(imageUnitEClass, IMAGE_UNIT__TITLE);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_PATH_FEATURE);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_TITLE_FEATURE);
		createEAttribute(imageUnitEClass, IMAGE_UNIT__TRUNCATE_IMAGE_TITLE);
		createEAttribute(imageUnitEClass, IMAGE_UNIT__MISSING_IMAGE_PATH);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_FILTER);

		imageIndexUnitEClass = createEClass(IMAGE_INDEX_UNIT);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__OVERLAY_TITLE);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__OMIT_FIELD_LABELS);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__OVERLAY_SINGLE_SELECT_ACTION);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__STYLE_CLASS);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__CONTENT_CLASS);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__COLUMN_CLASS);
		createEAttribute(imageIndexUnitEClass, IMAGE_INDEX_UNIT__CARD_CLASS);

		sliderUnitEClass = createEClass(SLIDER_UNIT);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__SHOW_TIME);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__TRANSITION_TIME);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__STYLE_CLASS);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__CONTENT_CLASS);

		galleryUnitEClass = createEClass(GALLERY_UNIT);
		createEReference(galleryUnitEClass, GALLERY_UNIT__FULL_SIZE_FILTER);
		createEAttribute(galleryUnitEClass, GALLERY_UNIT__SHOW_TIME);
		createEAttribute(galleryUnitEClass, GALLERY_UNIT__TRANSITION_TIME);
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
		createEAttribute(inlineActionEClass, INLINE_ACTION__ICON_NAME);
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
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__FILE_EXTENSION);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__REQUIRES_ROLE);
		createEReference(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__ENABLE_WHEN);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__URI_ELEMENT);

		badgeEClass = createEClass(BADGE);
		createEAttribute(badgeEClass, BADGE__ICON_NAME);
		createEReference(badgeEClass, BADGE__VALUE);
		createEReference(badgeEClass, BADGE__DISPLAY_WHEN);
		createEReference(badgeEClass, BADGE__NEW_WHEN);

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
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		PersistencePackage thePersistencePackage = (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		ImagePackage theImagePackage = (ImagePackage)EPackage.Registry.INSTANCE.getEPackage(ImagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		menuEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		submenuEntryEClass.getESuperTypes().add(this.getMenu());
		submenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		actionMenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		actionMenuEntryEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		editStaticTextMenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		editStaticTextMenuEntryEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		menuFeatureEClass.getESuperTypes().add(this.getMenuEntry());
		pageEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		pageEClass.getESuperTypes().add(this.getUnitContainer());
		contentUnitEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		staticUnitEClass.getESuperTypes().add(this.getContentUnit());
		createSitemapUnitEClass.getESuperTypes().add(this.getContentUnit());
		dynamicUnitEClass.getESuperTypes().add(this.getContentUnit());
		unitFeatureEClass.getESuperTypes().add(this.getUnitField());
		unitFeatureEClass.getESuperTypes().add(this.getInlineActionContainer());
		unitElementEClass.getESuperTypes().add(this.getUnitFeature());
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
		interfaceFieldEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		interfaceFieldEClass.getESuperTypes().add(this.getUnitField());
		dataTypeFieldEClass.getESuperTypes().add(this.getInterfaceField());
		dateFieldEClass.getESuperTypes().add(this.getInterfaceField());
		captchaFieldEClass.getESuperTypes().add(this.getInterfaceField());
		unitSupportActionEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
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
		inlineActionEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		selectActionEClass.getESuperTypes().add(this.getInlineAction());
		deleteActionEClass.getESuperTypes().add(this.getInlineAction());
		featureSupportActionEClass.getESuperTypes().add(this.getInlineAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(webUIEClass, WebUI.class, "WebUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebUI_Services(), theServicePackage.getServices(), null, "services", null, 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_Menus(), this.getMenu(), null, "menus", null, 0, -1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_Pages(), this.getPage(), this.getPage_WebUI(), "pages", null, 0, -1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebUI_DefaultDateFormat(), ecorePackage.getEString(), "defaultDateFormat", "jS F Y", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebUI_DefaultTimeFormat(), ecorePackage.getEString(), "defaultTimeFormat", "G.i", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebUI_DefaultDateTimeFormat(), ecorePackage.getEString(), "defaultDateTimeFormat", "jS F Y G.i", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebUI_DefaultMaximumUploadSize(), ecorePackage.getEInt(), "defaultMaximumUploadSize", "2000000", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebUI_InputTechnology(), this.getInputTechnologies(), "inputTechnology", "Html", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebUI_AjaxTechnology(), this.getAjaxTechnologies(), "ajaxTechnology", "None", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_Entries(), this.getMenuEntry(), this.getMenuEntry_PartOf(), "entries", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_OmitCaption(), ecorePackage.getEBoolean(), "omitCaption", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_CaptionClass(), ecorePackage.getEString(), "captionClass", "menu_caption", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_StyleClass(), ecorePackage.getEString(), "styleClass", "menu", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMenu_LayoutClass(), ecorePackage.getEString(), "layoutClass", "collapsible", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(menuEntryEClass, MenuEntry.class, "MenuEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuEntry_PartOf(), this.getMenu(), this.getMenu_Entries(), "partOf", null, 1, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(submenuEntryEClass, SubmenuEntry.class, "SubmenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubmenuEntry_RequiresRole(), ecorePackage.getEString(), "requiresRole", "", 0, 1, SubmenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionMenuEntryEClass, ActionMenuEntry.class, "ActionMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionMenuEntry_Destination(), this.getContentUnit(), null, "destination", null, 1, 1, ActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActionMenuEntry_Query(), this.getQuery(), null, "query", null, 0, 1, ActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editStaticTextMenuEntryEClass, EditStaticTextMenuEntry.class, "EditStaticTextMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuFeatureEClass, MenuFeature.class, "MenuFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_Filter(), theServicePackage.getFilter(), null, "filter", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Parameters(), this.getQueryParameter(), null, "parameters", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParameterEClass, QueryParameter.class, "QueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_WebUI(), this.getWebUI(), this.getWebUI_Pages(), "webUI", null, 1, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_ParentPage(), this.getPageLink(), null, "parentPage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_ChildPages(), this.getPageLink(), this.getPageLink_TargetPage(), "childPages", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_StyleClass(), ecorePackage.getEString(), "styleClass", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pageLinkEClass, PageLink.class, "PageLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageLink_TargetPage(), this.getPage(), this.getPage_ChildPages(), "targetPage", null, 1, 1, PageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitContainerEClass, UnitContainer.class, "UnitContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitContainer_Units(), this.getContentUnit(), this.getContentUnit_DisplayedOn(), "units", null, 0, -1, UnitContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentUnitEClass, ContentUnit.class, "ContentUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentUnit_DisplayedOn(), this.getUnitContainer(), this.getUnitContainer_Units(), "displayedOn", null, 1, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContentUnit_CreateDefaultUriElement(), ecorePackage.getEBoolean(), "createDefaultUriElement", "true", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentUnit_RouteActuals(), this.getRouteActual(), this.getRouteActual_ActualFor(), "routeActuals", null, 0, -1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_RequiresRole(), ecorePackage.getEString(), "requiresRole", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_PurposeSummary(), ecorePackage.getEString(), "purposeSummary", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Alternative(), ecorePackage.getEString(), "alternative", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_OmitCaption(), ecorePackage.getEBoolean(), "omitCaption", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_CaptionClass(), ecorePackage.getEString(), "captionClass", "unit_caption", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentUnit_PageDisplayedOn(), this.getPage(), null, "pageDisplayedOn", null, 0, 1, ContentUnit.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(routeActualEClass, RouteActual.class, "RouteActual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouteActual_ActualFor(), this.getContentUnit(), this.getContentUnit_RouteActuals(), "actualFor", null, 1, 1, RouteActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteActual_RouteParameter(), thePersistencePackage.getAttribute(), null, "routeParameter", null, 1, 1, RouteActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteActual_Value(), theExpressionPackage.getExpression(), null, "value", null, 1, 1, RouteActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getDynamicUnit_DisplayFields(), this.getUnitField(), this.getUnitField_DisplayedOn(), "displayFields", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_HideWhen(), theExpressionPackage.getPredicate(), null, "hideWhen", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_MessageWhenHidden(), ecorePackage.getEString(), "messageWhenHidden", "", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_SupportActions(), this.getUnitSupportAction(), null, "supportActions", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_Header(), ecorePackage.getEString(), "header", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_HeaderClass(), ecorePackage.getEString(), "headerClass", "unit_header", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_ControlClass(), ecorePackage.getEString(), "controlClass", "unit_control", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_FooterClass(), ecorePackage.getEString(), "footerClass", "unit_footer", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_ErrorClass(), ecorePackage.getEString(), "errorClass", "error", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitFieldEClass, UnitField.class, "UnitField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitField_DisplayedOn(), this.getDynamicUnit(), this.getDynamicUnit_DisplayFields(), "displayedOn", null, 1, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_RequiresRole(), ecorePackage.getEString(), "requiresRole", "", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitField_HideWhen(), theExpressionPackage.getPredicate(), null, "hideWhen", null, 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_Title(), ecorePackage.getEString(), "title", "", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_CollectionDisplayOption(), this.getCollectionDisplayOptions(), "collectionDisplayOption", "LineDirection", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_MaximumDisplaySize(), ecorePackage.getEInt(), "maximumDisplaySize", "-1", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_DateFormat(), ecorePackage.getEString(), "dateFormat", null, 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_DisableInput(), ecorePackage.getEBoolean(), "disableInput", "false", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitFeatureEClass, UnitFeature.class, "UnitFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitFeature_DisplayLabel(), ecorePackage.getEString(), "displayLabel", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitFeature_ForcedValue(), theExpressionPackage.getExpression(), null, "forcedValue", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_CollectionUiAllowAdd(), ecorePackage.getEBoolean(), "collectionUiAllowAdd", "false", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_CollectionUiAllowRemove(), ecorePackage.getEBoolean(), "collectionUiAllowRemove", "false", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_NullDisplayValue(), ecorePackage.getEString(), "nullDisplayValue", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_Autofocus(), ecorePackage.getEBoolean(), "autofocus", "false", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_HeaderClass(), ecorePackage.getEString(), "headerClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_InputClass(), ecorePackage.getEString(), "inputClass", "input-field,col,s12", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_DisplayClass(), ecorePackage.getEString(), "displayClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_FooterClass(), ecorePackage.getEString(), "footerClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitElementEClass, UnitElement.class, "UnitElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitElement_Attribute(), thePersistencePackage.getAttribute(), null, "attribute", null, 1, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnitElement.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitElement_DefaultValue(), theExpressionPackage.getExpression(), null, "defaultValue", null, 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", "false", 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_ValidationPattern(), ecorePackage.getEString(), "validationPattern", null, 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitAssociationEClass, UnitAssociation.class, "UnitAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, UnitAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_SourceEntity(), thePersistencePackage.getEntityOrView(), null, "sourceEntity", null, 0, 1, UnitAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_TargetEntity(), thePersistencePackage.getEntityOrView(), null, "targetEntity", null, 0, 1, UnitAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_Selection(), theServicePackage.getSelection(), null, "selection", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_AjaxOptionsList(), theServicePackage.getSelection(), null, "ajaxOptionsList", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationReferenceEClass, AssociationReference.class, "AssociationReference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationReference_Association(), thePersistencePackage.getAssociation(), null, "association", null, 1, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationReference_ValueDisplay(), thePersistencePackage.getLabel(), null, "valueDisplay", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationReference_ChildFeature(), this.getChildPath(), this.getChildPath_PartOf(), "childFeature", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childPathEClass, ChildPath.class, "ChildPath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildPath_PartOf(), this.getAssociationReference(), this.getAssociationReference_ChildFeature(), "partOf", null, 0, 1, ChildPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childPathAttributeEClass, ChildPathAttribute.class, "ChildPathAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildPathAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChildPathAttribute.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getChildPathAttribute_Attribute(), thePersistencePackage.getAttribute(), null, "attribute", null, 1, 1, ChildPathAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(childPathAssociationEClass, ChildPathAssociation.class, "ChildPathAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildPathAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, ChildPathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChildPathAssociation_SourceEntity(), thePersistencePackage.getEntityOrView(), null, "sourceEntity", null, 0, 1, ChildPathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChildPathAssociation_TargetEntity(), thePersistencePackage.getEntityOrView(), null, "targetEntity", null, 0, 1, ChildPathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featurePathEClass, FeaturePath.class, "FeaturePath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featurePathAttributeEClass, FeaturePathAttribute.class, "FeaturePathAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePathAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeaturePathAttribute.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeaturePathAttribute_Attribute(), thePersistencePackage.getAttribute(), null, "attribute", null, 1, 1, FeaturePathAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featurePathAssociationEClass, FeaturePathAssociation.class, "FeaturePathAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePathAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, FeaturePathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeaturePathAssociation_SourceEntity(), thePersistencePackage.getEntityOrView(), null, "sourceEntity", null, 0, 1, FeaturePathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeaturePathAssociation_TargetEntity(), thePersistencePackage.getEntityOrView(), null, "targetEntity", null, 0, 1, FeaturePathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featurePathLabelEClass, FeaturePathLabel.class, "FeaturePathLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePathLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeaturePathLabel.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeaturePathLabel_Label(), thePersistencePackage.getModelLabel(), null, "label", null, 1, 1, FeaturePathLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceFieldEClass, InterfaceField.class, "InterfaceField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceField_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterfaceField_MustMatch(), this.getUnitField(), null, "mustMatch", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_InputClass(), ecorePackage.getEString(), "inputClass", "input_attribute", 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_ValidationPattern(), ecorePackage.getEString(), "validationPattern", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataTypeFieldEClass, DataTypeField.class, "DataTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeField_DataType(), theBasePackage.getDataType(), null, "dataType", null, 1, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", "false", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_Encrypt(), ecorePackage.getEBoolean(), "encrypt", "false", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_InterfaceType(), ecorePackage.getEString(), "interfaceType", null, 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateFieldEClass, DateField.class, "DateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateField_Details(), thePersistencePackage.getDateDetails(), "details", "DateOnly", 1, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateField_Format(), ecorePackage.getEString(), "format", null, 0, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(captchaFieldEClass, CaptchaField.class, "CaptchaField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitSupportActionEClass, UnitSupportAction.class, "UnitSupportAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitSupportAction_Disable(), ecorePackage.getEBoolean(), "disable", null, 0, 1, UnitSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitSupportAction_ConfirmMessage(), ecorePackage.getEString(), "confirmMessage", null, 0, 1, UnitSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(selectableUnitEClass, SelectableUnit.class, "SelectableUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singletonUnitEClass, SingletonUnit.class, "SingletonUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingletonUnit_ContentType(), thePersistencePackage.getEntityOrView(), null, "contentType", null, 1, 1, SingletonUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionUnitEClass, CollectionUnit.class, "CollectionUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionUnit_ContentType(), thePersistencePackage.getEntityOrView(), null, "contentType", null, 1, -1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Selection(), theServicePackage.getSelection(), null, "selection", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_FindContainerSelection(), theServicePackage.getSelection(), null, "findContainerSelection", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_OmitContainerLoad(), ecorePackage.getEBoolean(), "omitContainerLoad", "false", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_PaginationParent(), thePersistencePackage.getEntityOrView(), null, "paginationParent", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_FindElementSelection(), theServicePackage.getSelection(), null, "findElementSelection", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Filter(), theServicePackage.getFilter(), null, "filter", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_SupportedFilters(), theServicePackage.getFilter(), null, "supportedFilters", null, 0, -1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Badges(), this.getBadge(), null, "badges", null, 0, -1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_EmptyMessage(), ecorePackage.getEString(), "emptyMessage", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_DefaultPaginationSize(), ecorePackage.getEInt(), "defaultPaginationSize", "10", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_MaximumPaginationSize(), ecorePackage.getEInt(), "maximumPaginationSize", "100", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_NextNpages(), ecorePackage.getEInt(), "nextNpages", "2", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousNpages(), ecorePackage.getEInt(), "previousNpages", "2", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_NextPageLabel(), ecorePackage.getEString(), "nextPageLabel", "&gt;", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_NextPageIconName(), ecorePackage.getEString(), "nextPageIconName", "chevron_right", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousPageLabel(), ecorePackage.getEString(), "previousPageLabel", "&lt;", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousPageIconName(), ecorePackage.getEString(), "previousPageIconName", "chevron_left", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_UseDisabledPageLinks(), ecorePackage.getEBoolean(), "useDisabledPageLinks", "true", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_UseFirstLastPageLinks(), ecorePackage.getEBoolean(), "useFirstLastPageLinks", "false", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_FirstPageLabel(), ecorePackage.getEString(), "firstPageLabel", "<<", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_FirstPageIconName(), ecorePackage.getEString(), "firstPageIconName", "first_page", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_LastPageLabel(), ecorePackage.getEString(), "lastPageLabel", ">>", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_LastPageIconName(), ecorePackage.getEString(), "lastPageIconName", "last_page", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PaginationClass(), ecorePackage.getEString(), "paginationClass", "pagination", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PaginationElementClass(), ecorePackage.getEString(), "paginationElementClass", "waves_effect", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editUnitEClass, EditUnit.class, "EditUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditUnit_DisableWhen(), theExpressionPackage.getPredicate(), null, "disableWhen", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_Title(), thePersistencePackage.getLabel(), null, "title", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEditUnit_ConfirmDestination(), this.getPage(), null, "confirmDestination", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_ConfirmLabel(), ecorePackage.getEString(), "confirmLabel", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEditUnit_CancelDestination(), this.getPage(), null, "cancelDestination", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_CancelLabel(), ecorePackage.getEString(), "cancelLabel", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "edit_content,framed", 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_CustomiseValues(), ecorePackage.getEBoolean(), "customiseValues", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createUnitEClass, CreateUnit.class, "CreateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,create_unit", 0, 1, CreateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(createUpdateUnitEClass, CreateUpdateUnit.class, "CreateUpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateUpdateUnit_OnSaveContinueEditing(), ecorePackage.getEBoolean(), "onSaveContinueEditing", "false", 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateUpdateUnit_CreateUriElement(), ecorePackage.getEString(), "createUriElement", "", 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateUpdateUnit_ClearLabel(), ecorePackage.getEString(), "clearLabel", null, 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreateUpdateUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,create_unit,update_unit", 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(updateUnitEClass, UpdateUnit.class, "UpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateUnit_OnSaveContinueEditing(), ecorePackage.getEBoolean(), "onSaveContinueEditing", "false", 0, 1, UpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,update_unit", 0, 1, UpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mapUnitEClass, MapUnit.class, "MapUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapUnit_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", "true", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapUnit_DefaultZoomLevel(), ecorePackage.getEInt(), "defaultZoomLevel", "12", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,map_unit", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMapUnit_Location(), thePersistencePackage.getLocationAttribute(), null, "location", null, 1, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapUnit_PlaceName(), thePersistencePackage.getAttribute(), null, "placeName", null, 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataUnitEClass, DataUnit.class, "DataUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataUnit_Title(), thePersistencePackage.getLabel(), null, "title", null, 0, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(detailsUnitEClass, DetailsUnit.class, "DetailsUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetailsUnit_Selection(), theServicePackage.getSelection(), null, "selection", null, 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailsUnit_OmitFieldLabels(), ecorePackage.getEBoolean(), "omitFieldLabels", "false", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailsUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,details_unit", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailsUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "details_content", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(indexUnitEClass, IndexUnit.class, "IndexUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexUnit_DisplayOption(), this.getIndexDisplayOption(), "displayOption", "Grid", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_OmitColumnLabels(), ecorePackage.getEBoolean(), "omitColumnLabels", "false", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,index_unit", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "striped,responsive-table", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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
		initEReference(getImageUnit_Title(), thePersistencePackage.getLabel(), null, "title", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImageUnit_ImagePathFeature(), this.getFeaturePath(), null, "imagePathFeature", null, 1, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_ImageTitleFeature(), this.getFeaturePath(), null, "imageTitleFeature", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUnit_TruncateImageTitle(), ecorePackage.getEBoolean(), "truncateImageTitle", "false", 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUnit_MissingImagePath(), ecorePackage.getEString(), "missingImagePath", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_ImageFilter(), theImagePackage.getImageManipulation(), null, "imageFilter", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageIndexUnitEClass, ImageIndexUnit.class, "ImageIndexUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageIndexUnit_OverlayTitle(), ecorePackage.getEBoolean(), "overlayTitle", "false", 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageIndexUnit_OmitFieldLabels(), ecorePackage.getEBoolean(), "omitFieldLabels", "false", 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImageIndexUnit_OverlaySingleSelectAction(), ecorePackage.getEBoolean(), "overlaySingleSelectAction", null, 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageIndexUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,image_index_unit", 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImageIndexUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "row", 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImageIndexUnit_ColumnClass(), ecorePackage.getEString(), "columnClass", "col s12 m6 l3", 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImageIndexUnit_CardClass(), ecorePackage.getEString(), "cardClass", "card", 0, 1, ImageIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sliderUnitEClass, SliderUnit.class, "SliderUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSliderUnit_ShowTime(), ecorePackage.getEInt(), "showTime", "-1", 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSliderUnit_TransitionTime(), ecorePackage.getEInt(), "transitionTime", "-1", 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSliderUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,slider_unit", 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSliderUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "slider_content", 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(galleryUnitEClass, GalleryUnit.class, "GalleryUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGalleryUnit_FullSizeFilter(), theImagePackage.getImageManipulation(), null, "fullSizeFilter", null, 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalleryUnit_ShowTime(), ecorePackage.getEInt(), "showTime", "-1", 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalleryUnit_TransitionTime(), ecorePackage.getEInt(), "transitionTime", "-1", 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getInlineAction_IconName(), ecorePackage.getEString(), "iconName", "", 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_Disable(), ecorePackage.getEBoolean(), "disable", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInlineAction_DisplayWhen(), theExpressionPackage.getPredicate(), null, "displayWhen", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_Header(), ecorePackage.getEString(), "header", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_HeaderClass(), ecorePackage.getEString(), "headerClass", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_FooterClass(), ecorePackage.getEString(), "footerClass", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectActionEClass, SelectAction.class, "SelectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectAction_Target(), this.getSelectableUnit(), null, "target", null, 1, 1, SelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectAction_ValuePath(), this.getFeaturePath(), null, "valuePath", null, 0, 1, SelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteActionEClass, DeleteAction.class, "DeleteAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeleteAction_Destination(), this.getPage(), null, "destination", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_ConfirmMessage(), ecorePackage.getEString(), "confirmMessage", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_RequiresRole(), ecorePackage.getEString(), "requiresRole", "", 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeleteAction_EnableWhen(), theExpressionPackage.getPredicate(), null, "enableWhen", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSupportActionEClass, FeatureSupportAction.class, "FeatureSupportAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureSupportAction_Operation(), theServicePackage.getBusinessOperation(), null, "operation", null, 1, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_ConfirmMessage(), ecorePackage.getEString(), "confirmMessage", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_FileExtension(), ecorePackage.getEString(), "fileExtension", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_RequiresRole(), ecorePackage.getEString(), "requiresRole", "", 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureSupportAction_EnableWhen(), theExpressionPackage.getPredicate(), null, "enableWhen", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgeEClass, Badge.class, "Badge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadge_IconName(), ecorePackage.getEString(), "iconName", "", 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBadge_Value(), theExpressionPackage.getExpression(), null, "value", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBadge_DisplayWhen(), theExpressionPackage.getPredicate(), null, "displayWhen", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBadge_NewWhen(), theExpressionPackage.getPredicate(), null, "newWhen", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (webUIEClass, 
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
		  (collectionUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "selectionMustNotBeSingleton"
		   });	
		addAnnotation
		  (editUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "canOnlyTitleWithSingletons"
		   });	
		addAnnotation
		  (dataUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "canOnlyTitleWithSingletons"
		   });	
		addAnnotation
		  (detailsUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "selectionValidChoice selectionMustBeSingleton"
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
		  (webUIEClass, 
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
		  (getContentUnit_PageDisplayedOn(), 
		   source, 
		   new String[] {
			 "derivation", "if displayedOn.oclIsTypeOf(Page) then\r\n\tdisplayedOn.oclAsType(Page)\r\nelse\r\n\tdisplayedOn.oclAsType(UnitAssociation).displayedOn.pageDisplayedOn\r\nendif"
		   });	
		addAnnotation
		  (dynamicUnitEClass, 
		   source, 
		   new String[] {
			 "featuresMustBeFromContentType", "let entities : OrderedSet(persistence::EntityOrView)\r\n\t= if self.oclIsKindOf(SingletonUnit) then\r\n\t\t\tOrderedSet{self.oclAsType(SingletonUnit).contentType}\r\n\t\telse if self.oclIsKindOf(CollectionUnit) then\r\n\t\t\tself.oclAsType(CollectionUnit).contentType\r\n\t\telse\r\n\t\t\tOrderedSet{}\r\n\t\tendif endif\r\n\tin let eovFeatures : Collection(persistence::Feature)\r\n\t\t= entities->collect(eov | eov.allFeatures)\r\n\t\tin displayFields\r\n\t\t\t->select(f | f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\r\n\t\t\t->select(f | \r\n\t\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n\t\t\t\t\tnot f.oclAsType(UnitElement).attribute.oclIsUndefined()\r\n\t\t\t\telse\r\n\t\t\t\t\tnot f.oclAsType(UnitAssociation).association.oclIsUndefined()\r\n\t\t\t\tendif)\r\n\t\t\t->forAll(f | \r\n\t\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n\t\t\t\t\teovFeatures->includes(f.oclAsType(UnitElement).attribute)\r\n\t\t\t\telse\r\n\t\t\t\t\teovFeatures->includes(f.oclAsType(UnitAssociation).association)\r\n\t\t\t\tendif)"
		   });	
		addAnnotation
		  (unitFeatureEClass, 
		   source, 
		   new String[] {
			 "atMostOneSelectAction", "actions->select(a | a.oclIsKindOf(SelectAction))->size() < 2",
			 "noDeleteActions", "actions->select(a | a.oclIsKindOf(DeleteAction))->isEmpty()"
		   });	
		addAnnotation
		  (getUnitElement_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse if attribute.oclIsKindOf(persistence::EncapsulatedAttribute) then\r\n\tattribute.oclAsType(persistence::EncapsulatedAttribute).name\r\nelse\r\n\tattribute.oclAsType(persistence::EntityAttribute).name\r\nendif endif"
		   });	
		addAnnotation
		  (unitAssociationEClass, 
		   source, 
		   new String[] {
			 "selectionValidChoice", "not selection.oclIsUndefined() implies\r\n\tdisplayedOn.pageDisplayedOn.webUI.services.services\r\n\t\t->select(s : service::Service | not s.serves.oclIsUndefined())\r\n\t\t->select(s : service::Service | s.serves = targetEntity)\r\n\t\t->collect(s : service::Service | s.selections)\r\n\t\t->includes(selection)"
		   });	
		addAnnotation
		  (getUnitAssociation_IsSourceAssociation(), 
		   source, 
		   new String[] {
			 "derivation", "not association.oclIsUndefined() implies\r\n\tlet entities : OrderedSet(persistence::EntityOrView)\r\n\t\t= if displayedOn.oclIsKindOf(SingletonUnit) then\r\n\t\t\t\tOrderedSet{displayedOn.oclAsType(SingletonUnit).contentType}\r\n\t\t\telse if displayedOn.oclIsKindOf(CollectionUnit) then\r\n\t\t\t\tdisplayedOn.oclAsType(CollectionUnit).contentType\r\n\t\t\telse\r\n\t\t\t\tOrderedSet{}\r\n\t\t\tendif endif\r\n\t\tin entities->collect(e | e.associations)->includes(association)"
		   });	
		addAnnotation
		  (getUnitAssociation_SourceEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getUnitAssociation_TargetEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getAssociationReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\t\'\'\r\nelse if association.oclIsKindOf(persistence::EntityAssociation) then\r\n\tassociation.oclAsType(persistence::EntityAssociation).name\r\nelse if association.oclIsTypeOf(persistence::EncapsulatedAssociation) then\r\n\tassociation.oclAsType(persistence::EncapsulatedAssociation).name\r\nelse\r\n\tassociation.oclAsType(persistence::ViewAssociation).name \r\nendif endif endif\r\n"
		   });	
		addAnnotation
		  (getChildPathAttribute_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse if attribute.oclIsKindOf(persistence::EntityAttribute) then\r\n\tattribute.oclAsType(persistence::EntityAttribute).name\r\nelse\r\n\tattribute.oclAsType(persistence::EncapsulatedAttribute).name\r\nendif endif"
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
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getChildPathAssociation_TargetEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getFeaturePathAttribute_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse if attribute.oclIsKindOf(persistence::EntityAttribute) then\r\n\tattribute.oclAsType(persistence::EntityAttribute).name\r\nelse\r\n\tattribute.oclAsType(persistence::EncapsulatedAttribute).name\r\nendif endif\r\n"
		   });	
		addAnnotation
		  (getFeaturePathAssociation_IsSourceAssociation(), 
		   source, 
		   new String[] {
			 "derivation", "-- not association.oclIsUndefined() implies\r\n--\tlet unit : DynamicUnit\r\n--\t\t= self.eContainer().oclAsType(DynamicUnit)\r\n--\t\tin let entities : OrderedSet(persistence::EntityOrView)\r\n--\t\t\t= if unit.oclIsKindOf(SingletonUnit) then\r\n--\t\t\t\t\tOrderedSet{unit.oclAsType(SingletonUnit).contentType}\r\n--\t\t\t\telse if unit.oclIsKindOf(CollectionUnit) then\r\n--\t\t\t\t\tunit.oclAsType(CollectionUnit).contentType\r\n--\t\t\t\telse\r\n--\t\t\t\t\tunit.entities\r\n--\t\t\t\tendif endif\r\n--\t\t\tin entities->collect(eov | eov.associations)->includes(association)\r\ntrue"
		   });	
		addAnnotation
		  (getFeaturePathAssociation_SourceEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getFeaturePathAssociation_TargetEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getFeaturePathLabel_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if label.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tlabel.name\r\nendif\r\n"
		   });	
		addAnnotation
		  (collectionUnitEClass, 
		   source, 
		   new String[] {
			 "selectionMustNotBeSingleton", "not selection.oclIsUndefined() implies\r\n\tselection.limit <> 1"
		   });	
		addAnnotation
		  (editUnitEClass, 
		   source, 
		   new String[] {
			 "canOnlyTitleWithSingletons", "not title.oclIsUndefined() implies \r\n\tif title.oclIsKindOf(persistence::EntityAttribute) then\r\n\t\ttitle.oclAsType(persistence::EntityAttribute).cardinality <> persistence::Cardinality::Many\r\n\telse if title.oclIsKindOf(persistence::EncapsulatedAttribute) then\r\n\t\ttitle.oclAsType(persistence::EncapsulatedAttribute).cardinality <> persistence::Cardinality::Many\r\n\telse\r\n\t\ttrue\r\n\tendif endif"
		   });	
		addAnnotation
		  (dataUnitEClass, 
		   source, 
		   new String[] {
			 "canOnlyTitleWithSingletons", "not title.oclIsUndefined() implies \r\n\tif title.oclIsKindOf(persistence::EntityAttribute) then\r\n\t\ttitle.oclAsType(persistence::EntityAttribute).cardinality <> persistence::Cardinality::Many\r\n\telse if title.oclIsKindOf(persistence::EncapsulatedAttribute) then\r\n\t\ttitle.oclAsType(persistence::EncapsulatedAttribute).cardinality <> persistence::Cardinality::Many\r\n\telse\r\n\t\ttrue\r\n\tendif endif"
		   });	
		addAnnotation
		  (detailsUnitEClass, 
		   source, 
		   new String[] {
			 "selectionMustBeSingleton", "not selection.oclIsUndefined() implies\r\n\tselection.limit = 1",
			 "selectionValidChoice", "not selection.oclIsUndefined() implies\r\n\tpageDisplayedOn.webUI.services.services\r\n\t\t->select(s : service::Service | not s.serves.oclIsUndefined())\r\n\t\t->select(s : service::Service | contentType = s.serves)\r\n\t\t->collect(s : service::Service | s.selections)\r\n\t\t->includes(selection)"
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
			 "canOnlyDeleteSingletons", "if usedBy.oclIsKindOf(UnitElement) then\r\n\tlet attribute : persistence::Attribute\r\n\t\t= usedBy.oclAsType(UnitElement).attribute\r\n\t\tin if attribute.oclIsKindOf(persistence::EntityAttribute) then\r\n\t\t\t\tattribute.oclAsType(persistence::EntityAttribute).cardinality <> persistence::Cardinality::Many\r\n\t\t\telse\r\n\t\t\t\tattribute.oclAsType(persistence::EncapsulatedAttribute).cardinality <> persistence::Cardinality::Many\r\n\t\t\tendif\r\nelse if usedBy.oclIsKindOf(UnitAssociation) then\r\n\tlet association : persistence::Association\r\n\t\t= usedBy.oclAsType(UnitAssociation).association\r\n\t\tin if association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\t\tassociation.oclAsType(persistence::EntityAssociation).cardinality <> persistence::Cardinality::Many\r\n\t\t\telse if association.oclIsKindOf(persistence::EncapsulatedAssociation) then\r\n\t\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).cardinality <> persistence::Cardinality::Many\r\n\t\t\telse\r\n\t\t\t\tfalse -- association.oclAsType(ViewAssociation)\r\n\t\t\tendif endif\r\nelse\r\n\tusedBy.oclIsKindOf(CollectionUnit)\r\nendif endif\r\n"
		   });
	}

} //WebuiPackageImpl

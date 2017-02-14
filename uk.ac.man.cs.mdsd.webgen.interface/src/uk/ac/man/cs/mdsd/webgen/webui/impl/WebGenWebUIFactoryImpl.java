/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.man.cs.mdsd.webgen.webui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebGenWebUIFactoryImpl extends EFactoryImpl implements WebGenWebUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebGenWebUIFactory init() {
		try {
			WebGenWebUIFactory theWebGenWebUIFactory = (WebGenWebUIFactory)EPackage.Registry.INSTANCE.getEFactory(WebGenWebUIPackage.eNS_URI);
			if (theWebGenWebUIFactory != null) {
				return theWebGenWebUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebGenWebUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenWebUIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebGenWebUIPackage.WEB_UI: return createWebUI();
			case WebGenWebUIPackage.PAGE: return createPage();
			case WebGenWebUIPackage.PAGE_LINK: return createPageLink();
			case WebGenWebUIPackage.STATIC_MENU: return createStaticMenu();
			case WebGenWebUIPackage.ACTION_MENU_ENTRY: return createActionMenuEntry();
			case WebGenWebUIPackage.EDIT_STATIC_TEXT_MENU_ENTRY: return createEditStaticTextMenuEntry();
			case WebGenWebUIPackage.DYNAMIC_MENU: return createDynamicMenu();
			case WebGenWebUIPackage.MENU_FEATURE: return createMenuFeature();
			case WebGenWebUIPackage.FILTER: return createFilter();
			case WebGenWebUIPackage.FILTER_PARAMETER: return createFilterParameter();
			case WebGenWebUIPackage.QUERY: return createQuery();
			case WebGenWebUIPackage.QUERY_PARAMETER: return createQueryParameter();
			case WebGenWebUIPackage.STATIC_UNIT: return createStaticUnit();
			case WebGenWebUIPackage.CREATE_SITEMAP_UNIT: return createCreateSitemapUnit();
			case WebGenWebUIPackage.UNIT_ATTRIBUTE: return createUnitAttribute();
			case WebGenWebUIPackage.UNIT_ASSOCIATION: return createUnitAssociation();
			case WebGenWebUIPackage.DATA_TYPE_FIELD: return createDataTypeField();
			case WebGenWebUIPackage.DATE_FIELD: return createDateField();
			case WebGenWebUIPackage.CAPTCHA_FIELD: return createCaptchaField();
			case WebGenWebUIPackage.UNIT_SUPPORT_ACTION: return createUnitSupportAction();
			case WebGenWebUIPackage.CREATE_UNIT: return createCreateUnit();
			case WebGenWebUIPackage.CREATE_UPDATE_UNIT: return createCreateUpdateUnit();
			case WebGenWebUIPackage.UPDATE_UNIT: return createUpdateUnit();
			case WebGenWebUIPackage.MAP_UNIT: return createMapUnit();
			case WebGenWebUIPackage.DETAILS_UNIT: return createDetailsUnit();
			case WebGenWebUIPackage.INDEX_UNIT: return createIndexUnit();
			case WebGenWebUIPackage.SEARCH_UNIT: return createSearchUnit();
			case WebGenWebUIPackage.FEATURE_PATH_ATTRIBUTE: return createFeaturePathAttribute();
			case WebGenWebUIPackage.FEATURE_PATH_ASSOCIATION: return createFeaturePathAssociation();
			case WebGenWebUIPackage.CHILD_PATH_ATTRIBUTE: return createChildPathAttribute();
			case WebGenWebUIPackage.CHILD_PATH_ASSOCIATION: return createChildPathAssociation();
			case WebGenWebUIPackage.IMAGE_INDEX_UNIT: return createImageIndexUnit();
			case WebGenWebUIPackage.SLIDER_UNIT: return createSliderUnit();
			case WebGenWebUIPackage.GALLERY_UNIT: return createGalleryUnit();
			case WebGenWebUIPackage.REGISTRATION_UNIT: return createRegistrationUnit();
			case WebGenWebUIPackage.LOGIN_UNIT: return createLoginUnit();
			case WebGenWebUIPackage.FORGOTTEN_PASSWORD_UNIT: return createForgottenPasswordUnit();
			case WebGenWebUIPackage.SELECT_ACTION: return createSelectAction();
			case WebGenWebUIPackage.DELETE_ACTION: return createDeleteAction();
			case WebGenWebUIPackage.FEATURE_SUPPORT_ACTION: return createFeatureSupportAction();
			case WebGenWebUIPackage.MODEL_REFERENCE: return createModelReference();
			case WebGenWebUIPackage.ROUTE_PARAMETER_REFERENCE: return createRouteParameterReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WebGenWebUIPackage.INPUT_TECHNOLOGIES:
				return createInputTechnologiesFromString(eDataType, initialValue);
			case WebGenWebUIPackage.AJAX_TECHNOLOGIES:
				return createAjaxTechnologiesFromString(eDataType, initialValue);
			case WebGenWebUIPackage.PAGE_TOP_MENU_OPTIONS:
				return createPageTopMenuOptionsFromString(eDataType, initialValue);
			case WebGenWebUIPackage.COLLECTION_DISPLAY_OPTIONS:
				return createCollectionDisplayOptionsFromString(eDataType, initialValue);
			case WebGenWebUIPackage.INDEX_DISPLAY_OPTION:
				return createIndexDisplayOptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WebGenWebUIPackage.INPUT_TECHNOLOGIES:
				return convertInputTechnologiesToString(eDataType, instanceValue);
			case WebGenWebUIPackage.AJAX_TECHNOLOGIES:
				return convertAjaxTechnologiesToString(eDataType, instanceValue);
			case WebGenWebUIPackage.PAGE_TOP_MENU_OPTIONS:
				return convertPageTopMenuOptionsToString(eDataType, instanceValue);
			case WebGenWebUIPackage.COLLECTION_DISPLAY_OPTIONS:
				return convertCollectionDisplayOptionsToString(eDataType, instanceValue);
			case WebGenWebUIPackage.INDEX_DISPLAY_OPTION:
				return convertIndexDisplayOptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebUI createWebUI() {
		WebUIImpl webUI = new WebUIImpl();
		return webUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageLink createPageLink() {
		PageLinkImpl pageLink = new PageLinkImpl();
		return pageLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticMenu createStaticMenu() {
		StaticMenuImpl staticMenu = new StaticMenuImpl();
		return staticMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionMenuEntry createActionMenuEntry() {
		ActionMenuEntryImpl actionMenuEntry = new ActionMenuEntryImpl();
		return actionMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditStaticTextMenuEntry createEditStaticTextMenuEntry() {
		EditStaticTextMenuEntryImpl editStaticTextMenuEntry = new EditStaticTextMenuEntryImpl();
		return editStaticTextMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicMenu createDynamicMenu() {
		DynamicMenuImpl dynamicMenu = new DynamicMenuImpl();
		return dynamicMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuFeature createMenuFeature() {
		MenuFeatureImpl menuFeature = new MenuFeatureImpl();
		return menuFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterParameter createFilterParameter() {
		FilterParameterImpl filterParameter = new FilterParameterImpl();
		return filterParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParameter createQueryParameter() {
		QueryParameterImpl queryParameter = new QueryParameterImpl();
		return queryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticUnit createStaticUnit() {
		StaticUnitImpl staticUnit = new StaticUnitImpl();
		return staticUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSitemapUnit createCreateSitemapUnit() {
		CreateSitemapUnitImpl createSitemapUnit = new CreateSitemapUnitImpl();
		return createSitemapUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAttribute createUnitAttribute() {
		UnitAttributeImpl unitAttribute = new UnitAttributeImpl();
		return unitAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAssociation createUnitAssociation() {
		UnitAssociationImpl unitAssociation = new UnitAssociationImpl();
		return unitAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeField createDataTypeField() {
		DataTypeFieldImpl dataTypeField = new DataTypeFieldImpl();
		return dataTypeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateField createDateField() {
		DateFieldImpl dateField = new DateFieldImpl();
		return dateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptchaField createCaptchaField() {
		CaptchaFieldImpl captchaField = new CaptchaFieldImpl();
		return captchaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSupportAction createUnitSupportAction() {
		UnitSupportActionImpl unitSupportAction = new UnitSupportActionImpl();
		return unitSupportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateUnit createCreateUnit() {
		CreateUnitImpl createUnit = new CreateUnitImpl();
		return createUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateUpdateUnit createCreateUpdateUnit() {
		CreateUpdateUnitImpl createUpdateUnit = new CreateUpdateUnitImpl();
		return createUpdateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateUnit createUpdateUnit() {
		UpdateUnitImpl updateUnit = new UpdateUnitImpl();
		return updateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapUnit createMapUnit() {
		MapUnitImpl mapUnit = new MapUnitImpl();
		return mapUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailsUnit createDetailsUnit() {
		DetailsUnitImpl detailsUnit = new DetailsUnitImpl();
		return detailsUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexUnit createIndexUnit() {
		IndexUnitImpl indexUnit = new IndexUnitImpl();
		return indexUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchUnit createSearchUnit() {
		SearchUnitImpl searchUnit = new SearchUnitImpl();
		return searchUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePathAttribute createFeaturePathAttribute() {
		FeaturePathAttributeImpl featurePathAttribute = new FeaturePathAttributeImpl();
		return featurePathAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePathAssociation createFeaturePathAssociation() {
		FeaturePathAssociationImpl featurePathAssociation = new FeaturePathAssociationImpl();
		return featurePathAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildPathAttribute createChildPathAttribute() {
		ChildPathAttributeImpl childPathAttribute = new ChildPathAttributeImpl();
		return childPathAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildPathAssociation createChildPathAssociation() {
		ChildPathAssociationImpl childPathAssociation = new ChildPathAssociationImpl();
		return childPathAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageIndexUnit createImageIndexUnit() {
		ImageIndexUnitImpl imageIndexUnit = new ImageIndexUnitImpl();
		return imageIndexUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliderUnit createSliderUnit() {
		SliderUnitImpl sliderUnit = new SliderUnitImpl();
		return sliderUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GalleryUnit createGalleryUnit() {
		GalleryUnitImpl galleryUnit = new GalleryUnitImpl();
		return galleryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationUnit createRegistrationUnit() {
		RegistrationUnitImpl registrationUnit = new RegistrationUnitImpl();
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUnit createLoginUnit() {
		LoginUnitImpl loginUnit = new LoginUnitImpl();
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnit createForgottenPasswordUnit() {
		ForgottenPasswordUnitImpl forgottenPasswordUnit = new ForgottenPasswordUnitImpl();
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectAction createSelectAction() {
		SelectActionImpl selectAction = new SelectActionImpl();
		return selectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteAction createDeleteAction() {
		DeleteActionImpl deleteAction = new DeleteActionImpl();
		return deleteAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSupportAction createFeatureSupportAction() {
		FeatureSupportActionImpl featureSupportAction = new FeatureSupportActionImpl();
		return featureSupportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference createModelReference() {
		ModelReferenceImpl modelReference = new ModelReferenceImpl();
		return modelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteParameterReference createRouteParameterReference() {
		RouteParameterReferenceImpl routeParameterReference = new RouteParameterReferenceImpl();
		return routeParameterReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputTechnologies createInputTechnologiesFromString(EDataType eDataType, String initialValue) {
		InputTechnologies result = InputTechnologies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputTechnologiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjaxTechnologies createAjaxTechnologiesFromString(EDataType eDataType, String initialValue) {
		AjaxTechnologies result = AjaxTechnologies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAjaxTechnologiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageTopMenuOptions createPageTopMenuOptionsFromString(EDataType eDataType, String initialValue) {
		PageTopMenuOptions result = PageTopMenuOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPageTopMenuOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDisplayOptions createCollectionDisplayOptionsFromString(EDataType eDataType, String initialValue) {
		CollectionDisplayOptions result = CollectionDisplayOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionDisplayOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexDisplayOption createIndexDisplayOptionFromString(EDataType eDataType, String initialValue) {
		IndexDisplayOption result = IndexDisplayOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndexDisplayOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenWebUIPackage getWebGenWebUIPackage() {
		return (WebGenWebUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebGenWebUIPackage getPackage() {
		return WebGenWebUIPackage.eINSTANCE;
	}

} //WebGenWebUIFactoryImpl

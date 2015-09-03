/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.man.cs.mdsd.waf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WafFactoryImpl extends EFactoryImpl implements WafFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WafFactory init() {
		try {
			WafFactory theWafFactory = (WafFactory)EPackage.Registry.INSTANCE.getEFactory(WafPackage.eNS_URI);
			if (theWafFactory != null) {
				return theWafFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WafFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WafFactoryImpl() {
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
			case WafPackage.WAF_MODEL: return createWafModel();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM: return createLocalAuthenticationSystem();
			case WafPackage.CAS_AUTHENTICATION: return createCasAuthentication();
			case WafPackage.SERVICE: return createService();
			case WafPackage.MODEL_LABEL_X: return createModelLabelX();
			case WafPackage.MODEL_LABEL_ELEMENT_X: return createModelLabelElementX();
			case WafPackage.MODEL_LABEL_ASSOCIATION_X: return createModelLabelAssociationX();
			case WafPackage.SELECTION: return createSelection();
			case WafPackage.SELECTION_PARAMETER: return createSelectionParameter();
			case WafPackage.SERVICE_FEATURE: return createServiceFeature();
			case WafPackage.SERVICE_ATTRIBUTE: return createServiceAttribute();
			case WafPackage.SERVICE_ASSOCIATION: return createServiceAssociation();
			case WafPackage.STATIC_MENU: return createStaticMenu();
			case WafPackage.DYNAMIC_MENU: return createDynamicMenu();
			case WafPackage.ACTION_MENU_ENTRY: return createActionMenuEntry();
			case WafPackage.FIXED_COMMAND_MENU_ENTRY: return createFixedCommandMenuEntry();
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY: return createEditStaticTextMenuEntry();
			case WafPackage.PAGE: return createPage();
			case WafPackage.QUERY: return createQuery();
			case WafPackage.QUERY_PARAMETER: return createQueryParameter();
			case WafPackage.QUERY_INSTANCE: return createQueryInstance();
			case WafPackage.QUERY_ACTUAL: return createQueryActual();
			case WafPackage.STATIC_UNIT: return createStaticUnit();
			case WafPackage.COMMAND_UNIT: return createCommandUnit();
			case WafPackage.UNIT_SUPPORT_ACTION: return createUnitSupportAction();
			case WafPackage.UNIT_ELEMENT: return createUnitElement();
			case WafPackage.UNIT_ASSOCIATION: return createUnitAssociation();
			case WafPackage.UNIT_CHILD_ELEMENT: return createUnitChildElement();
			case WafPackage.UNIT_CHILD_ASSOCIATION: return createUnitChildAssociation();
			case WafPackage.DATA_TYPE_FIELD: return createDataTypeField();
			case WafPackage.DATE_FIELD: return createDateField();
			case WafPackage.CAPTCHA_FIELD: return createCaptchaField();
			case WafPackage.CREATE_UNIT: return createCreateUnit();
			case WafPackage.CREATE_UPDATE_UNIT: return createCreateUpdateUnit();
			case WafPackage.MAP_UNIT: return createMapUnit();
			case WafPackage.UPDATE_UNIT: return createUpdateUnit();
			case WafPackage.DETAILS_UNIT: return createDetailsUnit();
			case WafPackage.INDEX_GRID_UNIT: return createIndexGridUnit();
			case WafPackage.INDEX_PAGE_DIRECTION_UNIT: return createIndexPageDirectionUnit();
			case WafPackage.INDEX_LINE_DIRECTION_UNIT: return createIndexLineDirectionUnit();
			case WafPackage.SEARCH_UNIT: return createSearchUnit();
			case WafPackage.ACTION_UNIT: return createActionUnit();
			case WafPackage.REGISTRATION_UNIT: return createRegistrationUnit();
			case WafPackage.LOGIN_UNIT: return createLoginUnit();
			case WafPackage.FORGOTTEN_PASSWORD_UNIT: return createForgottenPasswordUnit();
			case WafPackage.SELECT_ACTION: return createSelectAction();
			case WafPackage.DELETE_ACTION: return createDeleteAction();
			case WafPackage.FEATURE_SUPPORT_ACTION: return createFeatureSupportAction();
			case WafPackage.MODEL_REFERENCE: return createModelReference();
			case WafPackage.FEATURE_REFERENCE: return createFeatureReference();
			case WafPackage.PARAMETER_REFERENCE: return createParameterReference();
			case WafPackage.CURRENT_USER_REFERENCE: return createCurrentUserReference();
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
			case WafPackage.FRAMEWORK_TECHNOLOGIES:
				return createFrameworkTechnologiesFromString(eDataType, initialValue);
			case WafPackage.AJAX_TECHNOLOGIES:
				return createAjaxTechnologiesFromString(eDataType, initialValue);
			case WafPackage.PAGE_TOP_MENU_OPTIONS:
				return createPageTopMenuOptionsFromString(eDataType, initialValue);
			case WafPackage.COLLECTION_DISPLAY_OPTIONS:
				return createCollectionDisplayOptionsFromString(eDataType, initialValue);
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
			case WafPackage.FRAMEWORK_TECHNOLOGIES:
				return convertFrameworkTechnologiesToString(eDataType, instanceValue);
			case WafPackage.AJAX_TECHNOLOGIES:
				return convertAjaxTechnologiesToString(eDataType, instanceValue);
			case WafPackage.PAGE_TOP_MENU_OPTIONS:
				return convertPageTopMenuOptionsToString(eDataType, instanceValue);
			case WafPackage.COLLECTION_DISPLAY_OPTIONS:
				return convertCollectionDisplayOptionsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WafModel createWafModel() {
		WafModelImpl wafModel = new WafModelImpl();
		return wafModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem createLocalAuthenticationSystem() {
		LocalAuthenticationSystemImpl localAuthenticationSystem = new LocalAuthenticationSystemImpl();
		return localAuthenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasAuthentication createCasAuthentication() {
		CasAuthenticationImpl casAuthentication = new CasAuthenticationImpl();
		return casAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabelX createModelLabelX() {
		ModelLabelXImpl modelLabelX = new ModelLabelXImpl();
		return modelLabelX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabelElementX createModelLabelElementX() {
		ModelLabelElementXImpl modelLabelElementX = new ModelLabelElementXImpl();
		return modelLabelElementX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabelAssociationX createModelLabelAssociationX() {
		ModelLabelAssociationXImpl modelLabelAssociationX = new ModelLabelAssociationXImpl();
		return modelLabelAssociationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionParameter createSelectionParameter() {
		SelectionParameterImpl selectionParameter = new SelectionParameterImpl();
		return selectionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFeature createServiceFeature() {
		ServiceFeatureImpl serviceFeature = new ServiceFeatureImpl();
		return serviceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAttribute createServiceAttribute() {
		ServiceAttributeImpl serviceAttribute = new ServiceAttributeImpl();
		return serviceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAssociation createServiceAssociation() {
		ServiceAssociationImpl serviceAssociation = new ServiceAssociationImpl();
		return serviceAssociation;
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
	public DynamicMenu createDynamicMenu() {
		DynamicMenuImpl dynamicMenu = new DynamicMenuImpl();
		return dynamicMenu;
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
	public FixedCommandMenuEntry createFixedCommandMenuEntry() {
		FixedCommandMenuEntryImpl fixedCommandMenuEntry = new FixedCommandMenuEntryImpl();
		return fixedCommandMenuEntry;
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
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
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
	public QueryInstance createQueryInstance() {
		QueryInstanceImpl queryInstance = new QueryInstanceImpl();
		return queryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryActual createQueryActual() {
		QueryActualImpl queryActual = new QueryActualImpl();
		return queryActual;
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
	public CommandUnit createCommandUnit() {
		CommandUnitImpl commandUnit = new CommandUnitImpl();
		return commandUnit;
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
	public UnitElement createUnitElement() {
		UnitElementImpl unitElement = new UnitElementImpl();
		return unitElement;
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
	public UnitChildElement createUnitChildElement() {
		UnitChildElementImpl unitChildElement = new UnitChildElementImpl();
		return unitChildElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitChildAssociation createUnitChildAssociation() {
		UnitChildAssociationImpl unitChildAssociation = new UnitChildAssociationImpl();
		return unitChildAssociation;
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
	public MapUnit createMapUnit() {
		MapUnitImpl mapUnit = new MapUnitImpl();
		return mapUnit;
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
	public DetailsUnit createDetailsUnit() {
		DetailsUnitImpl detailsUnit = new DetailsUnitImpl();
		return detailsUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexGridUnit createIndexGridUnit() {
		IndexGridUnitImpl indexGridUnit = new IndexGridUnitImpl();
		return indexGridUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexPageDirectionUnit createIndexPageDirectionUnit() {
		IndexPageDirectionUnitImpl indexPageDirectionUnit = new IndexPageDirectionUnitImpl();
		return indexPageDirectionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexLineDirectionUnit createIndexLineDirectionUnit() {
		IndexLineDirectionUnitImpl indexLineDirectionUnit = new IndexLineDirectionUnitImpl();
		return indexLineDirectionUnit;
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
	public ActionUnit createActionUnit() {
		ActionUnitImpl actionUnit = new ActionUnitImpl();
		return actionUnit;
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
	public FeatureReference createFeatureReference() {
		FeatureReferenceImpl featureReference = new FeatureReferenceImpl();
		return featureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterReference createParameterReference() {
		ParameterReferenceImpl parameterReference = new ParameterReferenceImpl();
		return parameterReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentUserReference createCurrentUserReference() {
		CurrentUserReferenceImpl currentUserReference = new CurrentUserReferenceImpl();
		return currentUserReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkTechnologies createFrameworkTechnologiesFromString(EDataType eDataType, String initialValue) {
		FrameworkTechnologies result = FrameworkTechnologies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkTechnologiesToString(EDataType eDataType, Object instanceValue) {
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
	public WafPackage getWafPackage() {
		return (WafPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WafPackage getPackage() {
		return WafPackage.eINSTANCE;
	}

} //WafFactoryImpl

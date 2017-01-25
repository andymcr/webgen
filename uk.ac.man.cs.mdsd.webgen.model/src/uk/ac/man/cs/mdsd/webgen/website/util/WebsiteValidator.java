/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsiteValidator.java,v 1.101 2014/08/22 14:32:52 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uk.ac.man.cs.mdsd.webgen.website.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage
 * @generated
 */
public class WebsiteValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebsiteValidator INSTANCE = new WebsiteValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uk.ac.man.cs.mdsd.webgen.website";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WebsitePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WebsitePackage.WEB_GEN_MODEL:
				return validateWebGenModel((WebGenModel)value, diagnostics, context);
			case WebsitePackage.WEBSITE_PROPERTIES:
				return validateWebsiteProperties((WebsiteProperties)value, diagnostics, context);
			case WebsitePackage.AUTHENTICATION:
				return validateAuthentication((Authentication)value, diagnostics, context);
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM:
				return validateLocalAuthenticationSystem((LocalAuthenticationSystem)value, diagnostics, context);
			case WebsitePackage.CAS_AUTHENTICATION:
				return validateCasAuthentication((CasAuthentication)value, diagnostics, context);
			case WebsitePackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case WebsitePackage.NAMED_DISPLAY_ELEMENT:
				return validateNamedDisplayElement((NamedDisplayElement)value, diagnostics, context);
			case WebsitePackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case WebsitePackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case WebsitePackage.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case WebsitePackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case WebsitePackage.ENTITY_OR_VIEW:
				return validateEntityOrView((EntityOrView)value, diagnostics, context);
			case WebsitePackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case WebsitePackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case WebsitePackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case WebsitePackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case WebsitePackage.MODEL_LABEL:
				return validateModelLabel((ModelLabel)value, diagnostics, context);
			case WebsitePackage.MODEL_LABEL_FEATURE:
				return validateModelLabelFeature((ModelLabelFeature)value, diagnostics, context);
			case WebsitePackage.MODEL_LABEL_ATTRIBUTE:
				return validateModelLabelAttribute((ModelLabelAttribute)value, diagnostics, context);
			case WebsitePackage.MODEL_LABEL_ASSOCIATION:
				return validateModelLabelAssociation((ModelLabelAssociation)value, diagnostics, context);
			case WebsitePackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case WebsitePackage.ENTITY_FEATURE:
				return validateEntityFeature((EntityFeature)value, diagnostics, context);
			case WebsitePackage.ENTITY_ATTRIBUTE:
				return validateEntityAttribute((EntityAttribute)value, diagnostics, context);
			case WebsitePackage.DATA_TYPE_ATTRIBUTE:
				return validateDataTypeAttribute((DataTypeAttribute)value, diagnostics, context);
			case WebsitePackage.DATE_ATTRIBUTE:
				return validateDateAttribute((DateAttribute)value, diagnostics, context);
			case WebsitePackage.URL_ATTRIBUTE:
				return validateUrlAttribute((UrlAttribute)value, diagnostics, context);
			case WebsitePackage.RESOURCE_ATTRIBUTE:
				return validateResourceAttribute((ResourceAttribute)value, diagnostics, context);
			case WebsitePackage.PATH_ELEMENT:
				return validatePathElement((PathElement)value, diagnostics, context);
			case WebsitePackage.STATIC_PATH_ELEMENT:
				return validateStaticPathElement((StaticPathElement)value, diagnostics, context);
			case WebsitePackage.DATE_PATH_ELEMENT:
				return validateDatePathElement((DatePathElement)value, diagnostics, context);
			case WebsitePackage.FILE_ATTRIBUTE:
				return validateFileAttribute((FileAttribute)value, diagnostics, context);
			case WebsitePackage.IMAGE_ATTRIBUTE:
				return validateImageAttribute((ImageAttribute)value, diagnostics, context);
			case WebsitePackage.LOCATION_ATTRIBUTE:
				return validateLocationAttribute((LocationAttribute)value, diagnostics, context);
			case WebsitePackage.ENTITY_ASSOCIATION:
				return validateEntityAssociation((EntityAssociation)value, diagnostics, context);
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT:
				return validateAssociationWithoutContainment((AssociationWithoutContainment)value, diagnostics, context);
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT:
				return validateAssociationWithContainment((AssociationWithContainment)value, diagnostics, context);
			case WebsitePackage.ASSOCIATION_KEY:
				return validateAssociationKey((AssociationKey)value, diagnostics, context);
			case WebsitePackage.VIEW:
				return validateView((View)value, diagnostics, context);
			case WebsitePackage.VIEW_FEATURE:
				return validateViewFeature((ViewFeature)value, diagnostics, context);
			case WebsitePackage.ENCAPSULATED_FEATURE:
				return validateEncapsulatedFeature((EncapsulatedFeature)value, diagnostics, context);
			case WebsitePackage.ENCAPSULATED_ATTRIBUTE:
				return validateEncapsulatedAttribute((EncapsulatedAttribute)value, diagnostics, context);
			case WebsitePackage.ENCAPSULATED_ASSOCIATION:
				return validateEncapsulatedAssociation((EncapsulatedAssociation)value, diagnostics, context);
			case WebsitePackage.VIEW_ASSOCIATION:
				return validateViewAssociation((ViewAssociation)value, diagnostics, context);
			case WebsitePackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case WebsitePackage.SELECTION:
				return validateSelection((Selection)value, diagnostics, context);
			case WebsitePackage.SELECTION_PARAMETER:
				return validateSelectionParameter((SelectionParameter)value, diagnostics, context);
			case WebsitePackage.BUSINESS_OPERATION:
				return validateBusinessOperation((BusinessOperation)value, diagnostics, context);
			case WebsitePackage.IMAGE_MANIPULATION:
				return validateImageManipulation((ImageManipulation)value, diagnostics, context);
			case WebsitePackage.IMAGE_FILTER:
				return validateImageFilter((ImageFilter)value, diagnostics, context);
			case WebsitePackage.THUMBNAIL_FILTER:
				return validateThumbnailFilter((ThumbnailFilter)value, diagnostics, context);
			case WebsitePackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case WebsitePackage.PAGE_LINK:
				return validatePageLink((PageLink)value, diagnostics, context);
			case WebsitePackage.MENU:
				return validateMenu((Menu)value, diagnostics, context);
			case WebsitePackage.MENU_ENTRY:
				return validateMenuEntry((MenuEntry)value, diagnostics, context);
			case WebsitePackage.STATIC_MENU:
				return validateStaticMenu((StaticMenu)value, diagnostics, context);
			case WebsitePackage.ACTION_MENU_ENTRY:
				return validateActionMenuEntry((ActionMenuEntry)value, diagnostics, context);
			case WebsitePackage.EDIT_STATIC_TEXT_MENU_ENTRY:
				return validateEditStaticTextMenuEntry((EditStaticTextMenuEntry)value, diagnostics, context);
			case WebsitePackage.DYNAMIC_MENU:
				return validateDynamicMenu((DynamicMenu)value, diagnostics, context);
			case WebsitePackage.MENU_FEATURE:
				return validateMenuFeature((MenuFeature)value, diagnostics, context);
			case WebsitePackage.FILTER:
				return validateFilter((Filter)value, diagnostics, context);
			case WebsitePackage.FILTER_PARAMETER:
				return validateFilterParameter((FilterParameter)value, diagnostics, context);
			case WebsitePackage.QUERY:
				return validateQuery((Query)value, diagnostics, context);
			case WebsitePackage.QUERY_PARAMETER:
				return validateQueryParameter((QueryParameter)value, diagnostics, context);
			case WebsitePackage.UNIT_CONTAINER:
				return validateUnitContainer((UnitContainer)value, diagnostics, context);
			case WebsitePackage.CONTENT_UNIT:
				return validateContentUnit((ContentUnit)value, diagnostics, context);
			case WebsitePackage.STATIC_UNIT:
				return validateStaticUnit((StaticUnit)value, diagnostics, context);
			case WebsitePackage.CREATE_SITEMAP_UNIT:
				return validateCreateSitemapUnit((CreateSitemapUnit)value, diagnostics, context);
			case WebsitePackage.DYNAMIC_UNIT:
				return validateDynamicUnit((DynamicUnit)value, diagnostics, context);
			case WebsitePackage.UNIT_FIELD:
				return validateUnitField((UnitField)value, diagnostics, context);
			case WebsitePackage.UNIT_FEATURE:
				return validateUnitFeature((UnitFeature)value, diagnostics, context);
			case WebsitePackage.UNIT_ELEMENT:
				return validateUnitElement((UnitElement)value, diagnostics, context);
			case WebsitePackage.UNIT_ASSOCIATION:
				return validateUnitAssociation((UnitAssociation)value, diagnostics, context);
			case WebsitePackage.INTERFACE_FIELD:
				return validateInterfaceField((InterfaceField)value, diagnostics, context);
			case WebsitePackage.DATA_TYPE_FIELD:
				return validateDataTypeField((DataTypeField)value, diagnostics, context);
			case WebsitePackage.DATE_FIELD:
				return validateDateField((DateField)value, diagnostics, context);
			case WebsitePackage.CAPTCHA_FIELD:
				return validateCaptchaField((CaptchaField)value, diagnostics, context);
			case WebsitePackage.UNIT_SUPPORT_ACTION:
				return validateUnitSupportAction((UnitSupportAction)value, diagnostics, context);
			case WebsitePackage.SELECTABLE_UNIT:
				return validateSelectableUnit((SelectableUnit)value, diagnostics, context);
			case WebsitePackage.SINGLETON_UNIT:
				return validateSingletonUnit((SingletonUnit)value, diagnostics, context);
			case WebsitePackage.COLLECTION_UNIT:
				return validateCollectionUnit((CollectionUnit)value, diagnostics, context);
			case WebsitePackage.EDIT_UNIT:
				return validateEditUnit((EditUnit)value, diagnostics, context);
			case WebsitePackage.CREATE_UNIT:
				return validateCreateUnit((CreateUnit)value, diagnostics, context);
			case WebsitePackage.CREATE_UPDATE_UNIT:
				return validateCreateUpdateUnit((CreateUpdateUnit)value, diagnostics, context);
			case WebsitePackage.UPDATE_UNIT:
				return validateUpdateUnit((UpdateUnit)value, diagnostics, context);
			case WebsitePackage.MAP_UNIT:
				return validateMapUnit((MapUnit)value, diagnostics, context);
			case WebsitePackage.DATA_UNIT:
				return validateDataUnit((DataUnit)value, diagnostics, context);
			case WebsitePackage.DETAILS_UNIT:
				return validateDetailsUnit((DetailsUnit)value, diagnostics, context);
			case WebsitePackage.INDEX_UNIT:
				return validateIndexUnit((IndexUnit)value, diagnostics, context);
			case WebsitePackage.CONTROL_UNIT:
				return validateControlUnit((ControlUnit)value, diagnostics, context);
			case WebsitePackage.SEARCH_UNIT:
				return validateSearchUnit((SearchUnit)value, diagnostics, context);
			case WebsitePackage.IMAGE_UNIT:
				return validateImageUnit((ImageUnit)value, diagnostics, context);
			case WebsitePackage.FEATURE_PATH:
				return validateFeaturePath((FeaturePath)value, diagnostics, context);
			case WebsitePackage.FEATURE_PATH_ATTRIBUTE:
				return validateFeaturePathAttribute((FeaturePathAttribute)value, diagnostics, context);
			case WebsitePackage.FEATURE_PATH_ASSOCIATION:
				return validateFeaturePathAssociation((FeaturePathAssociation)value, diagnostics, context);
			case WebsitePackage.CHILD_FEATURE:
				return validateChildFeature((ChildFeature)value, diagnostics, context);
			case WebsitePackage.CHILD_ATTRIBUTE:
				return validateChildAttribute((ChildAttribute)value, diagnostics, context);
			case WebsitePackage.CHILD_ASSOCIATION:
				return validateChildAssociation((ChildAssociation)value, diagnostics, context);
			case WebsitePackage.IMAGE_INDEX_UNIT:
				return validateImageIndexUnit((ImageIndexUnit)value, diagnostics, context);
			case WebsitePackage.SLIDER_UNIT:
				return validateSliderUnit((SliderUnit)value, diagnostics, context);
			case WebsitePackage.GALLERY_UNIT:
				return validateGalleryUnit((GalleryUnit)value, diagnostics, context);
			case WebsitePackage.AUTHENTICATION_UNIT:
				return validateAuthenticationUnit((AuthenticationUnit)value, diagnostics, context);
			case WebsitePackage.REGISTRATION_UNIT:
				return validateRegistrationUnit((RegistrationUnit)value, diagnostics, context);
			case WebsitePackage.LOGIN_UNIT:
				return validateLoginUnit((LoginUnit)value, diagnostics, context);
			case WebsitePackage.FORGOTTEN_PASSWORD_UNIT:
				return validateForgottenPasswordUnit((ForgottenPasswordUnit)value, diagnostics, context);
			case WebsitePackage.INLINE_ACTION_CONTAINER:
				return validateInlineActionContainer((InlineActionContainer)value, diagnostics, context);
			case WebsitePackage.INLINE_ACTION:
				return validateInlineAction((InlineAction)value, diagnostics, context);
			case WebsitePackage.SELECT_ACTION:
				return validateSelectAction((SelectAction)value, diagnostics, context);
			case WebsitePackage.DELETE_ACTION:
				return validateDeleteAction((DeleteAction)value, diagnostics, context);
			case WebsitePackage.FEATURE_SUPPORT_ACTION:
				return validateFeatureSupportAction((FeatureSupportAction)value, diagnostics, context);
			case WebsitePackage.MODEL_REFERENCE:
				return validateModelReference((ModelReference)value, diagnostics, context);
			case WebsitePackage.FEATURE_REFERENCE:
				return validateFeatureReference((FeatureReference)value, diagnostics, context);
			case WebsitePackage.ROUTE_PARAMETER_REFERENCE:
				return validateRouteParameterReference((RouteParameterReference)value, diagnostics, context);
			case WebsitePackage.PARAMETER_REFERENCE:
				return validateParameterReference((ParameterReference)value, diagnostics, context);
			case WebsitePackage.CURRENT_USER_REFERENCE:
				return validateCurrentUserReference((CurrentUserReference)value, diagnostics, context);
			case WebsitePackage.DATABASE_TECHNOLOGIES:
				return validateDatabaseTechnologies((DatabaseTechnologies)value, diagnostics, context);
			case WebsitePackage.ORM_TECHNOLOGIES:
				return validateOrmTechnologies((OrmTechnologies)value, diagnostics, context);
			case WebsitePackage.FRAMEWORK_TECHNOLOGIES:
				return validateFrameworkTechnologies((FrameworkTechnologies)value, diagnostics, context);
			case WebsitePackage.INPUT_TECHNOLOGIES:
				return validateInputTechnologies((InputTechnologies)value, diagnostics, context);
			case WebsitePackage.AJAX_TECHNOLOGIES:
				return validateAjaxTechnologies((AjaxTechnologies)value, diagnostics, context);
			case WebsitePackage.AUTHENTICATION_KEY_TYPES:
				return validateAuthenticationKeyTypes((AuthenticationKeyTypes)value, diagnostics, context);
			case WebsitePackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			case WebsitePackage.IS_HAS_CHOICES:
				return validateisHasChoices((isHasChoices)value, diagnostics, context);
			case WebsitePackage.DATE_DETAILS:
				return validateDateDetails((DateDetails)value, diagnostics, context);
			case WebsitePackage.OPERATION_RESULT_TYPES:
				return validateOperationResultTypes((OperationResultTypes)value, diagnostics, context);
			case WebsitePackage.PAGE_TOP_MENU_OPTIONS:
				return validatePageTopMenuOptions((PageTopMenuOptions)value, diagnostics, context);
			case WebsitePackage.COLLECTION_DISPLAY_OPTIONS:
				return validateCollectionDisplayOptions((CollectionDisplayOptions)value, diagnostics, context);
			case WebsitePackage.INDEX_DISPLAY_OPTION:
				return validateIndexDisplayOption((IndexDisplayOption)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebGenModel(WebGenModel webGenModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(webGenModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebGenModel_classifierNameUnique(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebGenModel_pageNameUnique(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebGenModel_menuNameUnique(webGenModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the classifierNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_GEN_MODEL__CLASSIFIER_NAME_UNIQUE__EEXPRESSION = "classifiers->isUnique(name)";

	/**
	 * Validates the classifierNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebGenModel_classifierNameUnique(WebGenModel webGenModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.WEB_GEN_MODEL,
				 webGenModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "classifierNameUnique",
				 WEB_GEN_MODEL__CLASSIFIER_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the pageNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_GEN_MODEL__PAGE_NAME_UNIQUE__EEXPRESSION = "pages->isUnique(name)";

	/**
	 * Validates the pageNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebGenModel_pageNameUnique(WebGenModel webGenModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.WEB_GEN_MODEL,
				 webGenModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "pageNameUnique",
				 WEB_GEN_MODEL__PAGE_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the menuNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_GEN_MODEL__MENU_NAME_UNIQUE__EEXPRESSION = "menus->isUnique(name)";

	/**
	 * Validates the menuNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebGenModel_menuNameUnique(WebGenModel webGenModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.WEB_GEN_MODEL,
				 webGenModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "menuNameUnique",
				 WEB_GEN_MODEL__MENU_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebsiteProperties(WebsiteProperties websiteProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(websiteProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nameNeedsAtLeastOneCharacter constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ELEMENT__NAME_NEEDS_AT_LEAST_ONE_CHARACTER__EEXPRESSION = "not name.oclIsUndefined() implies name.size() > 0";

	/**
	 * Validates the nameNeedsAtLeastOneCharacter constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_nameNeedsAtLeastOneCharacter(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.NAMED_ELEMENT,
				 namedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "nameNeedsAtLeastOneCharacter",
				 NAMED_ELEMENT__NAME_NEEDS_AT_LEAST_ONE_CHARACTER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedDisplayElement(NamedDisplayElement namedDisplayElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedDisplayElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(namedDisplayElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(classifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType(EnumerationType enumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(enumerationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(enumerationLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityOrView(EntityOrView entityOrView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entityOrView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entityOrView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entityOrView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entityOrView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entityOrView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entityOrView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entityOrView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entityOrView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entityOrView, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(entityOrView, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityOrView_keysFromLocalFeatures(entityOrView, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the keysFromLocalFeatures constraint of '<em>Entity Or View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY_OR_VIEW__KEYS_FROM_LOCAL_FEATURES__EEXPRESSION = "allFeatures->includesAll(keys)";

	/**
	 * Validates the keysFromLocalFeatures constraint of '<em>Entity Or View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityOrView_keysFromLocalFeatures(EntityOrView entityOrView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.ENTITY_OR_VIEW,
				 entityOrView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "keysFromLocalFeatures",
				 ENTITY_OR_VIEW__KEYS_FROM_LOCAL_FEATURES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityOrView_keysFromLocalFeatures(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_featureNameUniqueWithinEntity(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the featureNameUniqueWithinEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__FEATURE_NAME_UNIQUE_WITHIN_ENTITY__EEXPRESSION = "entityFeatures->isUnique(f | f.name)";

	/**
	 * Validates the featureNameUniqueWithinEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_featureNameUniqueWithinEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "featureNameUniqueWithinEntity",
				 ENTITY__FEATURE_NAME_UNIQUE_WITHIN_ENTITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityFeature(EntityFeature entityFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entityFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entityFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entityFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entityFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entityFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entityFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entityFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entityFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entityFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(entityFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityAttribute(EntityAttribute entityAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entityAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entityAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entityAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entityAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entityAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entityAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entityAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entityAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entityAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(entityAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityAttribute_primaryKeyRequired(entityAttribute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the primaryKeyRequired constraint of '<em>Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY_ATTRIBUTE__PRIMARY_KEY_REQUIRED__EEXPRESSION = "primaryKey implies cardinality <> Cardinality::Optional";

	/**
	 * Validates the primaryKeyRequired constraint of '<em>Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityAttribute_primaryKeyRequired(EntityAttribute entityAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.ENTITY_ATTRIBUTE,
				 entityAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "primaryKeyRequired",
				 ENTITY_ATTRIBUTE__PRIMARY_KEY_REQUIRED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(view, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(view, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(view, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityOrView_keysFromLocalFeatures(view, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewFeature(ViewFeature viewFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncapsulatedFeature(EncapsulatedFeature encapsulatedFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encapsulatedFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncapsulatedAttribute(EncapsulatedAttribute encapsulatedAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encapsulatedAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncapsulatedAssociation(EncapsulatedAssociation encapsulatedAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encapsulatedAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewAssociation(ViewAssociation viewAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viewAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(viewAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeAttribute(DataTypeAttribute dataTypeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataTypeAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityAttribute_primaryKeyRequired(dataTypeAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateAttribute(DateAttribute dateAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityAttribute_primaryKeyRequired(dateAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlAttribute(UrlAttribute urlAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(urlAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityAttribute_primaryKeyRequired(urlAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceAttribute(ResourceAttribute resourceAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityAttribute_primaryKeyRequired(resourceAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathElement(PathElement pathElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticPathElement(StaticPathElement staticPathElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticPathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePathElement(DatePathElement datePathElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datePathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileAttribute(FileAttribute fileAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fileAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityAttribute_primaryKeyRequired(fileAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageAttribute(ImageAttribute imageAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(imageAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityAttribute_primaryKeyRequired(imageAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationAttribute(LocationAttribute locationAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(locationAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityAttribute_primaryKeyRequired(locationAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityAssociation(EntityAssociation entityAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entityAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(entityAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(association, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationKey(AssociationKey associationKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationKey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(label, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLabel(ModelLabel modelLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelLabel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(modelLabel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLabelFeature(ModelLabelFeature modelLabelFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelLabelFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLabelAttribute(ModelLabelAttribute modelLabelAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelLabelAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLabelAssociation(ModelLabelAssociation modelLabelAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelLabelAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationWithoutContainment(AssociationWithoutContainment associationWithoutContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationWithoutContainment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationWithoutContainment_oneToManyAssociationsMustBeBidirectional(associationWithoutContainment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneToManyAssociationsMustBeBidirectional constraint of '<em>Association Without Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION_WITHOUT_CONTAINMENT__ONE_TO_MANY_ASSOCIATIONS_MUST_BE_BIDIRECTIONAL__EEXPRESSION = "cardinality = Cardinality::Optional and targetCardinality = Cardinality::Required implies bidirectional";

	/**
	 * Validates the oneToManyAssociationsMustBeBidirectional constraint of '<em>Association Without Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationWithoutContainment_oneToManyAssociationsMustBeBidirectional(AssociationWithoutContainment associationWithoutContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.ASSOCIATION_WITHOUT_CONTAINMENT,
				 associationWithoutContainment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oneToManyAssociationsMustBeBidirectional",
				 ASSOCIATION_WITHOUT_CONTAINMENT__ONE_TO_MANY_ASSOCIATIONS_MUST_BE_BIDIRECTIONAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationWithContainment(AssociationWithContainment associationWithContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationWithContainment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(associationWithContainment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_contentUnitNameUniqueWithinPage(page, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the contentUnitNameUniqueWithinPage constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE__CONTENT_UNIT_NAME_UNIQUE_WITHIN_PAGE__EEXPRESSION = "units->isUnique(name)";

	/**
	 * Validates the contentUnitNameUniqueWithinPage constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_contentUnitNameUniqueWithinPage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.PAGE,
				 page,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "contentUnitNameUniqueWithinPage",
				 PAGE__CONTENT_UNIT_NAME_UNIQUE_WITHIN_PAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenu(Menu menu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(menu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(menu, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenuEntry(MenuEntry menuEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(menuEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuery(Query query, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(query, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryParameter(QueryParameter queryParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticMenu(StaticMenu staticMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticMenu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticMenu_onlyStaticEntries(staticMenu, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyStaticEntries constraint of '<em>Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATIC_MENU__ONLY_STATIC_ENTRIES__EEXPRESSION = "entries->select(e | e.oclIsKindOf(MenuFeature))->isEmpty()";

	/**
	 * Validates the onlyStaticEntries constraint of '<em>Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticMenu_onlyStaticEntries(StaticMenu staticMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.STATIC_MENU,
				 staticMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "onlyStaticEntries",
				 STATIC_MENU__ONLY_STATIC_ENTRIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionMenuEntry(ActionMenuEntry actionMenuEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionMenuEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(actionMenuEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditStaticTextMenuEntry(EditStaticTextMenuEntry editStaticTextMenuEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(editStaticTextMenuEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(editStaticTextMenuEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamicMenu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicMenu_entriesMustBeFromSource(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicMenu_onlyIncludeFeaturesOnce(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicMenu_mustSelectSingleton(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicMenu_titleFromEntityOrView(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicMenu_canOnlyTitleWithSingletons(dynamicMenu, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the entriesMustBeFromSource constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_MENU__ENTRIES_MUST_BE_FROM_SOURCE__EEXPRESSION = "true";

	/**
	 * Validates the entriesMustBeFromSource constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu_entriesMustBeFromSource(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_MENU,
				 dynamicMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "entriesMustBeFromSource",
				 DYNAMIC_MENU__ENTRIES_MUST_BE_FROM_SOURCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyIncludeFeaturesOnce constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_MENU__ONLY_INCLUDE_FEATURES_ONCE__EEXPRESSION = "true";

	/**
	 * Validates the onlyIncludeFeaturesOnce constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu_onlyIncludeFeaturesOnce(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_MENU,
				 dynamicMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "onlyIncludeFeaturesOnce",
				 DYNAMIC_MENU__ONLY_INCLUDE_FEATURES_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the mustSelectSingleton constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_MENU__MUST_SELECT_SINGLETON__EEXPRESSION = "not selection.oclIsUndefined() implies selection.limit = 1";

	/**
	 * Validates the mustSelectSingleton constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu_mustSelectSingleton(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_MENU,
				 dynamicMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "mustSelectSingleton",
				 DYNAMIC_MENU__MUST_SELECT_SINGLETON__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the titleFromEntityOrView constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_MENU__TITLE_FROM_ENTITY_OR_VIEW__EEXPRESSION = "not title.oclIsUndefined() and not entityOrView.oclIsUndefined() implies\r\n" +
		"\tentityOrView.features->includes(title)";

	/**
	 * Validates the titleFromEntityOrView constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu_titleFromEntityOrView(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_MENU,
				 dynamicMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "titleFromEntityOrView",
				 DYNAMIC_MENU__TITLE_FROM_ENTITY_OR_VIEW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the canOnlyTitleWithSingletons constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_MENU__CAN_ONLY_TITLE_WITH_SINGLETONS__EEXPRESSION = "not title.oclIsUndefined() implies\r\n" +
		"\tif title.oclIsKindOf(EntityFeature) then\r\n" +
		"\t\ttitle.oclAsType(EntityFeature).cardinality <> Cardinality::Many\r\n" +
		"\telse if title.oclIsKindOf(EncapsulatedAttribute) then\r\n" +
		"\t\ttitle.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n" +
		"\telse if title.oclIsKindOf(EncapsulatedAssociation) then\r\n" +
		"\t\ttitle.oclAsType(EncapsulatedAssociation).cardinality <> Cardinality::Many\r\n" +
		"\telse\r\n" +
		"\t\tfalse\r\n" +
		"\tendif endif endif";

	/**
	 * Validates the canOnlyTitleWithSingletons constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu_canOnlyTitleWithSingletons(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_MENU,
				 dynamicMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyTitleWithSingletons",
				 DYNAMIC_MENU__CAN_ONLY_TITLE_WITH_SINGLETONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenuFeature(MenuFeature menuFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(menuFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilter(Filter filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(filter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(filter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterParameter(FilterParameter filterParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(filterParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(filterParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(filterParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(filterParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(filterParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(filterParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(filterParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(filterParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(filterParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(filterParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageLink(PageLink pageLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitContainer(UnitContainer unitContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitField(UnitField unitField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitFeature(UnitFeature unitFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unitFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_atMostOneSelectAction(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_noDeleteActions(unitFeature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the atMostOneSelectAction constraint of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_FEATURE__AT_MOST_ONE_SELECT_ACTION__EEXPRESSION = "actions->select(a | a.oclIsKindOf(SelectAction))->size() < 2";

	/**
	 * Validates the atMostOneSelectAction constraint of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitFeature_atMostOneSelectAction(UnitFeature unitFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_FEATURE,
				 unitFeature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "atMostOneSelectAction",
				 UNIT_FEATURE__AT_MOST_ONE_SELECT_ACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noDeleteActions constraint of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_FEATURE__NO_DELETE_ACTIONS__EEXPRESSION = "actions->select(a | a.oclIsKindOf(DeleteAction))->isEmpty()";

	/**
	 * Validates the noDeleteActions constraint of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitFeature_noDeleteActions(UnitFeature unitFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_FEATURE,
				 unitFeature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noDeleteActions",
				 UNIT_FEATURE__NO_DELETE_ACTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitElement(UnitElement unitElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unitElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_atMostOneSelectAction(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_noDeleteActions(unitElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAssociation(UnitAssociation unitAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unitAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_atMostOneSelectAction(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_noDeleteActions(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitAssociation_selectionValidChoice(unitAssociation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the selectionValidChoice constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_ASSOCIATION__SELECTION_VALID_CHOICE__EEXPRESSION = "not selection.oclIsUndefined() implies\r\n" +
		"\ttargetEntity->collect(eov | eov.servedBy)->collect(s | s.selections)->includes(selection)";

	/**
	 * Validates the selectionValidChoice constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAssociation_selectionValidChoice(UnitAssociation unitAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_ASSOCIATION,
				 unitAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selectionValidChoice",
				 UNIT_ASSOCIATION__SELECTION_VALID_CHOICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChildFeature(ChildFeature childFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(childFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChildAttribute(ChildAttribute childAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(childAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChildAssociation(ChildAssociation childAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(childAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageIndexUnit(ImageIndexUnit imageIndexUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(imageIndexUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(imageIndexUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(service, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelection(Selection selection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(selection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionParameter(SelectionParameter selectionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(selectionParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessOperation(BusinessOperation businessOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(businessOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(businessOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(businessOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(businessOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(businessOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(businessOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(businessOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(businessOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(businessOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(businessOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageManipulation(ImageManipulation imageManipulation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(imageManipulation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(imageManipulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(imageManipulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(imageManipulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(imageManipulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(imageManipulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(imageManipulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(imageManipulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(imageManipulation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(imageManipulation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageFilter(ImageFilter imageFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThumbnailFilter(ThumbnailFilter thumbnailFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thumbnailFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentUnit(ContentUnit contentUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contentUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(contentUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceField(InterfaceField interfaceField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(interfaceField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeField(DataTypeField dataTypeField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataTypeField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dataTypeField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateField(DateField dateField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dateField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptchaField(CaptchaField captchaField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(captchaField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(captchaField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitSupportAction(UnitSupportAction unitSupportAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unitSupportAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(unitSupportAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectableUnit(SelectableUnit selectableUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectableUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonUnit(SingletonUnit singletonUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singletonUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionUnit(CollectionUnit collectionUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collectionUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditUnit(EditUnit editUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(editUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(editUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateUnit(CreateUnit createUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(createUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateUpdateUnit(CreateUpdateUnit createUpdateUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createUpdateUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(createUpdateUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataUnit(DataUnit dataUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_canOnlyTitleWithSingletons(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_selectionValidChoice(dataUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the canOnlyTitleWithSingletons constraint of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_UNIT__CAN_ONLY_TITLE_WITH_SINGLETONS__EEXPRESSION = "not title.oclIsUndefined() implies \r\n" +
		"\tif title.oclIsKindOf(EntityAttribute) then\r\n" +
		"\t\ttitle.oclAsType(EntityAttribute).cardinality <> Cardinality::Many\r\n" +
		"\telse if title.oclIsKindOf(EncapsulatedAttribute) then\r\n" +
		"\t\ttitle.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n" +
		"\telse\r\n" +
		"\t\ttrue\r\n" +
		"\tendif endif";

	/**
	 * Validates the canOnlyTitleWithSingletons constraint of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataUnit_canOnlyTitleWithSingletons(DataUnit dataUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DATA_UNIT,
				 dataUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyTitleWithSingletons",
				 DATA_UNIT__CAN_ONLY_TITLE_WITH_SINGLETONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the selectionValidChoice constraint of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_UNIT__SELECTION_VALID_CHOICE__EEXPRESSION = "not defaultSelection.oclIsUndefined() implies\r\n" +
		"\tentities->collect(eov | eov.servedBy)->collect(s | s.selections)->includes(defaultSelection)";

	/**
	 * Validates the selectionValidChoice constraint of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataUnit_selectionValidChoice(DataUnit dataUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DATA_UNIT,
				 dataUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selectionValidChoice",
				 DATA_UNIT__SELECTION_VALID_CHOICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticUnit(StaticUnit staticUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(staticUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateSitemapUnit(CreateSitemapUnit createSitemapUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createSitemapUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(createSitemapUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicUnit(DynamicUnit dynamicUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamicUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(dynamicUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the featuresMustBeFromContentType constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_UNIT__FEATURES_MUST_BE_FROM_CONTENT_TYPE__EEXPRESSION = "let entities : OrderedSet(EntityOrView)\r\n" +
		"\t= if self.oclIsKindOf(SingletonUnit) then\r\n" +
		"\t\t\tOrderedSet{self.oclAsType(SingletonUnit).contentType}\r\n" +
		"\t\telse if self.oclIsKindOf(CollectionUnit) then\r\n" +
		"\t\t\tself.oclAsType(CollectionUnit).contentType\r\n" +
		"\t\telse\r\n" +
		"\t\t\tself.entities\r\n" +
		"\t\tendif endif\r\n" +
		"\tin let eovFeatures : Collection(Feature)\r\n" +
		"\t\t= entities->collect(eov | eov.allFeatures)\r\n" +
		"\t\tin displayFields\r\n" +
		"\t\t\t->select(f | f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\r\n" +
		"\t\t\t->select(f | \r\n" +
		"\t\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n" +
		"\t\t\t\t\tnot f.oclAsType(UnitElement).attribute.oclIsUndefined()\r\n" +
		"\t\t\t\telse\r\n" +
		"\t\t\t\t\tnot f.oclAsType(UnitAssociation).association.oclIsUndefined()\r\n" +
		"\t\t\t\tendif)\r\n" +
		"\t\t\t->forAll(f | \r\n" +
		"\t\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n" +
		"\t\t\t\t\teovFeatures->includes(f.oclAsType(UnitElement).attribute)\r\n" +
		"\t\t\t\telse\r\n" +
		"\t\t\t\t\teovFeatures->includes(f.oclAsType(UnitAssociation).association)\r\n" +
		"\t\t\t\tendif)";

	/**
	 * Validates the featuresMustBeFromContentType constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicUnit_featuresMustBeFromContentType(DynamicUnit dynamicUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_UNIT,
				 dynamicUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "featuresMustBeFromContentType",
				 DYNAMIC_UNIT__FEATURES_MUST_BE_FROM_CONTENT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailsUnit(DetailsUnit detailsUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(detailsUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_canOnlyTitleWithSingletons(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_selectionValidChoice(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDetailsUnit_selectionMustBeSingleton(detailsUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the selectionMustBeSingleton constraint of '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DETAILS_UNIT__SELECTION_MUST_BE_SINGLETON__EEXPRESSION = "not defaultSelection.oclIsUndefined() implies\r\n" +
		"\tdefaultSelection.limit = 1";

	/**
	 * Validates the selectionMustBeSingleton constraint of '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailsUnit_selectionMustBeSingleton(DetailsUnit detailsUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DETAILS_UNIT,
				 detailsUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selectionMustBeSingleton",
				 DETAILS_UNIT__SELECTION_MUST_BE_SINGLETON__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexUnit(IndexUnit indexUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(indexUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_canOnlyTitleWithSingletons(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_selectionValidChoice(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateIndexUnit_selectionMustNotBeSingleton(indexUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the selectionMustNotBeSingleton constraint of '<em>Index Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INDEX_UNIT__SELECTION_MUST_NOT_BE_SINGLETON__EEXPRESSION = "not defaultSelection.oclIsUndefined() implies\r\n" +
		"\tdefaultSelection.limit <> 1";

	/**
	 * Validates the selectionMustNotBeSingleton constraint of '<em>Index Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexUnit_selectionMustNotBeSingleton(IndexUnit indexUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.INDEX_UNIT,
				 indexUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selectionMustNotBeSingleton",
				 INDEX_UNIT__SELECTION_MUST_NOT_BE_SINGLETON__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlUnit(ControlUnit controlUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(controlUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchUnit(SearchUnit searchUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(searchUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(searchUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageUnit(ImageUnit imageUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(imageUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(imageUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturePath(FeaturePath featurePath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featurePath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturePathAttribute(FeaturePathAttribute featurePathAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featurePathAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturePathAssociation(FeaturePathAssociation featurePathAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featurePathAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSliderUnit(SliderUnit sliderUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sliderUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(sliderUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGalleryUnit(GalleryUnit galleryUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(galleryUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(galleryUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticationUnit(AuthenticationUnit authenticationUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authenticationUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistrationUnit(RegistrationUnit registrationUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(registrationUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(registrationUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoginUnit(LoginUnit loginUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loginUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(loginUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForgottenPasswordUnit(ForgottenPasswordUnit forgottenPasswordUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(forgottenPasswordUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(forgottenPasswordUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInlineActionContainer(InlineActionContainer inlineActionContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inlineActionContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(inlineActionContainer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the atMostOneDeleteAction constraint of '<em>Inline Action Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INLINE_ACTION_CONTAINER__AT_MOST_ONE_DELETE_ACTION__EEXPRESSION = "actions->select(a | a.oclIsKindOf(DeleteAction))->size() < 2";

	/**
	 * Validates the atMostOneDeleteAction constraint of '<em>Inline Action Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInlineActionContainer_atMostOneDeleteAction(InlineActionContainer inlineActionContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.INLINE_ACTION_CONTAINER,
				 inlineActionContainer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "atMostOneDeleteAction",
				 INLINE_ACTION_CONTAINER__AT_MOST_ONE_DELETE_ACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInlineAction(InlineAction inlineAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inlineAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(inlineAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateUnit(UpdateUnit updateUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(updateUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(updateUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapUnit(MapUnit mapUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(mapUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectAction(SelectAction selectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(selectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteAction(DeleteAction deleteAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deleteAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeleteAction_canOnlyDeleteSingletons(deleteAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the canOnlyDeleteSingletons constraint of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELETE_ACTION__CAN_ONLY_DELETE_SINGLETONS__EEXPRESSION = "if usedBy.oclIsKindOf(UnitElement) then\r\n" +
		"\tlet attribute : Attribute\r\n" +
		"\t\t= usedBy.oclAsType(UnitElement).attribute\r\n" +
		"\t\tin if attribute.oclIsKindOf(EntityAttribute) then\r\n" +
		"\t\t\t\tattribute.oclAsType(EntityAttribute).cardinality <> Cardinality::Many\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tattribute.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n" +
		"\t\t\tendif\r\n" +
		"else if usedBy.oclIsKindOf(UnitAssociation) then\r\n" +
		"\tlet association : Association\r\n" +
		"\t\t= usedBy.oclAsType(UnitAssociation).association\r\n" +
		"\t\tin if association.oclIsKindOf(EntityAssociation) then\r\n" +
		"\t\t\t\tassociation.oclAsType(EntityAssociation).cardinality <> Cardinality::Many\r\n" +
		"\t\t\telse if association.oclIsKindOf(EncapsulatedAssociation) then\r\n" +
		"\t\t\t\tassociation.oclAsType(EncapsulatedAssociation).cardinality <> Cardinality::Many\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tfalse -- association.oclAsType(ViewAssociation)\r\n" +
		"\t\t\tendif endif\r\n" +
		"else\r\n" +
		"\tusedBy.oclIsTypeOf(IndexUnit)\r\n" +
		"endif endif\r\n" +
		"";

	/**
	 * Validates the canOnlyDeleteSingletons constraint of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteAction_canOnlyDeleteSingletons(DeleteAction deleteAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DELETE_ACTION,
				 deleteAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyDeleteSingletons",
				 DELETE_ACTION__CAN_ONLY_DELETE_SINGLETONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureSupportAction(FeatureSupportAction featureSupportAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featureSupportAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(featureSupportAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelReference(ModelReference modelReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureReference(FeatureReference featureReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRouteParameterReference(RouteParameterReference routeParameterReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(routeParameterReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterReference(ParameterReference parameterReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentUserReference(CurrentUserReference currentUserReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentUserReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseTechnologies(DatabaseTechnologies databaseTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrmTechnologies(OrmTechnologies ormTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameworkTechnologies(FrameworkTechnologies frameworkTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputTechnologies(InputTechnologies inputTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAjaxTechnologies(AjaxTechnologies ajaxTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticationKeyTypes(AuthenticationKeyTypes authenticationKeyTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication(Authentication authentication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(authentication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(authentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(authentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(authentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(authentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(authentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(authentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(authentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(authentication, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthentication_userKeyFromUser(authentication, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthentication_userKeyRequiredAttribute(authentication, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the userKeyFromUser constraint of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AUTHENTICATION__USER_KEY_FROM_USER__EEXPRESSION = "not user.oclIsUndefined() and not userKey.oclIsUndefined() implies\r\n" +
		"\tuser.features->includes(userKey)";

	/**
	 * Validates the userKeyFromUser constraint of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication_userKeyFromUser(Authentication authentication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.AUTHENTICATION,
				 authentication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "userKeyFromUser",
				 AUTHENTICATION__USER_KEY_FROM_USER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the userKeyRequiredAttribute constraint of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AUTHENTICATION__USER_KEY_REQUIRED_ATTRIBUTE__EEXPRESSION = "not userKey.oclIsUndefined() implies\r\n" +
		"\tif userKey.oclIsTypeOf(EncapsulatedAttribute) then\r\n" +
		"\t\tuserKey.oclAsType(EncapsulatedAttribute).cardinality = Cardinality::Required\r\n" +
		"\telse\r\n" +
		"\t\tuserKey.oclAsType(EntityAttribute).cardinality = Cardinality::Required\r\n" +
		"\tendif";

	/**
	 * Validates the userKeyRequiredAttribute constraint of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication_userKeyRequiredAttribute(Authentication authentication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.AUTHENTICATION,
				 authentication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "userKeyRequiredAttribute",
				 AUTHENTICATION__USER_KEY_REQUIRED_ATTRIBUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(localAuthenticationSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthentication_userKeyFromUser(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthentication_userKeyRequiredAttribute(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalAuthenticationSystem_captchaRequiresKeys(localAuthenticationSystem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the captchaRequiresKeys constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA_REQUIRES_KEYS__EEXPRESSION = "useCaptcha implies not authenticates.captchaSiteKey.oclIsUndefined() and not authenticates.captchaSecretKey.oclIsUndefined()";

	/**
	 * Validates the captchaRequiresKeys constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem_captchaRequiresKeys(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM,
				 localAuthenticationSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "captchaRequiresKeys",
				 LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA_REQUIRES_KEYS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCasAuthentication(CasAuthentication casAuthentication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(casAuthentication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(casAuthentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(casAuthentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(casAuthentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(casAuthentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(casAuthentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(casAuthentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(casAuthentication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(casAuthentication, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthentication_userKeyFromUser(casAuthentication, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthentication_userKeyRequiredAttribute(casAuthentication, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateisHasChoices(isHasChoices isHasChoices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateDetails(DateDetails dateDetails, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationResultTypes(OperationResultTypes operationResultTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageTopMenuOptions(PageTopMenuOptions pageTopMenuOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionDisplayOptions(CollectionDisplayOptions collectionDisplayOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexDisplayOption(IndexDisplayOption indexDisplayOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WebsiteValidator

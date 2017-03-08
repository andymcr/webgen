/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uk.ac.man.cs.mdsd.webgen.base.util.BaseValidator;

import uk.ac.man.cs.mdsd.webgen.webui.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage
 * @generated
 */
public class WebuiValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebuiValidator INSTANCE = new WebuiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uk.ac.man.cs.mdsd.webgen.webui";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseValidator baseValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebuiValidator() {
		super();
		baseValidator = BaseValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WebuiPackage.eINSTANCE;
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
			case WebuiPackage.WEB_UI:
				return validateWebUI((WebUI)value, diagnostics, context);
			case WebuiPackage.MENU:
				return validateMenu((Menu)value, diagnostics, context);
			case WebuiPackage.MENU_ENTRY:
				return validateMenuEntry((MenuEntry)value, diagnostics, context);
			case WebuiPackage.GLOBAL_MENU:
				return validateGlobalMenu((GlobalMenu)value, diagnostics, context);
			case WebuiPackage.STATIC_MENU:
				return validateStaticMenu((StaticMenu)value, diagnostics, context);
			case WebuiPackage.ACTION_MENU_ENTRY:
				return validateActionMenuEntry((ActionMenuEntry)value, diagnostics, context);
			case WebuiPackage.EDIT_STATIC_TEXT_MENU_ENTRY:
				return validateEditStaticTextMenuEntry((EditStaticTextMenuEntry)value, diagnostics, context);
			case WebuiPackage.CONTEXT_MENU:
				return validateContextMenu((ContextMenu)value, diagnostics, context);
			case WebuiPackage.DYNAMIC_MENU:
				return validateDynamicMenu((DynamicMenu)value, diagnostics, context);
			case WebuiPackage.MENU_FEATURE:
				return validateMenuFeature((MenuFeature)value, diagnostics, context);
			case WebuiPackage.QUERY:
				return validateQuery((Query)value, diagnostics, context);
			case WebuiPackage.QUERY_PARAMETER:
				return validateQueryParameter((QueryParameter)value, diagnostics, context);
			case WebuiPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case WebuiPackage.PAGE_LINK:
				return validatePageLink((PageLink)value, diagnostics, context);
			case WebuiPackage.FILTER:
				return validateFilter((Filter)value, diagnostics, context);
			case WebuiPackage.FILTER_PARAMETER:
				return validateFilterParameter((FilterParameter)value, diagnostics, context);
			case WebuiPackage.UNIT_CONTAINER:
				return validateUnitContainer((UnitContainer)value, diagnostics, context);
			case WebuiPackage.CONTENT_UNIT:
				return validateContentUnit((ContentUnit)value, diagnostics, context);
			case WebuiPackage.STATIC_UNIT:
				return validateStaticUnit((StaticUnit)value, diagnostics, context);
			case WebuiPackage.CREATE_SITEMAP_UNIT:
				return validateCreateSitemapUnit((CreateSitemapUnit)value, diagnostics, context);
			case WebuiPackage.DYNAMIC_UNIT:
				return validateDynamicUnit((DynamicUnit)value, diagnostics, context);
			case WebuiPackage.UNIT_FIELD:
				return validateUnitField((UnitField)value, diagnostics, context);
			case WebuiPackage.UNIT_FEATURE:
				return validateUnitFeature((UnitFeature)value, diagnostics, context);
			case WebuiPackage.UNIT_ELEMENT:
				return validateUnitElement((UnitElement)value, diagnostics, context);
			case WebuiPackage.UNIT_ASSOCIATION:
				return validateUnitAssociation((UnitAssociation)value, diagnostics, context);
			case WebuiPackage.ASSOCIATION_REFERENCE:
				return validateAssociationReference((AssociationReference)value, diagnostics, context);
			case WebuiPackage.INTERFACE_FIELD:
				return validateInterfaceField((InterfaceField)value, diagnostics, context);
			case WebuiPackage.DATA_TYPE_FIELD:
				return validateDataTypeField((DataTypeField)value, diagnostics, context);
			case WebuiPackage.DATE_FIELD:
				return validateDateField((DateField)value, diagnostics, context);
			case WebuiPackage.CAPTCHA_FIELD:
				return validateCaptchaField((CaptchaField)value, diagnostics, context);
			case WebuiPackage.UNIT_SUPPORT_ACTION:
				return validateUnitSupportAction((UnitSupportAction)value, diagnostics, context);
			case WebuiPackage.SELECTABLE_UNIT:
				return validateSelectableUnit((SelectableUnit)value, diagnostics, context);
			case WebuiPackage.SINGLETON_UNIT:
				return validateSingletonUnit((SingletonUnit)value, diagnostics, context);
			case WebuiPackage.COLLECTION_UNIT:
				return validateCollectionUnit((CollectionUnit)value, diagnostics, context);
			case WebuiPackage.EDIT_UNIT:
				return validateEditUnit((EditUnit)value, diagnostics, context);
			case WebuiPackage.CREATE_UNIT:
				return validateCreateUnit((CreateUnit)value, diagnostics, context);
			case WebuiPackage.CREATE_UPDATE_UNIT:
				return validateCreateUpdateUnit((CreateUpdateUnit)value, diagnostics, context);
			case WebuiPackage.UPDATE_UNIT:
				return validateUpdateUnit((UpdateUnit)value, diagnostics, context);
			case WebuiPackage.MAP_UNIT:
				return validateMapUnit((MapUnit)value, diagnostics, context);
			case WebuiPackage.DATA_UNIT:
				return validateDataUnit((DataUnit)value, diagnostics, context);
			case WebuiPackage.DETAILS_UNIT:
				return validateDetailsUnit((DetailsUnit)value, diagnostics, context);
			case WebuiPackage.INDEX_UNIT:
				return validateIndexUnit((IndexUnit)value, diagnostics, context);
			case WebuiPackage.CONTROL_UNIT:
				return validateControlUnit((ControlUnit)value, diagnostics, context);
			case WebuiPackage.SEARCH_UNIT:
				return validateSearchUnit((SearchUnit)value, diagnostics, context);
			case WebuiPackage.IMAGE_UNIT:
				return validateImageUnit((ImageUnit)value, diagnostics, context);
			case WebuiPackage.FEATURE_PATH:
				return validateFeaturePath((FeaturePath)value, diagnostics, context);
			case WebuiPackage.FEATURE_PATH_ATTRIBUTE:
				return validateFeaturePathAttribute((FeaturePathAttribute)value, diagnostics, context);
			case WebuiPackage.FEATURE_PATH_ASSOCIATION:
				return validateFeaturePathAssociation((FeaturePathAssociation)value, diagnostics, context);
			case WebuiPackage.CHILD_PATH:
				return validateChildPath((ChildPath)value, diagnostics, context);
			case WebuiPackage.CHILD_PATH_ATTRIBUTE:
				return validateChildPathAttribute((ChildPathAttribute)value, diagnostics, context);
			case WebuiPackage.CHILD_PATH_ASSOCIATION:
				return validateChildPathAssociation((ChildPathAssociation)value, diagnostics, context);
			case WebuiPackage.IMAGE_INDEX_UNIT:
				return validateImageIndexUnit((ImageIndexUnit)value, diagnostics, context);
			case WebuiPackage.SLIDER_UNIT:
				return validateSliderUnit((SliderUnit)value, diagnostics, context);
			case WebuiPackage.GALLERY_UNIT:
				return validateGalleryUnit((GalleryUnit)value, diagnostics, context);
			case WebuiPackage.AUTHENTICATION_UNIT:
				return validateAuthenticationUnit((AuthenticationUnit)value, diagnostics, context);
			case WebuiPackage.REGISTRATION_UNIT:
				return validateRegistrationUnit((RegistrationUnit)value, diagnostics, context);
			case WebuiPackage.LOGIN_UNIT:
				return validateLoginUnit((LoginUnit)value, diagnostics, context);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT:
				return validateForgottenPasswordUnit((ForgottenPasswordUnit)value, diagnostics, context);
			case WebuiPackage.INLINE_ACTION_CONTAINER:
				return validateInlineActionContainer((InlineActionContainer)value, diagnostics, context);
			case WebuiPackage.INLINE_ACTION:
				return validateInlineAction((InlineAction)value, diagnostics, context);
			case WebuiPackage.SELECT_ACTION:
				return validateSelectAction((SelectAction)value, diagnostics, context);
			case WebuiPackage.DELETE_ACTION:
				return validateDeleteAction((DeleteAction)value, diagnostics, context);
			case WebuiPackage.FEATURE_SUPPORT_ACTION:
				return validateFeatureSupportAction((FeatureSupportAction)value, diagnostics, context);
			case WebuiPackage.FEATURE_REFERENCE:
				return validateFeatureReference((FeatureReference)value, diagnostics, context);
			case WebuiPackage.INPUT_TECHNOLOGIES:
				return validateInputTechnologies((InputTechnologies)value, diagnostics, context);
			case WebuiPackage.AJAX_TECHNOLOGIES:
				return validateAjaxTechnologies((AjaxTechnologies)value, diagnostics, context);
			case WebuiPackage.PAGE_TOP_MENU_OPTIONS:
				return validatePageTopMenuOptions((PageTopMenuOptions)value, diagnostics, context);
			case WebuiPackage.COLLECTION_DISPLAY_OPTIONS:
				return validateCollectionDisplayOptions((CollectionDisplayOptions)value, diagnostics, context);
			case WebuiPackage.INDEX_DISPLAY_OPTION:
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
	public boolean validateWebUI(WebUI webUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webUI, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(menu, diagnostics, context);
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
	public boolean validateGlobalMenu(GlobalMenu globalMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalMenu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalMenu, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(globalMenu, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(staticMenu, diagnostics, context);
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
				(WebuiPackage.Literals.STATIC_MENU,
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(actionMenuEntry, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(editStaticTextMenuEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextMenu(ContextMenu contextMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contextMenu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contextMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contextMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contextMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contextMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contextMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contextMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contextMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contextMenu, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(contextMenu, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dynamicMenu, diagnostics, context);
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
				(WebuiPackage.Literals.DYNAMIC_MENU,
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
				(WebuiPackage.Literals.DYNAMIC_MENU,
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
				(WebuiPackage.Literals.DYNAMIC_MENU,
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
				(WebuiPackage.Literals.DYNAMIC_MENU,
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
		"\tif title.oclIsKindOf(persistence::EntityFeature) then\r\n" +
		"\t\ttitle.oclAsType(persistence::EntityFeature).cardinality <> persistence::Cardinality::Many\r\n" +
		"\telse if title.oclIsKindOf(persistence::EncapsulatedAttribute) then\r\n" +
		"\t\ttitle.oclAsType(persistence::EncapsulatedAttribute).cardinality <> persistence::Cardinality::Many\r\n" +
		"\telse if title.oclIsKindOf(persistence::EncapsulatedAssociation) then\r\n" +
		"\t\ttitle.oclAsType(persistence::EncapsulatedAssociation).cardinality <> persistence::Cardinality::Many\r\n" +
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
				(WebuiPackage.Literals.DYNAMIC_MENU,
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(page, diagnostics, context);
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
				(WebuiPackage.Literals.PAGE,
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
	public boolean validatePageLink(PageLink pageLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageLink, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(filter, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(filterParameter, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(contentUnit, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(staticUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(createSitemapUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(dynamicUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the featuresMustBeFromContentType constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_UNIT__FEATURES_MUST_BE_FROM_CONTENT_TYPE__EEXPRESSION = "let entities : OrderedSet(persistence::EntityOrView)\r\n" +
		"\t= if self.oclIsKindOf(SingletonUnit) then\r\n" +
		"\t\t\tOrderedSet{self.oclAsType(SingletonUnit).contentType}\r\n" +
		"\t\telse if self.oclIsKindOf(CollectionUnit) then\r\n" +
		"\t\t\tself.oclAsType(CollectionUnit).contentType\r\n" +
		"\t\telse\r\n" +
		"\t\t\tself.entities\r\n" +
		"\t\tendif endif\r\n" +
		"\tin let eovFeatures : Collection(persistence::Feature)\r\n" +
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
				(WebuiPackage.Literals.DYNAMIC_UNIT,
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
				(WebuiPackage.Literals.UNIT_FEATURE,
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
				(WebuiPackage.Literals.UNIT_FEATURE,
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
		"\tdisplayedOn.pageDisplayedOn.webUI.services.services\r\n" +
		"\t\t->select(s : service::Service | s.serves = targetEntity)\r\n" +
		"\t\t->collect(s : service::Service | s.selections)\r\n" +
		"\t\t->includes(selection)";

	/**
	 * Validates the selectionValidChoice constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAssociation_selectionValidChoice(UnitAssociation unitAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.UNIT_ASSOCIATION,
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
	public boolean validateAssociationReference(AssociationReference associationReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationReference, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(interfaceField, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dataTypeField, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dateField, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(captchaField, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(unitSupportAction, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(editUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(createUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(createUpdateUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(updateUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(mapUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dataUnit, diagnostics, context);
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
		"\tif title.oclIsKindOf(persistence::EntityAttribute) then\r\n" +
		"\t\ttitle.oclAsType(persistence::EntityAttribute).cardinality <> persistence::Cardinality::Many\r\n" +
		"\telse if title.oclIsKindOf(persistence::EncapsulatedAttribute) then\r\n" +
		"\t\ttitle.oclAsType(persistence::EncapsulatedAttribute).cardinality <> persistence::Cardinality::Many\r\n" +
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
				(WebuiPackage.Literals.DATA_UNIT,
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
		"\tpageDisplayedOn.webUI.services.services\r\n" +
		"\t\t->select(s : service::Service | entities->includes(s.serves))\r\n" +
		"\t\t->collect(s : service::Service | s.selections)\r\n" +
		"\t\t->includes(defaultSelection)";

	/**
	 * Validates the selectionValidChoice constraint of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataUnit_selectionValidChoice(DataUnit dataUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.DATA_UNIT,
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(detailsUnit, diagnostics, context);
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
				(WebuiPackage.Literals.DETAILS_UNIT,
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(indexUnit, diagnostics, context);
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
				(WebuiPackage.Literals.INDEX_UNIT,
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(controlUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(searchUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(imageUnit, diagnostics, context);
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
	public boolean validateChildPath(ChildPath childPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(childPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChildPathAttribute(ChildPathAttribute childPathAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(childPathAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChildPathAssociation(ChildPathAssociation childPathAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(childPathAssociation, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(imageIndexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(imageIndexUnit, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(sliderUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(galleryUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(registrationUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(loginUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(forgottenPasswordUnit, diagnostics, context);
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
				(WebuiPackage.Literals.INLINE_ACTION_CONTAINER,
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(inlineAction, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(selectAction, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(deleteAction, diagnostics, context);
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
		"\tlet attribute : persistence::Attribute\r\n" +
		"\t\t= usedBy.oclAsType(UnitElement).attribute\r\n" +
		"\t\tin if attribute.oclIsKindOf(persistence::EntityAttribute) then\r\n" +
		"\t\t\t\tattribute.oclAsType(persistence::EntityAttribute).cardinality <> persistence::Cardinality::Many\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tattribute.oclAsType(persistence::EncapsulatedAttribute).cardinality <> persistence::Cardinality::Many\r\n" +
		"\t\t\tendif\r\n" +
		"else if usedBy.oclIsKindOf(UnitAssociation) then\r\n" +
		"\tlet association : persistence::Association\r\n" +
		"\t\t= usedBy.oclAsType(UnitAssociation).association\r\n" +
		"\t\tin if association.oclIsKindOf(persistence::EntityAssociation) then\r\n" +
		"\t\t\t\tassociation.oclAsType(persistence::EntityAssociation).cardinality <> persistence::Cardinality::Many\r\n" +
		"\t\t\telse if association.oclIsKindOf(persistence::EncapsulatedAssociation) then\r\n" +
		"\t\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).cardinality <> persistence::Cardinality::Many\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tfalse -- association.oclAsType(ViewAssociation)\r\n" +
		"\t\t\tendif endif\r\n" +
		"else\r\n" +
		"\tusedBy.oclIsKindOf(CollectionUnit)\r\n" +
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
				(WebuiPackage.Literals.DELETE_ACTION,
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(featureSupportAction, diagnostics, context);
		return result;
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

} //WebuiValidator

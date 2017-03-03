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
			case WebsitePackage.FRAMEWORK_TECHNOLOGIES:
				return validateFrameworkTechnologies((FrameworkTechnologies)value, diagnostics, context);
			case WebsitePackage.INPUT_TECHNOLOGIES:
				return validateInputTechnologies((InputTechnologies)value, diagnostics, context);
			case WebsitePackage.AJAX_TECHNOLOGIES:
				return validateAjaxTechnologies((AjaxTechnologies)value, diagnostics, context);
			case WebsitePackage.AUTHENTICATION_KEY_TYPES:
				return validateAuthenticationKeyTypes((AuthenticationKeyTypes)value, diagnostics, context);
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

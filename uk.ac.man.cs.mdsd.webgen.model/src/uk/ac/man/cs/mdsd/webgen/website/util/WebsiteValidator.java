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
			case WebsitePackage.FRAMEWORK_TECHNOLOGIES:
				return validateFrameworkTechnologies((FrameworkTechnologies)value, diagnostics, context);
			case WebsitePackage.INPUT_TECHNOLOGIES:
				return validateInputTechnologies((InputTechnologies)value, diagnostics, context);
			case WebsitePackage.AJAX_TECHNOLOGIES:
				return validateAjaxTechnologies((AjaxTechnologies)value, diagnostics, context);
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

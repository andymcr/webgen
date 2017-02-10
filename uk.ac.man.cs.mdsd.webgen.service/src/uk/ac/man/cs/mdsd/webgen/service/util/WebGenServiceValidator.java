/**
 */
package uk.ac.man.cs.mdsd.webgen.service.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uk.ac.man.cs.mdsd.webgen.core.util.WebGenCoreValidator;
import uk.ac.man.cs.mdsd.webgen.service.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage
 * @generated
 */
public class WebGenServiceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebGenServiceValidator INSTANCE = new WebGenServiceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uk.ac.man.cs.mdsd.webgen.service";

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
	protected WebGenCoreValidator webGenCoreValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenServiceValidator() {
		super();
		webGenCoreValidator = WebGenCoreValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WebGenServicePackage.eINSTANCE;
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
			case WebGenServicePackage.SERVICES:
				return validateServices((Services)value, diagnostics, context);
			case WebGenServicePackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case WebGenServicePackage.SELECTION:
				return validateSelection((Selection)value, diagnostics, context);
			case WebGenServicePackage.BUSINESS_OPERATION:
				return validateBusinessOperation((BusinessOperation)value, diagnostics, context);
			case WebGenServicePackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case WebGenServicePackage.ASC:
				return validateAsc((Asc)value, diagnostics, context);
			case WebGenServicePackage.DESC:
				return validateDesc((Desc)value, diagnostics, context);
			case WebGenServicePackage.FEATURE_REFERENCE:
				return validateFeatureReference((FeatureReference)value, diagnostics, context);
			case WebGenServicePackage.PARAMETER_REFERENCE:
				return validateParameterReference((ParameterReference)value, diagnostics, context);
			case WebGenServicePackage.CURRENT_USER_REFERENCE:
				return validateCurrentUserReference((CurrentUserReference)value, diagnostics, context);
			case WebGenServicePackage.OPERATION_RESULT_TYPES:
				return validateOperationResultTypes((OperationResultTypes)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServices(Services services, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(services, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(services, diagnostics, context);
		if (result || diagnostics != null) result &= validateServices_servieNameUnique(services, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the servieNameUnique constraint of '<em>Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICES__SERVIE_NAME_UNIQUE__EEXPRESSION = "services->isUnique(name)";

	/**
	 * Validates the servieNameUnique constraint of '<em>Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServices_servieNameUnique(Services services, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebGenServicePackage.Literals.SERVICES,
				 services,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "servieNameUnique",
				 SERVICES__SERVIE_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= webGenCoreValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(service, diagnostics, context);
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
		if (result || diagnostics != null) result &= webGenCoreValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(selection, diagnostics, context);
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
		if (result || diagnostics != null) result &= webGenCoreValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(businessOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(order, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsc(Asc asc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesc(Desc desc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(desc, diagnostics, context);
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
	public boolean validateOperationResultTypes(OperationResultTypes operationResultTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //WebGenServiceValidator

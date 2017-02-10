/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uk.ac.man.cs.mdsd.webgen.persistence.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.persistence.WebGenPersistencePackage
 * @generated
 */
public class WebGenPersistenceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebGenPersistenceValidator INSTANCE = new WebGenPersistenceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uk.ac.man.cs.mdsd.webgen.persistence";

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
	public WebGenPersistenceValidator() {
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
	  return WebGenPersistencePackage.eINSTANCE;
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
			case WebGenPersistencePackage.PERSISTENCE:
				return validatePersistence((Persistence)value, diagnostics, context);
			case WebGenPersistencePackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case WebGenPersistencePackage.NAMED_DISPLAY_ELEMENT:
				return validateNamedDisplayElement((NamedDisplayElement)value, diagnostics, context);
			case WebGenPersistencePackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case WebGenPersistencePackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case WebGenPersistencePackage.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case WebGenPersistencePackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case WebGenPersistencePackage.ENTITY_OR_VIEW:
				return validateEntityOrView((EntityOrView)value, diagnostics, context);
			case WebGenPersistencePackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case WebGenPersistencePackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case WebGenPersistencePackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case WebGenPersistencePackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case WebGenPersistencePackage.MODEL_LABEL:
				return validateModelLabel((ModelLabel)value, diagnostics, context);
			case WebGenPersistencePackage.MODEL_LABEL_FEATURE:
				return validateModelLabelFeature((ModelLabelFeature)value, diagnostics, context);
			case WebGenPersistencePackage.MODEL_LABEL_ATTRIBUTE:
				return validateModelLabelAttribute((ModelLabelAttribute)value, diagnostics, context);
			case WebGenPersistencePackage.MODEL_LABEL_ASSOCIATION:
				return validateModelLabelAssociation((ModelLabelAssociation)value, diagnostics, context);
			case WebGenPersistencePackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case WebGenPersistencePackage.ENTITY_FEATURE:
				return validateEntityFeature((EntityFeature)value, diagnostics, context);
			case WebGenPersistencePackage.ENTITY_ATTRIBUTE:
				return validateEntityAttribute((EntityAttribute)value, diagnostics, context);
			case WebGenPersistencePackage.DATA_TYPE_ATTRIBUTE:
				return validateDataTypeAttribute((DataTypeAttribute)value, diagnostics, context);
			case WebGenPersistencePackage.DATE_ATTRIBUTE:
				return validateDateAttribute((DateAttribute)value, diagnostics, context);
			case WebGenPersistencePackage.URL_ATTRIBUTE:
				return validateUrlAttribute((UrlAttribute)value, diagnostics, context);
			case WebGenPersistencePackage.RESOURCE_ATTRIBUTE:
				return validateResourceAttribute((ResourceAttribute)value, diagnostics, context);
			case WebGenPersistencePackage.PATH_ELEMENT:
				return validatePathElement((PathElement)value, diagnostics, context);
			case WebGenPersistencePackage.STATIC_PATH_ELEMENT:
				return validateStaticPathElement((StaticPathElement)value, diagnostics, context);
			case WebGenPersistencePackage.DATE_PATH_ELEMENT:
				return validateDatePathElement((DatePathElement)value, diagnostics, context);
			case WebGenPersistencePackage.FILE_ATTRIBUTE:
				return validateFileAttribute((FileAttribute)value, diagnostics, context);
			case WebGenPersistencePackage.IMAGE_ATTRIBUTE:
				return validateImageAttribute((ImageAttribute)value, diagnostics, context);
			case WebGenPersistencePackage.LOCATION_ATTRIBUTE:
				return validateLocationAttribute((LocationAttribute)value, diagnostics, context);
			case WebGenPersistencePackage.ENTITY_ASSOCIATION:
				return validateEntityAssociation((EntityAssociation)value, diagnostics, context);
			case WebGenPersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT:
				return validateAssociationWithoutContainment((AssociationWithoutContainment)value, diagnostics, context);
			case WebGenPersistencePackage.ASSOCIATION_WITH_CONTAINMENT:
				return validateAssociationWithContainment((AssociationWithContainment)value, diagnostics, context);
			case WebGenPersistencePackage.ASSOCIATION_KEY:
				return validateAssociationKey((AssociationKey)value, diagnostics, context);
			case WebGenPersistencePackage.VIEW:
				return validateView((View)value, diagnostics, context);
			case WebGenPersistencePackage.VIEW_FEATURE:
				return validateViewFeature((ViewFeature)value, diagnostics, context);
			case WebGenPersistencePackage.ENCAPSULATED_FEATURE:
				return validateEncapsulatedFeature((EncapsulatedFeature)value, diagnostics, context);
			case WebGenPersistencePackage.ENCAPSULATED_ATTRIBUTE:
				return validateEncapsulatedAttribute((EncapsulatedAttribute)value, diagnostics, context);
			case WebGenPersistencePackage.ENCAPSULATED_ASSOCIATION:
				return validateEncapsulatedAssociation((EncapsulatedAssociation)value, diagnostics, context);
			case WebGenPersistencePackage.VIEW_ASSOCIATION:
				return validateViewAssociation((ViewAssociation)value, diagnostics, context);
			case WebGenPersistencePackage.DATABASE_TECHNOLOGIES:
				return validateDatabaseTechnologies((DatabaseTechnologies)value, diagnostics, context);
			case WebGenPersistencePackage.ORM_TECHNOLOGIES:
				return validateOrmTechnologies((OrmTechnologies)value, diagnostics, context);
			case WebGenPersistencePackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			case WebGenPersistencePackage.IS_HAS_CHOICES:
				return validateisHasChoices((isHasChoices)value, diagnostics, context);
			case WebGenPersistencePackage.DATE_DETAILS:
				return validateDateDetails((DateDetails)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistence(Persistence persistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(persistence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersistence_classifierNameUnique(persistence, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the classifierNameUnique constraint of '<em>Persistence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSISTENCE__CLASSIFIER_NAME_UNIQUE__EEXPRESSION = "classifiers->isUnique(name)";

	/**
	 * Validates the classifierNameUnique constraint of '<em>Persistence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistence_classifierNameUnique(Persistence persistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebGenPersistencePackage.Literals.PERSISTENCE,
				 persistence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "classifierNameUnique",
				 PERSISTENCE__CLASSIFIER_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
				(WebGenPersistencePackage.Literals.NAMED_ELEMENT,
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
				(WebGenPersistencePackage.Literals.ENTITY_OR_VIEW,
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
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
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
				(WebGenPersistencePackage.Literals.ENTITY,
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
				(WebGenPersistencePackage.Literals.ENTITY_ATTRIBUTE,
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
				(WebGenPersistencePackage.Literals.ASSOCIATION_WITHOUT_CONTAINMENT,
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
	public boolean validateAssociationKey(AssociationKey associationKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationKey, diagnostics, context);
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

} //WebGenPersistenceValidator

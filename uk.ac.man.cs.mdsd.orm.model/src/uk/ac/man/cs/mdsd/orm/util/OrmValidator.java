/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmValidator.java,v 1.17 2014/06/27 07:51:35 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uk.ac.man.cs.mdsd.orm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage
 * @generated
 */
public class OrmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrmValidator INSTANCE = new OrmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uk.ac.man.cs.mdsd.orm";

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
	public OrmValidator() {
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
	  return OrmPackage.eINSTANCE;
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
			case OrmPackage.ORM_MODEL:
				return validateOrmModel((OrmModel)value, diagnostics, context);
			case OrmPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case OrmPackage.NAMED_DISPLAY_ELEMENT:
				return validateNamedDisplayElement((NamedDisplayElement)value, diagnostics, context);
			case OrmPackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case OrmPackage.COLLECTION_TYPE:
				return validateCollectionType((CollectionType)value, diagnostics, context);
			case OrmPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case OrmPackage.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case OrmPackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case OrmPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case OrmPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case OrmPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case OrmPackage.SINGLETON_ATTRIBUTE:
				return validateSingletonAttribute((SingletonAttribute)value, diagnostics, context);
			case OrmPackage.COLLECTION_ATTRIBUTE:
				return validateCollectionAttribute((CollectionAttribute)value, diagnostics, context);
			case OrmPackage.SINGLETON_ELEMENT:
				return validateSingletonElement((SingletonElement)value, diagnostics, context);
			case OrmPackage.COLLECTION_ELEMENT:
				return validateCollectionElement((CollectionElement)value, diagnostics, context);
			case OrmPackage.DATE_ATTRIBUTE:
				return validateDateAttribute((DateAttribute)value, diagnostics, context);
			case OrmPackage.SINGLETON_DATE:
				return validateSingletonDate((SingletonDate)value, diagnostics, context);
			case OrmPackage.COLLECTION_DATE:
				return validateCollectionDate((CollectionDate)value, diagnostics, context);
			case OrmPackage.SINGLETON_RESOURCE:
				return validateSingletonResource((SingletonResource)value, diagnostics, context);
			case OrmPackage.SINGLETON_FILE:
				return validateSingletonFile((SingletonFile)value, diagnostics, context);
			case OrmPackage.SINGLETON_IMAGE:
				return validateSingletonImage((SingletonImage)value, diagnostics, context);
			case OrmPackage.SINGLETON_LOCATION:
				return validateSingletonLocation((SingletonLocation)value, diagnostics, context);
			case OrmPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case OrmPackage.SINGLETON_ASSOCIATION:
				return validateSingletonAssociation((SingletonAssociation)value, diagnostics, context);
			case OrmPackage.COLLECTION_ASSOCIATION:
				return validateCollectionAssociation((CollectionAssociation)value, diagnostics, context);
			case OrmPackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			case OrmPackage.DATABASE_TECHNOLOGIES:
				return validateDatabaseTechnologies((DatabaseTechnologies)value, diagnostics, context);
			case OrmPackage.COLLECTION_TYPES:
				return validateCollectionTypes((CollectionTypes)value, diagnostics, context);
			case OrmPackage.DATE_DETAILS:
				return validateDateDetails((DateDetails)value, diagnostics, context);
			case OrmPackage.SINGLETON_ASSOCIATION_RELATIONSHIPS:
				return validateSingletonAssociationRelationships((SingletonAssociationRelationships)value, diagnostics, context);
			case OrmPackage.COLLECTION_ASSOCIATION_RELATIONSHIPS:
				return validateCollectionAssociationRelationships((CollectionAssociationRelationships)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrmModel(OrmModel ormModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ormModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedDisplayElement(NamedDisplayElement namedDisplayElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedDisplayElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionType(CollectionType collectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType(EnumerationType enumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
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
	public boolean validateSingletonAttribute(SingletonAttribute singletonAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singletonAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionAttribute(CollectionAttribute collectionAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collectionAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonElement(SingletonElement singletonElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singletonElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionElement(CollectionElement collectionElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collectionElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateAttribute(DateAttribute dateAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonDate(SingletonDate singletonDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singletonDate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionDate(CollectionDate collectionDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collectionDate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonResource(SingletonResource singletonResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singletonResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonFile(SingletonFile singletonFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singletonFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonImage(SingletonImage singletonImage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singletonImage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonLocation(SingletonLocation singletonLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singletonLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_onlyOneSourceEnd(association, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyOneSourceEnd constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__ONLY_ONE_SOURCE_END__EEXPRESSION = "sourceEnd xor opposite.sourceEnd";

	/**
	 * Validates the onlyOneSourceEnd constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_onlyOneSourceEnd(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OrmPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "onlyOneSourceEnd",
				 ASSOCIATION__ONLY_ONE_SOURCE_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonAssociation(SingletonAssociation singletonAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singletonAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singletonAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singletonAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singletonAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singletonAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singletonAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singletonAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singletonAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singletonAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_onlyOneSourceEnd(singletonAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionAssociation(CollectionAssociation collectionAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_onlyOneSourceEnd(collectionAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionAssociation_x(collectionAssociation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the x constraint of '<em>Collection Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLLECTION_ASSOCIATION__X__EEXPRESSION = "collectionType.elementType = opposite.parentEntity";

	/**
	 * Validates the x constraint of '<em>Collection Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionAssociation_x(CollectionAssociation collectionAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OrmPackage.Literals.COLLECTION_ASSOCIATION,
				 collectionAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "x",
				 COLLECTION_ASSOCIATION__X__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateDatabaseTechnologies(DatabaseTechnologies databaseTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionTypes(CollectionTypes collectionTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSingletonAssociationRelationships(SingletonAssociationRelationships singletonAssociationRelationships, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionAssociationRelationships(CollectionAssociationRelationships collectionAssociationRelationships, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //OrmValidator

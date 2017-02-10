/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.man.cs.mdsd.webgen.persistence.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebGenPersistenceFactoryImpl extends EFactoryImpl implements WebGenPersistenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebGenPersistenceFactory init() {
		try {
			WebGenPersistenceFactory theWebGenPersistenceFactory = (WebGenPersistenceFactory)EPackage.Registry.INSTANCE.getEFactory(WebGenPersistencePackage.eNS_URI);
			if (theWebGenPersistenceFactory != null) {
				return theWebGenPersistenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebGenPersistenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenPersistenceFactoryImpl() {
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
			case WebGenPersistencePackage.PERSISTENCE: return createPersistence();
			case WebGenPersistencePackage.DATA_TYPE: return createDataType();
			case WebGenPersistencePackage.ENUMERATION_TYPE: return createEnumerationType();
			case WebGenPersistencePackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case WebGenPersistencePackage.MODEL_LABEL: return createModelLabel();
			case WebGenPersistencePackage.MODEL_LABEL_ATTRIBUTE: return createModelLabelAttribute();
			case WebGenPersistencePackage.MODEL_LABEL_ASSOCIATION: return createModelLabelAssociation();
			case WebGenPersistencePackage.ENTITY: return createEntity();
			case WebGenPersistencePackage.DATA_TYPE_ATTRIBUTE: return createDataTypeAttribute();
			case WebGenPersistencePackage.DATE_ATTRIBUTE: return createDateAttribute();
			case WebGenPersistencePackage.URL_ATTRIBUTE: return createUrlAttribute();
			case WebGenPersistencePackage.STATIC_PATH_ELEMENT: return createStaticPathElement();
			case WebGenPersistencePackage.DATE_PATH_ELEMENT: return createDatePathElement();
			case WebGenPersistencePackage.FILE_ATTRIBUTE: return createFileAttribute();
			case WebGenPersistencePackage.IMAGE_ATTRIBUTE: return createImageAttribute();
			case WebGenPersistencePackage.LOCATION_ATTRIBUTE: return createLocationAttribute();
			case WebGenPersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT: return createAssociationWithoutContainment();
			case WebGenPersistencePackage.ASSOCIATION_WITH_CONTAINMENT: return createAssociationWithContainment();
			case WebGenPersistencePackage.ASSOCIATION_KEY: return createAssociationKey();
			case WebGenPersistencePackage.VIEW: return createView();
			case WebGenPersistencePackage.ENCAPSULATED_FEATURE: return createEncapsulatedFeature();
			case WebGenPersistencePackage.ENCAPSULATED_ATTRIBUTE: return createEncapsulatedAttribute();
			case WebGenPersistencePackage.ENCAPSULATED_ASSOCIATION: return createEncapsulatedAssociation();
			case WebGenPersistencePackage.VIEW_ASSOCIATION: return createViewAssociation();
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
			case WebGenPersistencePackage.DATABASE_TECHNOLOGIES:
				return createDatabaseTechnologiesFromString(eDataType, initialValue);
			case WebGenPersistencePackage.ORM_TECHNOLOGIES:
				return createOrmTechnologiesFromString(eDataType, initialValue);
			case WebGenPersistencePackage.CARDINALITY:
				return createCardinalityFromString(eDataType, initialValue);
			case WebGenPersistencePackage.IS_HAS_CHOICES:
				return createisHasChoicesFromString(eDataType, initialValue);
			case WebGenPersistencePackage.DATE_DETAILS:
				return createDateDetailsFromString(eDataType, initialValue);
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
			case WebGenPersistencePackage.DATABASE_TECHNOLOGIES:
				return convertDatabaseTechnologiesToString(eDataType, instanceValue);
			case WebGenPersistencePackage.ORM_TECHNOLOGIES:
				return convertOrmTechnologiesToString(eDataType, instanceValue);
			case WebGenPersistencePackage.CARDINALITY:
				return convertCardinalityToString(eDataType, instanceValue);
			case WebGenPersistencePackage.IS_HAS_CHOICES:
				return convertisHasChoicesToString(eDataType, instanceValue);
			case WebGenPersistencePackage.DATE_DETAILS:
				return convertDateDetailsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persistence createPersistence() {
		PersistenceImpl persistence = new PersistenceImpl();
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabel createModelLabel() {
		ModelLabelImpl modelLabel = new ModelLabelImpl();
		return modelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabelAttribute createModelLabelAttribute() {
		ModelLabelAttributeImpl modelLabelAttribute = new ModelLabelAttributeImpl();
		return modelLabelAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabelAssociation createModelLabelAssociation() {
		ModelLabelAssociationImpl modelLabelAssociation = new ModelLabelAssociationImpl();
		return modelLabelAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeAttribute createDataTypeAttribute() {
		DataTypeAttributeImpl dataTypeAttribute = new DataTypeAttributeImpl();
		return dataTypeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateAttribute createDateAttribute() {
		DateAttributeImpl dateAttribute = new DateAttributeImpl();
		return dateAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlAttribute createUrlAttribute() {
		UrlAttributeImpl urlAttribute = new UrlAttributeImpl();
		return urlAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticPathElement createStaticPathElement() {
		StaticPathElementImpl staticPathElement = new StaticPathElementImpl();
		return staticPathElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePathElement createDatePathElement() {
		DatePathElementImpl datePathElement = new DatePathElementImpl();
		return datePathElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileAttribute createFileAttribute() {
		FileAttributeImpl fileAttribute = new FileAttributeImpl();
		return fileAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAttribute createImageAttribute() {
		ImageAttributeImpl imageAttribute = new ImageAttributeImpl();
		return imageAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationAttribute createLocationAttribute() {
		LocationAttributeImpl locationAttribute = new LocationAttributeImpl();
		return locationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationWithoutContainment createAssociationWithoutContainment() {
		AssociationWithoutContainmentImpl associationWithoutContainment = new AssociationWithoutContainmentImpl();
		return associationWithoutContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationWithContainment createAssociationWithContainment() {
		AssociationWithContainmentImpl associationWithContainment = new AssociationWithContainmentImpl();
		return associationWithContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationKey createAssociationKey() {
		AssociationKeyImpl associationKey = new AssociationKeyImpl();
		return associationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedFeature createEncapsulatedFeature() {
		EncapsulatedFeatureImpl encapsulatedFeature = new EncapsulatedFeatureImpl();
		return encapsulatedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAttribute createEncapsulatedAttribute() {
		EncapsulatedAttributeImpl encapsulatedAttribute = new EncapsulatedAttributeImpl();
		return encapsulatedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAssociation createEncapsulatedAssociation() {
		EncapsulatedAssociationImpl encapsulatedAssociation = new EncapsulatedAssociationImpl();
		return encapsulatedAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewAssociation createViewAssociation() {
		ViewAssociationImpl viewAssociation = new ViewAssociationImpl();
		return viewAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseTechnologies createDatabaseTechnologiesFromString(EDataType eDataType, String initialValue) {
		DatabaseTechnologies result = DatabaseTechnologies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseTechnologiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmTechnologies createOrmTechnologiesFromString(EDataType eDataType, String initialValue) {
		OrmTechnologies result = OrmTechnologies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrmTechnologiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinalityFromString(EDataType eDataType, String initialValue) {
		Cardinality result = Cardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isHasChoices createisHasChoicesFromString(EDataType eDataType, String initialValue) {
		isHasChoices result = isHasChoices.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertisHasChoicesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDetails createDateDetailsFromString(EDataType eDataType, String initialValue) {
		DateDetails result = DateDetails.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateDetailsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenPersistencePackage getWebGenPersistencePackage() {
		return (WebGenPersistencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebGenPersistencePackage getPackage() {
		return WebGenPersistencePackage.eINSTANCE;
	}

} //WebGenPersistenceFactoryImpl

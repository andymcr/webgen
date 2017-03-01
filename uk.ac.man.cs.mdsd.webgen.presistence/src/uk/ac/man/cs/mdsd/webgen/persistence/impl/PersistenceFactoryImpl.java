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
public class PersistenceFactoryImpl extends EFactoryImpl implements PersistenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersistenceFactory init() {
		try {
			PersistenceFactory thePersistenceFactory = (PersistenceFactory)EPackage.Registry.INSTANCE.getEFactory(PersistencePackage.eNS_URI);
			if (thePersistenceFactory != null) {
				return thePersistenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PersistenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactoryImpl() {
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
			case PersistencePackage.MODEL_LABEL: return createModelLabel();
			case PersistencePackage.MODEL_LABEL_ATTRIBUTE: return createModelLabelAttribute();
			case PersistencePackage.MODEL_LABEL_ASSOCIATION: return createModelLabelAssociation();
			case PersistencePackage.ENTITY: return createEntity();
			case PersistencePackage.DATA_TYPE_ATTRIBUTE: return createDataTypeAttribute();
			case PersistencePackage.DATE_ATTRIBUTE: return createDateAttribute();
			case PersistencePackage.URL_ATTRIBUTE: return createUrlAttribute();
			case PersistencePackage.STATIC_PATH_ELEMENT: return createStaticPathElement();
			case PersistencePackage.DATE_PATH_ELEMENT: return createDatePathElement();
			case PersistencePackage.FILE_ATTRIBUTE: return createFileAttribute();
			case PersistencePackage.IMAGE_ATTRIBUTE: return createImageAttribute();
			case PersistencePackage.LOCATION_ATTRIBUTE: return createLocationAttribute();
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT: return createAssociationWithoutContainment();
			case PersistencePackage.ASSOCIATION_WITH_CONTAINMENT: return createAssociationWithContainment();
			case PersistencePackage.ASSOCIATION_KEY: return createAssociationKey();
			case PersistencePackage.VIEW: return createView();
			case PersistencePackage.ENCAPSULATED_FEATURE: return createEncapsulatedFeature();
			case PersistencePackage.ENCAPSULATED_ATTRIBUTE: return createEncapsulatedAttribute();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION: return createEncapsulatedAssociation();
			case PersistencePackage.VIEW_ASSOCIATION: return createViewAssociation();
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
			case PersistencePackage.DATABASE_TECHNOLOGIES:
				return createDatabaseTechnologiesFromString(eDataType, initialValue);
			case PersistencePackage.ORM_TECHNOLOGIES:
				return createOrmTechnologiesFromString(eDataType, initialValue);
			case PersistencePackage.CARDINALITY:
				return createCardinalityFromString(eDataType, initialValue);
			case PersistencePackage.IS_HAS_CHOICES:
				return createisHasChoicesFromString(eDataType, initialValue);
			case PersistencePackage.DATE_DETAILS:
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
			case PersistencePackage.DATABASE_TECHNOLOGIES:
				return convertDatabaseTechnologiesToString(eDataType, instanceValue);
			case PersistencePackage.ORM_TECHNOLOGIES:
				return convertOrmTechnologiesToString(eDataType, instanceValue);
			case PersistencePackage.CARDINALITY:
				return convertCardinalityToString(eDataType, instanceValue);
			case PersistencePackage.IS_HAS_CHOICES:
				return convertisHasChoicesToString(eDataType, instanceValue);
			case PersistencePackage.DATE_DETAILS:
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
	public PersistencePackage getPersistencePackage() {
		return (PersistencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PersistencePackage getPackage() {
		return PersistencePackage.eINSTANCE;
	}

} //PersistenceFactoryImpl

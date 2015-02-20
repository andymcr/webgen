/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmFactoryImpl.java,v 1.14 2014/06/27 07:51:35 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.man.cs.mdsd.orm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrmFactoryImpl extends EFactoryImpl implements OrmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrmFactory init() {
		try {
			OrmFactory theOrmFactory = (OrmFactory)EPackage.Registry.INSTANCE.getEFactory(OrmPackage.eNS_URI);
			if (theOrmFactory != null) {
				return theOrmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmFactoryImpl() {
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
			case OrmPackage.ORM_MODEL: return createOrmModel();
			case OrmPackage.COLLECTION_TYPE: return createCollectionType();
			case OrmPackage.DATA_TYPE: return createDataType();
			case OrmPackage.ENUMERATION_TYPE: return createEnumerationType();
			case OrmPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case OrmPackage.ENTITY: return createEntity();
			case OrmPackage.SINGLETON_ELEMENT: return createSingletonElement();
			case OrmPackage.COLLECTION_ELEMENT: return createCollectionElement();
			case OrmPackage.SINGLETON_DATE: return createSingletonDate();
			case OrmPackage.COLLECTION_DATE: return createCollectionDate();
			case OrmPackage.SINGLETON_FILE: return createSingletonFile();
			case OrmPackage.SINGLETON_IMAGE: return createSingletonImage();
			case OrmPackage.SINGLETON_LOCATION: return createSingletonLocation();
			case OrmPackage.SINGLETON_ASSOCIATION: return createSingletonAssociation();
			case OrmPackage.COLLECTION_ASSOCIATION: return createCollectionAssociation();
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
			case OrmPackage.CARDINALITY:
				return createCardinalityFromString(eDataType, initialValue);
			case OrmPackage.DATABASE_TECHNOLOGIES:
				return createDatabaseTechnologiesFromString(eDataType, initialValue);
			case OrmPackage.ORM_TECHNOLOGIES:
				return createOrmTechnologiesFromString(eDataType, initialValue);
			case OrmPackage.COLLECTION_TYPES:
				return createCollectionTypesFromString(eDataType, initialValue);
			case OrmPackage.DATE_DETAILS:
				return createDateDetailsFromString(eDataType, initialValue);
			case OrmPackage.SINGLETON_ASSOCIATION_RELATIONSHIPS:
				return createSingletonAssociationRelationshipsFromString(eDataType, initialValue);
			case OrmPackage.COLLECTION_ASSOCIATION_RELATIONSHIPS:
				return createCollectionAssociationRelationshipsFromString(eDataType, initialValue);
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
			case OrmPackage.CARDINALITY:
				return convertCardinalityToString(eDataType, instanceValue);
			case OrmPackage.DATABASE_TECHNOLOGIES:
				return convertDatabaseTechnologiesToString(eDataType, instanceValue);
			case OrmPackage.ORM_TECHNOLOGIES:
				return convertOrmTechnologiesToString(eDataType, instanceValue);
			case OrmPackage.COLLECTION_TYPES:
				return convertCollectionTypesToString(eDataType, instanceValue);
			case OrmPackage.DATE_DETAILS:
				return convertDateDetailsToString(eDataType, instanceValue);
			case OrmPackage.SINGLETON_ASSOCIATION_RELATIONSHIPS:
				return convertSingletonAssociationRelationshipsToString(eDataType, instanceValue);
			case OrmPackage.COLLECTION_ASSOCIATION_RELATIONSHIPS:
				return convertCollectionAssociationRelationshipsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmModel createOrmModel() {
		OrmModelImpl ormModel = new OrmModelImpl();
		return ormModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
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
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonElement createSingletonElement() {
		SingletonElementImpl singletonElement = new SingletonElementImpl();
		return singletonElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionElement createCollectionElement() {
		CollectionElementImpl collectionElement = new CollectionElementImpl();
		return collectionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonDate createSingletonDate() {
		SingletonDateImpl singletonDate = new SingletonDateImpl();
		return singletonDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDate createCollectionDate() {
		CollectionDateImpl collectionDate = new CollectionDateImpl();
		return collectionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonFile createSingletonFile() {
		SingletonFileImpl singletonFile = new SingletonFileImpl();
		return singletonFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonImage createSingletonImage() {
		SingletonImageImpl singletonImage = new SingletonImageImpl();
		return singletonImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonLocation createSingletonLocation() {
		SingletonLocationImpl singletonLocation = new SingletonLocationImpl();
		return singletonLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonAssociation createSingletonAssociation() {
		SingletonAssociationImpl singletonAssociation = new SingletonAssociationImpl();
		return singletonAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionAssociation createCollectionAssociation() {
		CollectionAssociationImpl collectionAssociation = new CollectionAssociationImpl();
		return collectionAssociation;
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
	public CollectionTypes createCollectionTypesFromString(EDataType eDataType, String initialValue) {
		CollectionTypes result = CollectionTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionTypesToString(EDataType eDataType, Object instanceValue) {
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
	public SingletonAssociationRelationships createSingletonAssociationRelationshipsFromString(EDataType eDataType, String initialValue) {
		SingletonAssociationRelationships result = SingletonAssociationRelationships.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSingletonAssociationRelationshipsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionAssociationRelationships createCollectionAssociationRelationshipsFromString(EDataType eDataType, String initialValue) {
		CollectionAssociationRelationships result = CollectionAssociationRelationships.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionAssociationRelationshipsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmPackage getOrmPackage() {
		return (OrmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrmPackage getPackage() {
		return OrmPackage.eINSTANCE;
	}

} //OrmFactoryImpl

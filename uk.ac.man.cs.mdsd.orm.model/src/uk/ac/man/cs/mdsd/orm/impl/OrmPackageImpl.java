/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmPackageImpl.java,v 1.34 2014/06/27 07:51:35 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.criteria.CriteriaPackage;
import uk.ac.man.cs.mdsd.orm.Association;
import uk.ac.man.cs.mdsd.orm.Attribute;
import uk.ac.man.cs.mdsd.orm.Cardinality;
import uk.ac.man.cs.mdsd.orm.Classifier;
import uk.ac.man.cs.mdsd.orm.CollectionAssociation;
import uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships;
import uk.ac.man.cs.mdsd.orm.CollectionAttribute;
import uk.ac.man.cs.mdsd.orm.CollectionDate;
import uk.ac.man.cs.mdsd.orm.CollectionElement;
import uk.ac.man.cs.mdsd.orm.CollectionTypes;
import uk.ac.man.cs.mdsd.orm.CollectionType;
import uk.ac.man.cs.mdsd.orm.DataType;
import uk.ac.man.cs.mdsd.orm.DatabaseTechnologies;
import uk.ac.man.cs.mdsd.orm.DateAttribute;
import uk.ac.man.cs.mdsd.orm.DateDetails;
import uk.ac.man.cs.mdsd.orm.Entity;
import uk.ac.man.cs.mdsd.orm.EnumerationLiteral;
import uk.ac.man.cs.mdsd.orm.EnumerationType;
import uk.ac.man.cs.mdsd.orm.Feature;
import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;
import uk.ac.man.cs.mdsd.orm.NamedElement;
import uk.ac.man.cs.mdsd.orm.OrmFactory;
import uk.ac.man.cs.mdsd.orm.OrmModel;
import uk.ac.man.cs.mdsd.orm.OrmPackage;
import uk.ac.man.cs.mdsd.orm.OrmTechnologies;
import uk.ac.man.cs.mdsd.orm.SingletonAssociation;
import uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships;
import uk.ac.man.cs.mdsd.orm.SingletonAttribute;
import uk.ac.man.cs.mdsd.orm.SingletonDate;
import uk.ac.man.cs.mdsd.orm.SingletonElement;
import uk.ac.man.cs.mdsd.orm.SingletonFile;
import uk.ac.man.cs.mdsd.orm.SingletonImage;
import uk.ac.man.cs.mdsd.orm.SingletonLocation;
import uk.ac.man.cs.mdsd.orm.SingletonResource;
import uk.ac.man.cs.mdsd.orm.util.OrmValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrmPackageImpl extends EPackageImpl implements OrmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ormModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedDisplayElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ormTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateDetailsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum singletonAssociationRelationshipsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionAssociationRelationshipsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrmPackageImpl() {
		super(eNS_URI, OrmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OrmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrmPackage init() {
		if (isInited) return (OrmPackage)EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);

		// Obtain or create and register package
		OrmPackageImpl theOrmPackage = (OrmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CriteriaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOrmPackage.createPackageContents();

		// Initialize created meta-data
		theOrmPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOrmPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OrmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOrmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrmPackage.eNS_URI, theOrmPackage);
		return theOrmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrmModel() {
		return ormModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrmModel_CollectionTypes() {
		return (EReference)ormModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrmModel_DatabaseTechnology() {
		return (EAttribute)ormModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrmModel_OrmTechnology() {
		return (EAttribute)ormModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrmModel_DataTypes() {
		return (EReference)ormModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrmModel_Entities() {
		return (EReference)ormModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedDisplayElement() {
		return namedDisplayElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedDisplayElement_DisplayLabel() {
		return (EAttribute)namedDisplayElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionType() {
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionType_CollectionType() {
		return (EAttribute)collectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionType_ElementType() {
		return (EReference)collectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionType_PersistenceType() {
		return (EAttribute)collectionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionType_JavaInterfaceType() {
		return (EAttribute)collectionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionType_JavaImplementationType() {
		return (EAttribute)collectionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType() {
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationType_Enumerations() {
		return (EReference)enumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PartOf() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_TableName() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Keys() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_AutoKeyName() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Contains() {
		return (EReference)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Container() {
		return (EReference)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Features() {
		return (EReference)entityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_DisplayFeatures() {
		return (EReference)entityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_DisplayFormat() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_ColumnName() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_ParentEntity() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_InputField() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_HeaderClass() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_InputClass() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_DisplayClass() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_FooterClass() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_PersistentType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_OrmType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonAttribute() {
		return singletonAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonAttribute_Required() {
		return (EAttribute)singletonAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonAttribute_Unique() {
		return (EAttribute)singletonAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingletonAttribute_DefaultValue() {
		return (EReference)singletonAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionAttribute() {
		return collectionAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonElement() {
		return singletonElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingletonElement_DataType() {
		return (EReference)singletonElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonElement_ObfuscateFormFields() {
		return (EAttribute)singletonElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonElement_CaseInsensitive() {
		return (EAttribute)singletonElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonElement_Encrypt() {
		return (EAttribute)singletonElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionElement() {
		return collectionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionElement_CollectionType() {
		return (EReference)collectionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateAttribute() {
		return dateAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateAttribute_Details() {
		return (EAttribute)dateAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonDate() {
		return singletonDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionDate() {
		return collectionDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonResource() {
		return singletonResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonResource_MaximumUploadSize() {
		return (EAttribute)singletonResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonResource_ValidUploadMimeTypes() {
		return (EAttribute)singletonResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonResource_ValidUploadExtensions() {
		return (EAttribute)singletonResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonResource_UploadsWithinWebsite() {
		return (EAttribute)singletonResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonResource_RelativeUploadDirectory() {
		return (EAttribute)singletonResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonFile() {
		return singletonFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonImage() {
		return singletonImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonLocation() {
		return singletonLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Opposite() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_SourceEnd() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Bidirectional() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Containment() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_PivotTableName() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonAssociation() {
		return singletonAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonAssociation_Required() {
		return (EAttribute)singletonAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonAssociation_AssociationRelationship() {
		return (EAttribute)singletonAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionAssociation() {
		return collectionAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionAssociation_CollectionType() {
		return (EReference)collectionAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionAssociation_AssociationRelationship() {
		return (EAttribute)collectionAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinality() {
		return cardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseTechnologies() {
		return databaseTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrmTechnologies() {
		return ormTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCollectionTypes() {
		return collectionTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDateDetails() {
		return dateDetailsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSingletonAssociationRelationships() {
		return singletonAssociationRelationshipsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCollectionAssociationRelationships() {
		return collectionAssociationRelationshipsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmFactory getOrmFactory() {
		return (OrmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ormModelEClass = createEClass(ORM_MODEL);
		createEReference(ormModelEClass, ORM_MODEL__DATA_TYPES);
		createEReference(ormModelEClass, ORM_MODEL__ENTITIES);
		createEReference(ormModelEClass, ORM_MODEL__COLLECTION_TYPES);
		createEAttribute(ormModelEClass, ORM_MODEL__DATABASE_TECHNOLOGY);
		createEAttribute(ormModelEClass, ORM_MODEL__ORM_TECHNOLOGY);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		namedDisplayElementEClass = createEClass(NAMED_DISPLAY_ELEMENT);
		createEAttribute(namedDisplayElementEClass, NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL);

		classifierEClass = createEClass(CLASSIFIER);

		collectionTypeEClass = createEClass(COLLECTION_TYPE);
		createEAttribute(collectionTypeEClass, COLLECTION_TYPE__COLLECTION_TYPE);
		createEReference(collectionTypeEClass, COLLECTION_TYPE__ELEMENT_TYPE);
		createEAttribute(collectionTypeEClass, COLLECTION_TYPE__PERSISTENCE_TYPE);
		createEAttribute(collectionTypeEClass, COLLECTION_TYPE__JAVA_INTERFACE_TYPE);
		createEAttribute(collectionTypeEClass, COLLECTION_TYPE__JAVA_IMPLEMENTATION_TYPE);

		dataTypeEClass = createEClass(DATA_TYPE);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);
		createEReference(enumerationTypeEClass, ENUMERATION_TYPE__ENUMERATIONS);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__PART_OF);
		createEAttribute(entityEClass, ENTITY__TABLE_NAME);
		createEReference(entityEClass, ENTITY__KEYS);
		createEAttribute(entityEClass, ENTITY__AUTO_KEY_NAME);
		createEReference(entityEClass, ENTITY__CONTAINS);
		createEReference(entityEClass, ENTITY__CONTAINER);
		createEReference(entityEClass, ENTITY__FEATURES);
		createEReference(entityEClass, ENTITY__DISPLAY_FEATURES);
		createEAttribute(entityEClass, ENTITY__DISPLAY_FORMAT);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__COLUMN_NAME);
		createEReference(featureEClass, FEATURE__PARENT_ENTITY);
		createEAttribute(featureEClass, FEATURE__INPUT_FIELD);
		createEAttribute(featureEClass, FEATURE__HEADER_CLASS);
		createEAttribute(featureEClass, FEATURE__INPUT_CLASS);
		createEAttribute(featureEClass, FEATURE__DISPLAY_CLASS);
		createEAttribute(featureEClass, FEATURE__FOOTER_CLASS);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__PERSISTENT_TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__ORM_TYPE);

		singletonAttributeEClass = createEClass(SINGLETON_ATTRIBUTE);
		createEAttribute(singletonAttributeEClass, SINGLETON_ATTRIBUTE__REQUIRED);
		createEAttribute(singletonAttributeEClass, SINGLETON_ATTRIBUTE__UNIQUE);
		createEReference(singletonAttributeEClass, SINGLETON_ATTRIBUTE__DEFAULT_VALUE);

		collectionAttributeEClass = createEClass(COLLECTION_ATTRIBUTE);

		singletonElementEClass = createEClass(SINGLETON_ELEMENT);
		createEReference(singletonElementEClass, SINGLETON_ELEMENT__DATA_TYPE);
		createEAttribute(singletonElementEClass, SINGLETON_ELEMENT__OBFUSCATE_FORM_FIELDS);
		createEAttribute(singletonElementEClass, SINGLETON_ELEMENT__CASE_INSENSITIVE);
		createEAttribute(singletonElementEClass, SINGLETON_ELEMENT__ENCRYPT);

		collectionElementEClass = createEClass(COLLECTION_ELEMENT);
		createEReference(collectionElementEClass, COLLECTION_ELEMENT__COLLECTION_TYPE);

		dateAttributeEClass = createEClass(DATE_ATTRIBUTE);
		createEAttribute(dateAttributeEClass, DATE_ATTRIBUTE__DETAILS);

		singletonDateEClass = createEClass(SINGLETON_DATE);

		collectionDateEClass = createEClass(COLLECTION_DATE);

		singletonResourceEClass = createEClass(SINGLETON_RESOURCE);
		createEAttribute(singletonResourceEClass, SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE);
		createEAttribute(singletonResourceEClass, SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES);
		createEAttribute(singletonResourceEClass, SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS);
		createEAttribute(singletonResourceEClass, SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE);
		createEAttribute(singletonResourceEClass, SINGLETON_RESOURCE__RELATIVE_UPLOAD_DIRECTORY);

		singletonFileEClass = createEClass(SINGLETON_FILE);

		singletonImageEClass = createEClass(SINGLETON_IMAGE);

		singletonLocationEClass = createEClass(SINGLETON_LOCATION);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__OPPOSITE);
		createEAttribute(associationEClass, ASSOCIATION__SOURCE_END);
		createEAttribute(associationEClass, ASSOCIATION__BIDIRECTIONAL);
		createEAttribute(associationEClass, ASSOCIATION__CONTAINMENT);
		createEAttribute(associationEClass, ASSOCIATION__PIVOT_TABLE_NAME);

		singletonAssociationEClass = createEClass(SINGLETON_ASSOCIATION);
		createEAttribute(singletonAssociationEClass, SINGLETON_ASSOCIATION__REQUIRED);
		createEAttribute(singletonAssociationEClass, SINGLETON_ASSOCIATION__ASSOCIATION_RELATIONSHIP);

		collectionAssociationEClass = createEClass(COLLECTION_ASSOCIATION);
		createEReference(collectionAssociationEClass, COLLECTION_ASSOCIATION__COLLECTION_TYPE);
		createEAttribute(collectionAssociationEClass, COLLECTION_ASSOCIATION__ASSOCIATION_RELATIONSHIP);

		// Create enums
		cardinalityEEnum = createEEnum(CARDINALITY);
		databaseTechnologiesEEnum = createEEnum(DATABASE_TECHNOLOGIES);
		ormTechnologiesEEnum = createEEnum(ORM_TECHNOLOGIES);
		collectionTypesEEnum = createEEnum(COLLECTION_TYPES);
		dateDetailsEEnum = createEEnum(DATE_DETAILS);
		singletonAssociationRelationshipsEEnum = createEEnum(SINGLETON_ASSOCIATION_RELATIONSHIPS);
		collectionAssociationRelationshipsEEnum = createEEnum(COLLECTION_ASSOCIATION_RELATIONSHIPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CriteriaPackage theCriteriaPackage = (CriteriaPackage)EPackage.Registry.INSTANCE.getEPackage(CriteriaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedDisplayElementEClass.getESuperTypes().add(this.getNamedElement());
		classifierEClass.getESuperTypes().add(this.getNamedDisplayElement());
		collectionTypeEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		enumerationTypeEClass.getESuperTypes().add(this.getDataType());
		enumerationLiteralEClass.getESuperTypes().add(this.getNamedDisplayElement());
		entityEClass.getESuperTypes().add(this.getClassifier());
		featureEClass.getESuperTypes().add(this.getNamedDisplayElement());
		attributeEClass.getESuperTypes().add(this.getFeature());
		singletonAttributeEClass.getESuperTypes().add(this.getAttribute());
		collectionAttributeEClass.getESuperTypes().add(this.getAttribute());
		singletonElementEClass.getESuperTypes().add(this.getSingletonAttribute());
		collectionElementEClass.getESuperTypes().add(this.getCollectionAttribute());
		singletonDateEClass.getESuperTypes().add(this.getSingletonAttribute());
		singletonDateEClass.getESuperTypes().add(this.getDateAttribute());
		collectionDateEClass.getESuperTypes().add(this.getCollectionAttribute());
		collectionDateEClass.getESuperTypes().add(this.getDateAttribute());
		singletonResourceEClass.getESuperTypes().add(this.getSingletonAttribute());
		singletonFileEClass.getESuperTypes().add(this.getSingletonResource());
		singletonImageEClass.getESuperTypes().add(this.getSingletonResource());
		singletonLocationEClass.getESuperTypes().add(this.getSingletonAttribute());
		associationEClass.getESuperTypes().add(this.getFeature());
		singletonAssociationEClass.getESuperTypes().add(this.getAssociation());
		collectionAssociationEClass.getESuperTypes().add(this.getAssociation());

		// Initialize classes and features; add operations and parameters
		initEClass(ormModelEClass, OrmModel.class, "OrmModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrmModel_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, OrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrmModel_Entities(), this.getEntity(), this.getEntity_PartOf(), "entities", null, 0, -1, OrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrmModel_CollectionTypes(), this.getCollectionType(), null, "collectionTypes", null, 0, -1, OrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrmModel_DatabaseTechnology(), this.getDatabaseTechnologies(), "databaseTechnology", "MySql", 0, 1, OrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrmModel_OrmTechnology(), this.getOrmTechnologies(), "ormTechnology", null, 0, 1, OrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedDisplayElementEClass, NamedDisplayElement.class, "NamedDisplayElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedDisplayElement_DisplayLabel(), ecorePackage.getEString(), "displayLabel", null, 1, 1, NamedDisplayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectionType_CollectionType(), this.getCollectionTypes(), "collectionType", null, 0, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionType_ElementType(), this.getClassifier(), null, "elementType", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionType_PersistenceType(), ecorePackage.getEString(), "persistenceType", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionType_JavaInterfaceType(), ecorePackage.getEString(), "javaInterfaceType", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionType_JavaImplementationType(), ecorePackage.getEString(), "javaImplementationType", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationType_Enumerations(), this.getEnumerationLiteral(), null, "enumerations", null, 0, -1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_PartOf(), this.getOrmModel(), this.getOrmModel_Entities(), "partOf", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEntity_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Keys(), this.getFeature(), null, "keys", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_AutoKeyName(), ecorePackage.getEString(), "autoKeyName", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Contains(), this.getEntity(), this.getEntity_Container(), "contains", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Container(), this.getEntity(), this.getEntity_Contains(), "container", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Features(), this.getFeature(), this.getFeature_ParentEntity(), "features", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_DisplayFeatures(), this.getFeature(), null, "displayFeatures", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_DisplayFormat(), ecorePackage.getEString(), "displayFormat", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_ColumnName(), ecorePackage.getEString(), "columnName", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_ParentEntity(), this.getEntity(), this.getEntity_Features(), "parentEntity", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_InputField(), ecorePackage.getEBooleanObject(), "inputField", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_HeaderClass(), ecorePackage.getEString(), "headerClass", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_InputClass(), ecorePackage.getEString(), "inputClass", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_DisplayClass(), ecorePackage.getEString(), "displayClass", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_FooterClass(), ecorePackage.getEString(), "footerClass", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_PersistentType(), ecorePackage.getEString(), "persistentType", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_OrmType(), ecorePackage.getEString(), "ormType", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonAttributeEClass, SingletonAttribute.class, "SingletonAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingletonAttribute_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, SingletonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSingletonAttribute_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, SingletonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSingletonAttribute_DefaultValue(), theCriteriaPackage.getExpression(), null, "defaultValue", null, 0, 1, SingletonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectionAttributeEClass, CollectionAttribute.class, "CollectionAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singletonElementEClass, SingletonElement.class, "SingletonElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingletonElement_DataType(), this.getDataType(), null, "dataType", null, 1, 1, SingletonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSingletonElement_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", null, 0, 1, SingletonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSingletonElement_CaseInsensitive(), ecorePackage.getEBoolean(), "caseInsensitive", null, 0, 1, SingletonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSingletonElement_Encrypt(), ecorePackage.getEBoolean(), "encrypt", null, 0, 1, SingletonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectionElementEClass, CollectionElement.class, "CollectionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionElement_CollectionType(), this.getCollectionType(), null, "collectionType", null, 1, 1, CollectionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateAttributeEClass, DateAttribute.class, "DateAttribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateAttribute_Details(), this.getDateDetails(), "details", null, 0, 1, DateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonDateEClass, SingletonDate.class, "SingletonDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionDateEClass, CollectionDate.class, "CollectionDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singletonResourceEClass, SingletonResource.class, "SingletonResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingletonResource_MaximumUploadSize(), ecorePackage.getEInt(), "maximumUploadSize", null, 0, 1, SingletonResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingletonResource_ValidUploadMimeTypes(), ecorePackage.getEString(), "validUploadMimeTypes", null, 0, -1, SingletonResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingletonResource_ValidUploadExtensions(), ecorePackage.getEString(), "validUploadExtensions", null, 0, -1, SingletonResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingletonResource_UploadsWithinWebsite(), ecorePackage.getEBoolean(), "uploadsWithinWebsite", null, 0, 1, SingletonResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingletonResource_RelativeUploadDirectory(), ecorePackage.getEString(), "relativeUploadDirectory", null, 0, 1, SingletonResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonFileEClass, SingletonFile.class, "SingletonFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singletonImageEClass, SingletonImage.class, "SingletonImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singletonLocationEClass, SingletonLocation.class, "SingletonLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Opposite(), this.getAssociation(), this.getAssociation_Opposite(), "opposite", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_SourceEnd(), ecorePackage.getEBoolean(), "sourceEnd", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Bidirectional(), ecorePackage.getEBoolean(), "bidirectional", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Containment(), ecorePackage.getEBoolean(), "containment", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_PivotTableName(), ecorePackage.getEString(), "pivotTableName", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonAssociationEClass, SingletonAssociation.class, "SingletonAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingletonAssociation_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, SingletonAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingletonAssociation_AssociationRelationship(), this.getSingletonAssociationRelationships(), "associationRelationship", null, 0, 1, SingletonAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionAssociationEClass, CollectionAssociation.class, "CollectionAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionAssociation_CollectionType(), this.getCollectionType(), null, "collectionType", null, 1, 1, CollectionAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionAssociation_AssociationRelationship(), this.getCollectionAssociationRelationships(), "associationRelationship", null, 0, 1, CollectionAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
		addEEnumLiteral(cardinalityEEnum, Cardinality.OPTIONAL);
		addEEnumLiteral(cardinalityEEnum, Cardinality.REQUIRED);
		addEEnumLiteral(cardinalityEEnum, Cardinality.MANY);

		initEEnum(databaseTechnologiesEEnum, DatabaseTechnologies.class, "DatabaseTechnologies");
		addEEnumLiteral(databaseTechnologiesEEnum, DatabaseTechnologies.MY_SQL);
		addEEnumLiteral(databaseTechnologiesEEnum, DatabaseTechnologies.ORACLE);

		initEEnum(ormTechnologiesEEnum, OrmTechnologies.class, "OrmTechnologies");
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.JPA);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.DATA_MAPPER);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.IDIORM);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.KOHANA);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.DOCTRINE);

		initEEnum(collectionTypesEEnum, CollectionTypes.class, "CollectionTypes");
		addEEnumLiteral(collectionTypesEEnum, CollectionTypes.BAG);
		addEEnumLiteral(collectionTypesEEnum, CollectionTypes.LIST);
		addEEnumLiteral(collectionTypesEEnum, CollectionTypes.ORDERED_SET);
		addEEnumLiteral(collectionTypesEEnum, CollectionTypes.SET);

		initEEnum(dateDetailsEEnum, DateDetails.class, "DateDetails");
		addEEnumLiteral(dateDetailsEEnum, DateDetails.DATE_ONLY);
		addEEnumLiteral(dateDetailsEEnum, DateDetails.TIME_ONLY);
		addEEnumLiteral(dateDetailsEEnum, DateDetails.DATE_AND_TIME);

		initEEnum(singletonAssociationRelationshipsEEnum, SingletonAssociationRelationships.class, "SingletonAssociationRelationships");
		addEEnumLiteral(singletonAssociationRelationshipsEEnum, SingletonAssociationRelationships.ONE_TO_ONE);
		addEEnumLiteral(singletonAssociationRelationshipsEEnum, SingletonAssociationRelationships.MANY_TO_ONE);

		initEEnum(collectionAssociationRelationshipsEEnum, CollectionAssociationRelationships.class, "CollectionAssociationRelationships");
		addEEnumLiteral(collectionAssociationRelationshipsEEnum, CollectionAssociationRelationships.ONE_TO_MANY);
		addEEnumLiteral(collectionAssociationRelationshipsEEnum, CollectionAssociationRelationships.MANY_TO_MANY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });		
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "constraints", "onlyOneSourceEnd"
		   });			
		addAnnotation
		  (collectionAssociationEClass, 
		   source, 
		   new String[] {
			 "constraints", "x"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";				
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "onlyOneSourceEnd", "sourceEnd xor opposite.sourceEnd"
		   });			
		addAnnotation
		  (collectionAssociationEClass, 
		   source, 
		   new String[] {
			 "x", "collectionType.elementType = opposite.parentEntity"
		   });
	}

} //OrmPackageImpl

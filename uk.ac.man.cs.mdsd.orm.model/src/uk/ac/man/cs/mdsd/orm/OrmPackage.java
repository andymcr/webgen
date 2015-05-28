/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmPackage.java,v 1.34 2014/06/27 07:51:35 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.orm.OrmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/uk.ac.man.cs.mdsd.orm.model/src' editDirectory='/uk.ac.man.cs.mdsd.orm.edit/src' editPluginID='uk.ac.man.cs.mdsd.orm.edit' childCreationExtenders='true' complianceLevel='6.0' basePackage='uk.ac.man.cs.mdsd'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' OCL='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface OrmPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "orm";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.cs.man.ac.uk/mdsd/2010/ObjectRelationalMapping";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "orm";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	OrmPackage eINSTANCE = uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl.init();

	/**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.OrmModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmModelImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getOrmModel()
   * @generated
   */
	int ORM_MODEL = 0;

	/**
   * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL__DATA_TYPES = 0;

	/**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL__ENTITIES = 1;

	/**
   * The feature id for the '<em><b>Collection Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL__COLLECTION_TYPES = 2;

	/**
   * The feature id for the '<em><b>Database Technology</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL__DATABASE_TECHNOLOGY = 3;

	/**
   * The feature id for the '<em><b>Database Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL__DATABASE_PREFIX = 4;

	/**
   * The feature id for the '<em><b>Database Host</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL__DATABASE_HOST = 5;

	/**
   * The feature id for the '<em><b>Database Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL__DATABASE_NAME = 6;

	/**
   * The feature id for the '<em><b>Database Username</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL__DATABASE_USERNAME = 7;

	/**
   * The feature id for the '<em><b>Database Password</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL__DATABASE_PASSWORD = 8;

	/**
   * The feature id for the '<em><b>Orm Technology</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL__ORM_TECHNOLOGY = 9;

	/**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ORM_MODEL_FEATURE_COUNT = 10;

	/**
   * The number of operations of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORM_MODEL_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getNamedElement()
   * @generated
   */
	int NAMED_ELEMENT = 1;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_ELEMENT__NAME = 0;

	/**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
   * The number of operations of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.NamedDisplayElementImpl <em>Named Display Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.NamedDisplayElementImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getNamedDisplayElement()
   * @generated
   */
	int NAMED_DISPLAY_ELEMENT = 2;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_DISPLAY_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Named Display Element</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_DISPLAY_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The number of operations of the '<em>Named Display Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_DISPLAY_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.ClassifierImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getClassifier()
   * @generated
   */
	int CLASSIFIER = 3;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASSIFIER__NAME = NAMED_DISPLAY_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASSIFIER__DISPLAY_LABEL = NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASSIFIER_FEATURE_COUNT = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_OPERATION_COUNT = NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.CollectionTypeImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionType()
   * @generated
   */
	int COLLECTION_TYPE = 4;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Collection Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_TYPE__COLLECTION_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Element Type</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_TYPE__ELEMENT_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_TYPE__PERSISTENCE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Java Interface Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_TYPE__JAVA_INTERFACE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Java Implementation Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_TYPE__JAVA_IMPLEMENTATION_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
   * The number of structural features of the '<em>Collection Type</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
   * The number of operations of the '<em>Collection Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.DataTypeImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getDataType()
   * @generated
   */
	int DATA_TYPE = 5;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_TYPE__NAME = CLASSIFIER__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_TYPE__DISPLAY_LABEL = CLASSIFIER__DISPLAY_LABEL;

	/**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.EnumerationTypeImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getEnumerationType()
   * @generated
   */
	int ENUMERATION_TYPE = 6;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENUMERATION_TYPE__NAME = DATA_TYPE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENUMERATION_TYPE__DISPLAY_LABEL = DATA_TYPE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENUMERATION_TYPE__ENUMERATIONS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Enumeration Type</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENUMERATION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
   * The number of operations of the '<em>Enumeration Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.EnumerationLiteralImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getEnumerationLiteral()
   * @generated
   */
	int ENUMERATION_LITERAL = 7;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENUMERATION_LITERAL__NAME = NAMED_DISPLAY_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENUMERATION_LITERAL__DISPLAY_LABEL = NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
   * The number of structural features of the '<em>Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_OPERATION_COUNT = NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.EntityImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getEntity()
   * @generated
   */
	int ENTITY = 8;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__NAME = CLASSIFIER__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__DISPLAY_LABEL = CLASSIFIER__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Part Of</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__PART_OF = CLASSIFIER_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__TABLE_NAME = CLASSIFIER_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Keys</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__KEYS = CLASSIFIER_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Auto Key Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__AUTO_KEY_NAME = CLASSIFIER_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Contains</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__CONTAINS = CLASSIFIER_FEATURE_COUNT + 4;

	/**
   * The feature id for the '<em><b>Container</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__CONTAINER = CLASSIFIER_FEATURE_COUNT + 5;

	/**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__FEATURES = CLASSIFIER_FEATURE_COUNT + 6;

	/**
   * The feature id for the '<em><b>Display Features</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__DISPLAY_FEATURES = CLASSIFIER_FEATURE_COUNT + 7;

	/**
   * The feature id for the '<em><b>Display Format</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY__DISPLAY_FORMAT = CLASSIFIER_FEATURE_COUNT + 8;

	/**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ENTITY_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 9;

	/**
   * The number of operations of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.FeatureImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getFeature()
   * @generated
   */
	int FEATURE = 9;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FEATURE__NAME = NAMED_DISPLAY_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FEATURE__DISPLAY_LABEL = NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FEATURE__COLUMN_NAME = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FEATURE__PARENT_ENTITY = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FEATURE__INPUT_FIELD = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FEATURE__HEADER_CLASS = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FEATURE__INPUT_CLASS = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FEATURE__DISPLAY_CLASS = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FEATURE__FOOTER_CLASS = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FEATURE_FEATURE_COUNT = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
   * The number of operations of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OPERATION_COUNT = NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.AttributeImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getAttribute()
   * @generated
   */
	int ATTRIBUTE = 10;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__NAME = FEATURE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__DISPLAY_LABEL = FEATURE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__COLUMN_NAME = FEATURE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__PARENT_ENTITY = FEATURE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__INPUT_FIELD = FEATURE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__HEADER_CLASS = FEATURE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__INPUT_CLASS = FEATURE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__DISPLAY_CLASS = FEATURE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__FOOTER_CLASS = FEATURE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__PERSISTENT_TYPE = FEATURE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__ORM_TYPE = FEATURE_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
   * The number of operations of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonAttributeImpl <em>Singleton Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.SingletonAttributeImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonAttribute()
   * @generated
   */
	int SINGLETON_ATTRIBUTE = 11;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__DISPLAY_LABEL = ATTRIBUTE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__COLUMN_NAME = ATTRIBUTE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__PARENT_ENTITY = ATTRIBUTE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__INPUT_FIELD = ATTRIBUTE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__HEADER_CLASS = ATTRIBUTE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__INPUT_CLASS = ATTRIBUTE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__DISPLAY_CLASS = ATTRIBUTE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__FOOTER_CLASS = ATTRIBUTE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__PERSISTENT_TYPE = ATTRIBUTE__PERSISTENT_TYPE;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__ORM_TYPE = ATTRIBUTE__ORM_TYPE;

	/**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__REQUIRED = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__UNIQUE = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Singleton Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
   * The number of operations of the '<em>Singleton Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLETON_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.CollectionAttributeImpl <em>Collection Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.CollectionAttributeImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionAttribute()
   * @generated
   */
	int COLLECTION_ATTRIBUTE = 12;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__DISPLAY_LABEL = ATTRIBUTE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__COLUMN_NAME = ATTRIBUTE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__PARENT_ENTITY = ATTRIBUTE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__INPUT_FIELD = ATTRIBUTE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__HEADER_CLASS = ATTRIBUTE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__INPUT_CLASS = ATTRIBUTE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__DISPLAY_CLASS = ATTRIBUTE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__FOOTER_CLASS = ATTRIBUTE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__PERSISTENT_TYPE = ATTRIBUTE__PERSISTENT_TYPE;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE__ORM_TYPE = ATTRIBUTE__ORM_TYPE;

	/**
   * The number of structural features of the '<em>Collection Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Collection Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonElementImpl <em>Singleton Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.SingletonElementImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonElement()
   * @generated
   */
	int SINGLETON_ELEMENT = 13;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__NAME = SINGLETON_ATTRIBUTE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__DISPLAY_LABEL = SINGLETON_ATTRIBUTE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__COLUMN_NAME = SINGLETON_ATTRIBUTE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__PARENT_ENTITY = SINGLETON_ATTRIBUTE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__INPUT_FIELD = SINGLETON_ATTRIBUTE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__HEADER_CLASS = SINGLETON_ATTRIBUTE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__INPUT_CLASS = SINGLETON_ATTRIBUTE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__DISPLAY_CLASS = SINGLETON_ATTRIBUTE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__FOOTER_CLASS = SINGLETON_ATTRIBUTE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__PERSISTENT_TYPE = SINGLETON_ATTRIBUTE__PERSISTENT_TYPE;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__ORM_TYPE = SINGLETON_ATTRIBUTE__ORM_TYPE;

	/**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__REQUIRED = SINGLETON_ATTRIBUTE__REQUIRED;

	/**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__UNIQUE = SINGLETON_ATTRIBUTE__UNIQUE;

	/**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__DEFAULT_VALUE = SINGLETON_ATTRIBUTE__DEFAULT_VALUE;

	/**
   * The feature id for the '<em><b>Data Type</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__DATA_TYPE = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__OBFUSCATE_FORM_FIELDS = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Case Insensitive</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__CASE_INSENSITIVE = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Encrypt</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT__ENCRYPT = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
   * The number of structural features of the '<em>Singleton Element</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ELEMENT_FEATURE_COUNT = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
   * The number of operations of the '<em>Singleton Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLETON_ELEMENT_OPERATION_COUNT = SINGLETON_ATTRIBUTE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.CollectionElementImpl <em>Collection Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.CollectionElementImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionElement()
   * @generated
   */
	int COLLECTION_ELEMENT = 14;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__NAME = COLLECTION_ATTRIBUTE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__DISPLAY_LABEL = COLLECTION_ATTRIBUTE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__COLUMN_NAME = COLLECTION_ATTRIBUTE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__PARENT_ENTITY = COLLECTION_ATTRIBUTE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__INPUT_FIELD = COLLECTION_ATTRIBUTE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__HEADER_CLASS = COLLECTION_ATTRIBUTE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__INPUT_CLASS = COLLECTION_ATTRIBUTE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__DISPLAY_CLASS = COLLECTION_ATTRIBUTE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__FOOTER_CLASS = COLLECTION_ATTRIBUTE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__PERSISTENT_TYPE = COLLECTION_ATTRIBUTE__PERSISTENT_TYPE;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__ORM_TYPE = COLLECTION_ATTRIBUTE__ORM_TYPE;

	/**
   * The feature id for the '<em><b>Collection Type</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT__COLLECTION_TYPE = COLLECTION_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Collection Element</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ELEMENT_FEATURE_COUNT = COLLECTION_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
   * The number of operations of the '<em>Collection Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ELEMENT_OPERATION_COUNT = COLLECTION_ATTRIBUTE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.DateAttribute <em>Date Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.DateAttribute
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getDateAttribute()
   * @generated
   */
	int DATE_ATTRIBUTE = 15;

	/**
   * The feature id for the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATE_ATTRIBUTE__DETAILS = 0;

	/**
   * The number of structural features of the '<em>Date Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATE_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
   * The number of operations of the '<em>Date Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ATTRIBUTE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonDateImpl <em>Singleton Date</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.SingletonDateImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonDate()
   * @generated
   */
	int SINGLETON_DATE = 16;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__NAME = SINGLETON_ATTRIBUTE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__DISPLAY_LABEL = SINGLETON_ATTRIBUTE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__COLUMN_NAME = SINGLETON_ATTRIBUTE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__PARENT_ENTITY = SINGLETON_ATTRIBUTE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__INPUT_FIELD = SINGLETON_ATTRIBUTE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__HEADER_CLASS = SINGLETON_ATTRIBUTE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__INPUT_CLASS = SINGLETON_ATTRIBUTE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__DISPLAY_CLASS = SINGLETON_ATTRIBUTE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__FOOTER_CLASS = SINGLETON_ATTRIBUTE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__PERSISTENT_TYPE = SINGLETON_ATTRIBUTE__PERSISTENT_TYPE;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__ORM_TYPE = SINGLETON_ATTRIBUTE__ORM_TYPE;

	/**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__REQUIRED = SINGLETON_ATTRIBUTE__REQUIRED;

	/**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__UNIQUE = SINGLETON_ATTRIBUTE__UNIQUE;

	/**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__DEFAULT_VALUE = SINGLETON_ATTRIBUTE__DEFAULT_VALUE;

	/**
   * The feature id for the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE__DETAILS = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Singleton Date</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_DATE_FEATURE_COUNT = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
   * The number of operations of the '<em>Singleton Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLETON_DATE_OPERATION_COUNT = SINGLETON_ATTRIBUTE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.CollectionDateImpl <em>Collection Date</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.CollectionDateImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionDate()
   * @generated
   */
	int COLLECTION_DATE = 17;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__NAME = COLLECTION_ATTRIBUTE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__DISPLAY_LABEL = COLLECTION_ATTRIBUTE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__COLUMN_NAME = COLLECTION_ATTRIBUTE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__PARENT_ENTITY = COLLECTION_ATTRIBUTE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__INPUT_FIELD = COLLECTION_ATTRIBUTE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__HEADER_CLASS = COLLECTION_ATTRIBUTE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__INPUT_CLASS = COLLECTION_ATTRIBUTE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__DISPLAY_CLASS = COLLECTION_ATTRIBUTE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__FOOTER_CLASS = COLLECTION_ATTRIBUTE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__PERSISTENT_TYPE = COLLECTION_ATTRIBUTE__PERSISTENT_TYPE;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__ORM_TYPE = COLLECTION_ATTRIBUTE__ORM_TYPE;

	/**
   * The feature id for the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE__DETAILS = COLLECTION_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Collection Date</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_DATE_FEATURE_COUNT = COLLECTION_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
   * The number of operations of the '<em>Collection Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_DATE_OPERATION_COUNT = COLLECTION_ATTRIBUTE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonResourceImpl <em>Singleton Resource</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.SingletonResourceImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonResource()
   * @generated
   */
	int SINGLETON_RESOURCE = 18;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__NAME = SINGLETON_ATTRIBUTE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__DISPLAY_LABEL = SINGLETON_ATTRIBUTE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__COLUMN_NAME = SINGLETON_ATTRIBUTE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__PARENT_ENTITY = SINGLETON_ATTRIBUTE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__INPUT_FIELD = SINGLETON_ATTRIBUTE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__HEADER_CLASS = SINGLETON_ATTRIBUTE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__INPUT_CLASS = SINGLETON_ATTRIBUTE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__DISPLAY_CLASS = SINGLETON_ATTRIBUTE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__FOOTER_CLASS = SINGLETON_ATTRIBUTE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__PERSISTENT_TYPE = SINGLETON_ATTRIBUTE__PERSISTENT_TYPE;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__ORM_TYPE = SINGLETON_ATTRIBUTE__ORM_TYPE;

	/**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__REQUIRED = SINGLETON_ATTRIBUTE__REQUIRED;

	/**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__UNIQUE = SINGLETON_ATTRIBUTE__UNIQUE;

	/**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__DEFAULT_VALUE = SINGLETON_ATTRIBUTE__DEFAULT_VALUE;

	/**
   * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Uploads Within Website</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Relative Upload Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE__RELATIVE_UPLOAD_DIRECTORY = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
   * The number of structural features of the '<em>Singleton Resource</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_RESOURCE_FEATURE_COUNT = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 5;

	/**
   * The number of operations of the '<em>Singleton Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLETON_RESOURCE_OPERATION_COUNT = SINGLETON_ATTRIBUTE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonFileImpl <em>Singleton File</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.SingletonFileImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonFile()
   * @generated
   */
	int SINGLETON_FILE = 19;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__NAME = SINGLETON_RESOURCE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__DISPLAY_LABEL = SINGLETON_RESOURCE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__COLUMN_NAME = SINGLETON_RESOURCE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__PARENT_ENTITY = SINGLETON_RESOURCE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__INPUT_FIELD = SINGLETON_RESOURCE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__HEADER_CLASS = SINGLETON_RESOURCE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__INPUT_CLASS = SINGLETON_RESOURCE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__DISPLAY_CLASS = SINGLETON_RESOURCE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__FOOTER_CLASS = SINGLETON_RESOURCE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__PERSISTENT_TYPE = SINGLETON_RESOURCE__PERSISTENT_TYPE;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__ORM_TYPE = SINGLETON_RESOURCE__ORM_TYPE;

	/**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__REQUIRED = SINGLETON_RESOURCE__REQUIRED;

	/**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__UNIQUE = SINGLETON_RESOURCE__UNIQUE;

	/**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__DEFAULT_VALUE = SINGLETON_RESOURCE__DEFAULT_VALUE;

	/**
   * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__MAXIMUM_UPLOAD_SIZE = SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE;

	/**
   * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__VALID_UPLOAD_MIME_TYPES = SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES;

	/**
   * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__VALID_UPLOAD_EXTENSIONS = SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS;

	/**
   * The feature id for the '<em><b>Uploads Within Website</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__UPLOADS_WITHIN_WEBSITE = SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE;

	/**
   * The feature id for the '<em><b>Relative Upload Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE__RELATIVE_UPLOAD_DIRECTORY = SINGLETON_RESOURCE__RELATIVE_UPLOAD_DIRECTORY;

	/**
   * The number of structural features of the '<em>Singleton File</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_FILE_FEATURE_COUNT = SINGLETON_RESOURCE_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Singleton File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLETON_FILE_OPERATION_COUNT = SINGLETON_RESOURCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonImageImpl <em>Singleton Image</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.SingletonImageImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonImage()
   * @generated
   */
	int SINGLETON_IMAGE = 20;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__NAME = SINGLETON_RESOURCE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__DISPLAY_LABEL = SINGLETON_RESOURCE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__COLUMN_NAME = SINGLETON_RESOURCE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__PARENT_ENTITY = SINGLETON_RESOURCE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__INPUT_FIELD = SINGLETON_RESOURCE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__HEADER_CLASS = SINGLETON_RESOURCE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__INPUT_CLASS = SINGLETON_RESOURCE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__DISPLAY_CLASS = SINGLETON_RESOURCE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__FOOTER_CLASS = SINGLETON_RESOURCE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__PERSISTENT_TYPE = SINGLETON_RESOURCE__PERSISTENT_TYPE;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__ORM_TYPE = SINGLETON_RESOURCE__ORM_TYPE;

	/**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__REQUIRED = SINGLETON_RESOURCE__REQUIRED;

	/**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__UNIQUE = SINGLETON_RESOURCE__UNIQUE;

	/**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__DEFAULT_VALUE = SINGLETON_RESOURCE__DEFAULT_VALUE;

	/**
   * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__MAXIMUM_UPLOAD_SIZE = SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE;

	/**
   * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__VALID_UPLOAD_MIME_TYPES = SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES;

	/**
   * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__VALID_UPLOAD_EXTENSIONS = SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS;

	/**
   * The feature id for the '<em><b>Uploads Within Website</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__UPLOADS_WITHIN_WEBSITE = SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE;

	/**
   * The feature id for the '<em><b>Relative Upload Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE__RELATIVE_UPLOAD_DIRECTORY = SINGLETON_RESOURCE__RELATIVE_UPLOAD_DIRECTORY;

	/**
   * The number of structural features of the '<em>Singleton Image</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_IMAGE_FEATURE_COUNT = SINGLETON_RESOURCE_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Singleton Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLETON_IMAGE_OPERATION_COUNT = SINGLETON_RESOURCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonLocationImpl <em>Singleton Location</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.SingletonLocationImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonLocation()
   * @generated
   */
	int SINGLETON_LOCATION = 21;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__NAME = SINGLETON_ATTRIBUTE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__DISPLAY_LABEL = SINGLETON_ATTRIBUTE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__COLUMN_NAME = SINGLETON_ATTRIBUTE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__PARENT_ENTITY = SINGLETON_ATTRIBUTE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__INPUT_FIELD = SINGLETON_ATTRIBUTE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__HEADER_CLASS = SINGLETON_ATTRIBUTE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__INPUT_CLASS = SINGLETON_ATTRIBUTE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__DISPLAY_CLASS = SINGLETON_ATTRIBUTE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__FOOTER_CLASS = SINGLETON_ATTRIBUTE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__PERSISTENT_TYPE = SINGLETON_ATTRIBUTE__PERSISTENT_TYPE;

	/**
   * The feature id for the '<em><b>Orm Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__ORM_TYPE = SINGLETON_ATTRIBUTE__ORM_TYPE;

	/**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__REQUIRED = SINGLETON_ATTRIBUTE__REQUIRED;

	/**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__UNIQUE = SINGLETON_ATTRIBUTE__UNIQUE;

	/**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION__DEFAULT_VALUE = SINGLETON_ATTRIBUTE__DEFAULT_VALUE;

	/**
   * The number of structural features of the '<em>Singleton Location</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_LOCATION_FEATURE_COUNT = SINGLETON_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Singleton Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLETON_LOCATION_OPERATION_COUNT = SINGLETON_ATTRIBUTE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.AssociationImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getAssociation()
   * @generated
   */
	int ASSOCIATION = 22;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__NAME = FEATURE__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__DISPLAY_LABEL = FEATURE__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__COLUMN_NAME = FEATURE__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__PARENT_ENTITY = FEATURE__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__INPUT_FIELD = FEATURE__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__HEADER_CLASS = FEATURE__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__INPUT_CLASS = FEATURE__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__DISPLAY_CLASS = FEATURE__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__FOOTER_CLASS = FEATURE__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__OPPOSITE = FEATURE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Owning End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__OWNING_END = FEATURE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__BIDIRECTIONAL = FEATURE_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Containment</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__CONTAINMENT = FEATURE_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Pivot Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__PIVOT_TABLE_NAME = FEATURE_FEATURE_COUNT + 4;

	/**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 5;

	/**
   * The number of operations of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonAssociationImpl <em>Singleton Association</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.SingletonAssociationImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonAssociation()
   * @generated
   */
	int SINGLETON_ASSOCIATION = 23;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__NAME = ASSOCIATION__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__DISPLAY_LABEL = ASSOCIATION__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__COLUMN_NAME = ASSOCIATION__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__PARENT_ENTITY = ASSOCIATION__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__INPUT_FIELD = ASSOCIATION__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__HEADER_CLASS = ASSOCIATION__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__INPUT_CLASS = ASSOCIATION__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__DISPLAY_CLASS = ASSOCIATION__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__FOOTER_CLASS = ASSOCIATION__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__OPPOSITE = ASSOCIATION__OPPOSITE;

	/**
   * The feature id for the '<em><b>Owning End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__OWNING_END = ASSOCIATION__OWNING_END;

	/**
   * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__BIDIRECTIONAL = ASSOCIATION__BIDIRECTIONAL;

	/**
   * The feature id for the '<em><b>Containment</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__CONTAINMENT = ASSOCIATION__CONTAINMENT;

	/**
   * The feature id for the '<em><b>Pivot Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__PIVOT_TABLE_NAME = ASSOCIATION__PIVOT_TABLE_NAME;

	/**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__REQUIRED = ASSOCIATION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Association Relationship</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION__ASSOCIATION_RELATIONSHIP = ASSOCIATION_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Singleton Association</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SINGLETON_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

	/**
   * The number of operations of the '<em>Singleton Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLETON_ASSOCIATION_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.impl.CollectionAssociationImpl <em>Collection Association</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.impl.CollectionAssociationImpl
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionAssociation()
   * @generated
   */
	int COLLECTION_ASSOCIATION = 24;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__NAME = ASSOCIATION__NAME;

	/**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__DISPLAY_LABEL = ASSOCIATION__DISPLAY_LABEL;

	/**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__COLUMN_NAME = ASSOCIATION__COLUMN_NAME;

	/**
   * The feature id for the '<em><b>Parent Entity</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__PARENT_ENTITY = ASSOCIATION__PARENT_ENTITY;

	/**
   * The feature id for the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__INPUT_FIELD = ASSOCIATION__INPUT_FIELD;

	/**
   * The feature id for the '<em><b>Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__HEADER_CLASS = ASSOCIATION__HEADER_CLASS;

	/**
   * The feature id for the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__INPUT_CLASS = ASSOCIATION__INPUT_CLASS;

	/**
   * The feature id for the '<em><b>Display Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__DISPLAY_CLASS = ASSOCIATION__DISPLAY_CLASS;

	/**
   * The feature id for the '<em><b>Footer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__FOOTER_CLASS = ASSOCIATION__FOOTER_CLASS;

	/**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__OPPOSITE = ASSOCIATION__OPPOSITE;

	/**
   * The feature id for the '<em><b>Owning End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__OWNING_END = ASSOCIATION__OWNING_END;

	/**
   * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__BIDIRECTIONAL = ASSOCIATION__BIDIRECTIONAL;

	/**
   * The feature id for the '<em><b>Containment</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__CONTAINMENT = ASSOCIATION__CONTAINMENT;

	/**
   * The feature id for the '<em><b>Pivot Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__PIVOT_TABLE_NAME = ASSOCIATION__PIVOT_TABLE_NAME;

	/**
   * The feature id for the '<em><b>Collection Type</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__COLLECTION_TYPE = ASSOCIATION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Association Relationship</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION__ASSOCIATION_RELATIONSHIP = ASSOCIATION_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Collection Association</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTION_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

	/**
   * The number of operations of the '<em>Collection Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ASSOCIATION_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.Cardinality <em>Cardinality</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.Cardinality
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCardinality()
   * @generated
   */
	int CARDINALITY = 25;

	/**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.DatabaseTechnologies <em>Database Technologies</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.DatabaseTechnologies
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getDatabaseTechnologies()
   * @generated
   */
	int DATABASE_TECHNOLOGIES = 26;

	/**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.OrmTechnologies <em>Technologies</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.OrmTechnologies
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getOrmTechnologies()
   * @generated
   */
	int ORM_TECHNOLOGIES = 27;

	/**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.CollectionTypes <em>Collection Types</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.CollectionTypes
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionTypes()
   * @generated
   */
	int COLLECTION_TYPES = 28;

	/**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.DateDetails <em>Date Details</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.DateDetails
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getDateDetails()
   * @generated
   */
	int DATE_DETAILS = 29;

	/**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships <em>Singleton Association Relationships</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonAssociationRelationships()
   * @generated
   */
	int SINGLETON_ASSOCIATION_RELATIONSHIPS = 30;

	/**
   * The meta object id for the '{@link uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships <em>Collection Association Relationships</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships
   * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionAssociationRelationships()
   * @generated
   */
	int COLLECTION_ASSOCIATION_RELATIONSHIPS = 31;

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.OrmModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel
   * @generated
   */
	EClass getOrmModel();

	/**
   * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getCollectionTypes <em>Collection Types</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Collection Types</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel#getCollectionTypes()
   * @see #getOrmModel()
   * @generated
   */
	EReference getOrmModel_CollectionTypes();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseTechnology <em>Database Technology</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Database Technology</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseTechnology()
   * @see #getOrmModel()
   * @generated
   */
	EAttribute getOrmModel_DatabaseTechnology();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabasePrefix <em>Database Prefix</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Database Prefix</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel#getDatabasePrefix()
   * @see #getOrmModel()
   * @generated
   */
	EAttribute getOrmModel_DatabasePrefix();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseHost <em>Database Host</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Database Host</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseHost()
   * @see #getOrmModel()
   * @generated
   */
	EAttribute getOrmModel_DatabaseHost();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseName <em>Database Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Database Name</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseName()
   * @see #getOrmModel()
   * @generated
   */
	EAttribute getOrmModel_DatabaseName();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseUsername <em>Database Username</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Database Username</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel#getDatabaseUsername()
   * @see #getOrmModel()
   * @generated
   */
	EAttribute getOrmModel_DatabaseUsername();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDatabasePassword <em>Database Password</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Database Password</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel#getDatabasePassword()
   * @see #getOrmModel()
   * @generated
   */
	EAttribute getOrmModel_DatabasePassword();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getOrmTechnology <em>Orm Technology</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orm Technology</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel#getOrmTechnology()
   * @see #getOrmModel()
   * @generated
   */
	EAttribute getOrmModel_OrmTechnology();

	/**
   * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getDataTypes <em>Data Types</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Types</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel#getDataTypes()
   * @see #getOrmModel()
   * @generated
   */
	EReference getOrmModel_DataTypes();

	/**
   * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmModel#getEntities()
   * @see #getOrmModel()
   * @generated
   */
	EReference getOrmModel_Entities();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see uk.ac.man.cs.mdsd.orm.NamedElement
   * @generated
   */
	EClass getNamedElement();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.man.cs.mdsd.orm.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
	EAttribute getNamedElement_Name();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.NamedDisplayElement <em>Named Display Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Display Element</em>'.
   * @see uk.ac.man.cs.mdsd.orm.NamedDisplayElement
   * @generated
   */
	EClass getNamedDisplayElement();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.NamedDisplayElement#getDisplayLabel <em>Display Label</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Label</em>'.
   * @see uk.ac.man.cs.mdsd.orm.NamedDisplayElement#getDisplayLabel()
   * @see #getNamedDisplayElement()
   * @generated
   */
	EAttribute getNamedDisplayElement_DisplayLabel();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Classifier
   * @generated
   */
	EClass getClassifier();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionType
   * @generated
   */
	EClass getCollectionType();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.CollectionType#getCollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionType#getCollectionType()
   * @see #getCollectionType()
   * @generated
   */
	EAttribute getCollectionType_CollectionType();

	/**
   * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.orm.CollectionType#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionType#getElementType()
   * @see #getCollectionType()
   * @generated
   */
	EReference getCollectionType_ElementType();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.CollectionType#getPersistenceType <em>Persistence Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Persistence Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionType#getPersistenceType()
   * @see #getCollectionType()
   * @generated
   */
	EAttribute getCollectionType_PersistenceType();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.CollectionType#getJavaInterfaceType <em>Java Interface Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java Interface Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionType#getJavaInterfaceType()
   * @see #getCollectionType()
   * @generated
   */
	EAttribute getCollectionType_JavaInterfaceType();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.CollectionType#getJavaImplementationType <em>Java Implementation Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java Implementation Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionType#getJavaImplementationType()
   * @see #getCollectionType()
   * @generated
   */
	EAttribute getCollectionType_JavaImplementationType();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.DataType
   * @generated
   */
	EClass getDataType();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.EnumerationType <em>Enumeration Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.EnumerationType
   * @generated
   */
	EClass getEnumerationType();

	/**
   * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.orm.EnumerationType#getEnumerations <em>Enumerations</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enumerations</em>'.
   * @see uk.ac.man.cs.mdsd.orm.EnumerationType#getEnumerations()
   * @see #getEnumerationType()
   * @generated
   */
	EReference getEnumerationType_Enumerations();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal</em>'.
   * @see uk.ac.man.cs.mdsd.orm.EnumerationLiteral
   * @generated
   */
	EClass getEnumerationLiteral();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Entity
   * @generated
   */
	EClass getEntity();

	/**
   * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.orm.Entity#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Part Of</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Entity#getPartOf()
   * @see #getEntity()
   * @generated
   */
	EReference getEntity_PartOf();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Entity#getTableName <em>Table Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table Name</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Entity#getTableName()
   * @see #getEntity()
   * @generated
   */
	EAttribute getEntity_TableName();

	/**
   * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.orm.Entity#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Keys</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Entity#getKeys()
   * @see #getEntity()
   * @generated
   */
	EReference getEntity_Keys();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Entity#getAutoKeyName <em>Auto Key Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Auto Key Name</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Entity#getAutoKeyName()
   * @see #getEntity()
   * @generated
   */
	EAttribute getEntity_AutoKeyName();

	/**
   * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.orm.Entity#getContains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Contains</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Entity#getContains()
   * @see #getEntity()
   * @generated
   */
	EReference getEntity_Contains();

	/**
   * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.orm.Entity#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Container</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Entity#getContainer()
   * @see #getEntity()
   * @generated
   */
	EReference getEntity_Container();

	/**
   * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.orm.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
	EReference getEntity_Features();

	/**
   * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.orm.Entity#getDisplayFeatures <em>Display Features</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Display Features</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Entity#getDisplayFeatures()
   * @see #getEntity()
   * @generated
   */
	EReference getEntity_DisplayFeatures();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Entity#getDisplayFormat <em>Display Format</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Format</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Entity#getDisplayFormat()
   * @see #getEntity()
   * @generated
   */
	EAttribute getEntity_DisplayFormat();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Feature
   * @generated
   */
	EClass getFeature();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Feature#getColumnName <em>Column Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Name</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Feature#getColumnName()
   * @see #getFeature()
   * @generated
   */
	EAttribute getFeature_ColumnName();

	/**
   * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.orm.Feature#getParentEntity <em>Parent Entity</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Entity</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Feature#getParentEntity()
   * @see #getFeature()
   * @generated
   */
	EReference getFeature_ParentEntity();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Feature#getInputField <em>Input Field</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Field</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Feature#getInputField()
   * @see #getFeature()
   * @generated
   */
	EAttribute getFeature_InputField();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Feature#getHeaderClass <em>Header Class</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header Class</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Feature#getHeaderClass()
   * @see #getFeature()
   * @generated
   */
	EAttribute getFeature_HeaderClass();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Feature#getInputClass <em>Input Class</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Class</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Feature#getInputClass()
   * @see #getFeature()
   * @generated
   */
	EAttribute getFeature_InputClass();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Feature#getDisplayClass <em>Display Class</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Class</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Feature#getDisplayClass()
   * @see #getFeature()
   * @generated
   */
	EAttribute getFeature_DisplayClass();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Feature#getFooterClass <em>Footer Class</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Footer Class</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Feature#getFooterClass()
   * @see #getFeature()
   * @generated
   */
	EAttribute getFeature_FooterClass();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Attribute
   * @generated
   */
	EClass getAttribute();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Attribute#getPersistentType <em>Persistent Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Persistent Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Attribute#getPersistentType()
   * @see #getAttribute()
   * @generated
   */
	EAttribute getAttribute_PersistentType();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Attribute#getOrmType <em>Orm Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orm Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Attribute#getOrmType()
   * @see #getAttribute()
   * @generated
   */
	EAttribute getAttribute_OrmType();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.SingletonAttribute <em>Singleton Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Singleton Attribute</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonAttribute
   * @generated
   */
	EClass getSingletonAttribute();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.SingletonAttribute#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonAttribute#isRequired()
   * @see #getSingletonAttribute()
   * @generated
   */
	EAttribute getSingletonAttribute_Required();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.SingletonAttribute#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonAttribute#isUnique()
   * @see #getSingletonAttribute()
   * @generated
   */
	EAttribute getSingletonAttribute_Unique();

	/**
   * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.orm.SingletonAttribute#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonAttribute#getDefaultValue()
   * @see #getSingletonAttribute()
   * @generated
   */
	EReference getSingletonAttribute_DefaultValue();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.CollectionAttribute <em>Collection Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Attribute</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionAttribute
   * @generated
   */
	EClass getCollectionAttribute();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.SingletonElement <em>Singleton Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Singleton Element</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonElement
   * @generated
   */
	EClass getSingletonElement();

	/**
   * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.orm.SingletonElement#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonElement#getDataType()
   * @see #getSingletonElement()
   * @generated
   */
	EReference getSingletonElement_DataType();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.SingletonElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonElement#isObfuscateFormFields()
   * @see #getSingletonElement()
   * @generated
   */
	EAttribute getSingletonElement_ObfuscateFormFields();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.SingletonElement#isCaseInsensitive <em>Case Insensitive</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case Insensitive</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonElement#isCaseInsensitive()
   * @see #getSingletonElement()
   * @generated
   */
	EAttribute getSingletonElement_CaseInsensitive();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.SingletonElement#isEncrypt <em>Encrypt</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encrypt</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonElement#isEncrypt()
   * @see #getSingletonElement()
   * @generated
   */
	EAttribute getSingletonElement_Encrypt();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.CollectionElement <em>Collection Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Element</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionElement
   * @generated
   */
	EClass getCollectionElement();

	/**
   * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.orm.CollectionElement#getCollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Collection Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionElement#getCollectionType()
   * @see #getCollectionElement()
   * @generated
   */
	EReference getCollectionElement_CollectionType();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.DateAttribute <em>Date Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Attribute</em>'.
   * @see uk.ac.man.cs.mdsd.orm.DateAttribute
   * @generated
   */
	EClass getDateAttribute();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.DateAttribute#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Details</em>'.
   * @see uk.ac.man.cs.mdsd.orm.DateAttribute#getDetails()
   * @see #getDateAttribute()
   * @generated
   */
	EAttribute getDateAttribute_Details();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.SingletonDate <em>Singleton Date</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Singleton Date</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonDate
   * @generated
   */
	EClass getSingletonDate();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.CollectionDate <em>Collection Date</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Date</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionDate
   * @generated
   */
	EClass getCollectionDate();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.SingletonResource <em>Singleton Resource</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Singleton Resource</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonResource
   * @generated
   */
	EClass getSingletonResource();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.SingletonResource#getMaximumUploadSize <em>Maximum Upload Size</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maximum Upload Size</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonResource#getMaximumUploadSize()
   * @see #getSingletonResource()
   * @generated
   */
	EAttribute getSingletonResource_MaximumUploadSize();

	/**
   * Returns the meta object for the attribute list '{@link uk.ac.man.cs.mdsd.orm.SingletonResource#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Valid Upload Mime Types</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonResource#getValidUploadMimeTypes()
   * @see #getSingletonResource()
   * @generated
   */
	EAttribute getSingletonResource_ValidUploadMimeTypes();

	/**
   * Returns the meta object for the attribute list '{@link uk.ac.man.cs.mdsd.orm.SingletonResource#getValidUploadExtensions <em>Valid Upload Extensions</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Valid Upload Extensions</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonResource#getValidUploadExtensions()
   * @see #getSingletonResource()
   * @generated
   */
	EAttribute getSingletonResource_ValidUploadExtensions();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.SingletonResource#isUploadsWithinWebsite <em>Uploads Within Website</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uploads Within Website</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonResource#isUploadsWithinWebsite()
   * @see #getSingletonResource()
   * @generated
   */
	EAttribute getSingletonResource_UploadsWithinWebsite();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.SingletonResource#getRelativeUploadDirectory <em>Relative Upload Directory</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relative Upload Directory</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonResource#getRelativeUploadDirectory()
   * @see #getSingletonResource()
   * @generated
   */
	EAttribute getSingletonResource_RelativeUploadDirectory();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.SingletonFile <em>Singleton File</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Singleton File</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonFile
   * @generated
   */
	EClass getSingletonFile();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.SingletonImage <em>Singleton Image</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Singleton Image</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonImage
   * @generated
   */
	EClass getSingletonImage();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.SingletonLocation <em>Singleton Location</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Singleton Location</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonLocation
   * @generated
   */
	EClass getSingletonLocation();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Association
   * @generated
   */
	EClass getAssociation();

	/**
   * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.orm.Association#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Association#getOpposite()
   * @see #getAssociation()
   * @generated
   */
	EReference getAssociation_Opposite();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Association#isOwningEnd <em>Owning End</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Owning End</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Association#isOwningEnd()
   * @see #getAssociation()
   * @generated
   */
	EAttribute getAssociation_OwningEnd();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Association#isBidirectional <em>Bidirectional</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bidirectional</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Association#isBidirectional()
   * @see #getAssociation()
   * @generated
   */
	EAttribute getAssociation_Bidirectional();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Association#isContainment <em>Containment</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Containment</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Association#isContainment()
   * @see #getAssociation()
   * @generated
   */
	EAttribute getAssociation_Containment();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.Association#getPivotTableName <em>Pivot Table Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pivot Table Name</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Association#getPivotTableName()
   * @see #getAssociation()
   * @generated
   */
	EAttribute getAssociation_PivotTableName();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.SingletonAssociation <em>Singleton Association</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Singleton Association</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonAssociation
   * @generated
   */
	EClass getSingletonAssociation();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.SingletonAssociation#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonAssociation#isRequired()
   * @see #getSingletonAssociation()
   * @generated
   */
	EAttribute getSingletonAssociation_Required();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.SingletonAssociation#getAssociationRelationship <em>Association Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Association Relationship</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonAssociation#getAssociationRelationship()
   * @see #getSingletonAssociation()
   * @generated
   */
	EAttribute getSingletonAssociation_AssociationRelationship();

	/**
   * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.orm.CollectionAssociation <em>Collection Association</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Association</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionAssociation
   * @generated
   */
	EClass getCollectionAssociation();

	/**
   * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.orm.CollectionAssociation#getCollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Collection Type</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionAssociation#getCollectionType()
   * @see #getCollectionAssociation()
   * @generated
   */
	EReference getCollectionAssociation_CollectionType();

	/**
   * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.orm.CollectionAssociation#getAssociationRelationship <em>Association Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Association Relationship</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionAssociation#getAssociationRelationship()
   * @see #getCollectionAssociation()
   * @generated
   */
	EAttribute getCollectionAssociation_AssociationRelationship();

	/**
   * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.orm.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cardinality</em>'.
   * @see uk.ac.man.cs.mdsd.orm.Cardinality
   * @generated
   */
	EEnum getCardinality();

	/**
   * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.orm.DatabaseTechnologies <em>Database Technologies</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Database Technologies</em>'.
   * @see uk.ac.man.cs.mdsd.orm.DatabaseTechnologies
   * @generated
   */
	EEnum getDatabaseTechnologies();

	/**
   * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.orm.OrmTechnologies <em>Technologies</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Technologies</em>'.
   * @see uk.ac.man.cs.mdsd.orm.OrmTechnologies
   * @generated
   */
	EEnum getOrmTechnologies();

	/**
   * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.orm.CollectionTypes <em>Collection Types</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Collection Types</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionTypes
   * @generated
   */
	EEnum getCollectionTypes();

	/**
   * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.orm.DateDetails <em>Date Details</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Date Details</em>'.
   * @see uk.ac.man.cs.mdsd.orm.DateDetails
   * @generated
   */
	EEnum getDateDetails();

	/**
   * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships <em>Singleton Association Relationships</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Singleton Association Relationships</em>'.
   * @see uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships
   * @generated
   */
	EEnum getSingletonAssociationRelationships();

	/**
   * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships <em>Collection Association Relationships</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Collection Association Relationships</em>'.
   * @see uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships
   * @generated
   */
	EEnum getCollectionAssociationRelationships();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	OrmFactory getOrmFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.OrmModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmModelImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getOrmModel()
     * @generated
     */
		EClass ORM_MODEL = eINSTANCE.getOrmModel();

		/**
     * The meta object literal for the '<em><b>Collection Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ORM_MODEL__COLLECTION_TYPES = eINSTANCE.getOrmModel_CollectionTypes();

		/**
     * The meta object literal for the '<em><b>Database Technology</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ORM_MODEL__DATABASE_TECHNOLOGY = eINSTANCE.getOrmModel_DatabaseTechnology();

		/**
     * The meta object literal for the '<em><b>Database Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ORM_MODEL__DATABASE_PREFIX = eINSTANCE.getOrmModel_DatabasePrefix();

		/**
     * The meta object literal for the '<em><b>Database Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ORM_MODEL__DATABASE_HOST = eINSTANCE.getOrmModel_DatabaseHost();

		/**
     * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ORM_MODEL__DATABASE_NAME = eINSTANCE.getOrmModel_DatabaseName();

		/**
     * The meta object literal for the '<em><b>Database Username</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ORM_MODEL__DATABASE_USERNAME = eINSTANCE.getOrmModel_DatabaseUsername();

		/**
     * The meta object literal for the '<em><b>Database Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ORM_MODEL__DATABASE_PASSWORD = eINSTANCE.getOrmModel_DatabasePassword();

		/**
     * The meta object literal for the '<em><b>Orm Technology</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ORM_MODEL__ORM_TECHNOLOGY = eINSTANCE.getOrmModel_OrmTechnology();

		/**
     * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ORM_MODEL__DATA_TYPES = eINSTANCE.getOrmModel_DataTypes();

		/**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ORM_MODEL__ENTITIES = eINSTANCE.getOrmModel_Entities();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getNamedElement()
     * @generated
     */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.NamedDisplayElementImpl <em>Named Display Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.NamedDisplayElementImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getNamedDisplayElement()
     * @generated
     */
		EClass NAMED_DISPLAY_ELEMENT = eINSTANCE.getNamedDisplayElement();

		/**
     * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL = eINSTANCE.getNamedDisplayElement_DisplayLabel();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.ClassifierImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getClassifier()
     * @generated
     */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.CollectionTypeImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionType()
     * @generated
     */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
     * The meta object literal for the '<em><b>Collection Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COLLECTION_TYPE__COLLECTION_TYPE = eINSTANCE.getCollectionType_CollectionType();

		/**
     * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference COLLECTION_TYPE__ELEMENT_TYPE = eINSTANCE.getCollectionType_ElementType();

		/**
     * The meta object literal for the '<em><b>Persistence Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COLLECTION_TYPE__PERSISTENCE_TYPE = eINSTANCE.getCollectionType_PersistenceType();

		/**
     * The meta object literal for the '<em><b>Java Interface Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COLLECTION_TYPE__JAVA_INTERFACE_TYPE = eINSTANCE.getCollectionType_JavaInterfaceType();

		/**
     * The meta object literal for the '<em><b>Java Implementation Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COLLECTION_TYPE__JAVA_IMPLEMENTATION_TYPE = eINSTANCE.getCollectionType_JavaImplementationType();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.DataTypeImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getDataType()
     * @generated
     */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.EnumerationTypeImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getEnumerationType()
     * @generated
     */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
     * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ENUMERATION_TYPE__ENUMERATIONS = eINSTANCE.getEnumerationType_Enumerations();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.EnumerationLiteralImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getEnumerationLiteral()
     * @generated
     */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.EntityImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getEntity()
     * @generated
     */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
     * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ENTITY__PART_OF = eINSTANCE.getEntity_PartOf();

		/**
     * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ENTITY__TABLE_NAME = eINSTANCE.getEntity_TableName();

		/**
     * The meta object literal for the '<em><b>Keys</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ENTITY__KEYS = eINSTANCE.getEntity_Keys();

		/**
     * The meta object literal for the '<em><b>Auto Key Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ENTITY__AUTO_KEY_NAME = eINSTANCE.getEntity_AutoKeyName();

		/**
     * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ENTITY__CONTAINS = eINSTANCE.getEntity_Contains();

		/**
     * The meta object literal for the '<em><b>Container</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ENTITY__CONTAINER = eINSTANCE.getEntity_Container();

		/**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

		/**
     * The meta object literal for the '<em><b>Display Features</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ENTITY__DISPLAY_FEATURES = eINSTANCE.getEntity_DisplayFeatures();

		/**
     * The meta object literal for the '<em><b>Display Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ENTITY__DISPLAY_FORMAT = eINSTANCE.getEntity_DisplayFormat();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.FeatureImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getFeature()
     * @generated
     */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
     * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute FEATURE__COLUMN_NAME = eINSTANCE.getFeature_ColumnName();

		/**
     * The meta object literal for the '<em><b>Parent Entity</b></em>' container reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference FEATURE__PARENT_ENTITY = eINSTANCE.getFeature_ParentEntity();

		/**
     * The meta object literal for the '<em><b>Input Field</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute FEATURE__INPUT_FIELD = eINSTANCE.getFeature_InputField();

		/**
     * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute FEATURE__HEADER_CLASS = eINSTANCE.getFeature_HeaderClass();

		/**
     * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute FEATURE__INPUT_CLASS = eINSTANCE.getFeature_InputClass();

		/**
     * The meta object literal for the '<em><b>Display Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute FEATURE__DISPLAY_CLASS = eINSTANCE.getFeature_DisplayClass();

		/**
     * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute FEATURE__FOOTER_CLASS = eINSTANCE.getFeature_FooterClass();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.AttributeImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getAttribute()
     * @generated
     */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
     * The meta object literal for the '<em><b>Persistent Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ATTRIBUTE__PERSISTENT_TYPE = eINSTANCE.getAttribute_PersistentType();

		/**
     * The meta object literal for the '<em><b>Orm Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ATTRIBUTE__ORM_TYPE = eINSTANCE.getAttribute_OrmType();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonAttributeImpl <em>Singleton Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.SingletonAttributeImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonAttribute()
     * @generated
     */
		EClass SINGLETON_ATTRIBUTE = eINSTANCE.getSingletonAttribute();

		/**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_ATTRIBUTE__REQUIRED = eINSTANCE.getSingletonAttribute_Required();

		/**
     * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_ATTRIBUTE__UNIQUE = eINSTANCE.getSingletonAttribute_Unique();

		/**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SINGLETON_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getSingletonAttribute_DefaultValue();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.CollectionAttributeImpl <em>Collection Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.CollectionAttributeImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionAttribute()
     * @generated
     */
		EClass COLLECTION_ATTRIBUTE = eINSTANCE.getCollectionAttribute();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonElementImpl <em>Singleton Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.SingletonElementImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonElement()
     * @generated
     */
		EClass SINGLETON_ELEMENT = eINSTANCE.getSingletonElement();

		/**
     * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SINGLETON_ELEMENT__DATA_TYPE = eINSTANCE.getSingletonElement_DataType();

		/**
     * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_ELEMENT__OBFUSCATE_FORM_FIELDS = eINSTANCE.getSingletonElement_ObfuscateFormFields();

		/**
     * The meta object literal for the '<em><b>Case Insensitive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_ELEMENT__CASE_INSENSITIVE = eINSTANCE.getSingletonElement_CaseInsensitive();

		/**
     * The meta object literal for the '<em><b>Encrypt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_ELEMENT__ENCRYPT = eINSTANCE.getSingletonElement_Encrypt();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.CollectionElementImpl <em>Collection Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.CollectionElementImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionElement()
     * @generated
     */
		EClass COLLECTION_ELEMENT = eINSTANCE.getCollectionElement();

		/**
     * The meta object literal for the '<em><b>Collection Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference COLLECTION_ELEMENT__COLLECTION_TYPE = eINSTANCE.getCollectionElement_CollectionType();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.DateAttribute <em>Date Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.DateAttribute
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getDateAttribute()
     * @generated
     */
		EClass DATE_ATTRIBUTE = eINSTANCE.getDateAttribute();

		/**
     * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DATE_ATTRIBUTE__DETAILS = eINSTANCE.getDateAttribute_Details();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonDateImpl <em>Singleton Date</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.SingletonDateImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonDate()
     * @generated
     */
		EClass SINGLETON_DATE = eINSTANCE.getSingletonDate();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.CollectionDateImpl <em>Collection Date</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.CollectionDateImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionDate()
     * @generated
     */
		EClass COLLECTION_DATE = eINSTANCE.getCollectionDate();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonResourceImpl <em>Singleton Resource</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.SingletonResourceImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonResource()
     * @generated
     */
		EClass SINGLETON_RESOURCE = eINSTANCE.getSingletonResource();

		/**
     * The meta object literal for the '<em><b>Maximum Upload Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE = eINSTANCE.getSingletonResource_MaximumUploadSize();

		/**
     * The meta object literal for the '<em><b>Valid Upload Mime Types</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES = eINSTANCE.getSingletonResource_ValidUploadMimeTypes();

		/**
     * The meta object literal for the '<em><b>Valid Upload Extensions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS = eINSTANCE.getSingletonResource_ValidUploadExtensions();

		/**
     * The meta object literal for the '<em><b>Uploads Within Website</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE = eINSTANCE.getSingletonResource_UploadsWithinWebsite();

		/**
     * The meta object literal for the '<em><b>Relative Upload Directory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_RESOURCE__RELATIVE_UPLOAD_DIRECTORY = eINSTANCE.getSingletonResource_RelativeUploadDirectory();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonFileImpl <em>Singleton File</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.SingletonFileImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonFile()
     * @generated
     */
		EClass SINGLETON_FILE = eINSTANCE.getSingletonFile();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonImageImpl <em>Singleton Image</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.SingletonImageImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonImage()
     * @generated
     */
		EClass SINGLETON_IMAGE = eINSTANCE.getSingletonImage();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonLocationImpl <em>Singleton Location</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.SingletonLocationImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonLocation()
     * @generated
     */
		EClass SINGLETON_LOCATION = eINSTANCE.getSingletonLocation();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.AssociationImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getAssociation()
     * @generated
     */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ASSOCIATION__OPPOSITE = eINSTANCE.getAssociation_Opposite();

		/**
     * The meta object literal for the '<em><b>Owning End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ASSOCIATION__OWNING_END = eINSTANCE.getAssociation_OwningEnd();

		/**
     * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ASSOCIATION__BIDIRECTIONAL = eINSTANCE.getAssociation_Bidirectional();

		/**
     * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ASSOCIATION__CONTAINMENT = eINSTANCE.getAssociation_Containment();

		/**
     * The meta object literal for the '<em><b>Pivot Table Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ASSOCIATION__PIVOT_TABLE_NAME = eINSTANCE.getAssociation_PivotTableName();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.SingletonAssociationImpl <em>Singleton Association</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.SingletonAssociationImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonAssociation()
     * @generated
     */
		EClass SINGLETON_ASSOCIATION = eINSTANCE.getSingletonAssociation();

		/**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_ASSOCIATION__REQUIRED = eINSTANCE.getSingletonAssociation_Required();

		/**
     * The meta object literal for the '<em><b>Association Relationship</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SINGLETON_ASSOCIATION__ASSOCIATION_RELATIONSHIP = eINSTANCE.getSingletonAssociation_AssociationRelationship();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.impl.CollectionAssociationImpl <em>Collection Association</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.impl.CollectionAssociationImpl
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionAssociation()
     * @generated
     */
		EClass COLLECTION_ASSOCIATION = eINSTANCE.getCollectionAssociation();

		/**
     * The meta object literal for the '<em><b>Collection Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference COLLECTION_ASSOCIATION__COLLECTION_TYPE = eINSTANCE.getCollectionAssociation_CollectionType();

		/**
     * The meta object literal for the '<em><b>Association Relationship</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COLLECTION_ASSOCIATION__ASSOCIATION_RELATIONSHIP = eINSTANCE.getCollectionAssociation_AssociationRelationship();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.Cardinality <em>Cardinality</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.Cardinality
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCardinality()
     * @generated
     */
		EEnum CARDINALITY = eINSTANCE.getCardinality();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.DatabaseTechnologies <em>Database Technologies</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.DatabaseTechnologies
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getDatabaseTechnologies()
     * @generated
     */
		EEnum DATABASE_TECHNOLOGIES = eINSTANCE.getDatabaseTechnologies();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.OrmTechnologies <em>Technologies</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.OrmTechnologies
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getOrmTechnologies()
     * @generated
     */
		EEnum ORM_TECHNOLOGIES = eINSTANCE.getOrmTechnologies();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.CollectionTypes <em>Collection Types</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.CollectionTypes
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionTypes()
     * @generated
     */
		EEnum COLLECTION_TYPES = eINSTANCE.getCollectionTypes();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.DateDetails <em>Date Details</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.DateDetails
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getDateDetails()
     * @generated
     */
		EEnum DATE_DETAILS = eINSTANCE.getDateDetails();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships <em>Singleton Association Relationships</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getSingletonAssociationRelationships()
     * @generated
     */
		EEnum SINGLETON_ASSOCIATION_RELATIONSHIPS = eINSTANCE.getSingletonAssociationRelationships();

		/**
     * The meta object literal for the '{@link uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships <em>Collection Association Relationships</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships
     * @see uk.ac.man.cs.mdsd.orm.impl.OrmPackageImpl#getCollectionAssociationRelationships()
     * @generated
     */
		EEnum COLLECTION_ASSOCIATION_RELATIONSHIPS = eINSTANCE.getCollectionAssociationRelationships();

	}

} //OrmPackage

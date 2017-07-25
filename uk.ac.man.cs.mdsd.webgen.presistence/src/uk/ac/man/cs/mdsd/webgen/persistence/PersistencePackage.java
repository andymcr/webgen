/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistenceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PersistencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persistence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.man.ac.uk/mdsd/webgen/persistence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen-persistence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistencePackage eINSTANCE = uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl <em>Persistence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getPersistence()
	 * @generated
	 */
	int PERSISTENCE = 0;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__SERIALIZATION_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATA_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Orm Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__ORM_TECHNOLOGY = 3;

	/**
	 * The feature id for the '<em><b>Database Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATABASE_TECHNOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Database Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATABASE_PREFIX = 5;

	/**
	 * The feature id for the '<em><b>Database Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATABASE_HOST = 6;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATABASE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Database Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATABASE_PORT = 8;

	/**
	 * The feature id for the '<em><b>Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATABASE_USERNAME = 9;

	/**
	 * The feature id for the '<em><b>Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATABASE_PASSWORD = 10;

	/**
	 * The feature id for the '<em><b>Timestamp Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__TIMESTAMP_CREATION = 11;

	/**
	 * The feature id for the '<em><b>Timestamp Updates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__TIMESTAMP_UPDATES = 12;

	/**
	 * The number of structural features of the '<em>Persistence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Persistence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.SerializationGroupImpl <em>Serialization Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.SerializationGroupImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getSerializationGroup()
	 * @generated
	 */
	int SERIALIZATION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_GROUP__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Serialization Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_GROUP_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Serialization Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_GROUP_OPERATION_COUNT = BasePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl <em>Entity Or View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEntityOrView()
	 * @generated
	 */
	int ENTITY_OR_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__NAME = BasePackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__DISPLAY_LABEL = BasePackage.CLASSIFIER__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__SINGLETON_NAME = BasePackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__PLURALISED_NAME = BasePackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__KEYS = BasePackage.CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__TABLE_NAME = BasePackage.CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auto Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__AUTO_KEY_NAME = BasePackage.CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Auto Key Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE = BasePackage.CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auto Key Generation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY = BasePackage.CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__UNIQUE = BasePackage.CLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__CONTAINER_UNIQUE = BasePackage.CLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__LABELS = BasePackage.CLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__FEATURES = BasePackage.CLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>All Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__ALL_FEATURES = BasePackage.CLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__ATTRIBUTES = BasePackage.CLASSIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__ASSOCIATIONS = BasePackage.CLASSIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>All Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__ALL_ASSOCIATIONS = BasePackage.CLASSIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Implements User Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE = BasePackage.CLASSIFIER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Allow Form Type Customisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION = BasePackage.CLASSIFIER_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Entity Or View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW_FEATURE_COUNT = BasePackage.CLASSIFIER_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Entity Or View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OR_VIEW_OPERATION_COUNT = BasePackage.CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COLLECTION_ALLOW_ADD = 1;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COLLECTION_ALLOW_REMOVE = 2;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NULL_DISPLAY_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ENCODE_URI_KEY = 4;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SERIALIZATION_GROUPS = 5;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__HEADER_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DISPLAY_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FOOTER_CLASS = 8;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Attribute <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Attribute
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TITLE = FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLLECTION_ALLOW_ADD = FEATURE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLLECTION_ALLOW_REMOVE = FEATURE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NULL_DISPLAY_VALUE = FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ENCODE_URI_KEY = FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SERIALIZATION_GROUPS = FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__HEADER_CLASS = FEATURE__HEADER_CLASS;

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
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PLACEHOLDER = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALIDATION_PATTERN = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INPUT_CLASS = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Association <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Association
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TITLE = FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COLLECTION_ALLOW_ADD = FEATURE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COLLECTION_ALLOW_REMOVE = FEATURE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NULL_DISPLAY_VALUE = FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ENCODE_URI_KEY = FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SERIALIZATION_GROUPS = FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__HEADER_CLASS = FEATURE__HEADER_CLASS;

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
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PSEUDO = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encapsulated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ENCAPSULATED_BY = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INPUT_CLASS = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_ENTITY_X = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_ENTITY_X = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SERIALIZATION_MAX_DEPTH = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Label <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Label
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 6;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelImpl <em>Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getModelLabel()
	 * @generated
	 */
	int MODEL_LABEL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__LABEL_FOR = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__FORMAT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__FEATURES = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__SERIALIZATION_GROUPS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_OPERATION_COUNT = BasePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelFeatureImpl <em>Model Label Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelFeatureImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getModelLabelFeature()
	 * @generated
	 */
	int MODEL_LABEL_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_FEATURE__PART_OF = 0;

	/**
	 * The number of structural features of the '<em>Model Label Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Label Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelAttributeImpl <em>Model Label Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getModelLabelAttribute()
	 * @generated
	 */
	int MODEL_LABEL_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE__PART_OF = MODEL_LABEL_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE__ATTRIBUTE = MODEL_LABEL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE__DATE_FORMAT = MODEL_LABEL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Label Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE_FEATURE_COUNT = MODEL_LABEL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Label Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE_OPERATION_COUNT = MODEL_LABEL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelAssociationImpl <em>Model Label Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelAssociationImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getModelLabelAssociation()
	 * @generated
	 */
	int MODEL_LABEL_ASSOCIATION = 10;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__PART_OF = MODEL_LABEL_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__ASSOCIATION = MODEL_LABEL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamic Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__DYNAMIC_LABEL = MODEL_LABEL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__IS_SOURCE_ASSOCIATION = MODEL_LABEL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Label Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION_FEATURE_COUNT = MODEL_LABEL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model Label Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION_OPERATION_COUNT = MODEL_LABEL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ENTITY_OR_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISPLAY_LABEL = ENTITY_OR_VIEW__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SINGLETON_NAME = ENTITY_OR_VIEW__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PLURALISED_NAME = ENTITY_OR_VIEW__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KEYS = ENTITY_OR_VIEW__KEYS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE_NAME = ENTITY_OR_VIEW__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Auto Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUTO_KEY_NAME = ENTITY_OR_VIEW__AUTO_KEY_NAME;

	/**
	 * The feature id for the '<em><b>Auto Key Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUTO_KEY_PERSISTENT_TYPE = ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Auto Key Generation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUTO_KEY_GENERATION_STRATEGY = ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__UNIQUE = ENTITY_OR_VIEW__UNIQUE;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONTAINER_UNIQUE = ENTITY_OR_VIEW__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LABELS = ENTITY_OR_VIEW__LABELS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FEATURES = ENTITY_OR_VIEW__FEATURES;

	/**
	 * The feature id for the '<em><b>All Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ALL_FEATURES = ENTITY_OR_VIEW__ALL_FEATURES;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = ENTITY_OR_VIEW__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ASSOCIATIONS = ENTITY_OR_VIEW__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>All Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ALL_ASSOCIATIONS = ENTITY_OR_VIEW__ALL_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Implements User Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IMPLEMENTS_USER_INTERFACE = ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE;

	/**
	 * The feature id for the '<em><b>Allow Form Type Customisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ALLOW_FORM_TYPE_CUSTOMISATION = ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION;

	/**
	 * The feature id for the '<em><b>Entity Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_FEATURES = ENTITY_OR_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association Ends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ASSOCIATION_ENDS = ENTITY_OR_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ENTITY_OR_VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ENTITY_OR_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl <em>Entity Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEntityFeature()
	 * @generated
	 */
	int ENTITY_FEATURE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__TITLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__COLLECTION_ALLOW_ADD = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__COLLECTION_ALLOW_REMOVE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__NULL_DISPLAY_VALUE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__ENCODE_URI_KEY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__SERIALIZATION_GROUPS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__HEADER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__DISPLAY_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__FOOTER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__PART_OF = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__CARDINALITY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__ORDERED = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__PRIMARY_KEY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__SINGLETON_NAME = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__PLURALISED_NAME = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE__COLUMN_NAME = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Entity Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Entity Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAttributeImpl <em>Entity Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEntityAttribute()
	 * @generated
	 */
	int ENTITY_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__NAME = ENTITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__DISPLAY_LABEL = ENTITY_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__TITLE = ENTITY_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__COLLECTION_ALLOW_ADD = ENTITY_FEATURE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__COLLECTION_ALLOW_REMOVE = ENTITY_FEATURE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__NULL_DISPLAY_VALUE = ENTITY_FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__ENCODE_URI_KEY = ENTITY_FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__SERIALIZATION_GROUPS = ENTITY_FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__HEADER_CLASS = ENTITY_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__DISPLAY_CLASS = ENTITY_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__FOOTER_CLASS = ENTITY_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__PART_OF = ENTITY_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__CARDINALITY = ENTITY_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__ORDERED = ENTITY_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__PRIMARY_KEY = ENTITY_FEATURE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__SINGLETON_NAME = ENTITY_FEATURE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__PLURALISED_NAME = ENTITY_FEATURE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__COLUMN_NAME = ENTITY_FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__DEFAULT_VALUE = ENTITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__PLACEHOLDER = ENTITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__VALIDATION_PATTERN = ENTITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__INPUT_CLASS = ENTITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__CONTAINER_UNIQUE = ENTITY_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__PERSISTENT_TYPE = ENTITY_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__ORM_TYPE = ENTITY_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__INTERFACE_TYPE = ENTITY_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__SLUG_FIELDS = ENTITY_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__UNIQUE = ENTITY_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Entity Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_FEATURE_COUNT = ENTITY_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Entity Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_OPERATION_COUNT = ENTITY_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.DataTypeAttributeImpl <em>Data Type Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.DataTypeAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getDataTypeAttribute()
	 * @generated
	 */
	int DATA_TYPE_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__NAME = ENTITY_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__DISPLAY_LABEL = ENTITY_ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__TITLE = ENTITY_ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__COLLECTION_ALLOW_ADD = ENTITY_ATTRIBUTE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__COLLECTION_ALLOW_REMOVE = ENTITY_ATTRIBUTE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__NULL_DISPLAY_VALUE = ENTITY_ATTRIBUTE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__ENCODE_URI_KEY = ENTITY_ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__SERIALIZATION_GROUPS = ENTITY_ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__HEADER_CLASS = ENTITY_ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__DISPLAY_CLASS = ENTITY_ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__FOOTER_CLASS = ENTITY_ATTRIBUTE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__PART_OF = ENTITY_ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__CARDINALITY = ENTITY_ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__ORDERED = ENTITY_ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__PRIMARY_KEY = ENTITY_ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ENTITY_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__SINGLETON_NAME = ENTITY_ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__PLURALISED_NAME = ENTITY_ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__COLUMN_NAME = ENTITY_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__DEFAULT_VALUE = ENTITY_ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__PLACEHOLDER = ENTITY_ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__VALIDATION_PATTERN = ENTITY_ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__INPUT_CLASS = ENTITY_ATTRIBUTE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__CONTAINER_UNIQUE = ENTITY_ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__PERSISTENT_TYPE = ENTITY_ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__ORM_TYPE = ENTITY_ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__INTERFACE_TYPE = ENTITY_ATTRIBUTE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__SLUG_FIELDS = ENTITY_ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__UNIQUE = ENTITY_ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__DATA_TYPE = ENTITY_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS = ENTITY_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case Insensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE = ENTITY_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__ENCRYPT = ENTITY_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Type Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE_FEATURE_COUNT = ENTITY_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Type Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE_OPERATION_COUNT = ENTITY_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.DateAttributeImpl <em>Date Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.DateAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getDateAttribute()
	 * @generated
	 */
	int DATE_ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__NAME = ENTITY_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__DISPLAY_LABEL = ENTITY_ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__TITLE = ENTITY_ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__COLLECTION_ALLOW_ADD = ENTITY_ATTRIBUTE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__COLLECTION_ALLOW_REMOVE = ENTITY_ATTRIBUTE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__NULL_DISPLAY_VALUE = ENTITY_ATTRIBUTE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__ENCODE_URI_KEY = ENTITY_ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__SERIALIZATION_GROUPS = ENTITY_ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__HEADER_CLASS = ENTITY_ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__DISPLAY_CLASS = ENTITY_ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__FOOTER_CLASS = ENTITY_ATTRIBUTE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__PART_OF = ENTITY_ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__CARDINALITY = ENTITY_ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__ORDERED = ENTITY_ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__PRIMARY_KEY = ENTITY_ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ENTITY_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__SINGLETON_NAME = ENTITY_ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__PLURALISED_NAME = ENTITY_ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__COLUMN_NAME = ENTITY_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__DEFAULT_VALUE = ENTITY_ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__PLACEHOLDER = ENTITY_ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__VALIDATION_PATTERN = ENTITY_ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__INPUT_CLASS = ENTITY_ATTRIBUTE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__CONTAINER_UNIQUE = ENTITY_ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__PERSISTENT_TYPE = ENTITY_ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__ORM_TYPE = ENTITY_ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__INTERFACE_TYPE = ENTITY_ATTRIBUTE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__SLUG_FIELDS = ENTITY_ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__UNIQUE = ENTITY_ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__DETAILS = ENTITY_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__FORMAT = ENTITY_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE_FEATURE_COUNT = ENTITY_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE_OPERATION_COUNT = ENTITY_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.UrlAttributeImpl <em>Url Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.UrlAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getUrlAttribute()
	 * @generated
	 */
	int URL_ATTRIBUTE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__NAME = ENTITY_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__DISPLAY_LABEL = ENTITY_ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__TITLE = ENTITY_ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__COLLECTION_ALLOW_ADD = ENTITY_ATTRIBUTE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__COLLECTION_ALLOW_REMOVE = ENTITY_ATTRIBUTE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__NULL_DISPLAY_VALUE = ENTITY_ATTRIBUTE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__ENCODE_URI_KEY = ENTITY_ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__SERIALIZATION_GROUPS = ENTITY_ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__HEADER_CLASS = ENTITY_ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__DISPLAY_CLASS = ENTITY_ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__FOOTER_CLASS = ENTITY_ATTRIBUTE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__PART_OF = ENTITY_ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__CARDINALITY = ENTITY_ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__ORDERED = ENTITY_ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__PRIMARY_KEY = ENTITY_ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ENTITY_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__SINGLETON_NAME = ENTITY_ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__PLURALISED_NAME = ENTITY_ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__COLUMN_NAME = ENTITY_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__DEFAULT_VALUE = ENTITY_ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__PLACEHOLDER = ENTITY_ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__VALIDATION_PATTERN = ENTITY_ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__INPUT_CLASS = ENTITY_ATTRIBUTE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__CONTAINER_UNIQUE = ENTITY_ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__PERSISTENT_TYPE = ENTITY_ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__ORM_TYPE = ENTITY_ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__INTERFACE_TYPE = ENTITY_ATTRIBUTE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__SLUG_FIELDS = ENTITY_ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__UNIQUE = ENTITY_ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__DISPLAY_VALUE = ENTITY_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Url Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE_FEATURE_COUNT = ENTITY_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Url Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE_OPERATION_COUNT = ENTITY_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ResourceAttributeImpl <em>Resource Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ResourceAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getResourceAttribute()
	 * @generated
	 */
	int RESOURCE_ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__NAME = ENTITY_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__DISPLAY_LABEL = ENTITY_ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__TITLE = ENTITY_ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__COLLECTION_ALLOW_ADD = ENTITY_ATTRIBUTE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__COLLECTION_ALLOW_REMOVE = ENTITY_ATTRIBUTE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__NULL_DISPLAY_VALUE = ENTITY_ATTRIBUTE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__ENCODE_URI_KEY = ENTITY_ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__SERIALIZATION_GROUPS = ENTITY_ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__HEADER_CLASS = ENTITY_ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__DISPLAY_CLASS = ENTITY_ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__FOOTER_CLASS = ENTITY_ATTRIBUTE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__PART_OF = ENTITY_ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__CARDINALITY = ENTITY_ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__ORDERED = ENTITY_ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__PRIMARY_KEY = ENTITY_ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ENTITY_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__SINGLETON_NAME = ENTITY_ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__PLURALISED_NAME = ENTITY_ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__COLUMN_NAME = ENTITY_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__DEFAULT_VALUE = ENTITY_ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__PLACEHOLDER = ENTITY_ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__VALIDATION_PATTERN = ENTITY_ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__INPUT_CLASS = ENTITY_ATTRIBUTE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__CONTAINER_UNIQUE = ENTITY_ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__PERSISTENT_TYPE = ENTITY_ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__ORM_TYPE = ENTITY_ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__INTERFACE_TYPE = ENTITY_ATTRIBUTE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__SLUG_FIELDS = ENTITY_ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__UNIQUE = ENTITY_ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE = ENTITY_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES = ENTITY_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS = ENTITY_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uploads Within Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE = ENTITY_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upload Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__UPLOAD_PATH = ENTITY_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resource Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE_FEATURE_COUNT = ENTITY_ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Resource Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE_OPERATION_COUNT = ENTITY_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PathElementImpl <em>Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PathElementImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getPathElement()
	 * @generated
	 */
	int PATH_ELEMENT = 18;

	/**
	 * The number of structural features of the '<em>Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.StaticPathElementImpl <em>Static Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.StaticPathElementImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getStaticPathElement()
	 * @generated
	 */
	int STATIC_PATH_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PATH_ELEMENT__ELEMENT = PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PATH_ELEMENT_FEATURE_COUNT = PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PATH_ELEMENT_OPERATION_COUNT = PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.DatePathElementImpl <em>Date Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.DatePathElementImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getDatePathElement()
	 * @generated
	 */
	int DATE_PATH_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PATH_ELEMENT__FORMAT = PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PATH_ELEMENT_FEATURE_COUNT = PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PATH_ELEMENT_OPERATION_COUNT = PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.FileAttributeImpl <em>File Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.FileAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getFileAttribute()
	 * @generated
	 */
	int FILE_ATTRIBUTE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__NAME = RESOURCE_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__DISPLAY_LABEL = RESOURCE_ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__TITLE = RESOURCE_ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__COLLECTION_ALLOW_ADD = RESOURCE_ATTRIBUTE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__COLLECTION_ALLOW_REMOVE = RESOURCE_ATTRIBUTE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__NULL_DISPLAY_VALUE = RESOURCE_ATTRIBUTE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__ENCODE_URI_KEY = RESOURCE_ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__SERIALIZATION_GROUPS = RESOURCE_ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__HEADER_CLASS = RESOURCE_ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__DISPLAY_CLASS = RESOURCE_ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__FOOTER_CLASS = RESOURCE_ATTRIBUTE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__PART_OF = RESOURCE_ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__CARDINALITY = RESOURCE_ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__ORDERED = RESOURCE_ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__PRIMARY_KEY = RESOURCE_ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = RESOURCE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__SINGLETON_NAME = RESOURCE_ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__PLURALISED_NAME = RESOURCE_ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__COLUMN_NAME = RESOURCE_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__DEFAULT_VALUE = RESOURCE_ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__PLACEHOLDER = RESOURCE_ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__VALIDATION_PATTERN = RESOURCE_ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__INPUT_CLASS = RESOURCE_ATTRIBUTE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__CONTAINER_UNIQUE = RESOURCE_ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__PERSISTENT_TYPE = RESOURCE_ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__ORM_TYPE = RESOURCE_ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__INTERFACE_TYPE = RESOURCE_ATTRIBUTE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__SLUG_FIELDS = RESOURCE_ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__UNIQUE = RESOURCE_ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE = RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE;

	/**
	 * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES = RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES;

	/**
	 * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS = RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Uploads Within Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE = RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE;

	/**
	 * The feature id for the '<em><b>Upload Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__UPLOAD_PATH = RESOURCE_ATTRIBUTE__UPLOAD_PATH;

	/**
	 * The number of structural features of the '<em>File Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE_OPERATION_COUNT = RESOURCE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ImageAttributeImpl <em>Image Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ImageAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getImageAttribute()
	 * @generated
	 */
	int IMAGE_ATTRIBUTE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__NAME = RESOURCE_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__DISPLAY_LABEL = RESOURCE_ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__TITLE = RESOURCE_ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__COLLECTION_ALLOW_ADD = RESOURCE_ATTRIBUTE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__COLLECTION_ALLOW_REMOVE = RESOURCE_ATTRIBUTE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__NULL_DISPLAY_VALUE = RESOURCE_ATTRIBUTE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__ENCODE_URI_KEY = RESOURCE_ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__SERIALIZATION_GROUPS = RESOURCE_ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__HEADER_CLASS = RESOURCE_ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__DISPLAY_CLASS = RESOURCE_ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__FOOTER_CLASS = RESOURCE_ATTRIBUTE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__PART_OF = RESOURCE_ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__CARDINALITY = RESOURCE_ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__ORDERED = RESOURCE_ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__PRIMARY_KEY = RESOURCE_ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = RESOURCE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__SINGLETON_NAME = RESOURCE_ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__PLURALISED_NAME = RESOURCE_ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__COLUMN_NAME = RESOURCE_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__DEFAULT_VALUE = RESOURCE_ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__PLACEHOLDER = RESOURCE_ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__VALIDATION_PATTERN = RESOURCE_ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__INPUT_CLASS = RESOURCE_ATTRIBUTE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__CONTAINER_UNIQUE = RESOURCE_ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__PERSISTENT_TYPE = RESOURCE_ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__ORM_TYPE = RESOURCE_ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__INTERFACE_TYPE = RESOURCE_ATTRIBUTE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__SLUG_FIELDS = RESOURCE_ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__UNIQUE = RESOURCE_ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE = RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE;

	/**
	 * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES = RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES;

	/**
	 * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS = RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Uploads Within Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE = RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE;

	/**
	 * The feature id for the '<em><b>Upload Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__UPLOAD_PATH = RESOURCE_ATTRIBUTE__UPLOAD_PATH;

	/**
	 * The number of structural features of the '<em>Image Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE_OPERATION_COUNT = RESOURCE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.LocationAttributeImpl <em>Location Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.LocationAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getLocationAttribute()
	 * @generated
	 */
	int LOCATION_ATTRIBUTE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__NAME = ENTITY_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__DISPLAY_LABEL = ENTITY_ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__TITLE = ENTITY_ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__COLLECTION_ALLOW_ADD = ENTITY_ATTRIBUTE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__COLLECTION_ALLOW_REMOVE = ENTITY_ATTRIBUTE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__NULL_DISPLAY_VALUE = ENTITY_ATTRIBUTE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__ENCODE_URI_KEY = ENTITY_ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__SERIALIZATION_GROUPS = ENTITY_ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__HEADER_CLASS = ENTITY_ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__DISPLAY_CLASS = ENTITY_ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__FOOTER_CLASS = ENTITY_ATTRIBUTE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__PART_OF = ENTITY_ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__CARDINALITY = ENTITY_ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__ORDERED = ENTITY_ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__PRIMARY_KEY = ENTITY_ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ENTITY_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__SINGLETON_NAME = ENTITY_ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__PLURALISED_NAME = ENTITY_ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__COLUMN_NAME = ENTITY_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__DEFAULT_VALUE = ENTITY_ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__PLACEHOLDER = ENTITY_ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__VALIDATION_PATTERN = ENTITY_ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__INPUT_CLASS = ENTITY_ATTRIBUTE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__CONTAINER_UNIQUE = ENTITY_ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__PERSISTENT_TYPE = ENTITY_ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__ORM_TYPE = ENTITY_ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__INTERFACE_TYPE = ENTITY_ATTRIBUTE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__SLUG_FIELDS = ENTITY_ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__UNIQUE = ENTITY_ATTRIBUTE__UNIQUE;

	/**
	 * The number of structural features of the '<em>Location Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE_FEATURE_COUNT = ENTITY_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE_OPERATION_COUNT = ENTITY_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl <em>Entity Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEntityAssociation()
	 * @generated
	 */
	int ENTITY_ASSOCIATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__NAME = ENTITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__DISPLAY_LABEL = ENTITY_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TITLE = ENTITY_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__COLLECTION_ALLOW_ADD = ENTITY_FEATURE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__COLLECTION_ALLOW_REMOVE = ENTITY_FEATURE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__NULL_DISPLAY_VALUE = ENTITY_FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__ENCODE_URI_KEY = ENTITY_FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__SERIALIZATION_GROUPS = ENTITY_FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__HEADER_CLASS = ENTITY_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__DISPLAY_CLASS = ENTITY_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__FOOTER_CLASS = ENTITY_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__PART_OF = ENTITY_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__CARDINALITY = ENTITY_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__ORDERED = ENTITY_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__PRIMARY_KEY = ENTITY_FEATURE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__BOOLEAN_IS_HAS_CHOICE = ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__SINGLETON_NAME = ENTITY_FEATURE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__PLURALISED_NAME = ENTITY_FEATURE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__COLUMN_NAME = ENTITY_FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__PSEUDO = ENTITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encapsulated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__ENCAPSULATED_BY = ENTITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__INPUT_CLASS = ENTITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__SOURCE_ENTITY_X = ENTITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TARGET_ENTITY_X = ENTITY_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__SERIALIZATION_MAX_DEPTH = ENTITY_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__KEYS = ENTITY_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TARGET_ENTITY = ENTITY_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__BIDIRECTIONAL = ENTITY_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__UNIQUE = ENTITY_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pivot Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__PIVOT_TABLE_NAME = ENTITY_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Target Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TARGET_FEATURE_NAME = ENTITY_FEATURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Target Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TARGET_PRIMARY_KEY = ENTITY_FEATURE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TARGET_COLUMN_NAME = ENTITY_FEATURE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Target Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL = ENTITY_FEATURE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Target Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TARGET_HEADER_CLASS = ENTITY_FEATURE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Target Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TARGET_INPUT_CLASS = ENTITY_FEATURE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Target Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS = ENTITY_FEATURE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Target Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS = ENTITY_FEATURE_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Entity Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION_FEATURE_COUNT = ENTITY_FEATURE_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Entity Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ASSOCIATION_OPERATION_COUNT = ENTITY_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithoutContainmentImpl <em>Association Without Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithoutContainmentImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getAssociationWithoutContainment()
	 * @generated
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__NAME = ENTITY_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__DISPLAY_LABEL = ENTITY_ASSOCIATION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TITLE = ENTITY_ASSOCIATION__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__COLLECTION_ALLOW_ADD = ENTITY_ASSOCIATION__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__COLLECTION_ALLOW_REMOVE = ENTITY_ASSOCIATION__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__NULL_DISPLAY_VALUE = ENTITY_ASSOCIATION__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__ENCODE_URI_KEY = ENTITY_ASSOCIATION__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__SERIALIZATION_GROUPS = ENTITY_ASSOCIATION__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__HEADER_CLASS = ENTITY_ASSOCIATION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__DISPLAY_CLASS = ENTITY_ASSOCIATION__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__FOOTER_CLASS = ENTITY_ASSOCIATION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__PART_OF = ENTITY_ASSOCIATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__CARDINALITY = ENTITY_ASSOCIATION__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__ORDERED = ENTITY_ASSOCIATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__PRIMARY_KEY = ENTITY_ASSOCIATION__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__BOOLEAN_IS_HAS_CHOICE = ENTITY_ASSOCIATION__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__SINGLETON_NAME = ENTITY_ASSOCIATION__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__PLURALISED_NAME = ENTITY_ASSOCIATION__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__COLUMN_NAME = ENTITY_ASSOCIATION__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__PSEUDO = ENTITY_ASSOCIATION__PSEUDO;

	/**
	 * The feature id for the '<em><b>Encapsulated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__ENCAPSULATED_BY = ENTITY_ASSOCIATION__ENCAPSULATED_BY;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__INPUT_CLASS = ENTITY_ASSOCIATION__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Source Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__SOURCE_ENTITY_X = ENTITY_ASSOCIATION__SOURCE_ENTITY_X;

	/**
	 * The feature id for the '<em><b>Target Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_ENTITY_X = ENTITY_ASSOCIATION__TARGET_ENTITY_X;

	/**
	 * The feature id for the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__SERIALIZATION_MAX_DEPTH = ENTITY_ASSOCIATION__SERIALIZATION_MAX_DEPTH;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__KEYS = ENTITY_ASSOCIATION__KEYS;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_ENTITY = ENTITY_ASSOCIATION__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__BIDIRECTIONAL = ENTITY_ASSOCIATION__BIDIRECTIONAL;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__UNIQUE = ENTITY_ASSOCIATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Pivot Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__PIVOT_TABLE_NAME = ENTITY_ASSOCIATION__PIVOT_TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Target Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_FEATURE_NAME = ENTITY_ASSOCIATION__TARGET_FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Target Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_PRIMARY_KEY = ENTITY_ASSOCIATION__TARGET_PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_COLUMN_NAME = ENTITY_ASSOCIATION__TARGET_COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Target Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_DISPLAY_LABEL = ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Target Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_HEADER_CLASS = ENTITY_ASSOCIATION__TARGET_HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Target Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_INPUT_CLASS = ENTITY_ASSOCIATION__TARGET_INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Target Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_DISPLAY_CLASS = ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Target Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_FOOTER_CLASS = ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Target Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY = ENTITY_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE = ENTITY_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association Without Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT_FEATURE_COUNT = ENTITY_ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Association Without Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT_OPERATION_COUNT = ENTITY_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithContainmentImpl <em>Association With Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithContainmentImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getAssociationWithContainment()
	 * @generated
	 */
	int ASSOCIATION_WITH_CONTAINMENT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__NAME = ENTITY_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__DISPLAY_LABEL = ENTITY_ASSOCIATION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TITLE = ENTITY_ASSOCIATION__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__COLLECTION_ALLOW_ADD = ENTITY_ASSOCIATION__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__COLLECTION_ALLOW_REMOVE = ENTITY_ASSOCIATION__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__NULL_DISPLAY_VALUE = ENTITY_ASSOCIATION__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__ENCODE_URI_KEY = ENTITY_ASSOCIATION__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__SERIALIZATION_GROUPS = ENTITY_ASSOCIATION__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__HEADER_CLASS = ENTITY_ASSOCIATION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__DISPLAY_CLASS = ENTITY_ASSOCIATION__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__FOOTER_CLASS = ENTITY_ASSOCIATION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__PART_OF = ENTITY_ASSOCIATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__CARDINALITY = ENTITY_ASSOCIATION__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__ORDERED = ENTITY_ASSOCIATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__PRIMARY_KEY = ENTITY_ASSOCIATION__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__BOOLEAN_IS_HAS_CHOICE = ENTITY_ASSOCIATION__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__SINGLETON_NAME = ENTITY_ASSOCIATION__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__PLURALISED_NAME = ENTITY_ASSOCIATION__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__COLUMN_NAME = ENTITY_ASSOCIATION__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__PSEUDO = ENTITY_ASSOCIATION__PSEUDO;

	/**
	 * The feature id for the '<em><b>Encapsulated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__ENCAPSULATED_BY = ENTITY_ASSOCIATION__ENCAPSULATED_BY;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__INPUT_CLASS = ENTITY_ASSOCIATION__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Source Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__SOURCE_ENTITY_X = ENTITY_ASSOCIATION__SOURCE_ENTITY_X;

	/**
	 * The feature id for the '<em><b>Target Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_ENTITY_X = ENTITY_ASSOCIATION__TARGET_ENTITY_X;

	/**
	 * The feature id for the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__SERIALIZATION_MAX_DEPTH = ENTITY_ASSOCIATION__SERIALIZATION_MAX_DEPTH;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__KEYS = ENTITY_ASSOCIATION__KEYS;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_ENTITY = ENTITY_ASSOCIATION__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__BIDIRECTIONAL = ENTITY_ASSOCIATION__BIDIRECTIONAL;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__UNIQUE = ENTITY_ASSOCIATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Pivot Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__PIVOT_TABLE_NAME = ENTITY_ASSOCIATION__PIVOT_TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Target Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_FEATURE_NAME = ENTITY_ASSOCIATION__TARGET_FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Target Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_PRIMARY_KEY = ENTITY_ASSOCIATION__TARGET_PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_COLUMN_NAME = ENTITY_ASSOCIATION__TARGET_COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Target Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_DISPLAY_LABEL = ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Target Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_HEADER_CLASS = ENTITY_ASSOCIATION__TARGET_HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Target Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_INPUT_CLASS = ENTITY_ASSOCIATION__TARGET_INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Target Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_DISPLAY_CLASS = ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Target Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_FOOTER_CLASS = ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Source Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE = ENTITY_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association With Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT_FEATURE_COUNT = ENTITY_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association With Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT_OPERATION_COUNT = ENTITY_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationKeyImpl <em>Association Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationKeyImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getAssociationKey()
	 * @generated
	 */
	int ASSOCIATION_KEY = 27;

	/**
	 * The feature id for the '<em><b>Key For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_KEY__KEY_FOR = 0;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_KEY__SOURCE_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_KEY__TARGET_FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Association Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_KEY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Association Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = ENTITY_OR_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DISPLAY_LABEL = ENTITY_OR_VIEW__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SINGLETON_NAME = ENTITY_OR_VIEW__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PLURALISED_NAME = ENTITY_OR_VIEW__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__KEYS = ENTITY_OR_VIEW__KEYS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TABLE_NAME = ENTITY_OR_VIEW__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Auto Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__AUTO_KEY_NAME = ENTITY_OR_VIEW__AUTO_KEY_NAME;

	/**
	 * The feature id for the '<em><b>Auto Key Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__AUTO_KEY_PERSISTENT_TYPE = ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Auto Key Generation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__AUTO_KEY_GENERATION_STRATEGY = ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__UNIQUE = ENTITY_OR_VIEW__UNIQUE;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CONTAINER_UNIQUE = ENTITY_OR_VIEW__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LABELS = ENTITY_OR_VIEW__LABELS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__FEATURES = ENTITY_OR_VIEW__FEATURES;

	/**
	 * The feature id for the '<em><b>All Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ALL_FEATURES = ENTITY_OR_VIEW__ALL_FEATURES;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ATTRIBUTES = ENTITY_OR_VIEW__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ASSOCIATIONS = ENTITY_OR_VIEW__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>All Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ALL_ASSOCIATIONS = ENTITY_OR_VIEW__ALL_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Implements User Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__IMPLEMENTS_USER_INTERFACE = ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE;

	/**
	 * The feature id for the '<em><b>Allow Form Type Customisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ALLOW_FORM_TYPE_CUSTOMISATION = ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION;

	/**
	 * The feature id for the '<em><b>Encapsulates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ENCAPSULATES = ENTITY_OR_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_FEATURES = ENTITY_OR_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = ENTITY_OR_VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = ENTITY_OR_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl <em>View Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getViewFeature()
	 * @generated
	 */
	int VIEW_FEATURE = 29;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE__TITLE = FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE__COLLECTION_ALLOW_ADD = FEATURE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE__COLLECTION_ALLOW_REMOVE = FEATURE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE__NULL_DISPLAY_VALUE = FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE__ENCODE_URI_KEY = FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE__SERIALIZATION_GROUPS = FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE__HEADER_CLASS = FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE__DISPLAY_CLASS = FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE__FOOTER_CLASS = FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE__PART_OF = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedFeatureImpl <em>Encapsulated Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedFeatureImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEncapsulatedFeature()
	 * @generated
	 */
	int ENCAPSULATED_FEATURE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__TITLE = VIEW_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__COLLECTION_ALLOW_ADD = VIEW_FEATURE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__COLLECTION_ALLOW_REMOVE = VIEW_FEATURE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__NULL_DISPLAY_VALUE = VIEW_FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__ENCODE_URI_KEY = VIEW_FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__SERIALIZATION_GROUPS = VIEW_FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__HEADER_CLASS = VIEW_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__DISPLAY_CLASS = VIEW_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__FOOTER_CLASS = VIEW_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__PART_OF = VIEW_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__DISPLAY_LABEL = VIEW_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__ALIAS = VIEW_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE__COLUMN_NAME = VIEW_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Encapsulated Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE_FEATURE_COUNT = VIEW_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Encapsulated Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_FEATURE_OPERATION_COUNT = VIEW_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAttributeImpl <em>Encapsulated Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEncapsulatedAttribute()
	 * @generated
	 */
	int ENCAPSULATED_ATTRIBUTE = 31;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__TITLE = ENCAPSULATED_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__COLLECTION_ALLOW_ADD = ENCAPSULATED_FEATURE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__COLLECTION_ALLOW_REMOVE = ENCAPSULATED_FEATURE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__NULL_DISPLAY_VALUE = ENCAPSULATED_FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__ENCODE_URI_KEY = ENCAPSULATED_FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__SERIALIZATION_GROUPS = ENCAPSULATED_FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__HEADER_CLASS = ENCAPSULATED_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__DISPLAY_CLASS = ENCAPSULATED_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__FOOTER_CLASS = ENCAPSULATED_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__PART_OF = ENCAPSULATED_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__DISPLAY_LABEL = ENCAPSULATED_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__ALIAS = ENCAPSULATED_FEATURE__ALIAS;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__COLUMN_NAME = ENCAPSULATED_FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__DEFAULT_VALUE = ENCAPSULATED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__PLACEHOLDER = ENCAPSULATED_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__VALIDATION_PATTERN = ENCAPSULATED_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__INPUT_CLASS = ENCAPSULATED_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__NAME = ENCAPSULATED_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__ATTRIBUTE = ENCAPSULATED_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE__CARDINALITY = ENCAPSULATED_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Encapsulated Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE_FEATURE_COUNT = ENCAPSULATED_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Encapsulated Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ATTRIBUTE_OPERATION_COUNT = ENCAPSULATED_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl <em>Encapsulated Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEncapsulatedAssociation()
	 * @generated
	 */
	int ENCAPSULATED_ASSOCIATION = 32;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__TITLE = ENCAPSULATED_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__COLLECTION_ALLOW_ADD = ENCAPSULATED_FEATURE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__COLLECTION_ALLOW_REMOVE = ENCAPSULATED_FEATURE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__NULL_DISPLAY_VALUE = ENCAPSULATED_FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__ENCODE_URI_KEY = ENCAPSULATED_FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__SERIALIZATION_GROUPS = ENCAPSULATED_FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__HEADER_CLASS = ENCAPSULATED_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__DISPLAY_CLASS = ENCAPSULATED_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__FOOTER_CLASS = ENCAPSULATED_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__PART_OF = ENCAPSULATED_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__DISPLAY_LABEL = ENCAPSULATED_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__ALIAS = ENCAPSULATED_FEATURE__ALIAS;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__COLUMN_NAME = ENCAPSULATED_FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__PSEUDO = ENCAPSULATED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encapsulated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY = ENCAPSULATED_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__INPUT_CLASS = ENCAPSULATED_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY_X = ENCAPSULATED_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__TARGET_ENTITY_X = ENCAPSULATED_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__SERIALIZATION_MAX_DEPTH = ENCAPSULATED_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__NAME = ENCAPSULATED_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__ASSOCIATION = ENCAPSULATED_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Encapsulated Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET = ENCAPSULATED_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__IS_SOURCE_ASSOCIATION = ENCAPSULATED_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__CARDINALITY = ENCAPSULATED_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY = ENCAPSULATED_FEATURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION__TARGET_ENTITY = ENCAPSULATED_FEATURE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Encapsulated Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION_FEATURE_COUNT = ENCAPSULATED_FEATURE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Encapsulated Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_ASSOCIATION_OPERATION_COUNT = ENCAPSULATED_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl <em>View Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getViewAssociation()
	 * @generated
	 */
	int VIEW_ASSOCIATION = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__TITLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__COLLECTION_ALLOW_ADD = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__COLLECTION_ALLOW_REMOVE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__NULL_DISPLAY_VALUE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__ENCODE_URI_KEY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__SERIALIZATION_GROUPS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__HEADER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__DISPLAY_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__FOOTER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__PART_OF = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__PSEUDO = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Encapsulated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__ENCAPSULATED_BY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__INPUT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Source Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__SOURCE_ENTITY_X = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Target Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__TARGET_ENTITY_X = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__OPPOSITE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION__CARDINALITY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>View Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>View Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies <em>Database Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getDatabaseTechnologies()
	 * @generated
	 */
	int DATABASE_TECHNOLOGIES = 34;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies <em>Orm Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getOrmTechnologies()
	 * @generated
	 */
	int ORM_TECHNOLOGIES = 35;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Cardinality
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 36;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.isHasChoices <em>is Has Choices</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.isHasChoices
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getisHasChoices()
	 * @generated
	 */
	int IS_HAS_CHOICES = 37;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.DateDetails <em>Date Details</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DateDetails
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getDateDetails()
	 * @generated
	 */
	int DATE_DETAILS = 38;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence
	 * @generated
	 */
	EClass getPersistence();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getSerializationGroups <em>Serialization Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serialization Groups</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getSerializationGroups()
	 * @see #getPersistence()
	 * @generated
	 */
	EReference getPersistence_SerializationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDataTypes()
	 * @see #getPersistence()
	 * @generated
	 */
	EReference getPersistence_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getEntities()
	 * @see #getPersistence()
	 * @generated
	 */
	EReference getPersistence_Entities();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getOrmTechnology <em>Orm Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orm Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getOrmTechnology()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_OrmTechnology();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabaseTechnology <em>Database Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabaseTechnology()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_DatabaseTechnology();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabasePrefix <em>Database Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Prefix</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabasePrefix()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_DatabasePrefix();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabaseHost <em>Database Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Host</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabaseHost()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_DatabaseHost();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabaseName()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabasePort <em>Database Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Port</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabasePort()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_DatabasePort();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabaseUsername <em>Database Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Username</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabaseUsername()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_DatabaseUsername();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabasePassword <em>Database Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Password</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#getDatabasePassword()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_DatabasePassword();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#isTimestampCreation <em>Timestamp Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp Creation</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#isTimestampCreation()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_TimestampCreation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence#isTimestampUpdates <em>Timestamp Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp Updates</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Persistence#isTimestampUpdates()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_TimestampUpdates();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup <em>Serialization Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serialization Group</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup
	 * @generated
	 */
	EClass getSerializationGroup();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView <em>Entity Or View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Or View</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView
	 * @generated
	 */
	EClass getEntityOrView();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getSingletonName <em>Singleton Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singleton Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getSingletonName()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EAttribute getEntityOrView_SingletonName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getPluralisedName <em>Pluralised Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pluralised Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getPluralisedName()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EAttribute getEntityOrView_PluralisedName();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keys</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getKeys()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EReference getEntityOrView_Keys();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getTableName()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EAttribute getEntityOrView_TableName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyName <em>Auto Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Key Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyName()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EAttribute getEntityOrView_AutoKeyName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Key Persistent Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyPersistentType()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EAttribute getEntityOrView_AutoKeyPersistentType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Key Generation Strategy</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyGenerationStrategy()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EAttribute getEntityOrView_AutoKeyGenerationStrategy();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unique</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getUnique()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EReference getEntityOrView_Unique();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getContainerUnique <em>Container Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container Unique</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getContainerUnique()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EReference getEntityOrView_ContainerUnique();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getLabels()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EReference getEntityOrView_Labels();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getFeatures()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EReference getEntityOrView_Features();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAllFeatures <em>All Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Features</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAllFeatures()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EReference getEntityOrView_AllFeatures();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAttributes()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EReference getEntityOrView_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associations</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAssociations()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EReference getEntityOrView_Associations();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAllAssociations <em>All Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Associations</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAllAssociations()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EReference getEntityOrView_AllAssociations();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#isImplementsUserInterface <em>Implements User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements User Interface</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#isImplementsUserInterface()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EAttribute getEntityOrView_ImplementsUserInterface();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#isAllowFormTypeCustomisation <em>Allow Form Type Customisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Form Type Customisation</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#isAllowFormTypeCustomisation()
	 * @see #getEntityOrView()
	 * @generated
	 */
	EAttribute getEntityOrView_AllowFormTypeCustomisation();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature#getTitle()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Title();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature#isCollectionAllowAdd <em>Collection Allow Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Allow Add</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature#isCollectionAllowAdd()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_CollectionAllowAdd();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature#isCollectionAllowRemove <em>Collection Allow Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Allow Remove</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature#isCollectionAllowRemove()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_CollectionAllowRemove();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature#getNullDisplayValue <em>Null Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Display Value</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature#getNullDisplayValue()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_NullDisplayValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature#isEncodeUriKey <em>Encode Uri Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encode Uri Key</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature#isEncodeUriKey()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_EncodeUriKey();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature#getSerializationGroups <em>Serialization Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serialization Groups</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature#getSerializationGroups()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SerializationGroups();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature#getHeaderClass()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature#getDisplayClass <em>Display Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature#getDisplayClass()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_DisplayClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature#getFooterClass()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_FooterClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Attribute#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Attribute#getPlaceholder()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Attribute#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Attribute#getValidationPattern()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_ValidationPattern();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Attribute#getInputClass <em>Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Attribute#getInputClass()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_InputClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Association#isPseudo <em>Pseudo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Association#isPseudo()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Pseudo();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.Association#getEncapsulatedBy <em>Encapsulated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulated By</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Association#getEncapsulatedBy()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_EncapsulatedBy();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Association#getInputClass <em>Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Association#getInputClass()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_InputClass();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.Association#getSourceEntityX <em>Source Entity X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity X</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Association#getSourceEntityX()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_SourceEntityX();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.Association#getTargetEntityX <em>Target Entity X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity X</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Association#getTargetEntityX()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_TargetEntityX();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.Association#getSerializationMaxDepth <em>Serialization Max Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serialization Max Depth</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Association#getSerializationMaxDepth()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_SerializationMaxDepth();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel <em>Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel
	 * @generated
	 */
	EClass getModelLabel();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getLabelFor <em>Label For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Label For</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getLabelFor()
	 * @see #getModelLabel()
	 * @generated
	 */
	EReference getModelLabel_LabelFor();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getFormat()
	 * @see #getModelLabel()
	 * @generated
	 */
	EAttribute getModelLabel_Format();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getFeatures()
	 * @see #getModelLabel()
	 * @generated
	 */
	EReference getModelLabel_Features();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getSerializationGroups <em>Serialization Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serialization Groups</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getSerializationGroups()
	 * @see #getModelLabel()
	 * @generated
	 */
	EReference getModelLabel_SerializationGroups();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelFeature <em>Model Label Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Label Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelFeature
	 * @generated
	 */
	EClass getModelLabelFeature();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelFeature#getPartOf()
	 * @see #getModelLabelFeature()
	 * @generated
	 */
	EReference getModelLabelFeature_PartOf();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAttribute <em>Model Label Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Label Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAttribute
	 * @generated
	 */
	EClass getModelLabelAttribute();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAttribute#getAttribute()
	 * @see #getModelLabelAttribute()
	 * @generated
	 */
	EReference getModelLabelAttribute_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAttribute#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAttribute#getDateFormat()
	 * @see #getModelLabelAttribute()
	 * @generated
	 */
	EAttribute getModelLabelAttribute_DateFormat();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAssociation <em>Model Label Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Label Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAssociation
	 * @generated
	 */
	EClass getModelLabelAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAssociation#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAssociation#getAssociation()
	 * @see #getModelLabelAssociation()
	 * @generated
	 */
	EReference getModelLabelAssociation_Association();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAssociation#getDynamicLabel <em>Dynamic Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAssociation#getDynamicLabel()
	 * @see #getModelLabelAssociation()
	 * @generated
	 */
	EReference getModelLabelAssociation_DynamicLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAssociation#isIsSourceAssociation <em>Is Source Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAssociation#isIsSourceAssociation()
	 * @see #getModelLabelAssociation()
	 * @generated
	 */
	EAttribute getModelLabelAssociation_IsSourceAssociation();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.Entity#getEntityFeatures <em>Entity Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Features</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Entity#getEntityFeatures()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_EntityFeatures();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.Entity#getAssociationEnds <em>Association Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association Ends</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Entity#getAssociationEnds()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AssociationEnds();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature <em>Entity Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature
	 * @generated
	 */
	EClass getEntityFeature();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getPartOf()
	 * @see #getEntityFeature()
	 * @generated
	 */
	EReference getEntityFeature_PartOf();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getCardinality()
	 * @see #getEntityFeature()
	 * @generated
	 */
	EAttribute getEntityFeature_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#isOrdered()
	 * @see #getEntityFeature()
	 * @generated
	 */
	EAttribute getEntityFeature_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#isPrimaryKey()
	 * @see #getEntityFeature()
	 * @generated
	 */
	EAttribute getEntityFeature_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Is Has Choice</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getBooleanIsHasChoice()
	 * @see #getEntityFeature()
	 * @generated
	 */
	EAttribute getEntityFeature_BooleanIsHasChoice();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getSingletonName <em>Singleton Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singleton Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getSingletonName()
	 * @see #getEntityFeature()
	 * @generated
	 */
	EAttribute getEntityFeature_SingletonName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getPluralisedName <em>Pluralised Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pluralised Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getPluralisedName()
	 * @see #getEntityFeature()
	 * @generated
	 */
	EAttribute getEntityFeature_PluralisedName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getColumnName()
	 * @see #getEntityFeature()
	 * @generated
	 */
	EAttribute getEntityFeature_ColumnName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute
	 * @generated
	 */
	EClass getEntityAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#isContainerUnique <em>Container Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Unique</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#isContainerUnique()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EAttribute getEntityAttribute_ContainerUnique();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getPersistentType <em>Persistent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getPersistentType()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EAttribute getEntityAttribute_PersistentType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getOrmType <em>Orm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orm Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getOrmType()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EAttribute getEntityAttribute_OrmType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getInterfaceType()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EAttribute getEntityAttribute_InterfaceType();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getSlugFields <em>Slug Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slug Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#getSlugFields()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EReference getEntityAttribute_SlugFields();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute#isUnique()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EAttribute getEntityAttribute_Unique();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute <em>Data Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute
	 * @generated
	 */
	EClass getDataTypeAttribute();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute#getDataType()
	 * @see #getDataTypeAttribute()
	 * @generated
	 */
	EReference getDataTypeAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute#isObfuscateFormFields()
	 * @see #getDataTypeAttribute()
	 * @generated
	 */
	EAttribute getDataTypeAttribute_ObfuscateFormFields();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute#isCaseInsensitive <em>Case Insensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Insensitive</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute#isCaseInsensitive()
	 * @see #getDataTypeAttribute()
	 * @generated
	 */
	EAttribute getDataTypeAttribute_CaseInsensitive();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute#isEncrypt <em>Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypt</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute#isEncrypt()
	 * @see #getDataTypeAttribute()
	 * @generated
	 */
	EAttribute getDataTypeAttribute_Encrypt();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute <em>Date Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute
	 * @generated
	 */
	EClass getDateAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute#getDetails()
	 * @see #getDateAttribute()
	 * @generated
	 */
	EAttribute getDateAttribute_Details();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute#getFormat()
	 * @see #getDateAttribute()
	 * @generated
	 */
	EAttribute getDateAttribute_Format();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.UrlAttribute <em>Url Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.UrlAttribute
	 * @generated
	 */
	EClass getUrlAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.UrlAttribute#getDisplayValue <em>Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Value</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.UrlAttribute#getDisplayValue()
	 * @see #getUrlAttribute()
	 * @generated
	 */
	EAttribute getUrlAttribute_DisplayValue();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute <em>Resource Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute
	 * @generated
	 */
	EClass getResourceAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getMaximumUploadSize <em>Maximum Upload Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Upload Size</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getMaximumUploadSize()
	 * @see #getResourceAttribute()
	 * @generated
	 */
	EAttribute getResourceAttribute_MaximumUploadSize();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Upload Mime Types</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getValidUploadMimeTypes()
	 * @see #getResourceAttribute()
	 * @generated
	 */
	EAttribute getResourceAttribute_ValidUploadMimeTypes();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getValidUploadExtensions <em>Valid Upload Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Upload Extensions</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getValidUploadExtensions()
	 * @see #getResourceAttribute()
	 * @generated
	 */
	EAttribute getResourceAttribute_ValidUploadExtensions();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#isUploadsWithinWebsite <em>Uploads Within Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uploads Within Website</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#isUploadsWithinWebsite()
	 * @see #getResourceAttribute()
	 * @generated
	 */
	EAttribute getResourceAttribute_UploadsWithinWebsite();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getUploadPath <em>Upload Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upload Path</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getUploadPath()
	 * @see #getResourceAttribute()
	 * @generated
	 */
	EReference getResourceAttribute_UploadPath();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.PathElement <em>Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PathElement
	 * @generated
	 */
	EClass getPathElement();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.StaticPathElement <em>Static Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Path Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.StaticPathElement
	 * @generated
	 */
	EClass getStaticPathElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.StaticPathElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.StaticPathElement#getElement()
	 * @see #getStaticPathElement()
	 * @generated
	 */
	EAttribute getStaticPathElement_Element();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.DatePathElement <em>Date Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Path Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DatePathElement
	 * @generated
	 */
	EClass getDatePathElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.DatePathElement#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DatePathElement#getFormat()
	 * @see #getDatePathElement()
	 * @generated
	 */
	EAttribute getDatePathElement_Format();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.FileAttribute <em>File Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.FileAttribute
	 * @generated
	 */
	EClass getFileAttribute();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.ImageAttribute <em>Image Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ImageAttribute
	 * @generated
	 */
	EClass getImageAttribute();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.LocationAttribute <em>Location Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.LocationAttribute
	 * @generated
	 */
	EClass getLocationAttribute();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation <em>Entity Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation
	 * @generated
	 */
	EClass getEntityAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getKeys()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EReference getEntityAssociation_Keys();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetEntity()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EReference getEntityAssociation_TargetEntity();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#isBidirectional()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_Bidirectional();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#isUnique()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_Unique();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getPivotTableName <em>Pivot Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pivot Table Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getPivotTableName()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_PivotTableName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetFeatureName <em>Target Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Feature Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetFeatureName()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_TargetFeatureName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#isTargetPrimaryKey <em>Target Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Primary Key</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#isTargetPrimaryKey()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_TargetPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetColumnName <em>Target Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Column Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetColumnName()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_TargetColumnName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetDisplayLabel <em>Target Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Display Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetDisplayLabel()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_TargetDisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetHeaderClass <em>Target Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetHeaderClass()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_TargetHeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetInputClass <em>Target Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Input Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetInputClass()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_TargetInputClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetDisplayClass <em>Target Display Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Display Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetDisplayClass()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_TargetDisplayClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetFooterClass <em>Target Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetFooterClass()
	 * @see #getEntityAssociation()
	 * @generated
	 */
	EAttribute getEntityAssociation_TargetFooterClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment <em>Association Without Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Without Containment</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment
	 * @generated
	 */
	EClass getAssociationWithoutContainment();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment#getTargetCardinality <em>Target Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Cardinality</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment#getTargetCardinality()
	 * @see #getAssociationWithoutContainment()
	 * @generated
	 */
	EAttribute getAssociationWithoutContainment_TargetCardinality();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment#isTargetUnique <em>Target Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Unique</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment#isTargetUnique()
	 * @see #getAssociationWithoutContainment()
	 * @generated
	 */
	EAttribute getAssociationWithoutContainment_TargetUnique();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithContainment <em>Association With Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association With Containment</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithContainment
	 * @generated
	 */
	EClass getAssociationWithContainment();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithContainment#isSourceVisible <em>Source Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Visible</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithContainment#isSourceVisible()
	 * @see #getAssociationWithContainment()
	 * @generated
	 */
	EAttribute getAssociationWithContainment_SourceVisible();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey <em>Association Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Key</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey
	 * @generated
	 */
	EClass getAssociationKey();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey#getKeyFor <em>Key For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Key For</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey#getKeyFor()
	 * @see #getAssociationKey()
	 * @generated
	 */
	EReference getAssociationKey_KeyFor();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey#getSourceFeature <em>Source Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey#getSourceFeature()
	 * @see #getAssociationKey()
	 * @generated
	 */
	EReference getAssociationKey_SourceFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey#getTargetFeature <em>Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey#getTargetFeature()
	 * @see #getAssociationKey()
	 * @generated
	 */
	EReference getAssociationKey_TargetFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.View#getEncapsulates <em>Encapsulates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulates</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.View#getEncapsulates()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Encapsulates();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.persistence.View#getViewFeatures <em>View Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Features</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.View#getViewFeatures()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewFeatures();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.ViewFeature <em>View Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ViewFeature
	 * @generated
	 */
	EClass getViewFeature();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.ViewFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ViewFeature#getPartOf()
	 * @see #getViewFeature()
	 * @generated
	 */
	EReference getViewFeature_PartOf();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedFeature <em>Encapsulated Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encapsulated Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedFeature
	 * @generated
	 */
	EClass getEncapsulatedFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedFeature#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedFeature#getDisplayLabel()
	 * @see #getEncapsulatedFeature()
	 * @generated
	 */
	EAttribute getEncapsulatedFeature_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedFeature#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedFeature#getAlias()
	 * @see #getEncapsulatedFeature()
	 * @generated
	 */
	EAttribute getEncapsulatedFeature_Alias();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedFeature#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedFeature#getColumnName()
	 * @see #getEncapsulatedFeature()
	 * @generated
	 */
	EAttribute getEncapsulatedFeature_ColumnName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute <em>Encapsulated Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encapsulated Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute
	 * @generated
	 */
	EClass getEncapsulatedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getName()
	 * @see #getEncapsulatedAttribute()
	 * @generated
	 */
	EAttribute getEncapsulatedAttribute_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getAttribute()
	 * @see #getEncapsulatedAttribute()
	 * @generated
	 */
	EReference getEncapsulatedAttribute_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getCardinality()
	 * @see #getEncapsulatedAttribute()
	 * @generated
	 */
	EAttribute getEncapsulatedAttribute_Cardinality();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation <em>Encapsulated Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encapsulated Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation
	 * @generated
	 */
	EClass getEncapsulatedAssociation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getName()
	 * @see #getEncapsulatedAssociation()
	 * @generated
	 */
	EAttribute getEncapsulatedAssociation_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getAssociation()
	 * @see #getEncapsulatedAssociation()
	 * @generated
	 */
	EReference getEncapsulatedAssociation_Association();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getEncapsulatedTarget <em>Encapsulated Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Encapsulated Target</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getEncapsulatedTarget()
	 * @see #getEncapsulatedAssociation()
	 * @generated
	 */
	EReference getEncapsulatedAssociation_EncapsulatedTarget();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#isIsSourceAssociation <em>Is Source Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#isIsSourceAssociation()
	 * @see #getEncapsulatedAssociation()
	 * @generated
	 */
	EAttribute getEncapsulatedAssociation_IsSourceAssociation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getCardinality()
	 * @see #getEncapsulatedAssociation()
	 * @generated
	 */
	EAttribute getEncapsulatedAssociation_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getSourceEntity()
	 * @see #getEncapsulatedAssociation()
	 * @generated
	 */
	EReference getEncapsulatedAssociation_SourceEntity();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation#getTargetEntity()
	 * @see #getEncapsulatedAssociation()
	 * @generated
	 */
	EReference getEncapsulatedAssociation_TargetEntity();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation <em>View Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation
	 * @generated
	 */
	EClass getViewAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation#getOpposite()
	 * @see #getViewAssociation()
	 * @generated
	 */
	EReference getViewAssociation_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation#getCardinality()
	 * @see #getViewAssociation()
	 * @generated
	 */
	EAttribute getViewAssociation_Cardinality();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies <em>Database Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Technologies</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies
	 * @generated
	 */
	EEnum getDatabaseTechnologies();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies <em>Orm Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm Technologies</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies
	 * @generated
	 */
	EEnum getOrmTechnologies();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.persistence.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Cardinality
	 * @generated
	 */
	EEnum getCardinality();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.persistence.isHasChoices <em>is Has Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>is Has Choices</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.isHasChoices
	 * @generated
	 */
	EEnum getisHasChoices();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.persistence.DateDetails <em>Date Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Details</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DateDetails
	 * @generated
	 */
	EEnum getDateDetails();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersistenceFactory getPersistenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl <em>Persistence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getPersistence()
		 * @generated
		 */
		EClass PERSISTENCE = eINSTANCE.getPersistence();

		/**
		 * The meta object literal for the '<em><b>Serialization Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE__SERIALIZATION_GROUPS = eINSTANCE.getPersistence_SerializationGroups();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE__DATA_TYPES = eINSTANCE.getPersistence_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE__ENTITIES = eINSTANCE.getPersistence_Entities();

		/**
		 * The meta object literal for the '<em><b>Orm Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__ORM_TECHNOLOGY = eINSTANCE.getPersistence_OrmTechnology();

		/**
		 * The meta object literal for the '<em><b>Database Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__DATABASE_TECHNOLOGY = eINSTANCE.getPersistence_DatabaseTechnology();

		/**
		 * The meta object literal for the '<em><b>Database Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__DATABASE_PREFIX = eINSTANCE.getPersistence_DatabasePrefix();

		/**
		 * The meta object literal for the '<em><b>Database Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__DATABASE_HOST = eINSTANCE.getPersistence_DatabaseHost();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__DATABASE_NAME = eINSTANCE.getPersistence_DatabaseName();

		/**
		 * The meta object literal for the '<em><b>Database Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__DATABASE_PORT = eINSTANCE.getPersistence_DatabasePort();

		/**
		 * The meta object literal for the '<em><b>Database Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__DATABASE_USERNAME = eINSTANCE.getPersistence_DatabaseUsername();

		/**
		 * The meta object literal for the '<em><b>Database Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__DATABASE_PASSWORD = eINSTANCE.getPersistence_DatabasePassword();

		/**
		 * The meta object literal for the '<em><b>Timestamp Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__TIMESTAMP_CREATION = eINSTANCE.getPersistence_TimestampCreation();

		/**
		 * The meta object literal for the '<em><b>Timestamp Updates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__TIMESTAMP_UPDATES = eINSTANCE.getPersistence_TimestampUpdates();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.SerializationGroupImpl <em>Serialization Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.SerializationGroupImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getSerializationGroup()
		 * @generated
		 */
		EClass SERIALIZATION_GROUP = eINSTANCE.getSerializationGroup();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl <em>Entity Or View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEntityOrView()
		 * @generated
		 */
		EClass ENTITY_OR_VIEW = eINSTANCE.getEntityOrView();

		/**
		 * The meta object literal for the '<em><b>Singleton Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_OR_VIEW__SINGLETON_NAME = eINSTANCE.getEntityOrView_SingletonName();

		/**
		 * The meta object literal for the '<em><b>Pluralised Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_OR_VIEW__PLURALISED_NAME = eINSTANCE.getEntityOrView_PluralisedName();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_OR_VIEW__KEYS = eINSTANCE.getEntityOrView_Keys();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_OR_VIEW__TABLE_NAME = eINSTANCE.getEntityOrView_TableName();

		/**
		 * The meta object literal for the '<em><b>Auto Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_OR_VIEW__AUTO_KEY_NAME = eINSTANCE.getEntityOrView_AutoKeyName();

		/**
		 * The meta object literal for the '<em><b>Auto Key Persistent Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE = eINSTANCE.getEntityOrView_AutoKeyPersistentType();

		/**
		 * The meta object literal for the '<em><b>Auto Key Generation Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY = eINSTANCE.getEntityOrView_AutoKeyGenerationStrategy();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_OR_VIEW__UNIQUE = eINSTANCE.getEntityOrView_Unique();

		/**
		 * The meta object literal for the '<em><b>Container Unique</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_OR_VIEW__CONTAINER_UNIQUE = eINSTANCE.getEntityOrView_ContainerUnique();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_OR_VIEW__LABELS = eINSTANCE.getEntityOrView_Labels();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_OR_VIEW__FEATURES = eINSTANCE.getEntityOrView_Features();

		/**
		 * The meta object literal for the '<em><b>All Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_OR_VIEW__ALL_FEATURES = eINSTANCE.getEntityOrView_AllFeatures();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_OR_VIEW__ATTRIBUTES = eINSTANCE.getEntityOrView_Attributes();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_OR_VIEW__ASSOCIATIONS = eINSTANCE.getEntityOrView_Associations();

		/**
		 * The meta object literal for the '<em><b>All Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_OR_VIEW__ALL_ASSOCIATIONS = eINSTANCE.getEntityOrView_AllAssociations();

		/**
		 * The meta object literal for the '<em><b>Implements User Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE = eINSTANCE.getEntityOrView_ImplementsUserInterface();

		/**
		 * The meta object literal for the '<em><b>Allow Form Type Customisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION = eINSTANCE.getEntityOrView_AllowFormTypeCustomisation();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Feature <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.Feature
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TITLE = eINSTANCE.getFeature_Title();

		/**
		 * The meta object literal for the '<em><b>Collection Allow Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__COLLECTION_ALLOW_ADD = eINSTANCE.getFeature_CollectionAllowAdd();

		/**
		 * The meta object literal for the '<em><b>Collection Allow Remove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__COLLECTION_ALLOW_REMOVE = eINSTANCE.getFeature_CollectionAllowRemove();

		/**
		 * The meta object literal for the '<em><b>Null Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NULL_DISPLAY_VALUE = eINSTANCE.getFeature_NullDisplayValue();

		/**
		 * The meta object literal for the '<em><b>Encode Uri Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ENCODE_URI_KEY = eINSTANCE.getFeature_EncodeUriKey();

		/**
		 * The meta object literal for the '<em><b>Serialization Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SERIALIZATION_GROUPS = eINSTANCE.getFeature_SerializationGroups();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__HEADER_CLASS = eINSTANCE.getFeature_HeaderClass();

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
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Attribute <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.Attribute
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PLACEHOLDER = eINSTANCE.getAttribute_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALIDATION_PATTERN = eINSTANCE.getAttribute_ValidationPattern();

		/**
		 * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__INPUT_CLASS = eINSTANCE.getAttribute_InputClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Association <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.Association
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__PSEUDO = eINSTANCE.getAssociation_Pseudo();

		/**
		 * The meta object literal for the '<em><b>Encapsulated By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ENCAPSULATED_BY = eINSTANCE.getAssociation_EncapsulatedBy();

		/**
		 * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__INPUT_CLASS = eINSTANCE.getAssociation_InputClass();

		/**
		 * The meta object literal for the '<em><b>Source Entity X</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE_ENTITY_X = eINSTANCE.getAssociation_SourceEntityX();

		/**
		 * The meta object literal for the '<em><b>Target Entity X</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET_ENTITY_X = eINSTANCE.getAssociation_TargetEntityX();

		/**
		 * The meta object literal for the '<em><b>Serialization Max Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SERIALIZATION_MAX_DEPTH = eINSTANCE.getAssociation_SerializationMaxDepth();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Label <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.Label
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelImpl <em>Model Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getModelLabel()
		 * @generated
		 */
		EClass MODEL_LABEL = eINSTANCE.getModelLabel();

		/**
		 * The meta object literal for the '<em><b>Label For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL__LABEL_FOR = eINSTANCE.getModelLabel_LabelFor();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_LABEL__FORMAT = eINSTANCE.getModelLabel_Format();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL__FEATURES = eINSTANCE.getModelLabel_Features();

		/**
		 * The meta object literal for the '<em><b>Serialization Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL__SERIALIZATION_GROUPS = eINSTANCE.getModelLabel_SerializationGroups();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelFeatureImpl <em>Model Label Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelFeatureImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getModelLabelFeature()
		 * @generated
		 */
		EClass MODEL_LABEL_FEATURE = eINSTANCE.getModelLabelFeature();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL_FEATURE__PART_OF = eINSTANCE.getModelLabelFeature_PartOf();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelAttributeImpl <em>Model Label Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getModelLabelAttribute()
		 * @generated
		 */
		EClass MODEL_LABEL_ATTRIBUTE = eINSTANCE.getModelLabelAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getModelLabelAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_LABEL_ATTRIBUTE__DATE_FORMAT = eINSTANCE.getModelLabelAttribute_DateFormat();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelAssociationImpl <em>Model Label Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelAssociationImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getModelLabelAssociation()
		 * @generated
		 */
		EClass MODEL_LABEL_ASSOCIATION = eINSTANCE.getModelLabelAssociation();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL_ASSOCIATION__ASSOCIATION = eINSTANCE.getModelLabelAssociation_Association();

		/**
		 * The meta object literal for the '<em><b>Dynamic Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL_ASSOCIATION__DYNAMIC_LABEL = eINSTANCE.getModelLabelAssociation_DynamicLabel();

		/**
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_LABEL_ASSOCIATION__IS_SOURCE_ASSOCIATION = eINSTANCE.getModelLabelAssociation_IsSourceAssociation();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Entity Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_FEATURES = eINSTANCE.getEntity_EntityFeatures();

		/**
		 * The meta object literal for the '<em><b>Association Ends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ASSOCIATION_ENDS = eINSTANCE.getEntity_AssociationEnds();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl <em>Entity Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEntityFeature()
		 * @generated
		 */
		EClass ENTITY_FEATURE = eINSTANCE.getEntityFeature();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_FEATURE__PART_OF = eINSTANCE.getEntityFeature_PartOf();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FEATURE__CARDINALITY = eINSTANCE.getEntityFeature_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FEATURE__ORDERED = eINSTANCE.getEntityFeature_Ordered();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FEATURE__PRIMARY_KEY = eINSTANCE.getEntityFeature_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Boolean Is Has Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE = eINSTANCE.getEntityFeature_BooleanIsHasChoice();

		/**
		 * The meta object literal for the '<em><b>Singleton Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FEATURE__SINGLETON_NAME = eINSTANCE.getEntityFeature_SingletonName();

		/**
		 * The meta object literal for the '<em><b>Pluralised Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FEATURE__PLURALISED_NAME = eINSTANCE.getEntityFeature_PluralisedName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FEATURE__COLUMN_NAME = eINSTANCE.getEntityFeature_ColumnName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAttributeImpl <em>Entity Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEntityAttribute()
		 * @generated
		 */
		EClass ENTITY_ATTRIBUTE = eINSTANCE.getEntityAttribute();

		/**
		 * The meta object literal for the '<em><b>Container Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ATTRIBUTE__CONTAINER_UNIQUE = eINSTANCE.getEntityAttribute_ContainerUnique();

		/**
		 * The meta object literal for the '<em><b>Persistent Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ATTRIBUTE__PERSISTENT_TYPE = eINSTANCE.getEntityAttribute_PersistentType();

		/**
		 * The meta object literal for the '<em><b>Orm Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ATTRIBUTE__ORM_TYPE = eINSTANCE.getEntityAttribute_OrmType();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ATTRIBUTE__INTERFACE_TYPE = eINSTANCE.getEntityAttribute_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Slug Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ATTRIBUTE__SLUG_FIELDS = eINSTANCE.getEntityAttribute_SlugFields();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ATTRIBUTE__UNIQUE = eINSTANCE.getEntityAttribute_Unique();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.DataTypeAttributeImpl <em>Data Type Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.DataTypeAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getDataTypeAttribute()
		 * @generated
		 */
		EClass DATA_TYPE_ATTRIBUTE = eINSTANCE.getDataTypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_ATTRIBUTE__DATA_TYPE = eINSTANCE.getDataTypeAttribute_DataType();

		/**
		 * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS = eINSTANCE.getDataTypeAttribute_ObfuscateFormFields();

		/**
		 * The meta object literal for the '<em><b>Case Insensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE = eINSTANCE.getDataTypeAttribute_CaseInsensitive();

		/**
		 * The meta object literal for the '<em><b>Encrypt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_ATTRIBUTE__ENCRYPT = eINSTANCE.getDataTypeAttribute_Encrypt();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.DateAttributeImpl <em>Date Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.DateAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getDateAttribute()
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
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_ATTRIBUTE__FORMAT = eINSTANCE.getDateAttribute_Format();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.UrlAttributeImpl <em>Url Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.UrlAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getUrlAttribute()
		 * @generated
		 */
		EClass URL_ATTRIBUTE = eINSTANCE.getUrlAttribute();

		/**
		 * The meta object literal for the '<em><b>Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_ATTRIBUTE__DISPLAY_VALUE = eINSTANCE.getUrlAttribute_DisplayValue();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ResourceAttributeImpl <em>Resource Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ResourceAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getResourceAttribute()
		 * @generated
		 */
		EClass RESOURCE_ATTRIBUTE = eINSTANCE.getResourceAttribute();

		/**
		 * The meta object literal for the '<em><b>Maximum Upload Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE = eINSTANCE.getResourceAttribute_MaximumUploadSize();

		/**
		 * The meta object literal for the '<em><b>Valid Upload Mime Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES = eINSTANCE.getResourceAttribute_ValidUploadMimeTypes();

		/**
		 * The meta object literal for the '<em><b>Valid Upload Extensions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS = eINSTANCE.getResourceAttribute_ValidUploadExtensions();

		/**
		 * The meta object literal for the '<em><b>Uploads Within Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE = eINSTANCE.getResourceAttribute_UploadsWithinWebsite();

		/**
		 * The meta object literal for the '<em><b>Upload Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ATTRIBUTE__UPLOAD_PATH = eINSTANCE.getResourceAttribute_UploadPath();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PathElementImpl <em>Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PathElementImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getPathElement()
		 * @generated
		 */
		EClass PATH_ELEMENT = eINSTANCE.getPathElement();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.StaticPathElementImpl <em>Static Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.StaticPathElementImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getStaticPathElement()
		 * @generated
		 */
		EClass STATIC_PATH_ELEMENT = eINSTANCE.getStaticPathElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_PATH_ELEMENT__ELEMENT = eINSTANCE.getStaticPathElement_Element();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.DatePathElementImpl <em>Date Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.DatePathElementImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getDatePathElement()
		 * @generated
		 */
		EClass DATE_PATH_ELEMENT = eINSTANCE.getDatePathElement();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PATH_ELEMENT__FORMAT = eINSTANCE.getDatePathElement_Format();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.FileAttributeImpl <em>File Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.FileAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getFileAttribute()
		 * @generated
		 */
		EClass FILE_ATTRIBUTE = eINSTANCE.getFileAttribute();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ImageAttributeImpl <em>Image Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ImageAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getImageAttribute()
		 * @generated
		 */
		EClass IMAGE_ATTRIBUTE = eINSTANCE.getImageAttribute();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.LocationAttributeImpl <em>Location Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.LocationAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getLocationAttribute()
		 * @generated
		 */
		EClass LOCATION_ATTRIBUTE = eINSTANCE.getLocationAttribute();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl <em>Entity Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEntityAssociation()
		 * @generated
		 */
		EClass ENTITY_ASSOCIATION = eINSTANCE.getEntityAssociation();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ASSOCIATION__KEYS = eINSTANCE.getEntityAssociation_Keys();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ASSOCIATION__TARGET_ENTITY = eINSTANCE.getEntityAssociation_TargetEntity();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__BIDIRECTIONAL = eINSTANCE.getEntityAssociation_Bidirectional();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__UNIQUE = eINSTANCE.getEntityAssociation_Unique();

		/**
		 * The meta object literal for the '<em><b>Pivot Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__PIVOT_TABLE_NAME = eINSTANCE.getEntityAssociation_PivotTableName();

		/**
		 * The meta object literal for the '<em><b>Target Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__TARGET_FEATURE_NAME = eINSTANCE.getEntityAssociation_TargetFeatureName();

		/**
		 * The meta object literal for the '<em><b>Target Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__TARGET_PRIMARY_KEY = eINSTANCE.getEntityAssociation_TargetPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Target Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__TARGET_COLUMN_NAME = eINSTANCE.getEntityAssociation_TargetColumnName();

		/**
		 * The meta object literal for the '<em><b>Target Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL = eINSTANCE.getEntityAssociation_TargetDisplayLabel();

		/**
		 * The meta object literal for the '<em><b>Target Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__TARGET_HEADER_CLASS = eINSTANCE.getEntityAssociation_TargetHeaderClass();

		/**
		 * The meta object literal for the '<em><b>Target Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__TARGET_INPUT_CLASS = eINSTANCE.getEntityAssociation_TargetInputClass();

		/**
		 * The meta object literal for the '<em><b>Target Display Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS = eINSTANCE.getEntityAssociation_TargetDisplayClass();

		/**
		 * The meta object literal for the '<em><b>Target Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS = eINSTANCE.getEntityAssociation_TargetFooterClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithoutContainmentImpl <em>Association Without Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithoutContainmentImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getAssociationWithoutContainment()
		 * @generated
		 */
		EClass ASSOCIATION_WITHOUT_CONTAINMENT = eINSTANCE.getAssociationWithoutContainment();

		/**
		 * The meta object literal for the '<em><b>Target Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY = eINSTANCE.getAssociationWithoutContainment_TargetCardinality();

		/**
		 * The meta object literal for the '<em><b>Target Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE = eINSTANCE.getAssociationWithoutContainment_TargetUnique();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithContainmentImpl <em>Association With Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithContainmentImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getAssociationWithContainment()
		 * @generated
		 */
		EClass ASSOCIATION_WITH_CONTAINMENT = eINSTANCE.getAssociationWithContainment();

		/**
		 * The meta object literal for the '<em><b>Source Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE = eINSTANCE.getAssociationWithContainment_SourceVisible();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationKeyImpl <em>Association Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationKeyImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getAssociationKey()
		 * @generated
		 */
		EClass ASSOCIATION_KEY = eINSTANCE.getAssociationKey();

		/**
		 * The meta object literal for the '<em><b>Key For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_KEY__KEY_FOR = eINSTANCE.getAssociationKey_KeyFor();

		/**
		 * The meta object literal for the '<em><b>Source Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_KEY__SOURCE_FEATURE = eINSTANCE.getAssociationKey_SourceFeature();

		/**
		 * The meta object literal for the '<em><b>Target Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_KEY__TARGET_FEATURE = eINSTANCE.getAssociationKey_TargetFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Encapsulates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__ENCAPSULATES = eINSTANCE.getView_Encapsulates();

		/**
		 * The meta object literal for the '<em><b>View Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_FEATURES = eINSTANCE.getView_ViewFeatures();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl <em>View Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getViewFeature()
		 * @generated
		 */
		EClass VIEW_FEATURE = eINSTANCE.getViewFeature();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_FEATURE__PART_OF = eINSTANCE.getViewFeature_PartOf();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedFeatureImpl <em>Encapsulated Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedFeatureImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEncapsulatedFeature()
		 * @generated
		 */
		EClass ENCAPSULATED_FEATURE = eINSTANCE.getEncapsulatedFeature();

		/**
		 * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATED_FEATURE__DISPLAY_LABEL = eINSTANCE.getEncapsulatedFeature_DisplayLabel();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATED_FEATURE__ALIAS = eINSTANCE.getEncapsulatedFeature_Alias();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATED_FEATURE__COLUMN_NAME = eINSTANCE.getEncapsulatedFeature_ColumnName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAttributeImpl <em>Encapsulated Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEncapsulatedAttribute()
		 * @generated
		 */
		EClass ENCAPSULATED_ATTRIBUTE = eINSTANCE.getEncapsulatedAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATED_ATTRIBUTE__NAME = eINSTANCE.getEncapsulatedAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCAPSULATED_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getEncapsulatedAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATED_ATTRIBUTE__CARDINALITY = eINSTANCE.getEncapsulatedAttribute_Cardinality();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl <em>Encapsulated Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getEncapsulatedAssociation()
		 * @generated
		 */
		EClass ENCAPSULATED_ASSOCIATION = eINSTANCE.getEncapsulatedAssociation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATED_ASSOCIATION__NAME = eINSTANCE.getEncapsulatedAssociation_Name();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCAPSULATED_ASSOCIATION__ASSOCIATION = eINSTANCE.getEncapsulatedAssociation_Association();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET = eINSTANCE.getEncapsulatedAssociation_EncapsulatedTarget();

		/**
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATED_ASSOCIATION__IS_SOURCE_ASSOCIATION = eINSTANCE.getEncapsulatedAssociation_IsSourceAssociation();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATED_ASSOCIATION__CARDINALITY = eINSTANCE.getEncapsulatedAssociation_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY = eINSTANCE.getEncapsulatedAssociation_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCAPSULATED_ASSOCIATION__TARGET_ENTITY = eINSTANCE.getEncapsulatedAssociation_TargetEntity();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl <em>View Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getViewAssociation()
		 * @generated
		 */
		EClass VIEW_ASSOCIATION = eINSTANCE.getViewAssociation();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ASSOCIATION__OPPOSITE = eINSTANCE.getViewAssociation_Opposite();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ASSOCIATION__CARDINALITY = eINSTANCE.getViewAssociation_Cardinality();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies <em>Database Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getDatabaseTechnologies()
		 * @generated
		 */
		EEnum DATABASE_TECHNOLOGIES = eINSTANCE.getDatabaseTechnologies();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies <em>Orm Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getOrmTechnologies()
		 * @generated
		 */
		EEnum ORM_TECHNOLOGIES = eINSTANCE.getOrmTechnologies();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.Cardinality <em>Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.Cardinality
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getCardinality()
		 * @generated
		 */
		EEnum CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.isHasChoices <em>is Has Choices</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.isHasChoices
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getisHasChoices()
		 * @generated
		 */
		EEnum IS_HAS_CHOICES = eINSTANCE.getisHasChoices();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.persistence.DateDetails <em>Date Details</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.DateDetails
		 * @see uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistencePackageImpl#getDateDetails()
		 * @generated
		 */
		EEnum DATE_DETAILS = eINSTANCE.getDateDetails();

	}

} //PersistencePackage

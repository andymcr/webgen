/**
 */
package uk.ac.man.cs.mdsd.webgen.base;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import uk.ac.man.cs.mdsd.webgen.expression.ExpressionPackage;

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
 * @see uk.ac.man.cs.mdsd.webgen.base.BaseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.man.ac.uk/mdsd/webgen/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen-base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.NamedElementImpl
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

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
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.NamedDisplayElementImpl <em>Named Display Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.NamedDisplayElementImpl
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getNamedDisplayElement()
	 * @generated
	 */
	int NAMED_DISPLAY_ELEMENT = 1;

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
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.ClassifierImpl
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 2;

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
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.DataTypeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 3;

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
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PERSISTENT_TYPE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ORM_TYPE = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INTERFACE_TYPE = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PLACEHOLDER = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__VALIDATION_PATTERN = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.EnumerationTypeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 4;

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
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__PERSISTENT_TYPE = DATA_TYPE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ORM_TYPE = DATA_TYPE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__INTERFACE_TYPE = DATA_TYPE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__PLACEHOLDER = DATA_TYPE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__VALIDATION_PATTERN = DATA_TYPE__VALIDATION_PATTERN;

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
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.EnumerationLiteralImpl
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 5;

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
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.CurrentTimeImpl <em>Current Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.CurrentTimeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getCurrentTime()
	 * @generated
	 */
	int CURRENT_TIME = 6;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME__FORMAT = ExpressionPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_FEATURE_COUNT = ExpressionPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_OPERATION_COUNT = ExpressionPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.CurrentUserImpl <em>Current User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.CurrentUserImpl
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getCurrentUser()
	 * @generated
	 */
	int CURRENT_USER = 7;

	/**
	 * The number of structural features of the '<em>Current User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_FEATURE_COUNT = ExpressionPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Current User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_OPERATION_COUNT = ExpressionPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameterList <em>Formal Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameterList
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getFormalParameterList()
	 * @generated
	 */
	int FORMAL_PARAMETER_LIST = 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Formal Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Formal Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.FormalParameterImpl
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getFormalParameter()
	 * @generated
	 */
	int FORMAL_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Formal For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__FORMAL_FOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__OPTIONAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__DEFAULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.ParameterReferenceImpl
	 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getParameterReference()
	 * @generated
	 */
	int PARAMETER_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE__NAME = ExpressionPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE__PARAMETER = ExpressionPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_FEATURE_COUNT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_OPERATION_COUNT = ExpressionPackage.VARIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement <em>Named Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Display Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement
	 * @generated
	 */
	EClass getNamedDisplayElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement#getDisplayLabel()
	 * @see #getNamedDisplayElement()
	 * @generated
	 */
	EAttribute getNamedDisplayElement_DisplayLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.DataType#getPersistentType <em>Persistent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.DataType#getPersistentType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_PersistentType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.DataType#getOrmType <em>Orm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orm Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.DataType#getOrmType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_OrmType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.DataType#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.DataType#getInterfaceType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_InterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.DataType#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.DataType#getPlaceholder()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.DataType#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.DataType#getValidationPattern()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_ValidationPattern();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.base.EnumerationType#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.EnumerationType#getEnumerations()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_Enumerations();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.CurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Time</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.CurrentTime
	 * @generated
	 */
	EClass getCurrentTime();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.CurrentTime#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.CurrentTime#getFormat()
	 * @see #getCurrentTime()
	 * @generated
	 */
	EAttribute getCurrentTime_Format();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.CurrentUser <em>Current User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current User</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.CurrentUser
	 * @generated
	 */
	EClass getCurrentUser();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameterList <em>Formal Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter List</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameterList
	 * @generated
	 */
	EClass getFormalParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameterList#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameterList#getParameters()
	 * @see #getFormalParameterList()
	 * @generated
	 */
	EReference getFormalParameterList_Parameters();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameter
	 * @generated
	 */
	EClass getFormalParameter();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getFormalFor <em>Formal For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Formal For</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getFormalFor()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EReference getFormalParameter_FormalFor();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameter#isOptional()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_Optional();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDefaultValue()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDataType()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EReference getFormalParameter_DataType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDescription()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_Description();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.base.ParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Reference</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.ParameterReference
	 * @generated
	 */
	EClass getParameterReference();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.base.ParameterReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.ParameterReference#getName()
	 * @see #getParameterReference()
	 * @generated
	 */
	EAttribute getParameterReference_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.base.ParameterReference#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.base.ParameterReference#getParameter()
	 * @see #getParameterReference()
	 * @generated
	 */
	EReference getParameterReference_Parameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.NamedElementImpl
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.NamedDisplayElementImpl <em>Named Display Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.NamedDisplayElementImpl
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getNamedDisplayElement()
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
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.ClassifierImpl
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.DataTypeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Persistent Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__PERSISTENT_TYPE = eINSTANCE.getDataType_PersistentType();

		/**
		 * The meta object literal for the '<em><b>Orm Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__ORM_TYPE = eINSTANCE.getDataType_OrmType();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__INTERFACE_TYPE = eINSTANCE.getDataType_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__PLACEHOLDER = eINSTANCE.getDataType_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__VALIDATION_PATTERN = eINSTANCE.getDataType_ValidationPattern();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.EnumerationTypeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getEnumerationType()
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
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.EnumerationLiteralImpl
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.CurrentTimeImpl <em>Current Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.CurrentTimeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getCurrentTime()
		 * @generated
		 */
		EClass CURRENT_TIME = eINSTANCE.getCurrentTime();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TIME__FORMAT = eINSTANCE.getCurrentTime_Format();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.CurrentUserImpl <em>Current User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.CurrentUserImpl
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getCurrentUser()
		 * @generated
		 */
		EClass CURRENT_USER = eINSTANCE.getCurrentUser();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameterList <em>Formal Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameterList
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getFormalParameterList()
		 * @generated
		 */
		EClass FORMAL_PARAMETER_LIST = eINSTANCE.getFormalParameterList();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER_LIST__PARAMETERS = eINSTANCE.getFormalParameterList_Parameters();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.FormalParameterImpl
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getFormalParameter()
		 * @generated
		 */
		EClass FORMAL_PARAMETER = eINSTANCE.getFormalParameter();

		/**
		 * The meta object literal for the '<em><b>Formal For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER__FORMAL_FOR = eINSTANCE.getFormalParameter_FormalFor();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__OPTIONAL = eINSTANCE.getFormalParameter_Optional();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__DEFAULT_VALUE = eINSTANCE.getFormalParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER__DATA_TYPE = eINSTANCE.getFormalParameter_DataType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__DESCRIPTION = eINSTANCE.getFormalParameter_Description();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.base.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.ParameterReferenceImpl
		 * @see uk.ac.man.cs.mdsd.webgen.base.impl.BasePackageImpl#getParameterReference()
		 * @generated
		 */
		EClass PARAMETER_REFERENCE = eINSTANCE.getParameterReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_REFERENCE__NAME = eINSTANCE.getParameterReference_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REFERENCE__PARAMETER = eINSTANCE.getParameterReference_Parameter();

	}

} //BasePackage

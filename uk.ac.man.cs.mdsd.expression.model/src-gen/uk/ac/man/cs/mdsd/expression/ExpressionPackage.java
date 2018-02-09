/**
 */
package uk.ac.man.cs.mdsd.expression;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.expression.ExpressionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel editDirectory='/uk.ac.man.cs.mdsd.expression.edit/src' editPluginID='uk.ac.man.cs.mdsd.expression.edit' extensibleProviderFactory='true' basePackage='uk.ac.man.cs.mdsd'"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.manchester.ac.uk/mdsd/Expression";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expression";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.Expression
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SUFFIXES = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.Literal <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.Literal
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__SUFFIXES = EXPRESSION__SUFFIXES;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.NullLiteralImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__SUFFIXES = LITERAL__SUFFIXES;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.BooleanLiteralImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__SUFFIXES = LITERAL__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.IntegerLiteralImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__SUFFIXES = LITERAL__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.StringLiteralImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 5;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__SUFFIXES = LITERAL__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.TimeLiteralImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getTimeLiteral()
	 * @generated
	 */
	int TIME_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL__SUFFIXES = LITERAL__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.CurrentTimeImpl <em>Current Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.CurrentTimeImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getCurrentTime()
	 * @generated
	 */
	int CURRENT_TIME = 7;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME__SUFFIXES = EXPRESSION__SUFFIXES;

	/**
	 * The number of structural features of the '<em>Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.CurrentUserImpl <em>Current User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.CurrentUserImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getCurrentUser()
	 * @generated
	 */
	int CURRENT_USER = 8;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__SUFFIXES = EXPRESSION__SUFFIXES;

	/**
	 * The number of structural features of the '<em>Current User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Current User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.Variable <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.Variable
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SUFFIXES = EXPRESSION__SUFFIXES;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 10;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__SUFFIXES = EXPRESSION__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NEGATED = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateBooleanOperatorImpl <em>Predicate Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateBooleanOperatorImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateBooleanOperator()
	 * @generated
	 */
	int PREDICATE_BOOLEAN_OPERATOR = 11;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__SUFFIXES = PREDICATE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__EXPRESSIONS = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__OPERATOR = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateEqualityOperatorImpl <em>Predicate Equality Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateEqualityOperatorImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateEqualityOperator()
	 * @generated
	 */
	int PREDICATE_EQUALITY_OPERATOR = 12;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__SUFFIXES = PREDICATE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateComparisonOperatorImpl <em>Predicate Comparison Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateComparisonOperatorImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateComparisonOperator()
	 * @generated
	 */
	int PREDICATE_COMPARISON_OPERATOR = 13;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__SUFFIXES = PREDICATE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__OPERATOR = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Predicate Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Predicate Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateInOperatorImpl <em>Predicate In Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateInOperatorImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateInOperator()
	 * @generated
	 */
	int PREDICATE_IN_OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR__SUFFIXES = PREDICATE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate In Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate In Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateIsOperatorImpl <em>Predicate Is Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateIsOperatorImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateIsOperator()
	 * @generated
	 */
	int PREDICATE_IS_OPERATOR = 15;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__SUFFIXES = PREDICATE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Is Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Is Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateLikeOperatorImpl <em>Predicate Like Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateLikeOperatorImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateLikeOperator()
	 * @generated
	 */
	int PREDICATE_LIKE_OPERATOR = 16;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__SUFFIXES = PREDICATE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Like Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Like Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateIsEmptyImpl <em>Predicate Is Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateIsEmptyImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateIsEmpty()
	 * @generated
	 */
	int PREDICATE_IS_EMPTY = 17;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY__SUFFIXES = PREDICATE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY__FEATURE = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicate Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateIsNullImpl <em>Predicate Is Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateIsNullImpl
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateIsNull()
	 * @generated
	 */
	int PREDICATE_IS_NULL = 18;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_NULL__SUFFIXES = PREDICATE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_NULL__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_NULL__FEATURE = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_NULL_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicate Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_NULL_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.BooleanOperator
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 19;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.expression.ComparisionOperator <em>Comparision Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.expression.ComparisionOperator
	 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getComparisionOperator()
	 * @generated
	 */
	int COMPARISION_OPERATOR = 20;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.man.cs.mdsd.expression.Expression#getSuffixes <em>Suffixes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Suffixes</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.Expression#getSuffixes()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Suffixes();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.expression.BooleanLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.BooleanLiteral#getValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.expression.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.expression.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.TimeLiteral <em>Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.TimeLiteral
	 * @generated
	 */
	EClass getTimeLiteral();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.expression.TimeLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.TimeLiteral#getValue()
	 * @see #getTimeLiteral()
	 * @generated
	 */
	EAttribute getTimeLiteral_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.CurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Time</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.CurrentTime
	 * @generated
	 */
	EClass getCurrentTime();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.CurrentUser <em>Current User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current User</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.CurrentUser
	 * @generated
	 */
	EClass getCurrentUser();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.expression.Predicate#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.Predicate#isNegated()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_Negated();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.PredicateBooleanOperator <em>Predicate Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Boolean Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateBooleanOperator
	 * @generated
	 */
	EClass getPredicateBooleanOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.expression.PredicateBooleanOperator#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateBooleanOperator#getExpressions()
	 * @see #getPredicateBooleanOperator()
	 * @generated
	 */
	EReference getPredicateBooleanOperator_Expressions();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.expression.PredicateBooleanOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateBooleanOperator#getOperator()
	 * @see #getPredicateBooleanOperator()
	 * @generated
	 */
	EAttribute getPredicateBooleanOperator_Operator();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.PredicateEqualityOperator <em>Predicate Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Equality Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateEqualityOperator
	 * @generated
	 */
	EClass getPredicateEqualityOperator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateEqualityOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateEqualityOperator#getLeft()
	 * @see #getPredicateEqualityOperator()
	 * @generated
	 */
	EReference getPredicateEqualityOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateEqualityOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateEqualityOperator#getRight()
	 * @see #getPredicateEqualityOperator()
	 * @generated
	 */
	EReference getPredicateEqualityOperator_Right();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.PredicateComparisonOperator <em>Predicate Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Comparison Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateComparisonOperator
	 * @generated
	 */
	EClass getPredicateComparisonOperator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateComparisonOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateComparisonOperator#getLeft()
	 * @see #getPredicateComparisonOperator()
	 * @generated
	 */
	EReference getPredicateComparisonOperator_Left();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.expression.PredicateComparisonOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateComparisonOperator#getOperator()
	 * @see #getPredicateComparisonOperator()
	 * @generated
	 */
	EAttribute getPredicateComparisonOperator_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateComparisonOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateComparisonOperator#getRight()
	 * @see #getPredicateComparisonOperator()
	 * @generated
	 */
	EReference getPredicateComparisonOperator_Right();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.PredicateInOperator <em>Predicate In Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate In Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateInOperator
	 * @generated
	 */
	EClass getPredicateInOperator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateInOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateInOperator#getLeft()
	 * @see #getPredicateInOperator()
	 * @generated
	 */
	EReference getPredicateInOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateInOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateInOperator#getRight()
	 * @see #getPredicateInOperator()
	 * @generated
	 */
	EReference getPredicateInOperator_Right();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.PredicateIsOperator <em>Predicate Is Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Is Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateIsOperator
	 * @generated
	 */
	EClass getPredicateIsOperator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateIsOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateIsOperator#getLeft()
	 * @see #getPredicateIsOperator()
	 * @generated
	 */
	EReference getPredicateIsOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateIsOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateIsOperator#getRight()
	 * @see #getPredicateIsOperator()
	 * @generated
	 */
	EReference getPredicateIsOperator_Right();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.PredicateLikeOperator <em>Predicate Like Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Like Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateLikeOperator
	 * @generated
	 */
	EClass getPredicateLikeOperator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateLikeOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateLikeOperator#getLeft()
	 * @see #getPredicateLikeOperator()
	 * @generated
	 */
	EReference getPredicateLikeOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateLikeOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateLikeOperator#getRight()
	 * @see #getPredicateLikeOperator()
	 * @generated
	 */
	EReference getPredicateLikeOperator_Right();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.PredicateIsEmpty <em>Predicate Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Is Empty</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateIsEmpty
	 * @generated
	 */
	EClass getPredicateIsEmpty();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateIsEmpty#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateIsEmpty#getFeature()
	 * @see #getPredicateIsEmpty()
	 * @generated
	 */
	EReference getPredicateIsEmpty_Feature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.expression.PredicateIsNull <em>Predicate Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Is Null</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateIsNull
	 * @generated
	 */
	EClass getPredicateIsNull();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.expression.PredicateIsNull#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.PredicateIsNull#getFeature()
	 * @see #getPredicateIsNull()
	 * @generated
	 */
	EReference getPredicateIsNull_Feature();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.expression.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.expression.ComparisionOperator <em>Comparision Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparision Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.expression.ComparisionOperator
	 * @generated
	 */
	EEnum getComparisionOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

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
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.Expression
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Suffixes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__SUFFIXES = eINSTANCE.getExpression_Suffixes();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.Literal <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.Literal
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.NullLiteralImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getNullLiteral()
		 * @generated
		 */
		EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.BooleanLiteralImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.IntegerLiteralImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.StringLiteralImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.TimeLiteralImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getTimeLiteral()
		 * @generated
		 */
		EClass TIME_LITERAL = eINSTANCE.getTimeLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LITERAL__VALUE = eINSTANCE.getTimeLiteral_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.CurrentTimeImpl <em>Current Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.CurrentTimeImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getCurrentTime()
		 * @generated
		 */
		EClass CURRENT_TIME = eINSTANCE.getCurrentTime();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.CurrentUserImpl <em>Current User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.CurrentUserImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getCurrentUser()
		 * @generated
		 */
		EClass CURRENT_USER = eINSTANCE.getCurrentUser();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.Variable <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.Variable
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__NEGATED = eINSTANCE.getPredicate_Negated();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateBooleanOperatorImpl <em>Predicate Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateBooleanOperatorImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateBooleanOperator()
		 * @generated
		 */
		EClass PREDICATE_BOOLEAN_OPERATOR = eINSTANCE.getPredicateBooleanOperator();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_BOOLEAN_OPERATOR__EXPRESSIONS = eINSTANCE.getPredicateBooleanOperator_Expressions();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_BOOLEAN_OPERATOR__OPERATOR = eINSTANCE.getPredicateBooleanOperator_Operator();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateEqualityOperatorImpl <em>Predicate Equality Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateEqualityOperatorImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateEqualityOperator()
		 * @generated
		 */
		EClass PREDICATE_EQUALITY_OPERATOR = eINSTANCE.getPredicateEqualityOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_EQUALITY_OPERATOR__LEFT = eINSTANCE.getPredicateEqualityOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_EQUALITY_OPERATOR__RIGHT = eINSTANCE.getPredicateEqualityOperator_Right();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateComparisonOperatorImpl <em>Predicate Comparison Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateComparisonOperatorImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateComparisonOperator()
		 * @generated
		 */
		EClass PREDICATE_COMPARISON_OPERATOR = eINSTANCE.getPredicateComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_COMPARISON_OPERATOR__LEFT = eINSTANCE.getPredicateComparisonOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_COMPARISON_OPERATOR__OPERATOR = eINSTANCE.getPredicateComparisonOperator_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_COMPARISON_OPERATOR__RIGHT = eINSTANCE.getPredicateComparisonOperator_Right();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateInOperatorImpl <em>Predicate In Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateInOperatorImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateInOperator()
		 * @generated
		 */
		EClass PREDICATE_IN_OPERATOR = eINSTANCE.getPredicateInOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IN_OPERATOR__LEFT = eINSTANCE.getPredicateInOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IN_OPERATOR__RIGHT = eINSTANCE.getPredicateInOperator_Right();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateIsOperatorImpl <em>Predicate Is Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateIsOperatorImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateIsOperator()
		 * @generated
		 */
		EClass PREDICATE_IS_OPERATOR = eINSTANCE.getPredicateIsOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_OPERATOR__LEFT = eINSTANCE.getPredicateIsOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_OPERATOR__RIGHT = eINSTANCE.getPredicateIsOperator_Right();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateLikeOperatorImpl <em>Predicate Like Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateLikeOperatorImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateLikeOperator()
		 * @generated
		 */
		EClass PREDICATE_LIKE_OPERATOR = eINSTANCE.getPredicateLikeOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_LIKE_OPERATOR__LEFT = eINSTANCE.getPredicateLikeOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_LIKE_OPERATOR__RIGHT = eINSTANCE.getPredicateLikeOperator_Right();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateIsEmptyImpl <em>Predicate Is Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateIsEmptyImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateIsEmpty()
		 * @generated
		 */
		EClass PREDICATE_IS_EMPTY = eINSTANCE.getPredicateIsEmpty();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_EMPTY__FEATURE = eINSTANCE.getPredicateIsEmpty_Feature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.impl.PredicateIsNullImpl <em>Predicate Is Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.impl.PredicateIsNullImpl
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getPredicateIsNull()
		 * @generated
		 */
		EClass PREDICATE_IS_NULL = eINSTANCE.getPredicateIsNull();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_NULL__FEATURE = eINSTANCE.getPredicateIsNull_Feature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.BooleanOperator
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.expression.ComparisionOperator <em>Comparision Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.expression.ComparisionOperator
		 * @see uk.ac.man.cs.mdsd.expression.impl.ExpressionPackageImpl#getComparisionOperator()
		 * @generated
		 */
		EEnum COMPARISION_OPERATOR = eINSTANCE.getComparisionOperator();

	}

} //ExpressionPackage

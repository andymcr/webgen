/**
 */
package uk.ac.man.cs.mdsd.webgen.expression.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.man.cs.mdsd.webgen.expression.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebGenExpressionFactoryImpl extends EFactoryImpl implements WebGenExpressionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebGenExpressionFactory init() {
		try {
			WebGenExpressionFactory theWebGenExpressionFactory = (WebGenExpressionFactory)EPackage.Registry.INSTANCE.getEFactory(WebGenExpressionPackage.eNS_URI);
			if (theWebGenExpressionFactory != null) {
				return theWebGenExpressionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebGenExpressionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenExpressionFactoryImpl() {
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
			case WebGenExpressionPackage.NULL_LITERAL: return createNullLiteral();
			case WebGenExpressionPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case WebGenExpressionPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case WebGenExpressionPackage.STRING_LITERAL: return createStringLiteral();
			case WebGenExpressionPackage.TIME_LITERAL: return createTimeLiteral();
			case WebGenExpressionPackage.CURRENT_TIME: return createCurrentTime();
			case WebGenExpressionPackage.FUNCTION: return createFunction();
			case WebGenExpressionPackage.PREDICATE_BOOLEAN_OPERATOR: return createPredicateBooleanOperator();
			case WebGenExpressionPackage.PREDICATE_EQUALITY_OPERATOR: return createPredicateEqualityOperator();
			case WebGenExpressionPackage.PREDICATE_COMPARISON_OPERATOR: return createPredicateComparisonOperator();
			case WebGenExpressionPackage.PREDICATE_IS_OPERATOR: return createPredicateIsOperator();
			case WebGenExpressionPackage.PREDICATE_LIKE_OPERATOR: return createPredicateLikeOperator();
			case WebGenExpressionPackage.PREDICATE_IS_EMPTY: return createPredicateIsEmpty();
			case WebGenExpressionPackage.PREDICATE_IS_NULL: return createPredicateIsNull();
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
			case WebGenExpressionPackage.BOOLEAN_OPERATOR:
				return createBooleanOperatorFromString(eDataType, initialValue);
			case WebGenExpressionPackage.COMPARISION_OPERATOR:
				return createComparisionOperatorFromString(eDataType, initialValue);
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
			case WebGenExpressionPackage.BOOLEAN_OPERATOR:
				return convertBooleanOperatorToString(eDataType, instanceValue);
			case WebGenExpressionPackage.COMPARISION_OPERATOR:
				return convertComparisionOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLiteral createTimeLiteral() {
		TimeLiteralImpl timeLiteral = new TimeLiteralImpl();
		return timeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentTime createCurrentTime() {
		CurrentTimeImpl currentTime = new CurrentTimeImpl();
		return currentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateBooleanOperator createPredicateBooleanOperator() {
		PredicateBooleanOperatorImpl predicateBooleanOperator = new PredicateBooleanOperatorImpl();
		return predicateBooleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateEqualityOperator createPredicateEqualityOperator() {
		PredicateEqualityOperatorImpl predicateEqualityOperator = new PredicateEqualityOperatorImpl();
		return predicateEqualityOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateComparisonOperator createPredicateComparisonOperator() {
		PredicateComparisonOperatorImpl predicateComparisonOperator = new PredicateComparisonOperatorImpl();
		return predicateComparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateIsOperator createPredicateIsOperator() {
		PredicateIsOperatorImpl predicateIsOperator = new PredicateIsOperatorImpl();
		return predicateIsOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateLikeOperator createPredicateLikeOperator() {
		PredicateLikeOperatorImpl predicateLikeOperator = new PredicateLikeOperatorImpl();
		return predicateLikeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateIsEmpty createPredicateIsEmpty() {
		PredicateIsEmptyImpl predicateIsEmpty = new PredicateIsEmptyImpl();
		return predicateIsEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateIsNull createPredicateIsNull() {
		PredicateIsNullImpl predicateIsNull = new PredicateIsNullImpl();
		return predicateIsNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanOperator result = BooleanOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisionOperator createComparisionOperatorFromString(EDataType eDataType, String initialValue) {
		ComparisionOperator result = ComparisionOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisionOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenExpressionPackage getWebGenExpressionPackage() {
		return (WebGenExpressionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebGenExpressionPackage getPackage() {
		return WebGenExpressionPackage.eINSTANCE;
	}

} //WebGenExpressionFactoryImpl

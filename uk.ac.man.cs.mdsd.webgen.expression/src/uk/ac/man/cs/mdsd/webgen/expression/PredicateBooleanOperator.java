/**
 */
package uk.ac.man.cs.mdsd.webgen.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.expression.PredicateBooleanOperator#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.expression.PredicateBooleanOperator#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.expression.ExpressionPackage#getPredicateBooleanOperator()
 * @model
 * @generated
 */
public interface PredicateBooleanOperator extends Predicate {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.expression.Predicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.expression.ExpressionPackage#getPredicateBooleanOperator_Expressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Predicate> getExpressions();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"And"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.expression.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.expression.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see uk.ac.man.cs.mdsd.webgen.expression.ExpressionPackage#getPredicateBooleanOperator_Operator()
	 * @model default="And" unique="false" required="true"
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.expression.PredicateBooleanOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.expression.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

} // PredicateBooleanOperator

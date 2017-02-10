/**
 */
package uk.ac.man.cs.mdsd.webgen.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Like Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.expression.PredicateLikeOperator#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.expression.PredicateLikeOperator#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.expression.WebGenExpressionPackage#getPredicateLikeOperator()
 * @model
 * @generated
 */
public interface PredicateLikeOperator extends Predicate {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see uk.ac.man.cs.mdsd.webgen.expression.WebGenExpressionPackage#getPredicateLikeOperator_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.expression.PredicateLikeOperator#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see uk.ac.man.cs.mdsd.webgen.expression.WebGenExpressionPackage#getPredicateLikeOperator_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.expression.PredicateLikeOperator#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // PredicateLikeOperator

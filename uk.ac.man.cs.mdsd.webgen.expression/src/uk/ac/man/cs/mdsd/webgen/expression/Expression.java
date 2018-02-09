/**
 */
package uk.ac.man.cs.mdsd.webgen.expression;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.expression.Expression#getSuffixes <em>Suffixes</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.expression.ExpressionPackage#getExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Expression extends EObject {

	/**
	 * Returns the value of the '<em><b>Suffixes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffixes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffixes</em>' attribute list.
	 * @see uk.ac.man.cs.mdsd.webgen.expression.ExpressionPackage#getExpression_Suffixes()
	 * @model
	 * @generated
	 */
	EList<String> getSuffixes();
} // Expression

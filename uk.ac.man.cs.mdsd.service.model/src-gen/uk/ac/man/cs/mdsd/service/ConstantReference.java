/**
 */
package uk.ac.man.cs.mdsd.service;

import uk.ac.man.cs.mdsd.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.service.ConstantReference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.service.ServicePackage#getConstantReference()
 * @model
 * @generated
 */
public interface ConstantReference extends Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Constant)
	 * @see uk.ac.man.cs.mdsd.service.ServicePackage#getConstantReference_Value()
	 * @model required="true"
	 * @generated
	 */
	Constant getValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.service.ConstantReference#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Constant value);

} // ConstantReference

/**
 */
package uk.ac.man.cs.mdsd.webgen.service;

import uk.ac.man.cs.mdsd.webgen.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.ConstantReference#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.ConstantReference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getConstantReference()
 * @model
 * @generated
 */
public interface ConstantReference extends Variable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getConstantReference_Name()
	 * @model default="" unsettable="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if value.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tvalue.name\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.ConstantReference#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

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
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getConstantReference_Value()
	 * @model required="true"
	 * @generated
	 */
	Constant getValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.ConstantReference#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Constant value);

} // ConstantReference

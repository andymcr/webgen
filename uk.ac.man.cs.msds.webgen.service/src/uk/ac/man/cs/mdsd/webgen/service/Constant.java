/**
 */
package uk.ac.man.cs.mdsd.webgen.service;

import uk.ac.man.cs.mdsd.webgen.base.NamedElement;

import uk.ac.man.cs.mdsd.webgen.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Constant#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Constant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Defined By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.service.Service#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By</em>' container reference.
	 * @see #setDefinedBy(Service)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getConstant_DefinedBy()
	 * @see uk.ac.man.cs.mdsd.webgen.service.Service#getConstants
	 * @model opposite="constants" required="true" transient="false"
	 * @generated
	 */
	Service getDefinedBy();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Constant#getDefinedBy <em>Defined By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By</em>' container reference.
	 * @see #getDefinedBy()
	 * @generated
	 */
	void setDefinedBy(Service value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getConstant_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Constant#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // Constant

/**
 */
package uk.ac.man.cs.mdsd.webgen.service;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.webgen.expression.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.FormalParameter#getFormalFor <em>Formal For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.FormalParameter#isOptional <em>Optional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.FormalParameter#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage#getFormalParameter()
 * @model
 * @generated
 */
public interface FormalParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Formal For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal For</em>' reference.
	 * @see #setFormalFor(FormalParameterList)
	 * @see uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage#getFormalParameter_FormalFor()
	 * @model required="true"
	 * @generated
	 */
	FormalParameterList getFormalFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.FormalParameter#getFormalFor <em>Formal For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal For</em>' reference.
	 * @see #getFormalFor()
	 * @generated
	 */
	void setFormalFor(FormalParameterList value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage#getFormalParameter_Optional()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.FormalParameter#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Literal)
	 * @see uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage#getFormalParameter_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	Literal getDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.FormalParameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Literal value);

} // FormalParameter

/**
 */
package uk.ac.man.cs.mdsd.webgen.base;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.SelectionParameter#getFormalFor <em>Formal For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.SelectionParameter#isOptional <em>Optional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.SelectionParameter#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getSelectionParameter()
 * @model
 * @generated
 */
public interface SelectionParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Formal For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameterList#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal For</em>' container reference.
	 * @see #setFormalFor(FormalParameterList)
	 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getSelectionParameter_FormalFor()
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameterList#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	FormalParameterList getFormalFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.base.SelectionParameter#getFormalFor <em>Formal For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal For</em>' container reference.
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
	 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getSelectionParameter_Optional()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.base.SelectionParameter#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getSelectionParameter_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.base.SelectionParameter#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // SelectionParameter

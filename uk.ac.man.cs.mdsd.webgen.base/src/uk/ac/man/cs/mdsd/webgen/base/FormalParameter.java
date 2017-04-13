/**
 */
package uk.ac.man.cs.mdsd.webgen.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getFormalFor <em>Formal For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#isOptional <em>Optional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getFormalParameter()
 * @model
 * @generated
 */
public interface FormalParameter extends NamedElement {
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
	 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getFormalParameter_FormalFor()
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameterList#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	FormalParameterList getFormalFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getFormalFor <em>Formal For</em>}' container reference.
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
	 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getFormalParameter_Optional()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#isOptional <em>Optional</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getFormalParameter_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getFormalParameter_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getFormalParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // FormalParameter

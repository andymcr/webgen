/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.base.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#isEncrypt <em>Encrypt</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#getInterfaceType <em>Interface Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDataTypeField()
 * @model
 * @generated
 */
public interface DataTypeField extends InterfaceField {
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDataTypeField_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obfuscate Form Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #setObfuscateFormFields(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDataTypeField_ObfuscateFormFields()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isObfuscateFormFields();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#isObfuscateFormFields <em>Obfuscate Form Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #isObfuscateFormFields()
	 * @generated
	 */
	void setObfuscateFormFields(boolean value);

	/**
	 * Returns the value of the '<em><b>Encrypt</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypt</em>' attribute.
	 * @see #setEncrypt(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDataTypeField_Encrypt()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isEncrypt();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#isEncrypt <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypt</em>' attribute.
	 * @see #isEncrypt()
	 * @generated
	 */
	void setEncrypt(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see #setInterfaceType(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDataTypeField_InterfaceType()
	 * @model
	 * @generated
	 */
	String getInterfaceType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(String value);

} // DataTypeField

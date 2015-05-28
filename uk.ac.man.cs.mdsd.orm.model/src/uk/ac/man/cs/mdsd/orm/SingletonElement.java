/**
 */
package uk.ac.man.cs.mdsd.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonElement#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonElement#isCaseInsensitive <em>Case Insensitive</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonElement#isEncrypt <em>Encrypt</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonElement()
 * @model
 * @generated
 */
public interface SingletonElement extends SingletonAttribute {
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
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonElement_DataType()
   * @model required="true" ordered="false"
   * @generated
   */
	DataType getDataType();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonElement#getDataType <em>Data Type</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' reference.
   * @see #getDataType()
   * @generated
   */
	void setDataType(DataType value);

	/**
   * Returns the value of the '<em><b>Obfuscate Form Fields</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obfuscate Form Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Obfuscate Form Fields</em>' attribute.
   * @see #setObfuscateFormFields(boolean)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonElement_ObfuscateFormFields()
   * @model unique="false" ordered="false"
   * @generated
   */
	boolean isObfuscateFormFields();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obfuscate Form Fields</em>' attribute.
   * @see #isObfuscateFormFields()
   * @generated
   */
	void setObfuscateFormFields(boolean value);

	/**
   * Returns the value of the '<em><b>Case Insensitive</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Insensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Case Insensitive</em>' attribute.
   * @see #setCaseInsensitive(boolean)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonElement_CaseInsensitive()
   * @model unique="false" ordered="false"
   * @generated
   */
	boolean isCaseInsensitive();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonElement#isCaseInsensitive <em>Case Insensitive</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Insensitive</em>' attribute.
   * @see #isCaseInsensitive()
   * @generated
   */
	void setCaseInsensitive(boolean value);

	/**
   * Returns the value of the '<em><b>Encrypt</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Encrypt</em>' attribute.
   * @see #setEncrypt(boolean)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonElement_Encrypt()
   * @model unique="false" ordered="false"
   * @generated
   */
	boolean isEncrypt();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonElement#isEncrypt <em>Encrypt</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Encrypt</em>' attribute.
   * @see #isEncrypt()
   * @generated
   */
	void setEncrypt(boolean value);

} // SingletonElement

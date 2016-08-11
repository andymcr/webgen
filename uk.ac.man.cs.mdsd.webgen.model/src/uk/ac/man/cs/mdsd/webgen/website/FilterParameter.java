/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FilterParameter#getFormal <em>Formal</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FilterParameter#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FilterParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FilterParameter#getPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFilterParameter()
 * @model
 * @generated
 */
public interface FilterParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal</em>' reference.
	 * @see #setFormal(SelectionParameter)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFilterParameter_Formal()
	 * @model
	 * @generated
	 */
	SelectionParameter getFormal();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FilterParameter#getFormal <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' reference.
	 * @see #getFormal()
	 * @generated
	 */
	void setFormal(SelectionParameter value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFilterParameter_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FilterParameter#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFilterParameter_DefaultValue()
	 * @model default=""
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FilterParameter#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFilterParameter_Placeholder()
	 * @model
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FilterParameter#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

} // FilterParameter

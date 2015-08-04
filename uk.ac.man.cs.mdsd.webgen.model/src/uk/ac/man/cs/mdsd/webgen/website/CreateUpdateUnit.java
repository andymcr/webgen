/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.CreateUpdateUnit#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCreateUpdateUnit()
 * @model
 * @generated
 */
public interface CreateUpdateUnit extends EditUnit, SelectTarget {
	/**
	 * Returns the value of the '<em><b>Clear Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Label</em>' attribute.
	 * @see #setClearLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCreateUpdateUnit_ClearLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getClearLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Label</em>' attribute.
	 * @see #getClearLabel()
	 * @generated
	 */
	void setClearLabel(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,create_unit,update_unit,framed"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCreateUpdateUnit_StyleClass()
	 * @model default="unit,create_unit,update_unit,framed" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.CreateUpdateUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // CreateUpdateUnit

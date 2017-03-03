/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getCreateUriElement <em>Create Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCreateUpdateUnit()
 * @model
 * @generated
 */
public interface CreateUpdateUnit extends EditUnit, SelectableUnit {
	/**
	 * Returns the value of the '<em><b>Create Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Uri Element</em>' attribute.
	 * @see #setCreateUriElement(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCreateUpdateUnit_CreateUriElement()
	 * @model default=""
	 * @generated
	 */
	String getCreateUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getCreateUriElement <em>Create Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Uri Element</em>' attribute.
	 * @see #getCreateUriElement()
	 * @generated
	 */
	void setCreateUriElement(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCreateUpdateUnit_ClearLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getClearLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Label</em>' attribute.
	 * @see #getClearLabel()
	 * @generated
	 */
	void setClearLabel(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,create_unit,update_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCreateUpdateUnit_StyleClass()
	 * @model default="unit,create_unit,update_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // CreateUpdateUnit

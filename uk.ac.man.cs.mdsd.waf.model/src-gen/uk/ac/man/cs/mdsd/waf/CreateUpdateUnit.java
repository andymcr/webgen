/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CreateUpdateUnit#getCreateUriElement <em>Create Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCreateUpdateUnit()
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCreateUpdateUnit_CreateUriElement()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getCreateUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CreateUpdateUnit#getCreateUriElement <em>Create Uri Element</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCreateUpdateUnit_ClearLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getClearLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Label</em>' attribute.
	 * @see #getClearLabel()
	 * @generated
	 */
	void setClearLabel(String value);

} // CreateUpdateUnit

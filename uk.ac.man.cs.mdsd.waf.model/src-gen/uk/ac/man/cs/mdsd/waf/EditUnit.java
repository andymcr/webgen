/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.expression.Predicate;

import uk.ac.man.cs.mdsd.orm.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.EditUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.EditUnit#getDisableCondition <em>Disable Condition</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.EditUnit#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.EditUnit#getConfirmDestination <em>Confirm Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.EditUnit#getConfirmLabel <em>Confirm Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.EditUnit#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.EditUnit#getCancelLabel <em>Cancel Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.EditUnit#isCustomiseValues <em>Customise Values</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getEditUnit()
 * @model abstract="true"
 * @generated
 */
public interface EditUnit extends DynamicUnit, SingletonUnit {
	/**
	 * Returns the value of the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Save Continue Editing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Save Continue Editing</em>' attribute.
	 * @see #setOnSaveContinueEditing(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getEditUnit_OnSaveContinueEditing()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isOnSaveContinueEditing();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.EditUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Save Continue Editing</em>' attribute.
	 * @see #isOnSaveContinueEditing()
	 * @generated
	 */
	void setOnSaveContinueEditing(boolean value);

	/**
	 * Returns the value of the '<em><b>Disable Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Condition</em>' containment reference.
	 * @see #setDisableCondition(Predicate)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getEditUnit_DisableCondition()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getDisableCondition();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getDisableCondition <em>Disable Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Condition</em>' containment reference.
	 * @see #getDisableCondition()
	 * @generated
	 */
	void setDisableCondition(Predicate value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' reference.
	 * @see #setTitle(Label)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getEditUnit_Title()
	 * @model
	 * @generated
	 */
	Label getTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Label value);

	/**
	 * Returns the value of the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Destination</em>' reference.
	 * @see #setConfirmDestination(Page)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getEditUnit_ConfirmDestination()
	 * @model
	 * @generated
	 */
	Page getConfirmDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getConfirmDestination <em>Confirm Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Destination</em>' reference.
	 * @see #getConfirmDestination()
	 * @generated
	 */
	void setConfirmDestination(Page value);

	/**
	 * Returns the value of the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Label</em>' attribute.
	 * @see #setConfirmLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getEditUnit_ConfirmLabel()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getConfirmLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getConfirmLabel <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Label</em>' attribute.
	 * @see #getConfirmLabel()
	 * @generated
	 */
	void setConfirmLabel(String value);

	/**
	 * Returns the value of the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Destination</em>' reference.
	 * @see #setCancelDestination(Page)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getEditUnit_CancelDestination()
	 * @model
	 * @generated
	 */
	Page getCancelDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getCancelDestination <em>Cancel Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Destination</em>' reference.
	 * @see #getCancelDestination()
	 * @generated
	 */
	void setCancelDestination(Page value);

	/**
	 * Returns the value of the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Label</em>' attribute.
	 * @see #setCancelLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getEditUnit_CancelLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getCancelLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getCancelLabel <em>Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Label</em>' attribute.
	 * @see #getCancelLabel()
	 * @generated
	 */
	void setCancelLabel(String value);

	/**
	 * Returns the value of the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customise Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customise Values</em>' attribute.
	 * @see #setCustomiseValues(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getEditUnit_CustomiseValues()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCustomiseValues();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.EditUnit#isCustomiseValues <em>Customise Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customise Values</em>' attribute.
	 * @see #isCustomiseValues()
	 * @generated
	 */
	void setCustomiseValues(boolean value);

} // EditUnit

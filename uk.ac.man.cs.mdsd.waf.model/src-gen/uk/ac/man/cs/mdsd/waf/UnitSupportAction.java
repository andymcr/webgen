/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Support Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitSupportAction#isDisable <em>Disable</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitSupportAction#getConfirmMessage <em>Confirm Message</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitSupportAction()
 * @model
 * @generated
 */
public interface UnitSupportAction extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable</em>' attribute.
	 * @see #setDisable(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitSupportAction_Disable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDisable();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitSupportAction#isDisable <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable</em>' attribute.
	 * @see #isDisable()
	 * @generated
	 */
	void setDisable(boolean value);

	/**
	 * Returns the value of the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Message</em>' attribute.
	 * @see #setConfirmMessage(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitSupportAction_ConfirmMessage()
	 * @model unique="false"
	 * @generated
	 */
	String getConfirmMessage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitSupportAction#getConfirmMessage <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Message</em>' attribute.
	 * @see #getConfirmMessage()
	 * @generated
	 */
	void setConfirmMessage(String value);

} // UnitSupportAction

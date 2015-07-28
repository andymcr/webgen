/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Action Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.FixedActionMenuEntry#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFixedActionMenuEntry()
 * @model
 * @generated
 */
public interface FixedActionMenuEntry extends MenuEntry, NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(DynamicUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFixedActionMenuEntry_Action()
	 * @model required="true"
	 * @generated
	 */
	DynamicUnit getAction();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.FixedActionMenuEntry#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(DynamicUnit value);

} // FixedActionMenuEntry

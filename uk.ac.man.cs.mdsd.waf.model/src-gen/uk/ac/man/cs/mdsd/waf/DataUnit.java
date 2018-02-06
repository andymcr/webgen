/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DataUnit#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataUnit()
 * @model abstract="true"
 * @generated
 */
public interface DataUnit extends DynamicUnit {
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataUnit_Title()
	 * @model
	 * @generated
	 */
	Label getTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DataUnit#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Label value);

} // DataUnit

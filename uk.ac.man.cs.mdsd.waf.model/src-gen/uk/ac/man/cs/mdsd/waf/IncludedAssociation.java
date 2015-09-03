/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedAssociation#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedAssociation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IncludedAssociation extends IncludedFeature {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedAssociation_Association()
	 * @model required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedAssociation#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

} // IncludedAssociation

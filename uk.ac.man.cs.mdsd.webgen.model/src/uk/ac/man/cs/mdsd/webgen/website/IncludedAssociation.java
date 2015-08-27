/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedAssociation#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedAssociation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IncludedAssociation extends IncludedFeature {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EntityAssociation)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedAssociation_Feature()
	 * @model ordered="false"
	 * @generated
	 */
	EntityAssociation getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedAssociation#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EntityAssociation value);

} // IncludedAssociation

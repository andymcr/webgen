/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation#getOppositeService <em>Opposite Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceAssociation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServiceAssociation extends ServiceFeature {
	/**
	 * Returns the value of the '<em><b>Opposite Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Service</em>' reference.
	 * @see #setOppositeService(Service)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceAssociation_OppositeService()
	 * @model
	 * @generated
	 */
	Service getOppositeService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation#getOppositeService <em>Opposite Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite Service</em>' reference.
	 * @see #getOppositeService()
	 * @generated
	 */
	void setOppositeService(Service value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature_Required()
	 * @model ordered="false"
	 * @generated NOT
	 */
	boolean isRequired();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceAssociation_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

} // ServiceAssociation

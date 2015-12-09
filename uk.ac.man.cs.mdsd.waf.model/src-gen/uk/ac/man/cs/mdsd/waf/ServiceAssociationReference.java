/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Association Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAssociationReference#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAssociationReference#getChildFeature <em>Child Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAssociationReference()
 * @model
 * @generated
 */
public interface ServiceAssociationReference extends ServiceFeatureReference {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(ServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAssociationReference_Association()
	 * @model required="true"
	 * @generated
	 */
	ServiceAssociation getAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAssociationReference#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(ServiceAssociation value);

	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(ServiceFeatureReference)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAssociationReference_ChildFeature()
	 * @model containment="true"
	 * @generated
	 */
	ServiceFeatureReference getChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAssociationReference#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(ServiceFeatureReference value);

} // ServiceAssociationReference

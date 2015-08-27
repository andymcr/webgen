/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Label Association X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ModelLabelAssociationX#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ModelLabelAssociationX#getDynamicLabel <em>Dynamic Label</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getModelLabelAssociationX()
 * @model
 * @generated
 */
public interface ModelLabelAssociationX extends ModelLabelFeatureX {
	/**
	 * Returns the value of the '<em><b>Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Feature</em>' reference.
	 * @see #setServiceFeature(ServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getModelLabelAssociationX_ServiceFeature()
	 * @model required="true"
	 * @generated
	 */
	ServiceAssociation getServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ModelLabelAssociationX#getServiceFeature <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Feature</em>' reference.
	 * @see #getServiceFeature()
	 * @generated
	 */
	void setServiceFeature(ServiceAssociation value);

	/**
	 * Returns the value of the '<em><b>Dynamic Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Label</em>' reference.
	 * @see #setDynamicLabel(ModelLabelX)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getModelLabelAssociationX_DynamicLabel()
	 * @model
	 * @generated
	 */
	ModelLabelX getDynamicLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ModelLabelAssociationX#getDynamicLabel <em>Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Label</em>' reference.
	 * @see #getDynamicLabel()
	 * @generated
	 */
	void setDynamicLabel(ModelLabelX value);

} // ModelLabelAssociationX

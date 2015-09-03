/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Label Element X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ModelLabelElementX#getServiceFeature <em>Service Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getModelLabelElementX()
 * @model
 * @generated
 */
public interface ModelLabelElementX extends ModelLabelFeatureX {
	/**
	 * Returns the value of the '<em><b>Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Feature</em>' reference.
	 * @see #setServiceFeature(ServiceAttribute)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getModelLabelElementX_ServiceFeature()
	 * @model required="true"
	 * @generated
	 */
	ServiceAttribute getServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ModelLabelElementX#getServiceFeature <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Feature</em>' reference.
	 * @see #getServiceFeature()
	 * @generated
	 */
	void setServiceFeature(ServiceAttribute value);

} // ModelLabelElementX

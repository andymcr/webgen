/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Child Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitChildElement#getServiceFeature <em>Service Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitChildElement()
 * @model
 * @generated
 */
public interface UnitChildElement extends UnitChildFeature {
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitChildElement_ServiceFeature()
	 * @model ordered="false"
	 * @generated
	 */
	ServiceAttribute getServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitChildElement#getServiceFeature <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Feature</em>' reference.
	 * @see #getServiceFeature()
	 * @generated
	 */
	void setServiceFeature(ServiceAttribute value);

} // UnitChildElement

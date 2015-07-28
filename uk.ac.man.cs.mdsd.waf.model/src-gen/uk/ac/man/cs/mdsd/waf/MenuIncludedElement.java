/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Included Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.MenuIncludedElement#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getMenuIncludedElement()
 * @model
 * @generated
 */
public interface MenuIncludedElement extends MenuIncludedFeature {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(ServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getMenuIncludedElement_Feature()
	 * @model required="true"
	 * @generated
	 */
	ServiceEntityElement getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.MenuIncludedElement#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(ServiceEntityElement value);

} // MenuIncludedElement

/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Included Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MenuIncludedElement#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MenuIncludedElement#getServiceElement <em>Service Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMenuIncludedElement()
 * @model
 * @generated
 */
public interface MenuIncludedElement extends MenuIncludedFeature {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMenuIncludedElement_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if serviceElement.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tserviceElement.name\r\nendif\r\n'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Service Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Element</em>' reference.
	 * @see #setServiceElement(ServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMenuIncludedElement_ServiceElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceEntityElement getServiceElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.MenuIncludedElement#getServiceElement <em>Service Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Element</em>' reference.
	 * @see #getServiceElement()
	 * @generated
	 */
	void setServiceElement(ServiceEntityElement value);

} // MenuIncludedElement

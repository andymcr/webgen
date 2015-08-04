/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Included Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MenuIncludedAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MenuIncludedAssociation#getServiceAssociation <em>Service Association</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMenuIncludedAssociation()
 * @model
 * @generated
 */
public interface MenuIncludedAssociation extends MenuIncludedFeature {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMenuIncludedAssociation_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if serviceAssociation.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tserviceAssociation.name\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Service Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Association</em>' reference.
	 * @see #setServiceAssociation(ServiceEntityAssociation)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMenuIncludedAssociation_ServiceAssociation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceEntityAssociation getServiceAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.MenuIncludedAssociation#getServiceAssociation <em>Service Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Association</em>' reference.
	 * @see #getServiceAssociation()
	 * @generated
	 */
	void setServiceAssociation(ServiceEntityAssociation value);

} // MenuIncludedAssociation

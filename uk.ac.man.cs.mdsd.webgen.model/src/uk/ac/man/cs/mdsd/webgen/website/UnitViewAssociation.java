/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit View Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitViewAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitViewAssociation#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitViewAssociation#getServiceViewAssociation <em>Service View Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitViewAssociation()
 * @model
 * @generated
 */
public interface UnitViewAssociation extends UnitField {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitViewAssociation_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if serviceViewAssociation.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tserviceViewAssociation.name\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Label</em>' attribute.
	 * @see #setDisplayLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitViewAssociation_DisplayLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitViewAssociation#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

	/**
	 * Returns the value of the '<em><b>Service View Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service View Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service View Association</em>' reference.
	 * @see #setServiceViewAssociation(ServiceViewAssociation)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitViewAssociation_ServiceViewAssociation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceViewAssociation getServiceViewAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitViewAssociation#getServiceViewAssociation <em>Service View Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service View Association</em>' reference.
	 * @see #getServiceViewAssociation()
	 * @generated
	 */
	void setServiceViewAssociation(ServiceViewAssociation value);

} // UnitViewAssociation

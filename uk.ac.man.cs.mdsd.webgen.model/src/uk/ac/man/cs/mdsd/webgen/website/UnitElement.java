/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitElement#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitElement#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitElement#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitElement#getValidationPattern <em>Validation Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='serviceFeatureMustBeConsistent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL serviceFeatureMustBeConsistent='not feature.oclIsUndefined() and not serviceFeature.oclIsUndefined()\r\nimplies feature = serviceFeature.feature'"
 * @generated
 */
public interface UnitElement extends UnitFeature, IncludedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitElement_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if serviceFeature.oclIsUndefined() then\r\n\tif feature.oclIsUndefined() then\r\n\t\t\'\'\r\n\telse\r\n\t\tfeature.name\r\n\tendif\r\nelse\r\n\tif serviceFeature.alias.oclIsUndefined() then\r\n\t\tserviceFeature.name\r\n\telse\r\n\t\tserviceFeature.alias\r\n\tendif\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Feature</em>' reference.
	 * @see #setServiceFeature(ServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitElement_ServiceFeature()
	 * @model ordered="false"
	 * @generated
	 */
	ServiceEntityElement getServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitElement#getServiceFeature <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Feature</em>' reference.
	 * @see #getServiceFeature()
	 * @generated
	 */
	void setServiceFeature(ServiceEntityElement value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitElement_Placeholder()
	 * @model ordered="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitElement#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Pattern</em>' attribute.
	 * @see #setValidationPattern(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitElement_ValidationPattern()
	 * @model ordered="false"
	 * @generated
	 */
	String getValidationPattern();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitElement#getValidationPattern <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Pattern</em>' attribute.
	 * @see #getValidationPattern()
	 * @generated
	 */
	void setValidationPattern(String value);

} // UnitElement

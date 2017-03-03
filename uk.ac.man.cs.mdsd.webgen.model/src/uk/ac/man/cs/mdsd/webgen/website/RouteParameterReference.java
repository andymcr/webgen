/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import uk.ac.man.cs.mdsd.webgen.expression.Variable;
import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.RouteParameterReference#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.RouteParameterReference#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getRouteParameterReference()
 * @model
 * @generated
 */
public interface RouteParameterReference extends Variable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getRouteParameterReference_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if parameter.oclIsUndefined() then\r\n\t\'\'\r\nelse if parameter.oclIsKindOf(EntityAttribute) then\r\n\tparameter.oclAsType(EntityAttribute).name\r\nelse\r\n\tparameter.oclAsType(EncapsulatedAttribute).name\r\nendif endif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Attribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getRouteParameterReference_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Attribute getParameter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.RouteParameterReference#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Attribute value);

} // RouteParameterReference

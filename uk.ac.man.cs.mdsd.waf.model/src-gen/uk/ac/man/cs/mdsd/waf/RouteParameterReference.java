/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.criteria.Path;

import uk.ac.man.cs.mdsd.orm.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.RouteParameterReference#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getRouteParameterReference()
 * @model
 * @generated
 */
public interface RouteParameterReference extends Path {
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getRouteParameterReference_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Attribute getParameter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.RouteParameterReference#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Attribute value);

} // RouteParameterReference

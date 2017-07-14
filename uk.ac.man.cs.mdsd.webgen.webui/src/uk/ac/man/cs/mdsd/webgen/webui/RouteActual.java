/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.webgen.expression.Expression;

import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Actual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.RouteActual#getActualFor <em>Actual For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.RouteActual#getRouteParameter <em>Route Parameter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.RouteActual#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getRouteActual()
 * @model
 * @generated
 */
public interface RouteActual extends EObject {
	/**
	 * Returns the value of the '<em><b>Actual For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getRouteActuals <em>Route Actuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual For</em>' container reference.
	 * @see #setActualFor(ContentUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getRouteActual_ActualFor()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getRouteActuals
	 * @model opposite="routeActuals" required="true" transient="false"
	 * @generated
	 */
	ContentUnit getActualFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.RouteActual#getActualFor <em>Actual For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual For</em>' container reference.
	 * @see #getActualFor()
	 * @generated
	 */
	void setActualFor(ContentUnit value);

	/**
	 * Returns the value of the '<em><b>Route Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Parameter</em>' reference.
	 * @see #setRouteParameter(Attribute)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getRouteActual_RouteParameter()
	 * @model required="true"
	 * @generated
	 */
	Attribute getRouteParameter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.RouteActual#getRouteParameter <em>Route Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Parameter</em>' reference.
	 * @see #getRouteParameter()
	 * @generated
	 */
	void setRouteParameter(Attribute value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getRouteActual_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.RouteActual#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // RouteActual

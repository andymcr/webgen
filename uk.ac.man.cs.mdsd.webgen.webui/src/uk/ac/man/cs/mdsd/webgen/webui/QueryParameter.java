/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.ecore.EObject;
import uk.ac.man.cs.mdsd.webgen.service.FilterParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.QueryParameter#getFormal <em>Formal</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.QueryParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getQueryParameter()
 * @model
 * @generated
 */
public interface QueryParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal</em>' reference.
	 * @see #setFormal(FilterParameter)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getQueryParameter_Formal()
	 * @model required="true"
	 * @generated
	 */
	FilterParameter getFormal();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.QueryParameter#getFormal <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' reference.
	 * @see #getFormal()
	 * @generated
	 */
	void setFormal(FilterParameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getQueryParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.QueryParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // QueryParameter

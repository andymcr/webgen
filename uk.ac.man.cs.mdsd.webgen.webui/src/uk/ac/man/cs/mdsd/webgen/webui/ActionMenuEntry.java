/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry#getDestination <em>Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getActionMenuEntry()
 * @model
 * @generated
 */
public interface ActionMenuEntry extends MenuEntry, NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(ContentUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getActionMenuEntry_Destination()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ContentUnit getDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(ContentUnit value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getActionMenuEntry_Query()
	 * @model containment="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

} // ActionMenuEntry

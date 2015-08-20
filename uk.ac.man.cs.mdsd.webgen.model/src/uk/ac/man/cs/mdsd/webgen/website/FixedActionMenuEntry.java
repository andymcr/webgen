/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Action Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FixedActionMenuEntry#getDestination <em>Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FixedActionMenuEntry#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFixedActionMenuEntry()
 * @model
 * @generated
 */
public interface FixedActionMenuEntry extends MenuEntry, NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(DynamicUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFixedActionMenuEntry_Destination()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DynamicUnit getDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FixedActionMenuEntry#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(DynamicUnit value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(QueryInstance)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFixedActionMenuEntry_Query()
	 * @model containment="true"
	 * @generated
	 */
	QueryInstance getQuery();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FixedActionMenuEntry#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(QueryInstance value);

} // FixedActionMenuEntry

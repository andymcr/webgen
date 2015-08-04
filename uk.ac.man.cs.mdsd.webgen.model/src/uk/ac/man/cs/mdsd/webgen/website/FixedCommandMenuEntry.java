/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Command Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FixedCommandMenuEntry#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFixedCommandMenuEntry()
 * @model
 * @generated
 */
public interface FixedCommandMenuEntry extends MenuEntry, NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Command)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFixedCommandMenuEntry_Destination()
	 * @model
	 * @generated
	 */
	Command getDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FixedCommandMenuEntry#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Command value);

} // FixedCommandMenuEntry

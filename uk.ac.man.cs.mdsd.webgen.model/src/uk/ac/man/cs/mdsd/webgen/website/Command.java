/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Command#getPartOf <em>Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCommand()
 * @model abstract="true"
 * @generated
 */
public interface Command extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.CommandUnit#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(CommandUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCommand_PartOf()
	 * @see uk.ac.man.cs.mdsd.webgen.website.CommandUnit#getCommands
	 * @model opposite="commands" required="true" transient="false"
	 * @generated
	 */
	CommandUnit getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Command#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(CommandUnit value);
} // Command

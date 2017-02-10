/**
 */
package uk.ac.man.cs.mdsd.webgen.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Display Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.core.NamedDisplayElement#getDisplayLabel <em>Display Label</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.core.WebGenCorePackage#getNamedDisplayElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedDisplayElement extends NamedElement {
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
	 * @see uk.ac.man.cs.mdsd.webgen.core.WebGenCorePackage#getNamedDisplayElement_DisplayLabel()
	 * @model
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.core.NamedDisplayElement#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

} // NamedDisplayElement

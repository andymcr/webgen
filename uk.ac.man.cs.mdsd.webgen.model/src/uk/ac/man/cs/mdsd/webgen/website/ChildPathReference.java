/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Path Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ChildPathReference#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getChildPathReference()
 * @model
 * @generated
 */
public interface ChildPathReference extends PathReferenceElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getChildReference <em>Child Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(PathReferenceElement)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getChildPathReference_Parent()
	 * @see uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getChildReference
	 * @model opposite="childReference" required="true" transient="false"
	 * @generated
	 */
	PathReferenceElement getParent();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ChildPathReference#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(PathReferenceElement value);

} // ChildPathReference

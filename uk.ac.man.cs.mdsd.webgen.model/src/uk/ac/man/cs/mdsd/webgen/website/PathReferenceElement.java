/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.criteria.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Reference Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getActual <em>Actual</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getChildReference <em>Child Reference</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathReferenceElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PathReferenceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference.
	 * @see #setActual(Path)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathReferenceElement_Actual()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Path getActual();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getActual <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' containment reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(Path value);

	/**
	 * Returns the value of the '<em><b>Child Reference</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.ChildPathReference#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Reference</em>' containment reference.
	 * @see #setChildReference(ChildPathReference)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathReferenceElement_ChildReference()
	 * @see uk.ac.man.cs.mdsd.webgen.website.ChildPathReference#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ChildPathReference getChildReference();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getChildReference <em>Child Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Reference</em>' containment reference.
	 * @see #getChildReference()
	 * @generated
	 */
	void setChildReference(ChildPathReference value);

} // PathReferenceElement

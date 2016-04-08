/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ChildFeature#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getChildFeature()
 * @model abstract="true"
 * @generated
 */
public interface ChildFeature extends EObject {

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.PathAssociationElement#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(PathAssociationElement)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getChildFeature_PartOf()
	 * @see uk.ac.man.cs.mdsd.webgen.website.PathAssociationElement#getChildFeature
	 * @model opposite="childFeature" transient="false"
	 * @generated
	 */
	PathAssociationElement getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ChildFeature#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(PathAssociationElement value);
} // ChildFeature
/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPath#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getChildPath()
 * @model abstract="true"
 * @generated
 */
public interface ChildPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.AssociationReference#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(AssociationReference)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getChildPath_PartOf()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AssociationReference#getChildFeature
	 * @model opposite="childFeature" transient="false"
	 * @generated
	 */
	AssociationReference getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPath#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(AssociationReference value);

} // ChildPath

/**
 */
package uk.ac.man.cs.mdsd.webgen.image;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.image.Image#getManipulations <em>Manipulations</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getImage()
 * @model
 * @generated
 */
public interface Image extends EObject {
	/**
	 * Returns the value of the '<em><b>Manipulations</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.image.ImageManipulation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manipulations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manipulations</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getImage_Manipulations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImageManipulation> getManipulations();

} // Image

/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.View#getEncapsulates <em>Encapsulates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.View#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getView()
 * @model
 * @generated
 */
public interface View extends EntityOrView {
	/**
	 * Returns the value of the '<em><b>Encapsulates</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getView_Encapsulates()
	 * @model
	 * @generated
	 */
	List<EntityOrView> getEncapsulates();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.ViewFeature}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.ViewFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getView_Features()
	 * @see uk.ac.man.cs.mdsd.webgen.website.ViewFeature#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	List<ViewFeature> getFeatures();

} // View

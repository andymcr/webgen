/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Or View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getServedBy <em>Served By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getDisplayLabels <em>Display Labels</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView()
 * @model abstract="true"
 * @generated
 */
public interface EntityOrView extends Classifier {
	/**
	 * Returns the value of the '<em><b>Served By</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Service}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Service#getEncapsulates <em>Encapsulates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Served By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Served By</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_ServedBy()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Service#getEncapsulates
	 * @model opposite="encapsulates"
	 * @generated
	 */
	List<Service> getServedBy();

	/**
	 * Returns the value of the '<em><b>Display Labels</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelY}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelY#getLabelFor <em>Label For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Labels</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_DisplayLabels()
	 * @see uk.ac.man.cs.mdsd.webgen.website.ModelLabelY#getLabelFor
	 * @model opposite="labelFor" containment="true"
	 * @generated
	 */
	List<ModelLabelY> getDisplayLabels();

} // EntityOrView

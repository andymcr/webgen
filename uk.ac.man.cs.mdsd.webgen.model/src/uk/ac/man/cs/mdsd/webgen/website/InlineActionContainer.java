/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Action Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.InlineActionContainer#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getInlineActionContainer()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atMostOneDeleteAction'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL atMostOneDeleteAction='actions->select(a | a.oclIsKindOf(DeleteAction))->size() < 2'"
 * @generated
 */
public interface InlineActionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.InlineAction}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getInlineActionContainer_Actions()
	 * @see uk.ac.man.cs.mdsd.webgen.website.InlineAction#getUsedBy
	 * @model opposite="usedBy" containment="true"
	 * @generated
	 */
	List<InlineAction> getActions();

} // InlineActionContainer

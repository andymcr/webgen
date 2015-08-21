/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectTarget.java,v 1.2 2010/03/25 23:53:54 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.SelectTarget#getSelectionFeatures <em>Selection Features</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelectTarget()
 * @model abstract="true"
 * @generated
 */
public interface SelectTarget extends EObject {

	/**
	 * Returns the value of the '<em><b>Selection Features</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Features</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelectTarget_SelectionFeatures()
	 * @model required="true"
	 * @generated
	 */
	List<Attribute> getSelectionFeatures();
} // SelectTarget

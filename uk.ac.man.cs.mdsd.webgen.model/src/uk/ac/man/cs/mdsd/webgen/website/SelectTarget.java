/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectTarget.java,v 1.2 2010/03/25 23:53:54 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.SelectTarget#getSelectionFeature <em>Selection Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelectTarget()
 * @model abstract="true"
 * @generated
 */
public interface SelectTarget extends EObject {

	/**
	 * Returns the value of the '<em><b>Selection Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Feature</em>' reference.
	 * @see #setSelectionFeature(Attribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelectTarget_SelectionFeature()
	 * @model required="true"
	 * @generated
	 */
	Attribute getSelectionFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.SelectTarget#getSelectionFeature <em>Selection Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Feature</em>' reference.
	 * @see #getSelectionFeature()
	 * @generated
	 */
	void setSelectionFeature(Attribute value);
} // SelectTarget

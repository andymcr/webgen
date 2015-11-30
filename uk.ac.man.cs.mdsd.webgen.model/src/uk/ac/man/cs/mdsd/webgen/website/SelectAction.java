/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectAction.java,v 1.5 2013/07/12 07:52:25 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.SelectAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelectAction()
 * @model
 * @generated
 */
public interface SelectAction extends InlineAction {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Selectable)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelectAction_Target()
	 * @model required="true"
	 * @generated
	 */
	Selectable getTarget();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.SelectAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Selectable value);

} // SelectAction

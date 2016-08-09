/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ActionMenuEntry#getAction <em>Action</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ActionMenuEntry#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getActionMenuEntry()
 * @model
 * @generated
 */
public interface ActionMenuEntry extends MenuEntry, NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(ContentUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getActionMenuEntry_Action()
	 * @model required="true"
	 * @generated
	 */
	ContentUnit getAction();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ActionMenuEntry#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ContentUnit value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getActionMenuEntry_Query()
	 * @model containment="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ActionMenuEntry#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

} // ActionMenuEntry

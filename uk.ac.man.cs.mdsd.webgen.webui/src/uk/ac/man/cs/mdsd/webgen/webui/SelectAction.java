/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.SelectAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSelectAction()
 * @model
 * @generated
 */
public interface SelectAction extends InlineAction {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SelectableUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSelectAction_Target()
	 * @model required="true"
	 * @generated
	 */
	SelectableUnit getTarget();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.SelectAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SelectableUnit value);

} // SelectAction

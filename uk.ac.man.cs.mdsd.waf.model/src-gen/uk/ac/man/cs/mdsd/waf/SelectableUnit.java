/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.orm.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.SelectableUnit#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.SelectableUnit#getSelectors <em>Selectors</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectableUnit()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SelectableUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Type</em>' reference.
	 * @see #setSelectionType(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectableUnit_SelectionType()
	 * @model
	 * @generated
	 */
	EntityOrView getSelectionType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.SelectableUnit#getSelectionType <em>Selection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Type</em>' reference.
	 * @see #getSelectionType()
	 * @generated
	 */
	void setSelectionType(EntityOrView value);

	/**
	 * Returns the value of the '<em><b>Selectors</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.SelectAction}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.SelectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectors</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectableUnit_Selectors()
	 * @see uk.ac.man.cs.mdsd.waf.SelectAction#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<SelectAction> getSelectors();

} // SelectableUnit

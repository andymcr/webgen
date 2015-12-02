/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Selectable#getTargettingActions <em>Targetting Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Selectable#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Selectable extends EObject {
	/**
	 * Returns the value of the '<em><b>Targetting Actions</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.SelectAction}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.SelectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetting Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetting Actions</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectable_TargettingActions()
	 * @see uk.ac.man.cs.mdsd.waf.SelectAction#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<SelectAction> getTargettingActions();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.ServiceAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectable_Parameters()
	 * @model required="true"
	 * @generated
	 */
	EList<ServiceAttribute> getParameters();

} // Selectable

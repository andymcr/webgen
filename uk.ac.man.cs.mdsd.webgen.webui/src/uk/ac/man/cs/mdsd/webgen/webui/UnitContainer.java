/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.UnitContainer#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUnitContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UnitContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUnitContainer_Units()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getDisplayedOn
	 * @model opposite="displayedOn" containment="true"
	 * @generated
	 */
	EList<ContentUnit> getUnits();

} // UnitContainer

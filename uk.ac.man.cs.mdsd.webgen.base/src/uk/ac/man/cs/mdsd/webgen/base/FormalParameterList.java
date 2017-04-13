/**
 */
package uk.ac.man.cs.mdsd.webgen.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameterList#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getFormalParameterList()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FormalParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getFormalFor <em>Formal For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.base.BasePackage#getFormalParameterList_Parameters()
	 * @see uk.ac.man.cs.mdsd.webgen.base.FormalParameter#getFormalFor
	 * @model opposite="formalFor" containment="true"
	 * @generated
	 */
	EList<FormalParameter> getParameters();

} // FormalParameterList

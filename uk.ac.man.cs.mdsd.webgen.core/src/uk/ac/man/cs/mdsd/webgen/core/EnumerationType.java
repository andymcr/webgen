/**
 */
package uk.ac.man.cs.mdsd.webgen.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.core.EnumerationType#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.core.WebGenCorePackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends DataType {
	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.core.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.core.WebGenCorePackage#getEnumerationType_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getEnumerations();

} // EnumerationType

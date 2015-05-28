/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnumerationType.java,v 1.1 2012/03/21 14:42:03 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.EnumerationType#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends DataType {
	/**
   * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.EnumerationLiteral}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerations</em>' containment reference list.
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getEnumerationType_Enumerations()
   * @model containment="true"
   * @generated
   */
	EList<EnumerationLiteral> getEnumerations();

} // EnumerationType

/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnumerationType.java,v 1.3 2013/04/23 10:31:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EnumerationType#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends DataType {
	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEnumerationType_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	List<EnumerationLiteral> getEnumerations();

} // EnumerationType

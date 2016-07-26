/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.criteria.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Actual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.KeyActual#getContainer <em>Container</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.KeyActual#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getKeyActual()
 * @model
 * @generated
 */
public interface KeyActual extends PathReferenceElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getKeyActuals <em>Key Actuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(DynamicUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getKeyActual_Container()
	 * @see uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getKeyActuals
	 * @model opposite="keyActuals" required="true" transient="false"
	 * @generated
	 */
	DynamicUnit getContainer();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.KeyActual#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(DynamicUnit value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Attribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getKeyActual_Key()
	 * @model
	 * @generated
	 */
	Attribute getKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.KeyActual#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Attribute value);

} // KeyActual

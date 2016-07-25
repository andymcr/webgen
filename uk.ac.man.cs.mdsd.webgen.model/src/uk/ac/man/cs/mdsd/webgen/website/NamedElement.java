/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamedElement.java,v 1.10 2014/01/13 10:01:18 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.NamedElement#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.NamedElement#getPluralisedName <em>Pluralised Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getNamedElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameNeedsAtLeastOneCharacter'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL nameNeedsAtLeastOneCharacter='not name.oclIsUndefined() implies name.size() > 0'"
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getNamedElement_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Name</em>' attribute.
	 * @see #setSingletonName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getNamedElement_SingletonName()
	 * @model
	 * @generated
	 */
	String getSingletonName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.NamedElement#getSingletonName <em>Singleton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Name</em>' attribute.
	 * @see #getSingletonName()
	 * @generated
	 */
	void setSingletonName(String value);

	/**
	 * Returns the value of the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pluralised Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pluralised Name</em>' attribute.
	 * @see #setPluralisedName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getNamedElement_PluralisedName()
	 * @model
	 * @generated
	 */
	String getPluralisedName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.NamedElement#getPluralisedName <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pluralised Name</em>' attribute.
	 * @see #getPluralisedName()
	 * @generated
	 */
	void setPluralisedName(String value);

} // NamedElement

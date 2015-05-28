/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamedDisplayElement.java,v 1.1 2010/04/15 21:40:46 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Display Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.NamedDisplayElement#getDisplayLabel <em>Display Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getNamedDisplayElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedDisplayElement extends NamedElement {
	/**
   * Returns the value of the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Display Label</em>' attribute.
   * @see #setDisplayLabel(String)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getNamedDisplayElement_DisplayLabel()
   * @model unique="false" required="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
   * @generated
   */
	String getDisplayLabel();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.NamedDisplayElement#getDisplayLabel <em>Display Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Label</em>' attribute.
   * @see #getDisplayLabel()
   * @generated
   */
	void setDisplayLabel(String value);

} // NamedDisplayElement

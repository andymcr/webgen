/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Included Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MenuIncludedFeature#getDisplayLabel <em>Display Label</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMenuIncludedFeature()
 * @model abstract="true"
 * @generated
 */
public interface MenuIncludedFeature extends MenuEntry {

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMenuIncludedFeature_DisplayLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.MenuIncludedFeature#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

} // MenuIncludedFeature

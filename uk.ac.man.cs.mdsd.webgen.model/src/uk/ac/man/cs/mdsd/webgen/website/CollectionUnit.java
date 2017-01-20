/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.CollectionUnit#getContentType <em>Content Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.CollectionUnit#getContainingFeature <em>Containing Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.CollectionUnit#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCollectionUnit()
 * @model abstract="true"
 * @generated
 */
public interface CollectionUnit extends SelectableUnit {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCollectionUnit_ContentType()
	 * @model required="true"
	 * @generated
	 */
	List<EntityOrView> getContentType();

	/**
	 * Returns the value of the '<em><b>Containing Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Feature</em>' reference.
	 * @see #setContainingFeature(Feature)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCollectionUnit_ContainingFeature()
	 * @model
	 * @generated
	 */
	Feature getContainingFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.CollectionUnit#getContainingFeature <em>Containing Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Feature</em>' reference.
	 * @see #getContainingFeature()
	 * @generated
	 */
	void setContainingFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCollectionUnit_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.CollectionUnit#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

} // CollectionUnit

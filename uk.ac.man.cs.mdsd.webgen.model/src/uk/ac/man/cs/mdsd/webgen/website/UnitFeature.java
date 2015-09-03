/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitFeature#getCollectionDisplayOption <em>Collection Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitFeature#getMaximumDisplaySize <em>Maximum Display Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitFeature#isAutofocus <em>Autofocus</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitFeature()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atMostOneSelectAction noDeleteActions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL atMostOneSelectAction='actions->select(a | a.oclIsKindOf(SelectAction))->size() < 2' noDeleteActions='actions->select(a | a.oclIsKindOf(DeleteAction))->isEmpty()'"
 * @generated
 */
public interface UnitFeature extends IncludedFeature, UnitField, InlineActionContainer {
	/**
	 * Returns the value of the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Only Display When Not Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Display When Not Empty</em>' attribute.
	 * @see #setOnlyDisplayWhenNotEmpty(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitFeature_OnlyDisplayWhenNotEmpty()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isOnlyDisplayWhenNotEmpty();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Display When Not Empty</em>' attribute.
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 */
	void setOnlyDisplayWhenNotEmpty(boolean value);

	/**
	 * Returns the value of the '<em><b>Collection Display Option</b></em>' attribute.
	 * The default value is <code>"LineDirection"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.CollectionDisplayOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Display Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.CollectionDisplayOptions
	 * @see #setCollectionDisplayOption(CollectionDisplayOptions)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitFeature_CollectionDisplayOption()
	 * @model default="LineDirection" ordered="false"
	 * @generated
	 */
	CollectionDisplayOptions getCollectionDisplayOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitFeature#getCollectionDisplayOption <em>Collection Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.CollectionDisplayOptions
	 * @see #getCollectionDisplayOption()
	 * @generated
	 */
	void setCollectionDisplayOption(CollectionDisplayOptions value);

	/**
	 * Returns the value of the '<em><b>Maximum Display Size</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Display Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Display Size</em>' attribute.
	 * @see #setMaximumDisplaySize(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitFeature_MaximumDisplaySize()
	 * @model default="-1" ordered="false"
	 * @generated
	 */
	int getMaximumDisplaySize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitFeature#getMaximumDisplaySize <em>Maximum Display Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Display Size</em>' attribute.
	 * @see #getMaximumDisplaySize()
	 * @generated
	 */
	void setMaximumDisplaySize(int value);

	/**
	 * Returns the value of the '<em><b>Autofocus</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autofocus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autofocus</em>' attribute.
	 * @see #setAutofocus(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitFeature_Autofocus()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isAutofocus();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitFeature#isAutofocus <em>Autofocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autofocus</em>' attribute.
	 * @see #isAutofocus()
	 * @generated
	 */
	void setAutofocus(boolean value);

} // UnitFeature

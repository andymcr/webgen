/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getCollectionDisplayOption <em>Collection Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#isCollectionAllowAdd <em>Collection Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#isCollectionAllowRemove <em>Collection Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getMaximumDisplaySize <em>Maximum Display Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getDateFormat <em>Date Format</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitField()
 * @model abstract="true"
 * @generated
 */
public interface UnitField extends EObject {
	/**
	 * Returns the value of the '<em><b>Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getDisplayFields <em>Display Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayed On</em>' container reference.
	 * @see #setDisplayedOn(DynamicUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitField_DisplayedOn()
	 * @see uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getDisplayFields
	 * @model opposite="displayFields" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DynamicUnit getDisplayedOn();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getDisplayedOn <em>Displayed On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayed On</em>' container reference.
	 * @see #getDisplayedOn()
	 * @generated
	 */
	void setDisplayedOn(DynamicUnit value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitField_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitField_CollectionDisplayOption()
	 * @model default="LineDirection" ordered="false"
	 * @generated
	 */
	CollectionDisplayOptions getCollectionDisplayOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getCollectionDisplayOption <em>Collection Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.CollectionDisplayOptions
	 * @see #getCollectionDisplayOption()
	 * @generated
	 */
	void setCollectionDisplayOption(CollectionDisplayOptions value);

	/**
	 * Returns the value of the '<em><b>Collection Allow Add</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Allow Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Allow Add</em>' attribute.
	 * @see #setCollectionAllowAdd(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitField_CollectionAllowAdd()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollectionAllowAdd();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#isCollectionAllowAdd <em>Collection Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Allow Add</em>' attribute.
	 * @see #isCollectionAllowAdd()
	 * @generated
	 */
	void setCollectionAllowAdd(boolean value);

	/**
	 * Returns the value of the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Allow Remove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Allow Remove</em>' attribute.
	 * @see #setCollectionAllowRemove(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitField_CollectionAllowRemove()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollectionAllowRemove();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#isCollectionAllowRemove <em>Collection Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Allow Remove</em>' attribute.
	 * @see #isCollectionAllowRemove()
	 * @generated
	 */
	void setCollectionAllowRemove(boolean value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitField_MaximumDisplaySize()
	 * @model default="-1" ordered="false"
	 * @generated
	 */
	int getMaximumDisplaySize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getMaximumDisplaySize <em>Maximum Display Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Display Size</em>' attribute.
	 * @see #getMaximumDisplaySize()
	 * @generated
	 */
	void setMaximumDisplaySize(int value);

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see #setDateFormat(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitField_DateFormat()
	 * @model ordered="false"
	 * @generated
	 */
	String getDateFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(String value);

} // UnitField

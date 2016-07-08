/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContentUnit.java,v 1.23 2013/07/12 07:52:25 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#isHomeUnit <em>Home Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#getCaptionClass <em>Caption Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getContentUnit()
 * @model abstract="true"
 * @generated
 */
public interface ContentUnit extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.UnitContainer#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayed On</em>' container reference.
	 * @see #setDisplayedOn(UnitContainer)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getContentUnit_DisplayedOn()
	 * @see uk.ac.man.cs.mdsd.webgen.website.UnitContainer#getUnits
	 * @model opposite="units" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UnitContainer getDisplayedOn();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#getDisplayedOn <em>Displayed On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayed On</em>' container reference.
	 * @see #getDisplayedOn()
	 * @generated
	 */
	void setDisplayedOn(UnitContainer value);

	/**
	 * Returns the value of the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Summary</em>' attribute.
	 * @see #setPurposeSummary(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getContentUnit_PurposeSummary()
	 * @model
	 * @generated
	 */
	String getPurposeSummary();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose Summary</em>' attribute.
	 * @see #getPurposeSummary()
	 * @generated
	 */
	void setPurposeSummary(String value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getContentUnit_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Home Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Unit</em>' attribute.
	 * @see #setHomeUnit(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getContentUnit_HomeUnit()
	 * @model
	 * @generated
	 */
	boolean isHomeUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#isHomeUnit <em>Home Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Unit</em>' attribute.
	 * @see #isHomeUnit()
	 * @generated
	 */
	void setHomeUnit(boolean value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' attribute.
	 * @see #setAlternative(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getContentUnit_Alternative()
	 * @model
	 * @generated
	 */
	String getAlternative();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#getAlternative <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' attribute.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(String value);

	/**
	 * Returns the value of the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Caption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Caption</em>' attribute.
	 * @see #setOmitCaption(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getContentUnit_OmitCaption()
	 * @model
	 * @generated
	 */
	boolean isOmitCaption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#isOmitCaption <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Caption</em>' attribute.
	 * @see #isOmitCaption()
	 * @generated
	 */
	void setOmitCaption(boolean value);

	/**
	 * Returns the value of the '<em><b>Caption Class</b></em>' attribute.
	 * The default value is <code>"unit_caption"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Class</em>' attribute.
	 * @see #setCaptionClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getContentUnit_CaptionClass()
	 * @model default="unit_caption"
	 * @generated
	 */
	String getCaptionClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ContentUnit#getCaptionClass <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Class</em>' attribute.
	 * @see #getCaptionClass()
	 * @generated
	 */
	void setCaptionClass(String value);

} // ContentUnit

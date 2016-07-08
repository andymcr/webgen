/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#isHomeUnit <em>Home Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getContentClass <em>Content Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit()
 * @model abstract="true"
 * @generated
 */
public interface ContentUnit extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.UnitContainer#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayed On</em>' container reference.
	 * @see #setDisplayedOn(UnitContainer)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_DisplayedOn()
	 * @see uk.ac.man.cs.mdsd.waf.UnitContainer#getUnits
	 * @model opposite="units" required="true" transient="false"
	 * @generated
	 */
	UnitContainer getDisplayedOn();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getDisplayedOn <em>Displayed On</em>}' container reference.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_PurposeSummary()
	 * @model unique="false"
	 * @generated
	 */
	String getPurposeSummary();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_UriElement()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Home Unit</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Unit</em>' attribute.
	 * @see #setHomeUnit(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_HomeUnit()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isHomeUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#isHomeUnit <em>Home Unit</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_Alternative()
	 * @model unique="false"
	 * @generated
	 */
	String getAlternative();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getAlternative <em>Alternative</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_OmitCaption()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOmitCaption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#isOmitCaption <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Caption</em>' attribute.
	 * @see #isOmitCaption()
	 * @generated
	 */
	void setOmitCaption(boolean value);

	/**
	 * Returns the value of the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Class</em>' attribute.
	 * @see #setCaptionClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_CaptionClass()
	 * @model unique="false"
	 * @generated
	 */
	String getCaptionClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getCaptionClass <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Class</em>' attribute.
	 * @see #getCaptionClass()
	 * @generated
	 */
	void setCaptionClass(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_StyleClass()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_ContentClass()
	 * @model unique="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

} // ContentUnit

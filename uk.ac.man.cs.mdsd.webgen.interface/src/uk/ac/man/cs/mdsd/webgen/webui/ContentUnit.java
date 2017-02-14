/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.core.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#isCreateDefaultUriElement <em>Create Default Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getCaptionClass <em>Caption Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getContentUnit()
 * @model abstract="true"
 * @generated
 */
public interface ContentUnit extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitContainer#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayed On</em>' container reference.
	 * @see #setDisplayedOn(UnitContainer)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getContentUnit_DisplayedOn()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitContainer#getUnits
	 * @model opposite="units" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UnitContainer getDisplayedOn();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getDisplayedOn <em>Displayed On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayed On</em>' container reference.
	 * @see #getDisplayedOn()
	 * @generated
	 */
	void setDisplayedOn(UnitContainer value);

	/**
	 * Returns the value of the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Default Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Default Uri Element</em>' attribute.
	 * @see #setCreateDefaultUriElement(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getContentUnit_CreateDefaultUriElement()
	 * @model default="true"
	 * @generated
	 */
	boolean isCreateDefaultUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#isCreateDefaultUriElement <em>Create Default Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Default Uri Element</em>' attribute.
	 * @see #isCreateDefaultUriElement()
	 * @generated
	 */
	void setCreateDefaultUriElement(boolean value);

	/**
	 * Returns the value of the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Role</em>' attribute.
	 * @see #setRequiresRole(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getContentUnit_RequiresRole()
	 * @model
	 * @generated
	 */
	String getRequiresRole();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getRequiresRole <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Role</em>' attribute.
	 * @see #getRequiresRole()
	 * @generated
	 */
	void setRequiresRole(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getContentUnit_PurposeSummary()
	 * @model
	 * @generated
	 */
	String getPurposeSummary();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getContentUnit_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getContentUnit_Alternative()
	 * @model
	 * @generated
	 */
	String getAlternative();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getAlternative <em>Alternative</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getContentUnit_OmitCaption()
	 * @model
	 * @generated
	 */
	boolean isOmitCaption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#isOmitCaption <em>Omit Caption</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage#getContentUnit_CaptionClass()
	 * @model default="unit_caption"
	 * @generated
	 */
	String getCaptionClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getCaptionClass <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Class</em>' attribute.
	 * @see #getCaptionClass()
	 * @generated
	 */
	void setCaptionClass(String value);

} // ContentUnit

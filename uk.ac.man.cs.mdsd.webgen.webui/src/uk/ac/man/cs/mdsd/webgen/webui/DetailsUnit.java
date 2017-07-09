/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Details Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#getContentClass <em>Content Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDetailsUnit()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selectionValidChoice selectionMustBeSingleton'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL selectionMustBeSingleton='not defaultSelection.oclIsUndefined() implies\r\n\tdefaultSelection.limit = 1' selectionValidChoice='not defaultSelection.oclIsUndefined() implies\r\n\tpageDisplayedOn.webUI.services.services\r\n\t\t->select(s : service::Service | contentType = s.serves)\r\n\t\t->collect(s : service::Service | s.selections)\r\n\t\t->includes(defaultSelection)'"
 * @generated
 */
public interface DetailsUnit extends DataUnit, SingletonUnit, SelectableUnit {
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDetailsUnit_OnlyDisplayWhenNotEmpty()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isOnlyDisplayWhenNotEmpty();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Display When Not Empty</em>' attribute.
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 */
	void setOnlyDisplayWhenNotEmpty(boolean value);

	/**
	 * Returns the value of the '<em><b>Omit Field Labels</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Field Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #setOmitFieldLabels(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDetailsUnit_OmitFieldLabels()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isOmitFieldLabels();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #isOmitFieldLabels()
	 * @generated
	 */
	void setOmitFieldLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,details_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDetailsUnit_StyleClass()
	 * @model default="unit,details_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>"details_content"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDetailsUnit_ContentClass()
	 * @model default="details_content" ordered="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

} // DetailsUnit

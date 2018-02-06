/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getDisplayOption <em>Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getRowClasses <em>Row Classes</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getIndexUnit()
 * @model
 * @generated
 */
public interface IndexUnit extends DataUnit, CollectionUnit, InlineActionContainer {
	/**
	 * Returns the value of the '<em><b>Display Option</b></em>' attribute.
	 * The default value is <code>"Grid"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.webui.IndexDisplayOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexDisplayOption
	 * @see #setDisplayOption(IndexDisplayOption)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getIndexUnit_DisplayOption()
	 * @model default="Grid" ordered="false"
	 * @generated
	 */
	IndexDisplayOption getDisplayOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getDisplayOption <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexDisplayOption
	 * @see #getDisplayOption()
	 * @generated
	 */
	void setDisplayOption(IndexDisplayOption value);

	/**
	 * Returns the value of the '<em><b>Omit Column Labels</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Column Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Column Labels</em>' attribute.
	 * @see #setOmitColumnLabels(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getIndexUnit_OmitColumnLabels()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isOmitColumnLabels();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Column Labels</em>' attribute.
	 * @see #isOmitColumnLabels()
	 * @generated
	 */
	void setOmitColumnLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,index_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getIndexUnit_StyleClass()
	 * @model default="unit,index_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>"striped,responsive-table"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getIndexUnit_ContentClass()
	 * @model default="striped,responsive-table" ordered="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

	/**
	 * Returns the value of the '<em><b>Row Classes</b></em>' attribute.
	 * The default value is <code>"odd_row,even_row"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Classes</em>' attribute.
	 * @see #setRowClasses(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getIndexUnit_RowClasses()
	 * @model default="odd_row,even_row" ordered="false"
	 * @generated
	 */
	String getRowClasses();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getRowClasses <em>Row Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Classes</em>' attribute.
	 * @see #getRowClasses()
	 * @generated
	 */
	void setRowClasses(String value);

} // IndexUnit

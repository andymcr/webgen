/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.persistence.Label;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Index Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#isOverlayTitle <em>Overlay Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getColumnClass <em>Column Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getSizeClass <em>Size Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageIndexUnit()
 * @model
 * @generated
 */
public interface ImageIndexUnit extends ImageUnit, InlineActionContainer {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' reference.
	 * @see #setTitle(Label)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageIndexUnit_Title()
	 * @model ordered="false"
	 * @generated
	 */
	Label getTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Label value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageIndexUnit_OmitFieldLabels()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isOmitFieldLabels();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#isOmitFieldLabels <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #isOmitFieldLabels()
	 * @generated
	 */
	void setOmitFieldLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Overlay Title</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay Title</em>' attribute.
	 * @see #setOverlayTitle(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageIndexUnit_OverlayTitle()
	 * @model default="false"
	 * @generated
	 */
	boolean isOverlayTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#isOverlayTitle <em>Overlay Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay Title</em>' attribute.
	 * @see #isOverlayTitle()
	 * @generated
	 */
	void setOverlayTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,image_index_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageIndexUnit_StyleClass()
	 * @model default="unit,image_index_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>"row"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageIndexUnit_ContentClass()
	 * @model default="row" ordered="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

	/**
	 * Returns the value of the '<em><b>Column Class</b></em>' attribute.
	 * The default value is <code>"col s12 m6 l3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Class</em>' attribute.
	 * @see #setColumnClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageIndexUnit_ColumnClass()
	 * @model default="col s12 m6 l3" ordered="false"
	 * @generated
	 */
	String getColumnClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getColumnClass <em>Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Class</em>' attribute.
	 * @see #getColumnClass()
	 * @generated
	 */
	void setColumnClass(String value);

	/**
	 * Returns the value of the '<em><b>Size Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Class</em>' attribute.
	 * @see #setSizeClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageIndexUnit_SizeClass()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getSizeClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getSizeClass <em>Size Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Class</em>' attribute.
	 * @see #getSizeClass()
	 * @generated
	 */
	void setSizeClass(String value);

} // ImageIndexUnit

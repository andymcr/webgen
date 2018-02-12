/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Index Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isEnableImageEnlargement <em>Enable Image Enlargement</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isOverlayTitle <em>Overlay Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isRevealUntruncatedContent <em>Reveal Untruncated Content</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getColumnClass <em>Column Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getCardClass <em>Card Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit()
 * @model
 * @generated
 */
public interface ImageIndexUnit extends ImageUnit, InlineActionContainer {
	/**
	 * Returns the value of the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Field Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #setOmitFieldLabels(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_OmitFieldLabels()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOmitFieldLabels();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isOmitFieldLabels <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #isOmitFieldLabels()
	 * @generated
	 */
	void setOmitFieldLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Image Enlargement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Image Enlargement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Image Enlargement</em>' attribute.
	 * @see #setEnableImageEnlargement(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_EnableImageEnlargement()
	 * @model unique="false"
	 * @generated
	 */
	boolean isEnableImageEnlargement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isEnableImageEnlargement <em>Enable Image Enlargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Image Enlargement</em>' attribute.
	 * @see #isEnableImageEnlargement()
	 * @generated
	 */
	void setEnableImageEnlargement(boolean value);

	/**
	 * Returns the value of the '<em><b>Overlay Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay Title</em>' attribute.
	 * @see #setOverlayTitle(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_OverlayTitle()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOverlayTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isOverlayTitle <em>Overlay Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay Title</em>' attribute.
	 * @see #isOverlayTitle()
	 * @generated
	 */
	void setOverlayTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Overlay Single Select Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay Single Select Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay Single Select Action</em>' attribute.
	 * @see #setOverlaySingleSelectAction(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_OverlaySingleSelectAction()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOverlaySingleSelectAction();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay Single Select Action</em>' attribute.
	 * @see #isOverlaySingleSelectAction()
	 * @generated
	 */
	void setOverlaySingleSelectAction(boolean value);

	/**
	 * Returns the value of the '<em><b>Reveal Untruncated Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reveal Untruncated Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reveal Untruncated Content</em>' attribute.
	 * @see #setRevealUntruncatedContent(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_RevealUntruncatedContent()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRevealUntruncatedContent();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isRevealUntruncatedContent <em>Reveal Untruncated Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reveal Untruncated Content</em>' attribute.
	 * @see #isRevealUntruncatedContent()
	 * @generated
	 */
	void setRevealUntruncatedContent(boolean value);

	/**
	 * Returns the value of the '<em><b>Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Class</em>' attribute.
	 * @see #setColumnClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_ColumnClass()
	 * @model unique="false"
	 * @generated
	 */
	String getColumnClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getColumnClass <em>Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Class</em>' attribute.
	 * @see #getColumnClass()
	 * @generated
	 */
	void setColumnClass(String value);

	/**
	 * Returns the value of the '<em><b>Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Class</em>' attribute.
	 * @see #setCardClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_CardClass()
	 * @model unique="false"
	 * @generated
	 */
	String getCardClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getCardClass <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Class</em>' attribute.
	 * @see #getCardClass()
	 * @generated
	 */
	void setCardClass(String value);

} // ImageIndexUnit

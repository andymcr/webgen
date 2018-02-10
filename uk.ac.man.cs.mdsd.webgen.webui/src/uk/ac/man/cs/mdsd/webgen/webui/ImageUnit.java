/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.image.ImageManipulation;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImagePathFeature <em>Image Path Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImageTitleFeature <em>Image Title Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#isTruncateImageTitle <em>Truncate Image Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getMissingImagePath <em>Missing Image Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImageFilter <em>Image Filter</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit()
 * @model abstract="true"
 * @generated
 */
public interface ImageUnit extends DynamicUnit, CollectionUnit {
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit_Title()
	 * @model ordered="false"
	 * @generated
	 */
	Label getTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Label value);

	/**
	 * Returns the value of the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Path Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path Feature</em>' containment reference.
	 * @see #setImagePathFeature(FeaturePath)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit_ImagePathFeature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeaturePath getImagePathFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImagePathFeature <em>Image Path Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path Feature</em>' containment reference.
	 * @see #getImagePathFeature()
	 * @generated
	 */
	void setImagePathFeature(FeaturePath value);

	/**
	 * Returns the value of the '<em><b>Image Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Title Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Title Feature</em>' containment reference.
	 * @see #setImageTitleFeature(FeaturePath)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit_ImageTitleFeature()
	 * @model containment="true"
	 * @generated
	 */
	FeaturePath getImageTitleFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImageTitleFeature <em>Image Title Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Title Feature</em>' containment reference.
	 * @see #getImageTitleFeature()
	 * @generated
	 */
	void setImageTitleFeature(FeaturePath value);

	/**
	 * Returns the value of the '<em><b>Truncate Image Title</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Truncate Image Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Truncate Image Title</em>' attribute.
	 * @see #setTruncateImageTitle(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit_TruncateImageTitle()
	 * @model default="false"
	 * @generated
	 */
	boolean isTruncateImageTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#isTruncateImageTitle <em>Truncate Image Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truncate Image Title</em>' attribute.
	 * @see #isTruncateImageTitle()
	 * @generated
	 */
	void setTruncateImageTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing Image Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Image Path</em>' attribute.
	 * @see #setMissingImagePath(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit_MissingImagePath()
	 * @model
	 * @generated
	 */
	String getMissingImagePath();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getMissingImagePath <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Image Path</em>' attribute.
	 * @see #getMissingImagePath()
	 * @generated
	 */
	void setMissingImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Filter</em>' reference.
	 * @see #setImageFilter(ImageManipulation)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit_ImageFilter()
	 * @model
	 * @generated
	 */
	ImageManipulation getImageFilter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImageFilter <em>Image Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Filter</em>' reference.
	 * @see #getImageFilter()
	 * @generated
	 */
	void setImageFilter(ImageManipulation value);

} // ImageUnit

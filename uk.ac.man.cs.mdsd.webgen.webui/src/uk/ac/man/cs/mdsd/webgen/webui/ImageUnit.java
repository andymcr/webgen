/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.image.ImageManipulation;
import uk.ac.man.cs.mdsd.webgen.service.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImagePathFeature <em>Image Path Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getTitleFeature <em>Title Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getMissingImagePath <em>Missing Image Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImageFilter <em>Image Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getShowTime <em>Show Time</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getTransitionTime <em>Transition Time</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit()
 * @model abstract="true"
 * @generated
 */
public interface ImageUnit extends DynamicUnit, CollectionUnit {
	/**
	 * Returns the value of the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Selection</em>' reference.
	 * @see #setDefaultSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit_DefaultSelection()
	 * @model
	 * @generated
	 */
	Selection getDefaultSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getDefaultSelection <em>Default Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Selection</em>' reference.
	 * @see #getDefaultSelection()
	 * @generated
	 */
	void setDefaultSelection(Selection value);

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
	 * Returns the value of the '<em><b>Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Feature</em>' containment reference.
	 * @see #setTitleFeature(FeaturePath)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit_TitleFeature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeaturePath getTitleFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getTitleFeature <em>Title Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Feature</em>' containment reference.
	 * @see #getTitleFeature()
	 * @generated
	 */
	void setTitleFeature(FeaturePath value);

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
	 * @model required="true"
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

	/**
	 * Returns the value of the '<em><b>Show Time</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Time</em>' attribute.
	 * @see #setShowTime(int)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit_ShowTime()
	 * @model default="-1"
	 * @generated
	 */
	int getShowTime();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getShowTime <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Time</em>' attribute.
	 * @see #getShowTime()
	 * @generated
	 */
	void setShowTime(int value);

	/**
	 * Returns the value of the '<em><b>Transition Time</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Time</em>' attribute.
	 * @see #setTransitionTime(int)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getImageUnit_TransitionTime()
	 * @model default="-1"
	 * @generated
	 */
	int getTransitionTime();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getTransitionTime <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Time</em>' attribute.
	 * @see #getTransitionTime()
	 * @generated
	 */
	void setTransitionTime(int value);

} // ImageUnit

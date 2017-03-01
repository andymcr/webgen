/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;
import uk.ac.man.cs.mdsd.webgen.base.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Manipulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageManipulation#getJpegQuality <em>Jpeg Quality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageManipulation#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageManipulation()
 * @model
 * @generated
 */
public interface ImageManipulation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Jpeg Quality</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jpeg Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jpeg Quality</em>' attribute.
	 * @see #setJpegQuality(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageManipulation_JpegQuality()
	 * @model default="-1"
	 * @generated
	 */
	int getJpegQuality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageManipulation#getJpegQuality <em>Jpeg Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jpeg Quality</em>' attribute.
	 * @see #getJpegQuality()
	 * @generated
	 */
	void setJpegQuality(int value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.ImageFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageManipulation_Filters()
	 * @model containment="true"
	 * @generated
	 */
	List<ImageFilter> getFilters();

} // ImageManipulation

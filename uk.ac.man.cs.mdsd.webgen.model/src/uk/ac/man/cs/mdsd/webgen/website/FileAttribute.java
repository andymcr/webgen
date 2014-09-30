/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FileAttribute#getMaximumUploadSize <em>Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FileAttribute#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FileAttribute#getValidUploadExtensions <em>Valid Upload Extensions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FileAttribute#isUploadsWithinWebsite <em>Uploads Within Website</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FileAttribute#getRelativeUploadDirectory <em>Relative Upload Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFileAttribute()
 * @model
 * @generated
 */
public interface FileAttribute extends Attribute {

	/**
	 * Returns the value of the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Upload Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Upload Size</em>' attribute.
	 * @see #setMaximumUploadSize(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFileAttribute_MaximumUploadSize()
	 * @model default="-1" ordered="false"
	 * @generated
	 */
	int getMaximumUploadSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FileAttribute#getMaximumUploadSize <em>Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Upload Size</em>' attribute.
	 * @see #getMaximumUploadSize()
	 * @generated
	 */
	void setMaximumUploadSize(int value);

	/**
	 * Returns the value of the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Upload Mime Types</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Upload Mime Types</em>' attribute list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFileAttribute_ValidUploadMimeTypes()
	 * @model ordered="false"
	 * @generated
	 */
	List<String> getValidUploadMimeTypes();

	/**
	 * Returns the value of the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Upload Extensions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Upload Extensions</em>' attribute list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFileAttribute_ValidUploadExtensions()
	 * @model ordered="false"
	 * @generated
	 */
	List<String> getValidUploadExtensions();

	/**
	 * Returns the value of the '<em><b>Uploads Within Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uploads Within Website</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uploads Within Website</em>' attribute.
	 * @see #setUploadsWithinWebsite(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFileAttribute_UploadsWithinWebsite()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isUploadsWithinWebsite();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FileAttribute#isUploadsWithinWebsite <em>Uploads Within Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uploads Within Website</em>' attribute.
	 * @see #isUploadsWithinWebsite()
	 * @generated
	 */
	void setUploadsWithinWebsite(boolean value);

	/**
	 * Returns the value of the '<em><b>Relative Upload Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Upload Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Upload Directory</em>' attribute.
	 * @see #setRelativeUploadDirectory(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFileAttribute_RelativeUploadDirectory()
	 * @model ordered="false"
	 * @generated
	 */
	String getRelativeUploadDirectory();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FileAttribute#getRelativeUploadDirectory <em>Relative Upload Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Upload Directory</em>' attribute.
	 * @see #getRelativeUploadDirectory()
	 * @generated
	 */
	void setRelativeUploadDirectory(String value);
} // FileAttribute

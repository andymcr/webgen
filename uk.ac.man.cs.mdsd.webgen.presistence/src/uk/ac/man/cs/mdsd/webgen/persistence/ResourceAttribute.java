/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getMaximumUploadSize <em>Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getValidUploadExtensions <em>Valid Upload Extensions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#isUploadsWithinWebsite <em>Uploads Within Website</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getUploadPath <em>Upload Path</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getResourceAttribute()
 * @model abstract="true"
 * @generated
 */
public interface ResourceAttribute extends EntityAttribute {
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getResourceAttribute_MaximumUploadSize()
	 * @model default="-1" ordered="false"
	 * @generated
	 */
	int getMaximumUploadSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#getMaximumUploadSize <em>Maximum Upload Size</em>}' attribute.
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
	 * If the meaning of the '<em>Valid Upload Mime Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Upload Mime Types</em>' attribute list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getResourceAttribute_ValidUploadMimeTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getValidUploadMimeTypes();

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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getResourceAttribute_ValidUploadExtensions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getValidUploadExtensions();

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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getResourceAttribute_UploadsWithinWebsite()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isUploadsWithinWebsite();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.ResourceAttribute#isUploadsWithinWebsite <em>Uploads Within Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uploads Within Website</em>' attribute.
	 * @see #isUploadsWithinWebsite()
	 * @generated
	 */
	void setUploadsWithinWebsite(boolean value);

	/**
	 * Returns the value of the '<em><b>Upload Path</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.PathElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upload Path</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload Path</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getResourceAttribute_UploadPath()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathElement> getUploadPath();

} // ResourceAttribute

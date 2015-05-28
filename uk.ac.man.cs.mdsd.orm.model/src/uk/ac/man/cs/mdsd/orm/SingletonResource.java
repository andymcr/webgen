/**
 */
package uk.ac.man.cs.mdsd.orm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonResource#getMaximumUploadSize <em>Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonResource#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonResource#getValidUploadExtensions <em>Valid Upload Extensions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonResource#isUploadsWithinWebsite <em>Uploads Within Website</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonResource#getRelativeUploadDirectory <em>Relative Upload Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonResource()
 * @model abstract="true"
 * @generated
 */
public interface SingletonResource extends SingletonAttribute {
	/**
   * Returns the value of the '<em><b>Maximum Upload Size</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Upload Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Maximum Upload Size</em>' attribute.
   * @see #setMaximumUploadSize(int)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonResource_MaximumUploadSize()
   * @model unique="false"
   * @generated
   */
	int getMaximumUploadSize();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonResource#getMaximumUploadSize <em>Maximum Upload Size</em>}' attribute.
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
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonResource_ValidUploadMimeTypes()
   * @model
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
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonResource_ValidUploadExtensions()
   * @model
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
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonResource_UploadsWithinWebsite()
   * @model unique="false"
   * @generated
   */
	boolean isUploadsWithinWebsite();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonResource#isUploadsWithinWebsite <em>Uploads Within Website</em>}' attribute.
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
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonResource_RelativeUploadDirectory()
   * @model unique="false"
   * @generated
   */
	String getRelativeUploadDirectory();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonResource#getRelativeUploadDirectory <em>Relative Upload Directory</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relative Upload Directory</em>' attribute.
   * @see #getRelativeUploadDirectory()
   * @generated
   */
	void setRelativeUploadDirectory(String value);

} // SingletonResource

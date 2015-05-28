/**
 */
package uk.ac.man.cs.mdsd.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import uk.ac.man.cs.mdsd.orm.OrmPackage;
import uk.ac.man.cs.mdsd.orm.SingletonResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Singleton Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.SingletonResourceImpl#getMaximumUploadSize <em>Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.SingletonResourceImpl#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.SingletonResourceImpl#getValidUploadExtensions <em>Valid Upload Extensions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.SingletonResourceImpl#isUploadsWithinWebsite <em>Uploads Within Website</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.SingletonResourceImpl#getRelativeUploadDirectory <em>Relative Upload Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SingletonResourceImpl extends SingletonAttributeImpl implements SingletonResource {
	/**
   * The default value of the '{@link #getMaximumUploadSize() <em>Maximum Upload Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaximumUploadSize()
   * @generated
   * @ordered
   */
	protected static final int MAXIMUM_UPLOAD_SIZE_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getMaximumUploadSize() <em>Maximum Upload Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaximumUploadSize()
   * @generated
   * @ordered
   */
	protected int maximumUploadSize = MAXIMUM_UPLOAD_SIZE_EDEFAULT;

	/**
   * The cached value of the '{@link #getValidUploadMimeTypes() <em>Valid Upload Mime Types</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValidUploadMimeTypes()
   * @generated
   * @ordered
   */
	protected EList<String> validUploadMimeTypes;

	/**
   * The cached value of the '{@link #getValidUploadExtensions() <em>Valid Upload Extensions</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValidUploadExtensions()
   * @generated
   * @ordered
   */
	protected EList<String> validUploadExtensions;

	/**
   * The default value of the '{@link #isUploadsWithinWebsite() <em>Uploads Within Website</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isUploadsWithinWebsite()
   * @generated
   * @ordered
   */
	protected static final boolean UPLOADS_WITHIN_WEBSITE_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isUploadsWithinWebsite() <em>Uploads Within Website</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isUploadsWithinWebsite()
   * @generated
   * @ordered
   */
	protected boolean uploadsWithinWebsite = UPLOADS_WITHIN_WEBSITE_EDEFAULT;

	/**
   * The default value of the '{@link #getRelativeUploadDirectory() <em>Relative Upload Directory</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRelativeUploadDirectory()
   * @generated
   * @ordered
   */
	protected static final String RELATIVE_UPLOAD_DIRECTORY_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRelativeUploadDirectory() <em>Relative Upload Directory</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRelativeUploadDirectory()
   * @generated
   * @ordered
   */
	protected String relativeUploadDirectory = RELATIVE_UPLOAD_DIRECTORY_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SingletonResourceImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.Literals.SINGLETON_RESOURCE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getMaximumUploadSize() {
    return maximumUploadSize;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMaximumUploadSize(int newMaximumUploadSize) {
    int oldMaximumUploadSize = maximumUploadSize;
    maximumUploadSize = newMaximumUploadSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE, oldMaximumUploadSize, maximumUploadSize));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getValidUploadMimeTypes() {
    if (validUploadMimeTypes == null)
    {
      validUploadMimeTypes = new EDataTypeUniqueEList<String>(String.class, this, OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES);
    }
    return validUploadMimeTypes;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getValidUploadExtensions() {
    if (validUploadExtensions == null)
    {
      validUploadExtensions = new EDataTypeUniqueEList<String>(String.class, this, OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS);
    }
    return validUploadExtensions;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isUploadsWithinWebsite() {
    return uploadsWithinWebsite;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUploadsWithinWebsite(boolean newUploadsWithinWebsite) {
    boolean oldUploadsWithinWebsite = uploadsWithinWebsite;
    uploadsWithinWebsite = newUploadsWithinWebsite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE, oldUploadsWithinWebsite, uploadsWithinWebsite));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getRelativeUploadDirectory() {
    return relativeUploadDirectory;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRelativeUploadDirectory(String newRelativeUploadDirectory) {
    String oldRelativeUploadDirectory = relativeUploadDirectory;
    relativeUploadDirectory = newRelativeUploadDirectory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.SINGLETON_RESOURCE__RELATIVE_UPLOAD_DIRECTORY, oldRelativeUploadDirectory, relativeUploadDirectory));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case OrmPackage.SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE:
        return getMaximumUploadSize();
      case OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES:
        return getValidUploadMimeTypes();
      case OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS:
        return getValidUploadExtensions();
      case OrmPackage.SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE:
        return isUploadsWithinWebsite();
      case OrmPackage.SINGLETON_RESOURCE__RELATIVE_UPLOAD_DIRECTORY:
        return getRelativeUploadDirectory();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case OrmPackage.SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE:
        setMaximumUploadSize((Integer)newValue);
        return;
      case OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES:
        getValidUploadMimeTypes().clear();
        getValidUploadMimeTypes().addAll((Collection<? extends String>)newValue);
        return;
      case OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS:
        getValidUploadExtensions().clear();
        getValidUploadExtensions().addAll((Collection<? extends String>)newValue);
        return;
      case OrmPackage.SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE:
        setUploadsWithinWebsite((Boolean)newValue);
        return;
      case OrmPackage.SINGLETON_RESOURCE__RELATIVE_UPLOAD_DIRECTORY:
        setRelativeUploadDirectory((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case OrmPackage.SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE:
        setMaximumUploadSize(MAXIMUM_UPLOAD_SIZE_EDEFAULT);
        return;
      case OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES:
        getValidUploadMimeTypes().clear();
        return;
      case OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS:
        getValidUploadExtensions().clear();
        return;
      case OrmPackage.SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE:
        setUploadsWithinWebsite(UPLOADS_WITHIN_WEBSITE_EDEFAULT);
        return;
      case OrmPackage.SINGLETON_RESOURCE__RELATIVE_UPLOAD_DIRECTORY:
        setRelativeUploadDirectory(RELATIVE_UPLOAD_DIRECTORY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case OrmPackage.SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE:
        return maximumUploadSize != MAXIMUM_UPLOAD_SIZE_EDEFAULT;
      case OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES:
        return validUploadMimeTypes != null && !validUploadMimeTypes.isEmpty();
      case OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS:
        return validUploadExtensions != null && !validUploadExtensions.isEmpty();
      case OrmPackage.SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE:
        return uploadsWithinWebsite != UPLOADS_WITHIN_WEBSITE_EDEFAULT;
      case OrmPackage.SINGLETON_RESOURCE__RELATIVE_UPLOAD_DIRECTORY:
        return RELATIVE_UPLOAD_DIRECTORY_EDEFAULT == null ? relativeUploadDirectory != null : !RELATIVE_UPLOAD_DIRECTORY_EDEFAULT.equals(relativeUploadDirectory);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (maximumUploadSize: ");
    result.append(maximumUploadSize);
    result.append(", validUploadMimeTypes: ");
    result.append(validUploadMimeTypes);
    result.append(", validUploadExtensions: ");
    result.append(validUploadExtensions);
    result.append(", uploadsWithinWebsite: ");
    result.append(uploadsWithinWebsite);
    result.append(", relativeUploadDirectory: ");
    result.append(relativeUploadDirectory);
    result.append(')');
    return result.toString();
  }

} //SingletonResourceImpl

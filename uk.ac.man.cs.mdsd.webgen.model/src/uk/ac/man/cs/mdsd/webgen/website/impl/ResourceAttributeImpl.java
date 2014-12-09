/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import uk.ac.man.cs.mdsd.webgen.website.ResourceAttribute;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ResourceAttributeImpl#getMaximumUploadSize <em>Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ResourceAttributeImpl#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ResourceAttributeImpl#getValidUploadExtensions <em>Valid Upload Extensions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ResourceAttributeImpl#isUploadsWithinWebsite <em>Uploads Within Website</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ResourceAttributeImpl#getRelativeUploadDirectory <em>Relative Upload Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceAttributeImpl extends AttributeImpl implements ResourceAttribute {
	/**
	 * The default value of the '{@link #getMaximumUploadSize() <em>Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_UPLOAD_SIZE_EDEFAULT = -1;

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
	protected ResourceAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.RESOURCE_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE, oldMaximumUploadSize, maximumUploadSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getValidUploadMimeTypes() {
		if (validUploadMimeTypes == null) {
			validUploadMimeTypes = new EDataTypeUniqueEList<String>(String.class, this, WebsitePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES);
		}
		return validUploadMimeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getValidUploadExtensions() {
		if (validUploadExtensions == null) {
			validUploadExtensions = new EDataTypeUniqueEList<String>(String.class, this, WebsitePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE, oldUploadsWithinWebsite, uploadsWithinWebsite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.RESOURCE_ATTRIBUTE__RELATIVE_UPLOAD_DIRECTORY, oldRelativeUploadDirectory, relativeUploadDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE:
				return getMaximumUploadSize();
			case WebsitePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES:
				return getValidUploadMimeTypes();
			case WebsitePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS:
				return getValidUploadExtensions();
			case WebsitePackage.RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE:
				return isUploadsWithinWebsite();
			case WebsitePackage.RESOURCE_ATTRIBUTE__RELATIVE_UPLOAD_DIRECTORY:
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
		switch (featureID) {
			case WebsitePackage.RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE:
				setMaximumUploadSize((Integer)newValue);
				return;
			case WebsitePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES:
				getValidUploadMimeTypes().clear();
				getValidUploadMimeTypes().addAll((Collection<? extends String>)newValue);
				return;
			case WebsitePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS:
				getValidUploadExtensions().clear();
				getValidUploadExtensions().addAll((Collection<? extends String>)newValue);
				return;
			case WebsitePackage.RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE:
				setUploadsWithinWebsite((Boolean)newValue);
				return;
			case WebsitePackage.RESOURCE_ATTRIBUTE__RELATIVE_UPLOAD_DIRECTORY:
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
		switch (featureID) {
			case WebsitePackage.RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE:
				setMaximumUploadSize(MAXIMUM_UPLOAD_SIZE_EDEFAULT);
				return;
			case WebsitePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES:
				getValidUploadMimeTypes().clear();
				return;
			case WebsitePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS:
				getValidUploadExtensions().clear();
				return;
			case WebsitePackage.RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE:
				setUploadsWithinWebsite(UPLOADS_WITHIN_WEBSITE_EDEFAULT);
				return;
			case WebsitePackage.RESOURCE_ATTRIBUTE__RELATIVE_UPLOAD_DIRECTORY:
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
		switch (featureID) {
			case WebsitePackage.RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE:
				return maximumUploadSize != MAXIMUM_UPLOAD_SIZE_EDEFAULT;
			case WebsitePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES:
				return validUploadMimeTypes != null && !validUploadMimeTypes.isEmpty();
			case WebsitePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS:
				return validUploadExtensions != null && !validUploadExtensions.isEmpty();
			case WebsitePackage.RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE:
				return uploadsWithinWebsite != UPLOADS_WITHIN_WEBSITE_EDEFAULT;
			case WebsitePackage.RESOURCE_ATTRIBUTE__RELATIVE_UPLOAD_DIRECTORY:
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

} //ResourceAttributeImpl

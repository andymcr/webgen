/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Sitemap Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateSitemapUnitImpl#getDeployedURL <em>Deployed URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateSitemapUnitImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateSitemapUnitImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateSitemapUnitImpl#getContentClass <em>Content Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateSitemapUnitImpl extends ContentUnitImpl implements CreateSitemapUnit {
	/**
	 * The default value of the '{@link #getDeployedURL() <em>Deployed URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedURL()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYED_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployedURL() <em>Deployed URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedURL()
	 * @generated
	 * @ordered
	 */
	protected String deployedURL = DEPLOYED_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = "sitemap.xml";

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,create_sitemap_unit,framed";

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_CLASS_EDEFAULT = "create_sitemap_content";

	/**
	 * The cached value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected String contentClass = CONTENT_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateSitemapUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CREATE_SITEMAP_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeployedURL() {
		return deployedURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployedURL(String newDeployedURL) {
		String oldDeployedURL = deployedURL;
		deployedURL = newDeployedURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL, oldDeployedURL, deployedURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_SITEMAP_UNIT__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_SITEMAP_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentClass() {
		return contentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentClass(String newContentClass) {
		String oldContentClass = contentClass;
		contentClass = newContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_SITEMAP_UNIT__CONTENT_CLASS, oldContentClass, contentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				return getDeployedURL();
			case WebuiPackage.CREATE_SITEMAP_UNIT__FILENAME:
				return getFilename();
			case WebuiPackage.CREATE_SITEMAP_UNIT__STYLE_CLASS:
				return getStyleClass();
			case WebuiPackage.CREATE_SITEMAP_UNIT__CONTENT_CLASS:
				return getContentClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebuiPackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				setDeployedURL((String)newValue);
				return;
			case WebuiPackage.CREATE_SITEMAP_UNIT__FILENAME:
				setFilename((String)newValue);
				return;
			case WebuiPackage.CREATE_SITEMAP_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
				return;
			case WebuiPackage.CREATE_SITEMAP_UNIT__CONTENT_CLASS:
				setContentClass((String)newValue);
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
			case WebuiPackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				setDeployedURL(DEPLOYED_URL_EDEFAULT);
				return;
			case WebuiPackage.CREATE_SITEMAP_UNIT__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case WebuiPackage.CREATE_SITEMAP_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CREATE_SITEMAP_UNIT__CONTENT_CLASS:
				setContentClass(CONTENT_CLASS_EDEFAULT);
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
			case WebuiPackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				return DEPLOYED_URL_EDEFAULT == null ? deployedURL != null : !DEPLOYED_URL_EDEFAULT.equals(deployedURL);
			case WebuiPackage.CREATE_SITEMAP_UNIT__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case WebuiPackage.CREATE_SITEMAP_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
			case WebuiPackage.CREATE_SITEMAP_UNIT__CONTENT_CLASS:
				return CONTENT_CLASS_EDEFAULT == null ? contentClass != null : !CONTENT_CLASS_EDEFAULT.equals(contentClass);
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
		result.append(" (deployedURL: ");
		result.append(deployedURL);
		result.append(", filename: ");
		result.append(filename);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(", contentClass: ");
		result.append(contentClass);
		result.append(')');
		return result.toString();
	}

} //CreateSitemapUnitImpl

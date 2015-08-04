/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Sitemap Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CreateSitemapUnitImpl#getDeployedURL <em>Deployed URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CreateSitemapUnitImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CreateSitemapUnitImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CreateSitemapUnitImpl#getLayoutClass <em>Layout Class</em>}</li>
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
	 * The default value of the '{@link #getLayoutClass() <em>Layout Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_CLASS_EDEFAULT = "create_sitemap_content";

	/**
	 * The cached value of the '{@link #getLayoutClass() <em>Layout Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutClass()
	 * @generated
	 * @ordered
	 */
	protected String layoutClass = LAYOUT_CLASS_EDEFAULT;

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
		return WebsitePackage.Literals.CREATE_SITEMAP_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL, oldDeployedURL, deployedURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CREATE_SITEMAP_UNIT__FILENAME, oldFilename, filename));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CREATE_SITEMAP_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayoutClass() {
		return layoutClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutClass(String newLayoutClass) {
		String oldLayoutClass = layoutClass;
		layoutClass = newLayoutClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CREATE_SITEMAP_UNIT__LAYOUT_CLASS, oldLayoutClass, layoutClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				return getDeployedURL();
			case WebsitePackage.CREATE_SITEMAP_UNIT__FILENAME:
				return getFilename();
			case WebsitePackage.CREATE_SITEMAP_UNIT__STYLE_CLASS:
				return getStyleClass();
			case WebsitePackage.CREATE_SITEMAP_UNIT__LAYOUT_CLASS:
				return getLayoutClass();
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
			case WebsitePackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				setDeployedURL((String)newValue);
				return;
			case WebsitePackage.CREATE_SITEMAP_UNIT__FILENAME:
				setFilename((String)newValue);
				return;
			case WebsitePackage.CREATE_SITEMAP_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
				return;
			case WebsitePackage.CREATE_SITEMAP_UNIT__LAYOUT_CLASS:
				setLayoutClass((String)newValue);
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
			case WebsitePackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				setDeployedURL(DEPLOYED_URL_EDEFAULT);
				return;
			case WebsitePackage.CREATE_SITEMAP_UNIT__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case WebsitePackage.CREATE_SITEMAP_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
				return;
			case WebsitePackage.CREATE_SITEMAP_UNIT__LAYOUT_CLASS:
				setLayoutClass(LAYOUT_CLASS_EDEFAULT);
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
			case WebsitePackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				return DEPLOYED_URL_EDEFAULT == null ? deployedURL != null : !DEPLOYED_URL_EDEFAULT.equals(deployedURL);
			case WebsitePackage.CREATE_SITEMAP_UNIT__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case WebsitePackage.CREATE_SITEMAP_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
			case WebsitePackage.CREATE_SITEMAP_UNIT__LAYOUT_CLASS:
				return LAYOUT_CLASS_EDEFAULT == null ? layoutClass != null : !LAYOUT_CLASS_EDEFAULT.equals(layoutClass);
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
		result.append(", layoutClass: ");
		result.append(layoutClass);
		result.append(')');
		return result.toString();
	}

} //CreateSitemapUnitImpl

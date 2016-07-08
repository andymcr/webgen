/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import uk.ac.man.cs.mdsd.webgen.website.View;
import uk.ac.man.cs.mdsd.webgen.website.ViewFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewFeatureImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewFeatureImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewFeatureImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewFeatureImpl#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewFeatureImpl#isSerializationExpose <em>Serialization Expose</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewFeatureImpl#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewFeatureImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewFeatureImpl extends EObjectImpl implements ViewFeature {
	/**
	 * The default value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String headerClass = HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected String displayClass = DISPLAY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String footerClass = FOOTER_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSerializationGroups() <em>Serialization Groups</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serializationGroups;

	/**
	 * The default value of the '{@link #isSerializationExpose() <em>Serialization Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializationExpose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERIALIZATION_EXPOSE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSerializationExpose() <em>Serialization Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializationExpose()
	 * @generated
	 * @ordered
	 */
	protected boolean serializationExpose = SERIALIZATION_EXPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEncodeUriKey() <em>Encode Uri Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncodeUriKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCODE_URI_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncodeUriKey() <em>Encode Uri Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncodeUriKey()
	 * @generated
	 * @ordered
	 */
	protected boolean encodeUriKey = ENCODE_URI_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.VIEW_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderClass() {
		return headerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderClass(String newHeaderClass) {
		String oldHeaderClass = headerClass;
		headerClass = newHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_FEATURE__HEADER_CLASS, oldHeaderClass, headerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayClass() {
		return displayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayClass(String newDisplayClass) {
		String oldDisplayClass = displayClass;
		displayClass = newDisplayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_FEATURE__DISPLAY_CLASS, oldDisplayClass, displayClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooterClass() {
		return footerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterClass(String newFooterClass) {
		String oldFooterClass = footerClass;
		footerClass = newFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_FEATURE__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSerializationGroups() {
		if (serializationGroups == null) {
			serializationGroups = new EDataTypeUniqueEList<String>(String.class, this, WebsitePackage.VIEW_FEATURE__SERIALIZATION_GROUPS);
		}
		return serializationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSerializationExpose() {
		return serializationExpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializationExpose(boolean newSerializationExpose) {
		boolean oldSerializationExpose = serializationExpose;
		serializationExpose = newSerializationExpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_FEATURE__SERIALIZATION_EXPOSE, oldSerializationExpose, serializationExpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEncodeUriKey() {
		return encodeUriKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodeUriKey(boolean newEncodeUriKey) {
		boolean oldEncodeUriKey = encodeUriKey;
		encodeUriKey = newEncodeUriKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_FEATURE__ENCODE_URI_KEY, oldEncodeUriKey, encodeUriKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getPartOf() {
		if (eContainerFeatureID() != WebsitePackage.VIEW_FEATURE__PART_OF) return null;
		return (View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(View newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WebsitePackage.VIEW_FEATURE__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(View newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.VIEW_FEATURE__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, WebsitePackage.VIEW__VIEW_FEATURES, View.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_FEATURE__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.VIEW_FEATURE__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((View)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.VIEW_FEATURE__PART_OF:
				return basicSetPartOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebsitePackage.VIEW_FEATURE__PART_OF:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.VIEW__VIEW_FEATURES, View.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.VIEW_FEATURE__HEADER_CLASS:
				return getHeaderClass();
			case WebsitePackage.VIEW_FEATURE__DISPLAY_CLASS:
				return getDisplayClass();
			case WebsitePackage.VIEW_FEATURE__FOOTER_CLASS:
				return getFooterClass();
			case WebsitePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				return getSerializationGroups();
			case WebsitePackage.VIEW_FEATURE__SERIALIZATION_EXPOSE:
				return isSerializationExpose();
			case WebsitePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				return isEncodeUriKey();
			case WebsitePackage.VIEW_FEATURE__PART_OF:
				return getPartOf();
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
			case WebsitePackage.VIEW_FEATURE__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebsitePackage.VIEW_FEATURE__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case WebsitePackage.VIEW_FEATURE__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebsitePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				getSerializationGroups().addAll((Collection<? extends String>)newValue);
				return;
			case WebsitePackage.VIEW_FEATURE__SERIALIZATION_EXPOSE:
				setSerializationExpose((Boolean)newValue);
				return;
			case WebsitePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey((Boolean)newValue);
				return;
			case WebsitePackage.VIEW_FEATURE__PART_OF:
				setPartOf((View)newValue);
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
			case WebsitePackage.VIEW_FEATURE__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_FEATURE__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_FEATURE__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				return;
			case WebsitePackage.VIEW_FEATURE__SERIALIZATION_EXPOSE:
				setSerializationExpose(SERIALIZATION_EXPOSE_EDEFAULT);
				return;
			case WebsitePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey(ENCODE_URI_KEY_EDEFAULT);
				return;
			case WebsitePackage.VIEW_FEATURE__PART_OF:
				setPartOf((View)null);
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
			case WebsitePackage.VIEW_FEATURE__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebsitePackage.VIEW_FEATURE__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case WebsitePackage.VIEW_FEATURE__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebsitePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				return serializationGroups != null && !serializationGroups.isEmpty();
			case WebsitePackage.VIEW_FEATURE__SERIALIZATION_EXPOSE:
				return serializationExpose != SERIALIZATION_EXPOSE_EDEFAULT;
			case WebsitePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				return encodeUriKey != ENCODE_URI_KEY_EDEFAULT;
			case WebsitePackage.VIEW_FEATURE__PART_OF:
				return getPartOf() != null;
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
		result.append(" (headerClass: ");
		result.append(headerClass);
		result.append(", displayClass: ");
		result.append(displayClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(", serializationGroups: ");
		result.append(serializationGroups);
		result.append(", serializationExpose: ");
		result.append(serializationExpose);
		result.append(", encodeUriKey: ");
		result.append(encodeUriKey);
		result.append(')');
		return result.toString();
	}

} //ViewFeatureImpl

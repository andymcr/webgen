/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.criteria.Expression;

import uk.ac.man.cs.mdsd.orm.Cardinality;

import uk.ac.man.cs.mdsd.orm.impl.NamedDisplayElementImpl;

import uk.ac.man.cs.mdsd.waf.Service;
import uk.ac.man.cs.mdsd.waf.ServiceFeature;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceFeatureImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceFeatureImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceFeatureImpl#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceFeatureImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceFeatureImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceFeatureImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceFeatureImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceFeatureImpl#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceFeatureImpl extends NamedDisplayElementImpl implements ServiceFeature {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.OPTIONAL;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForcedValue() <em>Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForcedValue()
	 * @generated
	 * @ordered
	 */
	protected Expression forcedValue;

	/**
	 * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected String footer = FOOTER_EDEFAULT;

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
	 * The default value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected String inputClass = INPUT_CLASS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.SERVICE_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getPartOf() {
		if (eContainerFeatureID() != WafPackage.SERVICE_FEATURE__PART_OF) return null;
		return (Service)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetPartOf() {
		if (eContainerFeatureID() != WafPackage.SERVICE_FEATURE__PART_OF) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Service newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WafPackage.SERVICE_FEATURE__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Service newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WafPackage.SERVICE_FEATURE__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, WafPackage.SERVICE__FEATURES, Service.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE_FEATURE__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE_FEATURE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getForcedValue() {
		return forcedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForcedValue(Expression newForcedValue, NotificationChain msgs) {
		Expression oldForcedValue = forcedValue;
		forcedValue = newForcedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE_FEATURE__FORCED_VALUE, oldForcedValue, newForcedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForcedValue(Expression newForcedValue) {
		if (newForcedValue != forcedValue) {
			NotificationChain msgs = null;
			if (forcedValue != null)
				msgs = ((InternalEObject)forcedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.SERVICE_FEATURE__FORCED_VALUE, null, msgs);
			if (newForcedValue != null)
				msgs = ((InternalEObject)newForcedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WafPackage.SERVICE_FEATURE__FORCED_VALUE, null, msgs);
			msgs = basicSetForcedValue(newForcedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE_FEATURE__FORCED_VALUE, newForcedValue, newForcedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(String newFooter) {
		String oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE_FEATURE__FOOTER, oldFooter, footer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE_FEATURE__HEADER_CLASS, oldHeaderClass, headerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputClass() {
		return inputClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputClass(String newInputClass) {
		String oldInputClass = inputClass;
		inputClass = newInputClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE_FEATURE__INPUT_CLASS, oldInputClass, inputClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE_FEATURE__DISPLAY_CLASS, oldDisplayClass, displayClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE_FEATURE__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.SERVICE_FEATURE__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((Service)otherEnd, msgs);
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
			case WafPackage.SERVICE_FEATURE__PART_OF:
				return basicSetPartOf(null, msgs);
			case WafPackage.SERVICE_FEATURE__FORCED_VALUE:
				return basicSetForcedValue(null, msgs);
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
			case WafPackage.SERVICE_FEATURE__PART_OF:
				return eInternalContainer().eInverseRemove(this, WafPackage.SERVICE__FEATURES, Service.class, msgs);
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
			case WafPackage.SERVICE_FEATURE__PART_OF:
				if (resolve) return getPartOf();
				return basicGetPartOf();
			case WafPackage.SERVICE_FEATURE__CARDINALITY:
				return getCardinality();
			case WafPackage.SERVICE_FEATURE__FORCED_VALUE:
				return getForcedValue();
			case WafPackage.SERVICE_FEATURE__FOOTER:
				return getFooter();
			case WafPackage.SERVICE_FEATURE__HEADER_CLASS:
				return getHeaderClass();
			case WafPackage.SERVICE_FEATURE__INPUT_CLASS:
				return getInputClass();
			case WafPackage.SERVICE_FEATURE__DISPLAY_CLASS:
				return getDisplayClass();
			case WafPackage.SERVICE_FEATURE__FOOTER_CLASS:
				return getFooterClass();
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
			case WafPackage.SERVICE_FEATURE__PART_OF:
				setPartOf((Service)newValue);
				return;
			case WafPackage.SERVICE_FEATURE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case WafPackage.SERVICE_FEATURE__FORCED_VALUE:
				setForcedValue((Expression)newValue);
				return;
			case WafPackage.SERVICE_FEATURE__FOOTER:
				setFooter((String)newValue);
				return;
			case WafPackage.SERVICE_FEATURE__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WafPackage.SERVICE_FEATURE__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case WafPackage.SERVICE_FEATURE__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case WafPackage.SERVICE_FEATURE__FOOTER_CLASS:
				setFooterClass((String)newValue);
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
			case WafPackage.SERVICE_FEATURE__PART_OF:
				setPartOf((Service)null);
				return;
			case WafPackage.SERVICE_FEATURE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case WafPackage.SERVICE_FEATURE__FORCED_VALUE:
				setForcedValue((Expression)null);
				return;
			case WafPackage.SERVICE_FEATURE__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WafPackage.SERVICE_FEATURE__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WafPackage.SERVICE_FEATURE__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case WafPackage.SERVICE_FEATURE__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case WafPackage.SERVICE_FEATURE__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
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
			case WafPackage.SERVICE_FEATURE__PART_OF:
				return basicGetPartOf() != null;
			case WafPackage.SERVICE_FEATURE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case WafPackage.SERVICE_FEATURE__FORCED_VALUE:
				return forcedValue != null;
			case WafPackage.SERVICE_FEATURE__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WafPackage.SERVICE_FEATURE__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WafPackage.SERVICE_FEATURE__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case WafPackage.SERVICE_FEATURE__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case WafPackage.SERVICE_FEATURE__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", footer: ");
		result.append(footer);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(", displayClass: ");
		result.append(displayClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(')');
		return result.toString();
	}

} //ServiceFeatureImpl

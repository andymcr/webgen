/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.criteria.Path;

import uk.ac.man.cs.mdsd.orm.Feature;

import uk.ac.man.cs.mdsd.waf.ChildPathReference;
import uk.ac.man.cs.mdsd.waf.DynamicUnit;
import uk.ac.man.cs.mdsd.waf.KeyActual;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Actual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.KeyActualImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.KeyActualImpl#getChildReference <em>Child Reference</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.KeyActualImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.KeyActualImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyActualImpl extends MinimalEObjectImpl.Container implements KeyActual {
	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected Path actual;

	/**
	 * The cached value of the '{@link #getChildReference() <em>Child Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildReference()
	 * @generated
	 * @ordered
	 */
	protected ChildPathReference childReference;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Feature key;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyActualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.KEY_ACTUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path getActual() {
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActual(Path newActual, NotificationChain msgs) {
		Path oldActual = actual;
		actual = newActual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.KEY_ACTUAL__ACTUAL, oldActual, newActual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActual(Path newActual) {
		if (newActual != actual) {
			NotificationChain msgs = null;
			if (actual != null)
				msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.KEY_ACTUAL__ACTUAL, null, msgs);
			if (newActual != null)
				msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WafPackage.KEY_ACTUAL__ACTUAL, null, msgs);
			msgs = basicSetActual(newActual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.KEY_ACTUAL__ACTUAL, newActual, newActual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildPathReference getChildReference() {
		return childReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildReference(ChildPathReference newChildReference, NotificationChain msgs) {
		ChildPathReference oldChildReference = childReference;
		childReference = newChildReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.KEY_ACTUAL__CHILD_REFERENCE, oldChildReference, newChildReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildReference(ChildPathReference newChildReference) {
		if (newChildReference != childReference) {
			NotificationChain msgs = null;
			if (childReference != null)
				msgs = ((InternalEObject)childReference).eInverseRemove(this, WafPackage.CHILD_PATH_REFERENCE__PARENT, ChildPathReference.class, msgs);
			if (newChildReference != null)
				msgs = ((InternalEObject)newChildReference).eInverseAdd(this, WafPackage.CHILD_PATH_REFERENCE__PARENT, ChildPathReference.class, msgs);
			msgs = basicSetChildReference(newChildReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.KEY_ACTUAL__CHILD_REFERENCE, newChildReference, newChildReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUnit getContainer() {
		if (eContainerFeatureID() != WafPackage.KEY_ACTUAL__CONTAINER) return null;
		return (DynamicUnit)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUnit basicGetContainer() {
		if (eContainerFeatureID() != WafPackage.KEY_ACTUAL__CONTAINER) return null;
		return (DynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(DynamicUnit newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, WafPackage.KEY_ACTUAL__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(DynamicUnit newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != WafPackage.KEY_ACTUAL__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, WafPackage.DYNAMIC_UNIT__KEY_ACTUALS, DynamicUnit.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.KEY_ACTUAL__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (Feature)eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.KEY_ACTUAL__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Feature newKey) {
		Feature oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.KEY_ACTUAL__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.KEY_ACTUAL__CHILD_REFERENCE:
				if (childReference != null)
					msgs = ((InternalEObject)childReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.KEY_ACTUAL__CHILD_REFERENCE, null, msgs);
				return basicSetChildReference((ChildPathReference)otherEnd, msgs);
			case WafPackage.KEY_ACTUAL__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((DynamicUnit)otherEnd, msgs);
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
			case WafPackage.KEY_ACTUAL__ACTUAL:
				return basicSetActual(null, msgs);
			case WafPackage.KEY_ACTUAL__CHILD_REFERENCE:
				return basicSetChildReference(null, msgs);
			case WafPackage.KEY_ACTUAL__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case WafPackage.KEY_ACTUAL__CONTAINER:
				return eInternalContainer().eInverseRemove(this, WafPackage.DYNAMIC_UNIT__KEY_ACTUALS, DynamicUnit.class, msgs);
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
			case WafPackage.KEY_ACTUAL__ACTUAL:
				return getActual();
			case WafPackage.KEY_ACTUAL__CHILD_REFERENCE:
				return getChildReference();
			case WafPackage.KEY_ACTUAL__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case WafPackage.KEY_ACTUAL__KEY:
				if (resolve) return getKey();
				return basicGetKey();
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
			case WafPackage.KEY_ACTUAL__ACTUAL:
				setActual((Path)newValue);
				return;
			case WafPackage.KEY_ACTUAL__CHILD_REFERENCE:
				setChildReference((ChildPathReference)newValue);
				return;
			case WafPackage.KEY_ACTUAL__CONTAINER:
				setContainer((DynamicUnit)newValue);
				return;
			case WafPackage.KEY_ACTUAL__KEY:
				setKey((Feature)newValue);
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
			case WafPackage.KEY_ACTUAL__ACTUAL:
				setActual((Path)null);
				return;
			case WafPackage.KEY_ACTUAL__CHILD_REFERENCE:
				setChildReference((ChildPathReference)null);
				return;
			case WafPackage.KEY_ACTUAL__CONTAINER:
				setContainer((DynamicUnit)null);
				return;
			case WafPackage.KEY_ACTUAL__KEY:
				setKey((Feature)null);
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
			case WafPackage.KEY_ACTUAL__ACTUAL:
				return actual != null;
			case WafPackage.KEY_ACTUAL__CHILD_REFERENCE:
				return childReference != null;
			case WafPackage.KEY_ACTUAL__CONTAINER:
				return basicGetContainer() != null;
			case WafPackage.KEY_ACTUAL__KEY:
				return key != null;
		}
		return super.eIsSet(featureID);
	}

} //KeyActualImpl

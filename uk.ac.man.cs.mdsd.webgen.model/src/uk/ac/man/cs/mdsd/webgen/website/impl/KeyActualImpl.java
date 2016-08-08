/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.criteria.Expression;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.ChildPathReference;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.KeyActual;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Actual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.KeyActualImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.KeyActualImpl#getChildReference <em>Child Reference</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.KeyActualImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.KeyActualImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.KeyActualImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyActualImpl extends EObjectImpl implements KeyActual {
	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected Expression actual;

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
	 * The cached setting delegate for the '{@link #getEntityType() <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ENTITY_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.PATH_REFERENCE_ELEMENT__ENTITY_TYPE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Attribute key;

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
		return WebsitePackage.Literals.KEY_ACTUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUnit getContainer() {
		if (eContainerFeatureID() != WebsitePackage.KEY_ACTUAL__CONTAINER) return null;
		return (DynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(DynamicUnit newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, WebsitePackage.KEY_ACTUAL__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(DynamicUnit newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.KEY_ACTUAL__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, WebsitePackage.DYNAMIC_UNIT__KEY_ACTUALS, DynamicUnit.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.KEY_ACTUAL__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (Attribute)eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.KEY_ACTUAL__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Attribute newKey) {
		Attribute oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.KEY_ACTUAL__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getActual() {
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActual(Expression newActual, NotificationChain msgs) {
		Expression oldActual = actual;
		actual = newActual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.KEY_ACTUAL__ACTUAL, oldActual, newActual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActual(Expression newActual) {
		if (newActual != actual) {
			NotificationChain msgs = null;
			if (actual != null)
				msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.KEY_ACTUAL__ACTUAL, null, msgs);
			if (newActual != null)
				msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.KEY_ACTUAL__ACTUAL, null, msgs);
			msgs = basicSetActual(newActual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.KEY_ACTUAL__ACTUAL, newActual, newActual));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.KEY_ACTUAL__CHILD_REFERENCE, oldChildReference, newChildReference);
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
				msgs = ((InternalEObject)childReference).eInverseRemove(this, WebsitePackage.CHILD_PATH_REFERENCE__PARENT, ChildPathReference.class, msgs);
			if (newChildReference != null)
				msgs = ((InternalEObject)newChildReference).eInverseAdd(this, WebsitePackage.CHILD_PATH_REFERENCE__PARENT, ChildPathReference.class, msgs);
			msgs = basicSetChildReference(newChildReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.KEY_ACTUAL__CHILD_REFERENCE, newChildReference, newChildReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getEntityType() {
		return (EntityOrView)ENTITY_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetEntityType() {
		return (EntityOrView)ENTITY_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEntityType() {
		return ENTITY_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.KEY_ACTUAL__CHILD_REFERENCE:
				if (childReference != null)
					msgs = ((InternalEObject)childReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.KEY_ACTUAL__CHILD_REFERENCE, null, msgs);
				return basicSetChildReference((ChildPathReference)otherEnd, msgs);
			case WebsitePackage.KEY_ACTUAL__CONTAINER:
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
			case WebsitePackage.KEY_ACTUAL__ACTUAL:
				return basicSetActual(null, msgs);
			case WebsitePackage.KEY_ACTUAL__CHILD_REFERENCE:
				return basicSetChildReference(null, msgs);
			case WebsitePackage.KEY_ACTUAL__CONTAINER:
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
			case WebsitePackage.KEY_ACTUAL__CONTAINER:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.DYNAMIC_UNIT__KEY_ACTUALS, DynamicUnit.class, msgs);
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
			case WebsitePackage.KEY_ACTUAL__ACTUAL:
				return getActual();
			case WebsitePackage.KEY_ACTUAL__CHILD_REFERENCE:
				return getChildReference();
			case WebsitePackage.KEY_ACTUAL__ENTITY_TYPE:
				if (resolve) return getEntityType();
				return basicGetEntityType();
			case WebsitePackage.KEY_ACTUAL__CONTAINER:
				return getContainer();
			case WebsitePackage.KEY_ACTUAL__KEY:
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
			case WebsitePackage.KEY_ACTUAL__ACTUAL:
				setActual((Expression)newValue);
				return;
			case WebsitePackage.KEY_ACTUAL__CHILD_REFERENCE:
				setChildReference((ChildPathReference)newValue);
				return;
			case WebsitePackage.KEY_ACTUAL__CONTAINER:
				setContainer((DynamicUnit)newValue);
				return;
			case WebsitePackage.KEY_ACTUAL__KEY:
				setKey((Attribute)newValue);
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
			case WebsitePackage.KEY_ACTUAL__ACTUAL:
				setActual((Expression)null);
				return;
			case WebsitePackage.KEY_ACTUAL__CHILD_REFERENCE:
				setChildReference((ChildPathReference)null);
				return;
			case WebsitePackage.KEY_ACTUAL__CONTAINER:
				setContainer((DynamicUnit)null);
				return;
			case WebsitePackage.KEY_ACTUAL__KEY:
				setKey((Attribute)null);
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
			case WebsitePackage.KEY_ACTUAL__ACTUAL:
				return actual != null;
			case WebsitePackage.KEY_ACTUAL__CHILD_REFERENCE:
				return childReference != null;
			case WebsitePackage.KEY_ACTUAL__ENTITY_TYPE:
				return isSetEntityType();
			case WebsitePackage.KEY_ACTUAL__CONTAINER:
				return getContainer() != null;
			case WebsitePackage.KEY_ACTUAL__KEY:
				return key != null;
		}
		return super.eIsSet(featureID);
	}

} //KeyActualImpl

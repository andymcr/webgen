/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import uk.ac.man.cs.mdsd.criteria.Path;

import uk.ac.man.cs.mdsd.webgen.website.ChildPathReference;
import uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Path Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ChildPathReferenceImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ChildPathReferenceImpl#getChildReference <em>Child Reference</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ChildPathReferenceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildPathReferenceImpl extends EObjectImpl implements ChildPathReference {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildPathReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.CHILD_PATH_REFERENCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.CHILD_PATH_REFERENCE__ACTUAL, oldActual, newActual);
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
				msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.CHILD_PATH_REFERENCE__ACTUAL, null, msgs);
			if (newActual != null)
				msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.CHILD_PATH_REFERENCE__ACTUAL, null, msgs);
			msgs = basicSetActual(newActual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CHILD_PATH_REFERENCE__ACTUAL, newActual, newActual));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE, oldChildReference, newChildReference);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE, newChildReference, newChildReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathReferenceElement getParent() {
		if (eContainerFeatureID() != WebsitePackage.CHILD_PATH_REFERENCE__PARENT) return null;
		return (PathReferenceElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(PathReferenceElement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, WebsitePackage.CHILD_PATH_REFERENCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(PathReferenceElement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.CHILD_PATH_REFERENCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, WebsitePackage.PATH_REFERENCE_ELEMENT__CHILD_REFERENCE, PathReferenceElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CHILD_PATH_REFERENCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				if (childReference != null)
					msgs = ((InternalEObject)childReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE, null, msgs);
				return basicSetChildReference((ChildPathReference)otherEnd, msgs);
			case WebsitePackage.CHILD_PATH_REFERENCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((PathReferenceElement)otherEnd, msgs);
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
			case WebsitePackage.CHILD_PATH_REFERENCE__ACTUAL:
				return basicSetActual(null, msgs);
			case WebsitePackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				return basicSetChildReference(null, msgs);
			case WebsitePackage.CHILD_PATH_REFERENCE__PARENT:
				return basicSetParent(null, msgs);
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
			case WebsitePackage.CHILD_PATH_REFERENCE__PARENT:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.PATH_REFERENCE_ELEMENT__CHILD_REFERENCE, PathReferenceElement.class, msgs);
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
			case WebsitePackage.CHILD_PATH_REFERENCE__ACTUAL:
				return getActual();
			case WebsitePackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				return getChildReference();
			case WebsitePackage.CHILD_PATH_REFERENCE__PARENT:
				return getParent();
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
			case WebsitePackage.CHILD_PATH_REFERENCE__ACTUAL:
				setActual((Path)newValue);
				return;
			case WebsitePackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				setChildReference((ChildPathReference)newValue);
				return;
			case WebsitePackage.CHILD_PATH_REFERENCE__PARENT:
				setParent((PathReferenceElement)newValue);
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
			case WebsitePackage.CHILD_PATH_REFERENCE__ACTUAL:
				setActual((Path)null);
				return;
			case WebsitePackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				setChildReference((ChildPathReference)null);
				return;
			case WebsitePackage.CHILD_PATH_REFERENCE__PARENT:
				setParent((PathReferenceElement)null);
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
			case WebsitePackage.CHILD_PATH_REFERENCE__ACTUAL:
				return actual != null;
			case WebsitePackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				return childReference != null;
			case WebsitePackage.CHILD_PATH_REFERENCE__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ChildPathReferenceImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationImpl.java,v 1.8 2012/01/09 23:19:04 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.Association;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.AssociationImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.AssociationImpl#isSourceEnd <em>Source End</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.AssociationImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.AssociationImpl#isContainment <em>Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AssociationImpl extends FeatureImpl implements Association {
	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected Association opposite;

	/**
	 * The default value of the '{@link #isSourceEnd() <em>Source End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_END_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSourceEnd() <em>Source End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceEnd = SOURCE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean containment = CONTAINMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (Association)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ASSOCIATION__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpposite(Association newOpposite, NotificationChain msgs) {
		Association oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ASSOCIATION__OPPOSITE, oldOpposite, newOpposite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Association newOpposite) {
		if (newOpposite != opposite) {
			NotificationChain msgs = null;
			if (opposite != null)
				msgs = ((InternalEObject)opposite).eInverseRemove(this, OrmPackage.ASSOCIATION__OPPOSITE, Association.class, msgs);
			if (newOpposite != null)
				msgs = ((InternalEObject)newOpposite).eInverseAdd(this, OrmPackage.ASSOCIATION__OPPOSITE, Association.class, msgs);
			msgs = basicSetOpposite(newOpposite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ASSOCIATION__OPPOSITE, newOpposite, newOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceEnd() {
		return sourceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEnd(boolean newSourceEnd) {
		boolean oldSourceEnd = sourceEnd;
		sourceEnd = newSourceEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ASSOCIATION__SOURCE_END, oldSourceEnd, sourceEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBidirectional() {
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(boolean newBidirectional) {
		boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ASSOCIATION__BIDIRECTIONAL, oldBidirectional, bidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(boolean newContainment) {
		boolean oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ASSOCIATION__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.ASSOCIATION__OPPOSITE:
				if (opposite != null)
					msgs = ((InternalEObject)opposite).eInverseRemove(this, OrmPackage.ASSOCIATION__OPPOSITE, Association.class, msgs);
				return basicSetOpposite((Association)otherEnd, msgs);
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
			case OrmPackage.ASSOCIATION__OPPOSITE:
				return basicSetOpposite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.ASSOCIATION__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case OrmPackage.ASSOCIATION__SOURCE_END:
				return isSourceEnd();
			case OrmPackage.ASSOCIATION__BIDIRECTIONAL:
				return isBidirectional();
			case OrmPackage.ASSOCIATION__CONTAINMENT:
				return isContainment();
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
			case OrmPackage.ASSOCIATION__OPPOSITE:
				setOpposite((Association)newValue);
				return;
			case OrmPackage.ASSOCIATION__SOURCE_END:
				setSourceEnd((Boolean)newValue);
				return;
			case OrmPackage.ASSOCIATION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
			case OrmPackage.ASSOCIATION__CONTAINMENT:
				setContainment((Boolean)newValue);
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
			case OrmPackage.ASSOCIATION__OPPOSITE:
				setOpposite((Association)null);
				return;
			case OrmPackage.ASSOCIATION__SOURCE_END:
				setSourceEnd(SOURCE_END_EDEFAULT);
				return;
			case OrmPackage.ASSOCIATION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
			case OrmPackage.ASSOCIATION__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
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
			case OrmPackage.ASSOCIATION__OPPOSITE:
				return opposite != null;
			case OrmPackage.ASSOCIATION__SOURCE_END:
				return sourceEnd != SOURCE_END_EDEFAULT;
			case OrmPackage.ASSOCIATION__BIDIRECTIONAL:
				return bidirectional != BIDIRECTIONAL_EDEFAULT;
			case OrmPackage.ASSOCIATION__CONTAINMENT:
				return containment != CONTAINMENT_EDEFAULT;
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
		result.append(" (sourceEnd: ");
		result.append(sourceEnd);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(", containment: ");
		result.append(containment);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl

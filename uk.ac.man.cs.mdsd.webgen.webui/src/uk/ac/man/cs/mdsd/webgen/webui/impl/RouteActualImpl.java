/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.expression.Expression;

import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;

import uk.ac.man.cs.mdsd.webgen.webui.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.webui.RouteActual;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Actual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.RouteActualImpl#getActualFor <em>Actual For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.RouteActualImpl#getRouteParameter <em>Route Parameter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.RouteActualImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteActualImpl extends MinimalEObjectImpl.Container implements RouteActual {
	/**
	 * The cached value of the '{@link #getRouteParameter() <em>Route Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteParameter()
	 * @generated
	 * @ordered
	 */
	protected Attribute routeParameter;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteActualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.ROUTE_ACTUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentUnit getActualFor() {
		if (eContainerFeatureID() != WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR) return null;
		return (ContentUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualFor(ContentUnit newActualFor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActualFor, WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualFor(ContentUnit newActualFor) {
		if (newActualFor != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR && newActualFor != null)) {
			if (EcoreUtil.isAncestor(this, newActualFor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActualFor != null)
				msgs = ((InternalEObject)newActualFor).eInverseAdd(this, WebuiPackage.CONTENT_UNIT__ROUTE_ACTUALS, ContentUnit.class, msgs);
			msgs = basicSetActualFor(newActualFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR, newActualFor, newActualFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getRouteParameter() {
		if (routeParameter != null && routeParameter.eIsProxy()) {
			InternalEObject oldRouteParameter = (InternalEObject)routeParameter;
			routeParameter = (Attribute)eResolveProxy(oldRouteParameter);
			if (routeParameter != oldRouteParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.ROUTE_ACTUAL__ROUTE_PARAMETER, oldRouteParameter, routeParameter));
			}
		}
		return routeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetRouteParameter() {
		return routeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteParameter(Attribute newRouteParameter) {
		Attribute oldRouteParameter = routeParameter;
		routeParameter = newRouteParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ROUTE_ACTUAL__ROUTE_PARAMETER, oldRouteParameter, routeParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.ROUTE_ACTUAL__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.ROUTE_ACTUAL__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.ROUTE_ACTUAL__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ROUTE_ACTUAL__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActualFor((ContentUnit)otherEnd, msgs);
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
			case WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR:
				return basicSetActualFor(null, msgs);
			case WebuiPackage.ROUTE_ACTUAL__VALUE:
				return basicSetValue(null, msgs);
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
			case WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.CONTENT_UNIT__ROUTE_ACTUALS, ContentUnit.class, msgs);
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
			case WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR:
				return getActualFor();
			case WebuiPackage.ROUTE_ACTUAL__ROUTE_PARAMETER:
				if (resolve) return getRouteParameter();
				return basicGetRouteParameter();
			case WebuiPackage.ROUTE_ACTUAL__VALUE:
				return getValue();
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
			case WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR:
				setActualFor((ContentUnit)newValue);
				return;
			case WebuiPackage.ROUTE_ACTUAL__ROUTE_PARAMETER:
				setRouteParameter((Attribute)newValue);
				return;
			case WebuiPackage.ROUTE_ACTUAL__VALUE:
				setValue((Expression)newValue);
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
			case WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR:
				setActualFor((ContentUnit)null);
				return;
			case WebuiPackage.ROUTE_ACTUAL__ROUTE_PARAMETER:
				setRouteParameter((Attribute)null);
				return;
			case WebuiPackage.ROUTE_ACTUAL__VALUE:
				setValue((Expression)null);
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
			case WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR:
				return getActualFor() != null;
			case WebuiPackage.ROUTE_ACTUAL__ROUTE_PARAMETER:
				return routeParameter != null;
			case WebuiPackage.ROUTE_ACTUAL__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //RouteActualImpl

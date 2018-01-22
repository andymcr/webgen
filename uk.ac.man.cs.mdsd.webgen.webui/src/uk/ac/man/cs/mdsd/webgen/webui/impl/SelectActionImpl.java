/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.webui.FeaturePath;
import uk.ac.man.cs.mdsd.webgen.webui.SelectAction;
import uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.SelectActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.SelectActionImpl#getValuePath <em>Value Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectActionImpl extends InlineActionImpl implements SelectAction {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SelectableUnit target;

	/**
	 * The cached value of the '{@link #getValuePath() <em>Value Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePath()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath valuePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.SELECT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectableUnit getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SelectableUnit)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.SELECT_ACTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectableUnit basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SelectableUnit newTarget) {
		SelectableUnit oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.SELECT_ACTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePath getValuePath() {
		return valuePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuePath(FeaturePath newValuePath, NotificationChain msgs) {
		FeaturePath oldValuePath = valuePath;
		valuePath = newValuePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.SELECT_ACTION__VALUE_PATH, oldValuePath, newValuePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePath(FeaturePath newValuePath) {
		if (newValuePath != valuePath) {
			NotificationChain msgs = null;
			if (valuePath != null)
				msgs = ((InternalEObject)valuePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.SELECT_ACTION__VALUE_PATH, null, msgs);
			if (newValuePath != null)
				msgs = ((InternalEObject)newValuePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.SELECT_ACTION__VALUE_PATH, null, msgs);
			msgs = basicSetValuePath(newValuePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.SELECT_ACTION__VALUE_PATH, newValuePath, newValuePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.SELECT_ACTION__VALUE_PATH:
				return basicSetValuePath(null, msgs);
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
			case WebuiPackage.SELECT_ACTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case WebuiPackage.SELECT_ACTION__VALUE_PATH:
				return getValuePath();
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
			case WebuiPackage.SELECT_ACTION__TARGET:
				setTarget((SelectableUnit)newValue);
				return;
			case WebuiPackage.SELECT_ACTION__VALUE_PATH:
				setValuePath((FeaturePath)newValue);
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
			case WebuiPackage.SELECT_ACTION__TARGET:
				setTarget((SelectableUnit)null);
				return;
			case WebuiPackage.SELECT_ACTION__VALUE_PATH:
				setValuePath((FeaturePath)null);
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
			case WebuiPackage.SELECT_ACTION__TARGET:
				return target != null;
			case WebuiPackage.SELECT_ACTION__VALUE_PATH:
				return valuePath != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectActionImpl

/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import com.google.common.base.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.Association;
import uk.ac.man.cs.mdsd.orm.EntityOrView;

import uk.ac.man.cs.mdsd.waf.ChildAssociation;
import uk.ac.man.cs.mdsd.waf.ChildFeature;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ChildAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ChildAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ChildAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ChildAssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ChildAssociationImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ChildAssociationImpl#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ChildAssociationImpl#getParentTarget <em>Parent Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildAssociationImpl extends ChildFeatureImpl implements ChildAssociation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * The cached value of the '{@link #getChildFeature() <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildFeature()
	 * @generated
	 * @ordered
	 */
	protected ChildFeature childFeature;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Boolean source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected String sourceName = SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected String targetName = TARGET_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTarget() <em>Parent Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTarget()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView parentTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.CHILD_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		String _xifexpression = null;
		Association _association = this.getAssociation();
		boolean _notEquals = (!Objects.equal(_association, null));
		if (_notEquals) {
			Association _association_1 = this.getAssociation();
			_xifexpression = _association_1.getName();
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Association)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.CHILD_ASSOCIATION__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_ASSOCIATION__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildFeature getChildFeature() {
		return childFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildFeature(ChildFeature newChildFeature, NotificationChain msgs) {
		ChildFeature oldChildFeature = childFeature;
		childFeature = newChildFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_ASSOCIATION__CHILD_FEATURE, oldChildFeature, newChildFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildFeature(ChildFeature newChildFeature) {
		if (newChildFeature != childFeature) {
			NotificationChain msgs = null;
			if (childFeature != null)
				msgs = ((InternalEObject)childFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.CHILD_ASSOCIATION__CHILD_FEATURE, null, msgs);
			if (newChildFeature != null)
				msgs = ((InternalEObject)newChildFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WafPackage.CHILD_ASSOCIATION__CHILD_FEATURE, null, msgs);
			msgs = basicSetChildFeature(newChildFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_ASSOCIATION__CHILD_FEATURE, newChildFeature, newChildFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Boolean newSource) {
		Boolean oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_ASSOCIATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceName(String newSourceName) {
		String oldSourceName = sourceName;
		sourceName = newSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_ASSOCIATION__SOURCE_NAME, oldSourceName, sourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetName() {
		return targetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetName(String newTargetName) {
		String oldTargetName = targetName;
		targetName = newTargetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_ASSOCIATION__TARGET_NAME, oldTargetName, targetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getParentTarget() {
		if (parentTarget != null && parentTarget.eIsProxy()) {
			InternalEObject oldParentTarget = (InternalEObject)parentTarget;
			parentTarget = (EntityOrView)eResolveProxy(oldParentTarget);
			if (parentTarget != oldParentTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.CHILD_ASSOCIATION__PARENT_TARGET, oldParentTarget, parentTarget));
			}
		}
		return parentTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetParentTarget() {
		return parentTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTarget(EntityOrView newParentTarget) {
		EntityOrView oldParentTarget = parentTarget;
		parentTarget = newParentTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_ASSOCIATION__PARENT_TARGET, oldParentTarget, parentTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.CHILD_ASSOCIATION__CHILD_FEATURE:
				return basicSetChildFeature(null, msgs);
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
			case WafPackage.CHILD_ASSOCIATION__NAME:
				return getName();
			case WafPackage.CHILD_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WafPackage.CHILD_ASSOCIATION__CHILD_FEATURE:
				return getChildFeature();
			case WafPackage.CHILD_ASSOCIATION__SOURCE:
				return getSource();
			case WafPackage.CHILD_ASSOCIATION__SOURCE_NAME:
				return getSourceName();
			case WafPackage.CHILD_ASSOCIATION__TARGET_NAME:
				return getTargetName();
			case WafPackage.CHILD_ASSOCIATION__PARENT_TARGET:
				if (resolve) return getParentTarget();
				return basicGetParentTarget();
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
			case WafPackage.CHILD_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case WafPackage.CHILD_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((ChildFeature)newValue);
				return;
			case WafPackage.CHILD_ASSOCIATION__SOURCE:
				setSource((Boolean)newValue);
				return;
			case WafPackage.CHILD_ASSOCIATION__SOURCE_NAME:
				setSourceName((String)newValue);
				return;
			case WafPackage.CHILD_ASSOCIATION__TARGET_NAME:
				setTargetName((String)newValue);
				return;
			case WafPackage.CHILD_ASSOCIATION__PARENT_TARGET:
				setParentTarget((EntityOrView)newValue);
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
			case WafPackage.CHILD_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case WafPackage.CHILD_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((ChildFeature)null);
				return;
			case WafPackage.CHILD_ASSOCIATION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case WafPackage.CHILD_ASSOCIATION__SOURCE_NAME:
				setSourceName(SOURCE_NAME_EDEFAULT);
				return;
			case WafPackage.CHILD_ASSOCIATION__TARGET_NAME:
				setTargetName(TARGET_NAME_EDEFAULT);
				return;
			case WafPackage.CHILD_ASSOCIATION__PARENT_TARGET:
				setParentTarget((EntityOrView)null);
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
			case WafPackage.CHILD_ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case WafPackage.CHILD_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WafPackage.CHILD_ASSOCIATION__CHILD_FEATURE:
				return childFeature != null;
			case WafPackage.CHILD_ASSOCIATION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case WafPackage.CHILD_ASSOCIATION__SOURCE_NAME:
				return SOURCE_NAME_EDEFAULT == null ? sourceName != null : !SOURCE_NAME_EDEFAULT.equals(sourceName);
			case WafPackage.CHILD_ASSOCIATION__TARGET_NAME:
				return TARGET_NAME_EDEFAULT == null ? targetName != null : !TARGET_NAME_EDEFAULT.equals(targetName);
			case WafPackage.CHILD_ASSOCIATION__PARENT_TARGET:
				return parentTarget != null;
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
		result.append(" (source: ");
		result.append(source);
		result.append(", sourceName: ");
		result.append(sourceName);
		result.append(", targetName: ");
		result.append(targetName);
		result.append(')');
		return result.toString();
	}

} //ChildAssociationImpl

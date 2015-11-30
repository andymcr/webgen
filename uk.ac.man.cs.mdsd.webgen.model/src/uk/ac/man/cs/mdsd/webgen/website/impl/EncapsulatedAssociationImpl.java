/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EncapsulatedAssociationImpl#getEncapsulatedBy <em>Encapsulated By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EncapsulatedAssociationImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EncapsulatedAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EncapsulatedAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EncapsulatedAssociationImpl#isUseAssociationSource <em>Use Association Source</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EncapsulatedAssociationImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EncapsulatedAssociationImpl#getEncapsulatedTarget <em>Encapsulated Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncapsulatedAssociationImpl extends EncapsulatedFeatureImpl implements EncapsulatedAssociation {
	/**
	 * The cached value of the '{@link #getEncapsulatedBy() <em>Encapsulated By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<EncapsulatedAssociation> encapsulatedBy;

	/**
	 * The default value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_CLASS_EDEFAULT = "input_association";

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
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.ENCAPSULATED_ASSOCIATION__NAME).getSettingDelegate();

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
	 * The default value of the '{@link #isUseAssociationSource() <em>Use Association Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAssociationSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ASSOCIATION_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAssociationSource() <em>Use Association Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAssociationSource()
	 * @generated
	 * @ordered
	 */
	protected boolean useAssociationSource = USE_ASSOCIATION_SOURCE_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CARDINALITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.ENCAPSULATED_ASSOCIATION__CARDINALITY).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getEncapsulatedTarget() <em>Encapsulated Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedTarget()
	 * @generated
	 * @ordered
	 */
	protected EncapsulatedAssociation encapsulatedTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ENCAPSULATED_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EncapsulatedAssociation> getEncapsulatedBy() {
		if (encapsulatedBy == null) {
			encapsulatedBy = new EObjectWithInverseResolvingEList<EncapsulatedAssociation>(EncapsulatedAssociation.class, this, WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY, WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION);
		}
		return encapsulatedBy;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS, oldInputClass, inputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newName);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
	 * @generated NOT
	 */
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
		Association oldAssociation = association;
		association = newAssociation;
		// eContainer may be undefined when loading resource (used by getPartOf)
		if ((newAssociation != null) && (eContainer() != null)) {
			if (newAssociation instanceof EntityAssociation) {
				final EntityAssociation entityAssociation = (EntityAssociation) newAssociation;
				if (getPartOf().getEncapsulates().contains(entityAssociation.getPartOf())) {
					if (!getPartOf().getEncapsulates().contains(entityAssociation.getTargetEntity())) {
						setUseAssociationSource(true);
					}
				} else {
					if (getPartOf().getEncapsulates().contains(entityAssociation.getTargetEntity())) {
						setUseAssociationSource(false);
					}
				}
			}
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION, oldAssociation, newAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		if (newAssociation != association) {
			NotificationChain msgs = null;
			if (association != null)
				msgs = ((InternalEObject)association).eInverseRemove(this, WebsitePackage.ASSOCIATION__ENCAPSULATED_BY, Association.class, msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject)newAssociation).eInverseAdd(this, WebsitePackage.ASSOCIATION__ENCAPSULATED_BY, Association.class, msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION, newAssociation, newAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseAssociationSource() {
		return useAssociationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setUseAssociationSource(boolean newUseAssociationSource) {
		boolean oldUseAssociationSource = useAssociationSource;
		useAssociationSource = newUseAssociationSource;
		if (getAssociation() != null) {
			if (getAssociation() instanceof EntityAssociation){
				final EntityAssociation association = (EntityAssociation) getAssociation();
				if (useAssociationSource) {
					setCardinality(association.getCardinality());
				} else {
					if (association instanceof AssociationWithContainment) {
						setCardinality(Cardinality.REQUIRED);
					} else {
						setCardinality(((AssociationWithoutContainment) getAssociation()).getTargetCardinality());
					}
				}
			} else if (getAssociation() instanceof EncapsulatedAssociation) {
				final EncapsulatedAssociation association = (EncapsulatedAssociation) getAssociation();
				setCardinality(association.getCardinality());
			} else {
				final ViewAssociation association = (ViewAssociation) getAssociation();
				if (useAssociationSource) {
					setCardinality(association.getCardinality());
				} else {
					setCardinality(association.getOpposite().getCardinality());
				}
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENCAPSULATED_ASSOCIATION__USE_ASSOCIATION_SOURCE, oldUseAssociationSource, useAssociationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return (Cardinality)CARDINALITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		CARDINALITY__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAssociation getEncapsulatedTarget() {
		if (encapsulatedTarget != null && encapsulatedTarget.eIsProxy()) {
			InternalEObject oldEncapsulatedTarget = (InternalEObject)encapsulatedTarget;
			encapsulatedTarget = (EncapsulatedAssociation)eResolveProxy(oldEncapsulatedTarget);
			if (encapsulatedTarget != oldEncapsulatedTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET, oldEncapsulatedTarget, encapsulatedTarget));
			}
		}
		return encapsulatedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAssociation basicGetEncapsulatedTarget() {
		return encapsulatedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncapsulatedTarget(EncapsulatedAssociation newEncapsulatedTarget) {
		EncapsulatedAssociation oldEncapsulatedTarget = encapsulatedTarget;
		encapsulatedTarget = newEncapsulatedTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET, oldEncapsulatedTarget, encapsulatedTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEncapsulatedBy()).basicAdd(otherEnd, msgs);
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				if (association != null)
					msgs = ((InternalEObject)association).eInverseRemove(this, WebsitePackage.ASSOCIATION__ENCAPSULATED_BY, Association.class, msgs);
				return basicSetAssociation((Association)otherEnd, msgs);
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
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				return ((InternalEList<?>)getEncapsulatedBy()).basicRemove(otherEnd, msgs);
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				return basicSetAssociation(null, msgs);
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
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				return getEncapsulatedBy();
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS:
				return getInputClass();
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__NAME:
				return getName();
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__USE_ASSOCIATION_SOURCE:
				return isUseAssociationSource();
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__CARDINALITY:
				return getCardinality();
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET:
				if (resolve) return getEncapsulatedTarget();
				return basicGetEncapsulatedTarget();
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
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				getEncapsulatedBy().addAll((Collection<? extends EncapsulatedAssociation>)newValue);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__USE_ASSOCIATION_SOURCE:
				setUseAssociationSource((Boolean)newValue);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET:
				setEncapsulatedTarget((EncapsulatedAssociation)newValue);
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
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__NAME:
				NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__USE_ASSOCIATION_SOURCE:
				setUseAssociationSource(USE_ASSOCIATION_SOURCE_EDEFAULT);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__CARDINALITY:
				CARDINALITY__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET:
				setEncapsulatedTarget((EncapsulatedAssociation)null);
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
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				return encapsulatedBy != null && !encapsulatedBy.isEmpty();
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__USE_ASSOCIATION_SOURCE:
				return useAssociationSource != USE_ASSOCIATION_SOURCE_EDEFAULT;
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__CARDINALITY:
				return CARDINALITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET:
				return encapsulatedTarget != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY: return WebsitePackage.ASSOCIATION__ENCAPSULATED_BY;
				case WebsitePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS: return WebsitePackage.ASSOCIATION__INPUT_CLASS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case WebsitePackage.ASSOCIATION__ENCAPSULATED_BY: return WebsitePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY;
				case WebsitePackage.ASSOCIATION__INPUT_CLASS: return WebsitePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (inputClass: ");
		result.append(inputClass);
		result.append(", useAssociationSource: ");
		result.append(useAssociationSource);
		result.append(')');
		return result.toString();
	}

} //EncapsulatedAssociationImpl
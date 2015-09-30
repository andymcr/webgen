/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.IncludedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Included Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IncludedAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IncludedAssociationImpl#isUseAssociationSource <em>Use Association Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IncludedAssociationImpl extends IncludedFeatureImpl implements IncludedAssociation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludedAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.INCLUDED_ASSOCIATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.INCLUDED_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INCLUDED_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
		boolean featureRequired;
		if (getAssociation() instanceof EntityAssociation){
			final EntityAssociation association = (EntityAssociation) getAssociation();
			if (useAssociationSource) {
				featureRequired = association.getCardinality() == Cardinality.REQUIRED;
			} else {
				if (association instanceof AssociationWithContainment) {
					featureRequired = true;
				} else {
					featureRequired = ((AssociationWithoutContainment) getAssociation()).getTargetCardinality() == Cardinality.REQUIRED;
				}
			}
		} else if (getAssociation() instanceof EncapsulatedAssociation) {
			final EncapsulatedAssociation association = (EncapsulatedAssociation) getAssociation();
			featureRequired = association.getCardinality() == Cardinality.REQUIRED;
		} else {
			final ViewAssociation association = (ViewAssociation) getAssociation();
			if (useAssociationSource) {
				featureRequired = association.getCardinality() == Cardinality.REQUIRED;
			} else {
				featureRequired = association.getTargetCardinality() == Cardinality.REQUIRED;
			}
		}
		setRequired(isRequired() || featureRequired);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INCLUDED_ASSOCIATION__USE_ASSOCIATION_SOURCE, oldUseAssociationSource, useAssociationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.INCLUDED_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WebsitePackage.INCLUDED_ASSOCIATION__USE_ASSOCIATION_SOURCE:
				return isUseAssociationSource();
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
			case WebsitePackage.INCLUDED_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case WebsitePackage.INCLUDED_ASSOCIATION__USE_ASSOCIATION_SOURCE:
				setUseAssociationSource((Boolean)newValue);
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
			case WebsitePackage.INCLUDED_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case WebsitePackage.INCLUDED_ASSOCIATION__USE_ASSOCIATION_SOURCE:
				setUseAssociationSource(USE_ASSOCIATION_SOURCE_EDEFAULT);
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
			case WebsitePackage.INCLUDED_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WebsitePackage.INCLUDED_ASSOCIATION__USE_ASSOCIATION_SOURCE:
				return useAssociationSource != USE_ASSOCIATION_SOURCE_EDEFAULT;
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
		result.append(" (useAssociationSource: ");
		result.append(useAssociationSource);
		result.append(')');
		return result.toString();
	}

} //IncludedAssociationImpl

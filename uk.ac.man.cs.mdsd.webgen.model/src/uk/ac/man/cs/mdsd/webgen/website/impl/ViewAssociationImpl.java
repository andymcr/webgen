/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#isUseAssociationSource <em>Use Association Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewAssociationImpl extends ViewFeatureImpl implements ViewAssociation {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.VIEW_ASSOCIATION__NAME).getSettingDelegate();
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
	protected ViewAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.VIEW_ASSOCIATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.VIEW_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
	public void setAssociation(Association newAssociation) {
		Association oldAssociation = association;
		association = newAssociation;
		// eContainer may be undefined when loading resource (used by getPartOf)
		if ((newAssociation != null) && (eContainer() != null)) {
			if (newAssociation instanceof EntityAssociation) {
				final EntityAssociation entityAssociation = (EntityAssociation) newAssociation;
System.err.println("New association "+entityAssociation.getName());
				if (getPartOf().getEncapsulates().contains(entityAssociation.getParentEntity())) {
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
System.err.println("  use association source "+newUseAssociationSource);
		boolean oldUseAssociationSource = useAssociationSource;
		useAssociationSource = newUseAssociationSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__USE_ASSOCIATION_SOURCE, oldUseAssociationSource, useAssociationSource));
System.err.println("    name "+getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.VIEW_ASSOCIATION__NAME:
				return getName();
			case WebsitePackage.VIEW_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WebsitePackage.VIEW_ASSOCIATION__USE_ASSOCIATION_SOURCE:
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
			case WebsitePackage.VIEW_ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__USE_ASSOCIATION_SOURCE:
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
			case WebsitePackage.VIEW_ASSOCIATION__NAME:
				NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__USE_ASSOCIATION_SOURCE:
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
			case WebsitePackage.VIEW_ASSOCIATION__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.VIEW_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WebsitePackage.VIEW_ASSOCIATION__USE_ASSOCIATION_SOURCE:
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

} //ViewAssociationImpl

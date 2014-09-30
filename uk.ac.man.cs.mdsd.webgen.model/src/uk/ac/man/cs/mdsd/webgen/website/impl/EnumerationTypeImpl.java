/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnumerationTypeImpl.java,v 1.1 2012/03/21 14:42:30 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.EnumerationLiteral;
import uk.ac.man.cs.mdsd.webgen.website.EnumerationType;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EnumerationTypeImpl#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationTypeImpl extends DataTypeImpl implements EnumerationType {
	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> enumerations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ENUMERATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EnumerationLiteral> getEnumerations() {
		if (enumerations == null) {
			enumerations = new EObjectContainmentEList<EnumerationLiteral>(EnumerationLiteral.class, this, WebsitePackage.ENUMERATION_TYPE__ENUMERATIONS);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.ENUMERATION_TYPE__ENUMERATIONS:
				return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.ENUMERATION_TYPE__ENUMERATIONS:
				return getEnumerations();
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
			case WebsitePackage.ENUMERATION_TYPE__ENUMERATIONS:
				getEnumerations().clear();
				getEnumerations().addAll((Collection<? extends EnumerationLiteral>)newValue);
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
			case WebsitePackage.ENUMERATION_TYPE__ENUMERATIONS:
				getEnumerations().clear();
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
			case WebsitePackage.ENUMERATION_TYPE__ENUMERATIONS:
				return enumerations != null && !enumerations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumerationTypeImpl

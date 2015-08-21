/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectTargetImpl.java,v 1.2 2010/03/25 23:53:51 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.SelectTarget;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectTargetImpl#getSelectionFeatures <em>Selection Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SelectTargetImpl extends EObjectImpl implements SelectTarget {
	/**
	 * The cached value of the '{@link #getSelectionFeatures() <em>Selection Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> selectionFeatures;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.SELECT_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Attribute> getSelectionFeatures() {
		if (selectionFeatures == null) {
			selectionFeatures = new EObjectResolvingEList<Attribute>(Attribute.class, this, WebsitePackage.SELECT_TARGET__SELECTION_FEATURES);
		}
		return selectionFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.SELECT_TARGET__SELECTION_FEATURES:
				return getSelectionFeatures();
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
			case WebsitePackage.SELECT_TARGET__SELECTION_FEATURES:
				getSelectionFeatures().clear();
				getSelectionFeatures().addAll((Collection<? extends Attribute>)newValue);
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
			case WebsitePackage.SELECT_TARGET__SELECTION_FEATURES:
				getSelectionFeatures().clear();
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
			case WebsitePackage.SELECT_TARGET__SELECTION_FEATURES:
				return selectionFeatures != null && !selectionFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectTargetImpl

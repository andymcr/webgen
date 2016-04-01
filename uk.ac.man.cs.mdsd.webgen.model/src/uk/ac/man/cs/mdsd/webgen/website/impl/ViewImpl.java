/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.View;
import uk.ac.man.cs.mdsd.webgen.website.ViewFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewImpl#getEncapsulates <em>Encapsulates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewImpl#getViewFeatures <em>View Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends EntityOrViewImpl implements View {
	/**
	 * The cached value of the '{@link #getEncapsulates() <em>Encapsulates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulates()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityOrView> encapsulates;

	/**
	 * The cached value of the '{@link #getViewFeatures() <em>View Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewFeature> viewFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityOrView> getEncapsulates() {
		if (encapsulates == null) {
			encapsulates = new EObjectResolvingEList<EntityOrView>(EntityOrView.class, this, WebsitePackage.VIEW__ENCAPSULATES);
		}
		return encapsulates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ViewFeature> getViewFeatures() {
		if (viewFeatures == null) {
			viewFeatures = new EObjectContainmentWithInverseEList<ViewFeature>(ViewFeature.class, this, WebsitePackage.VIEW__VIEW_FEATURES, WebsitePackage.VIEW_FEATURE__PART_OF);
		}
		return viewFeatures;
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
			case WebsitePackage.VIEW__VIEW_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViewFeatures()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.VIEW__VIEW_FEATURES:
				return ((InternalEList<?>)getViewFeatures()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.VIEW__ENCAPSULATES:
				return getEncapsulates();
			case WebsitePackage.VIEW__VIEW_FEATURES:
				return getViewFeatures();
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
			case WebsitePackage.VIEW__ENCAPSULATES:
				getEncapsulates().clear();
				getEncapsulates().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WebsitePackage.VIEW__VIEW_FEATURES:
				getViewFeatures().clear();
				getViewFeatures().addAll((Collection<? extends ViewFeature>)newValue);
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
			case WebsitePackage.VIEW__ENCAPSULATES:
				getEncapsulates().clear();
				return;
			case WebsitePackage.VIEW__VIEW_FEATURES:
				getViewFeatures().clear();
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
			case WebsitePackage.VIEW__ENCAPSULATES:
				return encapsulates != null && !encapsulates.isEmpty();
			case WebsitePackage.VIEW__VIEW_FEATURES:
				return viewFeatures != null && !viewFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewImpl

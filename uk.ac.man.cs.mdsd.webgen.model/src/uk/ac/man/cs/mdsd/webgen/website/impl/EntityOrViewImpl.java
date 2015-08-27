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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabelY;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Or View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getServedBy <em>Served By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getDisplayLabels <em>Display Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityOrViewImpl extends ClassifierImpl implements EntityOrView {
	/**
	 * The cached value of the '{@link #getServedBy() <em>Served By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> servedBy;

	/**
	 * The cached value of the '{@link #getDisplayLabels() <em>Display Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelLabelY> displayLabels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityOrViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ENTITY_OR_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Service> getServedBy() {
		if (servedBy == null) {
			servedBy = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, WebsitePackage.ENTITY_OR_VIEW__SERVED_BY, WebsitePackage.SERVICE__ENCAPSULATES);
		}
		return servedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ModelLabelY> getDisplayLabels() {
		if (displayLabels == null) {
			displayLabels = new EObjectContainmentWithInverseEList<ModelLabelY>(ModelLabelY.class, this, WebsitePackage.ENTITY_OR_VIEW__DISPLAY_LABELS, WebsitePackage.MODEL_LABEL_Y__LABEL_FOR);
		}
		return displayLabels;
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
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServedBy()).basicAdd(otherEnd, msgs);
			case WebsitePackage.ENTITY_OR_VIEW__DISPLAY_LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDisplayLabels()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				return ((InternalEList<?>)getServedBy()).basicRemove(otherEnd, msgs);
			case WebsitePackage.ENTITY_OR_VIEW__DISPLAY_LABELS:
				return ((InternalEList<?>)getDisplayLabels()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				return getServedBy();
			case WebsitePackage.ENTITY_OR_VIEW__DISPLAY_LABELS:
				return getDisplayLabels();
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
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				getServedBy().clear();
				getServedBy().addAll((Collection<? extends Service>)newValue);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__DISPLAY_LABELS:
				getDisplayLabels().clear();
				getDisplayLabels().addAll((Collection<? extends ModelLabelY>)newValue);
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
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				getServedBy().clear();
				return;
			case WebsitePackage.ENTITY_OR_VIEW__DISPLAY_LABELS:
				getDisplayLabels().clear();
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
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				return servedBy != null && !servedBy.isEmpty();
			case WebsitePackage.ENTITY_OR_VIEW__DISPLAY_LABELS:
				return displayLabels != null && !displayLabels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityOrViewImpl

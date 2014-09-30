/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityImpl.java,v 1.16 2014/01/30 16:43:49 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.LinkedList;

import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getServedBy <em>Served By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getDisplayFeatures <em>Display Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getDisplayFormat <em>Display Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends ClassifierImpl implements Entity {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getAssociationEnds() <em>Association Ends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> associationEnds;

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
	 * The cached value of the '{@link #getDisplayFeatures() <em>Display Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> displayFeatures;
	/**
	 * The default value of the '{@link #getDisplayFormat() <em>Display Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_FORMAT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDisplayFormat() <em>Display Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFormat()
	 * @generated
	 * @ordered
	 */
	protected String displayFormat = DISPLAY_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, WebsitePackage.ENTITY__FEATURES, WebsitePackage.FEATURE__PARENT_ENTITY);
		}
		return features;
	}

	/**
	 * @generated NOT
	 */
	public List<Feature> getAllFeatures() {
		final List<Feature> features = new LinkedList<Feature>(getFeatures());
		for (Association end : getAssociationEnds()) {
			if (end.getBidirectional()) {
				
			}
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Association> getAssociationEnds() {
		if (associationEnds == null) {
			associationEnds = new EObjectWithInverseResolvingEList<Association>(Association.class, this, WebsitePackage.ENTITY__ASSOCIATION_ENDS, WebsitePackage.ASSOCIATION__TARGET_ENTITY);
		}
		return associationEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Service> getServedBy() {
		if (servedBy == null) {
			servedBy = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, WebsitePackage.ENTITY__SERVED_BY, WebsitePackage.SERVICE__ENCAPSULATES);
		}
		return servedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Feature> getDisplayFeatures() {
		if (displayFeatures == null) {
			displayFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, WebsitePackage.ENTITY__DISPLAY_FEATURES);
		}
		return displayFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayFormat() {
		return displayFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFormat(String newDisplayFormat) {
		String oldDisplayFormat = displayFormat;
		displayFormat = newDisplayFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY__DISPLAY_FORMAT, oldDisplayFormat, displayFormat));
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
			case WebsitePackage.ENTITY__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationEnds()).basicAdd(otherEnd, msgs);
			case WebsitePackage.ENTITY__SERVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServedBy()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.ENTITY__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return ((InternalEList<?>)getAssociationEnds()).basicRemove(otherEnd, msgs);
			case WebsitePackage.ENTITY__SERVED_BY:
				return ((InternalEList<?>)getServedBy()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.ENTITY__FEATURES:
				return getFeatures();
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return getAssociationEnds();
			case WebsitePackage.ENTITY__SERVED_BY:
				return getServedBy();
			case WebsitePackage.ENTITY__DISPLAY_FEATURES:
				return getDisplayFeatures();
			case WebsitePackage.ENTITY__DISPLAY_FORMAT:
				return getDisplayFormat();
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
			case WebsitePackage.ENTITY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				getAssociationEnds().addAll((Collection<? extends Association>)newValue);
				return;
			case WebsitePackage.ENTITY__SERVED_BY:
				getServedBy().clear();
				getServedBy().addAll((Collection<? extends Service>)newValue);
				return;
			case WebsitePackage.ENTITY__DISPLAY_FEATURES:
				getDisplayFeatures().clear();
				getDisplayFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case WebsitePackage.ENTITY__DISPLAY_FORMAT:
				setDisplayFormat((String)newValue);
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
			case WebsitePackage.ENTITY__FEATURES:
				getFeatures().clear();
				return;
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				return;
			case WebsitePackage.ENTITY__SERVED_BY:
				getServedBy().clear();
				return;
			case WebsitePackage.ENTITY__DISPLAY_FEATURES:
				getDisplayFeatures().clear();
				return;
			case WebsitePackage.ENTITY__DISPLAY_FORMAT:
				setDisplayFormat(DISPLAY_FORMAT_EDEFAULT);
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
			case WebsitePackage.ENTITY__FEATURES:
				return features != null && !features.isEmpty();
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return associationEnds != null && !associationEnds.isEmpty();
			case WebsitePackage.ENTITY__SERVED_BY:
				return servedBy != null && !servedBy.isEmpty();
			case WebsitePackage.ENTITY__DISPLAY_FEATURES:
				return displayFeatures != null && !displayFeatures.isEmpty();
			case WebsitePackage.ENTITY__DISPLAY_FORMAT:
				return DISPLAY_FORMAT_EDEFAULT == null ? displayFormat != null : !DISPLAY_FORMAT_EDEFAULT.equals(displayFormat);
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
		result.append(" (displayFormat: ");
		result.append(displayFormat);
		result.append(')');
		return result.toString();
	}

} //EntityImpl

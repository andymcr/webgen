/**
 */
package uk.ac.man.cs.mdsd.webgen.service.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.base.FormalParameter;
import uk.ac.man.cs.mdsd.webgen.base.FormalParameterList;
import uk.ac.man.cs.mdsd.webgen.base.impl.NamedElementImpl;

import uk.ac.man.cs.mdsd.webgen.expression.Predicate;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.Feature;

import uk.ac.man.cs.mdsd.webgen.service.Order;
import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.Service;
import uk.ac.man.cs.mdsd.webgen.service.ServicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.SelectionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.SelectionImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.SelectionImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.SelectionImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.SelectionImpl#getJoins <em>Joins</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.SelectionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.SelectionImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.SelectionImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.SelectionImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionImpl extends NamedElementImpl implements Selection {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalParameter> parameters;

	/**
	 * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected boolean distinct = DISTINCT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> fields;

	/**
	 * The cached value of the '{@link #getJoins() <em>Joins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoins()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> joins;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected Predicate filter;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> ordering;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected int limit = LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<FormalParameter>(FormalParameter.class, this, ServicePackage.SELECTION__PARAMETERS, BasePackage.FORMAL_PARAMETER__FORMAL_FOR);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getUsedBy() {
		if (eContainerFeatureID() != ServicePackage.SELECTION__USED_BY) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedBy(Service newUsedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUsedBy, ServicePackage.SELECTION__USED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedBy(Service newUsedBy) {
		if (newUsedBy != eInternalContainer() || (eContainerFeatureID() != ServicePackage.SELECTION__USED_BY && newUsedBy != null)) {
			if (EcoreUtil.isAncestor(this, newUsedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUsedBy != null)
				msgs = ((InternalEObject)newUsedBy).eInverseAdd(this, ServicePackage.SERVICE__SELECTIONS, Service.class, msgs);
			msgs = basicSetUsedBy(newUsedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SELECTION__USED_BY, newUsedBy, newUsedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistinct(boolean newDistinct) {
		boolean oldDistinct = distinct;
		distinct = newDistinct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SELECTION__DISTINCT, oldDistinct, distinct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<Feature>(Feature.class, this, ServicePackage.SELECTION__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getJoins() {
		if (joins == null) {
			joins = new EObjectResolvingEList<Association>(Association.class, this, ServicePackage.SELECTION__JOINS);
		}
		return joins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(Predicate newFilter, NotificationChain msgs) {
		Predicate oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.SELECTION__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(Predicate newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SELECTION__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SELECTION__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SELECTION__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getOrdering() {
		if (ordering == null) {
			ordering = new EObjectContainmentEList<Order>(Order.class, this, ServicePackage.SELECTION__ORDERING);
		}
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(int newLimit) {
		int oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SELECTION__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SELECTION__SELECTED, oldSelected, selected));
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
			case ServicePackage.SELECTION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case ServicePackage.SELECTION__USED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUsedBy((Service)otherEnd, msgs);
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
			case ServicePackage.SELECTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ServicePackage.SELECTION__USED_BY:
				return basicSetUsedBy(null, msgs);
			case ServicePackage.SELECTION__FILTER:
				return basicSetFilter(null, msgs);
			case ServicePackage.SELECTION__ORDERING:
				return ((InternalEList<?>)getOrdering()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ServicePackage.SELECTION__USED_BY:
				return eInternalContainer().eInverseRemove(this, ServicePackage.SERVICE__SELECTIONS, Service.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SELECTION__PARAMETERS:
				return getParameters();
			case ServicePackage.SELECTION__USED_BY:
				return getUsedBy();
			case ServicePackage.SELECTION__DISTINCT:
				return isDistinct();
			case ServicePackage.SELECTION__FIELDS:
				return getFields();
			case ServicePackage.SELECTION__JOINS:
				return getJoins();
			case ServicePackage.SELECTION__FILTER:
				return getFilter();
			case ServicePackage.SELECTION__ORDERING:
				return getOrdering();
			case ServicePackage.SELECTION__LIMIT:
				return getLimit();
			case ServicePackage.SELECTION__SELECTED:
				return isSelected();
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
			case ServicePackage.SELECTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends FormalParameter>)newValue);
				return;
			case ServicePackage.SELECTION__USED_BY:
				setUsedBy((Service)newValue);
				return;
			case ServicePackage.SELECTION__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case ServicePackage.SELECTION__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Feature>)newValue);
				return;
			case ServicePackage.SELECTION__JOINS:
				getJoins().clear();
				getJoins().addAll((Collection<? extends Association>)newValue);
				return;
			case ServicePackage.SELECTION__FILTER:
				setFilter((Predicate)newValue);
				return;
			case ServicePackage.SELECTION__ORDERING:
				getOrdering().clear();
				getOrdering().addAll((Collection<? extends Order>)newValue);
				return;
			case ServicePackage.SELECTION__LIMIT:
				setLimit((Integer)newValue);
				return;
			case ServicePackage.SELECTION__SELECTED:
				setSelected((Boolean)newValue);
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
			case ServicePackage.SELECTION__PARAMETERS:
				getParameters().clear();
				return;
			case ServicePackage.SELECTION__USED_BY:
				setUsedBy((Service)null);
				return;
			case ServicePackage.SELECTION__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case ServicePackage.SELECTION__FIELDS:
				getFields().clear();
				return;
			case ServicePackage.SELECTION__JOINS:
				getJoins().clear();
				return;
			case ServicePackage.SELECTION__FILTER:
				setFilter((Predicate)null);
				return;
			case ServicePackage.SELECTION__ORDERING:
				getOrdering().clear();
				return;
			case ServicePackage.SELECTION__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case ServicePackage.SELECTION__SELECTED:
				setSelected(SELECTED_EDEFAULT);
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
			case ServicePackage.SELECTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ServicePackage.SELECTION__USED_BY:
				return getUsedBy() != null;
			case ServicePackage.SELECTION__DISTINCT:
				return distinct != DISTINCT_EDEFAULT;
			case ServicePackage.SELECTION__FIELDS:
				return fields != null && !fields.isEmpty();
			case ServicePackage.SELECTION__JOINS:
				return joins != null && !joins.isEmpty();
			case ServicePackage.SELECTION__FILTER:
				return filter != null;
			case ServicePackage.SELECTION__ORDERING:
				return ordering != null && !ordering.isEmpty();
			case ServicePackage.SELECTION__LIMIT:
				return limit != LIMIT_EDEFAULT;
			case ServicePackage.SELECTION__SELECTED:
				return selected != SELECTED_EDEFAULT;
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
		if (baseClass == FormalParameterList.class) {
			switch (derivedFeatureID) {
				case ServicePackage.SELECTION__PARAMETERS: return BasePackage.FORMAL_PARAMETER_LIST__PARAMETERS;
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
		if (baseClass == FormalParameterList.class) {
			switch (baseFeatureID) {
				case BasePackage.FORMAL_PARAMETER_LIST__PARAMETERS: return ServicePackage.SELECTION__PARAMETERS;
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
		result.append(" (distinct: ");
		result.append(distinct);
		result.append(", limit: ");
		result.append(limit);
		result.append(", selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //SelectionImpl

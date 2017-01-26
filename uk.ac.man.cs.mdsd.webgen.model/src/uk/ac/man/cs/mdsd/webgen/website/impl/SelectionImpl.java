/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.criteria.Order;
import uk.ac.man.cs.mdsd.criteria.Predicate;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.SelectionParameter;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectionImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectionImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectionImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectionImpl#getJoins <em>Joins</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectionImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectionImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectionImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionImpl extends NamedElementImpl implements Selection {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionParameter> parameters;

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
		return WebsitePackage.Literals.SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getUsedBy() {
		if (eContainerFeatureID() != WebsitePackage.SELECTION__USED_BY) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedBy(Service newUsedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUsedBy, WebsitePackage.SELECTION__USED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedBy(Service newUsedBy) {
		if (newUsedBy != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.SELECTION__USED_BY && newUsedBy != null)) {
			if (EcoreUtil.isAncestor(this, newUsedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUsedBy != null)
				msgs = ((InternalEObject)newUsedBy).eInverseAdd(this, WebsitePackage.SERVICE__SELECTIONS, Service.class, msgs);
			msgs = basicSetUsedBy(newUsedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SELECTION__USED_BY, newUsedBy, newUsedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SELECTION__DISTINCT, oldDistinct, distinct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Feature> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<Feature>(Feature.class, this, WebsitePackage.SELECTION__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SelectionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<SelectionParameter>(SelectionParameter.class, this, WebsitePackage.SELECTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Association> getJoins() {
		if (joins == null) {
			joins = new EObjectResolvingEList<Association>(Association.class, this, WebsitePackage.SELECTION__JOINS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.SELECTION__FILTER, oldFilter, newFilter);
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
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.SELECTION__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.SELECTION__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SELECTION__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Order> getOrdering() {
		if (ordering == null) {
			ordering = new EObjectContainmentEList<Order>(Order.class, this, WebsitePackage.SELECTION__ORDERING);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SELECTION__LIMIT, oldLimit, limit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SELECTION__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.SELECTION__USED_BY:
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
			case WebsitePackage.SELECTION__USED_BY:
				return basicSetUsedBy(null, msgs);
			case WebsitePackage.SELECTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case WebsitePackage.SELECTION__FILTER:
				return basicSetFilter(null, msgs);
			case WebsitePackage.SELECTION__ORDERING:
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
			case WebsitePackage.SELECTION__USED_BY:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.SERVICE__SELECTIONS, Service.class, msgs);
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
			case WebsitePackage.SELECTION__USED_BY:
				return getUsedBy();
			case WebsitePackage.SELECTION__DISTINCT:
				return isDistinct();
			case WebsitePackage.SELECTION__FIELDS:
				return getFields();
			case WebsitePackage.SELECTION__PARAMETERS:
				return getParameters();
			case WebsitePackage.SELECTION__JOINS:
				return getJoins();
			case WebsitePackage.SELECTION__FILTER:
				return getFilter();
			case WebsitePackage.SELECTION__ORDERING:
				return getOrdering();
			case WebsitePackage.SELECTION__LIMIT:
				return getLimit();
			case WebsitePackage.SELECTION__SELECTED:
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
			case WebsitePackage.SELECTION__USED_BY:
				setUsedBy((Service)newValue);
				return;
			case WebsitePackage.SELECTION__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case WebsitePackage.SELECTION__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Feature>)newValue);
				return;
			case WebsitePackage.SELECTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SelectionParameter>)newValue);
				return;
			case WebsitePackage.SELECTION__JOINS:
				getJoins().clear();
				getJoins().addAll((Collection<? extends Association>)newValue);
				return;
			case WebsitePackage.SELECTION__FILTER:
				setFilter((Predicate)newValue);
				return;
			case WebsitePackage.SELECTION__ORDERING:
				getOrdering().clear();
				getOrdering().addAll((Collection<? extends Order>)newValue);
				return;
			case WebsitePackage.SELECTION__LIMIT:
				setLimit((Integer)newValue);
				return;
			case WebsitePackage.SELECTION__SELECTED:
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
			case WebsitePackage.SELECTION__USED_BY:
				setUsedBy((Service)null);
				return;
			case WebsitePackage.SELECTION__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case WebsitePackage.SELECTION__FIELDS:
				getFields().clear();
				return;
			case WebsitePackage.SELECTION__PARAMETERS:
				getParameters().clear();
				return;
			case WebsitePackage.SELECTION__JOINS:
				getJoins().clear();
				return;
			case WebsitePackage.SELECTION__FILTER:
				setFilter((Predicate)null);
				return;
			case WebsitePackage.SELECTION__ORDERING:
				getOrdering().clear();
				return;
			case WebsitePackage.SELECTION__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case WebsitePackage.SELECTION__SELECTED:
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
			case WebsitePackage.SELECTION__USED_BY:
				return getUsedBy() != null;
			case WebsitePackage.SELECTION__DISTINCT:
				return distinct != DISTINCT_EDEFAULT;
			case WebsitePackage.SELECTION__FIELDS:
				return fields != null && !fields.isEmpty();
			case WebsitePackage.SELECTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case WebsitePackage.SELECTION__JOINS:
				return joins != null && !joins.isEmpty();
			case WebsitePackage.SELECTION__FILTER:
				return filter != null;
			case WebsitePackage.SELECTION__ORDERING:
				return ordering != null && !ordering.isEmpty();
			case WebsitePackage.SELECTION__LIMIT:
				return limit != LIMIT_EDEFAULT;
			case WebsitePackage.SELECTION__SELECTED:
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

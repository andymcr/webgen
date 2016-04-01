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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.ChildFeature;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.View;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ViewFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getEncapsulatedBy <em>Encapsulated By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewAssociationImpl extends NamedDisplayElementImpl implements ViewAssociation {
	/**
	 * The default value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String headerClass = HEADER_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected String displayClass = DISPLAY_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String footerClass = FOOTER_CLASS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getChildFeature() <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildFeature()
	 * @generated
	 * @ordered
	 */
	protected ChildFeature childFeature;
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
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected EncapsulatedAssociation opposite;
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.OPTIONAL;
	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;
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
	public String getHeaderClass() {
		return headerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderClass(String newHeaderClass) {
		String oldHeaderClass = headerClass;
		headerClass = newHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS, oldHeaderClass, headerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayClass() {
		return displayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayClass(String newDisplayClass) {
		String oldDisplayClass = displayClass;
		displayClass = newDisplayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS, oldDisplayClass, displayClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooterClass() {
		return footerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterClass(String newFooterClass) {
		String oldFooterClass = footerClass;
		footerClass = newFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getPartOf() {
		if (eContainerFeatureID() != WebsitePackage.VIEW_ASSOCIATION__PART_OF) return null;
		return (View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(View newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WebsitePackage.VIEW_ASSOCIATION__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(View newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.VIEW_ASSOCIATION__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, WebsitePackage.VIEW__VIEW_FEATURES, View.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildFeature getChildFeature() {
		return childFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildFeature(ChildFeature newChildFeature, NotificationChain msgs) {
		ChildFeature oldChildFeature = childFeature;
		childFeature = newChildFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE, oldChildFeature, newChildFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildFeature(ChildFeature newChildFeature) {
		if (newChildFeature != childFeature) {
			NotificationChain msgs = null;
			if (childFeature != null)
				msgs = ((InternalEObject)childFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE, null, msgs);
			if (newChildFeature != null)
				msgs = ((InternalEObject)newChildFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE, null, msgs);
			msgs = basicSetChildFeature(newChildFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE, newChildFeature, newChildFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EncapsulatedAssociation> getEncapsulatedBy() {
		if (encapsulatedBy == null) {
			encapsulatedBy = new EObjectWithInverseResolvingEList<EncapsulatedAssociation>(EncapsulatedAssociation.class, this, WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY, WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION);
		}
		return encapsulatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__CARDINALITY, oldCardinality, cardinality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS, oldInputClass, inputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAssociation getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (EncapsulatedAssociation)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.VIEW_ASSOCIATION__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAssociation basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(EncapsulatedAssociation newOpposite) {
		EncapsulatedAssociation oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__OPPOSITE, oldOpposite, opposite));
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
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((View)otherEnd, msgs);
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEncapsulatedBy()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return basicSetPartOf(null, msgs);
			case WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE:
				return basicSetChildFeature(null, msgs);
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				return ((InternalEList<?>)getEncapsulatedBy()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.VIEW__VIEW_FEATURES, View.class, msgs);
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
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				return getHeaderClass();
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				return getDisplayClass();
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				return getFooterClass();
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return getPartOf();
			case WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE:
				return getChildFeature();
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				return getEncapsulatedBy();
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				return getInputClass();
			case WebsitePackage.VIEW_ASSOCIATION__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
				return getCardinality();
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
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				setPartOf((View)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((ChildFeature)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				getEncapsulatedBy().addAll((Collection<? extends EncapsulatedAssociation>)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__OPPOSITE:
				setOpposite((EncapsulatedAssociation)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
				setCardinality((Cardinality)newValue);
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
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				setPartOf((View)null);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((ChildFeature)null);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				return;
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__OPPOSITE:
				setOpposite((EncapsulatedAssociation)null);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
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
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return getPartOf() != null;
			case WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE:
				return childFeature != null;
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				return encapsulatedBy != null && !encapsulatedBy.isEmpty();
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case WebsitePackage.VIEW_ASSOCIATION__OPPOSITE:
				return opposite != null;
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
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
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS: return WebsitePackage.FEATURE__HEADER_CLASS;
				case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS: return WebsitePackage.FEATURE__DISPLAY_CLASS;
				case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS: return WebsitePackage.FEATURE__FOOTER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ViewFeature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.VIEW_ASSOCIATION__PART_OF: return WebsitePackage.VIEW_FEATURE__PART_OF;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE: return WebsitePackage.ASSOCIATION__CHILD_FEATURE;
				case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY: return WebsitePackage.ASSOCIATION__ENCAPSULATED_BY;
				case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS: return WebsitePackage.ASSOCIATION__INPUT_CLASS;
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
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case WebsitePackage.FEATURE__HEADER_CLASS: return WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS;
				case WebsitePackage.FEATURE__DISPLAY_CLASS: return WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS;
				case WebsitePackage.FEATURE__FOOTER_CLASS: return WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ViewFeature.class) {
			switch (baseFeatureID) {
				case WebsitePackage.VIEW_FEATURE__PART_OF: return WebsitePackage.VIEW_ASSOCIATION__PART_OF;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case WebsitePackage.ASSOCIATION__CHILD_FEATURE: return WebsitePackage.VIEW_ASSOCIATION__CHILD_FEATURE;
				case WebsitePackage.ASSOCIATION__ENCAPSULATED_BY: return WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY;
				case WebsitePackage.ASSOCIATION__INPUT_CLASS: return WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS;
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
		result.append(" (headerClass: ");
		result.append(headerClass);
		result.append(", displayClass: ");
		result.append(displayClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //ViewAssociationImpl

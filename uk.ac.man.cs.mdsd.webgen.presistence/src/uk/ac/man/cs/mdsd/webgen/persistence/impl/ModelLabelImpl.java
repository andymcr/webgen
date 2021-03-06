/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.base.impl.NamedElementImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelFeature;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelImpl#getLabelFor <em>Label For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelImpl#isCustomise <em>Customise</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ModelLabelImpl#getSerializationGroups <em>Serialization Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelLabelImpl extends NamedElementImpl implements ModelLabel {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCustomise() <em>Customise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOMISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCustomise() <em>Customise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomise()
	 * @generated
	 * @ordered
	 */
	protected boolean customise = CUSTOMISE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelLabelFeature> features;

	/**
	 * The cached value of the '{@link #getSerializationGroups() <em>Serialization Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SerializationGroup> serializationGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.MODEL_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getLabelFor() {
		if (eContainerFeatureID() != PersistencePackage.MODEL_LABEL__LABEL_FOR) return null;
		return (EntityOrView)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelFor(EntityOrView newLabelFor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLabelFor, PersistencePackage.MODEL_LABEL__LABEL_FOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelFor(EntityOrView newLabelFor) {
		if (newLabelFor != eInternalContainer() || (eContainerFeatureID() != PersistencePackage.MODEL_LABEL__LABEL_FOR && newLabelFor != null)) {
			if (EcoreUtil.isAncestor(this, newLabelFor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLabelFor != null)
				msgs = ((InternalEObject)newLabelFor).eInverseAdd(this, PersistencePackage.ENTITY_OR_VIEW__LABELS, EntityOrView.class, msgs);
			msgs = basicSetLabelFor(newLabelFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.MODEL_LABEL__LABEL_FOR, newLabelFor, newLabelFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.MODEL_LABEL__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomise() {
		return customise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomise(boolean newCustomise) {
		boolean oldCustomise = customise;
		customise = newCustomise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.MODEL_LABEL__CUSTOMISE, oldCustomise, customise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelLabelFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<ModelLabelFeature>(ModelLabelFeature.class, this, PersistencePackage.MODEL_LABEL__FEATURES, PersistencePackage.MODEL_LABEL_FEATURE__PART_OF);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializationGroup> getSerializationGroups() {
		if (serializationGroups == null) {
			serializationGroups = new EObjectResolvingEList<SerializationGroup>(SerializationGroup.class, this, PersistencePackage.MODEL_LABEL__SERIALIZATION_GROUPS);
		}
		return serializationGroups;
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
			case PersistencePackage.MODEL_LABEL__LABEL_FOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLabelFor((EntityOrView)otherEnd, msgs);
			case PersistencePackage.MODEL_LABEL__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
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
			case PersistencePackage.MODEL_LABEL__LABEL_FOR:
				return basicSetLabelFor(null, msgs);
			case PersistencePackage.MODEL_LABEL__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case PersistencePackage.MODEL_LABEL__LABEL_FOR:
				return eInternalContainer().eInverseRemove(this, PersistencePackage.ENTITY_OR_VIEW__LABELS, EntityOrView.class, msgs);
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
			case PersistencePackage.MODEL_LABEL__LABEL_FOR:
				return getLabelFor();
			case PersistencePackage.MODEL_LABEL__FORMAT:
				return getFormat();
			case PersistencePackage.MODEL_LABEL__CUSTOMISE:
				return isCustomise();
			case PersistencePackage.MODEL_LABEL__FEATURES:
				return getFeatures();
			case PersistencePackage.MODEL_LABEL__SERIALIZATION_GROUPS:
				return getSerializationGroups();
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
			case PersistencePackage.MODEL_LABEL__LABEL_FOR:
				setLabelFor((EntityOrView)newValue);
				return;
			case PersistencePackage.MODEL_LABEL__FORMAT:
				setFormat((String)newValue);
				return;
			case PersistencePackage.MODEL_LABEL__CUSTOMISE:
				setCustomise((Boolean)newValue);
				return;
			case PersistencePackage.MODEL_LABEL__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ModelLabelFeature>)newValue);
				return;
			case PersistencePackage.MODEL_LABEL__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				getSerializationGroups().addAll((Collection<? extends SerializationGroup>)newValue);
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
			case PersistencePackage.MODEL_LABEL__LABEL_FOR:
				setLabelFor((EntityOrView)null);
				return;
			case PersistencePackage.MODEL_LABEL__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case PersistencePackage.MODEL_LABEL__CUSTOMISE:
				setCustomise(CUSTOMISE_EDEFAULT);
				return;
			case PersistencePackage.MODEL_LABEL__FEATURES:
				getFeatures().clear();
				return;
			case PersistencePackage.MODEL_LABEL__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
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
			case PersistencePackage.MODEL_LABEL__LABEL_FOR:
				return getLabelFor() != null;
			case PersistencePackage.MODEL_LABEL__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case PersistencePackage.MODEL_LABEL__CUSTOMISE:
				return customise != CUSTOMISE_EDEFAULT;
			case PersistencePackage.MODEL_LABEL__FEATURES:
				return features != null && !features.isEmpty();
			case PersistencePackage.MODEL_LABEL__SERIALIZATION_GROUPS:
				return serializationGroups != null && !serializationGroups.isEmpty();
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
		result.append(" (format: ");
		result.append(format);
		result.append(", customise: ");
		result.append(customise);
		result.append(')');
		return result.toString();
	}

} //ModelLabelImpl

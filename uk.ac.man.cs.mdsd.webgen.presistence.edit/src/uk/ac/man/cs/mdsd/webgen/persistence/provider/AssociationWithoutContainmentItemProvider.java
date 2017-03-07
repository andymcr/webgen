/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationWithoutContainmentItemProvider extends EntityAssociationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationWithoutContainmentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTargetCardinalityPropertyDescriptor(object);
			addTargetUniquePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssociationWithoutContainment_targetCardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssociationWithoutContainment_targetCardinality_feature", "_UI_AssociationWithoutContainment_type"),
				 PersistencePackage.Literals.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssociationWithoutContainment_targetUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssociationWithoutContainment_targetUnique_feature", "_UI_AssociationWithoutContainment_type"),
				 PersistencePackage.Literals.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This returns AssociationWithoutContainment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssociationWithoutContainment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((AssociationWithoutContainment)object).getName();
		String targetLabel = ((EntityAssociation) object).getTargetFeatureName();
		if ((targetLabel != null) && (targetLabel.length() == 0)) {
			targetLabel = null;
		}
		return label == null || label.length() == 0
			? getString("_UI_AssociationWithoutContainment_type")
				+ (targetLabel == null ? "" : targetLabel)
			: getString("_UI_AssociationWithoutContainment_type") + " " + label
				+ (targetLabel == null ? "" : " (" + targetLabel + ")");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AssociationWithoutContainment.class)) {
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY:
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}

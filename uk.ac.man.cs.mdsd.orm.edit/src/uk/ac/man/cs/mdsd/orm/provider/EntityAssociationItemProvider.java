/**
 */
package uk.ac.man.cs.mdsd.orm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.orm.EntityAssociation;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.orm.EntityAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityAssociationItemProvider extends EntityFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addOppositePropertyDescriptor(object);
			addContainerPropertyDescriptor(object);
			addContainsPropertyDescriptor(object);
			addOwningEndPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addPivotTableNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Opposite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOppositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_opposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_opposite_feature", "_UI_EntityAssociation_type"),
				 OrmPackage.Literals.ENTITY_ASSOCIATION__OPPOSITE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_container_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_container_feature", "_UI_EntityAssociation_type"),
				 OrmPackage.Literals.ENTITY_ASSOCIATION__CONTAINER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contains feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_contains_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_contains_feature", "_UI_EntityAssociation_type"),
				 OrmPackage.Literals.ENTITY_ASSOCIATION__CONTAINS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owning End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_owningEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_owningEnd_feature", "_UI_EntityAssociation_type"),
				 OrmPackage.Literals.ENTITY_ASSOCIATION__OWNING_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_visible_feature", "_UI_EntityAssociation_type"),
				 OrmPackage.Literals.ENTITY_ASSOCIATION__VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pivot Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPivotTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_pivotTableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_pivotTableName_feature", "_UI_EntityAssociation_type"),
				 OrmPackage.Literals.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EntityAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EntityAssociation_type") :
			getString("_UI_EntityAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(EntityAssociation.class)) {
			case OrmPackage.ENTITY_ASSOCIATION__CONTAINER:
			case OrmPackage.ENTITY_ASSOCIATION__CONTAINS:
			case OrmPackage.ENTITY_ASSOCIATION__OWNING_END:
			case OrmPackage.ENTITY_ASSOCIATION__VISIBLE:
			case OrmPackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME:
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

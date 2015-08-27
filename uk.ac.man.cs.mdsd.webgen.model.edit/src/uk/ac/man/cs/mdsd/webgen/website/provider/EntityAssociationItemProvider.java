/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityAssociationItemProvider extends AssociationItemProvider {
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

			addColumnNamePropertyDescriptor(object);
			addCardinalityPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addOrderedPropertyDescriptor(object);
			addTargetEntityPropertyDescriptor(object);
			addBidirectionalPropertyDescriptor(object);
			addPivotTableNamePropertyDescriptor(object);
			addInputClassPropertyDescriptor(object);
			addTargetFeatureNamePropertyDescriptor(object);
			addTargetDisplayLabelPropertyDescriptor(object);
			addTargetHeaderClassPropertyDescriptor(object);
			addTargetInputClassPropertyDescriptor(object);
			addTargetDisplayClassPropertyDescriptor(object);
			addTargetFooterClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Column Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityFeature_columnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityFeature_columnName_feature", "_UI_EntityFeature_type"),
				 WebsitePackage.Literals.ENTITY_FEATURE__COLUMN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_PersistencePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityFeature_cardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityFeature_cardinality_feature", "_UI_EntityFeature_type"),
				 WebsitePackage.Literals.ENTITY_FEATURE__CARDINALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityFeature_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityFeature_unique_feature", "_UI_EntityFeature_type"),
				 WebsitePackage.Literals.ENTITY_FEATURE__UNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityFeature_ordered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityFeature_ordered_feature", "_UI_EntityFeature_type"),
				 WebsitePackage.Literals.ENTITY_FEATURE__ORDERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_targetEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_targetEntity_feature", "_UI_EntityAssociation_type"),
				 WebsitePackage.Literals.ENTITY_ASSOCIATION__TARGET_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bidirectional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBidirectionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_bidirectional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_bidirectional_feature", "_UI_EntityAssociation_type"),
				 WebsitePackage.Literals.ENTITY_ASSOCIATION__BIDIRECTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
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
				 WebsitePackage.Literals.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_PersistencePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_inputClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_inputClass_feature", "_UI_EntityAssociation_type"),
				 WebsitePackage.Literals.ENTITY_ASSOCIATION__INPUT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Feature Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetFeatureNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_targetFeatureName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_targetFeatureName_feature", "_UI_EntityAssociation_type"),
				 WebsitePackage.Literals.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Display Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetDisplayLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_targetDisplayLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_targetDisplayLabel_feature", "_UI_EntityAssociation_type"),
				 WebsitePackage.Literals.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_targetHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_targetHeaderClass_feature", "_UI_EntityAssociation_type"),
				 WebsitePackage.Literals.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Input Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetInputClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_targetInputClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_targetInputClass_feature", "_UI_EntityAssociation_type"),
				 WebsitePackage.Literals.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Display Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetDisplayClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_targetDisplayClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_targetDisplayClass_feature", "_UI_EntityAssociation_type"),
				 WebsitePackage.Literals.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityAssociation_targetFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityAssociation_targetFooterClass_feature", "_UI_EntityAssociation_type"),
				 WebsitePackage.Literals.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
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
			case WebsitePackage.ENTITY_ASSOCIATION__COLUMN_NAME:
			case WebsitePackage.ENTITY_ASSOCIATION__CARDINALITY:
			case WebsitePackage.ENTITY_ASSOCIATION__UNIQUE:
			case WebsitePackage.ENTITY_ASSOCIATION__ORDERED:
			case WebsitePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL:
			case WebsitePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME:
			case WebsitePackage.ENTITY_ASSOCIATION__INPUT_CLASS:
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME:
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL:
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS:
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS:
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS:
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS:
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

/**
 */
package uk.ac.man.cs.mdsd.orm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.orm.EntityOrView;
import uk.ac.man.cs.mdsd.orm.OrmFactory;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.orm.EntityOrView} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityOrViewItemProvider extends ClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrViewItemProvider(AdapterFactory adapterFactory) {
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

			addPartOfPropertyDescriptor(object);
			addSingletonNamePropertyDescriptor(object);
			addPluralisedNamePropertyDescriptor(object);
			addKeysPropertyDescriptor(object);
			addTableNamePropertyDescriptor(object);
			addAutoKeyNamePropertyDescriptor(object);
			addAutoKeyPersistentTypePropertyDescriptor(object);
			addAutoKeyGenerationStrategyPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addContainerUniquePropertyDescriptor(object);
			addImplementsUserInterfacePropertyDescriptor(object);
			addAllowFormTypeCustomisationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Part Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_partOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_partOf_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__PART_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Singleton Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSingletonNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_singletonName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_singletonName_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__SINGLETON_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pluralised Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluralisedNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_pluralisedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_pluralisedName_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__PLURALISED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_keys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_keys_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__KEYS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Key Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoKeyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_autoKeyName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_autoKeyName_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__AUTO_KEY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Key Persistent Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoKeyPersistentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_autoKeyPersistentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_autoKeyPersistentType_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Key Generation Strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoKeyGenerationStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_autoKeyGenerationStrategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_autoKeyGenerationStrategy_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_EntityOrView_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_unique_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__UNIQUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_containerUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_containerUnique_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__CONTAINER_UNIQUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_tableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_tableName_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__TABLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implements User Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsUserInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_implementsUserInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_implementsUserInterface_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Form Type Customisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowFormTypeCustomisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityOrView_allowFormTypeCustomisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityOrView_allowFormTypeCustomisation_feature", "_UI_EntityOrView_type"),
				 OrmPackage.Literals.ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES);
			childrenFeatures.add(OrmPackage.Literals.ENTITY_OR_VIEW__LABELS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EntityOrView)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EntityOrView_type") :
			getString("_UI_EntityOrView_type") + " " + label;
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

		switch (notification.getFeatureID(EntityOrView.class)) {
			case OrmPackage.ENTITY_OR_VIEW__SINGLETON_NAME:
			case OrmPackage.ENTITY_OR_VIEW__PLURALISED_NAME:
			case OrmPackage.ENTITY_OR_VIEW__TABLE_NAME:
			case OrmPackage.ENTITY_OR_VIEW__AUTO_KEY_NAME:
			case OrmPackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE:
			case OrmPackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY:
			case OrmPackage.ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE:
			case OrmPackage.ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ENTITY_OR_VIEW__FEATURES:
			case OrmPackage.ENTITY_OR_VIEW__LABELS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createSingletonElement()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createCollectionElement()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createSingletonDate()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createCollectionDate()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createSingletonURL()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createSingletonFile()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createSingletonImage()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createSingletonLocation()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createSingletonAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createCollectionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createEncapsulatedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createEncapsulatedAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__FEATURES,
				 OrmFactory.eINSTANCE.createViewAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY_OR_VIEW__LABELS,
				 OrmFactory.eINSTANCE.createModelLabel()));
	}

}

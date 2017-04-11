/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import uk.ac.man.cs.mdsd.webgen.base.BaseFactory;
import uk.ac.man.cs.mdsd.webgen.persistence.Persistence;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistenceFactory;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.Persistence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceItemProvider(AdapterFactory adapterFactory) {
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

			addOrmTechnologyPropertyDescriptor(object);
			addDatabaseTechnologyPropertyDescriptor(object);
			addDatabasePrefixPropertyDescriptor(object);
			addDatabaseHostPropertyDescriptor(object);
			addDatabaseNamePropertyDescriptor(object);
			addDatabasePortPropertyDescriptor(object);
			addDatabaseUsernamePropertyDescriptor(object);
			addDatabasePasswordPropertyDescriptor(object);
			addTimestampCreationPropertyDescriptor(object);
			addTimestampUpdatesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Orm Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrmTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persistence_ormTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persistence_ormTechnology_feature", "_UI_Persistence_type"),
				 PersistencePackage.Literals.PERSISTENCE__ORM_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_OrmPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persistence_databaseTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persistence_databaseTechnology_feature", "_UI_Persistence_type"),
				 PersistencePackage.Literals.PERSISTENCE__DATABASE_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabasePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persistence_databasePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persistence_databasePrefix_feature", "_UI_Persistence_type"),
				 PersistencePackage.Literals.PERSISTENCE__DATABASE_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persistence_databaseHost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persistence_databaseHost_feature", "_UI_Persistence_type"),
				 PersistencePackage.Literals.PERSISTENCE__DATABASE_HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persistence_databaseName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persistence_databaseName_feature", "_UI_Persistence_type"),
				 PersistencePackage.Literals.PERSISTENCE__DATABASE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabasePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persistence_databasePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persistence_databasePort_feature", "_UI_Persistence_type"),
				 PersistencePackage.Literals.PERSISTENCE__DATABASE_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Username feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseUsernamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persistence_databaseUsername_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persistence_databaseUsername_feature", "_UI_Persistence_type"),
				 PersistencePackage.Literals.PERSISTENCE__DATABASE_USERNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabasePasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persistence_databasePassword_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persistence_databasePassword_feature", "_UI_Persistence_type"),
				 PersistencePackage.Literals.PERSISTENCE__DATABASE_PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamp Creation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampCreationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persistence_timestampCreation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persistence_timestampCreation_feature", "_UI_Persistence_type"),
				 PersistencePackage.Literals.PERSISTENCE__TIMESTAMP_CREATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_OrmPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamp Updates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampUpdatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persistence_timestampUpdates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persistence_timestampUpdates_feature", "_UI_Persistence_type"),
				 PersistencePackage.Literals.PERSISTENCE__TIMESTAMP_UPDATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_OrmPropertyCategory"),
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
			childrenFeatures.add(PersistencePackage.Literals.PERSISTENCE__SERIALIZATION_GROUPS);
			childrenFeatures.add(PersistencePackage.Literals.PERSISTENCE__DATA_TYPES);
			childrenFeatures.add(PersistencePackage.Literals.PERSISTENCE__ENTITIES);
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
	 * This returns Persistence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Persistence"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Persistence)object).getDatabaseName();
		return label == null || label.length() == 0 ?
			getString("_UI_Persistence_type") :
			getString("_UI_Persistence_type") + " " + label;
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

		switch (notification.getFeatureID(Persistence.class)) {
			case PersistencePackage.PERSISTENCE__ORM_TECHNOLOGY:
			case PersistencePackage.PERSISTENCE__DATABASE_TECHNOLOGY:
			case PersistencePackage.PERSISTENCE__DATABASE_PREFIX:
			case PersistencePackage.PERSISTENCE__DATABASE_HOST:
			case PersistencePackage.PERSISTENCE__DATABASE_NAME:
			case PersistencePackage.PERSISTENCE__DATABASE_PORT:
			case PersistencePackage.PERSISTENCE__DATABASE_USERNAME:
			case PersistencePackage.PERSISTENCE__DATABASE_PASSWORD:
			case PersistencePackage.PERSISTENCE__TIMESTAMP_CREATION:
			case PersistencePackage.PERSISTENCE__TIMESTAMP_UPDATES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PersistencePackage.PERSISTENCE__SERIALIZATION_GROUPS:
			case PersistencePackage.PERSISTENCE__DATA_TYPES:
			case PersistencePackage.PERSISTENCE__ENTITIES:
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
				(PersistencePackage.Literals.PERSISTENCE__SERIALIZATION_GROUPS,
				 PersistenceFactory.eINSTANCE.createSerializationGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.PERSISTENCE__DATA_TYPES,
				 BaseFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.PERSISTENCE__DATA_TYPES,
				 BaseFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.PERSISTENCE__ENTITIES,
				 PersistenceFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.PERSISTENCE__ENTITIES,
				 PersistenceFactory.eINSTANCE.createView()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PersistenceEditPlugin.INSTANCE;
	}

}

/**
 */
package uk.ac.man.cs.mdsd.webgen.api.provider;


import java.util.Collection;
import java.util.Collections;
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

import uk.ac.man.cs.mdsd.webgen.api.ApiFactory;
import uk.ac.man.cs.mdsd.webgen.api.ApiPackage;
import uk.ac.man.cs.mdsd.webgen.api.Resource;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.api.Resource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceItemProvider 
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
	public ResourceItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addServicePropertyDescriptor(object);
			addUriElementPropertyDescriptor(object);
			addEnableDefaultGetAllPropertyDescriptor(object);
			addEnableDefaultGetOnePropertyDescriptor(object);
			addGetAllPropertyDescriptor(object);
			addGetOnePropertyDescriptor(object);
			addDefaultSerializationGroupsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_name_feature", "_UI_Resource_type"),
				 ApiPackage.Literals.RESOURCE__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_service_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_service_feature", "_UI_Resource_type"),
				 ApiPackage.Literals.RESOURCE__SERVICE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_uriElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_uriElement_feature", "_UI_Resource_type"),
				 ApiPackage.Literals.RESOURCE__URI_ELEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Default Get All feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableDefaultGetAllPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_enableDefaultGetAll_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_enableDefaultGetAll_feature", "_UI_Resource_type"),
				 ApiPackage.Literals.RESOURCE__ENABLE_DEFAULT_GET_ALL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Default Get One feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableDefaultGetOnePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_enableDefaultGetOne_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_enableDefaultGetOne_feature", "_UI_Resource_type"),
				 ApiPackage.Literals.RESOURCE__ENABLE_DEFAULT_GET_ONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Get All feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addGetAllPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Resource_getAll_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Resource_getAll_feature", "_UI_Resource_type"),
			ApiPackage.Literals.RESOURCE__GET_ALL,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof Resource) {
						final Resource resource = (Resource) object;
						if (resource.getService() != null) {
							return resource.getService().getSelections();
						}
					}
					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Get One feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addGetOnePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Resource_getOne_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Resource_getOne_feature", "_UI_Resource_type"),
			ApiPackage.Literals.RESOURCE__GET_ONE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof Resource) {
						final Resource resource = (Resource) object;
						if (resource.getService() != null) {
							return resource.getService().getSelections();
						}
					}
					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Default Serialization Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSerializationGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_defaultSerializationGroups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_defaultSerializationGroups_feature", "_UI_Resource_type"),
				 ApiPackage.Literals.RESOURCE__DEFAULT_SERIALIZATION_GROUPS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SerializationPropertyCategory"),
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
			childrenFeatures.add(ApiPackage.Literals.RESOURCE__CHILD_RESOURCES);
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
	 * This returns Resource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Resource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Resource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Resource_type") :
			getString("_UI_Resource_type") + " " + label;
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

		switch (notification.getFeatureID(Resource.class)) {
			case ApiPackage.RESOURCE__NAME:
			case ApiPackage.RESOURCE__URI_ELEMENT:
			case ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ALL:
			case ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ONE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApiPackage.RESOURCE__CHILD_RESOURCES:
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
				(ApiPackage.Literals.RESOURCE__CHILD_RESOURCES,
				 ApiFactory.eINSTANCE.createResource()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ApiEditPlugin.INSTANCE;
	}

}

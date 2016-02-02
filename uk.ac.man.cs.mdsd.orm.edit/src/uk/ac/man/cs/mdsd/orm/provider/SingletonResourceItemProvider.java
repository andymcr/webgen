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

import uk.ac.man.cs.mdsd.orm.OrmFactory;
import uk.ac.man.cs.mdsd.orm.OrmPackage;
import uk.ac.man.cs.mdsd.orm.SingletonResource;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.orm.SingletonResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SingletonResourceItemProvider
	extends SingletonAttributeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonResourceItemProvider(AdapterFactory adapterFactory) {
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

			addMaximumUploadSizePropertyDescriptor(object);
			addValidUploadMimeTypesPropertyDescriptor(object);
			addValidUploadExtensionsPropertyDescriptor(object);
			addUploadsWithinWebsitePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Maximum Upload Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumUploadSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingletonResource_maximumUploadSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingletonResource_maximumUploadSize_feature", "_UI_SingletonResource_type"),
				 OrmPackage.Literals.SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Upload Mime Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidUploadMimeTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingletonResource_validUploadMimeTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingletonResource_validUploadMimeTypes_feature", "_UI_SingletonResource_type"),
				 OrmPackage.Literals.SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Upload Extensions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidUploadExtensionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingletonResource_validUploadExtensions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingletonResource_validUploadExtensions_feature", "_UI_SingletonResource_type"),
				 OrmPackage.Literals.SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uploads Within Website feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUploadsWithinWebsitePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingletonResource_uploadsWithinWebsite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingletonResource_uploadsWithinWebsite_feature", "_UI_SingletonResource_type"),
				 OrmPackage.Literals.SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE,
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
			childrenFeatures.add(OrmPackage.Literals.SINGLETON_RESOURCE__UPLOAD_PATH);
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
		String label = ((SingletonResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SingletonResource_type") :
			getString("_UI_SingletonResource_type") + " " + label;
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

		switch (notification.getFeatureID(SingletonResource.class)) {
			case OrmPackage.SINGLETON_RESOURCE__MAXIMUM_UPLOAD_SIZE:
			case OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_MIME_TYPES:
			case OrmPackage.SINGLETON_RESOURCE__VALID_UPLOAD_EXTENSIONS:
			case OrmPackage.SINGLETON_RESOURCE__UPLOADS_WITHIN_WEBSITE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.SINGLETON_RESOURCE__UPLOAD_PATH:
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
				(OrmPackage.Literals.SINGLETON_RESOURCE__UPLOAD_PATH,
				 OrmFactory.eINSTANCE.createStaticPathElement()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.SINGLETON_RESOURCE__UPLOAD_PATH,
				 OrmFactory.eINSTANCE.createDatePathElement()));
	}

}

/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.ImageUnit;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageUnitItemProvider 
	extends DynamicUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageUnitItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultSelectionPropertyDescriptor(object);
			addMissingImagePathPropertyDescriptor(object);
			addThumbnailFilterPropertyDescriptor(object);
			addImageFilterPropertyDescriptor(object);
			addShowTimePropertyDescriptor(object);
			addTransitionTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDefaultSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ImageUnit_defaultSelection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_defaultSelection_feature", "_UI_ImageUnit_type"),
			WebsitePackage.Literals.IMAGE_UNIT__DEFAULT_SELECTION,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof ImageUnit) {
						return getSelections((ImageUnit) object);
					}
					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Missing Image Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMissingImagePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_missingImagePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_missingImagePath_feature", "_UI_ImageUnit_type"),
				 WebsitePackage.Literals.IMAGE_UNIT__MISSING_IMAGE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ImagePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Thumbnail Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThumbnailFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_thumbnailFilter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_thumbnailFilter_feature", "_UI_ImageUnit_type"),
				 WebsitePackage.Literals.IMAGE_UNIT__THUMBNAIL_FILTER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ImagePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_imageFilter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_imageFilter_feature", "_UI_ImageUnit_type"),
				 WebsitePackage.Literals.IMAGE_UNIT__IMAGE_FILTER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ImagePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_showTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_showTime_feature", "_UI_ImageUnit_type"),
				 WebsitePackage.Literals.IMAGE_UNIT__SHOW_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Transition Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_transitionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_transitionTime_feature", "_UI_ImageUnit_type"),
				 WebsitePackage.Literals.IMAGE_UNIT__TRANSITION_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
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
			childrenFeatures.add(WebsitePackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE);
			childrenFeatures.add(WebsitePackage.Literals.IMAGE_UNIT__TITLE_FEATURE);
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
		String label = ((ImageUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ImageUnit_type") :
			getString("_UI_ImageUnit_type") + " " + label;
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

		switch (notification.getFeatureID(ImageUnit.class)) {
			case WebsitePackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
			case WebsitePackage.IMAGE_UNIT__SHOW_TIME:
			case WebsitePackage.IMAGE_UNIT__TRANSITION_TIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebsitePackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
			case WebsitePackage.IMAGE_UNIT__TITLE_FEATURE:
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
				(WebsitePackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WebsiteFactory.eINSTANCE.createUnitAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WebsiteFactory.eINSTANCE.createFeaturePathAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WebsiteFactory.eINSTANCE.createFeaturePathAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WebsiteFactory.eINSTANCE.createChildAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.IMAGE_UNIT__TITLE_FEATURE,
				 WebsiteFactory.eINSTANCE.createUnitAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.IMAGE_UNIT__TITLE_FEATURE,
				 WebsiteFactory.eINSTANCE.createFeaturePathAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.IMAGE_UNIT__TITLE_FEATURE,
				 WebsiteFactory.eINSTANCE.createFeaturePathAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.IMAGE_UNIT__TITLE_FEATURE,
				 WebsiteFactory.eINSTANCE.createChildAssociation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WebsitePackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS ||
			childFeature == WebsitePackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE ||
			childFeature == WebsitePackage.Literals.IMAGE_UNIT__TITLE_FEATURE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

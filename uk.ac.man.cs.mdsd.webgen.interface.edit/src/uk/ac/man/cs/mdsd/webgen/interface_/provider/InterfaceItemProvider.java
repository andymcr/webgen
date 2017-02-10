/**
 */
package uk.ac.man.cs.mdsd.webgen.interface_.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.interface_.Interface;
import uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfaceFactory;
import uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.interface_.Interface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceItemProvider 
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
	public InterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultDateFormatPropertyDescriptor(object);
			addDefaultTimeFormatPropertyDescriptor(object);
			addDefaultDateTimeFormatPropertyDescriptor(object);
			addDefaultMaximumUploadSizePropertyDescriptor(object);
			addResponsiveTopMenuPropertyDescriptor(object);
			addTopNavigationIdPropertyDescriptor(object);
			addSideMenuPropertyDescriptor(object);
			addSiteTemplatePropertyDescriptor(object);
			addStaticUnitsEditablePropertyDescriptor(object);
			addTextEditorURLPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Date Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDateFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_defaultDateFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_defaultDateFormat_feature", "_UI_Interface_type"),
				 WebGenInterfacePackage.Literals.INTERFACE__DEFAULT_DATE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Time Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTimeFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_defaultTimeFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_defaultTimeFormat_feature", "_UI_Interface_type"),
				 WebGenInterfacePackage.Literals.INTERFACE__DEFAULT_TIME_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Date Time Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDateTimeFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_defaultDateTimeFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_defaultDateTimeFormat_feature", "_UI_Interface_type"),
				 WebGenInterfacePackage.Literals.INTERFACE__DEFAULT_DATE_TIME_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Maximum Upload Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultMaximumUploadSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_defaultMaximumUploadSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_defaultMaximumUploadSize_feature", "_UI_Interface_type"),
				 WebGenInterfacePackage.Literals.INTERFACE__DEFAULT_MAXIMUM_UPLOAD_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Responsive Top Menu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsiveTopMenuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_responsiveTopMenu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_responsiveTopMenu_feature", "_UI_Interface_type"),
				 WebGenInterfacePackage.Literals.INTERFACE__RESPONSIVE_TOP_MENU,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Navigation Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopNavigationIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_topNavigationId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_topNavigationId_feature", "_UI_Interface_type"),
				 WebGenInterfacePackage.Literals.INTERFACE__TOP_NAVIGATION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Side Menu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSideMenuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_sideMenu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_sideMenu_feature", "_UI_Interface_type"),
				 WebGenInterfacePackage.Literals.INTERFACE__SIDE_MENU,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Site Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSiteTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_siteTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_siteTemplate_feature", "_UI_Interface_type"),
				 WebGenInterfacePackage.Literals.INTERFACE__SITE_TEMPLATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static Units Editable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticUnitsEditablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_staticUnitsEditable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_staticUnitsEditable_feature", "_UI_Interface_type"),
				 WebGenInterfacePackage.Literals.INTERFACE__STATIC_UNITS_EDITABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Editor URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextEditorURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_textEditorURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_textEditorURL_feature", "_UI_Interface_type"),
				 WebGenInterfacePackage.Literals.INTERFACE__TEXT_EDITOR_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(WebGenInterfacePackage.Literals.INTERFACE__PAGES);
			childrenFeatures.add(WebGenInterfacePackage.Literals.INTERFACE__MENUS);
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
	 * This returns Interface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Interface)object).getDefaultDateFormat();
		return label == null || label.length() == 0 ?
			getString("_UI_Interface_type") :
			getString("_UI_Interface_type") + " " + label;
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

		switch (notification.getFeatureID(Interface.class)) {
			case WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_FORMAT:
			case WebGenInterfacePackage.INTERFACE__DEFAULT_TIME_FORMAT:
			case WebGenInterfacePackage.INTERFACE__DEFAULT_DATE_TIME_FORMAT:
			case WebGenInterfacePackage.INTERFACE__DEFAULT_MAXIMUM_UPLOAD_SIZE:
			case WebGenInterfacePackage.INTERFACE__RESPONSIVE_TOP_MENU:
			case WebGenInterfacePackage.INTERFACE__TOP_NAVIGATION_ID:
			case WebGenInterfacePackage.INTERFACE__SITE_TEMPLATE:
			case WebGenInterfacePackage.INTERFACE__STATIC_UNITS_EDITABLE:
			case WebGenInterfacePackage.INTERFACE__TEXT_EDITOR_URL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebGenInterfacePackage.INTERFACE__PAGES:
			case WebGenInterfacePackage.INTERFACE__MENUS:
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
				(WebGenInterfacePackage.Literals.INTERFACE__PAGES,
				 WebGenInterfaceFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.INTERFACE__MENUS,
				 WebGenInterfaceFactory.eINSTANCE.createStaticMenu()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.INTERFACE__MENUS,
				 WebGenInterfaceFactory.eINSTANCE.createDynamicMenu()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}

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
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.core.provider.NamedDisplayElementItemProvider;
import uk.ac.man.cs.mdsd.webgen.interface_.Page;
import uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfaceFactory;
import uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.interface_.Page} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PageItemProvider extends NamedDisplayElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageItemProvider(AdapterFactory adapterFactory) {
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

			addChildPagesPropertyDescriptor(object);
			addAuthenticatedPropertyDescriptor(object);
			addUriElementPropertyDescriptor(object);
			addTopMenuOptionPropertyDescriptor(object);
			addTopMenuRankPropertyDescriptor(object);
			addNavigationLabelPropertyDescriptor(object);
			addSideMenuPropertyDescriptor(object);
			addStyleClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Child Pages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildPagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_childPages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_childPages_feature", "_UI_Page_type"),
				 WebGenInterfacePackage.Literals.PAGE__CHILD_PAGES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authenticated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_authenticated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_authenticated_feature", "_UI_Page_type"),
				 WebGenInterfacePackage.Literals.PAGE__AUTHENTICATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_uriElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_uriElement_feature", "_UI_Page_type"),
				 WebGenInterfacePackage.Literals.PAGE__URI_ELEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Menu Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopMenuOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_topMenuOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_topMenuOption_feature", "_UI_Page_type"),
				 WebGenInterfacePackage.Literals.PAGE__TOP_MENU_OPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Menu Rank feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopMenuRankPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_topMenuRank_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_topMenuRank_feature", "_UI_Page_type"),
				 WebGenInterfacePackage.Literals.PAGE__TOP_MENU_RANK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Navigation Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNavigationLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_navigationLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_navigationLabel_feature", "_UI_Page_type"),
				 WebGenInterfacePackage.Literals.PAGE__NAVIGATION_LABEL,
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
				 getString("_UI_Page_sideMenu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_sideMenu_feature", "_UI_Page_type"),
				 WebGenInterfacePackage.Literals.PAGE__SIDE_MENU,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_styleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_styleClass_feature", "_UI_Page_type"),
				 WebGenInterfacePackage.Literals.PAGE__STYLE_CLASS,
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
			childrenFeatures.add(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS);
			childrenFeatures.add(WebGenInterfacePackage.Literals.PAGE__PARENT_PAGE);
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
	 * This returns Page.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Page"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Page)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Page_type") :
			getString("_UI_Page_type") + " " + label;
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

		switch (notification.getFeatureID(Page.class)) {
			case WebGenInterfacePackage.PAGE__AUTHENTICATED:
			case WebGenInterfacePackage.PAGE__URI_ELEMENT:
			case WebGenInterfacePackage.PAGE__TOP_MENU_OPTION:
			case WebGenInterfacePackage.PAGE__TOP_MENU_RANK:
			case WebGenInterfacePackage.PAGE__NAVIGATION_LABEL:
			case WebGenInterfacePackage.PAGE__STYLE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebGenInterfacePackage.PAGE__UNITS:
			case WebGenInterfacePackage.PAGE__PARENT_PAGE:
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
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createCreateSitemapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createCreateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createCreateUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createMapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createDetailsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createIndexUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createSearchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createImageIndexUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createSliderUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createGalleryUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createRegistrationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createLoginUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebGenInterfaceFactory.eINSTANCE.createForgottenPasswordUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenInterfacePackage.Literals.PAGE__PARENT_PAGE,
				 WebGenInterfaceFactory.eINSTANCE.createPageLink()));
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

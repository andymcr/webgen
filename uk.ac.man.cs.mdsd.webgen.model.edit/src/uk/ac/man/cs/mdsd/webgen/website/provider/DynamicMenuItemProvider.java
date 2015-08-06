/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import uk.ac.man.cs.mdsd.webgen.website.DynamicMenu;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityElement;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.DynamicMenu} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicMenuItemProvider
	extends MenuItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicMenuItemProvider(AdapterFactory adapterFactory) {
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

			addServicePropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addDynamicTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_DynamicMenu_service_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicMenu_service_feature", "_UI_DynamicMenu_type"),
				 WebsitePackage.Literals.DYNAMIC_MENU__SERVICE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DynamicMenu_selection_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DynamicMenu_selection_feature", "_UI_DynamicMenu_type"),
				 WebsitePackage.Literals.DYNAMIC_MENU__SELECTION,
				true, false, true, null,
				getString("_UI_InterfacePropertyCategory"),
				null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						if (object instanceof DynamicMenu) {
							final DynamicMenu menu = (DynamicMenu) object;
							final List<Selection> selections = new LinkedList<Selection>();
							if (menu.getService() != null) {
								selections.addAll(menu.getService().getSelections());
							}
							return selections;
						}
						return Collections.emptyList();
					}
			});
	}

	/**
	 * This adds a property descriptor for the Dynamic Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDynamicTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DynamicMenu_dynamicTitle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DynamicMenu_dynamicTitle_feature", "_UI_DynamicMenu_type"),
				 WebsitePackage.Literals.DYNAMIC_MENU__DYNAMIC_TITLE,
				true, false, true, null,
				getString("_UI_InterfacePropertyCategory"),
				null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						if (object instanceof DynamicMenu) {
							final DynamicMenu menu = (DynamicMenu) object;
							final List<ServiceEntityElement> elements = new LinkedList<ServiceEntityElement>();
							if (menu.getService() != null) {
								for (ServiceFeature includedFeature : menu.getService().getFeatures()) {
									if (includedFeature instanceof ServiceEntityElement) {
										elements.add((ServiceEntityElement) includedFeature);
									}
								}
							}
							return elements;
						}
						return Collections.emptyList();
					}
			});
	}

	/**
	 * This returns DynamicMenu.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DynamicMenu.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DynamicMenu)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DynamicMenu_type") :
			getString("_UI_DynamicMenu_type") + " " + label;
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

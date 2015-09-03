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
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.LocationAttribute;
import uk.ac.man.cs.mdsd.webgen.website.MapUnit;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAttribute;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.MapUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MapUnitItemProvider
	extends EditUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapUnitItemProvider(AdapterFactory adapterFactory) {
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

			addSelectionFeaturesPropertyDescriptor(object);
			addReadOnlyPropertyDescriptor(object);
			addDefaultZoomLevelPropertyDescriptor(object);
			addStyleClassPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addPlaceNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Selection Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSelectionFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SelectTarget_selectionFeatures_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SelectTarget_selectionFeatures_feature", "_UI_SelectTarget_type"),
			 WebsitePackage.Literals.SELECT_TARGET__SELECTION_FEATURES,
			true, false, true, null,
			getString("_UI_NavigationPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof MapUnit) {
						final MapUnit unit = (MapUnit) object;
						final List<Attribute> features = new LinkedList<Attribute>();
						features.addAll(getSourceAttributes(unit));
						return features;
					}
					return Collections.emptyList();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapUnit_readOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapUnit_readOnly_feature", "_UI_MapUnit_type"),
				 WebsitePackage.Literals.MAP_UNIT__READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Zoom Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultZoomLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapUnit_defaultZoomLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapUnit_defaultZoomLevel_feature", "_UI_MapUnit_type"),
				 WebsitePackage.Literals.MAP_UNIT__DEFAULT_ZOOM_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_MapUnit_styleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapUnit_styleClass_feature", "_UI_MapUnit_type"),
				 WebsitePackage.Literals.MAP_UNIT__STYLE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Place Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPlaceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_MapUnit_placeName_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_MapUnit_placeName_feature", "_UI_MapUnit_type"),
			WebsitePackage.Literals.MAP_UNIT__PLACE_NAME,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof MapUnit) {
						final MapUnit unit = (MapUnit)object;
						final List<ServiceAttribute> attributes = new LinkedList<ServiceAttribute>();
						if (unit.getSource() instanceof Service) {
							for (ServiceFeature feature : ((Service) unit.getSource()).getFeatures()) {
								if (feature instanceof ServiceAttribute) {
									attributes.add((ServiceAttribute) feature);
								}
							}
						}
					
						return attributes;
					}
					return Collections.emptyList();
				}
			});
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_MapUnit_location_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_MapUnit_location_feature", "_UI_MapUnit_type"),
			WebsitePackage.Literals.MAP_UNIT__LOCATION,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof MapUnit) {
						final MapUnit unit = (MapUnit)object;
						final List<ServiceAttribute> attributes = new LinkedList<ServiceAttribute>();
						if (unit.getSource() instanceof Service) {
							for (ServiceFeature feature : ((Service) unit.getSource()).getFeatures()) {
								if (feature instanceof ServiceAttribute) {
									final ServiceAttribute attribute = (ServiceAttribute) feature;
									if (attribute.getAttribute() instanceof LocationAttribute) {
										attributes.add(attribute);
									}
								}
							}
						}
					
						return attributes;
					}
					return Collections.emptyList();
				}
			});
	}

	/**
	 * This returns MapUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MapUnit.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MapUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MapUnit_type") :
			getString("_UI_MapUnit_type") + " " + label;
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

		switch (notification.getFeatureID(MapUnit.class)) {
			case WebsitePackage.MAP_UNIT__READ_ONLY:
			case WebsitePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
			case WebsitePackage.MAP_UNIT__STYLE_CLASS:
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

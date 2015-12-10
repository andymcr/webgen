/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.Label;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitAssociationItemProvider
	extends IncludedAssociationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addDateFormatPropertyDescriptor(object);
			addOnlyDisplayWhenNotEmptyPropertyDescriptor(object);
			addCollectionDisplayOptionPropertyDescriptor(object);
			addMaximumDisplaySizePropertyDescriptor(object);
			addAutofocusPropertyDescriptor(object);
			addServiceFeaturePropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addFiltersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_IncludedAssociation_association_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_IncludedAssociation_association_feature", "_UI_IncludedAssociation_type"),
			WebsitePackage.Literals.INCLUDED_ASSOCIATION__ASSOCIATION,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitAssociation) {
						return getSourceAssociations(
							(DynamicUnit) ((UnitAssociation) object).eContainer());
					}

					return Collections.emptyList();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Date Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_dateFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_dateFormat_feature", "_UI_UnitField_type"),
				 WebsitePackage.Literals.UNIT_FIELD__DATE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Only Display When Not Empty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnlyDisplayWhenNotEmptyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_onlyDisplayWhenNotEmpty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_onlyDisplayWhenNotEmpty_feature", "_UI_UnitFeature_type"),
				 WebsitePackage.Literals.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Display Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionDisplayOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_collectionDisplayOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_collectionDisplayOption_feature", "_UI_UnitFeature_type"),
				 WebsitePackage.Literals.UNIT_FEATURE__COLLECTION_DISPLAY_OPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Display Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumDisplaySizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_maximumDisplaySize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_maximumDisplaySize_feature", "_UI_UnitFeature_type"),
				 WebsitePackage.Literals.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Autofocus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutofocusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_autofocus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_autofocus_feature", "_UI_UnitFeature_type"),
				 WebsitePackage.Literals.UNIT_FEATURE__AUTOFOCUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addServiceFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnitAssociation_serviceFeature_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_serviceFeature_feature", "_UI_UnitAssociation_type"),
			WebsitePackage.Literals.UNIT_ASSOCIATION__SERVICE_FEATURE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof UnitAssociation) {
					final List<ServiceAssociation> assocations = new LinkedList<ServiceAssociation>();
					final DynamicUnit unit = ((UnitAssociation) object).getDisplayedOn();
					if (unit.getSource() instanceof Service) {
						for (ServiceFeature feature : ((Service) unit.getSource()).getFeatures()) {
							if (feature instanceof ServiceAssociation) {
								assocations.add((ServiceAssociation) feature);
							}
						}
					}
					return assocations;
				}
				return Collections.emptyList();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_title_feature", "_UI_UnitAssociation_type"),
				 WebsitePackage.Literals.UNIT_ASSOCIATION__TITLE,
				 true,
				 false,
				 true,
				 null,
				 null,
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
			getString("_UI_UnitAssociation_selection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_selection_feature", "_UI_UnitAssociation_type"),
			WebsitePackage.Literals.UNIT_ASSOCIATION__SELECTION,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitAssociation) {
						final List<Selection> selections = new LinkedList<Selection>();
						final UnitAssociation includedAssociation = (UnitAssociation) object;
						if (includedAssociation.getServiceFeature() != null) {
							final ServiceAssociation serviceAssociation
								= includedAssociation.getServiceFeature();
							for (Service service : getTargetType(serviceAssociation).getServedBy()) {
								selections.addAll(service.getSelections());
							}
							
						}
						return selections;
					}
					return Collections.emptyList();
				}
			});
	}

	/**
	 * This adds a property descriptor for the Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnitAssociation_filters_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_filters_feature", "_UI_UnitAssociation_type"),
			WebsitePackage.Literals.UNIT_ASSOCIATION__FILTERS,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitAssociation) {
						final Set<Label> filters = new HashSet<Label>();
						for (Service service : getSourceServices((UnitAssociation) object)) {
							filters.addAll(getFeatureAttributes(service));
						}
						return filters;
					}

					return Collections.emptyList();
				}
			});
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
			childrenFeatures.add(WebsitePackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS);
			childrenFeatures.add(WebsitePackage.Literals.UNIT_CONTAINER__UNITS);
			childrenFeatures.add(WebsitePackage.Literals.UNIT_ASSOCIATION__CHILD_FEATURE);
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
	 * This returns UnitAssociation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssociationWithoutContainment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnitAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitAssociation_type") :
			getString("_UI_UnitAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(UnitAssociation.class)) {
			case WebsitePackage.UNIT_ASSOCIATION__DATE_FORMAT:
			case WebsitePackage.UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY:
			case WebsitePackage.UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION:
			case WebsitePackage.UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE:
			case WebsitePackage.UNIT_ASSOCIATION__AUTOFOCUS:
			case WebsitePackage.UNIT_ASSOCIATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebsitePackage.UNIT_ASSOCIATION__ACTIONS:
			case WebsitePackage.UNIT_ASSOCIATION__UNITS:
			case WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE:
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
				(WebsitePackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebsiteFactory.eINSTANCE.createSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebsiteFactory.eINSTANCE.createDeleteAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebsiteFactory.eINSTANCE.createFeatureSupportAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createCreateSitemapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createCreateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createCreateUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createMapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createDetailsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createIndexUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createSearchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createRegistrationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createLoginUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createForgottenPasswordUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_ASSOCIATION__CHILD_FEATURE,
				 WebsiteFactory.eINSTANCE.createServiceAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_ASSOCIATION__CHILD_FEATURE,
				 WebsiteFactory.eINSTANCE.createServiceAssociationReference()));
	}

}

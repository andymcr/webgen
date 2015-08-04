/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityElement;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.UnitTitle;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitAssociationItemProvider
	extends UnitFeatureItemProvider {
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

			addFeaturePropertyDescriptor(object);
			addServiceFeaturePropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addDynamicLabelPropertyDescriptor(object);
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
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_IncludedAssociation_feature_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_IncludedAssociation_feature_feature", "_UI_IncludedAssociation_type"),
			WebsitePackage.Literals.INCLUDED_ASSOCIATION__FEATURE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitAssociation) {
						final DynamicUnit unit = ((UnitAssociation) object).getDisplayedOn();
						final List<Association> associations = new LinkedList<Association>();
						if (unit.getSource() instanceof Entity) {
							final Entity entity = (Entity) unit.getSource();
							for (Feature feature : entity.getFeatures()) {
								if (feature instanceof Association) {
									associations.add((Association) feature);
								}
							}
							for (Association association : entity.getAssociationEnds()) {
								if (association.getBidirectional()) {
									associations.add(association);
								}
							}
						} else {
							for (ServiceFeature includedFeature : ((Service) unit.getSource()).getFeatures()) {
								if (includedFeature instanceof ServiceEntityAssociation) {
									associations.add(((ServiceEntityAssociation) includedFeature).getFeature());
								}
							}
						}
						return associations;
					}
					return Collections.emptyList();
				}
		});
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
					final List<ServiceAssociation> includedAssocations = new LinkedList<ServiceAssociation>();
					final DynamicUnit unit = ((UnitAssociation) object).getDisplayedOn();
					if (unit.getSource() instanceof Service) {
						for (ServiceFeature includedFeature : ((Service) unit.getSource()).getFeatures()) {
							if (includedFeature instanceof ServiceAssociation) {
								includedAssocations.add((ServiceAssociation) includedFeature);
							}
						}
					}
					return includedAssocations;
				}
				return Collections.emptyList();
			}
		});
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
							if (serviceAssociation instanceof ServiceEntityAssociation) {
								final Association association
									= ((ServiceEntityAssociation) serviceAssociation).getFeature();
								if (association != null) {
									if (serviceAssociation.getPartOf().getEncapsulates().contains(association.getParentEntity())) {
										for (Service service : association.getTargetEntity().getServedBy()) {
											selections.addAll(service.getSelections());
										}
									} else{
										for (Service service : association.getParentEntity().getServedBy()) {
											selections.addAll(service.getSelections());
										}
									}
								}
							}
							
						}
						return selections;
					}
					return Collections.emptyList();
				}
			});
	}

	/**
	 * This adds a property descriptor for the Dynamic Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_dynamicLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_dynamicLabel_feature", "_UI_UnitAssociation_type"),
				 WebsitePackage.Literals.UNIT_ASSOCIATION__DYNAMIC_LABEL,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
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
						final Service service = getService((UnitAssociation) object);
						if (service != null) {
							final List<UnitTitle> filters = new LinkedList<UnitTitle>();
							for (ServiceFeature feature : service.getFeatures()) {
								if (feature instanceof ServiceEntityElement) {
									filters.add(((ServiceEntityElement)feature).getFeature());
								}
							}
							filters.addAll(service.getDisplayLabels());

							return filters;
						}
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
			case WebsitePackage.UNIT_ASSOCIATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
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
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createCommandUnit()));

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
				 WebsiteFactory.eINSTANCE.createActionUnit()));

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
				 WebsiteFactory.eINSTANCE.createUnitChildElement()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_ASSOCIATION__CHILD_FEATURE,
				 WebsiteFactory.eINSTANCE.createUnitChildAssociation()));
	}

}

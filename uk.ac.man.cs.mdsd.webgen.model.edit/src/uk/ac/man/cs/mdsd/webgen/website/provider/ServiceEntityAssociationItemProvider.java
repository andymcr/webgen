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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceEntityAssociationItemProvider
	extends ServiceEntityFeatureItemProvider
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
	public ServiceEntityAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addOppositeServicePropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
			addDynamicLabelPropertyDescriptor(object);
			addUseFeatureSourcePropertyDescriptor(object);
			addOppositeFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Opposite Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOppositeServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ServiceAssociation_oppositeService_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ServiceAssociation_oppositeService_feature", "_UI_ServiceAssociation_type"),
			WebsitePackage.Literals.SERVICE_ASSOCIATION__OPPOSITE_SERVICE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof ServiceEntityAssociation) {
					final ServiceEntityAssociation association = (ServiceEntityAssociation) object;
					final Service parentService = association.getPartOf();
					final List<Service> oppositeServices = new LinkedList<Service>();
					if (parentService.eContainer() instanceof WebGenModel) {
						WebGenModel model = (WebGenModel) parentService.eContainer();
						for (Service service : model.getServices()) {
							if (association.getFeature() == null) {
								if (getAssociationsMatchingService(service, parentService).size() > 0) {
									oppositeServices.add(service);
								}
							} else {
								if (service.getEncapsulates().contains(getType(association))) {
									oppositeServices.add(service);
								}
							}
						}
					}
					return oppositeServices;
				}
				return Collections.emptyList();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Opposite Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOppositeFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ServiceEntityAssociation_oppositeFeature_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ServiceEntityAssociation_oppositeFeature_feature", "_UI_ServiceEntityAssociation_type"),
			WebsitePackage.Literals.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof ServiceEntityAssociation) {
					final ServiceEntityAssociation association = (ServiceEntityAssociation) object;
					final Service parentService = association.getPartOf();
					final List<ServiceAssociation> oppositeFeatures
						= new LinkedList<ServiceAssociation>();
					if (association.getOppositeService() != null) {
						oppositeFeatures.addAll(getAssociationsMatchingService(
							association.getOppositeService(), parentService));
					} else {
						if (parentService.eContainer() instanceof WebGenModel) {
							WebGenModel model = (WebGenModel) parentService.eContainer();
							for (Service service : model.getServices()) {
								oppositeFeatures.addAll(getAssociationsMatchingService(service, parentService));
							}
						}
					}
					return oppositeFeatures;
				}
				return Collections.emptyList();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceAssociation_selection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceAssociation_selection_feature", "_UI_ServiceAssociation_type"),
				 WebsitePackage.Literals.SERVICE_ASSOCIATION__SELECTION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
				 null));
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
					if (object instanceof ServiceEntityAssociation) {
						final Service service
							= (Service) ((ServiceEntityAssociation) object).eContainer();
						final List<Association> associations = new LinkedList<Association>();
						for (Entity entity : service.getEncapsulates()) {
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
						}
						return associations;
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
				 getString("_UI_ServiceEntityAssociation_dynamicLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceEntityAssociation_dynamicLabel_feature", "_UI_ServiceEntityAssociation_type"),
				 WebsitePackage.Literals.SERVICE_ENTITY_ASSOCIATION__DYNAMIC_LABEL,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Feature Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseFeatureSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceEntityAssociation_useFeatureSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceEntityAssociation_useFeatureSource_feature", "_UI_ServiceEntityAssociation_type"),
				 WebsitePackage.Literals.SERVICE_ENTITY_ASSOCIATION__USE_FEATURE_SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This returns ServiceEntityAssociation.gif.
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
		String label = ((ServiceEntityAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceEntityAssociation_type") :
			getString("_UI_ServiceEntityAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceEntityAssociation.class)) {
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__NAME:
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__USE_FEATURE_SOURCE:
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

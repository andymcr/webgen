/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityElement;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.UnitChildAssociation;
import uk.ac.man.cs.mdsd.webgen.website.UnitChildElement;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.UnitChildElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitChildElementItemProvider
	extends UnitChildFeatureItemProvider
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
	public UnitChildElementItemProvider(AdapterFactory adapterFactory) {
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

			addServiceFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
			getString("_UI_UnitChildElement_serviceFeature_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnitChildElement_serviceFeature_feature", "_UI_UnitChildElement_type"),
			WebsitePackage.Literals.UNIT_CHILD_ELEMENT__SERVICE_FEATURE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitChildElement) {
						final List<ServiceEntityElement> elements = new LinkedList<ServiceEntityElement>();
						ServiceFeature serviceFeature;
						final EObject eContainer = ((EObject) object).eContainer();
						if (eContainer instanceof UnitAssociation) {
							serviceFeature = ((UnitAssociation) eContainer).getServiceFeature();
						} else {
							serviceFeature = ((UnitChildAssociation) eContainer).getServiceFeature();
						}
						if (serviceFeature instanceof ServiceEntityAssociation) {
							final ServiceEntityAssociation entityAssociation = (ServiceEntityAssociation) serviceFeature;
							if (entityAssociation.getFeature() != null) {
								final Entity associationType;
								if (entityAssociation.getPartOf().getEncapsulates().contains(entityAssociation.getFeature().getParentEntity())) {
									associationType = entityAssociation.getFeature().getTargetEntity();
								} else {
									associationType = entityAssociation.getFeature().getParentEntity();
								}
								if (associationType.getServedBy().size() > 0) {
									for (ServiceFeature feature : associationType.getServedBy().get(0).getFeatures()) {
										if (feature instanceof ServiceEntityElement) {
											elements.add((ServiceEntityElement) feature);
										}
									}
								}
							}
					
						} else {
						}

						return elements;
					}
					return Collections.emptyList();
				}
			});
	}

	/**
	 * This returns UnitChildElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnitChildElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UnitChildElement_type");
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

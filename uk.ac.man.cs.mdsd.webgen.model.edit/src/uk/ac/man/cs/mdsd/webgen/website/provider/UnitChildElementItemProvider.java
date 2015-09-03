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
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAttribute;
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
	extends UnitChildFeatureItemProvider {
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
						final List<ServiceAttribute> attributes = new LinkedList<ServiceAttribute>();
						ServiceFeature serviceFeature;
						final EObject eContainer = ((EObject) object).eContainer();
						if (eContainer instanceof UnitAssociation) {
							serviceFeature = ((UnitAssociation) eContainer).getServiceFeature();
						} else {
							serviceFeature = ((UnitChildAssociation) eContainer).getServiceFeature();
						}
						final EntityOrView associationType
							= getTargetType((ServiceAssociation) serviceFeature);
						if (associationType != null) {
							for (Service service : associationType.getServedBy()) {
								attributes.addAll(getAttributes(service));
							}
						}
						return attributes;
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

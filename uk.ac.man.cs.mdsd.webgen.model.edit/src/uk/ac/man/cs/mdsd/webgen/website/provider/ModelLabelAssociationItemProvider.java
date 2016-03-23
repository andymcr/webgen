/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelLabelAssociationItemProvider extends ModelLabelFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabelAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addAssociationPropertyDescriptor(object);
			addDynamicLabelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ModelLabelAssociation_association_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ModelLabelAssociation_association_feature", "_UI_ModelLabelAssociation_type"),
			WebsitePackage.Literals.MODEL_LABEL_ASSOCIATION__ASSOCIATION,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof ModelLabelAssociation) {
					final ModelLabel label = (ModelLabel) ((EObject) object).eContainer();
					return getAllAssociations(label.getLabelFor());
				}

				return Collections.emptyList();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Dynamic Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDynamicLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ModelLabelAssociation_dynamicLabel_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ModelLabelAssociation_dynamicLabel_feature", "_UI_ModelLabelAssociation_type"),
			WebsitePackage.Literals.MODEL_LABEL_ASSOCIATION__DYNAMIC_LABEL,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof ModelLabelAssociation) {
					final ModelLabelAssociation label = (ModelLabelAssociation) object;
					if (label.getAssociation() != null) {
						if (label.isUseAssociationSource()) {
							return label.getAssociation().getTargetEntity().getLabels();
						} else {
							return label.getAssociation().getPartOf().getLabels();
						}
					}
				}

				return Collections.emptyList();
			}
		});
	}

	/**
	 * This returns ModelLabelAssociation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelLabelAssociation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ModelLabelAssociation modelLabelAssociation = (ModelLabelAssociation)object;
		return getString("_UI_ModelLabelAssociation_type") + " " + modelLabelAssociation.isUseAssociationSource();
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

		switch (notification.getFeatureID(ModelLabelAssociation.class)) {
			case WebsitePackage.MODEL_LABEL_ASSOCIATION__USE_ASSOCIATION_SOURCE:
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

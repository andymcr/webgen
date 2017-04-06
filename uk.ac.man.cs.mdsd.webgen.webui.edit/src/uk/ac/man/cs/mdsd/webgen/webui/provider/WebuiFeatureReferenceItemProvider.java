/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.provider;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Feature;
import uk.ac.man.cs.mdsd.webgen.webui.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.UnitElement;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiFeatureReference;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.WebuiFeatureReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebuiFeatureReferenceItemProvider 
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
	public WebuiFeatureReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebuiFeatureReference_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebuiFeatureReference_name_feature", "_UI_WebuiFeatureReference_type"),
				 WebuiPackage.Literals.WEBUI_FEATURE_REFERENCE__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			getString("_UI_WebuiFeatureReference_feature_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_WebuiFeatureReference_feature_feature", "_UI_WebuiFeatureReference_type"),
			WebuiPackage.Literals.WEBUI_FEATURE_REFERENCE__FEATURE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					final Set<Feature> features = new HashSet<Feature>();
					if (object instanceof WebuiFeatureReference) {
						final InlineActionContainer action = getActionContext(object);
						if (action != null) {
							for (EntityOrView entity : getEntities(action)) {
								features.addAll(entity.getAllFeatures());
							}
							return features;
						}
					}

					return features;
				}
		});
	}

	/**
	 * This returns WebuiFeatureReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WebuiFeatureReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WebuiFeatureReference)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WebuiFeatureReference_type") :
			getString("_UI_WebuiFeatureReference_type") + " " + label;
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

		switch (notification.getFeatureID(WebuiFeatureReference.class)) {
			case WebuiPackage.WEBUI_FEATURE_REFERENCE__NAME:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WebuiEditPlugin.INSTANCE;
	}

	protected Object getContext(final Object object) {
		if (object instanceof EObject) {
			return ((EObject) object).eContainer();
		} else {
			return null;
		}
	}

	protected InlineActionContainer getActionContext(final Object object) {
		Object container = getContext(object);
		while (container != null) {
			if (container instanceof InlineActionContainer) {
				return (InlineActionContainer) container;
			}
			container = getContext(container);
		}

		return null;
	}

	protected Set<EntityOrView> getEntities(final InlineActionContainer container) {
		final Set<EntityOrView> entities = new HashSet<EntityOrView>();
		if (container instanceof IndexUnit) {
			entities.addAll(((IndexUnit) container).getEntities());
		} else if (container instanceof UnitElement) {
			entities.add(getParentType(
				((UnitElement) container).getAttribute()));
		} else if (container instanceof UnitAssociation) {
			entities.add(getSourceType(
				((UnitAssociation) container).getAssociation()));
		}

		return entities;
	}

	protected EntityOrView getParentType(final Attribute attribute) {
		if (attribute instanceof EntityAttribute) {
			return ((EntityAttribute) attribute).getPartOf();
		} else {
			return getParentType(
				((EncapsulatedAttribute) attribute).getAttribute());
		}
	}

	protected EntityOrView getSourceType(final Association association) {
		if (association instanceof EntityAssociation) {
			return ((EntityAssociation) association).getPartOf();
		} else if (association instanceof EncapsulatedAssociation) {
			return ((EncapsulatedAssociation) association).getSourceEntity();
		} else {
			// TODO handle view
			return null;
		}
	}

}

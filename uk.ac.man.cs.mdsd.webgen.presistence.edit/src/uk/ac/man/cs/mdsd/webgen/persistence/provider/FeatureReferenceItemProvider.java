/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.provider;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.base.FormalParameterList;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Feature;
import uk.ac.man.cs.mdsd.webgen.persistence.FeatureReference;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.FeatureReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureReferenceItemProvider 
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
	public FeatureReferenceItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_FeatureReference_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureReference_name_feature", "_UI_FeatureReference_type"),
				 PersistencePackage.Literals.FEATURE_REFERENCE__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
			getString("_UI_FeatureReference_feature_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FeatureReference_feature_feature", "_UI_FeatureReference_type"),
			PersistencePackage.Literals.FEATURE_REFERENCE__FEATURE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					final Set<Feature> features = new HashSet<Feature>();
					if (object instanceof FeatureReference) {
						final Selection selection = getSelectionContext(object);
						if (selection != null) {
							for (EntityOrView entityOrView : getEntitiesAndViews(selection)) {
								features.addAll(entityOrView.getAllFeatures());
							}
							return features;
						}
						final InlineActionContainer action = getActionContext(object);
						if (action != null) {
							for (EntityOrView entityOrView : getEntitiesAndViews(action)) {
								features.addAll(entityOrView.getAllFeatures());
							}
							return features;
						}
					}

					return features;
				}
		});
	}

	/**
	 * This returns FeatureReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureReference)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FeatureReference_type") :
			getString("_UI_FeatureReference_type") + " " + label;
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

		switch (notification.getFeatureID(FeatureReference.class)) {
			case PersistencePackage.FEATURE_REFERENCE__NAME:
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
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

	protected Object getContext(final Object object) {
		if (object instanceof EObject) {
			return ((EObject) object).eContainer();
		} else {
			return null;
		}
	}

	protected FormalParameterList getSelectionContext(final Object object) {
		Object container = getContext(object);
		while (container != null) {
			if (container instanceof FormalParameterList) {
				return (FormalParameterList) container;
			}
			container = getContext(container);
		}

		return null;
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

	protected Set<EntityOrView> getEntitiesAndViews(final InlineActionContainer container) {
		final Set<EntityOrView> entitiesAndViews = new HashSet<EntityOrView>();
		if (container instanceof IndexUnit) {
			entitiesAndViews.addAll(((IndexUnit) container).getEntities());
		} else if (container instanceof UnitElement) {
			entitiesAndViews.add(getParentType(
				((UnitElement) container).getAttribute()));
		} else if (container instanceof UnitAssociation) {
			entitiesAndViews.add(getSourceType(
				((UnitAssociation) container).getAssociation()));
		}

		return entitiesAndViews;
	}

}

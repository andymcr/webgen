/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationKeyItemProvider 
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
	public AssociationKeyItemProvider(AdapterFactory adapterFactory) {
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

			addSourceFeaturePropertyDescriptor(object);
			addTargetFeaturePropertyDescriptor(object);
			addTargetColumnNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSourceFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_AssociationKey_sourceFeature_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AssociationKey_sourceFeature_feature", "_UI_AssociationKey_type"),
			PersistencePackage.Literals.ASSOCIATION_KEY__SOURCE_FEATURE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof AssociationKey) {
						final AssociationKey key = (AssociationKey) object;
						return key.getKeyFor().getPartOf().getAllFeatures();
					}

					return Collections.emptySet();
				}
			});
	}

	/**
	 * This adds a property descriptor for the Target Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_AssociationKey_targetFeature_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AssociationKey_targetFeature_feature", "_UI_AssociationKey_type"),
			PersistencePackage.Literals.ASSOCIATION_KEY__TARGET_FEATURE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof AssociationKey) {
						final AssociationKey key = (AssociationKey) object;
						return key.getKeyFor().getTargetEntity().getAllFeatures();
					}

					return Collections.emptySet();
				}
			});
	}

	/**
	 * This adds a property descriptor for the Target Column Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssociationKey_targetColumnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssociationKey_targetColumnName_feature", "_UI_AssociationKey_type"),
				 PersistencePackage.Literals.ASSOCIATION_KEY__TARGET_COLUMN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AssociationKey.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssociationKey"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AssociationKey)object).getTargetColumnName();
		return label == null || label.length() == 0 ?
			getString("_UI_AssociationKey_type") :
			getString("_UI_AssociationKey_type") + " " + label;
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

		switch (notification.getFeatureID(AssociationKey.class)) {
			case PersistencePackage.ASSOCIATION_KEY__TARGET_COLUMN_NAME:
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

}
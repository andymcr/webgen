/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;
import uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.webui.DataUnit;
import uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.DataUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataUnitItemProvider extends DynamicUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnitItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultSelectionPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addOnlyDisplayWhenNotEmptyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDefaultSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_DataUnit_defaultSelection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_DataUnit_defaultSelection_feature", "_UI_DataUnit_type"),
			WebuiPackage.Literals.DATA_UNIT__DEFAULT_SELECTION,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof DataUnit) {
						return getSelections((DataUnit) object);
					}
					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_DataUnit_title_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_DataUnit_title_feature", "_UI_DataUnit_type"),
			WebuiPackage.Literals.DATA_UNIT__TITLE,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof SingletonUnit) {
						final SingletonUnit unit = (SingletonUnit) object;
						final Set<Label> labels = new HashSet<Label>();
						labels.addAll(unit.getContentType().getAttributes());
						labels.addAll(unit.getContentType().getLabels());
						return labels;
					}
					if (object instanceof CollectionUnit) {
						final CollectionUnit unit = (CollectionUnit) object;
						final Set<EntityOrView> entities
							= new HashSet<EntityOrView>(unit.getContentType());
						final Set<Label> labels = new HashSet<Label>();
						for (EntityOrView entity : unit.getContentType()) {
							labels.addAll(entity.getAttributes());
							labels.addAll(entity.getLabels());
						}
						if (unit.getSelection() != null) {
							for (EntityAssociation association : unit.getSelection().getSelectVia()) {
								if (entities.contains(association.getSourceEntityX())) {
									labels.addAll(association.getTargetEntityX().getAttributes());
									labels.addAll(association.getTargetEntityX().getLabels());
								} else {
									labels.addAll(association.getSourceEntityX().getAttributes());
									labels.addAll(association.getSourceEntityX().getLabels());
								}
							}
						}
						return labels;
					}

					return Collections.emptySet();
				}
		});
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
				 getString("_UI_DataUnit_onlyDisplayWhenNotEmpty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataUnit_onlyDisplayWhenNotEmpty_feature", "_UI_DataUnit_type"),
				 WebuiPackage.Literals.DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataUnit_type") :
			getString("_UI_DataUnit_type") + " " + label;
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

		switch (notification.getFeatureID(DataUnit.class)) {
			case WebuiPackage.DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY:
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

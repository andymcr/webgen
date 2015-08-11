/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataUnitItemProvider.java,v 1.14 2014/07/10 08:10:59 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.DataUnit;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.UnitTitle;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.DataUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataUnitItemProvider
	extends DynamicUnitItemProvider {
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

			addSelectionPropertyDescriptor(object);
			addDynamicTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				getString("_UI_DataUnit_selection_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DataUnit_selection_feature", "_UI_DataUnit_type"),
				WebsitePackage.Literals.DATA_UNIT__SELECTION,
				true, false, true, null,
				getString("_UI_ModelPropertyCategory"),
				null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						if (object instanceof DataUnit) {
							final DataUnit unit = (DataUnit) object;
							final List<Selection> selections = new LinkedList<Selection>();
							if (unit.getSource() instanceof Service) {
								final Service service = (Service) unit.getSource();
								selections.addAll(service.getSelections());
							}
							return selections;
						}
						return Collections.emptyList();
					}
			});
	}

	/**
	 * This adds a property descriptor for the Dynamic Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDynamicTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DataUnit_dynamicTitle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DataUnit_dynamicTitle_feature", "_UI_DataUnit_type"),
				 WebsitePackage.Literals.DATA_UNIT__DYNAMIC_TITLE,
				true, false, true, null,
				getString("_UI_InterfacePropertyCategory"),
				null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						if (object instanceof DataUnit) {
							final DataUnit unit = (DataUnit) object;
							final List<UnitTitle> labels = new LinkedList<UnitTitle>();
							for (Feature feature : getSourceElements(unit)) {
								if (feature instanceof Attribute) {
									labels.add((UnitTitle) feature);
								}
							}
							if (unit.getSource() instanceof Service) {
								labels.addAll(((Service) unit.getSource()).getDisplayLabels());
							}
							return labels;
						}
						return Collections.emptyList();
					}
			});
	}

	/**
	 * This returns DataUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataUnit"));
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

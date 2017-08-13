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

import uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.webui.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.webui.Page;
import uk.ac.man.cs.mdsd.webgen.webui.SelectAction;
import uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit;
import uk.ac.man.cs.mdsd.webgen.webui.UnitElement;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.SelectAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectActionItemProvider extends InlineActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectActionItemProvider(AdapterFactory adapterFactory) {
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

			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SelectAction_target_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SelectAction_target_feature", "_UI_SelectAction_type"),
			WebuiPackage.Literals.SELECT_ACTION__TARGET,
			true, false, true, null,
			getString("_UI_NavigationPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof SelectAction) {
						final SelectAction action = (SelectAction) object;
						final Set<SelectableUnit> targets = new HashSet<SelectableUnit>();
						for (Page page : getWebUI(action.getUsedBy()).getPages()) {
							for (ContentUnit unit : page.getUnits()) {
								if (unit instanceof SelectableUnit) {
									targets.add((SelectableUnit) unit);
								}
							}
						}
						return targets;
					}

					return Collections.emptySet();
				}
		});
	}

	/**
	 * This returns SelectAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SelectAction.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SelectAction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SelectAction_type") :
			getString("_UI_SelectAction_type") + " " + label;
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

	protected WebUI getWebUI(final InlineActionContainer container) {
		if (container instanceof CollectionUnit) {
			return ((DynamicUnit) container).getPageDisplayedOn().getWebUI();
		} else if (container instanceof UnitElement) {
			((UnitElement) container).getDisplayedOn().getPageDisplayedOn().getWebUI();
		}
		
		return null;
	}

}

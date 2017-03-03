/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;
import uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.ChildPathAttribute;
import uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.ChildPath} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChildPathItemProvider 
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
	public ChildPathItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ChildPath_type");
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

	protected List<Attribute> getAttributes(final ChildPathAttribute attribute) {
		if (attribute.eContainer() instanceof UnitAssociation) {
			final UnitAssociation parent = ((UnitAssociation) attribute.eContainer());
			if (parent.getAssociation() != null) {
				return parent.getTargetEntity().getAttributes();
			}
		} else if (attribute.eContainer() instanceof FeaturePathAssociation) {
				final FeaturePathAssociation parent = ((FeaturePathAssociation) attribute.eContainer());
				if (parent.getAssociation() != null) {
					return parent.getTargetEntity().getAttributes();
				}
		} else {
			final ChildPathAssociation parent = (ChildPathAssociation) attribute.eContainer();
			if (parent.getAssociation() != null) {
				return parent.getTargetEntity().getAttributes();
			}
		}

		return Collections.emptyList();
	}

	protected List<Association> getAssociations(final ChildPathAssociation association) {
		if (association.getPartOf().getAssociation() != null) {
			if (association.getPartOf() instanceof FeaturePathAssociation) {
				return ((FeaturePathAssociation) association.getPartOf()).getTargetEntity().getAllAssociations();
			} else if (association.getPartOf() instanceof ChildPathAssociation) {
				return ((ChildPathAssociation) association.getPartOf()).getTargetEntity().getAllAssociations();
			} else {
				return ((UnitAssociation) association.getPartOf()).getTargetEntity().getAllAssociations();
			}
		}

		return Collections.emptyList();
	}

}

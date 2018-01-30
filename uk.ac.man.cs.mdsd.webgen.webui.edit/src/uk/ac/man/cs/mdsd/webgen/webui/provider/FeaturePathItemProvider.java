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

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import uk.ac.man.cs.mdsd.webgen.expression.Expression;
import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.webui.Badge;
import uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.webui.FeaturePath;
import uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.InlineAction;
import uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit;
import uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.UnitElement;
import uk.ac.man.cs.mdsd.webgen.webui.UnitField;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.FeaturePath} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturePathItemProvider 
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
	public FeaturePathItemProvider(AdapterFactory adapterFactory) {
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
		return getString("_UI_FeaturePath_type");
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
		return WebuiEditPlugin.INSTANCE;
	}

	protected Set<EntityOrView> getParentTypes(final FeaturePath path) {
		if (path.eContainer() instanceof DynamicUnit) {
			return getContentTypes((DynamicUnit) path.eContainer());

		} else if (path.eContainer() instanceof InlineAction) {
			return getEntities((InlineActionContainer) path.eContainer());

		} else if (path.eContainer() instanceof Expression) {
			return getEntities((Expression) path.eContainer());

		} else {
			return Collections.emptySet();
		}
	}

	protected Set<EntityOrView> getTargets(final FeaturePathAssociation path) {
		if (path.eContainer() instanceof DynamicUnit) {
			final Set<EntityOrView> targets = new HashSet<EntityOrView>();
			targets.add(getTarget(path.getAssociation(), (DynamicUnit) path.eContainer()));
			return targets;

		} else if (path.eContainer() instanceof InlineAction) {
			final Set<EntityOrView> targets = new HashSet<EntityOrView>();
			final Set<EntityOrView> entities
				= getEntities((InlineActionContainer) path.eContainer());
			if (entities.contains(path.getAssociation().getSourceEntityX())) {
				targets.add(path.getAssociation().getTargetEntityX());
			} else{
				targets.add(path.getAssociation().getSourceEntityX());
			}
			return targets;

		} else if (path.eContainer() instanceof Expression) {
			return getEntities((Expression) path.eContainer());

		} else {
			return Collections.emptySet();
		}
	}

	protected EntityOrView getTarget(final Association association, final DynamicUnit unit) {
		final Set<EntityOrView> contentType = getContentTypes(unit);
		if (contentType.contains(association.getSourceEntityX())) {
			return association.getTargetEntityX();
		} else{
			return association.getSourceEntityX();
		}
	}

	protected Set<EntityOrView> getContentTypes(final DynamicUnit unit) {
		final Set<EntityOrView> contentType = new HashSet<EntityOrView>();

		if (unit instanceof SingletonUnit) {
			final SingletonUnit singleton = (SingletonUnit) unit;
			if (singleton.getContentType() != null) {
				contentType.add(singleton.getContentType());
				return contentType;
			}
		}

		if (unit instanceof CollectionUnit) {
			final CollectionUnit collection = (CollectionUnit) unit;
			if (collection.getContentType().size() > 0) {
				contentType.addAll(collection.getContentType());
				return contentType;
			}
		}

		return contentType;
	}

	protected Set<EntityOrView> getEntities(final InlineActionContainer container) {
		final Set<EntityOrView> entities = new HashSet<EntityOrView>();
		if (container instanceof CollectionUnit) {
			entities.addAll(((CollectionUnit) container).getContentType());
		} else if (container instanceof UnitElement) {
			entities.add(getParentType(
				((UnitElement) container).getAttribute()));
		} else if (container instanceof UnitAssociation) {
			entities.add(((UnitAssociation) container).getAssociation().getSourceEntityX());
		}

		return entities;
	}

	protected Set<EntityOrView> getEntities(final Badge badge) {
		final Set<EntityOrView> entities = new HashSet<EntityOrView>();
		if (badge.eContainer() instanceof CollectionUnit) {
			entities.addAll(((CollectionUnit) badge.eContainer()).getContentType());
		} else if (badge.eContainer() instanceof UnitElement) {
			entities.add(getParentType(
				((UnitElement) badge.eContainer()).getAttribute()));
		} else if (badge.eContainer() instanceof UnitAssociation) {
			entities.add(((UnitAssociation) badge.eContainer()).getAssociation().getSourceEntityX());
		}

		return entities;
	}

	protected Set<EntityOrView> getEntities(final Expression expression) {
		final DynamicUnit unit = getDynamicUnitContext(expression);
		if (unit != null) {
			return getContentTypes(unit);
		}

		final InlineActionContainer action = getActionContext(expression);
		if (action != null) {
			return getEntities(action);
		}

		final Badge badge = getBadgeContext(expression);
		if (badge != null) {
			return getEntities(badge);
		}

		return Collections.emptySet();
	}

	protected EntityOrView getParentType(final Attribute attribute) {
		if (attribute instanceof EntityAttribute) {
			return ((EntityAttribute) attribute).getPartOf();
		} else {
			return getParentType(
				((EncapsulatedAttribute) attribute).getAttribute());
		}
	}

	protected Object getContext(final Object object) {
		if (object instanceof EObject) {
			return ((EObject) object).eContainer();
		} else {
			return null;
		}
	}

	protected DynamicUnit getDynamicUnitContext(final Object object) {
		Object container = getContext(object);
		while (container != null) {
			if (container instanceof DynamicUnit) {
				return (DynamicUnit) container;
			}
			container = getContext(container);
		}

		return null;
	}

	protected UnitField getUnitFieldContext(final Object object) {
		Object container = getContext(object);
		while (container != null) {
			if (container instanceof UnitField) {
				return (UnitField) container;
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
 
	protected Badge getBadgeContext(final Object object) { 
	Object container = getContext(object); 
 		while (container != null) { 
 			if (container instanceof Badge) { 
 				return (Badge) container; 
 			} 
 			container = getContext(container); 
 		} 
 
 		return null; 
	}
 
}

/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;
import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.Service;
import uk.ac.man.cs.mdsd.webgen.website.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.SingletonUnit;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicUnitItemProvider extends ContentUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUnitItemProvider(AdapterFactory adapterFactory) {
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

			addEntitiesPropertyDescriptor(object);
			addHeaderPropertyDescriptor(object);
			addFooterPropertyDescriptor(object);
			addHeaderClassPropertyDescriptor(object);
			addControlClassPropertyDescriptor(object);
			addFooterClassPropertyDescriptor(object);
			addErrorClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Entities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_entities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_entities_feature", "_UI_DynamicUnit_type"),
				 WebsitePackage.Literals.DYNAMIC_UNIT__ENTITIES,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_header_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_header_feature", "_UI_DynamicUnit_type"),
				 WebsitePackage.Literals.DYNAMIC_UNIT__HEADER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Footer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFooterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_footer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_footer_feature", "_UI_DynamicUnit_type"),
				 WebsitePackage.Literals.DYNAMIC_UNIT__FOOTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_headerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_headerClass_feature", "_UI_DynamicUnit_type"),
				 WebsitePackage.Literals.DYNAMIC_UNIT__HEADER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_controlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_controlClass_feature", "_UI_DynamicUnit_type"),
				 WebsitePackage.Literals.DYNAMIC_UNIT__CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_footerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_footerClass_feature", "_UI_DynamicUnit_type"),
				 WebsitePackage.Literals.DYNAMIC_UNIT__FOOTER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_errorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_errorClass_feature", "_UI_DynamicUnit_type"),
				 WebsitePackage.Literals.DYNAMIC_UNIT__ERROR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WebsitePackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS);
			childrenFeatures.add(WebsitePackage.Literals.DYNAMIC_UNIT__SUPPORT_ACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DynamicUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DynamicUnit_type") :
			getString("_UI_DynamicUnit_type") + " " + label;
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

		switch (notification.getFeatureID(DynamicUnit.class)) {
			case WebsitePackage.DYNAMIC_UNIT__HEADER:
			case WebsitePackage.DYNAMIC_UNIT__FOOTER:
			case WebsitePackage.DYNAMIC_UNIT__HEADER_CLASS:
			case WebsitePackage.DYNAMIC_UNIT__CONTROL_CLASS:
			case WebsitePackage.DYNAMIC_UNIT__FOOTER_CLASS:
			case WebsitePackage.DYNAMIC_UNIT__ERROR_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebsitePackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
			case WebsitePackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebsiteFactory.eINSTANCE.createUnitElement()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebsiteFactory.eINSTANCE.createUnitAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebsiteFactory.eINSTANCE.createDataTypeField()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebsiteFactory.eINSTANCE.createDateField()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebsiteFactory.eINSTANCE.createCaptchaField()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.DYNAMIC_UNIT__SUPPORT_ACTIONS,
				 WebsiteFactory.eINSTANCE.createUnitSupportAction()));
	}

	protected List<EntityOrView> getContentType(final DynamicUnit unit) {
		final List<EntityOrView> contentType = new LinkedList<EntityOrView>();

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

		contentType.addAll(unit.getEntities());

		return contentType;
	}

	protected Set<Attribute> getAttributes(final DynamicUnit unit) {
		final Set<Attribute> attributes = new HashSet<Attribute>();

		for (EntityOrView entity : getContentType(unit)) {
			attributes.addAll(entity.getAttributes());
		}

		return attributes;
	}

	protected Set<Association> getAssociations(final DynamicUnit unit) {
		final Set<Association> associations = new HashSet<Association>();

		for (EntityOrView entity : getContentType(unit)) {
			associations.addAll(entity.getAllAssociations());
		}

		return associations;
	}

	protected Set<Label> getLabels(final EntityOrView entityOrView) {
		final Set<Label> labels = new HashSet<Label>();
		labels.addAll(entityOrView.getAttributes());
		labels.addAll(entityOrView.getLabels());

		return labels;
	}

	protected Set<Selection> getSelections(final WebGenModel model, final EntityOrView entity) {
		final Set<Selection> selections = new HashSet<Selection>();
		for (Service service : model.getServices()) {
			if (service.getServes() == entity) {
				selections.addAll(service.getSelections());
			}
		}

		return selections;
	}

	protected Set<Selection> getSelections(final DynamicUnit unit) {
		final Set<Selection> selections = new HashSet<Selection>();
		final List<EntityOrView> contentType = getContentType(unit);
		if (!contentType.isEmpty()) {
			final WebGenModel model = unit.getPageDisplayedOn().getPartOf();
			selections.addAll(getSelections(model, contentType.get(0)));
		}

		return selections;
	}

}

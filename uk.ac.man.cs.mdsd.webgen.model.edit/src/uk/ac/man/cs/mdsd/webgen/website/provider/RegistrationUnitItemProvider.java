/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.RegistrationUnit;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.RegistrationUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistrationUnitItemProvider 
	extends WebGenItemProvider
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
	public RegistrationUnitItemProvider(AdapterFactory adapterFactory) {
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
			addDisplayLabelPropertyDescriptor(object);
			addPurposeSummaryPropertyDescriptor(object);
			addUriElementPropertyDescriptor(object);
			addHomeUnitPropertyDescriptor(object);
			addAlternativePropertyDescriptor(object);
			addOmitCaptionPropertyDescriptor(object);
			addCaptionClassPropertyDescriptor(object);
			addEntitiesPropertyDescriptor(object);
			addNoRouteParametersPropertyDescriptor(object);
			addHeaderPropertyDescriptor(object);
			addFooterPropertyDescriptor(object);
			addHeaderClassPropertyDescriptor(object);
			addControlClassPropertyDescriptor(object);
			addFooterClassPropertyDescriptor(object);
			addErrorClassPropertyDescriptor(object);
			addSubmitLabelPropertyDescriptor(object);
			addCancelDestinationPropertyDescriptor(object);
			addCancelLabelPropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
			addStyleClassPropertyDescriptor(object);
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
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 WebsitePackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Display Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedDisplayElement_displayLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedDisplayElement_displayLabel_feature", "_UI_NamedDisplayElement_type"),
				 WebsitePackage.Literals.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Purpose Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPurposeSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentUnit_purposeSummary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentUnit_purposeSummary_feature", "_UI_ContentUnit_type"),
				 WebsitePackage.Literals.CONTENT_UNIT__PURPOSE_SUMMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentUnit_uriElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentUnit_uriElement_feature", "_UI_ContentUnit_type"),
				 WebsitePackage.Literals.CONTENT_UNIT__URI_ELEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Home Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHomeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentUnit_homeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentUnit_homeUnit_feature", "_UI_ContentUnit_type"),
				 WebsitePackage.Literals.CONTENT_UNIT__HOME_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Alternative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentUnit_alternative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentUnit_alternative_feature", "_UI_ContentUnit_type"),
				 WebsitePackage.Literals.CONTENT_UNIT__ALTERNATIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Omit Caption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOmitCaptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentUnit_omitCaption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentUnit_omitCaption_feature", "_UI_ContentUnit_type"),
				 WebsitePackage.Literals.CONTENT_UNIT__OMIT_CAPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Caption Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptionClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentUnit_captionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentUnit_captionClass_feature", "_UI_ContentUnit_type"),
				 WebsitePackage.Literals.CONTENT_UNIT__CAPTION_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
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
	 * This adds a property descriptor for the No Route Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoRouteParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_noRouteParameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_noRouteParameters_feature", "_UI_DynamicUnit_type"),
				 WebsitePackage.Literals.DYNAMIC_UNIT__NO_ROUTE_PARAMETERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
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
	 * This adds a property descriptor for the Submit Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubmitLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlUnit_submitLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlUnit_submitLabel_feature", "_UI_ControlUnit_type"),
				 WebsitePackage.Literals.CONTROL_UNIT__SUBMIT_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancel Destination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelDestinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlUnit_cancelDestination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlUnit_cancelDestination_feature", "_UI_ControlUnit_type"),
				 WebsitePackage.Literals.CONTROL_UNIT__CANCEL_DESTINATION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancel Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlUnit_cancelLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlUnit_cancelLabel_feature", "_UI_ControlUnit_type"),
				 WebsitePackage.Literals.CONTROL_UNIT__CANCEL_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlUnit_contentClass_feature", "_UI_ControlUnit_type"),
				 WebsitePackage.Literals.CONTROL_UNIT__CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegistrationUnit_styleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegistrationUnit_styleClass_feature", "_UI_RegistrationUnit_type"),
				 WebsitePackage.Literals.REGISTRATION_UNIT__STYLE_CLASS,
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
	 * This returns RegistrationUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RegistrationUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RegistrationUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RegistrationUnit_type") :
			getString("_UI_RegistrationUnit_type") + " " + label;
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

		switch (notification.getFeatureID(RegistrationUnit.class)) {
			case WebsitePackage.REGISTRATION_UNIT__NAME:
			case WebsitePackage.REGISTRATION_UNIT__DISPLAY_LABEL:
			case WebsitePackage.REGISTRATION_UNIT__PURPOSE_SUMMARY:
			case WebsitePackage.REGISTRATION_UNIT__URI_ELEMENT:
			case WebsitePackage.REGISTRATION_UNIT__HOME_UNIT:
			case WebsitePackage.REGISTRATION_UNIT__ALTERNATIVE:
			case WebsitePackage.REGISTRATION_UNIT__OMIT_CAPTION:
			case WebsitePackage.REGISTRATION_UNIT__CAPTION_CLASS:
			case WebsitePackage.REGISTRATION_UNIT__NO_ROUTE_PARAMETERS:
			case WebsitePackage.REGISTRATION_UNIT__HEADER:
			case WebsitePackage.REGISTRATION_UNIT__FOOTER:
			case WebsitePackage.REGISTRATION_UNIT__HEADER_CLASS:
			case WebsitePackage.REGISTRATION_UNIT__CONTROL_CLASS:
			case WebsitePackage.REGISTRATION_UNIT__FOOTER_CLASS:
			case WebsitePackage.REGISTRATION_UNIT__ERROR_CLASS:
			case WebsitePackage.REGISTRATION_UNIT__SUBMIT_LABEL:
			case WebsitePackage.REGISTRATION_UNIT__CANCEL_LABEL:
			case WebsitePackage.REGISTRATION_UNIT__CONTENT_CLASS:
			case WebsitePackage.REGISTRATION_UNIT__STYLE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebsitePackage.REGISTRATION_UNIT__DISPLAY_FIELDS:
			case WebsitePackage.REGISTRATION_UNIT__SUPPORT_ACTIONS:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WebsiteEditPlugin.INSTANCE;
	}

}

/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.provider;


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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.expression.ExpressionFactory;
import uk.ac.man.cs.mdsd.webgen.webui.ForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiFactory;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.ForgottenPasswordUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForgottenPasswordUnitItemProvider 
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
	public ForgottenPasswordUnitItemProvider(AdapterFactory adapterFactory) {
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
			addCreateDefaultUriElementPropertyDescriptor(object);
			addRequiresRolePropertyDescriptor(object);
			addPurposeSummaryPropertyDescriptor(object);
			addUriElementPropertyDescriptor(object);
			addAlternativePropertyDescriptor(object);
			addOmitCaptionPropertyDescriptor(object);
			addCaptionClassPropertyDescriptor(object);
			addServicesUsedPropertyDescriptor(object);
			addMessageWhenHiddenPropertyDescriptor(object);
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
				 BasePackage.Literals.NAMED_ELEMENT__NAME,
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
				 BasePackage.Literals.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Default Uri Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateDefaultUriElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentUnit_createDefaultUriElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentUnit_createDefaultUriElement_feature", "_UI_ContentUnit_type"),
				 WebuiPackage.Literals.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Requires Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiresRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentUnit_requiresRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentUnit_requiresRole_feature", "_UI_ContentUnit_type"),
				 WebuiPackage.Literals.CONTENT_UNIT__REQUIRES_ROLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SecurityPropertyCategory"),
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
				 WebuiPackage.Literals.CONTENT_UNIT__PURPOSE_SUMMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
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
				 WebuiPackage.Literals.CONTENT_UNIT__URI_ELEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 WebuiPackage.Literals.CONTENT_UNIT__ALTERNATIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
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
				 WebuiPackage.Literals.CONTENT_UNIT__OMIT_CAPTION,
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
				 WebuiPackage.Literals.CONTENT_UNIT__CAPTION_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Services Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicesUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_servicesUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_servicesUsed_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__SERVICES_USED,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_BusinessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Message When Hidden feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageWhenHiddenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_messageWhenHidden_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_messageWhenHidden_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_BusinessPropertyCategory"),
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
				 WebuiPackage.Literals.DYNAMIC_UNIT__HEADER,
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
				 WebuiPackage.Literals.DYNAMIC_UNIT__FOOTER,
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
				 WebuiPackage.Literals.DYNAMIC_UNIT__HEADER_CLASS,
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
				 WebuiPackage.Literals.DYNAMIC_UNIT__CONTROL_CLASS,
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
				 WebuiPackage.Literals.DYNAMIC_UNIT__FOOTER_CLASS,
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
				 WebuiPackage.Literals.DYNAMIC_UNIT__ERROR_CLASS,
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
				 WebuiPackage.Literals.CONTROL_UNIT__SUBMIT_LABEL,
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
				 WebuiPackage.Literals.CONTROL_UNIT__CANCEL_DESTINATION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_NavigationPropertyCategory"),
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
				 WebuiPackage.Literals.CONTROL_UNIT__CANCEL_LABEL,
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
				 WebuiPackage.Literals.CONTROL_UNIT__CONTENT_CLASS,
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
				 getString("_UI_ForgottenPasswordUnit_styleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordUnit_styleClass_feature", "_UI_ForgottenPasswordUnit_type"),
				 WebuiPackage.Literals.FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS,
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
			childrenFeatures.add(WebuiPackage.Literals.CONTENT_UNIT__ROUTE_ACTUALS);
			childrenFeatures.add(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS);
			childrenFeatures.add(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN);
			childrenFeatures.add(WebuiPackage.Literals.DYNAMIC_UNIT__SUPPORT_ACTIONS);
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
	 * This returns ForgottenPasswordUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ForgottenPasswordUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ForgottenPasswordUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ForgottenPasswordUnit_type") :
			getString("_UI_ForgottenPasswordUnit_type") + " " + label;
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

		switch (notification.getFeatureID(ForgottenPasswordUnit.class)) {
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__NAME:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__MESSAGE_WHEN_HIDDEN:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTENT_CLASS:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ROUTE_ACTUALS:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HIDE_WHEN:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS:
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
				(WebuiPackage.Literals.CONTENT_UNIT__ROUTE_ACTUALS,
				 WebuiFactory.eINSTANCE.createRouteActual()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebuiFactory.eINSTANCE.createUnitElement()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebuiFactory.eINSTANCE.createUnitAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebuiFactory.eINSTANCE.createDataTypeField()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebuiFactory.eINSTANCE.createDateField()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebuiFactory.eINSTANCE.createCaptchaField()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__SUPPORT_ACTIONS,
				 WebuiFactory.eINSTANCE.createUnitSupportAction()));
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

}

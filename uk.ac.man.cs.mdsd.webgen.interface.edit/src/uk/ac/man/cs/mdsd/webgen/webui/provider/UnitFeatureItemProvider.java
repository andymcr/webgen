/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.expression.WebGenExpressionFactory;

import uk.ac.man.cs.mdsd.webgen.service.WebGenServiceFactory;

import uk.ac.man.cs.mdsd.webgen.webui.UnitFeature;
import uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIFactory;
import uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitFeatureItemProvider extends UnitFieldItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addOnlyDisplayWhenNotEmptyPropertyDescriptor(object);
			addDisplayLabelPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addNullDisplayValuePropertyDescriptor(object);
			addFooterPropertyDescriptor(object);
			addAutofocusPropertyDescriptor(object);
			addHeaderClassPropertyDescriptor(object);
			addInputClassPropertyDescriptor(object);
			addDisplayClassPropertyDescriptor(object);
			addFooterClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_UnitFeature_onlyDisplayWhenNotEmpty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_onlyDisplayWhenNotEmpty_feature", "_UI_UnitFeature_type"),
				 WebGenWebUIPackage.Literals.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_UnitFeature_displayLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_displayLabel_feature", "_UI_UnitFeature_type"),
				 WebGenWebUIPackage.Literals.UNIT_FEATURE__DISPLAY_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_required_feature", "_UI_UnitFeature_type"),
				 WebGenWebUIPackage.Literals.UNIT_FEATURE__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Null Display Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNullDisplayValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_nullDisplayValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_nullDisplayValue_feature", "_UI_UnitFeature_type"),
				 WebGenWebUIPackage.Literals.UNIT_FEATURE__NULL_DISPLAY_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_UnitFeature_footer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_footer_feature", "_UI_UnitFeature_type"),
				 WebGenWebUIPackage.Literals.UNIT_FEATURE__FOOTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autofocus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutofocusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_autofocus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_autofocus_feature", "_UI_UnitFeature_type"),
				 WebGenWebUIPackage.Literals.UNIT_FEATURE__AUTOFOCUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_UnitFeature_headerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_headerClass_feature", "_UI_UnitFeature_type"),
				 WebGenWebUIPackage.Literals.UNIT_FEATURE__HEADER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_inputClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_inputClass_feature", "_UI_UnitFeature_type"),
				 WebGenWebUIPackage.Literals.UNIT_FEATURE__INPUT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Display Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_displayClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_displayClass_feature", "_UI_UnitFeature_type"),
				 WebGenWebUIPackage.Literals.UNIT_FEATURE__DISPLAY_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_UnitFeature_footerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_footerClass_feature", "_UI_UnitFeature_type"),
				 WebGenWebUIPackage.Literals.UNIT_FEATURE__FOOTER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
			childrenFeatures.add(WebGenWebUIPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS);
			childrenFeatures.add(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE);
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
		String label = ((UnitFeature)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitFeature_type") :
			getString("_UI_UnitFeature_type") + " " + label;
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

		switch (notification.getFeatureID(UnitFeature.class)) {
			case WebGenWebUIPackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY:
			case WebGenWebUIPackage.UNIT_FEATURE__DISPLAY_LABEL:
			case WebGenWebUIPackage.UNIT_FEATURE__REQUIRED:
			case WebGenWebUIPackage.UNIT_FEATURE__NULL_DISPLAY_VALUE:
			case WebGenWebUIPackage.UNIT_FEATURE__FOOTER:
			case WebGenWebUIPackage.UNIT_FEATURE__AUTOFOCUS:
			case WebGenWebUIPackage.UNIT_FEATURE__HEADER_CLASS:
			case WebGenWebUIPackage.UNIT_FEATURE__INPUT_CLASS:
			case WebGenWebUIPackage.UNIT_FEATURE__DISPLAY_CLASS:
			case WebGenWebUIPackage.UNIT_FEATURE__FOOTER_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebGenWebUIPackage.UNIT_FEATURE__ACTIONS:
			case WebGenWebUIPackage.UNIT_FEATURE__FORCED_VALUE:
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
				(WebGenWebUIPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebGenWebUIFactory.eINSTANCE.createSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebGenWebUIFactory.eINSTANCE.createDeleteAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebGenWebUIFactory.eINSTANCE.createFeatureSupportAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenWebUIFactory.eINSTANCE.createModelReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenWebUIFactory.eINSTANCE.createRouteParameterReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenServiceFactory.eINSTANCE.createFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenServiceFactory.eINSTANCE.createParameterReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE,
				 WebGenServiceFactory.eINSTANCE.createCurrentUserReference()));
	}

}

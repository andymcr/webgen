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

import uk.ac.man.cs.mdsd.webgen.webui.UnitAttribute;
import uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIFactory;
import uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.UnitAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitAttributeItemProvider extends UnitFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAttributeItemProvider(AdapterFactory adapterFactory) {
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

			addAttributePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addObfuscateFormFieldsPropertyDescriptor(object);
			addPlaceholderPropertyDescriptor(object);
			addValidationPatternPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAttribute_attribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAttribute_attribute_feature", "_UI_UnitAttribute_type"),
				 WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_UnitAttribute_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAttribute_name_feature", "_UI_UnitAttribute_type"),
				 WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Obfuscate Form Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObfuscateFormFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAttribute_obfuscateFormFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAttribute_obfuscateFormFields_feature", "_UI_UnitAttribute_type"),
				 WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__OBFUSCATE_FORM_FIELDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAttribute_placeholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAttribute_placeholder_feature", "_UI_UnitAttribute_type"),
				 WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__PLACEHOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAttribute_validationPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAttribute_validationPattern_feature", "_UI_UnitAttribute_type"),
				 WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__VALIDATION_PATTERN,
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
			childrenFeatures.add(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE);
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
	 * This returns UnitAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnitAttribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnitAttribute)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitAttribute_type") :
			getString("_UI_UnitAttribute_type") + " " + label;
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

		switch (notification.getFeatureID(UnitAttribute.class)) {
			case WebGenWebUIPackage.UNIT_ATTRIBUTE__NAME:
			case WebGenWebUIPackage.UNIT_ATTRIBUTE__OBFUSCATE_FORM_FIELDS:
			case WebGenWebUIPackage.UNIT_ATTRIBUTE__PLACEHOLDER:
			case WebGenWebUIPackage.UNIT_ATTRIBUTE__VALIDATION_PATTERN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebGenWebUIPackage.UNIT_ATTRIBUTE__DEFAULT_VALUE:
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
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenWebUIFactory.eINSTANCE.createModelReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenWebUIFactory.eINSTANCE.createRouteParameterReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenServiceFactory.eINSTANCE.createFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenServiceFactory.eINSTANCE.createParameterReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE,
				 WebGenServiceFactory.eINSTANCE.createCurrentUserReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WebGenWebUIPackage.Literals.UNIT_FEATURE__FORCED_VALUE ||
			childFeature == WebGenWebUIPackage.Literals.UNIT_ATTRIBUTE__DEFAULT_VALUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

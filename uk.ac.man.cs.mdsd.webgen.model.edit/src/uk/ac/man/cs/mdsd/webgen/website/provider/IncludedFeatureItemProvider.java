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

import uk.ac.man.cs.mdsd.criteria.CriteriaFactory;

import uk.ac.man.cs.mdsd.webgen.website.IncludedFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IncludedFeatureItemProvider 
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
	public IncludedFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addDisplayLabelPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addForcedValuePropertyDescriptor(object);
			addFooterPropertyDescriptor(object);
			addHeaderClassPropertyDescriptor(object);
			addInputClassPropertyDescriptor(object);
			addDisplayClassPropertyDescriptor(object);
			addFooterClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_IncludedFeature_displayLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_displayLabel_feature", "_UI_IncludedFeature_type"),
				 WebsitePackage.Literals.INCLUDED_FEATURE__DISPLAY_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
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
				 getString("_UI_IncludedFeature_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_required_feature", "_UI_IncludedFeature_type"),
				 WebsitePackage.Literals.INCLUDED_FEATURE__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Forced Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForcedValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedFeature_forcedValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_forcedValue_feature", "_UI_IncludedFeature_type"),
				 WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_BusinessPropertyCategory"),
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
				 getString("_UI_IncludedFeature_footer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_footer_feature", "_UI_IncludedFeature_type"),
				 WebsitePackage.Literals.INCLUDED_FEATURE__FOOTER,
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
				 getString("_UI_IncludedFeature_headerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_headerClass_feature", "_UI_IncludedFeature_type"),
				 WebsitePackage.Literals.INCLUDED_FEATURE__HEADER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
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
				 getString("_UI_IncludedFeature_inputClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_inputClass_feature", "_UI_IncludedFeature_type"),
				 WebsitePackage.Literals.INCLUDED_FEATURE__INPUT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
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
				 getString("_UI_IncludedFeature_displayClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_displayClass_feature", "_UI_IncludedFeature_type"),
				 WebsitePackage.Literals.INCLUDED_FEATURE__DISPLAY_CLASS,
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
				 getString("_UI_IncludedFeature_footerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_footerClass_feature", "_UI_IncludedFeature_type"),
				 WebsitePackage.Literals.INCLUDED_FEATURE__FOOTER_CLASS,
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
			childrenFeatures.add(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE);
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
	 * This returns IncludedFeature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IncludedFeature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IncludedFeature)object).getDisplayLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_IncludedFeature_type") :
			getString("_UI_IncludedFeature_type") + " " + label;
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

		switch (notification.getFeatureID(IncludedFeature.class)) {
			case WebsitePackage.INCLUDED_FEATURE__DISPLAY_LABEL:
			case WebsitePackage.INCLUDED_FEATURE__REQUIRED:
			case WebsitePackage.INCLUDED_FEATURE__FOOTER:
			case WebsitePackage.INCLUDED_FEATURE__HEADER_CLASS:
			case WebsitePackage.INCLUDED_FEATURE__INPUT_CLASS:
			case WebsitePackage.INCLUDED_FEATURE__DISPLAY_CLASS:
			case WebsitePackage.INCLUDED_FEATURE__FOOTER_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebsitePackage.INCLUDED_FEATURE__FORCED_VALUE:
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
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 WebsiteFactory.eINSTANCE.createModelReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 WebsiteFactory.eINSTANCE.createFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 WebsiteFactory.eINSTANCE.createParameterReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 WebsiteFactory.eINSTANCE.createCurrentUserReference()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateIsEmpty()));
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
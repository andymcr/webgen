/**
 */
package uk.ac.man.cs.mdsd.genjsf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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

import uk.ac.man.cs.mdsd.genjsf.GenJsfFactory;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenUnitAssociationItemProvider
	extends GenUnitFeatureItemProvider
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
	public GenUnitAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addJsfFeaturePropertyDescriptor(object);
			addGenServiceFeaturePropertyDescriptor(object);
			addGenSelectionPropertyDescriptor(object);
			addSelectOneOfOptionPropertyDescriptor(object);
			addSelectManyOptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Jsf Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJsfFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenUnitAssociation_jsfFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenUnitAssociation_jsfFeature_feature", "_UI_GenUnitAssociation_type"),
				 GenJsfPackage.Literals.GEN_UNIT_ASSOCIATION__JSF_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen Service Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenServiceFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenUnitAssociation_genServiceFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenUnitAssociation_genServiceFeature_feature", "_UI_GenUnitAssociation_type"),
				 GenJsfPackage.Literals.GEN_UNIT_ASSOCIATION__GEN_SERVICE_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenUnitAssociation_genSelection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenUnitAssociation_genSelection_feature", "_UI_GenUnitAssociation_type"),
				 GenJsfPackage.Literals.GEN_UNIT_ASSOCIATION__GEN_SELECTION,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Select One Of Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectOneOfOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenUnitAssociation_selectOneOfOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenUnitAssociation_selectOneOfOption_feature", "_UI_GenUnitAssociation_type"),
				 GenJsfPackage.Literals.GEN_UNIT_ASSOCIATION__SELECT_ONE_OF_OPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Many Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectManyOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenUnitAssociation_selectManyOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenUnitAssociation_selectManyOption_feature", "_UI_GenUnitAssociation_type"),
				 GenJsfPackage.Literals.GEN_UNIT_ASSOCIATION__SELECT_MANY_OPTION,
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
			childrenFeatures.add(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS);
			childrenFeatures.add(GenJsfPackage.Literals.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE);
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
		String label = ((GenUnitAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenUnitAssociation_type") :
			getString("_UI_GenUnitAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(GenUnitAssociation.class)) {
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_ONE_OF_OPTION:
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_MANY_OPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_UNITS:
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE:
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
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenCreateSitemapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenCommandUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenCreateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenCreateUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenMapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenDetailsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenIndexGridUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenIndexPageDirectionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenIndexLineDirectionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenSearchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenActionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenRegistrationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenLoginUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_CONTAINER__GEN_UNITS,
				 GenJsfFactory.eINSTANCE.createGenForgottenPasswordUnit()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE,
				 GenJsfFactory.eINSTANCE.createGenUnitChildElement()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE,
				 GenJsfFactory.eINSTANCE.createGenUnitChildAssociation()));
	}

}

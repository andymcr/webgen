/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.Label;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitAssociationItemProvider extends UnitFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addAssociationPropertyDescriptor(object);
			addIsSourceAssociationPropertyDescriptor(object);
			addSourceEntityPropertyDescriptor(object);
			addTargetEntityPropertyDescriptor(object);
			addValueDisplayPropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_AssociationReference_association_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AssociationReference_association_feature", "_UI_AssociationReference_type"),
			WebsitePackage.Literals.ASSOCIATION_REFERENCE__ASSOCIATION,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitAssociation) {
						final UnitAssociation association = (UnitAssociation) object;
						return getAssociations(association.getDisplayedOn());
					}

					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Is Source Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSourceAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_isSourceAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_isSourceAssociation_feature", "_UI_UnitAssociation_type"),
				 WebsitePackage.Literals.UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_sourceEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_sourceEntity_feature", "_UI_UnitAssociation_type"),
				 WebsitePackage.Literals.UNIT_ASSOCIATION__SOURCE_ENTITY,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_targetEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_targetEntity_feature", "_UI_UnitAssociation_type"),
				 WebsitePackage.Literals.UNIT_ASSOCIATION__TARGET_ENTITY,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Display feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValueDisplayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnitAssociation_valueDisplay_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_valueDisplay_feature", "_UI_UnitAssociation_type"),
			WebsitePackage.Literals.UNIT_ASSOCIATION__VALUE_DISPLAY,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitAssociation) {
						final Set<Label> labels = new HashSet<Label>();
//						for (Service service : getSourceServices((UnitAssociation) object)) {
//							labels.addAll(getFeatureAttributes(service));
//							for (EntityOrView entityOrView : service.getEncapsulates()) {
//								labels.addAll(entityOrView.getLabels());
//							}
//						}
						return labels;
					}
					return Collections.emptySet();
				}
			});
	}

	/**
	 * This adds a property descriptor for the Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnitAssociation_selection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_selection_feature", "_UI_UnitAssociation_type"),
			WebsitePackage.Literals.UNIT_ASSOCIATION__SELECTION,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitAssociation) {
						final UnitAssociation association = (UnitAssociation) object;
						if (association.getAssociation() != null) {
							return getSelections(association.getTargetEntity());
						}
					}
					return Collections.emptySet();
				}
			});
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
			childrenFeatures.add(WebsitePackage.Literals.UNIT_CONTAINER__UNITS);
			childrenFeatures.add(WebsitePackage.Literals.ASSOCIATION_REFERENCE__CHILD_FEATURE);
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
	 * This returns UnitAssociation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssociationWithoutContainment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnitAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitAssociation_type") :
			getString("_UI_UnitAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(UnitAssociation.class)) {
			case WebsitePackage.UNIT_ASSOCIATION__NAME:
			case WebsitePackage.UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebsitePackage.UNIT_ASSOCIATION__UNITS:
			case WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE:
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
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createCreateSitemapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createCreateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createCreateUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createMapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createDetailsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createIndexUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createSearchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createImageIndexUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createSliderUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createGalleryUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createRegistrationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createLoginUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.UNIT_CONTAINER__UNITS,
				 WebsiteFactory.eINSTANCE.createForgottenPasswordUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.ASSOCIATION_REFERENCE__CHILD_FEATURE,
				 WebsiteFactory.eINSTANCE.createChildAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.ASSOCIATION_REFERENCE__CHILD_FEATURE,
				 WebsiteFactory.eINSTANCE.createChildAssociation()));
	}

}

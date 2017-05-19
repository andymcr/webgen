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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;
import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.Service;
import uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiFactory;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation} object.
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
			addValueDisplayPropertyDescriptor(object);
			addIsSourceAssociationPropertyDescriptor(object);
			addSourceEntityPropertyDescriptor(object);
			addTargetEntityPropertyDescriptor(object);
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
			WebuiPackage.Literals.ASSOCIATION_REFERENCE__ASSOCIATION,
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
	 * This adds a property descriptor for the Value Display feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValueDisplayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_AssociationReference_valueDisplay_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AssociationReference_valueDisplay_feature", "_UI_AssociationReference_type"),
			WebuiPackage.Literals.ASSOCIATION_REFERENCE__VALUE_DISPLAY,
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
				 WebuiPackage.Literals.UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION,
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
				 WebuiPackage.Literals.UNIT_ASSOCIATION__SOURCE_ENTITY,
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
				 WebuiPackage.Literals.UNIT_ASSOCIATION__TARGET_ENTITY,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
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
			WebuiPackage.Literals.UNIT_ASSOCIATION__SELECTION,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitAssociation) {
						final UnitAssociation association = (UnitAssociation) object;
						if (association.getAssociation() != null) {
							final WebUI webUI
								= association.getDisplayedOn().getPageDisplayedOn().getWebUI();
							return getSelections(webUI, association.getTargetEntity());
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
			childrenFeatures.add(WebuiPackage.Literals.UNIT_CONTAINER__UNITS);
			childrenFeatures.add(WebuiPackage.Literals.ASSOCIATION_REFERENCE__CHILD_FEATURE);
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
			case WebuiPackage.UNIT_ASSOCIATION__NAME:
			case WebuiPackage.UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.UNIT_ASSOCIATION__UNITS:
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
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
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createCreateSitemapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createCreateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createCreateUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createMapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createDetailsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createIndexUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createSearchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createImageIndexUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createSliderUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createGalleryUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createRegistrationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createLoginUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_CONTAINER__UNITS,
				 WebuiFactory.eINSTANCE.createForgottenPasswordUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.ASSOCIATION_REFERENCE__CHILD_FEATURE,
				 WebuiFactory.eINSTANCE.createChildPathAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.ASSOCIATION_REFERENCE__CHILD_FEATURE,
				 WebuiFactory.eINSTANCE.createChildPathAssociation()));
	}

	protected Set<Association> getAssociations(final DynamicUnit unit) {
		final Set<Association> associations = new HashSet<Association>();

		for (EntityOrView entity : getContentType(unit)) {
			associations.addAll(entity.getAllAssociations());
		}

		return associations;
	}

	protected Set<Selection> getSelections(final WebUI webUI, final EntityOrView entity) {
		final Set<Selection> selections = new HashSet<Selection>();
		for (Service service : webUI.getServices().getServices()) {
			if (service.getServes() == entity) {
				selections.addAll(service.getSelections());
			}
		}

		return selections;
	}
}

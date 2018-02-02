/**
 */
package uk.ac.man.cs.mdsd.webgen.service.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.base.BaseFactory;
import uk.ac.man.cs.mdsd.webgen.base.BasePackage;

import uk.ac.man.cs.mdsd.webgen.base.provider.NamedElementItemProvider;

import uk.ac.man.cs.mdsd.webgen.expression.ExpressionFactory;
import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Feature;
import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.ServiceFactory;
import uk.ac.man.cs.mdsd.webgen.service.ServicePackage;


/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.service.Selection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionItemProvider(AdapterFactory adapterFactory) {
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

			addDistinctPropertyDescriptor(object);
			addFieldsPropertyDescriptor(object);
			addJoinsPropertyDescriptor(object);
			addLimitPropertyDescriptor(object);
			addSelectPathPropertyDescriptor(object);
			addMethodNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Distinct feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistinctPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Selection_distinct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Selection_distinct_feature", "_UI_Selection_type"),
				 ServicePackage.Literals.SELECTION__DISTINCT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_BusinessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Selection_fields_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Selection_fields_feature", "_UI_Selection_type"),
			ServicePackage.Literals.SELECTION__FIELDS,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof Selection) {
					final Set<EntityOrView> entities
						= getEntitiesAndViews((Selection) object);
					final Set<Feature> fields = new HashSet<Feature>();
					for (EntityOrView entity : entities) {
						fields.addAll(entity.getFeatures());
					}

					return fields;
				}

				return Collections.emptySet();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Joins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addJoinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Selection_joins_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Selection_joins_feature", "_UI_Selection_type"),
			ServicePackage.Literals.SELECTION__JOINS,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof Selection) {
					final Set<EntityOrView> entities
						= getEntitiesAndViews((Selection) object);
					final Set<Association> associations = new HashSet<Association>();
					for (EntityOrView entity : entities) {
						associations.addAll(entity.getAllAssociations());
					}

					return associations;
				}

				return Collections.emptySet();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Selection_limit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Selection_limit_feature", "_UI_Selection_type"),
				 ServicePackage.Literals.SELECTION__LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_BusinessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Selection_selectPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Selection_selectPath_feature", "_UI_Selection_type"),
				 ServicePackage.Literals.SELECTION__SELECT_PATH,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_BusinessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Via feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSelectViaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Selection_selectVia_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Selection_selectVia_feature", "_UI_Selection_type"),
			ServicePackage.Literals.SELECTION__SELECT_PATH,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof Selection) {
					final Selection selection = (Selection) object;
					final EntityAssociation last
						= selection.getSelectPath().isEmpty()
							? null
							: selection.getSelectPath().get(selection.getSelectPath().size() - 1);
					final EntityAssociation penultimate
						= selection.getSelectPath().size() < 2
							? null
							: selection.getSelectPath().get(selection.getSelectPath().size() - 2);
					final Set<Association> fields = new HashSet<Association>();
					if ((last == null) || (penultimate == null)) {
						final Set<EntityOrView> entities
							= getEntitiesAndViews((Selection) object);
						for (EntityOrView entity : entities) {
							fields.addAll(entity.getAllAssociations());
						}
					}
					if (last != null) {
						fields.addAll(last.getTargetEntityX().getAllAssociations());
						if (penultimate != null) {
							fields.addAll(penultimate.getTargetEntityX().getAllAssociations());
						}
					}

					return fields;
				}

				return Collections.emptySet();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Method Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Selection_methodName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Selection_methodName_feature", "_UI_Selection_type"),
				 ServicePackage.Literals.SELECTION__METHOD_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ImplementationPropertyCategory"),
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
			childrenFeatures.add(BasePackage.Literals.FORMAL_PARAMETER_LIST__PARAMETERS);
			childrenFeatures.add(ServicePackage.Literals.SELECTION__CONDITION);
			childrenFeatures.add(ServicePackage.Literals.SELECTION__FILTERS);
			childrenFeatures.add(ServicePackage.Literals.SELECTION__ORDERING);
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
	 * This returns Selection.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Selection.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Selection)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Selection_type") :
			getString("_UI_Selection_type") + " " + label;
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

		switch (notification.getFeatureID(Selection.class)) {
			case ServicePackage.SELECTION__DISTINCT:
			case ServicePackage.SELECTION__LIMIT:
			case ServicePackage.SELECTION__METHOD_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ServicePackage.SELECTION__PARAMETERS:
			case ServicePackage.SELECTION__CONDITION:
			case ServicePackage.SELECTION__FILTERS:
			case ServicePackage.SELECTION__ORDERING:
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
				(BasePackage.Literals.FORMAL_PARAMETER_LIST__PARAMETERS,
				 BaseFactory.eINSTANCE.createFormalParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__FILTERS,
				 ServiceFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__ORDERING,
				 ServiceFactory.eINSTANCE.createAsc()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.SELECTION__ORDERING,
				 ServiceFactory.eINSTANCE.createDesc()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ServiceEditPlugin.INSTANCE;
	}

	protected Set<EntityOrView> getEntitiesAndViews(final Selection selection) {
		final Set<EntityOrView> entitiesAndViews = new HashSet<EntityOrView>();
		entitiesAndViews.add(selection.getUsedBy().getServes());
		final Set<Association> joins = new HashSet<Association>(selection.getJoins());
		while (!joins.isEmpty()) {
			final Set<Association> handled = new HashSet<Association>();
			for (Association join : joins) {
				if (entitiesAndViews.contains(join.getSourceEntityX())) {
					entitiesAndViews.add(join.getTargetEntityX());
					handled.add(join);
				} else if (entitiesAndViews.contains(join.getTargetEntityX())) {
					entitiesAndViews.add(join.getSourceEntityX());
					handled.add(join);
				}
			}
			joins.removeAll(handled);
		}

		return entitiesAndViews;
	}

}

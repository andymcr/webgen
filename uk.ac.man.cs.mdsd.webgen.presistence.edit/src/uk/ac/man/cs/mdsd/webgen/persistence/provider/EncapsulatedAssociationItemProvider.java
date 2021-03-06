/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.View;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EncapsulatedAssociationItemProvider extends EncapsulatedFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addPseudoPropertyDescriptor(object);
			addInputClassPropertyDescriptor(object);
			addSourceEntityXPropertyDescriptor(object);
			addTargetEntityXPropertyDescriptor(object);
			addSerializationMaxDepthPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addAssociationPropertyDescriptor(object);
			addEncapsulatedTargetPropertyDescriptor(object);
			addIsSourceAssociationPropertyDescriptor(object);
			addCardinalityPropertyDescriptor(object);
			addSourceEntityPropertyDescriptor(object);
			addTargetEntityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pseudo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPseudoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_pseudo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_pseudo_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__PSEUDO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_OrmPropertyCategory"),
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
				 getString("_UI_Association_inputClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_inputClass_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__INPUT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Entity X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceEntityXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_sourceEntityX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_sourceEntityX_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__SOURCE_ENTITY_X,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Entity X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetEntityXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_targetEntityX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_targetEntityX_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__TARGET_ENTITY_X,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Serialization Max Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSerializationMaxDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_serializationMaxDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_serializationMaxDepth_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__SERIALIZATION_MAX_DEPTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_SerializationPropertyCategory"),
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
				 getString("_UI_EncapsulatedAssociation_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EncapsulatedAssociation_name_feature", "_UI_EncapsulatedAssociation_type"),
				 PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EncapsulatedAssociation_association_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EncapsulatedAssociation_association_feature", "_UI_EncapsulatedAssociation_type"),
				 PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__ASSOCIATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_EncapsulatedAssociation_association_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_EncapsulatedAssociation_association_feature", "_UI_EncapsulatedAssociation_type"),
			PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__ASSOCIATION,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof EncapsulatedAssociation) {
						final View view = ((EncapsulatedAssociation) object).getPartOf();
						final Set<Association> associations = new HashSet<Association>();
						for (EntityOrView entityOrView : view.getEncapsulates()) {
							associations.addAll(entityOrView.getAllAssociations());
						}
						return associations;
					}

					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Encapsulated Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addEncapsulatedTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_EncapsulatedAssociation_encapsulatedTarget_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_EncapsulatedAssociation_encapsulatedTarget_feature", "_UI_EncapsulatedAssociation_type"),
			PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof EncapsulatedAssociation) {
						final Association association = ((EncapsulatedAssociation) object).getAssociation();
						if (association != null) {
							return association.getEncapsulatedBy();
						}
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
				 getString("_UI_EncapsulatedAssociation_isSourceAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EncapsulatedAssociation_isSourceAssociation_feature", "_UI_EncapsulatedAssociation_type"),
				 PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__IS_SOURCE_ASSOCIATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EncapsulatedAssociation_cardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EncapsulatedAssociation_cardinality_feature", "_UI_EncapsulatedAssociation_type"),
				 PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__CARDINALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
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
				 getString("_UI_EncapsulatedAssociation_sourceEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EncapsulatedAssociation_sourceEntity_feature", "_UI_EncapsulatedAssociation_type"),
				 PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY,
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
				 getString("_UI_EncapsulatedAssociation_targetEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EncapsulatedAssociation_targetEntity_feature", "_UI_EncapsulatedAssociation_type"),
				 PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__TARGET_ENTITY,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This returns EncapsulatedAssociation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EncapsulatedAssociation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EncapsulatedAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EncapsulatedAssociation_type") :
			getString("_UI_EncapsulatedAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(EncapsulatedAssociation.class)) {
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__PSEUDO:
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS:
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__NAME:
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__IS_SOURCE_ASSOCIATION:
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__CARDINALITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}

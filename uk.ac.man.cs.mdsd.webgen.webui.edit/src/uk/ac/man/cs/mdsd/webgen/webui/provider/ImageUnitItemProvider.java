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

import uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;
import uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.webui.ImageUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiFactory;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageUnitItemProvider extends DynamicUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageUnitItemProvider(AdapterFactory adapterFactory) {
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

			addContentTypePropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addFindContainerSelectionPropertyDescriptor(object);
			addFindElementSelectionPropertyDescriptor(object);
			addFilterPropertyDescriptor(object);
			addSupportedFiltersPropertyDescriptor(object);
			addEmptyMessagePropertyDescriptor(object);
			addDefaultPaginationSizePropertyDescriptor(object);
			addMaximumPaginationSizePropertyDescriptor(object);
			addNextNpagesPropertyDescriptor(object);
			addPreviousNpagesPropertyDescriptor(object);
			addNextPageLabelPropertyDescriptor(object);
			addNextPageIconNamePropertyDescriptor(object);
			addPreviousPageLabelPropertyDescriptor(object);
			addPreviousPageIconNamePropertyDescriptor(object);
			addUseDisabledPageLinksPropertyDescriptor(object);
			addUseFirstLastPageLinksPropertyDescriptor(object);
			addFirstPageLabelPropertyDescriptor(object);
			addFirstPageIconNamePropertyDescriptor(object);
			addLastPageLabelPropertyDescriptor(object);
			addLastPageIconNamePropertyDescriptor(object);
			addPaginationClassPropertyDescriptor(object);
			addPaginationElementClassPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addTruncateImageTitlePropertyDescriptor(object);
			addMissingImagePathPropertyDescriptor(object);
			addImageFilterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Content Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_contentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_contentType_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__CONTENT_TYPE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
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
			getString("_UI_CollectionUnit_selection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_selection_feature", "_UI_CollectionUnit_type"),
			WebuiPackage.Literals.COLLECTION_UNIT__SELECTION,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof ImageUnit) {
						return getSelections((ImageUnit) object);
					}
					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Find Container Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFindContainerSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CollectionUnit_findContainerSelection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_findContainerSelection_feature", "_UI_CollectionUnit_type"),
			WebuiPackage.Literals.COLLECTION_UNIT__FIND_CONTAINER_SELECTION,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof ImageUnit) {
						return getSelections((ImageUnit) object);
					}
					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Find Element Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFindElementSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CollectionUnit_findElementSelection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_findElementSelection_feature", "_UI_CollectionUnit_type"),
			WebuiPackage.Literals.COLLECTION_UNIT__FIND_ELEMENT_SELECTION,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof ImageUnit) {
						return getSelections((ImageUnit) object);
					}
					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_filter_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__FILTER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_BusinessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSupportedFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CollectionUnit_supportedFilters_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_supportedFilters_feature", "_UI_CollectionUnit_type"),
			WebuiPackage.Literals.COLLECTION_UNIT__SUPPORTED_FILTERS,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof ImageUnit) {
						final ImageUnit unit = (ImageUnit) object;
						if (unit.getSelection() != null) {
							return unit.getSelection().getFilters();
						}
					}
					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Empty Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmptyMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_emptyMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_emptyMessage_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__EMPTY_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Pagination Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPaginationSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_defaultPaginationSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_defaultPaginationSize_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_PaginationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Pagination Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPaginationSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_maximumPaginationSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_maximumPaginationSize_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_PaginationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Npages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextNpagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_nextNpages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_nextNpages_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__NEXT_NPAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_PaginationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Npages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousNpagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_previousNpages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_previousNpages_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__PREVIOUS_NPAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_PaginationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Page Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextPageLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_nextPageLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_nextPageLabel_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__NEXT_PAGE_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Page Icon Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextPageIconNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_nextPageIconName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_nextPageIconName_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__NEXT_PAGE_ICON_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Page Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousPageLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_previousPageLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_previousPageLabel_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Page Icon Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousPageIconNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_previousPageIconName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_previousPageIconName_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Disabled Page Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseDisabledPageLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_useDisabledPageLinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_useDisabledPageLinks_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_PaginationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use First Last Page Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseFirstLastPageLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_useFirstLastPageLinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_useFirstLastPageLinks_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_PaginationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the First Page Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstPageLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_firstPageLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_firstPageLabel_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__FIRST_PAGE_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the First Page Icon Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstPageIconNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_firstPageIconName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_firstPageIconName_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__FIRST_PAGE_ICON_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Page Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastPageLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_lastPageLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_lastPageLabel_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__LAST_PAGE_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Page Icon Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastPageIconNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_lastPageIconName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_lastPageIconName_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__LAST_PAGE_ICON_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Pagination Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaginationClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_paginationClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_paginationClass_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__PAGINATION_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Pagination Element Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaginationElementClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_paginationElementClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_paginationElementClass_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ImageUnit_title_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_title_feature", "_UI_ImageUnit_type"),
			WebuiPackage.Literals.IMAGE_UNIT__TITLE,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof CollectionUnit) {
						final CollectionUnit unit = (CollectionUnit) object;
						final Set<EntityOrView> entities
							= new HashSet<EntityOrView>(unit.getContentType());
						final Set<Label> labels = new HashSet<Label>();
						for (EntityOrView entity : unit.getContentType()) {
							labels.addAll(entity.getAttributes());
							labels.addAll(entity.getLabels());
						}
						if (unit.getSelection() != null) {
							for (EntityAssociation association : unit.getSelection().getSelectPath()) {
								if (entities.contains(association.getSourceEntityX())) {
									labels.addAll(association.getTargetEntityX().getAttributes());
									labels.addAll(association.getTargetEntityX().getLabels());
								} else {
									labels.addAll(association.getSourceEntityX().getAttributes());
									labels.addAll(association.getSourceEntityX().getLabels());
								}
							}
						}
						return labels;
					}

					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Truncate Image Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTruncateImageTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_truncateImageTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_truncateImageTitle_feature", "_UI_ImageUnit_type"),
				 WebuiPackage.Literals.IMAGE_UNIT__TRUNCATE_IMAGE_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ImagePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Missing Image Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMissingImagePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_missingImagePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_missingImagePath_feature", "_UI_ImageUnit_type"),
				 WebuiPackage.Literals.IMAGE_UNIT__MISSING_IMAGE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ImagePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_imageFilter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_imageFilter_feature", "_UI_ImageUnit_type"),
				 WebuiPackage.Literals.IMAGE_UNIT__IMAGE_FILTER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ImagePropertyCategory"),
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
			childrenFeatures.add(WebuiPackage.Literals.COLLECTION_UNIT__BADGES);
			childrenFeatures.add(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE);
			childrenFeatures.add(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_TITLE_FEATURE);
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
		String label = ((ImageUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ImageUnit_type") :
			getString("_UI_ImageUnit_type") + " " + label;
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

		switch (notification.getFeatureID(ImageUnit.class)) {
			case WebuiPackage.IMAGE_UNIT__EMPTY_MESSAGE:
			case WebuiPackage.IMAGE_UNIT__DEFAULT_PAGINATION_SIZE:
			case WebuiPackage.IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE:
			case WebuiPackage.IMAGE_UNIT__NEXT_NPAGES:
			case WebuiPackage.IMAGE_UNIT__PREVIOUS_NPAGES:
			case WebuiPackage.IMAGE_UNIT__NEXT_PAGE_LABEL:
			case WebuiPackage.IMAGE_UNIT__NEXT_PAGE_ICON_NAME:
			case WebuiPackage.IMAGE_UNIT__PREVIOUS_PAGE_LABEL:
			case WebuiPackage.IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME:
			case WebuiPackage.IMAGE_UNIT__USE_DISABLED_PAGE_LINKS:
			case WebuiPackage.IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS:
			case WebuiPackage.IMAGE_UNIT__FIRST_PAGE_LABEL:
			case WebuiPackage.IMAGE_UNIT__FIRST_PAGE_ICON_NAME:
			case WebuiPackage.IMAGE_UNIT__LAST_PAGE_LABEL:
			case WebuiPackage.IMAGE_UNIT__LAST_PAGE_ICON_NAME:
			case WebuiPackage.IMAGE_UNIT__PAGINATION_CLASS:
			case WebuiPackage.IMAGE_UNIT__PAGINATION_ELEMENT_CLASS:
			case WebuiPackage.IMAGE_UNIT__TRUNCATE_IMAGE_TITLE:
			case WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.IMAGE_UNIT__BADGES:
			case WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
			case WebuiPackage.IMAGE_UNIT__IMAGE_TITLE_FEATURE:
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
				(WebuiPackage.Literals.COLLECTION_UNIT__BADGES,
				 WebuiFactory.eINSTANCE.createBadge()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WebuiFactory.eINSTANCE.createFeaturePathAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WebuiFactory.eINSTANCE.createFeaturePathAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WebuiFactory.eINSTANCE.createFeaturePathLabel()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_TITLE_FEATURE,
				 WebuiFactory.eINSTANCE.createFeaturePathAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_TITLE_FEATURE,
				 WebuiFactory.eINSTANCE.createFeaturePathAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_TITLE_FEATURE,
				 WebuiFactory.eINSTANCE.createFeaturePathLabel()));
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
			childFeature == WebuiPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE ||
			childFeature == WebuiPackage.Literals.IMAGE_UNIT__IMAGE_TITLE_FEATURE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

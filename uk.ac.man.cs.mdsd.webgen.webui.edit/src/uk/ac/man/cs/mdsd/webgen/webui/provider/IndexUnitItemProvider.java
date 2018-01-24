/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.webui.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiFactory;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IndexUnitItemProvider extends DataUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexUnitItemProvider(AdapterFactory adapterFactory) {
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
			addDisplayOptionPropertyDescriptor(object);
			addOmitColumnLabelsPropertyDescriptor(object);
			addStyleClassPropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
			addRowClassesPropertyDescriptor(object);
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
					if (object instanceof IndexUnit) {
						return getSelections((IndexUnit) object);
					}
					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CollectionUnit_filter_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_filter_feature", "_UI_CollectionUnit_type"),
			WebuiPackage.Literals.COLLECTION_UNIT__FILTER,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof IndexUnit) {
						final IndexUnit unit = (IndexUnit) object;
						if (unit.getSelection() != null) {
							return unit.getSelection().getFilters();
						}
					}
					return Collections.emptySet();
				}
		});
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
					if (object instanceof IndexUnit) {
						final IndexUnit unit = (IndexUnit) object;
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
	 * This adds a property descriptor for the Display Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IndexUnit_displayOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IndexUnit_displayOption_feature", "_UI_IndexUnit_type"),
				 WebuiPackage.Literals.INDEX_UNIT__DISPLAY_OPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Omit Column Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOmitColumnLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IndexUnit_omitColumnLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IndexUnit_omitColumnLabels_feature", "_UI_IndexUnit_type"),
				 WebuiPackage.Literals.INDEX_UNIT__OMIT_COLUMN_LABELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
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
				 getString("_UI_IndexUnit_styleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IndexUnit_styleClass_feature", "_UI_IndexUnit_type"),
				 WebuiPackage.Literals.INDEX_UNIT__STYLE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
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
				 getString("_UI_IndexUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IndexUnit_contentClass_feature", "_UI_IndexUnit_type"),
				 WebuiPackage.Literals.INDEX_UNIT__CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Row Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IndexUnit_rowClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IndexUnit_rowClasses_feature", "_UI_IndexUnit_type"),
				 WebuiPackage.Literals.INDEX_UNIT__ROW_CLASSES,
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
			childrenFeatures.add(WebuiPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS);
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
	 * This returns IndexUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IndexUnit.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		final IndexUnit unit = (IndexUnit) object;
		final Object displayedOn = unit.getDisplayedOn();
		String parentLabel = "";
		final IItemLabelProvider provider
			= (IItemLabelProvider) adapterFactory.adapt(displayedOn, IItemLabelProvider.class);
		if (provider != null) {
			parentLabel = provider.getText(displayedOn);
		}
		final String label = unit.getName();
		return parentLabel + ": "
			+ (label == null || label.length() == 0
				? getString("_UI_IndexUnit_type")
				: getString("_UI_IndexUnit_type") + " " + label);
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

		switch (notification.getFeatureID(IndexUnit.class)) {
			case WebuiPackage.INDEX_UNIT__EMPTY_MESSAGE:
			case WebuiPackage.INDEX_UNIT__DEFAULT_PAGINATION_SIZE:
			case WebuiPackage.INDEX_UNIT__MAXIMUM_PAGINATION_SIZE:
			case WebuiPackage.INDEX_UNIT__NEXT_NPAGES:
			case WebuiPackage.INDEX_UNIT__PREVIOUS_NPAGES:
			case WebuiPackage.INDEX_UNIT__NEXT_PAGE_LABEL:
			case WebuiPackage.INDEX_UNIT__NEXT_PAGE_ICON_NAME:
			case WebuiPackage.INDEX_UNIT__PREVIOUS_PAGE_LABEL:
			case WebuiPackage.INDEX_UNIT__PREVIOUS_PAGE_ICON_NAME:
			case WebuiPackage.INDEX_UNIT__USE_DISABLED_PAGE_LINKS:
			case WebuiPackage.INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS:
			case WebuiPackage.INDEX_UNIT__FIRST_PAGE_LABEL:
			case WebuiPackage.INDEX_UNIT__FIRST_PAGE_ICON_NAME:
			case WebuiPackage.INDEX_UNIT__LAST_PAGE_LABEL:
			case WebuiPackage.INDEX_UNIT__LAST_PAGE_ICON_NAME:
			case WebuiPackage.INDEX_UNIT__PAGINATION_CLASS:
			case WebuiPackage.INDEX_UNIT__PAGINATION_ELEMENT_CLASS:
			case WebuiPackage.INDEX_UNIT__DISPLAY_OPTION:
			case WebuiPackage.INDEX_UNIT__OMIT_COLUMN_LABELS:
			case WebuiPackage.INDEX_UNIT__STYLE_CLASS:
			case WebuiPackage.INDEX_UNIT__CONTENT_CLASS:
			case WebuiPackage.INDEX_UNIT__ROW_CLASSES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.INDEX_UNIT__ACTIONS:
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
				(WebuiPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createDeleteAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createFeatureSupportAction()));
	}

}

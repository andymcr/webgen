/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.FeatureReference;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureReferenceItemProvider
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
	public FeatureReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addFieldPropertyDescriptor(object);
			addField2PropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FeatureReference_field_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FeatureReference_field_feature", "_UI_FeatureReference_type"),
			WebsitePackage.Literals.FEATURE_REFERENCE__FIELD,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					final Set<ServiceFeature> features = new HashSet<ServiceFeature>();
					if (object instanceof FeatureReference) {
						final Selection selection = getCriteriaSelectionContext(object);
						if (selection != null) {
							features.addAll(selection.getUsedBy().getFeatures());
							for (ServiceAssociation join : selection.getJoins()) {
								for (Service targetService : getTargetServices(join)) {
									features.addAll(targetService.getFeatures());
								}
							}
						} else {
							final Service service = getCriteriaServiceContext(object);
							if (service != null) {
								for (ServiceFeature feature : service.getFeatures()) {
									if (feature instanceof ServiceFeature) {
										features.add((ServiceFeature) feature);
									}
								}
							}
						}
					}
					return features;
				}
		});
	}

	/**
	 * This adds a property descriptor for the Field2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addField2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FeatureReference_field2_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FeatureReference_field2_feature", "_UI_FeatureReference_type"),
			WebsitePackage.Literals.FEATURE_REFERENCE__FIELD2,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					final Set<Feature> features = new HashSet<Feature>();
					if (object instanceof FeatureReference) {
						final Selection selection = getCriteriaSelectionContext(object);
						if (selection != null) {
							final Service service = selection.getUsedBy();
							features.addAll(getFeatures(service));
							for (Association join : selection.getNewJoins2()) {
								features.addAll(getTargetFeatures(join, service.getServes()));
							}
						} else {
//							final Service service = getCriteriaServiceContext(object);
//							if (service != null) {
//								for (ServiceFeature feature : service.getFeatures()) {
//									if (feature instanceof ServiceFeature) {
//										features.add((ServiceFeature) feature);
//									}
//								}
//							}
						}
					}
					return features;
				}
		});
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_FeatureReference_feature_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_FeatureReference_feature_feature", "_UI_FeatureReference_type"),
			WebsitePackage.Literals.FEATURE_REFERENCE__FEATURE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					final Set<Feature> features = new HashSet<Feature>();
					if (object instanceof FeatureReference) {
						final Selection selection = getCriteriaSelectionContext(object);
						if (selection != null) {
							final Service service = selection.getUsedBy();
							features.addAll(getFeatures(service));
							for (Association join : selection.getNewJoins2()) {
								features.addAll(getTargetFeatures(join, service.getServes()));
							}
							return features;
						}
//						final Service service = getCriteriaServiceContext(object);
//						if (service != null) {
//							for (ServiceFeature feature : service.getFeatures()) {
//								if (feature instanceof ServiceFeature) {
//									features.add((ServiceFeature) feature);
//								}
//							}
//						}
					}

					return features;
				}
		});
	}

	/**
	 * This returns FeatureReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FeatureReference_type");
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

/**
 */
package uk.ac.man.cs.mdsd.waf.provider;


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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.waf.WafFactory;
import uk.ac.man.cs.mdsd.waf.WafModel;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.waf.WafModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WafModelItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WafModelItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPersistencePropertyDescriptor(object);
			addBusinessPropertyDescriptor(object);
			addApiPropertyDescriptor(object);
			addSiteNamePropertyDescriptor(object);
			addSiteTitlePropertyDescriptor(object);
			addWebmasterEmailPropertyDescriptor(object);
			addCopyrightTextPropertyDescriptor(object);
			addMetaDescriptionPropertyDescriptor(object);
			addLogoImagePropertyDescriptor(object);
			addLogoFiltersPropertyDescriptor(object);
			addFrameworkTechnologyPropertyDescriptor(object);
			addInputTechnologyPropertyDescriptor(object);
			addAjaxTechnologyPropertyDescriptor(object);
			addCaptchaSiteKeyPropertyDescriptor(object);
			addCaptchaSecretKeyPropertyDescriptor(object);
			addTextEditorURLPropertyDescriptor(object);
			addTopNavigationIdPropertyDescriptor(object);
			addSideMenuPropertyDescriptor(object);
			addSiteTemplatePropertyDescriptor(object);
			addStaticUnitsEditablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Persistence feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addPersistencePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_persistence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_persistence_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__PERSISTENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Business feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_business_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_business_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__BUSINESS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Api feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_api_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_api_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__API,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Site Name feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addSiteNamePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_siteName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_siteName_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__SITE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Site Title feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addSiteTitlePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_siteTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_siteTitle_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__SITE_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Webmaster Email feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addWebmasterEmailPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_webmasterEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_webmasterEmail_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__WEBMASTER_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Copyright Text feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addCopyrightTextPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_copyrightText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_copyrightText_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__COPYRIGHT_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Meta Description feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMetaDescriptionPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_metaDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_metaDescription_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__META_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Logo Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogoImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_logoImage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_logoImage_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__LOGO_IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Logo Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogoFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_logoFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_logoFilters_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__LOGO_FILTERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Framework Technology feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addFrameworkTechnologyPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_frameworkTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_frameworkTechnology_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__FRAMEWORK_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Input Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_inputTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_inputTechnology_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__INPUT_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Ajax Technology feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addAjaxTechnologyPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_ajaxTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_ajaxTechnology_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__AJAX_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Captcha Site Key feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addCaptchaSiteKeyPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_captchaSiteKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_captchaSiteKey_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__CAPTCHA_SITE_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Captcha Secret Key feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addCaptchaSecretKeyPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_captchaSecretKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_captchaSecretKey_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__CAPTCHA_SECRET_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Text Editor URL feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTextEditorURLPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_textEditorURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_textEditorURL_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__TEXT_EDITOR_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Top Navigation Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopNavigationIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_topNavigationId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_topNavigationId_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__TOP_NAVIGATION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Side Menu feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addSideMenuPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_sideMenu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_sideMenu_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__SIDE_MENU,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Site Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSiteTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_siteTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_siteTemplate_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__SITE_TEMPLATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Static Units Editable feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addStaticUnitsEditablePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_staticUnitsEditable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_staticUnitsEditable_feature", "_UI_WafModel_type"),
				 WafPackage.Literals.WAF_MODEL__STATIC_UNITS_EDITABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WafPackage.Literals.WAF_MODEL__IMAGE_MANIPULATIONS);
			childrenFeatures.add(WafPackage.Literals.WAF_MODEL__PAGES);
			childrenFeatures.add(WafPackage.Literals.WAF_MODEL__MENUS);
			childrenFeatures.add(WafPackage.Literals.WAF_MODEL__AUTHENTICATION);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns WafModel.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WafModel"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		String label = ((WafModel)object).getSiteName();
		return label == null || label.length() == 0 ?
			getString("_UI_WafModel_type") :
			getString("_UI_WafModel_type") + " " + label;
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);

		switch (notification.getFeatureID(WafModel.class)) {
			case WafPackage.WAF_MODEL__SITE_NAME:
			case WafPackage.WAF_MODEL__SITE_TITLE:
			case WafPackage.WAF_MODEL__WEBMASTER_EMAIL:
			case WafPackage.WAF_MODEL__COPYRIGHT_TEXT:
			case WafPackage.WAF_MODEL__META_DESCRIPTION:
			case WafPackage.WAF_MODEL__LOGO_IMAGE:
			case WafPackage.WAF_MODEL__FRAMEWORK_TECHNOLOGY:
			case WafPackage.WAF_MODEL__INPUT_TECHNOLOGY:
			case WafPackage.WAF_MODEL__AJAX_TECHNOLOGY:
			case WafPackage.WAF_MODEL__CAPTCHA_SITE_KEY:
			case WafPackage.WAF_MODEL__CAPTCHA_SECRET_KEY:
			case WafPackage.WAF_MODEL__TEXT_EDITOR_URL:
			case WafPackage.WAF_MODEL__TOP_NAVIGATION_ID:
			case WafPackage.WAF_MODEL__SITE_TEMPLATE:
			case WafPackage.WAF_MODEL__STATIC_UNITS_EDITABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.WAF_MODEL__IMAGE_MANIPULATIONS:
			case WafPackage.WAF_MODEL__PAGES:
			case WafPackage.WAF_MODEL__MENUS:
			case WafPackage.WAF_MODEL__AUTHENTICATION:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.WAF_MODEL__IMAGE_MANIPULATIONS,
				 WafFactory.eINSTANCE.createImageManipulation()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.WAF_MODEL__PAGES,
				 WafFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.WAF_MODEL__MENUS,
				 WafFactory.eINSTANCE.createMenu()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.WAF_MODEL__MENUS,
				 WafFactory.eINSTANCE.createSubmenuEntry()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.WAF_MODEL__AUTHENTICATION,
				 WafFactory.eINSTANCE.createLocalAuthenticationSystem()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.WAF_MODEL__AUTHENTICATION,
				 WafFactory.eINSTANCE.createCasAuthentication()));
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return WafEditPlugin.INSTANCE;
	}

}

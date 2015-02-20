/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsitePropertiesItemProvider.java,v 1.18 2014/06/27 07:52:17 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.List;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsitePropertiesItemProvider
	extends WebgenItemProvider
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
	public WebsitePropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addSiteTitlePropertyDescriptor(object);
			addWebmasterEmailPropertyDescriptor(object);
			addCopyrightTextPropertyDescriptor(object);
			addMetaDescriptionPropertyDescriptor(object);
			addProjectNamePropertyDescriptor(object);
			addAuthenticationPropertyDescriptor(object);
			addTestProjectNamePropertyDescriptor(object);
			addDefaultDateFormatPropertyDescriptor(object);
			addDefaultTimeFormatPropertyDescriptor(object);
			addDefaultDateTimeFormatPropertyDescriptor(object);
			addDefaultMaximumUploadSizePropertyDescriptor(object);
			addDatabaseTechnologyPropertyDescriptor(object);
			addOrmTechnologyPropertyDescriptor(object);
			addFrameworkTechnologyPropertyDescriptor(object);
			addAjaxTechnologyPropertyDescriptor(object);
			addCaptchaSiteKeyPropertyDescriptor(object);
			addCaptchaSecretKeyPropertyDescriptor(object);
			addTopNavigationIdPropertyDescriptor(object);
			addSideMenuPropertyDescriptor(object);
			addStaticUnitsEditablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Site Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSiteTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_siteTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_siteTitle_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__SITE_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Webmaster Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebmasterEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_webmasterEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_webmasterEmail_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__WEBMASTER_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Copyright Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyrightTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_copyrightText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_copyrightText_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__COPYRIGHT_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_metaDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_metaDescription_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__META_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Project Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_projectName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_projectName_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__PROJECT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Authentication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_authentication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_authentication_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__AUTHENTICATION,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_SecurityPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Test Project Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTestProjectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_testProjectName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_testProjectName_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__TEST_PROJECT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Date Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDateFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_defaultDateFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_defaultDateFormat_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__DEFAULT_DATE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Time Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTimeFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_defaultTimeFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_defaultTimeFormat_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__DEFAULT_TIME_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Date Time Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDateTimeFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_defaultDateTimeFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_defaultDateTimeFormat_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__DEFAULT_DATE_TIME_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Maximum Upload Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultMaximumUploadSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_defaultMaximumUploadSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_defaultMaximumUploadSize_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__DEFAULT_MAXIMUM_UPLOAD_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_databaseTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_databaseTechnology_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__DATABASE_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Orm Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrmTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_ormTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_ormTechnology_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__ORM_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Framework Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrameworkTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_frameworkTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_frameworkTechnology_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Ajax Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAjaxTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_ajaxTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_ajaxTechnology_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__AJAX_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Captcha Site Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptchaSiteKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_captchaSiteKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_captchaSiteKey_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__CAPTCHA_SITE_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Captcha Secret Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptchaSecretKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_captchaSecretKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_captchaSecretKey_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__CAPTCHA_SECRET_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
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
				 getString("_UI_WebsiteProperties_topNavigationId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_topNavigationId_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Side Menu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSideMenuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_sideMenu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_sideMenu_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__SIDE_MENU,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Static Units Editable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticUnitsEditablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebsiteProperties_staticUnitsEditable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebsiteProperties_staticUnitsEditable_feature", "_UI_WebsiteProperties_type"),
				 WebsitePackage.Literals.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This returns WebsiteProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WebsiteProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WebsiteProperties)object).getProjectName();
		return label == null || label.length() == 0 ?
			getString("_UI_WebsiteProperties_type") :
			getString("_UI_WebsiteProperties_type") + " " + label;
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

		switch (notification.getFeatureID(WebsiteProperties.class)) {
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE:
			case WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL:
			case WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT:
			case WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION:
			case WebsitePackage.WEBSITE_PROPERTIES__PROJECT_NAME:
			case WebsitePackage.WEBSITE_PROPERTIES__AUTHENTICATION:
			case WebsitePackage.WEBSITE_PROPERTIES__TEST_PROJECT_NAME:
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_FORMAT:
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_TIME_FORMAT:
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_DATE_TIME_FORMAT:
			case WebsitePackage.WEBSITE_PROPERTIES__DEFAULT_MAXIMUM_UPLOAD_SIZE:
			case WebsitePackage.WEBSITE_PROPERTIES__DATABASE_TECHNOLOGY:
			case WebsitePackage.WEBSITE_PROPERTIES__ORM_TECHNOLOGY:
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
			case WebsitePackage.WEBSITE_PROPERTIES__AJAX_TECHNOLOGY:
			case WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SITE_KEY:
			case WebsitePackage.WEBSITE_PROPERTIES__CAPTCHA_SECRET_KEY:
			case WebsitePackage.WEBSITE_PROPERTIES__TOP_NAVIGATION_ID:
			case WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE:
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

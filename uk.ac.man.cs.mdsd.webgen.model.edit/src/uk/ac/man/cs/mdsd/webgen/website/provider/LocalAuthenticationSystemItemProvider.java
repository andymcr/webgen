/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Classifier;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.UnitSource;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalAuthenticationSystemItemProvider
	extends AuthenticationItemProvider
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
	public LocalAuthenticationSystemItemProvider(AdapterFactory adapterFactory) {
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

			addUserSourcePropertyDescriptor(object);
			addUserAuthenticationKeyPropertyDescriptor(object);
			addAuthenticationSourcePropertyDescriptor(object);
			addAllowSelfRegistrationPropertyDescriptor(object);
			addTrackLoginAttemptsPropertyDescriptor(object);
			addAllowAutoLoginPropertyDescriptor(object);
			addUseEmailActivationPropertyDescriptor(object);
			addSendWelcomeEmailPropertyDescriptor(object);
			addUseCaptchaPropertyDescriptor(object);
			addCaptchaPublicKeyPropertyDescriptor(object);
			addCaptchaPrivateKeyPropertyDescriptor(object);
			addRegistrationUnitPropertyDescriptor(object);
			addLoginUnitPropertyDescriptor(object);
			addForgottenPasswordUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the User Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addUserSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_LocalAuthenticationSystem_userSource_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_userSource_feature", "_UI_LocalAuthenticationSystem_type"),
			WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__USER_SOURCE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof LocalAuthenticationSystem) {
						final EObject eRoot = EcoreUtil.getRootContainer((LocalAuthenticationSystem) object);
						if (eRoot instanceof WebGenModel) {
							final WebGenModel model = (WebGenModel) eRoot;
							final List<UnitSource> sources = new LinkedList<UnitSource>();
							sources.addAll(model.getServices());
							for (Classifier classifier : model.getClassifiers()) {
								if (classifier instanceof Entity) {
									final Entity entity = (Entity) classifier;
									if (entity.getServedBy().size() == 0) {
										sources.add(entity);
									}
								}
							}
							return sources;
						}
					}
					return Collections.emptyList();
				}
			});
	}

	/**
	 * This adds a property descriptor for the Authentication Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addUserAuthenticationKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_LocalAuthenticationSystem_userAuthenticationKey_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_userAuthenticationKey_feature", "_UI_LocalAuthenticationSystem_type"),
			WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__USER_AUTHENTICATION_KEY,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof LocalAuthenticationSystem) {
						final LocalAuthenticationSystem authSystem
							= (LocalAuthenticationSystem) object;
						if (authSystem.getUserSource() != null) {
							final UnitSource source = authSystem.getUserSource();
							if (source instanceof Entity) {
								final List<Feature> features = new LinkedList<Feature>();
								for (Feature feature : ((Entity) source).getFeatures()) {
									if (!(feature instanceof Association)) {
										features.add(feature);
									}
								}
								return features;
							}
							if (source instanceof Service) {
								final List<Feature> features = new LinkedList<Feature>();
								for (Entity entity : ((Service) source).getEncapsulates()) {
									for (Feature feature : entity.getFeatures()) {
										if (!(feature instanceof Association)) {
											features.add(feature);
										}
									}
								}
								return features;
							}
						}
					}
					return super.getChoiceOfValues(object);
				}
			});
	}

	/**
	 * This adds a property descriptor for the Authentication Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_authenticationSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_authenticationSource_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Self Registration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowSelfRegistrationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_allowSelfRegistration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_allowSelfRegistration_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Track Login Attempts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrackLoginAttemptsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_trackLoginAttempts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_trackLoginAttempts_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Auto Login feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowAutoLoginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_allowAutoLogin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_allowAutoLogin_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_AUTO_LOGIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Email Activation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseEmailActivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_useEmailActivation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_useEmailActivation_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Send Welcome Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendWelcomeEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_sendWelcomeEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_sendWelcomeEmail_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Captcha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseCaptchaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_useCaptcha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_useCaptcha_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Captcha Public Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptchaPublicKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_captchaPublicKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_captchaPublicKey_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA_PUBLIC_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Captcha Private Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptchaPrivateKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_captchaPrivateKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_captchaPrivateKey_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA_PRIVATE_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Registration Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegistrationUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_registrationUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_registrationUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Login Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoginUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_loginUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_loginUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Forgotten Password Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForgottenPasswordUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_forgottenPasswordUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_forgottenPasswordUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_AuthenticationPropertyCategory"),
				 null));
	}

	/**
	 * This returns LocalAuthenticationSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LocalAuthenticationSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LocalAuthenticationSystem)object).getLoginLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_LocalAuthenticationSystem_type") :
			getString("_UI_LocalAuthenticationSystem_type") + " " + label;
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

		switch (notification.getFeatureID(LocalAuthenticationSystem.class)) {
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS:
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_AUTO_LOGIN:
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA_PUBLIC_KEY:
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA_PRIVATE_KEY:
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

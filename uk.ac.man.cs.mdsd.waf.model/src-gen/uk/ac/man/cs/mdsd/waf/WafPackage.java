/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.waf.WafFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel editDirectory='/uk.ac.man.cs.mdsd.waf.edit/src' editPluginID='uk.ac.man.cs.mdsd.waf.edit' childCreationExtenders='true' editorDirectory='/uk.ac.man.cs.mdsd.waf.editor/src' basePackage='uk.ac.man.cs.mdsd'"
 * @generated
 */
public interface WafPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "waf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.manchester.ac.uk/mdsd/WebApplicationFramework";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "waf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WafPackage eINSTANCE = uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafModelImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getWafModel()
	 * @generated
	 */
	int WAF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__PERSISTENCE = 0;

	/**
	 * The feature id for the '<em><b>Business</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__BUSINESS = 1;

	/**
	 * The feature id for the '<em><b>Image Manipulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__IMAGE_MANIPULATIONS = 2;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__PAGES = 3;

	/**
	 * The feature id for the '<em><b>Global Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__GLOBAL_MENUS = 4;

	/**
	 * The feature id for the '<em><b>Dynamic Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__DYNAMIC_MENUS = 5;

	/**
	 * The feature id for the '<em><b>Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__API = 6;

	/**
	 * The feature id for the '<em><b>Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__SITE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Site Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__SITE_TITLE = 8;

	/**
	 * The feature id for the '<em><b>Webmaster Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__WEBMASTER_EMAIL = 9;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__COPYRIGHT_TEXT = 10;

	/**
	 * The feature id for the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__META_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Logo Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__LOGO_IMAGE = 12;

	/**
	 * The feature id for the '<em><b>Logo Filters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__LOGO_FILTERS = 13;

	/**
	 * The feature id for the '<em><b>Framework Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__FRAMEWORK_TECHNOLOGY = 14;

	/**
	 * The feature id for the '<em><b>Input Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__INPUT_TECHNOLOGY = 15;

	/**
	 * The feature id for the '<em><b>Ajax Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__AJAX_TECHNOLOGY = 16;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__AUTHENTICATION = 17;

	/**
	 * The feature id for the '<em><b>Captcha Site Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__CAPTCHA_SITE_KEY = 18;

	/**
	 * The feature id for the '<em><b>Captcha Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__CAPTCHA_SECRET_KEY = 19;

	/**
	 * The feature id for the '<em><b>Text Editor URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__TEXT_EDITOR_URL = 20;

	/**
	 * The feature id for the '<em><b>Top Navigation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__TOP_NAVIGATION_ID = 21;

	/**
	 * The feature id for the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__SIDE_MENU = 22;

	/**
	 * The feature id for the '<em><b>Site Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__SITE_TEMPLATE = 23;

	/**
	 * The feature id for the '<em><b>Static Units Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL__STATIC_UNITS_EDITABLE = 24;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAF_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.AuthenticationImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 1;

	/**
	 * The feature id for the '<em><b>Authorises</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__AUTHORISES = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__USER = 1;

	/**
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__USER_KEY = 2;

	/**
	 * The feature id for the '<em><b>Login Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__LOGIN_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Logout Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__LOGOUT_LABEL = 4;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl <em>Local Authentication System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getLocalAuthenticationSystem()
	 * @generated
	 */
	int LOCAL_AUTHENTICATION_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Authorises</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHORISES = AUTHENTICATION__AUTHORISES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER = AUTHENTICATION__USER;

	/**
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER_KEY = AUTHENTICATION__USER_KEY;

	/**
	 * The feature id for the '<em><b>Login Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGIN_LABEL = AUTHENTICATION__LOGIN_LABEL;

	/**
	 * The feature id for the '<em><b>Logout Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_LABEL = AUTHENTICATION__LOGOUT_LABEL;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authentication Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Login Attempt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auto Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN = AUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA = AUTHENTICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allow Remember Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME = AUTHENTICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allow Self Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION = AUTHENTICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Use Email Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION = AUTHENTICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Send Welcome Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL = AUTHENTICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Registration Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT = AUTHENTICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Login Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT = AUTHENTICATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Forgotten Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT = AUTHENTICATION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.CasAuthenticationImpl <em>Cas Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.CasAuthenticationImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCasAuthentication()
	 * @generated
	 */
	int CAS_AUTHENTICATION = 3;

	/**
	 * The feature id for the '<em><b>Authorises</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__AUTHORISES = AUTHENTICATION__AUTHORISES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__USER = AUTHENTICATION__USER;

	/**
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__USER_KEY = AUTHENTICATION__USER_KEY;

	/**
	 * The feature id for the '<em><b>Login Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__LOGIN_LABEL = AUTHENTICATION__LOGIN_LABEL;

	/**
	 * The feature id for the '<em><b>Logout Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__LOGOUT_LABEL = AUTHENTICATION__LOGOUT_LABEL;

	/**
	 * The number of structural features of the '<em>Cas Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cas Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.DisplayElementImpl <em>Display Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.DisplayElementImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDisplayElement()
	 * @generated
	 */
	int DISPLAY_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_ELEMENT__DISPLAY_LABEL = 0;

	/**
	 * The number of structural features of the '<em>Display Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Display Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ImageManipulationImpl <em>Image Manipulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ImageManipulationImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getImageManipulation()
	 * @generated
	 */
	int IMAGE_MANIPULATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANIPULATION__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jpeg Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANIPULATION__JPEG_QUALITY = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANIPULATION__FILTERS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image Manipulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANIPULATION_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image Manipulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANIPULATION_OPERATION_COUNT = OrmPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ImageFilterImpl <em>Image Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ImageFilterImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getImageFilter()
	 * @generated
	 */
	int IMAGE_FILTER = 6;

	/**
	 * The number of structural features of the '<em>Image Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FILTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Image Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ThumbnailFilterImpl <em>Thumbnail Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ThumbnailFilterImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getThumbnailFilter()
	 * @generated
	 */
	int THUMBNAIL_FILTER = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FILTER__WIDTH = IMAGE_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FILTER__HEIGHT = IMAGE_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FILTER__MODE = IMAGE_FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Thumbnail Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FILTER_FEATURE_COUNT = IMAGE_FILTER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Thumbnail Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FILTER_OPERATION_COUNT = IMAGE_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.MenuImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ENTRIES = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__OMIT_CAPTION = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CAPTION_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__STYLE_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__LAYOUT_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.GlobalMenuImpl <em>Global Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.GlobalMenuImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getGlobalMenu()
	 * @generated
	 */
	int GLOBAL_MENU = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__NAME = MENU__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__DISPLAY_LABEL = MENU__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__ENTRIES = MENU__ENTRIES;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__OMIT_CAPTION = MENU__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__CAPTION_CLASS = MENU__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__STYLE_CLASS = MENU__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__LAYOUT_CLASS = MENU__LAYOUT_CLASS;

	/**
	 * The number of structural features of the '<em>Global Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Global Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU_OPERATION_COUNT = MENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.DynamicMenuImpl <em>Dynamic Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.DynamicMenuImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDynamicMenu()
	 * @generated
	 */
	int DYNAMIC_MENU = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__NAME = MENU__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__DISPLAY_LABEL = MENU__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__ENTRIES = MENU__ENTRIES;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__OMIT_CAPTION = MENU__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__CAPTION_CLASS = MENU__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__STYLE_CLASS = MENU__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__LAYOUT_CLASS = MENU__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Entity Or View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__ENTITY_OR_VIEW = MENU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__SELECTION = MENU_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__TITLE = MENU_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamic Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dynamic Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU_OPERATION_COUNT = MENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.MenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getMenuEntry()
	 * @generated
	 */
	int MENU_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__PART_OF = 0;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__REQUIRES_ROLE = 1;

	/**
	 * The number of structural features of the '<em>Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ActionMenuEntryImpl <em>Action Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ActionMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getActionMenuEntry()
	 * @generated
	 */
	int ACTION_MENU_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__REQUIRES_ROLE = MENU_ENTRY__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__NAME = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__ACTION = MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__QUERY = MENU_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY_OPERATION_COUNT = MENU_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.EditStaticTextMenuEntryImpl <em>Edit Static Text Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.EditStaticTextMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getEditStaticTextMenuEntry()
	 * @generated
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY = 13;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__REQUIRES_ROLE = MENU_ENTRY__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__NAME = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edit Static Text Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edit Static Text Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY_OPERATION_COUNT = MENU_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.PageImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UNITS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PART_OF = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PARENT_PAGE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CHILD_PAGES = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__URI_ELEMENT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Top Menu Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOP_MENU_OPTION = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Top Menu Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOP_MENU_REQUIRES_ROLE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Top Menu Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOP_MENU_RANK = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Navigation Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAVIGATION_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SIDE_MENU = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__STYLE_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.QueryImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__FILTER = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__PARAMETERS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = OrmPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.QueryParameterImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getQueryParameter()
	 * @generated
	 */
	int QUERY_PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__FORMAL = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__VALUE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_OPERATION_COUNT = OrmPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.UnitContainer <em>Unit Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.UnitContainer
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitContainer()
	 * @generated
	 */
	int UNIT_CONTAINER = 17;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONTAINER__UNITS = 0;

	/**
	 * The number of structural features of the '<em>Unit Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unit Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ContentUnitImpl <em>Content Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ContentUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getContentUnit()
	 * @generated
	 */
	int CONTENT_UNIT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__DISPLAYED_ON = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__URI_ELEMENT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__ROUTE_ACTUALS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__REQUIRES_ROLE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__PURPOSE_SUMMARY = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__ALTERNATIVE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__OMIT_CAPTION = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__CAPTION_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__STYLE_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__CONTENT_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_OPERATION_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.RouteActualImpl <em>Route Actual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.RouteActualImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getRouteActual()
	 * @generated
	 */
	int ROUTE_ACTUAL = 19;

	/**
	 * The feature id for the '<em><b>Route Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ACTUAL__ROUTE_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ACTUAL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Route Actual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ACTUAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Route Actual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ACTUAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.StaticUnitImpl <em>Static Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.StaticUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getStaticUnit()
	 * @generated
	 */
	int STATIC_UNIT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__URI_ELEMENT = CONTENT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__ROUTE_ACTUALS = CONTENT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__REQUIRES_ROLE = CONTENT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__ALTERNATIVE = CONTENT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__STYLE_CLASS = CONTENT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CONTENT_CLASS = CONTENT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__SERVICE = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CONTENT = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Static Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_OPERATION_COUNT = CONTENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.DynamicUnitImpl <em>Dynamic Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.DynamicUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDynamicUnit()
	 * @generated
	 */
	int DYNAMIC_UNIT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__URI_ELEMENT = CONTENT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ROUTE_ACTUALS = CONTENT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__REQUIRES_ROLE = CONTENT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ALTERNATIVE = CONTENT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__STYLE_CLASS = CONTENT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CONTENT_CLASS = CONTENT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAY_FIELDS = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__SUPPORT_ACTIONS = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HEADER = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__FOOTER = CONTENT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HEADER_CLASS = CONTENT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CONTROL_CLASS = CONTENT_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__FOOTER_CLASS = CONTENT_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ERROR_CLASS = CONTENT_UNIT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Dynamic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Dynamic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_OPERATION_COUNT = CONTENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.UnitSupportActionImpl <em>Unit Support Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.UnitSupportActionImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitSupportAction()
	 * @generated
	 */
	int UNIT_SUPPORT_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__DISABLE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION_OPERATION_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.UnitField <em>Unit Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.UnitField
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitField()
	 * @generated
	 */
	int UNIT_FIELD = 23;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DISPLAY_LABEL = DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DISPLAYED_ON = DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__REQUIRES_ROLE = DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__TITLE = DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__COLLECTION_DISPLAY_OPTION = DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__MAXIMUM_DISPLAY_SIZE = DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DATE_FORMAT = DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DISABLE_INPUT = DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Unit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD_FEATURE_COUNT = DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Unit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD_OPERATION_COUNT = DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl <em>Unit Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitFeature()
	 * @generated
	 */
	int UNIT_FEATURE = 24;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_LABEL = UNIT_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAYED_ON = UNIT_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__REQUIRES_ROLE = UNIT_FIELD__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__TITLE = UNIT_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_DISPLAY_OPTION = UNIT_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE = UNIT_FIELD__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DATE_FORMAT = UNIT_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISABLE_INPUT = UNIT_FIELD__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ACTIONS = UNIT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FORCED_VALUE = UNIT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD = UNIT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE = UNIT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__NULL_DISPLAY_VALUE = UNIT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY = UNIT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__AUTOFOCUS = UNIT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FOOTER = UNIT_FIELD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__HEADER_CLASS = UNIT_FIELD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__INPUT_CLASS = UNIT_FIELD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_CLASS = UNIT_FIELD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FOOTER_CLASS = UNIT_FIELD_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Unit Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_FEATURE_COUNT = UNIT_FIELD_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Unit Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_OPERATION_COUNT = UNIT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.UnitAttributeImpl <em>Unit Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.UnitAttributeImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitAttribute()
	 * @generated
	 */
	int UNIT_ATTRIBUTE = 25;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__DISPLAY_LABEL = UNIT_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__DISPLAYED_ON = UNIT_FEATURE__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__REQUIRES_ROLE = UNIT_FEATURE__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__TITLE = UNIT_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__COLLECTION_DISPLAY_OPTION = UNIT_FEATURE__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__MAXIMUM_DISPLAY_SIZE = UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__DATE_FORMAT = UNIT_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__DISABLE_INPUT = UNIT_FEATURE__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__ACTIONS = UNIT_FEATURE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__FORCED_VALUE = UNIT_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__COLLECTION_UI_ALLOW_ADD = UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__COLLECTION_UI_ALLOW_REMOVE = UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__NULL_DISPLAY_VALUE = UNIT_FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__ONLY_DISPLAY_WHEN_NOT_EMPTY = UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__AUTOFOCUS = UNIT_FEATURE__AUTOFOCUS;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__FOOTER = UNIT_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__HEADER_CLASS = UNIT_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__INPUT_CLASS = UNIT_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__DISPLAY_CLASS = UNIT_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__FOOTER_CLASS = UNIT_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__ATTRIBUTE = UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__NAME = UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__DEFAULT_VALUE = UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__OBFUSCATE_FORM_FIELDS = UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__PLACEHOLDER = UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE__VALIDATION_PATTERN = UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Unit Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE_FEATURE_COUNT = UNIT_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Unit Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ATTRIBUTE_OPERATION_COUNT = UNIT_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.UnitAssociationImpl <em>Unit Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.UnitAssociationImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitAssociation()
	 * @generated
	 */
	int UNIT_ASSOCIATION = 26;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAY_LABEL = UNIT_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAYED_ON = UNIT_FEATURE__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__REQUIRES_ROLE = UNIT_FEATURE__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__TITLE = UNIT_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION = UNIT_FEATURE__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE = UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DATE_FORMAT = UNIT_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISABLE_INPUT = UNIT_FEATURE__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ACTIONS = UNIT_FEATURE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FORCED_VALUE = UNIT_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_UI_ALLOW_ADD = UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_UI_ALLOW_REMOVE = UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__NULL_DISPLAY_VALUE = UNIT_FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY = UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__AUTOFOCUS = UNIT_FEATURE__AUTOFOCUS;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FOOTER = UNIT_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__HEADER_CLASS = UNIT_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__INPUT_CLASS = UNIT_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAY_CLASS = UNIT_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FOOTER_CLASS = UNIT_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__UNITS = UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__NAME = UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ASSOCIATION = UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__VALUE_DISPLAY = UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__CHILD_FEATURE = UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__SELECTION = UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ajax Options List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__AJAX_OPTIONS_LIST = UNIT_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Unit Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION_FEATURE_COUNT = UNIT_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Unit Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION_OPERATION_COUNT = UNIT_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.AssociationReferenceImpl <em>Association Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.AssociationReferenceImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getAssociationReference()
	 * @generated
	 */
	int ASSOCIATION_REFERENCE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__VALUE_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__CHILD_FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Association Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Association Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.InterfaceFieldImpl <em>Interface Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.InterfaceFieldImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getInterfaceField()
	 * @generated
	 */
	int INTERFACE_FIELD = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISPLAY_LABEL = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISPLAYED_ON = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__REQUIRES_ROLE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__TITLE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DATE_FORMAT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISABLE_INPUT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__REQUIRED = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DEFAULT_VALUE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__MUST_MATCH = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__INTERFACE_TYPE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__PLACEHOLDER = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__VALIDATION_PATTERN = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__INPUT_CLASS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Interface Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Interface Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD_OPERATION_COUNT = OrmPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.DataTypeFieldImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDataTypeField()
	 * @generated
	 */
	int DATA_TYPE_FIELD = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__REQUIRES_ROLE = INTERFACE_FIELD__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__TITLE = INTERFACE_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__COLLECTION_DISPLAY_OPTION = INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__MAXIMUM_DISPLAY_SIZE = INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISABLE_INPUT = INTERFACE_FIELD__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__REQUIRED = INTERFACE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__INTERFACE_TYPE = INTERFACE_FIELD__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__PLACEHOLDER = INTERFACE_FIELD__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__VALIDATION_PATTERN = INTERFACE_FIELD__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DATA_TYPE = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Insensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__CASE_INSENSITIVE = INTERFACE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS = INTERFACE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__ENCRYPT = INTERFACE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_OPERATION_COUNT = INTERFACE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.DateFieldImpl <em>Date Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.DateFieldImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDateField()
	 * @generated
	 */
	int DATE_FIELD = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__REQUIRES_ROLE = INTERFACE_FIELD__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__TITLE = INTERFACE_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__COLLECTION_DISPLAY_OPTION = INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__MAXIMUM_DISPLAY_SIZE = INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DISABLE_INPUT = INTERFACE_FIELD__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__REQUIRED = INTERFACE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__INTERFACE_TYPE = INTERFACE_FIELD__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__PLACEHOLDER = INTERFACE_FIELD__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__VALIDATION_PATTERN = INTERFACE_FIELD__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DETAILS = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__FORMAT = INTERFACE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_OPERATION_COUNT = INTERFACE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.CaptchaFieldImpl <em>Captcha Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.CaptchaFieldImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCaptchaField()
	 * @generated
	 */
	int CAPTCHA_FIELD = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__REQUIRES_ROLE = INTERFACE_FIELD__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__TITLE = INTERFACE_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__COLLECTION_DISPLAY_OPTION = INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__MAXIMUM_DISPLAY_SIZE = INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DISABLE_INPUT = INTERFACE_FIELD__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__REQUIRED = INTERFACE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__INTERFACE_TYPE = INTERFACE_FIELD__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__PLACEHOLDER = INTERFACE_FIELD__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__VALIDATION_PATTERN = INTERFACE_FIELD__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

	/**
	 * The number of structural features of the '<em>Captcha Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Captcha Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD_OPERATION_COUNT = INTERFACE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.SelectableUnit <em>Selectable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.SelectableUnit
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getSelectableUnit()
	 * @generated
	 */
	int SELECTABLE_UNIT = 32;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_UNIT__SELECTORS = 0;

	/**
	 * The number of structural features of the '<em>Selectable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_UNIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Selectable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.SingletonUnit <em>Singleton Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.SingletonUnit
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getSingletonUnit()
	 * @generated
	 */
	int SINGLETON_UNIT = 33;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CONTENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Singleton Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Singleton Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit <em>Collection Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCollectionUnit()
	 * @generated
	 */
	int COLLECTION_UNIT = 34;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SELECTORS = SELECTABLE_UNIT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTENT_TYPE = SELECTABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SELECTION = SELECTABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FILTER = SELECTABLE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SUPPORTED_FILTERS = SELECTABLE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__EMPTY_MESSAGE = SELECTABLE_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE = SELECTABLE_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE = SELECTABLE_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_NPAGES = SELECTABLE_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_NPAGES = SELECTABLE_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_PAGE_LABEL = SELECTABLE_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_PAGE_ICON_NAME = SELECTABLE_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_PAGE_LABEL = SELECTABLE_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME = SELECTABLE_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS = SELECTABLE_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = SELECTABLE_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIRST_PAGE_LABEL = SELECTABLE_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIRST_PAGE_ICON_NAME = SELECTABLE_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LAST_PAGE_LABEL = SELECTABLE_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LAST_PAGE_ICON_NAME = SELECTABLE_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION_CLASS = SELECTABLE_UNIT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS = SELECTABLE_UNIT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Collection Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_FEATURE_COUNT = SELECTABLE_UNIT_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Collection Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_OPERATION_COUNT = SELECTABLE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.EditUnitImpl <em>Edit Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.EditUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getEditUnit()
	 * @generated
	 */
	int EDIT_UNIT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__STYLE_CLASS = DYNAMIC_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTENT_CLASS = DYNAMIC_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTENT_TYPE = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ON_SAVE_CONTINUE_EDITING = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disable Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISABLE_CONDITION = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__TITLE = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_DESTINATION = DYNAMIC_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CANCEL_DESTINATION = DYNAMIC_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CANCEL_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CUSTOMISE_VALUES = DYNAMIC_UNIT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Edit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Edit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.CreateUnitImpl <em>Create Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.CreateUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCreateUnit()
	 * @generated
	 */
	int CREATE_UNIT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__STYLE_CLASS = EDIT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ON_SAVE_CONTINUE_EDITING = EDIT_UNIT__ON_SAVE_CONTINUE_EDITING;

	/**
	 * The feature id for the '<em><b>Disable Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISABLE_CONDITION = EDIT_UNIT__DISABLE_CONDITION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

	/**
	 * The number of structural features of the '<em>Create Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.CreateUpdateUnitImpl <em>Create Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.CreateUpdateUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCreateUpdateUnit()
	 * @generated
	 */
	int CREATE_UPDATE_UNIT = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__STYLE_CLASS = EDIT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING = EDIT_UNIT__ON_SAVE_CONTINUE_EDITING;

	/**
	 * The feature id for the '<em><b>Disable Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISABLE_CONDITION = EDIT_UNIT__DISABLE_CONDITION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__SELECTORS = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Create Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clear Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CLEAR_LABEL = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Create Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Create Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.MapUnitImpl <em>Map Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.MapUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getMapUnit()
	 * @generated
	 */
	int MAP_UNIT = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__STYLE_CLASS = EDIT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ON_SAVE_CONTINUE_EDITING = EDIT_UNIT__ON_SAVE_CONTINUE_EDITING;

	/**
	 * The feature id for the '<em><b>Disable Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISABLE_CONDITION = EDIT_UNIT__DISABLE_CONDITION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__SELECTORS = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__READ_ONLY = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Zoom Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DEFAULT_ZOOM_LEVEL = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCATION = EDIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Place Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__PLACE_NAME = EDIT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Map Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Map Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.UpdateUnitImpl <em>Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.UpdateUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUpdateUnit()
	 * @generated
	 */
	int UPDATE_UNIT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__STYLE_CLASS = EDIT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING = EDIT_UNIT__ON_SAVE_CONTINUE_EDITING;

	/**
	 * The feature id for the '<em><b>Disable Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISABLE_CONDITION = EDIT_UNIT__DISABLE_CONDITION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__SELECTORS = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.DataUnitImpl <em>Data Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.DataUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDataUnit()
	 * @generated
	 */
	int DATA_UNIT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__STYLE_CLASS = DYNAMIC_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__CONTENT_CLASS = DYNAMIC_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DEFAULT_SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__TITLE = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.DetailsUnitImpl <em>Details Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.DetailsUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDetailsUnit()
	 * @generated
	 */
	int DETAILS_UNIT = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__NAME = DATA_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAY_LABEL = DATA_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAYED_ON = DATA_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__URI_ELEMENT = DATA_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ROUTE_ACTUALS = DATA_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__REQUIRES_ROLE = DATA_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__PURPOSE_SUMMARY = DATA_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ALTERNATIVE = DATA_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__OMIT_CAPTION = DATA_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CAPTION_CLASS = DATA_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__STYLE_CLASS = DATA_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTENT_CLASS = DATA_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAY_FIELDS = DATA_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SUPPORT_ACTIONS = DATA_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__HEADER = DATA_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__FOOTER = DATA_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__HEADER_CLASS = DATA_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTROL_CLASS = DATA_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__FOOTER_CLASS = DATA_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ERROR_CLASS = DATA_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DEFAULT_SELECTION = DATA_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__TITLE = DATA_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY = DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTENT_TYPE = DATA_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SELECTORS = DATA_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__OMIT_FIELD_LABELS = DATA_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Details Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_FEATURE_COUNT = DATA_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Details Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_OPERATION_COUNT = DATA_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.IndexUnitImpl <em>Index Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.IndexUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getIndexUnit()
	 * @generated
	 */
	int INDEX_UNIT = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NAME = DATA_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAY_LABEL = DATA_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAYED_ON = DATA_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__URI_ELEMENT = DATA_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ROUTE_ACTUALS = DATA_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__REQUIRES_ROLE = DATA_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PURPOSE_SUMMARY = DATA_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ALTERNATIVE = DATA_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OMIT_CAPTION = DATA_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CAPTION_CLASS = DATA_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__STYLE_CLASS = DATA_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTENT_CLASS = DATA_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAY_FIELDS = DATA_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SUPPORT_ACTIONS = DATA_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__HEADER = DATA_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FOOTER = DATA_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__HEADER_CLASS = DATA_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTROL_CLASS = DATA_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FOOTER_CLASS = DATA_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ERROR_CLASS = DATA_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DEFAULT_SELECTION = DATA_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__TITLE = DATA_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY = DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SELECTORS = DATA_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTENT_TYPE = DATA_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SELECTION = DATA_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FILTER = DATA_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SUPPORTED_FILTERS = DATA_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__EMPTY_MESSAGE = DATA_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DEFAULT_PAGINATION_SIZE = DATA_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__MAXIMUM_PAGINATION_SIZE = DATA_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NEXT_NPAGES = DATA_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PREVIOUS_NPAGES = DATA_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NEXT_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NEXT_PAGE_ICON_NAME = DATA_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PREVIOUS_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PREVIOUS_PAGE_ICON_NAME = DATA_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__USE_DISABLED_PAGE_LINKS = DATA_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS = DATA_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FIRST_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FIRST_PAGE_ICON_NAME = DATA_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__LAST_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__LAST_PAGE_ICON_NAME = DATA_UNIT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PAGINATION_CLASS = DATA_UNIT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PAGINATION_ELEMENT_CLASS = DATA_UNIT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ACTIONS = DATA_UNIT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OMIT_COLUMN_LABELS = DATA_UNIT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Targetting Searches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__TARGETTING_SEARCHES = DATA_UNIT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ROW_CLASSES = DATA_UNIT_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT_FEATURE_COUNT = DATA_UNIT_FEATURE_COUNT + 26;

	/**
	 * The number of operations of the '<em>Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT_OPERATION_COUNT = DATA_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.IndexGridUnitImpl <em>Index Grid Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.IndexGridUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getIndexGridUnit()
	 * @generated
	 */
	int INDEX_GRID_UNIT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__NAME = INDEX_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__DISPLAY_LABEL = INDEX_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__DISPLAYED_ON = INDEX_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__URI_ELEMENT = INDEX_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__ROUTE_ACTUALS = INDEX_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__REQUIRES_ROLE = INDEX_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__PURPOSE_SUMMARY = INDEX_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__ALTERNATIVE = INDEX_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__OMIT_CAPTION = INDEX_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__CAPTION_CLASS = INDEX_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__STYLE_CLASS = INDEX_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__CONTENT_CLASS = INDEX_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__DISPLAY_FIELDS = INDEX_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__SUPPORT_ACTIONS = INDEX_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__HEADER = INDEX_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__FOOTER = INDEX_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__HEADER_CLASS = INDEX_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__CONTROL_CLASS = INDEX_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__FOOTER_CLASS = INDEX_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__ERROR_CLASS = INDEX_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__DEFAULT_SELECTION = INDEX_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__TITLE = INDEX_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY = INDEX_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__SELECTORS = INDEX_UNIT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__CONTENT_TYPE = INDEX_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__SELECTION = INDEX_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__FILTER = INDEX_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__SUPPORTED_FILTERS = INDEX_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__EMPTY_MESSAGE = INDEX_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__DEFAULT_PAGINATION_SIZE = INDEX_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__MAXIMUM_PAGINATION_SIZE = INDEX_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__NEXT_NPAGES = INDEX_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__PREVIOUS_NPAGES = INDEX_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__NEXT_PAGE_LABEL = INDEX_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__NEXT_PAGE_ICON_NAME = INDEX_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__PREVIOUS_PAGE_LABEL = INDEX_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__PREVIOUS_PAGE_ICON_NAME = INDEX_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__USE_DISABLED_PAGE_LINKS = INDEX_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__USE_FIRST_LAST_PAGE_LINKS = INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__FIRST_PAGE_LABEL = INDEX_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__FIRST_PAGE_ICON_NAME = INDEX_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__LAST_PAGE_LABEL = INDEX_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__LAST_PAGE_ICON_NAME = INDEX_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__PAGINATION_CLASS = INDEX_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__PAGINATION_ELEMENT_CLASS = INDEX_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__ACTIONS = INDEX_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__OMIT_COLUMN_LABELS = INDEX_UNIT__OMIT_COLUMN_LABELS;

	/**
	 * The feature id for the '<em><b>Targetting Searches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__TARGETTING_SEARCHES = INDEX_UNIT__TARGETTING_SEARCHES;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__ROW_CLASSES = INDEX_UNIT__ROW_CLASSES;

	/**
	 * The number of structural features of the '<em>Index Grid Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT_FEATURE_COUNT = INDEX_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index Grid Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT_OPERATION_COUNT = INDEX_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.IndexPageDirectionUnitImpl <em>Index Page Direction Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.IndexPageDirectionUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getIndexPageDirectionUnit()
	 * @generated
	 */
	int INDEX_PAGE_DIRECTION_UNIT = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__NAME = INDEX_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__DISPLAY_LABEL = INDEX_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__DISPLAYED_ON = INDEX_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__URI_ELEMENT = INDEX_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__ROUTE_ACTUALS = INDEX_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__REQUIRES_ROLE = INDEX_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__PURPOSE_SUMMARY = INDEX_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__ALTERNATIVE = INDEX_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__OMIT_CAPTION = INDEX_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__CAPTION_CLASS = INDEX_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__STYLE_CLASS = INDEX_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__CONTENT_CLASS = INDEX_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__DISPLAY_FIELDS = INDEX_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__SUPPORT_ACTIONS = INDEX_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__HEADER = INDEX_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__FOOTER = INDEX_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__HEADER_CLASS = INDEX_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__CONTROL_CLASS = INDEX_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__FOOTER_CLASS = INDEX_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__ERROR_CLASS = INDEX_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__DEFAULT_SELECTION = INDEX_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__TITLE = INDEX_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY = INDEX_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__SELECTORS = INDEX_UNIT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__CONTENT_TYPE = INDEX_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__SELECTION = INDEX_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__FILTER = INDEX_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__SUPPORTED_FILTERS = INDEX_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__EMPTY_MESSAGE = INDEX_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__DEFAULT_PAGINATION_SIZE = INDEX_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__MAXIMUM_PAGINATION_SIZE = INDEX_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__NEXT_NPAGES = INDEX_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__PREVIOUS_NPAGES = INDEX_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__NEXT_PAGE_LABEL = INDEX_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__NEXT_PAGE_ICON_NAME = INDEX_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__PREVIOUS_PAGE_LABEL = INDEX_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__PREVIOUS_PAGE_ICON_NAME = INDEX_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__USE_DISABLED_PAGE_LINKS = INDEX_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__FIRST_PAGE_LABEL = INDEX_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__FIRST_PAGE_ICON_NAME = INDEX_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__LAST_PAGE_LABEL = INDEX_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__LAST_PAGE_ICON_NAME = INDEX_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__PAGINATION_CLASS = INDEX_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__PAGINATION_ELEMENT_CLASS = INDEX_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__ACTIONS = INDEX_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__OMIT_COLUMN_LABELS = INDEX_UNIT__OMIT_COLUMN_LABELS;

	/**
	 * The feature id for the '<em><b>Targetting Searches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__TARGETTING_SEARCHES = INDEX_UNIT__TARGETTING_SEARCHES;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__ROW_CLASSES = INDEX_UNIT__ROW_CLASSES;

	/**
	 * The number of structural features of the '<em>Index Page Direction Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT_FEATURE_COUNT = INDEX_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index Page Direction Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT_OPERATION_COUNT = INDEX_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.IndexLineDirectionUnitImpl <em>Index Line Direction Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.IndexLineDirectionUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getIndexLineDirectionUnit()
	 * @generated
	 */
	int INDEX_LINE_DIRECTION_UNIT = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__NAME = INDEX_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__DISPLAY_LABEL = INDEX_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__DISPLAYED_ON = INDEX_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__URI_ELEMENT = INDEX_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__ROUTE_ACTUALS = INDEX_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__REQUIRES_ROLE = INDEX_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__PURPOSE_SUMMARY = INDEX_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__ALTERNATIVE = INDEX_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__OMIT_CAPTION = INDEX_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__CAPTION_CLASS = INDEX_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__STYLE_CLASS = INDEX_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__CONTENT_CLASS = INDEX_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__DISPLAY_FIELDS = INDEX_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__SUPPORT_ACTIONS = INDEX_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__HEADER = INDEX_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__FOOTER = INDEX_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__HEADER_CLASS = INDEX_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__CONTROL_CLASS = INDEX_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__FOOTER_CLASS = INDEX_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__ERROR_CLASS = INDEX_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__DEFAULT_SELECTION = INDEX_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__TITLE = INDEX_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY = INDEX_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__SELECTORS = INDEX_UNIT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__CONTENT_TYPE = INDEX_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__SELECTION = INDEX_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__FILTER = INDEX_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__SUPPORTED_FILTERS = INDEX_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__EMPTY_MESSAGE = INDEX_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__DEFAULT_PAGINATION_SIZE = INDEX_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__MAXIMUM_PAGINATION_SIZE = INDEX_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__NEXT_NPAGES = INDEX_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__PREVIOUS_NPAGES = INDEX_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__NEXT_PAGE_LABEL = INDEX_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__NEXT_PAGE_ICON_NAME = INDEX_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__PREVIOUS_PAGE_LABEL = INDEX_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__PREVIOUS_PAGE_ICON_NAME = INDEX_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__USE_DISABLED_PAGE_LINKS = INDEX_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__FIRST_PAGE_LABEL = INDEX_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__FIRST_PAGE_ICON_NAME = INDEX_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__LAST_PAGE_LABEL = INDEX_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__LAST_PAGE_ICON_NAME = INDEX_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__PAGINATION_CLASS = INDEX_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__PAGINATION_ELEMENT_CLASS = INDEX_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__ACTIONS = INDEX_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__OMIT_COLUMN_LABELS = INDEX_UNIT__OMIT_COLUMN_LABELS;

	/**
	 * The feature id for the '<em><b>Targetting Searches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__TARGETTING_SEARCHES = INDEX_UNIT__TARGETTING_SEARCHES;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__ROW_CLASSES = INDEX_UNIT__ROW_CLASSES;

	/**
	 * The number of structural features of the '<em>Index Line Direction Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT_FEATURE_COUNT = INDEX_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index Line Direction Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT_OPERATION_COUNT = INDEX_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ControlUnitImpl <em>Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ControlUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getControlUnit()
	 * @generated
	 */
	int CONTROL_UNIT = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__STYLE_CLASS = DYNAMIC_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTENT_CLASS = DYNAMIC_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SUBMIT_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CANCEL_DESTINATION = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CANCEL_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.SearchUnitImpl <em>Search Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.SearchUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getSearchUnit()
	 * @generated
	 */
	int SEARCH_UNIT = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__NAME = CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAY_LABEL = CONTROL_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAYED_ON = CONTROL_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__URI_ELEMENT = CONTROL_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ROUTE_ACTUALS = CONTROL_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__REQUIRES_ROLE = CONTROL_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__PURPOSE_SUMMARY = CONTROL_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ALTERNATIVE = CONTROL_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__OMIT_CAPTION = CONTROL_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CAPTION_CLASS = CONTROL_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__STYLE_CLASS = CONTROL_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTENT_CLASS = CONTROL_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAY_FIELDS = CONTROL_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SUPPORT_ACTIONS = CONTROL_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__HEADER = CONTROL_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__FOOTER = CONTROL_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__HEADER_CLASS = CONTROL_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTROL_CLASS = CONTROL_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__FOOTER_CLASS = CONTROL_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ERROR_CLASS = CONTROL_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SUBMIT_LABEL = CONTROL_UNIT__SUBMIT_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CANCEL_DESTINATION = CONTROL_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CANCEL_LABEL = CONTROL_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Results Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__RESULTS_DESTINATION = CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Search Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT_FEATURE_COUNT = CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Search Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT_OPERATION_COUNT = CONTROL_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl <em>Image Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getImageUnit()
	 * @generated
	 */
	int IMAGE_UNIT = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__STYLE_CLASS = DYNAMIC_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CONTENT_CLASS = DYNAMIC_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SELECTORS = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CONTENT_TYPE = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FILTER = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SUPPORTED_FILTERS = DYNAMIC_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__EMPTY_MESSAGE = DYNAMIC_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DEFAULT_PAGINATION_SIZE = DYNAMIC_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE = DYNAMIC_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NEXT_NPAGES = DYNAMIC_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PREVIOUS_NPAGES = DYNAMIC_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NEXT_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NEXT_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PREVIOUS_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__USE_DISABLED_PAGE_LINKS = DYNAMIC_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS = DYNAMIC_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FIRST_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FIRST_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__LAST_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__LAST_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PAGINATION_CLASS = DYNAMIC_UNIT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PAGINATION_ELEMENT_CLASS = DYNAMIC_UNIT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__IMAGE_PATH_FEATURE = DYNAMIC_UNIT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__TITLE_FEATURE = DYNAMIC_UNIT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__MISSING_IMAGE_PATH = DYNAMIC_UNIT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__IMAGE_FILTER = DYNAMIC_UNIT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SHOW_TIME = DYNAMIC_UNIT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__TRANSITION_TIME = DYNAMIC_UNIT_FEATURE_COUNT + 27;

	/**
	 * The number of structural features of the '<em>Image Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 28;

	/**
	 * The number of operations of the '<em>Image Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.FeaturePathImpl <em>Feature Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.FeaturePathImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getFeaturePath()
	 * @generated
	 */
	int FEATURE_PATH = 49;

	/**
	 * The number of structural features of the '<em>Feature Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Feature Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.FeaturePathAttributeImpl <em>Feature Path Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.FeaturePathAttributeImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getFeaturePathAttribute()
	 * @generated
	 */
	int FEATURE_PATH_ATTRIBUTE = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__NAME = FEATURE_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__ATTRIBUTE = FEATURE_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE_FEATURE_COUNT = FEATURE_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE_OPERATION_COUNT = FEATURE_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.FeaturePathAssociationImpl <em>Feature Path Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.FeaturePathAssociationImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getFeaturePathAssociation()
	 * @generated
	 */
	int FEATURE_PATH_ASSOCIATION = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__NAME = FEATURE_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__ASSOCIATION = FEATURE_PATH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY = FEATURE_PATH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__CHILD_FEATURE = FEATURE_PATH_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION_FEATURE_COUNT = FEATURE_PATH_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Feature Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION_OPERATION_COUNT = FEATURE_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ChildPathImpl <em>Child Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ChildPathImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getChildPath()
	 * @generated
	 */
	int CHILD_PATH = 52;

	/**
	 * The number of structural features of the '<em>Child Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Child Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ChildPathAttributeImpl <em>Child Path Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ChildPathAttributeImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getChildPathAttribute()
	 * @generated
	 */
	int CHILD_PATH_ATTRIBUTE = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__NAME = CHILD_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__ATTRIBUTE = CHILD_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Child Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE_FEATURE_COUNT = CHILD_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Child Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE_OPERATION_COUNT = CHILD_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ChildPathAssociationImpl <em>Child Path Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ChildPathAssociationImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getChildPathAssociation()
	 * @generated
	 */
	int CHILD_PATH_ASSOCIATION = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__NAME = CHILD_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__ASSOCIATION = CHILD_PATH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__VALUE_DISPLAY = CHILD_PATH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__CHILD_FEATURE = CHILD_PATH_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Child Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION_FEATURE_COUNT = CHILD_PATH_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Child Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION_OPERATION_COUNT = CHILD_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ImageIndexUnitImpl <em>Image Index Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ImageIndexUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getImageIndexUnit()
	 * @generated
	 */
	int IMAGE_INDEX_UNIT = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__NAME = IMAGE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__DISPLAY_LABEL = IMAGE_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__DISPLAYED_ON = IMAGE_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__URI_ELEMENT = IMAGE_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__ROUTE_ACTUALS = IMAGE_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__REQUIRES_ROLE = IMAGE_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PURPOSE_SUMMARY = IMAGE_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__ALTERNATIVE = IMAGE_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__OMIT_CAPTION = IMAGE_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__CAPTION_CLASS = IMAGE_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__STYLE_CLASS = IMAGE_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__CONTENT_CLASS = IMAGE_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__DISPLAY_FIELDS = IMAGE_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__SUPPORT_ACTIONS = IMAGE_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__HEADER = IMAGE_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__FOOTER = IMAGE_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__HEADER_CLASS = IMAGE_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__CONTROL_CLASS = IMAGE_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__FOOTER_CLASS = IMAGE_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__ERROR_CLASS = IMAGE_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__SELECTORS = IMAGE_UNIT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__CONTENT_TYPE = IMAGE_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__SELECTION = IMAGE_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__FILTER = IMAGE_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__SUPPORTED_FILTERS = IMAGE_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__EMPTY_MESSAGE = IMAGE_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__DEFAULT_PAGINATION_SIZE = IMAGE_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__MAXIMUM_PAGINATION_SIZE = IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__NEXT_NPAGES = IMAGE_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PREVIOUS_NPAGES = IMAGE_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__NEXT_PAGE_LABEL = IMAGE_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__NEXT_PAGE_ICON_NAME = IMAGE_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PREVIOUS_PAGE_LABEL = IMAGE_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PREVIOUS_PAGE_ICON_NAME = IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__USE_DISABLED_PAGE_LINKS = IMAGE_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS = IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__FIRST_PAGE_LABEL = IMAGE_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__FIRST_PAGE_ICON_NAME = IMAGE_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__LAST_PAGE_LABEL = IMAGE_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__LAST_PAGE_ICON_NAME = IMAGE_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PAGINATION_CLASS = IMAGE_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PAGINATION_ELEMENT_CLASS = IMAGE_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__IMAGE_PATH_FEATURE = IMAGE_UNIT__IMAGE_PATH_FEATURE;

	/**
	 * The feature id for the '<em><b>Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__TITLE_FEATURE = IMAGE_UNIT__TITLE_FEATURE;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__MISSING_IMAGE_PATH = IMAGE_UNIT__MISSING_IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__IMAGE_FILTER = IMAGE_UNIT__IMAGE_FILTER;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__SHOW_TIME = IMAGE_UNIT__SHOW_TIME;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__TRANSITION_TIME = IMAGE_UNIT__TRANSITION_TIME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__ACTIONS = IMAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__COLUMN_CLASS = IMAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT_FEATURE_COUNT = IMAGE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT_OPERATION_COUNT = IMAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.SliderUnitImpl <em>Slider Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.SliderUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getSliderUnit()
	 * @generated
	 */
	int SLIDER_UNIT = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NAME = IMAGE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAY_LABEL = IMAGE_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAYED_ON = IMAGE_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__URI_ELEMENT = IMAGE_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ROUTE_ACTUALS = IMAGE_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__REQUIRES_ROLE = IMAGE_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PURPOSE_SUMMARY = IMAGE_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ALTERNATIVE = IMAGE_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__OMIT_CAPTION = IMAGE_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CAPTION_CLASS = IMAGE_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__STYLE_CLASS = IMAGE_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTENT_CLASS = IMAGE_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAY_FIELDS = IMAGE_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SUPPORT_ACTIONS = IMAGE_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__HEADER = IMAGE_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FOOTER = IMAGE_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__HEADER_CLASS = IMAGE_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTROL_CLASS = IMAGE_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FOOTER_CLASS = IMAGE_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ERROR_CLASS = IMAGE_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SELECTORS = IMAGE_UNIT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTENT_TYPE = IMAGE_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SELECTION = IMAGE_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FILTER = IMAGE_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SUPPORTED_FILTERS = IMAGE_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__EMPTY_MESSAGE = IMAGE_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DEFAULT_PAGINATION_SIZE = IMAGE_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__MAXIMUM_PAGINATION_SIZE = IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_NPAGES = IMAGE_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_NPAGES = IMAGE_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_PAGE_LABEL = IMAGE_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_PAGE_ICON_NAME = IMAGE_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_PAGE_LABEL = IMAGE_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_PAGE_ICON_NAME = IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__USE_DISABLED_PAGE_LINKS = IMAGE_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__USE_FIRST_LAST_PAGE_LINKS = IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIRST_PAGE_LABEL = IMAGE_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIRST_PAGE_ICON_NAME = IMAGE_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LAST_PAGE_LABEL = IMAGE_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LAST_PAGE_ICON_NAME = IMAGE_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION_CLASS = IMAGE_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION_ELEMENT_CLASS = IMAGE_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__IMAGE_PATH_FEATURE = IMAGE_UNIT__IMAGE_PATH_FEATURE;

	/**
	 * The feature id for the '<em><b>Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__TITLE_FEATURE = IMAGE_UNIT__TITLE_FEATURE;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__MISSING_IMAGE_PATH = IMAGE_UNIT__MISSING_IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__IMAGE_FILTER = IMAGE_UNIT__IMAGE_FILTER;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SHOW_TIME = IMAGE_UNIT__SHOW_TIME;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__TRANSITION_TIME = IMAGE_UNIT__TRANSITION_TIME;

	/**
	 * The number of structural features of the '<em>Slider Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_FEATURE_COUNT = IMAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Slider Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_OPERATION_COUNT = IMAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.GalleryUnitImpl <em>Gallery Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.GalleryUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getGalleryUnit()
	 * @generated
	 */
	int GALLERY_UNIT = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NAME = IMAGE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAY_LABEL = IMAGE_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAYED_ON = IMAGE_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__URI_ELEMENT = IMAGE_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ROUTE_ACTUALS = IMAGE_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__REQUIRES_ROLE = IMAGE_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PURPOSE_SUMMARY = IMAGE_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ALTERNATIVE = IMAGE_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__OMIT_CAPTION = IMAGE_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CAPTION_CLASS = IMAGE_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__STYLE_CLASS = IMAGE_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTENT_CLASS = IMAGE_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAY_FIELDS = IMAGE_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SUPPORT_ACTIONS = IMAGE_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__HEADER = IMAGE_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FOOTER = IMAGE_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__HEADER_CLASS = IMAGE_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTROL_CLASS = IMAGE_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FOOTER_CLASS = IMAGE_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ERROR_CLASS = IMAGE_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SELECTORS = IMAGE_UNIT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTENT_TYPE = IMAGE_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SELECTION = IMAGE_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FILTER = IMAGE_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SUPPORTED_FILTERS = IMAGE_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__EMPTY_MESSAGE = IMAGE_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DEFAULT_PAGINATION_SIZE = IMAGE_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__MAXIMUM_PAGINATION_SIZE = IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_NPAGES = IMAGE_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_NPAGES = IMAGE_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_PAGE_LABEL = IMAGE_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_PAGE_ICON_NAME = IMAGE_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_PAGE_LABEL = IMAGE_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_PAGE_ICON_NAME = IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__USE_DISABLED_PAGE_LINKS = IMAGE_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__USE_FIRST_LAST_PAGE_LINKS = IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIRST_PAGE_LABEL = IMAGE_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIRST_PAGE_ICON_NAME = IMAGE_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LAST_PAGE_LABEL = IMAGE_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LAST_PAGE_ICON_NAME = IMAGE_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION_CLASS = IMAGE_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION_ELEMENT_CLASS = IMAGE_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__IMAGE_PATH_FEATURE = IMAGE_UNIT__IMAGE_PATH_FEATURE;

	/**
	 * The feature id for the '<em><b>Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__TITLE_FEATURE = IMAGE_UNIT__TITLE_FEATURE;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__MISSING_IMAGE_PATH = IMAGE_UNIT__MISSING_IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__IMAGE_FILTER = IMAGE_UNIT__IMAGE_FILTER;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SHOW_TIME = IMAGE_UNIT__SHOW_TIME;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__TRANSITION_TIME = IMAGE_UNIT__TRANSITION_TIME;

	/**
	 * The feature id for the '<em><b>Full Size Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FULL_SIZE_FILTER = IMAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gallery Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_FEATURE_COUNT = IMAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gallery Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_OPERATION_COUNT = IMAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.AuthenticationUnit <em>Authentication Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.AuthenticationUnit
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getAuthenticationUnit()
	 * @generated
	 */
	int AUTHENTICATION_UNIT = 58;

	/**
	 * The number of structural features of the '<em>Authentication Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Authentication Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.RegistrationUnitImpl <em>Registration Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.RegistrationUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getRegistrationUnit()
	 * @generated
	 */
	int REGISTRATION_UNIT = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__STYLE_CLASS = EDIT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ON_SAVE_CONTINUE_EDITING = EDIT_UNIT__ON_SAVE_CONTINUE_EDITING;

	/**
	 * The feature id for the '<em><b>Disable Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISABLE_CONDITION = EDIT_UNIT__DISABLE_CONDITION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

	/**
	 * The feature id for the '<em><b>Authentication System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__AUTHENTICATION_SYSTEM = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Registration Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Registration Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.LoginUnitImpl <em>Login Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.LoginUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getLoginUnit()
	 * @generated
	 */
	int LOGIN_UNIT = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__NAME = CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAY_LABEL = CONTROL_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAYED_ON = CONTROL_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__URI_ELEMENT = CONTROL_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ROUTE_ACTUALS = CONTROL_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__REQUIRES_ROLE = CONTROL_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__PURPOSE_SUMMARY = CONTROL_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ALTERNATIVE = CONTROL_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__OMIT_CAPTION = CONTROL_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CAPTION_CLASS = CONTROL_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__STYLE_CLASS = CONTROL_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONTENT_CLASS = CONTROL_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAY_FIELDS = CONTROL_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__SUPPORT_ACTIONS = CONTROL_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__HEADER = CONTROL_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__FOOTER = CONTROL_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__HEADER_CLASS = CONTROL_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONTROL_CLASS = CONTROL_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__FOOTER_CLASS = CONTROL_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ERROR_CLASS = CONTROL_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__SUBMIT_LABEL = CONTROL_UNIT__SUBMIT_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CANCEL_DESTINATION = CONTROL_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CANCEL_LABEL = CONTROL_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Authentication System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__AUTHENTICATION_SYSTEM = CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Login Id Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOGIN_ID_FIELD = CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__PASSWORD_FIELD = CONTROL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remember Me Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__REMEMBER_ME_FIELD = CONTROL_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logout Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOGOUT_URI_ELEMENT = CONTROL_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Login Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT_FEATURE_COUNT = CONTROL_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Login Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT_OPERATION_COUNT = CONTROL_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.ForgottenPasswordUnitImpl <em>Forgotten Password Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.ForgottenPasswordUnitImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getForgottenPasswordUnit()
	 * @generated
	 */
	int FORGOTTEN_PASSWORD_UNIT = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__NAME = CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL = CONTROL_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON = CONTROL_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT = CONTROL_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ROUTE_ACTUALS = CONTROL_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE = CONTROL_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY = CONTROL_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE = CONTROL_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION = CONTROL_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS = CONTROL_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS = CONTROL_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONTENT_CLASS = CONTROL_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS = CONTROL_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS = CONTROL_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__HEADER = CONTROL_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__FOOTER = CONTROL_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS = CONTROL_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS = CONTROL_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS = CONTROL_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS = CONTROL_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL = CONTROL_UNIT__SUBMIT_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION = CONTROL_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL = CONTROL_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Authentication System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM = CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Login Id Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOGIN_ID_FIELD = CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Forgotten Password Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT_FEATURE_COUNT = CONTROL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Forgotten Password Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT_OPERATION_COUNT = CONTROL_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.InlineActionContainer <em>Inline Action Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.InlineActionContainer
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getInlineActionContainer()
	 * @generated
	 */
	int INLINE_ACTION_CONTAINER = 62;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Inline Action Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inline Action Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.InlineActionImpl <em>Inline Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.InlineActionImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getInlineAction()
	 * @generated
	 */
	int INLINE_ACTION = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__USED_BY = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__DISABLE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__DISPLAY_WHEN = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__HEADER = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__FOOTER = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__HEADER_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__FOOTER_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Inline Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Inline Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_OPERATION_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.SelectActionImpl <em>Select Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.SelectActionImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getSelectAction()
	 * @generated
	 */
	int SELECT_ACTION = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISABLE = INLINE_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISPLAY_WHEN = INLINE_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__TARGET = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION_OPERATION_COUNT = INLINE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.DeleteActionImpl <em>Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.DeleteActionImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDeleteAction()
	 * @generated
	 */
	int DELETE_ACTION = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISABLE = INLINE_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISPLAY_WHEN = INLINE_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DESTINATION = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__CONFIRM_MESSAGE = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__REQUIRES_ROLE = INLINE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__ENABLE_WHEN = INLINE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__URI_ELEMENT = INLINE_ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_OPERATION_COUNT = INLINE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.impl.FeatureSupportActionImpl <em>Feature Support Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.impl.FeatureSupportActionImpl
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getFeatureSupportAction()
	 * @generated
	 */
	int FEATURE_SUPPORT_ACTION = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__DISABLE = INLINE_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__DISPLAY_WHEN = INLINE_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__OPERATION = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__REQUIRES_ROLE = INLINE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__ENABLE_WHEN = INLINE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__URI_ELEMENT = INLINE_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FILE_EXTENSION = INLINE_ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Feature Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Feature Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION_OPERATION_COUNT = INLINE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.FrameworkTechnologies <em>Framework Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.FrameworkTechnologies
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getFrameworkTechnologies()
	 * @generated
	 */
	int FRAMEWORK_TECHNOLOGIES = 67;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.InputTechnologies <em>Input Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.InputTechnologies
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getInputTechnologies()
	 * @generated
	 */
	int INPUT_TECHNOLOGIES = 68;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.AjaxTechnologies <em>Ajax Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.AjaxTechnologies
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getAjaxTechnologies()
	 * @generated
	 */
	int AJAX_TECHNOLOGIES = 69;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes <em>Authentication Key Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getAuthenticationKeyTypes()
	 * @generated
	 */
	int AUTHENTICATION_KEY_TYPES = 70;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.ThumbnailModes <em>Thumbnail Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.ThumbnailModes
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getThumbnailModes()
	 * @generated
	 */
	int THUMBNAIL_MODES = 71;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.PageTopMenuOptions <em>Page Top Menu Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.PageTopMenuOptions
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getPageTopMenuOptions()
	 * @generated
	 */
	int PAGE_TOP_MENU_OPTIONS = 72;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions <em>Collection Display Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions
	 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCollectionDisplayOptions()
	 * @generated
	 */
	int COLLECTION_DISPLAY_OPTIONS = 73;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.WafModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel
	 * @generated
	 */
	EClass getWafModel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.WafModel#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persistence</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getPersistence()
	 * @see #getWafModel()
	 * @generated
	 */
	EReference getWafModel_Persistence();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.WafModel#getBusiness <em>Business</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getBusiness()
	 * @see #getWafModel()
	 * @generated
	 */
	EReference getWafModel_Business();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.WafModel#getImageManipulations <em>Image Manipulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image Manipulations</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getImageManipulations()
	 * @see #getWafModel()
	 * @generated
	 */
	EReference getWafModel_ImageManipulations();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.WafModel#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getPages()
	 * @see #getWafModel()
	 * @generated
	 */
	EReference getWafModel_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.WafModel#getGlobalMenus <em>Global Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Menus</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getGlobalMenus()
	 * @see #getWafModel()
	 * @generated
	 */
	EReference getWafModel_GlobalMenus();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.WafModel#getDynamicMenus <em>Dynamic Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Menus</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getDynamicMenus()
	 * @see #getWafModel()
	 * @generated
	 */
	EReference getWafModel_DynamicMenus();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.WafModel#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Api</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getApi()
	 * @see #getWafModel()
	 * @generated
	 */
	EReference getWafModel_Api();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getSiteName <em>Site Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Name</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getSiteName()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_SiteName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getSiteTitle <em>Site Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Title</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getSiteTitle()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_SiteTitle();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getWebmasterEmail <em>Webmaster Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webmaster Email</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getWebmasterEmail()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_WebmasterEmail();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getCopyrightText <em>Copyright Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright Text</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getCopyrightText()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_CopyrightText();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getMetaDescription <em>Meta Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Description</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getMetaDescription()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_MetaDescription();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getLogoImage <em>Logo Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo Image</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getLogoImage()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_LogoImage();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.WafModel#getLogoFilters <em>Logo Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logo Filters</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getLogoFilters()
	 * @see #getWafModel()
	 * @generated
	 */
	EReference getWafModel_LogoFilters();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getFrameworkTechnology <em>Framework Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getFrameworkTechnology()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_FrameworkTechnology();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getInputTechnology <em>Input Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getInputTechnology()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_InputTechnology();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getAjaxTechnology <em>Ajax Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ajax Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getAjaxTechnology()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_AjaxTechnology();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.WafModel#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getAuthentication()
	 * @see #getWafModel()
	 * @generated
	 */
	EReference getWafModel_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getCaptchaSiteKey <em>Captcha Site Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Captcha Site Key</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getCaptchaSiteKey()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_CaptchaSiteKey();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getCaptchaSecretKey <em>Captcha Secret Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Captcha Secret Key</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getCaptchaSecretKey()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_CaptchaSecretKey();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getTextEditorURL <em>Text Editor URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Editor URL</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getTextEditorURL()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_TextEditorURL();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getTopNavigationId <em>Top Navigation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Navigation Id</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getTopNavigationId()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_TopNavigationId();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.WafModel#getSideMenu <em>Side Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Side Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getSideMenu()
	 * @see #getWafModel()
	 * @generated
	 */
	EReference getWafModel_SideMenu();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#getSiteTemplate <em>Site Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Template</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getSiteTemplate()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_SiteTemplate();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.WafModel#isStaticUnitsEditable <em>Static Units Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Units Editable</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#isStaticUnitsEditable()
	 * @see #getWafModel()
	 * @generated
	 */
	EAttribute getWafModel_StaticUnitsEditable();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.waf.Authentication#getAuthorises <em>Authorises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Authorises</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Authentication#getAuthorises()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_Authorises();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.Authentication#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Authentication#getUser()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_User();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.Authentication#getUserKey <em>User Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Key</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Authentication#getUserKey()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_UserKey();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Authentication#getLoginLabel <em>Login Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Authentication#getLoginLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_LoginLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Authentication#getLogoutLabel <em>Logout Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logout Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Authentication#getLogoutLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_LogoutLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem <em>Local Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem
	 * @generated
	 */
	EClass getLocalAuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAuthentication()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Key</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAuthenticationKey()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AuthenticationKey();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginAttempt <em>Login Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Attempt</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginAttempt()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_LoginAttempt();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAutoLogin <em>Auto Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auto Login</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAutoLogin()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_AutoLogin();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Captcha</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isUseCaptcha()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_UseCaptcha();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Remember Me</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isAllowRememberMe()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AllowRememberMe();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Self Registration</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isAllowSelfRegistration()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AllowSelfRegistration();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Email Activation</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isUseEmailActivation()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_UseEmailActivation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Welcome Email</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isSendWelcomeEmail()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_SendWelcomeEmail();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registration Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getRegistrationUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_RegistrationUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_LoginUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forgotten Password Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getForgottenPasswordUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ForgottenPasswordUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.CasAuthentication <em>Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cas Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CasAuthentication
	 * @generated
	 */
	EClass getCasAuthentication();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.DisplayElement <em>Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Element</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DisplayElement
	 * @generated
	 */
	EClass getDisplayElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DisplayElement#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DisplayElement#getDisplayLabel()
	 * @see #getDisplayElement()
	 * @generated
	 */
	EAttribute getDisplayElement_DisplayLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ImageManipulation <em>Image Manipulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Manipulation</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageManipulation
	 * @generated
	 */
	EClass getImageManipulation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ImageManipulation#getJpegQuality <em>Jpeg Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jpeg Quality</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageManipulation#getJpegQuality()
	 * @see #getImageManipulation()
	 * @generated
	 */
	EAttribute getImageManipulation_JpegQuality();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.ImageManipulation#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageManipulation#getFilters()
	 * @see #getImageManipulation()
	 * @generated
	 */
	EReference getImageManipulation_Filters();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ImageFilter <em>Image Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageFilter
	 * @generated
	 */
	EClass getImageFilter();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ThumbnailFilter <em>Thumbnail Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thumbnail Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ThumbnailFilter
	 * @generated
	 */
	EClass getThumbnailFilter();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ThumbnailFilter#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ThumbnailFilter#getWidth()
	 * @see #getThumbnailFilter()
	 * @generated
	 */
	EAttribute getThumbnailFilter_Width();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ThumbnailFilter#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ThumbnailFilter#getHeight()
	 * @see #getThumbnailFilter()
	 * @generated
	 */
	EAttribute getThumbnailFilter_Height();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ThumbnailFilter#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ThumbnailFilter#getMode()
	 * @see #getThumbnailFilter()
	 * @generated
	 */
	EAttribute getThumbnailFilter_Mode();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.Menu#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Menu#getEntries()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Entries();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Menu#isOmitCaption <em>Omit Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Caption</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Menu#isOmitCaption()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_OmitCaption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Menu#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Menu#getCaptionClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_CaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Menu#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Menu#getStyleClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Menu#getLayoutClass <em>Layout Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Menu#getLayoutClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_LayoutClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.GlobalMenu <em>Global Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.GlobalMenu
	 * @generated
	 */
	EClass getGlobalMenu();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.DynamicMenu <em>Dynamic Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicMenu
	 * @generated
	 */
	EClass getDynamicMenu();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.DynamicMenu#getEntityOrView <em>Entity Or View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Or View</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicMenu#getEntityOrView()
	 * @see #getDynamicMenu()
	 * @generated
	 */
	EReference getDynamicMenu_EntityOrView();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.DynamicMenu#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicMenu#getSelection()
	 * @see #getDynamicMenu()
	 * @generated
	 */
	EReference getDynamicMenu_Selection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.DynamicMenu#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicMenu#getTitle()
	 * @see #getDynamicMenu()
	 * @generated
	 */
	EReference getDynamicMenu_Title();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.MenuEntry
	 * @generated
	 */
	EClass getMenuEntry();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.waf.MenuEntry#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.MenuEntry#getPartOf()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_PartOf();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.MenuEntry#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.MenuEntry#getRequiresRole()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EAttribute getMenuEntry_RequiresRole();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ActionMenuEntry <em>Action Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ActionMenuEntry
	 * @generated
	 */
	EClass getActionMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.ActionMenuEntry#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ActionMenuEntry#getAction()
	 * @see #getActionMenuEntry()
	 * @generated
	 */
	EReference getActionMenuEntry_Action();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.ActionMenuEntry#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ActionMenuEntry#getQuery()
	 * @see #getActionMenuEntry()
	 * @generated
	 */
	EReference getActionMenuEntry_Query();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.EditStaticTextMenuEntry <em>Edit Static Text Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Static Text Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.EditStaticTextMenuEntry
	 * @generated
	 */
	EClass getEditStaticTextMenuEntry();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.waf.Page#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page#getPartOf()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PartOf();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.Page#getParentPage <em>Parent Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Page</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page#getParentPage()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ParentPage();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.waf.Page#getChildPages <em>Child Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Pages</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page#getChildPages()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ChildPages();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Page#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page#getUriElement()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_UriElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Page#getTopMenuOption <em>Top Menu Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Menu Option</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page#getTopMenuOption()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TopMenuOption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Page#getTopMenuRequiresRole <em>Top Menu Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Menu Requires Role</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page#getTopMenuRequiresRole()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TopMenuRequiresRole();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Page#getTopMenuRank <em>Top Menu Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Menu Rank</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page#getTopMenuRank()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TopMenuRank();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Page#getNavigationLabel <em>Navigation Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page#getNavigationLabel()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_NavigationLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.Page#getSideMenu <em>Side Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Side Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page#getSideMenu()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_SideMenu();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.Page#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Page#getStyleClass()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_StyleClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.Query#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Query#getFilter()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.Query#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.Query#getParameters()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Parameters();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.QueryParameter <em>Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parameter</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.QueryParameter
	 * @generated
	 */
	EClass getQueryParameter();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.QueryParameter#getFormal <em>Formal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.QueryParameter#getFormal()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EReference getQueryParameter_Formal();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.QueryParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.QueryParameter#getValue()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.UnitContainer <em>Unit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Container</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitContainer
	 * @generated
	 */
	EClass getUnitContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.UnitContainer#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitContainer#getUnits()
	 * @see #getUnitContainer()
	 * @generated
	 */
	EReference getUnitContainer_Units();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ContentUnit <em>Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit
	 * @generated
	 */
	EClass getContentUnit();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displayed On</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#getDisplayedOn()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_DisplayedOn();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#getUriElement()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_UriElement();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getRouteActuals <em>Route Actuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Actuals</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#getRouteActuals()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_RouteActuals();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#getRequiresRole()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_RequiresRole();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose Summary</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#getPurposeSummary()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_PurposeSummary();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#getAlternative()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Alternative();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#isOmitCaption <em>Omit Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Caption</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#isOmitCaption()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_OmitCaption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#getCaptionClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_CaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#getStyleClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#getContentClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_ContentClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.RouteActual <em>Route Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Actual</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.RouteActual
	 * @generated
	 */
	EClass getRouteActual();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.RouteActual#getRouteParameter <em>Route Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Parameter</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.RouteActual#getRouteParameter()
	 * @see #getRouteActual()
	 * @generated
	 */
	EReference getRouteActual_RouteParameter();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.RouteActual#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.RouteActual#getValue()
	 * @see #getRouteActual()
	 * @generated
	 */
	EReference getRouteActual_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.StaticUnit <em>Static Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.StaticUnit
	 * @generated
	 */
	EClass getStaticUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.StaticUnit#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.StaticUnit#getService()
	 * @see #getStaticUnit()
	 * @generated
	 */
	EReference getStaticUnit_Service();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.StaticUnit#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.StaticUnit#getContent()
	 * @see #getStaticUnit()
	 * @generated
	 */
	EAttribute getStaticUnit_Content();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit <em>Dynamic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit
	 * @generated
	 */
	EClass getDynamicUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getDisplayFields <em>Display Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getDisplayFields()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_DisplayFields();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getSupportActions <em>Support Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Support Actions</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getSupportActions()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_SupportActions();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getHeader()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_Header();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getFooter()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_Footer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getHeaderClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getControlClass <em>Control Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getControlClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_ControlClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getFooterClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_FooterClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getErrorClass <em>Error Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getErrorClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_ErrorClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.UnitSupportAction <em>Unit Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Support Action</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitSupportAction
	 * @generated
	 */
	EClass getUnitSupportAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitSupportAction#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitSupportAction#isDisable()
	 * @see #getUnitSupportAction()
	 * @generated
	 */
	EAttribute getUnitSupportAction_Disable();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitSupportAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitSupportAction#getConfirmMessage()
	 * @see #getUnitSupportAction()
	 * @generated
	 */
	EAttribute getUnitSupportAction_ConfirmMessage();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.UnitField <em>Unit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Field</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitField
	 * @generated
	 */
	EClass getUnitField();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.waf.UnitField#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displayed On</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitField#getDisplayedOn()
	 * @see #getUnitField()
	 * @generated
	 */
	EReference getUnitField_DisplayedOn();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitField#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitField#getRequiresRole()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_RequiresRole();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitField#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitField#getTitle()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_Title();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitField#getCollectionDisplayOption <em>Collection Display Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Display Option</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitField#getCollectionDisplayOption()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_CollectionDisplayOption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitField#getMaximumDisplaySize <em>Maximum Display Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Display Size</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitField#getMaximumDisplaySize()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_MaximumDisplaySize();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitField#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitField#getDateFormat()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_DateFormat();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitField#getDisableInput <em>Disable Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable Input</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitField#getDisableInput()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_DisableInput();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.UnitFeature <em>Unit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature
	 * @generated
	 */
	EClass getUnitFeature();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getForcedValue <em>Forced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forced Value</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#getForcedValue()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EReference getUnitFeature_ForcedValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isCollectionUiAllowAdd <em>Collection Ui Allow Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Ui Allow Add</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#isCollectionUiAllowAdd()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_CollectionUiAllowAdd();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isCollectionUiAllowRemove <em>Collection Ui Allow Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Ui Allow Remove</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#isCollectionUiAllowRemove()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_CollectionUiAllowRemove();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getNullDisplayValue <em>Null Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Display Value</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#getNullDisplayValue()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_NullDisplayValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Display When Not Empty</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#isOnlyDisplayWhenNotEmpty()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_OnlyDisplayWhenNotEmpty();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isAutofocus <em>Autofocus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autofocus</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#isAutofocus()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_Autofocus();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#getFooter()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_Footer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#getHeaderClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getInputClass <em>Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#getInputClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_InputClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getDisplayClass <em>Display Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#getDisplayClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_DisplayClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature#getFooterClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_FooterClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.UnitAttribute <em>Unit Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAttribute
	 * @generated
	 */
	EClass getUnitAttribute();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.UnitAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAttribute#getAttribute()
	 * @see #getUnitAttribute()
	 * @generated
	 */
	EReference getUnitAttribute_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAttribute#getName()
	 * @see #getUnitAttribute()
	 * @generated
	 */
	EAttribute getUnitAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.UnitAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAttribute#getDefaultValue()
	 * @see #getUnitAttribute()
	 * @generated
	 */
	EReference getUnitAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitAttribute#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAttribute#isObfuscateFormFields()
	 * @see #getUnitAttribute()
	 * @generated
	 */
	EAttribute getUnitAttribute_ObfuscateFormFields();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitAttribute#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAttribute#getPlaceholder()
	 * @see #getUnitAttribute()
	 * @generated
	 */
	EAttribute getUnitAttribute_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.UnitAttribute#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAttribute#getValidationPattern()
	 * @see #getUnitAttribute()
	 * @generated
	 */
	EAttribute getUnitAttribute_ValidationPattern();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation <em>Unit Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Association</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAssociation
	 * @generated
	 */
	EClass getUnitAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAssociation#getSelection()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_Selection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getAjaxOptionsList <em>Ajax Options List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ajax Options List</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAssociation#getAjaxOptionsList()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_AjaxOptionsList();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.AssociationReference <em>Association Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Reference</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.AssociationReference
	 * @generated
	 */
	EClass getAssociationReference();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.AssociationReference#getName()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EAttribute getAssociationReference_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.AssociationReference#getAssociation()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EReference getAssociationReference_Association();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getValueDisplay <em>Value Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Display</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.AssociationReference#getValueDisplay()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EReference getAssociationReference_ValueDisplay();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.AssociationReference#getChildFeature()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EReference getAssociationReference_ChildFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.InterfaceField <em>Interface Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Field</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InterfaceField
	 * @generated
	 */
	EClass getInterfaceField();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InterfaceField#isRequired()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_Required();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InterfaceField#getDefaultValue()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EReference getInterfaceField_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getMustMatch <em>Must Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Must Match</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InterfaceField#getMustMatch()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EReference getInterfaceField_MustMatch();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InterfaceField#getInterfaceType()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_InterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InterfaceField#getPlaceholder()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InterfaceField#getValidationPattern()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_ValidationPattern();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getInputClass <em>Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InterfaceField#getInputClass()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_InputClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.DataTypeField <em>Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Field</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DataTypeField
	 * @generated
	 */
	EClass getDataTypeField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.DataTypeField#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DataTypeField#getDataType()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EReference getDataTypeField_DataType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DataTypeField#isCaseInsensitive <em>Case Insensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Insensitive</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DataTypeField#isCaseInsensitive()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_CaseInsensitive();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DataTypeField#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DataTypeField#isObfuscateFormFields()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_ObfuscateFormFields();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DataTypeField#isEncrypt <em>Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypt</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DataTypeField#isEncrypt()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_Encrypt();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Field</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DateField
	 * @generated
	 */
	EClass getDateField();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DateField#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DateField#getDetails()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Details();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DateField#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DateField#getFormat()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Format();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.CaptchaField <em>Captcha Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Captcha Field</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CaptchaField
	 * @generated
	 */
	EClass getCaptchaField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.SelectableUnit <em>Selectable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selectable Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.SelectableUnit
	 * @generated
	 */
	EClass getSelectableUnit();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.waf.SelectableUnit#getSelectors <em>Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selectors</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.SelectableUnit#getSelectors()
	 * @see #getSelectableUnit()
	 * @generated
	 */
	EReference getSelectableUnit_Selectors();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.SingletonUnit <em>Singleton Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.SingletonUnit
	 * @generated
	 */
	EClass getSingletonUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.SingletonUnit#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.SingletonUnit#getContentType()
	 * @see #getSingletonUnit()
	 * @generated
	 */
	EReference getSingletonUnit_ContentType();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit <em>Collection Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit
	 * @generated
	 */
	EClass getCollectionUnit();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Type</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getContentType()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_ContentType();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getSelection()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_Selection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getFilter()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_Filter();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getSupportedFilters <em>Supported Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Filters</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getSupportedFilters()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_SupportedFilters();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getEmptyMessage <em>Empty Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty Message</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getEmptyMessage()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_EmptyMessage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Pagination Size</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getDefaultPaginationSize()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_DefaultPaginationSize();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getMaximumPaginationSize <em>Maximum Pagination Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Pagination Size</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getMaximumPaginationSize()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_MaximumPaginationSize();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextNpages <em>Next Npages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Npages</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextNpages()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_NextNpages();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousNpages <em>Previous Npages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Npages</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousNpages()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PreviousNpages();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextPageLabel <em>Next Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_NextPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextPageIconName <em>Next Page Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Page Icon Name</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextPageIconName()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_NextPageIconName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousPageLabel <em>Previous Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PreviousPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousPageIconName <em>Previous Page Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Page Icon Name</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousPageIconName()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PreviousPageIconName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Disabled Page Links</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#isUseDisabledPageLinks()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_UseDisabledPageLinks();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use First Last Page Links</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#isUseFirstLastPageLinks()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_UseFirstLastPageLinks();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFirstPageLabel <em>First Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getFirstPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_FirstPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFirstPageIconName <em>First Page Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Page Icon Name</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getFirstPageIconName()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_FirstPageIconName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getLastPageLabel <em>Last Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getLastPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_LastPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getLastPageIconName <em>Last Page Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Page Icon Name</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getLastPageIconName()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_LastPageIconName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPaginationClass <em>Pagination Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pagination Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getPaginationClass()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PaginationClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPaginationElementClass <em>Pagination Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pagination Element Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit#getPaginationElementClass()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PaginationElementClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.EditUnit <em>Edit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.EditUnit
	 * @generated
	 */
	EClass getEditUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.EditUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Save Continue Editing</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.EditUnit#isOnSaveContinueEditing()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_OnSaveContinueEditing();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getDisableCondition <em>Disable Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disable Condition</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.EditUnit#getDisableCondition()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_DisableCondition();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.EditUnit#getTitle()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_Title();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getConfirmDestination <em>Confirm Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Confirm Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.EditUnit#getConfirmDestination()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_ConfirmDestination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getConfirmLabel <em>Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.EditUnit#getConfirmLabel()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_ConfirmLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getCancelDestination <em>Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cancel Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.EditUnit#getCancelDestination()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_CancelDestination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.EditUnit#getCancelLabel <em>Cancel Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.EditUnit#getCancelLabel()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_CancelLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.EditUnit#isCustomiseValues <em>Customise Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customise Values</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.EditUnit#isCustomiseValues()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_CustomiseValues();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.CreateUnit <em>Create Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CreateUnit
	 * @generated
	 */
	EClass getCreateUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.CreateUpdateUnit <em>Create Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Update Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CreateUpdateUnit
	 * @generated
	 */
	EClass getCreateUpdateUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CreateUpdateUnit#getCreateUriElement <em>Create Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CreateUpdateUnit#getCreateUriElement()
	 * @see #getCreateUpdateUnit()
	 * @generated
	 */
	EAttribute getCreateUpdateUnit_CreateUriElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clear Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CreateUpdateUnit#getClearLabel()
	 * @see #getCreateUpdateUnit()
	 * @generated
	 */
	EAttribute getCreateUpdateUnit_ClearLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.MapUnit <em>Map Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.MapUnit
	 * @generated
	 */
	EClass getMapUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.MapUnit#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.MapUnit#isReadOnly()
	 * @see #getMapUnit()
	 * @generated
	 */
	EAttribute getMapUnit_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.MapUnit#getDefaultZoomLevel <em>Default Zoom Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Zoom Level</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.MapUnit#getDefaultZoomLevel()
	 * @see #getMapUnit()
	 * @generated
	 */
	EAttribute getMapUnit_DefaultZoomLevel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.MapUnit#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.MapUnit#getLocation()
	 * @see #getMapUnit()
	 * @generated
	 */
	EReference getMapUnit_Location();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.MapUnit#getPlaceName <em>Place Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place Name</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.MapUnit#getPlaceName()
	 * @see #getMapUnit()
	 * @generated
	 */
	EReference getMapUnit_PlaceName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.UpdateUnit <em>Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.UpdateUnit
	 * @generated
	 */
	EClass getUpdateUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.DataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DataUnit
	 * @generated
	 */
	EClass getDataUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.DataUnit#getDefaultSelection <em>Default Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DataUnit#getDefaultSelection()
	 * @see #getDataUnit()
	 * @generated
	 */
	EReference getDataUnit_DefaultSelection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.DataUnit#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DataUnit#getTitle()
	 * @see #getDataUnit()
	 * @generated
	 */
	EReference getDataUnit_Title();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DataUnit#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Display When Not Empty</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DataUnit#isOnlyDisplayWhenNotEmpty()
	 * @see #getDataUnit()
	 * @generated
	 */
	EAttribute getDataUnit_OnlyDisplayWhenNotEmpty();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.DetailsUnit <em>Details Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DetailsUnit
	 * @generated
	 */
	EClass getDetailsUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Field Labels</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DetailsUnit#isOmitFieldLabels()
	 * @see #getDetailsUnit()
	 * @generated
	 */
	EAttribute getDetailsUnit_OmitFieldLabels();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.IndexUnit <em>Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.IndexUnit
	 * @generated
	 */
	EClass getIndexUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Column Labels</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.IndexUnit#isOmitColumnLabels()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_OmitColumnLabels();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getTargettingSearches <em>Targetting Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Targetting Searches</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.IndexUnit#getTargettingSearches()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EReference getIndexUnit_TargettingSearches();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getRowClasses <em>Row Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Classes</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.IndexUnit#getRowClasses()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_RowClasses();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.IndexGridUnit <em>Index Grid Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Grid Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.IndexGridUnit
	 * @generated
	 */
	EClass getIndexGridUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.IndexPageDirectionUnit <em>Index Page Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Page Direction Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.IndexPageDirectionUnit
	 * @generated
	 */
	EClass getIndexPageDirectionUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.IndexLineDirectionUnit <em>Index Line Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Line Direction Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.IndexLineDirectionUnit
	 * @generated
	 */
	EClass getIndexLineDirectionUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ControlUnit
	 * @generated
	 */
	EClass getControlUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ControlUnit#getSubmitLabel <em>Submit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submit Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ControlUnit#getSubmitLabel()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_SubmitLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.ControlUnit#getCancelDestination <em>Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cancel Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ControlUnit#getCancelDestination()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_CancelDestination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ControlUnit#getCancelLabel <em>Cancel Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Label</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ControlUnit#getCancelLabel()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_CancelLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.SearchUnit <em>Search Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.SearchUnit
	 * @generated
	 */
	EClass getSearchUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.SearchUnit#getResultsDestination <em>Results Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.SearchUnit#getResultsDestination()
	 * @see #getSearchUnit()
	 * @generated
	 */
	EReference getSearchUnit_ResultsDestination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ImageUnit <em>Image Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageUnit
	 * @generated
	 */
	EClass getImageUnit();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.ImageUnit#getImagePathFeature <em>Image Path Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Path Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageUnit#getImagePathFeature()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_ImagePathFeature();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.ImageUnit#getTitleFeature <em>Title Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageUnit#getTitleFeature()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_TitleFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ImageUnit#getMissingImagePath <em>Missing Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing Image Path</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageUnit#getMissingImagePath()
	 * @see #getImageUnit()
	 * @generated
	 */
	EAttribute getImageUnit_MissingImagePath();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.ImageUnit#getImageFilter <em>Image Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageUnit#getImageFilter()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_ImageFilter();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ImageUnit#getShowTime <em>Show Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Time</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageUnit#getShowTime()
	 * @see #getImageUnit()
	 * @generated
	 */
	EAttribute getImageUnit_ShowTime();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ImageUnit#getTransitionTime <em>Transition Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Time</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageUnit#getTransitionTime()
	 * @see #getImageUnit()
	 * @generated
	 */
	EAttribute getImageUnit_TransitionTime();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.FeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeaturePath
	 * @generated
	 */
	EClass getFeaturePath();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.FeaturePathAttribute <em>Feature Path Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeaturePathAttribute
	 * @generated
	 */
	EClass getFeaturePathAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.FeaturePathAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeaturePathAttribute#getName()
	 * @see #getFeaturePathAttribute()
	 * @generated
	 */
	EAttribute getFeaturePathAttribute_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.FeaturePathAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeaturePathAttribute#getAttribute()
	 * @see #getFeaturePathAttribute()
	 * @generated
	 */
	EReference getFeaturePathAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.FeaturePathAssociation <em>Feature Path Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path Association</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeaturePathAssociation
	 * @generated
	 */
	EClass getFeaturePathAssociation();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ChildPath <em>Child Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Path</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ChildPath
	 * @generated
	 */
	EClass getChildPath();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ChildPathAttribute <em>Child Path Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Path Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ChildPathAttribute
	 * @generated
	 */
	EClass getChildPathAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ChildPathAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ChildPathAttribute#getName()
	 * @see #getChildPathAttribute()
	 * @generated
	 */
	EAttribute getChildPathAttribute_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.ChildPathAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ChildPathAttribute#getAttribute()
	 * @see #getChildPathAttribute()
	 * @generated
	 */
	EReference getChildPathAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ChildPathAssociation <em>Child Path Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Path Association</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ChildPathAssociation
	 * @generated
	 */
	EClass getChildPathAssociation();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit <em>Image Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Index Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageIndexUnit
	 * @generated
	 */
	EClass getImageIndexUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getColumnClass <em>Column Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getColumnClass()
	 * @see #getImageIndexUnit()
	 * @generated
	 */
	EAttribute getImageIndexUnit_ColumnClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.SliderUnit <em>Slider Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slider Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.SliderUnit
	 * @generated
	 */
	EClass getSliderUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.GalleryUnit <em>Gallery Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gallery Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.GalleryUnit
	 * @generated
	 */
	EClass getGalleryUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.GalleryUnit#getFullSizeFilter <em>Full Size Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Full Size Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.GalleryUnit#getFullSizeFilter()
	 * @see #getGalleryUnit()
	 * @generated
	 */
	EReference getGalleryUnit_FullSizeFilter();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.AuthenticationUnit <em>Authentication Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.AuthenticationUnit
	 * @generated
	 */
	EClass getAuthenticationUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.RegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.RegistrationUnit
	 * @generated
	 */
	EClass getRegistrationUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.RegistrationUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.RegistrationUnit#getAuthenticationSystem()
	 * @see #getRegistrationUnit()
	 * @generated
	 */
	EReference getRegistrationUnit_AuthenticationSystem();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.LoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LoginUnit
	 * @generated
	 */
	EClass getLoginUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LoginUnit#getAuthenticationSystem()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EReference getLoginUnit_AuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getLoginIdField <em>Login Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Id Field</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LoginUnit#getLoginIdField()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EReference getLoginUnit_LoginIdField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getPasswordField <em>Password Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Password Field</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LoginUnit#getPasswordField()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EReference getLoginUnit_PasswordField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getRememberMeField <em>Remember Me Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remember Me Field</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LoginUnit#getRememberMeField()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EReference getLoginUnit_RememberMeField();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getLogoutUriElement <em>Logout Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logout Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.LoginUnit#getLogoutUriElement()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EAttribute getLoginUnit_LogoutUriElement();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forgotten Password Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit
	 * @generated
	 */
	EClass getForgottenPasswordUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getAuthenticationSystem()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EReference getForgottenPasswordUnit_AuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getLoginIdField <em>Login Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Id Field</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getLoginIdField()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EReference getForgottenPasswordUnit_LoginIdField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.InlineActionContainer <em>Inline Action Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Action Container</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InlineActionContainer
	 * @generated
	 */
	EClass getInlineActionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.waf.InlineActionContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InlineActionContainer#getActions()
	 * @see #getInlineActionContainer()
	 * @generated
	 */
	EReference getInlineActionContainer_Actions();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.InlineAction <em>Inline Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Action</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InlineAction
	 * @generated
	 */
	EClass getInlineAction();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Used By</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InlineAction#getUsedBy()
	 * @see #getInlineAction()
	 * @generated
	 */
	EReference getInlineAction_UsedBy();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.InlineAction#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InlineAction#isDisable()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Disable();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getDisplayWhen <em>Display When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display When</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InlineAction#getDisplayWhen()
	 * @see #getInlineAction()
	 * @generated
	 */
	EReference getInlineAction_DisplayWhen();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InlineAction#getHeader()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Header();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InlineAction#getFooter()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Footer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InlineAction#getHeaderClass()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InlineAction#getFooterClass()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_FooterClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.SelectAction <em>Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Action</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.SelectAction
	 * @generated
	 */
	EClass getSelectAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.SelectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.SelectAction#getTarget()
	 * @see #getSelectAction()
	 * @generated
	 */
	EReference getSelectAction_Target();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Action</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DeleteAction
	 * @generated
	 */
	EClass getDeleteAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.DeleteAction#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DeleteAction#getDestination()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EReference getDeleteAction_Destination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DeleteAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DeleteAction#getConfirmMessage()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EAttribute getDeleteAction_ConfirmMessage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DeleteAction#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DeleteAction#getRequiresRole()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EAttribute getDeleteAction_RequiresRole();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.DeleteAction#getEnableWhen <em>Enable When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable When</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DeleteAction#getEnableWhen()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EReference getDeleteAction_EnableWhen();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.DeleteAction#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.DeleteAction#getUriElement()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EAttribute getDeleteAction_UriElement();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.waf.FeatureSupportAction <em>Feature Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Support Action</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeatureSupportAction
	 * @generated
	 */
	EClass getFeatureSupportAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getOperation()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EReference getFeatureSupportAction_Operation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getConfirmMessage()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_ConfirmMessage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getRequiresRole()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_RequiresRole();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getEnableWhen <em>Enable When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable When</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getEnableWhen()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EReference getFeatureSupportAction_EnableWhen();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getUriElement()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_UriElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getFileExtension()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_FileExtension();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.waf.FrameworkTechnologies <em>Framework Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Framework Technologies</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.FrameworkTechnologies
	 * @generated
	 */
	EEnum getFrameworkTechnologies();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.waf.InputTechnologies <em>Input Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Technologies</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.InputTechnologies
	 * @generated
	 */
	EEnum getInputTechnologies();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.waf.AjaxTechnologies <em>Ajax Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ajax Technologies</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.AjaxTechnologies
	 * @generated
	 */
	EEnum getAjaxTechnologies();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes <em>Authentication Key Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Key Types</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes
	 * @generated
	 */
	EEnum getAuthenticationKeyTypes();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.waf.ThumbnailModes <em>Thumbnail Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thumbnail Modes</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.ThumbnailModes
	 * @generated
	 */
	EEnum getThumbnailModes();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.waf.PageTopMenuOptions <em>Page Top Menu Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Page Top Menu Options</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.PageTopMenuOptions
	 * @generated
	 */
	EEnum getPageTopMenuOptions();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions <em>Collection Display Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Display Options</em>'.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions
	 * @generated
	 */
	EEnum getCollectionDisplayOptions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WafFactory getWafFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.WafModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafModelImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getWafModel()
		 * @generated
		 */
		EClass WAF_MODEL = eINSTANCE.getWafModel();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAF_MODEL__PERSISTENCE = eINSTANCE.getWafModel_Persistence();

		/**
		 * The meta object literal for the '<em><b>Business</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAF_MODEL__BUSINESS = eINSTANCE.getWafModel_Business();

		/**
		 * The meta object literal for the '<em><b>Image Manipulations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAF_MODEL__IMAGE_MANIPULATIONS = eINSTANCE.getWafModel_ImageManipulations();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAF_MODEL__PAGES = eINSTANCE.getWafModel_Pages();

		/**
		 * The meta object literal for the '<em><b>Global Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAF_MODEL__GLOBAL_MENUS = eINSTANCE.getWafModel_GlobalMenus();

		/**
		 * The meta object literal for the '<em><b>Dynamic Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAF_MODEL__DYNAMIC_MENUS = eINSTANCE.getWafModel_DynamicMenus();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAF_MODEL__API = eINSTANCE.getWafModel_Api();

		/**
		 * The meta object literal for the '<em><b>Site Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__SITE_NAME = eINSTANCE.getWafModel_SiteName();

		/**
		 * The meta object literal for the '<em><b>Site Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__SITE_TITLE = eINSTANCE.getWafModel_SiteTitle();

		/**
		 * The meta object literal for the '<em><b>Webmaster Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__WEBMASTER_EMAIL = eINSTANCE.getWafModel_WebmasterEmail();

		/**
		 * The meta object literal for the '<em><b>Copyright Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__COPYRIGHT_TEXT = eINSTANCE.getWafModel_CopyrightText();

		/**
		 * The meta object literal for the '<em><b>Meta Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__META_DESCRIPTION = eINSTANCE.getWafModel_MetaDescription();

		/**
		 * The meta object literal for the '<em><b>Logo Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__LOGO_IMAGE = eINSTANCE.getWafModel_LogoImage();

		/**
		 * The meta object literal for the '<em><b>Logo Filters</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAF_MODEL__LOGO_FILTERS = eINSTANCE.getWafModel_LogoFilters();

		/**
		 * The meta object literal for the '<em><b>Framework Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__FRAMEWORK_TECHNOLOGY = eINSTANCE.getWafModel_FrameworkTechnology();

		/**
		 * The meta object literal for the '<em><b>Input Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__INPUT_TECHNOLOGY = eINSTANCE.getWafModel_InputTechnology();

		/**
		 * The meta object literal for the '<em><b>Ajax Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__AJAX_TECHNOLOGY = eINSTANCE.getWafModel_AjaxTechnology();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAF_MODEL__AUTHENTICATION = eINSTANCE.getWafModel_Authentication();

		/**
		 * The meta object literal for the '<em><b>Captcha Site Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__CAPTCHA_SITE_KEY = eINSTANCE.getWafModel_CaptchaSiteKey();

		/**
		 * The meta object literal for the '<em><b>Captcha Secret Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__CAPTCHA_SECRET_KEY = eINSTANCE.getWafModel_CaptchaSecretKey();

		/**
		 * The meta object literal for the '<em><b>Text Editor URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__TEXT_EDITOR_URL = eINSTANCE.getWafModel_TextEditorURL();

		/**
		 * The meta object literal for the '<em><b>Top Navigation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__TOP_NAVIGATION_ID = eINSTANCE.getWafModel_TopNavigationId();

		/**
		 * The meta object literal for the '<em><b>Side Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAF_MODEL__SIDE_MENU = eINSTANCE.getWafModel_SideMenu();

		/**
		 * The meta object literal for the '<em><b>Site Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__SITE_TEMPLATE = eINSTANCE.getWafModel_SiteTemplate();

		/**
		 * The meta object literal for the '<em><b>Static Units Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAF_MODEL__STATIC_UNITS_EDITABLE = eINSTANCE.getWafModel_StaticUnitsEditable();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.AuthenticationImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>Authorises</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__AUTHORISES = eINSTANCE.getAuthentication_Authorises();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__USER = eINSTANCE.getAuthentication_User();

		/**
		 * The meta object literal for the '<em><b>User Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__USER_KEY = eINSTANCE.getAuthentication_UserKey();

		/**
		 * The meta object literal for the '<em><b>Login Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__LOGIN_LABEL = eINSTANCE.getAuthentication_LoginLabel();

		/**
		 * The meta object literal for the '<em><b>Logout Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__LOGOUT_LABEL = eINSTANCE.getAuthentication_LogoutLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl <em>Local Authentication System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getLocalAuthenticationSystem()
		 * @generated
		 */
		EClass LOCAL_AUTHENTICATION_SYSTEM = eINSTANCE.getLocalAuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION = eINSTANCE.getLocalAuthenticationSystem_Authentication();

		/**
		 * The meta object literal for the '<em><b>Authentication Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY = eINSTANCE.getLocalAuthenticationSystem_AuthenticationKey();

		/**
		 * The meta object literal for the '<em><b>Login Attempt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT = eINSTANCE.getLocalAuthenticationSystem_LoginAttempt();

		/**
		 * The meta object literal for the '<em><b>Auto Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN = eINSTANCE.getLocalAuthenticationSystem_AutoLogin();

		/**
		 * The meta object literal for the '<em><b>Use Captcha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA = eINSTANCE.getLocalAuthenticationSystem_UseCaptcha();

		/**
		 * The meta object literal for the '<em><b>Allow Remember Me</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME = eINSTANCE.getLocalAuthenticationSystem_AllowRememberMe();

		/**
		 * The meta object literal for the '<em><b>Allow Self Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION = eINSTANCE.getLocalAuthenticationSystem_AllowSelfRegistration();

		/**
		 * The meta object literal for the '<em><b>Use Email Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION = eINSTANCE.getLocalAuthenticationSystem_UseEmailActivation();

		/**
		 * The meta object literal for the '<em><b>Send Welcome Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL = eINSTANCE.getLocalAuthenticationSystem_SendWelcomeEmail();

		/**
		 * The meta object literal for the '<em><b>Registration Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT = eINSTANCE.getLocalAuthenticationSystem_RegistrationUnit();

		/**
		 * The meta object literal for the '<em><b>Login Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT = eINSTANCE.getLocalAuthenticationSystem_LoginUnit();

		/**
		 * The meta object literal for the '<em><b>Forgotten Password Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT = eINSTANCE.getLocalAuthenticationSystem_ForgottenPasswordUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.CasAuthenticationImpl <em>Cas Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.CasAuthenticationImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCasAuthentication()
		 * @generated
		 */
		EClass CAS_AUTHENTICATION = eINSTANCE.getCasAuthentication();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.DisplayElementImpl <em>Display Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.DisplayElementImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDisplayElement()
		 * @generated
		 */
		EClass DISPLAY_ELEMENT = eINSTANCE.getDisplayElement();

		/**
		 * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_ELEMENT__DISPLAY_LABEL = eINSTANCE.getDisplayElement_DisplayLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ImageManipulationImpl <em>Image Manipulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ImageManipulationImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getImageManipulation()
		 * @generated
		 */
		EClass IMAGE_MANIPULATION = eINSTANCE.getImageManipulation();

		/**
		 * The meta object literal for the '<em><b>Jpeg Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MANIPULATION__JPEG_QUALITY = eINSTANCE.getImageManipulation_JpegQuality();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_MANIPULATION__FILTERS = eINSTANCE.getImageManipulation_Filters();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ImageFilterImpl <em>Image Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ImageFilterImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getImageFilter()
		 * @generated
		 */
		EClass IMAGE_FILTER = eINSTANCE.getImageFilter();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ThumbnailFilterImpl <em>Thumbnail Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ThumbnailFilterImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getThumbnailFilter()
		 * @generated
		 */
		EClass THUMBNAIL_FILTER = eINSTANCE.getThumbnailFilter();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THUMBNAIL_FILTER__WIDTH = eINSTANCE.getThumbnailFilter_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THUMBNAIL_FILTER__HEIGHT = eINSTANCE.getThumbnailFilter_Height();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THUMBNAIL_FILTER__MODE = eINSTANCE.getThumbnailFilter_Mode();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.MenuImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ENTRIES = eINSTANCE.getMenu_Entries();

		/**
		 * The meta object literal for the '<em><b>Omit Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__OMIT_CAPTION = eINSTANCE.getMenu_OmitCaption();

		/**
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__CAPTION_CLASS = eINSTANCE.getMenu_CaptionClass();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__STYLE_CLASS = eINSTANCE.getMenu_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Layout Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__LAYOUT_CLASS = eINSTANCE.getMenu_LayoutClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.GlobalMenuImpl <em>Global Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.GlobalMenuImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getGlobalMenu()
		 * @generated
		 */
		EClass GLOBAL_MENU = eINSTANCE.getGlobalMenu();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.DynamicMenuImpl <em>Dynamic Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.DynamicMenuImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDynamicMenu()
		 * @generated
		 */
		EClass DYNAMIC_MENU = eINSTANCE.getDynamicMenu();

		/**
		 * The meta object literal for the '<em><b>Entity Or View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MENU__ENTITY_OR_VIEW = eINSTANCE.getDynamicMenu_EntityOrView();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MENU__SELECTION = eINSTANCE.getDynamicMenu_Selection();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MENU__TITLE = eINSTANCE.getDynamicMenu_Title();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.MenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getMenuEntry()
		 * @generated
		 */
		EClass MENU_ENTRY = eINSTANCE.getMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ENTRY__PART_OF = eINSTANCE.getMenuEntry_PartOf();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ENTRY__REQUIRES_ROLE = eINSTANCE.getMenuEntry_RequiresRole();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ActionMenuEntryImpl <em>Action Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ActionMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getActionMenuEntry()
		 * @generated
		 */
		EClass ACTION_MENU_ENTRY = eINSTANCE.getActionMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MENU_ENTRY__ACTION = eINSTANCE.getActionMenuEntry_Action();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MENU_ENTRY__QUERY = eINSTANCE.getActionMenuEntry_Query();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.EditStaticTextMenuEntryImpl <em>Edit Static Text Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.EditStaticTextMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getEditStaticTextMenuEntry()
		 * @generated
		 */
		EClass EDIT_STATIC_TEXT_MENU_ENTRY = eINSTANCE.getEditStaticTextMenuEntry();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.PageImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PART_OF = eINSTANCE.getPage_PartOf();

		/**
		 * The meta object literal for the '<em><b>Parent Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PARENT_PAGE = eINSTANCE.getPage_ParentPage();

		/**
		 * The meta object literal for the '<em><b>Child Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CHILD_PAGES = eINSTANCE.getPage_ChildPages();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__URI_ELEMENT = eINSTANCE.getPage_UriElement();

		/**
		 * The meta object literal for the '<em><b>Top Menu Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TOP_MENU_OPTION = eINSTANCE.getPage_TopMenuOption();

		/**
		 * The meta object literal for the '<em><b>Top Menu Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TOP_MENU_REQUIRES_ROLE = eINSTANCE.getPage_TopMenuRequiresRole();

		/**
		 * The meta object literal for the '<em><b>Top Menu Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TOP_MENU_RANK = eINSTANCE.getPage_TopMenuRank();

		/**
		 * The meta object literal for the '<em><b>Navigation Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAVIGATION_LABEL = eINSTANCE.getPage_NavigationLabel();

		/**
		 * The meta object literal for the '<em><b>Side Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SIDE_MENU = eINSTANCE.getPage_SideMenu();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__STYLE_CLASS = eINSTANCE.getPage_StyleClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.QueryImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__FILTER = eINSTANCE.getQuery_Filter();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__PARAMETERS = eINSTANCE.getQuery_Parameters();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.QueryParameterImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getQueryParameter()
		 * @generated
		 */
		EClass QUERY_PARAMETER = eINSTANCE.getQueryParameter();

		/**
		 * The meta object literal for the '<em><b>Formal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_PARAMETER__FORMAL = eINSTANCE.getQueryParameter_Formal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__VALUE = eINSTANCE.getQueryParameter_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.UnitContainer <em>Unit Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.UnitContainer
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitContainer()
		 * @generated
		 */
		EClass UNIT_CONTAINER = eINSTANCE.getUnitContainer();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CONTAINER__UNITS = eINSTANCE.getUnitContainer_Units();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ContentUnitImpl <em>Content Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ContentUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getContentUnit()
		 * @generated
		 */
		EClass CONTENT_UNIT = eINSTANCE.getContentUnit();

		/**
		 * The meta object literal for the '<em><b>Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__DISPLAYED_ON = eINSTANCE.getContentUnit_DisplayedOn();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__URI_ELEMENT = eINSTANCE.getContentUnit_UriElement();

		/**
		 * The meta object literal for the '<em><b>Route Actuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__ROUTE_ACTUALS = eINSTANCE.getContentUnit_RouteActuals();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__REQUIRES_ROLE = eINSTANCE.getContentUnit_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Purpose Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__PURPOSE_SUMMARY = eINSTANCE.getContentUnit_PurposeSummary();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__ALTERNATIVE = eINSTANCE.getContentUnit_Alternative();

		/**
		 * The meta object literal for the '<em><b>Omit Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__OMIT_CAPTION = eINSTANCE.getContentUnit_OmitCaption();

		/**
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__CAPTION_CLASS = eINSTANCE.getContentUnit_CaptionClass();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__STYLE_CLASS = eINSTANCE.getContentUnit_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__CONTENT_CLASS = eINSTANCE.getContentUnit_ContentClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.RouteActualImpl <em>Route Actual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.RouteActualImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getRouteActual()
		 * @generated
		 */
		EClass ROUTE_ACTUAL = eINSTANCE.getRouteActual();

		/**
		 * The meta object literal for the '<em><b>Route Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ACTUAL__ROUTE_PARAMETER = eINSTANCE.getRouteActual_RouteParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ACTUAL__VALUE = eINSTANCE.getRouteActual_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.StaticUnitImpl <em>Static Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.StaticUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getStaticUnit()
		 * @generated
		 */
		EClass STATIC_UNIT = eINSTANCE.getStaticUnit();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_UNIT__SERVICE = eINSTANCE.getStaticUnit_Service();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_UNIT__CONTENT = eINSTANCE.getStaticUnit_Content();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.DynamicUnitImpl <em>Dynamic Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.DynamicUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDynamicUnit()
		 * @generated
		 */
		EClass DYNAMIC_UNIT = eINSTANCE.getDynamicUnit();

		/**
		 * The meta object literal for the '<em><b>Display Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__DISPLAY_FIELDS = eINSTANCE.getDynamicUnit_DisplayFields();

		/**
		 * The meta object literal for the '<em><b>Support Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__SUPPORT_ACTIONS = eINSTANCE.getDynamicUnit_SupportActions();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__HEADER = eINSTANCE.getDynamicUnit_Header();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__FOOTER = eINSTANCE.getDynamicUnit_Footer();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__HEADER_CLASS = eINSTANCE.getDynamicUnit_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Control Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__CONTROL_CLASS = eINSTANCE.getDynamicUnit_ControlClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__FOOTER_CLASS = eINSTANCE.getDynamicUnit_FooterClass();

		/**
		 * The meta object literal for the '<em><b>Error Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__ERROR_CLASS = eINSTANCE.getDynamicUnit_ErrorClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.UnitSupportActionImpl <em>Unit Support Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.UnitSupportActionImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitSupportAction()
		 * @generated
		 */
		EClass UNIT_SUPPORT_ACTION = eINSTANCE.getUnitSupportAction();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_SUPPORT_ACTION__DISABLE = eINSTANCE.getUnitSupportAction_Disable();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE = eINSTANCE.getUnitSupportAction_ConfirmMessage();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.UnitField <em>Unit Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.UnitField
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitField()
		 * @generated
		 */
		EClass UNIT_FIELD = eINSTANCE.getUnitField();

		/**
		 * The meta object literal for the '<em><b>Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FIELD__DISPLAYED_ON = eINSTANCE.getUnitField_DisplayedOn();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__REQUIRES_ROLE = eINSTANCE.getUnitField_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__TITLE = eINSTANCE.getUnitField_Title();

		/**
		 * The meta object literal for the '<em><b>Collection Display Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__COLLECTION_DISPLAY_OPTION = eINSTANCE.getUnitField_CollectionDisplayOption();

		/**
		 * The meta object literal for the '<em><b>Maximum Display Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__MAXIMUM_DISPLAY_SIZE = eINSTANCE.getUnitField_MaximumDisplaySize();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__DATE_FORMAT = eINSTANCE.getUnitField_DateFormat();

		/**
		 * The meta object literal for the '<em><b>Disable Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__DISABLE_INPUT = eINSTANCE.getUnitField_DisableInput();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl <em>Unit Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitFeature()
		 * @generated
		 */
		EClass UNIT_FEATURE = eINSTANCE.getUnitFeature();

		/**
		 * The meta object literal for the '<em><b>Forced Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FEATURE__FORCED_VALUE = eINSTANCE.getUnitFeature_ForcedValue();

		/**
		 * The meta object literal for the '<em><b>Collection Ui Allow Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD = eINSTANCE.getUnitFeature_CollectionUiAllowAdd();

		/**
		 * The meta object literal for the '<em><b>Collection Ui Allow Remove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE = eINSTANCE.getUnitFeature_CollectionUiAllowRemove();

		/**
		 * The meta object literal for the '<em><b>Null Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__NULL_DISPLAY_VALUE = eINSTANCE.getUnitFeature_NullDisplayValue();

		/**
		 * The meta object literal for the '<em><b>Only Display When Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY = eINSTANCE.getUnitFeature_OnlyDisplayWhenNotEmpty();

		/**
		 * The meta object literal for the '<em><b>Autofocus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__AUTOFOCUS = eINSTANCE.getUnitFeature_Autofocus();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__FOOTER = eINSTANCE.getUnitFeature_Footer();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__HEADER_CLASS = eINSTANCE.getUnitFeature_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__INPUT_CLASS = eINSTANCE.getUnitFeature_InputClass();

		/**
		 * The meta object literal for the '<em><b>Display Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__DISPLAY_CLASS = eINSTANCE.getUnitFeature_DisplayClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__FOOTER_CLASS = eINSTANCE.getUnitFeature_FooterClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.UnitAttributeImpl <em>Unit Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.UnitAttributeImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitAttribute()
		 * @generated
		 */
		EClass UNIT_ATTRIBUTE = eINSTANCE.getUnitAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getUnitAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ATTRIBUTE__NAME = eINSTANCE.getUnitAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getUnitAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ATTRIBUTE__OBFUSCATE_FORM_FIELDS = eINSTANCE.getUnitAttribute_ObfuscateFormFields();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ATTRIBUTE__PLACEHOLDER = eINSTANCE.getUnitAttribute_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ATTRIBUTE__VALIDATION_PATTERN = eINSTANCE.getUnitAttribute_ValidationPattern();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.UnitAssociationImpl <em>Unit Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.UnitAssociationImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUnitAssociation()
		 * @generated
		 */
		EClass UNIT_ASSOCIATION = eINSTANCE.getUnitAssociation();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__SELECTION = eINSTANCE.getUnitAssociation_Selection();

		/**
		 * The meta object literal for the '<em><b>Ajax Options List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__AJAX_OPTIONS_LIST = eINSTANCE.getUnitAssociation_AjaxOptionsList();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.AssociationReferenceImpl <em>Association Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.AssociationReferenceImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getAssociationReference()
		 * @generated
		 */
		EClass ASSOCIATION_REFERENCE = eINSTANCE.getAssociationReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_REFERENCE__NAME = eINSTANCE.getAssociationReference_Name();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_REFERENCE__ASSOCIATION = eINSTANCE.getAssociationReference_Association();

		/**
		 * The meta object literal for the '<em><b>Value Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_REFERENCE__VALUE_DISPLAY = eINSTANCE.getAssociationReference_ValueDisplay();

		/**
		 * The meta object literal for the '<em><b>Child Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_REFERENCE__CHILD_FEATURE = eINSTANCE.getAssociationReference_ChildFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.InterfaceFieldImpl <em>Interface Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.InterfaceFieldImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getInterfaceField()
		 * @generated
		 */
		EClass INTERFACE_FIELD = eINSTANCE.getInterfaceField();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__REQUIRED = eINSTANCE.getInterfaceField_Required();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_FIELD__DEFAULT_VALUE = eINSTANCE.getInterfaceField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Must Match</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_FIELD__MUST_MATCH = eINSTANCE.getInterfaceField_MustMatch();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__INTERFACE_TYPE = eINSTANCE.getInterfaceField_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__PLACEHOLDER = eINSTANCE.getInterfaceField_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__VALIDATION_PATTERN = eINSTANCE.getInterfaceField_ValidationPattern();

		/**
		 * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__INPUT_CLASS = eINSTANCE.getInterfaceField_InputClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.DataTypeFieldImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDataTypeField()
		 * @generated
		 */
		EClass DATA_TYPE_FIELD = eINSTANCE.getDataTypeField();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_FIELD__DATA_TYPE = eINSTANCE.getDataTypeField_DataType();

		/**
		 * The meta object literal for the '<em><b>Case Insensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__CASE_INSENSITIVE = eINSTANCE.getDataTypeField_CaseInsensitive();

		/**
		 * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS = eINSTANCE.getDataTypeField_ObfuscateFormFields();

		/**
		 * The meta object literal for the '<em><b>Encrypt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__ENCRYPT = eINSTANCE.getDataTypeField_Encrypt();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.DateFieldImpl <em>Date Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.DateFieldImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDateField()
		 * @generated
		 */
		EClass DATE_FIELD = eINSTANCE.getDateField();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__DETAILS = eINSTANCE.getDateField_Details();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__FORMAT = eINSTANCE.getDateField_Format();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.CaptchaFieldImpl <em>Captcha Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.CaptchaFieldImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCaptchaField()
		 * @generated
		 */
		EClass CAPTCHA_FIELD = eINSTANCE.getCaptchaField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.SelectableUnit <em>Selectable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.SelectableUnit
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getSelectableUnit()
		 * @generated
		 */
		EClass SELECTABLE_UNIT = eINSTANCE.getSelectableUnit();

		/**
		 * The meta object literal for the '<em><b>Selectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTABLE_UNIT__SELECTORS = eINSTANCE.getSelectableUnit_Selectors();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.SingletonUnit <em>Singleton Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.SingletonUnit
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getSingletonUnit()
		 * @generated
		 */
		EClass SINGLETON_UNIT = eINSTANCE.getSingletonUnit();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLETON_UNIT__CONTENT_TYPE = eINSTANCE.getSingletonUnit_ContentType();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit <em>Collection Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.CollectionUnit
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCollectionUnit()
		 * @generated
		 */
		EClass COLLECTION_UNIT = eINSTANCE.getCollectionUnit();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__CONTENT_TYPE = eINSTANCE.getCollectionUnit_ContentType();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__SELECTION = eINSTANCE.getCollectionUnit_Selection();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__FILTER = eINSTANCE.getCollectionUnit_Filter();

		/**
		 * The meta object literal for the '<em><b>Supported Filters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__SUPPORTED_FILTERS = eINSTANCE.getCollectionUnit_SupportedFilters();

		/**
		 * The meta object literal for the '<em><b>Empty Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__EMPTY_MESSAGE = eINSTANCE.getCollectionUnit_EmptyMessage();

		/**
		 * The meta object literal for the '<em><b>Default Pagination Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE = eINSTANCE.getCollectionUnit_DefaultPaginationSize();

		/**
		 * The meta object literal for the '<em><b>Maximum Pagination Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE = eINSTANCE.getCollectionUnit_MaximumPaginationSize();

		/**
		 * The meta object literal for the '<em><b>Next Npages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__NEXT_NPAGES = eINSTANCE.getCollectionUnit_NextNpages();

		/**
		 * The meta object literal for the '<em><b>Previous Npages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PREVIOUS_NPAGES = eINSTANCE.getCollectionUnit_PreviousNpages();

		/**
		 * The meta object literal for the '<em><b>Next Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__NEXT_PAGE_LABEL = eINSTANCE.getCollectionUnit_NextPageLabel();

		/**
		 * The meta object literal for the '<em><b>Next Page Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__NEXT_PAGE_ICON_NAME = eINSTANCE.getCollectionUnit_NextPageIconName();

		/**
		 * The meta object literal for the '<em><b>Previous Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PREVIOUS_PAGE_LABEL = eINSTANCE.getCollectionUnit_PreviousPageLabel();

		/**
		 * The meta object literal for the '<em><b>Previous Page Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME = eINSTANCE.getCollectionUnit_PreviousPageIconName();

		/**
		 * The meta object literal for the '<em><b>Use Disabled Page Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS = eINSTANCE.getCollectionUnit_UseDisabledPageLinks();

		/**
		 * The meta object literal for the '<em><b>Use First Last Page Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = eINSTANCE.getCollectionUnit_UseFirstLastPageLinks();

		/**
		 * The meta object literal for the '<em><b>First Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__FIRST_PAGE_LABEL = eINSTANCE.getCollectionUnit_FirstPageLabel();

		/**
		 * The meta object literal for the '<em><b>First Page Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__FIRST_PAGE_ICON_NAME = eINSTANCE.getCollectionUnit_FirstPageIconName();

		/**
		 * The meta object literal for the '<em><b>Last Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__LAST_PAGE_LABEL = eINSTANCE.getCollectionUnit_LastPageLabel();

		/**
		 * The meta object literal for the '<em><b>Last Page Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__LAST_PAGE_ICON_NAME = eINSTANCE.getCollectionUnit_LastPageIconName();

		/**
		 * The meta object literal for the '<em><b>Pagination Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PAGINATION_CLASS = eINSTANCE.getCollectionUnit_PaginationClass();

		/**
		 * The meta object literal for the '<em><b>Pagination Element Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS = eINSTANCE.getCollectionUnit_PaginationElementClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.EditUnitImpl <em>Edit Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.EditUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getEditUnit()
		 * @generated
		 */
		EClass EDIT_UNIT = eINSTANCE.getEditUnit();

		/**
		 * The meta object literal for the '<em><b>On Save Continue Editing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__ON_SAVE_CONTINUE_EDITING = eINSTANCE.getEditUnit_OnSaveContinueEditing();

		/**
		 * The meta object literal for the '<em><b>Disable Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__DISABLE_CONDITION = eINSTANCE.getEditUnit_DisableCondition();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__TITLE = eINSTANCE.getEditUnit_Title();

		/**
		 * The meta object literal for the '<em><b>Confirm Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__CONFIRM_DESTINATION = eINSTANCE.getEditUnit_ConfirmDestination();

		/**
		 * The meta object literal for the '<em><b>Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CONFIRM_LABEL = eINSTANCE.getEditUnit_ConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Cancel Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__CANCEL_DESTINATION = eINSTANCE.getEditUnit_CancelDestination();

		/**
		 * The meta object literal for the '<em><b>Cancel Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CANCEL_LABEL = eINSTANCE.getEditUnit_CancelLabel();

		/**
		 * The meta object literal for the '<em><b>Customise Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CUSTOMISE_VALUES = eINSTANCE.getEditUnit_CustomiseValues();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.CreateUnitImpl <em>Create Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.CreateUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCreateUnit()
		 * @generated
		 */
		EClass CREATE_UNIT = eINSTANCE.getCreateUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.CreateUpdateUnitImpl <em>Create Update Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.CreateUpdateUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCreateUpdateUnit()
		 * @generated
		 */
		EClass CREATE_UPDATE_UNIT = eINSTANCE.getCreateUpdateUnit();

		/**
		 * The meta object literal for the '<em><b>Create Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT = eINSTANCE.getCreateUpdateUnit_CreateUriElement();

		/**
		 * The meta object literal for the '<em><b>Clear Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UPDATE_UNIT__CLEAR_LABEL = eINSTANCE.getCreateUpdateUnit_ClearLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.MapUnitImpl <em>Map Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.MapUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getMapUnit()
		 * @generated
		 */
		EClass MAP_UNIT = eINSTANCE.getMapUnit();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_UNIT__READ_ONLY = eINSTANCE.getMapUnit_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Default Zoom Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_UNIT__DEFAULT_ZOOM_LEVEL = eINSTANCE.getMapUnit_DefaultZoomLevel();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_UNIT__LOCATION = eINSTANCE.getMapUnit_Location();

		/**
		 * The meta object literal for the '<em><b>Place Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_UNIT__PLACE_NAME = eINSTANCE.getMapUnit_PlaceName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.UpdateUnitImpl <em>Update Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.UpdateUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getUpdateUnit()
		 * @generated
		 */
		EClass UPDATE_UNIT = eINSTANCE.getUpdateUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.DataUnitImpl <em>Data Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.DataUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDataUnit()
		 * @generated
		 */
		EClass DATA_UNIT = eINSTANCE.getDataUnit();

		/**
		 * The meta object literal for the '<em><b>Default Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNIT__DEFAULT_SELECTION = eINSTANCE.getDataUnit_DefaultSelection();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNIT__TITLE = eINSTANCE.getDataUnit_Title();

		/**
		 * The meta object literal for the '<em><b>Only Display When Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY = eINSTANCE.getDataUnit_OnlyDisplayWhenNotEmpty();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.DetailsUnitImpl <em>Details Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.DetailsUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDetailsUnit()
		 * @generated
		 */
		EClass DETAILS_UNIT = eINSTANCE.getDetailsUnit();

		/**
		 * The meta object literal for the '<em><b>Omit Field Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_UNIT__OMIT_FIELD_LABELS = eINSTANCE.getDetailsUnit_OmitFieldLabels();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.IndexUnitImpl <em>Index Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.IndexUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getIndexUnit()
		 * @generated
		 */
		EClass INDEX_UNIT = eINSTANCE.getIndexUnit();

		/**
		 * The meta object literal for the '<em><b>Omit Column Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__OMIT_COLUMN_LABELS = eINSTANCE.getIndexUnit_OmitColumnLabels();

		/**
		 * The meta object literal for the '<em><b>Targetting Searches</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_UNIT__TARGETTING_SEARCHES = eINSTANCE.getIndexUnit_TargettingSearches();

		/**
		 * The meta object literal for the '<em><b>Row Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__ROW_CLASSES = eINSTANCE.getIndexUnit_RowClasses();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.IndexGridUnitImpl <em>Index Grid Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.IndexGridUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getIndexGridUnit()
		 * @generated
		 */
		EClass INDEX_GRID_UNIT = eINSTANCE.getIndexGridUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.IndexPageDirectionUnitImpl <em>Index Page Direction Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.IndexPageDirectionUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getIndexPageDirectionUnit()
		 * @generated
		 */
		EClass INDEX_PAGE_DIRECTION_UNIT = eINSTANCE.getIndexPageDirectionUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.IndexLineDirectionUnitImpl <em>Index Line Direction Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.IndexLineDirectionUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getIndexLineDirectionUnit()
		 * @generated
		 */
		EClass INDEX_LINE_DIRECTION_UNIT = eINSTANCE.getIndexLineDirectionUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ControlUnitImpl <em>Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ControlUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getControlUnit()
		 * @generated
		 */
		EClass CONTROL_UNIT = eINSTANCE.getControlUnit();

		/**
		 * The meta object literal for the '<em><b>Submit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__SUBMIT_LABEL = eINSTANCE.getControlUnit_SubmitLabel();

		/**
		 * The meta object literal for the '<em><b>Cancel Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__CANCEL_DESTINATION = eINSTANCE.getControlUnit_CancelDestination();

		/**
		 * The meta object literal for the '<em><b>Cancel Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__CANCEL_LABEL = eINSTANCE.getControlUnit_CancelLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.SearchUnitImpl <em>Search Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.SearchUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getSearchUnit()
		 * @generated
		 */
		EClass SEARCH_UNIT = eINSTANCE.getSearchUnit();

		/**
		 * The meta object literal for the '<em><b>Results Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_UNIT__RESULTS_DESTINATION = eINSTANCE.getSearchUnit_ResultsDestination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl <em>Image Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getImageUnit()
		 * @generated
		 */
		EClass IMAGE_UNIT = eINSTANCE.getImageUnit();

		/**
		 * The meta object literal for the '<em><b>Image Path Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__IMAGE_PATH_FEATURE = eINSTANCE.getImageUnit_ImagePathFeature();

		/**
		 * The meta object literal for the '<em><b>Title Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__TITLE_FEATURE = eINSTANCE.getImageUnit_TitleFeature();

		/**
		 * The meta object literal for the '<em><b>Missing Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UNIT__MISSING_IMAGE_PATH = eINSTANCE.getImageUnit_MissingImagePath();

		/**
		 * The meta object literal for the '<em><b>Image Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__IMAGE_FILTER = eINSTANCE.getImageUnit_ImageFilter();

		/**
		 * The meta object literal for the '<em><b>Show Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UNIT__SHOW_TIME = eINSTANCE.getImageUnit_ShowTime();

		/**
		 * The meta object literal for the '<em><b>Transition Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UNIT__TRANSITION_TIME = eINSTANCE.getImageUnit_TransitionTime();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.FeaturePathImpl <em>Feature Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.FeaturePathImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getFeaturePath()
		 * @generated
		 */
		EClass FEATURE_PATH = eINSTANCE.getFeaturePath();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.FeaturePathAttributeImpl <em>Feature Path Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.FeaturePathAttributeImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getFeaturePathAttribute()
		 * @generated
		 */
		EClass FEATURE_PATH_ATTRIBUTE = eINSTANCE.getFeaturePathAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_PATH_ATTRIBUTE__NAME = eINSTANCE.getFeaturePathAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getFeaturePathAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.FeaturePathAssociationImpl <em>Feature Path Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.FeaturePathAssociationImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getFeaturePathAssociation()
		 * @generated
		 */
		EClass FEATURE_PATH_ASSOCIATION = eINSTANCE.getFeaturePathAssociation();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ChildPathImpl <em>Child Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ChildPathImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getChildPath()
		 * @generated
		 */
		EClass CHILD_PATH = eINSTANCE.getChildPath();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ChildPathAttributeImpl <em>Child Path Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ChildPathAttributeImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getChildPathAttribute()
		 * @generated
		 */
		EClass CHILD_PATH_ATTRIBUTE = eINSTANCE.getChildPathAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILD_PATH_ATTRIBUTE__NAME = eINSTANCE.getChildPathAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_PATH_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getChildPathAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ChildPathAssociationImpl <em>Child Path Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ChildPathAssociationImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getChildPathAssociation()
		 * @generated
		 */
		EClass CHILD_PATH_ASSOCIATION = eINSTANCE.getChildPathAssociation();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ImageIndexUnitImpl <em>Image Index Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ImageIndexUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getImageIndexUnit()
		 * @generated
		 */
		EClass IMAGE_INDEX_UNIT = eINSTANCE.getImageIndexUnit();

		/**
		 * The meta object literal for the '<em><b>Column Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_INDEX_UNIT__COLUMN_CLASS = eINSTANCE.getImageIndexUnit_ColumnClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.SliderUnitImpl <em>Slider Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.SliderUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getSliderUnit()
		 * @generated
		 */
		EClass SLIDER_UNIT = eINSTANCE.getSliderUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.GalleryUnitImpl <em>Gallery Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.GalleryUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getGalleryUnit()
		 * @generated
		 */
		EClass GALLERY_UNIT = eINSTANCE.getGalleryUnit();

		/**
		 * The meta object literal for the '<em><b>Full Size Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GALLERY_UNIT__FULL_SIZE_FILTER = eINSTANCE.getGalleryUnit_FullSizeFilter();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.AuthenticationUnit <em>Authentication Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.AuthenticationUnit
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getAuthenticationUnit()
		 * @generated
		 */
		EClass AUTHENTICATION_UNIT = eINSTANCE.getAuthenticationUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.RegistrationUnitImpl <em>Registration Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.RegistrationUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getRegistrationUnit()
		 * @generated
		 */
		EClass REGISTRATION_UNIT = eINSTANCE.getRegistrationUnit();

		/**
		 * The meta object literal for the '<em><b>Authentication System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION_UNIT__AUTHENTICATION_SYSTEM = eINSTANCE.getRegistrationUnit_AuthenticationSystem();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.LoginUnitImpl <em>Login Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.LoginUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getLoginUnit()
		 * @generated
		 */
		EClass LOGIN_UNIT = eINSTANCE.getLoginUnit();

		/**
		 * The meta object literal for the '<em><b>Authentication System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_UNIT__AUTHENTICATION_SYSTEM = eINSTANCE.getLoginUnit_AuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>Login Id Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_UNIT__LOGIN_ID_FIELD = eINSTANCE.getLoginUnit_LoginIdField();

		/**
		 * The meta object literal for the '<em><b>Password Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_UNIT__PASSWORD_FIELD = eINSTANCE.getLoginUnit_PasswordField();

		/**
		 * The meta object literal for the '<em><b>Remember Me Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_UNIT__REMEMBER_ME_FIELD = eINSTANCE.getLoginUnit_RememberMeField();

		/**
		 * The meta object literal for the '<em><b>Logout Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_UNIT__LOGOUT_URI_ELEMENT = eINSTANCE.getLoginUnit_LogoutUriElement();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.ForgottenPasswordUnitImpl <em>Forgotten Password Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.ForgottenPasswordUnitImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getForgottenPasswordUnit()
		 * @generated
		 */
		EClass FORGOTTEN_PASSWORD_UNIT = eINSTANCE.getForgottenPasswordUnit();

		/**
		 * The meta object literal for the '<em><b>Authentication System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM = eINSTANCE.getForgottenPasswordUnit_AuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>Login Id Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORGOTTEN_PASSWORD_UNIT__LOGIN_ID_FIELD = eINSTANCE.getForgottenPasswordUnit_LoginIdField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.InlineActionContainer <em>Inline Action Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.InlineActionContainer
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getInlineActionContainer()
		 * @generated
		 */
		EClass INLINE_ACTION_CONTAINER = eINSTANCE.getInlineActionContainer();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION_CONTAINER__ACTIONS = eINSTANCE.getInlineActionContainer_Actions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.InlineActionImpl <em>Inline Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.InlineActionImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getInlineAction()
		 * @generated
		 */
		EClass INLINE_ACTION = eINSTANCE.getInlineAction();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION__USED_BY = eINSTANCE.getInlineAction_UsedBy();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__DISABLE = eINSTANCE.getInlineAction_Disable();

		/**
		 * The meta object literal for the '<em><b>Display When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION__DISPLAY_WHEN = eINSTANCE.getInlineAction_DisplayWhen();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__HEADER = eINSTANCE.getInlineAction_Header();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__FOOTER = eINSTANCE.getInlineAction_Footer();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__HEADER_CLASS = eINSTANCE.getInlineAction_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__FOOTER_CLASS = eINSTANCE.getInlineAction_FooterClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.SelectActionImpl <em>Select Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.SelectActionImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getSelectAction()
		 * @generated
		 */
		EClass SELECT_ACTION = eINSTANCE.getSelectAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ACTION__TARGET = eINSTANCE.getSelectAction_Target();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.DeleteActionImpl <em>Delete Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.DeleteActionImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getDeleteAction()
		 * @generated
		 */
		EClass DELETE_ACTION = eINSTANCE.getDeleteAction();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ACTION__DESTINATION = eINSTANCE.getDeleteAction_Destination();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__CONFIRM_MESSAGE = eINSTANCE.getDeleteAction_ConfirmMessage();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__REQUIRES_ROLE = eINSTANCE.getDeleteAction_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Enable When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ACTION__ENABLE_WHEN = eINSTANCE.getDeleteAction_EnableWhen();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__URI_ELEMENT = eINSTANCE.getDeleteAction_UriElement();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.impl.FeatureSupportActionImpl <em>Feature Support Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.impl.FeatureSupportActionImpl
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getFeatureSupportAction()
		 * @generated
		 */
		EClass FEATURE_SUPPORT_ACTION = eINSTANCE.getFeatureSupportAction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SUPPORT_ACTION__OPERATION = eINSTANCE.getFeatureSupportAction_Operation();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE = eINSTANCE.getFeatureSupportAction_ConfirmMessage();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__REQUIRES_ROLE = eINSTANCE.getFeatureSupportAction_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Enable When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SUPPORT_ACTION__ENABLE_WHEN = eINSTANCE.getFeatureSupportAction_EnableWhen();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__URI_ELEMENT = eINSTANCE.getFeatureSupportAction_UriElement();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__FILE_EXTENSION = eINSTANCE.getFeatureSupportAction_FileExtension();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.FrameworkTechnologies <em>Framework Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.FrameworkTechnologies
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getFrameworkTechnologies()
		 * @generated
		 */
		EEnum FRAMEWORK_TECHNOLOGIES = eINSTANCE.getFrameworkTechnologies();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.InputTechnologies <em>Input Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.InputTechnologies
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getInputTechnologies()
		 * @generated
		 */
		EEnum INPUT_TECHNOLOGIES = eINSTANCE.getInputTechnologies();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.AjaxTechnologies <em>Ajax Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.AjaxTechnologies
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getAjaxTechnologies()
		 * @generated
		 */
		EEnum AJAX_TECHNOLOGIES = eINSTANCE.getAjaxTechnologies();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes <em>Authentication Key Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getAuthenticationKeyTypes()
		 * @generated
		 */
		EEnum AUTHENTICATION_KEY_TYPES = eINSTANCE.getAuthenticationKeyTypes();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.ThumbnailModes <em>Thumbnail Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.ThumbnailModes
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getThumbnailModes()
		 * @generated
		 */
		EEnum THUMBNAIL_MODES = eINSTANCE.getThumbnailModes();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.PageTopMenuOptions <em>Page Top Menu Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.PageTopMenuOptions
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getPageTopMenuOptions()
		 * @generated
		 */
		EEnum PAGE_TOP_MENU_OPTIONS = eINSTANCE.getPageTopMenuOptions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions <em>Collection Display Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions
		 * @see uk.ac.man.cs.mdsd.waf.impl.WafPackageImpl#getCollectionDisplayOptions()
		 * @generated
		 */
		EEnum COLLECTION_DISPLAY_OPTIONS = eINSTANCE.getCollectionDisplayOptions();

	}

} //WafPackage

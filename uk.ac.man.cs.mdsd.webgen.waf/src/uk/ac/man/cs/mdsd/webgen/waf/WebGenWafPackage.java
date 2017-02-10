/**
 */
package uk.ac.man.cs.mdsd.webgen.waf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see uk.ac.man.cs.mdsd.webgen.waf.WebGenWafFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface WebGenWafPackage extends EPackage {
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
	String eNS_URI = "http://cs.man.ac.uk/mdsd/2017/webgen-waf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wg-waf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebGenWafPackage eINSTANCE = uk.ac.man.cs.mdsd.webgen.waf.impl.WebGenWafPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.waf.impl.WebApplicationFrameworkImpl <em>Web Application Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.waf.impl.WebApplicationFrameworkImpl
	 * @see uk.ac.man.cs.mdsd.webgen.waf.impl.WebGenWafPackageImpl#getWebApplicationFramework()
	 * @generated
	 */
	int WEB_APPLICATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Site Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__SITE_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Webmaster Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__WEBMASTER_EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__COPYRIGHT_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Framework Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__FRAMEWORK_TECHNOLOGY = 3;

	/**
	 * The feature id for the '<em><b>Captcha Site Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__CAPTCHA_SITE_KEY = 4;

	/**
	 * The feature id for the '<em><b>Captcha Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__CAPTCHA_SECRET_KEY = 5;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__SECURITY = 6;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__PERSISTENCE = 7;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__SERVICES = 8;

	/**
	 * The feature id for the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__API = 9;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__IMAGE = 10;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK__META_DESCRIPTION = 12;

	/**
	 * The number of structural features of the '<em>Web Application Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Web Application Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.waf.FrameworkTechnologies <em>Framework Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.waf.FrameworkTechnologies
	 * @see uk.ac.man.cs.mdsd.webgen.waf.impl.WebGenWafPackageImpl#getFrameworkTechnologies()
	 * @generated
	 */
	int FRAMEWORK_TECHNOLOGIES = 1;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework <em>Web Application Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Application Framework</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework
	 * @generated
	 */
	EClass getWebApplicationFramework();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getSiteTitle <em>Site Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Title</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getSiteTitle()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EAttribute getWebApplicationFramework_SiteTitle();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getWebmasterEmail <em>Webmaster Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webmaster Email</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getWebmasterEmail()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EAttribute getWebApplicationFramework_WebmasterEmail();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getCopyrightText <em>Copyright Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright Text</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getCopyrightText()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EAttribute getWebApplicationFramework_CopyrightText();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getFrameworkTechnology <em>Framework Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getFrameworkTechnology()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EAttribute getWebApplicationFramework_FrameworkTechnology();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getCaptchaSiteKey <em>Captcha Site Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Captcha Site Key</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getCaptchaSiteKey()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EAttribute getWebApplicationFramework_CaptchaSiteKey();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getCaptchaSecretKey <em>Captcha Secret Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Captcha Secret Key</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getCaptchaSecretKey()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EAttribute getWebApplicationFramework_CaptchaSecretKey();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getSecurity()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EReference getWebApplicationFramework_Security();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getPersistence()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EReference getWebApplicationFramework_Persistence();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getServices()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EReference getWebApplicationFramework_Services();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getApi()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EReference getWebApplicationFramework_Api();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getImage()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EReference getWebApplicationFramework_Image();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getInterface()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EReference getWebApplicationFramework_Interface();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getMetaDescription <em>Meta Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Description</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.WebApplicationFramework#getMetaDescription()
	 * @see #getWebApplicationFramework()
	 * @generated
	 */
	EAttribute getWebApplicationFramework_MetaDescription();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.waf.FrameworkTechnologies <em>Framework Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Framework Technologies</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.waf.FrameworkTechnologies
	 * @generated
	 */
	EEnum getFrameworkTechnologies();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebGenWafFactory getWebGenWafFactory();

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
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.waf.impl.WebApplicationFrameworkImpl <em>Web Application Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.waf.impl.WebApplicationFrameworkImpl
		 * @see uk.ac.man.cs.mdsd.webgen.waf.impl.WebGenWafPackageImpl#getWebApplicationFramework()
		 * @generated
		 */
		EClass WEB_APPLICATION_FRAMEWORK = eINSTANCE.getWebApplicationFramework();

		/**
		 * The meta object literal for the '<em><b>Site Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION_FRAMEWORK__SITE_TITLE = eINSTANCE.getWebApplicationFramework_SiteTitle();

		/**
		 * The meta object literal for the '<em><b>Webmaster Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION_FRAMEWORK__WEBMASTER_EMAIL = eINSTANCE.getWebApplicationFramework_WebmasterEmail();

		/**
		 * The meta object literal for the '<em><b>Copyright Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION_FRAMEWORK__COPYRIGHT_TEXT = eINSTANCE.getWebApplicationFramework_CopyrightText();

		/**
		 * The meta object literal for the '<em><b>Framework Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION_FRAMEWORK__FRAMEWORK_TECHNOLOGY = eINSTANCE.getWebApplicationFramework_FrameworkTechnology();

		/**
		 * The meta object literal for the '<em><b>Captcha Site Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION_FRAMEWORK__CAPTCHA_SITE_KEY = eINSTANCE.getWebApplicationFramework_CaptchaSiteKey();

		/**
		 * The meta object literal for the '<em><b>Captcha Secret Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION_FRAMEWORK__CAPTCHA_SECRET_KEY = eINSTANCE.getWebApplicationFramework_CaptchaSecretKey();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION_FRAMEWORK__SECURITY = eINSTANCE.getWebApplicationFramework_Security();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION_FRAMEWORK__PERSISTENCE = eINSTANCE.getWebApplicationFramework_Persistence();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION_FRAMEWORK__SERVICES = eINSTANCE.getWebApplicationFramework_Services();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION_FRAMEWORK__API = eINSTANCE.getWebApplicationFramework_Api();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION_FRAMEWORK__IMAGE = eINSTANCE.getWebApplicationFramework_Image();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION_FRAMEWORK__INTERFACE = eINSTANCE.getWebApplicationFramework_Interface();

		/**
		 * The meta object literal for the '<em><b>Meta Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION_FRAMEWORK__META_DESCRIPTION = eINSTANCE.getWebApplicationFramework_MetaDescription();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.waf.FrameworkTechnologies <em>Framework Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.waf.FrameworkTechnologies
		 * @see uk.ac.man.cs.mdsd.webgen.waf.impl.WebGenWafPackageImpl#getFrameworkTechnologies()
		 * @generated
		 */
		EEnum FRAMEWORK_TECHNOLOGIES = eINSTANCE.getFrameworkTechnologies();

	}

} //WebGenWafPackage

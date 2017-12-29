/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsitePackage.java,v 1.139 2014/08/22 14:32:53 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface WebsitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "website";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cs.man.ac.uk/mdsd/2010/Website";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "website";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebsitePackage eINSTANCE = uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl <em>Web Gen Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl
	 * @see uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePackageImpl#getWebGenModel()
	 * @generated
	 */
	int WEB_GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Website Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_GEN_MODEL__WEBSITE_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Framework Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_GEN_MODEL__FRAMEWORK_TECHNOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_GEN_MODEL__COPYRIGHT_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_GEN_MODEL__PERSISTENCE = 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_GEN_MODEL__SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_GEN_MODEL__IMAGES = 5;

	/**
	 * The feature id for the '<em><b>Web UI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_GEN_MODEL__WEB_UI = 6;

	/**
	 * The feature id for the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_GEN_MODEL__API = 7;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_GEN_MODEL__SECURITY = 8;

	/**
	 * The number of structural features of the '<em>Web Gen Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_GEN_MODEL_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl
	 * @see uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePackageImpl#getWebsiteProperties()
	 * @generated
	 */
	int WEBSITE_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Site Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__SITE_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Webmaster Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__WEBMASTER_EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__COPYRIGHT_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__META_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Logo Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__LOGO_IMAGE = 4;

	/**
	 * The feature id for the '<em><b>Logo Filters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__LOGO_FILTERS = 5;

	/**
	 * The feature id for the '<em><b>Framework Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY = 6;

	/**
	 * The feature id for the '<em><b>Text Editor URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__TEXT_EDITOR_URL = 7;

	/**
	 * The feature id for the '<em><b>Top Navigation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__TOP_NAVIGATION_ID = 8;

	/**
	 * The feature id for the '<em><b>Site Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__SITE_TEMPLATE = 9;

	/**
	 * The feature id for the '<em><b>Static Units Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE = 10;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_PROPERTIES_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies <em>Framework Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies
	 * @see uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePackageImpl#getFrameworkTechnologies()
	 * @generated
	 */
	int FRAMEWORK_TECHNOLOGIES = 2;

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel <em>Web Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Gen Model</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel
	 * @generated
	 */
	EClass getWebGenModel();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getWebsiteProperties <em>Website Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Website Properties</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getWebsiteProperties()
	 * @see #getWebGenModel()
	 * @generated
	 */
	EReference getWebGenModel_WebsiteProperties();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getFrameworkTechnology <em>Framework Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getFrameworkTechnology()
	 * @see #getWebGenModel()
	 * @generated
	 */
	EAttribute getWebGenModel_FrameworkTechnology();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getCopyrightText <em>Copyright Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright Text</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getCopyrightText()
	 * @see #getWebGenModel()
	 * @generated
	 */
	EAttribute getWebGenModel_CopyrightText();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getWebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web UI</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getWebUI()
	 * @see #getWebGenModel()
	 * @generated
	 */
	EReference getWebGenModel_WebUI();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getApi()
	 * @see #getWebGenModel()
	 * @generated
	 */
	EReference getWebGenModel_Api();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Images</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getImages()
	 * @see #getWebGenModel()
	 * @generated
	 */
	EReference getWebGenModel_Images();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getSecurity()
	 * @see #getWebGenModel()
	 * @generated
	 */
	EReference getWebGenModel_Security();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getPersistence()
	 * @see #getWebGenModel()
	 * @generated
	 */
	EReference getWebGenModel_Persistence();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getServices()
	 * @see #getWebGenModel()
	 * @generated
	 */
	EReference getWebGenModel_Services();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties
	 * @generated
	 */
	EClass getWebsiteProperties();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTitle <em>Site Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Title</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTitle()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EAttribute getWebsiteProperties_SiteTitle();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getWebmasterEmail <em>Webmaster Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webmaster Email</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getWebmasterEmail()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EAttribute getWebsiteProperties_WebmasterEmail();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCopyrightText <em>Copyright Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright Text</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCopyrightText()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EAttribute getWebsiteProperties_CopyrightText();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getMetaDescription <em>Meta Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Description</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getMetaDescription()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EAttribute getWebsiteProperties_MetaDescription();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getLogoImage <em>Logo Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo Image</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getLogoImage()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EAttribute getWebsiteProperties_LogoImage();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getLogoFilters <em>Logo Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logo Filters</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getLogoFilters()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EReference getWebsiteProperties_LogoFilters();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getFrameworkTechnology <em>Framework Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getFrameworkTechnology()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EAttribute getWebsiteProperties_FrameworkTechnology();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTextEditorURL <em>Text Editor URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Editor URL</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTextEditorURL()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EAttribute getWebsiteProperties_TextEditorURL();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTopNavigationId <em>Top Navigation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Navigation Id</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTopNavigationId()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EAttribute getWebsiteProperties_TopNavigationId();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTemplate <em>Site Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Template</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTemplate()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EAttribute getWebsiteProperties_SiteTemplate();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isStaticUnitsEditable <em>Static Units Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Units Editable</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isStaticUnitsEditable()
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	EAttribute getWebsiteProperties_StaticUnitsEditable();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies <em>Framework Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Framework Technologies</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies
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
	WebsiteFactory getWebsiteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl <em>Web Gen Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.website.impl.WebGenModelImpl
		 * @see uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePackageImpl#getWebGenModel()
		 * @generated
		 */
		EClass WEB_GEN_MODEL = eINSTANCE.getWebGenModel();

		/**
		 * The meta object literal for the '<em><b>Website Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_GEN_MODEL__WEBSITE_PROPERTIES = eINSTANCE.getWebGenModel_WebsiteProperties();

		/**
		 * The meta object literal for the '<em><b>Framework Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_GEN_MODEL__FRAMEWORK_TECHNOLOGY = eINSTANCE.getWebGenModel_FrameworkTechnology();

		/**
		 * The meta object literal for the '<em><b>Copyright Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_GEN_MODEL__COPYRIGHT_TEXT = eINSTANCE.getWebGenModel_CopyrightText();

		/**
		 * The meta object literal for the '<em><b>Web UI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_GEN_MODEL__WEB_UI = eINSTANCE.getWebGenModel_WebUI();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_GEN_MODEL__API = eINSTANCE.getWebGenModel_Api();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_GEN_MODEL__IMAGES = eINSTANCE.getWebGenModel_Images();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_GEN_MODEL__SECURITY = eINSTANCE.getWebGenModel_Security();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_GEN_MODEL__PERSISTENCE = eINSTANCE.getWebGenModel_Persistence();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_GEN_MODEL__SERVICES = eINSTANCE.getWebGenModel_Services();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePropertiesImpl
		 * @see uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePackageImpl#getWebsiteProperties()
		 * @generated
		 */
		EClass WEBSITE_PROPERTIES = eINSTANCE.getWebsiteProperties();

		/**
		 * The meta object literal for the '<em><b>Site Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_PROPERTIES__SITE_TITLE = eINSTANCE.getWebsiteProperties_SiteTitle();

		/**
		 * The meta object literal for the '<em><b>Webmaster Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_PROPERTIES__WEBMASTER_EMAIL = eINSTANCE.getWebsiteProperties_WebmasterEmail();

		/**
		 * The meta object literal for the '<em><b>Copyright Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_PROPERTIES__COPYRIGHT_TEXT = eINSTANCE.getWebsiteProperties_CopyrightText();

		/**
		 * The meta object literal for the '<em><b>Meta Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_PROPERTIES__META_DESCRIPTION = eINSTANCE.getWebsiteProperties_MetaDescription();

		/**
		 * The meta object literal for the '<em><b>Logo Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_PROPERTIES__LOGO_IMAGE = eINSTANCE.getWebsiteProperties_LogoImage();

		/**
		 * The meta object literal for the '<em><b>Logo Filters</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE_PROPERTIES__LOGO_FILTERS = eINSTANCE.getWebsiteProperties_LogoFilters();

		/**
		 * The meta object literal for the '<em><b>Framework Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY = eINSTANCE.getWebsiteProperties_FrameworkTechnology();

		/**
		 * The meta object literal for the '<em><b>Text Editor URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_PROPERTIES__TEXT_EDITOR_URL = eINSTANCE.getWebsiteProperties_TextEditorURL();

		/**
		 * The meta object literal for the '<em><b>Top Navigation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_PROPERTIES__TOP_NAVIGATION_ID = eINSTANCE.getWebsiteProperties_TopNavigationId();

		/**
		 * The meta object literal for the '<em><b>Site Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_PROPERTIES__SITE_TEMPLATE = eINSTANCE.getWebsiteProperties_SiteTemplate();

		/**
		 * The meta object literal for the '<em><b>Static Units Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE = eINSTANCE.getWebsiteProperties_StaticUnitsEditable();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies <em>Framework Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies
		 * @see uk.ac.man.cs.mdsd.webgen.website.impl.WebsitePackageImpl#getFrameworkTechnologies()
		 * @generated
		 */
		EEnum FRAMEWORK_TECHNOLOGIES = eINSTANCE.getFrameworkTechnologies();

	}

} //WebsitePackage

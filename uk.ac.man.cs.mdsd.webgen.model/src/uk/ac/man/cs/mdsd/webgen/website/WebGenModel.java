/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebGenModel.java,v 1.12 2013/12/28 23:36:23 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import uk.ac.man.cs.mdsd.webgen.base.Classifier;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Gen Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getWebsiteProperties <em>Website Properties</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getAllowTypeCustomisation <em>Allow Type Customisation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getImageManipulations <em>Image Manipulations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getGlobalMenu <em>Global Menu</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='classifierNameUnique pageNameUnique menuNameUnique '"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL classifierNameUnique='classifiers->isUnique(name)' pageNameUnique='pages->isUnique(name)' menuNameUnique='menus->isUnique(name)'"
 * @generated
 */
public interface WebGenModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Website Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Website Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website Properties</em>' containment reference.
	 * @see #setWebsiteProperties(WebsiteProperties)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_WebsiteProperties()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	WebsiteProperties getWebsiteProperties();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getWebsiteProperties <em>Website Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website Properties</em>' containment reference.
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	void setWebsiteProperties(WebsiteProperties value);

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.base.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_Classifiers()
	 * @model containment="true"
	 * @generated
	 */
	List<Classifier> getClassifiers();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_Services()
	 * @model containment="true"
	 * @generated
	 */
	List<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Page}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Page#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_Pages()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Page#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	List<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_Menus()
	 * @model containment="true"
	 * @generated
	 */
	List<Menu> getMenus();

	/**
	 * Returns the value of the '<em><b>Allow Type Customisation</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Type Customisation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Type Customisation</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_AllowTypeCustomisation()
	 * @model
	 * @generated
	 */
	List<EntityOrView> getAllowTypeCustomisation();

	/**
	 * Returns the value of the '<em><b>Image Manipulations</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.ImageManipulation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Manipulations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Manipulations</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_ImageManipulations()
	 * @model containment="true"
	 * @generated
	 */
	List<ImageManipulation> getImageManipulations();

	/**
	 * Returns the value of the '<em><b>Global Menu</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.GlobalMenu#getMenuFor <em>Menu For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Menu</em>' reference.
	 * @see #setGlobalMenu(GlobalMenu)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_GlobalMenu()
	 * @see uk.ac.man.cs.mdsd.webgen.website.GlobalMenu#getMenuFor
	 * @model opposite="menuFor"
	 * @generated
	 */
	GlobalMenu getGlobalMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getGlobalMenu <em>Global Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Menu</em>' reference.
	 * @see #getGlobalMenu()
	 * @generated
	 */
	void setGlobalMenu(GlobalMenu value);

} // WebGenModel

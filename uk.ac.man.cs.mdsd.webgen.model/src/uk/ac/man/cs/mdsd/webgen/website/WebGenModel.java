/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebGenModel.java,v 1.12 2013/12/28 23:36:23 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import uk.ac.man.cs.mdsd.webgen.image.Image;
import uk.ac.man.cs.mdsd.webgen.image.ImageManipulation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Persistence;
import uk.ac.man.cs.mdsd.webgen.security.Security;
import uk.ac.man.cs.mdsd.webgen.service.Services;
import uk.ac.man.cs.mdsd.webgen.webui.Menu;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;

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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getServicesX <em>Services X</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getWebUI <em>Web UI</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getImages <em>Images</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getSecurity <em>Security</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getAllowTypeCustomisation <em>Allow Type Customisation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getImageManipulations <em>Image Manipulations</em>}</li>
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
	 * Returns the value of the '<em><b>Services X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services X</em>' containment reference.
	 * @see #setServicesX(Services)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_ServicesX()
	 * @model containment="true"
	 * @generated
	 */
	Services getServicesX();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getServicesX <em>Services X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services X</em>' containment reference.
	 * @see #getServicesX()
	 * @generated
	 */
	void setServicesX(Services value);

	/**
	 * Returns the value of the '<em><b>Web UI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web UI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web UI</em>' containment reference.
	 * @see #setWebUI(WebUI)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_WebUI()
	 * @model containment="true"
	 * @generated
	 */
	WebUI getWebUI();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getWebUI <em>Web UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web UI</em>' containment reference.
	 * @see #getWebUI()
	 * @generated
	 */
	void setWebUI(WebUI value);

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.webui.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_Menus()
	 * @model
	 * @generated
	 */
	List<Menu> getMenus();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference.
	 * @see #setImages(Image)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_Images()
	 * @model containment="true"
	 * @generated
	 */
	Image getImages();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getImages <em>Images</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Images</em>' containment reference.
	 * @see #getImages()
	 * @generated
	 */
	void setImages(Image value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(Security)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_Security()
	 * @model containment="true"
	 * @generated
	 */
	Security getSecurity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Security value);

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
	 * Returns the value of the '<em><b>Image Manipulations</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.image.ImageManipulation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Manipulations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Manipulations</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_ImageManipulations()
	 * @model
	 * @generated
	 */
	List<ImageManipulation> getImageManipulations();

	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' containment reference.
	 * @see #setPersistence(Persistence)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebGenModel_Persistence()
	 * @model containment="true"
	 * @generated
	 */
	Persistence getPersistence();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel#getPersistence <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' containment reference.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(Persistence value);

} // WebGenModel

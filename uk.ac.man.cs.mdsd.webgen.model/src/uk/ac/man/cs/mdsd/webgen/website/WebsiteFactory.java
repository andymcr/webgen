/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsiteFactory.java,v 1.46 2014/08/22 14:32:53 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage
 * @generated
 */
public interface WebsiteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebsiteFactory eINSTANCE = uk.ac.man.cs.mdsd.webgen.website.impl.WebsiteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Gen Model</em>'.
	 * @generated
	 */
	WebGenModel createWebGenModel();

	/**
	 * Returns a new object of class '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties</em>'.
	 * @generated
	 */
	WebsiteProperties createWebsiteProperties();

	/**
	 * Returns a new object of class '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Reference</em>'.
	 * @generated
	 */
	ModelReference createModelReference();

	/**
	 * Returns a new object of class '<em>Route Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Parameter Reference</em>'.
	 * @generated
	 */
	RouteParameterReference createRouteParameterReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebsitePackage getWebsitePackage();

} //WebsiteFactory

/**
 */
package uk.ac.man.cs.mdsd.webgen.service;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage
 * @generated
 */
public interface WebGenServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebGenServiceFactory eINSTANCE = uk.ac.man.cs.mdsd.webgen.service.impl.WebGenServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Services</em>'.
	 * @generated
	 */
	Services createServices();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection</em>'.
	 * @generated
	 */
	Selection createSelection();

	/**
	 * Returns a new object of class '<em>Selection Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Parameter</em>'.
	 * @generated
	 */
	SelectionParameter createSelectionParameter();

	/**
	 * Returns a new object of class '<em>Business Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Operation</em>'.
	 * @generated
	 */
	BusinessOperation createBusinessOperation();

	/**
	 * Returns a new object of class '<em>Asc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asc</em>'.
	 * @generated
	 */
	Asc createAsc();

	/**
	 * Returns a new object of class '<em>Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desc</em>'.
	 * @generated
	 */
	Desc createDesc();

	/**
	 * Returns a new object of class '<em>Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Reference</em>'.
	 * @generated
	 */
	FeatureReference createFeatureReference();

	/**
	 * Returns a new object of class '<em>Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Reference</em>'.
	 * @generated
	 */
	ParameterReference createParameterReference();

	/**
	 * Returns a new object of class '<em>Current User Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current User Reference</em>'.
	 * @generated
	 */
	CurrentUserReference createCurrentUserReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebGenServicePackage getWebGenServicePackage();

} //WebGenServiceFactory

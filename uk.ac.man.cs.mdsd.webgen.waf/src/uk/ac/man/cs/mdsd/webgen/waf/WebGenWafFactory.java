/**
 */
package uk.ac.man.cs.mdsd.webgen.waf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.waf.WebGenWafPackage
 * @generated
 */
public interface WebGenWafFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebGenWafFactory eINSTANCE = uk.ac.man.cs.mdsd.webgen.waf.impl.WebGenWafFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web Application Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Application Framework</em>'.
	 * @generated
	 */
	WebApplicationFramework createWebApplicationFramework();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebGenWafPackage getWebGenWafPackage();

} //WebGenWafFactory

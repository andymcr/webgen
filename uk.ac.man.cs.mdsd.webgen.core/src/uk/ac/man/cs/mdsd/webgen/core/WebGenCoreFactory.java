/**
 */
package uk.ac.man.cs.mdsd.webgen.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.core.WebGenCorePackage
 * @generated
 */
public interface WebGenCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebGenCoreFactory eINSTANCE = uk.ac.man.cs.mdsd.webgen.core.impl.WebGenCoreFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebGenCorePackage getWebGenCorePackage();

} //WebGenCoreFactory

/**
 */
package uk.ac.man.cs.mdsd.webgen.security.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.man.cs.mdsd.webgen.security.Authorisation;
import uk.ac.man.cs.mdsd.webgen.security.WebGenSecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AuthorisationImpl extends MinimalEObjectImpl.Container implements Authorisation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebGenSecurityPackage.Literals.AUTHORISATION;
	}

} //AuthorisationImpl

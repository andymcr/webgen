/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import uk.ac.man.cs.mdsd.webgen.website.CurrentUserReference;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current User Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CurrentUserReferenceImpl#getUserModel <em>User Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentUserReferenceImpl extends EObjectImpl implements CurrentUserReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentUserReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.CURRENT_USER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getUserModel() {
		EntityOrView userModel = basicGetUserModel();
		return userModel != null && userModel.eIsProxy() ? (EntityOrView)eResolveProxy((InternalEObject)userModel) : userModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EntityOrView basicGetUserModel() {
		// TODO: implement this method to return the 'User Model' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		final WebGenModel model = getModel(this);
		if (model.getWebsiteProperties().getAuthentication() != null) {
			return model.getWebsiteProperties().getAuthentication().getUser();
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserModel() {
		// TODO: implement this method to return whether the 'User Model' reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/*
	 * @generated NOT
	 */
	private WebGenModel getModel(final EObject eObject) {
		if (eObject instanceof WebGenModel) {
			return (WebGenModel) eObject;
		}

		if (eObject.eContainer() != null) {
			return getModel(eObject.eContainer());
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.CURRENT_USER_REFERENCE__USER_MODEL:
				if (resolve) return getUserModel();
				return basicGetUserModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebsitePackage.CURRENT_USER_REFERENCE__USER_MODEL:
				return isSetUserModel();
		}
		return super.eIsSet(featureID);
	}

} //CurrentUserReferenceImpl

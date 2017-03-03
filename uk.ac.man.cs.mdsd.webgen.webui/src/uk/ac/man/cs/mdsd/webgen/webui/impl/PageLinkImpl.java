/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.man.cs.mdsd.webgen.webui.Page;
import uk.ac.man.cs.mdsd.webgen.webui.PageLink;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.PageLinkImpl#getTargetPage <em>Target Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageLinkImpl extends MinimalEObjectImpl.Container implements PageLink {
	/**
	 * The cached value of the '{@link #getTargetPage() <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPage()
	 * @generated
	 * @ordered
	 */
	protected Page targetPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.PAGE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getTargetPage() {
		if (targetPage != null && targetPage.eIsProxy()) {
			InternalEObject oldTargetPage = (InternalEObject)targetPage;
			targetPage = (Page)eResolveProxy(oldTargetPage);
			if (targetPage != oldTargetPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.PAGE_LINK__TARGET_PAGE, oldTargetPage, targetPage));
			}
		}
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetTargetPage() {
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPage(Page newTargetPage, NotificationChain msgs) {
		Page oldTargetPage = targetPage;
		targetPage = newTargetPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.PAGE_LINK__TARGET_PAGE, oldTargetPage, newTargetPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPage(Page newTargetPage) {
		if (newTargetPage != targetPage) {
			NotificationChain msgs = null;
			if (targetPage != null)
				msgs = ((InternalEObject)targetPage).eInverseRemove(this, WebuiPackage.PAGE__CHILD_PAGES, Page.class, msgs);
			if (newTargetPage != null)
				msgs = ((InternalEObject)newTargetPage).eInverseAdd(this, WebuiPackage.PAGE__CHILD_PAGES, Page.class, msgs);
			msgs = basicSetTargetPage(newTargetPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.PAGE_LINK__TARGET_PAGE, newTargetPage, newTargetPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.PAGE_LINK__TARGET_PAGE:
				if (targetPage != null)
					msgs = ((InternalEObject)targetPage).eInverseRemove(this, WebuiPackage.PAGE__CHILD_PAGES, Page.class, msgs);
				return basicSetTargetPage((Page)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.PAGE_LINK__TARGET_PAGE:
				return basicSetTargetPage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.PAGE_LINK__TARGET_PAGE:
				if (resolve) return getTargetPage();
				return basicGetTargetPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebuiPackage.PAGE_LINK__TARGET_PAGE:
				setTargetPage((Page)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebuiPackage.PAGE_LINK__TARGET_PAGE:
				setTargetPage((Page)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebuiPackage.PAGE_LINK__TARGET_PAGE:
				return targetPage != null;
		}
		return super.eIsSet(featureID);
	}

} //PageLinkImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeImpl.java,v 1.4 2011/03/31 18:12:19 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.man.cs.mdsd.orm.Attribute;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AttributeImpl extends FeatureImpl implements Attribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.ATTRIBUTE;
	}

} //AttributeImpl

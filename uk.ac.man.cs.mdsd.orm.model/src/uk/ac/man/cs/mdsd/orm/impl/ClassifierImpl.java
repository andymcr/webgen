/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassifierImpl.java,v 1.3 2013/05/07 13:42:52 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.man.cs.mdsd.orm.Classifier;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamedDisplayElementImpl implements Classifier {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ClassifierImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.Literals.CLASSIFIER;
  }

} //ClassifierImpl

/**
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.man.cs.mdsd.orm.CollectionAttribute;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class CollectionAttributeImpl extends AttributeImpl implements CollectionAttribute {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CollectionAttributeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.Literals.COLLECTION_ATTRIBUTE;
  }

} //CollectionAttributeImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmFactory.java,v 1.10 2014/06/27 07:51:35 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage
 * @generated
 */
public interface OrmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrmFactory eINSTANCE = uk.ac.man.cs.mdsd.orm.impl.OrmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	OrmModel createOrmModel();

	/**
	 * Returns a new object of class '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type</em>'.
	 * @generated
	 */
	CollectionType createCollectionType();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Type</em>'.
	 * @generated
	 */
	EnumerationType createEnumerationType();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	EnumerationLiteral createEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Singleton Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singleton Element</em>'.
	 * @generated
	 */
	SingletonElement createSingletonElement();

	/**
	 * Returns a new object of class '<em>Collection Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Element</em>'.
	 * @generated
	 */
	CollectionElement createCollectionElement();

	/**
	 * Returns a new object of class '<em>Singleton Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singleton Date</em>'.
	 * @generated
	 */
	SingletonDate createSingletonDate();

	/**
	 * Returns a new object of class '<em>Collection Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Date</em>'.
	 * @generated
	 */
	CollectionDate createCollectionDate();

	/**
	 * Returns a new object of class '<em>Singleton File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singleton File</em>'.
	 * @generated
	 */
	SingletonFile createSingletonFile();

	/**
	 * Returns a new object of class '<em>Singleton Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singleton Image</em>'.
	 * @generated
	 */
	SingletonImage createSingletonImage();

	/**
	 * Returns a new object of class '<em>Singleton Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singleton Location</em>'.
	 * @generated
	 */
	SingletonLocation createSingletonLocation();

	/**
	 * Returns a new object of class '<em>Singleton Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singleton Association</em>'.
	 * @generated
	 */
	SingletonAssociation createSingletonAssociation();

	/**
	 * Returns a new object of class '<em>Collection Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Association</em>'.
	 * @generated
	 */
	CollectionAssociation createCollectionAssociation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OrmPackage getOrmPackage();

} //OrmFactory

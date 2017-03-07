/**
 */
package uk.ac.man.cs.mdsd.webgen.image;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage
 * @generated
 */
public interface ImageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImageFactory eINSTANCE = uk.ac.man.cs.mdsd.webgen.image.impl.ImageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Manipulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manipulation</em>'.
	 * @generated
	 */
	ImageManipulation createImageManipulation();

	/**
	 * Returns a new object of class '<em>Thumbnail Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thumbnail Filter</em>'.
	 * @generated
	 */
	ThumbnailFilter createThumbnailFilter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImagePackage getImagePackage();

} //ImageFactory

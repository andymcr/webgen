/**
 */
package uk.ac.man.cs.mdsd.webgen.image;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.image.ImageFactory
 * @model kind="package"
 * @generated
 */
public interface ImagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "image";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.man.ac.uk/mdsd/webgen/image";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen-image";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImagePackage eINSTANCE = uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.image.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImageImpl
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Manipulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MANIPULATIONS = 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.image.impl.ImageManipulationImpl <em>Manipulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImageManipulationImpl
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getImageManipulation()
	 * @generated
	 */
	int IMAGE_MANIPULATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANIPULATION__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jpeg Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANIPULATION__JPEG_QUALITY = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANIPULATION__FILTERS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manipulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANIPULATION_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Manipulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANIPULATION_OPERATION_COUNT = BasePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.image.impl.ImageFilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImageFilterImpl
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getImageFilter()
	 * @generated
	 */
	int IMAGE_FILTER = 3;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FILTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.image.impl.BackgroundFilterImpl <em>Background Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.BackgroundFilterImpl
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getBackgroundFilter()
	 * @generated
	 */
	int BACKGROUND_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FILTER__COLOR = IMAGE_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FILTER__WIDTH = IMAGE_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FILTER__HEIGHT = IMAGE_FILTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FILTER__POSITION = IMAGE_FILTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Background Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FILTER_FEATURE_COUNT = IMAGE_FILTER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Background Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FILTER_OPERATION_COUNT = IMAGE_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.image.impl.ThumbnailFilterImpl <em>Thumbnail Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ThumbnailFilterImpl
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getThumbnailFilter()
	 * @generated
	 */
	int THUMBNAIL_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FILTER__WIDTH = IMAGE_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FILTER__HEIGHT = IMAGE_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FILTER__MODE = IMAGE_FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Thumbnail Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FILTER_FEATURE_COUNT = IMAGE_FILTER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Thumbnail Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FILTER_OPERATION_COUNT = IMAGE_FILTER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundPositions <em>Background Positions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.image.BackgroundPositions
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getBackgroundPositions()
	 * @generated
	 */
	int BACKGROUND_POSITIONS = 5;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailModes <em>Thumbnail Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.image.ThumbnailModes
	 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getThumbnailModes()
	 * @generated
	 */
	int THUMBNAIL_MODES = 6;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.image.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.image.Image#getManipulations <em>Manipulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manipulations</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.Image#getManipulations()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Manipulations();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.image.ImageManipulation <em>Manipulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manipulation</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImageManipulation
	 * @generated
	 */
	EClass getImageManipulation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.image.ImageManipulation#getJpegQuality <em>Jpeg Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jpeg Quality</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImageManipulation#getJpegQuality()
	 * @see #getImageManipulation()
	 * @generated
	 */
	EAttribute getImageManipulation_JpegQuality();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.image.ImageManipulation#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImageManipulation#getFilters()
	 * @see #getImageManipulation()
	 * @generated
	 */
	EReference getImageManipulation_Filters();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter <em>Background Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter
	 * @generated
	 */
	EClass getBackgroundFilter();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getColor()
	 * @see #getBackgroundFilter()
	 * @generated
	 */
	EAttribute getBackgroundFilter_Color();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getWidth()
	 * @see #getBackgroundFilter()
	 * @generated
	 */
	EAttribute getBackgroundFilter_Width();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getHeight()
	 * @see #getBackgroundFilter()
	 * @generated
	 */
	EAttribute getBackgroundFilter_Height();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getPosition()
	 * @see #getBackgroundFilter()
	 * @generated
	 */
	EAttribute getBackgroundFilter_Position();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.image.ImageFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImageFilter
	 * @generated
	 */
	EClass getImageFilter();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter <em>Thumbnail Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thumbnail Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter
	 * @generated
	 */
	EClass getThumbnailFilter();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getWidth()
	 * @see #getThumbnailFilter()
	 * @generated
	 */
	EAttribute getThumbnailFilter_Width();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getHeight()
	 * @see #getThumbnailFilter()
	 * @generated
	 */
	EAttribute getThumbnailFilter_Height();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getMode()
	 * @see #getThumbnailFilter()
	 * @generated
	 */
	EAttribute getThumbnailFilter_Mode();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundPositions <em>Background Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Background Positions</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.BackgroundPositions
	 * @generated
	 */
	EEnum getBackgroundPositions();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailModes <em>Thumbnail Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thumbnail Modes</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ThumbnailModes
	 * @generated
	 */
	EEnum getThumbnailModes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImageFactory getImageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.image.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImageImpl
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Manipulations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__MANIPULATIONS = eINSTANCE.getImage_Manipulations();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.image.impl.ImageManipulationImpl <em>Manipulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImageManipulationImpl
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getImageManipulation()
		 * @generated
		 */
		EClass IMAGE_MANIPULATION = eINSTANCE.getImageManipulation();

		/**
		 * The meta object literal for the '<em><b>Jpeg Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MANIPULATION__JPEG_QUALITY = eINSTANCE.getImageManipulation_JpegQuality();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_MANIPULATION__FILTERS = eINSTANCE.getImageManipulation_Filters();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.image.impl.BackgroundFilterImpl <em>Background Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.BackgroundFilterImpl
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getBackgroundFilter()
		 * @generated
		 */
		EClass BACKGROUND_FILTER = eINSTANCE.getBackgroundFilter();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND_FILTER__COLOR = eINSTANCE.getBackgroundFilter_Color();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND_FILTER__WIDTH = eINSTANCE.getBackgroundFilter_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND_FILTER__HEIGHT = eINSTANCE.getBackgroundFilter_Height();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND_FILTER__POSITION = eINSTANCE.getBackgroundFilter_Position();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.image.impl.ImageFilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImageFilterImpl
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getImageFilter()
		 * @generated
		 */
		EClass IMAGE_FILTER = eINSTANCE.getImageFilter();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.image.impl.ThumbnailFilterImpl <em>Thumbnail Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ThumbnailFilterImpl
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getThumbnailFilter()
		 * @generated
		 */
		EClass THUMBNAIL_FILTER = eINSTANCE.getThumbnailFilter();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THUMBNAIL_FILTER__WIDTH = eINSTANCE.getThumbnailFilter_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THUMBNAIL_FILTER__HEIGHT = eINSTANCE.getThumbnailFilter_Height();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THUMBNAIL_FILTER__MODE = eINSTANCE.getThumbnailFilter_Mode();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundPositions <em>Background Positions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.image.BackgroundPositions
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getBackgroundPositions()
		 * @generated
		 */
		EEnum BACKGROUND_POSITIONS = eINSTANCE.getBackgroundPositions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailModes <em>Thumbnail Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.image.ThumbnailModes
		 * @see uk.ac.man.cs.mdsd.webgen.image.impl.ImagePackageImpl#getThumbnailModes()
		 * @generated
		 */
		EEnum THUMBNAIL_MODES = eINSTANCE.getThumbnailModes();

	}

} //ImagePackage

/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

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
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface WebuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.man.ac.uk/mdsd/webgen/webui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen-webui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebuiPackage eINSTANCE = uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl <em>Web UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getWebUI()
	 * @generated
	 */
	int WEB_UI = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Global Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__GLOBAL_MENU = 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__PAGES = 2;

	/**
	 * The number of structural features of the '<em>Web UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Web UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.MenuImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ENTRIES = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__OMIT_CAPTION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CAPTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__STYLE_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__LAYOUT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.MenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getMenuEntry()
	 * @generated
	 */
	int MENU_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__PART_OF = 0;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__REQUIRES_ROLE = 1;

	/**
	 * The number of structural features of the '<em>Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.GlobalMenuImpl <em>Global Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.GlobalMenuImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getGlobalMenu()
	 * @generated
	 */
	int GLOBAL_MENU = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__NAME = MENU__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__DISPLAY_LABEL = MENU__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__ENTRIES = MENU__ENTRIES;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__OMIT_CAPTION = MENU__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__CAPTION_CLASS = MENU__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__STYLE_CLASS = MENU__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__LAYOUT_CLASS = MENU__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Web UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU__WEB_UI = MENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Global Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MENU_OPERATION_COUNT = MENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.StaticMenuImpl <em>Static Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.StaticMenuImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getStaticMenu()
	 * @generated
	 */
	int STATIC_MENU = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__NAME = MENU__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__DISPLAY_LABEL = MENU__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__ENTRIES = MENU__ENTRIES;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__OMIT_CAPTION = MENU__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__CAPTION_CLASS = MENU__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__STYLE_CLASS = MENU__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__LAYOUT_CLASS = MENU__LAYOUT_CLASS;

	/**
	 * The number of structural features of the '<em>Static Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Static Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU_OPERATION_COUNT = MENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ActionMenuEntryImpl <em>Action Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ActionMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getActionMenuEntry()
	 * @generated
	 */
	int ACTION_MENU_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__REQUIRES_ROLE = MENU_ENTRY__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__NAME = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__DESTINATION = MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__QUERY = MENU_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY_OPERATION_COUNT = MENU_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditStaticTextMenuEntryImpl <em>Edit Static Text Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.EditStaticTextMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getEditStaticTextMenuEntry()
	 * @generated
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__REQUIRES_ROLE = MENU_ENTRY__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__NAME = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edit Static Text Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edit Static Text Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY_OPERATION_COUNT = MENU_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ContextMenuImpl <em>Context Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ContextMenuImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getContextMenu()
	 * @generated
	 */
	int CONTEXT_MENU = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__NAME = MENU__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__DISPLAY_LABEL = MENU__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__ENTRIES = MENU__ENTRIES;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__OMIT_CAPTION = MENU__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__CAPTION_CLASS = MENU__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__STYLE_CLASS = MENU__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__LAYOUT_CLASS = MENU__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__CONTEXT = MENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Context Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU_OPERATION_COUNT = MENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DynamicMenuImpl <em>Dynamic Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DynamicMenuImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDynamicMenu()
	 * @generated
	 */
	int DYNAMIC_MENU = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__NAME = GLOBAL_MENU__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__DISPLAY_LABEL = GLOBAL_MENU__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__ENTRIES = GLOBAL_MENU__ENTRIES;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__OMIT_CAPTION = GLOBAL_MENU__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__CAPTION_CLASS = GLOBAL_MENU__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__STYLE_CLASS = GLOBAL_MENU__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__LAYOUT_CLASS = GLOBAL_MENU__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Web UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__WEB_UI = GLOBAL_MENU__WEB_UI;

	/**
	 * The feature id for the '<em><b>Entity Or View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__ENTITY_OR_VIEW = GLOBAL_MENU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__SELECTION = GLOBAL_MENU_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__TITLE = GLOBAL_MENU_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamic Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU_FEATURE_COUNT = GLOBAL_MENU_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dynamic Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU_OPERATION_COUNT = GLOBAL_MENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MenuFeatureImpl <em>Menu Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.MenuFeatureImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getMenuFeature()
	 * @generated
	 */
	int MENU_FEATURE = 9;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE__REQUIRES_ROLE = MENU_ENTRY__REQUIRES_ROLE;

	/**
	 * The number of structural features of the '<em>Menu Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Menu Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_OPERATION_COUNT = MENU_ENTRY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.QueryImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 10;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.QueryParameterImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getQueryParameter()
	 * @generated
	 */
	int QUERY_PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__FORMAL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.PageImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UNITS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Web UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__WEB_UI = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PARENT_PAGE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CHILD_PAGES = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__AUTHENTICATED = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__URI_ELEMENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Top Menu Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOP_MENU_OPTION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Top Menu Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOP_MENU_RANK = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Navigation Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAVIGATION_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SIDE_MENU = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__STYLE_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.PageLinkImpl <em>Page Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.PageLinkImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getPageLink()
	 * @generated
	 */
	int PAGE_LINK = 13;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK__TARGET_PAGE = 0;

	/**
	 * The number of structural features of the '<em>Page Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Page Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FilterImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Filter For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER_FOR = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__PARAMETERS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__SELECTION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FilterParameterImpl <em>Filter Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FilterParameterImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFilterParameter()
	 * @generated
	 */
	int FILTER_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAMETER__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAMETER__PART_OF = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAMETER__FORMAL = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAMETER__DATA_TYPE = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAMETER__DEFAULT_VALUE = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAMETER__PLACEHOLDER = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Filter Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAMETER_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Filter Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAMETER_OPERATION_COUNT = BasePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitContainer <em>Unit Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitContainer
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitContainer()
	 * @generated
	 */
	int UNIT_CONTAINER = 16;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONTAINER__UNITS = 0;

	/**
	 * The number of structural features of the '<em>Unit Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unit Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ContentUnitImpl <em>Content Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ContentUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getContentUnit()
	 * @generated
	 */
	int CONTENT_UNIT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__DISPLAYED_ON = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__REQUIRES_ROLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__PURPOSE_SUMMARY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__URI_ELEMENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__ALTERNATIVE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__OMIT_CAPTION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__CAPTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__PAGE_DISPLAYED_ON = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.StaticUnitImpl <em>Static Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.StaticUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getStaticUnit()
	 * @generated
	 */
	int STATIC_UNIT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__REQUIRES_ROLE = CONTENT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__URI_ELEMENT = CONTENT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__ALTERNATIVE = CONTENT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__PAGE_DISPLAYED_ON = CONTENT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CONTENT = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__STYLE_CLASS = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CONTENT_CLASS = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Static Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Static Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_OPERATION_COUNT = CONTENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateSitemapUnitImpl <em>Create Sitemap Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.CreateSitemapUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCreateSitemapUnit()
	 * @generated
	 */
	int CREATE_SITEMAP_UNIT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__REQUIRES_ROLE = CONTENT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__URI_ELEMENT = CONTENT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__ALTERNATIVE = CONTENT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__PAGE_DISPLAYED_ON = CONTENT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Deployed URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__DEPLOYED_URL = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__FILENAME = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__STYLE_CLASS = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__CONTENT_CLASS = CONTENT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create Sitemap Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Create Sitemap Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT_OPERATION_COUNT = CONTENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DynamicUnitImpl <em>Dynamic Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DynamicUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDynamicUnit()
	 * @generated
	 */
	int DYNAMIC_UNIT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__REQUIRES_ROLE = CONTENT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__URI_ELEMENT = CONTENT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ALTERNATIVE = CONTENT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__PAGE_DISPLAYED_ON = CONTENT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ENTITIES = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAY_FIELDS = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__SUPPORT_ACTIONS = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HEADER = CONTENT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__FOOTER = CONTENT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HEADER_CLASS = CONTENT_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CONTROL_CLASS = CONTENT_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__FOOTER_CLASS = CONTENT_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ERROR_CLASS = CONTENT_UNIT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Dynamic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Dynamic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_OPERATION_COUNT = CONTENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UnitFieldImpl <em>Unit Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UnitFieldImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitField()
	 * @generated
	 */
	int UNIT_FIELD = 21;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DISPLAYED_ON = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__COLLECTION_DISPLAY_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__COLLECTION_ALLOW_ADD = 3;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__COLLECTION_ALLOW_REMOVE = 4;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__MAXIMUM_DISPLAY_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DATE_FORMAT = 6;

	/**
	 * The number of structural features of the '<em>Unit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Unit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UnitFeatureImpl <em>Unit Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UnitFeatureImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitFeature()
	 * @generated
	 */
	int UNIT_FEATURE = 22;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAYED_ON = UNIT_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__TITLE = UNIT_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_DISPLAY_OPTION = UNIT_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_ALLOW_ADD = UNIT_FIELD__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_ALLOW_REMOVE = UNIT_FIELD__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE = UNIT_FIELD__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DATE_FORMAT = UNIT_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ACTIONS = UNIT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY = UNIT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_LABEL = UNIT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__REQUIRED = UNIT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FORCED_VALUE = UNIT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__NULL_DISPLAY_VALUE = UNIT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FOOTER = UNIT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__AUTOFOCUS = UNIT_FIELD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__HEADER_CLASS = UNIT_FIELD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__INPUT_CLASS = UNIT_FIELD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_CLASS = UNIT_FIELD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FOOTER_CLASS = UNIT_FIELD_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Unit Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_FEATURE_COUNT = UNIT_FIELD_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Unit Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_OPERATION_COUNT = UNIT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UnitElementImpl <em>Unit Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UnitElementImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitElement()
	 * @generated
	 */
	int UNIT_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAYED_ON = UNIT_FEATURE__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__TITLE = UNIT_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__COLLECTION_DISPLAY_OPTION = UNIT_FEATURE__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__COLLECTION_ALLOW_ADD = UNIT_FEATURE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__COLLECTION_ALLOW_REMOVE = UNIT_FEATURE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__MAXIMUM_DISPLAY_SIZE = UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DATE_FORMAT = UNIT_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__ACTIONS = UNIT_FEATURE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__ONLY_DISPLAY_WHEN_NOT_EMPTY = UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAY_LABEL = UNIT_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__REQUIRED = UNIT_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FORCED_VALUE = UNIT_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__NULL_DISPLAY_VALUE = UNIT_FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FOOTER = UNIT_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__AUTOFOCUS = UNIT_FEATURE__AUTOFOCUS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__HEADER_CLASS = UNIT_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__INPUT_CLASS = UNIT_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAY_CLASS = UNIT_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FOOTER_CLASS = UNIT_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__ATTRIBUTE = UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__NAME = UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DEFAULT_VALUE = UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS = UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__PLACEHOLDER = UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__VALIDATION_PATTERN = UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT_FEATURE_COUNT = UNIT_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT_OPERATION_COUNT = UNIT_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UnitAssociationImpl <em>Unit Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UnitAssociationImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitAssociation()
	 * @generated
	 */
	int UNIT_ASSOCIATION = 24;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAYED_ON = UNIT_FEATURE__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__TITLE = UNIT_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION = UNIT_FEATURE__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_ALLOW_ADD = UNIT_FEATURE__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_ALLOW_REMOVE = UNIT_FEATURE__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE = UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DATE_FORMAT = UNIT_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ACTIONS = UNIT_FEATURE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY = UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAY_LABEL = UNIT_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__REQUIRED = UNIT_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FORCED_VALUE = UNIT_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__NULL_DISPLAY_VALUE = UNIT_FEATURE__NULL_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FOOTER = UNIT_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__AUTOFOCUS = UNIT_FEATURE__AUTOFOCUS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__HEADER_CLASS = UNIT_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__INPUT_CLASS = UNIT_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAY_CLASS = UNIT_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FOOTER_CLASS = UNIT_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__UNITS = UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__NAME = UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ASSOCIATION = UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__VALUE_DISPLAY = UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__CHILD_FEATURE = UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION = UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__SOURCE_ENTITY = UNIT_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__TARGET_ENTITY = UNIT_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__SELECTION = UNIT_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Unit Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION_FEATURE_COUNT = UNIT_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Unit Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION_OPERATION_COUNT = UNIT_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.AssociationReference <em>Association Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AssociationReference
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getAssociationReference()
	 * @generated
	 */
	int ASSOCIATION_REFERENCE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__VALUE_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__CHILD_FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Association Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Association Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.InterfaceFieldImpl <em>Interface Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.InterfaceFieldImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getInterfaceField()
	 * @generated
	 */
	int INTERFACE_FIELD = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISPLAYED_ON = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__TITLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__COLLECTION_ALLOW_ADD = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__COLLECTION_ALLOW_REMOVE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DATE_FORMAT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__REQUIRED = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DEFAULT_VALUE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__MUST_MATCH = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__INPUT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__PLACEHOLDER = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__VALIDATION_PATTERN = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Interface Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Interface Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DataTypeFieldImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDataTypeField()
	 * @generated
	 */
	int DATA_TYPE_FIELD = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__TITLE = INTERFACE_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__COLLECTION_DISPLAY_OPTION = INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__COLLECTION_ALLOW_ADD = INTERFACE_FIELD__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__COLLECTION_ALLOW_REMOVE = INTERFACE_FIELD__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__MAXIMUM_DISPLAY_SIZE = INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__REQUIRED = INTERFACE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__PLACEHOLDER = INTERFACE_FIELD__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__VALIDATION_PATTERN = INTERFACE_FIELD__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DATA_TYPE = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS = INTERFACE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__ENCRYPT = INTERFACE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__INTERFACE_TYPE = INTERFACE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_OPERATION_COUNT = INTERFACE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DateFieldImpl <em>Date Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DateFieldImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDateField()
	 * @generated
	 */
	int DATE_FIELD = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__TITLE = INTERFACE_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__COLLECTION_DISPLAY_OPTION = INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__COLLECTION_ALLOW_ADD = INTERFACE_FIELD__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__COLLECTION_ALLOW_REMOVE = INTERFACE_FIELD__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__MAXIMUM_DISPLAY_SIZE = INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__REQUIRED = INTERFACE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__PLACEHOLDER = INTERFACE_FIELD__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__VALIDATION_PATTERN = INTERFACE_FIELD__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DETAILS = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__FORMAT = INTERFACE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_OPERATION_COUNT = INTERFACE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CaptchaFieldImpl <em>Captcha Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.CaptchaFieldImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCaptchaField()
	 * @generated
	 */
	int CAPTCHA_FIELD = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__TITLE = INTERFACE_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__COLLECTION_DISPLAY_OPTION = INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__COLLECTION_ALLOW_ADD = INTERFACE_FIELD__COLLECTION_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__COLLECTION_ALLOW_REMOVE = INTERFACE_FIELD__COLLECTION_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__MAXIMUM_DISPLAY_SIZE = INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__REQUIRED = INTERFACE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__PLACEHOLDER = INTERFACE_FIELD__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__VALIDATION_PATTERN = INTERFACE_FIELD__VALIDATION_PATTERN;

	/**
	 * The number of structural features of the '<em>Captcha Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Captcha Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD_OPERATION_COUNT = INTERFACE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UnitSupportActionImpl <em>Unit Support Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UnitSupportActionImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitSupportAction()
	 * @generated
	 */
	int UNIT_SUPPORT_ACTION = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__DISABLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit <em>Selectable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getSelectableUnit()
	 * @generated
	 */
	int SELECTABLE_UNIT = 31;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_UNIT__SELECTION_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Selectable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_UNIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Selectable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit <em>Singleton Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getSingletonUnit()
	 * @generated
	 */
	int SINGLETON_UNIT = 32;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CONTENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Singleton Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Singleton Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit <em>Collection Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCollectionUnit()
	 * @generated
	 */
	int COLLECTION_UNIT = 33;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SELECTION_TYPE = SELECTABLE_UNIT__SELECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTENT_TYPE = SELECTABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTAINING_FEATURE = SELECTABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SELECTION = SELECTABLE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FILTERS = SELECTABLE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__EMPTY_MESSAGE = SELECTABLE_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pagination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION = SELECTABLE_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE = SELECTABLE_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_NPAGES = SELECTABLE_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_NPAGES = SELECTABLE_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_PAGE_LABEL = SELECTABLE_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_PAGE_LABEL = SELECTABLE_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS = SELECTABLE_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = SELECTABLE_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIRST_PAGE_LABEL = SELECTABLE_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LAST_PAGE_LABEL = SELECTABLE_UNIT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Collection Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_FEATURE_COUNT = SELECTABLE_UNIT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Collection Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_OPERATION_COUNT = SELECTABLE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl <em>Edit Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getEditUnit()
	 * @generated
	 */
	int EDIT_UNIT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__PAGE_DISPLAYED_ON = DYNAMIC_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ENTITIES = DYNAMIC_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTENT_TYPE = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DEFAULT_SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__TITLE = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ENABLE_WHEN = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_DESTINATION = DYNAMIC_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CANCEL_DESTINATION = DYNAMIC_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CANCEL_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTENT_CLASS = DYNAMIC_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CUSTOMISE_VALUES = DYNAMIC_UNIT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Edit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Edit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUnitImpl <em>Create Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCreateUnit()
	 * @generated
	 */
	int CREATE_UNIT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__PAGE_DISPLAYED_ON = EDIT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ENTITIES = EDIT_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DEFAULT_SELECTION = EDIT_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ENABLE_WHEN = EDIT_UNIT__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__STYLE_CLASS = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUpdateUnitImpl <em>Create Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUpdateUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCreateUpdateUnit()
	 * @generated
	 */
	int CREATE_UPDATE_UNIT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__PAGE_DISPLAYED_ON = EDIT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ENTITIES = EDIT_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DEFAULT_SELECTION = EDIT_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ENABLE_WHEN = EDIT_UNIT__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__SELECTION_TYPE = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Create Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clear Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CLEAR_LABEL = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__STYLE_CLASS = EDIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Create Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UpdateUnitImpl <em>Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UpdateUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUpdateUnit()
	 * @generated
	 */
	int UPDATE_UNIT = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__PAGE_DISPLAYED_ON = EDIT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ENTITIES = EDIT_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DEFAULT_SELECTION = EDIT_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ENABLE_WHEN = EDIT_UNIT__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__SELECTION_TYPE = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__STYLE_CLASS = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MapUnitImpl <em>Map Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.MapUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getMapUnit()
	 * @generated
	 */
	int MAP_UNIT = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__PAGE_DISPLAYED_ON = EDIT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ENTITIES = EDIT_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DEFAULT_SELECTION = EDIT_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ENABLE_WHEN = EDIT_UNIT__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__SELECTION_TYPE = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__READ_ONLY = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Zoom Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DEFAULT_ZOOM_LEVEL = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__STYLE_CLASS = EDIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCATION = EDIT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Place Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__PLACE_NAME = EDIT_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Map Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Map Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DataUnitImpl <em>Data Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DataUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDataUnit()
	 * @generated
	 */
	int DATA_UNIT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__PAGE_DISPLAYED_ON = DYNAMIC_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__ENTITIES = DYNAMIC_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DEFAULT_SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__TITLE = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DetailsUnitImpl <em>Details Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DetailsUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDetailsUnit()
	 * @generated
	 */
	int DETAILS_UNIT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__NAME = DATA_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAY_LABEL = DATA_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAYED_ON = DATA_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CREATE_DEFAULT_URI_ELEMENT = DATA_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__REQUIRES_ROLE = DATA_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__PURPOSE_SUMMARY = DATA_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__URI_ELEMENT = DATA_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ALTERNATIVE = DATA_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__OMIT_CAPTION = DATA_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CAPTION_CLASS = DATA_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__PAGE_DISPLAYED_ON = DATA_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ENTITIES = DATA_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAY_FIELDS = DATA_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SUPPORT_ACTIONS = DATA_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__HEADER = DATA_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__FOOTER = DATA_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__HEADER_CLASS = DATA_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTROL_CLASS = DATA_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__FOOTER_CLASS = DATA_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ERROR_CLASS = DATA_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DEFAULT_SELECTION = DATA_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__TITLE = DATA_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTENT_TYPE = DATA_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SELECTION_TYPE = DATA_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY = DATA_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__OMIT_FIELD_LABELS = DATA_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__STYLE_CLASS = DATA_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTENT_CLASS = DATA_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Details Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_FEATURE_COUNT = DATA_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Details Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_OPERATION_COUNT = DATA_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.IndexUnitImpl <em>Index Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.IndexUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getIndexUnit()
	 * @generated
	 */
	int INDEX_UNIT = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NAME = DATA_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAY_LABEL = DATA_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAYED_ON = DATA_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CREATE_DEFAULT_URI_ELEMENT = DATA_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__REQUIRES_ROLE = DATA_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PURPOSE_SUMMARY = DATA_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__URI_ELEMENT = DATA_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ALTERNATIVE = DATA_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OMIT_CAPTION = DATA_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CAPTION_CLASS = DATA_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PAGE_DISPLAYED_ON = DATA_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ENTITIES = DATA_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAY_FIELDS = DATA_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SUPPORT_ACTIONS = DATA_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__HEADER = DATA_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FOOTER = DATA_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__HEADER_CLASS = DATA_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTROL_CLASS = DATA_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FOOTER_CLASS = DATA_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ERROR_CLASS = DATA_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DEFAULT_SELECTION = DATA_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__TITLE = DATA_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SELECTION_TYPE = DATA_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTENT_TYPE = DATA_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTAINING_FEATURE = DATA_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SELECTION = DATA_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FILTERS = DATA_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__EMPTY_MESSAGE = DATA_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pagination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PAGINATION = DATA_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DEFAULT_PAGINATION_SIZE = DATA_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NEXT_NPAGES = DATA_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PREVIOUS_NPAGES = DATA_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NEXT_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PREVIOUS_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__USE_DISABLED_PAGE_LINKS = DATA_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS = DATA_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FIRST_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__LAST_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ACTIONS = DATA_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAY_OPTION = DATA_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OMIT_COLUMN_LABELS = DATA_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__STYLE_CLASS = DATA_UNIT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTENT_CLASS = DATA_UNIT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ROW_CLASSES = DATA_UNIT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT_FEATURE_COUNT = DATA_UNIT_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT_OPERATION_COUNT = DATA_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ControlUnitImpl <em>Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ControlUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getControlUnit()
	 * @generated
	 */
	int CONTROL_UNIT = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__PAGE_DISPLAYED_ON = DYNAMIC_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ENTITIES = DYNAMIC_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SUBMIT_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CANCEL_DESTINATION = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CANCEL_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTENT_CLASS = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.SearchUnitImpl <em>Search Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.SearchUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getSearchUnit()
	 * @generated
	 */
	int SEARCH_UNIT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__NAME = CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAY_LABEL = CONTROL_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAYED_ON = CONTROL_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTROL_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__REQUIRES_ROLE = CONTROL_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__PURPOSE_SUMMARY = CONTROL_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__URI_ELEMENT = CONTROL_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ALTERNATIVE = CONTROL_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__OMIT_CAPTION = CONTROL_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CAPTION_CLASS = CONTROL_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__PAGE_DISPLAYED_ON = CONTROL_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ENTITIES = CONTROL_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAY_FIELDS = CONTROL_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SUPPORT_ACTIONS = CONTROL_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__HEADER = CONTROL_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__FOOTER = CONTROL_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__HEADER_CLASS = CONTROL_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTROL_CLASS = CONTROL_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__FOOTER_CLASS = CONTROL_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ERROR_CLASS = CONTROL_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SUBMIT_LABEL = CONTROL_UNIT__SUBMIT_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CANCEL_DESTINATION = CONTROL_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CANCEL_LABEL = CONTROL_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTENT_CLASS = CONTROL_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Results Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__RESULTS_DESTINATION = CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__STYLE_CLASS = CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Search Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT_FEATURE_COUNT = CONTROL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Search Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT_OPERATION_COUNT = CONTROL_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageUnitImpl <em>Image Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ImageUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getImageUnit()
	 * @generated
	 */
	int IMAGE_UNIT = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PAGE_DISPLAYED_ON = DYNAMIC_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__ENTITIES = DYNAMIC_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SELECTION_TYPE = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CONTENT_TYPE = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CONTAINING_FEATURE = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FILTERS = DYNAMIC_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__EMPTY_MESSAGE = DYNAMIC_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pagination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PAGINATION = DYNAMIC_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DEFAULT_PAGINATION_SIZE = DYNAMIC_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NEXT_NPAGES = DYNAMIC_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PREVIOUS_NPAGES = DYNAMIC_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NEXT_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PREVIOUS_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__USE_DISABLED_PAGE_LINKS = DYNAMIC_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS = DYNAMIC_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FIRST_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__LAST_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DEFAULT_SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__IMAGE_PATH_FEATURE = DYNAMIC_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__TITLE_FEATURE = DYNAMIC_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__MISSING_IMAGE_PATH = DYNAMIC_UNIT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__IMAGE_FILTER = DYNAMIC_UNIT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SHOW_TIME = DYNAMIC_UNIT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__TRANSITION_TIME = DYNAMIC_UNIT_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Image Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>Image Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathImpl <em>Feature Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFeaturePath()
	 * @generated
	 */
	int FEATURE_PATH = 45;

	/**
	 * The number of structural features of the '<em>Feature Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Feature Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathAttributeImpl <em>Feature Path Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFeaturePathAttribute()
	 * @generated
	 */
	int FEATURE_PATH_ATTRIBUTE = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__NAME = FEATURE_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__ATTRIBUTE = FEATURE_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE_FEATURE_COUNT = FEATURE_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE_OPERATION_COUNT = FEATURE_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathAssociationImpl <em>Feature Path Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathAssociationImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFeaturePathAssociation()
	 * @generated
	 */
	int FEATURE_PATH_ASSOCIATION = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__NAME = FEATURE_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__ASSOCIATION = FEATURE_PATH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY = FEATURE_PATH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__CHILD_FEATURE = FEATURE_PATH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = FEATURE_PATH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__SOURCE_ENTITY = FEATURE_PATH_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__TARGET_ENTITY = FEATURE_PATH_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Feature Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION_FEATURE_COUNT = FEATURE_PATH_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Feature Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION_OPERATION_COUNT = FEATURE_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathImpl <em>Child Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getChildPath()
	 * @generated
	 */
	int CHILD_PATH = 48;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH__PART_OF = 0;

	/**
	 * The number of structural features of the '<em>Child Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Child Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAttributeImpl <em>Child Path Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAttributeImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getChildPathAttribute()
	 * @generated
	 */
	int CHILD_PATH_ATTRIBUTE = 49;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__PART_OF = CHILD_PATH__PART_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__NAME = CHILD_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__ATTRIBUTE = CHILD_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Child Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE_FEATURE_COUNT = CHILD_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Child Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE_OPERATION_COUNT = CHILD_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl <em>Child Path Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getChildPathAssociation()
	 * @generated
	 */
	int CHILD_PATH_ASSOCIATION = 50;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__PART_OF = CHILD_PATH__PART_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__NAME = CHILD_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__ASSOCIATION = CHILD_PATH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__VALUE_DISPLAY = CHILD_PATH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__CHILD_FEATURE = CHILD_PATH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = CHILD_PATH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__SOURCE_ENTITY = CHILD_PATH_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__TARGET_ENTITY = CHILD_PATH_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Child Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION_FEATURE_COUNT = CHILD_PATH_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Child Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION_OPERATION_COUNT = CHILD_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl <em>Image Index Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getImageIndexUnit()
	 * @generated
	 */
	int IMAGE_INDEX_UNIT = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__NAME = IMAGE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__DISPLAY_LABEL = IMAGE_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__DISPLAYED_ON = IMAGE_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__CREATE_DEFAULT_URI_ELEMENT = IMAGE_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__REQUIRES_ROLE = IMAGE_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PURPOSE_SUMMARY = IMAGE_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__URI_ELEMENT = IMAGE_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__ALTERNATIVE = IMAGE_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__OMIT_CAPTION = IMAGE_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__CAPTION_CLASS = IMAGE_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PAGE_DISPLAYED_ON = IMAGE_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__ENTITIES = IMAGE_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__DISPLAY_FIELDS = IMAGE_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__SUPPORT_ACTIONS = IMAGE_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__HEADER = IMAGE_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__FOOTER = IMAGE_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__HEADER_CLASS = IMAGE_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__CONTROL_CLASS = IMAGE_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__FOOTER_CLASS = IMAGE_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__ERROR_CLASS = IMAGE_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__SELECTION_TYPE = IMAGE_UNIT__SELECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__CONTENT_TYPE = IMAGE_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__CONTAINING_FEATURE = IMAGE_UNIT__CONTAINING_FEATURE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__SELECTION = IMAGE_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__FILTERS = IMAGE_UNIT__FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__EMPTY_MESSAGE = IMAGE_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Pagination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PAGINATION = IMAGE_UNIT__PAGINATION;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__DEFAULT_PAGINATION_SIZE = IMAGE_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__NEXT_NPAGES = IMAGE_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PREVIOUS_NPAGES = IMAGE_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__NEXT_PAGE_LABEL = IMAGE_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__PREVIOUS_PAGE_LABEL = IMAGE_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__USE_DISABLED_PAGE_LINKS = IMAGE_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS = IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__FIRST_PAGE_LABEL = IMAGE_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__LAST_PAGE_LABEL = IMAGE_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__DEFAULT_SELECTION = IMAGE_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__IMAGE_PATH_FEATURE = IMAGE_UNIT__IMAGE_PATH_FEATURE;

	/**
	 * The feature id for the '<em><b>Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__TITLE_FEATURE = IMAGE_UNIT__TITLE_FEATURE;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__MISSING_IMAGE_PATH = IMAGE_UNIT__MISSING_IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__IMAGE_FILTER = IMAGE_UNIT__IMAGE_FILTER;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__SHOW_TIME = IMAGE_UNIT__SHOW_TIME;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__TRANSITION_TIME = IMAGE_UNIT__TRANSITION_TIME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__ACTIONS = IMAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__STYLE_CLASS = IMAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT__CONTENT_CLASS = IMAGE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT_FEATURE_COUNT = IMAGE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_INDEX_UNIT_OPERATION_COUNT = IMAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.SliderUnitImpl <em>Slider Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.SliderUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getSliderUnit()
	 * @generated
	 */
	int SLIDER_UNIT = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NAME = IMAGE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAY_LABEL = IMAGE_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAYED_ON = IMAGE_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CREATE_DEFAULT_URI_ELEMENT = IMAGE_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__REQUIRES_ROLE = IMAGE_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PURPOSE_SUMMARY = IMAGE_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__URI_ELEMENT = IMAGE_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ALTERNATIVE = IMAGE_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__OMIT_CAPTION = IMAGE_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CAPTION_CLASS = IMAGE_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGE_DISPLAYED_ON = IMAGE_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ENTITIES = IMAGE_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAY_FIELDS = IMAGE_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SUPPORT_ACTIONS = IMAGE_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__HEADER = IMAGE_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FOOTER = IMAGE_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__HEADER_CLASS = IMAGE_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTROL_CLASS = IMAGE_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FOOTER_CLASS = IMAGE_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ERROR_CLASS = IMAGE_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SELECTION_TYPE = IMAGE_UNIT__SELECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTENT_TYPE = IMAGE_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTAINING_FEATURE = IMAGE_UNIT__CONTAINING_FEATURE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SELECTION = IMAGE_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FILTERS = IMAGE_UNIT__FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__EMPTY_MESSAGE = IMAGE_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Pagination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION = IMAGE_UNIT__PAGINATION;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DEFAULT_PAGINATION_SIZE = IMAGE_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_NPAGES = IMAGE_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_NPAGES = IMAGE_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_PAGE_LABEL = IMAGE_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_PAGE_LABEL = IMAGE_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__USE_DISABLED_PAGE_LINKS = IMAGE_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__USE_FIRST_LAST_PAGE_LINKS = IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIRST_PAGE_LABEL = IMAGE_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LAST_PAGE_LABEL = IMAGE_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DEFAULT_SELECTION = IMAGE_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__IMAGE_PATH_FEATURE = IMAGE_UNIT__IMAGE_PATH_FEATURE;

	/**
	 * The feature id for the '<em><b>Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__TITLE_FEATURE = IMAGE_UNIT__TITLE_FEATURE;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__MISSING_IMAGE_PATH = IMAGE_UNIT__MISSING_IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__IMAGE_FILTER = IMAGE_UNIT__IMAGE_FILTER;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SHOW_TIME = IMAGE_UNIT__SHOW_TIME;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__TRANSITION_TIME = IMAGE_UNIT__TRANSITION_TIME;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__STYLE_CLASS = IMAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTENT_CLASS = IMAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slider Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_FEATURE_COUNT = IMAGE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Slider Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_OPERATION_COUNT = IMAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.GalleryUnitImpl <em>Gallery Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.GalleryUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getGalleryUnit()
	 * @generated
	 */
	int GALLERY_UNIT = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NAME = IMAGE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAY_LABEL = IMAGE_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAYED_ON = IMAGE_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CREATE_DEFAULT_URI_ELEMENT = IMAGE_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__REQUIRES_ROLE = IMAGE_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PURPOSE_SUMMARY = IMAGE_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__URI_ELEMENT = IMAGE_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ALTERNATIVE = IMAGE_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__OMIT_CAPTION = IMAGE_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CAPTION_CLASS = IMAGE_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGE_DISPLAYED_ON = IMAGE_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ENTITIES = IMAGE_UNIT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAY_FIELDS = IMAGE_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SUPPORT_ACTIONS = IMAGE_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__HEADER = IMAGE_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FOOTER = IMAGE_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__HEADER_CLASS = IMAGE_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTROL_CLASS = IMAGE_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FOOTER_CLASS = IMAGE_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ERROR_CLASS = IMAGE_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SELECTION_TYPE = IMAGE_UNIT__SELECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTENT_TYPE = IMAGE_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTAINING_FEATURE = IMAGE_UNIT__CONTAINING_FEATURE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SELECTION = IMAGE_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FILTERS = IMAGE_UNIT__FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__EMPTY_MESSAGE = IMAGE_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Pagination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION = IMAGE_UNIT__PAGINATION;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DEFAULT_PAGINATION_SIZE = IMAGE_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_NPAGES = IMAGE_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_NPAGES = IMAGE_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_PAGE_LABEL = IMAGE_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_PAGE_LABEL = IMAGE_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__USE_DISABLED_PAGE_LINKS = IMAGE_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__USE_FIRST_LAST_PAGE_LINKS = IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIRST_PAGE_LABEL = IMAGE_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LAST_PAGE_LABEL = IMAGE_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DEFAULT_SELECTION = IMAGE_UNIT__DEFAULT_SELECTION;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__IMAGE_PATH_FEATURE = IMAGE_UNIT__IMAGE_PATH_FEATURE;

	/**
	 * The feature id for the '<em><b>Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__TITLE_FEATURE = IMAGE_UNIT__TITLE_FEATURE;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__MISSING_IMAGE_PATH = IMAGE_UNIT__MISSING_IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__IMAGE_FILTER = IMAGE_UNIT__IMAGE_FILTER;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SHOW_TIME = IMAGE_UNIT__SHOW_TIME;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__TRANSITION_TIME = IMAGE_UNIT__TRANSITION_TIME;

	/**
	 * The feature id for the '<em><b>Full Size Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FULL_SIZE_FILTER = IMAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__STYLE_CLASS = IMAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTENT_CLASS = IMAGE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gallery Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_FEATURE_COUNT = IMAGE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gallery Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_OPERATION_COUNT = IMAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.AuthenticationUnit <em>Authentication Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AuthenticationUnit
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getAuthenticationUnit()
	 * @generated
	 */
	int AUTHENTICATION_UNIT = 54;

	/**
	 * The number of structural features of the '<em>Authentication Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Authentication Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.RegistrationUnitImpl <em>Registration Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.RegistrationUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getRegistrationUnit()
	 * @generated
	 */
	int REGISTRATION_UNIT = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__NAME = AUTHENTICATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAY_LABEL = AUTHENTICATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAYED_ON = AUTHENTICATION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CREATE_DEFAULT_URI_ELEMENT = AUTHENTICATION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__REQUIRES_ROLE = AUTHENTICATION_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__PURPOSE_SUMMARY = AUTHENTICATION_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__URI_ELEMENT = AUTHENTICATION_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ALTERNATIVE = AUTHENTICATION_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__OMIT_CAPTION = AUTHENTICATION_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CAPTION_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__PAGE_DISPLAYED_ON = AUTHENTICATION_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ENTITIES = AUTHENTICATION_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAY_FIELDS = AUTHENTICATION_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__SUPPORT_ACTIONS = AUTHENTICATION_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__HEADER = AUTHENTICATION_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__FOOTER = AUTHENTICATION_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__HEADER_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONTROL_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__FOOTER_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ERROR_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__SUBMIT_LABEL = AUTHENTICATION_UNIT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CANCEL_DESTINATION = AUTHENTICATION_UNIT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CANCEL_LABEL = AUTHENTICATION_UNIT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONTENT_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__STYLE_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Registration Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT_FEATURE_COUNT = AUTHENTICATION_UNIT_FEATURE_COUNT + 25;

	/**
	 * The number of operations of the '<em>Registration Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT_OPERATION_COUNT = AUTHENTICATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.LoginUnitImpl <em>Login Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.LoginUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getLoginUnit()
	 * @generated
	 */
	int LOGIN_UNIT = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__NAME = AUTHENTICATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAY_LABEL = AUTHENTICATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAYED_ON = AUTHENTICATION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CREATE_DEFAULT_URI_ELEMENT = AUTHENTICATION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__REQUIRES_ROLE = AUTHENTICATION_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__PURPOSE_SUMMARY = AUTHENTICATION_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__URI_ELEMENT = AUTHENTICATION_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ALTERNATIVE = AUTHENTICATION_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__OMIT_CAPTION = AUTHENTICATION_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CAPTION_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__PAGE_DISPLAYED_ON = AUTHENTICATION_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ENTITIES = AUTHENTICATION_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAY_FIELDS = AUTHENTICATION_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__SUPPORT_ACTIONS = AUTHENTICATION_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__HEADER = AUTHENTICATION_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__FOOTER = AUTHENTICATION_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__HEADER_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONTROL_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__FOOTER_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ERROR_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__SUBMIT_LABEL = AUTHENTICATION_UNIT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CANCEL_DESTINATION = AUTHENTICATION_UNIT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CANCEL_LABEL = AUTHENTICATION_UNIT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONTENT_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Logout Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOGOUT_URI_ELEMENT = AUTHENTICATION_UNIT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__STYLE_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Login Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT_FEATURE_COUNT = AUTHENTICATION_UNIT_FEATURE_COUNT + 26;

	/**
	 * The number of operations of the '<em>Login Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT_OPERATION_COUNT = AUTHENTICATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl <em>Forgotten Password Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getForgottenPasswordUnit()
	 * @generated
	 */
	int FORGOTTEN_PASSWORD_UNIT = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__NAME = AUTHENTICATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL = AUTHENTICATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON = AUTHENTICATION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT = AUTHENTICATION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE = AUTHENTICATION_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY = AUTHENTICATION_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT = AUTHENTICATION_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE = AUTHENTICATION_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION = AUTHENTICATION_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__PAGE_DISPLAYED_ON = AUTHENTICATION_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ENTITIES = AUTHENTICATION_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS = AUTHENTICATION_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS = AUTHENTICATION_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__HEADER = AUTHENTICATION_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__FOOTER = AUTHENTICATION_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL = AUTHENTICATION_UNIT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION = AUTHENTICATION_UNIT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL = AUTHENTICATION_UNIT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONTENT_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS = AUTHENTICATION_UNIT_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Forgotten Password Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT_FEATURE_COUNT = AUTHENTICATION_UNIT_FEATURE_COUNT + 25;

	/**
	 * The number of operations of the '<em>Forgotten Password Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT_OPERATION_COUNT = AUTHENTICATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer <em>Inline Action Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getInlineActionContainer()
	 * @generated
	 */
	int INLINE_ACTION_CONTAINER = 58;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Inline Action Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inline Action Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.InlineActionImpl <em>Inline Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.InlineActionImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getInlineAction()
	 * @generated
	 */
	int INLINE_ACTION = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__USED_BY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__DISABLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__REQUIRES_ROLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__ENABLE_WHEN = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__DISPLAY_WHEN = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__HEADER = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__FOOTER = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__HEADER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__FOOTER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Inline Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Inline Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.SelectActionImpl <em>Select Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.SelectActionImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getSelectAction()
	 * @generated
	 */
	int SELECT_ACTION = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISABLE = INLINE_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__REQUIRES_ROLE = INLINE_ACTION__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__ENABLE_WHEN = INLINE_ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISPLAY_WHEN = INLINE_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__TARGET = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION_OPERATION_COUNT = INLINE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DeleteActionImpl <em>Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DeleteActionImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDeleteAction()
	 * @generated
	 */
	int DELETE_ACTION = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISABLE = INLINE_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__REQUIRES_ROLE = INLINE_ACTION__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__ENABLE_WHEN = INLINE_ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISPLAY_WHEN = INLINE_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DESTINATION = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__CONFIRM_MESSAGE = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__URI_ELEMENT = INLINE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_OPERATION_COUNT = INLINE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FeatureSupportActionImpl <em>Feature Support Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FeatureSupportActionImpl
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFeatureSupportAction()
	 * @generated
	 */
	int FEATURE_SUPPORT_ACTION = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__DISABLE = INLINE_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__REQUIRES_ROLE = INLINE_ACTION__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__ENABLE_WHEN = INLINE_ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__DISPLAY_WHEN = INLINE_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__OPERATION = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__URI_ELEMENT = INLINE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FILE_EXTENSION = INLINE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Feature Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION_OPERATION_COUNT = INLINE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.PageTopMenuOptions <em>Page Top Menu Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.PageTopMenuOptions
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getPageTopMenuOptions()
	 * @generated
	 */
	int PAGE_TOP_MENU_OPTIONS = 63;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionDisplayOptions <em>Collection Display Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionDisplayOptions
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCollectionDisplayOptions()
	 * @generated
	 */
	int COLLECTION_DISPLAY_OPTIONS = 64;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexDisplayOption <em>Index Display Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexDisplayOption
	 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getIndexDisplayOption()
	 * @generated
	 */
	int INDEX_DISPLAY_OPTION = 65;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web UI</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebUI
	 * @generated
	 */
	EClass getWebUI();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebUI#getServices()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_Services();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getGlobalMenu <em>Global Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Global Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebUI#getGlobalMenu()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_GlobalMenu();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pages</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebUI#getPages()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_Pages();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Menu#getEntries()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Entries();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#isOmitCaption <em>Omit Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Caption</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Menu#isOmitCaption()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_OmitCaption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Menu#getCaptionClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_CaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Menu#getStyleClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.Menu#getLayoutClass <em>Layout Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Menu#getLayoutClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_LayoutClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MenuEntry
	 * @generated
	 */
	EClass getMenuEntry();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.webui.MenuEntry#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MenuEntry#getPartOf()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_PartOf();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.MenuEntry#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MenuEntry#getRequiresRole()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EAttribute getMenuEntry_RequiresRole();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.GlobalMenu <em>Global Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.GlobalMenu
	 * @generated
	 */
	EClass getGlobalMenu();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.GlobalMenu#getWebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web UI</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.GlobalMenu#getWebUI()
	 * @see #getGlobalMenu()
	 * @generated
	 */
	EReference getGlobalMenu_WebUI();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.StaticMenu <em>Static Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.StaticMenu
	 * @generated
	 */
	EClass getStaticMenu();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry <em>Action Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry
	 * @generated
	 */
	EClass getActionMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry#getDestination()
	 * @see #getActionMenuEntry()
	 * @generated
	 */
	EReference getActionMenuEntry_Destination();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ActionMenuEntry#getQuery()
	 * @see #getActionMenuEntry()
	 * @generated
	 */
	EReference getActionMenuEntry_Query();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.EditStaticTextMenuEntry <em>Edit Static Text Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Static Text Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditStaticTextMenuEntry
	 * @generated
	 */
	EClass getEditStaticTextMenuEntry();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.ContextMenu <em>Context Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContextMenu
	 * @generated
	 */
	EClass getContextMenu();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ContextMenu#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContextMenu#getContext()
	 * @see #getContextMenu()
	 * @generated
	 */
	EReference getContextMenu_Context();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu <em>Dynamic Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu
	 * @generated
	 */
	EClass getDynamicMenu();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getEntityOrView <em>Entity Or View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Or View</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getEntityOrView()
	 * @see #getDynamicMenu()
	 * @generated
	 */
	EReference getDynamicMenu_EntityOrView();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getSelection()
	 * @see #getDynamicMenu()
	 * @generated
	 */
	EReference getDynamicMenu_Selection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getTitle()
	 * @see #getDynamicMenu()
	 * @generated
	 */
	EReference getDynamicMenu_Title();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.MenuFeature <em>Menu Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MenuFeature
	 * @generated
	 */
	EClass getMenuFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.Query#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Query#getFilter()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.Query#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Query#getParameters()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Parameters();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.QueryParameter <em>Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parameter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.QueryParameter
	 * @generated
	 */
	EClass getQueryParameter();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.QueryParameter#getFormal <em>Formal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.QueryParameter#getFormal()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EReference getQueryParameter_Formal();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.QueryParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.QueryParameter#getValue()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getWebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web UI</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getWebUI()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_WebUI();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getParentPage <em>Parent Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Page</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getParentPage()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ParentPage();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getChildPages <em>Child Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Pages</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getChildPages()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ChildPages();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#isAuthenticated <em>Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authenticated</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#isAuthenticated()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Authenticated();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getUriElement()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_UriElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getTopMenuOption <em>Top Menu Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Menu Option</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getTopMenuOption()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TopMenuOption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getTopMenuRank <em>Top Menu Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Menu Rank</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getTopMenuRank()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TopMenuRank();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getNavigationLabel <em>Navigation Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getNavigationLabel()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_NavigationLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getSideMenu <em>Side Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Side Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getSideMenu()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_SideMenu();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Page#getStyleClass()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_StyleClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.PageLink <em>Page Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Link</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.PageLink
	 * @generated
	 */
	EClass getPageLink();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.PageLink#getTargetPage <em>Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Page</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.PageLink#getTargetPage()
	 * @see #getPageLink()
	 * @generated
	 */
	EReference getPageLink_TargetPage();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.webui.Filter#getFilterFor <em>Filter For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Filter For</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Filter#getFilterFor()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_FilterFor();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.Filter#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Filter#getParameters()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Parameters();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.Filter#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.Filter#getSelection()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Selection();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.FilterParameter <em>Filter Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Parameter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FilterParameter
	 * @generated
	 */
	EClass getFilterParameter();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.webui.FilterParameter#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FilterParameter#getPartOf()
	 * @see #getFilterParameter()
	 * @generated
	 */
	EReference getFilterParameter_PartOf();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.FilterParameter#getFormal <em>Formal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FilterParameter#getFormal()
	 * @see #getFilterParameter()
	 * @generated
	 */
	EReference getFilterParameter_Formal();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.FilterParameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FilterParameter#getDataType()
	 * @see #getFilterParameter()
	 * @generated
	 */
	EReference getFilterParameter_DataType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.FilterParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FilterParameter#getDefaultValue()
	 * @see #getFilterParameter()
	 * @generated
	 */
	EAttribute getFilterParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.FilterParameter#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FilterParameter#getPlaceholder()
	 * @see #getFilterParameter()
	 * @generated
	 */
	EAttribute getFilterParameter_Placeholder();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitContainer <em>Unit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Container</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitContainer
	 * @generated
	 */
	EClass getUnitContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitContainer#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitContainer#getUnits()
	 * @see #getUnitContainer()
	 * @generated
	 */
	EReference getUnitContainer_Units();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit <em>Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit
	 * @generated
	 */
	EClass getContentUnit();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displayed On</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getDisplayedOn()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_DisplayedOn();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#isCreateDefaultUriElement <em>Create Default Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Default Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#isCreateDefaultUriElement()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_CreateDefaultUriElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getRequiresRole()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_RequiresRole();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose Summary</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getPurposeSummary()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_PurposeSummary();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getUriElement()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_UriElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getAlternative()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Alternative();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#isOmitCaption <em>Omit Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Caption</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#isOmitCaption()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_OmitCaption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getCaptionClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_CaptionClass();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getPageDisplayedOn <em>Page Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page Displayed On</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContentUnit#getPageDisplayedOn()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_PageDisplayedOn();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.StaticUnit <em>Static Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.StaticUnit
	 * @generated
	 */
	EClass getStaticUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.StaticUnit#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.StaticUnit#getContent()
	 * @see #getStaticUnit()
	 * @generated
	 */
	EAttribute getStaticUnit_Content();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.StaticUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.StaticUnit#getStyleClass()
	 * @see #getStaticUnit()
	 * @generated
	 */
	EAttribute getStaticUnit_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.StaticUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.StaticUnit#getContentClass()
	 * @see #getStaticUnit()
	 * @generated
	 */
	EAttribute getStaticUnit_ContentClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit <em>Create Sitemap Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Sitemap Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit
	 * @generated
	 */
	EClass getCreateSitemapUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit#getDeployedURL <em>Deployed URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployed URL</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit#getDeployedURL()
	 * @see #getCreateSitemapUnit()
	 * @generated
	 */
	EAttribute getCreateSitemapUnit_DeployedURL();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit#getFilename()
	 * @see #getCreateSitemapUnit()
	 * @generated
	 */
	EAttribute getCreateSitemapUnit_Filename();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit#getStyleClass()
	 * @see #getCreateSitemapUnit()
	 * @generated
	 */
	EAttribute getCreateSitemapUnit_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit#getContentClass()
	 * @see #getCreateSitemapUnit()
	 * @generated
	 */
	EAttribute getCreateSitemapUnit_ContentClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit <em>Dynamic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit
	 * @generated
	 */
	EClass getDynamicUnit();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getEntities()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getDisplayFields <em>Display Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getDisplayFields()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_DisplayFields();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getSupportActions <em>Support Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Support Actions</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getSupportActions()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_SupportActions();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getHeader()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_Header();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getFooter()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_Footer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getHeaderClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getControlClass <em>Control Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getControlClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_ControlClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getFooterClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_FooterClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getErrorClass <em>Error Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit#getErrorClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_ErrorClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitField <em>Unit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Field</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitField
	 * @generated
	 */
	EClass getUnitField();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitField#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displayed On</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitField#getDisplayedOn()
	 * @see #getUnitField()
	 * @generated
	 */
	EReference getUnitField_DisplayedOn();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitField#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitField#getTitle()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_Title();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitField#getCollectionDisplayOption <em>Collection Display Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Display Option</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitField#getCollectionDisplayOption()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_CollectionDisplayOption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitField#isCollectionAllowAdd <em>Collection Allow Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Allow Add</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitField#isCollectionAllowAdd()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_CollectionAllowAdd();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitField#isCollectionAllowRemove <em>Collection Allow Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Allow Remove</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitField#isCollectionAllowRemove()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_CollectionAllowRemove();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitField#getMaximumDisplaySize <em>Maximum Display Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Display Size</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitField#getMaximumDisplaySize()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_MaximumDisplaySize();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitField#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitField#getDateFormat()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_DateFormat();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature <em>Unit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature
	 * @generated
	 */
	EClass getUnitFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Display When Not Empty</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#isOnlyDisplayWhenNotEmpty()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_OnlyDisplayWhenNotEmpty();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getDisplayLabel()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#isRequired()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_Required();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getForcedValue <em>Forced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forced Value</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getForcedValue()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EReference getUnitFeature_ForcedValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getNullDisplayValue <em>Null Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Display Value</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getNullDisplayValue()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_NullDisplayValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getFooter()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_Footer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#isAutofocus <em>Autofocus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autofocus</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#isAutofocus()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_Autofocus();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getHeaderClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getInputClass <em>Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getInputClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_InputClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getDisplayClass <em>Display Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getDisplayClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_DisplayClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitFeature#getFooterClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_FooterClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitElement <em>Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitElement
	 * @generated
	 */
	EClass getUnitElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitElement#getAttribute()
	 * @see #getUnitElement()
	 * @generated
	 */
	EReference getUnitElement_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitElement#getName()
	 * @see #getUnitElement()
	 * @generated
	 */
	EAttribute getUnitElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitElement#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitElement#getDefaultValue()
	 * @see #getUnitElement()
	 * @generated
	 */
	EReference getUnitElement_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitElement#isObfuscateFormFields()
	 * @see #getUnitElement()
	 * @generated
	 */
	EAttribute getUnitElement_ObfuscateFormFields();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitElement#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitElement#getPlaceholder()
	 * @see #getUnitElement()
	 * @generated
	 */
	EAttribute getUnitElement_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitElement#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitElement#getValidationPattern()
	 * @see #getUnitElement()
	 * @generated
	 */
	EAttribute getUnitElement_ValidationPattern();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation <em>Unit Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation
	 * @generated
	 */
	EClass getUnitAssociation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#isIsSourceAssociation <em>Is Source Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#isIsSourceAssociation()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EAttribute getUnitAssociation_IsSourceAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getSourceEntity()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_SourceEntity();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getTargetEntity()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_TargetEntity();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getSelection()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_Selection();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.AssociationReference <em>Association Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Reference</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AssociationReference
	 * @generated
	 */
	EClass getAssociationReference();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.AssociationReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AssociationReference#getName()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EAttribute getAssociationReference_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.AssociationReference#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AssociationReference#getAssociation()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EReference getAssociationReference_Association();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.AssociationReference#getValueDisplay <em>Value Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Display</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AssociationReference#getValueDisplay()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EReference getAssociationReference_ValueDisplay();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.webui.AssociationReference#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AssociationReference#getChildFeature()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EReference getAssociationReference_ChildFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.InterfaceField <em>Interface Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Field</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InterfaceField
	 * @generated
	 */
	EClass getInterfaceField();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#isRequired()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_Required();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#getDefaultValue()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#getMustMatch <em>Must Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Must Match</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#getMustMatch()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EReference getInterfaceField_MustMatch();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#getInputClass <em>Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#getInputClass()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_InputClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#getPlaceholder()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InterfaceField#getValidationPattern()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_ValidationPattern();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField <em>Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Field</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DataTypeField
	 * @generated
	 */
	EClass getDataTypeField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#getDataType()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EReference getDataTypeField_DataType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#isObfuscateFormFields()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_ObfuscateFormFields();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#isEncrypt <em>Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypt</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#isEncrypt()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_Encrypt();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DataTypeField#getInterfaceType()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_InterfaceType();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Field</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DateField
	 * @generated
	 */
	EClass getDateField();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DateField#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DateField#getDetails()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Details();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DateField#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DateField#getFormat()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Format();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.CaptchaField <em>Captcha Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Captcha Field</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CaptchaField
	 * @generated
	 */
	EClass getCaptchaField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitSupportAction <em>Unit Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Support Action</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitSupportAction
	 * @generated
	 */
	EClass getUnitSupportAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitSupportAction#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitSupportAction#isDisable()
	 * @see #getUnitSupportAction()
	 * @generated
	 */
	EAttribute getUnitSupportAction_Disable();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitSupportAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitSupportAction#getConfirmMessage()
	 * @see #getUnitSupportAction()
	 * @generated
	 */
	EAttribute getUnitSupportAction_ConfirmMessage();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit <em>Selectable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selectable Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit
	 * @generated
	 */
	EClass getSelectableUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit#getSelectionType <em>Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit#getSelectionType()
	 * @see #getSelectableUnit()
	 * @generated
	 */
	EReference getSelectableUnit_SelectionType();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit <em>Singleton Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit
	 * @generated
	 */
	EClass getSingletonUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit#getContentType()
	 * @see #getSingletonUnit()
	 * @generated
	 */
	EReference getSingletonUnit_ContentType();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit <em>Collection Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit
	 * @generated
	 */
	EClass getCollectionUnit();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Type</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getContentType()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_ContentType();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getContainingFeature <em>Containing Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getContainingFeature()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_ContainingFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getSelection()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_Selection();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFilters()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_Filters();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getEmptyMessage <em>Empty Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty Message</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getEmptyMessage()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_EmptyMessage();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPagination <em>Pagination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pagination</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPagination()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_Pagination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Pagination Size</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getDefaultPaginationSize()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_DefaultPaginationSize();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getNextNpages <em>Next Npages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Npages</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getNextNpages()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_NextNpages();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPreviousNpages <em>Previous Npages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Npages</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPreviousNpages()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PreviousNpages();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getNextPageLabel <em>Next Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getNextPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_NextPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPreviousPageLabel <em>Previous Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPreviousPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PreviousPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Disabled Page Links</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#isUseDisabledPageLinks()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_UseDisabledPageLinks();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use First Last Page Links</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#isUseFirstLastPageLinks()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_UseFirstLastPageLinks();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFirstPageLabel <em>First Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFirstPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_FirstPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getLastPageLabel <em>Last Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getLastPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_LastPageLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.EditUnit <em>Edit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditUnit
	 * @generated
	 */
	EClass getEditUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getDefaultSelection <em>Default Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getDefaultSelection()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_DefaultSelection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getTitle()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_Title();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getEnableWhen <em>Enable When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable When</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getEnableWhen()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_EnableWhen();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getConfirmDestination <em>Confirm Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Confirm Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getConfirmDestination()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_ConfirmDestination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getConfirmLabel <em>Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getConfirmLabel()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_ConfirmLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getCancelDestination <em>Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cancel Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getCancelDestination()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_CancelDestination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getCancelLabel <em>Cancel Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getCancelLabel()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_CancelLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditUnit#getContentClass()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_ContentClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.EditUnit#isCustomiseValues <em>Customise Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customise Values</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.EditUnit#isCustomiseValues()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_CustomiseValues();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUnit <em>Create Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateUnit
	 * @generated
	 */
	EClass getCreateUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateUnit#getStyleClass()
	 * @see #getCreateUnit()
	 * @generated
	 */
	EAttribute getCreateUnit_StyleClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit <em>Create Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Update Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit
	 * @generated
	 */
	EClass getCreateUpdateUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getCreateUriElement <em>Create Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getCreateUriElement()
	 * @see #getCreateUpdateUnit()
	 * @generated
	 */
	EAttribute getCreateUpdateUnit_CreateUriElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clear Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getClearLabel()
	 * @see #getCreateUpdateUnit()
	 * @generated
	 */
	EAttribute getCreateUpdateUnit_ClearLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit#getStyleClass()
	 * @see #getCreateUpdateUnit()
	 * @generated
	 */
	EAttribute getCreateUpdateUnit_StyleClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit <em>Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit
	 * @generated
	 */
	EClass getUpdateUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit#getStyleClass()
	 * @see #getUpdateUnit()
	 * @generated
	 */
	EAttribute getUpdateUnit_StyleClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.MapUnit <em>Map Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MapUnit
	 * @generated
	 */
	EClass getMapUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.MapUnit#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MapUnit#isReadOnly()
	 * @see #getMapUnit()
	 * @generated
	 */
	EAttribute getMapUnit_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.MapUnit#getDefaultZoomLevel <em>Default Zoom Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Zoom Level</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MapUnit#getDefaultZoomLevel()
	 * @see #getMapUnit()
	 * @generated
	 */
	EAttribute getMapUnit_DefaultZoomLevel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.MapUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MapUnit#getStyleClass()
	 * @see #getMapUnit()
	 * @generated
	 */
	EAttribute getMapUnit_StyleClass();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.MapUnit#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MapUnit#getLocation()
	 * @see #getMapUnit()
	 * @generated
	 */
	EReference getMapUnit_Location();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.MapUnit#getPlaceName <em>Place Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.MapUnit#getPlaceName()
	 * @see #getMapUnit()
	 * @generated
	 */
	EReference getMapUnit_PlaceName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.DataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DataUnit
	 * @generated
	 */
	EClass getDataUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.DataUnit#getDefaultSelection <em>Default Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DataUnit#getDefaultSelection()
	 * @see #getDataUnit()
	 * @generated
	 */
	EReference getDataUnit_DefaultSelection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.DataUnit#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DataUnit#getTitle()
	 * @see #getDataUnit()
	 * @generated
	 */
	EReference getDataUnit_Title();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit <em>Details Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit
	 * @generated
	 */
	EClass getDetailsUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Display When Not Empty</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#isOnlyDisplayWhenNotEmpty()
	 * @see #getDetailsUnit()
	 * @generated
	 */
	EAttribute getDetailsUnit_OnlyDisplayWhenNotEmpty();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Field Labels</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#isOmitFieldLabels()
	 * @see #getDetailsUnit()
	 * @generated
	 */
	EAttribute getDetailsUnit_OmitFieldLabels();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#getStyleClass()
	 * @see #getDetailsUnit()
	 * @generated
	 */
	EAttribute getDetailsUnit_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit#getContentClass()
	 * @see #getDetailsUnit()
	 * @generated
	 */
	EAttribute getDetailsUnit_ContentClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit <em>Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexUnit
	 * @generated
	 */
	EClass getIndexUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getDisplayOption <em>Display Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Option</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getDisplayOption()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_DisplayOption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Column Labels</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#isOmitColumnLabels()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_OmitColumnLabels();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getStyleClass()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getContentClass()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_ContentClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getRowClasses <em>Row Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Classes</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexUnit#getRowClasses()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_RowClasses();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ControlUnit
	 * @generated
	 */
	EClass getControlUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ControlUnit#getSubmitLabel <em>Submit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submit Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ControlUnit#getSubmitLabel()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_SubmitLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ControlUnit#getCancelDestination <em>Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cancel Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ControlUnit#getCancelDestination()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_CancelDestination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ControlUnit#getCancelLabel <em>Cancel Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Label</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ControlUnit#getCancelLabel()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_CancelLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ControlUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ControlUnit#getContentClass()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_ContentClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.SearchUnit <em>Search Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SearchUnit
	 * @generated
	 */
	EClass getSearchUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.SearchUnit#getResultsDestination <em>Results Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SearchUnit#getResultsDestination()
	 * @see #getSearchUnit()
	 * @generated
	 */
	EReference getSearchUnit_ResultsDestination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.SearchUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SearchUnit#getStyleClass()
	 * @see #getSearchUnit()
	 * @generated
	 */
	EAttribute getSearchUnit_StyleClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit <em>Image Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageUnit
	 * @generated
	 */
	EClass getImageUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getDefaultSelection <em>Default Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getDefaultSelection()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_DefaultSelection();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImagePathFeature <em>Image Path Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Path Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImagePathFeature()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_ImagePathFeature();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getTitleFeature <em>Title Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getTitleFeature()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_TitleFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getMissingImagePath <em>Missing Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing Image Path</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getMissingImagePath()
	 * @see #getImageUnit()
	 * @generated
	 */
	EAttribute getImageUnit_MissingImagePath();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImageFilter <em>Image Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getImageFilter()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_ImageFilter();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getShowTime <em>Show Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Time</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getShowTime()
	 * @see #getImageUnit()
	 * @generated
	 */
	EAttribute getImageUnit_ShowTime();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getTransitionTime <em>Transition Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Time</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageUnit#getTransitionTime()
	 * @see #getImageUnit()
	 * @generated
	 */
	EAttribute getImageUnit_TransitionTime();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.FeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeaturePath
	 * @generated
	 */
	EClass getFeaturePath();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAttribute <em>Feature Path Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAttribute
	 * @generated
	 */
	EClass getFeaturePathAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAttribute#getName()
	 * @see #getFeaturePathAttribute()
	 * @generated
	 */
	EAttribute getFeaturePathAttribute_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAttribute#getAttribute()
	 * @see #getFeaturePathAttribute()
	 * @generated
	 */
	EReference getFeaturePathAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation <em>Feature Path Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation
	 * @generated
	 */
	EClass getFeaturePathAssociation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation#isIsSourceAssociation <em>Is Source Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation#isIsSourceAssociation()
	 * @see #getFeaturePathAssociation()
	 * @generated
	 */
	EAttribute getFeaturePathAssociation_IsSourceAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation#getSourceEntity()
	 * @see #getFeaturePathAssociation()
	 * @generated
	 */
	EReference getFeaturePathAssociation_SourceEntity();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeaturePathAssociation#getTargetEntity()
	 * @see #getFeaturePathAssociation()
	 * @generated
	 */
	EReference getFeaturePathAssociation_TargetEntity();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPath <em>Child Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Path</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ChildPath
	 * @generated
	 */
	EClass getChildPath();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPath#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ChildPath#getPartOf()
	 * @see #getChildPath()
	 * @generated
	 */
	EReference getChildPath_PartOf();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPathAttribute <em>Child Path Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Path Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ChildPathAttribute
	 * @generated
	 */
	EClass getChildPathAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPathAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ChildPathAttribute#getName()
	 * @see #getChildPathAttribute()
	 * @generated
	 */
	EAttribute getChildPathAttribute_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPathAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ChildPathAttribute#getAttribute()
	 * @see #getChildPathAttribute()
	 * @generated
	 */
	EReference getChildPathAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation <em>Child Path Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Path Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation
	 * @generated
	 */
	EClass getChildPathAssociation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation#isIsSourceAssociation <em>Is Source Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Association</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation#isIsSourceAssociation()
	 * @see #getChildPathAssociation()
	 * @generated
	 */
	EAttribute getChildPathAssociation_IsSourceAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation#getSourceEntity()
	 * @see #getChildPathAssociation()
	 * @generated
	 */
	EReference getChildPathAssociation_SourceEntity();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation#getTargetEntity()
	 * @see #getChildPathAssociation()
	 * @generated
	 */
	EReference getChildPathAssociation_TargetEntity();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit <em>Image Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Index Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit
	 * @generated
	 */
	EClass getImageIndexUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getStyleClass()
	 * @see #getImageIndexUnit()
	 * @generated
	 */
	EAttribute getImageIndexUnit_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit#getContentClass()
	 * @see #getImageIndexUnit()
	 * @generated
	 */
	EAttribute getImageIndexUnit_ContentClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.SliderUnit <em>Slider Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slider Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SliderUnit
	 * @generated
	 */
	EClass getSliderUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.SliderUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SliderUnit#getStyleClass()
	 * @see #getSliderUnit()
	 * @generated
	 */
	EAttribute getSliderUnit_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.SliderUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SliderUnit#getContentClass()
	 * @see #getSliderUnit()
	 * @generated
	 */
	EAttribute getSliderUnit_ContentClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit <em>Gallery Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gallery Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit
	 * @generated
	 */
	EClass getGalleryUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getFullSizeFilter <em>Full Size Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Full Size Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getFullSizeFilter()
	 * @see #getGalleryUnit()
	 * @generated
	 */
	EReference getGalleryUnit_FullSizeFilter();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getStyleClass()
	 * @see #getGalleryUnit()
	 * @generated
	 */
	EAttribute getGalleryUnit_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getContentClass()
	 * @see #getGalleryUnit()
	 * @generated
	 */
	EAttribute getGalleryUnit_ContentClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.AuthenticationUnit <em>Authentication Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AuthenticationUnit
	 * @generated
	 */
	EClass getAuthenticationUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.RegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.RegistrationUnit
	 * @generated
	 */
	EClass getRegistrationUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.RegistrationUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.RegistrationUnit#getStyleClass()
	 * @see #getRegistrationUnit()
	 * @generated
	 */
	EAttribute getRegistrationUnit_StyleClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.LoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.LoginUnit
	 * @generated
	 */
	EClass getLoginUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.LoginUnit#getLogoutUriElement <em>Logout Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logout Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.LoginUnit#getLogoutUriElement()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EAttribute getLoginUnit_LogoutUriElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.LoginUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.LoginUnit#getStyleClass()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EAttribute getLoginUnit_StyleClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.ForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forgotten Password Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ForgottenPasswordUnit
	 * @generated
	 */
	EClass getForgottenPasswordUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.ForgottenPasswordUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ForgottenPasswordUnit#getStyleClass()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EAttribute getForgottenPasswordUnit_StyleClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer <em>Inline Action Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Action Container</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer
	 * @generated
	 */
	EClass getInlineActionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer#getActions()
	 * @see #getInlineActionContainer()
	 * @generated
	 */
	EReference getInlineActionContainer_Actions();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineAction <em>Inline Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Action</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineAction
	 * @generated
	 */
	EClass getInlineAction();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Used By</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getUsedBy()
	 * @see #getInlineAction()
	 * @generated
	 */
	EReference getInlineAction_UsedBy();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineAction#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineAction#isDisable()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Disable();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getRequiresRole()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_RequiresRole();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getEnableWhen <em>Enable When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable When</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getEnableWhen()
	 * @see #getInlineAction()
	 * @generated
	 */
	EReference getInlineAction_EnableWhen();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getDisplayWhen <em>Display When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display When</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getDisplayWhen()
	 * @see #getInlineAction()
	 * @generated
	 */
	EReference getInlineAction_DisplayWhen();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getHeader()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Header();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getFooter()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Footer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getHeaderClass()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineAction#getFooterClass()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_FooterClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.SelectAction <em>Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Action</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SelectAction
	 * @generated
	 */
	EClass getSelectAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.SelectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.SelectAction#getTarget()
	 * @see #getSelectAction()
	 * @generated
	 */
	EReference getSelectAction_Target();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Action</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DeleteAction
	 * @generated
	 */
	EClass getDeleteAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getDestination()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EReference getDeleteAction_Destination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getConfirmMessage()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EAttribute getDeleteAction_ConfirmMessage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getUriElement()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EAttribute getDeleteAction_UriElement();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction <em>Feature Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Support Action</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction
	 * @generated
	 */
	EClass getFeatureSupportAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getOperation()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EReference getFeatureSupportAction_Operation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getConfirmMessage()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_ConfirmMessage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getUriElement()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_UriElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getFileExtension()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_FileExtension();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.webui.PageTopMenuOptions <em>Page Top Menu Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Page Top Menu Options</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.PageTopMenuOptions
	 * @generated
	 */
	EEnum getPageTopMenuOptions();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionDisplayOptions <em>Collection Display Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Display Options</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionDisplayOptions
	 * @generated
	 */
	EEnum getCollectionDisplayOptions();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexDisplayOption <em>Index Display Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Index Display Option</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexDisplayOption
	 * @generated
	 */
	EEnum getIndexDisplayOption();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebuiFactory getWebuiFactory();

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
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl <em>Web UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebUIImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getWebUI()
		 * @generated
		 */
		EClass WEB_UI = eINSTANCE.getWebUI();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__SERVICES = eINSTANCE.getWebUI_Services();

		/**
		 * The meta object literal for the '<em><b>Global Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__GLOBAL_MENU = eINSTANCE.getWebUI_GlobalMenu();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__PAGES = eINSTANCE.getWebUI_Pages();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.MenuImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ENTRIES = eINSTANCE.getMenu_Entries();

		/**
		 * The meta object literal for the '<em><b>Omit Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__OMIT_CAPTION = eINSTANCE.getMenu_OmitCaption();

		/**
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__CAPTION_CLASS = eINSTANCE.getMenu_CaptionClass();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__STYLE_CLASS = eINSTANCE.getMenu_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Layout Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__LAYOUT_CLASS = eINSTANCE.getMenu_LayoutClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.MenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getMenuEntry()
		 * @generated
		 */
		EClass MENU_ENTRY = eINSTANCE.getMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ENTRY__PART_OF = eINSTANCE.getMenuEntry_PartOf();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ENTRY__REQUIRES_ROLE = eINSTANCE.getMenuEntry_RequiresRole();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.GlobalMenuImpl <em>Global Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.GlobalMenuImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getGlobalMenu()
		 * @generated
		 */
		EClass GLOBAL_MENU = eINSTANCE.getGlobalMenu();

		/**
		 * The meta object literal for the '<em><b>Web UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_MENU__WEB_UI = eINSTANCE.getGlobalMenu_WebUI();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.StaticMenuImpl <em>Static Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.StaticMenuImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getStaticMenu()
		 * @generated
		 */
		EClass STATIC_MENU = eINSTANCE.getStaticMenu();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ActionMenuEntryImpl <em>Action Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ActionMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getActionMenuEntry()
		 * @generated
		 */
		EClass ACTION_MENU_ENTRY = eINSTANCE.getActionMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MENU_ENTRY__DESTINATION = eINSTANCE.getActionMenuEntry_Destination();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MENU_ENTRY__QUERY = eINSTANCE.getActionMenuEntry_Query();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditStaticTextMenuEntryImpl <em>Edit Static Text Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.EditStaticTextMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getEditStaticTextMenuEntry()
		 * @generated
		 */
		EClass EDIT_STATIC_TEXT_MENU_ENTRY = eINSTANCE.getEditStaticTextMenuEntry();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ContextMenuImpl <em>Context Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ContextMenuImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getContextMenu()
		 * @generated
		 */
		EClass CONTEXT_MENU = eINSTANCE.getContextMenu();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MENU__CONTEXT = eINSTANCE.getContextMenu_Context();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DynamicMenuImpl <em>Dynamic Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DynamicMenuImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDynamicMenu()
		 * @generated
		 */
		EClass DYNAMIC_MENU = eINSTANCE.getDynamicMenu();

		/**
		 * The meta object literal for the '<em><b>Entity Or View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MENU__ENTITY_OR_VIEW = eINSTANCE.getDynamicMenu_EntityOrView();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MENU__SELECTION = eINSTANCE.getDynamicMenu_Selection();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MENU__TITLE = eINSTANCE.getDynamicMenu_Title();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MenuFeatureImpl <em>Menu Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.MenuFeatureImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getMenuFeature()
		 * @generated
		 */
		EClass MENU_FEATURE = eINSTANCE.getMenuFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.QueryImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__FILTER = eINSTANCE.getQuery_Filter();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__PARAMETERS = eINSTANCE.getQuery_Parameters();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.QueryParameterImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getQueryParameter()
		 * @generated
		 */
		EClass QUERY_PARAMETER = eINSTANCE.getQueryParameter();

		/**
		 * The meta object literal for the '<em><b>Formal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_PARAMETER__FORMAL = eINSTANCE.getQueryParameter_Formal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__VALUE = eINSTANCE.getQueryParameter_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.PageImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Web UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__WEB_UI = eINSTANCE.getPage_WebUI();

		/**
		 * The meta object literal for the '<em><b>Parent Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PARENT_PAGE = eINSTANCE.getPage_ParentPage();

		/**
		 * The meta object literal for the '<em><b>Child Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CHILD_PAGES = eINSTANCE.getPage_ChildPages();

		/**
		 * The meta object literal for the '<em><b>Authenticated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__AUTHENTICATED = eINSTANCE.getPage_Authenticated();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__URI_ELEMENT = eINSTANCE.getPage_UriElement();

		/**
		 * The meta object literal for the '<em><b>Top Menu Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TOP_MENU_OPTION = eINSTANCE.getPage_TopMenuOption();

		/**
		 * The meta object literal for the '<em><b>Top Menu Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TOP_MENU_RANK = eINSTANCE.getPage_TopMenuRank();

		/**
		 * The meta object literal for the '<em><b>Navigation Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAVIGATION_LABEL = eINSTANCE.getPage_NavigationLabel();

		/**
		 * The meta object literal for the '<em><b>Side Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SIDE_MENU = eINSTANCE.getPage_SideMenu();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__STYLE_CLASS = eINSTANCE.getPage_StyleClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.PageLinkImpl <em>Page Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.PageLinkImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getPageLink()
		 * @generated
		 */
		EClass PAGE_LINK = eINSTANCE.getPageLink();

		/**
		 * The meta object literal for the '<em><b>Target Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_LINK__TARGET_PAGE = eINSTANCE.getPageLink_TargetPage();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FilterImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Filter For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__FILTER_FOR = eINSTANCE.getFilter_FilterFor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__PARAMETERS = eINSTANCE.getFilter_Parameters();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__SELECTION = eINSTANCE.getFilter_Selection();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FilterParameterImpl <em>Filter Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FilterParameterImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFilterParameter()
		 * @generated
		 */
		EClass FILTER_PARAMETER = eINSTANCE.getFilterParameter();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_PARAMETER__PART_OF = eINSTANCE.getFilterParameter_PartOf();

		/**
		 * The meta object literal for the '<em><b>Formal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_PARAMETER__FORMAL = eINSTANCE.getFilterParameter_Formal();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_PARAMETER__DATA_TYPE = eINSTANCE.getFilterParameter_DataType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_PARAMETER__DEFAULT_VALUE = eINSTANCE.getFilterParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_PARAMETER__PLACEHOLDER = eINSTANCE.getFilterParameter_Placeholder();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitContainer <em>Unit Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.UnitContainer
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitContainer()
		 * @generated
		 */
		EClass UNIT_CONTAINER = eINSTANCE.getUnitContainer();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CONTAINER__UNITS = eINSTANCE.getUnitContainer_Units();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ContentUnitImpl <em>Content Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ContentUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getContentUnit()
		 * @generated
		 */
		EClass CONTENT_UNIT = eINSTANCE.getContentUnit();

		/**
		 * The meta object literal for the '<em><b>Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__DISPLAYED_ON = eINSTANCE.getContentUnit_DisplayedOn();

		/**
		 * The meta object literal for the '<em><b>Create Default Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT = eINSTANCE.getContentUnit_CreateDefaultUriElement();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__REQUIRES_ROLE = eINSTANCE.getContentUnit_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Purpose Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__PURPOSE_SUMMARY = eINSTANCE.getContentUnit_PurposeSummary();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__URI_ELEMENT = eINSTANCE.getContentUnit_UriElement();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__ALTERNATIVE = eINSTANCE.getContentUnit_Alternative();

		/**
		 * The meta object literal for the '<em><b>Omit Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__OMIT_CAPTION = eINSTANCE.getContentUnit_OmitCaption();

		/**
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__CAPTION_CLASS = eINSTANCE.getContentUnit_CaptionClass();

		/**
		 * The meta object literal for the '<em><b>Page Displayed On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__PAGE_DISPLAYED_ON = eINSTANCE.getContentUnit_PageDisplayedOn();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.StaticUnitImpl <em>Static Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.StaticUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getStaticUnit()
		 * @generated
		 */
		EClass STATIC_UNIT = eINSTANCE.getStaticUnit();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_UNIT__CONTENT = eINSTANCE.getStaticUnit_Content();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_UNIT__STYLE_CLASS = eINSTANCE.getStaticUnit_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_UNIT__CONTENT_CLASS = eINSTANCE.getStaticUnit_ContentClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateSitemapUnitImpl <em>Create Sitemap Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.CreateSitemapUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCreateSitemapUnit()
		 * @generated
		 */
		EClass CREATE_SITEMAP_UNIT = eINSTANCE.getCreateSitemapUnit();

		/**
		 * The meta object literal for the '<em><b>Deployed URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SITEMAP_UNIT__DEPLOYED_URL = eINSTANCE.getCreateSitemapUnit_DeployedURL();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SITEMAP_UNIT__FILENAME = eINSTANCE.getCreateSitemapUnit_Filename();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SITEMAP_UNIT__STYLE_CLASS = eINSTANCE.getCreateSitemapUnit_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SITEMAP_UNIT__CONTENT_CLASS = eINSTANCE.getCreateSitemapUnit_ContentClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DynamicUnitImpl <em>Dynamic Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DynamicUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDynamicUnit()
		 * @generated
		 */
		EClass DYNAMIC_UNIT = eINSTANCE.getDynamicUnit();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__ENTITIES = eINSTANCE.getDynamicUnit_Entities();

		/**
		 * The meta object literal for the '<em><b>Display Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__DISPLAY_FIELDS = eINSTANCE.getDynamicUnit_DisplayFields();

		/**
		 * The meta object literal for the '<em><b>Support Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__SUPPORT_ACTIONS = eINSTANCE.getDynamicUnit_SupportActions();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__HEADER = eINSTANCE.getDynamicUnit_Header();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__FOOTER = eINSTANCE.getDynamicUnit_Footer();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__HEADER_CLASS = eINSTANCE.getDynamicUnit_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Control Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__CONTROL_CLASS = eINSTANCE.getDynamicUnit_ControlClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__FOOTER_CLASS = eINSTANCE.getDynamicUnit_FooterClass();

		/**
		 * The meta object literal for the '<em><b>Error Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__ERROR_CLASS = eINSTANCE.getDynamicUnit_ErrorClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UnitFieldImpl <em>Unit Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UnitFieldImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitField()
		 * @generated
		 */
		EClass UNIT_FIELD = eINSTANCE.getUnitField();

		/**
		 * The meta object literal for the '<em><b>Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FIELD__DISPLAYED_ON = eINSTANCE.getUnitField_DisplayedOn();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__TITLE = eINSTANCE.getUnitField_Title();

		/**
		 * The meta object literal for the '<em><b>Collection Display Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__COLLECTION_DISPLAY_OPTION = eINSTANCE.getUnitField_CollectionDisplayOption();

		/**
		 * The meta object literal for the '<em><b>Collection Allow Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__COLLECTION_ALLOW_ADD = eINSTANCE.getUnitField_CollectionAllowAdd();

		/**
		 * The meta object literal for the '<em><b>Collection Allow Remove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__COLLECTION_ALLOW_REMOVE = eINSTANCE.getUnitField_CollectionAllowRemove();

		/**
		 * The meta object literal for the '<em><b>Maximum Display Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__MAXIMUM_DISPLAY_SIZE = eINSTANCE.getUnitField_MaximumDisplaySize();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__DATE_FORMAT = eINSTANCE.getUnitField_DateFormat();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UnitFeatureImpl <em>Unit Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UnitFeatureImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitFeature()
		 * @generated
		 */
		EClass UNIT_FEATURE = eINSTANCE.getUnitFeature();

		/**
		 * The meta object literal for the '<em><b>Only Display When Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY = eINSTANCE.getUnitFeature_OnlyDisplayWhenNotEmpty();

		/**
		 * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__DISPLAY_LABEL = eINSTANCE.getUnitFeature_DisplayLabel();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__REQUIRED = eINSTANCE.getUnitFeature_Required();

		/**
		 * The meta object literal for the '<em><b>Forced Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FEATURE__FORCED_VALUE = eINSTANCE.getUnitFeature_ForcedValue();

		/**
		 * The meta object literal for the '<em><b>Null Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__NULL_DISPLAY_VALUE = eINSTANCE.getUnitFeature_NullDisplayValue();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__FOOTER = eINSTANCE.getUnitFeature_Footer();

		/**
		 * The meta object literal for the '<em><b>Autofocus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__AUTOFOCUS = eINSTANCE.getUnitFeature_Autofocus();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__HEADER_CLASS = eINSTANCE.getUnitFeature_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__INPUT_CLASS = eINSTANCE.getUnitFeature_InputClass();

		/**
		 * The meta object literal for the '<em><b>Display Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__DISPLAY_CLASS = eINSTANCE.getUnitFeature_DisplayClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__FOOTER_CLASS = eINSTANCE.getUnitFeature_FooterClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UnitElementImpl <em>Unit Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UnitElementImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitElement()
		 * @generated
		 */
		EClass UNIT_ELEMENT = eINSTANCE.getUnitElement();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ELEMENT__ATTRIBUTE = eINSTANCE.getUnitElement_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ELEMENT__NAME = eINSTANCE.getUnitElement_Name();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ELEMENT__DEFAULT_VALUE = eINSTANCE.getUnitElement_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS = eINSTANCE.getUnitElement_ObfuscateFormFields();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ELEMENT__PLACEHOLDER = eINSTANCE.getUnitElement_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ELEMENT__VALIDATION_PATTERN = eINSTANCE.getUnitElement_ValidationPattern();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UnitAssociationImpl <em>Unit Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UnitAssociationImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitAssociation()
		 * @generated
		 */
		EClass UNIT_ASSOCIATION = eINSTANCE.getUnitAssociation();

		/**
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION = eINSTANCE.getUnitAssociation_IsSourceAssociation();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__SOURCE_ENTITY = eINSTANCE.getUnitAssociation_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__TARGET_ENTITY = eINSTANCE.getUnitAssociation_TargetEntity();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__SELECTION = eINSTANCE.getUnitAssociation_Selection();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.AssociationReference <em>Association Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.AssociationReference
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getAssociationReference()
		 * @generated
		 */
		EClass ASSOCIATION_REFERENCE = eINSTANCE.getAssociationReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_REFERENCE__NAME = eINSTANCE.getAssociationReference_Name();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_REFERENCE__ASSOCIATION = eINSTANCE.getAssociationReference_Association();

		/**
		 * The meta object literal for the '<em><b>Value Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_REFERENCE__VALUE_DISPLAY = eINSTANCE.getAssociationReference_ValueDisplay();

		/**
		 * The meta object literal for the '<em><b>Child Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_REFERENCE__CHILD_FEATURE = eINSTANCE.getAssociationReference_ChildFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.InterfaceFieldImpl <em>Interface Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.InterfaceFieldImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getInterfaceField()
		 * @generated
		 */
		EClass INTERFACE_FIELD = eINSTANCE.getInterfaceField();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__REQUIRED = eINSTANCE.getInterfaceField_Required();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__DEFAULT_VALUE = eINSTANCE.getInterfaceField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Must Match</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_FIELD__MUST_MATCH = eINSTANCE.getInterfaceField_MustMatch();

		/**
		 * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__INPUT_CLASS = eINSTANCE.getInterfaceField_InputClass();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__PLACEHOLDER = eINSTANCE.getInterfaceField_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__VALIDATION_PATTERN = eINSTANCE.getInterfaceField_ValidationPattern();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DataTypeFieldImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDataTypeField()
		 * @generated
		 */
		EClass DATA_TYPE_FIELD = eINSTANCE.getDataTypeField();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_FIELD__DATA_TYPE = eINSTANCE.getDataTypeField_DataType();

		/**
		 * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS = eINSTANCE.getDataTypeField_ObfuscateFormFields();

		/**
		 * The meta object literal for the '<em><b>Encrypt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__ENCRYPT = eINSTANCE.getDataTypeField_Encrypt();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__INTERFACE_TYPE = eINSTANCE.getDataTypeField_InterfaceType();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DateFieldImpl <em>Date Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DateFieldImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDateField()
		 * @generated
		 */
		EClass DATE_FIELD = eINSTANCE.getDateField();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__DETAILS = eINSTANCE.getDateField_Details();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__FORMAT = eINSTANCE.getDateField_Format();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CaptchaFieldImpl <em>Captcha Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.CaptchaFieldImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCaptchaField()
		 * @generated
		 */
		EClass CAPTCHA_FIELD = eINSTANCE.getCaptchaField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UnitSupportActionImpl <em>Unit Support Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UnitSupportActionImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUnitSupportAction()
		 * @generated
		 */
		EClass UNIT_SUPPORT_ACTION = eINSTANCE.getUnitSupportAction();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_SUPPORT_ACTION__DISABLE = eINSTANCE.getUnitSupportAction_Disable();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE = eINSTANCE.getUnitSupportAction_ConfirmMessage();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit <em>Selectable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getSelectableUnit()
		 * @generated
		 */
		EClass SELECTABLE_UNIT = eINSTANCE.getSelectableUnit();

		/**
		 * The meta object literal for the '<em><b>Selection Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTABLE_UNIT__SELECTION_TYPE = eINSTANCE.getSelectableUnit_SelectionType();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit <em>Singleton Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getSingletonUnit()
		 * @generated
		 */
		EClass SINGLETON_UNIT = eINSTANCE.getSingletonUnit();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLETON_UNIT__CONTENT_TYPE = eINSTANCE.getSingletonUnit_ContentType();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit <em>Collection Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCollectionUnit()
		 * @generated
		 */
		EClass COLLECTION_UNIT = eINSTANCE.getCollectionUnit();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__CONTENT_TYPE = eINSTANCE.getCollectionUnit_ContentType();

		/**
		 * The meta object literal for the '<em><b>Containing Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__CONTAINING_FEATURE = eINSTANCE.getCollectionUnit_ContainingFeature();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__SELECTION = eINSTANCE.getCollectionUnit_Selection();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__FILTERS = eINSTANCE.getCollectionUnit_Filters();

		/**
		 * The meta object literal for the '<em><b>Empty Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__EMPTY_MESSAGE = eINSTANCE.getCollectionUnit_EmptyMessage();

		/**
		 * The meta object literal for the '<em><b>Pagination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__PAGINATION = eINSTANCE.getCollectionUnit_Pagination();

		/**
		 * The meta object literal for the '<em><b>Default Pagination Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE = eINSTANCE.getCollectionUnit_DefaultPaginationSize();

		/**
		 * The meta object literal for the '<em><b>Next Npages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__NEXT_NPAGES = eINSTANCE.getCollectionUnit_NextNpages();

		/**
		 * The meta object literal for the '<em><b>Previous Npages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PREVIOUS_NPAGES = eINSTANCE.getCollectionUnit_PreviousNpages();

		/**
		 * The meta object literal for the '<em><b>Next Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__NEXT_PAGE_LABEL = eINSTANCE.getCollectionUnit_NextPageLabel();

		/**
		 * The meta object literal for the '<em><b>Previous Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PREVIOUS_PAGE_LABEL = eINSTANCE.getCollectionUnit_PreviousPageLabel();

		/**
		 * The meta object literal for the '<em><b>Use Disabled Page Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS = eINSTANCE.getCollectionUnit_UseDisabledPageLinks();

		/**
		 * The meta object literal for the '<em><b>Use First Last Page Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = eINSTANCE.getCollectionUnit_UseFirstLastPageLinks();

		/**
		 * The meta object literal for the '<em><b>First Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__FIRST_PAGE_LABEL = eINSTANCE.getCollectionUnit_FirstPageLabel();

		/**
		 * The meta object literal for the '<em><b>Last Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__LAST_PAGE_LABEL = eINSTANCE.getCollectionUnit_LastPageLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl <em>Edit Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getEditUnit()
		 * @generated
		 */
		EClass EDIT_UNIT = eINSTANCE.getEditUnit();

		/**
		 * The meta object literal for the '<em><b>Default Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__DEFAULT_SELECTION = eINSTANCE.getEditUnit_DefaultSelection();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__TITLE = eINSTANCE.getEditUnit_Title();

		/**
		 * The meta object literal for the '<em><b>Enable When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__ENABLE_WHEN = eINSTANCE.getEditUnit_EnableWhen();

		/**
		 * The meta object literal for the '<em><b>Confirm Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__CONFIRM_DESTINATION = eINSTANCE.getEditUnit_ConfirmDestination();

		/**
		 * The meta object literal for the '<em><b>Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CONFIRM_LABEL = eINSTANCE.getEditUnit_ConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Cancel Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__CANCEL_DESTINATION = eINSTANCE.getEditUnit_CancelDestination();

		/**
		 * The meta object literal for the '<em><b>Cancel Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CANCEL_LABEL = eINSTANCE.getEditUnit_CancelLabel();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CONTENT_CLASS = eINSTANCE.getEditUnit_ContentClass();

		/**
		 * The meta object literal for the '<em><b>Customise Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CUSTOMISE_VALUES = eINSTANCE.getEditUnit_CustomiseValues();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUnitImpl <em>Create Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCreateUnit()
		 * @generated
		 */
		EClass CREATE_UNIT = eINSTANCE.getCreateUnit();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UNIT__STYLE_CLASS = eINSTANCE.getCreateUnit_StyleClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUpdateUnitImpl <em>Create Update Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUpdateUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCreateUpdateUnit()
		 * @generated
		 */
		EClass CREATE_UPDATE_UNIT = eINSTANCE.getCreateUpdateUnit();

		/**
		 * The meta object literal for the '<em><b>Create Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT = eINSTANCE.getCreateUpdateUnit_CreateUriElement();

		/**
		 * The meta object literal for the '<em><b>Clear Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UPDATE_UNIT__CLEAR_LABEL = eINSTANCE.getCreateUpdateUnit_ClearLabel();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UPDATE_UNIT__STYLE_CLASS = eINSTANCE.getCreateUpdateUnit_StyleClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UpdateUnitImpl <em>Update Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.UpdateUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getUpdateUnit()
		 * @generated
		 */
		EClass UPDATE_UNIT = eINSTANCE.getUpdateUnit();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_UNIT__STYLE_CLASS = eINSTANCE.getUpdateUnit_StyleClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MapUnitImpl <em>Map Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.MapUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getMapUnit()
		 * @generated
		 */
		EClass MAP_UNIT = eINSTANCE.getMapUnit();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_UNIT__READ_ONLY = eINSTANCE.getMapUnit_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Default Zoom Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_UNIT__DEFAULT_ZOOM_LEVEL = eINSTANCE.getMapUnit_DefaultZoomLevel();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_UNIT__STYLE_CLASS = eINSTANCE.getMapUnit_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_UNIT__LOCATION = eINSTANCE.getMapUnit_Location();

		/**
		 * The meta object literal for the '<em><b>Place Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_UNIT__PLACE_NAME = eINSTANCE.getMapUnit_PlaceName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DataUnitImpl <em>Data Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DataUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDataUnit()
		 * @generated
		 */
		EClass DATA_UNIT = eINSTANCE.getDataUnit();

		/**
		 * The meta object literal for the '<em><b>Default Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNIT__DEFAULT_SELECTION = eINSTANCE.getDataUnit_DefaultSelection();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNIT__TITLE = eINSTANCE.getDataUnit_Title();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DetailsUnitImpl <em>Details Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DetailsUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDetailsUnit()
		 * @generated
		 */
		EClass DETAILS_UNIT = eINSTANCE.getDetailsUnit();

		/**
		 * The meta object literal for the '<em><b>Only Display When Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY = eINSTANCE.getDetailsUnit_OnlyDisplayWhenNotEmpty();

		/**
		 * The meta object literal for the '<em><b>Omit Field Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_UNIT__OMIT_FIELD_LABELS = eINSTANCE.getDetailsUnit_OmitFieldLabels();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_UNIT__STYLE_CLASS = eINSTANCE.getDetailsUnit_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_UNIT__CONTENT_CLASS = eINSTANCE.getDetailsUnit_ContentClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.IndexUnitImpl <em>Index Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.IndexUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getIndexUnit()
		 * @generated
		 */
		EClass INDEX_UNIT = eINSTANCE.getIndexUnit();

		/**
		 * The meta object literal for the '<em><b>Display Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__DISPLAY_OPTION = eINSTANCE.getIndexUnit_DisplayOption();

		/**
		 * The meta object literal for the '<em><b>Omit Column Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__OMIT_COLUMN_LABELS = eINSTANCE.getIndexUnit_OmitColumnLabels();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__STYLE_CLASS = eINSTANCE.getIndexUnit_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__CONTENT_CLASS = eINSTANCE.getIndexUnit_ContentClass();

		/**
		 * The meta object literal for the '<em><b>Row Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__ROW_CLASSES = eINSTANCE.getIndexUnit_RowClasses();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ControlUnitImpl <em>Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ControlUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getControlUnit()
		 * @generated
		 */
		EClass CONTROL_UNIT = eINSTANCE.getControlUnit();

		/**
		 * The meta object literal for the '<em><b>Submit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__SUBMIT_LABEL = eINSTANCE.getControlUnit_SubmitLabel();

		/**
		 * The meta object literal for the '<em><b>Cancel Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__CANCEL_DESTINATION = eINSTANCE.getControlUnit_CancelDestination();

		/**
		 * The meta object literal for the '<em><b>Cancel Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__CANCEL_LABEL = eINSTANCE.getControlUnit_CancelLabel();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__CONTENT_CLASS = eINSTANCE.getControlUnit_ContentClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.SearchUnitImpl <em>Search Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.SearchUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getSearchUnit()
		 * @generated
		 */
		EClass SEARCH_UNIT = eINSTANCE.getSearchUnit();

		/**
		 * The meta object literal for the '<em><b>Results Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_UNIT__RESULTS_DESTINATION = eINSTANCE.getSearchUnit_ResultsDestination();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_UNIT__STYLE_CLASS = eINSTANCE.getSearchUnit_StyleClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageUnitImpl <em>Image Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ImageUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getImageUnit()
		 * @generated
		 */
		EClass IMAGE_UNIT = eINSTANCE.getImageUnit();

		/**
		 * The meta object literal for the '<em><b>Default Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__DEFAULT_SELECTION = eINSTANCE.getImageUnit_DefaultSelection();

		/**
		 * The meta object literal for the '<em><b>Image Path Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__IMAGE_PATH_FEATURE = eINSTANCE.getImageUnit_ImagePathFeature();

		/**
		 * The meta object literal for the '<em><b>Title Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__TITLE_FEATURE = eINSTANCE.getImageUnit_TitleFeature();

		/**
		 * The meta object literal for the '<em><b>Missing Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UNIT__MISSING_IMAGE_PATH = eINSTANCE.getImageUnit_MissingImagePath();

		/**
		 * The meta object literal for the '<em><b>Image Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__IMAGE_FILTER = eINSTANCE.getImageUnit_ImageFilter();

		/**
		 * The meta object literal for the '<em><b>Show Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UNIT__SHOW_TIME = eINSTANCE.getImageUnit_ShowTime();

		/**
		 * The meta object literal for the '<em><b>Transition Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UNIT__TRANSITION_TIME = eINSTANCE.getImageUnit_TransitionTime();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathImpl <em>Feature Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFeaturePath()
		 * @generated
		 */
		EClass FEATURE_PATH = eINSTANCE.getFeaturePath();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathAttributeImpl <em>Feature Path Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFeaturePathAttribute()
		 * @generated
		 */
		EClass FEATURE_PATH_ATTRIBUTE = eINSTANCE.getFeaturePathAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_PATH_ATTRIBUTE__NAME = eINSTANCE.getFeaturePathAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getFeaturePathAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathAssociationImpl <em>Feature Path Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FeaturePathAssociationImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFeaturePathAssociation()
		 * @generated
		 */
		EClass FEATURE_PATH_ASSOCIATION = eINSTANCE.getFeaturePathAssociation();

		/**
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = eINSTANCE.getFeaturePathAssociation_IsSourceAssociation();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH_ASSOCIATION__SOURCE_ENTITY = eINSTANCE.getFeaturePathAssociation_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH_ASSOCIATION__TARGET_ENTITY = eINSTANCE.getFeaturePathAssociation_TargetEntity();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathImpl <em>Child Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getChildPath()
		 * @generated
		 */
		EClass CHILD_PATH = eINSTANCE.getChildPath();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_PATH__PART_OF = eINSTANCE.getChildPath_PartOf();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAttributeImpl <em>Child Path Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAttributeImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getChildPathAttribute()
		 * @generated
		 */
		EClass CHILD_PATH_ATTRIBUTE = eINSTANCE.getChildPathAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILD_PATH_ATTRIBUTE__NAME = eINSTANCE.getChildPathAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_PATH_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getChildPathAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl <em>Child Path Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getChildPathAssociation()
		 * @generated
		 */
		EClass CHILD_PATH_ASSOCIATION = eINSTANCE.getChildPathAssociation();

		/**
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = eINSTANCE.getChildPathAssociation_IsSourceAssociation();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_PATH_ASSOCIATION__SOURCE_ENTITY = eINSTANCE.getChildPathAssociation_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_PATH_ASSOCIATION__TARGET_ENTITY = eINSTANCE.getChildPathAssociation_TargetEntity();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl <em>Image Index Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getImageIndexUnit()
		 * @generated
		 */
		EClass IMAGE_INDEX_UNIT = eINSTANCE.getImageIndexUnit();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_INDEX_UNIT__STYLE_CLASS = eINSTANCE.getImageIndexUnit_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_INDEX_UNIT__CONTENT_CLASS = eINSTANCE.getImageIndexUnit_ContentClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.SliderUnitImpl <em>Slider Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.SliderUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getSliderUnit()
		 * @generated
		 */
		EClass SLIDER_UNIT = eINSTANCE.getSliderUnit();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER_UNIT__STYLE_CLASS = eINSTANCE.getSliderUnit_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER_UNIT__CONTENT_CLASS = eINSTANCE.getSliderUnit_ContentClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.GalleryUnitImpl <em>Gallery Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.GalleryUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getGalleryUnit()
		 * @generated
		 */
		EClass GALLERY_UNIT = eINSTANCE.getGalleryUnit();

		/**
		 * The meta object literal for the '<em><b>Full Size Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GALLERY_UNIT__FULL_SIZE_FILTER = eINSTANCE.getGalleryUnit_FullSizeFilter();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLERY_UNIT__STYLE_CLASS = eINSTANCE.getGalleryUnit_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLERY_UNIT__CONTENT_CLASS = eINSTANCE.getGalleryUnit_ContentClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.AuthenticationUnit <em>Authentication Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.AuthenticationUnit
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getAuthenticationUnit()
		 * @generated
		 */
		EClass AUTHENTICATION_UNIT = eINSTANCE.getAuthenticationUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.RegistrationUnitImpl <em>Registration Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.RegistrationUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getRegistrationUnit()
		 * @generated
		 */
		EClass REGISTRATION_UNIT = eINSTANCE.getRegistrationUnit();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_UNIT__STYLE_CLASS = eINSTANCE.getRegistrationUnit_StyleClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.LoginUnitImpl <em>Login Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.LoginUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getLoginUnit()
		 * @generated
		 */
		EClass LOGIN_UNIT = eINSTANCE.getLoginUnit();

		/**
		 * The meta object literal for the '<em><b>Logout Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_UNIT__LOGOUT_URI_ELEMENT = eINSTANCE.getLoginUnit_LogoutUriElement();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_UNIT__STYLE_CLASS = eINSTANCE.getLoginUnit_StyleClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl <em>Forgotten Password Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getForgottenPasswordUnit()
		 * @generated
		 */
		EClass FORGOTTEN_PASSWORD_UNIT = eINSTANCE.getForgottenPasswordUnit();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS = eINSTANCE.getForgottenPasswordUnit_StyleClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer <em>Inline Action Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getInlineActionContainer()
		 * @generated
		 */
		EClass INLINE_ACTION_CONTAINER = eINSTANCE.getInlineActionContainer();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION_CONTAINER__ACTIONS = eINSTANCE.getInlineActionContainer_Actions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.InlineActionImpl <em>Inline Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.InlineActionImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getInlineAction()
		 * @generated
		 */
		EClass INLINE_ACTION = eINSTANCE.getInlineAction();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION__USED_BY = eINSTANCE.getInlineAction_UsedBy();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__DISABLE = eINSTANCE.getInlineAction_Disable();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__REQUIRES_ROLE = eINSTANCE.getInlineAction_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Enable When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION__ENABLE_WHEN = eINSTANCE.getInlineAction_EnableWhen();

		/**
		 * The meta object literal for the '<em><b>Display When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION__DISPLAY_WHEN = eINSTANCE.getInlineAction_DisplayWhen();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__HEADER = eINSTANCE.getInlineAction_Header();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__FOOTER = eINSTANCE.getInlineAction_Footer();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__HEADER_CLASS = eINSTANCE.getInlineAction_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__FOOTER_CLASS = eINSTANCE.getInlineAction_FooterClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.SelectActionImpl <em>Select Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.SelectActionImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getSelectAction()
		 * @generated
		 */
		EClass SELECT_ACTION = eINSTANCE.getSelectAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ACTION__TARGET = eINSTANCE.getSelectAction_Target();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DeleteActionImpl <em>Delete Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.DeleteActionImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getDeleteAction()
		 * @generated
		 */
		EClass DELETE_ACTION = eINSTANCE.getDeleteAction();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ACTION__DESTINATION = eINSTANCE.getDeleteAction_Destination();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__CONFIRM_MESSAGE = eINSTANCE.getDeleteAction_ConfirmMessage();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__URI_ELEMENT = eINSTANCE.getDeleteAction_UriElement();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.impl.FeatureSupportActionImpl <em>Feature Support Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.FeatureSupportActionImpl
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getFeatureSupportAction()
		 * @generated
		 */
		EClass FEATURE_SUPPORT_ACTION = eINSTANCE.getFeatureSupportAction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SUPPORT_ACTION__OPERATION = eINSTANCE.getFeatureSupportAction_Operation();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE = eINSTANCE.getFeatureSupportAction_ConfirmMessage();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__URI_ELEMENT = eINSTANCE.getFeatureSupportAction_UriElement();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__FILE_EXTENSION = eINSTANCE.getFeatureSupportAction_FileExtension();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.PageTopMenuOptions <em>Page Top Menu Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.PageTopMenuOptions
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getPageTopMenuOptions()
		 * @generated
		 */
		EEnum PAGE_TOP_MENU_OPTIONS = eINSTANCE.getPageTopMenuOptions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionDisplayOptions <em>Collection Display Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.CollectionDisplayOptions
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getCollectionDisplayOptions()
		 * @generated
		 */
		EEnum COLLECTION_DISPLAY_OPTIONS = eINSTANCE.getCollectionDisplayOptions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.webui.IndexDisplayOption <em>Index Display Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.webui.IndexDisplayOption
		 * @see uk.ac.man.cs.mdsd.webgen.webui.impl.WebuiPackageImpl#getIndexDisplayOption()
		 * @generated
		 */
		EEnum INDEX_DISPLAY_OPTION = eINSTANCE.getIndexDisplayOption();

	}

} //WebuiPackage
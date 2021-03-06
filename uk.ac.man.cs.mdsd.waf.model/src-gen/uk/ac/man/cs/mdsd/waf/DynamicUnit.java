/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.expression.Predicate;

import uk.ac.man.cs.mdsd.service.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getServicesUsed <em>Services Used</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getHideWhen <em>Hide When</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getMessageWhenHidden <em>Message When Hidden</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getSupportActions <em>Support Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getHeader <em>Header</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getErrorClass <em>Error Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit()
 * @model abstract="true"
 * @generated
 */
public interface DynamicUnit extends ContentUnit {
	/**
	 * Returns the value of the '<em><b>Display Fields</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.UnitField}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.UnitField#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Fields</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_DisplayFields()
	 * @see uk.ac.man.cs.mdsd.waf.UnitField#getDisplayedOn
	 * @model opposite="displayedOn" containment="true"
	 * @generated
	 */
	EList<UnitField> getDisplayFields();

	/**
	 * Returns the value of the '<em><b>Services Used</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.service.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services Used</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services Used</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_ServicesUsed()
	 * @model
	 * @generated
	 */
	EList<Service> getServicesUsed();

	/**
	 * Returns the value of the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide When</em>' containment reference.
	 * @see #setHideWhen(Predicate)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_HideWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getHideWhen();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getHideWhen <em>Hide When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide When</em>' containment reference.
	 * @see #getHideWhen()
	 * @generated
	 */
	void setHideWhen(Predicate value);

	/**
	 * Returns the value of the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message When Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message When Hidden</em>' attribute.
	 * @see #setMessageWhenHidden(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_MessageWhenHidden()
	 * @model unique="false"
	 * @generated
	 */
	String getMessageWhenHidden();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getMessageWhenHidden <em>Message When Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message When Hidden</em>' attribute.
	 * @see #getMessageWhenHidden()
	 * @generated
	 */
	void setMessageWhenHidden(String value);

	/**
	 * Returns the value of the '<em><b>Support Actions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.UnitSupportAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Actions</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_SupportActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitSupportAction> getSupportActions();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_Header()
	 * @model unique="false"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' attribute.
	 * @see #setFooter(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_Footer()
	 * @model unique="false"
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_HeaderClass()
	 * @model unique="false"
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Class</em>' attribute.
	 * @see #setControlClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_ControlClass()
	 * @model unique="false"
	 * @generated
	 */
	String getControlClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getControlClass <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Class</em>' attribute.
	 * @see #getControlClass()
	 * @generated
	 */
	void setControlClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_FooterClass()
	 * @model unique="false"
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

	/**
	 * Returns the value of the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Class</em>' attribute.
	 * @see #setErrorClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicUnit_ErrorClass()
	 * @model unique="false"
	 * @generated
	 */
	String getErrorClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getErrorClass <em>Error Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Class</em>' attribute.
	 * @see #getErrorClass()
	 * @generated
	 */
	void setErrorClass(String value);

} // DynamicUnit

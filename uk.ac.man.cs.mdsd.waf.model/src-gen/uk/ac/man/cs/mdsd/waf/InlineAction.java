/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.expression.Predicate;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InlineAction#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InlineAction#isDisable <em>Disable</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InlineAction#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InlineAction#getEnableWhen <em>Enable When</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InlineAction#getDisplayWhen <em>Display When</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InlineAction#getHeader <em>Header</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InlineAction#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InlineAction#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InlineAction#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInlineAction()
 * @model abstract="true"
 * @generated
 */
public interface InlineAction extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Used By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.InlineActionContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' container reference.
	 * @see #setUsedBy(InlineActionContainer)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInlineAction_UsedBy()
	 * @see uk.ac.man.cs.mdsd.waf.InlineActionContainer#getActions
	 * @model opposite="actions" required="true" transient="false"
	 * @generated
	 */
	InlineActionContainer getUsedBy();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getUsedBy <em>Used By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used By</em>' container reference.
	 * @see #getUsedBy()
	 * @generated
	 */
	void setUsedBy(InlineActionContainer value);

	/**
	 * Returns the value of the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable</em>' attribute.
	 * @see #setDisable(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInlineAction_Disable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDisable();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InlineAction#isDisable <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable</em>' attribute.
	 * @see #isDisable()
	 * @generated
	 */
	void setDisable(boolean value);

	/**
	 * Returns the value of the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Role</em>' attribute.
	 * @see #setRequiresRole(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInlineAction_RequiresRole()
	 * @model unique="false"
	 * @generated
	 */
	String getRequiresRole();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getRequiresRole <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Role</em>' attribute.
	 * @see #getRequiresRole()
	 * @generated
	 */
	void setRequiresRole(String value);

	/**
	 * Returns the value of the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable When</em>' containment reference.
	 * @see #setEnableWhen(Predicate)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInlineAction_EnableWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getEnableWhen();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getEnableWhen <em>Enable When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable When</em>' containment reference.
	 * @see #getEnableWhen()
	 * @generated
	 */
	void setEnableWhen(Predicate value);

	/**
	 * Returns the value of the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display When</em>' containment reference.
	 * @see #setDisplayWhen(Predicate)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInlineAction_DisplayWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getDisplayWhen();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getDisplayWhen <em>Display When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display When</em>' containment reference.
	 * @see #getDisplayWhen()
	 * @generated
	 */
	void setDisplayWhen(Predicate value);

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInlineAction_Header()
	 * @model unique="false"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getHeader <em>Header</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInlineAction_Footer()
	 * @model unique="false"
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getFooter <em>Footer</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInlineAction_HeaderClass()
	 * @model unique="false"
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInlineAction_FooterClass()
	 * @model unique="false"
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InlineAction#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

} // InlineAction

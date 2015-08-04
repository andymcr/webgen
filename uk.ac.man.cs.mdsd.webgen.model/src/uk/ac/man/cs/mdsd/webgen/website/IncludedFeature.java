/**
 * <copyright>
 * </copyright>
 *
 * $Id: IncludedFeature.java,v 1.26 2014/08/21 14:33:45 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;
import uk.ac.man.cs.mdsd.criteria.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#isRequired <em>Required</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IncludedFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature_Required()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forced Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forced Value</em>' containment reference.
	 * @see #setForcedValue(Expression)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature_ForcedValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getForcedValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getForcedValue <em>Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forced Value</em>' containment reference.
	 * @see #getForcedValue()
	 * @generated
	 */
	void setForcedValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Label</em>' attribute.
	 * @see #setDisplayLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature_DisplayLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature_Footer()
	 * @model ordered="false"
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getFooter <em>Footer</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature_HeaderClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Class</em>' attribute.
	 * @see #setInputClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature_InputClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getInputClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getInputClass <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Class</em>' attribute.
	 * @see #getInputClass()
	 * @generated
	 */
	void setInputClass(String value);

	/**
	 * Returns the value of the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Class</em>' attribute.
	 * @see #setDisplayClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature_DisplayClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getDisplayClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getDisplayClass <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Class</em>' attribute.
	 * @see #getDisplayClass()
	 * @generated
	 */
	void setDisplayClass(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature_FooterClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedFeature#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

} // IncludedFeature

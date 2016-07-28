/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isCollectionAllowAdd <em>Collection Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isCollectionAllowRemove <em>Collection Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isSerializationExpose <em>Serialization Expose</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Feature extends EObject {

	/**
	 * Returns the value of the '<em><b>Collection Allow Add</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Allow Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Allow Add</em>' attribute.
	 * @see #setCollectionAllowAdd(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_CollectionAllowAdd()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollectionAllowAdd();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isCollectionAllowAdd <em>Collection Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Allow Add</em>' attribute.
	 * @see #isCollectionAllowAdd()
	 * @generated
	 */
	void setCollectionAllowAdd(boolean value);

	/**
	 * Returns the value of the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Allow Remove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Allow Remove</em>' attribute.
	 * @see #setCollectionAllowRemove(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_CollectionAllowRemove()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollectionAllowRemove();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isCollectionAllowRemove <em>Collection Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Allow Remove</em>' attribute.
	 * @see #isCollectionAllowRemove()
	 * @generated
	 */
	void setCollectionAllowRemove(boolean value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_HeaderClass()
	 * @model
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_DisplayClass()
	 * @model
	 * @generated
	 */
	String getDisplayClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getDisplayClass <em>Display Class</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_FooterClass()
	 * @model
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

	/**
	 * Returns the value of the '<em><b>Serialization Groups</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization Groups</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialization Groups</em>' attribute list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_SerializationGroups()
	 * @model default=""
	 * @generated
	 */
	List<String> getSerializationGroups();

	/**
	 * Returns the value of the '<em><b>Serialization Expose</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization Expose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialization Expose</em>' attribute.
	 * @see #setSerializationExpose(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_SerializationExpose()
	 * @model default="true"
	 * @generated
	 */
	boolean isSerializationExpose();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isSerializationExpose <em>Serialization Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialization Expose</em>' attribute.
	 * @see #isSerializationExpose()
	 * @generated
	 */
	void setSerializationExpose(boolean value);

	/**
	 * Returns the value of the '<em><b>Encode Uri Key</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encode Uri Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encode Uri Key</em>' attribute.
	 * @see #setEncodeUriKey(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_EncodeUriKey()
	 * @model default="false"
	 * @generated
	 */
	boolean isEncodeUriKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isEncodeUriKey <em>Encode Uri Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encode Uri Key</em>' attribute.
	 * @see #isEncodeUriKey()
	 * @generated
	 */
	void setEncodeUriKey(boolean value);
} // Feature

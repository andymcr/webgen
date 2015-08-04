/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getSource <em>Source</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getSupportActions <em>Support Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getHeader <em>Header</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getErrorClass <em>Error Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDynamicUnit()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='serviceFeaturesMustBeFromSource onlyReferenceFeaturesOnce entitySourceOnlyIfNotEncapsulated serviceSourceImpliesServiceFeaturesSet'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL serviceFeaturesMustBeFromSource='let features : Collection(Feature)\r\n\t= if source.oclIsTypeOf(Entity) then \r\n\t\t\tsource.oclAsType(Entity).features\r\n\t\t\t\t->union(source.oclAsType(Entity).associationEnds)\r\n\t\telse\r\n\t\t\tsource.oclAsType(Service).features\r\n\t\t\t\t->select(f | f.oclIsKindOf(ServiceEntityFeature))\r\n\t\t\t\t->collect(f |\r\n\t\t\t\t\tif f.oclIsTypeOf(ServiceEntityElement) then\r\n\t\t\t\t\t\tf.oclAsType(ServiceEntityElement).feature\r\n\t\t\t\t\telse\r\n\t\t\t\t\t\tf.oclAsType(ServiceEntityAssociation).feature\r\n\t\t\t\t\tendif)\r\n\t\tendif \r\n\tin displayFields\r\n\t\t->select(f | f.oclIsKindOf(UnitFeature))\r\n\t\t.oclAsType(UnitFeature)\r\n\t\t->select(f | \r\n\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n\t\t\t\ttrue\r\n\t\t\telse\r\n\t\t\t\tf.oclAsType(UnitAssociation).feature.oclIsTypeOf(ServiceEntityAssociation)\r\n\t\t\tendif)\r\n\t\t->forAll(f | \r\n\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n\t\t\t\tfeatures->includes(f.oclAsType(UnitElement).feature)\r\n\t\t\telse\r\n\t\t\t\tfeatures->includes(f.oclAsType(UnitAssociation).feature)\r\n\t\t\tendif)' onlyReferenceFeaturesOnce='displayFields\r\n\t->select(f | f.oclIsKindOf(UnitFeature))\r\n\t.oclAsType(UnitFeature)\r\n\t->select(f | if not f.oclIsTypeOf(UnitAssociation) then\r\n\t\t\ttrue\r\n\t\telse\r\n\t\t\tf.oclAsType(UnitAssociation).childFeature.oclIsUndefined()\r\n\t\tendif)\r\n\t->isUnique(f |\r\n\t\tif f.oclIsTypeOf(UnitElement) then\r\n\t\t\tf.oclAsType(UnitElement).feature\r\n\t\telse\r\n\t\t\tf.oclAsType(UnitAssociation).feature\r\n\t\tendif)' entitySourceOnlyIfNotEncapsulated='source.oclIsTypeOf(Entity) implies source.oclAsType(Entity).servedBy->isEmpty()' serviceSourceImpliesServiceFeaturesSet='source.oclIsTypeOf(Service) implies \r\ndisplayFields\r\n\t->select(f|f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\r\n\t->forAll(f |\r\n\t\tif f.oclIsTypeOf(UnitElement) then\r\n\t\t\tnot f.oclAsType(UnitElement).serviceFeature.oclIsUndefined()\r\n\t\telse\r\n\t\t\tnot f.oclAsType(UnitAssociation).serviceFeature.oclIsUndefined()\r\n\t\tendif)'"
 * @generated
 */
public interface DynamicUnit extends ContentUnit {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UnitSource)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDynamicUnit_Source()
	 * @model required="true"
	 * @generated
	 */
	UnitSource getSource();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UnitSource value);

	/**
	 * Returns the value of the '<em><b>Display Fields</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.UnitField}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.UnitField#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Fields</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDynamicUnit_DisplayFields()
	 * @see uk.ac.man.cs.mdsd.webgen.website.UnitField#getDisplayedOn
	 * @model opposite="displayedOn" containment="true"
	 * @generated
	 */
	List<UnitField> getDisplayFields();

	/**
	 * Returns the value of the '<em><b>Support Actions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.UnitSupportAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Actions</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDynamicUnit_SupportActions()
	 * @model containment="true"
	 * @generated
	 */
	List<UnitSupportAction> getSupportActions();

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDynamicUnit_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getHeader <em>Header</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDynamicUnit_Footer()
	 * @model
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * The default value is <code>"unit_header"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDynamicUnit_HeaderClass()
	 * @model default="unit_header"
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Control Class</b></em>' attribute.
	 * The default value is <code>"unit_control"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Class</em>' attribute.
	 * @see #setControlClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDynamicUnit_ControlClass()
	 * @model default="unit_control"
	 * @generated
	 */
	String getControlClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getControlClass <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Class</em>' attribute.
	 * @see #getControlClass()
	 * @generated
	 */
	void setControlClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * The default value is <code>"unit_footer"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDynamicUnit_FooterClass()
	 * @model default="unit_footer"
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

	/**
	 * Returns the value of the '<em><b>Error Class</b></em>' attribute.
	 * The default value is <code>"error"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Class</em>' attribute.
	 * @see #setErrorClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDynamicUnit_ErrorClass()
	 * @model default="error"
	 * @generated
	 */
	String getErrorClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DynamicUnit#getErrorClass <em>Error Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Class</em>' attribute.
	 * @see #getErrorClass()
	 * @generated
	 */
	void setErrorClass(String value);

} // DynamicUnit

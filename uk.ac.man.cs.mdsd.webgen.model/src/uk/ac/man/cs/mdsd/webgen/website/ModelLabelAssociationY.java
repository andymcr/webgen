/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Label Association Y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociationY#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociationY#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociationY#getDynamicLabel <em>Dynamic Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociationY#isUseAssociationSource <em>Use Association Source</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelAssociationY()
 * @model
 * @generated
 */
public interface ModelLabelAssociationY extends ModelLabelFeatureY {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelAssociationY_Name()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\t\'\'\r\nelse \r\n\tif association.oclIsTypeOf(ViewAssociation) then\r\n\t\tassociation.oclAsType(ViewAssociation).name\r\n\telse if useAssociationSource then\r\n\t\tassociation.oclAsType(EntityAssociation).name\r\n\telse\r\n\t\tassociation.oclAsType(EntityAssociation).targetFeatureName \r\n\tendif endif\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociationY#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(EntityAssociation)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelAssociationY_Association()
	 * @model required="true"
	 * @generated
	 */
	EntityAssociation getAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociationY#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(EntityAssociation value);

	/**
	 * Returns the value of the '<em><b>Dynamic Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Label</em>' reference.
	 * @see #setDynamicLabel(ModelLabelY)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelAssociationY_DynamicLabel()
	 * @model
	 * @generated
	 */
	ModelLabelY getDynamicLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociationY#getDynamicLabel <em>Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Label</em>' reference.
	 * @see #getDynamicLabel()
	 * @generated
	 */
	void setDynamicLabel(ModelLabelY value);

	/**
	 * Returns the value of the '<em><b>Use Association Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Association Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Association Source</em>' attribute.
	 * @see #setUseAssociationSource(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelAssociationY_UseAssociationSource()
	 * @model
	 * @generated
	 */
	boolean isUseAssociationSource();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociationY#isUseAssociationSource <em>Use Association Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Association Source</em>' attribute.
	 * @see #isUseAssociationSource()
	 * @generated
	 */
	void setUseAssociationSource(boolean value);

} // ModelLabelAssociationY

/**
 * <copyright>
 * </copyright>
 *
 * $Id: Service.java,v 1.18 2014/03/04 19:42:24 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getModelName <em>Model Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#isView <em>View</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getViewName <em>View Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getEncapsulates <em>Encapsulates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getDisplayLabels <em>Display Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyIncludeFeaturesOnce includedFeaturesMustBeFromEncapsulated multipleEntitiesRequiresModelName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL onlyIncludeFeaturesOnce='features->isUnique(f |\r\n\tif f.oclIsTypeOf(ServiceEntityElement) then\r\n\t\tf.oclAsType(ServiceEntityElement).feature\r\n\telse\r\n\t\tf.oclAsType(ServiceEntityAssociation).feature\r\n\tendif)' includedFeaturesMustBeFromEncapsulated='let features : Sequence(Feature)\r\n\t= encapsulates->collect(e | e.features)->union(encapsulates->collect(e | e.associationEnds))\r\n\tin features\r\n\t\t->select(f | f.oclIsKindOf(IncludedFeature))\r\n\t\t->forAll(f | features->includes(\r\n\t\t\tif f.oclIsTypeOf(ServiceEntityElement) then\r\n\t\t\t\tf.oclAsType(ServiceEntityElement).feature\r\n\t\t\telse\r\n\t\t\t\tf.oclAsType(ServiceEntityAssociation).feature\r\n\t\t\tendif))' multipleEntitiesRequiresModelName='encapsulates->size() > 1 implies not modelName.oclIsUndefined()'"
 * @generated
 */
public interface Service extends NamedElement, UnitSource {
	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_ModelName()
	 * @model ordered="false"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Service#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see #setView(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_View()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isView();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Service#isView <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' attribute.
	 * @see #isView()
	 * @generated
	 */
	void setView(boolean value);

	/**
	 * Returns the value of the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Name</em>' attribute.
	 * @see #setViewName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_ViewName()
	 * @model ordered="false"
	 * @generated
	 */
	String getViewName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Service#getViewName <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' attribute.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(String value);

	/**
	 * Returns the value of the '<em><b>Encapsulates</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Entity}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getServedBy <em>Served By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_Encapsulates()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Entity#getServedBy
	 * @model opposite="servedBy" required="true"
	 * @generated
	 */
	List<Entity> getEncapsulates();

	/**
	 * Returns the value of the '<em><b>Display Labels</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.ModelLabel}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabel#getLabelFor <em>Label For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Labels</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_DisplayLabels()
	 * @see uk.ac.man.cs.mdsd.webgen.website.ModelLabel#getLabelFor
	 * @model opposite="labelFor" containment="true"
	 * @generated
	 */
	List<ModelLabel> getDisplayLabels();

	/**
	 * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Selection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_Selections()
	 * @model containment="true"
	 * @generated
	 */
	List<Selection> getSelections();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.ServiceFeature}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_Features()
	 * @see uk.ac.man.cs.mdsd.webgen.website.ServiceFeature#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	List<ServiceFeature> getFeatures();

} // Service

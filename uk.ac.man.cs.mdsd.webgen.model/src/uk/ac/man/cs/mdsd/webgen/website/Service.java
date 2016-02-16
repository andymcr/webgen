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
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getEncapsulates <em>Encapsulates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getSelections <em>Selections</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyIncludeFeaturesOnce featuresMustBeFromEncapsulated'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL onlyIncludeFeaturesOnce='features->isUnique(f |\r\n\tif f.oclIsTypeOf(ServiceAttribute) then\r\n\t\tf.oclAsType(ServiceAttribute).attribute\r\n\telse\r\n\t\tf.oclAsType(ServiceAssociation).association\r\n\tendif)' featuresMustBeFromEncapsulated='let encapsulatedFeatures : Collection(Feature)\r\n\t= let entities : Sequence(Entity)\r\n\t\t= encapsulates->select(e | e.oclIsTypeOf(Entity)).oclAsType(Entity)\r\n\t\tin entities->collect(e | e.features).oclAsType(Feature)\r\n\t\t\t->union(entities->collect(e | e.associationEnds).oclAsType(Feature))\r\n--\t\t\t->union(encapsulates->select(v | v.oclIsTypeOf(View)).oclAsType(View)\r\n--\t\t\t\t->collect(v | v.features).oclAsType(Feature))\r\nin features\r\n\t->forAll(f | encapsulatedFeatures->includes(\r\n\t\tif f.oclIsTypeOf(ServiceAttribute) then\r\n\t\t\tf.oclAsType(ServiceAttribute).attribute\r\n\t\telse\r\n\t\t\tf.oclAsType(ServiceAssociation).association\r\n\t\tendif))'"
 * @generated
 */
public interface Service extends NamedElement, UnitSource {
	/**
	 * Returns the value of the '<em><b>Encapsulates</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getServedBy <em>Served By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_Encapsulates()
	 * @see uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getServedBy
	 * @model opposite="servedBy" required="true"
	 * @generated
	 */
	List<EntityOrView> getEncapsulates();

	/**
	 * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Selection}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_Selections()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Selection#getUsedBy
	 * @model opposite="usedBy" containment="true"
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

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.ServiceFeatureReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_Keys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<ServiceFeatureReference> getKeys();

} // Service

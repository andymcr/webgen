/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.webgen.base.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getLabelFor <em>Label For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getFormat <em>Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#isCustomise <em>Customise</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getSerializationGroups <em>Serialization Groups</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getModelLabel()
 * @model
 * @generated
 */
public interface ModelLabel extends NamedElement, Label {
	/**
	 * Returns the value of the '<em><b>Label For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label For</em>' container reference.
	 * @see #setLabelFor(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getModelLabel_LabelFor()
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getLabels
	 * @model opposite="labels" required="true" transient="false"
	 * @generated
	 */
	EntityOrView getLabelFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getLabelFor <em>Label For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label For</em>' container reference.
	 * @see #getLabelFor()
	 * @generated
	 */
	void setLabelFor(EntityOrView value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getModelLabel_Format()
	 * @model required="true"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Customise</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customise</em>' attribute.
	 * @see #setCustomise(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getModelLabel_Customise()
	 * @model default="false"
	 * @generated
	 */
	boolean isCustomise();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#isCustomise <em>Customise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customise</em>' attribute.
	 * @see #isCustomise()
	 * @generated
	 */
	void setCustomise(boolean value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelFeature}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getModelLabel_Features()
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelFeature#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<ModelLabelFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Serialization Groups</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialization Groups</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getModelLabel_SerializationGroups()
	 * @model
	 * @generated
	 */
	EList<SerializationGroup> getSerializationGroups();

} // ModelLabel

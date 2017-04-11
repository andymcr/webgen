/**
 */
package uk.ac.man.cs.mdsd.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.orm.SerializationGroup;

import uk.ac.man.cs.mdsd.service.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.api.ResourceSelection#getParentResource <em>Parent Resource</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.api.ResourceSelection#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.api.ResourceSelection#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.api.ResourceSelection#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.api.ResourceSelection#getDefaultSerializationGroups <em>Default Serialization Groups</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.api.ApiPackage#getResourceSelection()
 * @model
 * @generated
 */
public interface ResourceSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.api.Resource#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Resource</em>' container reference.
	 * @see #setParentResource(Resource)
	 * @see uk.ac.man.cs.mdsd.api.ApiPackage#getResourceSelection_ParentResource()
	 * @see uk.ac.man.cs.mdsd.api.Resource#getSelections
	 * @model opposite="selections" transient="false"
	 * @generated
	 */
	Resource getParentResource();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.api.ResourceSelection#getParentResource <em>Parent Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource</em>' container reference.
	 * @see #getParentResource()
	 * @generated
	 */
	void setParentResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.api.ApiPackage#getResourceSelection_Selection()
	 * @model required="true"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.api.ResourceSelection#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.api.ApiPackage#getResourceSelection_Name()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _xifexpression = null;\n<%uk.ac.man.cs.mdsd.service.Selection%> _selection = this.getSelection();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_selection, null));\nif (_notEquals)\n{\n\t<%uk.ac.man.cs.mdsd.service.Selection%> _selection_1 = this.getSelection();\n\t_xifexpression = _selection_1.getName();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see uk.ac.man.cs.mdsd.api.ApiPackage#getResourceSelection_UriElement()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.api.ResourceSelection#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Default Serialization Groups</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.SerializationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Serialization Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Serialization Groups</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.api.ApiPackage#getResourceSelection_DefaultSerializationGroups()
	 * @model
	 * @generated
	 */
	EList<SerializationGroup> getDefaultSerializationGroups();

} // ResourceSelection

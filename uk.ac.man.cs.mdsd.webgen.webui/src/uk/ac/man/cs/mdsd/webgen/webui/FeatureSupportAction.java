/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.service.BusinessOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Support Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getConfirmMessage <em>Confirm Message</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getFileExtension <em>File Extension</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getFeatureSupportAction()
 * @model
 * @generated
 */
public interface FeatureSupportAction extends InlineAction {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(BusinessOperation)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getFeatureSupportAction_Operation()
	 * @model required="true"
	 * @generated
	 */
	BusinessOperation getOperation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(BusinessOperation value);

	/**
	 * Returns the value of the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Message</em>' attribute.
	 * @see #setConfirmMessage(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getFeatureSupportAction_ConfirmMessage()
	 * @model
	 * @generated
	 */
	String getConfirmMessage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getConfirmMessage <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Message</em>' attribute.
	 * @see #getConfirmMessage()
	 * @generated
	 */
	void setConfirmMessage(String value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getFeatureSupportAction_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension</em>' attribute.
	 * @see #setFileExtension(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getFeatureSupportAction_FileExtension()
	 * @model
	 * @generated
	 */
	String getFileExtension();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.FeatureSupportAction#getFileExtension <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension</em>' attribute.
	 * @see #getFileExtension()
	 * @generated
	 */
	void setFileExtension(String value);

} // FeatureSupportAction

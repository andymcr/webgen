/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSingletonUnit()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SingletonUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference.
	 * @see #setContentType(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSingletonUnit_ContentType()
	 * @model required="true"
	 * @generated
	 */
	EntityOrView getContentType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit#getContentType <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(EntityOrView value);

} // SingletonUnit

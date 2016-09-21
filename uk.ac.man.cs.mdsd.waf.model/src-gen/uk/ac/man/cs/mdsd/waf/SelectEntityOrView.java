/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Entity Or View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.SelectEntityOrView#getEntityOrView <em>Entity Or View</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectEntityOrView()
 * @model
 * @generated
 */
public interface SelectEntityOrView extends SelectField {
	/**
	 * Returns the value of the '<em><b>Entity Or View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Or View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Or View</em>' reference.
	 * @see #setEntityOrView(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectEntityOrView_EntityOrView()
	 * @model
	 * @generated
	 */
	EntityOrView getEntityOrView();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.SelectEntityOrView#getEntityOrView <em>Entity Or View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Or View</em>' reference.
	 * @see #getEntityOrView()
	 * @generated
	 */
	void setEntityOrView(EntityOrView value);

} // SelectEntityOrView

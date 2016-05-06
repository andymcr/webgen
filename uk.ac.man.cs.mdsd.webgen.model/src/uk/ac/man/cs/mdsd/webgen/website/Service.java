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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getServes <em>Serves</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Service#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Serves</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getServedBy <em>Served By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serves</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serves</em>' reference.
	 * @see #setServes(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_Serves()
	 * @see uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getServedBy
	 * @model opposite="servedBy" required="true"
	 * @generated
	 */
	EntityOrView getServes();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Service#getServes <em>Serves</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serves</em>' reference.
	 * @see #getServes()
	 * @generated
	 */
	void setServes(EntityOrView value);

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
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.BusinessOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getService_Operations()
	 * @model containment="true"
	 * @generated
	 */
	List<BusinessOperation> getOperations();

} // Service

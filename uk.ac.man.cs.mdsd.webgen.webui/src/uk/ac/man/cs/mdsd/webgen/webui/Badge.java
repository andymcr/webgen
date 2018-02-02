/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.webgen.expression.Expression;
import uk.ac.man.cs.mdsd.webgen.expression.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Badge#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Badge#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Badge#getDisplayWhen <em>Display When</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Badge#getNewWhen <em>New When</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getBadge()
 * @model
 * @generated
 */
public interface Badge extends EObject {
	/**
	 * Returns the value of the '<em><b>Icon Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Name</em>' attribute.
	 * @see #setIconName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getBadge_IconName()
	 * @model default=""
	 * @generated
	 */
	String getIconName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Badge#getIconName <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Name</em>' attribute.
	 * @see #getIconName()
	 * @generated
	 */
	void setIconName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getBadge_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Badge#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display When</em>' containment reference.
	 * @see #setDisplayWhen(Predicate)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getBadge_DisplayWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getDisplayWhen();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Badge#getDisplayWhen <em>Display When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display When</em>' containment reference.
	 * @see #getDisplayWhen()
	 * @generated
	 */
	void setDisplayWhen(Predicate value);

	/**
	 * Returns the value of the '<em><b>New When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New When</em>' containment reference.
	 * @see #setNewWhen(Predicate)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getBadge_NewWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getNewWhen();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Badge#getNewWhen <em>New When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New When</em>' containment reference.
	 * @see #getNewWhen()
	 * @generated
	 */
	void setNewWhen(Predicate value);

} // Badge

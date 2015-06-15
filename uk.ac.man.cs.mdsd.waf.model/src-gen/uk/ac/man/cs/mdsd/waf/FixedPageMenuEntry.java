/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Page Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.FixedPageMenuEntry#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFixedPageMenuEntry()
 * @model
 * @generated
 */
public interface FixedPageMenuEntry extends MenuEntry, NamedDisplayElement
{
  /**
   * Returns the value of the '<em><b>Page</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Page</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Page</em>' reference.
   * @see #setPage(Page)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFixedPageMenuEntry_Page()
   * @model required="true"
   * @generated
   */
  Page getPage();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.FixedPageMenuEntry#getPage <em>Page</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Page</em>' reference.
   * @see #getPage()
   * @generated
   */
  void setPage(Page value);

} // FixedPageMenuEntry

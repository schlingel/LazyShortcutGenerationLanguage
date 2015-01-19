/**
 */
package schlingel.bplaced.net.lSGL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link schlingel.bplaced.net.lSGL.Enum#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see schlingel.bplaced.net.lSGL.LSGLPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Type
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link schlingel.bplaced.net.lSGL.EnumItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getEnum_Items()
   * @model containment="true"
   * @generated
   */
  EList<EnumItem> getItems();

} // Enum

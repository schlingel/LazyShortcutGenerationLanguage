/**
 */
package schlingel.bplaced.net.lSGL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link schlingel.bplaced.net.lSGL.Config#getName <em>Name</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Config#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see schlingel.bplaced.net.lSGL.LSGLPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getConfig_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link schlingel.bplaced.net.lSGL.Config#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link schlingel.bplaced.net.lSGL.ConfigProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getConfig_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ConfigProperty> getProperties();

} // Config

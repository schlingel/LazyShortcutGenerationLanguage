/**
 */
package schlingel.bplaced.net.lSGL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link schlingel.bplaced.net.lSGL.Generator#getName <em>Name</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Generator#getProperties <em>Properties</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Generator#getConfigs <em>Configs</em>}</li>
 * </ul>
 * </p>
 *
 * @see schlingel.bplaced.net.lSGL.LSGLPackage#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends EObject
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
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getGenerator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link schlingel.bplaced.net.lSGL.Generator#getName <em>Name</em>}' attribute.
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
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getGenerator_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ConfigProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
   * The list contents are of type {@link schlingel.bplaced.net.lSGL.Config}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configs</em>' containment reference list.
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getGenerator_Configs()
   * @model containment="true"
   * @generated
   */
  EList<Config> getConfigs();

} // Generator

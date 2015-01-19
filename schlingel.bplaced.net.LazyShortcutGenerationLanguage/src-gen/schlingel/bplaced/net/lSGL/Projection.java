/**
 */
package schlingel.bplaced.net.lSGL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link schlingel.bplaced.net.lSGL.Projection#getGenerators <em>Generators</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Projection#isExcluding <em>Excluding</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Projection#getName <em>Name</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Projection#getEntity <em>Entity</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Projection#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see schlingel.bplaced.net.lSGL.LSGLPackage#getProjection()
 * @model
 * @generated
 */
public interface Projection extends EObject
{
  /**
   * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generators</em>' containment reference list.
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getProjection_Generators()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getGenerators();

  /**
   * Returns the value of the '<em><b>Excluding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Excluding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Excluding</em>' attribute.
   * @see #setExcluding(boolean)
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getProjection_Excluding()
   * @model
   * @generated
   */
  boolean isExcluding();

  /**
   * Sets the value of the '{@link schlingel.bplaced.net.lSGL.Projection#isExcluding <em>Excluding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Excluding</em>' attribute.
   * @see #isExcluding()
   * @generated
   */
  void setExcluding(boolean value);

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
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getProjection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link schlingel.bplaced.net.lSGL.Projection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(EObject)
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getProjection_Entity()
   * @model containment="true"
   * @generated
   */
  EObject getEntity();

  /**
   * Sets the value of the '{@link schlingel.bplaced.net.lSGL.Projection#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(EObject value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link schlingel.bplaced.net.lSGL.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getProjection_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Projection

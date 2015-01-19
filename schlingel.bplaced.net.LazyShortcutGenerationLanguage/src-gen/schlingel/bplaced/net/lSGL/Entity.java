/**
 */
package schlingel.bplaced.net.lSGL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link schlingel.bplaced.net.lSGL.Entity#getGenerators <em>Generators</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Entity#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Entity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see schlingel.bplaced.net.lSGL.LSGLPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type
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
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getEntity_Generators()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getGenerators();

  /**
   * Returns the value of the '<em><b>Super Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Class</em>' containment reference.
   * @see #setSuperClass(EObject)
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getEntity_SuperClass()
   * @model containment="true"
   * @generated
   */
  EObject getSuperClass();

  /**
   * Sets the value of the '{@link schlingel.bplaced.net.lSGL.Entity#getSuperClass <em>Super Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Class</em>' containment reference.
   * @see #getSuperClass()
   * @generated
   */
  void setSuperClass(EObject value);

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
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getEntity_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Entity

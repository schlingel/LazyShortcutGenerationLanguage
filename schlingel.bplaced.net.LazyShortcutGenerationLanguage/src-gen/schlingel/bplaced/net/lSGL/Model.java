/**
 */
package schlingel.bplaced.net.lSGL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link schlingel.bplaced.net.lSGL.Model#getGenerators <em>Generators</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Model#getTypes <em>Types</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.Model#getProjections <em>Projections</em>}</li>
 * </ul>
 * </p>
 *
 * @see schlingel.bplaced.net.lSGL.LSGLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
   * The list contents are of type {@link schlingel.bplaced.net.lSGL.Generator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generators</em>' containment reference list.
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getModel_Generators()
   * @model containment="true"
   * @generated
   */
  EList<Generator> getGenerators();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link schlingel.bplaced.net.lSGL.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getModel_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

  /**
   * Returns the value of the '<em><b>Projections</b></em>' containment reference list.
   * The list contents are of type {@link schlingel.bplaced.net.lSGL.Projection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projections</em>' containment reference list.
   * @see schlingel.bplaced.net.lSGL.LSGLPackage#getModel_Projections()
   * @model containment="true"
   * @generated
   */
  EList<Projection> getProjections();

} // Model

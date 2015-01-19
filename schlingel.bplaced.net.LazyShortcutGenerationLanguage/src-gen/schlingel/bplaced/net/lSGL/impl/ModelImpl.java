/**
 */
package schlingel.bplaced.net.lSGL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import schlingel.bplaced.net.lSGL.Generator;
import schlingel.bplaced.net.lSGL.LSGLPackage;
import schlingel.bplaced.net.lSGL.Model;
import schlingel.bplaced.net.lSGL.Projection;
import schlingel.bplaced.net.lSGL.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link schlingel.bplaced.net.lSGL.impl.ModelImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.impl.ModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.impl.ModelImpl#getProjections <em>Projections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerators()
   * @generated
   * @ordered
   */
  protected EList<Generator> generators;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> types;

  /**
   * The cached value of the '{@link #getProjections() <em>Projections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjections()
   * @generated
   * @ordered
   */
  protected EList<Projection> projections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LSGLPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Generator> getGenerators()
  {
    if (generators == null)
    {
      generators = new EObjectContainmentEList<Generator>(Generator.class, this, LSGLPackage.MODEL__GENERATORS);
    }
    return generators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<Type>(Type.class, this, LSGLPackage.MODEL__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Projection> getProjections()
  {
    if (projections == null)
    {
      projections = new EObjectContainmentEList<Projection>(Projection.class, this, LSGLPackage.MODEL__PROJECTIONS);
    }
    return projections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LSGLPackage.MODEL__GENERATORS:
        return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
      case LSGLPackage.MODEL__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case LSGLPackage.MODEL__PROJECTIONS:
        return ((InternalEList<?>)getProjections()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LSGLPackage.MODEL__GENERATORS:
        return getGenerators();
      case LSGLPackage.MODEL__TYPES:
        return getTypes();
      case LSGLPackage.MODEL__PROJECTIONS:
        return getProjections();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LSGLPackage.MODEL__GENERATORS:
        getGenerators().clear();
        getGenerators().addAll((Collection<? extends Generator>)newValue);
        return;
      case LSGLPackage.MODEL__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case LSGLPackage.MODEL__PROJECTIONS:
        getProjections().clear();
        getProjections().addAll((Collection<? extends Projection>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LSGLPackage.MODEL__GENERATORS:
        getGenerators().clear();
        return;
      case LSGLPackage.MODEL__TYPES:
        getTypes().clear();
        return;
      case LSGLPackage.MODEL__PROJECTIONS:
        getProjections().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LSGLPackage.MODEL__GENERATORS:
        return generators != null && !generators.isEmpty();
      case LSGLPackage.MODEL__TYPES:
        return types != null && !types.isEmpty();
      case LSGLPackage.MODEL__PROJECTIONS:
        return projections != null && !projections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl

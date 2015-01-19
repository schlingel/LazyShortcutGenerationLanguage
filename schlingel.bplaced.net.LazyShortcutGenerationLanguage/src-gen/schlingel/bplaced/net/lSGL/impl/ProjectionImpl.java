/**
 */
package schlingel.bplaced.net.lSGL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import schlingel.bplaced.net.lSGL.Attribute;
import schlingel.bplaced.net.lSGL.LSGLPackage;
import schlingel.bplaced.net.lSGL.Projection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link schlingel.bplaced.net.lSGL.impl.ProjectionImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.impl.ProjectionImpl#isExcluding <em>Excluding</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.impl.ProjectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.impl.ProjectionImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link schlingel.bplaced.net.lSGL.impl.ProjectionImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectionImpl extends MinimalEObjectImpl.Container implements Projection
{
  /**
   * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerators()
   * @generated
   * @ordered
   */
  protected EList<EObject> generators;

  /**
   * The default value of the '{@link #isExcluding() <em>Excluding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExcluding()
   * @generated
   * @ordered
   */
  protected static final boolean EXCLUDING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExcluding() <em>Excluding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExcluding()
   * @generated
   * @ordered
   */
  protected boolean excluding = EXCLUDING_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected EObject entity;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectionImpl()
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
    return LSGLPackage.Literals.PROJECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getGenerators()
  {
    if (generators == null)
    {
      generators = new EObjectContainmentEList<EObject>(EObject.class, this, LSGLPackage.PROJECTION__GENERATORS);
    }
    return generators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExcluding()
  {
    return excluding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExcluding(boolean newExcluding)
  {
    boolean oldExcluding = excluding;
    excluding = newExcluding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LSGLPackage.PROJECTION__EXCLUDING, oldExcluding, excluding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LSGLPackage.PROJECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(EObject newEntity, NotificationChain msgs)
  {
    EObject oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LSGLPackage.PROJECTION__ENTITY, oldEntity, newEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(EObject newEntity)
  {
    if (newEntity != entity)
    {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LSGLPackage.PROJECTION__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LSGLPackage.PROJECTION__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LSGLPackage.PROJECTION__ENTITY, newEntity, newEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, LSGLPackage.PROJECTION__ATTRIBUTES);
    }
    return attributes;
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
      case LSGLPackage.PROJECTION__GENERATORS:
        return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
      case LSGLPackage.PROJECTION__ENTITY:
        return basicSetEntity(null, msgs);
      case LSGLPackage.PROJECTION__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case LSGLPackage.PROJECTION__GENERATORS:
        return getGenerators();
      case LSGLPackage.PROJECTION__EXCLUDING:
        return isExcluding();
      case LSGLPackage.PROJECTION__NAME:
        return getName();
      case LSGLPackage.PROJECTION__ENTITY:
        return getEntity();
      case LSGLPackage.PROJECTION__ATTRIBUTES:
        return getAttributes();
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
      case LSGLPackage.PROJECTION__GENERATORS:
        getGenerators().clear();
        getGenerators().addAll((Collection<? extends EObject>)newValue);
        return;
      case LSGLPackage.PROJECTION__EXCLUDING:
        setExcluding((Boolean)newValue);
        return;
      case LSGLPackage.PROJECTION__NAME:
        setName((String)newValue);
        return;
      case LSGLPackage.PROJECTION__ENTITY:
        setEntity((EObject)newValue);
        return;
      case LSGLPackage.PROJECTION__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
      case LSGLPackage.PROJECTION__GENERATORS:
        getGenerators().clear();
        return;
      case LSGLPackage.PROJECTION__EXCLUDING:
        setExcluding(EXCLUDING_EDEFAULT);
        return;
      case LSGLPackage.PROJECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LSGLPackage.PROJECTION__ENTITY:
        setEntity((EObject)null);
        return;
      case LSGLPackage.PROJECTION__ATTRIBUTES:
        getAttributes().clear();
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
      case LSGLPackage.PROJECTION__GENERATORS:
        return generators != null && !generators.isEmpty();
      case LSGLPackage.PROJECTION__EXCLUDING:
        return excluding != EXCLUDING_EDEFAULT;
      case LSGLPackage.PROJECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LSGLPackage.PROJECTION__ENTITY:
        return entity != null;
      case LSGLPackage.PROJECTION__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (excluding: ");
    result.append(excluding);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ProjectionImpl

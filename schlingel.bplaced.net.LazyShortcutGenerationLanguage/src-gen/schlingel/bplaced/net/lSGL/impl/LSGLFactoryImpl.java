/**
 */
package schlingel.bplaced.net.lSGL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import schlingel.bplaced.net.lSGL.Annotation;
import schlingel.bplaced.net.lSGL.Attribute;
import schlingel.bplaced.net.lSGL.Config;
import schlingel.bplaced.net.lSGL.ConfigProperty;
import schlingel.bplaced.net.lSGL.Entity;
import schlingel.bplaced.net.lSGL.EnumItem;
import schlingel.bplaced.net.lSGL.Generator;
import schlingel.bplaced.net.lSGL.ID;
import schlingel.bplaced.net.lSGL.LSGLFactory;
import schlingel.bplaced.net.lSGL.LSGLPackage;
import schlingel.bplaced.net.lSGL.Model;
import schlingel.bplaced.net.lSGL.Projection;
import schlingel.bplaced.net.lSGL.STRING;
import schlingel.bplaced.net.lSGL.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LSGLFactoryImpl extends EFactoryImpl implements LSGLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LSGLFactory init()
  {
    try
    {
      LSGLFactory theLSGLFactory = (LSGLFactory)EPackage.Registry.INSTANCE.getEFactory(LSGLPackage.eNS_URI);
      if (theLSGLFactory != null)
      {
        return theLSGLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LSGLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LSGLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LSGLPackage.MODEL: return createModel();
      case LSGLPackage.GENERATOR: return createGenerator();
      case LSGLPackage.CONFIG: return createConfig();
      case LSGLPackage.CONFIG_PROPERTY: return createConfigProperty();
      case LSGLPackage.TYPE: return createType();
      case LSGLPackage.ENUM: return createEnum();
      case LSGLPackage.ENUM_ITEM: return createEnumItem();
      case LSGLPackage.ENTITY: return createEntity();
      case LSGLPackage.ATTRIBUTE: return createAttribute();
      case LSGLPackage.ANNOTATION: return createAnnotation();
      case LSGLPackage.PROJECTION: return createProjection();
      case LSGLPackage.STRING: return createSTRING();
      case LSGLPackage.ID: return createID();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generator createGenerator()
  {
    GeneratorImpl generator = new GeneratorImpl();
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Config createConfig()
  {
    ConfigImpl config = new ConfigImpl();
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigProperty createConfigProperty()
  {
    ConfigPropertyImpl configProperty = new ConfigPropertyImpl();
    return configProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public schlingel.bplaced.net.lSGL.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumItem createEnumItem()
  {
    EnumItemImpl enumItem = new EnumItemImpl();
    return enumItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Projection createProjection()
  {
    ProjectionImpl projection = new ProjectionImpl();
    return projection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING createSTRING()
  {
    STRINGImpl string = new STRINGImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ID createID()
  {
    IDImpl id = new IDImpl();
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LSGLPackage getLSGLPackage()
  {
    return (LSGLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LSGLPackage getPackage()
  {
    return LSGLPackage.eINSTANCE;
  }

} //LSGLFactoryImpl

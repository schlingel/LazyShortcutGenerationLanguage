/**
 */
package schlingel.bplaced.net.lSGL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see schlingel.bplaced.net.lSGL.LSGLFactory
 * @model kind="package"
 * @generated
 */
public interface LSGLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lSGL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bplaced.schlingel/net/LSGL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lSGL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LSGLPackage eINSTANCE = schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl.init();

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.ModelImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Generators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GENERATORS = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TYPES = 1;

  /**
   * The feature id for the '<em><b>Projections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROJECTIONS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.GeneratorImpl <em>Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.GeneratorImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getGenerator()
   * @generated
   */
  int GENERATOR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>Configs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__CONFIGS = 2;

  /**
   * The number of structural features of the '<em>Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.ConfigImpl <em>Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.ConfigImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getConfig()
   * @generated
   */
  int CONFIG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.ConfigPropertyImpl <em>Config Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.ConfigPropertyImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getConfigProperty()
   * @generated
   */
  int CONFIG_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Config Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.TypeImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.EnumImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__ITEMS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.EnumItemImpl <em>Enum Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.EnumItemImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getEnumItem()
   * @generated
   */
  int ENUM_ITEM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ITEM__VALUE = 1;

  /**
   * The number of structural features of the '<em>Enum Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.EntityImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Generators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__GENERATORS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_CLASS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.AttributeImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.AnnotationImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.ProjectionImpl <em>Projection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.ProjectionImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getProjection()
   * @generated
   */
  int PROJECTION = 10;

  /**
   * The feature id for the '<em><b>Generators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION__GENERATORS = 0;

  /**
   * The feature id for the '<em><b>Excluding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION__EXCLUDING = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION__NAME = 2;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION__ENTITY = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION__ATTRIBUTES = 4;

  /**
   * The number of structural features of the '<em>Projection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.STRINGImpl <em>STRING</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.STRINGImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getSTRING()
   * @generated
   */
  int STRING = 11;

  /**
   * The number of structural features of the '<em>STRING</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link schlingel.bplaced.net.lSGL.impl.IDImpl <em>ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see schlingel.bplaced.net.lSGL.impl.IDImpl
   * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getID()
   * @generated
   */
  int ID = 12;

  /**
   * The number of structural features of the '<em>ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see schlingel.bplaced.net.lSGL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Model#getGenerators <em>Generators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generators</em>'.
   * @see schlingel.bplaced.net.lSGL.Model#getGenerators()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Generators();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Model#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see schlingel.bplaced.net.lSGL.Model#getTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Types();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Model#getProjections <em>Projections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projections</em>'.
   * @see schlingel.bplaced.net.lSGL.Model#getProjections()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Projections();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.Generator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generator</em>'.
   * @see schlingel.bplaced.net.lSGL.Generator
   * @generated
   */
  EClass getGenerator();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.Generator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see schlingel.bplaced.net.lSGL.Generator#getName()
   * @see #getGenerator()
   * @generated
   */
  EAttribute getGenerator_Name();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Generator#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see schlingel.bplaced.net.lSGL.Generator#getProperties()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Generator#getConfigs <em>Configs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configs</em>'.
   * @see schlingel.bplaced.net.lSGL.Generator#getConfigs()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_Configs();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.Config <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config</em>'.
   * @see schlingel.bplaced.net.lSGL.Config
   * @generated
   */
  EClass getConfig();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.Config#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see schlingel.bplaced.net.lSGL.Config#getName()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_Name();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Config#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see schlingel.bplaced.net.lSGL.Config#getProperties()
   * @see #getConfig()
   * @generated
   */
  EReference getConfig_Properties();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.ConfigProperty <em>Config Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config Property</em>'.
   * @see schlingel.bplaced.net.lSGL.ConfigProperty
   * @generated
   */
  EClass getConfigProperty();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.ConfigProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see schlingel.bplaced.net.lSGL.ConfigProperty#getName()
   * @see #getConfigProperty()
   * @generated
   */
  EAttribute getConfigProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.ConfigProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see schlingel.bplaced.net.lSGL.ConfigProperty#getValue()
   * @see #getConfigProperty()
   * @generated
   */
  EAttribute getConfigProperty_Value();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see schlingel.bplaced.net.lSGL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see schlingel.bplaced.net.lSGL.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see schlingel.bplaced.net.lSGL.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Enum#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see schlingel.bplaced.net.lSGL.Enum#getItems()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Items();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.EnumItem <em>Enum Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Item</em>'.
   * @see schlingel.bplaced.net.lSGL.EnumItem
   * @generated
   */
  EClass getEnumItem();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.EnumItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see schlingel.bplaced.net.lSGL.EnumItem#getName()
   * @see #getEnumItem()
   * @generated
   */
  EAttribute getEnumItem_Name();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.EnumItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see schlingel.bplaced.net.lSGL.EnumItem#getValue()
   * @see #getEnumItem()
   * @generated
   */
  EAttribute getEnumItem_Value();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see schlingel.bplaced.net.lSGL.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Entity#getGenerators <em>Generators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generators</em>'.
   * @see schlingel.bplaced.net.lSGL.Entity#getGenerators()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Generators();

  /**
   * Returns the meta object for the containment reference '{@link schlingel.bplaced.net.lSGL.Entity#getSuperClass <em>Super Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Class</em>'.
   * @see schlingel.bplaced.net.lSGL.Entity#getSuperClass()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperClass();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see schlingel.bplaced.net.lSGL.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see schlingel.bplaced.net.lSGL.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Attribute#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see schlingel.bplaced.net.lSGL.Attribute#getAnnotations()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link schlingel.bplaced.net.lSGL.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see schlingel.bplaced.net.lSGL.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see schlingel.bplaced.net.lSGL.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see schlingel.bplaced.net.lSGL.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.Annotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see schlingel.bplaced.net.lSGL.Annotation#getName()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Name();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.Annotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see schlingel.bplaced.net.lSGL.Annotation#getValue()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Value();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.Projection <em>Projection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Projection</em>'.
   * @see schlingel.bplaced.net.lSGL.Projection
   * @generated
   */
  EClass getProjection();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Projection#getGenerators <em>Generators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generators</em>'.
   * @see schlingel.bplaced.net.lSGL.Projection#getGenerators()
   * @see #getProjection()
   * @generated
   */
  EReference getProjection_Generators();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.Projection#isExcluding <em>Excluding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Excluding</em>'.
   * @see schlingel.bplaced.net.lSGL.Projection#isExcluding()
   * @see #getProjection()
   * @generated
   */
  EAttribute getProjection_Excluding();

  /**
   * Returns the meta object for the attribute '{@link schlingel.bplaced.net.lSGL.Projection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see schlingel.bplaced.net.lSGL.Projection#getName()
   * @see #getProjection()
   * @generated
   */
  EAttribute getProjection_Name();

  /**
   * Returns the meta object for the containment reference '{@link schlingel.bplaced.net.lSGL.Projection#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see schlingel.bplaced.net.lSGL.Projection#getEntity()
   * @see #getProjection()
   * @generated
   */
  EReference getProjection_Entity();

  /**
   * Returns the meta object for the containment reference list '{@link schlingel.bplaced.net.lSGL.Projection#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see schlingel.bplaced.net.lSGL.Projection#getAttributes()
   * @see #getProjection()
   * @generated
   */
  EReference getProjection_Attributes();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.STRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STRING</em>'.
   * @see schlingel.bplaced.net.lSGL.STRING
   * @generated
   */
  EClass getSTRING();

  /**
   * Returns the meta object for class '{@link schlingel.bplaced.net.lSGL.ID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID</em>'.
   * @see schlingel.bplaced.net.lSGL.ID
   * @generated
   */
  EClass getID();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LSGLFactory getLSGLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.ModelImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GENERATORS = eINSTANCE.getModel_Generators();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TYPES = eINSTANCE.getModel_Types();

    /**
     * The meta object literal for the '<em><b>Projections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROJECTIONS = eINSTANCE.getModel_Projections();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.GeneratorImpl <em>Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.GeneratorImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getGenerator()
     * @generated
     */
    EClass GENERATOR = eINSTANCE.getGenerator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATOR__NAME = eINSTANCE.getGenerator_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__PROPERTIES = eINSTANCE.getGenerator_Properties();

    /**
     * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__CONFIGS = eINSTANCE.getGenerator_Configs();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.ConfigImpl <em>Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.ConfigImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getConfig()
     * @generated
     */
    EClass CONFIG = eINSTANCE.getConfig();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__NAME = eINSTANCE.getConfig_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG__PROPERTIES = eINSTANCE.getConfig_Properties();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.ConfigPropertyImpl <em>Config Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.ConfigPropertyImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getConfigProperty()
     * @generated
     */
    EClass CONFIG_PROPERTY = eINSTANCE.getConfigProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG_PROPERTY__NAME = eINSTANCE.getConfigProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG_PROPERTY__VALUE = eINSTANCE.getConfigProperty_Value();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.TypeImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.EnumImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__ITEMS = eINSTANCE.getEnum_Items();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.EnumItemImpl <em>Enum Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.EnumItemImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getEnumItem()
     * @generated
     */
    EClass ENUM_ITEM = eINSTANCE.getEnumItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ITEM__NAME = eINSTANCE.getEnumItem_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ITEM__VALUE = eINSTANCE.getEnumItem_Value();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.EntityImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__GENERATORS = eINSTANCE.getEntity_Generators();

    /**
     * The meta object literal for the '<em><b>Super Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_CLASS = eINSTANCE.getEntity_SuperClass();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.AttributeImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__ANNOTATIONS = eINSTANCE.getAttribute_Annotations();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.AnnotationImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.ProjectionImpl <em>Projection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.ProjectionImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getProjection()
     * @generated
     */
    EClass PROJECTION = eINSTANCE.getProjection();

    /**
     * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTION__GENERATORS = eINSTANCE.getProjection_Generators();

    /**
     * The meta object literal for the '<em><b>Excluding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECTION__EXCLUDING = eINSTANCE.getProjection_Excluding();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECTION__NAME = eINSTANCE.getProjection_Name();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTION__ENTITY = eINSTANCE.getProjection_Entity();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTION__ATTRIBUTES = eINSTANCE.getProjection_Attributes();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.STRINGImpl <em>STRING</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.STRINGImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getSTRING()
     * @generated
     */
    EClass STRING = eINSTANCE.getSTRING();

    /**
     * The meta object literal for the '{@link schlingel.bplaced.net.lSGL.impl.IDImpl <em>ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see schlingel.bplaced.net.lSGL.impl.IDImpl
     * @see schlingel.bplaced.net.lSGL.impl.LSGLPackageImpl#getID()
     * @generated
     */
    EClass ID = eINSTANCE.getID();

  }

} //LSGLPackage

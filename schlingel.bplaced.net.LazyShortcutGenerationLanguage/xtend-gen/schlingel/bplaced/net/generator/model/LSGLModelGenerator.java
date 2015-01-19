package schlingel.bplaced.net.generator.model;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.io.File;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import schlingel.bplaced.net.lSGL.ConfigProperty;
import schlingel.bplaced.net.lSGL.Entity;
import schlingel.bplaced.net.lSGL.Generator;

@SuppressWarnings("all")
public class LSGLModelGenerator implements IGenerator {
  private static class ModelGenConfig {
    private String outputDir;
    
    private String packageName;
    
    public String getAbsoluteOutputDir() {
      String _replaceAll = this.packageName.replaceAll("\\.", "/");
      File _file = new File(this.outputDir, _replaceAll);
      return _file.getAbsolutePath();
    }
  }
  
  private final static String MODEL_GENERATOR_NAME = "models";
  
  private final static String OUTPUT_NAME = "outputdir";
  
  private LSGLModelGenerator.ModelGenConfig config;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    LSGLModelGenerator.ModelGenConfig _cfg = this.getCfg(input);
    this.config = _cfg;
    TreeIterator<EObject> _allContents = input.getAllContents();
    Iterator<Entity> _filter = Iterators.<Entity>filter(_allContents, Entity.class);
    final Function1<Entity, Entity> _function = new Function1<Entity, Entity>() {
      public Entity apply(final Entity x) {
        return ((Entity) x);
      }
    };
    final Iterator<Entity> entities = IteratorExtensions.<Entity, Entity>map(_filter, _function);
    final Procedure1<Entity> _function_1 = new Procedure1<Entity>() {
      public void apply(final Entity entity) {
        String _outputFile = LSGLModelGenerator.this.getOutputFile(entity);
        String _plus = (_outputFile + ".java");
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("package ");
        _builder.append(LSGLModelGenerator.this.config.packageName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("public class ");
        String _name = entity.getName();
        _builder.append(_name, "");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("}\t\t\t\t");
        _builder.newLine();
        fsa.generateFile(_plus, _builder);
      }
    };
    IteratorExtensions.<Entity>forEach(entities, _function_1);
  }
  
  private LSGLModelGenerator.ModelGenConfig getCfg(final Resource res) {
    LSGLModelGenerator.ModelGenConfig _xblockexpression = null;
    {
      TreeIterator<EObject> _allContents = res.getAllContents();
      Iterator<Generator> _filter = Iterators.<Generator>filter(_allContents, Generator.class);
      final Function1<Generator, Generator> _function = new Function1<Generator, Generator>() {
        public Generator apply(final Generator x) {
          return ((Generator) x);
        }
      };
      final Iterator<Generator> generators = IteratorExtensions.<Generator, Generator>map(_filter, _function);
      final Function1<Generator, Boolean> _function_1 = new Function1<Generator, Boolean>() {
        public Boolean apply(final Generator gen) {
          String _name = gen.getName();
          String _lowerCase = _name.toLowerCase();
          return Boolean.valueOf(_lowerCase.equals(LSGLModelGenerator.MODEL_GENERATOR_NAME));
        }
      };
      final Generator modelGen = IteratorExtensions.<Generator>findFirst(generators, _function_1);
      final LSGLModelGenerator.ModelGenConfig cfg = new LSGLModelGenerator.ModelGenConfig();
      boolean _equals = Objects.equal(modelGen, null);
      if (_equals) {
        String _defaultOutputDir = this.getDefaultOutputDir();
        cfg.outputDir = _defaultOutputDir;
        return cfg;
      }
      EList<ConfigProperty> _properties = modelGen.getProperties();
      final String outputDir = this.getPropertyValue(_properties, LSGLModelGenerator.OUTPUT_NAME);
      EList<ConfigProperty> _properties_1 = modelGen.getProperties();
      final String packageName = this.getPropertyValue(_properties_1, "packageName");
      boolean _notEquals = (!Objects.equal(outputDir, null));
      if (_notEquals) {
        cfg.outputDir = outputDir;
      } else {
        String _defaultOutputDir_1 = this.getDefaultOutputDir();
        cfg.outputDir = _defaultOutputDir_1;
      }
      boolean _notEquals_1 = (!Objects.equal(packageName, null));
      if (_notEquals_1) {
        cfg.packageName = packageName;
      } else {
        cfg.packageName = "default";
      }
      _xblockexpression = cfg;
    }
    return _xblockexpression;
  }
  
  private String getPropertyValue(final EList<ConfigProperty> props, final String name) {
    String _xblockexpression = null;
    {
      final Function1<ConfigProperty, Boolean> _function = new Function1<ConfigProperty, Boolean>() {
        public Boolean apply(final ConfigProperty cfgItem) {
          String _name = cfgItem.getName();
          String _lowerCase = _name.toLowerCase();
          return Boolean.valueOf(_lowerCase.equals(name));
        }
      };
      final ConfigProperty attr = IterableExtensions.<ConfigProperty>findFirst(props, _function);
      boolean _equals = Objects.equal(attr, null);
      if (_equals) {
        return null;
      }
      _xblockexpression = attr.getValue();
    }
    return _xblockexpression;
  }
  
  private String getDefaultOutputDir() {
    return "./";
  }
  
  private String getOutputFile(final Entity entity) {
    String _absoluteOutputDir = this.config.getAbsoluteOutputDir();
    String _name = entity.getName();
    File _file = new File(_absoluteOutputDir, _name);
    return _file.getAbsolutePath();
  }
}

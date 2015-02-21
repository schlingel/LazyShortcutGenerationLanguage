package schlingel.bplaced.net.generator.model;

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import schlingel.bplaced.net.lSGL.Generator
import java.nio.file.Paths
import schlingel.bplaced.net.lSGL.ConfigProperty
import org.eclipse.emf.common.util.EList
import schlingel.bplaced.net.lSGL.Entity
import java.io.File
import schlingel.bplaced.net.lSGL.Attribute
import schlingel.bplaced.net.lSGL.Type
import org.eclipse.internal.xtend.util.QualifiedName
import schlingel.bplaced.net.lSGL.PrimaryType
import javax.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import schlingel.bplaced.net.lSGL.PrimaryObjectType

class LSGLModelGenerator implements IGenerator {
	@Inject extension IQualifiedNameProvider
	
	private static final String MODEL_GENERATOR_NAME = "models"
	private static final String OUTPUT_NAME="outputdir"

	private static class ModelGenConfig {
		private String outputDir;
		private String packageName;
		def String getAbsoluteOutputDir() {
			new File(outputDir, packageName.replaceAll("\\.", "/")).absolutePath
		}
	}

	private ModelGenConfig config

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		config = getCfg(input)
		
		val entities = input.allContents.filter(typeof(Entity)).map[x | return x as Entity]
		entities.forEach[entity | 
			fsa.generateFile(getOutputFile(entity) + ".java", 
				'''
package «config.packageName»;

«getImports(entity)»

public class «entity.name» «getSuperClassToken(entity)»{
	«getAttributesOf(entity)»
	«getGetterAndSetterOf(entity)»
}	

				'''
			)
		]
	}
	
	def private String getImports(Entity entity) {
		var hasMap = entity.attributes.findFirst[it.isMap] != null;
		var hasList = entity.attributes.findFirst[it.isList] != null;
		
'''
«IF hasMap»
import java.util.AbstractMap;
import java.util.HashMap;
«ENDIF»
«IF hasList»
import java.util.List;
import java.util.ArrayList;
«ENDIF»
'''
	}
	
	def private String getSuperClassToken(Entity entity) {
		if(entity.superClass != null) {
			return String.format("extends %s ", entity.superClass.class.name);
		}
		
		return "";
	}

	def private String getAttributesOf(Entity entity) {
		return 
'''
«FOR attr : entity.attributes»
	«getAnnotationsOf(attr)»
	«getAttributeOf(attr)»
«ENDFOR»
''';
	}
	
	def private String getAnnotationsOf(Attribute attr) {
		//TODO: add mechanism to load annotations provider
		return "";
	}
	
	def private String getAttributeOf(Attribute attr) {
		return String.format("private %s %s;", getAttributeTypeOf(attr), attr.name);		
	}

	def private String getAttributeTypeOf(Attribute attr) {
		var token = getTypenameOf(attr.type)
		
		if(attr.isIsList) {
			token = String.format("List<%s>", getTypenameOf(attr.type))
		} else if(attr.isIsArray) {
			token = String.format("%s[]", getTypenameOf(attr.type));
		} else if(attr.isIsMap) {
			token = String.format("AbstractMap<%s, %s>", getTypenameOf(attr.key), getTypenameOf(attr.type));
		}
		
		return token;
	}

	def dispatch getTypenameOf(schlingel.bplaced.net.lSGL.Enum enumType) {
		return enumType.name;
	}
	
	def dispatch String getTypenameOf(Entity entityType) {
		return entityType.name;
	}
	
	def dispatch String getTypenameOf(QualifiedName name) {
		return name.toString
	}
	
	def dispatch String getTypenameOf(PrimaryType primaryType) {
		var token = primaryType.token.toString
		
		if(token.equals("string")) {
			return "String";
		}
		
		if(token.equals("bool")) {
			return "boolean";
		}
		
		return token
	}
	
	def dispatch String getTypenameOf(PrimaryObjectType primaryType) {
		switch(primaryType.token) {
			String case "int" : return "Integer"
			String case "float" : return "Float"
			String case "double" : return "Double"
			String case "char" : return "Character"
			String case "bool" : return "Boolean"
		}
		
		return "Object"	
	}

	def private String getGetterAndSetterOf(Entity entity) {
'''
	«FOR attr : entity.attributes»
	
	public «getAttributeTypeOf(attr)» «getMethodName("get", attr.name)»() {
		return «attr.name»;
	}
	
	public void «getMethodName("set", attr.name)»(«getAttributeTypeOf(attr)» «attr.name») {
		this.«attr.name» = «attr.name»;
	}
	«ENDFOR»
'''
	}
	
	def private String getMethodName(String prefix, String name) {
		var curName = name.charAt(0).toString.toUpperCase + name.substring(1);
		return String.format("%s%s", prefix, curName)
	}

	def private ModelGenConfig getCfg(Resource res) {
		val generators = res.allContents.filter(typeof(Generator)).map[x|return x as Generator]
		val modelGen = generators.findFirst[gen|gen.name.toLowerCase.equals(MODEL_GENERATOR_NAME)]
		val cfg = new ModelGenConfig()

		if (modelGen == null) {
			cfg.outputDir = defaultOutputDir
			return cfg
		}

		val outputDir = getPropertyValue(modelGen.properties, OUTPUT_NAME)
		val packageName = getPropertyValue(modelGen.properties, "packageName") 

		if(outputDir != null) {
			cfg.outputDir = outputDir
		} else {
			cfg.outputDir = getDefaultOutputDir()
		}
		
		if(packageName != null) {
			cfg.packageName = packageName
		} else {
			cfg.packageName = "default"
		}

		cfg
	}
	
	def private getPropertyValue(EList<ConfigProperty> props, String name) {
		val attr = props.findFirst[cfgItem | cfgItem.name.toLowerCase.equals(name)]
		
		if(attr == null) {
			return null 
		}
		
		attr.value
	}
	
	def private getDefaultOutputDir() {
		'./'
	}
	
	def private String getOutputFile(Entity entity) {
		new File(config.absoluteOutputDir, entity.name).absolutePath
	}
}

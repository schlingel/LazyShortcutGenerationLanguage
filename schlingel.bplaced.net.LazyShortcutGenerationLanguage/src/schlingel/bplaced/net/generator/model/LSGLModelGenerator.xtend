package schlingel.bplaced.net.generator.model;

import java.io.File
import javax.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import schlingel.bplaced.net.lSGL.Attribute
import schlingel.bplaced.net.lSGL.AttributeType
import schlingel.bplaced.net.lSGL.ConfigProperty
import schlingel.bplaced.net.lSGL.Entity
import schlingel.bplaced.net.lSGL.Enum
import schlingel.bplaced.net.lSGL.Generator

class LSGLModelGenerator implements IGenerator {
	private static final String MODEL_GENERATOR_NAME = "models"
	private static final String OUTPUT_NAME="outputdir"

	private static class ModelGenConfig {
		private String outputDir;
		private String packageName;
		private String packageImport;
		def String getOutputDir() {
			new File(packageName.replaceAll("\\.", "/")).path
		}
	}

	private ModelGenConfig config

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		config = getCfg(input)
		
		val entities = input.allContents.filter(typeof(Entity)).map[x | return x as Entity]
		entities.forEach[entity | 
			fsa.generateFile(getOutputFile(entity) + ".java", 
				'''
«config.packageImport»

«getImports(entity)»

public class «entity.name» «getSuperClassToken(entity)»{
	«getAttributesOf(entity)»
	
	«getConstructor(entity)»
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
	
	def private String getConstructor(Entity entity) {
		var listItems = entity.attributes.filter[it.isIsList];
		var mapItems = entity.attributes.filter[it.isIsMap];
		
'''
	public «entity.name»() {
		«FOR list : listItems»
		«list.name» = new ArrayList<«getAttributeTypeName(list.type, true)»>();
		«ENDFOR»
		«FOR map : mapItems»
		«map.name» = new HashMap<«getAttributeTypeName(map.key, true)»,«getAttributeTypeName(map.type, true)»>();
		«ENDFOR»
	}
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
		if(attr.isIsList) {
			return String.format("List<%s>", getAttributeTypeName(attr.type, true))
		} else if(attr.isIsArray) {
			return String.format("%s[]", getAttributeTypeName(attr.type, false));
		} else if(attr.isIsMap) {
			return String.format("AbstractMap<%s, %s>", getAttributeTypeName(attr.key, true), getAttributeTypeName(attr.type, true));
		}
		
		return getAttributeTypeName(attr.type, attr.type.nullable);
	}
	
	def private String getAttributeTypeName(AttributeType type, boolean isForSet) {
		var isEmbeddedType = type.type == null
		var typeName = ''
		
		if(isEmbeddedType) {
			var isNullable = type.nullable
			
			if(isNullable || isForSet) {
				typeName = getNullablePrimitiveName(type.typeName)
			} else {
				typeName = getPrimitiveName(type.typeName)				
			}
		} else {
			return getTypenameOf(type.type)
		}		
	}
	
	def private String getPrimitiveName(String token) {
		switch(token) {
			String case 'string': return 'String'
			String case 'bool': return 'boolean'
			default: return token
		}
	}
 
 	def private String getNullablePrimitiveName(String token) {
 		switch(token) {
 			String case 'string': return 'String'
 			String case 'bool': return 'Boolean'
 			String case 'char': return 'Character'
 			String case 'float': return 'Float'
 			String case 'double': return 'Double'
 			String case 'byte': return 'Byte'
 			String case 'int': return 'Integer'
 			String case 'object': return 'Object'
 		}
 	}
 
	def dispatch getTypenameOf(Enum enumType) {
		return enumType.name;
	}
	
	def dispatch String getTypenameOf(Entity entityType) {
		return entityType.name;
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
			cfg.packageName = packageName;
			cfg.packageImport = String.format("package %s;", packageName);
		} else {
			cfg.packageName = ""
			cfg.packageImport = "";
		}

		cfg
	}
	
	def private getPropertyValue(EList<ConfigProperty> props, String name) {
		val attr = props.findFirst[it.name.toLowerCase.equals(name.toLowerCase)]
		
		if(attr == null) {
			return null 
		}
		
		attr.value
	}
	
	def private getDefaultOutputDir() {
		'/' 
	}
	
	def private String getOutputFile(Entity entity) {
		config.getOutputDir + '/' + entity.name
	}
}

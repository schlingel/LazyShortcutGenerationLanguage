package schlingel.bplaced.net.generator.model;

import java.io.File
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import schlingel.bplaced.net.generator.LSGLGeneratorBase
import schlingel.bplaced.net.lSGL.ConfigProperty
import schlingel.bplaced.net.lSGL.Entity
import schlingel.bplaced.net.lSGL.Generator

class LSGLModelGenerator extends LSGLGeneratorBase {
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
	
	def private String getAttributesOf(Entity entity) {
		return 
'''
«FOR attr : entity.attributes»
	«getAnnotationsOf(attr)»
	«getAttributeOf(attr)»
«ENDFOR»
''';
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
		var String outputDir = ''
		
		if(!config.getOutputDir.equals('')) {
			var startsWith = config.getOutputDir.startsWith('/')
			outputDir = config.getOutputDir
			
			if(!startsWith) {
				outputDir = '/' + outputDir
			}
		}
		
		'src/java' + outputDir + '/' + entity.name
	}
}

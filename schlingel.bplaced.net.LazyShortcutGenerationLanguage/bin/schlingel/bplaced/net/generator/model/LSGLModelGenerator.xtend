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

class LSGLModelGenerator implements IGenerator {
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

public class «entity.name» {
	
}				
				'''
			)
		]
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
			cfg.outputDir = defaultOutputDir
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
		"./"
	}
	
	def private String getOutputFile(Entity entity) {
		new File(config.absoluteOutputDir, entity.name).absolutePath
	}
}

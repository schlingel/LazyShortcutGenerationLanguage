package schlingel.bplaced.net.generator.views

import schlingel.bplaced.net.generator.LSGLGeneratorBase
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import schlingel.bplaced.net.lSGL.Generator
import schlingel.bplaced.net.lSGL.ConfigProperty

class LSGLViewElementsGenerator extends LSGLGeneratorBase{
	public static final String VIEWS_GENERATOR_NAME = "views";
	
	public static class ViewsGenConfig {
		private String outputDir = ''
		private String listPackage = ''
		private String basePackage = ''
		
		def public String getOutputDir() {
			return outputDir
		}
		
		def public String getListPackage() {
			return listPackage
		}
		
		def public String getBasePackage() {
			return basePackage
		}
	}
	
	private ViewsGenConfig config
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val xmlViewsGenerator = new LSGLViewsGenerator()
		val listAdapterGenerator = new LSGLListAdapter()
		
		initConfig(input)
		xmlViewsGenerator.config = config
		listAdapterGenerator.config = config
		
		xmlViewsGenerator.doGenerate(input, fsa)
		listAdapterGenerator.doGenerate(input, fsa)
	}
	
	def private void initConfig(Resource input) {
		val cfg = input.allContents.findFirst[it instanceof Generator && (it as Generator).name.toLowerCase.equals(VIEWS_GENERATOR_NAME)]
		config = new ViewsGenConfig()
		
		if(cfg != null) {
			config.outputDir = getPropertyValue((cfg as Generator).properties, 'outputDir')
			config.listPackage = getPropertyValue((cfg as Generator).properties, 'listPackage')
			config.basePackage = getPropertyValue((cfg as Generator).properties, 'basePackage')
		}
	}
	
	def private String getPropertyValue(Iterable<ConfigProperty> properties, String name) {
		val item = properties.findFirst[it.name.equals(name)] 
		
		if(item != null) {
			return item.value
		}
		
		return ''
	}
}
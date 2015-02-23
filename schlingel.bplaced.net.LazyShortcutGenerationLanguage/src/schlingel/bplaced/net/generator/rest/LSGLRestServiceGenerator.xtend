package schlingel.bplaced.net.generator.rest

import schlingel.bplaced.net.generator.LSGLGeneratorBase
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import schlingel.bplaced.net.lSGL.Generator
import schlingel.bplaced.net.lSGL.ConfigProperty

class LSGLRestServiceGenerator extends LSGLGeneratorBase{
	private static final String REST_CONFIG_NAME = "rest";
	
	private RestConfig config
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		config = getConfigOf(input)
		
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def private RestConfig getConfigOf(Resource input) {
		val Object generatorObj = input.allContents.findFirst[it instanceof Generator && (it as Generator).name.toLowerCase.equals(REST_CONFIG_NAME)]
		val RestConfig cfg = new RestConfig()
		var Generator generator = null
		
		if(generatorObj != null) {
			generator = generatorObj as Generator
			
		}

		return cfg
	}
	
	def private String getPropertyOf(Generator gen, String name, String defaultVal) {
		val ConfigProperty property =  gen.properties.findFirst[it.name.toLowerCase.equals(name.toLowerCase)]
		
		if(property != null) {
			return property.value
		}
		
		defaultVal
	}
}
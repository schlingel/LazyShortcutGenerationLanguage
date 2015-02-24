package schlingel.bplaced.net.generator.rest

import java.util.ArrayList
import java.util.List
import java.util.regex.Pattern
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import schlingel.bplaced.net.generator.LSGLGeneratorBase
import schlingel.bplaced.net.lSGL.Config
import schlingel.bplaced.net.lSGL.ConfigProperty
import schlingel.bplaced.net.lSGL.Entity
import schlingel.bplaced.net.lSGL.Generator
import schlingel.bplaced.net.lSGL.GeneratorAnnotation

class LSGLRestServiceGenerator extends LSGLGeneratorBase{
	private static class QueryParameter {
		String typeName
		String queryVarName
		String parameterName
	}
	
	private static final String REST_CONFIG_NAME = "rest";
	
	private RestConfig config
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		config = getConfigOf(input)
		
		if(config != null) {
			input.allContents.filter[it instanceof Entity].filter[hasRestAnnotation(it as Entity)].forEach[
				o | createRestService(o as Entity, fsa)
			]	
		}
	}
	
	def private void createRestService(Entity e, IFileSystemAccess fsa) {
		val GeneratorAnnotation annotation = getRestAnnotation(e)
		val Config annotationCfg = annotation.configItem
		var packageImport = config.packageImport
		var packageName = config.packageName
		var className = e.name
		var url = config.url
		var filePath = ''
		var httpMethodCfg = annotation.customConfig.findFirst[it.cfgName.toLowerCase.equals('method')]
		var httpMethod = 'GET'
				
		if(annotationCfg != null) {
			val RestConfigItem item = config.getConfig(annotationCfg.name)
			
			if(item != null) {
				packageName = either(item.packageName, packageName)
				packageImport = either(item.packageImport, packageImport)
				url = either(item.url, url)
			} else {
				System.err.println(String.format("[WARNING] No valid config found for annotation of %s config.", className))
			}
		}
		
		if(httpMethodCfg != null && httpMethodCfg.values.length > 0) {
			val methodName = httpMethodCfg.values.get(0)
			httpMethod = methodName.toUpperCase
		}
		
		filePath = 'src/java/' + packageName.replaceAll('\\.', '/') + '/' + className + 'RestService.java'
		
		fsa.generateFile(filePath, genCode(url, httpMethod, className, packageImport, getQueryParameters(annotation)))
	}
	
	def private Iterable<QueryParameter> getQueryParameters(GeneratorAnnotation annotation) {
		return annotation.customConfig.filter[it.cfgName.toLowerCase.equals('query') && it.values.length > 0].map[item |
			val QueryParameter p = new QueryParameter()
			p.queryVarName = item.values.get(0)
			p.parameterName = p.queryVarName
				
			
			if(item.values.length > 1) {
				p.typeName = item.values.get(1)
			} else {
				p.typeName = 'String'
			}
			
			if(item.values.length > 2) {
				p.parameterName = item.values.get(2)
			}
			
			return p
		]
	}
	
	def private String genCode(String url, String httpMethod, String className, String packageImport, Iterable<QueryParameter> queryParams) {
			val params = getPathParams(url)
			val String cbName = 'on' + className + 'Data'
			val String methodName = httpMethod.toLowerCase.toFirstLower + className + 'Data'
			val pathParams = params.map[p | p.substring(1, p.length - 1)].map[p | '@Path("' + p + '") String ' + p].join(', ')
			var queryParamsStr = queryParams.map[q | String.format('@Query("%s") %s %s', q.queryVarName, q.typeName, q.parameterName) ].join(', ')
			
			if(pathParams.length > 0) {
				if(queryParamsStr.length > 0) {
					queryParamsStr = ', ' + queryParamsStr
				}
			}
			
			var parameterVars = pathParams + queryParamsStr
			
			if(parameterVars.length > 0) {
				parameterVars += ', '
			}
'''
«packageImport»

import retrofit.Callback;
import retrofit.http.«httpMethod»;
import retrofit.http.Path;
import retrofit.http.Query;

public interface «className»RestService {
	@«httpMethod»("«url»")
	public void «methodName»(«parameterVars»Callback<«className»> «cbName»);
}
'''
	}
	
	def private List<String> getPathParams(String url) {
		val Pattern	p = Pattern.compile('\\{([a-z]|[A-Z])+\\}')
		val m = p.matcher(url)
		val List<String> items = new ArrayList<String>()	
	
		while(m.find()) {
			items.add(m.group())
		}
	
		items
	}
	
	def private String either(String a1, String a2) {
		if(a1 != null)
			return a1;
			
		return a2;
	}
	
	def private GeneratorAnnotation getRestAnnotation(Entity e) {
		return e.generatorAnnotations.findFirst[it.generator.name.toLowerCase.equals(REST_CONFIG_NAME)]
	}
	
	def private boolean hasRestAnnotation(Entity e) {
		return getRestAnnotation(e) != null;
	}
	
	
	def private RestConfig getConfigOf(Resource input) {
		val Object generatorObj = input.allContents.findFirst[it instanceof Generator && (it as Generator).name.toLowerCase.equals(REST_CONFIG_NAME)]
		val RestConfig cfg = new RestConfig()
		var Generator generator = null
		
		if(generatorObj != null) {
			generator = generatorObj as Generator
			val List<RestConfigItem> configs = new ArrayList<RestConfigItem>()
			
			generator.configs.forEach[
				config | {
					val RestConfigItem item = new RestConfigItem
					
					item.packageName = getPropertyOf(config.properties, 'packageName', '')
					item.url = getPropertyOf(config.properties, 'url', '')
					item.name = config.name
					
					if(!item.packageName.equals('')) {
						item.packageImport = 'package ' + item.packageName + ';'
					} else {
						item.packageImport = ''
					}
					
					configs.add(item)
				}	
			]
			
			cfg.configs.addAll(configs)
			return cfg
		} else {
			return null
		}
	}
	
	def private String getPropertyOf(Iterable<ConfigProperty> properties, String name, String defaultVal) {
		val ConfigProperty property =  properties.findFirst[it.name.toLowerCase.equals(name.toLowerCase)]
		
		if(property != null) {
			return property.value
		}
		
		defaultVal
	}
}
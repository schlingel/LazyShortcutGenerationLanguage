package schlingel.bplaced.net.generator.views

import schlingel.bplaced.net.generator.LSGLGeneratorBase
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import schlingel.bplaced.net.lSGL.Projection
import schlingel.bplaced.net.lSGL.Entity
import schlingel.bplaced.net.lSGL.Attribute
import schlingel.bplaced.net.lSGL.Generator

class LSGLViewsGenerator extends LSGLGeneratorBase {
	private LSGLViewElementsGenerator.ViewsGenConfig config;
	
	def public void setConfig(LSGLViewElementsGenerator.ViewsGenConfig cfg) {
		config = cfg
	}
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val items = input.allContents.filter[isViewSource(it)];		

		items.forEach[item |
			fsa.generateFile(getOutputFile(item), handleViewSource(item))
		]
	}
	
	def private boolean isViewSource(Object o) {
		if(o instanceof Entity) {
			return containsViewGenerator((o as Entity).generators)
		} 
		
		if(o instanceof Projection) {
			return containsViewGenerator((o as Projection).generators)
		}
		
		return false
	}
	
	def private boolean containsViewGenerator(Iterable<Generator> generators) {
		return generators.filter[it.name.toLowerCase.equals(LSGLViewElementsGenerator.VIEWS_GENERATOR_NAME.toLowerCase)].length > 0
	}
	
	def private dispatch String handleViewSource(Entity entity) {
		'''
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent"
    android:layout_height="match_parent" android:paddingLeft="@dimen/activity_horizontal_margin"
    android:orientation="vertical">
		«FOR attr : entity.attributes»
		«getAttributeView(attr)»
		«ENDFOR»
</LinearLayout>		
		'''
	}
	
	def private String getAttributeView(Attribute attr) {
'''
	<«getViewType(attr)»
	        android:id="@+id/«getId(attr.name)»"
			android:layout_width="match_parent"
			android:layout_height="wrap_content"
	/>
'''
	}
	
	def private String getViewType(Attribute attr) {
		val viewAnnotations = attr.annotations.filter[it.name.equals("view")]
		
		if(viewAnnotations.length > 0 && viewAnnotations.get(0).value != null) {
			return viewAnnotations.get(0).value;
		}
		
		return 'TextView';
	}
	
	def private String getId(String name) {
		return name	
	}
	
	def private dispatch String handleViewSource(Projection proj) {
		var Iterable<Attribute> attributes = null
		
		if(proj.excluding) {
			val entityAttrNames = proj.attributes.map[attr | attr.name]
			attributes = proj.entity.attributes.filter[!entityAttrNames.contains(it.name)]
		} else {
			attributes = proj.attributes
		}
		
		'''
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent"
    android:layout_height="match_parent" android:paddingLeft="@dimen/activity_horizontal_margin"
    android:orientation="vertical">    
«FOR attr : attributes»
		«getAttributeView(attr)»
«ENDFOR»
</LinearLayout>		
		'''
	}
	
	def private dispatch String getOutputFile(Projection proj) {
		'src/res' + config.outputDir + '/' + proj.name + '.xml'
	}
	
	def private dispatch String getOutputFile(Entity entity) {
		'src/res' + config.outputDir + '/' + entity.name + '.xml'
	}
}
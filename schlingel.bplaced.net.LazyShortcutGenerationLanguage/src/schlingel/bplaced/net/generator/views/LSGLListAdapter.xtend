package schlingel.bplaced.net.generator.views

import schlingel.bplaced.net.generator.LSGLGeneratorBase
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import schlingel.bplaced.net.lSGL.Projection
import schlingel.bplaced.net.lSGL.Entity
import schlingel.bplaced.net.lSGL.Attribute
import schlingel.bplaced.net.lSGL.Annotation
import schlingel.bplaced.net.lSGL.GeneratorAnnotation

class LSGLListAdapter extends LSGLGeneratorBase {
	private LSGLViewElementsGenerator.ViewsGenConfig config
	
	def public void setConfig(LSGLViewElementsGenerator.ViewsGenConfig cfg) {
		this.config = cfg
	}
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		createBaseAdapterClass(fsa)
		input.allContents.filter[it instanceof Projection || it instanceof Entity].filter[isCandidate(it)].forEach[item |
			createListAdapter(item, fsa)
		]
	}
	
	def private dispatch boolean isCandidate(Projection projection) {
		return hasViewsAnnotation(projection.generatorAnnotations)
	}
	
	def private dispatch boolean isCandidate(Entity entity) {
		return hasViewsAnnotation(entity.generatorAnnotations)
	}
	
	def private boolean hasViewsAnnotation(Iterable<GeneratorAnnotation> genAnnotations) {
		return genAnnotations.findFirst[it.generator.name.toLowerCase.equals("views")] != null
	}
	
	def private dispatch void createListAdapter(Projection projection, IFileSystemAccess fsa) {
		var Iterable<Attribute> attrs = null;
		
		if(projection.excluding) {
			val excluded = projection.attributes.map[it.name]
			attrs = projection.entity.attributes.filter[!excluded.contains(it.name)]
		} else {
			attrs = projection.attributes
		}
		
		fsa.generateFile(listAdapterPath(projection.name), genListAdapter(projection.name, projection.entity.name, attrs))
	}
	
	def private dispatch void createListAdapter(Entity entity, IFileSystemAccess fsa) {
		fsa.generateFile(listAdapterPath(entity.name), genListAdapter(entity.name, entity.name, entity.attributes))
	}
	
	def private String listAdapterPath(String name) {
		var String outputPath = config.outputDir;
		if(!outputPath.endsWith('/')) {
			outputPath += '/'
		}
		
		outputPath = 'src/java' + outputPath + config.listPackage.replaceAll('\\.', '/') + '/' + name + 'ListAdapter.java'
		return outputPath
	}
	
	def private String genListAdapter(String name, String typeName, Iterable<Attribute> attrs) {
		'''
package «config.listPackage»;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import «config.basePackage».R;

import java.util.Collection;

public class «name»ListAdapter extends ListAdapterBase<«typeName»> {
    «genViewHolder(attrs)»

    private LayoutInflater inflater;

    public ListAdapterImpl(Context context, Collection<«typeName»> collection) {
        super(context, collection);
        inflater = LayoutInflater.from(context);
    }

    public ListAdapterImpl(Context context, «typeName»[] array) {
        super(context, array);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null) {
            convertView = inflater.inflate(R.layout.activity_main, null);
            holder = new ViewHolder();
			«FOR attr : attrs»
				holder.«attr.name» = («getViewTypeOf(attr)»)convertView.findViewById(R.id.«getViewIdOf(attr)»);
			«ENDFOR»
        } else {
            holder = (ViewHolder)convertView.getTag();
        }

        «typeName» model = getItem(position);

		«FOR attr : attrs»
			«getSetterOf(attr)» 
		«ENDFOR»

        return convertView;
    }
}		
		'''
	}
	
	def private String getViewTypeOf(Attribute attr) {
		val Annotation viewTypeAnnotation = attr.annotations.findFirst[it.name.toLowerCase.equals('view')]
		
		if(viewTypeAnnotation != null) {
			return viewTypeAnnotation.value
		}
		
		return 'TextView';
	}
	
	def private String getSetterOf(Attribute attr) {
		val String type = getViewTypeOf(attr)
		
		switch(type) {
			String case 'TextView': return 'holder.' + attr.name + '.setText(model.' + attr.name + ');' 
		}
		
		return '// TODO: add setter for model.' + attr.name
	}
	
	def private String getViewIdOf(Attribute attr) {
		val Annotation viewIdAnnotation = attr.annotations.findFirst[it.name.toLowerCase.equals('viewid')]
		
		if(viewIdAnnotation != null) {
			return viewIdAnnotation.value
		}
		
		return attr.name
	}
	
	def private String genViewHolder(Iterable<Attribute> attrs) {
		'''
	private static class ViewHolder {
		«FOR attr : attrs»
		«getViewTypeOf(attr)» «attr.name»;
		«ENDFOR»
	}
		'''
	}
	
	def private void createBaseAdapterClass(IFileSystemAccess fsa) {
		var String outputPath = 'src/java/' + config.outputDir;
		if(!config.outputDir.endsWith("/")) {
			outputPath += '/'
		}	
		outputPath += config.listPackage.replaceAll('\\.', '/') + '/' + 'ListAdapterBase.java'
		fsa.generateFile(outputPath, 
			'''
package «config.listPackage»;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public abstract class ListAdapterBase<T> extends BaseAdapter {
    private final ArrayList<T> list = new ArrayList<>();
    protected final Context context;

    public ListAdapterBase(Context context, Collection<T> collection) {
        this.context = context;
        list.addAll(collection);
    }

    public ListAdapterBase(Context context, T[] array) {
        this.context = context;
        list.addAll(Arrays.asList(array));
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public T getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
 
			'''
		)
	}
}
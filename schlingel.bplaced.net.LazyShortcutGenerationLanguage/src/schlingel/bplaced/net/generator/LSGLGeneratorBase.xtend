package schlingel.bplaced.net.generator

import org.eclipse.xtext.generator.IGenerator
import schlingel.bplaced.net.lSGL.Entity
import schlingel.bplaced.net.lSGL.Attribute
import schlingel.bplaced.net.lSGL.AttributeType

abstract class LSGLGeneratorBase implements IGenerator {
	protected static final String OUTPUT_NAME = "outputdir"
	
	def protected String getSuperClassToken(Entity entity) {
		if(entity.superClass != null) {
			return String.format("extends %s ", entity.superClass.class.name);
		}
		
		return "";
	}
	
	def protected String getAnnotationsOf(Attribute attr) {
		//TODO: add mechanism to load annotations provider
		return "";
	}
	
	def protected String getAttributeOf(Attribute attr) {
		return String.format("private %s %s;", getAttributeTypeOf(attr), attr.name);		
	}

	def protected String getAttributeTypeOf(Attribute attr) {
		if(attr.isIsList) {
			return String.format("List<%s>", getAttributeTypeName(attr.type, true))
		} else if(attr.isIsArray) {
			return String.format("%s[]", getAttributeTypeName(attr.type, false));
		} else if(attr.isIsMap) {
			return String.format("AbstractMap<%s, %s>", getAttributeTypeName(attr.key, true), getAttributeTypeName(attr.type, true));
		}
		
		return getAttributeTypeName(attr.type, attr.type.nullable);
	}
	
	def protected String getAttributeTypeName(AttributeType type, boolean isForSet) {
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
	
	def protected String getPrimitiveName(String token) {
		switch(token) {
			String case 'string': return 'String'
			String case 'bool': return 'boolean'
			default: return token
		}
	}
 
 	def protected String getNullablePrimitiveName(String token) {
 		switch(token) {
 			String case 'string': return 'String'
 			String case 'bool': return 'Boolean'
 			String case 'char': return 'Character'
 			String case 'float': return 'Float'
 			String case 'double': return 'Double'
 			String case 'byte': return 'Byte'
 			String case 'int': return 'Integer'
 			String case 'long': return 'Long'
 			String case 'object': return 'Object'
 		}
 	}
 
	def protected dispatch getTypenameOf(schlingel.bplaced.net.lSGL.Enum enumType) {
		return enumType.name;
	}
	
	def protected dispatch String getTypenameOf(Entity entityType) {
		return entityType.name;
	}
}
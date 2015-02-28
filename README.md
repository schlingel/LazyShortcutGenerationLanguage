# Lazy shortcut generation language
The lazy shortcut generation language (LSGL) is a domain specific language to generate android specific code via model definitions. The base version should generate these code artefacts:

* model classes with getters and setters
* views corresponding to models or their projections
* List adapters, including view holder pattern.

Additional, useful code generations can be added with custom code generators.

**Currently only a early prototype is ready. Custom generators not supported yet. Parts of this is currently just a road map for the developers!**

##Available Features
LSGL supports code generation for following purposes

1. Generation of model classes
2. Generation of view xmls for list views.
3. Generation of ListAdapters implementing the view holder pattern.
4. Generation of REST service calls, based upon the [(Retrofit framework)https://github.com/square/retrofit]

### Model class generation

The basic feature is to create model classes. To get a first example running you need to define the entity and the Models generator:

```
def entity Person
end

def generator Models
end
```

This creates an empty Person java class in the current directory without package. The Models generator has one property to define the package. You don't need to add the generator annotation to the entity classes as the models generator is the default generator which is used on every defined entity.

```
def entity Person
	string name
end

def generator Models
	packageName : "net.schlingel.bplaced"
end
```
Now the model contains the String attribute and its getter and setter. Additionally it got the "net.schlingel.bplaced" package and the needed folder hierarchy.

### View XML and ListAdapter generation

To create a ListAdapter and the corresponding view XML the Views generator is available. It needs two configuration items:

1. basePackage This property is needed to add the correct package for the R import
2. listPackage This property is needed to put the ListAdapters in their own package

```
@generator(Views)
def entity Person
	string name
end

def generator Models
	packageName : "net.schlingel.bplaced"
end

def generator Views
    basePackage : "net.schlingel.bplaced"
    listPackage : "net.schlingel.bplaced.adapters"
end
```

If the entity contains to many attributes you don't need in the resulting XML you can cut them off using a projection.

```
def entity Person
	string name
	string lastname
	int age
	Person list children
end

@generator(Views)
def projection PersonView of Person
	string name
end

def generator Models
	packageName : "net.schlingel.bplaced"
end

def generator Views
    basePackage : "net.schlingel.bplaced"
    listPackage : "net.schlingel.bplaced.adapters"
end
```

This would generate a simple view containing only one Textbox for the name of the Person.

### REST client code generation

To create the client code for a service you need to use the Rest generator. 

```
@generator(Rest, Rest.Weather,
	"query" = "q":"String":"city"
)
def entity Weather
end

def generator Rest 
	packageName : 'simpler.test'

	def config Weather
		packageName : 'net.bplaced.schlingel.rest',
		url : '/data/2.5/weather'
	end
end
```

The rest generator is configured via the url and the packageName attribute in the config item of the Rest generator. To define query parameter use this syntax:

```
"query"="paramName in URL":"Parameter type in Java code":"Paramter name in Java Code"
```

The parameter type and name is optional.

## LSGL concepts
The language consists of a few base entities which can be used to define what should be generated. These base entities are:

* entities
* projections
* generators
* annotations

###Entities and Projection
A entity is a simple model class definition. It consists of a entity name, optional a single super class and the containing attributes. The entity itself can be annotated with generators and the attributes with annotations.

```
@generator(Models)
def entity Person
  string firstname
  string lastname
  nullable int age
end
```

These definition would result in this java code:

```java
public class Person {
  private String firstname;
  private String lastname;
  private Integer age;
  
  public String getFirstname() {
	return firstname;
  }
  
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  
  // etc.
}
```

A projection is a view of an entity. These concept should ease the generation of android views as it allows the user to define which attributes of the model class should be used.

A projection has a name, consists of a corresponding entity and the attributes you want to use or you want to exclude.

```
@generator(Views)
def projection PersonName of Person
  string firstname
  string lastname
end
```

As you see there are more attributes you want to include than you want to exclude. There's a shortcut for situations like these:

```
@generator(Views)
def excluding projection PersonName of Person
  int age
end
```
Entities and projections consist of attributes. A attribute consist of a type and a name. Additionally it's possible to extend it with annotations. 

The type of a attribute is either a primary Java type or a defined entity. Additionally it's possible to mark an attribute as array, list or map.

A primary type is either a real Java primary type or its Object pendant. Currently this primary types are embedded:

LSGL type name | primary type | nullable type
byte | byte | Byte
int | int | Integer
float | float | Float
double | double | Double
bool | boolean | Boolean
char | char | Character
long | long | Long

To define a nullable type use the prefix "nullable", "object" or "o".

Example:
```
def entity Person
	string firstname
	string lastname
	Person partner // -> could be null because it's a reference type
	nullable int age // -> optional attribute, could be null
	nullable bool sex // true -> male, false -> female, null -> N/A
end
```

Additionally it's possible to create set types. 

LSGL definition | Java pendant
<LSGL type> list | List<Reference type>
map <Key type>, <Value type> | AbstractMap<Reference type, Value type>
<LSGL type> array | <type>[] (Does not automatically translate to reference type. So "int array" translates to "int[]")

Example:

```
def entity DamageReport
	string name
	string list authors
	map string, string descriptions
	int array policies
end
```
The LSGL code above would result in Java code like this:

```
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class DamageReport {
	private String name;
	private List<String> authors;
	private AbstractMap<String, String> descriptions;
	private int[] policies;
	
	public DamageReport() {
		authors = new ArrayList<String>();
		descriptions = new HashMap<String,String>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public AbstractMap<String, String> getDescriptions() {
		return descriptions;
	}
	
	public void setDescriptions(AbstractMap<String, String> descriptions) {
		this.descriptions = descriptions;
	}
	
	public int[] getPolicies() {
		return policies;
	}
	
	public void setPolicies(int[] policies) {
		this.policies = policies;
	}
}	
```

###Generators
Generators are code generators which take basic components as input and output code. There are two embedded generators:

1. entity model generator
2. view generator

The entity model generator creates Java model classes. The view generator creates Android ListAdapter classes, their inner view holder classes and corresponding list item view XMLs.

It's possible to write custom generators and add them to the classpath. The configuration happens inline in the LSGL file:

```
@generator(Views)
@generator(Models)
def entity Person
  string name
end

def generator Models
end

def generator Views
end
```

## Build notes
The easiest way to create a standalone command line generator application is to export it via Eclipse. But, you need to manually include this dummy setting:
```
  _UI_DiagnosticRoot_diagnostic=_UI_DiagnosticRoot_diagnostic
```

## TODOs

* Implement Enumerator support
* Extend Models-Generator by an callback driven plugin architecture to allow custom generators based upon entity definitions.
* Refactor REST code generation to allow multiple service calls in one class.

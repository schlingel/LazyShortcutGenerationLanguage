# Lazy shortcut generation language
The lazy shortcut generation language (LSGL) is a domain specific language to generate android specific code via model definitions. The base version should generate these code artefacts:

* model classes with getters and setters
* views corresponding to models or their projections
* List adapters, including view holder pattern.

Additional, useful code generations can be added with custom code generators.

**This isn't even an alpha version! The concepts here are not implemented yet. This is a road map for the developers!**

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
  @annotation("type", "Integer")
  int age
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

###Generators
Generators are code generators which take basic components as input and output code. There are two embedded generators:

1. entity model generator
2. view generator

The entity model generator creates Java model classes. The view generator creates Android ListAdapter classes, their inner view holder classes and corresponding list item view XMLs.

It's possible to write custom generators and add them to the classpath. The configuration happens inline in the LSGL file:

```
@generator(Json)
@generator(Models)
def entity Person
  string name
end

def generator Json
end
```

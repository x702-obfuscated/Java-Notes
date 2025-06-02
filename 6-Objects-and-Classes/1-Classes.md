















```java
// Encapsulation

/**
Notes:
  Encapsulation is used to hide sensitive data from users
    declare class variables/attributes as private
    provide public get and set methods to access and update the value of private variables

  Getters and Setters
    the 'get' method returns the variable value, and the set method sets the value.

*/

  public class Encapsulation{
  private String attribute; //private restricts access to the class it is apart of

  //Getter
  public String getAttribute(){
    return attribute; //returns the value of the variable "attribute"
  }
  
  //Setter
  public void setAttribute(String newAttribute){
    this.attribute = newAttribute;//accepts the parameter newAttribute and assigns it to the 'attribute' variable.
    //'this' refers to the current object.

  }

  public static void main(String[] args){


  }
}
```


```java
// enumeration



/**
Notes:
  enums is a special class the represents a group of constants
  use the enum keyword
  seperate the constants with a comma. The should be in uppercase.

*/

public class Enumeration {
  enum Enumerated{
    LOW,
    MEDIUM,
    HIGH
  }
  //access enum constants with the dot syntax

  public static void main(String[] args){
    Enumerated aVar = Enumerated.MEDIUM;
    System.out.println(aVar);

    //enum in a switch
    Enumerated secondVar = Enumerated.HIGH;
    switch(secondVar){
      case LOW:
        System.out.println("Low");
        break;
      case MEDIUM:
        System.out.println("Medium");
        break;
      case HIGH:
        System.out.println("High");
        break;
    }

    //enum type has a values() method that returns an array of all enum constants. 
    for(int i = 0; i < Enumerated.values().length;i++){
      System.out.println(Enumerated.values()[i]);
    }
  }
}
```

```java

"Access Modifiers"

//Access Modifiers for classes
    //public: accessible by any other class
    //default: the class is only accessible by classes in the same package
        //used when you do not specify a modifier
//Non-access Modifiers for classes
    //final: class cannot be inherited by other classes
    //abstract: class cannot be used to create objects
public class Modifiers{
    //Access modifiers for attributes, methods, and constructors
        //public: code is accessible for all classes
        //private: code is only accessible within the declard class
        //protected: code is accessible in the same package and subclasses.
        //default: code is only accessible in the same package and subclasses
        public Object example;
        private Object example;
        protected Object example;
        Object example;

    //Non-access modifiers for attributes and methods
        //final: attributes and methods cannot be overridden/modified
        //static: attributes and methods belong to the class, rather than an object
        //abstract: can only be used in an abstract class, and can only be used on methods
        //transient: attributes and methods are skipped when serializing the object containing them
        //synchronized: methods can only be accessed by one thread at a time
        //volatile: the value of the attribute is not cached thread-locally, and is always read from he main memory
        final Object example;
        static Object example;
        abstract Object example;
        transient Object example;
        synchronized Object example;
        volatile Object example;
        
    public static void main(String[] args){
        
    }
}
```


```java
// Nested Classes

//Classes inside classes

class OuterClass {
  public int x = 10;

  class InnerClass {
    public int y = 5;
  }

  /*private class PrivateInner{ //if you try to access this class you will get an error.
    int z = 2;
  }*/

  /*static class StaticInner{ //you can access this class without creating an object of the outer class.
    int a = 9;
  }*/

  /*class InnerAccessOuter{
    public int innerMethod(){
      return x;
    }
  }*/
}

public class Nested_Classes {
  public static void main(String[] args){
    OuterClass outerObj = new OuterClass();
    
    OuterClass.InnerClass innerObj = outerObj.new InnerClass();
    System.out.println(innerObj.y + outerObj.x);

    //OuterClass.PrivateInner privateInnerObj = outerObj.new InnerClass();//errors 
    //System.out.println(privateInnerObj.z + outerObj.x);
    
    //OuterClass.StaticInner staticInnerObj= new OuterClass.InnerClass;
    //System.out.println(staticInnerObj.a);

    //OuterClass.InnerAccessOuter accessOuterObj = outerObj.new InnerAccessOuter
    //System.out.println(accessOuterObj.innerMethod());
  }
}

```


```java
package objectoriented;

/*
Notes:
Covered in this file:
//> Private Attributes and Public Methods
//> Scoping: local, instance variables, and static variables
//> Default vs. Private vs. Public Constructors
//> Copy Constructors
//> Accessor Methods (getters)
//> Mutator Methods (setters)
//> Parameters: Pass by Reference or Value?
//> Returns: By Reference or Value?
//> Preconditions and Postconditions
//> Common Overridden Methods: toString() and equals()
 */

public class WritingClasses {
//============================================================================================================================================================================//  
// Private Attributes and Public Methods
  //> Attributes are typically private
    //> Encapsulation: prevent direct access and modification from outside the class
    //> Controlled Access: allow you to control how values are modified
    //> Security: preventing unauthorized access to sensitive data
    //> Maintainability: reduces the ripple effect of modification
  
  private String name;
  private int number;
  private static String shared = "This value is shared amongst all instances of the class.";
  
  
  //> Methods are typically public
    //> Encapsulation: provides controlled access to object
    //> Access: allows access to functionality from outside of the class

  public void example() {
    return;
  }


//============================================================================================================================================================================// 
// Scoping: local, instance variables, and static variables
  //> in other languages variables have local and global scopes
  //> Java has a local scope, but no true global scope
  //> Scope can be defined as local, instance variable, and static variable

  //> local variables are declared in method bodies, or code blocks (if, while, for, etc.)
  //> local variables cannot be public/private
  public static void localScope(String a){
    //variables accessible here: a
    
    boolean b;
    //variables accessible here: a, b
    
    if(true){
      char c;
      //variables accessible here: a, b, c
      
      while(true){
        double d;
        //variables accessible here: a, b, c, d

        for(int e = 0; e < 1; e++){
          //variables accessible here: a, b, c, d, e
        }
        //variables accessible here: a, b, c, d    
      }
      //variables accessible here: a, b, c
    }
    //variables accessible here: a, b
  }

  //> instance variables are accessible anywhere the object is accessible
  //> When a local variable has the same name as an instance variable the local variable is referenced
  private String var;
  public void instanceVariables(String var){
    System.out.println( var == var ); // using the local var
    System.out.println( this.var == var ); // comparing the instance variable this.var to the local variable var
  }

  //> static variables are accessible anywhere the class is accessible
  private static String variable;
  public static void staticVaraibles(String variable){
    System.out.println( variable == variable );// using the local variable
    System.out.println( WritingClasses.variable == variable); //comparing the static variable WrittingClasses.variable to the local variable variable 
  }
  
//============================================================================================================================================================================// 
// Default vs. Private vs. Public Constructors
  //> if no constructor is written -> java provides default no arg constructor
  //> constructors should be public
  //> a private construct prevents instantiating objects outside of the class
  
  /*
  //Private Constructor: for preventing the creation of objects outside of the class.
  private WritingClasses() {
    return;
  }//Should appear by itself when used. 
  */
  
  //Constructor no parameter
  public WritingClasses() {
    name = "default";
    number = 0;
  }
  
  //Constructor overloaded and with parameters
  public WritingClasses( String name, int number ) {
    this.name = name;
    this.number = number;
  }

//============================================================================================================================================================================//  
// Copy Constructors
 //> used to make a copy of another Object in the same class
 //> best practice is to create a copy of the object 
 //> when a mutable object is a constructor parameter, the instance variable should be initialized with a copy of the referenced object. 
 
 public WritingClasses(WritingClasses obj){
    this.name = obj.name;
    this.number = obj.number;
 }
 

//============================================================================================================================================================================// 
// Accessor Methods (getters)
  //> provide controlled access to private attributes
  //> can be used to control how and what values are returned
 
  public String getName() {
    return name;
  }
  
  public int getNumber() {
    return number;
  }
  
//============================================================================================================================================================================// 
//Mutator Methods (setters)
  //> provide controlled access to modify the internal state of objects
  //> can be used to control how values are modified
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setNumber(int number) {
    this.number = number;
  }
 
//============================================================================================================================================================================// 
//Parameters: Pass by Reference or Value?
  //> Pass by Value (Primitives): a copy of the value is passed to the method
    //> Modifying the passed value does not affect the original
    //> pass a copy of the value


  //> Pass by Value (Reference Types): a copy of the reference (memory location) is passed to the method
    //> Modifying the passed reference modifies the original
    //> Reference Types (Objects) pass a copy of the reference (not a copy of the object)
    //> It is good practice not to modify mutible objects that are passed as parameters
  
  
  public static void passByValuePrimitive(int para) {
    para = 10;
    System.out.println("para value: " + para);
    
  }
  
  public static void passByValueObjects(WritingClasses para) {
    para.name = "New Name";
    System.out.println("para references: " + para);
  }

//============================================================================================================================================================================//  
// Returns: By Reference or Value?
  //> returns are return by value (makes a copy)
  
//============================================================================================================================================================================//  
// Preconditions and Postconditions
  //> preconditions are conditions that must be true just prior to the execution of a section of code
  //> postconditions are conditions that must always be true after the execution of a program

//============================================================================================================================================================================//
//> Common Overridden Methods: toString() and equals()
  //> toString() and equals() are defined in the java.lang.Object class
  //> both are commonly Overridden when writting classes

  //> toString() method is called automatically when an object is passed to System.out.print() and System.out.println()
  public String toString(){
    return this.name;
  }

  //> equals() method is used to define what makes two objects of this class "equal"
  public boolean equals(Object obj){
    //check reference equality
    if( this == obj ){
      return true;
    }

    //check class equality
    if (obj == null || this.getClass() != obj.getClass()){
      return false;
    }

    //Cast input object to given class
    WritingClasses other = (WritingClasses) obj;

    //Check attribute equality
    return (this.name.equals(other.name) && this.number == other.number); 
  }




  public static void main(String[] args) {
    int num = 0;
    System.out.println("num value before: " + num);
    
    passByValuePrimitive(num);
    System.out.println("num value after: " + num);
    
    WritingClasses obj = new WritingClasses(); 
    System.out.println("obj reference before: " + obj);
    System.out.println("obj.name before: " + obj.name);
    
    passByValueObjects(obj);
    //Obj has been modified.
    System.out.println("obj reference after: " + obj);
    System.out.println("obj.name after: " + obj.name);
  }

}

```




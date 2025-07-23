# `Java Inheritence`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*

[Java Documentation](https://docs.oracle.com/en/java/javase/index.html)


---

Covered in this file:
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()

<br>

---

<br>

# ``


<br>

[Back To Top]()

---

<br>

*Created and maintained by Mr. Merritt*

```java
/**
Notes:
  subclass or child: class that inherits from another class
  superclass or parent: the class being inherited from

  Use the 'extends' keyword, to inherit from a class.
*/


class Parent{
  public String parentAttribute = "This attribute is inherited from the parent.";
  public void parentMethod(){
    System.out.println("This method is inherited from the parent.");
  }
}

class Child extends Parent{
  public String childAttribute = "This attribute is owned by Child.";    
}

class Inheritance {
  public static void main(String[] args){
    Child childObject = new Child();

    childObject.parentMethod();
    System.out.println(childObject.parentAttribute + " " + childObject.childAttribute);
  }
}
```



```java
// Abstracts
/**
Notes:
Abstraction hides details
abstract keyword is a non-access modifier used for classes and methods
abstract classes cannot be used to create objects and to access the class it must be inherited form another class
abstract methods can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
*/


abstract class Abstracted {
  public abstract void abstractMethod();
  public void regularMethod(){
    System.out.print("The method is apart of Abstracted.");
  }
}

class Inherited extends Abstracted {
  public void abstractMethod(){
    //here is the body of abstractMethod
    System.out.println("This method is apart of Inherited.");
  }
}

class Abstraction{
  public static void main(String[] args){
    //Abstracted abstractedObj = new Abstracted();// generates and error

    Inherited inheritedObj = new Inherited();
    inheritedObj.abstractMethod();
    inheritedObj.regularMethod();
  }
}
```

```java
// Parent, child relationships
/**
Notes:
subclass or child: class that inherits from another class
superclass or parent: the class being inherited from
Use the 'extends' keyword, to inherit from a class.
*/


class Parent{
  protected String parentAttribute = "This attribute is inherited from the parent.";
  public void parentMethod(){
    System.out.println("This method is inherited from the parent.");
  }
}

class Child extends Parent{
  private String childAttribute = "This attribute is owned by Child.";
  public static void main(String[] args){
    
    Child childObject = new Child();

    childObject.parentMethod();
    System.out.println(childObject.parentAttribute + " " + childObject.childAttribute);
  }
}


```


```java
/**
Notes:
  Interfaces are completely abstract classes that group related methods with empty bodies

*/

//interface
interface AnInterface {
  public void interfaceMethod();
  public void secondInterfaceMethod();
  public void thirdInterfaceMethod();
}

interface OtherInterface {
  public void thirdInterfaceMethod();
}

//to access interface methods use the implements keyword (not extends)
//the implement class provides the methods body
//access multiple interfaces by seperating them with a comma
class Implemented implements AnInterface, OtherInterface{//
  public void interfaceMethod(){
    System.out.println("The interfaceMethod was called");
  }
  public void secondInterfaceMethod(){
    System.out.println("The secondInterfaceMethod was called");
  }
  public void thirdInterfaceMethod(){
    System.out.println("The thirdInterfaceMethod was called");
  }
}

class Interfaces{
  public static void main(String[] args){
    Implemented implementedObj = new Implemented();
    implementedObj.interfaceMethod();
    implementedObj.secondInterfaceMethod();
    implementedObj.thirdInterfaceMethod();

  }
}

```


```java
// Polymorphism

/**
Notes:
  Polymorphism literally 'many' 'forms' allows for the use of methods to perform different tasks. 
  Different classes can inherit a method and perform a different function
*/



class Parent{
  public void sayClassName(){
    System.out.println("sayClassName prints Parent");
  }
}

class Child1 extends Parent{
  public void sayClassName(){
    System.out.println("sayClassName prints Child1");
  }
}

class Child2 extends Parent{
  public void sayClassName(){
    System.out.println("sayClassName prints Child2");
  }
}

class Polymorphism {
  public static void main(String[] args){
    Parent parentObj = new Parent();
    Child1 child1Obj = new Child1();
    Child2 child2Obj = new Child2();

    parentObj.sayClassName();
    child1Obj.sayClassName();
    child2Obj.sayClassName();
  }
}

```
# `Java Lambdas`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*

[Java Documentation](https://docs.oracle.com/en/java/javase/index.html)

For brevity in these notes please assume all of the code snippets in this file are written inside of this class unless otherwise stated.
```java
public class Example {

        
}
```
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
//!!!!File depends on Printable.java, PrintableParam.java, PrintableReturn.java and Thing.java

//Java Lambda Expressions
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/
package objectoriented;

/**
Notes:
  Lambda expressions are short blocks of code which takes in prameters and returns a value. Lambda expression are similar to methods,
  but they do not need a name and they can be implemented right in the body of a method.

  The expressions are limited and must immediately returna value
  cannot contain variables, assigments, or statements such as if or for. In order to do more complex operations, a code block can be used with curly braces. 
  If the lambda expression need to return a value, then the code block should have a return statement.

  syntax
  parameter -> expression

  (parameter1, parameter2) -> expression
  (paremeter1, parameter2) -> {code block}

  can only be used with certain types of interfaces

  import java.util.ArrayList; import ArrayList class

  Lambdas give you the ability to make method implementations into objects like any other that can 
  be passed into variables and saved into methods as parameters. 
*/


class LambdaExpressions {
  public static void main(String[] args){

    Thing aThing = new Thing();
    printThing(aThing);

    printThing(()->{System.out.println("Printing from Lambda Expression");});

    Printable lambdaPrintable = ()->{System.out.println("Printing from Lambda Expression as a variable");};
    printThing(lambdaPrintable);

    PrintableParam lambdaPrintParam = (parameter)->{System.out.println("Printing from Lambda Expression as a variable with parameter. "+ parameter);};
    printWithParam(lambdaPrintParam);

    PrintableReturn lambdaPrintReturn = (parameter) -> "This is an understood return " + parameter;
    withReturn(lambdaPrintReturn);// only works if the lamba is one expression.
    System.out.println(withReturn(lambdaPrintReturn));

    lambdaPrintReturn = (parameter)->{ return "This is an explicit return " + parameter;};
    withReturn(lambdaPrintReturn);
    System.out.println(withReturn(lambdaPrintReturn));

  }

  static void printThing(Printable thing){
    thing.print();
  }

  static void printWithParam(PrintableParam thing){
    thing.printParam("See I have a parameter.");
  }

  static String withReturn(PrintableReturn thing){
    return thing.printReturn("Parameter went here.");
  }
}

/*
Common Errors:

*/

/*
Practice:

*/

```

```java
//Used with LambdaExpressions.java

/*
  This is called a SAM interface for single abstract method
  It can only contain one abstract method
  Lambdas can only work with functional interfaces
*/
package objectoriented;

@FunctionalInterface//this is an annotation
public interface Printable {

  void print();//implements must create an implementation of this method.

}
```

```java
//Used with LambdaExpressions.java

/*
  This is called a SAM interface for single abstract method
  It can only contain one abstract method
  Lambdas can only work with functional interfaces
*/
package objectoriented;

@FunctionalInterface//this is an annotation
public interface PrintableParam {

  public void printParam (String suffix);//implements must create an implementation of this method.
}
```
```java
//Used with LambdaExpressions.java

/*
  This is called a SAM interface for single abstract method
  It can only contain one abstract method
  Lambdas can only work with functional interfaces
*/
package objectoriented;

@FunctionalInterface//this is an annotation
public interface PrintableReturn {
  String printReturn(String s);//implements must create implementation 
}
```
```java
//Used with LambdaExpressions.java
package objectoriented;

public class Thing implements Printable,PrintableParam,PrintableReturn{

  public void print(){
    System.out.println("Printing from class Thing print() method.");
  }

  public void printParam (String suffix){
    System.out.println("Printing from the class Thing printWithParam method." + suffix);
  }

  public String printReturn (String s){
    return "Print from the class Thing printReturn method." + s;
  }
}
```
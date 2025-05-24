# `Introduction to Java`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*
___

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


<br>

___

<br>


# `What is a program?`
A `program` is a set of instructions written in a programming language that a computer can execute to perform a specific task or solve a problem.


Regardless of the language used, programs have these things in common:
| **Part**                  | **Description**                                                                 |
|---------------------------|---------------------------------------------------------------------------------|
| `Input`                 | Receives data for processing (e.g., from user, file, or device).               |
| `Processing`            | Performs operations on the input to generate results.                         |
| `Output`                | Delivers results (e.g., prints to screen, saves to a file).                   |

<br>

As a programmer your job is to determine:
* What input does the program need and how to recieve that input?
* How will the input be processed to produce a result?
* How will the result be delivered and as what type of output?

---

<br>

## `Source Code`

`Source code` refers to the human-readable set of instructions and statements written by a programmer using a programming language. 

 <br>

In Java:
1. Source code is written inside of files with the `.java` extension.
1. Bytecode is written inside of files with the `.class` extension.

1. Programs are compiled by the `Java Compiler` and executed by the `Java Virtual Machine (JVM)`.
    1. The compiler translates Java source code into `bytecode`, a platform-independent format.
    1. The `bytecode` is then executed by the `JVM`, which runs on the host computer.
    1. Java programs are written in `.java` files and compiled into `.class` files before being executed by the `JVM`.


---

<br>


## `Sequential Programming`
`In Java, program instructions written as source code are executed one by one from top to bottom and left to right.`  
* This is known as `sequential programming`.
<br>

Basically: `Sequential Programming` is when program instructions are executed one at a time, from start to finish, in fixed linear order. 

Specifically: `Sequential Programming` is a programming model where operations are executed one after another, without overlapping or parallel execution.
* Each step must finish before the next one begins.

---

<br>

The following terms are also good to know when dealing with Programs:
| **Term**              | **Definition**                                                                 |
|------------------------|--------------------------------------------------------------------------------|
| `Syntax`             | The set of rules that define the correct structure of code in a programming language. `The way the language is written.` |
| `Comments`           | Notes written in code to explain what it does; ignored during execution. aka `Documentation`      |
| `Data`               | Raw facts or information (like numbers or text) used by a program.            |
| `Data Structure`     | A way to organize and store data (e.g., lists, arrays, dictionaries).         |
| `Variable`           | A named location in memory to store data that can change during execution.    |
| `Operator`           | A symbol that performs an action on values (e.g., `+`, `-`, `==`).            |
| `Control Structure`  | Directs the flow of a program using decisions and repetition (e.g., `if`, `while`). |
| `Procedure Definition` | Writing a named block of code (function) to perform a specific task.        |
| `Procedure Call`     | Using or running a procedure (function) that was previously defined.          |
| `Class`              | A blueprint for creating objects; defines properties and behaviors.           |
| `Object`             | An instance of a class; contains data and functions defined by the class.     |
| `Algorithm`          | A step-by-step set of instructions to solve a problem or perform a task.      |

<br>
<br>

`*IMPORTANT NOTE*` <br>
In these notes:
* `<>` angle brackets indicate a variable part of the command. For example: \<filepath> indicates any filepath  
* For simplicity commands with a leading `>` should be understood as Windows Commands unless otherwise specified 
* For simplicity commands with leading `$` should be understood to be Linux/MacOS commands unless otherwise specified  

---

<br>

Now that you have the basics, create a new file named `Main.java`, open it in your favorite text editor and let's begin learning about the Python Programming Language.
> * If it is your first time programming I recommend VScode as a text editor you can get it here: [https://code.visualstudio.com/](https://code.visualstudio.com/)


<br>

[Back To Top](#java-comments-input-output-and-errors)
___

<br>


# `An Introduction to the Java Programming Language`
*`Script Kiddie's First Program:`*

### ***Welcome Script Kiddies, to the Java Programming Language***
*As a new programmer you might be refered to as a Script Kiddie.*   
*This is a programmer joke to describe someone who does not know much about programming*  
*Script Kiddies often use code they do not understand written by other programmers, this is ok for now as you will get better as you code more!*  


`Java` is a high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. It was developed by `James Gosling` and his team at `Sun Microsystems` and first released in `1995`. Java’s philosophy is `“write once, run anywhere” WORA` — meaning that compiled Java code can run on any platform that supports the `Java Virtual Machine (JVM)`, making it highly portable. Java is widely used in enterprise software, Android app development, web applications, cloud computing, and more.

<br>

1995: Java 1.0: <br>
* May 23, 1995: Java 1.0 was officially released. It introduced key concepts such as the JVM, garbage collection, and the applet model for running small Java programs in web browsers.

<br>

1998: Java 2 (J2SE 1.2): <br>
* December 1998: Java 2 was released as a significant update, introducing the Swing GUI toolkit, the Collections Framework, and the concept of Java Enterprise Edition (J2EE).

<br>

2004–2006: Java 5 and Java 6 <br>
* September 30, 2004: Java 5 (originally 1.5) introduced major new features like generics, metadata annotations, enumerated types, and the enhanced for-loop.
* December 11, 2006: Java 6 added performance improvements and support for scripting languages.

<br>

2010: Oracle Acquires Sun Microsystems <br>
* January 27, 2010: Oracle Corporation acquired Sun Microsystems, becoming the new steward of Java. Development continued under Oracle’s guidance.

<br>

2014: Java 8 <br>
* March 18, 2014: Java 8 introduced major enhancements including lambda expressions, the Stream API, and the new Date and Time API. This version brought Java closer to modern functional programming styles.

2017: Java 9 and the 6-Month Release Cycle <br>
* September 21, 2017: Java 9 introduced the `Java Platform Module System (JPMS)`, also known as Project Jigsaw. After this, Java switched to a new release model with updates every 6 months.

2023–2024: Modern Java (Java 20 and beyond)<br>
* Recent versions have introduced pattern matching, records, virtual threads (Project Loom), and continued performance enhancements — keeping Java relevant in modern software development.

<br>



<br>

[Back To Top](#java-comments-input-output-and-errors)
___

<br>

# `Java SE, JDK, JRE, and JVM`
To get started with developing in Java you will need to be familiar with `Java Standard Edition JE` the `Java Development Kit JDK`, the `Java Runtime Environment JRE`, and the `Java Virtual Machine JVM`.  

<br>

### Java Standard Edition
`Java Standard Edition Java SE` is the specification for the core Java platform, and defines what features, application programming interfaces APIs, and tools Java must have. 

Includes specifications for:
* The language and compiler
* The JVM
* Core Libraries (APIs)
* Development tools

---

<br>

### Java Development Kit JDK
Basically: The `Java Development Kit JDK` is the toolbox that is needed for writing, compiling, and debugging Java Programs based on the Java SE specification.


Specifically: `The Java Development Kit JDK` is a software development environment provided by Oracle and other vendors for building Java applications based on the Java SE specification.

<br>

#### The JDK includes:
* The compiler `javac`
* The `JRE` with the `JVM`
* Development tools including `javadoc`, `jar`, and `jdb`.
    * `javadoc` for generating documentation
    * `jar` for bundling classes into executable archives (`.jar files`)
    * `jdb` for debugging Java programs

<br>

There are two options for downloading and installing the JDK:

* `OpenJDK` is the open-source implementation of `Java SE` maintained by Oracle and the community (Red Hat, Amazon, Eclipse, etc.).

* `Oracle JDK` which is developed and maintained by Oracle, is based on OpenJDK, but may also include proprietary tools, long term support (LTS), and paid commerical licenses.
    * It is free for personal use, development, and testing under the Oracle `No-fee terms and conditions` (`NFTC`)

<br>

| Feature  | `Oracle JDK` | `OpenJDK` |
|--|--|--|
| License                | Oracle NFTC (limited free)  | GPL v2 + Classpath Exception     |
| Cost                   | Free for dev/test, paid for commercial use | Free (no cost)        |
| Support                | Commercial (paid)           | Community-based (or vendor-provided) |
| Extra features         | Some proprietary tools      | Only open-source components      |
| Source code            | Mostly same as OpenJDK      | Fully open-source                |


<br>

Which should you choose?
* Choose` OpenJDK` if you want a fully open-source version of Java, often with no usage restrictions.
    * https://jdk.java.net/24/

<br>

*  Choose `Oracle JDK` if you want official support or you're in a corporate environment that requires it.
    * https://www.oracle.com/java/technologies/downloads/#jdk24-linux

---

<br>

### Java Runtime Environment JRE
Basically: The `Java Runtime Environment JRE`  is used to run Java programs. 

Specifically: The `Java Runtime Environment JRE` is a software package that provides the core runtime environment required to execute Java applications.

<br>

#### The JRE includes: 
* The `JVM`
* The `Java Standard Library`

`The JRE does NOT include the javac compiler`

---

<br>

### Java Virtual Machine JVM
Basically: The Java Virtual Machine JVM executes the compiled bytecode (.class file) generated by the compiler. 

Specifically: The `Java Virtual Machine JVM`  is a virtual execution engine that loads, verifies, and executes Java `bytecode` (`.class` files) by converting it into `machine code` instructions to be executed by the `CPU`. 
* The JVM is what makes Java `write once run anywhere WORA`

<br>

The JVM:
1. Loads `.class` files at runtime
1. Verifies the `.class` bytecode
1. `Interprets` or `Just in Time JIT` compiles bytecode into native machine code
1. Handles heap, stack, and garbage collection
1. Enforces runtime security policies


`Java is both a compiled and interpreted language`

<br>

[Back To Top]()
___

<br>

# `Java Installation Path`

The location in which the JDK has been installed is the Java Installation Path.

It depends on how you install the JDK, but here are the most likely locations.
* On Windows:
```
C:\Program Files\Java\jdk-<version>
```

<br>

* On Mac
```
/Library/Java/JavaVirtualMachines/jdk-<version>.jdk
```

<br>

* On Linux
```

```




<br>

[Back To Top]()
___

<br>

# `Java File Setup`
Each `.java` file contains a `class` or `interface` definition. 

* A `class` is a blueprint that contains data, variables, and methods. Classes will be covered in greater detail in another file. 
* An `interface` is similiar to a class, and can be though of as an outline. Interfaces will be covered in another file. 

<br>

### To build a program in java begin with the following steps:
1. Create a file with the `.java` extension.
    1. `The filename is important and must be the same as the class name you write in the file.` 
2. Create a `class header` with the same class name as the file.
3. Create a `main method header`

<br>

For example, in a file named `Main.java`:
```java
public class Main{ // This is the class header

    public static void main(String[] args){ // This is the main method header
       
       // BEGIN WRITTING CODE HERE
        
    } // The main method definition ends here

} //The class definition ends here
```

<br>

For example, in a file named `MyClass.java`:
```java
public class MyClass{ // This is the class header

    public static void main(String[] args){ // This is the main method header

        // BEGIN WRITTING CODE HERE

    } // The main method definition ends here

} // The class definition ends here
```


* For now code should be written between the curly braces {} and indented below the `main header`.

---

### *The meaning of the class header and method header code will be explained in other files, as there’s quite a lot to unpack. For now, just remember to include this code when writing your Java files.* 

```java
public class Main{
    public static void main(String[] args){

    }
}
```

---

<br>

[Back To Top]()
___

<br>

# `Executing a Java Program`
`Source code` refers to the human-readable set of instructions and statements written by a programmer using a programming language.  
* While it may not seem like it, source code is not actually understandable to the computer.
* The code written in a `.java` file is `source code`

<br>

A special program is needed to translate this `high-level human-readable source code` into another form of code that the `JVM` can understand called `bytecode` and finally, `machine code` that is executed by the `CPU`. 
* `Bytecode` is an intermediate, lower-level representation of your source code. It is generated by interpreters or compilers and is not directly executed by the hardware.

* `Machine code` is the set of binary instructions directly understood by a computer's `CPU`. It’s the final stage of code execution.

<br>

In Java, the program that translates the source code into bytecode is the `Java Compiler`.

<br>

### To execute code written in Java:
1. Java `source code` must be compiled into `bytecode`.
1. `Bytecode` must be translated into `machine code` by the `Java Virtual Machine JVM`.
1. `Machine code` instructions are then executed by the `CPU`.

<br>

||||||||
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|Source Code|-->|Byte Code|-->|Machine Code|-->|Result|
||||||||  
|text|Java Compiler|Bytes|Java Virtual Machine|Binary|CPU|
||||||||  
|stored in `.java` file|`javac.exe` (Windows)<br> `javac` (Linux/Mac)|stored in a `.class` file. <br> Is platform independent|JVM|Is platform dependent||Output|
||||||||  

---

<br>

## `Compiling Source Code to Bytecode`
To compile source code into bytecode use the `javac` command.
* The command is `javac` regardless of platform (Windows/Linux/Mac)

<br>

`Compile Time` is the time in which code is translated from source (`.java`) into bytecode (`.class`) by the compiler (`javac`)

<br>

syntax
```
javac <filepath>
```

<br>

Example with a file named `Main.java` that contains the following code:
```java
public class Main{

    public static void main(String[] args){
        
        System.out.println("Welcome to Java!");

    }
}
```

On the command line run:
```
javac Main.java
```
The output will be a file named `Main.class`

<br>

[Back To Top]()
___

<br>

## `Executing Bytecode`
To execute a bytecode (`.class`) file use the `java` command.
* The command is `java` regardless of platform (Windows/Linux/Mac)

<br>

`Runtime` is the time when bytecode (`.class`) is executed by the `JVM`.

<br>

syntax
```
java <ClassName>
```

<br>

Example with a file named `Main.class`
```
java Main
```
Notice that the java command takes the name of the class, not the name of the file.

<br>

[Back To Top]()
___

<br>
# `Introduction to Java`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*
___

Covered in this file:

1. [`What is a program?`](#what-is-a-program)
    1. [`Source Code`](#source-code)
    1. [`Sequential Programming`](#sequential-programming)
1. [`An Introduction to the Java Programming Language`](#an-introduction-to-the-java-programming-language)
1. [`Java SE, JDK, JRE, and JVM`](#java-se-jdk-jre-and-jvm)
1. [`Code Editors for Java`](#code-editors-for-java)
1. [`Java Installation Path`](#java-installation-path)
1. [`Java File Setup`](#java-file-setup)
1. [`General Java Syntax`](#general-java-syntax)
1. [`Executing a Java Program`](#executing-a-java-program)
    1. [`Compiling Source Code to Bytecode`](#compiling-source-code-to-bytecode)
    1. [`Executing Bytecode`](#executing-bytecode)



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

<br>

### What programs include:
| Concept                  | Definition                                                                 |
|--------------------------|---------------------------------------------------------------------------|
| `Comments and Documentation` | Notes and explanation of the source code and its functions                 |
| `Statements`             | Individual instructions that perform actions when executed                |
| `Data`                   | Raw facts or values processed by the program (e.g., numbers, text)        |
| `Data Structures`        | Organized formats for storing and managing data (e.g., arrays, lists)     |
| `Operations`             | Actions performed on data, such as arithmetic or logical computations     |
| `Expressions`            | Combinations of values, variables, and operators that produce a result    |
| `Variables`              | Named storage locations that hold data values used in a program           |
| `Control Structures`     | Constructs that control the flow of execution (e.g., `if`, `for`, `while`)|
| `Procedures`             | Reusable blocks of code (functions or methods) that perform specific tasks|
| `Algorithms`             | Step-by-step procedures for solving a problem or completing a task        |

---

<br>

## `Source Code`

`Source code` refers to the human-readable set of instructions and statements written by a programmer using a programming language. 
* Source code is usually written in text.

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

`*IMPORTANT NOTE*` <br>
In these notes:
* `<>` angle brackets indicate a variable part of the command. For example: \<filepath> indicates any filepath  
* For simplicity commands with a leading `>` should be understood as Windows Commands unless otherwise specified 
* For simplicity commands with leading `$` should be understood to be Linux/MacOS commands unless otherwise specified  



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

[Back To Top](#introduction-to-java)
___

<br>

# `Java SE, JDK, JRE, and JVM`
To get started with developing in Java you will need to be familiar with `Java Standard Edition JE` the `Java Development Kit JDK`, the `Java Runtime Environment JRE`, and the `Java Virtual Machine JVM`.  

```
Java SE (Specification)

+-[ JDK (Implementation) ]-----------------------+
|                                                |
|       +-[ JRE ]------------------------------+ |
|       |                                      | |
|       |       +-[ JVM ]--------------------+ | |
|       |       |                            | | |
|       |       +----------------------------+ | |
|       +--------------------------------------+ |
+------------------------------------------------+
```

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
Basically: The `Java Virtual Machine JVM` executes the compiled bytecode (`.class` file) generated by the compiler. 

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

[Back To Top](#introduction-to-java)
___

<br>

# `Code Editors for Java`
There are many different code editors for working with Java.
* I recommend using a simple text editor in the beginning and later graduating to an IDE. 

### Text Editors
A `text editor` is an application used to create, view, and edit plain text files. 

<br>

Text Editors for working with Java: 
* Notepad (Windows)
* Notepad++ (Windows)
* `VS Code (RECOMMENDED)`
* Sublime Text (Cross Platform)
* Vim (Terminal-based with a high learning curve)
* Emacs (Terminal/GUI hybrid with a high learning curve)


<br>

### Integrated Development Environments IDEs

An `Integrated Development Environment IDE` is an application that provides a complete set of tools for developing software all in one place. 

IDEs typically include:
* A code editor
* The compiler/interpreter
* A debugger
* Build Tools
* Syntax Highlighting
* Code Completion
* File Explorer
* Version Control Integration
* Refactoring Tools

<br>

IDEs for working with Java:
* NetBeans (Official Oracle IDE)
* Eclipse  (Free and widely used)
* BlueJ (Educational for beginners)
* IntelliJ IDEA (Industry used)

<br>

[Back To Top](#introduction-to-java)
___

<br>

# `Java Installation Path`

The location in which the JDK has been installed is the Java Installation Path.

It depends on how you install the JDK, but here are the most likely locations.
* On Windows:
    * Try the command `Get-Command java`
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
    * Try the command `readlink -f $(which java)`
```
/usr/lib/jvm/java-<version>-openjdk-amd64
```

<br>

[Back To Top](#introduction-to-java)
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

[Back To Top](#introduction-to-java)
___

<br>

# `General Java Syntax`
`Syntax` refers to the rules for how a language is written.
* Each programming language has its own syntax. 

<br>

* Java source code is read from `top to bottom` and `left to right`. 
* Curly Braces `{}` are used to define code blocks. 
* Each statement is ended with a semicolon `;`.

<br>


## `Every Opening Needs a Closing: '', "", (), [], {}`

In general most symbols in Java come in pairs, every opening symbol requires a closing symbol.


```java
'' // single quotes
"" // double quotes
() // parenthesis
[] // square brackets
{} // curly braces
```

<br>

## `Curly Braces {} Define Code Blocks`
Curly Braces {} define scope, and code blocks in Java. 
* Code inside of the curly braces is considered apart of that block. 

This curly braces are used for control flow statements (if, else if, else, while, for), methods, classes, etc.
```java
if(condition){
    // code block
}
else if(condition){
    // code block
}
else{
    // code block
}
```
```java
while(condition){
    // code block
}
```
```java
for(int i = 0; i < 10; i++){
    // code block
}
```
```java
public static void main(String[] args){
    //code block
}
```

```java
public class Main{
    // code block
}
```

<br>

## `Statements End with a Semicolon ; `
A statement is a line of code that performs and action.
* statements end with a semicolon `;`

<br>

example
```java
System.out.println("Hello World");  // This is a statement
```


<br>

## `Style Guide`
A `style guide` is a set of rules and best practices for writing code in a consistent and readable way. It defines how the code should look and be structured — not how it functions, but how it is formatted, named, and organized.

There are two main style guides, but also many others:
1. Google's Style Guide (more modern) https://google.github.io/styleguide/javaguide.html
1. Oracle Coding Conventions (older) https://www.oracle.com/java/technologies/javase/codeconventions-contents.html

<br>

### Important takeaways:

1. Naming Conventions
    * Class names use `PascalCase`
    * Method and variable names use `camelCase`
    * Constants use `ALL_CAPS_WITH_UNDERSCORES`
1. `Cruly braces {}` should alway be used even if the construct is just one line. 
1. Use 2 space indentation (Google Style) or 4 space indentation (Oracle Style)
    * Do not use tabs
1. Lines shoulc not exceed 100 characters
1. Class Organization and Order of Contents:
    1. Static Variables
    1. Instance Variables
    1. Constructors
    1. Public Methods
    1. Private Methods
1. Spacing 
    * Include one space after keywords (if, while, for, etc.)
    * Do NOT include spaces before semicolons or commas. 
1. Blank lines should seperate multiple methods, classes, etc. 


<br>

## `Universal Programming Truths`

###  1. Syntax is either perfectly written or it is wrong.
###  2. All software is broken.


<br>

[Back To Top](#introduction-to-java)
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

[Back To Top](#introduction-to-java)
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

[Back To Top](#introduction-to-java)
___

<br>

*Created and Maintained by Mr. Merritt*
# `Java Comments Input Output and Errors`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*
___

Covered in this file:
1. [`Introduction to the Java Programming Language`](#an-introduction-to-the-python-programming-language)
1. [`Single/Multi Line Comments`](#singlemulti-line-comments)
    1. [`Single-line comments`](#single-line-comments)
    1. [`Multi-line comments`](#multi-line-comments-docstrings)
1. [`First Program: Console Output`](#first-program-console-output)
1. [`First Program: User Input`](#first-program-user-input)
1. [`Executing Python Programs`](#executing-a-python-program)
    1. [`How Python Source Code is executed`](#how-python-source-code-is-executed)
    1. [`Executing Your Program`](#executing-your-program)
1. [`Python Installation Path`](#python-installation-path)
    1. [`Python on Windows`](#python-on-windows)
    1. [`Python on MacOs/Linux`](#python-on-linux-or-macos)
1. [`You are Experiencing an Error!`](#you-are-experiencing-an-error)
    1. [`Syntax/Compile Time Errors`](#syntaxcompile-time-errors)
        1. [`Fixing Syntax/Compile Time Errors`](#fixing-syntaxcompile-time-errors)
    1. [`Runtime Errors`](#runtime-errors)
        1. [`Fixing Runtime Errors`](#fixing-runtime-errors)
    1. [`Logical Errors`](#logical-errors)
        1. [`Fixing Logical Errors`](#fixing-logical-errors)

<br>

___

<br>


# `Comments and Documentation`
Basically: A `comment` is a note written in a code file. 

Specifically: A `comment` is piece of text written within source code that is ignored by the interpreter.

<br>

Comments:
* Are ignored by the interpreter
* Are used to document code (make notes) for yourself and others.
* It is considered best practice to comment and document your code. 
* Are used to temporarily disable parts of code during debugging, without deleting the code. 

<br>
<br>

`Documentation` refers to written text or materials that explain how a software system, library, function, or codebase works. 
* Intended to help users and developers understand, use, and maintain the code effectively.
* Comments are one way to document code for yourself and others.

<br>

Documentation in Java:
1. Comments (Single/Multi-line)
1. Javadocs
1. External Documentation (other files/tools)

`The best programmers write easy to read and well documented (commented) code.`

<br>

# `Single Line Comments`
* Use `//` to make a single line comment. 
* Text to the right of `//` is apart of the comment. 

```java
// This is a single line comment
// Comments are ignored by the compiler
// Use comments to document your code. 
// use '//' to make single line comments in Java
```

<br>

# `Multi-Line Comments`
* Use `/*` and `*/` to make a multi-line comment. 
* Text writen between `/*` and `*/` is apart of the comment. 
```java
/* 
Multi-
    Line
        comment
*/
```

<br>

# `Javadocs`
`Java Documentation Comments (Javadocs)` are specially formatted comments that is used to describe classes, methods, etc. in Java. 
* Use `/**` and `*/` to create a Javadoc comment.
* Text written between `/**` and `*/` is apart of the Javadoc
* Javadocs can be extracted into an HTML file using the JDK's `javadoc` command.
* Javadocs must precede the class or the method header in order to be extracted to an HTML file.

<br>

```java
/** 
   This is a javadoc comment. 

*/
```

<br>

[Back To Top](#java-comments-input-output-and-errors)
___

<br>



# `First Program: Console Output`
To produce output to the console write a java `statement` with the `System.out.println()` or `System.out.print()` `built-in method call`.
* A `statement` is a single instruction that tells the computer to do something and ends with a semicolon `;`. It is the smallest executable unit in a Java program.

* A `built-in method call` in Java is when you use a method that is already defined by the Java language or its standard libraries, rather than writing your own.

<br>
    
`System.out.print()` does NOT move the cursor to the next line after printing. 
```java
public class Main{
    public static void main(String[] args){

        System.out.print("Hello ");
        System.out.print("World.");
        // Output: 
        // Hello World.

    }
}
```


<br>

`System.out.println()` moves the cursor to the next line after printing
```java
public class Main{
    public static void main(String[] args){
        
        System.out.println("Hello "); 
        System.out.println("World.");
        // Output:
        // Hello
        // World.

    }
}
```

<br>

[Back To Top](#java-comments-input-output-and-errors)
___

<br>

# `First Program: User Input`
To take user input in Java do the following:
1. import the Scanner class using `import java.util.Scanner`
```java
import java.util.Scanner;
```
2. Create a Scanner object using `new Scanner(System.in)`
    * An `object` is an instance of a class, if the class is a blueprint then the object is what is made from the blueprint.
```java
new Scanner(System.in);
```
3. Prompt the user with a print statement.
1. Read in input using the appropriate built-in method call.  
    * For now use `.nextLine()`
```java
scanner.nextLine();
```
5. Close the scanner.
```java
scanner.close();
```

<br>

All together:
```java
import java.util.Scanner; // Import the Scanner class


public class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Type Some Input: ");  // Prompt the user 

        String input = scanner.nextLine();        // Read in input with .nextLine()
        
        System.out.println(input);                // Use the input

        scanner.close();                          // Close the scanner 

    }
}
```

<br>

[Back To Top](#java-comments-input-output-and-errors)
___

<br>


## `Compiling Java Source Code`

## `How Java Source Code is executed`
## `Executing Your Program`

# `Java Installation Path`
# `You are Experiencing an Error!`


Common Errors:

    Errors will show up when coding
    There are 3 types of errors:
    Syntax errors: errors that are detected by the compiler due to incorrectly written syntax
    Runtime errors: errors that cause the program to crash unexpectedly
    Logic errors: errors that cause the program to operate other than intended.
         
    Common errors to think about:
        Missing braces {}
        Missing semicolon ;
        Missing quotation mark ""
        Misspelling names
         

*/


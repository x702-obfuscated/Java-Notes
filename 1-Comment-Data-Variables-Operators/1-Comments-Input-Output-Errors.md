# `Java Comments Input Output and Errors`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*
___

Covered in this file:
1. [`Comments and Documentation`](#comments-and-documentation)
1. [`Single Line Comments`](#single-line-comments)
1. [`Multi-Line Comments`](#multi-line-comments)
1. [`Javadocs`](#javadocs)
1. [`First Program: Console Output`](#first-program-console-output)
1. [`First Program: User Input`](#first-program-console-output)
1. [`Errors`](#errors)
    1. [`Compile Time Errors`](#compile-time-errors)
    1. [`Runtime Errors`](#runtime-errors)
    1. [`Logical Errors`](#logical-errors)
1. [`Debugging`](#debugging)

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

### Putting it together
```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name: ");

        String username = scanner.nextLine();
        scanner.close();

        System.out.println("Welcome " + username + " to the Java Programming Language!");
    }
}
```

<br>

[Back To Top](#java-comments-input-output-and-errors)
___

<br>


# `Errors`
Oh no... you have done something incorrect and are now experiencing an `error`. 
Not to worry as a human you are prone to many errors, that we machines don't make.

<br>

To make it easier for you to correct your many `PEBKAC` and `ID 10 T` Errors, these errors can be categorized into 3 categories:

### Main Error Categories:
|Error|Description|
|:-:|:-|
|`Syntax/Compile Time Errors`|occur when compiling the code, and the code violates the rules of the programming language's `syntax`.|
|`Runtime Errors`|occur after the program has been successfully compiled and started execution but result in a `crash`. They usually result from `invalid operations`.|
|`Logical Errors`|occur when a program runs without crashing but produces incorrect results. These errors are caused by `mistakes in the program's logic`, meaning the code does not behave as intended.|

`NOTE:`
* `PEBKAC Errors` are thrown when the Problem Exists Between the Keyboard and Chair.
* `ID 10 T Errors` are thrown when the issue is caused by the user. 

<br>

[Back To Top](#java-comments-input-output-and-errors)
___

<br>

## `Compile Time Errors` 
A `Compile Time Error` or `Syntax Error` occurs when the source code violates the rules of the programming language’s grammar or structure (syntax).
* These errors are typically the easiest errors to fix, and the most common errors that occur.

<br>

|Common Compile Time Errors|
|:-|
| Missing braces `{}`, `[]`, `()`|
| Missing semicolon `;`|
| Missing quotation mark `""` or `''`|
| Misspelling names|

<br>

### Compile Time Error Reports
If a compile time error occurs Java will generate an error report that indicates the filename where the error occured, the line number of the error, and what was expected. 

Example:
```java
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World!") 
    }
}
```
Console Output:
```
Main.java:4: error: ';' expected
        System.out.println("Hello World!") 
                                          ^
1 error
```

<br>

### Fixing Syntax/Compile Time Errors
1. READ THE ERROR OUTPUT. 
2. Look for the line number.
3. Look for what was expected.
4. Remember that error reports are not full proof and will sometimes not perfectly identify the error.


<br>

[Back To Top](#java-comments-input-output-and-errors)
___

<br>

## `Runtime Errors`
A `Runtime Error` occurs after the program has successfully compiled (no syntax errors), but an invalid operation has been attempted causing the JVM to terminate program execution.
* The JVM generates a `traceback` error report for runtime errors.

<br>

### The Traceback
When a Runtime Error occurs, and error report called a traceback is generated by the JVM.

A `Traceback` or `Stack Trace` is a detailed error message that shows the call stack at the point where an exception occurred, helping identify the sequence of function calls that led to the error.

Example:
```java
public class Main{
    public static void main(String[] args){
        System.out.println(5 / 0);
    }
}
```
Console Output:
```
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:4)
```


<br>


### Common Runtime Errors in Java
| **Exception Type**               | **Description**                                                              | **Example That Causes It**                          |
| -------------------------------- | ---------------------------------------------------------------------------- | --------------------------------------------------- |
| `NullPointerException`           | Thrown when you try to use an object reference that is `null`.               | `String s = null; s.length();`                      |
| `ArithmeticException`            | Thrown when an illegal arithmetic operation occurs, like divide by zero.     | `int x = 10 / 0;`                                   |
| `ArrayIndexOutOfBoundsException` | Thrown when trying to access an array index that doesn’t exist.              | `int[] arr = {1, 2}; System.out.println(arr[3]);`   |
| `ClassCastException`             | Thrown when you try to cast an object to a subclass it isn’t an instance of. | `Object x = "hello"; Integer y = (Integer)x;`       |
| `IllegalArgumentException`       | Thrown when a method receives an argument that is inappropriate or illegal.  | `Thread.sleep(-100);` or `Integer.parseInt("abc");` |

<br>

### Fixing Runtime Errors:
1. READ THE TRACEBACK
2. Look for the exception type 
3. Look for the line number
4. Remember that the traceback is not full proof and will sometimes not perfectly indetify the exception.

<br>

### Exceptions
Runtime errors can be further specified as `exceptions`.
* An `exception` is a specific type of runtime error that can be caught, handled, and recovered from using `try catch`. 

```
java.lang.Throwable
├── java.lang.Error           → Serious problems (not meant to be caught)
└── java.lang.Exception       → Recoverable problems
     ├── Checked Exceptions   → Must be declared or handled (e.g., IOException)
     └── Unchecked Exceptions → Subclass of RuntimeException (e.g., NullPointerException)
```

<br>

<br>

[Back To Top](#java-comments-input-output-and-errors)
___

<br>

## `Logical Errors`
A `logical error` is a type of error in a Java program where the code runs without crashing, but it produces incorrect or unexpected results due to a mistake in the program’s logic.
* Logical Errors tend to occur with lesser frequency than runtime or compile time errors, but are the hardest to track down.

<br>

Example:
```java
public class Main{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int average = a + b / 2;  
        // int average = a + b / 2; // logic error due to missing parentheses
        System.out.println("Average: " + average);
    }
}
```

<br>

### Fixing Logical Errors  
1. DEBUGGING
    * This will be harder than Compile time or Runtime Errors, because you will not get any help from the computer in tracking down the error.
    * Learning to use a debugging tool will be the most useful to you, but beginners usually start with print debugging.


<br>

[Back To Top](#java-comments-input-output-and-errors)
___

<br>


# `Debugging`
`Debugging` is the process of identifying, analyzing, and fixing bugs or errors in software.

<br>
<br>

Debugging occurs in the following steps:
| Step Number | Step Name       | Description|
|-|---|-------|
| 1 | `Detection` | Identifying that a bug exists, typically through user reports, test failures, or odd behavior. |
| 2 | `Reproduction`| Reproducing the problem consistently to understand how and when it occurs. |
| 3 | `Diagnosis` | Investigating and determining the root cause of the bug within the code or system. |
| 4 | `Correction`| Making the necessary code or configuration changes to fix the bug. |
| 5 | `Testing` | Verifying that the fix works and does not introduce new issues.|
| 6 | `Documentation` | Recording details about the bug, its cause, the fix applied, and any relevant notes. |
| 7 | `Prevention`| Implementing safeguards like tests, code reviews, or design changes to avoid future bugs.|



<br> 

Common Methods of Debugging:
| Technique | Definition | Description |
|------------------------------|------------------------------------|-----------------------------------------------------------------------------------------------|
| `Hand Tracing` | Manually reading through the code | Stepping through code line by line (on paper or mentally) to track variable values and logic flow. |
| `Adding Output Statements` | Print values during execution| Inserting `print()` or logging statements to display variable values and check the program’s progress or logic. |
| `Test Cases` | Check input-output behavior| Designing specific scenarios with known inputs and expected outputs to ensure code correctness and isolate bugs. |
| `Debugging Tools`| Using a software tool to find bugs  | Employing tools like IDE debuggers to set breakpoints, inspect memory, and step through code interactively. |




<br>

[Back to Top](#java-comments-input-output-and-errors)
___

<br>

*Created and maintained by Mr. Merritt* 


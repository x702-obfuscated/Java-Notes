# `Java Simple Methods and Calls`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*

[Java Documentation](https://docs.oracle.com/en/java/javase/index.html)

For brevity in these notes please assume all of the code snippets in this file are written inside of this class unless otherwise stated.
```java
public class Example {

    // new methods written here

    public static void main(String[] args){
        
    }

}
```
---

Covered in this file:
1. [`Quickstart Guide to Methods`](#quickstart-guide-to-methods)
1. [`Common java.lang.System Methods`](#common-javalangsystem-methods)
1. [`Common java.lang.String Methods`](#common-javalangstring-methods)
1. [`Common java.lang.Math Methods`](#common-javalangmath-methods)
1. [`Common Conversion Methods`](#common-conversion-methods)
1. [`Common Array Methods`](#common-array-methods)
1. [`User input java.util.Scanner`](#user-input-javautilscanner)
1. [`File Input/Output java.io`](#file-inputoutput-io)
1. [`Nested Methods Calls`](#nesting-method-calls)

<br>

---

<br>

# `Quickstart Guide to Methods`

Basically: A `method` is a block of reusable code written inside a class that performs a specific task.

Specifically: A `method` is a self-contained block of code belonging to a class that performs a specific task and can be reused throughout a program and contributes to abstraction, modularity, reusability, and organization of source code.

`NOTE: In Java, methods are very similar to functions in other languages. The term “function” and “method” are often used interchangeably, but in Java they are called methods because they always belong to a class.`

<br>

### Quick Guide to Method Terms

|Term | | Definition|
| :---------------: | :-------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Method Definition | defines how to perform a task | block of code inside a class that specifies a sequence of statements to perform a specific task.<br> It includes the method’s name, parameters (if any), return type, and the body of the method. |
| Method Header | signature of the method | the first line of a method definition that specifies the method’s access modifier (e.g., `public`), optional keywords (e.g., `static`), return type, method name, and parameters. It tells the compiler how the method can be used but does not include the body. |
| Method Call| executes the method and returns result| the process of invoking or executing a method that has been defined earlier.|
| Parameters <br>(Formal Parameters)| variables needed to perform method (optional) | variables inside the parentheses that are used to pass information into methods.|
| Arguments <br>(Actual Parameters)| values given to parameters| the actual values or data you pass to a method’s parameters when you call it. |
| Return| result of a method (optional) | returns the result of a method to the caller (Method Call). A method may return `void` if no result is returned.                                                                                |

<br>

General Method Definition Syntax:

```java
returnType methodName(Type parameter1, Type parameter2, ...) {  //method header
    // method body
    return value;  // optional
}
```

General Method Call Syntax:

```java
objectName.methodName(argument1, argument2, ...);
```

<br>  

## Method Definition and Call Examples:

```java
// Method Definition
public static int add(int a, int b) {
    return a + b;
}

// Method Calls
System.out.println(add(2, 2));    // Returns: 4
System.out.println(add(5, 4));    // Returns: 9
System.out.println(add(2, 10));   // Returns: 12


// Store the return value in variables
int a = add(2, 2);    // a = 4
int b = add(5, 4);    // b = 9
int c = add(2, 10);   // c = 12

System.out.println(a); // Outputs: 4
System.out.println(b); // Outputs: 9
System.out.println(c); // Outputs: 12
```

<br>  

Another Example:

`Note:` This method does not specify a return value (`void`). Since it does not return anything, assigning its return value to a variable is not useful.

```java
// Definition
public static void count(int start, int stop, int step) {
    for (int n = start; n <= stop; n += step) {
        System.out.print(n + " ");
    }
}

// Calls
count(1, 5, 1);        // Output: 1 2 3 4 5 
count(10, 100, 10);    // Output: 10 20 30 40 50 60 70 80 90 100
count(0, 10, 2);       // Output: 0 2 4 6 8 10

// Trying to assign result of a void method
Void result = count(1,5,1); // count() does not return anything
```

<br>  

Another Example:

```java
// Definition
public static String combine(String a, String b, String c) {
    return a + b + c;
}

// Call
combine("Tying ", "Strings ", "Together.");

// Printing the return value directly
System.out.println(combine("Tying ", "Strings ", "Together."));

// Assign return value to a variable
String joined = combine("Tying ", "Strings ", "Together.");

// Printing the return value using a variable
System.out.println(joined);
```

<br>  

More Advanced Example:

```java
// Method Definition
public static int countVowels(String text) {
    int count = 0;
    for (char character : text.toLowerCase().toCharArray()) {
        if ("aeiou".indexOf(character) != -1) {
            count++;
        }
    }
    System.out.println("Number of vowels: " + count);
    return count;
}

// Method Call
countVowels("Hello World!"); 
// Returns: 3  
// Output: Number of vowels: 3

// Print return value of countVowels
System.out.println(countVowels("The problem is between the keyboard and the chair."));
// Output: 
// Number of vowels: 15
// 15

// Assign return value to a variable
int numVowels = countVowels("abcdefghijklmnopqrstuvwxyz"); 
// Returns: 5  
// Output: Number of vowels: 5

// Print the value referenced by numVowels
System.out.println(numVowels); // Output: 5
```

<br>

[Back to Top](#java-simple-methods-and-calls)

---

<br>  

# `Common java.lang.System Methods`
The `java.lang.System` class is a final class in the java.lang package that provides access to system-level resources and utility methods.
* It cannot be instantiated (its constructor is private). Instead, all of its fields and methods are static, meaning you use them directly with the class name System.

The built-in `java.lang.System` class in Java provides several useful built-in methods for input, output, and system-level operations.
* These methods are widely used by beginners to print output, exit programs, and work with time.

<br>

### Quick Guide to System Methods

|            Method            |                              | Description                                                                                                              |
| :--------------------------: | :--------------------------- | :----------------------------------------------------------------------------------------------------------------------- |
|     `System.out.print(x)`    | prints output (no newline)   | Prints the argument `x` to standard output without moving to a new line.                                                 |
|    `System.out.println(x)`   | prints output (with newline) | Prints the argument `x` to standard output and moves the cursor to the next line.                                        |
| `System.currentTimeMillis()` | returns current time in ms   | Returns the current time in `milliseconds` since January 1, 1970 (Unix epoch). Often used for measuring elapsed time.  |
|      `System.nanoTime()`     | returns current time in ns   | Returns the current time in `nanoseconds`. Useful for precise time measurement in benchmarking.                        |
|     `System.exit(status)`    | terminates program           | Terminates the program. A status of `0` indicates successful termination, while non-zero indicates abnormal termination. |

<br>

### Examples

```java
// Printing without newline
System.out.print("Hello ");
System.out.print("World!");
// Output: Hello World!

// Printing with newline
System.out.println("Hello");
System.out.println("World!");
// Output: 
// Hello
// World!
```

<br>

```java
// Measuring execution time using currentTimeMillis()
long start = System.currentTimeMillis();

for (int i = 0; i < 1000000; i++) {
    // simulate work
}

long end = System.currentTimeMillis();
System.out.println("Elapsed time: " + (end - start) + " ms");
```

<br>

```java
// Measuring execution time using nanoTime()
long start = System.nanoTime();

// simulate work
for (int i = 0; i < 1000000; i++) {}

long end = System.nanoTime();
System.out.println("Elapsed time: " + (end - start) + " ns");
```

<br>

```java
// Exit example
System.out.println("Program will exit now.");
System.exit(0);
System.out.println("This line will never be executed.");
```

<br>

[Back to Top](#java-simple-methods-and-calls)

---

<br>

# `Common java.lang.String Methods`

The `java.lang.String` class in Java provides many built-in methods to work with text.
* Strings are `immutable`, meaning their contents cannot be changed once created.
* When you use a method on a string, a new string is often returned.

<br>

### Quick Guide to String Methods

|Method || Description|
| :---------------------: | :------------------------------- | :----------------------------------------------------------------------------------------- |
|`length()` | returns number of characters | Returns the length of the string as an `int`.|
| `charAt(index)` | returns character at index | Returns the character at the specified zero-based index. |
| `substring(start, end)` | extracts a portion of the string | Returns a substring beginning at `start` index and ending before `end` index.|
| `toLowerCase()` | converts to lowercase| Returns a new string with all letters in lowercase.|
| `toUpperCase()` | converts to uppercase| Returns a new string with all letters in uppercase.|
|`equals(str)`| checks equality| Returns `true` if the string is exactly equal to another string (case-sensitive).|
| `equalsIgnoreCase(str)` | checks equality ignoring case| Returns `true` if two strings are equal, ignoring case.|
| `contains(seq)` | checks substring presence| Returns `true` if the string contains the specified sequence.|
| `trim()`| removes spaces | Removes leading and trailing whitespace. |
| `replace(old, new)` | replaces characters| Returns a new string where all occurrences of one char/sequence are replaced with another. |
|`split(regex)` | splits into array| Splits a string into an array based on a given delimiter (regex).                    |

<br>

### Examples

```java
String word = "Hello World";

// length()
System.out.println(word.length()); 
// Output: 11

// charAt()
System.out.println(word.charAt(0)); 
// Output: H

// substring()
System.out.println(word.substring(0, 5)); 
// Output: Hello
```

<br>

```java
// Case conversion
String name = "Java";
System.out.println(name.toLowerCase()); // Output: java
System.out.println(name.toUpperCase()); // Output: JAVA
```

<br>

```java
// Equality
System.out.println("hello".equals("hello"));          // true
System.out.println("hello".equals("Hello"));          // false
System.out.println("hello".equalsIgnoreCase("Hello"));// true
```

<br>

```java
// contains(), trim(), replace()
String text = "  OpenAI Java Guide  ";
System.out.println(text.contains("Java")); 
// true

System.out.println(text.trim()); 
// "OpenAI Java Guide"

System.out.println(text.replace("Java", "Python")); 
// "  OpenAI Python Guide  "
```

<br>

```java
// split()
String csv = "apple,banana,orange";
String[] fruits = csv.split(",");
for (String fruit : fruits) {
    System.out.println(fruit);
}
// Output:
// apple
// banana
// orange
```

<br>

[Back to Top](#java-simple-methods-and-calls)

---

<br>  

# `Common java.lang.Math Methods`

The `java.lang.Math` class in Java (part of `java.lang`) provides built-in methods for performing common mathematical operations.
* All methods in the `Math` class are `static` → you call them using `Math.methodName()`.
* The `java.lang.Math` class has a private constructor. This means it cannot be instantiated aka an object cannot be created.
* Provides functions for `absolute value, rounding, powers, roots, trigonometry, random numbers`, and more.

<br>

### Quick Guide to Math Methods

|      Method      |                        | Description                             |
| :--------------: | :--------------------- | :-------------------------------------- |
| `Math.max(a, b)` | returns larger value   | Returns the greater of two numbers.     |
| `Math.min(a, b)` | returns smaller value  | Returns the smaller of two numbers.     |
|   `Math.abs(x)`  | absolute value         | Returns the non-negative value of `x`.  |
|  `Math.sqrt(x)`  | square root            | Returns the square root of `x`.         |
| `Math.pow(a, b)` | exponentiation         | Returns `a` raised to the power `b`.    |
|  `Math.round(x)` | nearest integer        | Rounds to the closest `long` or `int`.  |
|  `Math.floor(x)` | largest integer ≤ x    | Rounds down (toward negative infinity). |
|  `Math.ceil(x)`  | smallest integer ≥ x   | Rounds up (toward positive infinity).   |
|  `Math.random()` | random between 0 and 1 | Returns a double ≥ 0.0 and < 1.0.       |

<br>

### Examples

```java
// max() and min()
System.out.println(Math.max(10, 20));   // Output: 20
System.out.println(Math.min(10, 20));   // Output: 10

// abs()
System.out.println(Math.abs(-15));      // Output: 15

// sqrt() and pow()
System.out.println(Math.sqrt(25));      // Output: 5.0
System.out.println(Math.pow(2, 3));     // Output: 8.0

// round(), floor(), ceil()
System.out.println(Math.round(5.7));    // Output: 6
System.out.println(Math.floor(5.7));    // Output: 5.0
System.out.println(Math.ceil(5.2));     // Output: 6.0

// random()
double r = Math.random();
System.out.println(r); // e.g. Output:  0.734123456

// Example: random number between 1 and 6 (like dice roll)
int dice = (int)(Math.random() * 6) + 1;
System.out.println("Dice roll: " + dice);

```


<br>

[Back to Top](#java-simple-methods-and-calls)

---

<br>  

# `Common Conversion Methods`

Conversion methods are used to `convert between data types`, such as from `String` to numbers, numbers to strings, or other type transformations.
* Many conversion utilities are provided by `wrapper classes` (like `Integer`, `Double`, etc.) and the `String` class.

<br>

### Quick Guide to Conversion Methods

|             Method            |                   | Description                                                                        |
| :---------------------------: | :---------------- | :--------------------------------------------------------------------------------- |
|    `Integer.parseInt(str)`    | String → int      | Converts a string to an integer. Throws `NumberFormatException` if invalid.        |
|   `Double.parseDouble(str)`   | String → double   | Converts a string to a double.                                                     |
|  `Boolean.parseBoolean(str)`  | String → boolean  | Converts `"true"` (ignoring case) to `true`, everything else to `false`.           |
|      `String.valueOf(x)`      | any type → String | Converts primitives or objects to their string representation.                     |
|     `Integer.toString(x)`     | int → String      | Converts an integer to a string.                                                   |
|      `Double.toString(x)`     | double → String   | Converts a double to a string.                                                     |
| `String.format(format, args)` | format conversion | Returns a formatted string (like printf).                                          |
|  `toString()` (from objects)  | object → String   | Returns the string representation of an object. Many classes override this method. |

<br>

### Examples

```java
// String to int
int num = Integer.parseInt("123");
System.out.println(num); // 123

// String to double
double pi = Double.parseDouble("3.14");
System.out.println(pi); // 3.14

// String to boolean
boolean flag = Boolean.parseBoolean("true");
System.out.println(flag); // true

// Number to String
String numStr = String.valueOf(456);
System.out.println(numStr); // "456"

// Using wrapper toString()
String piStr = Double.toString(3.14159);
System.out.println(piStr); // "3.14159"

// String.format()
String formatted = String.format("Name: %s, Age: %d", "Alice", 25);
System.out.println(formatted); 
// "Name: Alice, Age: 25"

// Object toString()
Object obj = new Object();
System.out.println(obj.toString()); 
// Something like "java.lang.Object@6f2b958e"

```

<br>

[Back to Top](#java-simple-methods-and-calls)

---

<br>  

# `Common Array Methods`
Arrays in Java are `objects` that store multiple values of the same type.
* arrays themselves are language-level constructs, however the `java.util.Arrays` class provides many useful `static methods` to work with arrays.

<br>

### Quick Guide to Array Methods

|               Method              |                        | Description                                                                          |
| :-------------------------------: | :--------------------- | :----------------------------------------------------------------------------------- |
|      `Arrays.toString(array)`     | convert array → string | Returns a string representation of the array for easy printing.                      |
|        `Arrays.sort(array)`       | sort array             | Sorts the array in ascending order.                                                  |
|    `Arrays.equals(arr1, arr2)`    | compare arrays         | Returns `true` if both arrays have the same elements in the same order.              |
| `Arrays.copyOf(array, newLength)` | copy array             | Returns a new array containing the first `newLength` elements of the original array. |
|    `Arrays.fill(array, value)`    | fill array             | Sets all elements of the array to the specified value.                               |
| `Arrays.binarySearch(array, key)` | search in sorted array | Returns the index of the key if found, otherwise a negative value.                   |

<br>

### Examples

```java
import java.util.Arrays; // You must import java.util.Arrays;
```
```java
int[] numbers = {5, 2, 8, 1, 9};

// toString()
System.out.println(Arrays.toString(numbers)); 
// Output: [5, 2, 8, 1, 9]

// sort()
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers)); 
// Output: [1, 2, 5, 8, 9]

// equals()
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
System.out.println(Arrays.equals(a, b)); 
// Output: true

// copyOf()
int[] copy = Arrays.copyOf(numbers, 3);
System.out.println(Arrays.toString(copy)); 
// Output: [1, 2, 5]

// fill()
int[] filled = new int[5];
Arrays.fill(filled, 7);
System.out.println(Arrays.toString(filled)); 
// Output: [7, 7, 7, 7, 7]

// binarySearch() (array must be sorted!)
int index = Arrays.binarySearch(numbers, 5);
System.out.println(index); 
// Output: 2 (position of 5 in sorted array)
```

`Notes:`
* `Arrays.binarySearch()` `requires the array to be sorted`; otherwise the result may be unpredictable.
* All methods in `java.util.Arrays` are `static`, so you call them directly on the class (`Arrays.methodName`).

<br>

[Back to Top](#java-simple-methods-and-calls)

---

<br>  

# `User Input java.util.Scanner`

The `java.util.Scanner` class in Java is used to `read input from the user`.
* reads data from the console (`System.in`), files, or other input streams.


<br>

### Quick Guide to Common Scanner Methods

|      Method     |              | Description                                                                   |
| :-------------: | :----------- | :---------------------------------------------------------------------------- |
|   `nextLine()`  | read line    | Reads an entire line of input as a `String`. Includes spaces.                 |
|     `next()`    | read word    | Reads a single word (delimited by whitespace).                                |
| `nextBoolean()` | read boolean | Reads the next token as a boolean (`true` or `false`).                        |
|   `nextByte()`  | read byte    | Reads the next token as a `byte` value.                                       |
|  `nextShort()`  | read short   | Reads the next token as a `short` value.                                      |
|   `nextInt()`   | read integer | Reads the next token as an `int`. Throws `InputMismatchException` if invalid. |
|   `nextLong()`  | read long    | Reads the next token as a `long` value.                                       |
|  `nextFloat()`  | read float   | Reads the next token as a `float` value.                                      |
|  `nextDouble()` | read double  | Reads the next token as a `double` value.                                     |

<br>

### Example

```java
import java.util.Scanner; // You must import java.util.Scanner;
```
```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter a boolean value: ");
boolean b = sc.nextBoolean();
System.out.println("Boolean: " + b);

System.out.print("Enter a byte value: ");
byte by = sc.nextByte();
System.out.println("Byte: " + by);

System.out.print("Enter a short value: ");
short sh = sc.nextShort();
System.out.println("Short: " + sh);

System.out.print("Enter an int value: ");
int i = sc.nextInt();
System.out.println("Int: " + i);

System.out.print("Enter a long value: ");
long l = sc.nextLong();
System.out.println("Long: " + l);

System.out.print("Enter a float value: ");
float f = sc.nextFloat();
System.out.println("Float: " + f);

System.out.print("Enter a double value: ");
double d = sc.nextDouble();
System.out.println("Double: " + d);

sc.nextLine(); // consume leftover newline
System.out.print("Enter a string: ");
String s = sc.nextLine();
System.out.println("String: " + s);

sc.close(); // You must close a scanner to prevent memory leaks.
```
```java
//import the java package class java.util.Scanner
import java.util.Scanner;

class Input {
  public static void main(String[] args){
    Scanner scannerObj = new Scanner(System.in); //Create a Scanner Object
    System.out.println("Enter your name:");//Prompts the user

    String name = scannerObj.nextLine(); //Reads user input
    System.out.println("User name accepted, Hello " + name);//Outputs the input

    //input types
    /*
    nextBoolean() reads a boolean value
    nextByte() reads a byte value
    nextDouble() reads a double value
    nextFloat() reads a float value
    nextInt() reads an integer value
    nextLine() reads a String value
    nextLong() reads a long value
    nextShort() reads a Short value
    */
  
    //reading values of different types
    System.out.println("Enter your grade: ");
    int grade = scannerObj.nextInt();
    System.out.println("Enter a rating from 0 to 1: ");
    double rating = scannerObj.nextDouble();
    System.out.println("Coding is fun(true/false): ");
    boolean codingFun = scannerObj.nextBoolean();

    System.out.println("Name: " + name +"\n"+"Grade: "+ grade + "\n" + "Rating: " + rating + "\n" + "Having Fun: " + codingFun);

    if (codingFun != true){
      System.out.println("Sorry you're not having fun... Let's change that.");
      codingFun = true;
      System.out.println("Now codingFun is " + codingFun); 
    }
  }
}
```

<br>

[Back To Top](#java-simple-methods-and-calls)

---

<br>


Absolutely ✅ — here’s a **Java “File Input/Output”** section in the same beginner-friendly style as the others:

---

# `File Input/Output (I/O)`

Java provides classes in the `java.io` package to read from and write to files.
The most commonly used classes are:

* `File` → represents a file or directory.
* `Scanner` → reads input from files.
* `PrintWriter` → writes output to files.
* `FileNotFoundException` → must be handled when working with files.

<br>

### Quick Guide to File I/O

|       Operation      | Class/Method                      | Description                                        |
| :------------------: | :-------------------------------- | :------------------------------------------------- |
|    Read from file    | `Scanner(File file)`              | Creates a Scanner to read from a file.             |
| Check file existence | `file.exists()`                   | Returns `true` if the file exists.                 |
|       Read line      | `sc.nextLine()`                   | Reads a line of text from the file.                |
|      Read token      | `sc.next()`, `sc.nextInt()`, etc. | Reads next word, integer, double, etc., from file. |
|     Write to file    | `PrintWriter(File file)`          | Creates a writer to write to a file.               |
|      Write text      | `pw.println("text")`              | Writes a line to the file.                         |
|     Close stream     | `sc.close()` / `pw.close()`       | Frees system resources.                            |

<br>

### Example: Reading from a File

```java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```

---

### Example: Writing to a File

```java
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new File("output.txt"));

            pw.println("Hello, World!");
            pw.println("This is a file output example.");
            pw.println("Java File I/O is easy!");

            pw.close(); // always close the writer
        } catch (FileNotFoundException e) {
            System.out.println("Unable to write to file: " + e.getMessage());
        }
    }
}
```

---

### Example: Reading & Writing Numbers

```java
import java.io.*;
import java.util.*;

public class FileReadWriteNumbers {
    public static void main(String[] args) {
        try {
            // Write numbers to file
            PrintWriter writer = new PrintWriter("numbers.txt");
            for (int i = 1; i <= 5; i++) {
                writer.println(i * i); // squares
            }
            writer.close();

            // Read numbers from file
            Scanner sc = new Scanner(new File("numbers.txt"));
            while (sc.hasNextInt()) {
                int n = sc.nextInt();
                System.out.println("Read number: " + n);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
```

`Notes:`
* Always `handle exceptions` (`FileNotFoundException`) when working with files.
* Always `close streams` (`Scanner` or `PrintWriter`) to free resources.
* File paths can be `relative` (e.g., `"input.txt"`) or `absolute` (`"C:/Users/..."`).

<br>

[Back to Top](#java-simple-methods-and-calls)

---

<br>  


# `Nesting Method Calls`

`Nesting` is the placing of one construct inside another.
* Methods, loops, conditionals, objects, and classes can be nested in Java.
* Nesting allows `results of one method` to be used as `input to another` directly.

---

## `Nested Arrays / Collections`

```java
// Array of empty arrays
int[][] emptyArrays = { {}, {}, {}, {}, {} };

// 2D integer array
int[][] numbers = { {1,2,3}, {4,5,6}, {7,8,9} };

// 2D String array
String[][] fruits = {
    {"apple", "banana", "orange"},
    {"grape", "kiwi", "melon"},
    {"pear", "plum", "peach"}
};

// Mixed type example using Object
Object[][] people = {
    {"John", 25, "male"},
    {"Jane", 30, "female"},
    {"Alex", 35, "male"}
};
```

---

## `Nested Conditionals`

```java
if (condition1) {
    if (condition2) {
        if (condition3) {
            // do something
        }
    }
}
```

---

## `Nested Loops`

```java
// Nested while loops
while (condition1) {
    while (condition2) {
        while (condition3) {
            // do something
        }
    }
}

// Nested for loops
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
            // do something
        }
    }
}
```

---

## `Nested Method Calls`

```java
String text = "   java programming   ";

// Nested method calls
System.out.println(text.trim().toUpperCase().substring(0, 4));
// Execution order:
// 1. text.trim() removes leading/trailing spaces → "java programming"
// 2. .toUpperCase() converts it to uppercase → "JAVA PROGRAMMING"
// 3. .substring(0, 4) extracts first 4 characters → "JAVA"
// 4. System.out.println(...) prints the final result
```


---

[Back to Top](#java-simple-methods-and-calls)

---

<br>  

*Created and maintained by Mr. Merritt*





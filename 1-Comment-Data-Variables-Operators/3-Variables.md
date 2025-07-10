# `Java Variables`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*

[Java Documentation](https://docs.oracle.com/en/java/javase/index.html)
___

Covered in this File:
1. [`Literals vs. Variables`](#literals-vs-variables)
1. [`Declaring and Initializing Variables`](#declaring-and-initializing-variables)
    1. [`Assigning Multiple Variables the same value`](#assigning-multiple-variables-the-same-value)
    1. [`Assigining Multiple Variables on the same line`](#assigning-multiple-variables-on-the-same-line)
    1. [`Reassigning a Variable`](#reassigning-a-variable)
1. [`Rules for Naming Variables`](#rules-for-naming-variables)
1. [`Variables are mapped to memory locations`](#variables-are-mapped-to-memory-locations)
1. [`error : cannot find symbol`](#error-cannot-find-symbol)
1. [`Pass by Value vs Pass by Reference`](#pass-by-value-vs-pass-by-reference)
1. [`Variable Aliasing`](#variable-aliasing)
    1. [`Creating Aliases`](#creating-aliases)
    1. [`Aliasing Immutable Types`](#aliasing-immutable-types)
    1. [`Aliasing Mutable Types`](#aliasing-mutable-types)
1. [`Modifiers`](#modifiers)
    1. [`Access Modifiers`](#access-modifiers)
    1. [`Non Access Modifiers`](#non-access-modifiers)
1. [`Variable Scope/Context`](#variable-scopecontext)
    1. [`Namespace`](#namespace)
    
<br>

---

<br>

# `Literals vs. Variables`
`Literal Data`: actual fixed data values that do not represent any other data and written directly into code.

<br>

Basically: `Variables` are like containers that store literal data 

Specifically: `Variables` are names that map to a location in memory where the literal data is physically stored
* The data a variable points to can change
* Quotation marks `"` or `'` are used to distinguish text data from a variable.
* The Java compiler creates a symbol table and maps variable names to memory locations.
    * After compilation the variable names generally do not exist. The memory addresses are used instead.

<br>

```java
"example"           // Literal text data "example"
```
```java
String example;     // Variable named example
```

<br>

*NOTE*: 
> The distinction between the basic explaination and the specific one is important here. 
> * *Variables can be thought of as containers in most cases, however this analogy does not hold for all uses of variables and it is important to understand how they actually work.*

<br>

[Back To Top](#java-variables)

---

<br>

# `Declaring and Initializing Variables`
In Java variables must first be `declared` (created) and then `initialized` (given a value). 

<br>

To declare a variable write the `type of data` the variable will store followed by the `name of the variable` followed by a single equal sign `=`
* a single equals sign `=` is used to assign a variable to the data it references
* When defining a variable it must always be on the `left side` of the `=`

**`For source code readability variable names should represent the data they store`**

<br>

### Variable Declaration Syntax:

```
type variableName;
```
<br>

Variables have default values when declared but not explicitly initialized.
| Type       | Default Value |
|------------|:-------------:|
| boolean    | false         |
| byte       | 0             |
| short      | 0             |
| int        | 0             |
| long       | 0L            |
| float      | 0.0f          |
| double     | 0.0d          |
| char       | '\u0000' (null character) |
| Object     | null          |

Examples:
```java
bool state;                 // state = false
int num;                    // num = 0;
double percent;             // percent = 0.0;
char letter;                // letter = \u0000;
String name;                // name = null;
String [] badPasswords;     // badPasswords = null;
```

<br>


### Variable Declaration and Initialization Syntax:
```
type variableName = value;
```
Examples:
```java
bool state = false;
int num = 10;
double percent = 95.61;
char letter = 'a';
String name = "Jose";
String[] badPasswords = {"password","123456","12345678","1234","qwerty","12345","dragon"};
```

<br>

[Back To Top](#java-variables)

---

<br>

## `Assigning Multiple Variables the same value`
Assign multiple variables to one value by setting each variable equal to the next, and finally to the value they will store. 
```java
int a = b = c = 100;
```

<br>

## `Assigning Multiple Variables on the same line`
Declare multiple variables of the same type by seperating them with a comma.
```java
int a = 1, b = 2, c = 3;
```

<br>

## `Reassigning a Variable`
Reassigning a variable, is changing the value the variable references (points to) in memory
> * Rewrite the name of the variable and set it to a new value with `=`
```java
int num = 1
// at this point in the program num is 1

num = 2 
// at this point in the program num is 2

System.out.println(num) // Output: 2
```

<br>

[Back To Top](#java-variables)

---

<br>

# `Rules for Naming Variables`

1. They are case sensitive (ie. a and A are not the same)
1. Should be written in `camelCase`.
1. Must start with a lowercase letter, underscore `_`, or dollar sign `$`
1. Cannot start with a number.
1. Can only contain `a-z`, `A-Z`, `0-9`, `$` and `_` characters
1. Cannot be a reserved keyword.
1. Cannot contain spaces.
1. Variables should be named after what they represent.
    1. Short names are easier to type, but not easier to read. 

## `Example: Legal Variable Names`
```java
int var = 0;
int _var = 0;
int _v_ar = 0;
int vAr = 0;
int VAR = 0;
int var1 = 0;
int variableName = 0;
```

<br>

## `Example: Illegal Variable Names`
```java
int 1var = 0;     // Invalid: starts with a digit
int v-ar = 0;     // Invalid: hyphen is not allowed
int v ar = 0;     // Invalid: space is not allowed
int !var = 0;     // Invalid: special character '!' not allowed
int @#$%@ = 0;    // Invalid: special characters not allowed
```

<br>

[Back To Top](#java-variables)

---

<br>

# `Variables are mapped to memory locations`

## `A Lower Level Explanation of Variables in Java`

The following is a lower-level explanation of how variables work in `Java`.
* The basic definition of variables will work most of the time for beginners, but to understand more advanced behavior (especially with objects and memory), this deeper insight is helpful.

<br>

### What happens when you assign a Primitive value in Java:

```java
int x = 10;
```

1. Java creates a memory slot on the `stack` for the primitive `int` and stores the literal value `10` directly there.
1. `x` is mapped to this memory location by the compiler.
1. For primitive types (`int`, `double`, `boolean`, etc.), the memory location on the stack `stores the actual value`.
1. When you use the variable `x`, Java retrieves the literal value directly from the stack. 

<br>

### What happens when you assign a Object value in Java:

```java
String greeting = "Hello World";
```

1. Java creates a `String` object in memory (usually on the `heap`).
2. The variable `greeting` is mapped to a memory location, typically on the stack, that stores a `reference` (similiar to a pointer) to the object.
    1. Java doesn’t expose raw memory addresses, but it does pass and store object references.
3. When you use `greeting`, Java follows the reference to interact with the actual object in memory.

<br>

`This is why reference types like Arrays, print out a hash code instead of the actually data.` 
```java
int[] arr = {1,2,3};

System.out.println(arr);       // eg. [I@2bea5ab4
```


<br>


## `error: cannot find symbol`
If you attempt to use a variable name that was never assigned a reference, a syntax error is thrown.

```java
System.out.println(var);    
/* Output: 
Main.java:<line number>: error: cannot find symbol
        System.out.println(var);    
                           ^
  symbol:   variable var
  location: class Main
1 error
*/
```

<br>

[Back To Top](#java-variables)

---

<br>


# `Pass by Value vs Pass by Reference`
Variables are mapped to location in memory, typically on the stack. All values in Java are pass by value, but that value may be a reference to another memory location, typically on the heap.

The `Stack` is a region of memory used for static memory allocation using a last in first out LIFO method of allocation and deallocation.

The `Heap` is a region of memory usef for dynamic memory allocation that is either manually allocation and deallocated, or handled by a garbage collector. 

| Feature| Stack  | Heap  |
|--|--|--|
| **Access Speed**     | Faster due to contiguous memory and predictable access patterns.     | Slower due to pointer dereferencing and less predictable access.      |
| **Lifespan**         | Exists only while the function that created it is running.           | Exists until manually freed or garbage collected.                     |
| **Size Limit**       | Typically smaller and fixed size.                                    | Larger and limited only by system memory.                             |
| **Usage**            | Function call stacks, local variables.                               | Objects, dynamic data structures (e.g., linked lists, trees).         |
| **Memory Management**| Managed by the compiler.                                              | Managed by the programmer or runtime (e.g., `malloc`, `new`).         |
| **Thread Safety**    | Each thread has its own stack (inherently thread-safe).              | Shared among threads; needs synchronization.                          |

<br>

### `All Data in Java is Pass by Value`

`Pass by Value` means that a copy of the data is passed around, instead of a reference to the memory location.
* Primitive values are straight pass by value.

<br>

`Pass by value of a reference` means that a copy of value that is a pointer to a memory location is passed around.
* Objects are pass by value of a reference.

<br>

`Pass by reference` means that a copy of the memory location is passed around, instead of the value itself.
* Java does not pass by reference.


<br>

[Back To Top](#java-variables)

---

<br>


# `Variable Aliasing`
`Aliasing` is the act of assigning one variable to the same memory location as another variable
* aliases all map to the same memory location
* the act of assigning one variable to another copies a reference to the memory location of the data

<br>

## `Creating Aliases`
Create an `alias` by assigning one variable to another variable.

```java
String[] a = {"d", "a", "t", "a"};
String[] b = a; 
String[] c = b;


System.out.println(a);  // Output: [Ljava.lang.String;@276438c9
System.out.println(b);  // Output: [Ljava.lang.String;@276438c9
System.out.println(c);  // Output: [Ljava.lang.String;@276438c9
```

<br>

## `Aliasing Immutable Types`
Changing the mapping of one value does not change the mapping of the other aliases.

```java
String a = "Java Programming";
String b = a;
String c = b;

a = "Based on C Programming";

System.out.println(a);      // Output: Java Programming
System.out.println(b);      // Output: Based on C Programming
System.out.println(c);      // Output: Based on C Programming
```

<br>

## `Aliasing Mutable Types`
Changing the value of a mutable type, changes the value for all aliases. This is because the variables all share a mapping to the changed data. 

```java
import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String[] args) {
        // Create Aliases of a Mutable Type (String Array)
        String[] a = {"d", "a", "t", "a"};
        String[] b = a; 
        String[] c = b;



        System.out.println(a);  // Output: [Ljava.lang.String;@6b0c2d26  
        System.out.println(b);  // Output: [Ljava.lang.String;@6b0c2d26  
        System.out.println(c);  // Output: [Ljava.lang.String;@6b0c2d26  
    
        System.out.println(Arrays.toString(a)); // Output: [d, a, t, a] 
        System.out.println(Arrays.toString(b)); // Output: [d, a, t, a]
        System.out.println(Arrays.toString(c)); // Output: [d, a, t, a]


        a[1] = "X";     // Change the data of the mutable type

        // Data has changed for all aliases, because they point to the same memory.
        System.out.println(Arrays.toString(a)); // Output: [d, X, t, a] 
        System.out.println(Arrays.toString(b)); // Output: [d, X, t, a]
        System.out.println(Arrays.toString(c)); // Output: [d, X, t, a]
        
    
    }
}
```

<br>

[Back To Top](#java-variables)

---

<br>

# `Modifiers`
A `modifier` in Java is a keyword that changes the meaning or behavior of a class, method, or variable.
* Control the access level (who/where names can be used).
* Specify other behaviours. 

<br>

There are two categories of modifier keywords in Java, Access Modifiers and Non-Access Modifiers. 
* `Access Modifiers` control who/where constructs can be accessed.
* `Non-Access Modifiers` handle everything else.

<br>

| **Type** | **Modifiers** |
| -- | -- |
| Access Modifiers     | `public`, `protected`, `private`, *(default)* |
| Non-Access Modifiers | `final`, `static`, `abstract`, `synchronized`, `transient`, `volatile`, `native`, `strictfp` |

<br>

## `Access Modifiers`
| Modifier   | Accessibility Description                          |
|------------|--------------------------------------------------|
| `default` (implicit)| Accessible only within the `same package`. |
| `public`     | Accessible from `anywhere`                        |
| `private`    | Accessible only within the `declaring class`     |
| `protected`  | Accessible within the `same package` and by `subclasses` (even in other packages) |

Examples:
```java
int num = 10;               // default : same package only
public int num = 10;        // public  : anywhere
private int num = 10;       // private : within the declaring class only
protected int num = 10;     // protected : same package and subclasses only
```

---

<br>

## `Non-Access Modifiers`

Non-access modifiers that apply to variables:
| Modifier    | Description                                              |
|-------------|----------------------------------------------------------|
| `final`     | Variable value cannot be changed after initialization    |
| `static`    | Variable belongs to the class, shared by all instances   |
| `volatile`  | Ensures variable updates are visible to all threads immediately |
| `transient` | Variable is skipped during serialization                  |

Examples:
```java
final String constant = "value cannot change";
static String classOwned = "This value is shared among all instances of the class";
volatile String unstable = "update to all threads immediately";
transient String skipped = "Ignored when serializing"
```
<br>

Modifiers that do not apply to variables:
* These will be covered in detail in other files.

| Modifier       | Applicable To           | Description                                            |
|----------------|------------------------|--------------------------------------------------------|
| `abstract`     | Classes, Methods       | Indicates incomplete implementation; classes can't be instantiated, methods must be overridden |
| `synchronized` | Methods, Blocks        | Ensures only one thread executes a method/block at a time (thread safety) |
| `native`       | Methods                | Specifies method is implemented in platform-dependent code (e.g., C/C++) |
| `strictfp`     | Classes, Methods       | Enforces consistent floating-point calculations across platforms |

                     

<br>

[Back To Top](#java-variables)

---

<br>

# `Variable Scope/Context`
Basically: `Scope/Context` is the area within code in which a variable can be accessed and used 

Specifically: `Scope/Context` refers to the visibility and accessibility of variables, methods, and other identifiers within a program.

1. Variables have scope (what part of the program they can be accessed from).
1. Variables can only be accessed after they have been declared.
1. Variables declared within a `class` (fields) are accessible from the `entire class`.
1. Variables declared within a `method` are accessible within that `method only`.
1. Variables declared within a `block` (if, while, for, etc.) are accessible within that `block only`.

<br>

| Scope | Where It's Declared  | Accessibility  |
|-----|---|---|
| `Package`        | No access modifier on class, method, or field    | Accessible only within the same package          |
| `Class`          | Inside a class, but outside any method (fields) | Accessible throughout the class; can be controlled using access modifiers (`public`, `private`, etc.) |
| `Method`         | Inside a method                                 | Accessible only within that method               |
| `Parameter`      | Inside method parentheses as parameters         | Accessible only within that method               |
| `Block`          | Inside a block (e.g., `if`, `for`, `while`)     | Accessible only within that specific block       |

---

<br>


## `Namespace`
A `Namespace` is a mapping of names (variables) to memory locations.
* There are 4 different namespace levels in Java.
* `java.lang` is a built-in package namespace that is automatically imported into every Java source file (`.java`)

<br>

| Namespace Type| Description | 
|--|--|
| `Package`    | Groups related classes and interfaces |
| `Class`      | Contains fields, methods, and inner classes |
| `Method`     | Contains method-local variables and parameters |
| `Block`      | Contains variables declared inside blocks (`if`, `for`, `while` etc.) |

```java
// Outside of Class is Package Scope.
public class Example{ // Class Scope Begins

    public static void main(String[] args){ // Method/Parameter Scope Begins

        for(int i = 0; i < 11; i++){ // for Block Scope Begins
            
            System.out.println(i);

        } // for Block Scope Ends

    } // Method/Parameter Scope Ends

} // Class Scope Ends
```
* A code block is all of the code between curly braces.
* code before a variable's declaration cannot access it.
* code after the variable's declaration can access it.
* code outside of the curly braces cannot access variables defined inside of the braces.
    * With the exception of modified class/instance variables (ie. public, protected, and default)

<br>

[Back To Top](#java-variables)

---

<br>

*Created and maintained by Mr. Merritt*




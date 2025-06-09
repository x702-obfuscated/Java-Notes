# `Java Variables`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*
___

Covered in this File:
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
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()
1. [``]()

Covered in this file:
1. [`Defining a Variable`](#defining-a-variable)
1. [`Creating a Variable`](#creating-a-variable)
    1. [`Assigning Multiple Variables the same value`](#assigning-multiple-variables-the-same-value)
    1. [`Assigning Multiple Variables on the same line`](#assigning-multiple-variables-on-the-same-line)
    1. [`Reassigning a Variable`](#reassigning-a-variable)
1. [`Rules For Naming Variables`](#rules-for-naming-variables)
1. [`Variables are Pointers to Locations in Memory`](#variables-are-pointers-to-locations-in-memory)
    1. [`A Lower Level Explanation of Variables`](#a-lower-level-explanation-of-variables)
    1. [`NameError: name is not defined`](#nameerror-name-is-not-defined)
1. [`Variable Aliasing`](#variable-aliasing)
    1. [`Creating Aliases`](#creating-aliases)
    1. [`Aliasing: Immutable Types`](#aliasing-immutable-types)
    1. [`Aliasing: Mutable Types`](#aliasing-mutable-types)
1. [`Type Annotations: Declaring a Variable Type`](#type-annotation-declaring-variable-type)
1. [`Variable Scope/Context`](#variable-scopecontext)
    1. [`Built-in Namespace`](#built-in-namespace)
    1. [`Global Namespace`](#global-namespace-and-scope)
    1. [`Local Namespace and Scope`](#local-namespace-and-scope)
    1. [`global keyword`](#global-keyword)
    1. [`nonlocal keyword`](#nonlocal-keyword)
    1. [`Special Scoping Errors`](#special-scoping-errors)
    1. [`locals() Returns the local scope`](#locals-returns-local-scope)
    1. [`globals() Returns the global scope`](#globals-returns-global-scope)
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
To declare a variable write the `type of data` the variable will store followed by the `name of the variable` followed by a single equal sign `=`
* a single equals sign `=` is used to assign a variable to the data it references
* When defining a variable it must always be on the `left side` of the `=`

**`For source code readability variable names should represent the data they store`**

<br>

Variable Declaration and Initialization Syntax:
```
type variableName = value;
```

<br>

Variables have default values when declared but not initialized.
```java
bool state;                 // state = false
int num;                    // num = 0;
double percent;             // percent = 0.0;
char letter;                // letter = \u0000;
String name;                // name = null;
String [] badPasswords;     // badPasswords = null;
```
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

# `Variables are references (or values) to locations in memory`

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
Create an alias by assigning one variable to another.

```java
String[] a = {"d", "a", "t", "a"};
String[] b = a; 
String[] c = b;


System.out.println(a);  // Output: [Ljava.lang.String;@276438c9
System.out.println(b);  // Output: [Ljava.lang.String;@276438c9
System.out.println(c);  // Output: [Ljava.lang.String;@276438c9
```
## `Aliasing Immutable Types`
Changing the mapping of one value does not change the mapping of the other aliases.

```java
String[] a = {"d", "a", "t", "a"};
String[] b = a; 
String[] c = b;

a = new String[]{"n","e","w"};

System.out.println(a);  // Output: [Ljava.lang.String;@1ee807c6
System.out.println(b);  // Output: [Ljava.lang.String;@276438c9
System.out.println(c);  // Output: [Ljava.lang.String;@276438c9

```

<br>

## `Aliasing Mutable Types`
# `Access Modifiers`
# `Variable Scope/Context`
## `Namespace`
## `Global Namespace`
## `Local Namespace`
```java




  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //see Methods.java for an explanation of the 'main' method
   
  //============================================================================================================================================================================//
    //Declaring and Initializing Variables
      //> syntax : type identifier = literalValue;
      //> alias are variables that represent the same value
    
    //declaring a variable
    int num; //> 0
    double duo; //> 0.0
    boolean bool; //> false
    String str; //> null
    
    
    //declaring and initializing a variable
    int initNum = 0;
    double initDuo = 0.0;
    boolean initBool = false;
    String initStr = null;
    
    //Declare multiple variables of the same type with a comma separated list:
    int a = 1, b = 2, c = 3;
    
    //or one value to multiple variables
    a = b = c = 100;
    
    //aliases
    int num1 = num;
    int num2 = num1;
    int num3 = num2;
    // num, num1, num2, num3 are all aliases
    
    
  //============================================================================================================================================================================//
    //Using Variables in Operations
      //> variables can be used in operations in place of literals
    int x = 2;
    int y = 5;
    
    String front = "Hello ";
    String back = "World";
    
    System.out.println(x + y);
    System.out.println(x * y);
    System.out.println(x - y);
    System.out.println(x / y);
    System.out.println(x % y);
    
    System.out.println(front + back);  
  }
  
//============================================================================================================================================================================//
  //Formal Parameters
    //> Formal Parameters appear in the method header
    //> These are special variables for passing values to a method
    //> These variables have a local scope to the method (they do not exist outside the method definition)

//{----IGNORE THIS FOR NOW----}{-----------------FOCUS HERE------------------}
  public static void methodName(int num, double duo, boolean bool, String str) {
    return;                     //In the parenthesis of a method header formal parameters(variables) are declared
  }                             //These variable only exist between the {} of the method
                                //When the method is called actual parameters(arguments) aka values are used to initialize the formal parameters. 

//============================================================================================================================================================================//
  //Instance Variables and Modifiers
    //> instance variables are associated with objects of a class
    //> instance variables are declared in the class definition, and initialized in a special method called a constructor
    //> modifiers determine the accessibility of these variable outside of the declared class
      //> default : accessible in the same package
      //> public  : accessible anywhere
      //> private : only accessible in the declared class
      //> protected : accessible in the same package
    
    //examples
    int num;
    public int num1;
    private int num2;
    protected int num3;
    
    double duo;
    boolean bool;
    String str;
    
//============================================================================================================================================================================//
  // Final Variables
    //> the final keyword prevents a variable's value from being changed
    //> often used for constants
    
    final double pi = 3.14159;

//============================================================================================================================================================================//
  //Static Variables
    //> static means unchanging
    //> static variables belong to the class they are declared in.
    //> static variables are the same for all instances of a class.
    //> typically declared and initialized in the class definition.
    
    static int unchanging = 10;
    
//============================================================================================================================================================================//
  //Variable Scope 
    //> variables have scope (what part of the program they can be accessed from)
    //> variables can only be accessed after they have been declared. 
    //> variables declared in the class definition (fields) are accessible from the entire class
    //> variables declared in a method are accessible in that method only
    //> variable declared inside of a loop, or conditional are accessible in loop/conditional block only
    
    
  //example
    //> A code block is all of the code between curly braces.
    //> code before the variable cannot access it.
    //> code after the variable can access it.
    //> code outside of the curly braces cannot access variables defined inside of the braces.
    //word scope =============================================================//
    String word;                                                              //
                                                                              //
    public static void method(int number) {// number scope~~~~~~~~~~//        //
                                                                    //        //
      for(int spot = 0; spot < 5; spot ++) {// spot scope -----//   //        // 
          continue;                                            //   //        //
                                                               //   //        //
      }// spot scope ------------------------------------------//   //        //
                                                                    //        //
    }// number scope~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//        //
                                                                              //
   //word scope ==============================================================//
    
 
}

/*
Common Errors:
  Forgetting a semicolon ;
  Forgetting quotes ""
  Forgetting the type when declaring the variable
  Redeclaring the variable when changing its value


*/

/*
Practice:
Create a program that prints out your full name, age and answers the true/false question below:
  Booleans come from a form of math called boolean algebra. (true/false)?

*/
```
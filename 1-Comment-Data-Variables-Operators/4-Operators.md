# `Java Operators`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*

[Java Documentation](https://docs.oracle.com/en/java/javase/index.html)

For brevity in these notes please assume all of the code snippets in this file are written inside of this main method unless otherwise stated.
```java
public class Example{

    public static void main(String[] args){
        
        // code snippets written here
    
    }
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

| `Operator`           | A symbol that performs an action on values (e.g., `+`, `-`, `==`).            |

Covered in this file:
1. [`Operators, Operands, and Precedence`](#operators-operands-and-precedence)
    1. [`Complete Operator Precedence`](#complete-operator-precedence)
    1. [`Expressions`](#expressions)
1. [`Concatenation`](#concatenation)
1. [`Duplication`](#duplication)
1. [`Casting (changing data type)`](#casting-changing-data-type)
1. [`Arithmetic operators (math)`](#arithmetic-operators-math)
1. [`Comparison aka Relational Operators`](#comparision-aka-relational-operators)
1. [`Membership operators`](#membership-operators)
1. [`Identity operators`](#identity-operators)
1. [`Assignment vs Equality Operator`](#assignment-vs-equality-operators)
    1. [`Walrus Operator`](#walrus-operator)
1. [`Compound Assignment Operators`](#compound-assignment-operators)
    1. [`Incrementing a Value`](#incrementing-a-value)
    1. [`Decrementing a Value`](#decrementing-a-value)
1. [`Logical operators (not, and, or)`](#logical-operators)
    1. [`NOT Truth table`](#not-truth-table)
    1. [`AND Truth table`](#and-truth-table)
    1. [`OR Truth table`](#or-truth-table)
1. [`De Morgan's Laws`](#de-morgans-laws)
1. [`Built-in Operation Function Calls`](#built-in-operation-function-calls)
1. [`Bitwise Operations`](#bitwise-operations)
    1. [`Binary Data Representation: Two's complement notation`](#binary-data-representation-twos-complement-notation)
    1. [`Bitwise NOT`](#bitwise-not)
    1. [`Bitwise Shift <<|>>`](#bitwise-shift)
    1. [`Bitwise AND`](#bitwise-and)
    1. [`Bitwise XOR`](#bitwise-xor)
    1. [`Bitwise OR`](#bitwise-or)
1. [`Appendix`](#appendix)



# `Operators Operands and Precedence`

`Operators` are the symbols used to perform operations on `operands`.

`Operands` are the values or variables that operators operate on. 

example:

    a + b

* Operator: `+`
* Operands: `a` and `b`

<br>

## `Complete Operator Precedence`
`Operator precedence` refers to the rules that determine the order in which operators are evaluated in an expression. 

Below is the complete operator precendance for Python.
* From top to bottom: Top is highest precedence.

<br>

`Associativity` defines the order in which operators of the same precedence level are evaluated when they appear next to each other in an expression.
* Operations at the same level typically proceed from left to right in the expression. But not always.

| Precedence | Operators | Description  | Associativity  |
|---|:--:|---|---|
| 1| `()` <br> `[]` <br> `.` <br> `::`  | parentheses (method call, grouping) <br> array subscript <br> member Access <br> method Reference | Left to right|
| 2| `++` <br> `--`| post-increment, <br> post-decrement | Left to right|
| 3| `++`<br> `--`<br> `+`<br> `-`<br> `~`<br> `!`| pre-increment,<br> pre-decrement,<br> unary plus,<br> unary minus,<br> bitwise NOT,<br> logical NOT | Right to left|
| 3| `new`<br>`(type)` | object Creation <br> type cast| Right to left|
| 4| `*`<br> `/`<br> `%`| multiplication,<br> division,<br> modulus/remainder| Left to right|
| 5| `+`<br> `-`| addition,<br> subtraction| Left to right|
| 6| `<<`<br> `>>`<br> `>>>`| bitwise shift left,<br> bitwise shift right,<br> bitwise shift unsigned right| Left to right|
| 7| `<`<br> `<=`<br> `>`<br> `>=`<br> `instanceof` | less than<br> less than or equal to<br> greater than<br> greater than or equal to<br> class comparision | Left to right|
| 8| `==`<br> `!=`| is equal to,<br> is NOT equal to | Left to right|
| 9| `&`| bitwise AND| Left to right|
| 10 | `^`| bitwise XOR| Left to right|
| 11 | `\|` | bitwise OR | Left to right
| 12 | `&&` | logical AND| Left to right|
| 13 | `\|\|` | logical OR| Left to right |
| 14 | `?:` | ternary conditional| Right to left|
| 15 | `=`<br> `+=`<br> `-=`<br> `*=`<br> `/=`<br> `%=`<br> `&=`<br> `\|=`<br> `^=`<br> `<<=`<br> `>>=`<br> `>>>=`| assignment,<br> add and assign,<br> subtract and assign,<br> multiply and assign,<br>divide and assign,<br>modulus and assign,<br> bitwise AND and assign,<br>bitwise OR and assign,<br>bitwise XOR and assign,<br> bitshift left and assign,<br> bitshift right and assign,<br> bitshift right unsigned and assign | Right to left |
| 16 | `->`<br> `yield` | Lambda expression <br> switch yield| Right to left|



*NOTE*:   
> *If you have trouble remembering operation precedence remember that you can always use parenthesis to make your code clear*


<br>

[Back To Top](#java-operators)

---
<br>

# `Expressions`
---

Basically: An `expression` is a statement with a result or answer.

Specifically: An `expression` is a combination of data, variables, and operations that is evaluated to produce a single value aka result or answer.


# Comprehensive Java Expressions (From Simple to Complex)

## 1. Literal Expressions (No Variables)

```java
42;                   // integer literal
3.14;                 // double literal
"Hello";              // string literal
true;                 // boolean literal
'c';                  // char literal
```

## 2. Variable-Only Expressions

```java
x;                    // evaluates to value of x
name;                 // evaluates to value of name
```

## 3. Arithmetic Expressions

```java
a + b;                // addition
a - 3;                // subtraction with a literal
a * b + 2;            // combined operations
(a + b) / c;          // parentheses control order
```

## 4. Comparison Expressions

```java
a > b;                // greater than
a == 10;              // equality
b != c;               // inequality
(a + b) >= (c - 2);   // comparison with arithmetic
```

## 5. Logical Expressions

```java
a > b && c < d;               // logical AND
a == 10 || b == 5;            // logical OR
!(a < b);                     // logical NOT
(a > b) && !(c == d);         // nested logic
```

## 6. Membership and Identity-Like Checks

```java
Arrays.asList("x", "y").contains("x");    // check membership in list
list.contains(5);                         // list membership
a == b;                                   // identity for primitives
a.equals(b);                              // object value equality
a != null;                                // null check (similar to "is not None")
```

## 7. Expressions with Arrays, Lists, Maps, or Objects

```java
list.size();                   // method call on list
map.get("key");                // dictionary (map) lookup
array[1] + 5;                  // array access and arithmetic
sum(a, b, c) > 20;             // method call with comparison
```



## 8. Expressions with Methods and Nesting

```java
Math.max(a, b) + Math.min(c, d);                 // nested method calls
Math.abs(a - b) > Math.pow(c, 2);                // math methods with comparison
Arrays.sort(arr); arr[0] == a;                   // sort and compare
(a instanceof Integer) && (b instanceof Float);  // type checks
```



## 9. Ternary and Complex Conditional Expressions

```java
a > b ? "yes" : "no";                          // ternary expression
(a > b ? a : b) + c;                           // ternary inside arithmetic
(xList.contains(x) ? true : false) && y == 3;  // mixed logic and ternary
```





<br>

[Back To Top](#java-operators)

---
<br>

# `Concatenation`
Basically: `concatenation` means "to join"

Specifically: `concatenation` is the operation of joining two or more strings, arrays, or other sequences end-to-end to form a single sequence.
* use the `+` sign to concatenate Strings in Java.
* `+` can only be used to concatenate Strings in Java.

syntax: 
```
sequence1 + sequence2
```
Examples:
```java
"Hello" + "World";
//Result: Hello World

System.out.println("Hello" + "World");
// Output:  HelloWorld

//Using Variables
first = "Hello";
second = "World";
System.out.println(first + second);
// Output: HelloWorld
```

<br>

[Back To Top](#java-operators)

---
<br>

# `Type Casting Primitives`
`Casting` is the process of converting data from one type to another. This is also known as type conversion. 
* In Java there are two types of casting: `widening/implicit casting` and `narrowing/explicit casting`.

<br>

## `Widening Casting`
`Widening/Implicit Casting` is automatic, and results in no data loss.

<br>
Example:

```java
int a = 10;
double b = a; // int → double (widening)
System.out.println(b); // Output: 10.0
```

<br>

## `Narrowing Casting`
`Narrowing/Explicit Casting` is manual, and possibly result in data loss.
* To explicitly cast use the type of the data to which you would like to cast.

<br>

syntax:
```
type variable = (type) value;
```
Example:
```java
double a = 9.81;
int b = (int) a; // narrowing: double --> int
System.out.println(b);  // Output: 9 (fractional part is lost (truncated))
```

<br>

[Back To Top](#java-operators)

---
<br>

# `Unary Operators`
`Unary operators` are operators that operate on only one operand. 
* Used to perform simple operations, like incrementing a value, negating it, or inverting a boolean.

<br>

| Operator | Description                       | Example           |
| -------- | --------------------------------- | ----------------- |
| `+`      | Unary plus (usually redundant)    | `+a`              |
| `-`      | Unary minus (negates a number)    | `-a`              |
| `++`     | Increment (prefix/postfix)        | `++a`, `a++`      |
| `--`     | Decrement (prefix/postfix)        | `--a`, `a--`      |
| `!`      | Logical NOT (inverts boolean)     | `!true` → `false` |
| `~`      | Bitwise complement (inverts bits) | `~a`              |

## `Increment Operations`

## `Decrement Operations`

# `Arithmetic Operators`

## `Integer Overflow Error`

## `Floating Point Error`

# `Comparision aka Relational Operators`  

# `Identity Operators`



# `Assignment vs Equality Operators`

# `Compound Assignment Operators`








# `Logical Operators (!, &&, ||)`

## `NOT ! Truth Table`

## `AND && Truth Table`

## `OR || Truth Table`

# `De Morgan's Laws`




# `Bitwise Operations`

## `Bitwise NOT ~`

## `Bitwise shift << >> >>>`

## `Bitwise AND &`

## `Bitwise XOR ^`

## `Bitwise OR |`











## `Integer Overflow Errors`
Integer types in Java have both an minimum and a maximum value, because of this it is possible to incur and `Integer Overflow Error`.


An `Integer Overflow Error` occurs when the range of a primitive type has been exceeded.
* The data value is wrapped when this occurs.
* This is a logical error that does not throw an exception in Java, and can therefore be difficult to track down. 

<br>

### Here is an example:
* The largest value of a byte is 127. What happens if we add one?
Java integers are stored as 4 byte or 32 bit signed integers. This means that the most significant (furthest left) bit stores the sign of the data and the bits store the values from 0 to 2^31.
Integers also implement twos complement notation meaning that the most significant bit indicates the sign and the other bits signify the magnitude of the value.
If the sign is 0 the number is positive,
if the sign is 1 the number is negative.
When the sign is 1 the values can be from -1 to -2,147,483,648.
When the sign is 0 the values can be from 0 to 2,147,483,647.
Integer.MAX_VALUE is 0111 1111 1111 1111 1111 1111 1111 1111.
Integer.MIN_VALUE is 1000 0000 0000 0000 0000 0000 0000 0000.
For negative values you take the inverse of all the bits
so 1000 0000 0000 0000 0000 0000 0000 0000 becomes
--> 0111 1111 1111 1111 1111 1111 1111 1111 then add 1
--> 1000 0000 0000 0000 0000 0000 0000 0000.
This determines the magnitude of the value so
1000 0000 0000 0000 0000 0000 0000 0000 is -2,147,483,648.
When you add 1 to Integer.MAX_VALUE you turn
-->0111 1111 1111 1111 1111 1111 1111 1111 into
-->1000 0000 0000 0000 0000 0000 0000 0000
with the resulting value being -2,147,483,648 .




```java
  //============================================================================================================================================================================//
  // Changing Data Type (Casting)
    //> casting is used to change type of data
    //> Implicit (widening) casting occurs automatically 
    //> Explicit (narrowing) casting must be done manually 
    //> Upcasting is implicit casting from a subclass to a parent class
    //> Downcasting is explicit casting from a parent class to a subclass
    
    
    //widening casting
    int anInteger = 9;
    double aDouble = anInteger; //> 9.0
    // automatically cast to a double
    
   
    // narrowing casting : syntax (newType) data
    double aDoubleToo = 1.618033988749d; //>what special number am I?
    int anIntegerToo = (int) aDoubleToo;//> outputs 1 ... but why?

    //> Truncating
      //> When narrowing casting a double value it is truncated, not rounded.
      //> for example 3.14 becomes 3 and 1.61 becomes 1 
      //> the values after the floating point are simply removed
    
    //Upcasting 
      //> All java classes are implicit subclasses of the Object class
      //> Here a DataTypes object is upcast to and Object reference
    Object parent = new DataTypes();
    
    //Downcasting 
      //> All java classes are implicit subclasses of the Object class
      //> Here the parent object we created is downcast to the subclass DataTypes
    DataTypes child = (DataTypes) parent;
    
  //============================================================================================================================================================================//
  //Wrapper Classes
    //> primitive data types have limitations
    //> sometimes we need a way to interact with primitives like objects
    //> wrapper classes allow use to reference primitive data in an object
    
    //Wrapper classes in Java
    Integer intWrapper;
    Double duoWrapper;
    Boolean boolWrapper;

    Byte byteWrapper;
    Short shortWrapper;
    Long longWrapper;s
    Float floatWrapper;
    Character charWrapper;
    
    //Boxing (explicit casting to wrapper class)
    Integer box = Integer.valueOf(10);
    
    //Autoboxing (implicit casting to a wrapper class)
    Integer object = 10; 
    
    //Unboxing (explict casting to primitive data)
    int primitive = object.intValue();
    
    //Auto unboxing (implicit casting to primitive data)
    int unbox = object;
```







```java
package functional;
//Java Operators 
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  Covered in this file:
  //> Assignment Operators
  //> Arithmetic Operators
  //> Compound Assignment Operators
  //> Relational Operators
  //> Logical Operators
  //> Operator Precedence
*/
  

class Operators {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //see Methods.java for an explanation of the 'main' method
    
    //============================================================================================================================================================================//
    // Java Operations
      //> all expressions are evalueated to produce a single value
      //> the value of an expression has a type based on the evalutaiton of the expression
      //> operators in java follow operator precedence
      //> and now the math begins...
    
    //============================================================================================================================================================================//
    //Assignment Operator
      //> The = operator is used for assigning and changing values of variables
  
    int num = 1;
    double duo = 2.0;
    boolean bool = true;
    String str = "Hello World";
    
    num = 5;
    duo = 3.14;
    bool = false;
    str = "Goodbye World";

    //============================================================================================================================================================================//
    // Arithmetic Operators
      //> + addition / concatenation
      //> - subtraction
      //> * multiplication
      //> / division
      //> % modulus (remainder)
      //> ++ increment (add 1)
      //> -- decrement (sub 1)
      //> Follow Order of Operations (PEMDAS)
        //> Parenthesis, Exponents, Multiplication/Division, Addition/Subtraction 
        //> From left to right
    
    System.out.println(1 + 2);//add
    System.out.println(2 - 1);//subtract
    System.out.println(2 * 2);//multiply
    System.out.println(4 / 2);//divide
    System.out.println(10 % 3);//modulus (remainder)

    //Two ints evaluate to an int
    System.out.println(2 + 2); //4
    
    //An operation that includes a double evaluates to a double
    System.out.println(2.0 + 2);//4.0
    
    //Operators can be used to construct compound expressions 
    System.out.println(4 + 2 - 1 * 6);
    
    //Attempting to divide by 0 results in ArithmeticException to occur
    System.out.println(2/0); //ArithmeticException
    
    //Adding to a string results in concatenation
    System.out.println(2 + "Hello"); //2Hello

    //Rounding a double
    double x = 1.5; //round up
    double y = 1.2; //round down
    double z = -1.5; //round up

    //add 0.5 for positive doubles
    System.out.println((int)(x + 0.5)); // 2
    System.out.println((int)(y + 0.5)); // 1
    //sub 0.5 for negative doubles
    System.out.println((int)(z - 0.5)); // -2

    
    int m = 0;
    System.out.println(++x); //pre-increment x by 1
    System.out.println(--x); //pre-decrement x by 1
    System.out.println(x++);//post-increment x by 1
    System.out.println(x--);//post-decrement x by 1
    //> there is a difference
    	//> pre : increment/decrement first then use the value
    	//> post: use the value first then increment/decrement

    //> use operators with variables to perform operations on their values
    int n = 5;
    int o = 6;
    System.out.println(m + n);
    //> welcome to math with even more letters!!!!
    
    //============================================================================================================================================================================//
    // Compound Assignment Operators
      //> += add and assign
      //> -= subtract and assign
      //> *= multiply and assign
      //> /= divide and assign
      //> %= modulus and assign
      
    int e = 10;
    e += 1; //same as e = e + 1 (important) adds 1 to e and sets that value to e
    e -= 1; //same as e = e - 1 (important) subtracts 1 from e and sets that value to e
    e *= 2; //same as e = e * 2 
    e /= 2; //same as e = e / 2
    e %= 2; //same as e = e % 2
    
    //won't use these in this class, but good to know----------|
    e &= 3; //same as e = e & 3 (bitwise AND operator)         |
    e |= 3; //same as e = e | 3 (bitwise OR operator)          | 
    e ^= 2; //same as e = e ^ 2 (bitwise XOR operator)         |
    e >>= 1; //same as e = e >> 1 (signed right shift operator)| 
    e <<= 1; //same as e = e << 1 (signed left shift operator) |
    //---------------------------------------------------------|
    
    
    //============================================================================================================================================================================//
    // Relational Operators
      //> mostly inequalities from math class
      //> includes more than just inequalities
      //> used for boolean expressions 
      //> == is equal to
      //> != not equal to
      //> > greater than
      //> < less than
      //> >= greater than or equal
      //> <= less than or equal
      //> instanceof checks if an object is an instance of a class
    
    //These are boolean expressions
    //Boolean expressions return a value of true or false
    System.out.println(1 > 10);//returns false
    System.out.println(1 < 10);//returns true
    System.out.println(1 == 1);//returns true

    int f = 5;
    System.out.println(f == 2); // equal to
    System.out.println(f != 1); // not equal to
    System.out.println(f > 0); // greater than
    System.out.println(f < 4); // less than
    System.out.println(f >= 5); // greater than or equal to
    System.out.println(f <= 6); // less than or equal to
    
    Object obj = new Object();
    System.out.println(obj instanceof Object); //checks if an object is an instance of a class
    
    //============================================================================================================================================================================//
    //Logical Operators
      //> ! NOT (Negation)
      //> ^ bitwise XOR
      //> && logical AND (Conjunction)
      //> || logical OR (DIsjunction)
    
      //> Truth tables allow us to see how these operators evaluate
    
    //NOT (!)
    System.out.println( !true  ); //> False
    System.out.println( !false ); //> True

    //XOR (^) (exclusive or)
    System.out.println(  true ^ true  ); //> False
    System.out.println(  true ^ false ); //> True
    System.out.println( false ^ true  ); //> True
    System.out.println( false ^ false ); //> False

    //AND (&&)
    System.out.println(  true && true  ); //> True
    System.out.println(  true && false ); //> False
    System.out.println( false && true  ); //> False
    System.out.println( false && false ); //> False

    //OR (||)
    System.out.println(  true || true  ); //> True
    System.out.println(  true || false ); //> True
    System.out.println( false || true  ); //> True
    System.out.println( false || false ); //> False
    
    //Examples
    System.out.println(f < 10 && f < 6); // && is and 
    System.out.println(f < 4 || f < 10); // || is or
    System.out.println(!(f < 4 && f < 1)); // ! is not
    System.out.println(f < 6 ^ f < 4); // ^ is XOR (exclusive or) 
    // each of these will print true or false ie evaluate to a boolean value
    
    
    //============================================================================================================================================================================//
    //Operator Precedence
      //> Generally Arithmetic, then Relational, then Logical, then Assignment.
      //> From first to last: (In general think PEMDAS)
      // 1 var++ and var--
      // 2 ++var and --var
      // 3 (type) (casting)
      // 4 ! (not)
      // 5 *,/,% Multiplication, Division, and Modulus(remainder)
      // 6 +,- Binary addition and subtraction concatenation from left to right
      // 7 <,<=,>,>= (Comparison/Relational)
      // 8 ==, != (Equality)
      // 9 ^ (XOR)
      // 10 && (And)
      // 11 || (Or)
      // 12 =,+=,-=,*=,/=,%= (Assignment)
     
  }
}

/*
Common Errors:
  Math...
  PEMDAS
  Floating point error --> see FLOPErrors.java

*/

/*
Practice:

*/
```
```java
package functional;
//Java Floating Point Errors
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
*Notes:
  Covered in this file:
  //> Floating Point (FLOP) Errors
  //> The Problem
  //> Decimal vs. Binary 
  //> Dealing with FLOP Errors
*/

import java.lang.Math;
import java.math.BigDecimal;
import java.math.MathContext;

class FLOPErrors{
//============================================================================================================================================================================//
//Floating Point (FLOP) Errors 
  //> Floating point errors result from the way that computers do math and store values. 
  //> Because binary is base 2 there are errors that can occur when performing floating point operations.
  
  public static void main(String[] args){
  //============================================================================================================================================================================//
  //The Problem
    //> some calculations result in unexpected values
    
    //> For Example
    double notPointThree = 0.2 + 0.1;
    System.out.println(notPointThree == 0.3);//false ?...
    System.out.println("0.2 + 0.1 = " + notPointThree);

    //If you use a comparison operator with floating point numbers you may end up with an unintended error.
    
  //============================================================================================================================================================================//
  // Decimal vs Binary values
    //>Lets look at how values are represented in decimal and in binary.
  
    System.out.println("decimal ...|1000000|10000|10000|1000|100|10|1|.|1/10|1/100|1/1000|1/10000|1/100000|1/1000000|...");
    System.out.println("binary  ...|   64  | 32  | 16  | 8  | 4 | 2|1|.|1/2 | 1/4 |  1/8 |  1/16 |  1/32  |   1/64  |...");
    
    /*
      0.2 (1/5) in decimal is simple: place a 2 in the 1/10 place
      0.2 (1/5) in binary is more difficult: how do you get to two by placing 1s in the binary places?

      For a similiar example how do we represent 1/3 in decimal 0.33333333333... but why?
      The same issue exists in binary 1/5 is a infinitely repeating decimal number. 0.0011001100110011...
    */
    
    System.out.println("0.4 + 0.1 = " + (0.4 + 0.1));
    System.out.println("0.4 - 0.1 = " + (0.4 - 0.1));
    
    
    //other examples
    System.out.println("0.7 + 0.1 = " + (0.7 + 0.1));
    System.out.println("0.7 - 0.1 = " + (0.7 - 0.1));
    //0.7 --> 0.101100110011001100...
    //0.1 --> 0.000110011001100110...

    System.out.println("0.9 - 0.1 = " + (0.9 - 0.1) );
    System.out.println("0.9 + 0.1 = " + (0.9 + 0.1) );
    //0.9 --> 0.11100110011001100...
    //0.1 --> 0.00011001100110011...

    addLoop(5);//try me 
    nl();
    subLoop(5);//try me
    
    //These errors are cause by a rounding error when the java compiler compiles the program. 
    //This is not a java bug or any other programming language bug. It is an inherent problem in representing infinitly repreating numbers in a finite area.
    // It is ultimately a problem inherit to math try it what is 0.33333333... + 0.3333333... + 0.3333333... = ?  
    //What is the answer? Can you prove it?

    /* 
    Dealing with FLOP errors:
    Review the use of significant figures (sig figs)
    Rounding 
    Integer Math(converting the values to integers completing the calculation then converting back.)

    For more on how floating point numbers are represented and used in computers look at the IEEE 754 standard
    Also check out these links on what every computer scientist should know about floating point math
    https://docs.oracle.com/cd/E19957-01/806-3568/ncg_goldberg.html
    https://www.h-schmidt.net/FloatConverter/IEEE754.html

    This calculator can help you understand how these values are represented using the IEEE 754 standard.
    Keep in mind that the answers it generates are rounded automatically so you may not get the same result you do in java.
    http://weitz.de/ieee/
    */

    //Rounding
    //Use the Math.round() method to round a floating point to integer
    double pi = 3.1415926535;
    System.out.println(Math.round(pi));

    //Use the BigDecimal class round() method
    //the syntax of the method: public BigDecimal round(MathContext m)

    BigDecimal roundMe = new BigDecimal("3.1415926535");//create a new object of the BigDecimal Class and assign the value of pi

    MathContext m = new MathContext(2);//create a new object of the MathContext class and assign the value of 2(this is our level of precision or significant figures)

    BigDecimal rounded = roundMe.round(m);

    System.out.println(rounded);

    /*
    Cheat Sheet for the BigDecimal Class
    https://floating-point-gui.de/languages/java/
    */
  }
  
  private static void addLoop(double num){
    for (double i = 0.0; i <= num; i+=0.1){
      System.out.print(i + " ");
    }
  }

  private static void subLoop (double num) {
    for (double i = num; i >= 0; i-=0.1){
      System.out.print(i + " ");
    }
  }
  
  public static void nl() {
    System.out.println();
  }
}

/*
Common Errors:

*/

/*
Practice:

*/
```
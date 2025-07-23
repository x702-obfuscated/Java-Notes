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
1. [`Operators, Operands, and Precedence`](#operators-operands-and-precedence)
    1. [`Complete Operator Precedence`](#complete-operator-precedence)
    1. [`Expressions`](#expressions)
1. [`Concatenation`](#concatenation)
1. [`Type Casting Primitives`](#type-casting-primitives)
1. [`Unary Operators`](#unary-operators)
    1. [`Unary Plus`](#unary-plus)
    1. [`Unary Minus`](#unary-minus)
    1. [`Increment Operations`](#increment-operations)
        1. [`Pre-Increment`](#pre-increment)
        1. [`Post-Increment`](#post-increment)
    1. [`Decrement Operations`](#decrement-operations)
        1. [`Pre-Decrement`](#pre-decrement)
        1. [`Post-Decrement`](#post-decrement)
1. [`Arithmetic Operators`](#arithmetic-operators)
    1. [`Integer aka Floor Division`](#integer-aka-floor-division)
    1. [`Modulus or Remainder`](#modulus-or-remainder)
    1. [`Division by Zero`](#division-by-zero)
    1. [`Mixing Arithmetic and Concatenation`](#mixing-arithmetic-and-concatenation)
    1. [`Integer Overflow Errors`](#integer-overflow-errors)
    1. [`Floating Point Operations`](#floating-point-operations)
    1. [`Floating Point Error`](#floating-point-error)
1. [`Comparision aka Relational Operators`](#comparision-aka-relational-operators)
1. [`Assignment vs Equality vs Identity`](#assignment-vs-equality-vs-identity)
1. [`Compound Assignment Operators : Arithmetic`](#compound-assignment-operators--arithmetic)
1. [`Logical Operators`](#logical-operators)
    1. [`NOT truth table`](#not-truth-table)
    1. [`AND truth table`](#and-truth-table)
    1. [`OR truth table`](#or-truth-table)
1. [`De Morgan's Laws`](#de-morgans-laws)
1. [`Bitwise Operations`](#bitwise-operations)
    1. [`Bitwise NOT`](#bitwise-not)
    1. [`Bitwise Shift << >> >>>`](#bitwise-shift)
    1. [`Bitwise AND`](#bitwise-and)
    1. [`Bitwise XOR`](#bitwise-xor)
    1. [`Bitwise OR`](#bitwise-or)
1. [`Compound Assignment Operators : Bitwise`]()


<br>

---

<br>

# `Operators Operands and Precedence`

`Operators` are the symbols used to perform actions on `operands`(e.g., `+`, `-`, `==`).

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
| `+`      | Unary plus (usually redundant)(positive)    | `+a`              |
| `-`      | Unary minus (negates a number)(negative)    | `-a`              |
| `++`     | Increment (prefix/postfix)        | `++a`, `a++`      |
| `--`     | Decrement (prefix/postfix)        | `--a`, `a--`      |
| `!`      | Logical NOT (inverts boolean)     | `!true` → `false` |
| `~`      | Bitwise complement (inverts bits) | `~a`              |

<br>

[Back To Top](#java-operators)

---
<br>

## `Unary Plus`

Basically: `unary plus` means "indicate a positive value"

Specifically: `unary plus` is a unary operator (`+`) that doesn't change the value of a numeric operand. It's mostly used for clarity or symmetry with unary minus.
* unary plus is rarely needed; numbers are positive by default

syntax:
```
+value
```

example:
```java
// Using unary plus
int a = +5;
System.out.println(a);
//Output: 5

// Contrast with unary minus
int b = -5;
System.out.println(b);
//Output: -5

// Using in expressions
int x = 3;
int result = +x + 2;
System.out.println(result);
//Output: 5
```

<br>

[Back to Top](#java-operators)

---

<br>


## `Unary Minus`
Basically: `unary minus` means "make negative"

Specifically: `unary minus` is a unary operator (`-`) that negates the value of a numeric operand. It changes a positive value to negative and vice versa.
* unary minux is often used to invert a number’s sign

syntax:
```
-value
```

example:
```java
// Using unary minus
int a = -5;
System.out.println(a);
//Output: -5

// Negating a variable
int b = 10;
System.out.println(-b);
//Output: -10

// Double negation
int c = -20;
System.out.println(-c);
//Output: 20
```

<br>

[Back to Top](#java-operators)

---

<br>


## `Increment Operations`
Basically: `increment` means "to increase by 1"

Specifically: `increment operations` use the `++` operator to add 1 to a variable. 

<br>

There are two types of unary increment operations:
1. `pre-increment`: increases the value before it's used
2. `post-increment`: increases the value after it's used


---

<br>

### `Pre-Increment`
Increments `before` the value is used.

syntax:
```
++variable
```
example:
```java
int a = 5;
System.out.println(++a); // a is incremented first, then printed
//Output: 6
```

---

<br>

### `Post-Increment`
Increments `after` the value is used.

syntax:
```
variable++ 
```
example:
```java
int a = 5;
System.out.println(a++); // a is printed first, then incremented
//Output: 5

System.out.println(a); // a is now 6
//Output: 6
```

<br>

[Back to Top](#java-operators)

---

<br>


## `Decrement Operations`

Basically: `decrement` means "to decrease by 1"

Specifically: `decrement operations` use the `--` operator to subtract 1 from a variable.

<br>

There are two types of unary decrement operations:

1. `pre-decrement`: decreases the value before it's used
2. `post-decrement`: decreases the value after it's used

---

<br>

### `Pre-Decrement`

Decrements `before` the value is used.

syntax:
```
--variable
```

example:
```java
int a = 5;
System.out.println(--a); // a is decremented first, then printed
//Output: 4
```

---

<br>

### `Post-Decrement`

Decrements `after` the value is used.

syntax:

```
variable--;
```

example:

```java
int a = 5;
System.out.println(a--); // a is printed first, then decremented
//Output: 5

System.out.println(a); // a is now 4
//Output: 4
```

<br>

[Back to Top](#java-operators)

---

<br>

# `Arithmetic Operators`

`Arithmetic operators` are used to perform basic mathematical operations on numeric values.

* Evaluated based on precedence: higher precedence operators are evaluated before lower ones.

<br>

| Operator | Description         | Example |
| -------- | ------------------- | ------- |
| `*`      | Multiplication      | `a * b` |
| `/`      | Division            | `a / b` |
| `%`      | Modulus (remainder) | `a % b` |
| `+`      | Addition            | `a + b` |
| `-`      | Subtraction         | `a - b` |

<br>

##  `Multiplication`

Multiplies two numbers.

```java
int a = 4 * 5;
System.out.println(a);
//Output: 20

int x = 3;
int y = 6;
System.out.println(x * y);
//Output: 18
```

---

## `Division`

Divides the first number by the second.

```java
int a = 20 / 4;
System.out.println(a);
//Output: 5

int x = 9;
int y = 2;
System.out.println(x / y); // integer division
//Output: 4
```

---

## `Integer aka Floor Division`
Basically: `integer division` (also called `floor division`) means dividing two integers and discarding the fractional part.

Specifically: `Integer division` using the `/` operator with two integers will always return a truncated `int` result.
* `Truncation` means to cut off after the floating point.
* The result is `always truncated` toward zero.
* Works only with integer types: `int`, `byte`, `short`, `long`.
* If either operand is a `double` or `float`, it will perform `floating-point division`.

<br>

`Think of it as “how many whole times does the divisor fit without going over?`
```java
System.out.println(7 / 2);   // Output: 3 (not 3.5)
System.out.println(10 / 3);  // Output: 3
System.out.println(-7 / 2);  // Output: -3
System.out.println(5 / 5);   // Output: 1
System.out.println(1 / 5);   // Output: 0
```

---

## `Modulus or Remainder`
Returns the remainder of a division.

```java
int a = 10 % 3;
System.out.println(a);
//Output: 1

int x = 15;
int y = 6;
System.out.println(x % y);
//Output: 3
```

---

## `Division by Zero`
Division by 0 is undefined, in Java this is handled by throwing an `ArithmeticException: / by zero`.
* Division by 0 is a runtime error.

<br>

```java
System.out.println(1 / 0); // Throws ArithmeticException: / by zero
```

---

## `Addition`
Adds two numbers together.

```java
int a = 7 + 3;
System.out.println(a);
//Output: 10

int x = 10;
int y = 15;
System.out.println(x + y);
//Output: 25
```

---

## `Subtraction`
Subtracts the second number from the first.

```java
int a = 9 - 4;
System.out.println(a);
//Output: 5

int x = 20;
int y = 8;
System.out.println(x - y);
//Output: 12
```

<br>

[Back to Top](#java-operators)

---

<br>

## `Mixing Arithmetic and Concatenation`
`+` concatenation has the same precedence as `+` addition.

<br>

Expressions that include addition and concatenation procede from left to right.
```java
System.out.println(2 + 3 + "a"); // Output: 5a
System.out.println(2 + "a" + 3); // Output: 2a3
System.out.println("a" + 2 + 3); // Output: a23
```

<br>

Other operations must occur before concatenation otherwise an error will occur.
```java
System.out.println("a" + 2 * 3);  // Output: a6
System.out.println("a" + 20 / 4); // Output: a5
System.out.println(3 - 2 + "a");  // Output: 1a
```
```java
System.out.println("a" + 3 - 2);
// <filename>:<linenumber>: error: bad operand types for binary operator '-'
//         System.out.println("a" + 3 - 2);  
//                                    ^
//   first type:  String
//   second type: int
// 1 error
// error: compilation failed
```

<br>

[Back to Top](#java-operators)

---

<br>

## `Integer Overflow Errors`
Integer Primitives in Java have both an minimum and a maximum value, because of this it is possible to incur and `Integer Overflow Error`.

<br>

Basically: An `Integer Overflow Error` occurs when the range of a primitive integer type has been exceeded.

Specifically: In Java, integer types (`byte`, `short`, `int`, `long`) have fixed size limits. An `integer overflow` occurs when an operation exceeds these limits.
* Java does NOT throw exceptions on overflow by default
* Overflow causes the value to cycle back within the allowed range.
* An integer overflow is a logical error.
* The data value is wrapped when overflow occurs.


<br>

example:
```java
int max = Integer.MAX_VALUE; // 2,147,483,647
System.out.println(max + 1);
//Output: -2147483648  (wraps around to the minimum int value)

int min = Integer.MIN_VALUE; // -2,147,483,648
System.out.println(min - 1);
//Output: 2147483647  (wraps around to the maximum int value)
```

<br>

### A More Detailed Explanation:

Primitive integer types implement [`twos complement notation`](./2-Data.md#twos-complement-notation), meaning that the most significant bit indicates the sign and the other bits signify the magnitude of the value.
* If the sign bit is 0 the number is positive.
* if the sign bit is 1 the number is negative.

### `Simple Example: Using a Byte`

The range of a `byte` primitive is 127 to -128

    1 byte --> 8 bits --> 0000 0000


<br>

|Value|Exponent|Decimal|Binary|
|:-:|:-:|:-:|:-:|
|Byte.MAX_VALUE |2<sup>7</sup>-1| 127 | 0111 1111 |
|Byte.MIN_VALUE |-2<sup>7</sup>|-128 | 1000 0000 |

<br>

If the largest value of a byte is 127. What happens if we add one?
1. When the sign bit is 1 the range is -1 to -128.
2. When the sign bit is 0 the range is 0 to 127.

<br>

`Overflow of Byte.MAX_VALUE --> 127 by adding 1.`
```
127 --> 0111 1111
1   --> 0000 0001

0111 1111
+       1
---------
1000 0000 --> -128 (Byte.MIN_VALUE)
```

<br>

`Overflow of Byte.MIN_VALUE --> -128 by subtracting 1.`
```
-128 --> 1000 0000
-1   --> 1111 1111

 1000 0000
+1111 1111
----------
 0111 1111 --> 127 (Byte.MAX_VALUE)
```

---

<br>

### `Example: Using an int`

The range of an `int` primitive is `2,147,483,647` to `-2,147,483,648`

```
4 bytes --> 32 bits --> 00000000 00000000 00000000 00000000
```

<br>

|        Value       |      Exponent      |     Decimal    |            Binary (partial)           |
| :----------------: | :----------------: | :------------: | :-----------------------------------: |
| Integer.MAX\_VALUE | 2<sup>31</sup> − 1 |  2,147,483,647 | `01111111 11111111 11111111 11111111` |
| Integer.MIN\_VALUE |   −2<sup>31</sup>  | -2,147,483,648 | `10000000 00000000 00000000 00000000` |

<br>

If the largest value of an int is `2,147,483,647`, what happens if we add one?

1. When the sign bit is `1`, the range is from `-1` to `-2,147,483,648`
2. When the sign bit is `0`, the range is from `0` to `2,147,483,647`

---

<br>

`Overflow of Integer.MAX_VALUE --> 2,147,483,647 by adding 1`

```
2,147,483,647 --> 01111111 11111111 11111111 11111111
1             --> 00000000 00000000 00000000 00000001


 01111111 11111111 11111111 11111111
+00000000 00000000 00000000 00000001
-------------------------------------
 10000000 00000000 00000000 00000000 --> -2,147,483,648 (Integer.MIN_VALUE)
```

---

<br>

`Overflow of Integer.MIN_VALUE --> -2,147,483,648 by subtracting 1`

```
Integer.MIN_VALUE:
-2,147,483,648 --> 10000000 00000000 00000000 00000000
-1             --> 11111111 11111111 11111111 11111111

 10000000 00000000 00000000 00000000
+11111111 11111111 11111111 11111111
-------------------------------------
 01111111 11111111 11111111 11111111 --> 2,147,483,647 (Integer.MAX_VALUE)
```

<br>

[Back to Top](#java-operators)

---

<br>

## `Floating Point Operations`
Operations that include a floating point type, return a floating point.
```java
// Addition
System.out.println(3.0 + 2);      // Output: 5.0

// Subtraction
System.out.println(10 - 4.5);     // Output: 5.5

// Multiplication
System.out.println(2.0 * 3);      // Output: 6.0

// Division
System.out.println(9 / 2.0);      // Output: 4.5

// Modulus
System.out.println(10.0 % 3);     // Output: 1.0
```

<br>

[Back to Top](#java-operators)

---

<br>

## `Floating Point Error`

Basically: `Floating point error` refers to the small rounding errors that occur when representing decimal numbers in binary.

Specifically: `Floating point error` in Java refers to the inaccuracy that arises when performing arithmetic operations using floating-point data types. These types represent real numbers in a binary approximation based on the `IEEE 754 standard`, which cannot precisely represent many decimal fractions (e.g., 0.1 or 1/3). As a result rounding errors can occur due to limited precision. 
* Occurs with `float` and `double`
* Caused by limited binary precision

<br>

| Data Type    | Precision    | Error Risk |
| ------------ | ------------ | ---------- |
| `float`      | 6–7 digits   | High       |
| `double`     | 15–16 digits | Medium     |
| `java.math.BigDecimal` | Arbitrary    | Low        |

<br>

Floating point erros are particularly problematic in financial or scientific applications where precision is critical. Java developers often mitigate floating point error by using the java.math.BigDecimal class for exact decimal arithmetic or by applying techniques like rounding or error margins when comparing floating-point values.



```java
System.out.println(0.1 + 0.2);
// Output: 0.30000000000000004
```

You might expect `0.1 + 0.2` to equal `0.3`, but due to floating-point approximation, the result is slightly off.

<br>

### `Why it Happens`

* Binary cannot exactly represent most decimals like `0.1`, `0.2`, etc.
* Just like how `1/3` is `0.333...` repeating in base 10,
  some numbers repeat infinitely in base 2.
* The IEEE 754 standard used by Java stores a limited number of bits (64 for `double`, 32 for `float`), so it rounds.

| Power of 10 | Decimal   | Binary | Power of 2 |
| ----------- | --------- | ------ | ---------- |
| ...         | ...       | ...    | ...        |
| 10⁶         | 1,000,000 | 64     | 2⁶         |
| 10⁵         | 100,000   | 32     | 2⁵         |
| 10⁴         | 10,000    | 16     | 2⁴         |
| 10³         | 1,000     | 8      | 2³         |
| 10²         | 100       | 4      | 2²         |
| 10¹         | 10        | 2      | 2¹         |
| 10⁰         | 1         | 1      | 2⁰         |
| —           | .         | .      | —          |
| 10⁻¹        | 0.1       | 1/2    | 2⁻¹        |
| 10⁻²        | 0.01      | 1/4    | 2⁻²        |
| 10⁻³        | 0.001     | 1/8    | 2⁻³        |
| 10⁻⁴        | 0.0001    | 1/16   | 2⁻⁴        |
| 10⁻⁵        | 0.00001   | 1/32   | 2⁻⁵        |
| 10⁻⁶        | 0.000001  | 1/64   | 2⁻⁶        |
| ...         | ...       | ...    | ...        |

<br>

||
|--|
|0.2 --> (1/5) in decimal is simple. Place a 2 in the 1/10 place|
|0.2 --> (1/5) in binary is more difficult. |
|How do you get to 1/5 by placing 1s in the fractional binary places?|
|For a similiar example how do we represent 1/3 in decimal 0.33333333333... but why?|
|The same issue exists in binary 1/5 is a infinitely repeating decimal number. <br> 1/5 -->  0.0011001100110011...|

<br>

1. These errors are caused by a rounding error when the java compiler compiles the program. 
2. This is not a Java bug or any other programming language bug. It is an inherent problem in representing infinitly repreating numbers in a finite area.
3. It is ultimately a problem inherit to math.
    * try it: what is 0.33333333... + 0.3333333... + 0.3333333... = ?  
    * What is the answer? Can you prove it?

<br>

other examples:
```java
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
```


### `Avoiding Problems`
* Avoid direct equality checks with floating-point numbers.
```java
double a = 0.1 + 0.2;           // 0.30000000000000004
System.out.println(a == 0.3);   // false
```

<br>

* Use `java.math.BigDecimal` when precision matters (like in currency or finance).
```java
import java.math.BigDecimal;

public class Main{
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");

        System.out.println(a.add(b)); // Output: 0.3
    
    }
}
```
* Rounding
* Review the use of significant figures (sig figs)
* Integer Math(converting the values to integers completing the calculation then converting back.)

For more on how floating point numbers are represented and used in computers look at the IEEE 754 standard.
* https://en.wikipedia.org/wiki/IEEE_754


Also check out these links on what every computer scientist should know about floating point math
* https://docs.oracle.com/cd/E19957-01/806-3568/ncg_goldberg.html
* https://www.h-schmidt.net/FloatConverter/IEEE754.html

This calculator can help you understand how these values are represented using the IEEE 754 standard.
* Keep in mind that the answers it generates are rounded automatically so you may not get the same result you do in java.
* http://weitz.de/ieee/

<br>

[Back to Top](#java-operators)

---

<br>


# `Comparision aka Relational Operators`  
`Comparision operators` are used to compare two values.
* they evaluate to a boolean value (True/False)
* Order of Operations is Left to Right

|Symbol| Inequality Operation      |
|:----:|:-------------------------:|
|   `>`  | greater than              |
|   `<`  | less than                 |
|  `>=`  | greater than or equal to  |
|  `<=`  | less than or equal to     |
|  `==`  | equal to                  |
|  `!=`  | not equal to              |
| `instancof` | type comparision (checks the class) |



<br>

```java
int x = 50, y = 45, z = 45;

x > y;               // Returns: true
x < y;               // Returns: false
x >= z;              // Returns: true
x <= z;              // Returns: false
y == z;              // Returns: true
y != x;              // Returns: true
```
```java
String str = "Hello World";
str instanceof String;  // Returns: true
```

<br>

[Back To Top](#java-operators)

---
<br>

# `Assignment vs Equality vs Identity`
|Symbol| Operation    | Description |
|:----:|:------------:|:------------|
|`=`     | assignment   | assigns a value to a variable |
|`==`    | reference equality     | compares if two references are equal |
|`!= `   | reference not equal to | compares if two references are not equal|
|`.equals()`| value equality | compares the stored value of two `objects`|

<br>

`=` is for assigning values, not comparision.
```java
String name = "John Doe";
```

<br>

`==` compares if two references (mapped memory locations) are equal.
```java
int a = 10, b = 10;
System.out.println(a == b); //Output: true
```
```java
String a = "Hello";
String b = "Hello";
String c = new String("Hello"); //Creates a new object reference

System.out.println(a == b);     // Output: true
System.out.println(a == c);     // Output: false
```

<br>

`!=` compares if two references (mapped memory locations) are not equal.
```java
String a = "Hello";
String b = "Hello";
String c = new String("Hello"); //Creates a new object reference

System.out.println(a != b);     // Output: false
System.out.println(a != c);     // Output: true
```

<br>

`.equals` compares the stored value of two objects.
```java
String a = "Hello";
String b = "Hello";
String c = new String("Hello"); //Creates a new object reference

System.out.println(a == c);          // Output: false
System.out.println(a.equals(c));     // Output: true
```

<br>

[Back To Top](#java-operators)

---
<br>

# `Compound Assignment Operators : Arithmetic`
`Compound Assignment Operators` are short hand operators for performing an operation and then assigning the result back the to variable

<br>

```java
int num = 0;

num = num + 1; // num = 1 
num = num + 1; // num = 2 
num = num + 1; // num = 3 

System.out.println(num); // Output: 3
```
> The code above can become tedious when written often.  
> Thus there is a shorthand way to perform this type of operation.

<br>

|Symbol| Compound Operation ||||
|:----:|:------------------:|:-:|:-:|:-:|
|`+=`   | add and assign     |x = x + 1 |-->|x+=1|
|`-=`    | subtract and assign |x = x - 1 |-->|x-=1|
|`*=`    | multiply and assign |x = x * 1 |-->|x*=1|
|`/=`    | divide and assign   |x = x / 1 |-->|x/=1|
|`%=`    | modulo (remainder) and assign |x = x % 1 |-->|x%=1|

<br>

Often it is necessary to change the value of a variable by taking its current value performing and operation then setting the variable to the new value

> Like this:
```
variable = current_value + n
```

> Compound Operations allow us to shorten this code:
```
variable += n
```

<br>

## Compound Operation Examples:


```java
int x = 0;
x = x * 1; // Instead of this
x *= 1;    // Do this
```


```java
int x = 0;
x = x / 1; // Instead of this
x /= 1;    // Do this
```


```java
int x = 0;
x = x % 1; // Instead of this
x %= 1;    // Do this
```


```java
int x = 0;
x = x + 1; // Instead of this
x += 1;    // Do this
```


```java
int x = 0;
x = x - 1; // Instead of this
x -= 1;    // Do this
```


<br>

[Back To Top](#java-operators)

---
<br>


# `Logical Operators`

`Logical operators` in Java are used to perform logical operations on boolean values (`true` or `false`).
> * They help control the flow of a program by evaluating expressions and making decisions based on their truth values.

Order of Operations:

* `!` NOT
* `&&` AND
* `||` OR

| Operator | Operation |  Logic Name | Description               |
| :------: | :-------: | :---------: | :------------------------ |
|    `!`   |    NOT    |   Negation  | `Opposite` of the condition |
|   `&&`   |    AND    | Conjunction | `Both` must be true         |
|   `\|\|`   |     OR    | Disjunction | `At least one` must be true |


<br>

`Truth Tables` are used to illustrate how logical expressions are evaluated.
* In this case they show how we evaluate `!`, `&&`, and `||` .

<br>

## `NOT truth table`

NOT is a negation operation
* `!` returns the opposite

<br>

### *`evaluates opposite`*

<br>

|   a   |  `!a` |
| :---: | :---: |
|  true | false |
| false |  true |

```java
!true    // Returns: false    
!false   // Returns: true  
```

```java
// examples
boolean isRaining = false;

System.out.println(!isRaining); //Output: true

int a = 10;
System.out.println(!(a < 20)); //Output: false

boolean isSunny = true;
System.out.println(!isSunny && isRaining); //Output: false
```

<br>

## `AND truth table`
AND is a conjunction operation.
* `&&` returns `true` when `both operands` are true

<br>

### *`both must be true to evaluate true`*

<br>

|   a   |   b   | a && b |
| :---: | :---: | :----: |
|  true |  true |  true  |
|  true | false |  false |
| false |  true |  false |
| false | false |  false |

```java
true  && true    // Returns: true  
true  && false   // Returns: false  
false && true    // Returns: false  
false && false   // Returns: false  
```

```java
// examples
int temperature = 72;
boolean isSunny = true;

System.out.println(temperature > 70 && isSunny); //Output: true


String username = "user123";
String password = "securepass";

System.out.println(username.equals("user123") && password.equals("securepass")); //Output: true

int age = 25;
boolean hasLicense = false;

System.out.println(age >= 18 && hasLicense); //Output: false
```

<br>

## `OR truth table`

OR is a disjunction operation
* `||` returns `true` when `at least one` operand is true

<br>

### *`at least one must be true to evaluate true`*

<br>

|   a   |   b   | a \|\| b |
| :---: | :---: | :------: |
|  true |  true |   true   |
|  true | false |   true   |
| false |  true |   true   |
| false | false |   false  |

```java
true  || true   // Returns: true  
true  || false  // Returns: true  
false || true   // Returns: true  
false || false  // Returns: false  
```

```java
// examples
int temp = 80;

System.out.println(temp > 78 || temp < 68); //Output: true

String grade = "D";

System.out.println(
    grade.equals("A") || grade.equals("B") || grade.equals("C")
); //Output: false

String passwordHash = "password123";
boolean hasMasterKey = false;

Scanner input = new Scanner(System.in);
String inputPassword = input.nextLine();
input.close()

System.out.println(inputPassword.equals(passwordHash) || hasMasterKey);
```

<br>

[Back to Top](#java-operators)

---

<br>

# `De Morgan's Laws`

`De Morgan's Laws` are a set of fundamental principles in logic that describe the relationship between negation (`!`) and conjunction (`&&`), as well as negation and disjunction (`||`).

*The way these laws are applied to logical operators is similar to the Distributive Property in Mathematics*

<br>

### Law 1
The negation (NOT) of a conjunction (AND) is the disjunction (OR) of the negations.

|     This    | Same As |
| :---------: | :-----: | 
| `!(a && b)` | `!a \|\| !b` |

```java
boolean a = true;
boolean b = false;

// These two statements are equivalent
System.out.println(!(a && b));        // Output: true
System.out.println(!a || !b);         // Output: true

System.out.println(!(a && b) == (!a || !b)); 
//Output: true
//Regardless of the values of a and b
```

<br>

### Law 2
The negation (NOT) of a disjunction (OR) is the conjunction (AND) of the negations.

|  This | Same As |
| :---: | :-----: | 
| `!(a \|\| b)` | `!a && !b` |

```java
boolean a = true;
boolean b = false;

// These two statements are equivalent
System.out.println(!(a || b));        // Output: false
System.out.println((!a && !b));       // Output: false

System.out.println(!(a || b) == (!a && !b)); 
//Output: true
//Regardless of the values of a and b
```

<br>

[Back To Top](#java-operators)

---
<br>

# `Bitwise Operations`

`Bitwise operations` work on individual bits within data.

> * Order of operations for Bitwise Operators is Not, Shifts, And, Xor, Or (NSAXO)

|   Operation   |    Symbol    | Description             |
| :-----------: | :----------: | :---------------------- | 
|  Bitwise NOT  |      `~`     | opposite                |
| Bitwise SHIFT | `<<` or `>>` <br> `>>>`| bit shift left, right, <br> unsigned right |
|  Bitwise AND  |      `&`     | both                    |
|  Bitwise XOR  |      `^`     | only one                |
|   Bitwise OR  |      `\|`   | at least one            |

*In bits, True and False values are represented by 1 and 0*

| Logic | Bit |
| :---: | :-: |
|  True |  1  |
| False |  0  |

<br>

## `Binary Data Representation: Two's complement notation.`

*To accurately understand bitwise NOT and bitshift operations, an understanding of how integers are stored in memory is required*

<br>

In Java, all integer types (`byte`, `short`, `int`, `long`) are `fixed-size` binary representations using `two's complement`.
| Primitive Type | Size            | Description                        | Default Value |
| -------------- | --------------- | ---------------------------------- | ------------- |
| `byte`   | 8-bit <br> (1 byte) | Small integer (-128 to 127)  | `0`     |
| `short`  | 16-bit <br> (2 bytes)| Larger integer (-32,768 to 32,767) | `0`     |
| `int`    | 32-bit <br>(4 bytes)| Common integer (-2<sup>31</sup> to 2<sup>31</sup> - 1) | `0`     |
| `long`   | 64-bit <br> (8 bytes)| Large integer (-2<sup>63</sup> to 2<sup>63</sup> - 1)  | `0L`    |

<br>

In two's complement representation:

* Positive integers have a leading `0` bit
* Negative integers have a leading `1` bit

|     Positive Integers: 32-bit leading 0s    |
| :-----------------------------------------: |
| 00000000 00000000 00000000 00000001 → 1 |

|     Negative Integers: 32-bit leading 1s     |
| :------------------------------------------: |
| 11111111 11111111 11111111 11111111 → -1 |

<br>

## `Bitwise NOT`

`Bitwise NOT (~)` flips all the bits in a binary number, changing each `0` to `1` and each `1` to `0`.

> * When you see NOT, think *"opposite"*

```java
int x = 3;
System.out.println(Integer.toBinaryString(x));   // Output: 11
System.out.println(Integer.toBinaryString(~x));  
// Output: 11111111111111111111111111111100

System.out.println(~x);                          // Output: -4
// 3                --> 00000000 00000000 00000000 00000011
// Flip bits        --> 11111111 11111111 11111111 11111100
// -4               <-- 11111111 11111111 11111111 11111100
```

`Bitwise NOT truth table`

|  a  | ~a |
| :-: | :-: |
|  1  |  0  |
|  0  |  1  |

```java
System.out.println(~1);  // Output: -2
System.out.println(~0);  // Output: -1
```

<br>

## `Bitwise Shift`

`Bitwise Shift (<< or >>)` moves all the bits in a number by a specified number of positions.

### Left Shift <<

> * Equivalent to `x * 2^n`

```java
int x = 1;
System.out.println(x << 3);  
// 1                --> 00000000 00000000 00000000 00000001
// Shift Left 3     --> 00000000 00000000 00000000 00001
// Fill 0s          -->                                 000
// 8                <-- 00000000 00000000 00000000 00001000
```

### Right Shift >>

> * Equivalent to `x / 2^n`

```java
int x = 128;
System.out.println(x >> 7);  
// 128              --> 00000000 00000000 00000000 10000000
// Shift Right 7    -->        0 00000000 00000000 00000001
// Fill 0s          --> 00000000 00000000 00000000 00000001
// 1                <-- 00000000 00000000 00000000 00000001
```

<br>

### Unsigned Right Shift
The `Unsigned Right Shift >>>` shifts all bits to the right and fills in `0` on the left (regardless of sign).
* Only available for `int` and `long` types.
* Not supported for `byte` or `short` (they're cast to `int` before shifting).

<br>

*Unsigned Right Shift differs from the regular right shift (`>>`), which fills in `1` for negative numbers (sign extension).*

<br>

### `Signed Right Shift (>>)` vs `Unsigned Right Shift (>>>)`

|Operation | Symbol | Behavior                                                                |
| -------------------: | :----: | :---------------------------------------------------------------------- |
|   Signed Right Shift |  `>>`  | Shifts bits right and `preserves the sign` (fills with 1 if negative) |
| Unsigned Right Shift |  `>>>` | Shifts bits right and `fills with 0` regardless of sign               |

<br>

Example with positive number:
* Both `>>` and `>>>` behave the same on **positive numbers**.
```java
int x = 32; // 32   --> 00000000 00000000 00000000 00100000

System.out.println(x >> 2);     
// 32               --> 00000000 00000000 00000000 00100000
// Shift Right 2    -->   000000 00000000 00000000 00001000
// Fill with 0s     --> 00
// 8                <-- 00000000 00000000 00000000 00001000

System.out.println(x >>> 2);
// 32               --> 00000000 00000000 00000000 00100000
// Shift Right 2    -->   000000 00000000 00000000 00001000
// Fill with 0s     --> 00
// 8                <-- 00000000 00000000 00000000 00001000
   
```

<br>

Example with negative number:
```java
int x = -32;                    
//-32 --> 11111111 11111111 11111111 11100000 (in binary, 2's complement)

System.out.println(x >> 2);  
// -32               --> 11111111 11111111 11111111 11100000   
// Shift Right 2     -->   111111 11111111 11111111 11111000
// Fill 1s           --> 11
// -8                <-- 11111111 11111111 11111111 11111000

System.out.println(x >>> 2);    // large positive value → fills in 0s
// -32               --> 11111111 11111111 11111111 11100000   
// Shift Right 2     -->   111111 11111111 11111111 11111000
// Fill 0s           --> 00
// 1_073_741_816     <-- 00111111 11111111 11111111 11111000
```

`>>>` treats the number as `unsigned`, so the sign bit is replaced with `0`, leading to a very large positive number.

```java
int x = -1;
System.out.println(x >> 1);   // -1 (still negative)
// -1                       --> 11111111 11111111 11111111 11111111
// Shift right 1            -->  1111111 11111111 11111111 11111111
// Fill 1s                  --> 1
// -1                       <-- 11111111 11111111 11111111 11111111

System.out.println(x >>> 1);  // 2147483647 → 0111...1111
// -1                       --> 11111111 11111111 11111111 11111111
// Shift right 1            -->  1111111 11111111 11111111 11111111
// Fill 0s                  --> 0
// 2_147_483_647            <-- 01111111 11111111 11111111 11111111
```

<br>

## `Bitwise AND`

`Bitwise AND (&)` returns `1` only if both bits are `1`

> * When you see AND, think *"both"*

```java
int x = 12;  // 1100
int y = 10;  // 1010
System.out.println(x & y);  // Output: 8 (1000)
```

`Bitwise AND truth table`

|  a  |  b  | a & b |
| :-: | :-: | :---: |
|  1  |  1  |   1   |
|  1  |  0  |   0   |
|  0  |  1  |   0   |
|  0  |  0  |   0   |

<br>

## `Bitwise XOR`

`Bitwise XOR (^)` returns `1` only if one bit is `1` (but not both)

> * When you see XOR, think *"only one"*

```java
int x = 12;  // 1100
int y = 10;  // 1010
System.out.println(x ^ y);  // Output: 6 (0110)
```

`Bitwise XOR truth table`

|  a  |  b  | a ^ b |
| :-: | :-: | :---: |
|  1  |  1  |   0   |
|  1  |  0  |   1   |
|  0  |  1  |   1   |
|  0  |  0  |   0   |

<br>

## `Bitwise OR`

`Bitwise OR (|)` returns `1` if *at least* one bit is `1`

> * When you see OR, think *"at least one"*

```java
int x = 12;  // 1100
int y = 10;  // 1010
System.out.println(x | y);  // Output: 14 (1110)
```

`Bitwise OR truth table`

|  a  |  b  | a \| b |
| :-: | :-: | :----: |
|  1  |  1  |    1   |
|  1  |  0  |    1   |
|  0  |  1  |    1   |
|  0  |  0  |    0   |

<br>

[Back to Top](#java-operators)

---

<br>

# `Compound Assignment Operators : Bitwise`

`Compound Assignment Operators` also exist for **bitwise operations**, allowing you to perform a bitwise operation and assign the result back to the variable all in one step.

<br>

```java
int x = 5;   // 0101 in binary

x = x & 3;   // x = 0101 & 0011 → 0001
System.out.println(x); // Output: 1
```
The code above performs a **bitwise AND** and assigns the result to `x`.
Instead of writing it this way every time, we can use shorthand operators.

<br>

| Symbol |        Compound Operation       |             |     |          |
| :----: | :-----------------------------: | :---------: | :-: | :------: |
|  `&=`  |      bitwise AND and assign     |  x = x & y  |  →  |  x &= y  |
|  `\|=` |      bitwise OR and assign      |  x = x \| y |  →  |  x \|= y |
|  `^=`  |      bitwise XOR and assign     |  x = x ^ y  |  →  |  x ^= y  |
|  `<<=` |      left shift and assign      |  x = x << n |  →  |  x <<= n |
|  `>>=` |  signed right shift and assign  |  x = x >> n |  →  |  x >>= n |
| `>>>=` | unsigned right shift and assign | x = x >>> n |  →  | x >>>= n |

<br>

### Compound Bitwise Examples:

```java
int x = 5;       // 0101
x = x & 3;       // Instead of this
x &= 3;          // Do this
System.out.println(x); // Output: 1
```

```java
int x = 5;       // 0101
x = x | 2;       // Instead of this
x |= 2;          // Do this
System.out.println(x); // Output: 7
```

```java
int x = 5;       // 0101
x = x ^ 1;       // Instead of this
x ^= 1;          // Do this
System.out.println(x); // Output: 4
```

```java
int x = 4;       // 0100
x = x << 1;      // Instead of this
x <<= 1;         // Do this
System.out.println(x); // Output: 8
```

```java
int x = 8;       // 1000
x = x >> 2;      // Instead of this
x >>= 2;         // Do this
System.out.println(x); // Output: 2
```

```java
int x = -16;     // 11111111 11111111 11111111 11110000
x = x >>> 2;     // Instead of this
x >>>= 2;        // Do this
System.out.println(x); // Output: 1073741820
```

<br>

[Back To Top](#java-operators)

---

<br> 

*Created and maintained by Mr. Merritt*
















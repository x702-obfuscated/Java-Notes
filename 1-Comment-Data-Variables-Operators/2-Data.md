# `Java Data`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*
[Java Documentation](https://docs.oracle.com/en/java/javase/index.html)
___

Covered in this File:
1. [`Data, Types, and Structures`](#data-types-and-structures)
1. [`Beginner Data Types`](#beginner-data-types)
1. [`Mutable vs. Immutable`](#mutable-vs-immutable)
1. [`Primitive Types`](#primitive-types)
1. [`Wrapper Classes for Primitive Types`](#wrapper-classes-for-primitive-types)
1. [`Reference Types`](#reference-types)
1. [`boolean`](#boolean)
1. [`Integer Primitives`](#integer-primitives)
    1. [`Two's complement notation`](#twos-complement-notation)
    1. [`byte`](#byte)
    1. [`short`](#short)
    1. [`int`](#int)
    1. [`long`](#long)
    1. [`Formatting Large Numbers`](#formatting-large-numbers)
    1. [`Base Prefixing`](#base-prefixing)
1. [`Floating Point Primitives`](#floating-point-primitives)
    1. [`IEEE 754 Standard Single Precision`](#ieee-754-standard-single-precision)
    1. [`IEEE 754 Standard Double Precision`](#ieee-754-standard-double-precision)
    1. [`float`](#float)
    1. [`double`](#double)
    1. [`Scientific Notation`](#scientific-notation)
1. [`char`](#char)
1. [`String`](#string)
    1. [`String Internment`](#string-internment)
1. [`Collections`](#collections)
    1. [`Arrays`](#arrays)
    1. [`ArrayList`](#arraylist)
    1. [`LinkedList`](#linkedlist)
    1. [`ArrayList vs LinkedList`](#arraylist-vs-linkedlist)
    1. [`HashSet`](#hashset)
    1. [`HashMap`](#hashmap)

<br>

---

<br>

# `Data, Types, and Structures`
`Data` are raw facts or information (like numbers or text) used by a program.
* `Literal Data`: actual fixed data values that do not represent any other data and written directly into code.

* `Variables` : are names used to point to data stored in memory.

<br>

A `Data Type` is a classification for the kind of data being stored. 
* Primitive Types 
* Reference Types 

<br>

A `Data Structure` is a way to organize and store data (e.g., Arrays, ArrayLists, Hashmaps, etc.).

<br>

[Back To Top](#java-data)

---

<br>

# `Beginner Data Types`
*Beginners should begin with the data types below as they compose the vast majority of data you will work with.*

| **Type**    | **Primitive / Object** | **Mutable / Immutable** | **Notes**                                       |
| ----------- | ---------------------- | ----------------------- | ----------------------------------------------- |
| `boolean`   | Primitive              | Immutable               | Basic true/false value                          |
| `int`       | Primitive              | Immutable               | 32-bit signed integer                           |
| `double`    | Primitive              | Immutable               | 64-bit floating-point number                    |
| `char`      | Primitive              | Immutable               | Single 16-bit Unicode character                 |
| `String`    | Object                 | Immutable               | Any change creates a new string                 |
| `Array`     | Object                 | Mutable                 | Fixed size; elements can be changed             |

<br>

Examples:
```java
true
false               // boolean (True or False)
5                   // int (integer)(whole number)
3.14                // double (double precision decimal number)
'a'                 // char (character)(single symbol) in single quotes ''
"Hello World"       // String (text) in double quotes ""

{ "a", "b", "c" }   // Array (contains multiple items called elements)
// 0    1    2      // indexes (are used to access each element)

// There are more data types but these are the main types for beginners.
```

<br>

[Back To Top](#java-data)

---

<br>

# `Mutable vs. Immutable`
Data types can be classified into two groups: `Mutable Data`, and `Immutable Data`  
* Mutable Data can be changed after its creation (changeable)
* Immutable Data cannot be changed after its creation (unchangeable)

<br>

|              **Mutable Data**              |                      **Immutable Data**                     |
| :----------------------------------------: | :---------------------------------------------------------: |
|        Can be changed after creation       |               Cannot be changed after creation              |
|  `ArrayList`, `HashMap`, `HashSet`, `Arrays`, etc. | `All Primitives`, `Strings`, etc. |
|     Changes affect the original object     |               Any change creates a new object               |


<br>

[Back To Top](#java-data)

---

<br>
 
# `Primitive Types`
Basically: A `primitive` is a basic data type that is not an object, and represents a simple value stored directly in memory.

Specifically: A `primitive` is a simple data type stored directly in memory and passed by value (a copy). 
* Primitives are predefined by Java
* Primitives always have a value, meaning they have a default value.
* The size of a primitive is dependant up the type.

<br>

`Pass by Value` means that a copy of the data is passed around, instead of a reference to the memory location. 

<br>

### All Primitive Types:

| Primitive Type | Size            | Description                        | Default Value |
| -------------- | --------------- | ---------------------------------- | ------------- |
| `boolean`| 1-bit (logical) | True or false    | `false` |
| `byte`   | 8-bit  (1 byte) | Small integer (-128 to 127)  | `0`     |
| `short`  | 16-bit (2 bytes)| Larger integer (-32,768 to 32,767) | `0`     |
| `int`    | 32-bit (4 bytes)| Common integer (-2^31 to 2^31 - 1) | `0`     |
| `long`   | 64-bit (8 bytes)| Large integer (-2^63 to 2^63 - 1)  | `0L`    |
| `float`  | 32-bit (4 bytes)| Single-precision floating point    | `0.0f`  |
| `double` | 64-bit (4 bytes)| Double-precision floating point    | `0.0d`  |
| `char`   | 16-bit (2 bytes)| Unicode character (e.g., `'A'`)    | `'\u0000'`    |

<br>

[Back To Top](#java-data)

---

<br>

# `Wrapper Classes for Primitive Types`
When primitive data needs to be used, but objects are required, java provides `wrapper classes`.

A `wrapper class` wraps a primitive value into an object (`reference type`) by converting the primitive type into an object.
* There is a wrapper class for each primitive type.

<br>

| **Primitive** | **Wrapper Class** |
| ------------- | ----------------- |
| `boolean`     | `Boolean`         |
| `byte`        | `Byte`            |
| `short`       | `Short`           |
| `int`         | `Integer`         |
| `long`        | `Long`            |
| `float`       | `Float`           |
| `double`      | `Double`          |
| `char`        | `Character`       |


<br>

[Back To Top](#java-data)

---

<br>

# `Reference Types`
Basically: A `reference type` is a data type that holds an object.

Specifically: A `reference type` is a data type that stores a pointer to a location in memory that holds an object. 
* reference types are defined by Classes
* reference types are pass by value of a reference
* reference types are null by default
* The size of a reference type depends on the data it stores.

<br>

An `object` in Java is a block of memory on the `heap` that stores data (fields) and knows what type it is (class information).

<br>

`Pass by reference` means that a copy of the memory location is passed around, instead of the value itself.

<br>

`Pass by value of a reference` means that a copy of value that is a pointer to a memory location is passed around.

<br>

### null: a special literal

`null` is a special literal value in Java, it does not have a type, but is a valid value for any reference type.
* It indicates that a `reference variable` does not point to any object in memory

```java
null
```

<br>

### Common Reference Types

| **Type**                                  | **Category**      | **Mutable?** | **Example / Notes**                                |
| ----------------------------------------- | ----------------- | ------------ | -------------------------------------------------- |
| `String`                                  | Text              | Immutable  | `"hello"`, use `StringBuilder` for mutable strings |
| `StringBuilder`                           | Text              | Mutable    | Used to build strings efficiently                  |
| `Integer`, `Double`, `Boolean`, etc.      | Wrapper Classes   | Immutable  | Wrapper for primitives (`int → Integer`)           |
| `Object`                                  | Root Class        | Depends      | All classes inherit from `Object`                  |
| `Array`                                   | Array             | Mutable    | Fixed size, but elements can be changed            |
| `ArrayList`                               | Collection (List) | Mutable    | Resizable array                                    |
| `LinkedList`                              | Collection (List) | Mutable    | Doubly linked list                                 |
| `HashMap`                                 | Collection (Map)  | Mutable    | Key-value pairs                                    |
| `HashSet`                                 | Collection (Set)  | Mutable    | Unordered unique elements                          |
| `LocalDate`, `LocalTime`, `LocalDateTime` | Date-Time API     | Immutable  | From `java.time` package                           |
| `Scanner`                                 | Utility / I/O     | Mutable    | Used for input reading                             |
| `File`                                    | I/O / File API    | Mutable    | Represents file or directory paths                 |
| `Thread`                                  | Concurrency       | Mutable    | Represents an executing thread                     |


<br>

[Back To Top](#java-data)

---

<br>

# `boolean`
A boolean is a 1-bit primitive data type with two states `true` or `false`.
* default value is `false`
* Wrapper class is `Boolean`

boolean literal:
```java
true        // boolean literal
false       // boolean literal
```

<br>

boolean variable:
```java
boolean bool;   // default to = false;
```

```java
boolean bool = true;
```

<br>

[Back To Top](#java-data)

---

<br>

# `Integer Primitives`
An `integer` is a whole number.
* Default type is `int`

There are 4 integer types in Java:
| Primitive Type | Size            | Description                        | Default Value |
| -------------- | --------------- | ---------------------------------- | ------------- |
| `byte`   | 8-bit  (1 byte) | Small integer (-128 to 127)  | `0`     |
| `short`  | 16-bit (2 bytes)| Larger integer (-32,768 to 32,767) | `0`     |
| `int`    | 32-bit (4 bytes)| Common integer (-2^31 to 2^31 - 1) | `0`     |
| `long`   | 64-bit (8 bytes)| Large integer (-2^63 to 2^63 - 1)  | `0L`    |

<br>

## `Two's Complement Notation`
Integer primitive types are stored in a binary format called `Two's complement notation.`
* All java integer types are signed (positive and negative values)

<br>

`Two's compliment` is a method of encoding signed integers in binary so that positive and negative numbers can be represented and arithmetically process using the same logic.
* The most significant bit is used as the sign bit.
* 0 for positive numbers
* 1 for negative numbers
* only one value for 0

<br>

Example: Representing +42

```java
0101010     // 42 in two's complment notation
^
|  
Sign Bit
```

<br>

Example: Representing -42
```java
1101010     // -42 in two's complment notation
^
|  
Sign Bit
```

<br>

[Back To Top](#java-data)

---

<br>

## `byte`
A `byte` is an 8-bit (1 byte) signed integer primitive data type with a range of -128 to 127.
* default value is `0`
* Wrapper class is `Byte`
* 8 bits : 1 byte
* Variables declared with the `byte` keyword.

<br>

byte literal:
```java
-128    // byte literal    
-64     // byte literal
0       // byte literal
64      // byte literal
127     // byte literal
```

<br>

byte variable:
```java
byte bits;      // defaults to bits = 0;
```

```java
byte bits = 127;
```

<br>

[Back To Top](#java-data)

---

<br>

## `short`
A `short` is a 16-bit (2 byte) signed integer primitive type with a range of -32,768 to 32,767.
* default value is `0`
* Wrapper class is `Short`
* 16 bits : 2 bytes
* Variables declared with the `short` keyword.

<br>

short literal:
```java
-32768      // short literal
-1024       // short literal
0           // short literal
1024        // short literal
32767       // short literal
```

<br>

short variable:
```java
short num;  // Default to num = 0;
```

```java
short num = 32;
```

<br>

[Back To Top](#java-data)

---

<br>


## `int`
An `int` is a 32-bit (4 byte) signed integer primitive type with a range of  -2<sup>31</sup> to 2<sup>31</sup>-1.
* default value is `0`
* Wrapper class is `Integer`
* 32 bits : 4 bytes
* Variables declared with the `int` keyword.

int literals:
```java
-2147483648     // int literal           
-65536          // int literal   
0               // int literal
65536           // int literal   
2147483647      // int literal       
```

<br>

int variable:
```java
int num;  // Default to num = 0;
```

```java
int num = 4096;
```
<br>

[Back To Top](#java-data)

---

<br>

## `long`
A long is a 64-bit (8 byte) signed integer primitive type with a range of -2<sup>63</sup> to 2<sup>63</sup>-1.
* default value is `0L`
* Wrapper class is `Long`
* Use the suffix `l` or `L`
* 64 bit : 8 bytes
* Variables declared with the `long` keyword.

<br>

*Since the default integer type is `int` and a `long` is larger than an int, a suffix is used to tell the compiler that the data is intended to be a long. This avoids an integer overflow error.*

<br>

long literal:
```java
-9223372036854775808L
-4294967296L
0L
4294967296L
9223372036854775807L
```

<br>

long variable:
```java
long num;  // Default to num = 0L;
```

```java
long num = 9223372036854775807L;
```

<br>

[Back To Top](#java-data)

---

<br>

## `Formatting Large Numbers`
Large numbers can be formatted for readability using underscores `_`

Example:
```java
65_536
2_147_483_647
9_223_372_036_854_775_807L
```

<br>

[Back To Top](#java-data)

---

<br>

## `Base Prefixing`
`Base Prefixing` is the use of a special prefix to indicate the base of the number literal you are using.

|Name| Base| Prefix|
|:-|:-|:-|
|Decimal|10|no prefix|
|Binary|2|`0b` or `0B`|
|Octal|8|`0`|
|Hexadecimal|16|`0x` or `0X`|

<br>

base 2 (binary) (prefix: 0b)
```java
0b101010    // 42 in decimal
```

<br>

base 8 (octal) (prefix: 0)
```java
052        // 42 in decimal
```

<br>

base 16 (hexadecimal) (prefix: 0x)
```java
0x2A        // 42 in decimal
```

<br>

[Back to Top](#java-data)

___

<br>

# `Floating Point Primitives`
A `floating point number` is a number with a fractional part ie. any number that is not whole.
* The fractional part of the number is separated from the whole part with point `.`
* commonly known as `decimal numbers`
* default type is `double`

<br>

There are 2 floating point types in Java:
| Primitive Type | Size            | Description                        | Default Value |
| -------------- | --------------- | ---------------------------------- | ------------- |
| `float`  | 32-bit (4 bytes)| Single-precision floating point    | `0.0f`  |
| `double` | 64-bit (4 bytes)| Double-precision floating point    | `0.0d`  |

<br>

## `IEEE 754 Standard Single Precision`
`Single precision floats` (32 bits / 4 bytes) are stored in binary according the the `IEEE 754 Standard`.
* 32 bits total
* 1 sign bit, 8 exponent bits, 1(implied) mantissa bit, 23 (explicit) mantissa bits.
* 24 bits of precision.

| **Bit(s)** | **Field** | **Purpose**|
| -- | -- | -- |
| 1 bit  | **Sign** | `0` for positive, `1` for negative |
| 8 bits | **Exponent**| Biased exponent (stores power of 2) <br> bias of 127; all 1s (255) is reserved for special values like infinity |
| 1 bit (hidden) | **Implicit Mantissa leading bit** | Always assumed to be `1` for normalized numbers; not stored, but contributes to precision |
| 23 bits | **Mantissa** (fraction)  | Actual precision bits (significand) |

<br>

### Normalized vs. Denormalized

`Normalized` floating-point numbers are stored in a standardized binary format where the most significant digit is always 1 (for non-zero values).
* Normalizing allows for an implicit mantissa leading bit (1) which saves space, standardizes representation, and improves precision (24 bits). 

```
1.mantissa
```

<br>

To decode the value from a normalized 32 bit single precision float:

$ value = (-1)^{sign} \times 2^{(exponent -127)} \times  1.mantissa  $

---

<br>

`Denormalized` floating-point numbers are too close to 0 (ie. exponent is too small) to be normalized.
* The leading bit is 0 and not implied or stored.
* The leading 1 is not assumed so denormalized values have 23 bits of precision
* `subnormal adjustment` the exponent is all 0s -->  2<sup> -126</sup>
    * The smallest normalized exponent is 1 - 127 = −126 which is fixed for denormalized numbers.
    
```
0.mantissa
```

<br>

To decode the value from a denormalized 32 bit single precision float:

$ value = (-1)^{sign} \times 2^{-126} \times  0.mantissa  $


---

<br>


`Maximum Positive Single Precision Float`
1. $(-1)^0 \times 2^{254 - 127} \times (1 + (1 - 2^{-23}))$
2. $ 2^{127} \times (2 - 2^{-23})$
3. $\approx \mathbf{3.4028235 \times 10^{38}}$

<br>

`Minimum Positive Single Precision Float`
1. $(-1)^0 \times 2^{-126} \times 2^{-23}$
2. $2^{-149}$ 
3. $\approx \mathbf{1.4 \times 10^{-45}}$

<br>

---

<br>

### Biased Exponent
The `biased exponent` allows the exponent to be interpreted as an unsigned integer while still representing both positive and negative powers of 2. 
* 8-bit signed integers range from -128 to 127
* 8-bit unsigned integers range from 0 to 255
* 255 is reserved for special values (e.g., infinity, NaN)
* 0 is reserved for denormalized values

So the total range of exponents is -126 to 127

<br>

### Example: 5.75
5.75 in binary is 101.11 or 1.0111 * 2<sup>2</sup>
* sign is 0 (positive)
* exponent is 2 with the bias 2 + 127 = 129 --> 10000001 
* Mantissa (fraction) is 01110000000000000000000

All 32 bits together:
```
0 10000001 01110000000000000000000
```

<br>

[Back to Top](#java-data)

___

<br>

## `IEEE 754 Standard Double Precision`
`Double precision floats` (64 bits / 8 bytes) are stored in binary according the the `IEEE 754 Standard`.
* 64 bits total
* 1 sign bit, 11 exponent bits, 1(implied) mantissa bit, 52 (explicit) mantissa bits.
* 53 bits of precision.

| **Bit(s)** | **Field** | **Purpose**|
| -- | -- | -- |
| 1 bit | **Sign**  | `0` for positive, `1` for negative  |
| 11 bits | **Exponent**  | Biased exponent (stores power of 2) <br> bias of **1023**; all 1s (2047) is reserved for special values like infinity and NaN |
| 1 bit (hidden) | **Implicit Mantissa leading bit** | Always assumed to be `1` for normalized numbers; not stored but contributes to precision |
| 52 bits  | **Mantissa** (fraction) | Actual precision bits (significand) |


<br>

### Normalized vs. Denormalized

`Normalized` floating-point numbers are stored in a standardized binary format where the most significant digit is always 1 (for non-zero values).
* Normalizing allows for an implicit mantissa leading bit (1) which saves space, standardizes representation, and improves precision (53 bits). 

```
1.mantissa
```

<br>

To decode the value from a normalized 32 bit single precision float:

$ value = (-1)^{sign} \times 2^{(exponent -1023)} \times  1.mantissa  $

---

<br>

`Denormalized` floating-point numbers are too close to 0 (ie. exponent is too small) to be normalized.
* The leading bit is 0 and not implied or stored.
* The leading 1 is not assumed so denormalized values have 52 bits of precision
* `subnormal adjustment` the exponent is all 0s -->  2<sup> -1022</sup>
    * The smallest normalized exponent is 1 - 1023 = −1022 which is fixed for denormalized numbers.
    
```
0.mantissa
```

<br>

To decode the value from a denormalized 64 bit double precision float:

$ value = (-1)^{sign} \times 2^{-1022} \times  0.mantissa  $


---

<br>

### `Maximum Positive Double Precision Float`
1. $(-1)^0 \times 2^{2046 - 1023} \times \left(1 + (1 - 2^{-52})\right)$  
2. $2^{1023} \times (2 - 2^{-52})$  
3. $\approx \mathbf{1.7976931348623157 \times 10^{308}}$

<br>

### `Minimum Positive Double Precision Float`  
(Subnormal smallest positive double)

1. $(-1)^0 \times 2^{-1022} \times 2^{-52}$  
2. $2^{-1074}$  
3. $\approx \mathbf{4.9 \times 10^{-324}}$


<br>

### Biased Exponent
The `biased exponent` allows the exponent to be interpreted as an unsigned integer while still representing both positive and negative powers of 2.
* 11-bit signed integers range from -1024 to 1023
* 11-bit unsigned integers range from 0 to 2047
* `2047` (all bits 1) is reserved for special values (e.g., infinity, NaN)
* `0` (all bits 0) is reserved for denormalized values

So the total usable range of exponents for normalized values is −1022 to +1023


<br>

[Back to Top](#java-data)

___

<br>

## `float`
A `float` is a 32 bit (4 byte) single precision floating point primitive data type with approximately `6-7 digits of precision`
* Default is `0.0f`
* Wrapper class is `Float`
* Use the suffix `f` or `F`
* 32 bits : 4 bytes
* `6-7` digits of precision
* Variables declared with `float` keyword

<br>

| **Min Positive Subnormal Value** | **Min Positive Normal Value** | **Max Value**    |
| --- | ----- | -- |
| $ \approx 1.4 \times 10^{-45}$ | $ \approx 1.18 \times 10^{-38}$ | $\approx 3.4028235 \times 10^{38}$ |

<br>

literal float:
```java
-100.15f
-1.07f
3.14f
75.62f
```

<br>

float variable:
```java
float num;  // Default to num = 0.0f;
```

```java
float num = 3.14f;
```


<br>

[Back to Top](#java-data)

___

<br>


## `double`
A `double` is a 64 bit (8 byte) double precision floating point primitive data types with appoximately `15-16 digits of precision`.
* double is the default floating point type
* default value is `0.0d`
* Wrapper Class is `Double`
* Use the suffix `d` or `D` (optional since doubles are default)
* 64 bits : 8 bytes
* `15-16` digits of precision
* Variables are declared with the `double` keyword

<br>

| **Min Positive Subnormal Value** | **Min Positive Normal Value** | **Max Value**    |
| --- | ----- | -- |
| $ \approx 4.9 \times 10^{-324}$ | $ \approx 2.225074 \times 10^{-308}$ | $\approx 1.7976931348623157 \times 10^{308}$ |

<br>

double literals:
```java
-50.034
-0.014
3.1415926535
1.618
```

<br>

double variable:
```java
double num;  // Default to num = 0.0f;
```

```java
double num = 3.14;
```

<br>

[Back to Top](#java-data)

___

<br>

## `Scientific Notation`
Scientific Notation is possible with floating point types.
* use `E` to represent $ \times 10$

Examples:
```java
2.99E8
6.022E23
6.62607015E-34
6.67430E-11
```

<br>

[Back to Top](#java-data)

___

<br>

# `char`
A `char` is a 16-bit (2 byte) primitive unicode character type.
* Default is `\u0000` (null character)
* uses the UTF-16 encoding
* each char is a 16-bit unsigned integer value
* enclosed in single quotes `''`
* can be an integer, unicode escape sequence, or character
* Variables are declared with the `char` keyword.


As an integer literal:
```java
48  // 0
65  // A
97  // a
```

<br>

As a unicode escape sequence:
```java
'\u0030'    // 0
'\u0041'    // A
'\u0061'    // a
```

<br>

As a character literal:
```java
'0'
'A'
'a'
```

<br>

character variable:
```java
char zero = '0';

char upper = '\u0041';

char lower = 97;
```


<br>

[Back to Top](#java-data)

___

<br>

# `String`
A `String` is an immutable reference type defined by the `java.lang.String` class in the Java standard library that represents a sequence of characters.
* use double quotes `""`
* Variables are declared with the `String` class name. 
* `java.lang.*` is included automatically in every file


*a \* is a wildcard, meaning 'all' in this case. So `java.lang.*` means import everything from the java.lang package.*

String literals:
```java
"Java"
"Hello World!"
"The quick brown fox jumps over the lazy dog."
"012345679"
```

<br>

String variables:
```java
String str;     // Defaults to str = null;
```
```java
String str = "Java Programming";
```

<br>

## `String Internment`
In Java `String Internment` is the process of storing only one copy of each unique string literal in a special area of memory called the string pool.
* Saves memory by reusing unique string values instead of making new copies. 
* This has implications in how Strings are compared for equality ie. `==` vs. `.equals()`

<br>

[Back to Top](#java-data)

___

<br>

# `Collections`
There are 4 major common collection types in the Java Programming Language:
* Arrays (not technically a collection in Java)
* ArrayLists
* LinkedLists
* HashSets
* HashMaps

<br>

An `Array` is collection of elements, which is ordered (indexed), mutable, allows duplicate elements, uses {} to enclose its elements and stores values in contigous memory locations. 
* An array is `NOT` techinically a collection as defined by `java.util.Collection`
* Arrays are apart of the core language structure of Java.

```java
int[] array = {1,2,3,4,5}
```

<br>

An `ArrayList` is a collection of elements, which is ordered (indexed), mutable, allows duplicate elements, is dynamically sized, and only stores objects in contiguous memory locations.
* Defined by `java.util.ArrayList`.
* There are no ArrayList literals.

```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();    // Creates an empty ArrayList;
```

<br>

A `LinkedList` is a collection of elements, which is ordered (indexed), mutable, allows duplicate elements, is dynamically sized, and only stores objects in linked areas of memory.
* Defined by `java.util.LinkedList`
* There are no LinkedList literals

```java
import java.util.LinkedList;

LinkedList<Integer> list = new LinkedList<>();  // Creates an empty LinkedList;
```

<br>

A `HashSet` is a collection of elements, which is unordered, unindexed, mutable, and stores unique values.
* Defined by `java.util.HashSet`
* There are no HashSet Literals

```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
```

<br>

A `HashMap` is a collection of key : value pairs, which is unordered, mutable, and stores unique key values.
* Defined by `java.util.HashMap`
* There are not HashMap

```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
```

<br>



|            `Array`            |          `ArrayList`          |          `LinkedList`         |        `HashSet`        |           `HashMap`          |
| :---------------------------: | :---------------------------: | :---------------------------: | :---------------------: | :--------------------------: |
| ordered (numerically indexed) | ordered (numerically indexed) | ordered (numerically indexed) | unordered (not indexed) | unordered, key indexed       |
|      fixed-size, mutable      |       resizable, mutable      |       resizable, mutable      |         mutable         |            mutable           |
|       allows duplicates       |       allows duplicates       |       allows duplicates       |    NO duplicates        |     NO duplicate keys        |
|             `[ ]`             |      `new ArrayList<>()`      |      `new LinkedList<>()`     |    `new HashSet<>()`    |       `new HashMap<>()`      |


* *`Data Structure`: a specialized format for organizing, processing, retrieving, and storing data.*
* *`Collection`: a data structure that holds multiple elements*
* *`Element`: an item stored within a collection*
* *`Member`: is a synonym for element*
* *`Ordered`: having a specific order 0,1,2,... (ie. indexed)*
* *`Indexed`:  elements are associated with a specific identifier (index), which can be used to directly locate and access the data*
* *`Mutable`: elements can change*
* *`Immutable`: elements cannot change*
* *`Iterable`: an object that can return its elements one at a time.*

<br>

[Back to Top](#java-data)

___

<br>

## `Arrays`
An Array is a mutable reference type handled directly by the Java compiler and JVM, which stores a group of elements of the same type.
* fixed size : cannot grow or shrink
* indexed : each spot has a numeric identifier
* element : each item in the array
* Array literals use curly braces `{}`
* Arrays can be created using `new type[size];`
* Array variables are defined using `[]` and the type of the data the array with store.

<br>

Array Literal Syntax:
```
{element, element, element, ... };
```

Array Literals:
```java
{'a','b','c'};      // char array 
//0   1   2         // indexes (used to access individual elements)
```
```java
{null,null,null};           // array of null values
{true, false, true};        // array of boolean values
{42,123,-7};                // array of int values
{3.14, 2.718, 0.5};         // array of double values
{"hello", "world", "java"}; // array of String values    
```

<br>

Array Variable Syntax:
```
type[] varName = new type[size];

type[] varName = {...};
```

Array Variables:
```java
int[] nums;             // Default to null  

double[] doubleNums;    // Default to null

char[] chars;           // Default to null

String[] strs;          // Default to null
```
```java
int[] nums = new int[5];                    // {0,0,0,0,0};               

double[] doubleNums = new double[5];        // {0.0, 0.0, 0.0, 0.0, 0.0}; 

char[] chars = new char[5];                 // {u/0000, u/0000, u/0000, u/0000, u/0000};

String[] strs = new String[5];              // {null, null, null, null, null};
```
```java
int[] nums = {1, 2, 3, 4, 5};

double[] doubleNums = {0.1, 0.2, 0.3, 0.4, 0.5};

char[] chars = {'a', 'b', 'c'};

String[] strs = {"Java", "Programming", "with", "Arrays"};
```

<br>

### Multidimensional Arrays

A `Multidimensional Array` is an array of arrays.
* Add an additional `[]` for each dimension.

<br>

2D Array Literal:
```java
{{1,2,3}, {4,5,6}, {7,8,9}}
```
2D Array Variable:

syntax:
```
type[][] varName = new type[outerSize][innerSize];

type[][] varName = {{...}, ...}
```
example:
```java
int[][] arr2d = new int[3][2];      // {{0,0}, {0,0}, {0,0}};
```

<br>

[Back to Top](#java-data)

___

<br>


## `ArrayList`
An `ArrayList` is a mutable reference type defined by the `java.util.ArrayList` class, and represents a dynamically sizeable group of elements.
* Objects only : cannot store primitives directly (autobox to wrapper class)
* Dynamically Sizeable : can grow and shrink
* indexed : each spot has a numeric identifier
* Must import `java.util.ArrayList`
* There are no ArrayList literals.

Example:
```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
```

<br>

[Back to Top](#java-data)

___

<br>

## `LinkedList`

A `LinkedList` is a mutable reference type defined by the `java.util.LinkedList` class, and represents a sequential chain of nodes where each node points to the next.

* Objects only : cannot store primitives directly (autobox to wrapper class)
* Dynamically Sizeable : can grow and shrink
* Sequential Access : elements are accessed by traversing from one node to the next
* Node-based : each element is stored in a separate node with links to neighbors
* Must import `java.util.LinkedList`
* There are no LinkedList literals.

<br>

A `node` represents an individual unit within a data structure or system that typically stores data, and references 0 or more other nodes. 


Example:
```java
import java.util.LinkedList;

LinkedList<String> list = new LinkedList<>();
```

<br>

[Back to Top](#java-data)

___

<br>

## `ArrayList vs LinkedList`
| Feature                | `ArrayList`                              | `LinkedList`                             |
| ---------------------- | ---------------------------------------- | ---------------------------------------- |
| **Structure**          | Backed by a dynamic array                | Built from a chain of nodes              |
| **Access Time**        | Fast random access via index (O(1))      | Slow random access; must traverse (O(n)) |
| **Insertion (Middle)** | Slow — requires shifting elements (O(n)) | Fast — just relink nodes (O(1) with ref) |
| **Insertion (End)**    | Fast (amortized O(1))                    | Fast (O(1))                              |
| **Deletion (Middle)**  | Slow — shifting required (O(n))          | Fast — relinking (O(1) with ref)         |
| **Memory Usage**       | Less overhead; just stores elements      | More overhead; stores data + links       |
| **Use Case**           | Best for frequent access by index        | Best for frequent insertions/removals    |

<br>

[Back to Top](#java-data)

___

<br>

## `HashSet`

A `HashSet` is a mutable reference type defined by the `java.util.HashSet` class, and represents a collection that contains unique, unordered elements backed by a hash table.

* Objects only : cannot store primitives directly (autobox to wrapper class)
* No Duplicates : automatically ignores duplicate values
* Unordered : does not maintain insertion order
* Fast Lookup : uses hashing for efficient `add`, `remove`, and `contains` (average O(1))
* Backed by Hash Table : uses a hash function to organize values internally
* Must import `java.util.HashSet`
* There are no HashSet literals.


A `hash function` is an algorithm that takes an input (often called a key) and produces a fixed-size numerical value, called a `hash code`, which is used to index and organize data in hash-based structures.

Example:
```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
```

<br>

[Back to Top](#java-data)

___

<br>


## `HashMap`

A `HashMap` is a mutable reference type defined by the `java.util.HashMap` class, and represents a collection of key-value pairs where each key maps to a single value, backed by a hash table.

* Objects only : cannot store primitive types directly (autobox to wrapper class)
* Unique Keys : each key must be unique; values can be duplicated
* Unordered : does not maintain insertion order of entries
* Allows Nulls : one null key and multiple null values are allowed
* Backed by Hash Table : uses a hash function to map keys to buckets
* Must import `java.util.HashMap`
* There are no HashMap literals

### Example Usage:

```java
import java.util.HashMap;
        
HashMap<String, Integer> map = new HashMap<>();
```

<br>

[Back to Top](#java-data)

___

<br>

*Created and Maintained by Mr. Merritt*




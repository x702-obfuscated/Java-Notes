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

## `Boxing and Autoboxing`
`Boxing` is the process of converting a `primitive` value to its corresponding `wrapper class` object.
* `Autoboxing` is the implicit process of boxing handled automatically by the compiler.

<br>

boxing example:
```java
Integer box = Integer.valueOf(10); // this is manual and explicit.
```
autoboxing example:
```java
Integer auto = 10; // the compiler automatically converts.
```

<br>

```java
int num = 5;

// Explicit Boxing
Integer boxed = Integer.valueOf(num);

// Implicit Autoboxing
Integer autoBoxed = num;

System.out.println(boxed);      // Output: 5
System.out.println(autoBoxed);  // Output: 5
```

<br>

## `Unboxing and Auto-Unboxing`
`Unboxing` is the explicit process of converting a `wrapper class` object back to a `primitive`.
* `Auto-Unboxing` is the implicit process of unboxing handled automatically by the compiler.

<br>

unboxing example:
```java
Integer object = 10;    // Integer Object

int unboxed = object.intValue();  // unboxing: manual and explicit 
```
auto-unboxing example:
```java
Integer object = 10;    // Integer Object

int autoUnbo = object;  // auto-unboxing: handled by the compiler 
```

<br>

```java
Integer object = 20;

// Explicit Unboxing
int unboxed = object.intValue();

// Implicit Auto Unboxing
int autoUnboxed = object;

System.out.println(unboxed);       // Output: 20
System.out.println(autoUnboxed);   // Output: 20
```



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

### `Boolean Wrapper Class`
`Boolean` (java.lang.Boolean) is the wrapper class for boolean primitives.

syntax:
```
Boolean varName = value;
```
```java
Boolean t = true;
Boolean f = false;
```

### Boolean Fields
| Member                   | Description     |
| ------------------------ | ---------------- |
| `Boolean.TRUE`           | Constant `Boolean` instance representing `true`                            |
| `Boolean.FALSE`          | Constant `Boolean` instance representing `false`                           |
| `Boolean.TYPE`           | Class instance representing the `boolean` primitive type (`boolean.class`) |



### Boolean Static Methods
| Member                   | Description     |
| ------------------------ | ---------------- |
| `parseBoolean(String s)` | Parses a string into a primitive `boolean`. Anything not true returns false.                                |
| `valueOf(boolean b)`     | Returns a `Boolean` object from a primitive                                |
| `valueOf(String s)`      | Returns a `Boolean` object from a string                                   |
| `toString(boolean b)`    | Converts a primitive to a `String`                                         |



### Boolean Instance Methods
| Member                   | Description     |
| ------------------------ | ---------------- |
| `boolean booleanValue()`     | Returns the primitive value of the `Boolean` object|
| `String toString()` | Returns string representation (`"true"` or `"false"`)  |
| `boolean equals(Object obj)` | Checks for logical equality|
| `int hashCode()` | Returns the hash code (`1231` for true, `1237` for false)  |
| `int compareTo(Boolean b)`   | Compares two `Boolean` values (false < true)   |



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
| `byte`   | 8-bit <br> (1 byte) | Small integer (-128 to 127)  | `0`     |
| `short`  | 16-bit <br> (2 bytes)| Larger integer (-32,768 to 32,767) | `0`     |
| `int`    | 32-bit <br>(4 bytes)| Common integer (-2<sup>31</sup> to 2<sup>31</sup> - 1) | `0`     |
| `long`   | 64-bit <br> (8 bytes)| Large integer (-2<sup>63</sup> to 2<sup>63</sup> - 1)  | `0L`    |

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

---

<br>

### `Positive Numbers`
To get the binary representation of a positive number:
1. The most significant bit (leftmost) is 0, indicating a positive value
1. The remaining bits store the actual magnitude in binary

Example:  +42

```java
0101010     // 42 in two's complment notation
^
|  
Sign Bit
```

--- 

<br>

### `Negative Numbers`
*This method ensures that binary arithmetic (addition, subtraction) works consistently between positive and negative numbers.*

<br>

To get the binary representation of a negative number:
1. Start with the binary for the positive version of the number
2. Invert (flip) all the bits — this gives the one's complement
3. Add 1 this gives the two's complement, which is the actual stored value
    * Carry bits beyond the most significant bit are ignored.

example: -42
```
42 
    --> 0010 1010                           (binary for postive 42)
                --> 1101 0101               (inverted bits)
                            --> 1101 0110   (inverted bits + 1)
1101 0110                                   (Stored -42)

```
```java
1101 0110     // -42 in two's complment notation
^
|  
Sign Bit
```

<br><br>

To get the decimal representation of a negative binary number:
1. If the most significant (left most) bit is a 1 continue to step 2.
1. Invert all of the bits.
1. Add 1 to get the magnitude of the number.
1. Convert to decimal.
1. Include the negative sign.

<br>

example: 1101 0110 
```
1101 0110                       
        --> 0010 1001                               (Invert the bits)
                     --> 0010 1010                  (Add 1)
                                  --> 42            (Convert to decimal)
                                         --> -42    (Include the - sign)
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

### `Byte Wrapper Class`
`Byte` (java.lang.Byte) is the wrapper class for byte primitives.

syntax:
```
Byte varName = value;
```
```java
Byte num = 127;
```
<br>

### Byte Fields
| Member           | Description                                           |
| ---------------- | ----------------------------------------------------- |
| `Byte.MIN_VALUE` | -128 (lowest byte value)                              |
| `Byte.MAX_VALUE` | 127 (highest byte value)                              |
| `Byte.SIZE`      | 8 (number of bits used)                               |
| `Byte.BYTES`     | 1 (number of bytes used)                              |
| `Byte.TYPE`      | The class type of the primitive `byte` (`byte.class`) |


<br>

### Byte Static Methods
| Method Signature                      | Description                                                         |
| ------------------------------------- | ------------------------------------------------------------------- |
| `Byte valueOf(byte b)`                | Returns a `Byte` instance from primitive                            |
| `Byte valueOf(String s)`              | Parses string to `Byte` object                                      |
| `Byte valueOf(String s, int radix)`   | Parses string to `Byte` using specified radix                       |
| `byte parseByte(String s)`            | Parses string to primitive `byte`                                   |
| `byte parseByte(String s, int radix)` | Parses string in radix to primitive `byte`                          |
| `String toString(byte b)`             | Converts byte to string                                             |
| `Byte decode(String nm)`              | Decodes hex/octal/decimal formatted string (like `"0x1F"`, `"075"`) |

<br>

### Byte Instance Methods
| Method Signature             | Description                                 |
| ---------------------------- | ------------------------------------------- |
| `byte byteValue()`           | Returns the primitive `byte` value          |
| `int intValue()`             | Returns as `int` (from `Number` superclass) |
| `long longValue()`           | Returns as `long`                           |
| `float floatValue()`         | Returns as `float`                          |
| `double doubleValue()`       | Returns as `double`                         |
| `short shortValue()`         | Returns as `short`                          |
| `String toString()`          | Returns string representation               |
| `boolean equals(Object obj)` | Compares values                             |
| `int hashCode()`             | Returns hash code                           |
| `int compareTo(Byte b)`      | Natural byte comparison                     |

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

### `Short Wrapper Class`
`Short` (java.lang.Short) is the wrapper class for short primitives.

syntax:
```
Short varName = value;
```
```java
Short num = 32767;
```
<br>

### Short Fields
| Member            | Description              |
| ----------------- | ------------------------ |
| `Short.MIN_VALUE` | -32,768                  |
| `Short.MAX_VALUE` | 32,767                   |
| `Short.SIZE`      | 16 (bits)                |
| `Short.BYTES`     | 2 (bytes)                |
| `Short.TYPE`      | Represents `short.class` |

<br>

### Short Static Methods
| Method Signature                        | Description                                                   |
| --------------------------------------- | ------------------------------------------------------------- |
| `Short valueOf(short s)`                | Returns a `Short` object from primitive                       |
| `Short valueOf(String s)`               | Parses string to `Short` object                               |
| `Short valueOf(String s, int radix)`    | Parses string using given radix                               |
| `short parseShort(String s)`            | Parses string to primitive `short`                            |
| `short parseShort(String s, int radix)` | Parses string with radix to primitive `short`                 |
| `String toString(short s)`              | Converts primitive short to `String`                          |
| `Short decode(String nm)`               | Decodes strings in decimal, hex (`0x`), or octal (`0`) format |


<br>

### Short Instance Methods
| Method Signature             | Description                             |
| ---------------------------- | --------------------------------------- |
| `short shortValue()`         | Returns primitive `short`               |
| `int intValue()`             | Returns as `int`                        |
| `long longValue()`           | Returns as `long`                       |
| `float floatValue()`         | Returns as `float`                      |
| `double doubleValue()`       | Returns as `double`                     |
| `byte byteValue()`           | Returns as `byte` (may truncate)        |
| `String toString()`          | String representation                   |
| `boolean equals(Object obj)` | Value equality check                    |
| `int hashCode()`             | Returns hash code (same as short value) |
| `int compareTo(Short s)`     | Compares two `Short` values             |


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

### `Integer Wrapper Class`
`Integer` (java.lang.Integer) is the wrapper class for int primitives.

syntax:
```
Integer varName = value;
```
```java
Integer num = 2147483647;
```
<br>

### Integer Fields
| Field               | Description            |
| ------------------- | ---------------------- |
| `Integer.MIN_VALUE` | -2,147,483,648         |
| `Integer.MAX_VALUE` | 2,147,483,647          |
| `Integer.SIZE`      | 32 (bits)              |
| `Integer.BYTES`     | 4 (bytes)              |
| `Integer.TYPE`      | Represents `int.class` |


<br>

### Integer Static Methods
| Method Signature | Description   |
| ----- | -------- |
| `Integer valueOf(int i)`  | Returns an `Integer` object (caching used from -128 to 127) |
| `Integer valueOf(String s)` | Parses string to Integer|
| `Integer valueOf(String s, int radix)`| Parses with given radix |
| `int parseInt(String s)`| Parses to primitive `int` |
| `int parseInt(String s, int radix)` | Parses with radix to `int`|
| `Integer decode(String nm)` | Parses decimal, hex (`0x`), octal (`0`) |
| `String toString(int i)`| Converts `int` to `String`|
| `String toBinaryString(int i)`| Returns binary representation |
| `String toOctalString(int i)` | Returns octal representation|
| `String toHexString(int i)` | Returns hexadecimal representation|
| `int compare(int x, int y)` | Compares two `int`s |
| `int compareUnsigned(int x, int y)` | Compares as unsigned|
| `int divideUnsigned(int x, int y)`| Performs unsigned division|
| `int remainderUnsigned(int x, int y)` | Performs unsigned modulo|
| `int sum(int a, int b)` | Returns `a + b` |
| `int max(int a, int b)` | Returns max |
| `int min(int a, int b)` | Returns min |
| `int hashCode(int value)` | Returns hash code for an `int`|
| `int parseUnsignedInt(String s)`| Parses as unsigned `int`|
| `int parseUnsignedInt(String s, int radix)` | Parses unsigned with radix|
| `String toUnsignedString(int i)`| Converts unsigned `int` to string |
| `String toUnsignedString(int i, int radix)` | Converts unsigned with radix|

<br>

### Integer Instance Methods
| Method Signature                 | Description                   |
| -------------------------------- | ----------------------------- |
| `int intValue()`                 | Returns primitive `int`       |
| `long longValue()`               | As `long`                     |
| `float floatValue()`             | As `float`                    |
| `double doubleValue()`           | As `double`                   |
| `byte byteValue()`               | As `byte` (may truncate)      |
| `short shortValue()`             | As `short` (may truncate)     |
| `String toString()`              | Returns string representation |
| `boolean equals(Object obj)`     | Logical equality              |
| `int hashCode()`                 | Same as `int` value           |
| `int compareTo(Integer another)` | Compares two Integer values   |



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

### `Long Wrapper Class`
`Long` (java.lang.Long) is the wrapper class for long primitives.

syntax:
```
Long varName = value;
```
```java
Long num = 9223372036854775807L;
```
<br>

### Long Fields
| Field            | Description                |
| ---------------- | -------------------------- |
| `Long.MIN_VALUE` | -9,223,372,036,854,775,808 |
| `Long.MAX_VALUE` | 9,223,372,036,854,775,807  |
| `Long.SIZE`      | 64 (bits)                  |
| `Long.BYTES`     | 8 (bytes)                  |
| `Long.TYPE`      | Represents `long.class`    |

<br>

### Long Static methods
| Method Signature  | Description |
| ------- | ---- |
| `Long valueOf(long l)`| Returns a `Long` object |
| `Long valueOf(String s)`  | Parses string to `Long` object  |
| `Long valueOf(String s, int radix)`   | Parses with radix   |
| `long parseLong(String s)`| Parses to primitive `long`  |
| `long parseLong(String s, int radix)` | Parses with radix   |
| `Long decode(String nm)`  | Parses decimal, hex (`0x`), octal (`0`) |
| `String toString(long l)` | Converts to `String`|
| `String toBinaryString(long i)`   | Binary representation   |
| `String toOctalString(long i)`| Octal representation|
| `String toHexString(long i)`  | Hex representation  |
| `int compare(long x, long y)` | Compares two `long`s|
| `int compareUnsigned(long x, long y)` | Unsigned compare|
| `long divideUnsigned(long x, long y)` | Unsigned division   |
| `long remainderUnsigned(long x, long y)`  | Unsigned modulo |
| `long sum(long a, long b)`| Adds two `long`s|
| `long max(long a, long b)`| Maximum |
| `long min(long a, long b)`| Minimum |
| `int hashCode(long value)`| Returns hash code of a `long`   |
| `long parseUnsignedLong(String s)`| Parses as unsigned  |
| `long parseUnsignedLong(String s, int radix)` | Parses as unsigned with radix   |
| `String toUnsignedString(long l)` | Unsigned string |
| `String toUnsignedString(long l, int radix)`  | Unsigned string with radix  |

<br>

### Long Instance Methods
| Method Signature              | Description                               |
| ----------------------------- | ----------------------------------------- |
| `long longValue()`            | Returns primitive `long`                  |
| `int intValue()`              | Returns as `int`                          |
| `float floatValue()`          | Returns as `float`                        |
| `double doubleValue()`        | Returns as `double`                       |
| `byte byteValue()`            | Returns as `byte` (may truncate)          |
| `short shortValue()`          | Returns as `short` (may truncate)         |
| `String toString()`           | String representation                     |
| `boolean equals(Object obj)`  | Logical equality                          |
| `int hashCode()`              | Hash code (same as `Long.hashCode(long)`) |
| `int compareTo(Long another)` | Compares two `Long` objects               |



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

### `Float Wrapper Class`
`Float` (java.lang.Float) is the wrapper class for float primitives.

syntax:
```
Float varName = value;
```
```java
Float frac = 3.14159;
```

<br>

### Float Fields
| Field                     | Description                                    |
| ------------------------- | ---------------------------------------------- |
| `Float.MIN_VALUE`         | Smallest positive non-zero value (\~1.4E-45)   |
| `Float.MAX_VALUE`         | Largest positive value (\~3.4E+38)             |
| `Float.MIN_NORMAL`        | Smallest *normal* positive float (\~1.175E-38) |
| `Float.NaN`               | Not-a-Number                                   |
| `Float.NEGATIVE_INFINITY` | Negative infinity                              |
| `Float.POSITIVE_INFINITY` | Positive infinity                              |
| `Float.SIZE`              | 32 bits                                        |
| `Float.BYTES`             | 4 bytes                                        |
| `Float.TYPE`              | Represents `float.class`                       |

<br>

### Float Static Methods
| Method Signature  | Description |
| --------------------------------- | ----------------------------------------------- |
| `Float valueOf(float f)`  | Returns a `Float` object|
| `Float valueOf(String s)` | Parses and returns a `Float`|
| `float parseFloat(String s)`  | Returns primitive float |
| `boolean isNaN(float v)`  | Checks if value is NaN  |
| `boolean isInfinite(float v)` | Checks if value is infinite |
| `int floatToIntBits(float v)` | IEEE 754 bit representation, collapses all NaNs |
| `int floatToRawIntBits(float v)`  | Same, but keeps all NaNs distinct   |
| `float intBitsToFloat(int bits)`  | Converts bits back to float |
| `int compare(float f1, float f2)` | Compares two float values   |
| `int hashCode(float value)`   | Returns hash code for float |
| `String toHexString(float f)` | IEEE 754 hex string representation  |

<br>

### Float Instance Methods
| Method Signature               | Description                  |
| ------------------------------ | ---------------------------- |
| `float floatValue()`           | Returns primitive `float`    |
| `double doubleValue()`         | As `double`                  |
| `int intValue()`               | As `int` (truncates)         |
| `long longValue()`             | As `long` (truncates)        |
| `short shortValue()`           | As `short` (truncates)       |
| `byte byteValue()`             | As `byte` (truncates)        |
| `String toString()`            | String representation        |
| `boolean isNaN()`              | Checks if object is NaN      |
| `boolean isInfinite()`         | Checks if object is infinite |
| `boolean equals(Object obj)`   | Logical equality             |
| `int hashCode()`               | Object hash code             |
| `int compareTo(Float another)` | Compare two Float objects    |


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

### `Double Wrapper Class`
`Double` (java.lang.Double) is the wrapper class for double primitives.

syntax:
```
Double varName = value;
```
```java
Double frac = 3.14159;
```

<br>

### Double Fields
| Field                      | Description                                     |
| -------------------------- | ----------------------------------------------- |
| `Double.MIN_VALUE`         | Smallest positive nonzero (\~4.9E-324)          |
| `Double.MAX_VALUE`         | Largest positive value (\~1.8E+308)             |
| `Double.MIN_NORMAL`        | Smallest *normal* positive value (\~2.225E-308) |
| `Double.NaN`               | Not-a-Number                                    |
| `Double.NEGATIVE_INFINITY` | Negative infinity                               |
| `Double.POSITIVE_INFINITY` | Positive infinity                               |
| `Double.SIZE`              | 64 (bits)                                       |
| `Double.BYTES`             | 8 (bytes)                                       |
| `Double.TYPE`              | Represents `double.class`                       |


<br>

### Double Static Methods
| Method Signature | Description  |
| ------------------------------------ | -------------------------------------------- |
| `Double valueOf(double d)`   | Returns `Double` object  |
| `Double valueOf(String s)`   | Parses string|
| `double parseDouble(String s)`   | Parses to primitive  |
| `boolean isNaN(double v)`| Check for NaN|
| `boolean isInfinite(double v)`   | Check for Infinity   |
| `long doubleToLongBits(double v)`| IEEE 754 bit representation (canonical NaNs) |
| `long doubleToRawLongBits(double v)` | Same, but preserves NaN distinction  |
| `double longBitsToDouble(long bits)` | Converts bits back to double |
| `int compare(double d1, double d2)`  | Compares two doubles |
| `int hashCode(double value)` | Hash code|
| `String toHexString(double d)`   | IEEE 754 hexadecimal representation  |


<br>

### Double Instance Methods
| Method Signature                | Description                    |
| ------------------------------- | ------------------------------ |
| `double doubleValue()`          | Primitive value                |
| `float floatValue()`            | As `float`                     |
| `int intValue()`                | As `int` (truncates)           |
| `long longValue()`              | As `long` (truncates)          |
| `short shortValue()`            | As `short` (truncates)         |
| `byte byteValue()`              | As `byte` (truncates)          |
| `String toString()`             | Returns string representation  |
| `boolean isNaN()`               | Check for NaN (on object)      |
| `boolean isInfinite()`          | Check for Infinity (on object) |
| `boolean equals(Object obj)`    | Logical equality               |
| `int hashCode()`                | Hash code of object            |
| `int compareTo(Double another)` | Compares two Double objects    |

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

### `Character Wrapper Class`
`Character` (java.lang.Character) is the wrapper class for char primitives.

syntax:
```
Character varName = value;
```
```java
Character ch = 'a';
```

<br>

### Character Fields
| Field                 | Description                     |
| --------------------- | ------------------------------- |
| `Character.MIN_VALUE` | Smallest value: `\u0000`        |
| `Character.MAX_VALUE` | Largest value: `\uffff` (65535) |
| `Character.TYPE`      | Represents `char.class`         |

<br>

### Character Static Methods
| Method Signature    | Description|
| --------------------------------------- | ------------------------------------------ |
| `int getType(char ch)`  | Unicode category (e.g. `UPPERCASE_LETTER`) |
| `int getNumericValue(char ch)`  | Numeric value of digit (or -1) |
| `int getDirectionality(char ch)`| Unicode text direction |
| `byte getDirectionality(int codePoint)` | Same for code point|
| `boolean isDefined(char ch)`| If defined in Unicode  |
| `boolean isLetter(char ch)` | True if letter |
| `boolean isDigit(char ch)`  | True if digit  |
| `boolean isLetterOrDigit(char ch)`  | True if letter or digit|
| `boolean isLowerCase(char ch)`  | True if lowercase  |
| `boolean isUpperCase(char ch)`  | True if uppercase  |
| `boolean isTitleCase(char ch)`  | True if titlecase  |
| `boolean isWhitespace(char ch)` | Checks for whitespace  |
| `boolean isSpaceChar(char ch)`  | Checks for Unicode space char  |
| `boolean isISOControl(char ch)` | True if ISO control character  |
| `String toString(char c)`                 | Converts char to String          |
| `boolean isValidCodePoint(int codePoint)` | True if valid Unicode code point |


Case Conversion
| Method Signature            | Description           |
| --------------------------- | --------------------- |
| `char toLowerCase(char ch)` | Converts to lowercase |
| `char toUpperCase(char ch)` | Converts to uppercase |
| `char toTitleCase(char ch)` | Converts to titlecase |

Unicode/Code Points
| Method Signature | Description|
| -------------------------------------------------------------------- | -------------------------------------- |
| `int codePointAt(CharSequence seq, int index)`   | Unicode code point at index|
| `int codePointBefore(CharSequence seq, int index)`   | Code point before index|
| `int codePointCount(CharSequence seq, int beginIndex, int endIndex)` | Counts code points |
| `boolean isSurrogate(char ch)`   | True if a surrogate|
| `boolean isHighSurrogate(char ch)`   | True if high surrogate |
| `boolean isLowSurrogate(char ch)`| True if low surrogate  |
| `boolean isSupplementaryCodePoint(int codePoint)`| True if supplementary  |
| `char[] toChars(int codePoint)`  | Converts code point to char\[] |
| `int toCodePoint(char high, char low)`   | Returns code point from surrogate pair |

<br>

### Character Instance Methods
| Method Signature         | Description                               |
| ---------------------------- | ----------------------------------------- |
| `char charValue()`           | Returns the wrapped primitive char        |
| `String toString()`          | Returns string representation             |
| `int hashCode()`             | Hash code (int)                           |
| `boolean equals(Object obj)` | Logical equality                          |
| `int compareTo(Character c)` | Compare lexicographically (Unicode order) |




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




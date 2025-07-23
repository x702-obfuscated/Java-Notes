# `java.lang.Math`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*

[Java Documentation](https://docs.oracle.com/en/java/javase/index.html)

For brevity in these notes please assume all of the code snippets in this file are written inside of this main method unless otherwise stated.
```java
public class Example {
    public static void main(String[] args){

        
    }
}
```
---

Covered in this file:
1. [`java.lang.Math Overview`]()
1. [`Constants`]()
1. [`Arithmetic Methods`]()
1. [`Exponentiation and Logarithmic Methods`]()
1. [`Rounding Methods`]()
    1. [`Rounding Algorithms`]()
1. [`Trigonometric Methods`]()
1. [`Random Number Generation`]()
    1. [`Random Range Algorithms`]()
1. [`Bit-Level Operations`]()
1. [`Random Number Generation`]()

<br>

---

<br>

# `java.lang.Math Overview`
Basically: `java.lang.Math` is a class that provides methods and constants for performing basic mathematical operations such as elementary exponential, logarithm, square root, and trigonometric functions.

Specifically: `java.lang.Math` is a final utility class in Java’s standard library that contains static methods and constants for mathematical operations. 
* It cannot be instantiated or subclassed. 
* The methods are mostly overloaded to work with int, long, float, and double primitive types.
* Used for performing operations like absolute value, max/min, rounding, exponentiation, logarithms, trigonometry, and bit-level manipulation.
* It contains only static members — no instance variables or constructors accessible.
* It covers operations on primitive numeric types.
* It ensures precision and correctness for floating-point and integer calculations.
* It throws appropriate exceptions for exact arithmetic methods on overflow.

<br>

[Back To Top](#javalangmath)

---

<br>

# `Constants`
| Constant Name | Type    | Value                              | Description |
|---------------|---------|------------------------------------|-------------|
| `Math.PI`     | `double`| `3.141592653589793`                | The ratio of a circle’s circumference to its diameter (π). |
| `Math.E`      | `double`| `2.718281828459045`                | Euler’s number – the base of natural logarithms (`e`). |
| `Math.TAU`    | `double`| `6.283185307179586` (`2 × PI`)     | The ratio of a circle’s circumference to its radius (τ = 2π). Introduced in Java 21. |

```java
System.out.println(Math.PI);        // Output: 3.141592653589793
System.out.println(Math.TAU);       // Output: 6.283185307179586
System.out.println(Math.E);         // Output: 2.718281828459045

```


<br>

[Back To Top](#javalangmath)

---

<br>
 
# `Arithmetic Methods`
| Method Signature                         | Description |
|------------------------------------------|-------------|
| `abs(int a)`                             | Returns the absolute value of an `int`. |
| `abs(long a)`                            | Returns the absolute value of a `long`. |
| `abs(float a)`                           | Returns the absolute value of a `float`. |
| `abs(double a)`                          | Returns the absolute value of a `double`. |


| Method Signature                         | Description |
|------------------------------------------|-------------|
| `max(int a, int b)`                      | Returns the greater of two `int` values. |
| `max(long a, long b)`                    | Returns the greater of two `long` values. |
| `max(float a, float b)`                  | Returns the greater of two `float` values. |
| `max(double a, double b)`                | Returns the greater of two `double` values. |

| Method Signature                         | Description |
|------------------------------------------|-------------|
| `min(int a, int b)`                      | Returns the smaller of two `int` values. |
| `min(long a, long b)`                    | Returns the smaller of two `long` values. |
| `min(float a, float b)`                  | Returns the smaller of two `float` values. |
| `min(double a, double b)`                | Returns the smaller of two `double` values. |

| Method Signature                         | Description |
|------------------------------------------|-------------|
| `addExact(int x, int y)`                 | Returns `x + y`, throws `ArithmeticException` on overflow. |
| `addExact(long x, long y)`               | Returns `x + y`, throws `ArithmeticException` on overflow. |

| Method Signature                         | Description |
|------------------------------------------|-------------|
| `subtractExact(int x, int y)`           | Returns `x - y`, throws `ArithmeticException` on overflow. |
| `subtractExact(long x, long y)`         | Returns `x - y`, throws `ArithmeticException` on overflow. |

| Method Signature                         | Description |
|------------------------------------------|-------------|
| `multiplyExact(int x, int y)`           | Returns `x * y`, throws `ArithmeticException` on overflow. |
| `multiplyExact(long x, long y)`         | Returns `x * y`, throws `ArithmeticException` on overflow. |

| Method Signature                         | Description |
|------------------------------------------|-------------|
| `negateExact(int a)`                    | Returns `-a`, throws `ArithmeticException` on overflow. |
| `negateExact(long a)`                   | Returns `-a`, throws `ArithmeticException` on overflow. |

| Method Signature                         | Description |
|------------------------------------------|-------------|
| `incrementExact(int a)`                 | Returns `a + 1`, throws `ArithmeticException` on overflow. |
| `incrementExact(long a)`                | Returns `a + 1`, throws `ArithmeticException` on overflow. |

| Method Signature                         | Description |
|------------------------------------------|-------------|
| `decrementExact(int a)`                 | Returns `a - 1`, throws `ArithmeticException` on overflow. |
| `decrementExact(long a)`                | Returns `a - 1`, throws `ArithmeticException` on overflow. |

| Method Signature                         | Description |
|------------------------------------------|-------------|
| `floorDiv(int x, int y)`                | Returns the largest (closest to negative infinity) `int` value ≤ `x / y`. |
| `floorDiv(long x, long y)`              | Returns the largest (closest to negative infinity) `long` value ≤ `x / y`. |

| Method Signature                         | Description |
|------------------------------------------|-------------|
| `floorMod(int x, int y)`                | Returns the floor modulus of `x` and `y`. |
| `floorMod(long x, long y)`              | Returns the floor modulus of `x` and `y`. |

| Method Signature                         | Description |
|------------------------------------------|-------------|
| `multiplyHigh(long x, long y)`          | Returns the most significant 64 bits of the 128-bit product of `x` and `y`. |
| `floorDiv(long x, int y)`               | Returns `floorDiv((long)x, (long)y)` with mixed types. |
| `floorMod(long x, int y)`               | Returns `floorMod((long)x, (long)y)` with mixed types. |


<br>

[Back To Top](#javalangmath)

---

<br>

# `Exponentiation and Logarithmic Methods`

| Method Signature                     | Description |
|--------------------------------------|-------------|
| `exp(double a)`                      | Returns Euler's number `e` raised to the power of `a`. |
| `expm1(double a)`                    | Returns `e^a - 1`; more accurate than `exp(a) - 1` for small `a`. |

| Method Signature                     | Description |
|--------------------------------------|-------------|
| `log(double a)`                      | Returns the natural logarithm (base `e`) of `a`. |
| `log10(double a)`                    | Returns the base-10 logarithm of `a`. |
| `log1p(double a)`                    | Returns `log(1 + a)`; more accurate than `log(1 + a)` for small `a`. |

| Method Signature                     | Description |
|--------------------------------------|-------------|
| `pow(double a, double b)`            | Returns `a` raised to the power of `b` (`a^b`). |
| `sqrt(double a)`                     | Returns the correctly rounded positive square root of `a`. |
| `cbrt(double a)`                     | Returns the cube root of `a`. |
| `hypot(double x, double y)`          | Returns √(x² + y²) without intermediate overflow or underflow. |
| `scalb(double d, int scaleFactor)`   | Efficiently computes `d × 2^scaleFactor`. |
| `scalb(float f, int scaleFactor)`    | Efficiently computes `f × 2^scaleFactor` for floats. |


<br>

[Back To Top](#javalangmath)

---

<br>

# `Rounding Methods`

| Method Signature                        | Description |
|-----------------------------------------|-------------|
| `ceil(double a)`                        | Returns the smallest (closest to positive infinity) `double` value ≥ `a`. |
| `floor(double a)`                       | Returns the largest (closest to negative infinity) `double` value ≤ `a`. |
| `rint(double a)`                        | Returns the `double` value that is closest to `a` and is equal to a mathematical integer. Rounds to even on ties. |

| Method Signature                        | Description |
|-----------------------------------------|-------------|
| `round(float a)`                        | Returns the closest `int` to the argument. |
| `round(double a)`                       | Returns the closest `long` to the argument. |

| Method Signature                        | Description |
|-----------------------------------------|-------------|
| `signum(double a)`                      | Returns the sign of `a` as a `double`: `-1.0`, `0.0`, or `1.0`. |
| `signum(float a)`                       | Returns the sign of `a` as a `float`: `-1.0f`, `0.0f`, or `1.0f`. |

| Method Signature                        | Description |
|-----------------------------------------|-------------|
| `nextUp(double a)`                      | Returns the smallest `double` > `a`. |
| `nextUp(float a)`                       | Returns the smallest `float` > `a`. |
| `nextDown(double a)`                    | Returns the largest `double` < `a`. |
| `nextDown(float a)`                     | Returns the largest `float` < `a`. |
| `nextAfter(double start, double dir)`   | Returns the adjacent `double` in the direction of `dir`. |
| `nextAfter(float start, double dir)`    | Returns the adjacent `float` in the direction of `dir`. |

| Method Signature                        | Description |
|-----------------------------------------|-------------|
| `ulp(double a)`                         | Returns the size of the unit in the last place of the `double` value. |
| `ulp(float a)`                          | Returns the size of the unit in the last place of the `float` value. |

| Method Signature                        | Description |
|-----------------------------------------|-------------|
| `copySign(double magnitude, double sign)` | Returns the first value with the sign of the second as a `double`. |
| `copySign(float magnitude, float sign)`   | Returns the first value with the sign of the second as a `float`. |



## `Rounding Algorithms`

```java
//Rounding a double
double x = 1.5; //round up
double y = 1.2; //round down
double z = -1.5; //round up

//add 0.5 for positive doubles
System.out.println((int)(x + 0.5)); // 2
System.out.println((int)(y + 0.5)); // 1
//sub 0.5 for negative doubles
System.out.println((int)(z - 0.5)); // -2
```

<br>

[Back To Top](#javalangmath)

---

<br>

# `Trigonometric Methods`

| Method Signature                    | Description |
|-------------------------------------|-------------|
| `sin(double a)`                     | Returns the sine of an angle (in radians). |
| `cos(double a)`                     | Returns the cosine of an angle (in radians). |
| `tan(double a)`                     | Returns the tangent of an angle (in radians). |
| `asin(double a)`                    | Returns the arcsine (inverse sine) of a value, in radians. |
| `acos(double a)`                    | Returns the arccosine (inverse cosine) of a value, in radians. |
| `atan(double a)`                    | Returns the arctangent (inverse tangent) of a value, in radians. |
| `atan2(double y, double x)`         | Returns the angle (in radians) from the origin to the point (`x`, `y`). Correctly handles all quadrants. |
| `toDegrees(double angrad)`          | Converts an angle from **radians** to **degrees**. |
| `toRadians(double angdeg)`          | Converts an angle from **degrees** to **radians**. |


<br>

[Back To Top](#javalangmath)

---

<br>

# `Random Number Generation`
| Method Signature         | Description |
|--------------------------|-------------|
| `random()`               | Returns a `double` value ≥ 0.0 and < 1.0, uniformly distributed. |


## `Random Range Algoritms`


```java
//Calculating Random Range

int randomNum = (int)(Math.random() * 101); // random from 0 to 100

int max = 100, min = 50;

//(int)((Math.random() * ((max-min) + 1)+min)); //this is the correct method for random range with a --negative and a positive or two positives--
randomNum = (int)((Math.random() * ((max-min) + 1) + min));

max = 25; min = -25;
randomNum = (int)((Math.random() * ((max-min) + 1) + min));


//(int)((Math.random() * (max-min)+min)); //this is the correct method for random range with --two negatives--
max = -10; min = -30;
randomNum = (int)((Math.random() * (max-min)+min));

```
```java
/**
  Below is a test to show the different equations between two values max and min inclusive.
  (int)((Math.random() * (max-min)+min)); //this is the correct method for random range with { two negatives }
  (int)((Math.random() * ((max-min) + 1)+min)); //this is the correct method for random range with a { negative and a positive or two positives }
*/

import java.util.Scanner;

class RandomRange {
  
  public static void main(String[] args){
    
    //Accept user input //////////////////////////////////////
    Scanner input = new Scanner(System.in);                 //
                                                            //
    System.out.println("Enter the max value.(integer)");    //
    int max = input.nextInt();                              //
                                                            //
    System.out.println("Enter the min value.(integer)");    //
    int min = input.nextInt();                              //
                                                            //
    input.close();                                          //
    //////////////////////////////////////////////////////////
    
    //simulates possible random values from Math.random 0 - 0.999999999999999.
    double[] array = {0,0.000000000000001,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,0.999999999999999};

    if ((max < 0) && (min < 0)){
      System.out.println("Two negatives");
      for (int i = 0; i<array.length; i ++){
        System.out.print((int)((array[i]) * (max-min) + min) + ", ");
        //> Algorithm: (int) (Math.random() * (max - min) + min)
      } 

    } else {
      System.out.println("Two positive or One positive, One Negative");
      for (int i = 0; i<array.length; i ++){
        System.out.print((int)((array[i]) * ((max-min)+1) + min) + ", ");
        //> Algorithm: (int) (Math.random() * (max - min + 1) + min)
      }
    }
  }
}
```



<br>

[Back To Top](#javalangmath)

---

<br>

# `Bit-Level Operations`
| Method Signature                   | Description |
|------------------------------------|-------------|
| `getExponent(float f)`             | Returns the unbiased exponent used in the representation of the `float` value. |
| `getExponent(double d)`            | Returns the unbiased exponent used in the representation of the `double` value. |
| `IEEEremainder(double f1, double f2)` | Computes the remainder of `f1 / f2` as prescribed by the IEEE 754 standard. |


<br>

[Back To Top](#javalangmath)

---

<br>


*Created and maintained by Mr. Merritt.*


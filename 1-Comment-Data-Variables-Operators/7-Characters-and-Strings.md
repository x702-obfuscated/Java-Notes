# `Java Characters and java.lang.String
`
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


# `Defining Characters`

`Characters:`  
Basically: a basic unit of information that represents a letter, number, symbol, or control code 


Specifically: a binary value mapped to a specific symbol as defined by ASCII or UTF

<br><br>

### `American Standard Code for Information Interchange (ASCII)`  
ASCII is a character encoding standard used to represent text in computers and other devices that use text. ACSII defines a mapping of binary values to human readable characters. 
> * defines a set of 128 characters, where each character is represented by a unique 7-bit binary number.
> * forms the basis for more extensive character encoding schemes like Unicode.
> * includes both the uppercase and lowercase latin alphabet a-z,A-Z

<br><br>

### `Unicode`   
Unicode is a universal character encoding standard designed to represent and handle text in most of the world's writing systems.
> * The Unicode standard assigns a unique code point to every character, regardless of platform, program, or language
> * These code points are hexadeximal values prefixed with 'U+'

<br>

*A `code point` is a number that represents a character*

* `Unicode Code Points` are integer values assigned to characters, typically written in hexadecimal format and prefixed with `U+`

For Example:
|Code Point|U+ Format|Character|
|:-:|:-:|:-:|
|97|U+0061|"a"|

<br><br>

### `Unicode Transformation Format (UTF)`  
UTF is a family of character encoding schemes used to represent Unicode characters. 
> * The most common encodings are UTF-8, UTF-16, and UTF-32. These encoding transform unicode code points into sequences of bytes.

`.py files in Python3 are encoded with UTF-8 by default`

<br><br>

### `Internationalization (I18N)`
The symbols defined by ASCII and insuffient for the entire world, so much software focuses on internationalization.
* I18N is a shorthand for the word internationalization. (Why? --> I 18Letters N)


*NOTE*: 
> * 1 byte equals 8 bits
> * The prefix 0b indicates a binary value
> * The prefix 0x indicates a hexadecimal value

<br><br>

|Encoding Scheme|Size|Range|Character|Encoding|Unicode Code Point|
|:-:|:-:|:-:|:-:|:-:|:-:|
|ASCII|7 bits|128 possible values| "a"|0b01100001| U+0065 |
|UTF-8|1 to 4 bytes|1,112,064 possible values| "a"|0x65|U+0065|
|UTF-16|2 or 4 bytes|1,112,064 possible values| "a"|0x0065|U+0065|
|UTF-32|4 bytes|4,294,967,296 possible values| "a" |0x00000065|U+0065|

For more on Unicode and character encodings: [https://home.unicode.org/](https://home.unicode.org/)

<br>

## Character Examples:
```java
'a'
'b'
'@'
'$'
'1'
'0'
```

`7-bit American Standard Code for Information Interchange (ASCII)`  
7 bit ASCII defines 128 characters including all alphanumeric characters
> * In many cases this is the only table we will need to interact with characters

*NOTE*: 
> You may notice that this table does not include all 128 characters, this is because the omitted codes are control codes and not currently relevant.

|**Character**|**Unicode Code Point**|**Decimal**|**Hexadecimal**|**Binary**|**Octal**|
|:-:|:-:|:-:|:-:|:-:|:-:|
| SPACE |U+0020|32|0x20|0b100000|0o40|
|!|U+0021|33|0x21|0b100001|0o41|
|"|U+0022|34|0x22|0b100010|0o42|
|#|U+0023|35|0x23|0b100011|0o43|
|$|U+0024|36|0x24|0b100100|0o44|
|%|U+0025|37|0x25|0b100101|0o45|
|&|U+0026|38|0x26|0b100110|0o46|
|'|U+0027|39|0x27|0b100111|0o47|
|(|U+0028|40|0x28|0b101000|0o50|
|)|U+0029|41|0x29|0b101001|0o51|
|*|U+002a|42|0x2a|0b101010|0o52|
|+|U+002b|43|0x2b|0b101011|0o53|
|,|U+002c|44|0x2c|0b101100|0o54|
|-|U+002d|45|0x2d|0b101101|0o55|
|.|U+002e|46|0x2e|0b101110|0o56|
|/|U+002f|47|0x2f|0b101111|0o57|
|**Character**|**Unicode Code Point**|**Decimal**|**Hexadecimal**|**Binary**|**Octal**|
|0|U+0030|48|0x30|0b110000|0o60|
|1|U+0031|49|0x31|0b110001|0o61|
|2|U+0032|50|0x32|0b110010|0o62|
|3|U+0033|51|0x33|0b110011|0o63|
|4|U+0034|52|0x34|0b110100|0o64|
|5|U+0035|53|0x35|0b110101|0o65|
|6|U+0036|54|0x36|0b110110|0o66|
|7|U+0037|55|0x37|0b110111|0o67|
|8|U+0038|56|0x38|0b111000|0o70|
|9|U+0039|57|0x39|0b111001|0o71|
|**Character**|**Unicode Code Point**|**Decimal**|**Hexadecimal**|**Binary**|**Octal**|
|:|U+003a|58|0x3a|0b111010|0o72|
|;|U+003b|59|0x3b|0b111011|0o73|
|<|U+003c|60|0x3c|0b111100|0o74|
|=|U+003d|61|0x3d|0b111101|0o75|
|>|U+003e|62|0x3e|0b111110|0o76|
|?|U+003f|63|0x3f|0b111111|0o77|
|@|U+0040|64|0x40|0b1000000|0o100|
|**Character**|**Unicode Code Point**|**Decimal**|**Hexadecimal**|**Binary**|**Octal**|
|A|U+0041|65|0x41|0b1000001|0o101|
|B|U+0042|66|0x42|0b1000010|0o102|
|C|U+0043|67|0x43|0b1000011|0o103|
|D|U+0044|68|0x44|0b1000100|0o104|
|E|U+0045|69|0x45|0b1000101|0o105|
|F|U+0046|70|0x46|0b1000110|0o106|
|G|U+0047|71|0x47|0b1000111|0o107|
|H|U+0048|72|0x48|0b1001000|0o110|
|I|U+0049|73|0x49|0b1001001|0o111|
|J|U+004a|74|0x4a|0b1001010|0o112|
|K|U+004b|75|0x4b|0b1001011|0o113|
|L|U+004c|76|0x4c|0b1001100|0o114|
|M|U+004d|77|0x4d|0b1001101|0o115|
|N|U+004e|78|0x4e|0b1001110|0o116|
|O|U+004f|79|0x4f|0b1001111|0o117|
|P|U+0050|80|0x50|0b1010000|0o120|
|Q|U+0051|81|0x51|0b1010001|0o121|
|R|U+0052|82|0x52|0b1010010|0o122|
|S|U+0053|83|0x53|0b1010011|0o123|
|T|U+0054|84|0x54|0b1010100|0o124|
|U|U+0055|85|0x55|0b1010101|0o125|
|V|U+0056|86|0x56|0b1010110|0o126|
|W|U+0057|87|0x57|0b1010111|0o127|
|X|U+0058|88|0x58|0b1011000|0o130|
|Y|U+0059|89|0x59|0b1011001|0o131|
|Z|U+005a|90|0x5a|0b1011010|0o132|
|**Character**|**Unicode Code Point**|**Decimal**|**Hexadecimal**|**Binary**|**Octal**|
|[|U+005b|91|0x5b|0b1011011|0o133|
|\\ |U+005c|92|0x5c|0b1011100|0o134|
|]|U+005d|93|0x5d|0b1011101|0o135|
|^|U+005e|94|0x5e|0b1011110|0o136|
|_|U+005f|95|0x5f|0b1011111|0o137|
|`|U+0060|96|0x60|0b1100000|0o140|
|**Character**|**Unicode Code Point**|**Decimal**|**Hexadecimal**|**Binary**|**Octal**|
|a|U+0061|97|0x61|0b1100001|0o141|
|b|U+0062|98|0x62|0b1100010|0o142|
|c|U+0063|99|0x63|0b1100011|0o143|
|d|U+0064|100|0x64|0b1100100|0o144|
|e|U+0065|101|0x65|0b1100101|0o145|
|f|U+0066|102|0x66|0b1100110|0o146|
|g|U+0067|103|0x67|0b1100111|0o147|
|h|U+0068|104|0x68|0b1101000|0o150|
|i|U+0069|105|0x69|0b1101001|0o151|
|j|U+006a|106|0x6a|0b1101010|0o152|
|k|U+006b|107|0x6b|0b1101011|0o153|
|l|U+006c|108|0x6c|0b1101100|0o154|
|m|U+006d|109|0x6d|0b1101101|0o155|
|n|U+006e|110|0x6e|0b1101110|0o156|
|o|U+006f|111|0x6f|0b1101111|0o157|
|p|U+0070|112|0x70|0b1110000|0o160|
|q|U+0071|113|0x71|0b1110001|0o161|
|r|U+0072|114|0x72|0b1110010|0o162|
|s|U+0073|115|0x73|0b1110011|0o163|
|t|U+0074|116|0x74|0b1110100|0o164|
|u|U+0075|117|0x75|0b1110101|0o165|
|v|U+0076|118|0x76|0b1110110|0o166|
|w|U+0077|119|0x77|0b1110111|0o167|
|x|U+0078|120|0x78|0b1111000|0o170|
|y|U+0079|121|0x79|0b1111001|0o171|
|z|U+007a|122|0x7a|0b1111010|0o172|
|**Character**|**Unicode Code Point**|**Decimal**|**Hexadecimal**|**Binary**|**Octal**|
|{|U+007b|123|0x7b|0b1111011|0o173|
|\||U+007c|124|0x7c|0b1111100|0o174|
|}|U+007d|125|0x7d|0b1111101|0o175|
|~|U+007e|126|0x7e|0b1111110|0o176|

<br>

[Back to Top](#python-strings)
___

<br>

# `Special Characters`
`Special Characters` have a special meaning and are used to perform specific functions in strings and some other types of data.  
> * These characters are typically difficult or impossible to represent directly  
> * Most of these characters have other default meanings and therefore must be "escaped" in order to perform the special function.  

*NOTE*: 
> "escaping a character" refers to the use of special sequences or combinations of characters to represent characters that are difficult or impossible to represent directly.

<br>

## `Special Characters in Java`
|Character|Description|
|:-:|:-|
|\\ | Escape |
|\n |ASCII Linefeed (Newline)|
|\\\\ |Backslash|
|\\'|Single Quote|
|\\"|Double Quote|
|\uxxxx|UTF-16 2 bytes |
|\uxxxx\uxxxx|UTF-32 4 bytes |

**Others that don't get used as much:**
|Character|Description|
|:-:|:-|
|\b| ASCII Backspace|
|\f| ASCII Form Feed|
|\r| ASCII Carriage Return|
|\t | ASCII Tab|
|\u001B|ASCII Escape|
|\ddd| Character Octal Value|

---

## `Escape Character`
`Escape Character \`

In Java, as in many other languages, the backslash character `\` is used as the escape character.
> * Placing a backslash `\` before another character “escapes” its normal meaning and tells the compiler to interpret it differently.

```java
" \n \\ \' \" \u0061 ";

"Hello\nWorld!";

"C:\\Users\\USERNAME\\Destop";

"\"Computers are good at following instructions, but not at reading your mind\"";

"\u006A\u0061\u0076\u0061";
```

---

## `ASCII Linefeed (Newline Character)`
`ASCII Linefeed (Newline Character) ( \n )`
> * the newline character returns the cursor to the beginning next line

```java
System.out.println("First line\nSecond line");
//                             ^ 
// Output:
// First line 
// Second line
```

---

<br>

## `Backslash Character`
`Backslash Character ( \\ )`

Because the backslash character `\` is used to escape other characters, it is necessary to use two backslashes `\\` in order to treat the second backslash as a literal. 

*NOTE*: 
> This will often come up when using Windows file paths in your code. Windows uses \\ to seperate folder/file names in the path

```java
System.out.println( "C:\\Users\\USERNAME\\Documents" );
//                     ^      ^         ^
// Output: 
// C:\Users\USERNAME\Documents 
```

---

## `Quotes: Single and Double`
`Quotes: Single ( ' ), Double( " )`

Because single quotes `'` are used for character literals and double quotes `"`  are used to indicate a string literals.
> * It is necessary to escape a `single quote` to use it as a character.
> * It is necessary to escape `double quotes` in order to make them apart of a string. 


### Single Quotes
```java
System.out.println('\'');
// Output: '


// System.out.println(''');

// Output: 
// <filename>:<line number>: error: empty character literal
//         System.out.println(''');
//                            ^
// <filename>:<line number>: error: unclosed character literal
//         System.out.println(''');
//                              ^
// 2 errors
// error: compilation failed
```

### Double Quotes
```java
System.out.println("\"This text includes the quotes!\"");
//                  ^                               ^
// Output: 
// "This text includes the quotes!"

System.out.println(""This text includes the quotes!"");
// Output:
// <filename>:<line number>: error: ')' or ',' expected
//         System.out.println(""This text includes the quotes!"");
//                              ^
// <filename>:<line number>: error: ';' expected
//         System.out.println(""This text includes the quotes!"");
//                                       ^
// <filename>:<line number>: error: ';' expected
//         System.out.println(""This text includes the quotes!"");
//                                                    ^
// <filename>:<line number>: error: not a statement
//         System.out.println(""This text includes the quotes!"");
//                                                     ^
// <filename>:<line number>: error: ';' expected
//         System.out.println(""This text includes the quotes!"");
//                                                           ^
// 5 errors
// error: compilation failed
```

<br>

---

## `UTF-8 Encoding (1 byte) Hexadecimal Bytes`
`UTF-8 Encoding (1 byte) Hexadecimal Bytes (0xhh)`

Java does not directly support escape sequences for UTF-8 in Strings. UTF-16 is used instead. --> `\u00hh`

Binary data is often difficult for humans to read easily so much of the time binary data is represented as hexadecimal bytes.
> * Use 0xhh in Java in order to represent character data as 1 byte 
> * A byte (1 byte) array is used in order to represent a group of bytes.
> * A char (2 bytes) array is used in order to represent groups of 2 bytes.

*NOTE*: 
> `hh` indicates two places for a hexadecimal value

```java
byte[] bytes = {0x68,0x65,0x6c,0x6c,0x6f};
```
```java
char[] chars = {0x68,0x65,0x6c,0x6c,0x6f};
//                h   e    l    l    o
```

<br>

--- 

## `UTF-16 Encoding (2 bytes)`
`UTF-16 Encoding (2 bytes) ( \uxxxx )`

In order to represent characters not available on the keyboard, such as the greek alphabet, UTF encoding escape sequences are neccessary.

> *For example the code below prints out the uppercase, and lowercase greek alphabet*

```java
System.out.println("\u0391 \u0392 \u0393 \u0394 \u0395 \u0396 \u0397 \u0398 \u0399 \u039a \u039b \u039c \u039d \u039e \u039f \u03a0 \u03a1 \u03a2 \u03a3 \u03a4 \u03a5 \u03a6 \u03a7 \u03a8 \u03a9")
// Output: Α Β Γ Δ Ε Ζ Η Θ Ι Κ Λ Μ Ν Ξ Ο Π Ρ ΢ Σ Τ Υ Φ Χ Ψ Ω

System.out.println("\u03b1 \u03b2 \u03b3 \u03b4 \u03b5 \u03b6 \u03b7 \u03b8 \u03b9 \u03ba \u03bb \u03bc \u03bd \u03be \u03bf \u03c0 \u03c1 \u03c2 \u03c3 \u03c4 \u03c5 \u03c6 \u03c7 \u03c8 \u03c9")
// Output: α β γ δ ε ζ η θ ι κ λ μ ν ξ ο π ρ ς σ τ υ φ χ ψ ω
```

If the code about outputs several `?` then you may need to force the correct encoding using the command below:

Windows Powershell or CMD
```
chcp 65001
```


<br>

[Back To Top](#java-characters-and-javalangstring)

---

<br>

# ``


<br>

[Back To Top](#java-characters-and-javalangstring)

---

<br>

# ``


<br>

[Back To Top](#java-characters-and-javalangstring)

---

<br>

*Created and maintained by Mr. Merritt*

```java
package functional;
//Java Special Characters
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  Covered in this file:
  //> Escape character \
  //> Newline character \n
  //> Carriage return \r
  //> Tab \t
  //> Backspace \b
  //> Form feed \f
   
*/

  //> Variables that hold the same string value reference the same location in memory (called interning)

class SpecialCharacters {
  public static void main(String[] args){
    
    //Special Characters in java

    //use \ to escape characters
    System.out.println("It\'s");
    
    //use \n  for a newline
    System.out.println("Print on a \n newline.");
    
    // \r carriage return (resets the posistion to the beginning of a line of text)
    System.out.println("beginning of the line \r Print at the ");
    
    // \t Tab (inserts a tab)
    System.out.println("extra \t space");
    
    // \b Backspace
    System.out.println("Take a step back 1\b");
    
    // \f form feed (indicates to a printer to start a new page)
    System.out.println("Start on a new \f page.");

  }
}

/*
Common Errors:

*/

/*
Practice:

*/
```


```java

/**
Notes:
  Covered in this file:
  //> Declaring and Initializing Strings
  String Methods
  //> length()
  //> toLowerCase() and toUpperCase()
  //> indexOf()
  //> substring()
  //> concat()
  //> splits()
  //> equals()
  //> compareTo()

*/

import java.util.Objects; //> ignore for now.

public class Strings {
  public static void main(String[] args){
    //> ignore this above for now, but make sure it is in every program you write or they will not work.
    //> see Methods.java for an explanation of the 'main' method

    //============================================================================================================================================================================//
    // Declaring and Initializing Strings
      //> Strings are reference types (objects)
      //> Strings are immutable (cannot be changed)
      //> Strings cannot cross multiple lines
      //> String identifier = "<text>"; or String identifier = new String("<text>");

    String str = "Hello World!";
    //> OR
    String str1 = new String("Goodby World!");
    
    String str2;
    //============================================================================================================================================================================//
    //String Methods
      //> strings are an object that contains methods to perform operations on strings
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
    //============================================================================================================================================================================//
    // length()
      //> returns the number of characters in the string including space characters

    alphabet.length(); //> 26

    //============================================================================================================================================================================//
    // toLowerCase() and toUpperCase()
      //> toLowerCase() coverts and returns all characters in a string in lower case
      //> toUpperCase() converts and returns all characters in a string in upper case
  
    alphabet.toLowerCase(); //> abcdefghijklmnopqrstuvwxyz

    alphabet.toUpperCase(); //> ABCDEFGHIJKLMNOPQRSTUVWXYZ

    //============================================================================================================================================================================//
    // indexOf()
      //> use the .indexOf() method to find the index of first occurrence of a character/string in a string 
      //> it accepts characters or strings as parameters
      //> ! remember spaces count in string indexes

    alphabet.indexOf("M"); //> 12

    //============================================================================================================================================================================//
    // substring()
      //> use .substring() to create a substring of a larger string.
      //> ! remember spaces count in string indexes
      //> substring(index) creates a substring from index to the end of the string
      //> substring(index1, index2) creates a substring from index1 up to but not including index2

    String s = new String("Hello");
    String s1 = "This is a String.";

    s1.length(); //17
    String s2 = s1.substring(13); //'ing.' 
    String s3 = s1.substring(6,9); //"s a" 

    //============================================================================================================================================================================//
    // concat()
      //> to concat use + or you can use the concat() method to concatenate two strings
    
    String name1 = "Jane";
    String name2 = " Smith";
    name1.concat(name2);

    //============================================================================================================================================================================//
    // splits()
      //> use .splits() to break up a string into an array of characters/strings
      //> split("") returns and array of each character from a string
      //> split(<arg>) returns an array of strings split at <args>
      //> The new array does not include the split character

    alphabet.split(""); //> "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"

    String phrase = "The quick brown fox jumps over the lazy dog.";
    phrase.split(" ");//> "The","quick","brown","fox","jumps","over","the","lazy","dog."
    //> Splits the string into an array at spaces
    

    //============================================================================================================================================================================//
    // equals()
      //> use equals() to compare strings instead of ==
      //> == compares if two objects are identical (aliases)(same location in memory)
      //> the String equals() method compares the values of two strings
      //> equals() is an overridden method from the 'Object' class
      //> == cannot be overridden

      String txt1 = "Hello World"; //----------------------------------------------------------//
      String txt2 = "Hello World"; // These 3 variables all reference the same place in memory //
      String txt3 = txt1;//Alias   //----------------------------------------------------------//
      String txt4 = "Goodbye World";

      // using == 
      System.out.println(txt1 == txt2); //> true
      System.out.println(txt1 == txt3); //> true
      System.out.println(txt2 == txt3); //> true
      System.out.println(txt1 == txt4); //> false
	    System.out.println(txt2 == txt4); //> false

      // using equals()
      System.out.println(txt1.equals(txt2)); //> true
      System.out.println(txt1.equals(txt3)); //> true
      System.out.println(txt2.equals(txt3)); //> true
      System.out.println(txt1.equals(txt4)); //> false
	    System.out.println(txt2.equals(txt4)); //> false

      //> But there was no difference why do we need equals()
      //> What about when the objects do not reference the same location in memory?
      
      txt1 = new String("Hello World"); //> creating a new object memory location
      txt2 = "Hello World";
      txt3 = new String("Hello World");
      
      boolean test;

      test = txt1 == txt2; //> false, but the values are identical?
      test = txt1.equals(txt2); //> true

      test = txt1 == txt3; //> false
      test = txt1.equals(txt3); //> true

      test = "Hello World" == "Hello World"; //> true, literals are interned by the compiler and thus refer to the same object.
      test = "Hello World" == "Hello" + "World"; //> true, string literals are concatenated by the compiler and the results are interned
      //> for context: string interning is a method of storing only one copy of each distinct string value, which must be immutable.

    /*
    It matters because:
    == tests for reference equality (whether they are the same object).
    .equals() tests for value equality (whether they are logically "equal").

    == will not always return the correct value
    .equals() will return the correct value

    .equals() can be overridden
    == cannot be overridden

    note: if you are testing whether or not two values are the same object then == is acceptable.

    
    */
   //finally you can also use Objects.equals() : it checks for null before calling .equals() so you don't have to.
    //must import java.util.Objects;
    Objects.equals("test", new String("test")); // true
    Objects.equals(null, "test"); // false
    Objects.equals(null, null); // true

   //============================================================================================================================================================================//
   // compareTo()
    //> returns a value < 0 is this is less than other
    //> returns a value of 0 if this is equal to other
    //> returns a value  > 0 is this is greater than other
    //> Lexicographically determines if one is greater than another
      //> Using Unicode values it checks each value. If the unicode value of one is less then that string is less. 

    str1 = "apple";
    str2 = "banana";

    int result = str1.compareTo(str2);

    if (result < 0) {
        System.out.println(str1 + " is lexicographically less than " + str2);
    } else if (result > 0) {
        System.out.println(str1 + " is lexicographically greater than " + str2);
    } else {
        System.out.println(str1 + " is lexicographically equal to " + str2);
    }
    
    String a = "a"; //unicode 97
    String b = "b"; //unicode 98
    
    System.out.println( a.compareTo(b) ); //> returns -1

    
  }

}

```
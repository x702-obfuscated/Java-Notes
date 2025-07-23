# `Java Arrays`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*

[Java Documentation](https://docs.oracle.com/en/java/javase/index.html)

For brevity in these notes please assume all of the code snippets in this file are written inside of this main method unless otherwise stated.
```java
import java.utils.Arrays;

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

# ``


<br>

[Back To Top](#java-arrays)

---

<br>

# ``


<br>

[Back To Top](#java-arrays)

---

<br>

# ``


<br>

[Back To Top](#java-arrays)

---

<br>

# ``


<br>

[Back To Top](#java-arrays)

---

<br>

*Created and maintained by Mr. Merritt*












```java
package functional;
//Java Data Types
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.htmls 

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
Covered in this file:
  //> What are Arrays?
  //> Declaring Arrays
  //> Array Initializers
  //> Accessing and Changing Array Elements
  //> Array Length  
  //> Multidimensional Arrays
  //> Processing Arrays > See Processing_Arrays folder.
*/
public class Arrays {
//============================================================================================================================================================================//
// What are Arrays?
  //> a data structure that allows you to store a fixed-size collection of elements of the same data type
  //> are immutable (cannot be changed)
  //> are objects
  //> are of fixed size
  //> contain elements that are accessed by indexes. 
  //> can store primitive and reference types
 
  
  public static void main(String[] args) {
  //============================================================================================================================================================================//
  //Declaring and Initializing Arrays
    //> Arrays store multiple values of a single type
    //> Arrays consist of elements
    //> each element has an index value
    //> Java arrays start at index 0
    //> Once created the size of an array is fixed.
    
    //> Array syntax
      //> elementType[] identifier = [size];
    
    //Declaring an array of n size
    int[] intArray =  new int[5]; //creates an array [0, 0, 0, 0, 0]
   
    
  //============================================================================================================================================================================//
  // Array Intializers
    //> shorthand that combines declaration, creation, and initialization of an array.
    //> allow you to provide initial values for the array elements
    
    //> syntax
      //> elementType[] identifier = {value1,value2,...};
    String[] strArray = {"a","b","c","d","e"};
    
    //> arrays can be initialized over multiply lines
    String[] alphabetUpper = {
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
        "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };
  
    
  //============================================================================================================================================================================//
  // Printing Arrays
    //> System.out.print() will print the memory location of the array, not its values
    //> use a for or while loop to print out the values of an array
    //> see Processing_Arrays for more
    
    boolean[] booArray = new boolean[2]; 
    
    //> printing the memory location
    System.out.println( booArray ); //> prints the memory location of booArray not the elements
    
    
    //> printing array elements with a for loop
    for(int index = 0; index < booArray.length; index++) {
      System.out.print(booArray[index] + ", " );
    }
    
    //> printing array elements with a for each loop
    for(boolean elem : booArray) {
      System.out.print(elem + ", ");
    }
    
    
  //============================================================================================================================================================================//
  // Default Array values
    //> There are default values when an array is intialized
    
    int[] intArr = new int[3]; //> [ 0, 0, 0 ]
    double[] duoArr = new double[3]; //> [ 0.0, 0.0, 0.0 ]
    boolean[] boolArr = new boolean[3]; //> [ false, false, false ]
    String[] strArr = new String[3]; //> [ null, null, null ]
    
    //Any object array
    Object[] objArr = new Object[3]; //> [ null, null, null ]
    
    
  //============================================================================================================================================================================//
  // Accessing and Changing Array Elements
    //> to access and/or change an element you need it's index
    //> indexes start at 0 and increase to the right
    
    
    //                  {     elements      }
    String[] alphabet = {"a","b","c","d","e"};
    //          index     0   1   2   3   4
    //               indexes start at zero in java
    
    //Access Syntax: array[index]
    System.out.println( alphabet[0] ); //> a
    System.out.println( alphabet[1] ); //> b
    System.out.println( alphabet[2] ); //> c
    System.out.println( alphabet[3] ); //> d
    System.out.println( alphabet[4] ); //> e
    //      focus here(^^^^^^^^^^^^^)
    
    // Changing Array Elements Syntax: array[index] = <new value>
    alphabet[0] = "v";        System.out.println( alphabet[0] ); //> v
    alphabet[1] = "w";        System.out.println( alphabet[1] ); //> w
    alphabet[2] = "x";        System.out.println( alphabet[2] ); //> x
    alphabet[3] = "y";        System.out.println( alphabet[3] ); //> y
    alphabet[4] = "z";        System.out.println( alphabet[4] ); //> z
  
  //============================================================================================================================================================================//
  // Array Length 
    //> length : stores the number of elements in the array
    //> length is not a method for arrays
    //> not to be confused with the length() method for arrays 
    //> length is always 1 more than the last index
    //> length of an array cannot be changed without making a new array
    
    
    System.out.println( alphabet.length ); //> 5
  
  //============================================================================================================================================================================//
  // Multidimensional Arrays
    //> Arrays that contain Arrays
    //> include multiple indexes 
    
    //> Declaring of n size
    int[][] array2d = new int[2][3];
    //aray 2d is an array of length 2 that stores an array of length 3 in each element
   
    //> Using an array initializer
    //   strArray2d indexes        0             1     
    String[][] strArray2d = {{"a","b","c"},{"d","e","f"}};
    //strArrayd2d[n] indexes { 0   1   2 },{ 0   1   2 } 
    
    
    //> Access Multidimensional Arrays
    
    System.out.println( strArray2d[0] ); //> prints the memory location of the array at index 0
    System.out.println( strArray2d[1] ); //> prints the memory location of the array at index 1
    
    System.out.println( strArray2d[0][0] ); //> a
    System.out.println( strArray2d[0][1] ); //> b
    System.out.println( strArray2d[0][2] ); //> c
    
  
    System.out.println( strArray2d[1][0] ); //> d
    System.out.println( strArray2d[1][1] ); //> e
    System.out.println( strArray2d[1][2] ); //> f
  }

}
 
/*
    More Array Notes:
    Unlike declarations for primitive data type variables, the declaration of an array variable does not allocate any space in memory for the array.
    It creates a storage location for the reference to an array. 
    If a variable does not contain a reference to an array, the value of the variable is "null" (meaning nothing).

    Array variables only hold a reference to the actual array, but this can usually be ignored. 
      So for simplicity we can say that the Array variable is an "array".

    Arrays are typically processed using for loops.
/*
Common Errors:
  chars use single quotes '' not double quotes
  Integer Overflow Error
  ArrayIndexOutOfBoundsException: thrown when attempting to access an index outside of the range 


*/

/*
Practice:

*/

```

```java
package functional.processingarrays;

/*
Notes:
Covered in this file:
  //> What are Multidimensional Arrays?
  //> Declaring 2d Array 
  //> Array Initializer
  //> 2d Array Access and Changing Elements
  //> Array of Arrays using rows and columns
  //> Row Major vs Column Major Order
  //> Traversing 2d Arrays (For /For Each/ While)
 */

public class Arrays2d {
//============================================================================================================================================================================//
// What are Multidimensional Arrays?
  //> Arrays that contain Arrays
  //> include multiple indexes 
  
  public static void main(String[] args) {
  //============================================================================================================================================================================//
  // Declaring a 2d Array
    //> type[][] identifier = new type[<size>][<size>];
    
    //> Declaring of n size
    int[][] array2d = new int[2][3];
    //aray 2d is an array of length 2 that stores an array of length 3 in each element
   
  //============================================================================================================================================================================//
  // Using an array initializer
    //> type[][] identifier = new type[<size>][<size>];
    
    //   strArray2d indexes        0             1     
    String[][] strArray2d = {{"a","b","c"},{"d","e","f"}};
    //strArrayd2d[n] indexes { 0   1   2 },{ 0   1   2 } 
    
  //============================================================================================================================================================================//     
  //> 2d Array Access and Changing Elements
   //>access:  array[firstIndex][secondIndex]
   //>change:  array[firstIndex][secondIndex] = newElement; 
    
    //accessing elements
    System.out.println( strArray2d[0] ); //> prints the memory location of the array at index 0
    System.out.println( strArray2d[1] ); //> prints the memory location of the array at index 1
    
    
    System.out.println( strArray2d[0][0] ); //> a
    System.out.println( strArray2d[0][1] ); //> b
    System.out.println( strArray2d[0][2] ); //> c
    
  
    System.out.println( strArray2d[1][0] ); //> d
    System.out.println( strArray2d[1][1] ); //> e
    System.out.println( strArray2d[1][2] ); //> f
    
    //changing elements
    strArray2d[0][0] = "u";   System.out.println( strArray2d[0][0] ); //> u
    strArray2d[0][1] = "v";   System.out.println( strArray2d[0][1] ); //> v
    strArray2d[0][2] = "w";   System.out.println( strArray2d[0][2] ); //> w
    strArray2d[1][0] = "x";   System.out.println( strArray2d[1][0] ); //> x
    strArray2d[1][1] = "y";   System.out.println( strArray2d[1][1] ); //> y
    strArray2d[1][2] = "z";   System.out.println( strArray2d[1][2] ); //> z
  
  //============================================================================================================================================================================//     
  //Array of Arrays using rows and columns
    //> a 2d array is an array that stores arrays
    //> it is often easier to think of as rows and colums
    
    // 5 x 5 2d Array
    //This array stores elements that represent the index pair they are stored in. 
    String[][] arrayOfArrays = {
        {"[0][0]", "[0][1]", "[0][2]", "[0][3]", "[0][4]"}, //> 0
        {"[1][0]", "[1][1]", "[1][2]", "[1][3]", "[1][4]"}, //> 1
        {"[2][0]", "[2][1]", "[2][2]", "[2][3]", "[2][4]"}, //> 2 row indexes
        {"[3][0]", "[3][1]", "[3][2]", "[3][3]", "[3][4]"}, //> 3
        {"[4][0]", "[4][1]", "[4][2]", "[4][3]", "[4][4]"}, //> 4
   //         0         1         2         3         4
   //>                       column indexes
    }; 
    printArray2dFor(arrayOfArrays); printArray2dForEach(arrayOfArrays); printArray2dWhile(arrayOfArrays);
    
    //Example array
    String[][] alphabetArray = {
      {"A", "B", "C", "D", "E"},
      {"F", "G", "H", "I", "J"},
      {"K", "L", "M", "N", "O"},
      {"P", "Q", "R", "S", "T"},
      {"U", "V", "W", "X", "Y"}
    };
    printArray2dFor(alphabetArray); printArray2dForEach(alphabetArray); printArray2dWhile(alphabetArray);
  //============================================================================================================================================================================//     
  //Row Major vs Column Major Order
    //> two different storage orders used in computer memory and data structures
    //> row-major order, elements of a multi-dimensional array are stored row by row in memory.
    //> column-major order, elements of a multi-dimensional array are stored column by column in memory.
    //> Often refers to different ways of traversing the 2d Array
    //> In Java 2d Arrays are stored in row-major order
    
    //Loop through rows first with for loop
    for(int row = 0; row < array2d.length; row++) {//> rows
      
      for(int col = 0; col < array2d[row].length; col++) {//> cols
        continue;
      }
      
    }
    
    //Loop through cols first with for loop (only works for equally sized arrays)
    for(int col = 0; col < array2d[0].length; col++) {//> cols
      
      for(int row = 0; row < array2d.length; row++) {//> rows
        continue;
      }
      
    }
  }
//============================================================================================================================================================================//     
//Traversing 2d Arrays
  
  //printing forward with a For loop
  public static void printArray2dFor(String[][] array2d) {
    System.out.println("Printing 2d Array Elements in Matrix Format (For Loop)");
    
    for(int row = 0; row < array2d.length; row++) {
      
      for(int col = 0; col < array2d[row].length; col++) {
        System.out.print(array2d[row][col] + " ");
      }
      System.out.println();
    }
  }
  
  //printing forward with a For Each Loop
  public static void printArray2dForEach(String[][] array2d) {
    System.out.println("Printing 2d Array Elements in Matrix Format (For Each Loop)");
    
    for(String[] row : array2d) {
      
      for(String elem : row) {
        System.out.print(elem + " ");
      }
      
      System.out.println();
    }
  }
  
  //printing forward with a While Loop
  public static void printArray2dWhile(String[][] array2d) {
    System.out.println("Printing 2d Array Elements in Matrix Format (While Loop)");
    
    int row = 0;
    while(row < array2d.length) {
      
      int col = 0;
      while(col < array2d[row].length) {
        System.out.print(array2d[row][col] + " ");
        
        col++;
      }
      
      System.out.println();
      row++;
    }
    
  }
  
  //Traverse begin to end row major order
  public static void traverseBeginToEnd(String[][] array2d) {
    for(int row = 0; row < array2d.length; row++) {
      
      for(int col = 0; col < array2d[row].length; col++) {
        System.out.print(array2d[row][col] + " ");
      }
      System.out.println();
    }
  }
  
  //Traverse end to begin row major order
  public static void traverseEndToBegin(String[][] array2d) {
    for(int row = array2d.length-1; row >= 0; row--) {
      
      for(int col = array2d[row].length-1; col >= 0 ; col--) {
        System.out.print(array2d[row][col] + " ");
      }
      System.out.println();
    }
    
  }
  
  //Traverse zig zag
  public static void traverseZigZag(String[][] array2d) {
    for(int row = 0; row < array2d.length; row++) {
      if(row % 2 == 0) {
        
        for(int col = 0; col < array2d[row].length; col++) {
          System.out.print(array2d[row][col] + " ");
        }
      
      }
      else {
        
        for(int col = array2d[row].length-1; col >= 0 ; col--) {
          System.out.print(array2d[row][col] + " ");
        }
        
      }
      System.out.println();
    }
  }
  
 
    
    
}
```

```java
package functional.processingarrays;

//> Determine min or max value
//> compute sum, average, or mode
//> Determine if at least one element has a particular property
//> Determine if all elements have a particular property
//> Access all consecutive pairs of elements
//> Determine the precence or abscence of particular elements
//> Determine the number of elements meeting a specific criteria
//> Shift or rotate elements left or right
//> Reverse the order of elements

public class CommonArrayAlgorithms {

//Find the Maximum from an Array or ArrayList///////////////////////////////
  public static int findMax(int array){
    int max = Integer.MIN_VALUE;

    for(int i = 0; i < array.length; i++){
      if(array[i] > max){
        max = array[i];
      }
    }
    return max;
  }

  public static int findMax(ArrayList<Integer> list){
    int max = Integer.MIN_VALUE;

    for(int i = 0; i < list.size(); i++){
      if(list.get(i) > max){
        max = list.get(i);
      }
    }
    return max;
  }

//////////////////////////////////////////////////////////////////////////////

//Compute Sum of Array or ArrayList///////////////////////////////////////////
  public static int computeSum(int array){
    int sum = 0;

    for(int i = 0; i < array.length; i++){
      sum += array[i];
    }
    return sum;
  }

  public static int computeSum(ArrayList<Integer> list){
    int sum = 0;

    for(int i = 0; i < list.size(); i++){
     sum += list.get(i);
    }
    return sum;
  }
/////////////////////////////////////////////////////////////////////////////////

//Compute Average////////////////////////////////////////////////////////////////
  public static int computeAvg(int array){
    int sum = 0;

    for(int i = 0; i < array.length; i++){
      sum += array[i];
    }
    return max/array.length;
  }

  public static int computeAvg(ArrayList<Integer> list){
    int sum = 0;

    for(int i = 0; i < list.size(); i++){
     sum += list.get(i);
    }
    return sum/list.size();
  }
///////////////////////////////////////////////////////////////////////////////////////

//Determine Mode///////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////
//Determine if at least one element has a particular property//////////////////////////
  public static boolean checkPropertyAtLeastOne(boolean array){
    boolean property = true;
    for(int i = 0; i < array.length; i++){
      if(array[i] == property){
        return true;
      }
    }
    return false;
  }

  public static int checkPropertyAtLeastOne(ArrayList<Boolean> list){
    boolean property = true;
    for(int i = 0; i < list.size(); i++){
     if(list.get(i) == property){
      return true;
     }
    }
    return false;
  }
////////////////////////////////////////////////////////////////////////////////////////////
//Check if all elements have a particular property//////////////////////////////////////////
  public static boolean checkPropertyAll(boolean array){
    boolean property = true;
    for(int i = 0; i < array.length; i++){
      if(array[i] != property){
        return false;
      }
    }
    return true;
  }

  public static int checkPropertyAll(ArrayList<Boolean> list){
    boolean property = true;
    for(int i = 0; i < list.size(); i++){
     if(list.get(i) != property){
      return false;
     }
    }
    return true;
  }
//////////////////////////////////////////////////////////////////////////////////////////////////
}
```
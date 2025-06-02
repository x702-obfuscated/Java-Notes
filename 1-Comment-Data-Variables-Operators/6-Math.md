

```java
package functional;
//Java Math Class
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Math.html


/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  Covered in this file:
  //> Math class
  //> Math class constants
  //> Math Class Methods
  //> Calculating Random Range

*/

class MathClass {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //see Methods.java for an explanation of the 'main' method

  //===============================================================================================================================================//
  //Java Math Class 
    //> consists mainly of static methods for performing mathematical functions
    //> there are 3 constant public values
    //> does not have a public constructor (cannot create Math objects)



  //===============================================================================================================================================//
  //Math Class Constants
    //> There are 3 public constants defined in the java math class

    //pi
    Math.PI; //> 3.141592653589793

    //tau
    Math.TAU; //> 2.0 * Math.PI;

    //Euler's Number
    Math.E; //> 2.718281828459045

  //===============================================================================================================================================//
  //Math Class Methods
  
    // General methods for mathematical tasks
    Math.max(1,5); //> find the largest value

    Math.min(1,5); //>  find the smallest value

    Math.sqrt(144); //> find the square root

    Math.abs(-6); //> returns the absolute value of an int or double

    Math.pow(2.0, 3.0); //> returns the first argument to the power of the second argument

    Math.random(); //>>  returns a random number

    //apply your math skills to do more with the random() method.
    
  //===============================================================================================================================================//
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

    //why are these two different formulas necessary?
    
    //check out the RandomRange.java file
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------


    //For a complete list of the methods in the Math class checkout: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Math.html
  }
}




/**
Notes:
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
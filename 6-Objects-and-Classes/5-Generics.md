# `Java Generics`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*

[Java Documentation](https://docs.oracle.com/en/java/javase/index.html)


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

[Back To Top]()

---

<br>

*Created and maintained by Mr. Merritt*


```java
// Generics

public class Generics {
  
  public static <E> void println(E value){
    System.out.println(value);
  }
  
  public static <E> void print(E value){
    System.out.print(value);
  }

  public static void main(String[] args) {
    
    println(2 + 2);
  }

}


```
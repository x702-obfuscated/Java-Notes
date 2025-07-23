# `java.util.LinkedList`
*Use CTRL + F to search for keywords in this file*  
*You are encouraged to copy and alter the code in this file to understand how it works*

[Java Documentation](https://docs.oracle.com/en/java/javase/index.html)

For brevity in these notes please assume all of the code snippets in this file are written inside of this main method unless otherwise stated.
```java
import java.util.LinkedList;

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

[Back To Top](#javautillinkedlist)

---

<br>

*Created and maintained by Mr. Merritt*

```java
//Java LinkedList
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  LinkedLists are collections of objects of the same type with all of the same methods as an ArrayList
  a LinkedList stores items in containers and each container has a link to the next contianer in the list.
  Typically an ArrayList is used for storing and accessing data, and LinkedList is used to manipulate data.
  a LinkedList adds more methods to do certian operations more efficiently

  addFirst(); add an item to the beginning of the list
  addLast(); add and item to the end
  removeFirst();
  removeLast();
  getFirst();
  getLast();
*/

import java.util.LinkedList;

class LinkedLists {
  public static void main(String[] args){


    LinkedList<String> linkList = new LinkedList<>();
    linkList.add("a value");
    linkList.add("b value");
    linkList.add("c value");

    linkList.addFirst("z value");
    linkList.addLast("d value");
    System.out.print("linkList after adding first and last: ");
    System.out.println(linkList);

    linkList.removeFirst();
    linkList.removeLast();
    System.out.print("linkList after removing first and last: ");
    System.out.println(linkList);

    System.out.print("using getFirst() : ");
    System.out.println(linkList.getFirst());
    
    System.out.print("using getLast() : ");
    System.out.println(linkList.getLast());
  }
}

/*
Common Errors:

*/

/*
Practice:

*/
```
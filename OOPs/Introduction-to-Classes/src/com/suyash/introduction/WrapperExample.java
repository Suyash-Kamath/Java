package com.suyash.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
        //    Integer num = new Integer(45);
//        Integer num = 45; // shortcut , created as an object

  /*

  Wrapper Class in Java
A wrapper class is a class that wraps (or encapsulates) a primitive data type into an object.
It allows primitive types (like int, char, boolean, etc.) to be used as objects, providing additional
functionality like conversion between types, utilities for manipulation, and the ability to work with
Java collections (like ArrayList, which only store objects).

*/

//        System.out.println(num.toString());

//        int aa = 10;
//
//
//        int b=20;
//
//        swap(aa,b);

        // There is no pass by reference in Java , everything is Pass by Value, when you pass objects, the reference's value is passed
        // So here comes saviour wrapper class

/*

1. Pass by Reference
Definition: In true pass by reference (used in languages like C++ when you use pointers or references),
the actual memory address of a variable is passed to the function.
The function can directly manipulate the original variable or object because it has access to
its memory location.


2. Pass by Reference's Value (Java Style)
Definition: In pass by reference's value (what Java does), a copy of the reference (the memory address)
is passed.
However, the actual object content can be modified, but reassigning the reference won't affect the
original reference.



*/
    Integer a =10;
    Integer b = 20;

    swap(a,b);
        System.out.println(a+" "+b);
    //This will be the pass by reference value;



        // lastly not swapped as Integer class is final class

        // final is keyword where you can prevent content from being modified or constants

        final int BONUS = 100;
        // if final keyword , make sure all capital

//        BONUS =3; error

       final A suyash = new A("Suyash Kamath");
        suyash.name = "other name";
        // when a non primitive is final , you cannot reassign it
//        suyash = new A("new object); // cannot do this
    }


   static void swap(Integer a,Integer b){
        Integer temp =a;
        a=b;
        b=temp;
    }



}

class  A{

//    final int num;
    // always initialise whenever it is declared so as to not able to modify

    /*
    1. Final on Primitive Variable
When you declare a primitive variable as final, it means the value of that variable
cannot be changed once it is assigned. The final keyword makes the variable constant.

2. Final on Reference Variable (Object)
When you declare a reference variable (i.e., a variable that holds a reference to an object) as
final, it means the reference (the memory address where the object is stored) cannot be changed.
However, the contents or the state of the object that the reference points to can still be modified
if the object itself is mutable.

    * */

    final int num = 10;
    String name ;

    public A(String name){
        this.name = name;
    }

}


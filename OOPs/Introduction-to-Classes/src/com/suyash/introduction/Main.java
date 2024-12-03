//package com.suyash.introduction;
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//
//        // Store 5 roll numbers
//        int[] numbers = new int[5];
//
//        // Store 5 names
//        String[] names = new String[5];
//
//        // Data of 5 students: {roll number, name, marks}
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];
//
//        // Array of 5 Student objects
//        Student[] students = new Student[5];
//
//        // Uncomment the line below to see the default value (null) for uninitialized objects
//        // System.out.println(Arrays.toString(students));
//
//        // Creating a Student object
////        Student suyash = new Student();
//        // Constructor basically defines what happens when your object will be created , it is used to instantiate a class or create  an object
//        // It is a function that runs when you create a object and it allocates some variables
//        // Assigning values to the Student object
//        Student suyash = new Student(44,"Suyash",88.83f);
////        suyash.name = "23";  // Keeping your original value "23"
////        suyash.rno = 44;
////        suyash.marks = 88.83f;
//
//        // Printing the details of the Student object
//        System.out.println(suyash.name);  // Prints "23"
//        System.out.println(suyash.rno);   // Prints "44"
//        System.out.println(suyash.marks); // Prints "88.83"
//
//        // Prints the memory location or default toString result
////        System.out.println(suyash); returns the address of an object
//        //Instead, it prints a string like Student@1a2b3c4d, representing the object's memory location.
//
//        // Java is static-typed language so you cannot do suyash.salary
//
////        Student krishna = new Student();
//
//        suyash.greeting();
//
//        Student krishna = new Student(1,"krishna",95.80f);
//        krishna.changeName("kamath");
//        krishna.greeting();
//
//
//    }
//}
//
//// Class representing a single Student
//class Student {
//    int rno;
//    String name;
//    float marks=90;
//
//   Student(int rno,String name,float marks){
//       this.rno = rno;
//       this.name=name;
//       this.marks=marks;
//   }
//   // this keyword is a placeholder , in simple terms
//   // return type of constructor is class,
//    // It will create object of Student class,it is going to return  class,
//    // Although constructors do not have an explicit return type, they implicitly return the current instance of the class being created (the object itself).
//    // Constructor is called and it implicitly returns the object reference
//
//    Student(){
//        this.rno = 2;
//        this.name="name";
//        this.marks=9.8f;
//    }
//    void greeting(){
//        System.out.println("Hello my name is "+ this.name);
//    }
//
//    void changeName(String newName){
//       name = newName;
//    }
//}



/*

class Student {
    int rollNumber;  // instance variable
    String name;     // instance variable
    float marks;     // instance variable

    // Constructor with same parameter and instance variable names, but no 'this' keyword
    Student(int rno, String name, float marks) {
        rollNumber = rno;  // Correctly assigns the parameter value to the instance variable
        name = name;       // Assigns parameter to itself, not to the instance variable
        marks = marks;     // Assigns parameter to itself, not to the instance variable
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Student with specific values
        Student student = new Student(1, "Suyash", 88.5f);
        System.out.println(student.rollNumber);  // Prints 0
        System.out.println(student.name);        // Prints null
        System.out.println(student.marks);       // Prints 0.0
    }
}

Yes, using the 'this' keyword is considered good practice in Java, especially in certain scenarios.
Here’s why:

1 and only. Disambiguation Between Instance Variables and Local Variables
*/
package com.suyash.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Store 5 roll numbers
        int[] numbers = new int[5];

        // Store 5 names
        String[] names = new String[5];

        // Data of 5 students: {roll number, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // Array of 5 Student objects
        Student[] students = new Student[5];

        // Uncomment the line below to see the default value (null) for uninitialized objects
        // System.out.println(Arrays.toString(students));

        // Creating a Student object using parameterized constructor
        Student suyash = new Student(44, "Suyash", 88.83f);

        // Printing the details of the Student object
        System.out.println(suyash.name);  // Prints "Suyash"
        System.out.println(suyash.rno);   // Prints "44"
        System.out.println(suyash.marks); // Prints "88.83"

        // Calling the greeting method on the Student object
        suyash.greeting();

        // Creating another Student object using parameterized constructor
        Student krishna = new Student(1, "krishna", 95.80f);
        // Changing name using the changeName method
        krishna.changeName("kamath");
        // Calling the greeting method on the new Student object
        krishna.greeting();

        // Add this portion below:

        // Creating an array of students using parameterized constructor
//        students[0] = new Student(1, "Alice", 92.5f);
//        students[1] = new Student(2, "Bob", 85.0f);
//        students[2] = new Student(3, "Charlie", 88.0f);
//        students[3] = new Student(4, "David", 95.5f);
//        students[4] = new Student(5, "Eva", 91.0f);
//
//        // Displaying the details of all the students in the array
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("Student " + (i + 1) + ":");
//            System.out.println("Roll Number: " + students[i].rno);
//            System.out.println("Name: " + students[i].name);
//            System.out.println("Marks: " + students[i].marks);
//            System.out.println(); // Adding a blank line for better readability
//        }

    Student random = new Student(suyash)  ;
        System.out.println();
        System.out.println(random.name);

        Student random2 = new Student()  ;
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "one something";
        System.out.println(two.name);
    }
}

// Class representing a single Student
class Student {
    int rno;
    String name;
    float marks = 90;  // Default value for marks

    // Parameterized constructor with the same parameter names as instance variables
    Student(int rno, String name, float marks) {
        this.rno = rno;      // Assigning the parameter rno to the instance variable rno using 'this'
        this.name = name;    // Assigning the parameter name to the instance variable name using 'this'
        this.marks = marks;  // Assigning the parameter marks to the instance variable marks using 'this'
    }

    // Default constructor with predefined values
    Student() {
//        this.rno = 2;
//        this.name = "name";
//        this.marks = 9.8f;

//        commenting this to show you  using this keyword you can call a constructor from another constructor
   //Calling Another Constructor (Constructor Chaining): this can be used to call another constructor in the same class. This is called constructor overloading or constructor chaining.
            this(13,"Default person",100f); // this refers to the constructor with these parameters
  // internally : new Student(13,"Default person",100f)
    /*

    How this() Works Here:
this() in Constructor Chaining:

In the default constructor (Student()), the this(0, "Unknown", 0.0f) is calling another constructor within the same class.
This is not directly referring to the current object like in this.roll but instead calling another constructor using this.
Behind the Scenes:

When you call Student() to create an object (Student obj = new Student();), it triggers the default constructor.
The this(0, "Unknown", 0.0f) line redirects to the parameterized constructor (Student(int roll, String name, float marks)).
That constructor initializes the instance variables roll, name, and marks with the provided values (0, "Unknown", 0.0f).


Analogy to Understand:
Think of this() as asking the current object to initialize itself differently by invoking another constructor.
*/
    }

    /*

       Student(int rno, String name, float marks) {
       rollNumber = rno;  // Correctly assigns the parameter value to the instance variable
        name = name;              // Correctly assigns the parameter value to the instance variable
        marks = marks;
        // Correctly assigns the parameter value to the instance variable

    }
    Student(){
        rollNumber = 13;
        name = "Suyash";
        marks = 90.0f;
    }

    Constructor Overloading in Java
Constructor overloading is a concept in Java where you can define multiple constructors within the same class,
each with a different parameter list. This allows you to create objects of a class in different ways,
depending on the parameters passed when an object is instantiated.


}

    */

    // Method to greet the student
    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }

    // Method to change the student's name
    void changeName(String newName) {
        this.name = newName;  // Using 'this' to refer to the instance variable name
    }

    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;}
    // using this keyword you can call a constructor from another constructor
}

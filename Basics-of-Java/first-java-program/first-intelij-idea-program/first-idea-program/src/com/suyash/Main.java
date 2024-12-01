package com.suyash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        // System is a class which contains a variable called out  , out is a type of PrintStream,
        // PrintStream basically adds the functionality to another output stream, namely the ability
        // to print representations of various data values conveniently
        // for e.g , here I am saying printStream has object , printStream has something called println
        // again ...System has a variable called out which is a type of PrintStream, and this out has a method
        // called println, since out is a type of PrintStream , printLn is also in PrintStream, out is like a ref variable
        // to printStream . By Default value ,the  standard output stream is commandline, means laptop,
        // you can also change this to a file
//        System.out.print("my Name is Lakhan");
//        System.out.println("Kyu bey, hila daala naa");
//        System.out.println(321);
        System.out.println("Hi Guys , Standard output string"); // in the default standard output stream print something
        Scanner input = new Scanner(System.in); // System.in means standard input stream (keyboard)
        // every class in Java extends  the Object class

        System.out.println(input.nextInt());
        System.out.println(input.next());
        System.out.println(input.nextLine());
    }
}

// package , it is a folder in which your java file lies ,
// sometimes we need to provide some sort of rules like , for e.g This function can only be accessed to files
// that are in this named package . This file should be accessible to all the other files in the suyash package,
// think it as a custom header file (e.g c++) , you can use repeatedly the classes, think it as a namespace

// like all the files in rahul package should not be accessed in Suyash Package , for e.g

/*

Summary of package com.suyash:
Purpose:
Organizes related classes and avoids naming conflicts.

Structure:
Packages correspond to a directory structure (e.g., com/suyash/Main.java).

Declaration:
The package statement must be the first line in the Java file (e.g., package com.suyash;).

Accessing Classes:
Other classes can access it by using import com.suyash.ClassName.

Environment:
Helps Java find classes by matching the package to the file system.


*/
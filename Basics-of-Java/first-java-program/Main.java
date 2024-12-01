public class Main {

    public static void main(String[] args) {
        System.out.println("Hi Guys my name is ...");
        System.out.println(args[1]);
    }
}

// Every file that has extension with ".java" is a Class
// Everything you gonna write is in classes , Class is a name group of property and functions
// Main.java means file should contain Main class , Every code will be in this class
// static is a keyword which is used if I want to invoke without creating an object
// String[] args ...commandline arguments..collection of strings

// How computer knows what is javac  => as it is a compiler , but where computer can find 
// all these commands are executable files that are located in your computer somewhere

// where javac
// ls /usr/bin | grep javac
// open /usr/bin
// echo $PATH


// if you want to run javac command , it is simply doing the double click on the file , we can also write 
// the entire path  /usr/bin/javac ,  here comes Environment variables ,  list of folder addresses in which it will 
// check if command is available (executables available ?)


/*
 

Java Files and Classes:
Every Java file has a .java extension and must contain at least one class. 
The class name should match the file name if it’s a public class.
A class is a container that holds properties (variables) and methods (functions). 
In Java, all code must reside inside a class, as Java is fully object-oriented.

Purpose of the Main Class:
The Main class is typically used as the entry point of a Java program. 
When you create a file named Main.java, it should contain the Main class because the 
JVM looks for a class with a main method to start executing the program.

static Keyword Usage:
The static keyword allows methods or variables to be accessed without creating an object of the class. 
In the context of the main method, it lets the JVM run the program without needing to instantiate the 
class first.

Command-Line Arguments (String[] args):
Command-line arguments are passed to the program when it is executed. They are stored as an array of 
strings (String[] args) and allow dynamic input, making the program flexible. Each argument is accessible 
by its position in the array.

How the Computer Recognizes javac:
javac is the Java compiler that converts Java source code into bytecode. It is an executable file located 
in specific system directories. The computer finds it because its location is listed in an environment 
variable called PATH.

Environment Variables and the PATH:
Environment variables, like PATH, are lists of directories where the system searches for executable files. 
When you type a command like javac, the system checks each directory in the PATH variable to find the 
corresponding executable.

Why Use PATH Instead of Full Path?:
Without PATH, you would have to type the full path to javac each time. By adding it to the PATH variable, 
you can simply use javac as a shortcut, making it more convenient to compile Java programs.

Summary:
Java programs are structured around classes, with the Main class typically serving as the entry point. 
The static keyword enables execution without creating objects. Command-line arguments provide flexibility 
for dynamic input, and the system recognizes the javac command through environment variables like PATH, 
ensuring easy access to executables.

 */
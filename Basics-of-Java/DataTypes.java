// public class DataTypes {
//     public static void main(String[] args) {
//         // Primitive data types
        
//         // Integer types
//         byte b = 10;            // Byte type (8 bits)
//         short s = 10000;        // Short type (16 bits)
//         int num = 100000;       // Integer type (32 bits)
//         long l = 1000000000L;   // Long type (64 bits)

//         // Floating-point types
//         float f = 3.14f;        // Float type (32 bits)
//         double price = 19.99;   // Double type (64 bits)
        
//         // Character type
//         char grade = 'A';       // Char type (16 bits, represents a single character)

//         // Boolean type
//         boolean isJavaFun = true; // Boolean type (true/false)
        
//         // Reference data types
        
//         // String type (Reference data type, not primitive)
//         String message = "Hello, Java!";  // String type (A sequence of characters)

//         // Array (Reference data type)
//         int[] numbers = {1, 2, 3, 4, 5};  // Integer array

//         // Printing the values
//         System.out.println("Byte: " + b);
//         System.out.println("Short: " + s);
//         System.out.println("Integer: " + num);
//         System.out.println("Long: " + l);
//         System.out.println("Float: " + f);
//         System.out.println("Double: " + price);
//         System.out.println("Character: " + grade);
//         System.out.println("Boolean: " + isJavaFun);
//         System.out.println("String: " + message);
        
//         // Printing array values
//         System.out.print("Array: ");
//         for (int n : numbers) {
//             System.out.print(n + " ");
//         }
//     }
// }

public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types
        
        // Integer types
        byte b = 10;            // Byte type (8 bits)
        short s = 10000;        // Short type (16 bits)
        int num = 100000;       // Integer type (32 bits)
        long l = 1000000000L;   // Long type (64 bits)

        // Floating-point types
        float f = 3.14f;        // Float type (32 bits)
        double price = 19.99;   // Double type (64 bits)
        
        // Character type
        char grade = 'A';       // Char type (16 bits, represents a single character)

        // Boolean type
        boolean isJavaFun = true; // Boolean type (true/false)
        
        // Reference data types
        
        // String type (Reference data type, not primitive)
        String message = "Hello, Java!";  // String type (A sequence of characters)

        // Array (Reference data type)
        int[] numbers = {1, 2, 3, 4, 5};  // Integer array

        // Wrapper Classes
        Byte byteObj = b;              // Wrapper class for byte
        Short shortObj = s;            // Wrapper class for short
        Integer intObj = num;          // Wrapper class for int
        Long longObj = l;              // Wrapper class for long
        Float floatObj = f;            // Wrapper class for float
        Double doubleObj = price;      // Wrapper class for double
        Character charObj = grade;     // Wrapper class for char
        Boolean booleanObj = isJavaFun;// Wrapper class for boolean

        // Printing the values
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Integer: " + num);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + price);
        System.out.println("Character: " + grade);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("String: " + message);
        
        // Printing array values
        System.out.print("Array: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Printing Wrapper Class Values
        System.out.println("Byte Object: " + byteObj);
        System.out.println("Short Object: " + shortObj);
        System.out.println("Integer Object: " + intObj);
        System.out.println("Long Object: " + longObj);
        System.out.println("Float Object: " + floatObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + booleanObj);
    }
}


/*
 
    Wrapper class is used if you want an additional functionalities to Primitives
 */
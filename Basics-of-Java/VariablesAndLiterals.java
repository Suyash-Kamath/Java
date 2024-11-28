public class VariablesAndLiterals {
    public static void main(String[] args) {
        // Primitive Data Types with Literals
        
        // Integer Literals
        int x = 5;            // Variable 'x' assigned integer literal 5
        int num = 585;        // Integer literal 585
        int num2 = 0b101;     // Binary literal (0b prefix for binary, equals 5 in decimal)
        int num3 = 0x7E;      // Hexadecimal literal (0x prefix for hex, equals 126 in decimal)
        int num4 = 10_00_00_000; // Underscore literal for better readability (equals 1000000000)

        // Floating-point Literals
        double number = 12e10;  // Scientific notation literal (12e10 means 12 * 10^10)

        // String Literal
        String greeting = "Hello, World!"; // String variable with string literal "Hello, World!"

        // Boolean Literal
        boolean isJavaFun = true;  // Boolean literal (true)

        // Char Literal
        char grade = 'A';      // Character literal 'A'

        // Output the values of the variables and literals
        System.out.println("Integer x: " + x);          // Output integer literal 5
        System.out.println("String greeting: " + greeting); // Output string literal
        System.out.println("Integer num: " + num);          // Output integer literal 585
        System.out.println("Binary num2 (binary 101): " + num2); // Output binary literal 0b101 (equals 5)
        System.out.println("Hexadecimal num3 (hex 0x7E): " + num3); // Output hex literal 0x7E (equals 126)
        System.out.println("Number with underscores num4: " + num4); // Output number 10_00_00_000
        System.out.println("Floating-point number: " + number); // Output floating-point literal 12e10
        System.out.println("Boolean value isJavaFun: " + isJavaFun); // Output boolean literal true
        System.out.println("Character grade: " + grade);   // Output character literal 'A'

        // Output floating-point value in scientific notation
        System.out.println("Scientific notation number: " + number); // Output 12e10 as 120000000000.0
    }
}

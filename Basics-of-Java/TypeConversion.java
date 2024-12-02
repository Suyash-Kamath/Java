public class TypeConversion {
    public static void main(String[] args) {
        
        // Automatic Type Conversion (Widening)
        int i = 10;          // int variable
        double d = i;        // int to double (automatic widening)
        System.out.println("Automatic Conversion: " + d);  // Output: 10.0
        
        // Manual Type Conversion (Narrowing)
        double pi = 3.14159; // double variable
        int integerPi = (int) pi;  // double to int (manual narrowing)
        System.out.println("Manual Conversion: " + integerPi);  // Output: 3
        
        // Example of Adding Two ints and Storing in a long
        int a = Integer.MAX_VALUE;  // Max value of int: 2147483647
        int b = 1;                  // Add 1 to Integer.MAX_VALUE
        
        // Adding two int values results in int, but we assign the result to a long
        long result = (long) a + b;  // Automatic promotion to long when assigned to long
        System.out.println("Addition of two int values stored in long: " + result);  // Output: 2147483648
        
        // Adding byte and short (automatic conversion to int)
        byte x = 10;           // byte value
        short y = 20;          // short value
        
        // When adding byte and short, both are automatically promoted to int
        // The result is stored in an int variable
        int sum = x + y;       // Result is of type int (automatic promotion)
        
        System.out.println("Sum of byte and short (stored in int): " + sum);  // Output: 30
        
        // In this case, x and y are promoted to int before the addition happens, 
        // and the result is stored in the int variable `sum`.
    }
}

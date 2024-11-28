public class TypeConversion {
    public static void main(String[] args) {
        
        // Automatic Type Conversion (Widening)
        int i = 10;          // int variable
        double d = i;        // int to double (automatic widening)
        System.out.println("Automatic Conversion: " + d);
        
        // Manual Type Conversion (Narrowing)
        double pi = 3.14159; // double variable
        int integerPi = (int) pi;  // double to int (manual narrowing)
        System.out.println("Manual Conversion: " + integerPi);
    }
}

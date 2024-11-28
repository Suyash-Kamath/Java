public class BitwiseOperators {
    public static void main(String[] args) {
        // Define two integer variables for bitwise operations
        int a = 5;    // Binary: 0101
        int b = 3;    // Binary: 0011

        // AND Operator (&)
        // 0101 & 0011 = 0001
        System.out.println("a & b = " + (a & b)); // Result: 1

        // OR Operator (|) 
        // 0101 | 0011 = 0111
        System.out.println("a | b = " + (a | b)); // Result: 7

        // XOR Operator (^)
        // 0101 ^ 0011 = 0110
        System.out.println("a ^ b = " + (a ^ b)); // Result: 6

        // Complement Operator (~)
        // ~0101 = 1010 (in two's complement representation)
        System.out.println("~a = " + (~a));       // Result: -6 (because 0101 is 5, and its complement is -6 in 2's complement)

        // Left Shift Operator (<<)
        // 0101 << 1 = 1010
        System.out.println("a << 1 = " + (a << 1)); // Result: 10 (left shift by 1 position)

        // Right Shift Operator (>>)
        // 0101 >> 1 = 0010
        System.out.println("a >> 1 = " + (a >> 1)); // Result: 2 (right shift by 1 position)

        // Unsigned Right Shift Operator (>>>)
        // 0101 >>> 1 = 0010
        System.out.println("a >>> 1 = " + (a >>> 1)); // Result: 2 (unsigned right shift by 1 position)

        // Another Example with Negative Numbers
        int negative = -5;  // In binary (Two's complement): 11111111111111111111111111111011
        System.out.println("~(-5) = " + (~negative)); // ~(-5) should give 4, as the bitwise NOT inverts all bits of -5
        System.out.println("(-5) >> 1 = " + (negative >> 1)); // Right shift of negative value: -5 >> 1 = -3
        System.out.println("(-5) >>> 1 = " + (negative >>> 1)); // Unsigned right shift of negative value: -5 >>> 1 = 2147483643
    }
}

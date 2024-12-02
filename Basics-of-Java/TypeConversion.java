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


/*

In Java, type promotion occurs when an operation involves different data types, and Java automatically converts one type to a higher precision type to ensure the operation is valid. Here are the key rules for type promotion in expressions:

### 1. **Promotion of smaller types to larger types**:
   - Java promotes smaller primitive types to larger primitive types when they are involved in arithmetic operations.
   - **Byte** and **short** are promoted to **int** when used in expressions.
   - **char** is promoted to **int** for arithmetic operations.
   - **int** is promoted to **long**, **float**, or **double** depending on the other operand types in the expression.

### 2. **Promotion to `int`**:
   - When performing arithmetic operations on **byte**, **short**, or **char**, Java promotes them to **int**. For example:
     ```java
     byte b = 10;
     short s = 20;
     char c = 'A'; // 'A' is treated as an int (65 in ASCII)
     int result = b + s + c; // all promoted to int before the operation
     ```

### 3. **Promotion to `long`**:
   - If one of the operands is **long**, the result of the expression is promoted to **long**.
     ```java
     int a = 10;
     long b = 20L;
     long result = a + b; // a is promoted to long before addition
     ```

### 4. **Promotion to `float`**:
   - If either operand is a **float**, the result is promoted to **float**.
   - **int** or **long** values are promoted to **float** when operated with **float**.
     ```java
     int a = 10;
     float b = 20.5f;
     float result = a + b; // a is promoted to float before addition
     ```

### 5. **Promotion to `double`**:
   - If one of the operands is a **double**, the result of the expression is promoted to **double**.
   - Any operation involving **float** and **double** results in a **double**.
     ```java
     int a = 10;
     double b = 20.5;
     double result = a + b; // a is promoted to double before addition
     ```

### 6. **Order of Promotions**:
   - **`byte`, `short`, `char` → `int`** (first promotion step)
   - **`int` → `long`, `float`, or `double`** depending on the other operand type.
   - If **both operands are of the same type**, no promotion is required.
   - If **different types** are involved, Java promotes to the type with higher precision.
     - **`int` → `long` → `float` → `double`** (order of promotion)

### 7. **Mixed Expressions**:
   - When mixing types like **int** and **float**, the **int** is promoted to **float** (since **float** has a lower precision than **double** but higher than **int**).
     ```java
     int a = 5;
     float b = 3.5f;
     float result = a + b; // a is promoted to float
     ```

### 8. **Narrowing Conversions (Explicit Cast)**:
   - When promoting types, Java automatically performs widening conversions (e.g., from `int` to `double`), but narrowing conversions (e.g., `double` to `int`) require an explicit cast.
     ```java
     double d = 10.5;
     int i = (int) d; // Explicit cast required for narrowing conversion
     ```

### 9. **Example of Type Promotion**:
   ```java
   byte b1 = 10;
   short s1 = 20;
   int result = b1 + s1; // byte and short are promoted to int before addition
   ```

### 10. **Promotion in Logical Operations**:
   - Java does not promote operands in logical operations like **&&** or **||**. For these operations, both operands are evaluated based on their types, and no automatic promotion occurs.

### Summary of Type Promotion in Expressions:
- **byte, short, char** → promoted to **int**.
- **int** → promoted to **long**, **float**, or **double** depending on the operand.
- **long** → promoted to **float** or **double**.
- **float** → promoted to **double**.

These rules ensure that operations with different primitive types are handled in a way that preserves accuracy, and that higher precision types (like **double**) are preferred over lower precision types (like **int**) when needed.

*/


public class Main {
    public static void main(String[] args) {
               byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}


// ultimately output  will be string in the above program In Java, string concatenation (using +) converts all the operands involved into their string representations before concatenating them. So, the final result after the concatenation will be a single string that combines the string representations of the individual results.

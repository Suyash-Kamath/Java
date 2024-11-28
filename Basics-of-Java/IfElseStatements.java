public class IfElseStatements {
    public static void main(String[] args) {
        int age = 20;
        
        // Simple if-else
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        
        // if-else-if ladder
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age == 18) {
            System.out.println("You just became an adult.");
        } else {
            System.out.println("You are an adult.");
        }
    }
}

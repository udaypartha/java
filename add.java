package java;
import java.util.Scanner;
public class add {
    public static void main(String args []) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        // Prompt user for second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate sum
        int mul = num1 * num2;
        
        // Display result
        System.out.println("The mul is: " + mul);
        
        // Close the scanner
        scanner.close();
    }
}




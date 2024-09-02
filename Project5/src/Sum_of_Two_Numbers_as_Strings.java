import java.util.Scanner;

public class Sum_of_Two_Numbers_as_Strings{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        // Use nextInt() to read an integer value
        int a = scanner.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        // Use nextInt() to read an integer value
        int b = scanner.nextInt();

        // Calculate the sum of the two numbers
        int c = a + b;

        // Output the result
        System.out.println("The sum is: " + c);

        // Close the scanner
        scanner.close();
    }
}
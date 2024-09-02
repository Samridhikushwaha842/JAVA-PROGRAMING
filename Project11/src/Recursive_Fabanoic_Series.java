import java.util.Scanner;
public class Recursive_Fabanoic_Series{
    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: fibonacci(0) = 0 and fibonacci(1) = 1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer n: ");
        int number = scanner.nextInt();

        // Ensure the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calculate Fibonacci number and print result
            int result = fibonacci(number);
            System.out.println("The " + number + "th Fibonacci number is " + result + ".");
        }
        scanner.close();
    }
}

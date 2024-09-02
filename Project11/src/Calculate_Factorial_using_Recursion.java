import java.util.Scanner;
public class Calculate_Factorial_using_Recursion{
        // Recursive method to calculate factorial
        public static long factorial(int n) {
            // Base case: factorial of 0 is 1
            if (n == 0) {
                return 1;
            }
            // Recursive case: n * factorial(n - 1)
            return n * factorial(n - 1);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt user for input
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            // Ensure the input is a positive integer
            if (number < 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                // Calculate factorial and print result
                long result = factorial(number);
                System.out.println("The factorial of " + number + " is " + result + ".");
            }

            scanner.close();
        }
    }



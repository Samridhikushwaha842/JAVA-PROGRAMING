import java.util.Scanner;

public class Calculate_the_Square_Root_of_a_Number{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate the square root of the number
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + " is: " + squareRoot);
        
        scanner.close();
    }
}

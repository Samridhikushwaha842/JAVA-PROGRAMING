import java.util.Scanner;
public class Java_Booleans{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        // Read the number entered by the user
        double number = scanner.nextDouble();

        // Check if the number is greater than 100
        boolean isGreaterThan100 = number > 100;


        if (isGreaterThan100) {
            System.out.println(number + " is greater than 100.");
        } else {
            System.out.println(number + " is not greater than 100.");
        }
        scanner.close();
    }
}

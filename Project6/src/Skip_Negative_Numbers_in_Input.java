import java.util.Scanner;
public class Skip_Negative_Numbers_in_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to add to the sum. Negative numbers will be skipped. Enter 0 to exit.");

        // Start a while loop for continuous input
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue; // Skip negative numbers
            }

            sum += number;
        }
        System.out.println("The sum of positive numbers is: " + sum);
        scanner.close();
    }
}

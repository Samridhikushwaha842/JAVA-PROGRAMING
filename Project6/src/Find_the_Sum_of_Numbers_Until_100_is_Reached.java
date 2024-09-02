import java.util.Scanner;

public class Find_the_Sum_of_Numbers_Until_100_is_Reached{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter numbers to add to the sum. The program will stop when the sum reaches or exceeds 100.");

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            sum += number;

            if (sum >= 100) {
                break;
            }
        }
        System.out.println("The final sum is: " + sum);
        scanner.close();
    }
}

import java.util.Scanner;
public class Find_the_First_Prime_Number_in_a_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable to hold the first prime number found
        int firstPrime = -1;

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check if the number is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                firstPrime = num;
                break;
            }
        }
        if (firstPrime != -1) {
            System.out.println("The first prime number in the range 1 to 100 is: " + firstPrime);
        } else {
            System.out.println("No prime number found in the range.");
        }
        scanner.close();
    }
}

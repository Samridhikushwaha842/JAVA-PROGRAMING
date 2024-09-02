import java.util.Scanner;
public class Find_First_Divisible_Number{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Variable to hold the first divisible number
        int firstDivisibleNumber = -1;

        // Iterate over numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 7 == 0) {
                firstDivisibleNumber = i;
                break;
            }
        }
        if (firstDivisibleNumber != -1) {
            System.out.println("The first number divisible by both 3 and 7 is: " + firstDivisibleNumber);
        } else {
            System.out.println("No number divisible by both 3 and 7 found in the range.");
        }
        scanner.close();
    }
}

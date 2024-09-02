import java.util.Scanner;

public class Skip_Multiples_of_Five{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 50; i++) {
            // Check if the number is a multiple of 5
            if (i % 5 == 0) {
                continue; // Skip this iteration if the number is a multiple of 5
            }
            System.out.println(i);
        }
        scanner.close();
    }
}

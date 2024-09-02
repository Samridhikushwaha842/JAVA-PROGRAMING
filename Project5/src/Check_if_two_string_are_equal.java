import java.util.Scanner;

public class Check_if_two_string_are_equal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the two strings are equal
        boolean areEqual = str1.equals(str2);

        // Print the result
        if (areEqual) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        scanner.close();
    }
}

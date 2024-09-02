import java.util.Scanner;

public class CheckifStringisAPallindrome{
    public static void main(String args[]){

                // Create a Scanner object to read input
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a string
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                // Normalize the string: convert to lowercase and remove spaces
                String normalizedString = input.toLowerCase().replaceAll("\\s", "");

                // Reverse the normalized string
                String reversedString = new StringBuilder(normalizedString).reverse().toString();

                // Check if the normalized string is equal to the reversed string
                if (normalizedString.equals(reversedString)) {
                    System.out.println("The string is a palindrome.");
                } else {
                    System.out.println("The string is not a palindrome.");
                }
                scanner.close();
            }
        }
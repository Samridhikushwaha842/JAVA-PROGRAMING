import java.util.Scanner;
public class Search_for_a_Specific_Character_in_a_String{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.nextLine().charAt(0);

        scanner.close();

        for (int i = 0; i < inputString.length(); i++) {

            if (inputString.charAt(i) == searchChar) {

                System.out.println("Character '" + searchChar + "' found at index: " + i);
                break;
            }
        }
        if (inputString.indexOf(searchChar) == -1) {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }
    }
}
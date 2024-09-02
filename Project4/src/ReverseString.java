import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args){
        // Create a Scanner object for reading input
        Scanner object = new Scanner(System.in);
        // user enter a string
        System.out.print("Enter a string:");
        String input = object.nextLine();
        // Create a StringBuilder object and initialize it with the input string

        StringBuilder stringBuilder = new StringBuilder(input);

        // reverse the string
        String reversed = stringBuilder.reverse().toString();

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);

        // Close the scanner
        object.close();
    }
}
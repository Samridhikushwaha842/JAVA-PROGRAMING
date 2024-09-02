import java.util.Scanner;

public class FindTheLongestInTheSentences{
    public static void main(String args[]){
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Initialize variables to keep track of the longest word
        String longestWord = "";

        // Iterate through the array of words
        for (String word : words) {
            // Update the longest word if the current word is longer
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);

        scanner.close();
    }
}


import java.util.Scanner;

public class ConsonentAndVowels{
    public static void main(String []args){
            Scanner object = new Scanner(System.in);
            System.out.print("Enter a string:");
            String input = object.nextLine();
            // Initialize counters for vowels and consonants
            int vowelCount = 0;
            int consonantCount = 0;
            // Convert the input string to lowercase to make the check case-insensitive
            String lowerCaseInput = input.toLowerCase();
            for (int i=0; i<lowerCaseInput.length(); i++){
                char ch = lowerCaseInput.charAt(i);
                if (Character.isLetter(ch)){
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                        vowelCount++;
                    }else{
                        consonantCount++;
                    }
                }
            }
            System.out.println("number of vowel : " + vowelCount);
            System.out.println("number of consonant : " + consonantCount);

            object.close();

        }
    }

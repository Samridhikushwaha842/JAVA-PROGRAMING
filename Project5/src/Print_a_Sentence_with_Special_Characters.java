import java.util.Scanner;

public class Print_a_Sentence_with_Special_Characters{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sentences");
        String str1 = scanner.nextLine();

        System.out.println("Here is your sentence with special characters:");
        System.out.println("Double quotes: \"This is an example sentence with double quotes.\"");
        System.out.println("New line:\n" + str1);
        System.out.println("Tab:\t" + str1);

        scanner.close();


    }
}

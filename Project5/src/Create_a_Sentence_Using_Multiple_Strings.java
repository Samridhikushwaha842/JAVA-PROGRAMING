import java.util.Scanner;

public class Create_a_Sentence_Using_Multiple_Strings{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your First Sentence:");
        String string1 = scanner.nextLine();

        System.out.print("Enter Your Next Sentence:");
        String string2 = scanner.nextLine();

        System.out.print("Enter your Last Para:");
        String string3 = scanner.nextLine();

        String CompleteSentence = string1 + "" + string2 + "" + string3;

        System.out.print("CompleteSentence" + CompleteSentence);

        scanner.close();

    }
}

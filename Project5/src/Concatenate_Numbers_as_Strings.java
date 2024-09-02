import java.util.Scanner;

public class Concatenate_Numbers_as_Strings{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to concatenate:");
        String num1 = scanner.nextLine();

        System.out.print("Enetr 2nd integer to concatenate:");
        String num2  = scanner.nextLine();

        String num3 = (num1 +  num2);
        System.out.print("num3" + num3);

        scanner.close();

    }
}

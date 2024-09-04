import java.util.Scanner;

public class Scope_Variable_Accesibilty{

    public static int sum(int number1, int number2){
        return  number1 + number2;
    }

    // Multiply
    public static int multiply(int a, int b){
        //result = a* b;
        return a * b;
    }
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int result;

        System.out.println("Enter the number : ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the number : ");
        int number2 = scanner.nextInt();

        System.out.println("Sum Method : " + sum(number1,number2));
        System.out.println("Multiply Method : " + multiply(number1,number2));

    }
}
import java.util.Scanner;

public class Recursive_Sum_of_Digits{
    //Recursive method to Calculate the sumOfDigits:
    public static int sumOfDigits(int n){

        //base case if n = 0 return 0;
        if(n==0){
            return 0;
        }

        //Recursive case :add the last digit to sum of digits
        return n % 10 + sumOfDigits(n /10);
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        //prompt the user for input:
        System.out.print("Enter an integers:");
        int number = scanner.nextInt();

        //call thr recursive method and display result:
        int result =  sumOfDigits(number);
        System.out.println("The sum of the digits is : " +result);
        scanner.close();
    }
}

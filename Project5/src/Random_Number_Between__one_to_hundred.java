import java.util.Scanner;

public class Random_Number_Between__one_to_hundred{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Random number between 1 and 100: " + randomNumber);
        scanner.close();
    }
}

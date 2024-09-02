import java.util.Scanner;

public class Calculate_the_Average_of_Array_Elements_Using_For_Each{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter Elements of an array:");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        //calculate for each loop
        int sum = 0;
        for(int num: array){
            sum = sum + num;
        }
        double average = (double) sum/ size;

        System.out.println("The average if the array Element is:"  + average);
    }
}

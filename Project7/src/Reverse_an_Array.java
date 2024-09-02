import java.util.Scanner;

public class Reverse_an_Array{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size = scanner.nextInt();
        int array[] = new int [size];

        System.out .println("Enter the elements of an array:");

        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        for(int j = 0; j < size / 2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1-j]= temp;
        }
        System.out.println("the reversed array is :");
        for(int k = 0; k < size; k++){
            System.out.print(array[k] + "");
        }
    }
}

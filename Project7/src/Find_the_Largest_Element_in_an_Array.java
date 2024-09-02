import java.util.Scanner;

public class Find_the_Largest_Element_in_an_Array{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int []array = new int[size];
        System.out.println("Enter the elements of the array");

        for(int i = 0; i < 5; i++){
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for(int j = 1; j < size; j++){
            if(array[j]> max){
                max = array[j];
            }
        }
        System.out.println("The largest element in array is:" + max);
    }
}

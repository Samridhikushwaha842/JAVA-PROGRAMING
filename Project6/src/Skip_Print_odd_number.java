import java.util.Scanner;
public class Skip_Print_odd_number{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=50; i++){
            if(i % 2 != 0){
                continue;
            }
//            System.out.println("Skiping odd number to print");
            System.out.println(i);
        }
    }
}

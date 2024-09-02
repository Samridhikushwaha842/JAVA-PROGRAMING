public class PrintNumbersFrom0to10And10to0UsingWhileLoop{
    public static void main(String[] args){
        int number1 = 0;
        System.out.println("The numbers from 0 to 10");
        while(number1 <= 10){
            System.out.println(number1);
            number1++;
        }
        int number2 = 10;
        System.out.println("The number from 10 to 0");
        while(number2 >= 10){
            System.out.println(number2);
            number2--;
        }
    }
}

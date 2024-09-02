public class CalculateProductofNumbersfrom1to5{
    public static void main(String[] args) {
        int product = 1;
        int number = 1;
        while (number <= 5){
            product = product * number;
            number++;
        }
        System.out.println("The product of numbers from 1 to 5 is: " + product);
    }
}

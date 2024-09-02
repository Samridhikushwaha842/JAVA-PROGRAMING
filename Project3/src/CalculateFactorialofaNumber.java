public class CalculateFactorialofaNumber{
    public static void main(String[] args){
        int number = 5;
        int factorial = 1;
        int current = number;

        while(current > 0){
            factorial = factorial * current;
            current--;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

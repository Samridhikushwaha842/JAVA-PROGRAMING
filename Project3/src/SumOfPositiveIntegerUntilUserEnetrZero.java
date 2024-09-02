public class SumOfPositiveIntegerUntilUserEnetrZero{
    public static void main(String[] args){
        int[] inputs = {5, 8, -3, 10, 0};
        int sum = 0;
        int array = 0;
        while (true) {
            int number = inputs[array];
            array++;
            if (number == 0) {
                break;
            } else if (number > 0) {
                sum = sum + number;
            }
        }
        System.out.println("The sum of all positive integers entered is: " + sum);
    }
}

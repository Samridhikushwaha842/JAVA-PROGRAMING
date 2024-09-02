public class ReverseProgram {
    public static void main(String[] args){
        int reversed = 0;
        int number = 1234567;

        while(number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number /= 10;
        }
        System.out.println("Reversed number is:" + reversed);

    }
}

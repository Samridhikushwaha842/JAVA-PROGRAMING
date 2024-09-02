public class OddEvenChecker{
    public static void main(String[] args) {
        // Hard-coded number value for testing
        int number = 15; // You can change this value to test different cases

        // Check if the number is even or odd using the modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is an even integer.");
        } else {
            System.out.println(number + " is an odd integer.");
        }
    }
}

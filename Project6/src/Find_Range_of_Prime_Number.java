public class Find_Range_of_Prime_Number {
    public static void main(String[] args) {
        int rangeStart = 1;
        int rangeEnd = 100;
        boolean isprime = false;

        for (int num = rangeStart; num <= rangeEnd; num++) {
            if (num > 1) {
                isprime = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isprime = false;
                        break;
                    }
                }
                if (isprime) {
                    System.out.println("The first prime number range is:" + num);
                    break;
                }
            }
        }
    }
}

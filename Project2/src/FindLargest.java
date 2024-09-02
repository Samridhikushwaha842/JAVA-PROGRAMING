public class FindLargest {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 25;
        int num3 = 52;
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("1st Number = " + num1 + ",");
        System.out.println("2nd Number = " + num2 + ",");
        System.out.println("3rd Number = " + num3);
        System.out.println("The " + (largest == num1 ? "1st" : largest == num2 ? "2nd" : "3rd") + " Number is the greatest among three.");
    }
}

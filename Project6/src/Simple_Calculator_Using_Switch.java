import java.util.Scanner;
public class Simple_Calculator_Using_Switch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.print("Enter Operator(+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        double result = 0 ;
        //Switch statement

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num1 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! division by zero not allowed:");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator:");
        }
        System.out.println("The result is:" + result);

    }
}
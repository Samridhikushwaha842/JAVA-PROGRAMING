import java.util.Scanner;
public class Calculate_the_arear_of_circule{
        // Method to calculate the area of a circle
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }

        public static void main(String[] args){
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to input the radius
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            // Calculate the area using the calculateArea method
            double area = calculateArea(radius);
            System.out.printf("The area of the circle with radius %.2f is %.2f.%n", radius, area);
            scanner.close();
        }
    }

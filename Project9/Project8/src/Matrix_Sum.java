import java.util.Scanner;
public class Matrix_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a 3x3 matrix
        int[][] matrix = new int[3][3];

        // Input elements for the 3x3 matrix
        System.out.println("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print the sum of each row
        System.out.println("\nSum of each row:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }

        // Calculate and print the sum of each column
        System.out.println("\nSum of each column:");
        for (int j = 0; j < 3; j++) {
            int columnSum = 0;
            for (int i = 0; i < 3; i++) {
                columnSum += matrix[i][j];
            }
            System.out.println("Sum of column " + j + ": " + columnSum);
        }
        scanner.close();
    }
}

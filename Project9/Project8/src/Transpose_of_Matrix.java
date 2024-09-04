import java.util.Scanner;

public class Transpose_of_Matrix{

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize a 3x3 matrix
        int[][] matrix = new int[3][3];
        int[][] transpose = new int[3][3];

        // Input elements for the 3x3 matrix
        System.out.println("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Compute the transpose of the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        // Print the transposed matrix
        System.out.println("\nTranspose of the Matrix:");
        printMatrix(transpose);

        // Close the scanner
        scanner.close();
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

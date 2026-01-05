import java.util.Scanner;

public class Exercice5 {

    public static void rotate90ClockwiseInPlace(int[][] matrix) {
        int n = matrix.length;
        // 1. Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 2. Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading N
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];

            // Reading matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Processing
            rotate90ClockwiseInPlace(matrix);

            // Output
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + (j < n - 1 ? " " : ""));
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}

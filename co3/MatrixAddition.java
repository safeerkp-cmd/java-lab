import java.util.Scanner;

/**
 * Program 2: Matrix Addition (n x n).
 *
 * Demonstrates:
 *  - Reading two 2D integer arrays from user input
 *  - Adding corresponding elements to produce a result matrix
 *  - Printing a 2D array in grid form
 */
public class MatrixAddition {

    /**
     * Reads an n×n matrix from standard input.
     *
     * @param sc  Scanner to read from
     * @param n   dimension of the square matrix
     * @return    the filled 2D array
     */
    static int[][] readMatrix(Scanner sc, int n) {
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt(); // read each element row by row
            }
        }
        return mat;
    }

    /**
     * Prints an n×n matrix row by row.
     *
     * @param mat  the 2D array to print
     * @param n    dimension of the square matrix
     */
    static void printMatrix(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); // newline after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Read the matrix order (n x n) */
        System.out.print("Enter order of matrix (n x n): ");
        int n = sc.nextInt();

        /* Read first matrix */
        System.out.println("Enter elements of first matrix:");
        int[][] a = readMatrix(sc, n);

        /* Read second matrix */
        System.out.println("Enter elements of second matrix:");
        int[][] b = readMatrix(sc, n);

        /* Compute element-wise sum */
        int[][] sum = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        /* Display the resultant matrix */
        System.out.println("Resultant Matrix:");
        printMatrix(sum, n);

        sc.close();
    }
}

import java.util.Scanner;

/**
 * Program 4: Symmetric Matrix Check.
 *
 * A square matrix is symmetric when every element a[i][j] equals a[j][i].
 * In other words, the matrix is equal to its own transpose.
 *
 * Demonstrates:
 *  - Reading a square 2D array from user input
 *  - Comparing element a[i][j] with a[j][i] for all valid positions
 *  - Early exit as soon as a mismatch is found
 */
public class SymmetricMatrixCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Read the matrix dimension */
        System.out.print("Enter order of matrix: ");
        int n = sc.nextInt();

        /* Fill the n×n matrix from user input */
        int[][] a = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        /* Assume the matrix is symmetric until we find a counterexample */
        boolean symmetric = true;

        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    /* Found a pair where a[i][j] ≠ a[j][i] – not symmetric */
                    symmetric = false;
                    break outer; // exit both loops immediately
                }
            }
        }

        /* Report the result */
        if (symmetric) {
            System.out.println("Matrix is Symmetric");
        } else {
            System.out.println("Matrix is not Symmetric");
        }

        sc.close();
    }
}

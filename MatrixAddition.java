// Program to add two matrices of size n x n
// Matrix addition: add corresponding elements of two matrices

import java.util.*;

class MatrixAddition {

    // Method to read elements of a matrix from the user
    static void readArray(int[][] arr, int n, Scanner sc) {
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();  // Read each element row by row
    }

    // Method to print elements of a matrix
    static void printArray(int[][] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");  // Print each element
            System.out.println();  // New line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the matrix
        System.out.print("Enter order of matrix (n x n): ");
        int n = sc.nextInt();

        // Create two input matrices and one result matrix
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] sum  = new int[n][n];

        // Read elements of both matrices
        System.out.println("Enter elements of first matrix:");
        readArray(arr1, n, sc);

        System.out.println("Enter elements of second matrix:");
        readArray(arr2, n, sc);

        // Add corresponding elements of arr1 and arr2
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                sum[i][j] = arr1[i][j] + arr2[i][j];

        // Print the resulting sum matrix
        System.out.println("Resultant Matrix:");
        printArray(sum, n);
    }
}


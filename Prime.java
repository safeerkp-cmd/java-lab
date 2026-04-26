// Program to multiply two matrices of size n x n
// Matrix multiplication: result[i][j] = sum of arr1[i][k] * arr2[k][j] for all k

import java.util.*;

class MatrixMultiply {
    int n;                      // Size of the matrix (n x n)
    int[][] arr1, arr2, arr3;   // arr1 and arr2 are inputs, arr3 is the result

    // Method to read both matrices from the user
    void getData() {
        Scanner sc = new Scanner(System.in);

        // Read the size of the matrices
        System.out.print("Enter order of matrix (n x n): ");
        n = sc.nextInt();

        // Create matrices of size n x n
        arr1 = new int[n][n];
        arr2 = new int[n][n];
        arr3 = new int[n][n];

        // Read elements of first matrix
        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr1[i][j] = sc.nextInt();

        // Read elements of second matrix
        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr2[i][j] = sc.nextInt();
    }

    // Method to multiply arr1 and arr2 and store result in arr3
    void matrixCalc() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr3[i][j] = 0;  // Initialize result cell to 0
                // Multiply row i of arr1 with column j of arr2
                for(int k = 0; k < n; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }

    // Method to print the result matrix
    void printData() {
        System.out.println("Resultant Matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(arr3[i][j] + " ");
            System.out.println();  // New line after each row
        }
    }

    public static void main(String[] args) {
        MatrixMultiply obj = new MatrixMultiply();  // Create object
        obj.getData();      // Read input matrices
        obj.matrixCalc();   // Multiply matrices
        obj.printData();    // Print result
    }
}

// Program to check if a 2D array (matrix) is symmetric
// A matrix is symmetric if it equals its own transpose: a[i][j] == a[j][i] for all i, j

import java.util.*;

class SymmetricArray {
    int[][] a;  // The 2D array (matrix)
    int n;      // Size of the array (n x n)

    // Method to read the array elements from the user
    void read(Scanner sc) {
        System.out.println("Enter order of array: ");
	n = sc.nextInt();
        System.out.println("Enter array Elements: ");
        a = new int[n][n];
        // Read each element row by row
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
    }

    // Method to check if the array is symmetric
    // Symmetric means a[i][j] equals a[j][i] for every position
    boolean check() {
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(a[i][j] != a[j][i])
                    return false;  // Found a mismatch, not symmetric
        return true;  // All elements matched, it is symmetric
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SymmetricArray obj = new SymmetricArray();  // Create object
        obj.read(sc);  // Read the matrix

        // Print result
        if(obj.check())
            System.out.println("Array is Symmetric");
        else
            System.out.println("Array is not Symmetric");
    }	
}

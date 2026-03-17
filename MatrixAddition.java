import java.util.*;

class MatrixAddition {

    static void readArray(int[][] arr, int n, Scanner sc) {
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
    }

    static void printArray(int[][] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix (n x n): ");
        int n = sc.nextInt();

        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] sum  = new int[n][n];

        System.out.println("Enter elements of first matrix:");
        readArray(arr1, n, sc);

        System.out.println("Enter elements of second matrix:");
        readArray(arr2, n, sc);

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                sum[i][j] = arr1[i][j] + arr2[i][j];

        System.out.println("Resultant Matrix:");
        printArray(sum, n);
    }
}


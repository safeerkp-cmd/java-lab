import java.util.*;

class MatrixMultiply {
    int n;
    int[][] arr1, arr2, arr3;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix (n x n): ");
        n = sc.nextInt();

        arr1 = new int[n][n];
        arr2 = new int[n][n];
        arr3 = new int[n][n];

        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr1[i][j] = sc.nextInt();

        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr2[i][j] = sc.nextInt();
    }

    void matrixCalc() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr3[i][j] = 0;
                for(int k = 0; k < n; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }

    void printData() {
        System.out.println("Resultant Matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(arr3[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixMultiply obj = new MatrixMultiply();
        obj.getData();
        obj.matrixCalc();
        obj.printData();
    }
}

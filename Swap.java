// Program to sort an array in ascending order using Java's built-in Arrays.sort()
// Example: [5, 2, 8, 1] → [1, 2, 5, 8]

import java.util.*;

class SortArray {
    int[] arr;  // The array to sort
    int n;      // Number of elements

    // Method to read array elements from the user
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();  // Read each element
    }

    // Method to print the sorted array
    void printData() {
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        SortArray obj = new SortArray();  // Create object
        obj.getData();                    // Read the array

        Arrays.sort(obj.arr);   // Sort array in ascending order using built-in method

        obj.printData();        // Print the sorted array
    }
}

// Program to find all prime numbers in a given array
// A prime number has exactly 2 divisors: 1 and itself

import java.util.*;

class PrimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];  // Create the array

        // Read each element into the array
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Prime numbers:");

        // Check each element in the array
        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;  // Count how many divisors num has

            // Count all divisors of num from 1 to num
            for(int j = 1; j <= num; j++) {
                if(num % j == 0)
                    count++;  // j divides num evenly
            }

            // A prime number has exactly 2 divisors (1 and itself)
            if(count == 2)
                System.out.print(num + " ");
        }
    }
}

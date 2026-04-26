// Program to print Fibonacci series up to a given limit
// Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, ...
// Each number is the sum of the two numbers before it

import java.util.Scanner;

class Fibonacci {

    // Method to print Fibonacci series up to 'limit'
    void series(int limit) {
        int a = 0, b = 1;  // First two numbers of the series

        // Keep printing numbers as long as they are within the limit
        while (a <= limit) {
            System.out.print(a + " ");  // Print current number
            int c = a + b;              // Calculate next number
            a = b;                      // Move forward: a becomes b
            b = c;                      // b becomes the next number
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the upper limit from the user
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        Fibonacci obj = new Fibonacci();  // Create object to call series()
        obj.series(n);                    // Print Fibonacci series up to n
    }
}

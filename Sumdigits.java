// Program to calculate the sum of digits of a number
// Example: 1234 → 1 + 2 + 3 + 4 = 10

import java.util.Scanner;

class SumDigits {

    // Method to calculate and return the sum of digits of n
    int sum(int n) {
        int s = 0;  // Will hold the sum of digits

        // Extract each digit from the end and add it to sum
        while (n != 0) {
            s += n % 10;  // Add the last digit to sum
            n /= 10;      // Remove the last digit
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        SumDigits obj = new SumDigits();  // Create object
        System.out.println("Sum of digits = " + obj.sum(num));
    }
}

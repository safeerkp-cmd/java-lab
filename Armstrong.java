// Program to check if a number is an Armstrong number
// An Armstrong number is a number where the sum of the cubes of its digits equals the number itself
// Example: 153 = 1^3 + 5^3 + 3^3 = 153

import java.util.Scanner;

class Armstrong {

    // Method to check if a number is Armstrong
    boolean check(int n) {
        int temp = n;  // Save original number
        int sum = 0;   // Will hold the sum of cubes of digits

        // Extract each digit and add its cube to sum
        while (temp != 0) {
            int digit = temp % 10;          // Get last digit
            sum += digit * digit * digit;   // Add cube of digit
            temp /= 10;                     // Remove last digit
        }

        // If sum of cubes equals the original number, it is Armstrong
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Armstrong obj = new Armstrong();  // Create object to call check()

        // Print result
        if (obj.check(num))
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}

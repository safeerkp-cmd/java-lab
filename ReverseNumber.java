// Program to reverse a given number
// Example: 1234 reversed is 4321

import java.util.Scanner;

class ReverseNumber {

    // Method to reverse the digits of number n
    int reverse(int n) {
        int rev = 0;  // Will store the reversed number

        // Extract digits from the end one by one and build the reversed number
        while (n != 0) {
            rev = rev * 10 + n % 10;  // Shift rev left and add last digit of n
            n /= 10;                  // Remove the last digit from n
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        ReverseNumber obj = new ReverseNumber();  // Create object
        System.out.println("Reversed number = " + obj.reverse(num));
    }
}

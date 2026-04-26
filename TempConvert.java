// Program to swap two numbers using a temporary variable
// Swapping means exchanging the values of two variables

public class Swap {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;  // Two numbers to swap, and a helper variable

        // Print values before swapping
        System.out.println("Before Swapping:\na = " + a + ", b = " + b);

        // Swap using temporary variable:
        // Step 1: Save value of a in temp
        temp = a;
        // Step 2: Copy value of b into a
        a = b;
        // Step 3: Copy saved value (old a) into b
        b = temp;

        // Print values after swapping
        System.out.println("Afer Swapping:\na = " + a + ", b = " + b);
    }
}

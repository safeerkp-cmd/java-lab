// Program to print all prime numbers from 1 to 20
// A prime number is a number greater than 1 that has no divisors other than 1 and itself
// Examples: 2, 3, 5, 7, 11, 13, ...

public class Prime {

    // Method to check if a number n is prime
    boolean isPrime(int n){
        if(n < 2) return false;  // Numbers less than 2 are not prime

        // Check divisibility from 2 to sqrt(n)
        // If any number divides n evenly, it is not prime
        for(int i = 2; i * i <= n; i++)
            if(n % i == 0) return false;

        return true;  // No divisors found, so it is prime
    }

    public static void main(String[] args){
        Prime p = new Prime();  // Create object to call isPrime()

        // Check each number from 1 to 20 and print if it is prime
        for(int i = 1; i <= 20; i++)
            if(p.isPrime(i))
                System.out.print(i + " ");
    }
}

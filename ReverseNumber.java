import java.util.Scanner;

class ReverseNumber {

    int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        ReverseNumber obj = new ReverseNumber();
        System.out.println("Reversed number = " + obj.reverse(num));
    }
}

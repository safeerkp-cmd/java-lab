import java.util.Scanner;

class SumDigits {

    int sum(int n) {
        int s = 0;

        while (n != 0) {
            s += n % 10;
            n /= 10;
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        SumDigits obj = new SumDigits();
        System.out.println("Sum of digits = " + obj.sum(num));
    }
}

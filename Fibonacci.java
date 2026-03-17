import java.util.Scanner;

class Fibonacci {

    void series(int limit) {
        int a = 0, b = 1;

        while (a <= limit) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        Fibonacci obj = new Fibonacci();
        obj.series(n);
    }
}

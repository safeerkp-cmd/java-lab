import java.util.*;

class PrimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Prime numbers:");

        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;

            for(int j = 1; j <= num; j++) {
                if(num % j == 0)
                    count++;
            }

            if(count == 2)
                System.out.print(num + " ");
        }
    }
}

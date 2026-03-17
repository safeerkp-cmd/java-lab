import java.util.*;

class SortArray {
    int[] arr;
    int n;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    void printData() {
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        SortArray obj = new SortArray();
        obj.getData();

        Arrays.sort(obj.arr);   

        obj.printData();
    }
}

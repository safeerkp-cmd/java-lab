import java.util.*;

class SearchArray {
    int[] a;
    int n;

    void read(Scanner sc) {
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
    }

    int search(int key) {
        for(int i=0;i<n;i++)
            if(a[i] == key)
                return i;   // return index if found
        return -1;          // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchArray obj = new SearchArray();

        obj.read(sc);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int pos = obj.search(key);

        if(pos != -1)
            System.out.println("Element found at index " + (pos+1));
        else
            System.out.println("Element not found");
    }
}

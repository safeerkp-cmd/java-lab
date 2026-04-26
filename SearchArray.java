// Program to search for an element in an array (Linear Search)
// Linear search checks each element one by one until the element is found

import java.util.*;

class SearchArray {
    int[] a;  // Array to search in
    int n;    // Number of elements in the array

    // Method to read array elements from the user
    void read(Scanner sc) {
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();  // Read each element
    }

    // Method to search for 'key' in the array
    // Returns the index if found, -1 if not found
    int search(int key) {
        for(int i = 0; i < n; i++)
            if(a[i] == key)
                return i;   // return index if found
        return -1;          // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchArray obj = new SearchArray();  // Create object

        obj.read(sc);  // Read the array

        // Read the element to search for
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int pos = obj.search(key);  // Search for the element

        // Display result (pos+1 to show 1-based position to user)
        if(pos != -1)
            System.out.println("Element found at index " + (pos + 1));
        else
            System.out.println("Element not found");
    }
}

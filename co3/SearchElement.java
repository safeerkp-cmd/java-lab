import java.util.Scanner;

/**
 * Program 7: Linear Search – find an element in an integer array.
 *
 * Demonstrates:
 *  - Storing integers in an array from user input
 *  - Iterating through the array one element at a time (linear search)
 *  - Reporting the 1-based position if found, or "not found" otherwise
 */
public class SearchElement {

    /**
     * Performs a linear search for {@code key} inside {@code arr}.
     *
     * @param arr  the integer array to search
     * @param n    number of elements in the array
     * @param key  the value to look for
     * @return     0-based index of the first match, or -1 if not found
     */
    static int linearSearch(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i; // found – return the index immediately
            }
        }
        return -1; // element was not found in the array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Read the number of elements */
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        /* Fill the array with user-provided integers */
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        /* Read the search key */
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        /* Run the linear search */
        int pos = linearSearch(a, n, key);

        if (pos != -1) {
            /* Display 1-based position for readability */
            System.out.println("Element found at position " + (pos + 1));
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

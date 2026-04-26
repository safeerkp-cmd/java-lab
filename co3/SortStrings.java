import java.util.Scanner;

/**
 * Program 6: Sort N strings in ascending (lexicographic) order.
 *
 * Demonstrates:
 *  - Reading an array of strings from user input
 *  - Bubble sort algorithm applied to strings
 *  - Using String.compareTo() for lexicographic comparison
 */
public class SortStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Read how many strings the user wants to sort */
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline after the integer

        /* Store all strings in an array */
        String[] str = new String[n];
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        /* Bubble sort: repeatedly swap adjacent strings that are out of order */
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                /*
                 * compareTo() returns a positive value when str[j] comes
                 * after str[j+1] lexicographically – swap if so.
                 */
                if (str[j].compareTo(str[j + 1]) > 0) {
                    String temp  = str[j];
                    str[j]       = str[j + 1];
                    str[j + 1]   = temp;
                }
            }
        }

        /* Print the sorted strings */
        System.out.println("Sorted strings:");
        for (String s : str) {
            System.out.println(s);
        }

        sc.close();
    }
}

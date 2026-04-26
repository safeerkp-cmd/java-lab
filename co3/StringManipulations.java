import java.util.Scanner;

/**
 * Program 8: String Manipulations.
 *
 * Demonstrates the following String operations in Java:
 *  - length()        – number of characters
 *  - toUpperCase()   – convert to uppercase
 *  - toLowerCase()   – convert to lowercase
 *  - reverse         – reverse the characters (using StringBuilder)
 *  - trim()          – remove leading and trailing spaces
 *  - charAt(index)   – get character at a specific position
 *  - substring(s,e)  – extract part of the string
 *  - contains(word)  – check if a word exists in the string
 *  - indexOf(word)   – get the starting position of a word
 *  - replace(w1, w2) – replace every occurrence of one word with another
 */
public class StringManipulations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Read the input string (may contain spaces) */
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        /* --- length --- */
        System.out.println("Original String      : " + s);
        System.out.println("Length               : " + s.length());

        /* --- toUpperCase --- */
        System.out.println("Uppercase            : " + s.toUpperCase());

        /* --- toLowerCase --- */
        System.out.println("Lowercase            : " + s.toLowerCase());

        /* --- reverse (StringBuilder reverses the character sequence) --- */
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Reversed             : " + reversed);

        /* --- trim (removes leading and trailing whitespace) --- */
        System.out.println("Trimmed              : " + s.trim());

        /* --- charAt (character at index 0, i.e. the first character) --- */
        if (s.length() > 0) {
            System.out.println("Character at index 0 : " + s.charAt(0));
        }

        /* --- substring from index 0 to min(3, length) --- */
        int end = Math.min(3, s.length()); // guard against short strings
        System.out.println("Substring (0,3)      : " + s.substring(0, end));

        /* --- contains / indexOf --- */
        System.out.print("Enter a word to search: ");
        String word = sc.nextLine();

        System.out.println("Contains '" + word + "': " + s.contains(word));
        System.out.println("Index of '" + word + "': " + s.indexOf(word));

        /* --- replace --- */
        System.out.print("Enter word to replace '" + word + "' with: ");
        String replacement = sc.nextLine();

        /* replace() replaces ALL occurrences of the target word */
        String result = s.replace(word, replacement);
        System.out.println("After replace        : " + result);

        sc.close();
    }
}

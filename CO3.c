/*
 * CO3.c - Course Outcome 3 Lab Programs in C
 *
 * Programs included:
 *   1. Product struct - create products and find the one with lowest price
 *   2. Matrix Addition - add two N x N matrices
 *   3. Complex Number Addition - add two complex numbers using a struct
 *   4. Symmetric Matrix - check whether a square matrix is symmetric
 *   5. CPU / Processor / RAM - nested struct to represent a computer's components
 *   6. Sort Strings - sort N strings in ascending (lexicographic) order
 *   7. Search Element - linear search in an integer array
 *   8. String Manipulations - length, upper/lower, reverse, trim, charAt, substring, find, replace
 *
 * Compile:  gcc CO3.c -o CO3 -lm
 * Run:      ./CO3
 */

#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

/* ============================================================
 * Program 1: Product struct with lowest price
 * ============================================================ */

/* Struct to represent a product */
struct Product {
    int    pcode;
    char   pname[50];
    double price;
};

/* Display a single product's details */
void displayProduct(struct Product p) {
    printf("Code: %d, Name: %s, Price: %.2f\n", p.pcode, p.pname, p.price);
}

void program1() {
    printf("\n===== Program 1: Product with Lowest Price =====\n");

    /* Create three product objects */
    struct Product p1 = {101, "Pen",    10.0};
    struct Product p2 = {102, "Pencil",  5.0};
    struct Product p3 = {103, "Eraser",  8.0};

    /* Start with p1 as the assumed lowest */
    struct Product lowest = p1;
    if (p2.price < lowest.price) lowest = p2;
    if (p3.price < lowest.price) lowest = p3;

    printf("All Products:\n");
    displayProduct(p1);
    displayProduct(p2);
    displayProduct(p3);

    printf("\nProduct with Lowest Price:\n");
    displayProduct(lowest);
}

/* ============================================================
 * Program 2: Matrix Addition
 * ============================================================ */

#define MAX 10  /* maximum matrix dimension */

/* Read an n x n matrix from standard input */
void readMatrix(int arr[][MAX], int n) {
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%d", &arr[i][j]);
}

/* Print an n x n matrix to standard output */
void printMatrix(int arr[][MAX], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            printf("%d ", arr[i][j]);
        printf("\n");
    }
}

void program2() {
    printf("\n===== Program 2: Matrix Addition =====\n");

    int n;
    printf("Enter order of matrix (n x n): ");
    scanf("%d", &n);

    int a[MAX][MAX], b[MAX][MAX], sum[MAX][MAX];

    printf("Enter elements of first matrix:\n");
    readMatrix(a, n);

    printf("Enter elements of second matrix:\n");
    readMatrix(b, n);

    /* Add corresponding elements */
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            sum[i][j] = a[i][j] + b[i][j];

    printf("Resultant Matrix:\n");
    printMatrix(sum, n);
}

/* ============================================================
 * Program 3: Complex Number Addition
 * ============================================================ */

/* Struct to hold a complex number (real + imaginary parts) */
struct Complex {
    double real;
    double imag;
};

/* Return the sum of two complex numbers */
struct Complex addComplex(struct Complex a, struct Complex b) {
    struct Complex result;
    result.real = a.real + b.real;
    result.imag = a.imag + b.imag;
    return result;
}

/* Print a complex number in a + bi or a - bi form */
void displayComplex(struct Complex c) {
    if (c.imag >= 0)
        printf("%.2f + %.2fi\n", c.real, c.imag);
    else
        printf("%.2f - %.2fi\n", c.real, -c.imag);
}

void program3() {
    printf("\n===== Program 3: Complex Number Addition =====\n");

    struct Complex c1, c2, c3;

    printf("Enter real and imaginary parts of first complex number: ");
    scanf("%lf %lf", &c1.real, &c1.imag);

    printf("Enter real and imaginary parts of second complex number: ");
    scanf("%lf %lf", &c2.real, &c2.imag);

    c3 = addComplex(c1, c2);  /* add the two complex numbers */

    printf("First:  "); displayComplex(c1);
    printf("Second: "); displayComplex(c2);
    printf("Sum:    "); displayComplex(c3);
}

/* ============================================================
 * Program 4: Check whether a matrix is symmetric
 * A matrix is symmetric if a[i][j] == a[j][i] for all i, j
 * ============================================================ */

void program4() {
    printf("\n===== Program 4: Symmetric Matrix Check =====\n");

    int n;
    int a[MAX][MAX];

    printf("Enter order of matrix: ");
    scanf("%d", &n);

    printf("Enter matrix elements:\n");
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%d", &a[i][j]);

    int symmetric = 1;  /* assume symmetric until proven otherwise */
    for (int i = 0; i < n && symmetric; i++)
        for (int j = 0; j < n && symmetric; j++)
            if (a[i][j] != a[j][i])
                symmetric = 0;

    if (symmetric)
        printf("Matrix is Symmetric\n");
    else
        printf("Matrix is not Symmetric\n");
}

/* ============================================================
 * Program 5: CPU with Processor and RAM nested structs
 * (equivalent to Java inner class / static nested class)
 * ============================================================ */

/* Struct representing the processor (inner class equivalent) */
struct Processor {
    int  noOfCores;
    char manufacturer[50];
};

/* Struct representing RAM (static nested class equivalent) */
struct RAM {
    int  memory;       /* in GB */
    char manufacturer[50];
};

/* Struct representing the overall CPU */
struct CPU {
    double          price;
    struct Processor processor;
    struct RAM       ram;
};

/* Display CPU, Processor, and RAM information */
void displayCPU(struct CPU cpu) {
    printf("CPU Price: %.2f\n", cpu.price);
    printf("Processor Info:\n");
    printf("  No. of Cores: %d\n", cpu.processor.noOfCores);
    printf("  Manufacturer: %s\n", cpu.processor.manufacturer);
    printf("RAM Info:\n");
    printf("  Memory: %d GB\n", cpu.ram.memory);
    printf("  Manufacturer: %s\n", cpu.ram.manufacturer);
}

void program5() {
    printf("\n===== Program 5: CPU / Processor / RAM Nested Structs =====\n");

    /* Initialize a CPU with its Processor and RAM details */
    struct CPU cpu;
    cpu.price = 50000.00;
    cpu.processor.noOfCores = 8;
    strcpy(cpu.processor.manufacturer, "Intel");
    cpu.ram.memory = 16;
    strcpy(cpu.ram.manufacturer, "Corsair");

    displayCPU(cpu);
}

/* ============================================================
 * Program 6: Sort N strings in ascending order (bubble sort)
 * ============================================================ */

void program6() {
    printf("\n===== Program 6: Sort Strings =====\n");

    int n;
    printf("Enter number of strings: ");
    scanf("%d", &n);

    /* Allocate array of strings (each up to 99 characters) */
    char str[50][100];
    printf("Enter strings:\n");
    for (int i = 0; i < n; i++)
        scanf("%s", str[i]);

    /* Bubble sort using strcmp for lexicographic comparison */
    char temp[100];
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (strcmp(str[j], str[j + 1]) > 0) {
                /* swap str[j] and str[j+1] */
                strcpy(temp,    str[j]);
                strcpy(str[j],  str[j + 1]);
                strcpy(str[j + 1], temp);
            }
        }
    }

    printf("Sorted strings:\n");
    for (int i = 0; i < n; i++)
        printf("%s\n", str[i]);
}

/* ============================================================
 * Program 7: Search an element in an integer array (linear search)
 * ============================================================ */

/* Returns the 0-based index of key in arr, or -1 if not found */
int linearSearch(int arr[], int n, int key) {
    for (int i = 0; i < n; i++)
        if (arr[i] == key)
            return i;
    return -1;
}

void program7() {
    printf("\n===== Program 7: Search Element in Array =====\n");

    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int a[100];
    printf("Enter elements:\n");
    for (int i = 0; i < n; i++)
        scanf("%d", &a[i]);

    int key;
    printf("Enter element to search: ");
    scanf("%d", &key);

    int pos = linearSearch(a, n, key);
    if (pos != -1)
        printf("Element found at position %d\n", pos + 1);  /* 1-based position */
    else
        printf("Element not found\n");
}

/* ============================================================
 * Program 8: String Manipulations
 *   - length, uppercase, lowercase, reverse, trim
 *   - charAt (character at index), substring, contains, indexOf, replace
 * ============================================================ */

/* Convert string to uppercase in-place */
void toUpperStr(char *s) {
    for (int i = 0; s[i]; i++)
        s[i] = (char)toupper((unsigned char)s[i]);
}

/* Convert string to lowercase in-place */
void toLowerStr(char *s) {
    for (int i = 0; s[i]; i++)
        s[i] = (char)tolower((unsigned char)s[i]);
}

/* Reverse a string in-place */
void reverseStr(char *s) {
    int len = (int)strlen(s);
    for (int i = 0; i < len / 2; i++) {
        char tmp   = s[i];
        s[i]       = s[len - 1 - i];
        s[len-1-i] = tmp;
    }
}

/* Trim leading and trailing spaces (modifies the string in-place) */
void trimStr(char *s) {
    /* Remove leading spaces */
    int start = 0;
    while (s[start] == ' ') start++;

    /* Remove trailing spaces */
    int end = (int)strlen(s) - 1;
    while (end >= start && s[end] == ' ') end--;

    /* Shift the trimmed content to the beginning */
    int len = end - start + 1;
    memmove(s, s + start, len);
    s[len] = '\0';
}

/*
 * Replace all occurrences of 'word' in 'src' with 'replacement'
 * and write the result into 'dest'.
 */
void replaceStr(const char *src, const char *word, const char *replacement, char *dest) {
    int wlen = (int)strlen(word);
    dest[0] = '\0';
    const char *ptr = src;
    const char *found;

    while ((found = strstr(ptr, word)) != NULL) {
        /* Copy everything before the found occurrence */
        strncat(dest, ptr, found - ptr);
        /* Append the replacement */
        strcat(dest, replacement);
        ptr = found + wlen;  /* advance past the matched word */
    }
    strcat(dest, ptr);  /* copy remainder of the string */
}

void program8() {
    printf("\n===== Program 8: String Manipulations =====\n");

    char s[200];
    printf("Enter a string: ");
    /* Use fgets to allow spaces; strip trailing newline */
    fgets(s, sizeof(s), stdin);
    s[strcspn(s, "\n")] = '\0';

    /* Length */
    printf("Original String      : %s\n", s);
    printf("Length               : %d\n", (int)strlen(s));

    /* Uppercase copy */
    char upper[200];
    strcpy(upper, s);
    toUpperStr(upper);
    printf("Uppercase            : %s\n", upper);

    /* Lowercase copy */
    char lower[200];
    strcpy(lower, s);
    toLowerStr(lower);
    printf("Lowercase            : %s\n", lower);

    /* Reversed copy */
    char rev[200];
    strcpy(rev, s);
    reverseStr(rev);
    printf("Reversed             : %s\n", rev);

    /* Trimmed copy */
    char trimmed[200];
    strcpy(trimmed, s);
    trimStr(trimmed);
    printf("Trimmed              : %s\n", trimmed);

    /* Character at index 0 */
    printf("Character at index 0 : %c\n", s[0]);

    /* Substring from index 0 to 3 (up to 3 characters) */
    int subLen = (int)strlen(s) < 3 ? (int)strlen(s) : 3;
    char sub[4];
    strncpy(sub, s, subLen);
    sub[subLen] = '\0';
    printf("Substring (0,3)      : %s\n", sub);

    /* Contains / indexOf */
    char word[100];
    printf("Enter a word to search: ");
    fgets(word, sizeof(word), stdin);
    word[strcspn(word, "\n")] = '\0';

    const char *found = strstr(s, word);
    printf("Contains '%s': %s\n", word, found ? "true" : "false");
    printf("Index of '%s': %d\n", word, found ? (int)(found - s) : -1);

    /* Replace */
    char replacement[100];
    printf("Enter word to replace '%s' with: ", word);
    fgets(replacement, sizeof(replacement), stdin);
    replacement[strcspn(replacement, "\n")] = '\0';

    char result[500];
    replaceStr(s, word, replacement, result);
    printf("After replace        : %s\n", result);
}

/* ============================================================
 * main - entry point; runs all 8 programs in sequence
 * ============================================================ */
int main() {
    program1();
    program2();
    program3();
    program4();
    program5();
    program6();
    program7();
    program8();
    return 0;
}

import java.util.*;

// ============================================================
// Program 1: Product class with lowest price
// ============================================================
class Product {
    int pcode;
    String pname;
    double price;

    Product(int pcode, String pname, double price) {
        this.pcode  = pcode;
        this.pname  = pname;
        this.price  = price;
    }

    void display() {
        System.out.println("Code: " + pcode + ", Name: " + pname + ", Price: " + price);
    }
}

class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Pen",    10.0);
        Product p2 = new Product(102, "Pencil",  5.0);
        Product p3 = new Product(103, "Eraser",  8.0);

        Product lowest = p1;
        if (p2.price < lowest.price) lowest = p2;
        if (p3.price < lowest.price) lowest = p3;

        System.out.println("All Products:");
        p1.display();
        p2.display();
        p3.display();

        System.out.println("\nProduct with Lowest Price:");
        lowest.display();
    }
}

// ============================================================
// Program 2: Matrix Addition
// ============================================================
class MatrixAdd {
    static void readMatrix(int[][] arr, int n, Scanner sc) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
    }

    static void printMatrix(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix (n x n): ");
        int n = sc.nextInt();

        int[][] a   = new int[n][n];
        int[][] b   = new int[n][n];
        int[][] sum = new int[n][n];

        System.out.println("Enter elements of first matrix:");
        readMatrix(a, n, sc);

        System.out.println("Enter elements of second matrix:");
        readMatrix(b, n, sc);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                sum[i][j] = a[i][j] + b[i][j];

        System.out.println("Resultant Matrix:");
        printMatrix(sum, n);
    }
}

// ============================================================
// Program 3: Complex Number Addition
// ============================================================
class Complex {
    double real;
    double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}

class ComplexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary parts of first complex number: ");
        double r1 = sc.nextDouble(), i1 = sc.nextDouble();

        System.out.print("Enter real and imaginary parts of second complex number: ");
        double r2 = sc.nextDouble(), i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex c3 = c1.add(c2);

        System.out.print("First:  "); c1.display();
        System.out.print("Second: "); c2.display();
        System.out.print("Sum:    "); c3.display();
    }
}

// ============================================================
// Program 4: Check whether matrix is symmetric
// ============================================================
class SymmetricMatrix {
    int[][] a;
    int n;

    void read(Scanner sc) {
        System.out.print("Enter order of matrix: ");
        n = sc.nextInt();
        a = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
    }

    boolean isSymmetric() {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (a[i][j] != a[j][i])
                    return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SymmetricMatrix obj = new SymmetricMatrix();
        obj.read(sc);

        if (obj.isSymmetric())
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is not Symmetric");
    }
}

// ============================================================
// Program 5: CPU with inner class Processor and static nested class RAM
// ============================================================
class CPUDemo {
    private double price;

    CPUDemo(double price) {
        this.price = price;
    }

    class Processor {
        private int noOfCores;
        private String manufacturer;

        Processor(int noOfCores, String manufacturer) {
            this.noOfCores    = noOfCores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("No. of Cores: " + noOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        private int memory;
        private String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory       = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    void displayPrice() {
        System.out.println("CPU Price: " + price);
    }

    public static void main(String[] args) {
        CPUDemo cpu = new CPUDemo(50000);
        CPUDemo.Processor processor = cpu.new Processor(8, "Intel");
        CPUDemo.RAM ram = new CPUDemo.RAM(16, "Corsair");

        cpu.displayPrice();
        System.out.println("Processor Info:");
        processor.display();
        System.out.println("RAM Info:");
        ram.display();
    }
}

// ============================================================
// Program 6: Sort Strings
// ============================================================
class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        String[] str = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++)
            str[i] = sc.next();

        // Bubble sort
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (str[j].compareTo(str[j + 1]) > 0) {
                    String temp = str[j];
                    str[j]      = str[j + 1];
                    str[j + 1]  = temp;
                }

        System.out.println("Sorted strings:");
        for (String s : str)
            System.out.println(s);
    }
}

// ============================================================
// Program 7: Search an element in an array
// ============================================================
class SearchElement {
    int[] a;
    int n;

    void read(Scanner sc) {
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
    }

    int search(int key) {
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchElement obj = new SearchElement();
        obj.read(sc);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int pos = obj.search(key);
        if (pos != -1)
            System.out.println("Element found at position " + (pos + 1));
        else
            System.out.println("Element not found");
    }
}

// ============================================================
// Program 8: String Manipulations
// ============================================================
class StringManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Original String      : " + s);
        System.out.println("Length               : " + s.length());
        System.out.println("Uppercase            : " + s.toUpperCase());
        System.out.println("Lowercase            : " + s.toLowerCase());
        System.out.println("Reversed             : " + new StringBuilder(s).reverse().toString());
        System.out.println("Trimmed              : " + s.trim());
        System.out.println("Character at index 0 : " + s.charAt(0));
        System.out.println("Substring (0,3)      : " + s.substring(0, Math.min(3, s.length())));

        System.out.print("Enter a word to search: ");
        String word = sc.nextLine();
        System.out.println("Contains '" + word + "': " + s.contains(word));
        System.out.println("Index of '" + word + "': " + s.indexOf(word));

        System.out.print("Enter word to replace '" + word + "' with: ");
        String replacement = sc.nextLine();
        System.out.println("After replace        : " + s.replace(word, replacement));
    }
}

// ============================================================
// Main FairRecord class — runs all demos in sequence
// ============================================================
public class FairRecord {
    public static void main(String[] args) {
        System.out.println("===== Program 1: Product with Lowest Price =====");
        ProductDemo.main(args);

        System.out.println("\n===== Program 5: CPU Inner/Nested Class =====");
        CPUDemo.main(args);

        System.out.println("\nFor Programs 2,3,4,6,7,8 run their respective main classes:");
        System.out.println("  MatrixAdd, ComplexDemo, SymmetricMatrix, SortStrings, SearchElement, StringManipulations");
    }
}

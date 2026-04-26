import java.util.Scanner;

/**
 * Program 3: Complex Number Addition.
 *
 * Demonstrates:
 *  - Representing a complex number as a class with real and imaginary parts
 *  - Adding two complex numbers by adding their parts separately
 *  - Displaying results in standard mathematical form (a + bi)
 */
public class ComplexNumberAddition {

    /* Real part of the complex number */
    double real;

    /* Imaginary part of the complex number */
    double imag;

    /**
     * Constructor to create a complex number.
     *
     * @param real  real part
     * @param imag  imaginary part
     */
    ComplexNumberAddition(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    /**
     * Adds two complex numbers and returns a new ComplexNumberAddition object.
     *
     * @param other  the second complex number to add
     * @return       a new object representing the sum
     */
    ComplexNumberAddition add(ComplexNumberAddition other) {
        /* Real parts add together; imaginary parts add together */
        return new ComplexNumberAddition(this.real + other.real, this.imag + other.imag);
    }

    /**
     * Displays the complex number in a + bi or a - bi form.
     */
    void display() {
        if (imag >= 0) {
            System.out.printf("%.2f + %.2fi%n", real, imag);
        } else {
            /* Print as a - bi (use absolute value for the imaginary part) */
            System.out.printf("%.2f - %.2fi%n", real, -imag);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Read first complex number */
        System.out.print("Enter real and imaginary parts of first complex number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        ComplexNumberAddition c1 = new ComplexNumberAddition(r1, i1);

        /* Read second complex number */
        System.out.print("Enter real and imaginary parts of second complex number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        ComplexNumberAddition c2 = new ComplexNumberAddition(r2, i2);

        /* Compute the sum */
        ComplexNumberAddition c3 = c1.add(c2);

        /* Display all three numbers */
        System.out.print("First:  "); c1.display();
        System.out.print("Second: "); c2.display();
        System.out.print("Sum:    "); c3.display();

        sc.close();
    }
}

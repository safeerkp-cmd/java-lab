import java.util.Scanner;

/**
 * Program 1: Product class with lowest price finder.
 *
 * Demonstrates:
 *  - Creating a class with fields (pcode, pname, price)
 *  - Instantiating multiple objects
 *  - Finding the object with the lowest price by comparison
 */
public class ProductLowestPrice {

    /* Fields that describe a single product */
    int    pcode;
    String pname;
    double price;

    /**
     * Constructor to initialize a Product object.
     *
     * @param pcode  unique product code
     * @param pname  product name
     * @param price  price of the product
     */
    ProductLowestPrice(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    /** Display the product's details on one line. */
    void display() {
        System.out.println("Code: " + pcode + ", Name: " + pname + ", Price: " + price);
    }

    public static void main(String[] args) {

        /* Create three product objects */
        ProductLowestPrice p1 = new ProductLowestPrice(101, "Pen",    10.0);
        ProductLowestPrice p2 = new ProductLowestPrice(102, "Pencil",  5.0);
        ProductLowestPrice p3 = new ProductLowestPrice(103, "Eraser",  8.0);

        /* Print all products */
        System.out.println("All Products:");
        p1.display();
        p2.display();
        p3.display();

        /* Start with p1 as the assumed lowest-price product */
        ProductLowestPrice lowest = p1;

        /* Compare with p2 and update if p2 is cheaper */
        if (p2.price < lowest.price) {
            lowest = p2;
        }

        /* Compare with p3 and update if p3 is cheaper */
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        /* Display the product with the lowest price */
        System.out.println("\nProduct with Lowest Price:");
        lowest.display();
    }
}

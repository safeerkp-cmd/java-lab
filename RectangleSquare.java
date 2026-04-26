// Program to calculate the area and perimeter of a rectangle
// The area of the rectangle equals the area of the square (side x side)
// The length of the rectangle is calculated from the area and given breadth

import java.util.Scanner;

class RectangleSquare {

    // Method to calculate and display rectangle dimensions
    void calculate(int side, int breadth) {
        int squareArea = side * side;        // Area of the square = side^2
        int length = squareArea / breadth;   // Length of rectangle = area / breadth
        int perimeter = 2 * (length + breadth);  // Perimeter = 2 * (length + breadth)

        // Display the results
        System.out.println("Length of rectangle = " + length);
        System.out.println("Area of rectangle = " + squareArea);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values from the user
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        RectangleSquare obj = new RectangleSquare();  // Create object
        obj.calculate(side, breadth);                  // Calculate and display results
    }
}

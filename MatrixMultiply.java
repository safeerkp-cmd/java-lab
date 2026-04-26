// Program to print a left-aligned triangle pattern using stars (*)
// Example output for 5 rows:
//     *
//    **
//   ***
//  ****
// *****

class Left_Triangle{
	public static void main(String[] args){
		// Loop for each row from 1 to 5
		for ( int i = 1; i <= 5; i++){
			System.out.print(" ".repeat(5-i));  // Print spaces before the stars
			System.out.print("*".repeat(i));    // Print stars equal to row number
			System.out.print("\n");             // Move to next line
		}
	}
}

// Connor Deppert
// CSE02-112
// March 1, 2015
// This program takes 5 iput integers from the user and calculates the sum 

import java.util.Scanner; // imports the Scanner class

public class GetIntegers {
	public static void main (String [] args) {
		Scanner myScanner = new Scanner ( System.in ); // declares and constructs an instance for the Scanner class
		System.out.println("Please enter 5 non-negative integers: "); // prompts the user for five non-negative numbers
		int sum = 0; // declaring and initializing sum to 0
		int limit = 5; // declaring and initializing limit to 5
		for ( int counter = 1; counter<=limit; counter++) { // while the counter is less than or equal to the limit the loop will run
			if ( myScanner.hasNextInt() ) { // if the user enters an integer this block of code will run
				int integer = myScanner.nextInt(); // stores the integer the user entered into integer
				if ( integer >= 0 ) { // if integer is greater than or equal to 0 this block of code will run
					sum = sum + integer; // adds integer to the current sum and stores the new sum
				}
				else { // if the integer is not greater than or equal to 0 this block of code will run
					System.out.println("Invalid input, enter again"); 
					counter = --counter; // subtract one from counter so the incorrect input doesn't take up an iteration
				}
			}
			else { // if the user did not enter an integer this block of code will run
				System.out.println("Invalid input, enter again");
				myScanner.next(); // reads the invalid input so the program doesn't turn into an infinite loop
				counter = --counter; // subtract one from counter so the incorrect input doesn't take up an iteration
				}
			} 
		System.out.println("Sum is: "+sum); // prints out the total sum of the integers
	}
}
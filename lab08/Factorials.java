// Connor Deppert
// CSE02-112
// March 20, 2015
/* This program takes a given input integer and finds the super factorial
for that number */

import java.util.Scanner; // imports Scanner class

public class Factorials {
	// MAIN METHOD
	public static void main (String [] args) {
		Scanner myScanner = new Scanner (System.in); // declaring and constructing a Scanner class
		System.out.print("Enter a positive integer: "); // prompts the user to enter a positive integer
		int myNumber = myScanner.nextInt(); // storing the positive integer the user enters into myNumber
		int answer = 0; // declaring and assigning the value 0 to answer
		for (int x = 1; x <= myNumber; x++) { // while x is less than or equal to myNumber the following code will run and then x will be incremented by 1
			answer += factorial(x); /* calls factorial method to find the factorial of x; the factorial of x is then added to answer
				and stored back into answer */
		}
		print(answer); // calls print method
	}

	// FINDS THE FACTORIAL OF A GIVEN NUMBER
	public static int factorial (int number) { // method that accpets an integer and find the factorial of the integer
		int start = 1; // declaring and assigning the value 1 to start 
		for (int i = 1; i <= number; i++) { // while i is less than or equal to number the following code will run and then i will be incremented by 1
			start *= i; // multiplies the value of start by i and stores it into the variable start
		}
		System.out.println(start); // prints out the value of start
		return start; // returns the value start to the main method
	}

	// PRINTS OUT THE SUPER FACTORIAL
	public static void print (int end) { // method that prints out the value of end
		System.out.println("The super factorial is equal to: "+end);
	}
}
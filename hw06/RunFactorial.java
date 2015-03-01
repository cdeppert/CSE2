// Connor Deppert
// CSE02-112
// March 1, 2015
/* This program takes a given input by the user between 9 and 16 inclusive 
and generates the factorial for that input */

import java.util.Scanner; // imports the Scanner class

public class RunFactorial {
	public static void main (String [] args) {
		Scanner myScanner = new Scanner (System.in); // declares and constructs an instance for the Scanner class
		System.out.println("Please enter an integer that is between 9 and 16: ");
		int counter = 1; // declaring and initializing counter to 1
		int limit = 2; // declaring and initializing limit to 2
		int userInput = 0; // declaring and initializing userInput to 0
		int i = 1; // declaring and intializing i to 1
		int factorial = 1; // declaring and intializing factorial to 1
		while (counter < limit) { // while counter is less than the set limit this block of code will run
			if ( myScanner.hasNextInt() ) { // if the user enters an integer this block of code will run
				userInput = myScanner.nextInt(); // stores the user input integer into userInput
				if (userInput >= 9 && userInput <= 16) { // if the user enters an integer between 9 and 16 inclusive this block of code will run
					while (i <= userInput) { // while i is less than the number the user input this block of code will run
						factorial = factorial * i; // takes factorial and multiplies it by i and assigns the new value to factorial
						i++; // increments i by 1
					}
				}
				else { // if the user did not enter an integer between 9 and 16 inclusive this block of code will run
					System.out.println("Invalid input, enter again");
					counter = --counter; // subtracts one from counter so the incorrect input doesn't take up an interation
				}
			}
			else { // if the user did not enter an integer this block of code will run
				System.out.println("Invalid input, enter again");
				myScanner.next(); // reads the incorrect input so the loop does not become infinite
				counter = --counter; // subtracts one from counter so the incorrect input doesn't take up an iteration
			}
			counter++; // adds one to counter before the next iteration so it doesn't become an infinite loop
		}
		System.out.println(userInput+"! = "+factorial); // prints out the answer to the user
	}
}
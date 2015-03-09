// Connor Deppert
// CSE02-112
// March 15, 2015
/* This program takes a user input number between 1 and 30 and generates a wave
pattern with the numbers leading up to it, starting at 1 */

import java.util.Scanner;

public class waves {
	public static void main (String [] args) {
		Scanner myScanner = new Scanner (System.in); // declaring and constructing an instance for the Scanner class
		// MAKES SURE THE USER ENTERS AN INTEGER BETWEEN 1 AND 30
		int myNumber = 0; // declaring and assigning the value 0 to myNumber
		while (myNumber < 1 || myNumber > 30) { // if myNumber is less than 1 or greater than 30 this loop will run
			System.out.print("Enter an integer between 1 and 30: "); // prompts the user to enter an integer between 1 and 30
			while ( !myScanner.hasNextInt() ) { // if the user does not enter an integer this loop will run
				myScanner.next(); // clears what the user entered that wasn't correct
				System.out.print("Make sure to enter an integer: "); // prompts the user to make sure that they enter an integer
			}
			myNumber = myScanner.nextInt(); // stores the users input integer into myNumber 
		}
		// FOR LOOP WAVES
		System.out.println("FOR LOOP"); // prints out FOR LOOP
		for (int x = 1; x <= myNumber; x++) { // declaring and assigning 1 to x; while x is less than or equal to the user input number this code will run
				// CREATES THE INCREASING PYRAMID PATTERN
			if (x % 2 == 0) { // if dividing x by 2 leaves no remainder this code will run
				for (int i = 1; i <= x; i++) { // delcaring i as 1; if i is less than or equal to x the loop will run; at the end of the loop i is incremented by 1
					for (int k = 0; k < i; k++) { // declaring k as 0; if k is less than i the loop will run; at the end of the loop k is incremented by 1
						System.out.print(x); // prints out the current value of x
					}
					System.out.println(); // starts a new line for the next number or numbers to be printed on 
				} 
			}
			else { // if dividing x by 2 leaves a remainder this code will run
				// CREATES THE DECREASING PYRAMID PATTERN
				for (int i = x; i > 0; i-- ) { // declaring i as the value of x; if i is greater than 0 the loop will run; at the end of the loop i is decremented by 1
					for (int k = 0; k < i; k++) { // declaring k as 0; if k is less than i the loop will run; at the end of the loop k is incremented by 1
						System.out.print(x); // prints out the current value of x
					}
					System.out.println(); // starts a new line for the next number or numbers to be printed on 
				} 
			}
		} // closing brace for entire for loop 
		// WHILE LOOP WAVES
		System.out.println("WHILE LOOP"); // prints out WHILE LOOP
		int x = 1; // declaring and assigning the value 1 to x
		while (x <= myNumber) { // while x is less than or equal to myNumber the loop will run
			if (x % 2 == 0) { // if dividing x by 2 leaves no remainder this code will run
			// CREATES INCREASING PYRAMID PATTERN
				int i = 1; // declaring and assigning the value 1 to i
				while (i <= x) { // while i is less than or equal to x the loop will run
					int k = 0; // delcaring and assigning the value 0 to k
					while (k < i) { // while k is less than i the loop will run
						System.out.print(x); // prints the current value of x
						k++; // increments k by 1
					}
				System.out.println(); // starts a new line for the next number or numbers to be printed on
				i++; // increments i by 1
				}
			} 
			else { // if dividing x by 2 leaves a remainder this code will run
			// CREATES DECREASING PYRMAID PATTERN
				int i = x; // stores the current value of x into i 
				while (i > 0) { // if i is greater than 0 this loop will run
					int k = 0; // declaring and assigning the value 0 to k
					while (k < i) { // if k is less than i this loop will run
						System.out.print(x); // prints out the current value of x
						k++; // increments k by 1
					}
				System.out.println(); // prints out a new line for the number or numbers to be printed on 
				i--; // decrements i by 1
				}
			}
		x++; // increments x by 1
	}
		// DO WHILE LOOP WAVES
		System.out.println("DO-WHILE LOOP"); // PRINTS OUT DO-WHILE LOOP
		int z = 1; // declaring and assigning the value 1 to z
		do { // this loop will be done
			if (z % 2 == 0) { // if dividing x by 2 leaves no remainder this code will run
			// CREATES INCREASING PYRAMID PATTERN
			int i = 1; // declaring and assigning the value 1 to i
				do { // this loop will be done
					int k = 0; // declares and assigns the value 0 to k
					do { // this loop will be done
						System.out.print(z); // prints out current value of z
						k++; // increments k by 1
					} while (k < i); // checks if k is less than i and if it is the loop will run again
				System.out.println(); // prints out a new line for the number or numbers to be printed on 
				i++; // increments i by 1
				} while (i<=z); // checks to see if i is less than or equal to z and if it is than the loop will run again
			}
			else { // if dividing x by 2 leaves a remainder this code will run
			// CREATES DECREASING PYRMAID PATTERN
				int i = z; // declaring and assigning the value of z to i
				do { // this loop will be done
					int k = 0; // declaring and assigning the value of 0 to k
					do { // this loop will be done
						System.out.print(z); // prints out the current value of z
						k++; // increments k by 1
					} while (k < i); // checks to see if k is less than i and if it is the loop will run again
				System.out.println(); // prints out a new line for the number or numbers to be printed on
				i--; // decrements i by 1
				} while (i > 0); // checks to see if i is greater than 0 and if it is the loop will run again
			}
		z++; // increments z by 1
		} while (z <= myNumber); // checks to see if z is greater than or equal to myNumber and if it is the loop will run again
	} 
} 
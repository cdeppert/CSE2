// Connor Deppert
// CSE02-112
// March 6, 2015
/* This program takes a user input between [3,33] and generates a zig zag pattern
of *'s for that number */
import java.util.Scanner; // imports Scanner class

public class zigzag {
	public static void main (String [] args) {
	Scanner myScanner = new Scanner (System.in); // declaring and constructing an instance for the Scanner class
		while (true) { // puts the whole program into a loop so it can run multiple times
			// FORCES THE USER TO ENTER AN INTEGER IN THE CORRECT RANGE
			int nStars = 0; // declaring and assigning nStars to 0
				while ( nStars < 3 || nStars > 33 ) { // while nStars is outside of the set range this code will run
					System.out.println("Enter an integer between [3,33]: "); // prompts the user for an integer in the range
						while (!myScanner.hasNextInt() ) { // if the user does not enter an integer this while loop will run
							myScanner.next(); // clears out what the user enters that isn't an integer
							System.out.println("Make sure to enter an integer "); // prompts the user to enter an integer
						}
				nStars = myScanner.nextInt(); // stores the integer the user enters into nStars and will check it again in the first while loop
			}
			// PRINTS OUT STARS IN A SINGLE LINE
			int i = 1; // declaring and assigning i to 1
				while (i <= nStars) { // while i is less than or equal to the user input number of stars this code will run
					System.out.print("*"); // prints out a *
					i++; // increments i by 1
				}  
			//PRINTS OUT A ZIGZAG OF STARS
			String space = " "; // declaring and assigning the variable space to the value of a space
			System.out.println(); // starting a new line for the zig zag to start
				for (int j = 1; j <= (nStars - 2); j++) { /* declaring and assigning j to 1; while j is less than or equal to the user input 
						number of stars minus 2 the block of code will run; after the block of code runs j is incremented by 1 */
					System.out.print(space); // prints the current value of space
					for (int k = 0; k < 1; k++) { // declaring and assigning k to 0; while k is less than 1 the code will run; k is the incremented by 1
						System.out.println("*"); // prints out a star
					}
				space = space + " "; // adds an extra space to the current value of the variable space and stores it in the variable space
				}  
			// PRINTS OUT STARS IN A SINGLE LINE
			int k = 1; // declaring and assigning k to 1
				while (k <= nStars) { // while k is less than or equal to the user input number of stars this block of code will run
					System.out.print("*"); // prints out a *
					k++; // increments k by 1
				} 
		// PROMPTS THE USER TO RUN THE PROGRAM AGAIN
		System.out.println(); // starts a new line for the prompt below
		System.out.print("Enter y or Y to go again: "); // prompts the user if they want the program to run again
		String answer = myScanner.next(); // stores the user's answer
			if (answer.equals("y") || answer.equals("Y") ) { // if the user enters y or Y the program will run again
			}
			else { // if the user enters anything but y or Y the program will terminate
				break; // exits the current loop
			}
		}
	}
}
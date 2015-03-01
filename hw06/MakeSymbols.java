// Connor Deppert
// CSE02-112
// March 1, 2015
/* This program takes a randomly generated number between 0 and 100 and then
prints out that number of "*" if the number is even or that number of "&" if
it is odd */

public class MakeSymbols {
	public static void main (String [] args) {
		int randomNumber = 0 + (int) (Math.random() * ((100 - 0) + 1)); // generates a random number between 0 and 100
		System.out.println("Random number generated: "+randomNumber); // prints out what the random number is to the user
		int i = 1; // declaring and assigning 1 to i for later use
		if ( randomNumber % 2 == 0 ) { // if the random number when divided by 2 does not have a remainder (it is even) run this block of code
			System.out.print("The output pattern: "); // prints out the words "The output pattern"
			do { // does this block of code and then checks the boolean
				System.out.print("*");
				i++; // increments i by 1
			} while (i <= randomNumber); // checks to see if i is still less than the random number, if so the block of code will run again
		}
		else { // if the random number is not even run this block of code
			System.out.print("The output pattern: "); // prints out the words "The output pattern"
			do { // does this block of code and then checks the boolean
				System.out.print("&");
				i++; // increments i by 1
			} while (i <= randomNumber); // checks to see if i is still less than the random number, if so the block of code will run again
		} 
	}
}
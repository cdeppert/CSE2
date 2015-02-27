// Connor Deppert
// CSE02-112
// February 27, 2015
/* This program uses various kinds of loops to print out a certain amount of 
:) depending on the given step in the instructions */

public class SmileGenerator {
	public static void main (String [] args) {
		// STEP 1
		System.out.println("Step 1"); // allows the user to know that the code below is Step 1 of the assignment
		int start = 1; // declaring and assigning start to 1
		int start2 = 1; // declaring and assigning start2 to 1
		String smileyFace = ":)"; // declaring and assigning smileyFace to :)
		while (start <= 5) { // as long as the value of start is less than or equal to 5 this block of code will run
			System.out.print(smileyFace); 
			start++; // increments value of start by 1
		}
		System.out.println(); // adds a new line for the next loop to start on
		do { // does this block of code
			System.out.print(smileyFace);
			start2++; // increments start2 by one
		} while (start2 <= 5); // as long as the value of start2 is less than or equal to 5 the block of code will run again
		System.out.println(); // adds a new line for the next loop to start on
		for (start = 1; start <= 5; start++) { // assigning start to the value of 1, as long as the value of start is less than or equal to 5 the block of code will run, and then increments start by 1 after printing out the line
			System.out.print(smileyFace);
		}
		// Step 2
		System.out.println(); // adds a new line for the next loop to start on
		System.out.println("Step 2"); // allows the user to know that the code below is Step 2 of the assignment
		int randomNumber = (int) ((Math.random() * 100) + 1); // generating a random number between 1 and 100
		for (int i = 1; i <= randomNumber; i++) { // declaring and assigning 1 to int i, as long as i is less than or equal to randomNumber the block of code will run, and then increments i by 1 after printing out the line
			System.out.print(smileyFace);
		}
		// STEP 3 
		System.out.println(); // adds a new line for the next loop to start on
		System.out.println("Step 3"); // allows the user to know that the code below is Step 3 of the assignment
		int i = 1; // declaring and assigning int i to 1
		System.out.println("The total number of :) will be: "+randomNumber);
		if (randomNumber <= 30) { // if the random number is less than or equal to 30 run this block of code
			while (i <= randomNumber){ // while i is less than the random number run this block of code
				System.out.print(smileyFace);
				i++; // increment i by 1
			}
		}
		else { // if the random number is greater than 30 run this block of code
			int numberOfLines = randomNumber / 30; // stores what the random number is divided by 30 into numberOfLines
			for (int university = 1; university <= numberOfLines; university++ ) { // while 1 is less than or equal to number of lines it will run the while loop and then increment university by 1
				
				while (i <= 30) { // while i is less than or equal to 30 a :) will print and then i will be incremented by 1
					System.out.print(smileyFace);
					i++; // increments i by 1
				}
			System.out.println(); // allows the next line after 30 :) to start on a new line
			i = 1; // resets the variable i to 1
			}
			int remainder = (randomNumber % 30); // sets remainder to the random number modulo 30
			if (remainder == 0) { // if the remainder is equal to 0 than this block of code will run
				System.out.print(smileyFace); // prints out a smiley face
				for (int variable = 1; variable <= 30; variable++) { // prints out a smiley face as long as variable is less than or equal to 30 and then increments variable by 1
					System.out.print(smileyFace); // prints out a smiley face
				}
			}
			else{ // if the remainder is not zero than this block of code will run
				for (int lehigh = 1; lehigh <= remainder; lehigh++) { // prints out the remainder in smiley faces
					System.out.print(smileyFace);
				}
			}
		}
		// STEP 4
		System.out.println(); // adds a new line for the next loop to start on
		System.out.println("Step 4"); // allows the user to know that the code below is Step 4 of the assignment
		int x = 0; // assigns x to the value of 0
		while (x < 5) { // if x is less than 5 the block of code will run 
			System.out.println(smileyFace); // prints out the variable smileyFace
			x++; // increments x by one
			smileyFace += ":)"; // increments the string smileyFace by one smileyFace after every loop
		}
	} 
}
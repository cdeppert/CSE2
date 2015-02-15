// Connor Deppert
// CSE02-112
// February 15, 2015
/* This program uses a randomly generated bank account balance and based off what the user
wants and does will then show them their new account balance */

import java.util.Scanner; // import Scanner class

public class Banking {
	public static void main (String [] args) {
		Scanner myScanner = new Scanner ( System.in ); // declare an instance and construct the Scanner class
		int balance = 1000 + (int)(Math.random() * ((5000-1000) + 1)); // setting the balance of the bank account to be anywhere between 1000 and 5000 dollars
		System.out.print("Select a number: (1) Deposit, (2) Withdraw, or (3) View "); // prompting the user to choose what option they would like
		int myAnswer = myScanner.nextInt(); // the next integer the user answers will be stored in myAnswer
		switch (myAnswer) {
			case 1: // if myAnswer is equal to 1 the following code will run
				System.out.print("How much would you like to deposit: "); // prompts the user how much they would like to deposit
				int depositAmount = myScanner.nextInt(); // the next integer they enter will be stored in depositAmount
				if ( depositAmount > 0 ) { // checks to make sure that the user input number is greater than 0

				}
				else { // if the user does not enter a positive number the below line will be printed and the program will end
					System.out.println("You did not enter a positive number");
					return; // ends the program
				}

				System.out.println("Your new balance is: "+(balance+depositAmount)); // if the user enters a positive number this line will print their new balance
				break; // exits the switch statement and the program ends
			case 2: // if myAnswer is equal to 2 the following code will run
				System.out.println("How much would you like to withdraw: "); // prompts the user to enter how much money they would like to withdraw
				int withdrawAmount = myScanner.nextInt(); // the next integer the user enters will be stored in withdrawAmount
				if ( withdrawAmount > 0 ) { // checks to see if the user input number is a positive number

				}
				else { // if the user does not enter a positive number the below line will be printed and the program will end
					System.out.println("You have not entered a positive number"); 
					return; // ends the program
				}
				if ( withdrawAmount > balance) { // if the amount the user wants to withdraw is greater than their balance the below line will be printed and the program will end
					System.out.println("You do not have that much money in your account");
					return; // ends the program
				}
				else { // if the amount the user wants to withdraw is less than or equal to their balance the program will continue to run

				}
				System.out.println("Your new balance is: "+(balance-withdrawAmount)); // if the user withdraws a number that is not greater than their balance this line shows the user how much is left in their account
				break; // exits the switch statement and the program ends
			case 3: // if myAnswer is equal to 3 the below code will run
				System.out.println("Your balance is: "+balance); // shows the current balance of the user's account
				break; // exits the switch statement and the program ends
			default: // if myAnswer is not one of the options the below line will be printed to the user
				System.out.println("This is not an option");
				break; // exits the switch statement and the program ends
		}
	}
}
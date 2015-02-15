// Connor Deppert
// CSE02-112
// February 15, 2015
/* This program prompts the user for a number between 1 and 10 (inclusive) and 
proceeds to guess their number through various questions using if-else statements */

import java.util.Scanner; // imports Scanner class

public class WhichNumber {
	public static void main (String [] args) {
		Scanner myScanner = new Scanner( System.in ); // declares instance and constructs Scanner class
		System.out.println("Think of an integer between 1 and 10"); // prompts the user to think of an integer between 1 and 10 (inclusive)
		System.out.print("Is your number even? (Y/N): "); // prompts the user to answer yes or no if their number is even
		String myAnswer = myScanner.next(); // the next String the user enters will be stored in myAnswer
		String yes = "Y"; // declaring and assigning the variable yes
		String no = "N"; // declaring and assigning the variable no
 
		if ( myAnswer.equals(yes) ) { // if the user enters that their number is even this code will run
			System.out.print("Is it divisible by 3? (Y/N): "); // prompts the user to answer yes or no if their number can be divided by 3
			String myAnswer2 = myScanner.next(); // the next string the user enters will be stored in myAnswer2
			if ( myAnswer2.equals(yes) ) { // if the user enters that their number is divisible by 3 the below line will be printed saying that their number is 6
				System.out.println("Your number is 6");
			}
			else if ( myAnswer2.equals(no) ) { // if the user enters that their number is not divisible by 3 the below line will be printed
				System.out.print("Is the number divisible by 4? (Y/N): ");
				String myAnswer4 = myScanner.next(); // the next string the user enters will be stored in myAnswer4
				if ( myAnswer4.equals(yes) ) { // if the user enters that their number is divisible by 4 the below question will be printed
					System.out.print("Is the number divided by 4 greater than 1? (Y/N): "); // prompts the user to answer yes or no if when their number is divided by 4 is greater than 1
					String myAnswer7 = myScanner.next(); // the next String input by the user will be stored in myAnswer7
					if ( myAnswer7.equals(yes) ) { // if the user answers that when their number is divided by 4 is greater than 1 the below line will be printed
						System.out.println("Your number is 8"); 
					}
					else if ( myAnswer7.equals(no) ) { // if the user answers that when their number is divided by 4 is not greater than 1 the below line will be printed 
						System.out.println("Your number is 4");
					}
					else { // if the user does not answer Y or N they will shown the line below telling them that they did not enter a valid input and the program will end
						System.out.println("You did not enter a valid input");
						return; // ends the program
					}
				}
				else if ( myAnswer4.equals(no) ) { // if the user enters that their number is not divisible by 4 the below line will be printed
					System.out.print("Is it divisible by 5? (Y/N): "); 
					String myAnswer8 = myScanner.next(); // the next String the user enters will be stored in myAnswer8
					if ( myAnswer8.equals(yes) ) { // if the user enters that their number is divisible by 5 the below line will be printed
						System.out.println("Your number is 10");
					}
					else if ( myAnswer8.equals(no) ) { // if the user enters that their number is not divisible by 5 the below line will be printed
						System.out.println("Your number is 2");
					}
					else { // if the user does not enter Y or N they will be shown the below line and the program will end
						System.out.println("You did not enter a valid input");
						return; // ends the program
					}
				}
				else { // if the user does not answer Y or N to their number being divisible by 4 they will be shown the line below and the program end
					System.out.println("You did not enter a valid input");
					return; // ends the program
				}
			}
			else { // if the user does not answer Y or N to their number being divisible by 3 they will be shown the line below and the program will end
				System.out.println("You did not enter a valid input");
				return; // ends the program
			}
		}
		else if ( myAnswer.equals(no) ) { // if the user enters that their number is odd this code will run
			System.out.print("Is it divisble by 3? (Y/N): "); // prompts the user to enter if their number is divisible by 3
			String myAnswer3 = myScanner.next(); // the next string the user enters will be stored in myAnswer3
			if ( myAnswer3.equals(yes) ) { // if the user enters yes the below line will printed
				System.out.print("When divided by 3 is the result greater than 1? (Y/N): ");
				String myAnswer5 = myScanner.next(); // the next String the user enters will be stored in myAnswer5
				if ( myAnswer5.equals(yes) ) { // if the user enters that their number when divided by 3 is greater than 1 the below line will be printed
					System.out.println("Your number is 9");
				}
				else if ( myAnswer5.equals(no) ) { // if the user enters that their number when divided by 3 is not greater than 1 the below line will be printed
					System.out.println("Your number is 3");
				}
				else { // if the user does not enter Y or N the below line will be printed and the program will end
					System.out.println("You did not enter a valid input");
					return; // ends the program
				}
			}
			else if ( myAnswer3.equals(no) ) { // if the user enters that their number is not divisible by 3 the below code will run
				System.out.print("Is it greater than 6? (Y/N): "); // prompts the user to answer if their number is greater than 6
				String myAnswer6 = myScanner.next(); // the next string the user enters will be stored in myAnswer6
				if ( myAnswer6.equals(yes) ) { // if the user enters that their number is greater than 6 the below line will be printed
					System.out.println("Your number is 7");
				}
				else if ( myAnswer6.equals(no) ) { // if the user enters that their number is not greater than 7 the below line will print
					System.out.print("Is it less than 3? (Y/N): "); // prompts the user to enter if their number is less than 3
					String myAnswer9 = myScanner.next(); // the next String the user enters will be stored in myAnswer9
					if ( myAnswer9.equals(yes) ) { // if the usr enters that their number is less 3 the below line will be printed
						System.out.println("Your number is 1");
					}
					else if ( myAnswer9.equals(no) ) { // if the user enters that their number is not less than 3 the below line will be printed
						System.out.println("Your number is 5");
					}
					else { // if the user does not enter Y or N to their number being less than 3 the below line will be printed and the program will end
						System.out.println("You did not enter a valid input");
						return; // ends the program
					}
				} 
				else { // if the user does not enter Y or N to their number being greater than 6 the below line will be printed and the program will end
					System.out.println("You did not enter a valid input");
					return; // ends the program
				}
			}
			else { // if the user does not enter Y or N to their number being divisible by 3 the below line will be printed and the program will end
				System.out.println("You did not enter a valid input");
				return; // ends the program
			}
		}
		else { // if the user does not enter either Y or N to their answer being even the below will be printed and the program will end
			System.out.println("You did not enter a valid input");
			return; // ends the program
		}
	}
}
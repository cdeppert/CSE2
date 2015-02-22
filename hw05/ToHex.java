// Connor Deppert
// CSE02-112
// February 22, 2015
/* This program takes a given input of three integers by a user that correspond to RGB values
and outputs what the number would be when converted to hexadecimal */
import java.util.Scanner; // imports Scanner class

public class ToHex {
	public static void main (String [] args) {
		Scanner myScanner = new Scanner ( System.in ); // declares an instance and contstruct the Scanner class
		System.out.print("Please enter three number respresenting RGB values: "); // prompts the user to enter three integers representing RGB values
		if ( myScanner.hasNextInt() ) { // if the first number the user enters is an integer the program will continue to run
		}
		else { // if the first number the user enters is not an integer the below line will be printed and the program will end
			System.out.println("You did not enter an integer");
			return; // ends the program
		}
		int value_R = myScanner.nextInt(); // if the first number entered was in integer it will be stored in value_R
		if ( myScanner.hasNextInt() ) { // if the second number the user enters is an integer the program will continue to run
		}
		else { // if the the second number the user enters is not an integer the below line will be printed and the program will end
			System.out.println("You did not enter an integer");
			return; // ends the program
		}
		int value_G = myScanner.nextInt(); // if the second number entered was an integer it will be stored in value_G
		if ( myScanner.hasNextInt() ) { // if the third number the user enters is an integer the program will continue to run
		}
		else { // if the third number the use enters is not an integer the below line will be printed and the program will end
			System.out.println("You did not enter an integer");
			return; // ends the program
		}
		int value_B = myScanner.nextInt(); // if the third number entered is an integer it will be stored in value_B
		if ( value_R >= 0 && value_R <= 255 ) { // if value_R is greater than or equal to 0 and value_R is less than or equal to 255 the program will continue to run
		}
		else { // if value_R is not greater than or equal to 0 or not less than or equal to 255 the below line will be printed and the program will end
			System.out.println("You did not enter an integer between 0 and 255");
			return; // ends the program
		}
		if ( value_G >=0 && value_G <= 255 ) { // if value_G is greater than or equal to 0 and value_G is less than or equal to 255 the program will continue to run
		}
		else { // if value_G is not greater than or equal to 0 or value_G is not less than or equal to 255 the below line will be printed and the program will end
			System.out.println("You did not enter an integer between 0 and 255");
			return; // ends the program
		}
		if ( value_B >= 0 && value_B <= 255 ) { // if value_B is greater than or equal to 0 and value_B is less than or equal to 255 the program will continue to run
		}
		else { // if value_B if not greater than or equal to 0 or value_B is not less than or equal to 255 the below line will be printed and the program will end
			System.out.println("You did not enter an integer between 0 and 255");
			return; // ends the program
		}
		int hex_value_R = (int) (value_R / 16); // divides value_R by 16 and forces that number to become an integer to see how many times 16 goes into value_R evenly
		String hex_value_R_string = String.valueOf(hex_value_R); // takes the above value and makes it a string
		int hex_value2_R = (value_R % 16); // stores the remainder after value_R is divided by 16
		String hex_value2_R_string = String.valueOf(hex_value2_R); // takes the above value and makes it a string
		
		int hex_value_G = (int) (value_G / 16); // divides value_G by 16 and forces that number to become an integer to see how many times 16 goes into value_G evenly
		String hex_value_G_string = String.valueOf(hex_value_G); // takes the above value and makes it a string
		int hex_value2_G = (value_G % 16); // stores the remainder after value_G is divided by 16
		String hex_value2_G_string = String.valueOf(hex_value2_G); // takes the above value and makes it a string

		int hex_value_B = (int) (value_B / 16); // divides value_B by 16 and forces that number to become an integer to see how many time 16 goes into value_B evenly
		String hex_value_B_string = String.valueOf(hex_value_B); // takes the above value and makes it a string
		int hex_value2_B = (value_B % 16); // stores the remainder after value_B is divided by 16
		String hex_value2_B_string = String.valueOf(hex_value2_B); // takes the above value and makes it a string

		switch (hex_value_R_string) { // if hex_value_R_string is any of the cases it will be changed to the letter that matches it in hexacdemial
			case "10": // if hex_value_R_string is 10 it will be converted to A
				hex_value_R_string = "A";
				break; // exits the switch statement
			case "11": // if hex_value_R_string is 11 it will be converted to B
				hex_value_R_string = "B";
				break; // exits the switch statement
			case "12": // if hex_value_R_string is 12 it will be converted to C
				hex_value_R_string = "C";
				break; // exits the switch statement
			case "13": // if hex_value_R_string is 13 it will be converted to D
				hex_value_R_string = "D";
				break; // exits the switch statement
			case "14": // if hex_value_R_string is 14 it will be converted to E
				hex_value_R_string = "E";
				break; // exits the switch statement
			case "15": // if hex_value_R_string is 15 it will be converted to F
				hex_value_R_string = "F";
				break; // exits the switch statement
		}
	
		switch (hex_value2_R_string) { // if hex_value2_R_string is any of the cases it will be changed to the letter that matches it in hexadecimal
			case "10": // if hex_value2_R_string is 10 it will be converted to A
				hex_value2_R_string = "A"; 
				break; // exits the switch statement
			case "11": // if hex_value2_R_string is 11 it will be converted to B
				hex_value2_R_string = "B";
				break; // exits the switch statement
			case "12": // if hex_value2_R_string is 12 it will be converted to C
				hex_value2_R_string = "C";
				break; // exits the switch statement
			case "13": // if hex_value2_R_string is 13 it will be converted to D
				hex_value2_R_string = "D";
				break; // exits the switch statement
			case "14": // if hex_value2_R_string is 14 it will be converted to E
				hex_value2_R_string = "E";
				break; // exits the switch statement
			case "15": // if hex_value2_R_string is 15 it will be converted to F
				hex_value2_R_string = "F";
				break; // exits the switch statement
			}

		switch (hex_value_G_string) { // if hex_value_G_string is any of the cases it will be changed to the letter that matches it in hexadecimal
			case "10": // if hex_value_G_string is 10 it will be converted to A
				hex_value_G_string = "A";
				break; // exits the switch statement
			case "11": // if hex_value_G_string is 11 it will be converted to B
				hex_value_G_string = "B";
				break; // exits the switch statement
			case "12": // if hex_value_G_string is 12 it will be converted to C
				hex_value_G_string = "C";
				break; // exits the switch statement
			case "13": // if hex_value_G_string is 13 it will be converted to D
				hex_value_G_string = "D";
				break; // exits the swtich statement
			case "14": // if hex_value_G_string is 14 it will be converted to E
				hex_value_G_string = "E";
				break; // exits the switch statement
			case "15": // if hex_value_G_string is 15 it will be converted to F
				hex_value_G_string = "F";
				break; // exits the switch statement
		}
		
		switch (hex_value2_G_string) { // if hex_value2_G_string is any of the cases it will be changed to the letter that matches it in hexadecimal
			case "10": // if hex_value2_G_string is 10 it will be converted to A
				hex_value2_G_string = "A";
				break; // exits the switch statement
			case "11": // if hex_value2_G_string is 11 it will be converted to B
				hex_value2_G_string = "B";
				break; // exits the switch statement
			case "12": // if hex_value2_G_string is 12 it will be converted to C
				hex_value2_G_string = "C";
				break; // exits the switch statement
			case "13": // if hex_value2_G_string is 13 it will be converted to D
				hex_value2_G_string = "D";
				break; // exits the switch statement
			case "14": // if hex_value2_G_string is 14 it will be converted to E
				hex_value2_G_string = "E";
				break; // exits the switch statement
			case "15": // if hex_value2_G_string is 15 it will be converted to F
				hex_value2_G_string = "F";
				break; // exits the switch statement
		}
		
		switch (hex_value_B_string) { // if hex_value_B_string is any of the cases it will be changed to the letter that matches it in hexadecimal
			case "10": // if hex_value_B_string is 10 it will be converted to A
				hex_value_B_string = "A";
				break; // exits the switch statement
			case "11": // if hex_value_B_string is 11 it will be converted to B
				hex_value_B_string = "B";
				break; // exits the switch statement
			case "12": // if hex_value_B_string is 12 it will be converted to C
				hex_value_B_string = "C";
				break; // exits the switch statement
			case "13": // if hex_value_B_string is 13 it will be converted to D
				hex_value_B_string = "D";
				break; // exits the switch statement
			case "14": // if hex_value_B_string is 14 it will be converted to E
				hex_value_B_string = "E";
				break; // exits the switch statement
			case "15": // if hex_value_B_string is 15 it will be converted to F
				hex_value_B_string = "F";
				break; // exits the switch statement
		}
		
		switch (hex_value2_B_string) { // if hex_value2_string is any of the cases it will be changed to the letter that matches it in hexadecimal
			case "10": // if hex_value2_B_string is 10 it will be converted to A
				hex_value2_B_string = "A";
				break; // exits the switch statement
			case "11": // if hex_value2_B_string is 11 it will be converted to B
				hex_value2_B_string = "B";
				break; // exits the switch statement
			case "12": // if hex_value2_B_string is 12 it will be converted to C
				hex_value2_B_string = "C";
				break; // exits the switch statement
			case "13": // if hex_value2_B_string is 13 it will be converted to D
				hex_value2_B_string = "D";
				break; // exits the switch statement
			case "14": // if hex_value2_B_string is 14 it will be converted to E
				hex_value2_B_string = "E";
				break; // exits the switch statement
			case "15": // if hex_value2_B_string is 15 it will be converted to F
				hex_value2_B_string = "F";
				break; // exits the switch statement
		} 
		System.out.println("The decimal numbers R:"+value_R+", G:"+value_G+", B:"+value_B+", is represented in hexadecimal as: "+
			hex_value_R_string+""+hex_value2_R_string+""+hex_value_G_string+""+hex_value2_G_string+""+hex_value_B_string+""+hex_value2_B_string); // prints out the hexacdemial number to the user
	}
}
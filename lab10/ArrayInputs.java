// Connor Deppert
// CSE02-112
// April 3, 2015
/* This program takes a given input for the size of array with the integers to go 
inside and then prints out the array for the user */
import java.util.Scanner; // imports Scanner class

public class ArrayInputs {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner (System.in); // declaring and constructing an instance of the Scanner class
        int i = 0; // declaring and assigning 0 to i
        int [] myArray; // declaring myArray
        int arraySize = 0; // declaring and assigning 0 to arraySize
        while (arraySize <= 0 ) { // while arraySize is less than or equal to 0 the loop will run
             System.out.print("Please enter an integer for the size of an array: "); // prompts the user to enter an integer for the size of their array
             arraySize = myScanner.nextInt(); // stores the user's input into arraySize
        }
        myArray = new int [arraySize]; // allocating myArray with the amount the user input for arraySize
        while (i < arraySize) { // while i is less than the given input array size this loop will run
            System.out.print("Please enter an integer: "); // prompts the user to enter an integer
            int number = check(myScanner);  // calls check method and passes myScanner as input
            if (number < 0) { // if the number the user entered is less than 0 the continue command will run
                continue; // continue statement
            }
            myArray[i] = number; // assigns the user input number to myArray sub the current value of i 
            i++; // increments i by 1
        }
        System.out.println("The array is: "); // prints out to the user
        i = 0; // initializes i back to 0 for the next loop
        while (i < arraySize) { // while i is less than arraySize this loop will run
            System.out.println(myArray[i]); // prints out the current value of myArray sub the current value of i
            i++; // increments i by 1
        }
        
    }
    public static int check (Scanner myScanner) { // creating the method check with a return value of an integer and an input of a scanner
            if ( !myScanner.hasNextInt() ) { // if the user didn't enter an integer the below code will run
                myScanner.next(); // clears out what the user entered 
                System.out.println("You did not enter an integer"); // prints to user 
                return -1; // returns -1
            }
            int myNumber = myScanner.nextInt(); // if the user entered an integer it will be stored into myNumber
            if (myNumber < 0  ) { // if myNumber is less than 0 this code will run
                System.out.println("You did not enter a positive integer"); // prints out to the usre
                return -1; // returns -1
            }
            else { // if the user's input was greater than or equal to 0 the below code will run
                return myNumber; // returns the user's input number
            }
        }
        
}
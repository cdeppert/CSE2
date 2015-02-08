// Connor Deppert
// CSE02-112
// February 9. 2015
/* This program takes a number the user inputs and prints out the four digits to 
the right of the decimal point */

import java.util.Scanner; // imports the Scanner class into the program

public class FourDigits {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); // declaring an instance and constructing the Scanner class
        System.out.print("Enter a double (xx.xx): "); // prompting the user to enter a double
        double myDouble = myScanner.nextDouble(); // the next double the user enters will be stored in myDouble
        int myNumber1 = (int) (myDouble * 10) % 10; /* takes the double the user enters and multiplies it by 10, explicitly casts
            that number to an integer, divides it by 10 and stores the double in myNumber1 */
        int myNumber2 = (int) (myDouble * 100) % 10; /* takes the double the user enters and multiplies it by 100, explicitly casts
            that number to an integer, divides it by 10 and stores the remiander in myNumber2 */
        int myNumber3 = (int) (myDouble * 1000) % 10; /* takes the double the user enters and multiplies it by 1000, explicitly casts
            that number to an integer, divides it by 10 and stores the remainder in myNumber3 */
        int myNumber4 = (int) (myDouble * 10000) % 10; /* takes the double the user enters and multiplies it by 10000, explicitly casts
            that number to an integer, divides it by 10 and stores the remainder in myNumber4 */
        System.out.println("The four digits are: "+myNumber1+""+myNumber2+""+myNumber3+""+myNumber4); /* prints out myNumber1, myNumber2, myNumber3, myNumber4 next
            to one another and gives the user the four digits to the right of the decimal point of the number they input */
    }
}
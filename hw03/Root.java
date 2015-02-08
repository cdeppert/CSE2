// Connor Deppert
// CSE02-112
// February 9, 2015
/* This program takes a given number and prints out an estimate of the cube root 
of that number */

import java.util.Scanner; // imports the Scanner class into the program

public class Root {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); // declaring the instance and constructing the Scanner class
        System.out.print("Enter a double to find the cube root: "); // prompting the user to enter a double
        double myNumber = myScanner.nextDouble(); // the next double the user enters will be stored in myNumber
        double guess1 = myNumber / 3; // taking the entered number and dividing it by 3 as guess1
        double guess2 = (2*guess1*guess1*guess1+myNumber)/(3*guess1*guess1); // ((2 * guess1 cubed) + the number entered) / (3 * guess1 squared)
        double guess3 = (2*guess2*guess2*guess2+myNumber)/(3*guess2*guess2); // ((2 * guess2 cubed) + the number entered) / (3 * guess2 squared)
        double guess4 = (2*guess3*guess3*guess3+myNumber)/(3*guess3*guess3); // ((2 * guess3 cubed) + the number entered) / (3 * guess3 squared)
        double guess5 = (2*guess4*guess4*guess4+myNumber)/(3*guess4*guess4); // ((2 * guess4 cubed) + the number entered) / (3 * guess4 squared)
        double guess6 = (2*guess5*guess5*guess5+myNumber)/(3*guess5*guess5); // ((2 * guess5 cubed) + the number entered) / (3 * guess5 squared)
        double cube = guess6 * guess6 * guess6; // cubing the final guess
        System.out.println("The cube root is "+guess6); // printing out what the cube root is to the user
        System.out.println(guess6+"*"+guess6+"*"+guess6+"="+cube); // displays what the answer is when the cube root is cubed
    }
}
// Connor Deppert
// CSE02-112
// February 6, 2015
/* This program asks the user for a certain amount of Big Macs, the price per Big Mac and the tax rate and 
then calculates the total cost of the purchase with the given information */

import java.util.Scanner; // imports the Scanner class into the program

public class BigMac {
    public static void main (String [] args) {
        Scanner myScanner; // declaring an instance: myScanner
        myScanner = new Scanner(System.in); // calling the Scanner constructor and constructing an instance of the Scanner class
        System.out.print("Enter the number of Big Macs (an integer > 0): "); // asks user how many Big Macs are being purchased
        int nBigMacs = myScanner.nextInt(); // whatever the next integer that the user inputs will be stored in nBigMacs
        System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): "); // asks user what the cost of one Big Mac is
        double bigMac$ = myScanner.nextDouble(); // whatever the next double that the user inputs will be stored in bigMac$
        System.out.print("Enter the percent tax as a whole number (xx): "); // asks user what the tax is in their respective location
        double taxRate = myScanner.nextDouble(); // whatever the next double that the user inputs will be stored in taxRate
        taxRate/=100; // takes the tax rate, which was inputted as a whole number, and divides it by 100 to get a proportion
        double cost$; // declaring the variable cost$ which is the total cost of the Big Mac purchase
        int dollars; // declaring the dollar amount of the purchase
        int dimes; // declaring the dimes section of the total amount, or the tenths place of the decimal
        int pennies; // declaring the pennies section of the total amount, or the hundreths place of the decimal
        cost$ = nBigMacs * bigMac$ * (1+taxRate); // formula for finding the total cost of the purchase (number of BigMacs * cost of one Big Mac * (1 + the tax rate))
        dollars = (int) cost$; // explicitly casting the total cost to be an integer to get the dollar integer of the total cost
        dimes = (int) (cost$ * 10) % 10; // taking the cost and mulitplying it by 10, explicitly casting that number to an integer and then dividing it by 10 and using the reaminder as the dimes, or tenths place, of the total cost
        pennies = (int) (cost$ * 100) % 10; // taking the cost and multiplying it by 100, explicitly casting that number to an integer and then dividing it by 10 and using the remainder as the pennies, or hundreths place, of the total cost
        System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+bigMac$+" per Big Mac, with a sales tax of "+(int)(taxRate*100)+
        "%, is $"+dollars+'.'+dimes+pennies); // displays total cost to the user after entering all their information
    }
}
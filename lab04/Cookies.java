// Connor Deppert
// CSE02-112
// February 13, 2015
/* This program takes an input of number of people, the number of cookies being bought,
how many cookies each person gets and displays whether they will be divided evenly,
if there are not enough cookies, or if they will not divide evenly */

import java.util.Scanner; // importing Scanner class

public class Cookies {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner ( System.in ); // decalring an instance and constructing the Scanner class
        System.out.print("Enter the number of people: "); // prompting the user to enter the number of people they want to split the cookies between
        if ( myScanner.hasNextInt() ) { // if the user enters and integer the program will continue to run
       
        }
       
        else {
            System.out.println("You did not enter an integer"); // if a user enters something other than an integer they will be prompted that they did not and the program will end
            return; // ends the program
       
        }
       
        int numberOfPeople = myScanner.nextInt(); // the next integer the user enters will be stored in numberOfPeople
       
        if ( numberOfPeople > 0 ) { // if the numberOfPeople > 0  the program will continue to run
       
        }
       
        else { // if the numberOfPeople is not > 0 the below line will be printed and the program will end
            System.out.println("You did not enter an integer greater than 0"); 
            return; // ends the program
        
        }
        
        System.out.print("Enter the number of cookies you are planning to buy: "); // prompts the user to enter the numbe of cookies they plan to buy
        
        if ( myScanner.hasNextInt() ) { // if the user enters and integer the program will continue to run
        
        }
        else { // if the user enters something other tha integer the below line will be printed and the program will end
            System.out.println("You did not enter an integer");
            return; // ends the program
        }
        
        int numberOfCookies = myScanner.nextInt(); // the next integer the user enters will be stored in numberOfCookies
      
        if ( numberOfCookies > 0 ) { // if numberOfCookies is greater than 0 the program will continue to run
        
        }
        else { // if the user enters a number less than or equal to 0 the below line will be printed and the program will end
            System.out.println("You did not enter an integer > 0");
            return; // ends the program
        }
        
        System.out.print("How many do you want each person to get? "); // prompts the user to enter how many cookies he wants each person to get
        
        if ( myScanner.hasNextInt() ) { // if the user enters an integer the program will continue to run
        
        }
        else { // if the user does not enter an integer the below line will be printed and the program will end
            System.out.println("You did not enter an integer");
            return; // ends the program
        }
        
        int cookiesPerPerson = myScanner.nextInt(); // the next integer the user enters will be stored in cookiesPerPerson
        if ( cookiesPerPerson > -1 ) { // if the integer the user enters is greater than -1 the program will continue to run
            
        }
        else { // if the user enters an integer less than or equal to -1 the below line will be printed and the program will end
            System.out.println("You did not enter a positive number"); 
            return; // ends the program
        }
        
        if ( numberOfCookies % numberOfPeople != 0 ) { // if this condition is satisfied the below line will be printed
            System.out.println("You have enough, but they will not divide evenly");
        }
        else if ( (numberOfCookies / numberOfPeople ) >= (cookiesPerPerson) ) { // if the above condition is not satisfied and this one is the below line will be printed
            System.out.println("You have enough cookies for each person and the amount will divide evenly");
        }
        else { // if neither of the two conditions are satisfied than the line below will be printed
            System.out.println("You will not have enough cookies. You will need to buy at least "+((cookiesPerPerson * numberOfPeople)-(numberOfCookies))+" more");
        }
    }
}
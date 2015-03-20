// Connor Deppert
// CSE02-112
// March 22, 2015
// This program is a game and results in different out puts based on the users input
import java.util.Scanner; // imports Scanner class
public class HW8 {
    public static void main(String[] args) { 
    char option; // declaring option as a char
    Scanner scan = new Scanner(System.in); // declaring and constructing a Scanner class
    System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!"); // message to user
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-"); // prompts the user if they want to continue
    String input = getInput(scan, "Cc"); // obtains input from the user after calling getInput method
    System.out.println("You are in a dead valley."); // message to user
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-"); // prompts the user if they want to continue
    input = getInput(scan, "Cc"); // obtains input from the user after calling getInput method
    System.out.println("You walked and walked and walked and you saw a cave!"); // message to user
    cave(); // calls cave mtheod
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-"); // prompts the user if they want to continue
    input = getInput(scan, "Cc"); // obtains input from user after calling getInput method
    System.out.println("You entered a cave!"); // message to user 
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-"); // prompts the user if they want to continue
    input = getInput(scan, "Cc"); // obtains input from user after calling getInput method
    System.out.println("Unfortunately, you ran into a GIANT!"); // message to user
    giant(); // calls giant method
    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD"); // prompts user 
    input = getInput(scan, "AaEe", 10); // obtains input from user after calling getInput method
    System.out.println("Congratulations! You SURVIVED! Get your REWARD!"); // message to user
    System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!"); // prompts the user
    box(); // calls box method
    input = getInput(scan); // obtains input from user after calling getInput method
    System.out.println("Hero! Have a good day!"); // message to user
    }
    // GIANT METHOD
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    // CAVE METHOD
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    // BOX METHOD
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    // getInput method
    public static String getInput (Scanner scan, String string) {
        String input = scan.next(); // obtains users input and stores it into input
        String upperC = "C"; // declaring and assigning C to upperC
        String lowerC = "c"; // declaring and assigning c to lowerC
        String clear = ""; // to clear out of method
        if (input.equals(upperC) || input.equals(lowerC) ) { // tests to see if the user input C or c
            return input; // returns input the user entered
        }
        else { // if the user didn't answer C or c the below code will run
            System.out.println("Yea right loser"); // message to user
            System.exit(0); // terminates whole program
            return clear; // exits this method
        }
    }
   
   public static String getInput (Scanner scan) {
       int input = scan.nextInt(); // obtains users input and stores it into input
       String clear = ""; // delcaring and assigning "" to clear
       switch (input) { // creates a switch statement with input
           case 1: // if input is 1 this code will run
            System.out.println("You won.");
            return clear; // exits this method
           case 2: // if input is 2 this code will run
            System.out.println("You're a winner");
            return clear; // exits this method
           case 3: // if input is 3 this code will run
               System.out.println("You're not a loser");
               return clear; // exits this method
           default: // if anyting but 1, 2, 3 is entered this code will run
            System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
            System.exit(0); // ends the whole program
            return clear; // exits this method
       }
   }
   
   public static String getInput (Scanner scan, String string, int trial) {
        String input = scan.next(); // obtains users iput and stores in into input
        String upperA = "A"; // declaring and assigning A to upperA
        String lowerA = "a"; // declaring and assigning a to lowerA
        String upperE = "E"; // declaring and assigning E to upperE
        String lowerE = "e"; // declaring and assigning e to lowerE
        String clear = ""; // declaring and assigning "" to clear
        while ( input.equals(upperA) || input.equals(lowerA) || input.equals(upperE) || input.equals(lowerE) ) { // if the user enters A, a, E or e this loop will run
            if ( input.equals(upperA) || input.equals(lowerA) ) { // if the user enters A or a this code will run
                int randomNumber =  (int) (Math.random()*2); // generates 0 or 1 randomly
                if ( randomNumber == 0 ) { // if the randomly generated number is 0 this code will run
                    System.out.println("Critical hit"); // prints out to user
                    --trial; // subtracts one from trial
                    if (trial == 0) { // if trial reaches 0 the below code will run 
                        System.out.println("You killed the giant!"); // prints out to user
                        return clear; // exits this method
                    }
                } 
                else { // if the randomly generated number is 1 this code will run
                    System.out.println("You missed"); // prints out to user
                } 
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD"); // prompts the user
            input = scan.next(); // stores the users input
            }
       // IF E OR e IS ENTERED
            else { // if E or e is entered this code will run
                int newNumber = 1+ (int) (Math.random() *10); // generates a random number between 1 and 10
                    if (newNumber == 10) { // if the randomly generated number is 10 this code will run
                        System.out.println("You escaped successfully"); // prints to the user
                        System.exit(0); // terminates the whole program
                        return clear; // exits this method
                    }
                    else { // if the randomly generated number is not 10 this code will run
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD"); // prompts the user 
                        input = scan.next(); // stores the users input
                    } 
            } 
        } 
        if ( !input.equals(upperA) || !input.equals(lowerA) || !input.equals(upperE) || !input.equals(lowerE) ) { // if the user does not enter A, a, E or e this code will run
            System.out.println("Executed by the GIANT! Game Over!"); // prints to the user
            System.exit(0); // terminates the whole program
            return clear; // exits this method
        }  
    return clear; // exits this method
       
   }
}
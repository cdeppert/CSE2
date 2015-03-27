// Connor Deppert

import java.util.Random; // imports Random class 
import java.util.Scanner; // imports Scanner class

public class Methods {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner (System.in); // declaring and constructing an instance for the Scanner class
        Random randomGenerator = new Random(); // declaring and constructing an instance for the Random class
        String userAnswer; // delcaring userAnswer as a String
        do { // starting a do-while loop
            int randomInt = randomGenerator.nextInt(10); // generating a random integer between 0 and 10
            String mySentence = "The"; // declaring and initializing mySentence 
            mySentence += Adjectives(randomInt); // calling Adjectives method and adding the return to mySentence
            mySentence += Subject(randomInt); // calling Subject method and adding the return to mySentence
            mySentence += Verbs(randomInt); // calling Verbs method and adding the return to mySentence
            mySentence += (" the"); // adding " the" to mySentence
            mySentence += Adjectives(randomInt); // calling Adjectives method and adding the return to mySentence
            mySentence += Objects(randomInt); // calling Objects method and adding the return to mySentence
            System.out.println(mySentence); // printing out mySentence
            System.out.print("Would you like another sentence? (Y/N) "); // prompting the user to enter if they would like a new sentence
            userAnswer = myScanner.next(); // stores the user answer into userAnswer
        } while (userAnswer.equals("Y")); // if the user entered Y the user will get a new sentence
        
    }
    public static String Adjectives (int number) { // creating a method called Adjectives
        switch (number) { // beginning of a switch statment
            case 0: // if the randomly generated int is 0 this will be returned
                return " purple";
            case 1: // if the randomly generated int is 1 this will be returned
                return " small";
            case 2: // if the randomly generated int is 2 this will be returned
                return " large";
            case 3: // if the randomly generated int is 3 this will be returned
                return " yellow"; 
            case 4: // if the randomly generated int is 4 this will be returned
                return " annoying";
            case 5: // if the randomly generated int is 5 this will be returned
                return " loud";
            case 6: // if the randomly generated int is 6 this will be returned
                return " quiet";
            case 7: // if the randomly generated int is 7 this will be returned
                return " blue";
            case 8: // if the randomly generated int is 8 this will be returned
                return " red";
            case 9: // if the randomly generated int is 9 this will be returned
                return " tall";
        }
        return ""; // returns nothing if number isn't 0 - 9
    }
    public static String Subject (int number) {
        switch (number) {
            case 0: // if the randomly generated int is 0 this will be returned
                return " cat";
            case 1: // if the randomly generated int is 1 this will be returned
                return " dog";
            case 2: // if the randomly generated int is 2 this will be returned
                return " mouse";
            case 3: // if the randomly generated int is 3 this will be returned
                return " horse";
            case 4: // if the randomly generated int is 4 this will be returned
                return " man";
            case 5: // if the randomly generated int is 5 this will be returned
                return " woman";
            case 6: // if the randomly generated int is 6 this will be returned
                return " girl";
            case 7: // if the randomly generated int is 7 this will be returned
                return " boy";
            case 8: // if the randomly generated int is 8 this will be returned
                return " teacher";
            case 9: // if the randomly generated int is 9 this will be returned
                return " student";
        }
        return ""; // returns nothing if number isn't 0 - 9
    }
    
    
    public static String Verbs (int number) {
        switch (number) {
            case 0: // if the randomly generated int is 0 this will be returned
                return " passed";
            case 1: // if the randomly generated int is 1 this will be returned
                return " walked";
            case 2: // if the randomly generated int is 2 this will be returned
                return " hit";
            case 3: // if the randomly generated int is 3 this will be returned
                return " remembered";
            case 4: // if the randomly generated int is 4 this will be returned
                return " taught";
            case 5: // if the randomly generated int is 5 this will be returned
                return " pushed";
            case 6: // if the randomly generated int is 6 this will be returned
                return " moved";
            case 7: // if the randomly generated int is 7 this will be returned
                return " observed";
            case 8: // if the randomly generated int is 8 this will be returned
                return " drove";
            case 9: // if the randomly generated int is 9 this will be returned
                return " served";
        }
        return ""; // returns nothing if number isn't 0 - 9
    }
    public static String Objects (int number) {
        switch (number) {
            case 0: // if the randomly generated int is 0 this will be returned
                return " person";
            case 1: // if the randomly generated int is 1 this will be returned
                return " adult";
            case 2: // if the randomly generated int is 2 this will be returned
                return " professor";
            case 3: // if the randomly generated int is 3 this will be returned
                return " parent";
            case 4: // if the randomly generated int is 4 this will be returned
                return " brother";
            case 5: // if the randomly generated int is 5 this will be returned
                return " sister";
            case 6: // if the randomly generated int is 6 this will be returned
                return " mouse";
            case 7: // if the randomly generated int is 7 this will be returned
                return " neighbor";
            case 8: // if the randomly generated int is 8 this will be returned
                return " friend";
            case 9: // if the randomly generated int is 9 this will be returned
                return " officer";
        }
        return ""; // returns nothing if number isn't 0 - 9
        
    }
}
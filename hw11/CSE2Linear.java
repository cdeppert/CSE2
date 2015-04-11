import java.util.Random; // imports Random class
import java.util.Scanner; // imports Scanner class

public class CSE2Linear {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner (System.in); // declaring and constructing an instance of the Scanner class
        int [] myGrades = new int[15];
        System.out.println("Enter 15 ints for final grades in CSE2:"); // prompts the user to enter 15 ints
        int i = 0; // delcares and assigns 0 to i
        int startValue = 0; // declares and assigns 0 to startValue
        while (i < 15) { // while i is less than 15 this loop will run
            if ( !myScanner.hasNextInt() ) { // the user does not enter an integer this code will run
                myScanner.next(); // clears out what the user entered
                System.out.println("You did not enter an integer!"); // prints to the user
                continue; // skips the rest of the loop body
            }
            int myNumber = myScanner.nextInt(); // declaring and assigning myNumber to the next integer the user enters
            if ( myNumber < 0 || myNumber > 100) { // if the user did not enter an int between 0 and 100 this code will run
                System.out.println("You did not enter an integer between 0 and 100!"); // prints to user
                continue; // skips the rest of the loop body
            }
            else if ( myNumber < startValue) { // if the the user did not enter an integer greater than or equal to the last input number this code will run
                System.out.println("You did not enter an integer >= the last value!"); // prints to user
                continue; // skips the rest of the loop body
            } 
            else { // if the two above conditions are not satisfied than the below code will run
                startValue = myNumber; // stores the value of myNumber into startValue
                myGrades[i] = myNumber; // the value of myNumber is stored into myGrades sub i;
            }
            i++; // increases i by 1
        }
        System.out.print("The grades, sorted, are: "); // prints to the user
        for (i = 0; i < 15; i++) { // while i is less than 15 this loop will run
            System.out.print(myGrades[i]+" "); // prints to the user
        }
        System.out.println(); // enters a new line
        System.out.print("Enter a grade to search for: "); // prompts user
        int x = 0; // declares and assigns 0 to x
        int searchValue = 0;
        while (x < 1) { // while x is less than 1 this code will run
            if ( !myScanner.hasNextInt() ) { // if the user did not enter an integer this code will run
                myScanner.next(); // clears out what the user enters
                System.out.println("You did not enter an integer!"); // prints to the user
                continue; // skips the rest of the loop body
            }
            searchValue = myScanner.nextInt(); // stores the integer the user entered into searchValue
            if ( searchValue < 0 || searchValue > 100) { // if the user did not enter an integer between 0 and 100 this code will run
                System.out.println("You did not enter a value between 0 and 100!"); // prints to the user
                continue; // skips the rest of the loop body
            }
            x++; // increments x by 1
        }  
        binarySearch(searchValue, myGrades); // calls binarySearch method
        scramble(myGrades); // calls scramble method
        System.out.println(); // adds a new line
        System.out.print("Enter a grade to search for: "); // prints to user
        x = 0; // assigns 0 to x
        int scrambleValue = 0; // declares and assigns 0 to scrambleValue
        while (x < 1) { // while x is less than 1 this loop will run
            if (!myScanner.hasNextInt() ) { // if the user does not enter an integer this code will run
                myScanner.next(); // clears out what the usre input
                System.out.println("You did not enter an integer!"); // prints to user
                continue; // skips the rest of the loop
            }
            scrambleValue = myScanner.nextInt(); // the next integer the user enters will be stored into scrambleValue
            if ( scrambleValue < 0 || scrambleValue > 100 ) { // if the user does not enter an integer between 0 and 100 this code will run
                System.out.println("You did not enter a value between 0 and 100"); // prints to user
                continue; // skips the rest of the loop body
            }
            x++; // iterates x by one
        }
        linearSearch(scrambleValue, myGrades); // calls linearSearch method
    }
    // BINARY SEARCH METHOD
    public static void binarySearch(int value, int [] array) {
        int low = 0; // delcaring and assigning 0 to low
        int high = 14;  // delcaring and assigning 14 to high
        int iteration = 1; // delcaring and assigning 1 to iteration
        int mid = 0; // delcaring and assigning 0 to mid
        while (high >= low) { // while high is greater than or equal to low this loop will run
            mid = (high + low) / 2;  // sets mid to (high + low) / 2
            if ( value == array[mid] ) { // if value is equal to array sub mid this code will run
                System.out.println(value+" was found in the list with "+iteration+" iterations"); // prints to user
                break; // breaks loop
            }
            else if ( value > array[mid] ) { // if value is greater than array sub mid this code will run
                low = mid + 1; // adds 1 to mid and assigns it to low
            }
            else { // if both of the booleans are false than the below code will run
                high = mid - 1; // subtracts 1 from mid and assigns it to high
            }
            iteration++; // adds one to iteration 
        }
        if ( value != array[mid] ) { // if value never equals array sub mid this code will run
            System.out.println(value+" was not found in the list with "+iteration+" iterations"); // prints to user
        } 
    }
    // METHOD TO SCRAMBLE ARRAY
    public static void scramble (int [] array) {
        Random randomGenerator = new Random (); // declaring and constructing an instance for the Random class
        for (int i = 0; i < array.length; i++) { // while i is less than the length of array this loop will run
            int number = randomGenerator.nextInt(15); // declaring and assigning a random number between 0 and 14 to number
            int value = array[number]; // taking the value at array sub number and and assigning it to value
            array[number] = array[i]; // taking the value of array sub i and setting it as the value of array sub number
            array[i] =  value;  // assigning value to array sub i 
        }
        System.out.println("Scrambled: "); // prints to user
        for (int x = 0; x < array.length; x++) { // whil ex is less than the length of array this loop will run
            System.out.print(array[x]+" "); // prints to user
        }
    }

    // LINEARCH SEARCH METHOD
    public static void linearSearch(int val, int [] array) {
        int iteration = 1; // delcaring and assigning 1 to iteration
        int i; // declaring i 
        for (i = 0; i < 15; i++) { // while i is less than 15 this loop will run
            if (array[i] == val) { // if val is equal to array sub i this code will run
                System.out.println(val+" was found in the list with "+iteration+" iterations"); // prints to user
                break; // exits loop
            }
            ++iteration; // increments iteration by 1
        }
        if ( array[i] != val) { // if array sub i never equals val this code will run
            System.out.println(val+" was not found in the list with "+iteration+" iterations"); // prints to user
        }
    }
}
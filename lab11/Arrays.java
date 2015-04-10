import java.util.Scanner; // imports Scanner class
import java.util.Random; // imports Random class

public class Arrays {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner (System.in); // declaring and constructing an instance for the Scanner classs
        Random randomGenerator = new Random (); // declaring and constructing a randomGenerator
        
        int [] array1 = new int [50]; // delcaring and allocating 50 integers worth of space for array1
        int [] array2 = new int [50]; // delcaring and allocating 50 integers worth of space for array2
       
        int myNumber; // declaring an int myNumber
        // FILLS ARRAY1 WITH 50 INTS
        for (int i = 0; i < 50; i++) { // while i is less than 50 this loop will run
            myNumber = randomGenerator.nextInt(101); // generates a random number between 0 and 100 and stores it into myNumber
            array1[i] = myNumber; // at array sub i the previously generated random number will be stored as the value
        }
        // FILLS ARRAY2 WITH 50 INTS
        int myNumber2 = 0; // declaring and assigning myNumber2 to 0
        for (int z = 0; z < 50; z++) { // while z is less than 50 this loop will run
            myNumber2 += randomGenerator.nextInt(101); // generates a random number between 0 and 100 and adds it to the current value of myNumber2 and stores it
            array2[z] = myNumber2; // the current value of myNumber2 will be stored into array2 sub z
            
        }
        // FINDS THE MIN VALUE OF ARRAY1
        int minStart = 101; // declaring and assigning minStart to 101
        for (int x = 0; x < 50; x++) { // while x is less than 50 this loop will run
            if ( array1[x] < minStart ) { // if array1 sub x is less than minStart the below code will run
                minStart = array1[x]; // the value of array1 sub x will be stored into minStart
            }
        } 
        System.out.println("The minimum of array1 is: "+minStart); // prints to user
        // FINDS THE MAX VALUE OF ARRAY1
        int maxStart = -1; // declaring and assigning maxStart to -1
        for (int i = 0; i < 50; i++) { // while i is less than 50 this loop will run
            if (array1[i] > maxStart) { // if array1 sub i is greater than maxStart the below code will run
                maxStart = array1[i]; // array1 sub i becomes maxStart
            }
        }
        System.out.println("The maximum of array1 is: "+maxStart); // prints to user
        
        // FINDS THE MIN VALUE OF ARRAY2 
        minStart = 6000; // assigning minStart to 6000
        for (int x = 0; x < 50; x++) { // while x is less than 50 this loop will run
            if ( array2[x] < minStart ) { // if array2 sub x is less than minStart the below code will run
                minStart = array2[x]; // array2 sub x will be stored into minStart
            }
        }
        System.out.println("The minimum of array2 is: "+minStart); // prints to user
        // FINDS THE MAX VALUE OF ARRAY2
        maxStart = -1; // assigning maxStart to -1
        for (int i = 0; i < 50; i++) { // while i is less than 50 this code will run
            if ( array2[i] > maxStart ) { // if array2 sub i is greater than maxStart the below code will run
                maxStart = array2[i]; // the value of array2 sub i is assigned to maxStart
            }
        }
        System.out.println("The maximum of array2 is: "+maxStart); // prints to user
        // PROMPTS USER FOR AN INPUT TO SEARCH FOR
        System.out.print("Enter an int: "); // prints to user
        int userInput = 0;
        if ( !myScanner.hasNextInt() ) { // if the user did not enter an integer the below code will run
            System.out.println("You did not enter an int"); // prints to the user
            return; // ends program
        }
            else {
            userInput = myScanner.nextInt(); // stores the user's integer into userInput
            if (userInput <= 0) { // if userInput is less than or equal to 0 the below code will run
                System.out.println("You did not enter an integer > 0"); // prints to user
                return; // ends program
            }
            }
        // SORTS ARRAY2 FOR BINARY SEARCH
        for (int i = 0; i < array2.length - 1; i++) { // while i is less than the length of array2 - 1 the loop will run
            int currentMin = array2[i]; // declares and assigns currentMin to value at array2 sub i
            int currentMinIndex = i; // declares and assigns currentMinIndex to i
            for (int z = i + 1; z < array2.length; z++) { // while z is less than array2 length this loop will run
                if (currentMin > array2[z] ) { // if the currentMin is greater than array2 sub z the below code will run
                    currentMin = array2[z]; // array2 sub z becomes the new current min
                    currentMinIndex = z; // z becomes the new currentMin index
                }
            }
                if (currentMinIndex != i ) { // if the currentMinIndex is not equal to i this code will run
                    array2[currentMinIndex] = array2[i]; // takes the value at array2 sub i and moves it to where 
                    array2[i] = currentMin; // takes currentMin and moves it to array2 sub i 
                }
        }
        // SEARCHES FOR USER'S INPUT IN ARRAY2
        int low = 0; // declares and assigns 0 to low
        int high = array2.length - 1; // declares and assigns high to the length of array2 minus 1
        
        while (high >= low) { // while high is greater than or equal to low this loop will run
            int mid = (high + low) / 2; // declares and assigns mid to high plus low divided by 2
            if (array2[mid] == userInput) { // if the value at the mid index is equal to the user input this code will run
                System.out.println("Your number was found in the list"); // prints to user
                return; // program ends
            }
            else if ( array2[mid] > userInput ) { // if the value at the mid index is greater than the userInput
                high = mid - 1; // high now becomes mid minus 1
                
            }
            else { // if the value at the mid index is less than the userInput
                low = mid + 1; // low now becomes mid plus 1

            }
        }
        System.out.println("Your number was not found"); // prints to user
        System.out.println("The number above was: "+array2[low]); // prints to user
        System.out.println("The number below was: "+array2[high]); // prints to user
        
    }
}
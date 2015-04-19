// Connor Deppert
// CSE02-112
// April 19, 2015
/* This program takes a user input matrix size and then checks to see if the two 
matrices can be multiplied, if they can then they will be multiplied and the user will be shown the result */
import java.util.Scanner; // imports Scanner class

public class Multiply {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner (System.in); // declaring and constructing an instance of the Scanner class
        System.out.println("Array 1"); // message to user
        System.out.print("Width: ");
        while ( !myScanner.hasNextInt() ) { // while the user does not enter an integer this code will run
            myScanner.hasNext(); // clears out what the user enters
            System.out.println("You did not enter an integer"); // prompts the user
        }
        int width1 = myScanner.nextInt(); // stores the integer the user enters into width1
        while (width1 < 0) { // while width is negative this loop will run
            System.out.println("You did not enter a positive integer"); // prints to user
            width1 = myScanner.nextInt(); // stores the users input into width1
        }
        System.out.print("Height: "); 
        while ( !myScanner.hasNextInt() ) { // while the user does not enter an integer this loop will run
            myScanner.hasNext(); // clears out what the user entered
            System.out.println("You did not enter an integer"); // message to user
        }
        int height1 = myScanner.nextInt(); // stores the integer the user enters into height1
        while (height1 < 0) { // while height1 is negative this loop will run
            System.out.println("You did not enter a positive integer"); // prints to user
            height1 = myScanner.nextInt(); // stores the user's integer into height1
        }
        System.out.println("Array 2"); // message to user
        System.out.print("Width: ");
        while ( !myScanner.hasNextInt() ) {
            myScanner.hasNext(); // clears out what the user enters
            System.out.println("You did not enter an integer"); // prints to user
        }
        int width2 = myScanner.nextInt(); // stores the user input integer into width2
        while ( width2 < 0 ) {
            System.out.println("You did not enter a positive integer"); // prints to user
            width2 = myScanner.nextInt(); // stores the user input integer into width2
        }
        System.out.print("Height: ");
        while ( !myScanner.hasNextInt() ) {
            myScanner.hasNext(); // clears what the user entered
            System.out.println("You did not enter an integer"); // prints to user
        }
        int height2 = myScanner.nextInt();
        while ( height2 != width1 ) {
            System.out.println("You did not enter a valid height for multiplication"); // prints to user
            height2 = myScanner.nextInt(); // stores the user input integer into height2
        }
        
        int [][] matrix1 = randomMatrix(width1,height1); // creates matrix1
        int [][] matrix2 = randomMatrix(width2,height2); // creates matrix2
        
        System.out.println("MATRIX 1"); // message to user
        printMatrix(matrix1); // prints matrix 1
        System.out.println("MATRIX 2"); //message to user
        printMatrix(matrix2); // prints matrix 2
        int [][] product = multiply(matrix1, matrix2); // creates product matrix 
        
        System.out.println("PRDOUCT"); // message to user
        printMatrix(product); // calls print method on product matrix
        
    }
    // RANDOM MATRIX METHOD
    public static int [][] randomMatrix(int width, int height) {
        int [][] array = new int [height][width]; // creating an array with the user input height and width in row major
        for (int i = 0; i < height; i++) { // declaring and assigning 0 to i; while i is less than height this loop will run
            for (int x = 0; x < width; x++) { // delcaring and assigning 0 to x; while x is less than width this loop will run
                array[i][x] = -10 + (int)(Math.random() * ((10 - (-10) + 1))); // generates random number and stores it into array
            }
        }
        return array; // returns array
        
    }
    // PRINT MATRIX METHOD
    public static void printMatrix(int [][] input) {
        for (int i = 0; i < input.length; i++) { // delcares and assigns 0 to i; while i is less than the length of input this loop will run
            for (int x = 0; x < input[0].length; x++) { // declares and assigns 0 to x; while x is less than the length of input sub 0 this loop will run
                System.out.print(input[i][x]); // prints to user
            }
        System.out.println(); // prints a new line
        }
    }
    // MULTIPLY METHOD
    public static int[][] multiply(int [][] A, int [][] B) {
        if (A[0].length != B.length) { //if the length of A sub 0 does not equal the length of B this code will run
            System.out.println("These arrays cannot be multiplied"); // prints to user
            return null; // returns null
        }
        int [][] newArray = new int [A.length][A[0].length]; 
        int height = A.length; // declaring and assigning the length of A to width
        int width = B[0].length; // delcaring and assigning the length of B sub 0 to height
        int sum = 0; // delcaring and assigning 0 to sum
        int z; // declaring int z
        for (int i = 0; i < height; i++) { // declaring and assigning 0 to i; while i is less than height
            for (z = 0; z < width; z++) { // declaring and assigning 0 to z; while z is less than width
                for (int r = 0; r < width; r++) { // declaring and assigning 0 to r; while r is less than width
                    sum += A[i][r] * B[r][z]; // multiplies A sub i sub r and B sub r sub z and adds the product to result
                }
            newArray[i][z] = sum; // storing the value of sum into newARray sub i sub z
            sum = 0; // assigning 0 to sum
            }
        }
        return newArray; // returns newArray
    }
}
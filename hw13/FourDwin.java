// Connor Deppert
// CSE02-112
// April 26, 2015
// This loop takes a 4D array and manipulates it for the user 
import java.util.Scanner; // imports Scanner class
import java.util.Random; // imports Random class

public class FourDwin {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner (System.in); // constructing an instance of the Scanner class
        Random randomGenerator = new Random(); // constructing an instance of the Random class
        System.out.println("Enter an integer X: "); // prints to the user
        while ( !myScanner.hasNextInt() ) { // while the user does not enter an integer this code will run
            myScanner.next(); // clears out what the user entered
            System.out.println("You did not enter an integer"); // prints to the user
        }
        int X = myScanner.nextInt(); // the user input integer is stored into X
        while (X < 1) { // while X is less than 1 this loop will run
            System.out.println("You did not enter an integer > 0"); // prints to the user
            X = myScanner.nextInt(); // stores the user input integer into X
        }
        System.out.println("Enter an integer Y where Y > X: "); // prints to the user
        while ( !myScanner.hasNextInt() ) { // while the user does not enter an integer this loop will run
            myScanner.next(); // clears out what the user entered
            System.out.println("You did not enter an integer"); // prints to the user
        }
        int Y = myScanner.nextInt(); // stores the user input integer into Y
        while ( Y < 1) { // while Y is less than 1 this loop will run
            System.out.println("You did not enter an integer > 0"); // prints to the user
            Y = myScanner.nextInt(); // stores the user input integer into Y
        }
        while (Y <= X) { // while Y is less than or equal to X this loop will run
            System.out.println("You did not enter a Y > X"); // prints to the user
        }
       
        double [][][][] array = new double [3][randomGenerator.nextInt((Y - X) + 1) + X][randomGenerator.nextInt((Y - X) + 1) + X][randomGenerator.nextInt((Y - X) + 1) + X]; 
            // the line above creates a 4D array with an outer size of 3 and then randomly generated numbers for the rest of the dimensions
        // FILLS ARRAY WITH DOUBLES BETWEEN 0 AND 30
        for (int i = 0; i < array.length; i++) { // while i is less than the length of the array this loop will run
              
            for (int z = 0; z < array[i].length; z++) { // while z is less than the length of array sub i this loop will run
                
                for (int u = 0; u < array[i][z].length; u++) { // while u is less than the length of array sub i sub z this loop will run
                     
                    for (int v = 0; v < array[i][z][u].length; v++) { // while v is less than the length of array sub i sub  sub u this loop will run
                        
                        double myNumber = Math.random() * 30; // creates a double between 0 and 30 and stores it into myNumber
                        int integer = (int) (myNumber * 10); // multiplies myNumber by 10 and casts it to an integer
                        double last = integer / 10.0; // divides integer by 10 and stores it into last
                        array[i][z][u][v] = last; // stores last into array
                    }
                }
            }
        }
        System.out.println("Original Array: "); // prints to user
        printArray(array); // calls printArray method
        System.out.println(); // prints a new line
        System.out.println("Sorted Array: "); // prints to user
        double [][][][] MATRIX = sortArray(array); // creates a new array called MATRIX and calls sortArray
        printArray(MATRIX); // calls printArray
        System.out.println(); // prints a new line
        statArray(array); // calls statArray
    }
    // STAT ARRAY METHOD
    public static void statArray (double [][][][] matrix) {
            double sum = 0; // declares and assigns 0 to sum
        // finds sum of elements in matrix
        for (int i = 0; i < matrix.length; i++) { // while i is less than the length of matrix this loop will run
            for (int z = 0; z < matrix[i].length; z++) { // while z is less than the length of matrix sub i this loop will run
                for (int u = 0; u < matrix[i][z].length; u++) { // while u is less than the length of matrix sub i sub z this loop will run
                    for (int v = 0; v < matrix[i][z][u].length; v++) { // while v is less than the length of matrix sub i sub z sub u this loop will run
                        sum += matrix[i][z][u][v]; // adds value at the position to sum
                    }
                }
            }
        }
        // finds number of elements in matrix
        int counter = 0; // declares and assigns 0 to counter
        for (int i = 0; i < matrix.length; i++) { // while i is less than the length of matrix this loop will run
            for (int z = 0; z < matrix[i].length; z++) { // while z is less than the length of matrix sub i this loop will run
                for (int u = 0; u < matrix[i][z].length; u++) { // while u is less than the length of matrix sub i sub z this loop will run
                    for (int v = 0; v < matrix[i][z][u].length; v++) { // while v is less than the length of matrix sub i sub z sub u this loop will run
                        counter++; // increments counter by 1
                    }
                }
            }
        }
        // finds mean of elements in matrix
        double mean = sum / counter; // finds mean of the matrix 
        System.out.println ("Members: "+counter); // prints to user
        System.out.println("Sum: "+sum); // prints to user
        System.out.println("Mean: "+mean); // prints to user
    } // ends STAT array method
    // SORT ARRAY METHOD
    public static double [][][][] sortArray (double [][][][] myArray) {
        for (int i = 0; i < myArray.length; i++) { // while i is less than the length of myArray this loop will run
            for (int z = 0; z < myArray[i].length; z++) { // while z is less than the length of myArray sub i this loop will run
                for (int u = 0; u < myArray[i][z].length; u++) { // while u is less than the length of myArray sub i sub z this loop will run
                    for (int v = 1; v < myArray[i][z][u].length; v++) { // while v is less than the length of myArray sub i sub z sub u this loop will run
                        int index = v; // assigns v to index
                        double value = myArray[i][z][u][v];  // assigns myArray sub i sub z sub u sub v to value
                        while (value < myArray[i][z][u][v - 1]) { // if value is less than myArray sub i sub z sub u sub v-1 this loop will run
                            myArray[i][z][u][v] = myArray[i][z][u][v - 1]; // assigns myArray[i][z][u][v - 1] to myArray[i][z][u][v]
                            myArray[i][z][u][v - 1] = value; // assigns value to myArray[i][z][u][v - 1]
                        }
                    }
                }
            }
        }
    
        return myArray; // returns myArray
    }
    // PRINT ARRAY METHOD
    public static void printArray (double [][][][] matrix) {
        System.out.print("{"); // prints to user
        for (int i = 0; i < matrix.length; i++) { // while i is less than the length of matrix this loop will run
            System.out.print("{"); // prints to user
            for (int z = 0; z < matrix[i].length; z++) { // while z is less than the length of matrix sub i this loop will run
                System.out.print("{"); // prints to user
                for (int u = 0; u < matrix[i][z].length; u++) { // while u is less than matrix sub i sub z this loop will run
                    System.out.print("{"); // prints to user
                    for (int v = 0; v < matrix[i][z][u].length; v++) { // while v is less than the length of matrix sub i sub z sub u this loop will run
                        System.out.print(matrix[i][z][u][v]+", "); // prints to user
                        
                    }
                    System.out.print("}"); // prints to user
                }
                System.out.print("}"); // prints to user
            }
            System.out.print("},"); // prints to user
        }
       
    }
}
// Connor Deppert
// CSE02-112
// April 24, 2015
/* This program takes a randomly generated 2D array, sorts it and also then copies it
and fills the remaining positions with 0's */

import java.util.Random; // imports Scanner class

public class Lab {
    public static void main (String [] args) {
        Random randomGenerator = new Random(); // constructing randomGenerator
        int [][] array = new int [5][]; // creating array with 5 rows
    
        for (int i = 0; i < array.length; i++) { // allocating the correct amount of space for each row of the array
            array[i] = new int [i * 3 + 5];
        }
        for (int i = 0; i < 5; i++) { // fills each position of the first row with a randomly generated number
            array[0][i] = randomGenerator.nextInt(40);
        }
        for (int i = 0; i < 8; i++) { // fills each position of the second row with a randomly generated number
            array[1][i] = randomGenerator.nextInt(40);
        }
        for (int i = 0; i < 11; i++) { // fills each position of the third row with a randomly generated number
            array[2][i] = randomGenerator.nextInt(40);
        }
        for (int i = 0; i < 14; i++) { // fills each position of the fourth row with a randomly generated number
            array[3][i] = randomGenerator.nextInt(40);
        }
        for (int i = 0; i < 17; i++) { // fills each position of the fifth row with a randomly generated number
            array[4][i] = randomGenerator.nextInt(40);
        }
        System.out.println("The array before sorting"); // prints to user
        for (int i = 0; i < array.length; i++) { // this nested loop prints out the 2D array to the user
            for (int x = 0; x < array[i].length; x++) {
                System.out.print(array[i][x]+" ");
            }
            System.out.println();
        }
        // The below code will sort the array
        int x = 0; // declaring x as 0
        while (x < 5) { // while x is less than 5 this loop will run
            for (int i = 0; i < array[x].length; i++) { // while i is less than array sub x length this loop will run
                int minIndex = i; // declaring and assigning minIndex as i 
                int minValue = array[x][i]; // declaring and assigning minValue to array sub x sub i 
                for (int z = i; z < array[x].length; z++) { // while z is less than array sub x length this loop will run
                    if (minValue > array[x][z]) { // if minValue is greater than array sub x sub z the following code will run
                        minValue = array[x][z]; // assigns minValue
                        minIndex = z; // assigns minIndex
                    }
                }
                array[x][minIndex] = array[x][i]; // swaps array sub x to sub i to array sub x sub minIndex
                array[x][i] = minValue; // assigns minValue to array sub x sub i
            }
        
        x++; // increments x by 1
        }
        System.out.println("The array after sorting"); // prints to user
        for (int i = 0; i < array.length; i++) { // while i is less than array length this loop will run
            for (int y = 0; y < array[i].length; y++) { // while y is less than array sub i length this loop will run
                System.out.print(array[i][y]+" "); // prints to user
            }
            System.out.println(); // prints new line
        }
        // Part 5
        int [][] X = new int[5][]; // creating a new array X with five rows
        for (int z = 0; z < X.length; z++) { // while z is less than X length the loop will run
            X[z] = new int [array[4].length]; // allocates array sub 4 length to each row of array X
        }
        // Fills each row of array X
        int y = 0; // declares y as 0
        while (y < 5) { // while y is less than 5 this loop will run
            int i; // declares int i 
            for (i = 0; i < array[y].length; i++) { // while i is less than array sub y length this loop will run
                X[y][i] = array[y][i]; // assigns array sub y sub i to X sub y sub i 
            }
            for (i = i; i < X[y].length; i++) { // while i is less than X sub y length this loop will run
                X[y][i] = 0; // assigns 0 to X sub y sub i 
            }
        y++; // increments y by 1
        }
            
            
        System.out.println("The array after sorting and copying"); // prints to user
        for (int a = 0; a < X.length; a++) { // while a is less than X length this loop will run
            for (int b = 0; b < X[a].length; b++) { // while b is less than X sub a length this loop will run
                System.out.print(X[a][b]+" "); // prints to user 
            }
        System.out.println();  // prints a new line
        }
        
    }
}
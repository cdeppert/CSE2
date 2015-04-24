import java.util.Random;

public class RowAndColumn {
    public static void main (String [] args) {
        Random generator = new Random();
        int h1 = generator.nextInt(5) + 1; // generates a random number between 1 and 5
        int h2 = generator.nextInt(5) + 1; // generates a random number between 1 and 5
        int w1 = generator.nextInt(5) + 1; // generates a random number between 1 and 5
        int w2 = generator.nextInt(5) + 1; // generates a random number between 1 and 5
        int [][] A = increasingMatrix(w1, h1, true); // declares and assigns A
        int [][] B = increasingMatrix(w1, h1, false); // declares and assigns B
        int [][] C = increasingMatrix(w2, h2, true);
        System.out.println("Matrix A"); // prints to user
        printMatrix(A, true); // calls printMatrix
        System.out.println("Matrix b"); // prints a new line
        printMatrix(B, false); // calls printMatrix
        System.out.println(); // prints a new line
        int [][] added = addMatrix(A, true, B, false); // declares and assigns added
        printMatrix(added, true); // calls printMatrix
        int [][] added2 = addMatrix(A, true, C, true); // creates added2 matrix
        printMatrix(added2, true); // calls printMatrix method
    }
    // Increasing matrix method
    public static int[][] increasingMatrix(int width, int height, boolean format) {
        int [][] matrix;  // declaring matrix
        int value = 1; // declaring and assigning 1 to value
        if (format) { // IF FORMAT IS TRUE THEN THE MATRIX SHOULD BE ROW MAJOR
            matrix = new int [height][width]; // first matrix is height
            for (int z = 0; z < height; z++) {  // z keeps track of the row; z starts at 0 
                for (int x = 0; x < width; x++) { // x keeps track of the column; x starts at 0
                    matrix[z][x] = value; // stores value into matrix sub z sub x
                    value++; // increments value by 1
                }
            }
            return matrix; // returns matrix
        }
         // IF FORMAT IS FALSE THEN THE MATRIX SHOULD BE COLUMN MAJOR
            matrix = new int [width][height]; // first matrix is width
            for (int y = 0; y < height; y++) { // y keeps track of height; y starts at 0
                for (int x = 0; x < width; x++) { // x keeps track of width; x starts at 0
                    matrix[x][y] = value;   // stores value into matrix sub x sub y
                    value++; // increments value by 1
                }   
            }
        return matrix; // returns matrix
    }
    // Print matrix method
    public static void printMatrix(int [][] array, boolean format) {
        if (format) { // IF FORMAT IS TRUE ARRAY WILL BE IN ROW MAJOR
            for (int a = 0; a < array.length; a++) { // a keeps track of the row; a starts at 0
                for (int c = 0; c < array[0].length; c++) { // c keeps track of the column; c starts at 0
                    System.out.print(array[a][c]); // prints out to user
                }
                System.out.println(); // prints a new line for the next row of numbers to start on 
            }
        }
        else if (array == null) { // if array is null this code will run
            System.out.println("The array was empty!"); // prints to user
        }
        else { // IF FORMAT IS FALSE ARRAY WILL BE IN COLUMN MAJOR
            for (int j = 0; j < array[0].length; j++) { // j keeps track of height; j starts at 0
                for (int r = 0; r < array.length; r++) { // r keeps track of width; r starts at 0
                    System.out.print(array[r][j]); // prints to user
                }
                System.out.println(); // prints a new line for the next row of number to start on 
            }   
        }
    }
    // Translate method
    public static int[][] translate(int[][] array) {
        int height = array[0].length; // delcaring and assigning height
        int width = array.length; // delcaring and assigning width
        int [][] output = new int [height][width]; // creating output array
        for (int i = 0; i < height; i++ ) { // delcaring and assigning 0 to i; while i is less than height the loop will run
            for (int x = 0; x < width; x++) { // declaring and assigning 0 to x; while x is less than width the loop will run
                output[i][x] = array[x][i]; // the value at array sub x sub i will be stored into output sub i sub x
            }
        }
        return output; // returns output
    }  
    // Add matrix method
    public static int [][] addMatrix (int[][] a, boolean formata, int[][] b, boolean formatb) {
        // FORMAT BEING TRUE MEANS ROW MAJOR 
        int aHeight; // delcaring aHeight
        int aWidth; // declaring aWidth
        if (formata) { // if formata is true this code will run
            aHeight = a.length; // assigning the legnth of a to aheight
            aWidth = a[0].length; // assigning the length of a sub 0 to aWidth
        }
        else { // if formata is false this code will run
            aHeight = a[0].length; // assigning the length of a sub 0 to aHeight
            aWidth = a.length; // assigning the length of a to aWidth
            
        } 
        int bHeight; // declaring bHeight
        int bWidth; // declaring bWidth
        if (formatb) { // if formatb is true this code will run
            bHeight = b.length; // assigning the length of b to bHeight
            bWidth = b[0].length; // assigning the length of b sub 0 to bWidth
        }
        else { // if formatb is false this code will run
            bHeight = b[0].length; // assigning the length of b sub 0 to bHeight
            bWidth = b.length; // assigning the length of b to bWidth
        }
        
        if (bHeight == aHeight && aWidth == bWidth) { // if this is true this code will run
            if (formata == false) { // if formata is false this code will run
                a = translate(a); // calls translate method
            }
            if (formatb == false) { // if formatb is false this code will run
                b = translate(b); // calls translate method
            }
            int [][] output = new int [a.length][a[0].length]; // creating output array
            for (int i = 0; i < output.length; i++) { // delcaring and assigning 0 to i; while i is less than the length of output this code will run
                for (int x = 0; x < output[0].length; x++) { // delcaring and assigning 0 to x; while x is less than the length of output sub 0 this code will run
                    output[i][x] = (a[i][x]) + (b[i][x]); // 
                }
            }
            return output; // returns output
        }
        else { // runs if the condition is false
            System.out.println("These arrays cannot be added!"); // prints to user
            System.exit(0); // terminates program
            return null; // returns null
            
        }
    }
}
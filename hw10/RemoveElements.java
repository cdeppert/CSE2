// Connor Deppert
// CSE02-112
// April 6, 2015
/* This program takes an array filled with 10 integers and allows the user to choose
which numbers to remove */

import java.util.Scanner; // imoprts Scanner class

public class RemoveElements{

  public static void main(String [] arg){

        Scanner scan=new Scanner(System.in); // declaring and constructing an instance of the Scanner class

        int [] num=new int[10]; // creating an int array holding 10 ints
        int newArray1[]; // declaring newArray 
        int newArray2[]; // declaring newArray2
        int index,target; // declaring index and target
        String answer=""; // declaring and assigning "" to asnwer
        do{ // beginning of do-while loop

          System.out.print("Random input 10 ints [0-9]"); // prints out to user

          num = randomInput(num); // calls randomInput for an array

          String out = "The original array is: "; // declaring and assigning out

          out += listArray(num); // calling listArray and adding the returned value to out and storing it into out

          System.out.println(out); // prints out to user

          System.out.print("Enter the index: "); // prints out to user

          index = scan.nextInt(); // the next int the user enters will be stored into index

          delete(num,index); // calls delete method

          System.out.println(); // prints out a new line 
          System.out.print("Enter the target value: "); // prints out to user

          target = scan.nextInt(); // the next integer the user enters will be stored into target

          remove(num,target); // calls remove method
          System.out.println(); // prints out a new line 
          System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-"); // prompts user

          answer=scan.next(); // the next thing the user enters will be stored into answer

        }while(answer.equals("Y") || answer.equals("y")); // checks to see if the user entered Y or y and if so the loop will run again
  } // closes main  method

  public static String listArray(int num[]){ // new mthod listArray

        String out="{"; // declaring and assigning { to out

        for(int j=0;j<num.length;j++){  // creates for loop

          if(j>0){ // if j is greater than 0 this code will run

            out+=", "; // adds a comma to out

          }

          out+=num[j]; // adds num sub j to out

        }

        out+="} "; // adds } to out

        return out; // returns out 

  }
   
    // RANDOM INPUT ARRAY - FILLS 15 NUMBER ARRAY 
    public static int [] randomInput (int [] num) { // randomInput method
        int i = 0; // declaring and assigning 1 to i
        int randomNumber; // declaring randomNumber
        while (i < 10) { // while i is less than or equal to 15 the loop will run
            randomNumber = (int) (Math.random() * 10); // generates a random number between 0 and 9 and stores it into randomNumber
            num[i] = randomNumber; // assigns randomNumber to num sub i 
            i++; // increment i by 1
          }
          return num; // returns the num array
      }
    
    // DELETE METHOD - DELETES THE VALUE AT POS IN THE ARRAY AND PRINTS THE NEW ARRAY
    public static void delete(int [] list, int pos) {
       int i = 0; // declaring and assinging 0 to i
       if (pos < 0 || pos > 9) { // if pos is less than 0 or greater than 9 this code will run
            System.out.println("The index is not valid."); // prints to the user
                System.out.print("The output array is: "); // prints out to the user
                while (i < 10 ) { // if i is less than 10 this code will run
                    System.out.print(list[i]+" "); // prints out list sub i and then a space
                    i++; // increments i by 1
                }
        } 
        else { // this code runs if pos is between 0 and 9
        list[pos] = -1; // assigning list sub pos to -1
            System.out.print("The output array is: "); // prints out to the user
            while (i <= 9) { // while i is less than or equal to 9 this code will run
                if (list[i] == -1) { // if list sub i is equal to -1 nothing will happen
                }
                else { // if list sub i is not equal to -1 than the value of list sub i will be printed followed by a space
                    System.out.print(list[i]+" "); // prints out to user
                }
                i++; // increments i by 1
            } 
        } 
    } 

    // REMOVE METHOD - REMOVES THE TARGET VALUE IN THE ARRAY
    public static void remove(int [] list, int target) {
        int i = 0; // declaring and assigning 0 to i
        while (i < 10) { // while i is less than 10 this loop will run
            if (list[i] == target) { // if list sub i is equal to the target value this code will run
                list[i] = -1; // assigns list sub i to -1
            }
            i++; // increments i by 1
        }
        int size = list.length; // declaring and assigning the length of the array, list, to size
        int x = 0; // declaring and assigning 0 to x 
        System.out.print("The output array is: "); // prints out to the user
        while (x < size) { // while x is less than size this code will run 
            if (list[x] == -1) { // if list sub x is equal to -1 nothing will happen
            }
            else { // this code runs if list sub x doesn't equal -1
            System.out.print(list[x]+" "); // prints out list sub x followed by a space
            }
        x++; // increments x by 1
        } 
    }
}
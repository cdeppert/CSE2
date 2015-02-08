// Connor Deppert
// CSE02-112
// February 9, 2015
/* This program takes the input seconds and counts of a bicycle trip and calculates how long the trip was
in minutes, how far the trip was in miles, and the average mph of the trip */

import java.util. Scanner; // imports the Scanner class into the program

public class Bicycle {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); // declaring the instance and constructing the Scanner class
        System.out.print("Enter the number of seconds of your trip: "); // prompting the user to enter the time of their trip
        double seconds = myScanner.nextDouble(); // the next double the user enters will be stored as the seconds of the trip
        System.out.print("Enter the number of counts on your cyclometer: "); // prompting the user to enter the counts on their cyclometer
        double counts = myScanner.nextDouble(); // the next double the user enters will be stored as the counts of the trip
        
        final int diameter = 27; // diameter of the bicycle wheel in inches
        final double pi = 3.1415926; // the constant pi
        double distance = (counts * diameter * pi); // the distance the bicycle travels in inches after being given the number of counts
        final int inchesInAFoot = 12; // amount of inches in one foot
        final int feetInAMile = 5280; // amount of feet in one mile
        final int secondsPerMinute = 60; // amount of seconds in one minute
        final int minutesPerHour = 60; // amount of minutes in one hour
        
        double timeInMinutes = seconds / secondsPerMinute; // taking the time in seconds that was input and converting it to minutes
        double timeInHours = (seconds / secondsPerMinute / minutesPerHour); // taking the time in seconds that was input and converting it to hours
        
        double distanceInMiles = distance / inchesInAFoot / feetInAMile; // taking distance, in inches, and converting it to miles
        int distanceInMilesInt = (int) (distanceInMiles * 100); // taking the above answer, mulitplying it by 100 and explicitly casting it to an integer
        double finalDistance = distanceInMilesInt/100.00; // taking the above answer and dividing it by 100.00 to get a number with a decimal
        
        double milesPerHour =  (distanceInMiles) / (timeInHours); // the equation to get mph (distance in miles / the amount of time in hours)
        int milesPerHourInt = (int) (milesPerHour*100); // taking the above answer and mulitplying it by 100 and then explicitly casting it to an integer
        double finalMilesPerHour = milesPerHourInt/100.00; // taking the above asnwer and dividing it by 100.00 to get a number with a decimal
        
        System.out.println("The distance was "+finalDistance+" miles"+" and took "+timeInMinutes+" minutes"); // prints out the distance in miles and how many minutes the trip took
        System.out.println("The average mph was "+finalMilesPerHour); // prints out the average mph
    }
}
// Connor Deppert
// CSE02-112
// January 30, 2015
/* This program uses data from a bike cycolmeter such as time and distance
and prints out how long trips took in seconds and how far the trips were in 
miles */

public class Cyclometer {
    public static void main (String [] args) {
        int secsTrip1 = 480; //how long the first trip was in seconds
        int secsTrip2 = 3220; //how long the second trip was in seconds
        int countsTrip1 = 1561; //rotations of front tire during first trip
        int countsTrip2 = 9037; //rotations of front tire during second trip
        double wheelDiameter = 27.0; //diameter of front wheel of bike in inches
        double PI = 3.14159; //the constant pi
        int feetPerMile = 5280; //amount of feet in one mile
        int inchesPerFoot = 12; //amount of inches in one foot
        double secondsPerMinute = 60.00; //amount of seconds in one minute
        double distanceTrip1, distanceTrip2, totalDistance; // declaring variables; will assign later
        
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts.");
       
       // the above print out how long the trips were in minutes and how many counts were in each trip
       
        distanceTrip1 = countsTrip1 * PI * wheelDiameter; // assignment of variable and also gives distance in inches
        distanceTrip1 /= inchesPerFoot * feetPerMile; // converts distance from inches to miles
        distanceTrip2 = countsTrip2 * PI * wheelDiameter /  inchesPerFoot / feetPerMile; // assignment of variable and gives distnace in miles
        totalDistance = distanceTrip1+distanceTrip2; // assignment of variable and gives total distance
        
        System.out.println("Trip 1 was " + distanceTrip1 + " miles");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles");
        System.out.println("The total distance was " + totalDistance + " miles");
        
        // the above print out the distances for each trip
    }
}
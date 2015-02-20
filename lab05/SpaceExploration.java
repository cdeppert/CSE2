// Connor Deppert
// CSE02-112
// February 20, 2015
/* This program takes a randomly generated year betwen 2000-2010
and then prints out a list of space events that happened within that time */

public class SpaceExploration {
    public static void main (String [] args) {
        int myYear = (int)(Math.random()*11) + 2000; // generates a random year between 2000 and 2010
        System.out.println("Here is a timeline of space exploration events from "+myYear+" to "+2000+":"); // prints out what the range of years is
        switch (myYear) {
            case 2010: // if 2010 is the year generated everything below this line will be printed
                System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back");
            case 2009: // if 2009 is the year generated everything below this line will be printed
                System.out.println("2009: N/A");
            case 2008: // if 2008 is the year generated everything below this line will be printed
                System.out.println("2008: Kepler launched to study deep space");
            case 2007: // if 2007 is the year generated everything below this line will be printed
                System.out.println("2007: N/A");
            case 2006: // if 2006 is the year generated everything below this line will be printed
                System.out.println("2006: Spacecraft returns with collections from a comet");
            case 2005: // if 2005 is the year generated everything below this line will be printed
                System.out.println("2005: Spacecraft collides with a comet");
            case 2004: // if 2004 is the year generated everything below this line will be printed
                System.out.println("2004: N/A");
            case 2003: // if 2003 is the year generated everything below this line will be printed
                System.out.println("2003: Largest infared telescope released");
            case 2002: // if 2002 is the year generated everything below this line will be printed
                System.out.println("2002: N/A");
            case 2001: // if 2001 is the year generated everything below this line will be printed
                System.out.println("2001: First spacecraft lands on asteroid");
            case 2000: // if 2000 is the year generated everything below this line will be printed
                System.out.println("2000: First spacecraft orbits an asteroid");
        }
    }
    
}
/*
Sean Nork
CSE02
2/13/16
Homework 3: Convert.java
The purpose of this program is to take a user input in
meters and convert it to inches

*/


import java.util.Scanner; //allows for user input

public class Convert {
    
    public static void main (String [] args) {
        
        Scanner myScanner = new Scanner( System.in ); //initialize scanner
        
        System.out.println("Enter the distance in meters: "); //ask for distance (m)
        
        double totalMeters = myScanner.nextDouble(); //takes user input
        
        double totalInches = (totalMeters*100/2.54); //converting meters to inches
        
        totalInches *=1000; //eliminate a few decimal points (rounds answer)
        totalInches = (int)totalInches;
        totalInches /=1000;
        
        System.out.println("The distance in inches is: " + totalInches);
        
        
    }
}
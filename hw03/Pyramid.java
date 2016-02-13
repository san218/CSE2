/*Write a program that prompts the user for the dimensions of a pyramid and returns the volume inside the pyramid. Save the program in the file Pyramid.java. The measurements should be of type double.

Here are some sample runs:
The square side of the pyramid is (input length): 25
The height of the pyramid is (input height): 15

The volume inside the pyramid is: 3125.*/

/*Sean Nork
CSE02
2/13/16
Homework 3: Pyramid.java
The purpose of this program is to take a user input for the
dimenstions of a pyramid and calculate the volume

*/

import java.util.Scanner; //allows for user input

public class Pyramid {
    
    public static void main (String [] args) {
        
        Scanner myScanner = new Scanner( System.in ); //initialize scanner
        
        System.out.println("Enter the length of the base of the square pyramid (meters): ");
        double pyramidLength = myScanner.nextDouble();
        System.out.println("Enter the height of the pyramid (meters): ");
        double pyramidHeight = myScanner.nextDouble();
        
        double pyramidVolume = (pyramidLength*pyramidLength*pyramidHeight/3);
        System.out.println("The total Volume of the pyramid is: "+ pyramidVolume + " meters cubed");
        
        
        
        
    }
    
}
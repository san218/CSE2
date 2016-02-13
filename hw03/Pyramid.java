

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
        double pyramidLength = myScanner.nextDouble();//takes value for length of base
        System.out.println("Enter the height of the pyramid (meters): ");
        double pyramidHeight = myScanner.nextDouble();//takes value for height
        
        double pyramidVolume = (pyramidLength*pyramidLength*pyramidHeight/3);//calculates volume (1/3*l*w*h)
        System.out.println("The total Volume of the pyramid is: "+ pyramidVolume + " meters cubed");
        //prints out solution
        
    }
    
}
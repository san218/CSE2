/*
Sean Nork
CSE2
Homework 6, part 2
3/6
The purpose of this program is to calculate the factorial
of a user entered number ranging from 9 to 16.
*/

import java.util.Scanner; //scanner import
public class RunFactorial {
    
    public static void main (String [] args) {
        
        System.out.println("Please enter an integer between 9 and 16");
        Scanner myScanner = new Scanner(System.in); //initialize scanner
        long a = myScanner.nextInt(); //user input 
        long factor = 1; //factorial multiplier
        long d=1; //use long to get enough integer places (int is too short)
        
        if(a==(long)a) { //if statement to calculate factorial
            
           while(d<=a)
            {
                factor=factor*d; //calculates the factorial
                d++;
            }
           
                System.out.println(factor); //answer
            }
        }
    }
    
    

/*
Sean Nork, Homework 06
Part 1
The purpose of this code is to take a user input of two
integers and a length as an integer, and compute a fibonacci 
sequence

*/
import java.util.Scanner; //import scanner
public class Fibonacci{
    
    public static void main (String[] args){
    
    Scanner myScanner = new Scanner(System.in); //initialize scanner
    
    System.out.println("Enter the first two nums of your Fibonacci sequence"); 
    System.out.println(" then enter the number of places it goes out to ");
    System.out.println("Make sure to enter an integer!");
    
    int a = myScanner.nextInt(); //user input 1st #
    int b = myScanner.nextInt(); // user input 2nd #
    int c = myScanner.nextInt(); //user input for counter (length)
    int i=0;
    
    if (a==(int)a && b==(int)b) {
        int d = a+b;
        System.out.print("" + a +"," + b+",");
        
        while(i+2<c)  //i+2, because you want to include your two inputs as the first 2 #s
        {
            
            int inx=a+b; //new number is sum of origional two
            a=b;
            b=inx;
            
            System.out.print( inx + ","); //answer printed out
            c--;
            
        }
    }
    }
    
}
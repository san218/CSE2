/*
Sean Nork
Homework 6, Part 3
Text Spinner
The purpose of this program is to print these 4 symbols in an
infinite loop, while using the back space, to give the 
effect of a spinning line. 
*/
public class TextSpinner {
    
    public static void main (String[] args){
        
        while(true){ //infinite loop, always true
            
            System.out.print("/"); //1st 
            System.out.print("\b");
            System.out.print("-"); //2nd 
            System.out.print("\b");
            System.out.print("\\"); //3rd 
            System.out.print("\b");
            System.out.print("|");
            System.out.print("\b"); //4th 
            
        }
        
    }
    
    
}
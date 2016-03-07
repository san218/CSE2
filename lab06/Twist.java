import java.util.Scanner;
public class Twist{
    
    public static void main (String[] args){
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Please enter an integer unmber for the length");
    int x = myScanner.nextInt();
    
    
    if(x>0){
        int group = x/3;
        while(group>0){
            System.out.print("\\" + " "+"/");
            group--;
            }
        
    
    int y = group%3;
    switch(y){
        case 1: System.out.print("\\");
        
        case 2: System.out.print("\\"+ "");
            break;
        
    }
            
    }
        System.out.println();
    if(x>0){
        int group = x/3;
        while(group>0){
            System.out.print(" " + "X"+ " ");
            group--;
            }
        
    
    int y = group%3;
    switch(y){
        case 1: System.out.print(" ");
        
        case 2: System.out.print(" "+ "X");
            break; }    
       
        }
        System.out.println();
    if(x>0){
       int group = x/3;
        while(group>0){
            System.out.print("/" + " "+"\\");
            group--;
            }
        
    
    int y = group%3;
    switch(y){
        case 1: System.out.print("/");
        
            case 2: System.out.print("/"+ " ");
            break;
        }
    
    }
 
}
}
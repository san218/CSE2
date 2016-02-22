

import java.util.*;
public class CardGenerator {
    
    public static void main (String [] args) {
        
        int suit = (int)(Math.random()*4)+1;
        int card = (int)(Math.random()*13)+2;
        String mySuit= "";
        String myCard= "";
        
        
        
        if(suit==4){
            
            mySuit= "Spades";
        }
        if(suit==3){
            
            mySuit= "Hearts";
        }
         if(suit==2){
            
            mySuit= "Clubs";
        }
         if(suit==1){
            
            mySuit= "Diamonds";
        }
        
       switch (card){
           
           case 11:
               myCard= "Jack";
               break;
            case 12:
                myCard = "Queen";
                break;
            case 13:
                myCard = "King";
                break;
            case 14:
                myCard = "Ace";
                break;
            default:
                myCard=Integer.toString(card);
                break;
       }          
        System.out.println("You picked the " + myCard + " of " + mySuit + "");
                
       
       
    
    
    }
}

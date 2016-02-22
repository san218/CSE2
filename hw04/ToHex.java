/*
hw04
works, just need to comment it out.

*/
import java.util.Scanner; //allows for user input
import java.util.*; //import everything

    public class ToHex {
        
        public static void main (String [] args) {
            
            Scanner myScanner = new Scanner( System.in ); //initialize scanner
            
            System.out.println("Welcome to the decimal to Hex converter! Enter the R G B values (0-255) in integer form");
            
            //Ri, Gi and Bi refer to the user input value for RGB
            
            int Ri = myScanner.nextInt();
           
            
            int Gi = myScanner.nextInt();
            

            int Bi = myScanner.nextInt();
            
            //Some conditional statements for exiting the program if the number is not in the range
            if(Gi > 255){
                System.out.println("Please restart the program and enter a number in the range");
                System.exit(0);
            }
            if(Bi > 255){
                System.out.println("Please restart the program and enter a number in the range");
                System.exit(0);
                
            }
                 if(Ri > 255){
                System.out.println("Please restart the program and enter a number in the range");
                System.exit(0);
                
                
            }
            
            //mod the origional input, store the value in Rf, Gf or Bf
            
            int Rf = Ri % 16; 
            int Gf = Gi % 16; 
            int Bf = Bi % 16; 
            
            //divide the origional input by 16, store the value in Rd, Gd or Bd
            
            int Rd = (Ri/16);
            int Gd = (Gi/16);
            int Bd = (Bi/16);
            
            //initialize strings, allows for print statement to take the necessary numbers
            String MyRi="";
            String MyGi="";
            String MyBi="";
            String MyRf="";
            String MyGf="";
            String MyBf="";
        
        //switch statement to determine hex values from 11-16
            switch (Rd) {
                
                case 10:
                    MyRi = "A";
                    break;
                case 11:
                    MyRi = "B";
                    break;
                case 12:
                    MyRi = "C";
                    break;
                case 13:
                    MyRi = "D";
                    break;
                case 14:
                    MyRi = "E";
                    break;
                case 15:
                    MyRi = "F";
                    break;
                default:
                    MyRi = "" + Rd;
                    break;
            }
            //switch statement to determine hex values from 11-16
             switch (Gd) {
                
                case 10:
                    MyGi = "A";
                    break;
                case 11:
                   MyGi = "B";
                    break;
                case 12:
                    MyGi = "C";
                    break;
                case 13:
                    MyGi = "D";
                    break;
                case 14:
                    MyGi = "E";
                    break;
                case 15:
                    MyGi = "F";
                    break;
                default:
                    MyGi = "" + Gd;
                    break;
            }
            //switch statement to determine hex values from 11-16
             switch (Bd) {
                
                case 10:
                    MyBi = "A";
                    break;
                case 11:
                    MyBi = "B";
                    break;
                case 12:
                    MyBi = "C";
                    break;
                case 13:
                    MyBi = "D";
                    break;
                case 14:
                    MyBi = "E";
                    break;
                case 15:
                    MyBi = "F";
                    break;
                default:
                    MyBi = "" + Bd;
                    break;
                    
                 //switch statement to determine hex values from 11-16
            }
            
            switch (Rf) {
                
                case 10:
                    MyRf = "A";
                    break;
                case 11:
                    MyRf = "B";
                    break;
                case 12:
                    MyRf = "C";
                    break;
                case 13:
                    MyRf = "D";
                    break;
                case 14:
                    MyRf = "E";
                    break;
                case 15:
                    MyRf = "F";
                    break;
                default:
                    MyRf = "" + Rf;
                    break;
                    //switch statement to determine hex values from 11-16
            }
             switch (Gf) {
                
                case 10:
                    MyGf = "A";
                    break;
                case 11:
                    MyGf = "B";
                    break;
                case 12:
                    MyGf = "C";
                    break;
                case 13:
                    MyGf = "D";
                    break;
                case 14:
                    MyGf = "E";
                    break;
                case 15:
                    MyGf = "F";
                    break;
                default:
                    MyGf = "" + Gf;
                    break;
                    //switch statement to determine hex values from 11-16
            }
             switch (Bf) {
                
                case 10:
                    MyBf = "A";
                    break;
                case 11:
                    MyBf = "B";
                    break;
                case 12:
                    MyBf = "C";
                    break;
                case 13:
                    MyBf = "D";
                    break;
                case 14:
                    MyBf = "E";
                    break;
                case 15:
                    MyBf = "F";
                    break;
                default:
                    MyBf = "" + Bf;
                    break;
            }
            //print out the correct values in hex. 
            System.out.println("Your Hexadecimal values of RGB are: "+ MyRi+MyRf + MyGi+MyGf + MyBi+MyBf);
            
        }
    }
/*Sean Nork
CSE02
Cyclometer, Lab 02
2/5/16*/

public class Cyclometer {
    
    
    public static void main (String [] args) {
        
        


int secondsTrip1=540;
int secondsTrip2=1080;
int rotationsTrip1=2000;
int rotationsTrip2=4000;

double wheelDiameter=28.0;
double PI=3.14159;
double feetPerMile=5280;
double inchesPerFoot=12;
double secondsPerMinute=60;
double distanceTrip1, distanceTrip2,totalDistance;
System.out.println("Trip 1 took "+
    (secondsTrip1/secondsPerMinute)+" minutes and had "+
    rotationsTrip1+" rotations.");
System.out.println("Trip 2 took "+
    (secondsTrip2/secondsPerMinute)+" minutes and had "+
    rotationsTrip2+" rotations.");
distanceTrip1=rotationsTrip1*wheelDiameter*PI;
distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
distanceTrip2=rotationsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;    

System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");
    }
}
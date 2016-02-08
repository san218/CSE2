/*Sean Nork
Hw2
Arithmetic.java
2/5/16 
*/

public class Arithmetic {
    
    public static void main (String [] args) {
        
        int numPants = 3;
        //Cost per pair of pants
        double pantsPrice = 34.98;
        //Number of sweatshirts
        int numShirts = 2;
        //Cost per shirt
        double shirtPrice = 24.99;
        //Number of belts
        int numBelts = 1;
        //cost per belt
        double beltPrice = 33.99;
        //tax rate
        double paSalesTax = 0.06;

        /*lines 31-42 are used to find my total calculations for
        the prices of pants, belts and shirts, as well as the total tax 
        on all of them, the final price before and after tax, and the total
        amount of tax.
        */

        double totalPants = numPants*pantsPrice;
        double totalShirts = numShirts*shirtPrice;
        double totalBelts = numBelts*beltPrice;

        double salesTaxPants=totalPants*paSalesTax;
        double salesTaxShirts=totalShirts*paSalesTax;
        double salesTaxBelts=totalBelts*paSalesTax;

        double totalCostPurchase=totalPants+totalShirts+totalBelts;
        double totalSalesTax=salesTaxPants+salesTaxShirts+salesTaxBelts;

        double totalActual= totalCostPurchase+totalSalesTax;
        
        /*Lines 48-86 are converting my answers from above (double values)
        into integers by multiplying then dividing by 100 to get my 
        values into two decimal money format */ 
        
        salesTaxBelts *=100; //converting tax on into money format
        salesTaxBelts =(int)salesTaxBelts;
        salesTaxBelts /=100;
        
        salesTaxPants *=100; //converting tax on pants into money format
        salesTaxPants =(int)salesTaxPants;
        salesTaxPants /=100;
        
        salesTaxShirts *=100; //converting tax on shirts into money format
        salesTaxShirts =(int)salesTaxShirts;
        salesTaxShirts /=100;
        
        totalPants *=100; //converting total on pants into money format
        totalPants =(int)totalPants;
        totalPants /=100; //still the total price before tax
      
        totalShirts *=100; //converting total on shirts into money format
        totalShirts =(int)totalShirts;
        totalShirts /=100; //still the total price before tax
        
        totalBelts *=100; //converting total on belts on into money format
        totalBelts =(int)totalBelts; 
        totalBelts /=100; //still the total price before tax
      
        paSalesTax *=100; //converting sales tax into money format
        paSalesTax =(int)paSalesTax;
        paSalesTax /=100;
    
        totalCostPurchase *=100; //converting total cost into money format
        totalCostPurchase =(int)totalCostPurchase;
        totalCostPurchase /=100;
        
        totalActual *=100; //converting total price into money format
        totalActual =(int)totalActual;
        totalActual /=100;
        
        totalSalesTax *=100; //converting total sales tax into money format
        totalSalesTax =(int)totalSalesTax;
        totalSalesTax /=100;
        
       /* The following code prints out all of the results calculated above.
       Some calculations were done inside the print command, however they are
       only simple addition operations of two integers, so the money format
       remains intact.
       */
       
        System.out.println("The following shows the total cost of each type of item (after tax) " +
        "as well as the sales tax on each item. It also shows the total final cost before and "+
        "after sales tax, as well as the " +
        "total amount paid in sales tax.");
        System.out.println("The price of pants after sales tax was "+ "$"+(totalPants+salesTaxPants));
        System.out.println("The tax on pants was " + "$"+salesTaxPants);
        System.out.println("The price of shirts after sales tax was "+ "$"+(totalShirts+salesTaxShirts));
        System.out.println("The tax on shirts was " + "$"+salesTaxShirts);
        System.out.println("The price of belts after sales tax was "+ "$"+(totalBelts+salesTaxBelts));
        System.out.println("The tax on belts was " + "$"+salesTaxBelts);
        System.out.println("The total price of the purchase before sales tax was "+ "$"+
             totalCostPurchase);
        System.out.println("The total price of the purchase after sales tax was "+ "$"+totalActual);
        System.out.println("The total sales tax was "+ "$"+totalSalesTax);
        
    }
    
}
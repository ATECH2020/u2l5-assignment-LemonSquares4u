import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
       
       // Start here!
        Scanner userInput = new Scanner(System.in);

       int numWindows;
       int numBoards;
       double taxRate;
       double total;

        System.out.println("Enter the sales tax rate: ");
        taxRate = userInput.nextDouble();
        System.out.println("How many boards do you need?");
        numBoards = userInput.nextInt();
        System.out.println("How many windows do you need?"); 
        numWindows = userInput.nextInt();

       Construction myConstruction = new Construction(8.0, 11.0, taxRate);
        //myConstruction.lumberCost(numBoards); 
        //myConstruction.windowCost(numWindows);
        total = myConstruction.lumberCost(numBoards) + myConstruction.windowCost(numWindows); 
        //myConstruction.grandTotal(total);
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + myConstruction.grandTotal(total));

    }
    
}

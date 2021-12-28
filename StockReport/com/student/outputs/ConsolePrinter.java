package com.student.outputs;
import com.student.items.*;
import com.student.generators.*;

/**
 * ConsolePrinter:
 * Provides methods to print the report in the console.
 * 
 * @author Student 17035205
 * @version 1.0 (Dec 2019)
 */

public class ConsolePrinter {

    
    /** 
     * printInConsole():
     * Prints the report in the console.
     * 
     * @param arrayOfItems Array of StockItems.
     */
    
    public void printInConsole(StockItems[] arrayOfItems) {

        String divider = "--------------------------------------------------------------------------------------------";

        //Print out the columns
        System.out.println("\n" + divider);
        System.out.printf("%-12s %-20s %13s %10s %15s %17s %n", 
        "Category", "Item", "Ordered", "Sold", "In Stock", "Profit or Loss" );
        System.out.println(divider);

        //Create a total profit calculator, which will keep track of profits.
        TotalProfitCalculator totalProfitCalculator = new TotalProfitCalculator();
        
        //Loop through the array of items given.
        for (int i=0; i<arrayOfItems.length; i++) {

            //Add up the net profit to the totals
            totalProfitCalculator.addUpProfit(arrayOfItems[i]);

            //Create strings for printing
            String ordered = String.valueOf(arrayOfItems[i].getOrdered()) + " ordered";
            String sold = String.valueOf(arrayOfItems[i].getSold()) + " sold";
            String inStock = String.valueOf(arrayOfItems[i].getInStock() + " in stock");
            String profitOrLoss = arrayOfItems[i].getProfitOrLoss();
            String total = "£" + String.format("%.2f", arrayOfItems[i].getTotalUnsigned());

            //Print the strings
            System.out.printf(
                "%-12S %-20s %13s %10s %15s %10s %-10s %n",
                arrayOfItems[i].getKindOfItem(),
                arrayOfItems[i].getNameOfItem(),
                ordered,
                sold,
                inStock,
                total,
                profitOrLoss
            );     
        }

        System.out.println(divider);
        String profitOrLoss = "";

        // Fetch totals from the profit calculator, put them in an array
        double[] totalsFetched = {
            totalProfitCalculator.getTotalFood(),
            totalProfitCalculator.getTotalStationery(),
            totalProfitCalculator.getTotalTools()
        };

        // Create array of strings for printing
        String[] totalString ={"Total Food: ", "Total Stationery: ", "Total Tools: "};

        // Fetch final total from the calculator.
        double finalTotal = totalProfitCalculator.getTotalProfits();

        // Loop through the totals fetched and print.
        for (int i=0; i<totalsFetched.length; i++) {

            if (totalsFetched[i] <0) {
                profitOrLoss = "loss";
                totalsFetched[i] = totalsFetched[i]*(-1);
            } else {
                profitOrLoss = "profit";
            }

            System.out.printf("%-74S %10s %-10s %n",
            totalString[i],
            "£" +String.format("%.2f", totalsFetched[i]),
            profitOrLoss);     
        }


        System.out.println(divider);

        // Print final total - profit or loss.
        if (finalTotal < 0) {
            profitOrLoss = "loss";
            finalTotal = finalTotal * (-1);
        } else {
            profitOrLoss = "profit";
        }
        System.out.printf("%-74S %10s %-10s %n",
        "Total: ",
        "£" +String.format("%.2f", finalTotal),
        profitOrLoss
        );
        System.out.println(divider);

    }

}
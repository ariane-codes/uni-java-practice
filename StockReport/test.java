import java.io.FileNotFoundException;
import java.util.Scanner;

import com.student.generators.*;
import com.student.items.*;
import com.student.outputs.*;

/**
 * Test:
 * Creates objects and calls methods so that reports can be generated.
 * 
 * @author Student 17035205
 * @version 1.0 (Dec 2019)
 * @see ItemGenerator, TotalProfitCalculator, StockItems, FileWriter & ConsolePrinter.
 */

public class test {

    
    /** 
     * main():
     * Objects are created, and then the method generateItems() is called. The array is stocked
     * in the variable items.
     * Simple user interface to request a report in the console, or saved in a .txt.
     * 
     * @param args main method, no args necessary.
     * @throws FileNotFoundException Because {@link FileWriter} needs the exception.
     * 
     */
    public static void main(String[] args) throws FileNotFoundException {

        // Create objects.
        ItemGenerator itemGenerator = new ItemGenerator();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        FileWriter fileWriter = new FileWriter();
        Scanner scanner = new Scanner(System.in);

        // Populate variable items with the data stored in the ItemGenerator.
        StockItems[] items = itemGenerator.generateItems();

        // Interface loop.
        while(true) {

            // Print console message.
            System.out.println("Select desired option:\n"+
            "1. Print report in console. \n"+
            "2. Generate report file (report.txt).\n");
            
            // Accept input.
            int input = scanner.nextInt();

            // Evaluate input and call the methods accordingly. If input is invalid, request
            // input again.
            if (input == 1) {
                consolePrinter.printInConsole(items);
                scanner.close();
                break; //Get out of loop and finalize programme.
            } else if (input == 2) {
                fileWriter.printToFile(items);
                scanner.close();
                break; //Get out of loop and finalize programme.
            } else {
                System.out.println("\nInput is invalid. Please enter a valid number: 1 or 2.\n");
            }
        }
    }
} 
package com.student.items;

/**
 * Subclass of {@link StockItems}.
 * @see StockItems
 * 
 * @author Student 17035205
 * @version 1.0 (Dec 2019)
 */

public class StationeryItems extends StockItems {

    /**
     * Constructor.
     * Calls calculateInStock() and calculateTotal() to populate
     * double total, int inStock and String profitOrLoss fields.
     * @see StockItems
     * 
     * @param name String, name of the item
     * @param o int, amount ordered
     * @param c double, how much each item cost
     * @param p double, price for sale
     * @param s int, amount sold
     */


    public StationeryItems (String name, int o, double c, double p, int s) {
        this.kindOfItem = "stationery:";
        this.nameOfItem = name;
        this.ordered = o;
        this.cost = c;
        this.price = p;
        this.sold = s;
        this.calculateInStock();
        this.calculateTotal();
    }

}
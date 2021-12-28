package com.student.items;

/**
 * Superclass of {@link FoodItems}, {@link ToolItems}, {@link StationeryItems}.
 * @see FoodItems
 * @see ToolItems
 * @see StationeryItems
 * 
 * @author Student 17035205
 * @version 1.0 (Dec 2019)
 */

public class StockItems {

    protected int ordered, inStock, sold;
    protected double cost, price, totalUnsigned, total;
    protected String kindOfItem, nameOfItem, profitOrLoss;

    /**
     * calculateTotal(): Populates the fields double total and String profitOrLoss.
     * It also populates double totalUnsigned, by multiplying the total by -1 if there
     * are losses. This is because no negative numbers should be printed in the report.
     */
    public void calculateTotal() {
        this.total = (this.sold*this.price) - (this.cost*this.ordered);

        if (total<0) {
            this.totalUnsigned = this.total * (-1);
            this.profitOrLoss = "loss";
        } else {
            this.totalUnsigned = this.total;
            this.profitOrLoss = "profit";
        }
    }

    /**
     * calculateInStock(): Populates the field int inStock.
     */

    public void calculateInStock() {
        this.inStock = this.ordered - this.sold;
    }

    
    /** 
     * Getter for profitOrLoss
     * @return String, it'll say either "profit" or "loss".
     */
    public String getProfitOrLoss() {
        return profitOrLoss;
    }

    
    /**
     * Getter for totalUnsigned
     * @return double, it's the total but without the sign.
     * If it was a loss, it's been multiplied by -1.
     */
    public double getTotalUnsigned() {
        return totalUnsigned;
    }

    
    /** 
     * Getter for total
     * @return double, total profit or loss. It'll be negative if
     * it's a loss.
     */
    public double getTotal() {
        return total;
    }

    
    /** 
     * Getter for ordered
     * @return int, amount ordered
     */
    public int getOrdered() {
        return ordered;
    }

    
    /** 
     * Getter for inStock
     * @return int, amount inStock
     */
    public int getInStock() {
        return inStock;
    }

    
    /** 
     * Getter for cost
     * @return double, how much the item cost
     */
    public double getCost() {
        return cost;
    }

    
    /** 
     * Getter for price
     * @return double, price of the item for sale
     */
    public double getPrice() {
        return price;
    }

    
    /** 
     * Getter for sold
     * @return int, amount sold
     */
    public int getSold() {
        return sold;
    }

    
    /** 
     * Getter for kind of item
     * @return String, "food:" or "stationery:" or "tools:", accordingly
     */
    public String getKindOfItem(){
        return kindOfItem;
    }

    
    /** 
     * Getter for name of item
     * @return String, specifies item, e.g. "chocolate"
     */
    public String getNameOfItem(){
        return nameOfItem;
    }

}
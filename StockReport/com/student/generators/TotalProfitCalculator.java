package com.student.generators;
import com.student.items.*;

/**
 * TotalProfitCalculator:
 * Keeps track of total profits as the program loops through each StockItem.
 * 
 * @author Student 17035205
 * @version 1.0 (Dec 2019)
 */

public class TotalProfitCalculator {

    private double totalProfits, totalFood, totalStationery, totalTools;

    
    /** 
     * addUpProfit():
     * Takes a StockItem, identifies if it's a FoodItem,
     * StationeryItem or ToolsItem and adds up its total (profit or loss) to the
     * respective total field in this class.
     * 
     * @param item - a StockItems object.
     */

    public void addUpProfit(StockItems item) {

        if (item.getKindOfItem()=="food:"){
            this.totalFood = this.totalFood + item.getTotal();
        } else if (item.getKindOfItem()=="stationery:") {
            this.totalStationery = this.totalStationery + item.getTotal();
        } else if (item.getKindOfItem()=="tools:") {
            this.totalTools = this.totalTools + item.getTotal();
        }
    }

    
    /** 
     * getTotalProfits() : Gets the total profits (to be used when finished looping
     * through StockItems).
     * @return double, the sum of totalFood + totalStationery + totalTools 
     */
    public double getTotalProfits() {
        this.totalProfits = this.totalFood + this.totalStationery + this.totalTools;
        return totalProfits;
    }

    
    /** 
     * getTotalFood() : Gets the total food profits (to be used when finished 
     * looping through StockItems).
     * @return double, totalFood (the sum of the profits of all FoodItems objects).
     */
    public double getTotalFood() {
        return totalFood;
    }

    
    /** 
     * getTotalTools() : Gets the total tools profits (to be used when finished 
     * looping through StockItems).
     * @return double, totalTools (the sum of the profits of all ToolItems objects).
     */
    public double getTotalTools() {
        return totalTools;
    }

    
    /** 
     * getTotalStationery() : Gets the total stationery profits (to be used when finished 
     * looping through StockItems).
     * @return double, totalStationery (the sum of the profits of all StationeryItems objects).
     */
    public double getTotalStationery() {
        return totalStationery;
    }

}
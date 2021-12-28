package com.student.generators;
import com.student.items.*;

/**
 * ItemGenerator:
 * Creates the StockItems that will be used to produce the report.
 * 
 * @author Student 17035205
 * @version 1.0 (Dec 2019)
 */

public class ItemGenerator {

    /** 
     * generateItems():
     * Has all the data to generate an array of StockItems. Such data
     * is hard-coded due to the characteristics of this assignment.
     * 
     * @return StockItems[] - an array of FoodItems, ToolItems and
     * Stationery Items, each with different data.
     */

    public StockItems[] generateItems() {

        StockItems[] items = new StockItems[] {
            new FoodItems("Chocolate", 30, 1.5, 2.5, 25),
            new ToolItems("Chainsaws", 23, 50, 57, 20),
            new StationeryItems("Pens", 55, 0.3, 0.6, 32),
            new StationeryItems("Rulers", 25, 0.5, 0.75, 4),
            new FoodItems("Carrots (lb)", 22, 0.6, 1.2, 7),
            new ToolItems("Hammers", 10, 2.75, 4.5, 1),
            new StationeryItems("Envelopes", 100, 0.05, 0.1, 37),
            new FoodItems("Jellies", 35, 0.8, 1.3, 8),
            new FoodItems("Potatoes (lb)", 10, 0.9, 1.8, 3),
            new ToolItems("Hammers", 5, 3.5, 5.35, 2),
            new StationeryItems("Paper (200 pack)", 10, 4.55, 6.5, 9),
            new ToolItems("Electrical drill", 2, 65, 78, 1),
            new FoodItems("Milk (2l)", 10, 1, 1.45, 7),
            new FoodItems("Yoghurt (250g)", 15, 0.95, 2.10, 8),
            new ToolItems("Chisels", 4, 11.5, 15, 4),
            new ToolItems("Screwdrivers", 4, 5.5, 8, 2),
            new StationeryItems("Pencils", 50, 0.15, 0.4, 42),
            new StationeryItems("Sticky notes", 10, 2, 3.5, 6),
            new ToolItems("Pliers", 6, 5, 7.5, 0),
            new FoodItems("Butter (16oz)", 15, 2, 2.5, 3),
            new FoodItems("Lollipops", 25, 0.5, 0.8, 19),
            new StationeryItems("Notebooks", 7, 1.5, 2, 7),
            new ToolItems("Sanders", 1, 65, 82, 1),
            new StationeryItems("Highlighters", 22, 1, 1.75, 8),
            new FoodItems("Broccoli (lb)", 7, 0.75, 1.25, 3),
            new FoodItems("Cheddar cheese (lb)", 3, 8.5, 10, 1)
        };

        return items;

    }

    

}
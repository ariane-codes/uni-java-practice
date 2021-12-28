/**
 * Provides the superclass for all items {@link StockItems}, as well as
 * subclasses with specific characteristics. The constructors of the subclasses
 * are called in {@link ItemGenerator} to create the array of objects necessary 
 * to produce the report.
 * <p>
 * {@link StockItems} : Superclass. Has all the fields necessary as well as
 * getters and setters.
 * <p>
 * {@link FoodItems} : Subclass. Has a constructor and the field kindOfItem is
 * populated with "food:".
 * <p>
 * {@link ToolItems} : Subclass. Has a constructor and the field kindOfItem is
 * populated with "tools:".
 * <p>
 * {@link StationeryItems} : Subclass. Has a constructor and the field kindOfItem is
 * populated with "stationery:".
 * 
 * @see ItemGenerator 
 */ 

package com.student.items;
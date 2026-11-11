/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodwastetracker;

/** 
 * inheritance demo. 
 * Author: Ryan Omoikhudu
 */
public abstract class FoodItem {
    private String foodName;
    private int quantity;
    private String expiryDate;

    public FoodItem(String foodName, int quantity, String expiryDate) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }
    public String getFoodName()   { return foodName; }
    public int    getQuantity()   { return quantity; }
    public String getExpiryDate() { return expiryDate; }
    public abstract String getStorageAdvice();   // polymorphism

    @Override public String toString() {
        return foodName + " (Qty:" + quantity + ", Exp:" + expiryDate + ")";
    }
}

//foods that expire quikly subclass
class PerishableFood extends FoodItem {
    public PerishableFood(String n, int q, String e) { super(n, q, e); }
    @Override public String getStorageAdvice() {
        return "Store in fridge (1-5°C) or freeze before expiry.";
    }
}

// Non-perishable subclass 
class NonPerishableFood extends FoodItem {
    public NonPerishableFood(String n, int q, String e) { super(n, q, e); }
    @Override public String getStorageAdvice() {
        return "Store in a cool, dry cupboard away from sunlight.";
    }
}
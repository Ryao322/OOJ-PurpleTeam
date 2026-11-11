/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodwastetracker;

interface Wasteable {
    String getWasteReason();
    String getReductionTip();
}

public class WasteRecord implements Wasteable {
    private static int nextId = 1;

    private int id;
    private FoodItem food;
    private String wasteReason;

    // Used when adding a NEW record
    public WasteRecord(FoodItem food, String wasteReason) {
        this.id = nextId++;
        this.food = food;
        this.wasteReason = wasteReason;
    }

    // Used when LOADING from file — keeps the saved ID
    public WasteRecord(int id, FoodItem food, String wasteReason) {
        this.id = id;
        this.food = food;
        this.wasteReason = wasteReason;
        if (id >= nextId) nextId = id + 1;
    }

    public int getId()        { return id; }
    public FoodItem getFood() { return food; }

    @Override public String getWasteReason() { return wasteReason; }

    @Override public String getReductionTip() {
        String r = wasteReason.toLowerCase();
        if (r.contains("expir")) return "Freeze portions before expiry date.";
        if (r.contains("spoil")) return "Use airtight containers; check fridge temp.";
        return "Buy smaller quantities or share surplus with a food bank.";
    }

    public String toFileLine() {
        return id + "|" + food.getFoodName() + "|" + food.getQuantity() + "|"
             + food.getExpiryDate() + "|" + wasteReason + "|"
             + (food instanceof PerishableFood ? "P" : "N");
    }

    @Override public String toString() {
        return "[" + id + "] " + food + " — " + wasteReason;
    }
}
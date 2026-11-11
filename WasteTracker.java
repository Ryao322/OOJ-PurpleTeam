/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodwastetracker;

import java.io.*;
import java.util.ArrayList;

public class WasteTracker {

    private static final String FILE = "waste_records.txt";
    private ArrayList<WasteRecord> records = new ArrayList<>();
    private ArrayList<Recipe> recipes = new ArrayList<>();

    public WasteTracker() {
        load();
        recipes.add(new Recipe("Banana Bread", "Over-ripe bananas",
                "Mash bananas, mix with flour, sugar, egg, butter. Bake 50 min @ 180°C."));
        recipes.add(new Recipe("Fried Rice", "Leftover rice, veg",
                "Stir-fry rice with veg and soy sauce for 5 min."));
        recipes.add(new Recipe("Bread Pudding", "Stale bread",
                "Soak bread in milk, add sugar and egg. Bake 40 min @ 170°C."));
    }

    public void addRecord(WasteRecord r) { records.add(r); save(); }
    public ArrayList<WasteRecord> getAll() { return records; }

    public ArrayList<WasteRecord> search(String keyword) {
        ArrayList<WasteRecord> out = new ArrayList<>();
        for (WasteRecord r : records)
            if (r.getFood().getFoodName().toLowerCase().contains(keyword.toLowerCase()))
                out.add(r);
        return out;
    }

    public boolean delete(int id) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getId() == id) {
                records.remove(i); save(); return true;
            }
        }
        return false;
    }
    public ArrayList<Recipe> getRecipes() { return recipes; }

    // ---------- FILE I/O ----------
    private void save() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (WasteRecord r : records) pw.println(r.toFileLine());
        } catch (IOException e) { e.printStackTrace(); }
    }

    private void load() {
        File f = new File(FILE);
        if (!f.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|", -1);
                if (p.length != 6) continue;
                try {
                    int id  = Integer.parseInt(p[0]);
                    int qty = Integer.parseInt(p[2]);
                    FoodItem food = p[5].equals("P")
                            ? new PerishableFood(p[1], qty, p[3])
                            : new NonPerishableFood(p[1], qty, p[3]);
                    records.add(new WasteRecord(id, food, p[4]));
                } catch (NumberFormatException ex) {
                    // skip malformed line
                }
            }
        } catch (IOException e) { e.printStackTrace(); }
    }
}
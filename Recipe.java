/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodwastetracker;

/**
 *
 * Author: Ryan Omoikhudu
 */
public class Recipe {
    private String name;
    private String ingredients;
    private String instructions;

    public Recipe(String name, String ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
    public String getName()         { return name; }
    public String getIngredients()  { return ingredients; }
    public String getInstructions() { return instructions; }
}
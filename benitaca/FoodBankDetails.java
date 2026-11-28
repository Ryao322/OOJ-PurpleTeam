/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package benita.oops.benitaca;

/**
 *
 * @author benit
 */

public class FoodBankDetails {

    // Variables
    private String foodBankName;
    private String address;
    private String openingHours;
    private String dietaryOptions;

    // Constructor
    public FoodBankDetails(String name, String location, String hours, String diet) {

        foodBankName = name;
        address = location;
        openingHours = hours;
        dietaryOptions = diet;
    }

    // setters
    public void setFoodBankName(String name) {
        foodBankName = name;
    }

    public void setAddress(String location) {
        address = location;
    }

    public void setOpeningHours(String hours) {
        openingHours = hours;
    }

    public void setDietaryOptions(String diet) {
        dietaryOptions = diet;
    }

    // getters
    public String getFoodBankName() {
        return foodBankName;
    }

    public String getAddress() {
        return address;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public String getDietaryOptions() {
        return dietaryOptions;
    }
    
    // Display food bank information
public String toString() {

    return "Food Bank Name: " + foodBankName + "Address: " + address + "Opening Hours: " + openingHours + "Dietary Options: " + dietaryOptions;
}

}

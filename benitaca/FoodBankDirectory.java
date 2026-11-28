/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package benita.oops.benitaca;

/**
 *
 * @author benit
 */

import java.util.ArrayList;

public class FoodBankDirectory {

    // ArrayList
    private ArrayList<FoodBankDetails> foodBanks;
    public ArrayList<FoodBankDetails> getAllFoodBanks() {
    return new ArrayList<>(foodBanks);
}
    
        
    // Constructor
    public FoodBankDirectory() {
        foodBanks = new ArrayList<FoodBankDetails>();
    }

    // food bank
    public void addFoodBank(FoodBankDetails bank) {
        foodBanks.add(bank);
    }

    // display all food banks
    public void displayFoodBanks() {

        for (int i = 0; i < foodBanks.size(); i++) {

            System.out.println(foodBanks.get(i).getFoodBankName());

            System.out.println(foodBanks.get(i).getAddress());

            System.out.println(foodBanks.get(i).getOpeningHours());

            System.out.println(foodBanks.get(i).getDietaryOptions());

            System.out.println();
        }
    }

    // address
    public void searchByAddress(String location) {

        for (int i = 0; i < foodBanks.size(); i++) {

            if (foodBanks.get(i).getAddress()
                    .toLowerCase().contains(location.toLowerCase())) {

                System.out.println(foodBanks.get(i).getFoodBankName());
                System.out.println(foodBanks.get(i).getAddress());
            }
        }
    }

    // dietary options
    public void searchByDiet(String diet) {

        for (int i = 0; i < foodBanks.size(); i++) {

            if (foodBanks.get(i).getDietaryOptions()
                    .toLowerCase().contains(diet.toLowerCase())) {

                System.out.println(foodBanks.get(i).getFoodBankName());
                System.out.println(foodBanks.get(i).getDietaryOptions());
            }
        }
    }

}

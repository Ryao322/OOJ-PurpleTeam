/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package benita.oops.benitaca;

/**
 *
 * @author benit
 */
//store information about individual food banks
//App class - starting point
public class FoodBankApp {
     public static FoodBankDirectory foodBanks =
        new FoodBankDirectory();
    
   public static void main(String[] args) {
       
    FoodBankHomePageGUI  FoodBankHomePageGUIAppObj = new FoodBankHomePageGUI();
    FoodBankHomePageGUIAppObj.setVisible(true);
    
    
   //Food Banks
   
        foodBanks.addFoodBank(new FoodBankDetails(
                "Food Cloud",
                "Tallaght, Dublin 24",
                "Monday-Thursday 8:30am - 4pm , Friday 8:30am - 3pm",
                "Vegan, Vegetarian and Gluten-Free options available"
        ));
         
       foodBanks.addFoodBank(new FoodBankDetails(
                "Islamic Relief Ireland",
                " Clanbrassil Street Lower, Wood Quey, Dublin",
                "Monday-Friday 10am - 3pm",
                "Halal"
        ));

        foodBanks.addFoodBank(new FoodBankDetails(
                "Focus Ireland Coffee Shop",
                "Dublin 2",
                "Check opening hours",
               "Vegan, Vegetarian and Gluten-Free options available"
        ));

        foodBanks.addFoodBank(new FoodBankDetails(
                "Crosscare Portland Cafe",
                "Dublin 1",
                "Monday-Friday",
                "Vegan, Vegetarian and Gluten-Free options available"
        ));

        foodBanks.addFoodBank(new FoodBankDetails(
                "Mendicity Institution",
                "Dublin 8",
                "Check opening hours",
                "Vegan, Vegetarian and Gluten-Free options available"
        ));
   
   }
}
    


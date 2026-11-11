/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benit
 */

public class FoodBankDetails {
    private String foodBankName;
    private String address;
    private int openingHours;
    private String dietaryOptions;
    
    //Constructor 
    
    public void setFoodBankName(String inName){
        foodBankName = inName;    
    }
   
    public void setAddress(String inLocation){
        address = inLocation;
    }
    
    public void setOpeningHours(int inHours){
        openingHours = inHours;
    }
    
    public void setDietaryOptions(String inDiet){
        dietaryOptions = inDiet;
    }
    
    //Getters
    
    public String getFoodBankName(){
       return foodBankName;
    }
    
    public String getAddress(){
       return address;
    }
   
    public String getDietaryOptions(){
        return dietaryOptions;
    }
    
    public int getOpeningHours(){
       return openingHours;
    }
    
}



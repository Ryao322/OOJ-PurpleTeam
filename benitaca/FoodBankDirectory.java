/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package benita.oops.benitaca;

/**
 *
 * @author benit
 */
public class FoodBankDirectory {
    
    //Variables 
    private String foodBankName;
    private String address;
    private int openingHours;
    private String dietaryOptions;


    //Setters
    public void setFoodBankName(String inName){
        foodBankName = inName;    
    }
   
    public void setOpeningHours(int inHours){
        openingHours = inHours;
    }
    
    //Getters
    public String getAddress(){
       return address;
    }
   
    public String getDietaryOptions(){
        return dietaryOptions;
    }
    
}

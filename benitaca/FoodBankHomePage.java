/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package benita.oops.benitaca;

/**
 *
 * @author benit
 */
import java.awt.Color;
import javax.swing.*;
public class FoodBankHomePage extends JFrame{
    //declare objects
    private JPanel p;
    private JLable foodBankNameLbl;
    private JLable addressLbl;
    private JLable openingHoursLbl;
    private JLable dietaryOptionsLbl;
    
    private JTextField foodBankNameTf;
    private JTextField addressTf;
    private JTextField openingHoursTf;
    private JTextField dietaryOptionsTf;
    
    private JButton addBtn;
    
    //constructor
    
    public FoodBankHomePage(){
        //set size and location
        setSize(500,500);
        setLocation(10,10);
        
        //panel
        
        p = new JPanel();
        
        //set panel layout
        
        p.setLayout(null);
        
        //set background colour
        
        p.setBackground(Color.WHITE);
        //add panel to j frame
        add(p);
    
        //objects
    foodBankNameLbl = new JLable("Food Bank Name");
    addressLbl = new JLable("Foos Bank Address");
    openingHoursLbl = new JLable("Opening Hours");
    dietaryOptionsLbl = new JLable("Dietary Options");
    
    foodBankNameTf = new JTextField();
    addressTf = new JTextField();
    openingHoursTf = new JTextField();
    dietaryOptionsTf = new JTextField();
    
    addBtn = new JButton("Search");
    
    //set objects (x,y,width,height)
    foodBankNameLbl.setBounds(10,10,100,50);
    addressLbl.setBounds(10,50,100,50);
    openingHoursLbl.setBounds(10,100,100,50);
    dietaryOptionsLbl.setBounds(10,150,100,50);
    
    foodBankNameTf.setBounds(230,50,100,50);
    addressTf.setBounds(230,100,100,50);
    openingHoursTf.setBounds(230,150,100,50);
    dietaryOptionsTf.setBounds(230,200,100,50);
    
    addBtn.setBounds(10,200,150,30);
    
    p.add(foodBankNameLbl);
    p.add(addressLbl);
    p.add(openingHoursLbl);
    p.add(dietaryOptionsLbl);
    
    p.add(foodBankNameTf);
    p.add(addressTf);
    p.add(openingHoursTf);
    p.add(dietaryOptionsTf);
    
    p.add(addBtn);
    
    }

    private static class JLable {

        public JLable() {
        }
    }
}

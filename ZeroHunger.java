package com.mycompany.zerohunger;

import javax.swing.*;
import java.awt.*;
import foodwastetracker.FoodWasteGUI;
import foodallergies.AllergyDashboard;
import benita.oops.benitaca.FoodBankHomePageGUI;


/**
 * @author Group (Benita, Ryan, Marie Noela)
 * This is the main page for our application. It should help user to navigate where they are going
 */
public class ZeroHunger extends JFrame {

    private JLabel titleLabel;
    private JLabel statusLabel;
    private JButton wasteTrackerBtn;
    private JButton foodBankBtn;
    private JButton allergyBtn;
    private JButton exitBtn;

    public ZeroHunger() {
        setTitle("ZeroHunger");
        setSize(900, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        titleLabel = new JLabel("ZeroHunger Main Menu", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
        titleLabel.setBounds(50, 30, 800, 40);
        add(titleLabel);
        
    // 1. FOOD WASTE TRACKER section
        
        wasteTrackerBtn = new JButton("1. Food Waste Tracker");
        wasteTrackerBtn.setBounds(40, 120, 260, 60);
        wasteTrackerBtn.addActionListener(e -> {
            statusLabel.setText("Opening Food Waste Tracker...");
            runFoodWasteGUI().setVisible(true);
        });
        add(wasteTrackerBtn);
        
    // 2. COMMUNITY FOOD BANK DIRECTORY section

        foodBankBtn = new JButton("2. Community Food Bank Directory");
        foodBankBtn.setBounds(320, 120, 260, 60);
        foodBankBtn.addActionListener(e -> {
            statusLabel.setText("Opening Food Bank Directory...");
            runFoodBankHomePageGUI().setVisible(true);
        });
        add(foodBankBtn);
        
   // 3. ALLERGY & DIETARY REQUIREMENTS section
        allergyBtn = new JButton("3. Allergy & Dietary Requirements");
        allergyBtn.setBounds(600, 120, 260, 60);
        allergyBtn.addActionListener(e -> {
            statusLabel.setText("Opening Allergy & Dietary Requirements...");
            runAllergyDashboard().setVisible(true);
        });
        add(allergyBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
        exitBtn.setBounds(40, 220, 820, 60);
        exitBtn.addActionListener(e -> handleExit());
        add(exitBtn);

        statusLabel = new JLabel("Choose an option to get started.", SwingConstants.CENTER);
        statusLabel.setBounds(50, 310, 800, 25);
        add(statusLabel);
    }

    // 1. FOOD WASTE TRACKER

    private void runFoodWasteGUI() {
        new FoodWasteGUI().setVisible(true);
    }

    // 2. COMMUNITY FOOD BANK DIRECTORY

    private void runFoodBankHomePageGUI() {
        new FoodBankHomePageGUI().setVisible(true);
        JOptionPane.showMessageDialog(this,
                "Community Food Bank.");
    }

    // 3. ALLERGY & DIETARY REQUIREMENTS

    private void runAllergyDashboard() {
        new AllergyDashboard().setVisible(true);
        JOptionPane.showMessageDialog(this,
                "Allergy & Dietary Requirements.");
    }

    // EXIT

    private void handleExit() {
        int confirm = JOptionPane.showConfirmDialog(
                this, "Are you sure you want to exit?", "Confirm Exit",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Thank you for using ZeroHunger.");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ZeroHunger window = new ZeroHunger();
            window.setVisible(true);
        });
    }
}

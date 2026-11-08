package com.mycompany.zerohunger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * @author Group (Benita, Ryan, Marie Noela)
 * Entry point for SDG2 Zero Hunger application.
 */
public class ZeroHunger extends JFrame implements ActionListener {

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

        wasteTrackerBtn = new JButton("1. Food Waste Tracker");
        wasteTrackerBtn.setBounds(40, 120, 260, 60);
        wasteTrackerBtn.addActionListener(this);
        add(wasteTrackerBtn);

        foodBankBtn = new JButton("2. Community Food Bank Directory");
        foodBankBtn.setBounds(320, 120, 260, 60);
        foodBankBtn.addActionListener(this);
        add(foodBankBtn);

        allergyBtn = new JButton("3. Allergy & Dietary Requirements");
        allergyBtn.setBounds(600, 120, 260, 60);
        allergyBtn.addActionListener(this);
        add(allergyBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
        exitBtn.setBounds(40, 220, 820, 60);
        exitBtn.addActionListener(this);
        add(exitBtn);

        statusLabel = new JLabel("Choose an option to get started.", SwingConstants.CENTER);
        statusLabel.setBounds(50, 310, 800, 25);
        add(statusLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == wasteTrackerBtn) {
            statusLabel.setText("Opening Food Waste Tracker...");
            runWasteTracker();          // <-- your code goes here
        } else if (source == foodBankBtn) {
            statusLabel.setText("Opening Food Bank Directory...");
            runFoodBankDirectory();     // <-- your code goes here
        } else if (source == allergyBtn) {
            statusLabel.setText("Opening Allergy & Dietary Requirements...");
            runAllergyRequirements();   // <-- your code goes here
        } else if (source == exitBtn) {
            JOptionPane.showMessageDialog(this, "Thank you for using ZeroHunger.");
            System.exit(0);
        }
    }

    //   PASTE YOUR CODE FOR EACH BUTTON INSIDE THESE METHODS

    private void runWasteTracker() {
        // TODO: paste the Food Waste Tracker code here
        // Example: open a new window, show a form, print to console, etc.
        JOptionPane.showMessageDialog(this, "Food Waste Tracker opened .");
    }

    private void runFoodBankDirectory() {
        // TODO: paste the Community Food Bank Directory code here
        JOptionPane.showMessageDialog(this, "Food Bank Directory opened .");
    }

    private void runAllergyRequirements() {
        // TODO: paste the Allergy & Dietary Requirements code here
        JOptionPane.showMessageDialog(this, "Allergy & Dietary Requirements opened .");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ZeroHunger window = new ZeroHunger();
                window.setVisible(true);
            }
        });
    }
}
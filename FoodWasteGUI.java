/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodwastetracker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
/*
 * main menu
 * Author: Ryan Omoikhudu 
 */


public class FoodWasteGUI extends JPanel {

    private CardLayout cards = new CardLayout();
    private JPanel cardPanel = new JPanel(cards);

    // Add-form fields
    private JTextField nameFld = new JTextField();
    private JTextField qtyFld  = new JTextField();
    private JTextField expFld  = new JTextField();
    private JComboBox<String> typeBox   = new JComboBox<>(new String[]{"Perishable", "Non-perishable"});
    private JComboBox<String> reasonBox = new JComboBox<>(new String[]{"Expired", "Spoiled", "Over-bought"});

    // Search-form
    private JTextField searchFld = new JTextField(15);
    private DefaultTableModel tableModel = new DefaultTableModel(
            new String[]{"ID", "Food", "Qty", "Expiry", "Reason"}, 0);
    private JTable table = new JTable(tableModel);

    // Recipe details
    private JTextArea recipeDetails = new JTextArea();

    public FoodWasteGUI() {
        cardPanel.add(buildMenu(), "menu");
        cardPanel.add(buildAddForm(), "add");
        cardPanel.add(buildSearchForm(), "search");
        cardPanel.add(buildRecipeForm(), "recipe");
        setLayout(new BorderLayout());
        add(cardPanel, BorderLayout.CENTER);
    }

    //MENU 
    private JPanel buildMenu() {
        JPanel p = new JPanel(new GridLayout(5, 1, 10, 10));
        p.setBorder(BorderFactory.createEmptyBorder(40, 80, 40, 80));
        JLabel title = new JLabel("Food Waste Tracker", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        p.add(title);
        JButton addBtn = new JButton("Record Wasted Food");
        JButton searchBtn = new JButton("Search / Delete Records");
        JButton recipeBtn = new JButton("Recipes & Storage Tips");
        JButton backBtn = new JButton("Back to Main Menu");
        p.add(addBtn); p.add(searchBtn); p.add(recipeBtn); p.add(backBtn);
        addBtn.addActionListener(e -> cards.show(cardPanel, "add"));
        searchBtn.addActionListener(e -> cards.show(cardPanel, "search"));
        recipeBtn.addActionListener(e -> cards.show(cardPanel, "recipe"));
        backBtn.addActionListener(e -> goToMainMenu());
        return p;
    }

    //ADD FORM 
    private JPanel buildAddForm() {
        JPanel p = new JPanel(new BorderLayout());
        JPanel form = new JPanel(new GridLayout(5, 2, 8, 8));
        form.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        form.add(new JLabel("Food Name:")); form.add(nameFld);
        form.add(new JLabel("Quantity:"));  form.add(qtyFld);
        form.add(new JLabel("Expiry (dd/mm/yyyy):")); form.add(expFld);
        form.add(new JLabel("Food Type:")); form.add(typeBox);
        form.add(new JLabel("Reason:"));    form.add(reasonBox);
        p.add(form, BorderLayout.NORTH);

        JPanel south = new JPanel();
        JButton saveBtn  = new JButton("Save");
        JButton backBtn  = new JButton("Back");
        south.add(saveBtn); south.add(backBtn);
        p.add(south, BorderLayout.SOUTH);

        // saveBtn 
        backBtn.addActionListener(e -> cards.show(cardPanel, "menu"));
        return p;
    }

     //functionality for search, show all, delete and back buttons
    private JPanel buildSearchForm() {
        JPanel p = new JPanel(new BorderLayout(8, 8));
        JPanel top = new JPanel();
        top.add(new JLabel("Search:"));
        top.add(searchFld);
        JButton sBtn = new JButton("Search");
        JButton aBtn = new JButton("Show All");
        top.add(sBtn); top.add(aBtn);
        p.add(top, BorderLayout.NORTH);
        p.add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel south = new JPanel();
        JButton delBtn  = new JButton("Delete Selected");
        JButton backBtn = new JButton("Back");
        south.add(delBtn); south.add(backBtn);
        p.add(south, BorderLayout.SOUTH);

        // sBtn, aBtn, delBtn
        backBtn.addActionListener(e -> cards.show(cardPanel, "menu"));
        return p;
    }

     // Recipe Form layout 
    private JPanel buildRecipeForm() {
        JPanel p = new JPanel(new BorderLayout(8, 8));

        DefaultListModel<String> m = new DefaultListModel<>();
        JList<String> list = new JList<>(m);
        p.add(new JScrollPane(list), BorderLayout.WEST);

        recipeDetails.setEditable(false);
        recipeDetails.setLineWrap(true);
        recipeDetails.setWrapStyleWord(true);
        p.add(new JScrollPane(recipeDetails), BorderLayout.CENTER);

        JButton backBtn = new JButton("Back");
        p.add(backBtn, BorderLayout.SOUTH);

        // list selection listener 
        backBtn.addActionListener(e -> cards.show(cardPanel, "menu"));
        return p;
    }

    // returns to the group's main menu card
    private void goToMainMenu() {
        Container parent = getParent();
        if (parent != null && parent.getLayout() instanceof CardLayout) {
            ((CardLayout) parent.getLayout()).show(parent, "menu");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SearchUI extends JFrame {

    private JTextField itemNameField;
    private JButton searchButton;
    private JTextArea resultsArea;

    public SearchUI() {
        setTitle("Shopping Assistant - Search Item");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Initialize components
        JLabel label = new JLabel("Enter Item Name:");
        itemNameField = new JTextField(20);
        searchButton = new JButton("Search");
        resultsArea = new JTextArea(10, 40);
        resultsArea.setEditable(false);
        resultsArea.setLineWrap(true);
        resultsArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(resultsArea);

        // Panel for input and button
        JPanel inputPanel = new JPanel();
        inputPanel.add(label);
        inputPanel.add(itemNameField);
        inputPanel.add(searchButton);

        // Layout setup
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Button click action
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String itemName = itemNameField.getText().trim();

                if (itemName.isEmpty()) {
                    resultsArea.setText("❗ Please enter an item name.");
                    return;
                }

                // 🔁 Replace this with actual backend call later
                resultsArea.setText("Milk from Store A - Rs 2.50\nMilk from Store B - Rs 2.80\nMilk from Store C - Rs 5.80\nMilk from Store D - Rs 8.80");

               
            }
        });
    }

    public static void main(String[] args) {
        // Run UI in Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SearchUI().setVisible(true);
            }
        });
    }
}


package pappaPizzeriaResto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Palang {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Pizzaria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 330);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(255, 182, 193));
        frame.setVisible(true);

        JPanel loginPanel = new JPanel();
        loginPanel.setBounds(30, 80, 330, 160);
        loginPanel.setBackground(new Color(255, 228, 225));
        loginPanel.setBorder(BorderFactory.createLineBorder(Color.PINK, 5));
        loginPanel.setLayout(null);
        frame.add(loginPanel);
        
        JLabel name = new JLabel("PALANG'S PIZZARIA");
        name.setBounds(15, 10, 250, 50);
        name.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        name.setForeground(new Color(255, 105, 180));
        frame.add(name);

        JLabel userIDLabel = new JLabel("User ID:");
        userIDLabel.setBounds(30, 30, 75, 25);
        userIDLabel.setForeground(new Color(255, 105, 180));
        loginPanel.add(userIDLabel);

        JLabel userPasswordLabel = new JLabel("Password:");
        userPasswordLabel.setBounds(30, 80, 75, 25);
        userPasswordLabel.setForeground(new Color(255, 105, 180));
        loginPanel.add(userPasswordLabel);


        JTextField userIDField = new JTextField();
        userIDField.setBounds(125, 110, 200, 25);
        frame.add(userIDField);

        JPasswordField userPasswordField = new JPasswordField();
        userPasswordField.setBounds(125, 160, 200, 25);
        userPasswordField.setEchoChar('♡');
        frame.add(userPasswordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(50, 200, 100, 25);
        loginButton.setBackground(new Color(255, 182, 193));
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userIDField.getText();
                String password = new String(userPasswordField.getPassword()); 
                System.out.println(user + ", " + password);

                if (user.equals("535351") && password.equals("hazel")) {
                    frame.dispose();
                    showPPR();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect User ID or Password "
                    		+ "\nTry Again!", "Error", 
                    		JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.add(loginButton);

    }

    private static void showPPR() {
    	 JFrame frame = new JFrame("Pizzeria");
         frame.setSize(500, 780);
         frame.setLocationRelativeTo(null);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(null); 
         frame.setVisible(true);

         JPanel panel = new JPanel();
         panel.setLayout(null); 
         panel.setBounds(0, 10, 500, 780);
         panel.setBackground(new Color(255, 239, 239));
         frame.add(panel);

         JLabel name = new JLabel("PALANG'S PIZZARIA", SwingConstants.CENTER);
         name.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
         name.setBounds(10, 10, 445, 50); 
         name.setForeground(new Color(255, 105, 180)); // Hot pink
         panel.add(name);
        
         // Order No
         JLabel orderNoLabel = new JLabel("Order No.");
         orderNoLabel.setBounds(20, 70, 100, 20);
         panel.add(orderNoLabel);
         
         JTextField orderNoField = new JTextField();
         orderNoField.setBounds(100, 70, 80, 20);
         panel.add(orderNoField);

         // Rate
         JLabel rateLabel = new JLabel("Rate");
         rateLabel.setBounds(250, 70, 100, 20);
         panel.add(rateLabel);
         
         JTextField rateField = new JTextField();
         rateField.setBounds(300, 70, 80, 20);
         rateField.setEditable(true);
         panel.add(rateField);

         // Customer Name
         JLabel customerLabel = new JLabel("Customer Name");
         customerLabel.setBounds(20, 100, 100, 20);
         panel.add(customerLabel);
         
         JTextField customerField = new JTextField();
         customerField.setBounds(130, 100, 100, 20);
         panel.add(customerField);

         // Amount
         JLabel amountLabel = new JLabel("Amount");
         amountLabel.setBounds(250, 100, 100, 20);
         panel.add(amountLabel);
         
         JTextField amountField = new JTextField();
         amountField.setBounds(300, 100, 80, 20);
         amountField.setEditable(false);
         panel.add(amountField);

         // Quantity
         JLabel quantityLabel = new JLabel("Quantity");
         quantityLabel.setBounds(20, 130, 100, 20);
         panel.add(quantityLabel);
         
         JTextField quantityField = new JTextField();
         quantityField.setBounds(90, 130, 70, 20);
         panel.add(quantityField);

         // Cost of Toppings
         JLabel toppingsCostLabel = new JLabel("Cost of Toppings");
         toppingsCostLabel.setBounds(250, 130, 120, 20);
         panel.add(toppingsCostLabel);
         
         JTextField toppingsCostField = new JTextField();
         toppingsCostField.setBounds(360, 130, 70, 20);
         toppingsCostField.setEditable(false);
         panel.add(toppingsCostField);

         // Pizza Type (Radio Buttons)
         JLabel pizzaTypeLabel = new JLabel("Pizza Type:");
         pizzaTypeLabel.setLayout(null);
         pizzaTypeLabel.setBounds(20, 180, 100, 20);
         panel.add(pizzaTypeLabel);
         
         JRadioButton panPizza = new JRadioButton("Pan Pizza");
         panPizza.setLayout(null);
         panPizza.setBounds(20, 200, 100, 20);
         panel.add(panPizza);
         
         JRadioButton stuffedCrust = new JRadioButton("Stuffed Crust");
         stuffedCrust.setLayout(null);
         stuffedCrust.setBounds(20, 220, 120, 20);
         panel.add(stuffedCrust);
         
         JRadioButton regularPizza = new JRadioButton("Regular");
         regularPizza.setLayout(null);
         regularPizza.setBounds(20, 240, 100, 20);
         panel.add(regularPizza);
         
         ButtonGroup pizzaGroup = new ButtonGroup();
         pizzaGroup.add(panPizza);
         pizzaGroup.add(stuffedCrust);
         pizzaGroup.add(regularPizza);

         // Toppings (Checkboxes)
         JLabel toppingsLabel = new JLabel("Toppings:");
         toppingsLabel.setBounds(250, 180, 100, 20);
         panel.add(toppingsLabel);
         
         JCheckBox onion = new JCheckBox("Onion $20");
         onion.setBounds(250, 200, 100, 20);
         panel.add(onion);
         
         JCheckBox cheese = new JCheckBox("Cheese $40");
         cheese.setBounds(250, 220, 120, 20);
         panel.add(cheese);
         
         JCheckBox tomato = new JCheckBox("Tomato $30");
         tomato.setBounds(250, 240, 120, 20);
         panel.add(tomato);
         
         JCheckBox babyCorn = new JCheckBox("Baby Corn $40");
         babyCorn.setBounds(250, 260, 140, 20);
         panel.add(babyCorn);
         
         //JTable 
         JButton saveBtn = new JButton("Save");
         saveBtn.setBounds(385, 320, 80, 30);
         saveBtn.setBackground(new Color(255, 182, 193));
         saveBtn.setForeground(Color.WHITE);
         frame.add(saveBtn);
         
         DefaultTableModel tableModel;
         String[] columnNames = {"Order No.", "Customer Name", "Quantity", "Rate", "TotalAmount"};
         tableModel = new DefaultTableModel(columnNames, 0);
         JTable orderTable = new JTable(tableModel);
         JScrollPane scroll = new JScrollPane(orderTable);
         scroll.setBounds(20, 530, 445, 150);
         panel.add(scroll);

         // Generate Bill Button
         JButton generateBillBtn = new JButton("Generate Bill");
         generateBillBtn.setBackground(new Color(255, 182, 193)); 
         generateBillBtn.setForeground(Color.WHITE);
         generateBillBtn.setBounds(20, 310, 120, 30);
         panel.add(generateBillBtn);

         // Clear Button
         JButton clearBtn = new JButton("Clear");
         clearBtn.setBounds(220, 310, 80, 30);
         clearBtn.setBackground(new Color(255, 182, 193)); 
         clearBtn.setForeground(Color.WHITE);
         panel.add(clearBtn);

         // Bill Summary
         JTextArea billArea = new JTextArea();
         billArea.setBounds(20, 350, 445, 150);
         billArea.setEditable(true);
         panel.add(billArea);
         generateBillBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            	 String orderNo = orderNoField.getText();
            	 String customerName = customerField.getText();
            	 orderNoField.setText(String.valueOf(orderNo));
                 String pizza = panPizza.isSelected() ? "Pan Pizza" : stuffedCrust.isSelected() ? "Stuffed Crust" : "Regular";
                 StringBuilder toppings = new StringBuilder();
            	 int quantity = Integer.parseInt(quantityField.getText().isEmpty() ? "0" :
            	quantityField.getText());
            	 double rate = 300.0;
            	 double toppingCost = 0.0;
            	 
            	 if (onion.isSelected()) toppingCost += 20.0;
            	 if (cheese.isSelected()) toppingCost += 40.0;
            	 if (tomato.isSelected()) toppingCost += 30.0;
            	 if (babyCorn.isSelected()) toppingCost += 40.0;
            	 double totalAmount = (quantity * rate) + toppingCost;
            	 amountField.setText(String.valueOf(totalAmount));
            	 
            	 billArea.setText("============== Receipt =============" + "\nOrder No: " + orderNo + "\nCustomer: " 
                         + customerName + "\nPizza Type: " + pizza + "\nToppings: " 
                        		 + toppingCost
                        		 + "\nTotal Amount: $" + totalAmount);
            	 tableModel.addRow(new Object[]{orderNo, customerName, quantity, rate,
                     	totalAmount});
             }
            	 });
         
         saveBtn.addActionListener(e -> {
        	 try (BufferedWriter writer = new BufferedWriter(new FileWriter("orders.txt", true))) {
        	 for (int i = 0; i < tableModel.getRowCount(); i++) {
        	 String orderData = tableModel.getValueAt(i, 0) + ", "
        	 + tableModel.getValueAt(i, 1) + ", "
        	 + tableModel.getValueAt(i, 2) + ", "
        	 + tableModel.getValueAt(i, 3) + ", "
        	 + tableModel.getValueAt(i, 4);
        	 writer.write(orderData);
        	 writer.newLine();
        	 }
        	 JOptionPane.showMessageDialog(frame, "Orders saved to file successfully!");
        	 } catch (IOException ex) {
        	 JOptionPane.showMessageDialog(frame, "Error saving file!", "Error",
        	JOptionPane.ERROR_MESSAGE);
        	 }
        	 });
         
         clearBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 orderNoField.setText("");
                 customerField.setText("");
                 rateField.setText("");
                 amountField.setText("");
                 quantityField.setText("");
                 billArea.setText("");
                 pizzaGroup.clearSelection();
                 onion.setSelected(false);
                 cheese.setSelected(false);
                 tomato.setSelected(false);
             }
         });
         
        
       
    }
}


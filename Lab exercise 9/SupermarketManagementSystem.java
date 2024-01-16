import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SupermarketManagementSystem {

    private JFrame frame;
    private JTextField productNameField;
    private JTextField productPriceField;
    private JTextArea receiptArea;
    private double totalPrice;

    public SupermarketManagementSystem() {
        initialize();
        totalPrice = 0.0; // Initialize total price
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Supermarket Management System");
        frame.setBounds(100, 100, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblProductName = new JLabel("Product Name:");
        lblProductName.setBounds(30, 30, 100, 20);
        frame.getContentPane().add(lblProductName);

        productNameField = new JTextField();
        productNameField.setBounds(140, 30, 150, 20);
        frame.getContentPane().add(productNameField);
        productNameField.setColumns(10);

        JLabel lblProductPrice = new JLabel("Product Price:");
        lblProductPrice.setBounds(30, 60, 100, 20);
        frame.getContentPane().add(lblProductPrice);

        productPriceField = new JTextField();
        productPriceField.setBounds(140, 60, 150, 20);
        frame.getContentPane().add(productPriceField);
        productPriceField.setColumns(10);

        JButton btnAddProduct = new JButton("Add Product");
        btnAddProduct.setBounds(30, 100, 120, 30);
        frame.getContentPane().add(btnAddProduct);

        receiptArea = new JTextArea();
        receiptArea.setEditable(false);
        receiptArea.setBounds(30, 150, 400, 150);
        frame.getContentPane().add(receiptArea);

        btnAddProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });
    }

    private void addProduct() {
        String productName = productNameField.getText();
        String productPriceStr = productPriceField.getText();

        if (!productName.isEmpty() && !productPriceStr.isEmpty()) {
            double productPrice = Double.parseDouble(productPriceStr);

            // Display added product in the receipt area
            String productInfo = "Product: " + productName + "\tPrice: $" + productPrice + "\n";
            receiptArea.append(productInfo);

            // Update total price
            totalPrice += productPrice;

            // Display total price in the receipt area
            receiptArea.append("Total Price: $" + totalPrice + "\n");

            // Clear input fields after adding the product
            productNameField.setText("");
            productPriceField.setText("");
        } else {
            JOptionPane.showMessageDialog(frame, "Please enter product details.");
        }
    }

    public void display() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    SupermarketManagementSystem window = new SupermarketManagementSystem();
                    window.display();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

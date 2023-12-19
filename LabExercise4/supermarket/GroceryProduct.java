// File: GroceryProduct.java
package supermarket;

public class GroceryProduct implements SupermarketManagement {
    @Override
    public void displayInformation() {
        System.out.println("Grocery Product Information");
    }

    @Override
    public double calculatePrice() {
        // Implement price calculation for grocery products
        return 0.0;
    }
}

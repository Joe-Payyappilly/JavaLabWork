// File: ElectronicsProduct.java
package supermarket;

public class ElectronicsProduct implements SupermarketManagement {
    @Override
    public void displayInformation() {
        System.out.println("Electronics Product Information");
    }

    @Override
    public double calculatePrice() {
        // Implement price calculation for electronics products
        return 0.0;
    }
}

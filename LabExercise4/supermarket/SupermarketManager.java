// File: SupermarketManager.java
package supermarket;

public class SupermarketManager {
    public static void main(String[] args) {
        SupermarketManagement groceryProduct = new GroceryProduct();
        groceryProduct.displayInformation();
        double groceryPrice = groceryProduct.calculatePrice();
        System.out.println(groceryPrice);

        SupermarketManagement electronicsProduct = new ElectronicsProduct();
        electronicsProduct.displayInformation();
        double electronicsPrice = electronicsProduct.calculatePrice();
        System.out.println(electronicsPrice);
    }
}

import java.util.ArrayList;
import java.util.List;


class SupermarketInventory<T extends Product> {
    private List<T> availableProducts = new ArrayList<>();

    public void addProduct(T product) {
        availableProducts.add(product);
        System.out.println(product.getName() + " added to the inventory.");
    }

    public void removeProduct(T product) {
        availableProducts.remove(product);
        System.out.println(product.getName() + " removed from the inventory.");
    }

    public void displayAvailableProducts() {
        System.out.println("Available Products:");
        for (T product : availableProducts) {
            System.out.println("- " + product.getName());
        }
    }
}


interface Product {
    String getName();
}


class GroceryItem implements Product {
    private String name;

    public GroceryItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class SupermarketManagement {
    public static void main(String[] args) {
        
        SupermarketInventory<GroceryItem> groceryInventory = new SupermarketInventory<>();

 
        GroceryItem item1 = new GroceryItem("Apples");
        GroceryItem item2 = new GroceryItem("Bananas");

    
        groceryInventory.addProduct(item1);
        groceryInventory.addProduct(item2);
        groceryInventory.displayAvailableProducts();

        groceryInventory.removeProduct(item1);
        groceryInventory.displayAvailableProducts();
    }
}

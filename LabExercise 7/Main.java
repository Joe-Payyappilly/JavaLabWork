import java.util.ArrayList;
import java.util.List;

interface SupermarketTask {
    void performTask(Product item);
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + "\tPrice: $" + price);
    }
}

class SupermarketManager {
    private List<Product> supermarketProducts;

    public SupermarketManager(List<Product> supermarketProducts) {
        this.supermarketProducts = supermarketProducts;
    }

    // Method to perform tasks in the supermarket
    public void performTasks(SupermarketTask task) {
        for (Product item : supermarketProducts) {
            task.performTask(item);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating supermarket products
        Product apple = new Product("Apple", 2.0);
        Product bread = new Product("Bread", 1.5);

        // Creating a list of supermarket products
        List<Product> supermarketProducts = new ArrayList<>();
        supermarketProducts.add(apple);
        supermarketProducts.add(bread);

        // Creating a SupermarketManager
        SupermarketManager supermarketManager = new SupermarketManager(supermarketProducts);

        // Using lambda expression to define a display info task
        SupermarketTask displayInfoTask = item -> item.displayInfo();

        // Performing display info tasks in the supermarket using lambda expression
        supermarketManager.performTasks(displayInfoTask);

        // Using lambda expression to define a discount task
        SupermarketTask applyDiscountTask = item -> {
            double discountedPrice = item.getPrice() * 0.9; // Applying a 10% discount
            System.out.println("Applying a 10% discount to " + item.getName() + ". New price: $" + discountedPrice);
        };

        // Performing discount tasks in the supermarket using lambda expression
        supermarketManager.performTasks(applyDiscountTask);
    }
}

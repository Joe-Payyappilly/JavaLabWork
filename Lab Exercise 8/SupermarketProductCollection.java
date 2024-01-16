import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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

interface SupermarketTask {
    void performTask(Product item);
}

public class SupermarketProductCollection {
    public static void main(String[] args) {
        // Using ArrayList to manage a list of supermarket products
        List<Product> supermarketProducts = new ArrayList<>();
        supermarketProducts.add(new Product("Apple", 2.0));
        supermarketProducts.add(new Product("Bread", 1.5));
        supermarketProducts.add(new Product("Milk", 3.0));

        System.out.println("List of Supermarket Products:");
        for (Product product : supermarketProducts) {
            System.out.println(product.getName());
        }

        // Using HashMap to manage information about supermarket tasks
        Map<String, String> supermarketTasks = new HashMap<>();
        supermarketTasks.put("Discount", "Apply discounts to products");
        supermarketTasks.put("Restocking", "Refill products on shelves");

        System.out.println("\nSupermarket Tasks and Descriptions:");
        for (Map.Entry<String, String> entry : supermarketTasks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using LinkedList to manage the order of supermarket tasks
        LinkedList<String> taskOrder = new LinkedList<>();
        taskOrder.add("Discount");
        taskOrder.add("Restocking");

        System.out.println("\nOrder of Supermarket Tasks:");
        for (String task : taskOrder) {
            System.out.println(task);
        }
    }
}

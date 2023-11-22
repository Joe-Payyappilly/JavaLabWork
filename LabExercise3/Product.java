final class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void displayProductDetails() {
        System.out.println("Product Details:");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}

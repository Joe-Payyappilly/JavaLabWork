public class SupermarketManagement {
    public static void main(String[] args) {
     
        Manager manager = new Manager("John Doe", 101);
        Cashier cashier = new Cashier("Jane Smith", 201);

        
        manager.displayDetails();
        System.out.println();  
        cashier.displayDetails();
        System.out.println();  

        
        Product milk = new Product("Milk", 2.5);
        Product bread = new Product("Bread", 1.0);

        
        milk.displayProductDetails();
        System.out.println();  
        bread.displayProductDetails();
    }
}

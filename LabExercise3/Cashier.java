class Cashier extends Employee {
    Cashier(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    void displayDetails() {
        System.out.println("Cashier Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Role: Cashier");
    }
}

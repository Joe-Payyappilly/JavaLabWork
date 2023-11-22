class Manager extends Employee {
    Manager(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    void displayDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Role: Manager");
    }
}
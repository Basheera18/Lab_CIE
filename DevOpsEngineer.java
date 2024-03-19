class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: $" + bonus);
    }

    public double calculateTotalSalary() {
        return salary + bonus;
    }

    public static void main(String[] args) {
        // Creating a DevOpsEngineer object
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("John Doe", 1001, 60000, 5000);

        // Displaying employee details
        devOpsEngineer.displayEmployeeDetails();

        // Calculating and displaying total salary
        double totalSalary = devOpsEngineer.calculateTotalSalary();
        System.out.println("Total Salary: $" + totalSalary);
    }
}
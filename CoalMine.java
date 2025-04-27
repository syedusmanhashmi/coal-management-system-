public class CoalMine extends Company {
    private Coal coal; // Composition
    private Employee[] employees; // Aggregation

    public CoalMine(String name, String location, Coal coal, Employee[] employees) {
        super(name, location);
        this.coal = coal;
        this.employees = employees;
    }

    public void showMineDetails() {
        displayInfo();
        coal.displayCoalInfo();
        System.out.println("Employees:");
        for (Employee e : employees) {
            System.out.println("- " + e.getName());
        }
    }
}
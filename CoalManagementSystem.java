public class CoalManagementSystem {
    public static void main(String[] args) {
        Coal coal = new Coal("Anthracite", 500);
        Employee[] employees = {
            new Employee("Alice"),
            new Employee("Bob"),
            new Employee("Charlie")
        };

        CoalMine mine = new CoalMine("BlackRock Mines", "Jharkhand", coal, employees);
        mine.showMineDetails();

        // Start transport threads
        CoalTransportThread t1 = new CoalTransportThread("Truck A");
        CoalTransportThread t2 = new CoalTransportThread("Truck B");

        t1.start();
        t2.start();
    }
}
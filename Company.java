public class Company {
    protected String name;
    protected String location;

    public Company(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Company: " + name);
        System.out.println("Location: " + location);
    }
}
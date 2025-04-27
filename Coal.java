public class Coal {
    private String type;
    private double quantity; // in tons

    public Coal(String type, double quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public void displayCoalInfo() {
        System.out.println("Coal Type: " + type);
        System.out.println("Quantity: " + quantity + " tons");
    }
}
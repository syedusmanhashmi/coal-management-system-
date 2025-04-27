public class CoalTransportThread extends Thread {
    private String transportName;

    public CoalTransportThread(String transportName) {
        this.transportName = transportName;
    }

    public void run() {
        System.out.println(transportName + " started transporting coal...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(transportName + " interrupted.");
        }
        System.out.println(transportName + " finished transporting.");
    }
}
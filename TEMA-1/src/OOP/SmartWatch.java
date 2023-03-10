package OOP;

public class SmartWatch extends SmartDevice{
    protected String color;
    protected boolean heartRateMonitor;

    public SmartWatch() {
        // constructor vacío
    }

    public SmartWatch(String brand, String model, double price, String color, boolean heartRateMonitor) {
        super(brand, model, price);
        this.color = color;
        this.heartRateMonitor = heartRateMonitor;
    }
}

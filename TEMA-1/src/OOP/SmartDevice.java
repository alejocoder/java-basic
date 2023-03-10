package OOP;

public class SmartDevice {
    protected String brand;
    protected String model;
    protected double price;

    public SmartDevice() {
        // constructor vacío
    }

    public SmartDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
}

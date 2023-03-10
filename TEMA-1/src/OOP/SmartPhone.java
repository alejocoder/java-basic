package OOP;

public class SmartPhone extends SmartDevice{
    protected int screenSize;
    protected int batteryLife;

    public SmartPhone() {
        // constructor vacío
    }

    public SmartPhone(String brand, String model, double price, int screenSize, int batteryLife) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }
}

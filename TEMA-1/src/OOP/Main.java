package OOP;

public class Main {

    public static void main(String[] args) {

            SmartPhone phone = new SmartPhone("Samsung", "Galaxy S21", 999.99, 6, 24);
            SmartWatch watch = new SmartWatch("Apple", "Watch Series 6", 399.99, "Silver", true);

            System.out.println("Smartphone: " + phone.brand + " " + phone.model + ", screen size: " + phone.screenSize + " inches, battery life: " + phone.batteryLife + " hours, price: " + phone.price + " dollars.");
            System.out.println("Smartwatch: " + watch.brand + " " + watch.model + ", color: " + watch.color + ", heart rate monitor: " + watch.heartRateMonitor + ", price: " + watch.price + " dollars.");

    }
}

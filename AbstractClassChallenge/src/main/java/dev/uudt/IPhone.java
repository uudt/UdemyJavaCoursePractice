package dev.uudt;

public class IPhone extends ProductForSale {

    public IPhone(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type of this device is " + type);
        System.out.println("It has a price: " + price);
        System.out.println("Description: " + description);
    }
}

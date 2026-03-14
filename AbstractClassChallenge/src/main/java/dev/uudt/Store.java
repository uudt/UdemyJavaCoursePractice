package dev.uudt;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {}

public class Store {

    private static ArrayList<ProductForSale> products = new ArrayList<>();

    public static void main(String[] args) {

        products.add(new IPhone("5s", 500, "This is a smartphone!"));
        products.add(new MacBook("M3", 2500, "This is a laptop!"));
        products.add(new IPhone("15", 1000, "This is a new smartphone!"));
        products.add(new MacBook("M4", 3500, "This is a new laptop!"));


        listProducts();

        System.out.println("\nOrder 1");
        ArrayList<OrderItem> order1 = new ArrayList<>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        ArrayList<OrderItem> order2 = new ArrayList<>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);
    }

    public static void listProducts() {

        for (ProductForSale product : products) {
            System.out.println("-".repeat(30));
            product.showDetails();
            if (product instanceof IPhone iphone) {
                iphone.showDetails();
            } else if (product instanceof MacBook mac) {
                mac.showDetails();
            }
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, products.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (OrderItem item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }

}

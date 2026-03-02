package dev.uudt;

import java.util.ArrayList;

record CustomerR(String name, ArrayList<Double> transactions) {

    public CustomerR(String name, double initDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initDeposit);
    }
}


public class Main {

    public static void main(String[] args) {

        CustomerR bob = new CustomerR("Bob", 1000.0);
        System.out.println(bob);

        BankM bank = new BankM("T");
        bank.addNewCustomer("U", 5000.0);
        System.out.println(bank);

        bank.addTransaction("U", -10.1);
        bank.addTransaction("u", 75.5);
        bank.printStatement("U");

        bank.addNewCustomer("Tom", 250);
        bank.addTransaction("Tom", 100);
        bank.printStatement("Tom");
    }
}


class BankM {
    private String name;
    private ArrayList<CustomerR> customers = new ArrayList<>(5000);

    public BankM(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankM{" +
            "name='" + name + '\'' +
            ", customers=" + customers +
            '}';
    }

    private CustomerR getCustomer(String customerName) {

        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }

        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initDeposit) {
        if (getCustomer(customerName) == null) {
            CustomerR cust = new CustomerR(customerName, initDeposit);
            customers.add(cust);
            System.out.println("New customer added: " + cust);
        }
    }

    public void addTransaction(String name, double transactionAmount) {

        CustomerR cust = getCustomer(name);
        if (cust != null) {
            cust.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {

        CustomerR customer = getCustomer(customerName);

        if (customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer name: " + customer.name());
        System.out.println("Transactions: ");
        for (double d : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }

}

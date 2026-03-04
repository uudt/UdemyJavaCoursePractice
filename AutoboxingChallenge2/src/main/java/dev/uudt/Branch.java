package dev.uudt;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.name = branchName;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer currentCustomer = findCustomer(customerName);
        if (currentCustomer != null) {
            currentCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {

        for (var c : customers) {
            if (c.getName().equalsIgnoreCase(customerName)) {
                return c;
            }
        }
        return null;
    }
}

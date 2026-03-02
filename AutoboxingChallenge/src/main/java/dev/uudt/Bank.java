package dev.uudt;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean addCustomer(String customerName) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName));
            System.out.println("A customer" + customerName + " now is a bank's customer!");
            return true;
        }
        System.out.println("This customer" + customerName + " is already a bank's customer");
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer bankCustomer = findCustomer(customerName);

        if (bankCustomer == null) {
            return false;
        }
        bankCustomer.addTransaction(amount);
        return true;
    }

    public void printStatement(String customerName) {
        Customer customer = findCustomer(customerName);

        if (customer == null) {
            System.out.println("Customer not found");
            return;
        }

        System.out.println("Statement for " + customerName);
        ArrayList<Double> thisCustTransactions = customer.getTransactions();
        for (int i = 0; i < thisCustTransactions.size(); i++) {
            System.out.println(i + 1 + ". " + thisCustTransactions.get(i));
        }
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

//    private String getName() {
//        return name;
//    }
//
//    private void setName(String name) {
//        this.name = name;
//    }
//
//    private ArrayList<Customer> getCustomers() {
//        return customers;
//    }
//
//    private void setCustomers(ArrayList<Customer> customers) {
//        this.customers = customers;
//    }
}

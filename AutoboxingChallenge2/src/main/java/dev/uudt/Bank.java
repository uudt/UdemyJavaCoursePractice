package dev.uudt;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initTransaction) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch != null) {
            return currentBranch.newCustomer(customerName, initTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch currentBranch = findBranch(branchName);
        if (findBranch(branchName) != null) {
            return currentBranch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch b : branches) {
            if (b.getName().equalsIgnoreCase(branchName)) {
                return b;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean transactionPrint) {
        Branch currBranch = findBranch(branchName);
        if (currBranch != null) {

            ArrayList<Customer> branchCustomers = currBranch.getCustomers();
            System.out.println("Customer details for branch " + branchName);

            if (transactionPrint == true) {
                for (int i = 0; i < branchCustomers.size(); i++) {
                    System.out.println("Customer: " + branchCustomers.get(i).getName() + "[" + (i + 1) + "]");
                    System.out.println("Transactions");

                    for (int j = 0; j < branchCustomers.get(i).getTransactions().size(); j++) {
                        System.out.println("[" + (j + 1) + "] " + "Amount " + branchCustomers.get(i).getTransactions().get(j));
                    }
                }
            }
            else {
                for (int i = 0; i < branchCustomers.size(); i++) {
                    System.out.println("Customer: " + branchCustomers.get(i).getName() + "[" + (i + 1) + "]");
                }
            }
            return true;
        }
        return false;
    }

}
